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
import org.eclipse.mdht.uml.fhir.ValueSetBinding;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * Selects a property that has ValueSetBinding stereotype applied.
 */
public class HasValueSetBindingFilter extends AbstractFilter {
	public boolean select(Object object) {
		Element element = getElement(object);

		if (element != null) {
			if (element instanceof Association) {
				element = UMLUtil.getNavigableEnd((Association) element);
			}
			if (element instanceof Property) {
				for (EObject stereoApp : ((Property)element).getStereotypeApplications()) {
					if (stereoApp instanceof ValueSetBinding) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
}
