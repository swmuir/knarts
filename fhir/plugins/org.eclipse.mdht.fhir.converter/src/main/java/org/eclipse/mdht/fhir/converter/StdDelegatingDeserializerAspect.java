/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;

/**
 * Can't get this aspect working, therefore needed to duplicate class
 * StdDelegatingDeserializer to patch method isCachable() in there
 */
// @Aspect
// @Component
public class StdDelegatingDeserializerAspect {
	public StdDelegatingDeserializerAspect() {
	}

	@SuppressWarnings("rawtypes")
	@Around("execution(* com.fasterxml.jackson.databind.JsonDeserializer.isCachable())")
	public Object aroundIsCachable(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		JsonDeserializer serializer = (JsonDeserializer) proceedingJoinPoint.getThis();
		if (serializer instanceof StdDelegatingDeserializer) {
			StdDelegatingDeserializer stdDelegatingDeserializer = (StdDelegatingDeserializer) serializer;
			return stdDelegatingDeserializer.getDelegatee().isCachable();
		}
		return proceedingJoinPoint.proceed();
	}

}
