/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *    
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.dialogs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.ui.search.IElementFilter;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;

public class FHIRDialogUtil {

	public static ValueSet selectValueSet(ResourceSet resourceSet, Shell shell) {
		ValueSet valueSet = (ValueSet) selectFHIRClass(resourceSet, shell, FHIRPackage.eINSTANCE.getValueSet(), "Select a value set");

		return valueSet;
	}

	public static ValueSet selectValueSet(Package umlPackage, Shell shell) {
		ValueSet valueSet = (ValueSet) selectFHIRClass(umlPackage, shell, FHIRPackage.eINSTANCE.getValueSet(), "Select a value set");

		return valueSet;
	}

	private static EObject selectFHIRClass(ResourceSet resourceSet, Shell shell, final EClass stereotypeEClass, String message) {
		EObject fhirClass = null;
		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				return ProfileUtil.getStereotypeApplication(element, stereotypeEClass) != null;
			}
		};

		final NamedElement element = DialogLaunchUtil.chooseElement(
			filter, resourceSet, shell, null, message);

		if (element != null) {
			fhirClass = ProfileUtil.getStereotypeApplication(element, stereotypeEClass);
		}
		
		return fhirClass;
	}

	private static EObject selectFHIRClass(Package umlPackage, Shell shell, final EClass stereotypeEClass, String message) {
		EObject fhirClass = null;
		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				return ProfileUtil.getStereotypeApplication(element, stereotypeEClass) != null;
			}
		};

		final NamedElement element = DialogLaunchUtil.chooseElement(
			filter, umlPackage, shell, null, message);

		if (element != null) {
			fhirClass = ProfileUtil.getStereotypeApplication(element, stereotypeEClass);
		}
		
		return fhirClass;
	}
	
}
