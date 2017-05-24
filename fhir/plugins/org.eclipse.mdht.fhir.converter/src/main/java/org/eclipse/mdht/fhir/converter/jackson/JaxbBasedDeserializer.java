/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.util.Converter;

/**
 * In cases Jackson's handling of @XmlJavaTypeAdapter is not
 * correct, @JsonDeserialize can be annotated additionally using this
 * deserializer.
 */
public class JaxbBasedDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer {

	@Override
	public JsonDeserializer<?> createContextual(DeserializationContext prov, BeanProperty property) throws JsonMappingException {

		JavaType originalType = property.getMember().getType().getContentType();
		if (originalType == null) {
			originalType = property.getType();
		}
		DeserializationConfig config = prov.getConfig();
		AnnotationIntrospector ai = config.getAnnotationIntrospector();
		Object convDef = null;
		Class<?> mixinClass = config.findMixInClassFor(originalType.getRawClass());
		if (mixinClass != null) {
			convDef = ai.findDeserializationConverter(config.introspect(prov.getTypeFactory().constructType(mixinClass)).getClassInfo());
		}
		if (convDef == null) {
			convDef = ai.findDeserializationConverter(config.introspect(originalType).getClassInfo());
		}
		Converter<Object, Object> converter = prov.converterInstance(property.getMember(), convDef);

		JavaType inputType = converter.getInputType(prov.getTypeFactory());
		JsonDeserializer<Object> non = prov.findRootValueDeserializer(inputType);
		return new StdDelegatingDeserializer<Object>(converter, inputType, non);
	}

	@Override
	public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		throw new IOException("not implemented");
	}

}
