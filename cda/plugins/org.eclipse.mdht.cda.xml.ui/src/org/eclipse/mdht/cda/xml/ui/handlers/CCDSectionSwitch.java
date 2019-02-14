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

import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.DocumentMetadata;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDSwitch;

class CCDSectionSwitch extends CCDSwitch<Boolean> {
	static HashMap<Sheet, Integer> emptySectionOffset = new HashMap<Sheet, Integer>();

	DocumentMetadata documentMetadata;

	List<Encounter> encounters = null;

	String fileName = null;

	PatientRole patientRole = null;

	Query query = null;

	ServiceEvent serviceEvent = null;

	Sheet sheet = null;

	public CCDSectionSwitch(Query query, Sheet sheet, DocumentMetadata documentMetadata, PatientRole patientRole,
			ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {
		super();
		this.query = query;
		this.sheet = sheet;
		this.patientRole = patientRole;
		this.serviceEvent = serviceEvent;
		this.encounters = encounters;
		this.fileName = fileName;
		this.documentMetadata = documentMetadata;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.ccd.util.CCDSwitch#caseProceduresSection(org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection)
	 */
	@Override
	public Boolean caseProceduresSection(ProceduresSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SheetHeaderUtil.createPatientHeader(row1, row2, 0);
			offset = SheetHeaderUtil.createEncounterIDHeader(row1, row2, offset);
			offset = SheetHeaderUtil.createProcedureHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getProcedures() != null && !section.getProcedures().isEmpty()) {

			SpreadsheetSerializer.appendProcedureToProcedureSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getProcedures(), encounters,
				fileName);
		}
		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.ccd.util.CCDSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return Boolean.FALSE;
	}

}
