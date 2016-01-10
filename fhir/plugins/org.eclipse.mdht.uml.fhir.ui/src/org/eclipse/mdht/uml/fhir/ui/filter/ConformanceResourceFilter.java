/*******************************************************************************
 * Copyright (c) 2015 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.common.ui.filters.AbstractFilter;
import org.eclipse.mdht.uml.fhir.ConformanceResource;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;

/**
 * Selects a property where ConformanceResource stereotype (or sub-stereotypes) is applied.
 */
public class ConformanceResourceFilter extends AbstractFilter {

	public boolean select(Object object) {
		Element element = getElement(object);

		if (element != null) {
			if (element instanceof Classifier) {
				for (EObject stereoApp : element.getStereotypeApplications()) {
					if (stereoApp instanceof ConformanceResource) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
