/*******************************************************************************
 * Copyright (c) 2017,2018 seanmuir.
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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import javax.swing.text.html.HTMLEditorKit;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.DocumentMetadata;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Procedure;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Filter;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.ON;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.SXCM_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentEncounterMood;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

/**
 * @author seanmuir
 *
 */
public abstract class GenerateCDABaseHandler extends AbstractHandler {

	static boolean omitDOB = false;

	static boolean omitUnits = false;

	static String preferenceFilters;

	public class ResultsDialog extends TitleAreaDialog {

		org.eclipse.swt.widgets.Table table;

		public ResultsDialog(Shell shell) {
			super(shell);

		}

		@Override
		public void create() {
			super.create();
			setTitle("CDA Processing Results");
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

		@Override
		protected Control createDialogArea(Composite parent) {

			Label label = new Label(parent, SWT.BORDER);

			label.setText("Total Files " + files.size());

			final ScrolledComposite composite = new ScrolledComposite(parent, SWT.V_SCROLL);
			composite.setLayout(new GridLayout());
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			table = new org.eclipse.swt.widgets.Table(composite, SWT.BORDER | SWT.MULTI);
			table.setHeaderVisible(true);

			table.setSize(100, 100);

			composite.setContent(table);
			composite.setExpandHorizontal(true);
			composite.setExpandVertical(true);
			composite.setAlwaysShowScrollBars(true);
			composite.setMinSize(table.computeSize(SWT.DEFAULT, SWT.DEFAULT));

			table.setLinesVisible(true);

			final GridData gridData = new GridData();
			gridData.widthHint = 500;
			table.setLayoutData(gridData);

			table.setHeaderVisible(true);
			final TableColumn column1 = new TableColumn(table, SWT.LEFT);

			final TableColumn column2 = new TableColumn(table, SWT.LEFT);

			column1.setText("File Name");
			column2.setText("Total Sections");

			column1.setWidth(250);
			column2.setWidth(250);

			for (IFile file : files) {
				final TableItem valueSetsUpdatedItem = new TableItem(table, SWT.NONE);
				if (errors.containsKey(file)) {
					valueSetsUpdatedItem.setText(new String[] { file.getName(), errors.get(file).getMessage() });
				} else {
					int sectionCount = getSectionCount(file);

					valueSetsUpdatedItem.setText(new String[] { file.getName(), String.valueOf(sectionCount) });
				}
			}

			return composite;
		}

	}

	protected static class ActByEncounterPredicate implements Predicate<Act> {

		Encounter encounter;

		/**
		 * @param encounter
		 */
		public ActByEncounterPredicate(Encounter encounter) {
			super();
			this.encounter = encounter;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see com.google.common.base.Predicate#apply(java.lang.Object)
		 */
		@Override
		public boolean apply(Act act) {
			return matchesEncounter(encounter, act);
		}

	}

	protected static class EncountersFilter implements Filter<Encounter> {

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.cda.util.CDAUtil.Filter#accept(java.lang.Object)
		 */
		@Override
		public boolean accept(Encounter item) {
			if (x_DocumentEncounterMood.EVN.equals(item.getMoodCode())) {
				if (item.getEffectiveTime() != null) {
					return true;
				}
			}
			return false;
		}

	}

	protected static class ExtractText extends HTMLEditorKit.ParserCallback {

		StringBuffer txt;

		public ExtractText() {
			super();
			txt = new StringBuffer();
		}

		@Override
		public void handleText(char[] text, int pos) {
			txt.append(text);
		}

		String getText() {
			String result = txt.toString();
			if (StringUtils.isEmpty(result)) {
				return "";
			}
			if (result.length() < 50) {
				return result;
			}
			return result.substring(0, 49);
		}
	}

	protected static class FilterAllergyProblemActByEncounter implements Filter<AllergyProblemAct> {

		Encounter encounter;

		public FilterAllergyProblemActByEncounter(Encounter encounter) {
			super();
			this.encounter = encounter;
		}

		@Override
		public boolean accept(AllergyProblemAct item) {
			return matchesEncounter(encounter, item);
		}

	}

	protected static class FilterAllergyProblemActByServiceEvent implements Filter<AllergyProblemAct> {

