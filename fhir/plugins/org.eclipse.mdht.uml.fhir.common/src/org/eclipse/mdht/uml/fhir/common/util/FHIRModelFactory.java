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
package org.eclipse.mdht.uml.fhir.common.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;

public class FHIRModelFactory {

	public static Package createFHIRModel() {
		return createFHIRModel(null, null);
	}
	
	public static Package createFHIRModel(ResourceSet resourceSet, String name) {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		URI modelURI = URI.createFileURI("/FHIR/FHIRCache.uml");
		Resource resource = UMLResource.Factory.INSTANCE.createResource(modelURI);
		resourceSet.getResources().add(resource);
		
		String modelName = (name == null) ? "FHIR" : name;
		Package umlPackage = UMLFactory.eINSTANCE.createPackage();
		umlPackage.setName(modelName);
		resource.getContents().add(umlPackage);
		
		Profile fhirProfile = ProfileUtil.getProfile(resourceSet);
		if (fhirProfile != null) {
			umlPackage.applyProfile(fhirProfile);
		}
		
		return umlPackage;
	}
}
