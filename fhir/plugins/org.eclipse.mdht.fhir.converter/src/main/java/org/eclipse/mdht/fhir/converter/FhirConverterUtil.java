/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.mdht.fhir.converter.jackson.MixinResourceContainer;
import org.eclipse.mdht.fhir.converter.jackson.MixinResourceImpl;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.impl.ResourceImpl;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.w3._1999.xhtml.XhtmlPackage;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

public class FhirConverterUtil {

	public static HttpMessageConverter<?> build(ObjectMapper objectMapper, MediaType... supportedMediaTypes) {
		AbstractJackson2HttpMessageConverter result = new AbstractJackson2HttpMessageConverter(objectMapper, supportedMediaTypes) {
		};
		configureFHIRMapper(objectMapper);
		return result;
	}

	public static HttpMessageConverter<?> build(JsonFactory jfac, MediaType... supportedMediaTypes) {
		return build(new ObjectMapper(jfac), supportedMediaTypes);
	}

	public static void configureFHIRMapper(ObjectMapper mapper) {

		// register EMF packages
		EPackage.Registry.INSTANCE.putIfAbsent(FhirPackage.eNS_URI, FhirPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.putIfAbsent(XhtmlPackage.eNS_URI, XhtmlPackage.eINSTANCE);

		// enable default namespaces, esp. for nested XHTML elements
		FhirPackage.eINSTANCE.setNsPrefix("");
		XhtmlPackage.eINSTANCE.setNsPrefix("");

		// support for the resourceType property holding the type info
		mapper.addMixIn(ResourceImpl.class, MixinResourceImpl.class);
		// flattening ResourceContainer
		mapper.addMixIn(ResourceContainer.class, MixinResourceContainer.class);

		configureEMFMapper(mapper);
	}

	public static void configureEMFMapper(ObjectMapper mapper) {

		// register custom resource factory capable of default namespaces
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().putIfAbsent("xml", new XMLResourceFactoryImpl() {

			@Override
			public Resource createResource(URI uri) {
				return new DefaultNamespaceCapableResourceImpl(uri);
			}

		});

		JaxbAnnotationIntrospector intro1 = new JaxbAnnotationIntrospector(mapper.getTypeFactory());
		JacksonAnnotationIntrospector intro2 = new JacksonAnnotationIntrospector();
		AnnotationIntrospector intro = AnnotationIntrospector.pair(intro2, intro1);
		mapper.setAnnotationIntrospector(intro);

		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		mapper.setDateFormat(dateFormat);

		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setSerializationInclusion(Include.NON_EMPTY);

		mapper.setVisibility(PropertyAccessor.GETTER, Visibility.PUBLIC_ONLY);
		mapper.setVisibility(PropertyAccessor.SETTER, Visibility.PUBLIC_ONLY);
		mapper.setVisibility(PropertyAccessor.FIELD, Visibility.NONE);

		mapper.disable(MapperFeature.AUTO_DETECT_FIELDS);
		mapper.enable(MapperFeature.AUTO_DETECT_SETTERS);
		mapper.enable(MapperFeature.AUTO_DETECT_GETTERS);
		mapper.enable(MapperFeature.AUTO_DETECT_IS_GETTERS);
		mapper.enable(MapperFeature.USE_GETTERS_AS_SETTERS);
		mapper.enable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);

		mapper.registerModule(new SimpleModule() {

			@Override
			public void setupModule(SetupContext context) {
				super.setupModule(context);

				/**
				 * Don't deal with EList etc, as they never need to be
				 * instantiated (there are no setter methods for multivalued
				 * properties in EMF!)
				 */
				context.addTypeModifier(new TypeModifier() {

					@Override
					public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
						if (type.getContentType() != null && jdkType.getTypeName().startsWith("org.eclipse.emf")) {
							return typeFactory.constructCollectionType(Collection.class, type.getContentType());
						}
						return type;
					}

				});

				/**
				 * forget about fields, only consider getters/setters
				 */
				context.addBeanDeserializerModifier(new BeanDeserializerModifier() {

					@Override
					public List<BeanPropertyDefinition> updateProperties(DeserializationConfig config, BeanDescription beanDesc, List<BeanPropertyDefinition> propDefs) {
						for (BeanPropertyDefinition propDef : propDefs) {
							if (propDef instanceof POJOPropertyBuilder) {
								POJOPropertyBuilder pojoPropertyBuilder = (POJOPropertyBuilder) propDef;
								try {
									Field _fields = pojoPropertyBuilder.getClass().getDeclaredField("_fields");
									_fields.setAccessible(true);
									// so pojoPropertyBuilder.hasField() returns
									// false !
									_fields.set(pojoPropertyBuilder, null);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}
						return super.updateProperties(config, beanDesc, propDefs);
					}

				});
			}

		});

	}

}
