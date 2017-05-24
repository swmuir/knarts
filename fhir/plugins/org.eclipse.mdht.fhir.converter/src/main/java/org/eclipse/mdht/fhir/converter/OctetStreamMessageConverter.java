/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * If files of mime type octet stream are uploaded, convert them correspondingly
 * to their file extension; it turns out to be difficult with javascript to set
 * the right content type for files (in contrast to javascript blobs), therefore
 * this class is useful.
 */
@Component
public class OctetStreamMessageConverter extends AbstractGenericHttpMessageConverter<Object> {

	private static final String CONTENT_DISPOSITION = "content-disposition";

	private static final String FILENAME_KEY = "filename=";

	@Autowired
	BeanFactory beanFactory;

	public OctetStreamMessageConverter() {
		super(MediaType.APPLICATION_OCTET_STREAM);
	}

	@Override
	public Object read(Type targetType, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		String disposition = inputMessage.getHeaders().getFirst(CONTENT_DISPOSITION);
		String filename = extractFilename(disposition, FILENAME_KEY);
		if (filename == null || !filename.contains(".")) {
			throw new HttpMessageNotReadableException("expected a filename in multipart file upload:" + disposition);
		}
		MediaType contentType = MediaType.parseMediaType("application/" + filename.substring(filename.indexOf(".") + 1));
		List<HttpMessageConverter<?>> converters = beanFactory.getBean(RequestMappingHandlerAdapter.class).getMessageConverters();
		for (HttpMessageConverter<?> converter : converters) {
			if (converter instanceof GenericHttpMessageConverter) {
				GenericHttpMessageConverter<?> genericConverter = (GenericHttpMessageConverter<?>) converter;
				if (genericConverter.canRead(targetType, contextClass, contentType)) {
					return genericConverter.read(targetType, contextClass, inputMessage);
				}
			}
		}
		throw new HttpMessageNotReadableException("can't map filename " + filename + " to mime type!");
	}

	@Override
	protected void writeInternal(Object t, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
		throw new IOException("not implemented");
	}

	@Override
	protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		throw new IOException("not implemented");
	}

	private String extractFilename(String contentDisposition, String key) {
		if (contentDisposition == null) {
			return null;
		}
		int startIndex = contentDisposition.indexOf(key);
		if (startIndex == -1) {
			return null;
		}
		String filename = contentDisposition.substring(startIndex + key.length());
		if (filename.startsWith("\"")) {
			int endIndex = filename.indexOf("\"", 1);
			if (endIndex != -1) {
				return filename.substring(1, endIndex);
			}
		} else {
			int endIndex = filename.indexOf(";");
			if (endIndex != -1) {
				return filename.substring(0, endIndex);
			}
		}
		return filename;
	}

}
