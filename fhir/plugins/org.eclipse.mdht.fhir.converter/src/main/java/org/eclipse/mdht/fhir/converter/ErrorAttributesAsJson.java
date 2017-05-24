/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.HandlerMapping;

/**
 * In case of an error response, we want to encode it with Json and not with the
 * requested media type
 */
@Component
public class ErrorAttributesAsJson extends DefaultErrorAttributes {

	@Autowired
	HttpServletRequest request;

	@Override
	public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
		request.setAttribute(HandlerMapping.PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE, new HashSet<MediaType>(Arrays.asList(MediaType.APPLICATION_JSON)));
		return super.getErrorAttributes(requestAttributes, includeStackTrace);
	}
}