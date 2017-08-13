/*******************************************************************************
 * Copyright (c) 2017 seanmuir.
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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.cda.xml.ui.Activator;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Consumable;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.InFulfillmentOf;
import org.eclipse.mdht.uml.cda.InformationRecipient;
import org.eclipse.mdht.uml.cda.ManufacturedProduct;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Patient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Performer2;
import org.eclipse.mdht.uml.cda.Procedure;
import org.eclipse.mdht.uml.cda.ReferenceRange;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.Specimen;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Filter;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.EN;
import org.eclipse.mdht.uml.hl7.datatypes.ENXP;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_PQ;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.ON;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.PQ;
import org.eclipse.mdht.uml.hl7.datatypes.REAL;
import org.eclipse.mdht.uml.hl7.datatypes.SXCM_TS;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch;
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
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDSwitch;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.GoalsSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
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

import com.google.common.base.Predicate;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Collections2;

public class GenerateCDADataHandler extends AbstractHandler {

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
					int sectionCount = 0;
					for (String eclass : sectionbyfile.keySet()) {
						if (sectionbyfile.get(eclass).contains(file)) {
							sectionCount++;
						}
					}
					valueSetsUpdatedItem.setText(new String[] { file.getName(), String.valueOf(sectionCount) });
				}
			}

			return composite;
		}

	}

	static class ActByEncounterPredicate implements Predicate<Act> {

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

	static class C32SectionSwitch extends HITSPSwitch<Boolean> {

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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createAllergyHeader(row1, row2, offset);
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

					int offset = createPatientHeader(row1, row2, 0);
					offset = createEncounterIDHeader(row1, row2, offset);
					offset = createResultsHeader(row1, row2, offset);
					emptySectionOffset.put(sheet, offset);
				}

				appendToResultsSheet(
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createSubstanceAdministrationHeader(row1, row2, offset, "Immunization");
				emptySectionOffset.put(sheet, offset);
			}
			if (section.getSubstanceAdministrations() != null && !section.getSubstanceAdministrations().isEmpty()) {

				appendToSubstanceAdministrationSheet(
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
				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createSubstanceAdministrationHeader(row1, row2, offset, "Medications");
				emptySectionOffset.put(sheet, offset);
			}

			if (section.getMedicationActivities() != null && !section.getMedicationActivities().isEmpty()) {
				appendToSubstanceAdministrationSheet(
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createProblemHeader(row1, row2, offset);
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

					int offset = createPatientHeader(row1, row2, 0);
					offset = createEncounterIDHeader(row1, row2, offset);
					offset = createVitalSignsHeader(row1, row2, offset);
					emptySectionOffset.put(sheet, offset);
				}

				appendToVitalSignsSheet(
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

			int offset = serializePatient(row, 0, documentMetadata, patientRole);

			row.createCell(offset++).setCellValue("NO ENCOUNTER");

			row.createCell(offset++).setCellValue("NO ENTRIES");

			serializeSectionAndFileName(row, emptySectionOffset.get(sheet2) - 3, section, fileName);
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
			Set<AllergyIntoleranceConcern> sets = new HashSet<AllergyIntoleranceConcern>();

			for (Encounter encounter : encounters) {
				ActByEncounterPredicate predicate = new ActByEncounterPredicate(encounter);

				Collection<AllergyIntoleranceConcern> byEncouter = Collections2.filter(sas, predicate);

				for (AllergyIntoleranceConcern sa : byEncouter) {
					if (sets.add(sa)) {
						int offset = 0;

						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

						offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

						offset = serializeEncounterID(row, offset, encounter);

						offset = serializeAllergyProblemAct(row, offset, sa);

						serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					}
				}
			}

			for (AllergyIntoleranceConcern sa : sets) {

				if (sets.add(sa)) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
					offset = serializeAllergyProblemAct(row, ++offset, sa);
					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
					// serializeFileName(row, offset, fileName);
				}

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
		private void appendToProblemsSheet(Query query, Sheet sheet, PatientRole patientRole2,
				ServiceEvent serviceEvent, EList<ProblemConcernEntry> problemConcernEntries, List<Encounter> encounters,
				String fileName2) {

			Set<ProblemConcernEntry> sets = new HashSet<ProblemConcernEntry>();

			for (Encounter encounter : encounters) {
				ActByEncounterPredicate predicate = new ActByEncounterPredicate(encounter);

				Collection<ProblemConcernEntry> byEncouter = Collections2.filter(problemConcernEntries, predicate);

				for (ProblemConcernEntry sa : byEncouter) {
					if (sets.add(sa)) {
						int offset = 0;

						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

						offset = serializePatient(row, offset, documentMetadata, patientRole);

						offset = serializeEncounterID(row, offset, encounter);

						offset = serializeProblemConcernAct(row, offset, sa);

						serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
					}

				}
			}

			for (ProblemConcernEntry sa : problemConcernEntries) {

				if (sets.add(sa)) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, documentMetadata, patientRole);
					offset = serializeProblemConcernAct(row, ++offset, sa);
					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
				}

			}

		}

		/**
		 * @param row
		 * @param offset
		 * @param sa
		 * @return
		 */
		private int serializeAllergyProblemAct(Row row, int offset,
				AllergyIntoleranceConcern allergyIntoleranceConcern) {
			StringBuffer sb = new StringBuffer();

			for (II ii : allergyIntoleranceConcern.getIds()) {
				sb.append(getKey2(ii));
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

				Date d = getDate(getValueAsString(allergyIntolerance.getEffectiveTime()));
				if (d != null) {
					row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
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

				offset = appendCode(
					row, offset, allergyIntoleranceConcern.getSection(), cd, allergyIntolerance.getText());

				CD material = null;

				try {
					material = allergyIntolerance.getParticipants().get(
						0).getParticipantRole().getPlayingEntity().getCode();
				} catch (RuntimeException re) {

				}

				offset = appendCode(row, offset, allergyIntoleranceConcern.getSection(), material, null);

				if (!allergyIntolerance.getProblemEntryReactionObservationContainers().isEmpty()) {
					for (ProblemEntryReactionObservationContainer ro : allergyIntolerance.getProblemEntryReactionObservationContainers()) {

						CD reactionCode = null;

						for (ANY any : ro.getValues()) {
							if (any instanceof CD) {
								reactionCode = (CD) any;
							}
						}
						offset = appendCode(
							row, offset, allergyIntoleranceConcern.getSection(), reactionCode, ro.getText());

						break;
					}
				} else {
					offset = appendCode(row, offset, allergyIntoleranceConcern.getSection(), null, null);
				}

				if (allergyIntolerance.getSeverity() != null) {

					CD severityCode = null;

					for (ANY any : allergyIntolerance.getSeverity().getValues()) {
						if (any instanceof CD) {
							severityCode = (CD) any;
						}
					}
					offset = appendCode(
						row, offset, allergyIntoleranceConcern.getSection(), severityCode,
						allergyIntolerance.getSeverity().getText());

				} else {
					offset = appendCode(row, offset, allergyIntoleranceConcern.getSection(), null, null);
				}
				offset = appendOrganizationAndAuthor(row, offset, allergyIntolerance.getAuthors());

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
				sb.append(getKey2(ii));
			}

			row.createCell(offset++).setCellValue(sb.toString());

			sb = new StringBuffer();

			Date d = getDate(getValueAsString(sa.getEffectiveTime()));
			if (d != null) {
				row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
			} else {
				row.createCell(offset++).setCellValue("");
			}

			offset = appendCode(row, offset, sa.getSection(), sa.getCode(), sa.getText());

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
				sb.append(getKey2(ii));
			}

			// ID
			cell.setCellValue(sb.toString());

			cell = row.createCell(offset++);

			sb = new StringBuffer();
			IVL_TS ivl_ts = problemObservation.getEffectiveTime();

			if (ivl_ts != null) {

				if (ivl_ts.getValue() != null) {
					if (!StringUtils.isEmpty(ivl_ts.getValue())) {

						d = getDate(ivl_ts.getValue());

						;

						sb.append(DATE_PRETTY.format(d));
					}

				}
				if (ivl_ts.getLow() != null) {
					if (!StringUtils.isEmpty(ivl_ts.getLow().getValue())) {

						d = getDate(ivl_ts.getLow().getValue());

						;

						sb.append(DATE_PRETTY.format(d));
					}

				}
				if (ivl_ts.getHigh() != null) {
					if (!StringUtils.isEmpty(ivl_ts.getHigh().getValue())) {

						d = getDate(ivl_ts.getHigh().getValue());
						if (sb.length() > 0) {
							sb.append(" - ");
						}
						sb.append(DATE_PRETTY.format(d));
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
			offset = appendCode(
				row, offset, problemObservation.getSection(), problemCode, problemObservation.getText());

			offset = appendOrganizationAndAuthor(row, offset, problemObservation.getAuthors());

			return offset;

		}

	}

	static class CCDSectionSwitch extends CCDSwitch<Boolean> {
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createProcedureHeader(row1, row2, offset);
				emptySectionOffset.put(sheet, offset);
			}

			if (section.getProcedures() != null && !section.getProcedures().isEmpty()) {

				appendProcedureToProcedureSheet(
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

	static class DocumentMetadata {

		Date documentDate = null;

		String documentLibrary = "";

		String documentOrganization = "";

		String documentSoftware = "";

		String documentType = "";

	}

	static class EncountersFilter implements Filter<Encounter> {

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

	static class ExtractText extends HTMLEditorKit.ParserCallback {

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

	static class FilterAllergyProblemActByEncounter implements Filter<AllergyProblemAct> {

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

	static class FilterAllergyProblemActByServiceEvent implements Filter<AllergyProblemAct> {

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
						if (getKey(ii).equals(getKey(iii))) {
							return true;
						}
					}
				}
			}
			return true;
		}

	}

	static class FilterSubstanceAdminstrationsByEncounter implements Filter<MedicationActivity> {

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

	static class FilterSubstanceAdminstrationsByServiceEvent implements Filter<MedicationActivity> {

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
						if (getKey(ii).equals(getKey(iii))) {
							return true;
						}
					}
				}
			}
			return true;
		}

	}

	static class GetValue extends DatatypesSwitch<String> {

		Section section;

		/**
		 * @param section
		 */
		public GetValue(Section section) {
			super();
			this.section = section;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseCD(org.eclipse.mdht.uml.hl7.datatypes.CD)
		 */
		@Override
		public String caseCD(CD object) {
			return getValueAsString(section, object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseED(org.eclipse.mdht.uml.hl7.datatypes.ED)
		 */
		@Override
		public String caseED(ED object) {
			return org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.getValue(section, object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseII(org.eclipse.mdht.uml.hl7.datatypes.II)
		 */
		@Override
		public String caseII(II object) {
			return org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.getValues(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseON(org.eclipse.mdht.uml.hl7.datatypes.ON)
		 */
		@Override
		public String caseON(ON object) {
			return org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.getValues(object);
		}

		@Override
		public String casePN(PN object) {
			return org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.getValues(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#casePQ(org.eclipse.mdht.uml.hl7.datatypes.PQ)
		 */
		@Override
		public String casePQ(PQ object) {
			return org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.getValue(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseREAL(org.eclipse.mdht.uml.hl7.datatypes.REAL)
		 */
		@Override
		public String caseREAL(REAL object) {
			return org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.getValue(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public String defaultCase(EObject object) {
			return "MISSING GET VALUE FOR" + object.eClass().getName();
		}

	}

	static class ObservationByEncounterPredicate implements Predicate<Observation> {

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
					if (getKey(ii).equals(getKey(iii))) {
						return true;
					}
				}
			}

			Date observationTime = null;

			if (observation.getEffectiveTime() != null) {
				IVL_TS ivlts = observation.getEffectiveTime();
				if (observationTime == null && ivlts.getLow() != null &&
						!StringUtils.isEmpty(ivlts.getLow().getValue())) {
					observationTime = getDate(ivlts.getLow().getValue());
				}

				if (observationTime == null && ivlts.getHigh() != null &&
						!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
					observationTime = getDate(ivlts.getHigh().getValue());
				}
			}

			if (observationTime == null) {
				for (Author author : observation.getAuthors()) {
					if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
						observationTime = getDate(author.getTime().getValue());
					}
				}
			}

			if (observationTime != null) {
				return isWithinEncounterDateRate(encounter, observationTime);
			}

			return false;

		}

	}

	// public class WarningDialog extends TitleAreaDialog {
	//
	// org.eclipse.swt.widgets.Table table;
	//
	// public WarningDialog(Shell shell) {
	// super(shell);
	//
	// }
	//
	// @Override
	// public void create() {
	// super.create();
	// setTitle("Error Creating Excel !!!");
	// }
	//
	// @Override
	// protected void createButtonsForButtonBar(Composite parent) {
	//
	// Button okButton = createButton(parent, OK, "Ok", false);
	//
	// okButton.addSelectionListener(new SelectionAdapter() {
	// @Override
	// public void widgetSelected(SelectionEvent e) {
	// setReturnCode(OK);
	// close();
	// }
	// });
	// }
	//
	// @Override
	// protected Control createDialogArea(Composite parent) {
	//
	// Label label = new Label(parent, SWT.BORDER);
	//
	// label.setText("Unable to Open Excel !!, You must close the workbook !");
	//
	// // final ScrolledComposite composite = new ScrolledComposite(parent, SWT.V_SCROLL);
	// // composite.setLayout(new GridLayout());
	// // composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	// //
	// // table = new org.eclipse.swt.widgets.Table(composite, SWT.BORDER | SWT.MULTI);
	// // table.setHeaderVisible(true);
	// //
	// // table.setSize(100, 100);
	// //
	// // composite.setContent(table);
	// // composite.setExpandHorizontal(true);
	// // composite.setExpandVertical(true);
	// // composite.setAlwaysShowScrollBars(true);
	// // composite.setMinSize(table.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	// //
	// // table.setLinesVisible(true);
	// //
	// // final GridData gridData = new GridData();
	// // gridData.widthHint = 500;
	// // table.setLayoutData(gridData);
	// //
	// // table.setHeaderVisible(true);
	// // final TableColumn column1 = new TableColumn(table, SWT.LEFT);
	// //
	// // final TableColumn column2 = new TableColumn(table, SWT.LEFT);
	// //
	// // column1.setText("File Name");
	// // column2.setText("Total Sections");
	// //
	// // column1.setWidth(250);
	// // column2.setWidth(250);
	// //
	// // for (IFile file : files) {
	// // int sectionCount = 0;
	// //
	// // for (EClass eclass : sectionbyfile.keySet()) {
	// // if (sectionbyfile.get(eclass).contains(file)) {
	// // sectionCount++;
	// // }
	// // }
	// //
	// // final TableItem valueSetsUpdatedItem = new TableItem(table, SWT.NONE);
	// // valueSetsUpdatedItem.setText(new String[] { file.getName(), String.valueOf(sectionCount) });
	// // }
	//
	// return parent;
	// }
	//
	// }

	static class OrganizerByEncounterPredicate implements Predicate<Organizer> {

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

	enum PorO {
		ORGANIZATION, PERSON

	}

	static class ProcedureByEncounterPredicate implements Predicate<Procedure> {

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

	static class SectionSwitch extends ConsolSwitch<Boolean> {

		static HashMap<Sheet, Integer> emptySectionOffset = new HashMap<Sheet, Integer>();

		static int serializeProblemObservation(Row row, int offset, ProblemObservation problemObservation) {
			Cell cell = row.createCell(offset++);

			StringBuffer sb = new StringBuffer();
			Date d;
			for (II ii : problemObservation.getIds()) {
				sb.append(getKey2(ii));
			}

			// ID
			cell.setCellValue(sb.toString());

			cell = row.createCell(offset++);

			sb = new StringBuffer();
			IVL_TS ivl_ts = problemObservation.getEffectiveTime();

			if (ivl_ts != null) {

				if (ivl_ts.getValue() != null) {
					if (!StringUtils.isEmpty(ivl_ts.getValue())) {

						d = getDate(ivl_ts.getValue());

						;

						sb.append(DATE_PRETTY.format(d));
					}

				}
				if (ivl_ts.getLow() != null) {
					if (!StringUtils.isEmpty(ivl_ts.getLow().getValue())) {

						d = getDate(ivl_ts.getLow().getValue());

						;

						sb.append(DATE_PRETTY.format(d));
					}

				}
				if (ivl_ts.getHigh() != null) {
					if (!StringUtils.isEmpty(ivl_ts.getHigh().getValue())) {

						d = getDate(ivl_ts.getHigh().getValue());
						if (sb.length() > 0) {
							sb.append(" - ");
						}
						sb.append(DATE_PRETTY.format(d));
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
			offset = appendCode(
				row, offset, problemObservation.getSection(), problemCode, problemObservation.getText());

			offset = appendOrganizationAndAuthor(row, offset, problemObservation.getAuthors());

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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createAllergyHeader(row1, row2, offset);
				emptySectionOffset.put(sheet, offset);
			}
			if (section.getAllergyProblemActs() != null && !section.getAllergyProblemActs().isEmpty()) {
				appendToAllergiesSheet(
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createProblemObservationHeader(row1, row2, offset);
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createSubstanceAdministrationHeader(row1, row2, offset, "Immunization");
				emptySectionOffset.put(sheet, offset);
			}
			if (section.getImmunizationActivities() != null && !section.getImmunizationActivities().isEmpty()) {

				appendToSubstanceAdministrationSheet(
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
				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createSubstanceAdministrationHeader(row1, row2, offset, "Medications");
				emptySectionOffset.put(sheet, offset);
			}

			if (section.getMedicationActivities() != null && !section.getMedicationActivities().isEmpty()) {
				appendToSubstanceAdministrationSheet(
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
				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createSubstanceAdministrationHeader(row1, row2, offset, "Medications");
				emptySectionOffset.put(sheet, offset);
			}

			if (section.getMedicationActivities() != null && !section.getMedicationActivities().isEmpty()) {
				appendToSubstanceAdministrationSheet(
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createProblemHeader(row1, row2, offset);
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createProcedureHeader(row1, row2, offset);
				emptySectionOffset.put(sheet, offset);
			}
			if (section.getProcedureActivityActs() != null && !section.getProcedureActivityActs().isEmpty()) {

				appendActToProcedureSheet(
					query, sheet, documentMetadata, patientRole, serviceEvent, section.getActs(), encounters, fileName);

			}

			if (section.getProcedureActivityObservations() != null &&
					!section.getProcedureActivityObservations().isEmpty()) {

				appendObservationToProcedureSheet(
					query, sheet, documentMetadata, patientRole, serviceEvent,
					section.getProcedureActivityObservations(), encounters, fileName);

			}

			if (section.getProcedureActivityProcedures() != null &&
					!section.getProcedureActivityProcedures().isEmpty()) {

				appendProcedureToProcedureSheet(
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

					int offset = createPatientHeader(row1, row2, 0);
					offset = createEncounterIDHeader(row1, row2, offset);
					offset = createResultsHeader(row1, row2, offset);
					emptySectionOffset.put(sheet, offset);
				}

				appendToResultsSheet(
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

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createSocialHistoryHeader(row1, row2, offset);
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

					int offset = createPatientHeader(row1, row2, 0);
					offset = createEncounterIDHeader(row1, row2, offset);
					offset = createVitalSignsHeader(row1, row2, offset);
					emptySectionOffset.put(sheet, offset);
				}

				appendToVitalSignsSheet(
					query, sheet, documentMetadata, patientRole, serviceEvent, section.getOrganizers(), encounters,
					fileName);
				return Boolean.TRUE;

			}
			return super.caseVitalSignsSectionEntriesOptional(section);
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

			int offset = serializePatient(row, 0, documentMetadata, patientRole);

			row.createCell(offset++).setCellValue("NO ENCOUNTER");

			row.createCell(offset++).setCellValue("NO ENTRIES");

			serializeSectionAndFileName(row, emptySectionOffset.get(sheet2) - 3, section, fileName);
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

						offset = serializePatient(row, offset, documentMetadata, patientRole);

						offset = serializeEncounterID(row, offset, encounter);

						offset = serializeObservation(row, offset, sa, false);

						serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					}
				}
			}

			for (Observation sa : observations) {

				if (sets.add(sa)) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, documentMetadata, patientRole);
					offset = serializeObservation(row, ++offset, sa, false);
					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
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
						int offset = serializePatient(row, 0, documentMetadata, patientRole);
						offset = serializeEncounterID(row, offset, encounter);
						// offset = serializeOrganizer(row, offset, organizer, false, true);
						offset = serializeObservation(row, offset, observation);
						serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
						// }

					}

				}
			}

			for (Observation observation : observations) {

				if (sets.add(observation)) {

					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, documentMetadata, patientRole);

					offset = serializeObservation(row, offset, observation);
					serializeSectionAndFileName(row, offset, observation.getSection(), fileName);

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
							int offset = serializePatient(row, 0, documentMetadata, patientRole);
							offset = serializeEncounterID(row, offset, encounter);
							offset = serializeOrganizer(row, offset, organizer, false, true);
							offset = serializeObservation(row, offset, observation);
							serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
						}

					}

				}
			}

			for (Organizer sa : observations) {

				if (sets.add(sa)) {
					for (Observation observation : sa.getObservations()) {
						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
						int offset = serializePatient(row, 0, documentMetadata, patientRole);
						offset = serializeOrganizer(row, ++offset, sa, false, true);
						offset = serializeObservation(row, offset, observation);
						serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
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

						offset = serializePatient(row, offset, documentMetadata, patientRole);

						offset = serializeEncounterID(row, offset, encounter);

						offset = serializeProblemConcernAct(row, offset, sa);

						serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					}
				}
			}

			// if (serviceEvent != null) {
			// FilterAllergyProblemActByServiceEvent filter = new FilterAllergyProblemActByServiceEvent(serviceEvent);
			// // List<AllergyProblemAct> xxx = query.getEObjects(AllergyProblemAct.class, filter);
			//
			// for (ProblemConcernAct sa : problemConcerns) {
			//
			// if (!problemConcerns.contains(sa)) {
			//
			// int offset = 0;
			//
			// Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			//
			// offset = serializePatient(row, offset, documentMetadata,patientRole);
			//
			// offset = serializeServiceEvent(row, offset, serviceEvent);
			//
			// offset = serializeProblemConcernAct(row, offset, sa);
			//
			// serializeFileName(row, offset, fileName);
			// sets.add(sa);
			// // sas.remove(sa);
			// }
			// }
			//
			// }
			for (ProblemConcernAct sa : problemConcerns) {

				if (sets.add(sa)) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, documentMetadata, patientRole);
					offset = serializeProblemConcernAct(row, ++offset, sa);
					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
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

						offset = serializePatient(row, offset, documentMetadata, patientRole);

						offset = serializeEncounterID(row, offset, encounter);

						offset = serializeProblemObservation(row, offset, sa);

						serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					}
				}
			}

			// if (serviceEvent != null) {
			// FilterAllergyProblemActByServiceEvent filter = new FilterAllergyProblemActByServiceEvent(serviceEvent);
			// // List<AllergyProblemAct> xxx = query.getEObjects(AllergyProblemAct.class, filter);
			//
			// for (ProblemConcernAct sa : problemConcerns) {
			//
			// if (!problemConcerns.contains(sa)) {
			//
			// int offset = 0;
			//
			// Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			//
			// offset = serializePatient(row, offset, documentMetadata,patientRole);
			//
			// offset = serializeServiceEvent(row, offset, serviceEvent);
			//
			// offset = serializeProblemConcernAct(row, offset, sa);
			//
			// serializeFileName(row, offset, fileName);
			// sets.add(sa);
			// // sas.remove(sa);
			// }
			// }
			//
			// }
			for (ProblemObservation sa : problemObservations) {

				if (sets.add(sa)) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, documentMetadata, patientRole);
					offset = serializeProblemObservation(row, ++offset, sa);
					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
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
			offset = addCodeHeader(row2, offset, "Description");
			row2.createCell(offset++).setCellValue("Organization");
			row2.createCell(offset++).setCellValue("Author");
			row2.createCell(offset++).setCellValue("Observation ID");
			row2.createCell(offset++).setCellValue("Date");
			offset = addCodeHeader(row2, offset, "Value");
			offset = addSectionHeader(row2, offset);
			return offset;
		}

		private int createGoalsSectionHeader(Row row1, Row row2, int offset) {
			// row2.createCell(offset++).setCellValue("Organizer ID");
			// row2.createCell(offset++).setCellValue("Date");
			offset = addCodeHeader(row2, offset, "Description");
			row2.createCell(offset++).setCellValue("Organization");
			row2.createCell(offset++).setCellValue("Author");
			row2.createCell(offset++).setCellValue("Observation ID");
			row2.createCell(offset++).setCellValue("Date");
			offset = addCodeHeader(row2, offset, "Value");
			offset = addSectionHeader(row2, offset);
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
				sb.append(getKey2(ii));
			}

			row.createCell(offset++).setCellValue(sb.toString());

			sb = new StringBuffer();

			Date d = getDate(getValueAsString(problemConcernAct.getEffectiveTime()));
			if (d != null) {
				row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
			} else {
				row.createCell(offset++).setCellValue("");
			}

			offset = appendCode(
				row, offset, problemConcernAct.getSection(), problemConcernAct.getCode(), problemConcernAct.getText());

			for (ProblemObservation problemObservation : problemConcernAct.getProblemObservations()) {
				serializeProblemObservation(row, offset, problemObservation);
				break;
			}

			return offset;
		}

	}

	static class SigSwitch extends ConsolSwitch<String> {

		/*
		 * (non-Javadoc)
		 *
		 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseMedicationActivity(org.openhealthtools.mdht.uml.cda.consol.
		 * MedicationActivity)
		 */
		@Override
		public String caseMedicationActivity(MedicationActivity medicationActivity) {

			String result = getValue(medicationActivity.getSection(), medicationActivity.getText());

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
				String result = getValue(medicationActivity.getSection(), mfts.getText());

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

	static class SubstanceAdministrationByEncounterPredicate implements Predicate<SubstanceAdministration> {

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
	private static final String DIVIDER_PATTERN =

			"(?<=[^\\p{Lu}])(?=\\p{Lu})"
			// either there is anything that is not an uppercase character
			// followed by an uppercase character

					+ "|(?<=[\\p{Ll}])(?=\\d)"
	// or there is a lowercase character followed by a digit

	;

	static HashMap<String, String> authors = new HashMap<String, String>();

	static final SimpleDateFormat DATE_FORMAT1 = new SimpleDateFormat("yyyy");

	static final SimpleDateFormat DATE_FORMAT10 = new SimpleDateFormat("yyyyMMddHHmmZ");

	static final SimpleDateFormat DATE_FORMAT11 = new SimpleDateFormat("yyyyMMddHHmmssZ");

	static final SimpleDateFormat DATE_FORMAT12 = new SimpleDateFormat("yyyyMMddHHmmssSSSZ");

	static final SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("yyyyMM");

	static final SimpleDateFormat DATE_FORMAT3 = new SimpleDateFormat("yyyyMMdd");

	static final SimpleDateFormat DATE_FORMAT4 = new SimpleDateFormat("yyyyMMdd");

	static final SimpleDateFormat DATE_FORMAT5 = new SimpleDateFormat("yyyyMMddHH");

	static final SimpleDateFormat DATE_FORMAT6 = new SimpleDateFormat("yyyyMMddHHmm");

	static final SimpleDateFormat DATE_FORMAT7 = new SimpleDateFormat("yyyyMMddHHmmss");

	static final SimpleDateFormat DATE_FORMAT8 = new SimpleDateFormat("yyyyMMddHHmmssSSS");

	static final SimpleDateFormat DATE_FORMAT9 = new SimpleDateFormat("yyyyMMddHHZ");

	static final SimpleDateFormat DATE_PRETTY = new SimpleDateFormat("MM/dd/yyyy");

	static ExtractText extractText = new ExtractText();

	static HashSet<String> names = new HashSet<String>();

	static HashMap<String, String> organizations = new HashMap<String, String>();;

	static SigSwitch sigSwitch = new SigSwitch();

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 */
	public static int createVitalSignsHeader(Row row1, Row row2, int offset) {

		row2.createCell(offset++).setCellValue("Panel ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Panel");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("Vital Sign ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Vital Sign");
		row2.createCell(offset++).setCellValue("Result");
		row2.createCell(offset++).setCellValue("Range");
		offset = addSectionHeader(row2, offset);
		return offset;

	}

	/**
	 * @param object
	 * @return
	 */
	public static String getValue(REAL real) {
		StringBuffer sb = new StringBuffer();

		if (real != null) {
			if (real.getValue() != null) {
				sb.append(real.getValue().toPlainString() + " ");
			}
		}
		return sb.toString();
	};

	public static String getValues(EN pn) {

		if (pn.getText() != null && pn.getText().trim().length() > 0) {
			names.add(pn.getText());
			return pn.getText();
		}

		StringBuffer b = new StringBuffer();

		for (ENXP e : pn.getPrefixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getGivens()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getFamilies()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getSuffixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		return b.toString();

	};

	/**
	 * @param query2
	 * @param sheet2
	 * @param patientRole2
	 * @param serviceEvent2
	 * @param vitalSignsOrganizers
	 * @param encounters2
	 * @param fileName2
	 */
	private static void appendToVitalSignsSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Organizer> vitalSignsOrganizers,
			List<Encounter> encounters, String fileName) {

		Set<Organizer> sets = new HashSet<Organizer>();

		for (Encounter encounter : encounters) {

			OrganizerByEncounterPredicate predicate = new OrganizerByEncounterPredicate(encounter);

			Collection<Organizer> byEncouter = Collections2.filter(vitalSignsOrganizers, predicate);

			for (Organizer organizer : byEncouter) {
				if (sets.add(organizer)) {
					for (Observation observation : organizer.getObservations()) {
						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
						int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
						offset = serializeEncounterID(row, offset, encounter);
						offset = serializeOrganizer(row, offset, organizer, false, false);
						offset = serializeObservation(row, offset, observation);
						serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
					}

				}

			}
		}

		for (Organizer sa : vitalSignsOrganizers) {

			if (sets.add(sa)) {
				for (Observation observation : sa.getObservations()) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
					offset = serializeOrganizer(row, ++offset, sa, false, false);
					offset = serializeObservation(row, offset, observation);
					serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
				}
			}

		}

	}

	private static int createProblemHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Problem");
		offset = createProblemObservationHeader(row1, row2, offset);
		return offset;

	}

	private static int createProblemObservationHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Problem");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);
		return offset;

	}

	private static String sheetName(Section section) {
		String name = section.eClass().getName();
		String[] prettyName = name.split(DIVIDER_PATTERN); // "(?=\\p{Upper})");
		StringBuilder sb = new StringBuilder();
		for (String str : prettyName) {
			if (StringUtils.isNumeric(str)) {
				sb.append("(V").append(str).append(")");
			} else {
				sb.append(str).append(" ");
			}
		}
		if ("CONSOL".equalsIgnoreCase(section.eClass().getEPackage().getNsPrefix())) {
			return sb.toString();
		} else {
			return section.eClass().getEPackage().getNsPrefix().toUpperCase() + " " + sb.toString();
		}

	}

	static int addCodeHeader(Row row1, int offset, String prefix) {
		row1.createCell(offset++).setCellValue(prefix + " Text");
		row1.createCell(offset++).setCellValue("Display Name");
		row1.createCell(offset++).setCellValue("Code");
		row1.getSheet().setColumnHidden(offset - 1, true);
		row1.createCell(offset++).setCellValue("Code System");
		row1.getSheet().setColumnHidden(offset - 1, true);
		row1.createCell(offset++).setCellValue("Code System Name");
		row1.getSheet().setColumnHidden(offset - 1, true);
		return offset;
	}

	static int addSectionHeader(Row row1, int offset) {
		row1.createCell(offset++).setCellValue("Section Title");
		row1.createCell(offset++).setCellValue("File Name");
		row1.createCell(offset++).setCellValue("Narrative");

		return offset;
	};

	/**
	 * @param query
	 * @param sheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param procedureActivityActs
	 * @param encounters
	 * @param fileName
	 */
	static void appendActToProcedureSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, EList<Act> procedureActivityActs,
			List<Encounter> encounters, String fileName) {

		Set<Act> sets = new HashSet<Act>();

		for (Encounter encounter : encounters) {
			ActByEncounterPredicate predicate = new ActByEncounterPredicate(encounter);

			Collection<Act> byEncouter = Collections2.filter(procedureActivityActs, predicate);

			for (Act sa : byEncouter) {

				if (sets.add(sa)) {
					int offset = 0;

					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeProcedureActivityAct(row, offset, sa);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				}
			}
		}

		// if (serviceEvent != null) {
		// FilterAllergyProblemActByServiceEvent filter = new FilterAllergyProblemActByServiceEvent(serviceEvent);
		// // List<AllergyProblemAct> xxx = query.getEObjects(AllergyProblemAct.class, filter);
		//
		// for (ProblemConcernAct sa : problemConcerns) {
		//
		// if (!problemConcerns.contains(sa)) {
		//
		// int offset = 0;
		//
		// Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
		//
		// offset = serializePatient(row, offset, documentMetadata,patientRole);
		//
		// offset = serializeServiceEvent(row, offset, serviceEvent);
		//
		// offset = serializeProblemConcernAct(row, offset, sa);
		//
		// serializeFileName(row, offset, fileName);
		// sets.add(sa);
		// // sas.remove(sa);
		// }
		// }
		//
		// }
		for (Act sa : procedureActivityActs) {

			if (sets.add(sa)) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
				offset = serializeProcedureActivityAct(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			}

		}

	}

	static int appendCode(Row row, int offset, Section setion, CD cd, ED ed) {

		if (cd != null) {
			// Text
			row.createCell(offset++).setCellValue(getValue(setion, ed));
			// Display Name
			row.createCell(offset++).setCellValue(getValueAsString(setion, cd));
			// Code
			row.createCell(offset++).setCellValue(cd.getCode());
			// Code System
			row.createCell(offset++).setCellValue(cd.getCodeSystem());
			// Code System Name
			row.createCell(offset++).setCellValue(cd.getCodeSystemName());
		} else {
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");

		}

		return offset;
	}

	/**
	 * @param query
	 * @param sheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param procedureActivityObservations
	 * @param encounters
	 * @param fileName
	 */
	static void appendObservationToProcedureSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent,
			EList<ProcedureActivityObservation> procedureActivityObservations, List<Encounter> encounters,
			String fileName) {

		Set<ProcedureActivityObservation> sets = new HashSet<ProcedureActivityObservation>();

		for (Encounter encounter : encounters) {
			ObservationByEncounterPredicate predicate = new ObservationByEncounterPredicate(encounter);

			Collection<ProcedureActivityObservation> byEncouter = Collections2.filter(
				procedureActivityObservations, predicate);

			for (ProcedureActivityObservation sa : byEncouter) {

				if (sets.add(sa)) {
					int offset = 0;

					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeProcedureActivityObservation(row, offset, sa);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				}
			}
		}

		for (ProcedureActivityObservation sa : procedureActivityObservations) {

			if (sets.add(sa)) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
				offset = serializeProcedureActivityObservation(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			}

		}

	}

	static int appendOrganizationAndAuthor(Row row, int offset, EList<Author> authors) {
		String organization = getValue(authors, PorO.ORGANIZATION);
		String person = getValue(authors, PorO.PERSON);
		row.createCell(offset++).setCellValue(organization);
		row.createCell(offset++).setCellValue(person);
		return offset;
	}

	/**
	 * @param query
	 * @param sheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param procedureActivityProcedures
	 * @param encounters
	 * @param fileName
	 */
	static void appendProcedureToProcedureSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, EList<Procedure> procedureActivityProcedures,
			List<Encounter> encounters, String fileName) {
		Set<Procedure> sets = new HashSet<Procedure>();

		for (Encounter encounter : encounters) {
			ProcedureByEncounterPredicate predicate = new ProcedureByEncounterPredicate(encounter);

			Collection<Procedure> byEncouter = Collections2.filter(procedureActivityProcedures, predicate);

			for (Procedure sa : byEncouter) {

				if (sets.add(sa)) {
					int offset = 0;

					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeProcedureActivityProcedure(row, offset, sa);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				}
			}
		}

		for (Procedure sa : procedureActivityProcedures) {

			if (sets.add(sa)) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
				offset = serializeProcedureActivityProcedure(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			}

		}

	};

	/**
	 * @param query
	 * @param substanceAdministrationsSheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param name
	 */

	static void appendToAllergiesSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {

		List<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sas = query.getEObjects(
			org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct.class);

		appendToAllergiesSheet(
			query, sheet, organizationAndSoftware, patientRole, serviceEvent, sas, encounters, fileName);
	}

	static void appendToAllergiesSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent,
			List<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sas, List<Encounter> encounters,
			String fileName) {

		Set<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sets = new HashSet<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct>();

		for (Encounter encounter : encounters) {
			ActByEncounterPredicate predicate = new ActByEncounterPredicate(encounter);

			Collection<AllergyProblemAct> byEncouter = Collections2.filter(sas, predicate);

			for (AllergyProblemAct sa : byEncouter) {

				if (sets.add(sa)) {
					int offset = 0;

					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeAllergyProblemAct(row, offset, sa);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				}
			}
		}

		// if (serviceEvent != null) {
		// FilterAllergyProblemActByServiceEvent filter = new FilterAllergyProblemActByServiceEvent(serviceEvent);
		// // List<AllergyProblemAct> xxx = query.getEObjects(AllergyProblemAct.class, filter);
		//
		// for (AllergyProblemAct sa : sas) {
		//
		// if (!sas.contains(sa)) {
		//
		// int offset = 0;
		//
		// Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
		//
		// offset = serializePatient(row, offset, documentMetadata,patientRole);
		//
		// offset = serializeServiceEvent(row, offset, serviceEvent);
		//
		// offset = serializeAllergyProblemAct(row, offset, sa);
		//
		// serializeFileName(row, offset, fileName);
		// sets.add(sa);
		// // sas.remove(sa);
		// }
		// }
		//
		// }
		for (AllergyProblemAct sa : sas) {

			if (sets.add(sa)) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
				offset = serializeAllergyProblemAct(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
				// serializeFileName(row, offset, fileName);
			}

		}

	};

	/**
	 * @param wb
	 * @param patientRole
	 * @param encounters
	 */
	static void appendToEncounterSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, List<Encounter> encounters, String fileName) {

		for (Encounter encoutner : encounters) {

			if (encoutner.getEffectiveTime() != null) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
				offset = serializeEncounter(row, offset, encoutner);
				serializeSectionAndFileName(row, offset, encoutner.getSection(), fileName);
			}
		}
	}

	static DocumentMetadata appendToPatientSheet(Query query, Sheet sheet, PatientRole patientRole,
			InformationRecipient ir, InFulfillmentOf iffo, String fileName) {

		DocumentMetadata documentMetadata = new DocumentMetadata();
		Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		int offset = serializePatient(row, 0, patientRole);

		ClinicalDocument cd = query.getEObject(ClinicalDocument.class);

		// Date documentDate = null;
		if (cd.getEffectiveTime() != null && !StringUtils.isEmpty(cd.getEffectiveTime().getValue())) {
			documentMetadata.documentDate = getDate(cd.getEffectiveTime().getValue()); // documentDate = DATE_FORMAT12.format(date);
		}

		if (cd instanceof GeneralHeaderConstraints) {
			documentMetadata.documentLibrary = "C-CDA";
			row.createCell(offset++).setCellValue("C-CDA");
		} else {
			documentMetadata.documentLibrary = "C32";
			row.createCell(offset++).setCellValue("C32");
		}

		if (cd != null && cd.getCode() != null) {
			documentMetadata.documentType = cd.getCode().getDisplayName();
			row.createCell(offset++).setCellValue(cd.getCode().getDisplayName());
		} else {
			documentMetadata.documentType = "MISSING";
			row.createCell(offset++).setCellValue("");
		}

		// String documentOrganization = "";
		// String documentSoftware = "";
		if (!cd.getAuthors().isEmpty()) {

			for (Author a : cd.getAuthors()) {
				if (a.getAssignedAuthor() != null) {
					AssignedAuthor aa = a.getAssignedAuthor();
					if (aa.getRepresentedOrganization() != null) {
						for (ON on : aa.getRepresentedOrganization().getNames()) {
							documentMetadata.documentOrganization = getValues(on);
						}
					}

					if (aa.getAssignedAuthoringDevice() != null) {
						if (aa.getAssignedAuthoringDevice().getManufacturerModelName() != null) {
							documentMetadata.documentSoftware = aa.getAssignedAuthoringDevice().getManufacturerModelName().getText();
						}
						if (aa.getAssignedAuthoringDevice().getSoftwareName() != null) {
							documentMetadata.documentSoftware = documentMetadata.documentSoftware + " " +
									aa.getAssignedAuthoringDevice().getSoftwareName().getText();
						}
					}
				}

			}

		}

		// serviceEvent.get

		row.createCell(offset++).setCellValue(documentMetadata.documentOrganization);

		row.createCell(offset++).setCellValue(documentMetadata.documentSoftware);

		if (documentMetadata.documentDate != null) {

			Cell cell = row.createCell(offset++);

			cell.setCellStyle(getDocumentDateStyle(sheet));
			cell.setCellValue(documentMetadata.documentDate);
		} else {
			row.createCell(offset++);
		}

		String name1 = "";
		String name2 = "";
		if (ir != null && ir.getIntendedRecipient() != null) {
			if (ir.getIntendedRecipient().getInformationRecipient() != null) {
				for (PN pn : ir.getIntendedRecipient().getInformationRecipient().getNames()) {
					name1 = getAnyValue(null, pn);
					break;
				}
				if (ir.getIntendedRecipient() != null && ir.getIntendedRecipient().getReceivedOrganization() != null &&
						ir.getIntendedRecipient().getReceivedOrganization().getNames() != null) {
					for (ON on : ir.getIntendedRecipient().getReceivedOrganization().getNames()) {
						name2 = getAnyValue(null, on);
						break;
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(name1);
		row.createCell(offset++).setCellValue(name2);

		String orderId = "";
		if (iffo != null && iffo.getOrder() != null) {
			for (II ii : iffo.getOrder().getIds()) {
				orderId = getAnyValue(null, ii);
			}

		}

		row.createCell(offset++).setCellValue(orderId);

		serializeSectionAndFileName(row, offset, null, fileName);

		return documentMetadata;
	};

	/**
	 * @param sheet
	 * @return
	 */
	static CellStyle documentDateStyle;

	private static CellStyle getDocumentDateStyle(Sheet sheet) {
		if (documentDateStyle == null) {
			documentDateStyle = sheet.getWorkbook().createCellStyle();
			CreationHelper createHelper = sheet.getWorkbook().getCreationHelper();
			documentDateStyle.setDataFormat(createHelper.createDataFormat().getFormat("mm/dd/yyyy hh:mm AM/PM"));
		}

		return documentDateStyle;
	}

	static void appendToResultsSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<? extends Organizer> results,
			List<Encounter> encounters, String fileName) {

		Set<Organizer> sets = new HashSet<Organizer>();

		for (Encounter encounter : encounters) {
			OrganizerByEncounterPredicate predicate = new OrganizerByEncounterPredicate(encounter);

			Collection<? extends Organizer> byEncouter = Collections2.filter(results, predicate);

			for (Organizer sa : byEncouter) {

				if (sets.add(sa)) {
					for (Observation resultObservation : sa.getObservations()) {

						int offset = 0;

						Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

						offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

						offset = serializeEncounterID(row, offset, encounter);

						offset = serializeOrganizer(row, offset, sa, true, false);

						offset = serializeObservation(row, offset, resultObservation);

						serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					}

				}
			}
		}

		// if (serviceEvent != null) {
		// FilterAllergyProblemActByServiceEvent filter = new FilterAllergyProblemActByServiceEvent(serviceEvent);
		// // List<AllergyProblemAct> xxx = query.getEObjects(AllergyProblemAct.class, filter);
		//
		// for (AllergyProblemAct sa : results) {
		//
		// if (!results.contains(sa)) {
		//
		// int offset = 0;
		//
		// Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
		//
		// offset = serializePatient(row, offset, documentMetadata,patientRole);
		//
		// offset = serializeServiceEvent(row, offset, serviceEvent);
		//
		// offset = serializeAllergyProblemAct(row, offset, sa);
		//
		// serializeFileName(row, offset, fileName);
		// sets.add(sa);
		// // sas.remove(sa);
		// }
		// }
		//
		// }
		for (Organizer sa : results) {

			if (sets.add(sa)) {
				for (Observation resultObservation : sa.getObservations()) {
					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);
					offset = serializeOrganizer(row, ++offset, sa, true, false);
					offset = serializeObservation(row, offset, resultObservation);
					serializeSectionAndFileName(row, offset, resultObservation.getSection(), fileName);
				}
			}

		}

	};

	/**
	 * @param wb
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param fileName
	 */
	// org.openhealthtools.mdht.uml.cda.consol.MedicationActivity
	static void appendToSubstanceAdministrationSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters,
			List<? extends SubstanceAdministration> sas, String fileName) {

		Set<SubstanceAdministration> sets = new HashSet<SubstanceAdministration>();

		for (Encounter encounter : encounters) {
			SubstanceAdministrationByEncounterPredicate predicate = new SubstanceAdministrationByEncounterPredicate(
				encounter);

			@SuppressWarnings("unchecked")
			Collection<SubstanceAdministration> byEncouter = (Collection<SubstanceAdministration>) Collections2.filter(
				sas, predicate);

			for (SubstanceAdministration sa : byEncouter) {

				if (sets.add(sa)) {
					int offset = 0;

					Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, organizationAndSoftware, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeSubstanceAdministration(row, offset, sa);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				}
			}
		}

		// if (serviceEvent != null) {
		// FilterSubstanceAdminstrationsByServiceEvent filter = new FilterSubstanceAdminstrationsByServiceEvent(
		// serviceEvent);
		// // List<MedicationActivity> xxx = query.getEObjects(MedicationActivity.class, filter);
		//
		// for (SubstanceAdministration sa : sas) {
		//
		// if (!sas.contains(sa)) {
		//
		// int offset = 0;
		//
		// Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());
		//
		// offset = serializePatient(row, offset, documentMetadata,patientRole);
		//
		// offset = serializeServiceEvent(row, offset, serviceEvent);
		//
		// offset = serializeSubstanceAdministration(row, offset, sa);
		//
		// serializeFileName(row, offset, fileName);
		//
		// sets.add(sa);
		// }
		// }
		//
		// }
		for (SubstanceAdministration sa : sas) {

			if (sets.add(sa)) {
				Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

				int offset = serializePatient(row, 0, organizationAndSoftware, patientRole);

				row.createCell(offset++).setCellValue("NO ENCOUNTER");

				offset = serializeSubstanceAdministration(row, offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			}

		}

	};

	static void appendToSubstanceAdministrationSheet(Query query, Sheet sheet, DocumentMetadata organizationAndSoftware,
			PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {

		// Because we were getting class cast exception - copy results to EList
		EList<SubstanceAdministration> elist = new BasicEList<SubstanceAdministration>();

		elist.addAll(query.getEObjects(org.openhealthtools.mdht.uml.cda.consol.MedicationActivity.class));

		appendToSubstanceAdministrationSheet(
			query, sheet, organizationAndSoftware, patientRole, serviceEvent, encounters, elist, fileName);

	}

	static int createAllergyHeader(Row row1, Row row2, int offset) {
		// All Des Verify Date Event Type Reaction Severity Source
		// int firstColumn = offset;
		// undo to go back to two rows for headers // undo to go back to two rows for headers row1.createCell(firstColumn).setCellValue("Allergy");
		row2.createCell(offset++).setCellValue("Allergy ID");
		row2.createCell(offset++).setCellValue("Status");
		row2.createCell(offset++).setCellValue("Verify Date");
		row2.createCell(offset++).setCellValue("No Known Flag");
		offset = addCodeHeader(row2, offset, "Allergy ");
		offset = addCodeHeader(row2, offset, "Substance ");
		offset = addCodeHeader(row2, offset, "Reaction ");
		offset = addCodeHeader(row2, offset, "Severity ");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);
		// undo to go back to two rows for headers // undo to go back to two rows for headers row1.getSheet().addMergedRegion(new CellRangeAddress(0,
		// 0, firstColumn, offset));

		return offset;
	}

	static int createDocumentMedadataHeadder(Row row2, int offset) {
		row2.createCell(offset++).setCellValue("CDA Specification");
		row2.createCell(offset++).setCellValue("CDA Document Type");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Software");
		row2.createCell(offset++).setCellValue("Document Date");
		return offset;
	}

	static int createEncounterHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Encounter");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);

		return offset;
	}

	static int createEncounterIDHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Encounter ID");

		return offset;
	}

	static int createPatientHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Record");
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("DOB");
		offset = createDocumentMedadataHeadder(row2, offset);
		return offset;
	}

	static int createPatientHeader2(Row row1, Row row2, int offset) {
		// row2.createCell(offset++).setCellValue("CDA Specification");
		// row2.createCell(offset++).setCellValue("CDA Document Type");
		// row2.createCell(offset++).setCellValue("Organization");
		// row2.createCell(offset++).setCellValue("Software");
		row2.createCell(offset++).setCellValue("Recipient Name");
		row2.createCell(offset++).setCellValue("Recipient Organization");
		row2.createCell(offset++).setCellValue("Order Id");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;
	}

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 */
	static int createProcedureHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Procedure");
		row2.createCell(offset++).setCellValue("Performer");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Section Title");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;

	}

	static int createResultsHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("Panel ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Panel");
		offset = addCodeHeader(row2, offset, "Specimen");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Test");
		row2.createCell(offset++).setCellValue("Result");
		row2.createCell(offset++).setCellValue("Range");
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	static int createSocialHistoryHeader(Row row1, Row row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Observation");
		row2.createCell(offset++).setCellValue("Value");
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	static int createSubstanceAdministrationHeader(Row row1, Row row2, int offset, String type) {
		row2.createCell(offset++).setCellValue("ID");
		offset = addCodeHeader(row2, offset, type);
		row2.createCell(offset++).setCellValue("Status");
		row2.createCell(offset++).setCellValue("Quantity");
		row2.createCell(offset++).setCellValue("Expiration");
		row2.createCell(offset++).setCellValue("Prescription");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	/**
	 * @param section
	 * @param any
	 * @return
	 */
	static String getAnyValue(Section section, ANY any) {
		GetValue getValue = new GetValue(section);
		return getValue.doSwitch(any);
	}

	static Date getDate(SimpleDateFormat format, String value) {
		try {
			return format.parse(value);
		} catch (Exception ex) {
		}
		return null;
	}

	static Date getDate(String value) {
		Date date = getDate(DATE_FORMAT12, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT11, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT10, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT9, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT8, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT7, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT6, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT5, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT4, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT3, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT2, value);
		if (date != null) {
			return date;
		}

		date = getDate(DATE_FORMAT1, value);
		if (date != null) {
			return date;
		}

		return null;

	}

	static String getKey(EN pn) {

		if (pn.getText() != null && pn.getText().trim().length() > 0) {
			names.add(pn.getText());
			return pn.getText();
		}

		StringBuffer b = new StringBuffer();

		for (ENXP e : pn.getPrefixes()) {

			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getGivens()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getFamilies()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getSuffixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		return b.toString();

	}

	static String getKey(II ii) {
		if (ii.getRoot() != null) {
			if (ii.getExtension() != null) {
				return ii.getRoot() + " :: " + ii.getExtension();
			}
		} else {
			return "noroot x " + ii.getExtension();
		}
		return "nokey";

	}

	/**
	 * @param ii
	 * @return
	 */
	static Object getKey2(II ii) {
		if (!StringUtils.isEmpty(ii.getExtension())) {
			return ii.getExtension();
		}

		if (!StringUtils.isEmpty(ii.getRoot())) {
			return ii.getRoot();
		}

		return "";

	}

	static String getKey3(II ii) {

		if (!StringUtils.isEmpty(ii.getRoot())) {
			if (!StringUtils.isEmpty(ii.getExtension())) {
				return ii.getRoot() + " :: " + ii.getExtension();
			}
		} else {
			if (!StringUtils.isEmpty(ii.getExtension())) {
				return ii.getExtension();
			}
		}
		return "";

	}

	static String getNarrativeText(String htmlString) throws IOException {
		Reader reader = null;
		reader = new StringReader(htmlString);
		ExtractText extractText = new ExtractText();
		ParserDelegator parserDelegator = new ParserDelegator();
		parserDelegator.parse(reader, extractText, true);
		return extractText.getText();
	}

	static String getValue(IVL_PQ pq) {
		StringBuffer sb = new StringBuffer();

		if (pq != null) {
			if (pq.getValue() != null) {
				sb.append(pq.getValue().toPlainString() + " ");
			}

			String unit = StringUtils.isEmpty(pq.getUnit())
					? ""
					: pq.getUnit();
			sb.append(unit);
		}
		return sb.toString();
	}

	static String getValue(List<Author> authors, PorO poro) {

		String result = "";
		String authorId = "";

		for (Author a : authors) {

			for (II ii : a.getAssignedAuthor().getIds()) {
				authorId = getKey3(ii);
				break;
			}

			if (a.getAssignedAuthor() != null) {
				AssignedAuthor aa = a.getAssignedAuthor();

				if (PorO.ORGANIZATION.equals(poro)) {
					if (aa.getRepresentedOrganization() != null) {
						for (ON on : aa.getRepresentedOrganization().getNames()) {
							result = getValues(on);
						}
					}
				}

				if (PorO.PERSON.equals(poro)) {
					if (aa.getAssignedPerson() != null) {
						for (PN pn : aa.getAssignedPerson().getNames()) {
							result = getValues(pn);
						}
					}
				}
			}
			break;

		}

		if (!StringUtils.isEmpty(authorId) && StringUtils.isEmpty(result)) {
			if (PorO.ORGANIZATION.equals(poro)) {
				if (org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.organizations.containsKey(authorId)) {
					result = org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.organizations.get(authorId) +
							"*";
				}
			} else {
				if (org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.authors.containsKey(authorId)) {
					result = org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.authors.get(authorId) + "*";
				}
			}

		}

		if (StringUtils.isEmpty(result) && !StringUtils.isEmpty(authorId)) {
			result = authorId;
		}

		return result;
	}

	static String getValue(PQ pq) {
		StringBuffer sb = new StringBuffer();

		if (pq != null) {
			if (pq.getValue() != null) {
				sb.append(pq.getValue().toPlainString() + " ");
			}

			String unit = StringUtils.isEmpty(pq.getUnit())
					? ""
					: pq.getUnit();
			sb.append(unit);
		}
		return sb.toString();
	}

	static String getValue(Section section, ED ed) {
		if (ed != null) {
			if (!StringUtils.isEmpty(StringUtils.trim(ed.getText()))) {
				return ed.getText();
			}

			if (ed.getReference() != null) {
				String reference = ed.getReference().getValue();
				if (!StringUtils.isEmpty(reference)) {

					String result = section.getText().getText(reference.substring(1));
					if (!StringUtils.isEmpty(result)) {
						return result;
					} else {
						return "Missing in narrative " + reference;
					}

				}

			}

		}
		return "";
	}

	static String getValueAsString(IVL_TS ivl_ts) {
		// = encounter.getEffectiveTime();
		StringBuffer sb = new StringBuffer();
		if (ivl_ts != null) {
			if (ivl_ts.getLow() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getLow().getValue())) {
					sb.append(ivl_ts.getLow().getValue());
				}

			}
			if (ivl_ts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getHigh().getValue())) {
					sb.append(ivl_ts.getHigh().getValue());
				}
			}
		}
		return sb.toString();
	}

	// static int ++offset = 0;

	static String getValueAsString(Section section, CD cd) {

		StringBuffer sb = new StringBuffer();

		if (cd != null) {

			if (!StringUtils.isEmpty(cd.getDisplayName())) {
				sb.append(cd.getDisplayName());
			} else if (cd.getOriginalText() != null && cd.getOriginalText().getReference() != null) {
				String s = cd.getOriginalText().getReference().getValue();

				String result = section.getText().getText(s.substring(1));
				if (!StringUtils.isEmpty(result)) {
					sb.append(result);
				} else {
					sb.append("Missing in narrative " + s);
				}

			} else if (cd.getOriginalText() != null && !StringUtils.isEmpty(cd.getOriginalText().getText())) {

				sb.append(cd.getOriginalText().getText());
			}

		}

		return sb.toString();
	}

	/**
	 * @param object
	 * @return
	 */
	static String getValues(II ii) {
		String result = "";
		if (ii != null) {
			if (!StringUtils.isEmpty(ii.getRoot())) {
				result = ii.getRoot();
			}
			if (!StringUtils.isEmpty(ii.getExtension())) {
				result = ":" + ii.getExtension();
			}
		}
		return result;
	}

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
							result = getValues(on);
						}
					}
				}

				if (PorO.PERSON.equals(poro)) {
					if (aa.getAssignedPerson() != null) {
						for (PN pn : aa.getAssignedPerson().getNames()) {
							result = getValues(pn);
						}
					}
				}
			}

			for (II ii : a.getAssignedAuthor().getIds()) {
				authorId = getKey3(ii);
				if (!StringUtils.isEmpty(authorId) && !StringUtils.isEmpty(result)) {
					if (PorO.ORGANIZATION.equals(poro)) {
						org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.organizations.put(authorId, result);
					} else {
						org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.authors.put(authorId, result);
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

				Date edate = getDate(encounter.getEffectiveTime().getValue());
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
				Date edate = getDate(encounter.getEffectiveTime().getLow().getValue());
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
				Date edate = getDate(encounter.getEffectiveTime().getHigh().getValue());
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
				if (getKey(ii).equals(getKey(iii))) {
					return true;
				}
			}
		}

		Date observationTime = null;

		if (act.getEffectiveTime() != null) {
			IVL_TS ivlts = act.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : act.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = getDate(author.getTime().getValue());
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
				if (getKey(ii).equals(getKey(iii))) {
					return true;
				}
			}
		}

		Date observationTime = null;

		if (organizer.getEffectiveTime() != null) {
			IVL_TS ivlts = organizer.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : organizer.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = getDate(author.getTime().getValue());
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
				if (getKey(ii).equals(getKey(iii))) {
					return true;
				}
			}
		}

		Date observationTime = null;

		if (procedure.getEffectiveTime() != null) {
			IVL_TS ivlts = procedure.getEffectiveTime();
			if (observationTime == null && ivlts.getLow() != null && !StringUtils.isEmpty(ivlts.getLow().getValue())) {
				observationTime = getDate(ivlts.getLow().getValue());
			}

			if (observationTime == null && ivlts.getHigh() != null &&
					!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
				observationTime = getDate(ivlts.getHigh().getValue());
			}
		}

		if (observationTime == null) {
			for (Author author : procedure.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					observationTime = getDate(author.getTime().getValue());
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
					if (getKey(ii).equals(getKey(iii))) {
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
						substanceAdminTime = getDate(ivlts.getLow().getValue());
					}
				}
			} else {
				if (!StringUtils.isEmpty(ts.getValue())) {
					substanceAdminTime = getDate(ts.getValue());
				}
			}

		}

		if (substanceAdminTime == null) {
			for (Author author : item.getAuthors()) {
				if (author.getTime() != null && !StringUtils.isEmpty(author.getTime().getValue())) {
					substanceAdminTime = getDate(author.getTime().getValue());
				}
			}
		}

		if (substanceAdminTime != null) {
			return isWithinEncounterDateRate(encounter, substanceAdminTime);

		}
		return false;
	}

	// iterative breadth-first traversal of diagnostic tree using queue
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
	};

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeAllergyProblemAct(Row row, int offset, AllergyProblemAct allergyProblemAct) {

		StringBuffer sb = new StringBuffer();

		for (II ii : allergyProblemAct.getIds()) {
			sb.append(getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		if (allergyProblemAct.getStatusCode() != null &&
				!StringUtils.isEmpty(allergyProblemAct.getStatusCode().getCode())) {
			row.createCell(offset++).setCellValue(allergyProblemAct.getStatusCode().getCode());
		} else {
			row.createCell(offset++).setCellValue("Missing Status");
		}

		// if (!allergyProblemAct.getAllergyObservations().isEmpty()) {

		for (AllergyObservation allergyObservation : allergyProblemAct.getAllergyObservations()) {

			Date d = getDate(getValueAsString(allergyObservation.getEffectiveTime()));
			if (d != null) {
				row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
			} else {
				row.createCell(offset++).setCellValue("");
			}

			CD cd = null;
			for (ANY any : allergyObservation.getValues()) {
				if (any instanceof CD) {
					cd = (CD) any;
				}

			}

			row.createCell(offset++).setCellValue(Boolean.TRUE.equals(allergyObservation.getNegationInd()));

			offset = appendCode(row, offset, allergyProblemAct.getSection(), cd, allergyObservation.getText());

			CD material = null;

			try {
				material = allergyObservation.getParticipants().get(
					0).getParticipantRole().getPlayingEntity().getCode();
			} catch (RuntimeException re) {

			}

			offset = appendCode(row, offset, allergyProblemAct.getSection(), material, null);

			if (!allergyObservation.getConsolReactionObservations().isEmpty()) {
				for (ReactionObservation ro : allergyObservation.getConsolReactionObservations()) {

					CD reactionCode = null;

					for (ANY any : ro.getValues()) {
						if (any instanceof CD) {
							reactionCode = (CD) any;
						}
					}
					offset = appendCode(row, offset, allergyProblemAct.getSection(), reactionCode, ro.getText());

					break;
				}
			} else {
				offset = appendCode(row, offset, allergyProblemAct.getSection(), null, null);
			}

			if (allergyObservation.getConsolSeverityObservation() != null) {

				CD severityCode = null;

				for (ANY any : allergyObservation.getConsolSeverityObservation().getValues()) {
					if (any instanceof CD) {
						severityCode = (CD) any;
					}
				}
				offset = appendCode(
					row, offset, allergyProblemAct.getSection(), severityCode,
					allergyObservation.getConsolSeverityObservation().getText());

			} else {
				offset = appendCode(row, offset, allergyProblemAct.getSection(), null, null);
			}
			offset = appendOrganizationAndAuthor(row, offset, allergyObservation.getAuthors());

			break;
		}

		return offset;

	}

	static int serializeDianostic(Row row, int offset, Diagnostic diagnostic) {

		ValidationResult vr = new ValidationResult();

		StringBuffer sb = new StringBuffer();

		if (diagnostic.getChildren().size() > 0) {
			processDiagnostic(diagnostic, vr);
		}

		sb = new StringBuffer();

		for (Diagnostic dq : vr.getErrorDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}
		row.createCell(offset++).setCellValue(sb.toString());
		sb = new StringBuffer();
		for (Diagnostic dq : vr.getWarningDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}

		for (Diagnostic dq : vr.getInfoDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}

		row.createCell(offset++).setCellValue(sb.toString());

		return offset;
	}

	static int serializeDocumentMetadata(Row row, int offset, DocumentMetadata documentMetadata) {
		Cell cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentLibrary);

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentType);

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentOrganization);

		cell = row.createCell(offset++);
		cell.setCellValue(documentMetadata.documentSoftware);

		if (documentMetadata.documentDate != null) {
			cell = row.createCell(offset++);
			cell.setCellStyle(getDocumentDateStyle(row.getSheet()));
			cell.setCellValue(documentMetadata.documentDate);
		} else {
			row.createCell(offset++);
		}
		return offset;
	}

	static int serializeEncounter(Row row, int offset, Encounter encounter) {

		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : encounter.getIds()) {
			sb.append(getKey2(ii));
		}

		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivl_ts = encounter.getEffectiveTime();

		if (ivl_ts != null) {

			if (ivl_ts.getValue() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getValue())) {

					Date d = getDate(ivl_ts.getValue());

					;

					sb.append(DATE_PRETTY.format(d));
				}

			}
			if (ivl_ts.getLow() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getLow().getValue())) {

					Date d = getDate(ivl_ts.getLow().getValue());

					;

					sb.append(DATE_PRETTY.format(d));
				}

			}
			if (ivl_ts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getHigh().getValue())) {

					Date d = getDate(ivl_ts.getHigh().getValue());
					if (sb.length() > 0) {
						sb.append(" - ");
					}
					sb.append(DATE_PRETTY.format(d));
				}
			}
		}

		cell.setCellValue(sb.toString());

		offset = appendCode(row, offset, encounter.getSection(), encounter.getCode(), encounter.getText());

		offset = appendOrganizationAndAuthor(row, offset, encounter.getAuthors());

		return offset;

	}

	static int serializeEncounterID(Row row, int offset, Encounter encounter) {

		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : encounter.getIds()) {
			sb.append(getKey2(ii));
		}

		cell.setCellValue(sb.toString());

		return offset;

	}

	static int serializeObservation(Row row, int offset, Observation resultObservation) {
		return serializeObservation(row, offset, resultObservation, true);
	}

	/**
	 * @param row
	 * @param offset
	 * @param resultObservation
	 * @return
	 */
	static int serializeObservation(Row row, int offset, Observation resultObservation, boolean referenceRange) {

		/*
		 *
		 * row2.createCell(offset++).setCellValue("ID");
		 * row2.createCell(offset++).setCellValue("Test");
		 * row2.createCell(offset++).setCellValue("Description");
		 * row2.createCell(offset++).setCellValue("Result");
		 * // undo to go back to two rows for headers row1.getSheet().addMergedRegion(new CellRangeAddress(0, 0, secondColumn, offset));
		 * row2.createCell(offset++).setCellValue("Range");
		 *
		 */
		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : resultObservation.getIds()) {
			sb.append(getKey2(ii));
		}

		// ID
		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivl_ts = resultObservation.getEffectiveTime();

		if (ivl_ts != null) {

			if (ivl_ts.getValue() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getValue())) {

					Date d = getDate(ivl_ts.getValue());

					;

					sb.append(DATE_PRETTY.format(d));
				}

			}
			if (ivl_ts.getLow() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getLow().getValue())) {

					Date d = getDate(ivl_ts.getLow().getValue());

					;

					sb.append(DATE_PRETTY.format(d));
				}

			}
			if (ivl_ts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getHigh().getValue())) {

					Date d = getDate(ivl_ts.getHigh().getValue());
					if (sb.length() > 0) {
						sb.append(" - ");
					}
					sb.append(DATE_PRETTY.format(d));
				}
			}
		}

		// Date
		cell.setCellValue(sb.toString());

		offset = appendCode(
			row, offset, resultObservation.getSection(), resultObservation.getCode(), resultObservation.getText());

		String value = "";
		for (ANY any : resultObservation.getValues()) {
			value = getAnyValue(resultObservation.getSection(), any);
		}
		row.createCell(offset++).setCellValue(value);

		String referenceRangeValue = "";
		for (ReferenceRange rr : resultObservation.getReferenceRanges()) {

			if (rr.getObservationRange() != null && rr.getObservationRange().getValue() != null) {
				referenceRangeValue = getAnyValue(resultObservation.getSection(), rr.getObservationRange().getValue());
			}

		}

		if (referenceRange) {
			row.createCell(offset++).setCellValue(referenceRangeValue);
		}

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param serializeSpecimen
	 * @param sa
	 * @return
	 */
	static int serializeOrganizer(Row row, int offset, Organizer resultOrganizer, boolean serializeSpecimen,
			boolean serializeSubject) {

		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : resultOrganizer.getIds()) {
			sb.append(getKey2(ii));
		}

		// ID
		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivl_ts = resultOrganizer.getEffectiveTime();

		if (ivl_ts != null) {

			if (ivl_ts.getValue() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getValue())) {

					Date d = getDate(ivl_ts.getValue());

					;

					sb.append(DATE_PRETTY.format(d));
				}

			}
			if (ivl_ts.getLow() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getLow().getValue())) {

					Date d = getDate(ivl_ts.getLow().getValue());

					;

					sb.append(DATE_PRETTY.format(d));
				}

			}
			if (ivl_ts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getHigh().getValue())) {

					Date d = getDate(ivl_ts.getHigh().getValue());
					if (sb.length() > 0) {
						sb.append(" - ");
					}
					sb.append(DATE_PRETTY.format(d));
				}
			}
		}

		// DATE
		cell.setCellValue(sb.toString());

		// TYPE

		// asdf;

		offset = appendCode(row, offset, resultOrganizer.getSection(), resultOrganizer.getCode(), null);

		if (serializeSubject) {

			if (resultOrganizer.getSubject() != null && resultOrganizer.getSubject().getRelatedSubject() != null) {
				offset = appendCode(
					row, offset, resultOrganizer.getSection(),
					resultOrganizer.getSubject().getRelatedSubject().getCode(), null);
			} else {
				offset = appendCode(row, offset, resultOrganizer.getSection(), null, null);
			}
			// resultOrganizer.getSubject().get

		}
		// row.createCell(offset++).setCellValue(
		// getValueAsString(resultOrganizer.getSection(), resultOrganizer.getCode()));
		// place holder encounter description
		// row.createCell(offset++).setCellValue(getValue(resultOrganizer.getSection(), ));

		if (serializeSpecimen) {
			CD specimenCode = null;
			for (Specimen specimen : resultOrganizer.getSpecimens()) {

				if (specimen.getSpecimenRole() != null &&
						specimen.getSpecimenRole().getSpecimenPlayingEntity() != null) {
					specimenCode = specimen.getSpecimenRole().getSpecimenPlayingEntity().getCode();

					break;
				}

			}

			offset = appendCode(row, offset, resultOrganizer.getSection(), specimenCode, null);
		}
		offset = appendOrganizationAndAuthor(row, offset, resultOrganizer.getAuthors());
		return offset;
	}

	static int serializePatient(Row row, int offset, DocumentMetadata documentMetadata, PatientRole patientRole) {

		Cell cell = row.createCell(offset++);
		cell.setCellValue(row.getRowNum() - 1);

		cell = row.createCell(offset++);
		StringBuffer sb = new StringBuffer();
		if (patientRole != null) {
			for (II ii : patientRole.getIds()) {
				sb.append(getKey2(ii));
			}
		}
		cell.setCellValue(sb.toString());

		offset = serializePatient(row, offset, patientRole.getPatient());

		if (documentMetadata != null) {
			offset = serializeDocumentMetadata(row, offset, documentMetadata);
		}
		return offset;
	};

	static int serializePatient(Row row, int offset, Patient patient) {

		Cell cell = row.createCell(offset++);

		if (patient.getBirthTime() != null) {

			Date d = getDate(patient.getBirthTime().getValue());
			if (d != null) {
				cell.setCellValue(DATE_PRETTY.format(d));
			} else {
				cell.setCellValue(patient.getBirthTime().getValue());
			}
		}

		return offset;
	}

	static int serializePatient(Row row, int offset, PatientRole patientRole) {
		return serializePatient(row, offset, null, patientRole);
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeProcedureActivityAct(Row row, int offset, Act procedureActivityAct) {
		StringBuffer sb = new StringBuffer();

		for (II ii : procedureActivityAct.getIds()) {
			sb.append(getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = getDate(getValueAsString(procedureActivityAct.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		offset = appendCode(
			row, offset, procedureActivityAct.getSection(), procedureActivityAct.getCode(),
			procedureActivityAct.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : procedureActivityAct.getPerformers()) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + getValues(on);
					}
				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = getValues(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);

		row.createCell(offset++).setCellValue(organizationValue);

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeProcedureActivityObservation(Row row, int offset,
			ProcedureActivityObservation procedureActivityObservation) {

		StringBuffer sb = new StringBuffer();
		for (II ii : procedureActivityObservation.getIds()) {
			sb.append(getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = getDate(getValueAsString(procedureActivityObservation.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		offset = appendCode(
			row, offset, procedureActivityObservation.getSection(), procedureActivityObservation.getCode(),
			procedureActivityObservation.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : procedureActivityObservation.getPerformers()) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + getValues(on);
					}
				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = getValues(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);

		row.createCell(offset++).setCellValue(organizationValue);

		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeProcedureActivityProcedure(Row row, int offset, Procedure procedureActivityProcedure) {
		StringBuffer sb = new StringBuffer();
		for (II ii : procedureActivityProcedure.getIds()) {
			sb.append(getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		Date d = getDate(getValueAsString(procedureActivityProcedure.getEffectiveTime()));
		if (d != null) {
			row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue("");
		}

		offset = appendCode(
			row, offset, procedureActivityProcedure.getSection(), procedureActivityProcedure.getCode(),
			procedureActivityProcedure.getText());

		String organizationValue = "";
		String personValue = "";
		for (Performer2 performer : procedureActivityProcedure.getPerformers()) {

			if (performer.getAssignedEntity() != null) {
				for (Organization organization : performer.getAssignedEntity().getRepresentedOrganizations()) {
					for (ON on : organization.getNames()) {
						organizationValue = organizationValue + getValues(on);
					}
				}
				if (performer.getAssignedEntity().getAssignedPerson() != null) {
					for (PN pn : performer.getAssignedEntity().getAssignedPerson().getNames()) {
						personValue = getValues(pn);
					}
				}
			}

		}

		row.createCell(offset++).setCellValue(personValue);

		row.createCell(offset++).setCellValue(organizationValue);

		return offset;
	}

	static void serializeSA(String prefix, SubstanceAdministration substanceAdministration, Sheet sheet,
			int rownumber) {

		Row row = sheet.createRow(rownumber);

		Cell cell = row.createCell(0);

		cell.setCellValue(prefix);

		StringBuffer sb = new StringBuffer();

		for (II ii : substanceAdministration.getIds()) {
			sb.append(getKey2(ii));
		}

		row.createCell(1).setCellValue(sb.toString());

		sb = new StringBuffer();
		substanceAdministration.getEffectiveTimes();

		if (substanceAdministration.getConsumable() != null) {
			Consumable consumable = substanceAdministration.getConsumable();

			if (consumable.getManufacturedProduct() != null) {
				ManufacturedProduct manufacturedProduct = consumable.getManufacturedProduct();

				if (manufacturedProduct.getManufacturedMaterial() != null &&
						manufacturedProduct.getManufacturedMaterial().getName() != null) {
					sb.append(manufacturedProduct.getManufacturedMaterial().getName().getText());
				}
			}
		}
		row.createCell(2).setCellValue(sb.toString());

		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(substanceAdministration);

		ValidationResult vr = new ValidationResult();

		if (diagnostic.getChildren().size() > 0) {
			processDiagnostic(diagnostic, vr);
		}

		sb = new StringBuffer();

		for (Diagnostic dq : vr.getErrorDiagnostics()) {

			sb.append(dq.getMessage()).append("\r");

		}
		row.createCell(3).setCellValue(sb.toString());
		sb = new StringBuffer();
		for (Diagnostic dq : vr.getWarningDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}
		row.createCell(3).setCellValue(sb.toString());
		sb = new StringBuffer();
		for (Diagnostic dq : vr.getInfoDiagnostics()) {
			sb.append(dq.getMessage()).append("\r");
		}
		row.createCell(3).setCellValue(sb.toString());

	}

	/**
	 * @param row
	 * @param offset
	 * @param section
	 * @param encoutner
	 */
	static int serializeSectionAndFileName(Row row, int offset, Section section, String fileName) {

		String narrativeText = "";

		if (section != null) {
			if (section.getTitle() != null) {
				row.createCell(offset++).setCellValue(section.getTitle().getText());
			}

			try {
				if (section.getEntries() == null || section.getEntries().size() == 0) {
					ByteArrayOutputStream fa = new ByteArrayOutputStream();
					;
					Section s = CDAFactory.eINSTANCE.createSection();
					s.setText(EcoreUtil.copy(section.getText()));
					if (section.getText() != null) {
						CDAUtil.saveSnippet(EcoreUtil.copy(section.getText()), fa);
						narrativeText = getNarrativeText(fa.toString());
					} else {
						narrativeText = "Missing Text";
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// else {
		// row.createCell(offset++).setCellValue("");
		// }
		Cell cell = row.createCell(offset++);
		cell.setCellValue(fileName);

		if (!StringUtils.isEmpty(narrativeText)) {
			row.createCell(offset++).setCellValue(narrativeText);
		}
		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param serviceEvent
	 * @return
	 */
	static int serializeServiceEvent(Row row, int offset, ServiceEvent serviceEvent) {
		Cell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : serviceEvent.getIds()) {
			sb.append(getKey(ii));
		}

		cell.setCellValue(sb.toString());

		cell = row.createCell(offset++);

		sb = new StringBuffer();
		IVL_TS ivl_ts = serviceEvent.getEffectiveTime();
		if (ivl_ts != null) {
			boolean hasLow = false;
			if (ivl_ts.getLow() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getLow().getValue())) {
					sb.append(ivl_ts.getLow().getValue());
					hasLow = true;
				}

			}
			if (ivl_ts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivl_ts.getHigh().getValue())) {
					if (hasLow) {
						sb.append(" - ");
					}
					sb.append(ivl_ts.getHigh().getValue());
				}
			}
		}

		cell.setCellValue(sb.toString());

		sb = new StringBuffer();
		if (serviceEvent.getCode() != null) {

			if (!StringUtils.isEmpty(serviceEvent.getCode().getDisplayName())) {
				sb.append(serviceEvent.getCode().getDisplayName());
			} else if (serviceEvent.getCode().getOriginalText() != null &&
					!StringUtils.isEmpty(serviceEvent.getCode().getOriginalText().getText())) {
				sb.append(serviceEvent.getCode().getOriginalText().getText());
			} else if (!StringUtils.isEmpty(serviceEvent.getCode().getCode())) {
				sb.append(serviceEvent.getCode().getCode());
			}

		}

		row.createCell(offset++).setCellValue(sb.toString());
		// place holder encounter description
		row.createCell(offset++).setCellValue("DOCUMENT SERVICE EVENT");

		return offset;

	}

	static int serializeSubstanceAdministration(Row row, int offset, SubstanceAdministration substanceAdministration) {

		StringBuffer sb = new StringBuffer();

		for (II ii : substanceAdministration.getIds()) {
			sb.append(getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();
		substanceAdministration.getEffectiveTimes();

		boolean hasCode = false;
		if (substanceAdministration.getConsumable() != null) {
			Consumable consumable = substanceAdministration.getConsumable();

			if (consumable.getManufacturedProduct() != null) {
				ManufacturedProduct manufacturedProduct = consumable.getManufacturedProduct();

				if (manufacturedProduct.getManufacturedMaterial() != null) {

					if (manufacturedProduct.getManufacturedMaterial().getCode() != null) {

						offset = appendCode(
							row, offset, substanceAdministration.getSection(),
							manufacturedProduct.getManufacturedMaterial().getCode(), substanceAdministration.getText());
						hasCode = true;

					}

				}

			}

		}

		if (!hasCode) {
			offset = appendCode(
				row, offset, substanceAdministration.getSection(), null, substanceAdministration.getText());
		}

		if (substanceAdministration.getStatusCode() != null &&
				!StringUtils.isEmpty(substanceAdministration.getStatusCode().getCode())) {
			row.createCell(offset++).setCellValue(substanceAdministration.getStatusCode().getCode());
		} else {
			row.createCell(offset++).setCellValue("Missing Status");
		}

		row.createCell(offset++).setCellValue(getValue(substanceAdministration.getDoseQuantity()));

		String time = "";
		for (SXCM_TS t : substanceAdministration.getEffectiveTimes()) {

			if (!StringUtils.isEmpty(t.getValue())) {
				time = t.getValue();
			}

			if (t instanceof IVL_TS) {

				time = getValueAsString((IVL_TS) t);

			}

		}

		Date d = getDate(time);

		if (d != null) {
			row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
		} else {
			row.createCell(offset++).setCellValue(time);
		}

		row.createCell(offset++).setCellValue(sigSwitch.doSwitch(substanceAdministration));
		offset = appendOrganizationAndAuthor(row, offset, substanceAdministration.getAuthors());

		return offset;

	}

	static boolean shouldHandle(Diagnostic diagnostic) {
		// filter out diagnostics with no message or with root diagnostic message
		if (diagnostic.getMessage() == null || diagnostic.getMessage().startsWith("Diagnosis of")) {
			return false;
		}
		return true;
	}

	HashMap<IFile, DocumentMetadata> documentsbyfile = new HashMap<IFile, DocumentMetadata>();

	HashMap<IFile, Exception> errors = new HashMap<IFile, Exception>();

	ArrayList<IFile> files = new ArrayList<IFile>();

	HashMap<String, ArrayList<IFile>> sectionbyfile = new HashMap<String, ArrayList<IFile>>();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {

			boolean completed = true;
			ProgressMonitorDialog pd = new ProgressMonitorDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());

			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			if (selection instanceof IStructuredSelection) {

				final IStructuredSelection iss = (IStructuredSelection) selection;

				try {
					pd.run(true, true, new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {
							try {
								@SuppressWarnings("unchecked")
								Iterator<Object> iter = iss.iterator();
								while (iter.hasNext() && !monitor.isCanceled()) {
									Object o = iter.next();
									if (o instanceof IFolder) {
										IFolder folder = (IFolder) o;
										monitor.beginTask("Generate Spreadsheet", folder.members().length);
										processFolder2(folder, monitor);
									}
								}
							} catch (IOException e) {
								ILog log = Activator.getDefault().getLog();
								log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
								throw new InvocationTargetException(e);
							} catch (Exception e) {
								ILog log = Activator.getDefault().getLog();
								log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
							}
						}
					});
				} catch (InvocationTargetException e) {
					ILog log = Activator.getDefault().getLog();
					log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					MessageBox dialog = new MessageBox(window.getShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText("Error processing CDA");
					dialog.setMessage("Make sure Excel file is closed!" + e.getMessage());
					dialog.open();
					completed = false;
				} catch (InterruptedException e) {
					ILog log = Activator.getDefault().getLog();
					log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
				}

				if (completed) {
					for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
						project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					}
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					ResultsDialog dlg = new ResultsDialog(window.getShell());
					dlg.create();
					dlg.open();
				}
			}

		} catch (Exception e) {
			ILog log = org.eclipse.mdht.cda.xml.ui.Activator.getDefault().getLog();
			log.log(
				new Status(
					IStatus.ERROR, org.eclipse.mdht.cda.xml.ui.Activator.PLUGIN_ID, "Error generating report", e));
		}

		return null;
	}

	/**
	 * @param row
	 * @param offset
	 * @param patientRole
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	private void processFolder(IFolder folder, IProgressMonitor monitor) throws CoreException, Exception {

		ConsolPackage.eINSTANCE.eClass();

		XSSFWorkbook wb = new XSSFWorkbook();
		int offset = 0;

		Sheet patientsSheet = wb.createSheet("Documents");

		Row row1 = null; // patientsSheet.createRow(0);
		Row row2 = patientsSheet.createRow(0);

		offset = createPatientHeader(row1, row2, 0);
		createPatientHeader2(row1, row2, offset);

		Sheet encountersSheet = wb.createSheet("Encounters");

		row1 = null; // encountersSheet.createRow(0);
		row2 = encountersSheet.createRow(0);
		offset = createPatientHeader(row1, row2, 0);
		createEncounterHeader(row1, row2, offset);

		Sheet allergySheet = wb.createSheet("Allergies");
		row1 = null; /// allergySheet.createRow(0);
		row2 = allergySheet.createRow(0);
		offset = createPatientHeader(row1, row2, 0);
		offset = createEncounterIDHeader(row1, row2, offset);
		createAllergyHeader(row1, row2, offset);

		Sheet substanceAdministrationsSheet = wb.createSheet("Medications");

		row1 = null; // substanceAdministrationsSheet.createRow(0);
		row2 = substanceAdministrationsSheet.createRow(0);
		offset = createPatientHeader(row1, row2, 0);
		offset = createEncounterIDHeader(row1, row2, offset);
		createSubstanceAdministrationHeader(row1, row2, offset, "Medication");

		for (IResource resource : folder.members()) {

			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}

			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				if ("XML".equalsIgnoreCase(file.getFileExtension())) {
					monitor.worked(1);
					monitor.subTask("Processing " + file.getName());
					try {
						URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

						ClinicalDocument clinicalDocument = CDAUtil.load(cdaURI);

						List<Encounter> encounters = new ArrayList<Encounter>();

						Query query = new Query(clinicalDocument);
						PatientRole patientRole = query.getEObject(PatientRole.class);
						ServiceEvent serviceEvent = query.getEObject(ServiceEvent.class);
						EncountersSectionEntriesOptional es = query.getEObject(EncountersSectionEntriesOptional.class);

						boolean useServiceEvent = true;

						if (es != null) {
							encounters.addAll(es.getEncounterActivitiess());
							useServiceEvent = false;
						} else {
						}
						// appendToPatientSheet(query, patientsSheet, patientRole, file.getName());
						// appendToEncounterSheet(query, encountersSheet, patientRole, encounters, file.getName());
						// appendToSubstanceAdministrationSheet(
						// query, substanceAdministrationsSheet, patientRole, (useServiceEvent
						// ? serviceEvent
						// : null),
						// encounters, file.getName());
						//
						// appendToAllergiesSheet(query, allergySheet, patientRole, (useServiceEvent
						// ? serviceEvent
						// : null),
						// encounters, file.getName());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		}

		FileOutputStream fileOut = new FileOutputStream(
			folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
					DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_CA.xlsx");

		wb.write(fileOut);
		fileOut.close();
		wb.close();

	}

	private void processFolder2(IFolder folder, IProgressMonitor monitor) throws Exception {
		ConsolPackage.eINSTANCE.getContinuityOfCareDocument();
		HITSPPackage.eINSTANCE.getPatientSummary();

		/*
		 * There is a limitation on the number of cell styles you can create
		 * We create a global instnace of the documentDateStyle for use in the getDocumentDateStyle()
		 * Set it to null on start up because it is bound to a particular workbook
		 *
		 * Not optimal but did not want to send the documentDateStyle as an argument to all the serialization methods
		 */
		documentDateStyle = null;
		SXSSFWorkbook wb = new SXSSFWorkbook(100);

		wb.setCompressTempFiles(true);
		HashMap<Integer, String> sheets = new HashMap<Integer, String>();

		sectionbyfile.clear();

		documentsbyfile.clear();

		files.clear();

		errors.clear();
		int offset = 0;

		SXSSFSheet documentsSheet = wb.createSheet("Documents");

		SXSSFSheet sectionsSheet = wb.createSheet("Sections");

		SXSSFRow row1 = null;
		SXSSFRow row2 = documentsSheet.createRow(0);
		offset = createPatientHeader(row1, row2, 0);
		createPatientHeader2(row1, row2, offset);

		SXSSFSheet encountersSheet = wb.createSheet("Encounters");

		row1 = null;
		row2 = encountersSheet.createRow(0);

		offset = createPatientHeader(row1, row2, 0);
		createEncounterHeader(row1, row2, offset);

		String fileLocation = folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
				DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.xlsx";
		File theFile = new File(fileLocation);

		// If the file exists, check to see if we can open it
		// this is the excel
		if (theFile.exists()) {
			org.apache.commons.io.FileUtils.touch(theFile);
		}

		int filectr = 1;
		long currentProcessingTime = 1;
		Stopwatch stopwatch = Stopwatch.createUnstarted();

		int totalFiles = folder.members().length;
		for (IResource resource : folder.members()) {
			stopwatch.reset();
			stopwatch.start();
			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}

			if (resource instanceof IFile) {

				IFile file = (IFile) resource;

				if ("XML".equalsIgnoreCase(file.getFileExtension())) {
					files.add(file);
					monitor.worked(1);
					double estimatedTimeLeft = ((folder.members().length - filectr) *
							(currentProcessingTime / filectr)) / 1000.0;

					if (estimatedTimeLeft > 60) {
						monitor.setTaskName(
							"Generate Spreadsheet, Estimated Time to finish : " + ((int) estimatedTimeLeft / 60) +
									" Minutes ");
					} else {
						monitor.setTaskName(
							"Generate Spreadsheet, Estimated Time to finish : " + ((int) estimatedTimeLeft) +
									" Seconds ");
					}

					monitor.subTask(
						"Processing File " + StringUtils.leftPad(String.valueOf(filectr++), 5) + " of " +
								StringUtils.leftPad(String.valueOf(totalFiles), 5) + " Average Time per File " +
								(currentProcessingTime / filectr) / 1000.0 + " Seconds ");
					try {
						URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

						ClinicalDocument clinicalDocument = CDAUtil.load(cdaURI);

						List<Encounter> encounters = new ArrayList<Encounter>();

						Query query = new Query(clinicalDocument);

						// Need to initialize author references because the order of the sections being return is not necessarily the physical order
						List<Author> authors = query.getEObjects(Author.class);
						initAuthorReferences(authors, PorO.ORGANIZATION);
						initAuthorReferences(authors, PorO.PERSON);

						PatientRole patientRole = query.getEObject(PatientRole.class);
						ServiceEvent serviceEvent = query.getEObject(ServiceEvent.class);
						InformationRecipient ir = query.getEObject(InformationRecipient.class);
						InFulfillmentOf iffo = query.getEObject(InFulfillmentOf.class);
						DocumentMetadata documentMetadata = appendToPatientSheet(
							query, documentsSheet, patientRole, ir, iffo, file.getName());

						documentsbyfile.put(file, documentMetadata); // clinicalDocument.eClass().getName());

						if (clinicalDocument instanceof GeneralHeaderConstraints) {

							EncountersSectionEntriesOptional es = query.getEObject(
								EncountersSectionEntriesOptional.class);

							if (es != null) {
								encounters.addAll(es.getEncounterActivitiess());
							}

							appendToEncounterSheet(
								query, encountersSheet, documentMetadata, patientRole, encounters, file.getName());

							for (Section section : clinicalDocument.getSections()) {
								String sheetName = sheetName(section);
								if (!(section instanceof EncountersSectionEntriesOptional)) {
									if (!sheets.containsKey(section.eClass().getClassifierID())) {
										SXSSFSheet newSheet = wb.createSheet(sheetName);
										newSheet.setRandomAccessWindowSize(50);
										sheets.put(section.eClass().getClassifierID(), newSheet.getSheetName());
									}
									SectionSwitch sectionSwitch = new SectionSwitch(
										query, wb.getSheet(sheets.get(section.eClass().getClassifierID())),
										documentMetadata, patientRole, serviceEvent, encounters, file.getName());
									sectionSwitch.doSwitch(section);
									wb.getSheet(sheets.get(section.eClass().getClassifierID())).flushRows();
								}

								if (!sectionbyfile.containsKey(sheetName)) {
									sectionbyfile.put(sheetName, new ArrayList<IFile>());
								}

								sectionbyfile.get(sheetName).add(file);

							}
						} else if (clinicalDocument instanceof org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument) {

							org.openhealthtools.mdht.uml.cda.ccd.EncountersSection es = query.getEObject(
								org.openhealthtools.mdht.uml.cda.ccd.EncountersSection.class);

							if (es != null) {
								encounters.addAll(es.getEncounters());
							}

							appendToEncounterSheet(
								query, encountersSheet, documentMetadata, patientRole, encounters, file.getName());

							for (Section section : clinicalDocument.getSections()) {
								String sheetName = sheetName(section);
								if (!(section instanceof org.openhealthtools.mdht.uml.cda.ccd.EncountersSection)) {
									if (!sheets.containsKey(section.eClass().getClassifierID())) {
										SXSSFSheet newSheet = wb.createSheet(sheetName);
										newSheet.setRandomAccessWindowSize(50);
										sheets.put(section.eClass().getClassifierID(), newSheet.getSheetName());
									}
									C32SectionSwitch sectionSwitch = new C32SectionSwitch(
										query, wb.getSheet(sheets.get(section.eClass().getClassifierID())),
										documentMetadata, patientRole, serviceEvent, encounters, file.getName());
									Boolean result = sectionSwitch.doSwitch(section);
									if (!result) {
										CCDSectionSwitch ccdSectionSwitch = new CCDSectionSwitch(
											query, wb.getSheet(sheets.get(section.eClass().getClassifierID())),
											documentMetadata, patientRole, serviceEvent, encounters, file.getName());
										result = ccdSectionSwitch.doSwitch(section);
									}
									wb.getSheet(sheets.get(section.eClass().getClassifierID())).flushRows();
								}
								if (!sectionbyfile.containsKey(sheetName)) {
									sectionbyfile.put(sheetName, new ArrayList<IFile>());
								}
								sectionbyfile.get(sheetName).add(file);
							}

						}
						clinicalDocument.eResource().unload();
						currentProcessingTime += stopwatch.elapsed(TimeUnit.MILLISECONDS);
					} catch (Exception exception) {
						errors.put(file, exception);
					}
				}
				stopwatch.stop();
			}

		}

		monitor.beginTask("Generate Spreadsheet", folder.members().length);

		List<String> sortedKeys = new ArrayList<String>(sectionbyfile.keySet());
		Collections.sort(sortedKeys);

		Font boldFont = wb.createFont();
		boldFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
		CellStyle sectionstyle = sectionsSheet.getWorkbook().createCellStyle();
		sectionstyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		sectionstyle.setRotation((short) -90);
		sectionstyle.setFont(boldFont);

		row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());

		offset = 0;
		row1.createCell(offset++).setCellValue("File Name");
		// row1.createCell(offset++).setCellValue("Document");
		offset = createDocumentMedadataHeadder(row1, offset++);
		// undo to go back to two rows for headers row1.createCell(offset++).setCellValue("Document Type");
		for (String sectionclass : sortedKeys) {
			Cell cell = row1.createCell(offset++);
			cell.setCellValue(sectionclass);
			cell.setCellStyle(sectionstyle);
		}

		CellStyle style = sectionsSheet.getWorkbook().createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setAlignment(CellStyle.ALIGN_CENTER);
		// style.setFont(font);

		// CellStyle boldstyle = wb.createCellStyle();

		// boldstyle.setFont(boldFont);
		int lastRow = 0;
		for (IFile file : files) {
			if (documentsbyfile.containsKey(file)) {
				offset = 0;
				row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
				row1.createCell(offset++).setCellValue(file.getName());
				DocumentMetadata documentMetadata = documentsbyfile.get(file);
				offset = serializeDocumentMetadata(row1, offset, documentMetadata);
				lastRow = row1.getRowNum();
				for (String sectionclass : sortedKeys) {
					if (sectionbyfile.get(sectionclass).contains(file)) {
						Cell cell = row1.createCell(offset++);
						cell.setCellValue("X");
						cell.setCellStyle(style);
					} else {
						row1.createCell(offset++).setCellValue("");
					}
				}
			}
		}

		row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
		offset = 2;
		for (@SuppressWarnings("unused")
		String sectionclass : sortedKeys) {
			Cell cell = row1.createCell(offset++);
			String columnLetter = CellReference.convertNumToColString(cell.getColumnIndex());
			String strFormula = "COUNTIF(" + columnLetter + "2:" + columnLetter + (lastRow + 1) + ",\"X\")";
			cell.setCellType(Cell.CELL_TYPE_FORMULA);
			cell.setCellFormula(strFormula);
		}

		monitor.subTask(
			"Serializing  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.xlsx");

		FileOutputStream fileOut = new FileOutputStream(fileLocation);
		wb.write(fileOut);
		fileOut.close();
		wb.close();
		wb.dispose();

		monitor.subTask(
			"Flushing Memory  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.xlsx");

		monitor.subTask(
			"Reloading  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.xlsx");

		if (folder.members().length < 50) {
			format(fileLocation, monitor);
		}
		monitor.subTask(
			"Completed Saving  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.xlsx");

	}

	void format(String fileLocation, IProgressMonitor monitor) throws IOException {

		FileInputStream fis = new FileInputStream(fileLocation);
		monitor.subTask(
			"ReOpening  " + DATE_FORMAT3.format(new Date()) + "_" + fileLocation.toUpperCase() + "_SA.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		monitor.subTask("Opened  " + DATE_FORMAT3.format(new Date()) + "_" + fileLocation.toUpperCase() + "_SA.xlsx");
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

		FileOutputStream fileOut = new FileOutputStream(fileLocation);
		wb.write(fileOut);
		fileOut.close();
		wb.close();
	}
}
