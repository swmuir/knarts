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

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.DocumentMetadata;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPSwitch;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntryReactionObservationContainer;

class C32SectionSwitch extends HITSPSwitch<Boolean> {

	static HashMap<Sheet, Integer> emptySectionOffset = new HashMap<Sheet, Integer>();

	DocumentMetadata documentMetadata;

	List<Encounter> encounters = null;

	String fileName = null;

	PatientRole patientRole = null;

	Query query = null;

	ServiceEvent serviceEvent = null;

	Sheet sheet = null;

	public C32SectionSwitch(Query query, Sheet sheet, DocumentMetadata documentMetadata, PatientRole patientRole,
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
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPSwitch#caseAllergiesReactionsSection(org.openhealthtools.mdht.uml.cda.hitsp.
	 * AllergiesReactionsSection)
	 */
	@Override
	public Boolean caseAllergiesReactionsSection(AllergiesReactionsSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createAllergyHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		section.getAllergyIntoleranceConcerns();

		if (section.getAllergyIntoleranceConcerns() != null && !section.getAllergyIntoleranceConcerns().isEmpty()) {
			appendToAllergiesSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getAllergyIntoleranceConcerns(),
				encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPSwitch#caseDiagnosticResultsSection(org.openhealthtools.mdht.uml.cda.hitsp.
	 * DiagnosticResultsSection)
	 */
	@Override
	public Boolean caseDiagnosticResultsSection(DiagnosticResultsSection section) {
		EList<org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer> resultOrganizers = new BasicEList<org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer>();

		for (Organizer organizer : section.getOrganizers()) {
			if (organizer instanceof org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer) {
				resultOrganizers.add((org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer) organizer);
			}
		}

		if (!resultOrganizers.isEmpty()) {

			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null; // sheet.createRow(0);
				Row row2 = sheet.createRow(0);

				int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
				offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
				offset = SpreadsheetSerializer.createResultsHeader(row1, row2, offset);
				emptySectionOffset.put(sheet, offset);
			}

			SpreadsheetSerializer.appendToResultsSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, resultOrganizers, encounters, fileName);

		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPSwitch#caseCCD_ImmunizationsSection(org.openhealthtools.mdht.uml.cda.ccd.
	 * ImmunizationsSection)
	 */
	@Override
	public Boolean caseImmunizationsSection(ImmunizationsSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createSubstanceAdministrationHeader(row1, row2, offset, "Immunization");
			emptySectionOffset.put(sheet, offset);
		}
		if (section.getSubstanceAdministrations() != null && !section.getSubstanceAdministrations().isEmpty()) {

			SpreadsheetSerializer.appendToSubstanceAdministrationSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, encounters,
				section.getSubstanceAdministrations(), fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPSwitch#caseCCD_MedicationsSection(org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection)
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

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPSwitch#caseProblemListSection(org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection)
	 */
	@Override
	public Boolean caseProblemListSection(ProblemListSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createProblemHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);

		}

