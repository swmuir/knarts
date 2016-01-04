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
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.fhir.ElementDefinition;
import org.eclipse.mdht.uml.fhir.common.util.FhirModelUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * Selects a property where ValueSetBinding stereotype is applicable.
 * An ElementDefinition where property type is a kind of:
 * "CodeableConcept", "Coded", "code", "Quantity", "Extension", "uri", "string"
 */
public class ValueSetBindingFilter extends AbstractFilter {
	private static String[] codedTypes = new String[] { "CodeableConcept", "Coded", "code", "Quantity", "Extension", "uri", "string" };

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
						for (int i = 0; i < codedTypes.length; i++) {
							if (FhirModelUtil.isKindOf((Classifier) ((Property)element).getType(), codedTypes[i])) {
								return true;
							}
						}
					}
				}
			}
		}
		
		return false;
	}
}
