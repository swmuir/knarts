/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.mdht.uml.fhir.ValueSetBinding;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

public class ProfileUtil {
	
	public static ValueSet getValueSet(Enumeration umlEnumeration) {
		return (ValueSet) getStereotypeApplication(umlEnumeration, FHIRPackage.eINSTANCE.getValueSet());
	}

	public static ValueSetBinding getValueSetBinding(Property property) {
		return (ValueSetBinding) getStereotypeApplication(property, FHIRPackage.eINSTANCE.getValueSetBinding());
	}

	/**
	 * Returns stereotype application, if applied, or first sub-stereotype applied that is a
	 * specialization of the given stereotype.
	 * 
	 * @return stereotype application, or null if not applied
	 */
	public static EObject getStereotypeApplication(Element element, EClass stereotypeEClass) {
		EObject stereotypeApplication = null;
		if (element != null) {
			for (EObject stereoApp : element.getStereotypeApplications()) {
				if (stereotypeEClass.isInstance(stereoApp)) {
					stereotypeApplication = stereoApp;
					break;
				}
			}
		}
		
		return stereotypeApplication;
	}
	
	public static Stereotype getStereotype(EObject stereotypeApplication) {
		Stereotype stereotype = null;
		Profile profile = null;
		String profileURI = stereotypeApplication.eClass().getEPackage().getNsURI();
		for (Resource resource : stereotypeApplication.eResource().getResourceSet().getResources()) {
			Profile aProfile = (Profile) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.eINSTANCE.getProfile());
			if (aProfile != null) {
				Stereotype ePackage = aProfile.getAppliedStereotype("Ecore::EPackage");
				if (ePackage != null && profileURI.equals(aProfile.getValue(ePackage, "nsURI"))) {
					profile = aProfile;
					break;
				}
			}
		}
		if (profile != null) {
			NamedElement element = profile.getMember(stereotypeApplication.eClass().getName());
			if (element instanceof Stereotype) {
				stereotype = (Stereotype) element;
			}
		}
		
		return stereotype;
	}
	
}