		if (section.getProblemConcernEntries() != null && !section.getProblemConcernEntries().isEmpty()) {

			appendToProblemsSheet(
				query, sheet, patientRole, serviceEvent, section.getProblemConcernEntries(), encounters, fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPSwitch#caseCCD_VitalSignsSection(org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection)
	 */
	@Override
	public Boolean caseVitalSignsSection(VitalSignsSection section) {
		if (section.getVitalSignsOrganizers() != null && !section.getVitalSignsOrganizers().isEmpty()) {

			if (sheet.getPhysicalNumberOfRows() == 0) {
				Row row1 = null; // sheet.createRow(0);
				Row row2 = sheet.createRow(0);

				int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
				offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
				offset = SpreadsheetSerializer.createVitalSignsHeader(row1, row2, offset);
				emptySectionOffset.put(sheet, offset);
			}

			SpreadsheetSerializer.appendToVitalSignsSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getOrganizers(), encounters,
				fileName);
			return Boolean.TRUE;

		}
		return Boolean.FALSE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return Boolean.FALSE;
	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param section
	 * @param fileName2
	 */
	private void appendEmptySection(Query query2, Sheet sheet2, Section section, String fileName2) {

		Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);

		row.createCell(offset++).setCellValue("NO ENCOUNTER");

		row.createCell(offset++).setCellValue("NO ENTRIES");

		SpreadsheetSerializer.serializeSectionAndFileName(row, emptySectionOffset.get(sheet2) - 3, section, fileName);
	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param allergyIntoleranceConcerns
	 * @param encounters2
	 * @param fileName2
	 */
	private void appendToAllergiesSheet(Query query2, Sheet sheet2, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole2, ServiceEvent serviceEvent2, EList<AllergyIntoleranceConcern> sas,
			List<Encounter> encounters2, String fileName2) {

		for (AllergyIntoleranceConcern sa : sas) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, organizationAndSoftware, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);
			offset = serializeAllergyProblemAct(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param problemConcernEntries
	 * @param encounters2
	 * @param fileName2
	 */
	private void appendToProblemsSheet(Query query, Sheet sheet, PatientRole patientRole2, ServiceEvent serviceEvent,
			EList<ProblemConcernEntry> problemConcernEntries, List<Encounter> encounters, String fileName2) {

		for (ProblemConcernEntry sa : problemConcernEntries) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeProblemConcernAct(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	private int serializeAllergyProblemAct(Row row, int offset, AllergyIntoleranceConcern allergyIntoleranceConcern) {
		StringBuffer sb = new StringBuffer();

		for (II ii : allergyIntoleranceConcern.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		if (allergyIntoleranceConcern.getStatusCode() != null &&
				!StringUtils.isEmpty(allergyIntoleranceConcern.getStatusCode().getCode())) {
			row.createCell(offset++).setCellValue(allergyIntoleranceConcern.getStatusCode().getCode());
		} else {
			row.createCell(offset++).setCellValue("Missing Status");
		}

		for (AllergyIntolerance allergyIntolerance : allergyIntoleranceConcern.getAllergyIntolerances()) {

			Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(allergyIntolerance.getEffectiveTime()));
			if (d != null) {
				row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
			} else {
				row.createCell(offset++).setCellValue("");
			}

			CD cd = null;
			for (ANY any : allergyIntolerance.getValues()) {
				if (any instanceof CD) {
					cd = (CD) any;
				}

			}

			row.createCell(offset++).setCellValue(Boolean.TRUE.equals(allergyIntolerance.getNegationInd()));

			offset = SpreadsheetSerializer.appendCode(
				row, offset, allergyIntoleranceConcern.getSection(), cd, allergyIntolerance.getText());

			CD material = null;

			try {
				material = allergyIntolerance.getParticipants().get(
					0).getParticipantRole().getPlayingEntity().getCode();
			} catch (RuntimeException re) {

			}

			offset = SpreadsheetSerializer.appendCode(
				row, offset, allergyIntoleranceConcern.getSection(), material, null);

			if (!allergyIntolerance.getProblemEntryReactionObservationContainers().isEmpty()) {
				for (ProblemEntryReactionObservationContainer ro : allergyIntolerance.getProblemEntryReactionObservationContainers()) {

					CD reactionCode = null;

					for (ANY any : ro.getValues()) {
						if (any instanceof CD) {
							reactionCode = (CD) any;
						}
					}
					offset = SpreadsheetSerializer.appendCode(
						row, offset, allergyIntoleranceConcern.getSection(), reactionCode, ro.getText());

					break;
				}
			} else {
				offset = SpreadsheetSerializer.appendCode(
					row, offset, allergyIntoleranceConcern.getSection(), null, null);
			}

			if (allergyIntolerance.getSeverity() != null) {

				CD severityCode = null;

				for (ANY any : allergyIntolerance.getSeverity().getValues()) {
					if (any instanceof CD) {
						severityCode = (CD) any;
					}
				}
				offset = SpreadsheetSerializer.appendCode(
					row, offset, allergyIntoleranceConcern.getSection(), severityCode,
					allergyIntolerance.getSeverity().getText());

			} else {
				offset = SpreadsheetSerializer.appendCode(
					row, offset, allergyIntoleranceConcern.getSection(), null, null);
			}
			offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, allergyIntolerance.getAuthors());

			break;
		}

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	private int serializeProblemConcernAct(Row row, int offset, ProblemConcernEntry sa) {
		StringBuffer sb = new StringBuffer();

		for (II ii : sa.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(sa.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		offset = SpreadsheetSerializer.appendCode(row, offset, sa.getSection(), sa.getCode(), sa.getText());

		for (ProblemEntry problemObservation : sa.getProblemEntries()) {
			offset = serializeProblemObservation(row, offset, problemObservation);
			break;
		}

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param problemObservation
	 */
	private int serializeProblemObservation(Row row, int offset, ProblemEntry problemObservation) {
		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		Date d;
		for (II ii : problemObservation.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		// ID
		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivlts = problemObservation.getEffectiveTime();

		if (ivlts != null) {

			if (ivlts.getValue() != null) {
				if (!StringUtils.isEmpty(ivlts.getValue())) {

					d = CDAValueUtil.getDate(ivlts.getValue());

					;

					sb.append(CDAValueUtil.DATE_PRETTY.format(d));
				}

			}
			if (ivlts.getLow() != null) {
				if (!StringUtils.isEmpty(ivlts.getLow().getValue())) {

					d = CDAValueUtil.getDate(ivlts.getLow().getValue());

					;

					sb.append(CDAValueUtil.DATE_PRETTY.format(d));
				}

			}
			if (ivlts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivlts.getHigh().getValue())) {

					d = CDAValueUtil.getDate(ivlts.getHigh().getValue());
					if (sb.length() > 0) {
						sb.append(" - ");
					}
					sb.append(CDAValueUtil.DATE_PRETTY.format(d));
				}
			}
		}

		cell.setCellValue(sb.toString());

		CD problemCode = null;

		for (ANY any : problemObservation.getValues()) {
			if (any instanceof CD) {
				problemCode = (CD) any;
			}
		}
		offset = SpreadsheetSerializer.appendCode(
			row, offset, problemObservation.getSection(), problemCode, problemObservation.getText());

		offset = SpreadsheetSerializer.appendOrganizationAndAuthor(row, offset, problemObservation.getAuthors());

		return offset;

	}

}
