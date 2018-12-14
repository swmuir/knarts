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
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch;

class SectionSwitch extends ConsolSwitch<Boolean> {

	static HashMap<Sheet, Integer> emptySectionOffset = new HashMap<Sheet, Integer>();

	static int serializeProblemObservation(Row row, int offset, ProblemObservation problemObservation) {
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

	DocumentMetadata documentMetadata;

	List<Encounter> encounters = null;

	String fileName = null;

	PatientRole patientRole = null;

	Query query = null;

	ServiceEvent serviceEvent = null;

	Sheet sheet = null;

	/**
	 * @param query
	 * @param sheet
	 * @param documentMetadata
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param fileName
	 */
	public SectionSwitch(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {
		super();
		this.query = query;
		this.sheet = sheet;
		this.documentMetadata = organizationAndSoftware;
		this.patientRole = patientRole;
		this.serviceEvent = serviceEvent;
		this.encounters = encounters;
		this.fileName = fileName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseAllergiesSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * AllergiesSectionEntriesOptional)
	 */
	@Override
	public Boolean caseAllergiesSectionEntriesOptional(AllergiesSectionEntriesOptional section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createAllergyHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}
		if (section.getAllergyProblemActs() != null && !section.getAllergyProblemActs().isEmpty()) {
			SpreadsheetSerializer.appendToAllergiesSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getAllergyProblemActs(),
				encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseFamilyHistorySection(org.openhealthtools.mdht.uml.cda.consol.
	 * FamilyHistorySection)
	 */
	@Override
	public Boolean caseFamilyHistorySection(FamilyHistorySection section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = createFamilyHistoryHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getOrganizers() != null && !section.getOrganizers().isEmpty()) {
			appendToFamilyHistorySheet(
				query, sheet, patientRole, serviceEvent, section.getOrganizers(), encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseGoalsSection(org.openhealthtools.mdht.uml.cda.consol.GoalsSection)
	 */
	@Override
	public Boolean caseGoalsSection(GoalsSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = createGoalsSectionHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getGoalObservations() != null && !section.getGoalObservations().isEmpty()) {
			appendToGoalSheet(
				query, sheet, patientRole, serviceEvent, section.getGoalObservations(), encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseHistoryOfPastIllnessSection(org.openhealthtools.mdht.uml.cda.consol.
	 * HistoryOfPastIllnessSection)
	 */
	@Override
	public Boolean caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createProblemObservationHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getProblemObservations() != null && !section.getProblemObservations().isEmpty()) {

			appendToProblemsSheet2(
				query, sheet, patientRole, serviceEvent, section.getProblemObservations(), encounters, fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseImmunizationsSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * ImmunizationsSectionEntriesOptional)
	 */
	@Override
	public Boolean caseImmunizationsSectionEntriesOptional(ImmunizationsSectionEntriesOptional section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createSubstanceAdministrationHeader(row1, row2, offset, "Immunization");
			emptySectionOffset.put(sheet, offset);
		}
		if (section.getImmunizationActivities() != null && !section.getImmunizationActivities().isEmpty()) {

			SpreadsheetSerializer.appendToSubstanceAdministrationSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, encounters,
				section.getImmunizationActivities(), fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseMedicationsAdministeredSection(org.openhealthtools.mdht.uml.cda.consol.
	 * MedicationsAdministeredSection)
	 */
	@Override
	public Boolean caseMedicationsAdministeredSection(MedicationsAdministeredSection section) {
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
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseMedicationsSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * MedicationsSectionEntriesOptional)
	 */
	@Override
	public Boolean caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional section) {

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
	public Boolean caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional section) {

		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createProblemHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);

		}
		if (section.getProblemConcerns() != null && !section.getProblemConcerns().isEmpty()) {

			appendToProblemsSheet(
				query, sheet, patientRole, serviceEvent, section.getProblemConcerns(), encounters, fileName);

		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseProceduresSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * ProceduresSectionEntriesOptional)
	 */
	@Override
	public Boolean caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createProcedureHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}
		if (section.getProcedureActivityActs() != null && !section.getProcedureActivityActs().isEmpty()) {

			SpreadsheetSerializer.appendActToProcedureSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getActs(), encounters, fileName);

		}

		if (section.getProcedureActivityObservations() != null &&
				!section.getProcedureActivityObservations().isEmpty()) {

			SpreadsheetSerializer.appendObservationToProcedureSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent,
				section.getProcedureActivityObservations(), encounters, fileName);

		}

		if (section.getProcedureActivityProcedures() != null &&
				!section.getProcedureActivityProcedures().isEmpty()) {

			SpreadsheetSerializer.appendProcedureToProcedureSheet(
				query, sheet, documentMetadata, patientRole, serviceEvent, section.getProcedures(), encounters,
				fileName);

		}

		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseResultsSectionEntriesOptional(org.openhealthtools.mdht.uml.cda.consol.
	 * ResultsSectionEntriesOptional)
	 */
	@Override
	public Boolean caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional section) {

		EList<ResultOrganizer> resultOrganizers = new BasicEList<ResultOrganizer>();

		for (Organizer organizer : section.getOrganizers()) {
			if (organizer instanceof ResultOrganizer) {
				resultOrganizers.add((ResultOrganizer) organizer);
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
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseSocialHistorySection(org.openhealthtools.mdht.uml.cda.consol.
	 * SocialHistorySection)
	 */
	@Override
	public Boolean caseSocialHistorySection(SocialHistorySection section) {
		if (sheet.getPhysicalNumberOfRows() == 0) {
			Row row1 = null; // sheet.createRow(0);
			Row row2 = sheet.createRow(0);

			int offset = SpreadsheetSerializer.createPatientHeader(row1, row2, 0);
			offset = SpreadsheetSerializer.createEncounterIDHeader(row1, row2, offset);
			offset = SpreadsheetSerializer.createSocialHistoryHeader(row1, row2, offset);
			emptySectionOffset.put(sheet, offset);
		}

		if (section.getObservations() != null && !section.getObservations().isEmpty()) {
			appendObservationsToSocialHistorySheet(
				query, sheet, patientRole, serviceEvent, section.getObservations(), encounters, fileName);
		} else {
			appendEmptySection(query, sheet, section, fileName);
		}

		return Boolean.TRUE;
	}

	@Override
	public Boolean caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional section) {
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
		return super.caseVitalSignsSectionEntriesOptional(section);
	}

	// /*
	// * (non-Javadoc)
	// *
	// * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseCarePlan(org.openhealthtools.mdht.uml.cda.consol.CarePlan)
	// */
	// @Override
	// public Boolean casePlanOfCareSection(PlanOfCareSection section) {
	// if (sheet.getPhysicalNumberOfRows() == 0) {
	// Row row1 = null; // sheet.createRow(0);
	// Row row2 = sheet.createRow(0);
	//
	// int offset = createPatientHeader(row1, row2, 0);
	// offset = createEncounterIDHeader(row1, row2, offset);
	// offset = createVitalSignsHeader(row1, row2, offset);
	// emptySectionOffset.put(sheet, offset);
	// }
	//
	// appendToCarePlanSheet(
	// query, sheet, documentMetadata, patientRole, serviceEvent, section.getOrganizers(), encounters,
	// fileName);
	// return Boolean.TRUE;
	//
	// return super.casePlanOfCareSection(section);
	// }

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseFunctionalStatusSection2(org.openhealthtools.mdht.uml.cda.consol.
	 * FunctionalStatusSection2)
	 */
	// @Override
	// public Boolean caseFunctionalStatusSection2(FunctionalStatusSection2 section) {
	//
	//// section.
	//
	// if (!section.getFunctionalStatusResultObservations().isEmpty()) {
	//
	// return Boolean.TRUE;
	// }
	// // TODO Auto-generated method stub
	// return super.caseFunctionalStatusSection2(section);
	// }

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return false;
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

		SpreadsheetSerializer.serializeSectionAndFileName(
			row, emptySectionOffset.get(sheet2) - 3, section, fileName);
	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param observations
	 * @param encounters2
	 * @param fileName2
	 */
	private void appendObservationsToSocialHistorySheet(Query query2, Sheet sheet2, PatientRole patientRole2,
			ServiceEvent serviceEvent2, EList<Observation> observations, List<Encounter> encounters2,
			String fileName2) {

		for (Observation sa : observations) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = SpreadsheetSerializer.serializeObservation(row, offset, sa, false);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	private void appendToGoalSheet(Query query2, Sheet sheet2, PatientRole patientRole2, ServiceEvent serviceEvent2,
			EList<? extends Observation> observations, List<Encounter> encounters2, String fileName2) {

		for (Observation observation : observations) {
			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
			offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
		}
	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param observations
	 * @param encounters2
	 * @param fileName2
	 */
	private void appendToFamilyHistorySheet(Query query2, Sheet sheet2, PatientRole patientRole2,
			ServiceEvent serviceEvent2, List<Organizer> observations, List<Encounter> encounters2,
			String fileName2) {

		for (Organizer organizer : observations) {

			for (Observation observation : organizer.getObservations()) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
				offset = SpreadsheetSerializer.serializeEnounterID(row, offset, observation, encounters);
				offset = SpreadsheetSerializer.serializeOrganizer(row, offset, organizer, false, true);
				offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
				SpreadsheetSerializer.serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
			}

		}

	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param problemConcerns
	 * @param encounters2
	 * @param fileName2
	 */
	private void appendToProblemsSheet(Query query2, Sheet sheet2, PatientRole patientRole2,
			ServiceEvent serviceEvent2, EList<ProblemConcernAct> problemConcerns, List<Encounter> encounters2,
			String fileName2) {

		for (ProblemConcernAct sa : problemConcerns) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeProblemConcernAct(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param problemObservations
	 * @param encounters2
	 * @param fileName2
	 */
	private void appendToProblemsSheet2(Query query2, Sheet sheet2, PatientRole patientRole2,
			ServiceEvent serviceEvent2, EList<ProblemObservation> problemObservations, List<Encounter> encounters2,
			String fileName2) {

		for (ProblemObservation sa : problemObservations) {

			int offset = 0;

			Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

			offset = SpreadsheetSerializer.serializeEnounterID(row, offset, sa, encounters);

			offset = serializeProblemObservation(row, offset, sa);

			SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

		}

	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 * @return
	 */
	private int createFamilyHistoryHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Organizer ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Description");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Observation ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Value");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		return offset;
	}

	private int createGoalsSectionHeader(Row row1, Row row2, int offset) {
		// row2.createCell(offset++).setCellValue("Organizer ID");
		// row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Description");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Observation ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = SpreadsheetSerializer.addCodeHeader(row2, offset, "Value");
		offset = SpreadsheetSerializer.addSectionHeader(row2, offset);
		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	private int serializeProblemConcernAct(Row row, int offset, ProblemConcernAct problemConcernAct) {
		StringBuffer sb = new StringBuffer();

		for (II ii : problemConcernAct.getIds()) {
			sb.append(CDAValueUtil.getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = CDAValueUtil.getDate(CDAValueUtil.getValueAsString(problemConcernAct.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(CDAValueUtil.DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		offset = SpreadsheetSerializer.appendCode(
			row, offset, problemConcernAct.getSection(), problemConcernAct.getCode(), problemConcernAct.getText());

		for (ProblemObservation problemObservation : problemConcernAct.getProblemObservations()) {
			offset = serializeProblemObservation(row, offset, problemObservation);
			break;
		}

		return offset;
	}

}