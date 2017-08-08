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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

/**
 * Serialize/deserialize XML via EMF
 */
public class EMFXMLHttpMessageConverter extends AbstractGenericHttpMessageConverter<Object> {

	public EMFXMLHttpMessageConverter(MediaType... supportedMediaTypes) {
		super(supportedMediaTypes);
	}

	@Override
	public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, true);
		Resource res = resourceSet.createResource(URI.createFileURI("/fakepath/file.xml"));
		try {
			res.load(inputMessage.getBody(), resourceSet.getLoadOptions());
			return getRealContent(res).get(0);

		} catch (IOException e) {
			if (!res.getContents().isEmpty()) {
				return getRealContent(res).get(0);
			}
			throw e;
		}
	}

	@Override
	protected void writeInternal(Object t, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_ROOT_OBJECTS, Arrays.asList(t));
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		resourceSet.getLoadOptions().put(Resource.OPTION_LINE_DELIMITER, "\n");
		resourceSet.getLoadOptions().put(XMLResource.OPTION_DECLARE_XML, false);
		Resource res = resourceSet.createResource(URI.createFileURI("/fakepath/file.xml"));
		res.save(outputMessage.getBody(), resourceSet.getLoadOptions());
	}

	@Override
	protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		return read(clazz, clazz, inputMessage);
	}

	private static List<EObject> getRealContent(Resource res) {
		List<EObject> contentsToAdd = new ArrayList<EObject>();
		for (EObject eObject : res.getContents()) {
			if (eObject.eClass().getName().equals("DocumentRoot")) {
				contentsToAdd.addAll(eObject.eContents());
			} else
				contentsToAdd.add(eObject);
		}
		return contentsToAdd;
	}

}
