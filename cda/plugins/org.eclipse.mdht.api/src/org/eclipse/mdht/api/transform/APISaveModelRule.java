/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.api.transform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.mdht.transform.core.ITransformMonitor;
import org.eclipse.mdht.transform.core.TransformationException;
import org.eclipse.mdht.transform.core.impl.SaveModelRule;

/**
 * Prevent saving the model resource
 */
public class APISaveModelRule extends SaveModelRule {

	@Override
	protected Object doApply(EObject input, ITransformMonitor monitor) throws TransformationException {
		Resource result = input.eResource();

		// super.doApply(input, monitor);
		// do nothing

		return result;
	}
}
