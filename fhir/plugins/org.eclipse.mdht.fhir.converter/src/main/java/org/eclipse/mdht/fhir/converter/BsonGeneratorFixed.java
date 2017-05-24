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
import java.io.OutputStream;

import de.undercouch.bson4jackson.BsonGenerator;

/**
 * Fixes a problem with the BsonGenerator.flush() method
 */
public class BsonGeneratorFixed extends BsonGenerator {

	public BsonGeneratorFixed(int _generatorFeatures, int _bsonGeneratorFeatures, OutputStream out) {
		super(_generatorFeatures, _bsonGeneratorFeatures, out);
	}

	@Override
	public void flush() throws IOException {
		// FIX: write _buffer to _out first!
		_buffer.writeTo(_out);
		super.flush();
	}

}