		ServiceEvent serviceEvent;

		public FilterAllergyProblemActByServiceEvent(ServiceEvent serviceEvent) {
			super();
			this.serviceEvent = serviceEvent;
		}

		@Override
		public boolean accept(AllergyProblemAct item) {
			for (Encounter encoutner : item.getEncounters()) {
				for (II ii : encoutner.getIds()) {
					for (II iii : serviceEvent.getIds()) {
						if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
							return true;
						}
					}
				}
			}
			return true;
		}

	}

	protected static class FilterSubstanceAdminstrationsByEncounter implements Filter<MedicationActivity> {

		Encounter encounter;

		public FilterSubstanceAdminstrationsByEncounter(Encounter encounter) {
			super();
			this.encounter = encounter;
		}

		@Override
		public boolean accept(MedicationActivity item) {
			return matchesEncounter(encounter, item);
		}

	}

	protected static class FilterSubstanceAdminstrationsByServiceEvent implements Filter<MedicationActivity> {

		ServiceEvent serviceEvent;

		public FilterSubstanceAdminstrationsByServiceEvent(ServiceEvent serviceEvent) {
			super();
			this.serviceEvent = serviceEvent;
		}

		@Override
		public boolean accept(MedicationActivity item) {
			for (Encounter encoutner : item.getEncounters()) {

				for (II ii : encoutner.getIds()) {
					for (II iii : serviceEvent.getIds()) {
						if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
							return true;
						}
					}
				}
			}
			return true;
		}

	}

	protected static class ObservationByEncounterPredicate implements Predicate<Observation> {

		Encounter encounter;

		/**
		 * @param encounter
		 */
		public ObservationByEncounterPredicate(Encounter encounter) {
			super();
			this.encounter = encounter;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see com.google.common.base.Predicate#apply(java.lang.Object)
		 */
		@Override
		public boolean apply(Observation observation) {
			return matchesEncounter(encounter, observation);
		}

		/**
		 * @param encounter2
		 * @param observation
		 * @return
		 */
		private boolean matchesEncounter(Encounter encounter2, Observation observation) {
			for (II ii : observation.getIds()) {
				for (II iii : encounter.getIds()) {
					if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
						return true;
					}
				}
			}

			Date observationTime = null;

			if (observation.getEffectiveTime() != null) {
				IVL_TS ivlts = observation.getEffectiveTime();
				if (observationTime == null && ivlts.getLow() != null &&
						!StringUtils.isEmpty(ivlts.getLow().getValue())) {
					observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
				}

				if (observationTime == null && ivlts.getHigh() != null &&
						!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
					observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
				}
			}

			if (observationTime == null) {
				for (Author author : observation.getAuthors()) {
					if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
						observationTime = CDAValueUtil.getDate(author.getTime().getValue());
					}
				}
			}

			if (observationTime != null) {
				return isWithinEncounterDateRate(encounter, observationTime);
			}

