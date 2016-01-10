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
package org.eclipse.mdht.uml.fhir.ui.handlers;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.mdht.uml.fhir.common.util.ModelConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Profile;

public class AddValueSetHandler extends AddUMLEnumerationHandler {

	@Override
	protected String getClassifierName(ExecutionEvent event, IWorkbenchPart activePart) {
		String classifierName = null;

		InputDialog inputDialog = new InputDialog(
			activePart.getSite().getShell(), "New ValueSet", "Enter name", "", null);
		if (inputDialog.open() == Window.OK) {
			classifierName = inputDialog.getValue();
		}
		return classifierName;
	}

	@Override
	protected void postProcess(Enumeration newEnum, ExecutionEvent event, IWorkbenchPart activePart) {
		Profile fhirUmlProfile = org.eclipse.uml2.uml.util.UMLUtil.getProfile(
				org.eclipse.mdht.uml.fhir.FHIRPackage.eINSTANCE.getStructureDefinition().getEPackage(), newEnum);
		if (fhirUmlProfile != null) {
			ValueSet valueSet = (ValueSet) org.eclipse.uml2.uml.util.UMLUtil.safeApplyStereotype(newEnum, fhirUmlProfile.getOwnedStereotype(FHIRPackage.eINSTANCE.getValueSet().getName()));
			valueSet.setName(newEnum.getName());
			valueSet.setUri(ModelConstants.MDHT_VALUESET_URI_BASE + encodeURL(newEnum.getName().toLowerCase()));
		}
	}

	private String encodeURL(String text) {
		try {
			return URLEncoder.encode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// should not occur, but use original matchText
			return "";
		}
	}
}
