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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.common.ui.filters.AbstractFilter;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.fhir.ElementDefinition;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * Selects a property where ValueSetBinding stereotype (or sub-stereotypes) is applicable (may not be applied).
 */
public class ValueSetBindingFilter extends AbstractFilter {
	private static String[] codedTypesArray = new String[] { "CodeableConcept", "Coded", "code", "Quantity", "Extension", "uri", "string" };
	private static List<String> codedTypes = Arrays.asList(codedTypesArray);

	public boolean select(Object object) {
		Element element = getElement(object);

		if (element != null) {
			if (element instanceof Association) {
				element = UMLUtil.getNavigableEnd((Association) element);
			}
			if (element instanceof Property) {
				for (EObject stereoApp : element.getStereotypeApplications()) {
					if (stereoApp instanceof ElementDefinition
							&& ((Property)element).getType() != null) {
						String typeName = ((Property)element).getType().getName();
						if (codedTypes.contains(typeName)) {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
}
