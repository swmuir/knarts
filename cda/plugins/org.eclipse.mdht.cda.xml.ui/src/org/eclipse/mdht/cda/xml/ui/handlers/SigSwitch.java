/*******************************************************************************
 * Copyright (c) 2018 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     seanmuir - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.handlers;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch;

class SigSwitch extends ConsolSwitch<String> {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseMedicationActivity(org.openhealthtools.mdht.uml.cda.consol.
	 * MedicationActivity)
	 */
	@Override
	public String caseMedicationActivity(MedicationActivity medicationActivity) {

		String result = CDAValueUtil.getValue(medicationActivity.getSection(), medicationActivity.getText());

		if (!StringUtils.isEmpty(result)) {
			return result;
		}

		return super.caseMedicationActivity(medicationActivity);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseMedicationActivity2(org.openhealthtools.mdht.uml.cda.consol.
	 * MedicationActivity2)
	 */
	@Override
	public String caseMedicationActivity2(MedicationActivity2 medicationActivity) {

		if (!medicationActivity.getMedicationFreeTextSigs().isEmpty()) {

			MedicationFreeTextSig mfts = medicationActivity.getMedicationFreeTextSigs().get(0);
			String result = CDAValueUtil.getValue(medicationActivity.getSection(), mfts.getText());

			if (!StringUtils.isEmpty(result)) {
				return result;
			}

		}

		return super.caseMedicationActivity2(medicationActivity);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public String defaultCase(EObject object) {
		return "Missing SIG";
	}

}