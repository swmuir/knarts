/*******************************************************************************
 * Copyright (c) 2019 seanmuir.
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
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHESwitch;

/**
 * @author seanmuir
 *
 */
public class IHESectionSwitch extends IHESwitch<Boolean> {

	static HashMap<Sheet, Integer> emptySectionOffset = new HashMap<Sheet, Integer>();

	DocumentMetadata documentMetadata;

	List<Encounter> encounters = null;

	String fileName = null;

	PatientRole patientRole = null;

	Query query = null;

	ServiceEvent serviceEvent = null;

	Sheet sheet = null;

	public IHESectionSwitch(Query query, Sheet sheet, DocumentMetadata documentMetadata, PatientRole patientRole,
			ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {
		super();
		this.query = query;
		this.sheet = sheet;
		this.documentMetadata = documentMetadata;
		this.patientRole = patientRole;
		this.serviceEvent = serviceEvent;
		this.encounters = encounters;
		this.fileName = fileName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.ihe.util.IHESwitch#caseMedicationsSection(org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection)
	 */
	@Override
	public Boolean caseMedicationsSection(MedicationsSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);
			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createSubstanceAdministrationHeader(row1, row2, offset, "Medications");
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getMedicationActivities() != null && !section.getMedicationActivities().isEmpty()) {
			SpreadsheetSerializer.appendToSubstanceAdministrationSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, encounters,
				section.getMedicationActivities(), fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean defaultCase(EObject object) {
		return Boolean.FALSE;
	}

	private void appendEmptySection(Query query2, Sheet sheet2, Section section, String fileName2) {

		Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);

		row.createCell(offset++).setCellValue("NO ENCOUNTER");

		row.createCell(offset++).setCellValue("NO ENTRIES");

		SpreadsheetSerializer.serializeSectionAndFileName(row, emptySectionOffset.get(sheet2) - 3, section, fileName);
	}

}