			return false;

		}

	}

	protected static class OrganizerByEncounterPredicate implements Predicate<Organizer> {

		Encounter encounter;

		/**
		 * @param encounter
		 */
		public OrganizerByEncounterPredicate(Encounter encounter) {
			super();
			this.encounter = encounter;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see com.google.common.base.Predicate#apply(java.lang.Object)
		 */
		@Override
		public boolean apply(Organizer organizer) {
			return matchesEncounter(encounter, organizer);
		}

	}

	protected enum PorO {
		ORGANIZATION, PERSON

	}

	protected static class ProcedureByEncounterPredicate implements Predicate<Procedure> {

		Encounter encounter;

		/**
		 * @param encounter
		 */
		public ProcedureByEncounterPredicate(Encounter encounter) {
			super();
			this.encounter = encounter;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see com.google.common.base.Predicate#apply(java.lang.Object)
		 */
		@Override
		public boolean apply(Procedure procedure) {
			return matchesEncounter(encounter, procedure);
		}

	}

	protected static class SectionSwitch extends ConsolSwitch<Boolean> {

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
		@Override
		public Boolean caseFunctionalStatusSection2(FunctionalStatusSection2 section) {

			if (!section.getFunctionalStatusResultObservations().isEmpty()) {

				return Boolean.TRUE;
			}
			// TODO Auto-generated method stub
			return super.caseFunctionalStatusSection2(section);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see
		 * org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#casePlanOfCareSection(org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection)
		 */
		@Override
		public Boolean casePlanOfCareSection(PlanOfCareSection section) {

			// if (!section.getPlanOfCareActivityActs().isEmpty()) {
			//
			//
			// section.getPlanOfCareActivityEncounters();
			// section.getPlanOfCareActivityObservations();
			// section.getPlanOfCareActivityProcedures();
			// section.getPlanOfCareActivitySubstanceAdministrations();
			// section.getPlanOfCareActivitySupplies();
			//
			// if (sheet.getPhysicalNumberOfRows() == 0) {
			// Row row1 = null;
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

			return super.casePlanOfCareSection(section);
		}

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
			Set<Observation> sets = new HashSet<Observation>();

			for (Encounter encounter : encounters) {
				ObservationByEncounterPredicate predicate = new ObservationByEncounterPredicate(encounter);

				Collection<Observation> byEncouter = Collections2.filter(observations, predicate);

				for (Observation sa : byEncouter) {

					if (sets.add(sa)) {
						int offset = 0;

						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

						offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

						offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter);

						offset = SpreadsheetSerializer.serializeObservation(row, offset, sa, false);

						SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					}
				}
			}

			for (Observation sa : observations) {

				if (sets.add(sa)) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
					offset = SpreadsheetSerializer.serializeObservation(row, ++offset, sa, false);
					SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
					// serializeFileName(row, offset, fileName);
				}

			}

		}

		private void appendToGoalSheet(Query query2, Sheet sheet2, PatientRole patientRole2, ServiceEvent serviceEvent2,
				EList<? extends Observation> observations, List<Encounter> encounters2, String fileName2) {

			Set<Observation> sets = new HashSet<Observation>();

			for (Encounter encounter : encounters) {

				ObservationByEncounterPredicate predicate = new ObservationByEncounterPredicate(encounter);

				Collection<? extends Observation> byEncouter = Collections2.filter(observations, predicate);

				for (Observation observation : byEncouter) {

					if (sets.add(observation)) {
						// for (Observation observation : organizer.getObservations()) {
						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
						int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
						offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter);
						// offset = serializeOrganizer(row, offset, organizer, false, true);
						offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
						SpreadsheetSerializer.serializeSectionAndFileName(
							row, offset, observation.getSection(), fileName);
						// }

					}

				}
			}

			for (Observation observation : observations) {

				if (sets.add(observation)) {

					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);

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
		 * @param observations
		 * @param encounters2
		 * @param fileName2
		 */
		private void appendToFamilyHistorySheet(Query query2, Sheet sheet2, PatientRole patientRole2,
				ServiceEvent serviceEvent2, List<Organizer> observations, List<Encounter> encounters2,
				String fileName2) {

			Set<Organizer> sets = new HashSet<Organizer>();

			for (Encounter encounter : encounters) {

				OrganizerByEncounterPredicate predicate = new OrganizerByEncounterPredicate(encounter);

				Collection<Organizer> byEncouter = Collections2.filter(observations, predicate);

				for (Organizer organizer : byEncouter) {

					if (sets.add(organizer)) {
						for (Observation observation : organizer.getObservations()) {
							Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
							int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
							offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter);
							offset = SpreadsheetSerializer.serializeOrganizer(row, offset, organizer, false, true);
							offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
							SpreadsheetSerializer.serializeSectionAndFileName(
								row, offset, observation.getSection(), fileName);
						}

					}

				}
			}

			for (Organizer sa : observations) {

				if (sets.add(sa)) {
					for (Observation observation : sa.getObservations()) {
						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
						int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
						offset = SpreadsheetSerializer.serializeOrganizer(row, ++offset, sa, false, true);
						offset = SpreadsheetSerializer.serializeObservation(row, offset, observation);
						SpreadsheetSerializer.serializeSectionAndFileName(
							row, offset, observation.getSection(), fileName);
					}
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

			Set<ProblemConcernAct> sets = new HashSet<ProblemConcernAct>();

			for (Encounter encounter : encounters) {
				ActByEncounterPredicate predicate = new ActByEncounterPredicate(encounter);

				Collection<ProblemConcernAct> byEncouter = Collections2.filter(problemConcerns, predicate);

				for (ProblemConcernAct sa : byEncouter) {

					if (sets.add(sa)) {
						int offset = 0;

						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

						offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

						offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter);

						offset = serializeProblemConcernAct(row, offset, sa);

						SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					}
				}
			}

			for (ProblemConcernAct sa : problemConcerns) {

				if (sets.add(sa)) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
					offset = serializeProblemConcernAct(row, ++offset, sa);
					SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
				}

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
			Set<ProblemObservation> sets = new HashSet<ProblemObservation>();

			for (Encounter encounter : encounters) {
				ObservationByEncounterPredicate predicate = new ObservationByEncounterPredicate(encounter);

				Collection<ProblemObservation> byEncouter = Collections2.filter(problemObservations, predicate);

				for (ProblemObservation sa : byEncouter) {

					if (sets.add(sa)) {
						int offset = 0;

						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

						offset = SpreadsheetSerializer.serializePatient(row, offset, documentMetadata, patientRole);

						offset = SpreadsheetSerializer.serializeEncounterID(row, offset, encounter);

						offset = serializeProblemObservation(row, offset, sa);

						SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					}
				}
			}

			for (ProblemObservation sa : problemObservations) {

				if (sets.add(sa)) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = SpreadsheetSerializer.serializePatient(row, 0, documentMetadata, patientRole);
					offset = serializeProblemObservation(row, ++offset, sa);
					SpreadsheetSerializer.serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
				}

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

	protected static class SigSwitch extends ConsolSwitch<String> {

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

	protected static class SubstanceAdministrationByEncounterPredicate implements Predicate<SubstanceAdministration> {

		Encounter encounter;

		/**
		 * @param encounter
		 */
		public SubstanceAdministrationByEncounterPredicate(Encounter encounter) {
			super();
			this.encounter = encounter;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see com.google.common.base.Predicate#apply(java.lang.Object)
		 */
		@Override
		public boolean apply(SubstanceAdministration medicationActivity) {
			return matchesEncounter(encounter, medicationActivity);
		}

	}

	/**
	 * We'll use this pattern as divider to split the string into an array.
	 * Usage: myString.split(DIVIDER_PATTERN);
	 */
	private static final String DIVIDER_PATTERN = "(?<=[^\\p{Lu}])(?=\\p{Lu})"
	// either there is anything that is not an uppercase character
	// followed by an uppercase character

			+ "|(?<=[\\p{Ll}])(?=\\d)";

	static HashMap<String, String> authors = new HashMap<String, String>();

	static ExtractText extractText = new ExtractText();

	static HashSet<String> names = new HashSet<String>();

	static HashMap<String, String> organizations = new HashMap<String, String>();

	static SigSwitch sigSwitch = new SigSwitch();

	/**
	 * @param file
	 * @return
	 */
	public abstract int getSectionCount(IFile file);

	protected static String sheetName(EClass sectionEClass) {
		String name = sectionEClass.getName();
		String[] prettyName = name.split(DIVIDER_PATTERN); // "(?=\\p{Upper})");
		StringBuilder sb = new StringBuilder();
		for (String str : prettyName) {
			if (StringUtils.isNumeric(str)) {
				sb.append("(V").append(str).append(")");
			} else {
				sb.append(str).append(" ");
			}
		}
		if ("CONSOL".equalsIgnoreCase(sectionEClass.getEPackage().getNsPrefix())) {
			return sb.toString();
		} else {
			return sectionEClass.getEPackage().getNsPrefix().toUpperCase() + " " + sb.toString();
		}

	}

	/**
	 * @param sheet
	 * @return
	 */

	static HashMap<Sheet, CellStyle> documentDateStyles = new HashMap<Sheet, CellStyle>();

	static void handleDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		switch (diagnostic.getSeverity()) {
			case Diagnostic.ERROR:
				handler.handleError(diagnostic);
				break;
			case Diagnostic.WARNING:
				handler.handleWarning(diagnostic);
				break;
			case Diagnostic.INFO:
				handler.handleInfo(diagnostic);
				break;
		}
	}

	static void initAuthorReferences(List<Author> authors, PorO poro) {

		String result = "";
		String authorId = "";

		for (Author a : authors) {

			if (a.getAssignedAuthor() != null) {
				AssignedAuthor aa = a.getAssignedAuthor();

				if (PorO.ORGANIZATION.equals(poro)) {
					if (aa.getRepresentedOrganization() != null) {
						for (ON on : aa.getRepresentedOrganization().getNames()) {
							result = CDAValueUtil.getValues(on);
						}
					}
				}

				if (PorO.PERSON.equals(poro)) {
					if (aa.getAssignedPerson() != null) {
						for (PN pn : aa.getAssignedPerson().getNames()) {
							result = CDAValueUtil.getValues(pn);
						}
					}
				}
			}

			for (II ii : a.getAssignedAuthor().getIds()) {
				authorId = CDAValueUtil.getKey3(ii);
				if (!StringUtils.isEmpty(authorId) && !StringUtils.isEmpty(result)) {
					if (PorO.ORGANIZATION.equals(poro)) {
						GenerateCDABaseHandler.organizations.put(authorId, result);
					} else {
						GenerateCDABaseHandler.authors.put(authorId, result);
					}

				}
			}

		}
	}

	/**
	 *
	 * @TODO Fix with proper date comparison routines
	 * @param encounter
	 * @param date
	 * @return
	 */
	@SuppressWarnings("deprecation")
	static boolean isWithinEncounterDateRate(Encounter encounter, Date date) {

		if (encounter.getEffectiveTime() != null) {
			if (!StringUtils.isEmpty(encounter.getEffectiveTime().getValue())) {

				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getValue());
				if (edate != null) {

					if (edate.compareTo(date) == 0) {
						return true;
					}

					if (edate.getYear() == date.getYear()) {
						if (edate.getMonth() == date.getMonth()) {
							if (edate.getDay() == date.getDay()) {
								return true;
							}
						}
					}
				}
			}

			if (encounter.getEffectiveTime().getLow() != null &&
					!StringUtils.isEmpty(encounter.getEffectiveTime().getLow().getValue())) {
				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getLow().getValue());
				if (edate.getYear() == date.getYear()) {
					if (edate.getMonth() == date.getMonth()) {
						if (edate.getDay() == date.getDay()) {
							return true;
						}

					}
				}

			}

			if (encounter.getEffectiveTime().getHigh() != null &&
					!StringUtils.isEmpty(encounter.getEffectiveTime().getLow().getValue())) {
				Date edate = CDAValueUtil.getDate(encounter.getEffectiveTime().getHigh().getValue());
				if (edate != null && date != null) {
					if (edate.getYear() == date.getYear()) {
						if (edate.getMonth() == date.getMonth()) {
							if (edate.getDay() == date.getDay()) {
								return true;
							}

						}
					}
				}

			}
		}

		return false;
	}

	static boolean matchesEncounter(Encounter encounter, Act act) {

		for (II ii : act.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return true;
				}
			}
		}

		Date observationTime = null;

		if (act.getEffectiveTime() != null) {
			IVL_TS ivlts = act.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : act.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
				}
			}
		}

		if (observationTime != null) {
			return isWithinEncounterDateRate(encounter, observationTime);
		}

		return false;

	}

	/**
	 * @param encounter2
	 * @param organizer
	 * @return
	 */
	static boolean matchesEncounter(Encounter encounter, Organizer organizer) {
		for (II ii : organizer.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return true;
				}
			}
		}

		Date observationTime = null;

		if (organizer.getEffectiveTime() != null) {
			IVL_TS ivlts = organizer.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : organizer.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
				}
			}
		}

		if (observationTime != null) {
			return isWithinEncounterDateRate(encounter, observationTime);
		}

		return false;

	}

	static boolean matchesEncounter(Encounter encounter, Procedure procedure) {

		for (II ii : procedure.getIds()) {
			for (II iii : encounter.getIds()) {
				if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
					return true;
				}
			}
		}

		Date observationTime = null;

		if (procedure.getEffectiveTime() != null) {
			IVL_TS ivlts = procedure.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = CDAValueUtil.getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : procedure.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = CDAValueUtil.getDate(author.getTime().getValue());
				}
			}
		}

		if (observationTime != null) {
			return isWithinEncounterDateRate(encounter, observationTime);
		}

		return false;

	}

	static boolean matchesEncounter(Encounter encounter, SubstanceAdministration item) {

		for (Encounter e : item.getEncounters()) {

			for (II ii : e.getIds()) {
				for (II iii : encounter.getIds()) {
					if (CDAValueUtil.getKey(ii).equals(CDAValueUtil.getKey(iii))) {
						return true;
					}

				}
			}

		}

		Date substanceAdminTime = null;

		for (SXCM_TS ts : item.getEffectiveTimes()) {
			if (ts instanceof IVL_TS) {
				IVL_TS ivlts = (IVL_TS) ts;
				if (ivlts.getLow() != null) {
					if (ivlts.getLow().getValue() != null) {
						substanceAdminTime = CDAValueUtil.getDate(ivlts.getLow().getValue());
					}
				}
			} else {
				if (!StringUtils.isEmpty(ts.getValue())) {
					substanceAdminTime = CDAValueUtil.getDate(ts.getValue());
				}
			}

		}

		if (substanceAdminTime == null) {
			for (Author author : item.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					substanceAdminTime = CDAValueUtil.getDate(author.getTime().getValue());
				}
			}
		}

		if (substanceAdminTime != null) {
			return isWithinEncounterDateRate(encounter, substanceAdminTime);

		}
		return false;
	}

	static void processDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
		Queue<Diagnostic> queue = new LinkedList<Diagnostic>();
		queue.add(diagnostic); // root
		while (!queue.isEmpty()) {
			Diagnostic d = queue.remove();
			if (shouldHandle(d)) {
				handleDiagnostic(d, handler); // visit
			}
			for (Diagnostic childDiagnostic : d.getChildren()) { // process successors
				queue.add(childDiagnostic);
			}
		}
	}

	static boolean shouldHandle(Diagnostic diagnostic) {
		// filter out diagnostics with no message or with root diagnostic message
		if (diagnostic.getMessage() == null || diagnostic.getMessage().startsWith("Diagnosis of")) {
			return false;
		}
		return true;
	}

	protected HashMap<IFile, Exception> errors = new HashMap<IFile, Exception>();

	protected ArrayList<IFile> files = new ArrayList<IFile>();

	//

	/**
	 *
	 */
	public GenerateCDABaseHandler() {
		super();
	}

	void format(String fileLocation, IProgressMonitor monitor) throws IOException {

		// FileInputStream fis = new FileInputStream(fileLocation);

		try (InputStream fis = Files.newInputStream(Paths.get(fileLocation))) {

			monitor.subTask(
				"ReOpening  " + CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + fileLocation.toUpperCase() +
						"_SA.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			monitor.subTask(
				"Opened  " + CDAValueUtil.DATE_FORMAT3.format(new Date()) + "_" + fileLocation.toUpperCase() +
						"_SA.xlsx");
			CellStyle boldstyle = wb.createCellStyle();
			Font boldFont = wb.createFont();
			boldFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
			boldstyle.setFont(boldFont);

			for (int sheetCtr = 0; sheetCtr < wb.getNumberOfSheets(); sheetCtr++) {

				Sheet aSheet = wb.getSheetAt(sheetCtr);
				Row topRow = aSheet.getRow(0);
				if (topRow != null) {
					monitor.subTask("Formating Sheet  " + aSheet.getSheetName());
					int lastcell = topRow.getLastCellNum();
					for (int columnCtr = 0; columnCtr < lastcell; columnCtr++) {
						aSheet.autoSizeColumn(columnCtr);
						if (aSheet.getColumnWidth(columnCtr) > 9999) {
							aSheet.setColumnWidth(columnCtr, 9999);
						}
						// skip section sheet - different formatting
						if (sheetCtr != 1 && topRow.getCell(columnCtr) != null) {
							topRow.getCell(columnCtr).setCellStyle(boldstyle);
						}

					}

				}

			}

			try (OutputStream fileOut = Files.newOutputStream(Paths.get(fileLocation))) {
				wb.write(fileOut);
				fileOut.close();
				wb.close();
			}
		}
	}

}
