/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.ion.IonObjectMapper;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

/**
 * The Spring Boot application adding a bunch of HttpMessageConverter converters
 */
@SpringBootApplication
// @EnableLoadTimeWeaving
public class Application extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public HttpMessageConverter<?> mappingJackson2HttpMessageConverterCBOR() {
		return FhirConverterUtil.build(new CBORFactory(), MediaType.parseMediaType("application/cbor"));
	}

	@Bean
	public HttpMessageConverter<?> mappingJackson2HttpMessageConverterSMILE() {
		return FhirConverterUtil.build(new SmileFactory(), MediaType.parseMediaType("application/smile"), MediaType.parseMediaType("application/sml"));
	}

	@Bean
	public HttpMessageConverter<?> mappingJackson2HttpMessageConverterYALM() {
		return FhirConverterUtil.build(new YAMLFactory(), MediaType.parseMediaType("application/x-yaml"), MediaType.parseMediaType("application/yaml"));
	}

	@Bean
	public HttpMessageConverter<?> mappingJackson2HttpMessageConverterPROPERTIES() {
		return FhirConverterUtil.build(new JavaPropsMapper(), MediaType.parseMediaType("application/properties"));
	}

	@Bean
	public HttpMessageConverter<?> mappingJackson2HttpMessageConverterBSON() {
		return FhirConverterUtil.build(new BsonFactoryFixed(), MediaType.parseMediaType("application/bson"));
	}

	@Bean
	public HttpMessageConverter<?> mappingJackson2HttpMessageConverterION() {
		return FhirConverterUtil.build(new IonObjectMapper(), MediaType.parseMediaType("application/ion"));
	}

	@Bean
	public HttpMessageConverter<?> mappingJackson2HttpMessageConverterXML() {
		return new EMFXMLHttpMessageConverter(MediaType.APPLICATION_XML);
		// don't use Jackson XML serialization
		// XmlMapper objectMapper = new XmlMapper();
		// objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		// return FhirConverterUtil.build(objectMapper,
		// MediaType.APPLICATION_XML);
	}

	@Bean
	public HttpMessageConverter<?> mappingJackson2HttpMessageConverterJSON() {
		ObjectMapper mapper = new ObjectMapper();
		FhirConverterUtil.configureFHIRMapper(mapper);
		mapper.setDefaultPrettyPrinter(new ChromePrettyPrinter());
		return new MappingJackson2HttpMessageConverter(mapper);
	}

}
