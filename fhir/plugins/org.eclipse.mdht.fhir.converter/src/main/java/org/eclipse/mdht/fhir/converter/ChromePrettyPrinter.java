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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/**
 * This pretty printer mimics how Chrome would serialize JSON
 *
 */
public class ChromePrettyPrinter extends DefaultPrettyPrinter {

	public ChromePrettyPrinter() {
		_arrayIndenter = new DefaultIndenter();
	}

	public ChromePrettyPrinter(DefaultPrettyPrinter base) {
		super(base);
	}

	@Override
	public ChromePrettyPrinter createInstance() {
		return new ChromePrettyPrinter(this);
	}

	@Override
	public void writeObjectFieldValueSeparator(JsonGenerator jg) throws IOException {
		// don't include a space in front of the colon!
		jg.writeRaw(": ");
	}

}
