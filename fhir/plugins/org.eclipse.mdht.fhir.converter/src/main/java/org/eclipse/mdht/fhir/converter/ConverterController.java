/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter;

import org.hl7.fhir.Resource;
import org.hl7.fhir.impl.ResourceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

/**
 * The REST service offering the {@link #convert(ResourceImpl)} endpoint
 */
@RestController
public class ConverterController {

	@RequestMapping("/fhirversion")
	public String fhirversion() {
		return "3.0.1";
	}

	@RequestMapping(value = "/convert", method = RequestMethod.POST)
	public Resource convert(@RequestPart("content") ResourceImpl resource) {
		return resource;
	}

}
