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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.Converter;

/**
 * In cases Jackson's handling of @XmlJavaTypeAdapter is not
 * correct, @JsonSerialize can be annotated additionally using this serializer.
 */
public class JaxbBasedSerializer extends JsonSerializer<Object> implements ContextualSerializer {

	@Override
	public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException {

		JavaType originalType = property.getMember().getType().getContentType();
		if (originalType == null) {
			originalType = property.getType();
		}
		SerializationConfig config = prov.getConfig();
		AnnotationIntrospector ai = config.getAnnotationIntrospector();
		Object convDef = null;
		Class<?> mixinClass = config.findMixInClassFor(originalType.getRawClass());
		if (mixinClass != null) {
			convDef = ai.findSerializationConverter(config.introspect(prov.getTypeFactory().constructType(mixinClass)).getClassInfo());
		}
		if (convDef == null) {
			convDef = ai.findSerializationConverter(config.introspect(originalType).getClassInfo());
		}
		Converter<Object, Object> converter = prov.converterInstance(property.getMember(), convDef);

		JavaType outputType = converter.getOutputType(prov.getTypeFactory());
		JavaType inputType = converter.getInputType(prov.getTypeFactory());
		TypeSerializer typeSer = prov.findTypeSerializer(outputType);
		return new StdDelegatingSerializer(converter, inputType, null) {

			@Override
			public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
				value = convertValue(value);
				JsonSerializer<Object> serializer = provider.findValueSerializer(value.getClass());
				serializer.serializeWithType(value, gen, provider, typeSer);
			}

		};
	}

	@Override
	public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		throw new IOException("not implemented");
	}

}
