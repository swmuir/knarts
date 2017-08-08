/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir.DateTime;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Id;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Observation;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.impl.ResourceImpl;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import ca.uhn.fhir.context.FhirContext;

/**
 * Some performance tests including HAPI
 */
@RestController
public class PerformanceTestController {

	@Autowired
	BeanFactory beanFactory;

	// should be better configured
	protected String EXAMPLES_JSON = "C:\\Users\\Joe\\Downloads\\examples-json";
	protected String EXAMPLES_XML = "C:\\Users\\Joe\\Downloads\\examples";

	protected FhirContext ctx;

	@RequestMapping(value = "/sample")
	public Resource sample(@RequestParam(defaultValue = "theId") String id) {
		DiagnosticReport res = FhirFactory.eINSTANCE.createDiagnosticReport();
		Meta meta = FhirFactory.eINSTANCE.createMeta();
		res.setMeta(meta);
		meta.setId("metaid");
		ResourceContainer resourceContainer = FhirFactory.eINSTANCE.createResourceContainer();
		res.getContained().add(resourceContainer);
		Observation obs = FhirFactory.eINSTANCE.createObservation();
		Id theId = FhirFactory.eINSTANCE.createId();
		theId.setValue(id);
		obs.setId(theId);
		DateTime dt = FhirFactory.eINSTANCE.createDateTime();
		try {
			XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
			dt.setValue(xmlGregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		res.setEffectiveDateTime(dt);
		resourceContainer.setObservation(obs);
		return res;
	}

	@RequestMapping(value = "/meminfo")
	public Map meminfo() throws IOException {
		Map<String, Object> result = new LinkedHashMap<String, Object>();
		result.put("availableProcessors", Runtime.getRuntime().availableProcessors());
		result.put("freeMemory", Runtime.getRuntime().freeMemory() / 1024 / 1024);
		result.put("maxMemory", Runtime.getRuntime().maxMemory() / 1024 / 1024);
		result.put("totalMemory", Runtime.getRuntime().totalMemory() / 1024 / 1024);
		return result;
	}

	@RequestMapping(value = "/convert_raashapi_json")
	public Map convert_raashapi_json() throws IOException {
		File root = new File(EXAMPLES_JSON);
		File raas = new File(root, "raas");
		File hapi = new File(raas, "hapi");
		Map<String, String> result = convertFolder(root, raas, MediaType.APPLICATION_JSON, true);
		result.putAll(convertFolder(raas, hapi, MediaType.APPLICATION_JSON, false));
		return result;
	}

	@RequestMapping(value = "/convert_raashapi_xml")
	public Map convert_raashapi_xml() throws IOException {
		File root = new File(EXAMPLES_XML);
		File raas = new File(root, "raas");
		File hapi = new File(raas, "hapi");
		Map<String, String> result = convertFolder(root, raas, MediaType.APPLICATION_XML, true);
		result.putAll(convertFolder(raas, hapi, MediaType.APPLICATION_XML, false));
		return result;
	}

	@RequestMapping(value = "/convert_raas_json")
	public Map convert_raas_json() throws IOException {
		File root = new File(EXAMPLES_JSON);
		File raas = new File(root, "raas");
		Map<String, String> result = convertFolder(root, raas, MediaType.APPLICATION_JSON, true);
		return result;
	}

	@RequestMapping(value = "/convert_raas_xml")
	public Map convert_raas_xml() throws IOException {
		File root = new File(EXAMPLES_XML);
		File raas = new File(root, "raas");
		Map<String, String> result = convertFolder(root, raas, MediaType.APPLICATION_XML, true);
		return result;
	}

	@RequestMapping(value = "/convert_hapi_json")
	public Map convert_hapi_json() throws IOException {
		File root = new File(EXAMPLES_JSON);
		File hapi = new File(root, "hapi");
		Map<String, String> result = convertFolder(root, hapi, MediaType.APPLICATION_JSON, false);
		return result;
	}

	@RequestMapping(value = "/convert_hapi_xml")
	public Map convert_hapi_xml() throws IOException {
		File root = new File(EXAMPLES_XML);
		File hapi = new File(root, "hapi");
		Map<String, String> result = convertFolder(root, hapi, MediaType.APPLICATION_XML, false);
		return result;
	}

	protected Map<String, String> convertFolder(File fromFolder, File toFolder, MediaType mediaType, boolean useRaas) {
		toFolder.mkdirs();
		long millis1 = System.currentTimeMillis();
		Map<String, String> result = new LinkedHashMap<String, String>();
		for (String filename : fromFolder.list()) {
			if (filename.endsWith("." + mediaType.getSubtype()) && !filename.endsWith(".diff." + mediaType.getSubtype())) {
				try {
					String original = new String(Files.readAllBytes(Paths.get(fromFolder.toString(), filename)), "UTF8");
					Object resource = read(mediaType, original, useRaas);
					String regenerated = write(mediaType, resource, useRaas);
					Files.write(Paths.get(toFolder.toString(), filename), regenerated.getBytes("UTF8"));
				} catch (Exception e) {
					result.put(filename, e.toString());
				}
			}
		}
		long millis2 = System.currentTimeMillis();
		result.put(toFolder.getName(), "" + (millis2 - millis1));
		return result;
	}

	@RequestMapping(value = "/speedtest")
	public Map speedtest(@RequestParam("filename") String filename) throws IOException {
		Map<String, Map> result = new LinkedHashMap<String, Map>();
		String content = new String(Files.readAllBytes(Paths.get(EXAMPLES_JSON, filename)));
		System.out.println("Profile " + filename);
		result.put(filename, getMap(content));
		return result;
	}

	protected Map getMap(String content) throws IOException {
		Map<String, Long> result = new LinkedHashMap<String, Long>();
		getMap2(content, result, false);
		getMap2(content, result, true);
		return result;
	}

	protected void getMap2(String content, Map<String, Long> result, boolean useRaas) throws HttpMessageNotReadableException, IOException {
		long millis1 = System.currentTimeMillis();
		Object resource = read(MediaType.APPLICATION_JSON, content, useRaas);
		long millis2 = System.currentTimeMillis();
		String xml = write(MediaType.APPLICATION_XML, resource, useRaas);
		long millis3 = System.currentTimeMillis();

		resource = read(MediaType.APPLICATION_XML, xml, useRaas);
		long millis4 = System.currentTimeMillis();
		String json = write(MediaType.APPLICATION_JSON, resource, useRaas);
		long millis5 = System.currentTimeMillis();

		String prefix = useRaas ? "raas_" : "hapi_";
		log(result, prefix + "read_json", millis2 - millis1);
		log(result, prefix + "write_xml", millis3 - millis2);
		log(result, prefix + "read_xml", millis4 - millis3);
		log(result, prefix + "write_json", millis5 - millis4);
	}

	protected void log(Map<String, ?> result, String string, long elapsed) {
		((Map) result).put(string, elapsed);
		System.out.println(string + ": " + elapsed);
	}

	protected String write(MediaType mediaType, Object resource, boolean useRaas) throws HttpMessageNotWritableException, IOException {
		if (useRaas) {
			ByteArrayOutputStream result = new ByteArrayOutputStream();
			HttpOutputMessage outputMessage = new HttpOutputMessage() {

				@Override
				public HttpHeaders getHeaders() {
					return new HttpHeaders();
				}

				@Override
				public OutputStream getBody() throws IOException {
					return result;
				}

			};
			getConverter(mediaType).write((Resource) resource, mediaType, outputMessage);
			return new String(result.toByteArray(), "UTF8");
		}
		if (mediaType.equals(MediaType.APPLICATION_JSON))
			return writeHAPIJSON((IBaseResource) resource);
		return writeHAPIXML((IBaseResource) resource);
	}

	protected Object read(MediaType mediaType, String content, boolean useRaas) throws HttpMessageNotReadableException, IOException {
		if (useRaas) {
			HttpInputMessage inputMessage = new HttpInputMessage() {

				@Override
				public HttpHeaders getHeaders() {
					return new HttpHeaders();
				}

				@Override
				public InputStream getBody() throws IOException {
					return new ByteArrayInputStream(content.getBytes("UTF8"));
				}
			};
			return getConverter(mediaType).read(ResourceImpl.class, inputMessage);
		}
		if (mediaType.equals(MediaType.APPLICATION_JSON))
			return readHAPIJSON(content);
		return readHAPIXML(content);
	}

	public String writeHAPIJSON(IBaseResource object) {
		assureFhirContext();
		String result = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(object);
		return result;
	}

	protected void assureFhirContext() {
		if (ctx == null)
			ctx = FhirContext.forDstu3();
	}

	public String writeHAPIXML(IBaseResource object) {
		assureFhirContext();
		String result = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(object);
		return result;
	}

	public IBaseResource readHAPIXML(String content) {
		assureFhirContext();
		return ctx.newXmlParser().parseResource(content);
	}

	public IBaseResource readHAPIJSON(String content) {
		assureFhirContext();
		return ctx.newJsonParser().parseResource(content);
	}

	public GenericHttpMessageConverter<Resource> getConverter(MediaType mediaType) {
		List<HttpMessageConverter<?>> converters = beanFactory.getBean(RequestMappingHandlerAdapter.class).getMessageConverters();
		for (HttpMessageConverter<?> converter : converters) {
			if (converter instanceof GenericHttpMessageConverter) {
				GenericHttpMessageConverter<?> genericConverter = (GenericHttpMessageConverter<?>) converter;
				if (genericConverter.getSupportedMediaTypes().contains(mediaType)) {
					// if (genericConverter.canRead(contextClass, contextClass,
					// mediaType)) {
					return (GenericHttpMessageConverter<Resource>) genericConverter;
				}
			}
		}
		return null;
	}

}
