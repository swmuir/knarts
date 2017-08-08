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

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;

import de.undercouch.bson4jackson.BsonFactory;
import de.undercouch.bson4jackson.BsonGenerator;

/**
 * Fixes a problem with the BsonGenerator.flush() method: first make the factory
 * use our fix
 */
public class BsonFactoryFixed extends BsonFactory {

	@Override
	public BsonGenerator createGenerator(OutputStream out, JsonEncoding enc) throws IOException {
		IOContext ctxt = _createContext(out, true);
		ctxt.setEncoding(enc);
		if (enc == JsonEncoding.UTF8 && _outputDecorator != null) {
			out = _outputDecorator.decorate(ctxt, out);
		}
		BsonGenerator g = new BsonGeneratorFixed(_generatorFeatures, _bsonGeneratorFeatures, out);
		ObjectCodec codec = getCodec();
		if (codec != null) {
			g.setCodec(codec);
		}
		if (_characterEscapes != null) {
			g.setCharacterEscapes(_characterEscapes);
		}
		return g;
	}

}
