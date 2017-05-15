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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

public class GenerateCDADataHandler extends AbstractHandler {

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

		@Override
		public void handleText(char[] text, int pos) {
			txt.append(text);
		}
	}

	/*
	 * boolean isFileUnlocked = false;
	 * try {
	 * org.apache.commons.io.FileUtils.touch(yourFile);
	 * isFileUnlocked = true;
	 * } catch (IOException e) {
	 * isFileUnlocked = false;
	 * }
	 *
	 * if(isFileUnlocked){
	 * // Do stuff you need to do with a file that is NOT locked.
	 * } else {
	 * // Do stuff you need to do with a file that IS locked
	 * }
	 */

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
				int sectionCount = 0;

				for (EClass eclass : sectionbyfile.keySet()) {
					if (sectionbyfile.get(eclass).contains(file)) {
						sectionCount++;
					}
				}

				final TableItem valueSetsUpdatedItem = new TableItem(table, SWT.NONE);
				valueSetsUpdatedItem.setText(new String[] { file.getName(), String.valueOf(sectionCount) });
			}

			return composite;
		}

	}

	static class SectionSwitch extends ConsolSwitch<Boolean> {

		static int serializeProblemObservation(HSSFRow row, int offset, ProblemObservation problemObservation) {
			HSSFCell cell = row.createCell(offset++);

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

			// Date
			cell.setCellValue(sb.toString());

			// offset = appendCode(
			// row, offset, problemObservation.getSection(), problemObservation.getCode(),
			// problemObservation.getText());

			CD problemCode = null;

			for (ANY any : problemObservation.getValues()) {
				if (any instanceof CD) {
					problemCode = (CD) any;
				}
			}
			offset = appendCode(
				row, offset, problemObservation.getSection(), problemCode, problemObservation.getText());

			offset = appendOrganizationAndAuthor(row, offset, problemObservation.getAuthors());

			// String organization = getValue(problemObservation.getAuthors(), PorO.ORGANIZATION);
			// String person = getValue(problemObservation.getAuthors(), PorO.PERSON);
			// row.createCell(offset++).setCellValue(organization);
			// row.createCell(offset++).setCellValue(person);

			return offset;
		}

		List<Encounter> encounters = null;

		String fileName = null;

		PatientRole patientRole = null;

		Query query = null;

		ServiceEvent serviceEvent = null;

		HSSFSheet sheet = null;

		/**
		 * @param query
		 * @param sheet
		 * @param patientRole
		 * @param serviceEvent
		 * @param encounters
		 * @param fileName
		 */
		public SectionSwitch(Query query, HSSFSheet sheet, PatientRole patientRole, ServiceEvent serviceEvent,
				List<Encounter> encounters, String fileName) {
			super();
			this.query = query;
			this.sheet = sheet;
			this.patientRole = patientRole;
			this.serviceEvent = serviceEvent;
			this.encounters = encounters;
			this.fileName = fileName;
		}

		/**
		 * @param query2
		 * @param sheet2
		 * @param patientRole2
		 * @param serviceEvent2
		 * @param section
		 * @param fileName2
		 */
		private void appendEmptySection(Query query2, HSSFSheet sheet2, Section section, String fileName2) {

			HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

			int offset = serializePatient(row, 0, patientRole);

			row.createCell(offset++).setCellValue("NO ENCOUNTER");

			row.createCell(offset++).setCellValue("NO ENTRIES");
			HSSFRow headerRow = sheet2.getRow(0);
			serializeSectionAndFileName(row, headerRow.getPhysicalNumberOfCells() - 3, section, fileName);
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
		private void appendObservationsToSocialHistorySheet(Query query2, HSSFSheet sheet2, PatientRole patientRole2,
				ServiceEvent serviceEvent2, EList<Observation> observations, List<Encounter> encounters2,
				String fileName2) {
			Set<Observation> sets = new HashSet<Observation>();

			for (Encounter encounter : encounters) {
				ObservationByEncounterPredicate predicate = new ObservationByEncounterPredicate(encounter);

				Collection<Observation> byEncouter = Collections2.filter(observations, predicate);

				for (Observation sa : byEncouter) {
					int offset = 0;

					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeObservation(row, offset, sa, false);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					sets.add(sa);
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
			// HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			//
			// offset = serializePatient(row, offset, patientRole);
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
			for (Observation sa : observations) {

				if (sets.add(sa)) {
					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, patientRole);
					offset = serializeObservation(row, ++offset, sa, false);
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
		 * @param observations
		 * @param encounters2
		 * @param fileName2
		 */
		private void appendToFamilyHistorySheet(Query query2, HSSFSheet sheet2, PatientRole patientRole2,
				ServiceEvent serviceEvent2, List<Organizer> observations, List<Encounter> encounters2,
				String fileName2) {

			Set<Organizer> sets = new HashSet<Organizer>();

			for (Encounter encounter : encounters) {

				OrganizerByEncounterPredicate predicate = new OrganizerByEncounterPredicate(encounter);

				Collection<Organizer> byEncouter = Collections2.filter(observations, predicate);

				for (Organizer organizer : byEncouter) {

					for (Observation observation : organizer.getObservations()) {
						HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
						int offset = serializePatient(row, 0, patientRole);
						offset = serializeEncounterID(row, offset, encounter);
						offset = serializeOrganizer(row, offset, organizer, false, true);
						offset = serializeObservation(row, offset, observation);
						serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
					}

					sets.add(organizer);

				}
			}

			for (Organizer sa : observations) {

				if (sets.add(sa)) {
					for (Observation observation : sa.getObservations()) {
						HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
						int offset = serializePatient(row, 0, patientRole);
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
		private void appendToProblemsSheet(Query query2, HSSFSheet sheet2, PatientRole patientRole2,
				ServiceEvent serviceEvent2, EList<ProblemConcernAct> problemConcerns, List<Encounter> encounters2,
				String fileName2) {

			Set<ProblemConcernAct> sets = new HashSet<ProblemConcernAct>();

			for (Encounter encounter : encounters) {
				ActByEncounterPredicate predicate = new ActByEncounterPredicate(encounter);

				Collection<ProblemConcernAct> byEncouter = Collections2.filter(problemConcerns, predicate);

				for (ProblemConcernAct sa : byEncouter) {

					int offset = 0;

					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeProblemConcernAct(row, offset, sa);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					sets.add(sa);
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
			// HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			//
			// offset = serializePatient(row, offset, patientRole);
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
					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, patientRole);
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
		private void appendToProblemsSheet2(Query query2, HSSFSheet sheet2, PatientRole patientRole2,
				ServiceEvent serviceEvent2, EList<ProblemObservation> problemObservations, List<Encounter> encounters2,
				String fileName2) {
			Set<ProblemObservation> sets = new HashSet<ProblemObservation>();

			for (Encounter encounter : encounters) {
				ObservationByEncounterPredicate predicate = new ObservationByEncounterPredicate(encounter);

				Collection<ProblemObservation> byEncouter = Collections2.filter(problemObservations, predicate);

				for (ProblemObservation sa : byEncouter) {

					int offset = 0;

					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeProblemObservation(row, offset, sa);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

					sets.add(sa);
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
			// HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
			//
			// offset = serializePatient(row, offset, patientRole);
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
					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, patientRole);
					offset = serializeProblemObservation(row, ++offset, sa);
					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
				}

			}

		}

		/**
		 * @param query2
		 * @param sheet2
		 * @param patientRole2
		 * @param serviceEvent2
		 * @param vitalSignsOrganizers
		 * @param encounters2
		 * @param fileName2
		 */
		private void appendToVitalSignsSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
				ServiceEvent serviceEvent, List<VitalSignsOrganizer> vitalSignsOrganizers, List<Encounter> encounters,
				String fileName) {

			Set<VitalSignsOrganizer> sets = new HashSet<VitalSignsOrganizer>();

			for (Encounter encounter : encounters) {

				OrganizerByEncounterPredicate predicate = new OrganizerByEncounterPredicate(encounter);

				Collection<VitalSignsOrganizer> byEncouter = Collections2.filter(vitalSignsOrganizers, predicate);

				for (VitalSignsOrganizer organizer : byEncouter) {

					for (VitalSignObservation observation : organizer.getVitalSignObservations()) {
						HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
						int offset = serializePatient(row, 0, patientRole);
						offset = serializeEncounterID(row, offset, encounter);
						offset = serializeOrganizer(row, offset, organizer, false, false);
						offset = serializeObservation(row, offset, observation);
						serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
					}

					sets.add(organizer);

				}
			}

			for (VitalSignsOrganizer sa : vitalSignsOrganizers) {

				if (sets.add(sa)) {
					for (VitalSignObservation observation : sa.getVitalSignObservations()) {
						HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
						int offset = serializePatient(row, 0, patientRole);
						offset = serializeOrganizer(row, ++offset, sa, false, false);
						offset = serializeObservation(row, offset, observation);
						serializeSectionAndFileName(row, offset, observation.getSection(), fileName);
					}
				}

			}

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
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				createAllergyHeader(row1, row2, offset);
			}
			if (section.getAllergyProblemActs() != null && !section.getAllergyProblemActs().isEmpty()) {
				appendToAllergiesSheet(
					query, sheet, patientRole, serviceEvent, section.getAllergyProblemActs(), encounters, fileName);
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
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createFamilyHistoryHeader(row1, row2, offset);
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
		 * @see org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch#caseHistoryOfPastIllnessSection(org.openhealthtools.mdht.uml.cda.consol.
		 * HistoryOfPastIllnessSection)
		 */
		@Override
		public Boolean caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection section) {
			if (sheet.getPhysicalNumberOfRows() == 0) {
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createProblemObservationHeader(row1, row2, offset);
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
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				createSubstanceAdministrationHeader(row1, row2, offset, "Immunization");
			}
			if (section.getImmunizationActivities() != null && !section.getImmunizationActivities().isEmpty()) {

				appendToSubstanceAdministrationSheet(
					query, sheet, patientRole, serviceEvent, encounters, section.getImmunizationActivities(), fileName);

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
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);
				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				createSubstanceAdministrationHeader(row1, row2, offset, "Medications");
			}

			if (section.getMedicationActivities() != null && !section.getMedicationActivities().isEmpty()) {
				appendToSubstanceAdministrationSheet(
					query, sheet, patientRole, serviceEvent, encounters, section.getMedicationActivities(), fileName);

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
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);
				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				createSubstanceAdministrationHeader(row1, row2, offset, "Medications");
			}

			if (section.getMedicationActivities() != null && !section.getMedicationActivities().isEmpty()) {
				appendToSubstanceAdministrationSheet(
					query, sheet, patientRole, serviceEvent, encounters, section.getMedicationActivities(), fileName);

			} else {
				appendEmptySection(query, sheet, section, fileName);
			}
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional section) {

			if (sheet.getPhysicalNumberOfRows() == 0) {
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createProblemHeader(row1, row2, offset);

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
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				createProcedureHeader(row1, row2, offset);
			}
			if (section.getProcedureActivityActs() != null && !section.getProcedureActivityActs().isEmpty()) {

				appendActToProcedureSheet(
					query, sheet, patientRole, serviceEvent, section.getProcedureActivityActs(), encounters, fileName);

			}

			if (section.getProcedureActivityObservations() != null &&
					!section.getProcedureActivityObservations().isEmpty()) {

				appendObservationToProcedureSheet(
					query, sheet, patientRole, serviceEvent, section.getProcedureActivityObservations(), encounters,
					fileName);

			}

			if (section.getProcedureActivityProcedures() != null &&
					!section.getProcedureActivityProcedures().isEmpty()) {

				appendProcedureToProcedureSheet(
					query, sheet, patientRole, serviceEvent, section.getProcedureActivityProcedures(), encounters,
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

			// for (Entry e : section.getEntries()) {
			// System.out.println(e.toString());
			// System.out.println(e.getOrganizer());
			// }

			EList<ResultOrganizer> resultOrganizers = new BasicEList<ResultOrganizer>();

			for (Organizer organizer : section.getOrganizers()) {
				if (organizer instanceof ResultOrganizer) {
					resultOrganizers.add((ResultOrganizer) organizer);
				}
			}

			if (!resultOrganizers.isEmpty()) {

				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				createResultsHeader(row1, row2, offset);

				appendToResultsSheet(query, sheet, patientRole, serviceEvent, resultOrganizers, encounters, fileName);

				return Boolean.TRUE;

			}

			return super.caseResultsSectionEntriesOptional(section);
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
				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				offset = createSocialHistoryHeader(row1, row2, offset);
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

				HSSFRow row1 = null; // sheet.createRow(0);
				HSSFRow row2 = sheet.createRow(0);

				int offset = createPatientHeader(row1, row2, 0);
				offset = createEncounterIDHeader(row1, row2, offset);
				createVitalSignsHeader(row1, row2, offset);

				appendToVitalSignsSheet(
					query, sheet, patientRole, serviceEvent, section.getVitalSignsOrganizers(), encounters, fileName);
				return Boolean.TRUE;

			}
			return super.caseVitalSignsSectionEntriesOptional(section);
		}

		/**
		 * @param row1
		 * @param row2
		 * @param offset
		 * @return
		 */
		private int createFamilyHistoryHeader(HSSFRow row1, HSSFRow row2, int offset) {
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

		private int createProblemHeader(HSSFRow row1, HSSFRow row2, int offset) {
			row2.createCell(offset++).setCellValue("ID");
			row2.createCell(offset++).setCellValue("Date");
			offset = addCodeHeader(row2, offset, "Problem");
			offset = createProblemObservationHeader(row1, row2, offset);
			return offset;

		}

		private int createProblemObservationHeader(HSSFRow row1, HSSFRow row2, int offset) {
			row2.createCell(offset++).setCellValue("ID");
			row2.createCell(offset++).setCellValue("Date");
			offset = addCodeHeader(row2, offset, "Problem");
			row2.createCell(offset++).setCellValue("Organization");
			row2.createCell(offset++).setCellValue("Author");
			offset = addSectionHeader(row2, offset);
			return offset;

		}

		/**
		 * @param row1
		 * @param row2
		 * @param offset
		 */
		private int createVitalSignsHeader(HSSFRow row1, HSSFRow row2, int offset) {

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
		 * @param row
		 * @param offset
		 * @param sa
		 * @return
		 */
		private int serializeProblemConcernAct(HSSFRow row, int offset, ProblemConcernAct problemConcernAct) {
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

	static SigSwitch sigSwitch = new SigSwitch();

	static int addCodeHeader(HSSFRow row1, int offset, String prefix) {
		row1.createCell(offset++).setCellValue(prefix + " Text");
		row1.createCell(offset++).setCellValue("Display Name");
		row1.createCell(offset++).setCellValue("Code");
		row1.getSheet().setColumnHidden(offset - 1, true);
		row1.createCell(offset++).setCellValue("Code System");
		row1.getSheet().setColumnHidden(offset - 1, true);
		row1.createCell(offset++).setCellValue("Code System Name");
		row1.getSheet().setColumnHidden(offset - 1, true);
		return offset;
	};

	static int addSectionHeader(HSSFRow row1, int offset) {
		row1.createCell(offset++).setCellValue("Section Title");
		row1.createCell(offset++).setCellValue("File Name");
		row1.createCell(offset++).setCellValue("Narrative");

		return offset;
	}

	/**
	 * @param query
	 * @param sheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param procedureActivityActs
	 * @param encounters
	 * @param fileName
	 */
	static void appendActToProcedureSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			ServiceEvent serviceEvent, EList<ProcedureActivityAct> procedureActivityActs, List<Encounter> encounters,
			String fileName) {

		Set<ProcedureActivityAct> sets = new HashSet<ProcedureActivityAct>();

		for (Encounter encounter : encounters) {
			ActByEncounterPredicate predicate = new ActByEncounterPredicate(encounter);

			Collection<ProcedureActivityAct> byEncouter = Collections2.filter(procedureActivityActs, predicate);

			for (ProcedureActivityAct sa : byEncouter) {

				int offset = 0;

				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

				offset = serializePatient(row, offset, patientRole);

				offset = serializeEncounterID(row, offset, encounter);

				offset = serializeProcedureActivityAct(row, offset, sa);

				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				sets.add(sa);
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
		// HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
		//
		// offset = serializePatient(row, offset, patientRole);
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
		for (ProcedureActivityAct sa : procedureActivityActs) {

			if (sets.add(sa)) {
				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, patientRole);
				offset = serializeProcedureActivityAct(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			}

		}

	}

	static int appendCode(HSSFRow row, int offset, Section setion, CD cd, ED ed) {

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
	};

	/**
	 * @param query
	 * @param sheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param procedureActivityObservations
	 * @param encounters
	 * @param fileName
	 */
	static void appendObservationToProcedureSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			ServiceEvent serviceEvent, EList<ProcedureActivityObservation> procedureActivityObservations,
			List<Encounter> encounters, String fileName) {

		Set<ProcedureActivityObservation> sets = new HashSet<ProcedureActivityObservation>();

		for (Encounter encounter : encounters) {
			ObservationByEncounterPredicate predicate = new ObservationByEncounterPredicate(encounter);

			Collection<ProcedureActivityObservation> byEncouter = Collections2.filter(
				procedureActivityObservations, predicate);

			for (ProcedureActivityObservation sa : byEncouter) {

				int offset = 0;

				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

				offset = serializePatient(row, offset, patientRole);

				offset = serializeEncounterID(row, offset, encounter);

				offset = serializeProcedureActivityObservation(row, offset, sa);

				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				sets.add(sa);
			}
		}

		for (ProcedureActivityObservation sa : procedureActivityObservations) {

			if (sets.add(sa)) {
				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, patientRole);
				offset = serializeProcedureActivityObservation(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			}

		}

	};

	static int appendOrganizationAndAuthor(HSSFRow row, int offset, EList<Author> authors) {
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
	static void appendProcedureToProcedureSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			ServiceEvent serviceEvent, EList<ProcedureActivityProcedure> procedureActivityProcedures,
			List<Encounter> encounters, String fileName) {
		Set<ProcedureActivityProcedure> sets = new HashSet<ProcedureActivityProcedure>();

		for (Encounter encounter : encounters) {
			ProcedureByEncounterPredicate predicate = new ProcedureByEncounterPredicate(encounter);

			Collection<ProcedureActivityProcedure> byEncouter = Collections2.filter(
				procedureActivityProcedures, predicate);

			for (ProcedureActivityProcedure sa : byEncouter) {

				int offset = 0;

				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

				offset = serializePatient(row, offset, patientRole);

				offset = serializeEncounterID(row, offset, encounter);

				offset = serializeProcedureActivityProcedure(row, offset, sa);

				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				sets.add(sa);
			}
		}

		for (ProcedureActivityProcedure sa : procedureActivityProcedures) {

			if (sets.add(sa)) {
				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, patientRole);
				offset = serializeProcedureActivityProcedure(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			}

		}

	}

	/**
	 * @param query
	 * @param substanceAdministrationsSheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param name
	 */

	static void appendToAllergiesSheet(Query query, HSSFSheet sheet, PatientRole patientRole, ServiceEvent serviceEvent,
			List<Encounter> encounters, String fileName) {

		List<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sas = query.getEObjects(
			org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct.class);

		appendToAllergiesSheet(query, sheet, patientRole, serviceEvent, sas, encounters, fileName);
	}

	static void appendToAllergiesSheet(Query query, HSSFSheet sheet, PatientRole patientRole, ServiceEvent serviceEvent,
			List<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sas, List<Encounter> encounters,
			String fileName) {

		Set<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sets = new HashSet<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct>();

		for (Encounter encounter : encounters) {
			ActByEncounterPredicate predicate = new ActByEncounterPredicate(encounter);

			Collection<AllergyProblemAct> byEncouter = Collections2.filter(sas, predicate);

			for (AllergyProblemAct sa : byEncouter) {

				int offset = 0;

				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

				offset = serializePatient(row, offset, patientRole);

				offset = serializeEncounterID(row, offset, encounter);

				offset = serializeAllergyProblemAct(row, offset, sa);

				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				sets.add(sa);
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
		// HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
		//
		// offset = serializePatient(row, offset, patientRole);
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
				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, patientRole);
				offset = serializeAllergyProblemAct(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
				// serializeFileName(row, offset, fileName);
			}

		}

	}

	/**
	 * @param wb
	 * @param patientRole
	 * @param encounters
	 */
	static void appendToEncounterSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			List<Encounter> encounters, String fileName) {

		for (Encounter encoutner : encounters) {

			if (encoutner.getEffectiveTime() != null) {
				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
				int offset = serializePatient(row, 0, patientRole);
				offset = serializeEncounter(row, offset, encoutner);
				serializeSectionAndFileName(row, offset, encoutner.getSection(), fileName);
			}
		}
	}

	static void appendToPatientSheet(Query query, HSSFSheet sheet, PatientRole patientRole, InformationRecipient ir,
			InFulfillmentOf iffo, String fileName) {

		HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		int offset = serializePatient(row, 0, patientRole);

		ClinicalDocument cd = query.getEObject(ClinicalDocument.class);

		if (cd != null && cd.getCode() != null) {

			row.createCell(offset++).setCellValue(cd.getCode().getDisplayName());
		} else {
			row.createCell(offset++).setCellValue("");
		}

		String organization = "";
		String software = "";
		if (!cd.getAuthors().isEmpty()) {

			for (Author a : cd.getAuthors()) {
				if (a.getAssignedAuthor() != null) {
					AssignedAuthor aa = a.getAssignedAuthor();
					if (aa.getRepresentedOrganization() != null) {
						for (ON on : aa.getRepresentedOrganization().getNames()) {
							organization = getValues(on);
						}
					}

					if (aa.getAssignedAuthoringDevice() != null) {
						if (aa.getAssignedAuthoringDevice().getManufacturerModelName() != null) {
							software = aa.getAssignedAuthoringDevice().getManufacturerModelName().getText();
						}
						if (aa.getAssignedAuthoringDevice().getSoftwareName() != null) {
							software = software + " " + aa.getAssignedAuthoringDevice().getSoftwareName().getText();
						}
					}
				}

			}

		}

		// serviceEvent.get

		row.createCell(offset++).setCellValue(organization);

		row.createCell(offset++).setCellValue(software);

		String name1 = "";
		String name2 = "";
		if (ir != null && ir.getIntendedRecipient() != null) {
			if (ir.getIntendedRecipient().getInformationRecipient() != null) {
				for (PN pn : ir.getIntendedRecipient().getInformationRecipient().getNames()) {
					name1 = getAnyValue(null, pn);
					break;
				}
				for (ON on : ir.getIntendedRecipient().getReceivedOrganization().getNames()) {
					name2 = getAnyValue(null, on);
					break;
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

	}

	static void appendToResultsSheet(Query query, HSSFSheet sheet, PatientRole patientRole, ServiceEvent serviceEvent,
			List<ResultOrganizer> results, List<Encounter> encounters, String fileName) {

		Set<ResultOrganizer> sets = new HashSet<ResultOrganizer>();

		for (Encounter encounter : encounters) {
			OrganizerByEncounterPredicate predicate = new OrganizerByEncounterPredicate(encounter);

			Collection<ResultOrganizer> byEncouter = Collections2.filter(results, predicate);

			for (ResultOrganizer sa : byEncouter) {

				for (ResultObservation resultObservation : sa.getResultObservations()) {
					int offset = 0;

					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

					offset = serializePatient(row, offset, patientRole);

					offset = serializeEncounterID(row, offset, encounter);

					offset = serializeOrganizer(row, offset, sa, true, false);

					offset = serializeObservation(row, offset, resultObservation);

					serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				}

				sets.add(sa);
				// sas.remove(sa);
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
		// HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
		//
		// offset = serializePatient(row, offset, patientRole);
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
		for (ResultOrganizer sa : results) {

			if (sets.add(sa)) {
				for (ResultObservation resultObservation : sa.getResultObservations()) {
					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
					int offset = serializePatient(row, 0, patientRole);
					offset = serializeOrganizer(row, ++offset, sa, true, false);
					offset = serializeObservation(row, offset, resultObservation);
					serializeSectionAndFileName(row, offset, resultObservation.getSection(), fileName);
				}
			}

		}

	}

	/**
	 * @param wb
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param fileName
	 */
	// org.openhealthtools.mdht.uml.cda.consol.MedicationActivity
	static void appendToSubstanceAdministrationSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			ServiceEvent serviceEvent, List<Encounter> encounters, List<? extends SubstanceAdministration> sas,
			String fileName) {

		Set<SubstanceAdministration> sets = new HashSet<SubstanceAdministration>();

		for (Encounter encounter : encounters) {
			SubstanceAdministrationByEncounterPredicate predicate = new SubstanceAdministrationByEncounterPredicate(
				encounter);

			@SuppressWarnings("unchecked")
			Collection<SubstanceAdministration> byEncouter = (Collection<SubstanceAdministration>) Collections2.filter(
				sas, predicate);

			for (SubstanceAdministration sa : byEncouter) {

				int offset = 0;

				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

				offset = serializePatient(row, offset, patientRole);

				offset = serializeEncounterID(row, offset, encounter);

				offset = serializeSubstanceAdministration(row, offset, sa);

				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);

				sets.add(sa);
				// sas.remove(sa);
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
		// HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());
		//
		// offset = serializePatient(row, offset, patientRole);
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
				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows());

				int offset = serializePatient(row, 0, patientRole);

				row.createCell(4).setCellValue("NO ENCOUNTER");

				offset = serializeSubstanceAdministration(row, ++offset, sa);
				serializeSectionAndFileName(row, offset, sa.getSection(), fileName);
			}

		}

	}

	static void appendToSubstanceAdministrationSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {

		// Because we were getting class cast exception - copy results to EList
		EList<SubstanceAdministration> elist = new BasicEList<SubstanceAdministration>();

		elist.addAll(query.getEObjects(org.openhealthtools.mdht.uml.cda.consol.MedicationActivity.class));

		appendToSubstanceAdministrationSheet(query, sheet, patientRole, serviceEvent, encounters, elist, fileName);

	}

	// static void appendToSubstanceAdministrationSheetBySection(Query query, HSSFSheet sheet, Section section,
	// PatientRole patientRole, ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {
	//
	// List<org.openhealthtools.mdht.uml.cda.consol.MedicationActivity> sas = new
	// ArrayList<org.openhealthtools.mdht.uml.cda.consol.MedicationActivity>();
	//
	// for (SubstanceAdministration sa : section.getSubstanceAdministrations()) {
	// if (sa instanceof org.openhealthtools.mdht.uml.cda.consol.MedicationActivity) {
	// sas.add((MedicationActivity) sa);
	// }
	// }
	// appendToSubstanceAdministrationSheet(query, sheet, patientRole, serviceEvent, encounters, sas, fileName);
	//
	// }

	static int createAllergyHeader(HSSFRow row1, HSSFRow row2, int offset) {
		// All Des Verify Date Event Type Reaction Severity Source
		int firstColumn = offset;
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
	};

	static int createEncounterHeader(HSSFRow row1, HSSFRow row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Encounter");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Author");
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	static int createEncounterIDHeader(HSSFRow row1, HSSFRow row2, int offset) {
		row2.createCell(offset++).setCellValue("Encounter ID");
		return offset;
	};

	static int createPatientHeader(HSSFRow row1, HSSFRow row2, int offset) {

		row2.createCell(offset++).setCellValue("Record");
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("DOB");

		return offset;
	};

	static int createPatientHeader2(HSSFRow row1, HSSFRow row2, int offset) {

		row2.createCell(offset++).setCellValue("CDA Document Type");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Software");
		row2.createCell(offset++).setCellValue("Recipient Name");
		row2.createCell(offset++).setCellValue("Recipient Organization");
		row2.createCell(offset++).setCellValue("Order Id");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;
	};

	/**
	 * @param row1
	 * @param row2
	 * @param offset
	 */
	static int createProcedureHeader(HSSFRow row1, HSSFRow row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Procedure");
		row2.createCell(offset++).setCellValue("Performer");
		row2.createCell(offset++).setCellValue("Organization");
		row2.createCell(offset++).setCellValue("Section Title");
		row2.createCell(offset++).setCellValue("File Name");
		return offset;

	};

	static int createResultsHeader(HSSFRow row1, HSSFRow row2, int offset) {
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

	static int createSocialHistoryHeader(HSSFRow row1, HSSFRow row2, int offset) {
		row2.createCell(offset++).setCellValue("ID");
		row2.createCell(offset++).setCellValue("Date");
		offset = addCodeHeader(row2, offset, "Observation");
		row2.createCell(offset++).setCellValue("Value");
		offset = addSectionHeader(row2, offset);
		return offset;
	}

	static int createSubstanceAdministrationHeader(HSSFRow row1, HSSFRow row2, int offset, String type) {
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
		// if (htmlString.length() > 500) {
		// reader = new StringReader(htmlString.substring(0, 500));
		// } else {
		reader = new StringReader(htmlString);
		// }
		ExtractText extractText = new ExtractText();
		ParserDelegator parserDelegator = new ParserDelegator();
		parserDelegator.parse(reader, extractText, true);
		return extractText.getText();
	}

	static String getValue(EList<Author> authors, PorO poro) {

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

		}

		if (!StringUtils.isEmpty(authorId) && !StringUtils.isEmpty(result)) {
			org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.authors.put(authorId, result);
		}

		if (!StringUtils.isEmpty(authorId) && StringUtils.isEmpty(result) &&
				org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.authors.containsKey(authorId)) {
			result = org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.authors.get(authorId) + "*";
		}
		if (StringUtils.isEmpty(result)) {
			result = authorId;
		}

		return result;
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
	}

	static String getValue(Section section, ED ed) {
		if (ed != null) {
			if (!StringUtils.isEmpty(ed.getText())) {
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
				if (edate.getYear() == date.getYear()) {
					if (edate.getMonth() == date.getMonth()) {
						if (edate.getDay() == date.getDay()) {
							return true;
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

	// static int ++offset = 0;

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
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeAllergyProblemAct(HSSFRow row, int offset, AllergyProblemAct allergyProblemAct) {

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

	static int serializeDianostic(HSSFRow row, int offset, Diagnostic diagnostic) {

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

	static int serializeEncounter(HSSFRow row, int offset, Encounter encounter) {

		HSSFCell cell = row.createCell(offset++);

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

	static int serializeEncounterID(HSSFRow row, int offset, Encounter encounter) {

		HSSFCell cell = row.createCell(offset++);

		StringBuffer sb = new StringBuffer();
		for (II ii : encounter.getIds()) {
			sb.append(getKey2(ii));
		}

		cell.setCellValue(sb.toString());

		return offset;

	}

	static int serializeObservation(HSSFRow row, int offset, Observation resultObservation) {
		return serializeObservation(row, offset, resultObservation, true);
	}

	/**
	 * @param row
	 * @param offset
	 * @param resultObservation
	 * @return
	 */
	static int serializeObservation(HSSFRow row, int offset, Observation resultObservation, boolean referenceRange) {

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
		HSSFCell cell = row.createCell(offset++);

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
	};

	/**
	 * @param row
	 * @param offset
	 * @param serializeSpecimen
	 * @param sa
	 * @return
	 */
	static int serializeOrganizer(HSSFRow row, int offset, Organizer resultOrganizer, boolean serializeSpecimen,
			boolean serializeSubject) {

		HSSFCell cell = row.createCell(offset++);

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

			// row.createCell(offset++).setCellValue(specimenText);
		}
		offset = appendOrganizationAndAuthor(row, offset, resultOrganizer.getAuthors());

		// String organization = "";
		// String person = "";
		// if (!resultOrganizer.getAuthors().isEmpty()) {
		//
		// for (Author a : resultOrganizer.getAuthors()) {
		// if (a.getAssignedAuthor() != null) {
		// AssignedAuthor aa = a.getAssignedAuthor();
		// if (aa.getRepresentedOrganization() != null) {
		// for (ON on : aa.getRepresentedOrganization().getNames()) {
		// organization = getValues(on);
		// }
		// }
		//
		// if (aa.getAssignedPerson() != null) {
		// for (PN pn : aa.getAssignedPerson().getNames()) {
		// person = getValues(pn);
		// }
		// }
		// }
		//
		// }
		//
		// }
		//
		// row.createCell(offset++).setCellValue(organization);
		//
		// row.createCell(offset++).setCellValue(person);

		return offset;
	}

	static int serializePatient(HSSFRow row, int offset, Patient patient) {

		HSSFCell cell = row.createCell(offset++);

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

	static int serializePatient(HSSFRow row, int offset, PatientRole patientRole) {

		HSSFCell cell = row.createCell(offset++);
		cell.setCellValue(row.getRowNum() - 1);

		cell = row.createCell(offset++);
		StringBuffer sb = new StringBuffer();
		for (II ii : patientRole.getIds()) {
			sb.append(getKey2(ii));
		}

		cell.setCellValue(sb.toString());

		offset = serializePatient(row, offset, patientRole.getPatient());
		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param sa
	 * @return
	 */
	static int serializeProcedureActivityAct(HSSFRow row, int offset, ProcedureActivityAct procedureActivityAct) {
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
	static int serializeProcedureActivityObservation(HSSFRow row, int offset,
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
	static int serializeProcedureActivityProcedure(HSSFRow row, int offset,
			ProcedureActivityProcedure procedureActivityProcedure) {
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

		// row.createCell(offset++).setCellValue(
		// getAnyValue(procedureActivityProcedure.getSection(), procedureActivityProcedure.getCode()));

		offset = appendCode(
			row, offset, procedureActivityProcedure.getSection(), procedureActivityProcedure.getCode(),
			procedureActivityProcedure.getText());

		/*
		 * boolean hasCode = false;
		 * if (substanceAdministration.getConsumable() != null) {
		 * Consumable consumable = substanceAdministration.getConsumable();
		 *
		 * if (consumable.getManufacturedProduct() != null) {
		 * ManufacturedProduct manufacturedProduct = consumable.getManufacturedProduct();
		 *
		 * if (manufacturedProduct.getManufacturedMaterial() != null) {
		 *
		 * if (manufacturedProduct.getManufacturedMaterial().getCode() != null) {
		 *
		 * row.createCell(offset++).setCellValue(
		 * getValueAsString(
		 * substanceAdministration.getSection(),
		 * manufacturedProduct.getManufacturedMaterial().getCode()));
		 *
		 * row.createCell(offset++).setCellValue(
		 * manufacturedProduct.getManufacturedMaterial().getCode().getCode());
		 *
		 * row.createCell(offset++).setCellValue(
		 * manufacturedProduct.getManufacturedMaterial().getCode().getCodeSystem());
		 *
		 * row.createCell(offset++).setCellValue(
		 * manufacturedProduct.getManufacturedMaterial().getCode().getCodeSystemName());
		 *
		 * hasCode = true;
		 *
		 * }
		 *
		 * }
		 *
		 * }
		 *
		 * }
		 *
		 * if (!hasCode) {
		 * row.createCell(offset++).setCellValue("");
		 * row.createCell(offset++).setCellValue("");
		 * row.createCell(offset++).setCellValue("");
		 * row.createCell(offset++).setCellValue("");
		 *
		 * }
		 */

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

	static void serializeSA(String prefix, SubstanceAdministration substanceAdministration, HSSFSheet sheet,
			int rownumber) {

		HSSFRow row = sheet.createRow(rownumber);

		HSSFCell cell = row.createCell(0);

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

	};

	/**
	 * @param row
	 * @param offset
	 * @param section
	 * @param encoutner
	 */
	static int serializeSectionAndFileName(HSSFRow row, int offset, Section section, String fileName) {

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
					CDAUtil.saveSnippet(EcoreUtil.copy(section.getText()), fa);
					narrativeText = getNarrativeText(fa.toString());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			row.createCell(offset++).setCellValue("");
		}
		HSSFCell cell = row.createCell(offset++);
		cell.setCellValue(fileName);

		row.createCell(offset++).setCellValue(narrativeText);
		return offset;
	}

	/**
	 * @param row
	 * @param offset
	 * @param serviceEvent
	 * @return
	 */
	static int serializeServiceEvent(HSSFRow row, int offset, ServiceEvent serviceEvent) {
		HSSFCell cell = row.createCell(offset++);

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

	static int serializeSubstanceAdministration(HSSFRow row, int offset,
			SubstanceAdministration substanceAdministration) {

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
			// row.createCell(offset++).setCellValue("");
			// row.createCell(offset++).setCellValue("");
			// row.createCell(offset++).setCellValue("");
			// row.createCell(offset++).setCellValue("");

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

	HashMap<IFile, ClinicalDocument> documentsbyfile = new HashMap<IFile, ClinicalDocument>();

	ArrayList<IFile> files = new ArrayList<IFile>();

	HashMap<EClass, ArrayList<IFile>> sectionbyfile = new HashMap<EClass, ArrayList<IFile>>();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {

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
										// processFolder(folder, monitor);
										processFolder2(folder, monitor);

									}
								}
							} catch (PartInitException e) {
								e.printStackTrace();
							} catch (CoreException e) {
								e.printStackTrace();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				} catch (InvocationTargetException e) {

				} catch (InterruptedException e) {

				}

				for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				}

				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

				ResultsDialog dlg = new ResultsDialog(window.getShell());
				dlg.create();
				dlg.open();

			}

		} catch (Exception e) {
			e.printStackTrace();
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
	// static int serializePatient(HSSFRow row, int offset, PatientRole patientRole) {
	//
	// return 0;
	//
	// }

	private void processFolder(IFolder folder, IProgressMonitor monitor) throws CoreException, Exception {

		ConsolPackage.eINSTANCE.eClass();

		HSSFWorkbook wb = new HSSFWorkbook();
		int offset = 0;

		HSSFSheet patientsSheet = wb.createSheet("Documents");

		HSSFRow row1 = null; // patientsSheet.createRow(0);
		HSSFRow row2 = patientsSheet.createRow(0);

		offset = createPatientHeader(row1, row2, 0);
		createPatientHeader2(row1, row2, offset);

		HSSFSheet encountersSheet = wb.createSheet("Encounters");

		row1 = null; // encountersSheet.createRow(0);
		row2 = encountersSheet.createRow(0);
		offset = createPatientHeader(row1, row2, 0);
		createEncounterHeader(row1, row2, offset);

		HSSFSheet allergySheet = wb.createSheet("Allergies");
		row1 = null; /// allergySheet.createRow(0);
		row2 = allergySheet.createRow(0);
		offset = createPatientHeader(row1, row2, 0);
		offset = createEncounterIDHeader(row1, row2, offset);
		createAllergyHeader(row1, row2, offset);

		HSSFSheet substanceAdministrationsSheet = wb.createSheet("Medications");

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
						appendToEncounterSheet(query, encountersSheet, patientRole, encounters, file.getName());
						appendToSubstanceAdministrationSheet(
							query, substanceAdministrationsSheet, patientRole, (useServiceEvent
									? serviceEvent
									: null),
							encounters, file.getName());

						appendToAllergiesSheet(query, allergySheet, patientRole, (useServiceEvent
								? serviceEvent
								: null),
							encounters, file.getName());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		}

		FileOutputStream fileOut = new FileOutputStream(
			folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
					DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_CA.XLS");

		wb.write(fileOut);
		fileOut.close();

	}

	private void processFolder2(IFolder folder, IProgressMonitor monitor) throws Exception {
		HSSFWorkbook wb = new HSSFWorkbook();
		HashMap<Integer, HSSFSheet> sheets = new HashMap<Integer, HSSFSheet>();

		sectionbyfile.clear();

		documentsbyfile.clear();

		files.clear();

		authors.clear();

		int offset = 0;

		HSSFSheet documentsSheet = wb.createSheet("Documents");

		HSSFSheet sectionsSheet = wb.createSheet("Sections");

		HSSFRow row1 = null; // patientsSheet.createRow(0);
		HSSFRow row2 = documentsSheet.createRow(0);
		offset = createPatientHeader(row1, row2, 0);
		createPatientHeader2(row1, row2, offset);

		HSSFSheet encountersSheet = wb.createSheet("Encounters");

		row1 = null; // encountersSheet.createRow(0);
		row2 = encountersSheet.createRow(0);

		offset = createPatientHeader(row1, row2, 0);
		createEncounterHeader(row1, row2, offset);

		for (IResource resource : folder.members()) {

			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}

			if (resource instanceof IFile) {
				IFile file = (IFile) resource;

				if ("XML".equalsIgnoreCase(file.getFileExtension())) {

					files.add(file);
					monitor.worked(1);
					monitor.subTask("Processing " + file.getName());
					try {
						URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

						ClinicalDocument clinicalDocument = CDAUtil.load(cdaURI);

						documentsbyfile.put(file, clinicalDocument);

						List<Encounter> encounters = new ArrayList<Encounter>();

						Query query = new Query(clinicalDocument);

						PatientRole patientRole = query.getEObject(PatientRole.class);
						ServiceEvent serviceEvent = query.getEObject(ServiceEvent.class);
						EncountersSectionEntriesOptional es = query.getEObject(EncountersSectionEntriesOptional.class);
						InformationRecipient ir = query.getEObject(InformationRecipient.class);
						InFulfillmentOf iffo = query.getEObject(InFulfillmentOf.class);

						// boolean useServiceEvent = true;

						if (es != null) {
							encounters.addAll(es.getEncounterActivitiess());
							// useServiceEvent = false;
						} else {
						}
						appendToPatientSheet(query, documentsSheet, patientRole, ir, iffo, file.getName());
						appendToEncounterSheet(query, encountersSheet, patientRole, encounters, file.getName());

						for (Section section : query.getAllSections()) {
							if (!(section instanceof EncountersSectionEntriesOptional)) {

								if (!sheets.containsKey(section.eClass().getClassifierID())) {
									sheets.put(
										section.eClass().getClassifierID(), wb.createSheet(section.eClass().getName()));

								}

								SectionSwitch sectionSwitch = new SectionSwitch(
									query, sheets.get(section.eClass().getClassifierID()), patientRole, serviceEvent,
									encounters, file.getName());

								sectionSwitch.doSwitch(section);
								// sheets.put(section.eClass().getClassifierID(), section);
							}

							if (!sectionbyfile.containsKey(section.eClass())) {
								sectionbyfile.put(section.eClass(), new ArrayList<IFile>());
							}

							sectionbyfile.get(section.eClass()).add(file);

						}

						// PatientRole patientRole = query.getEObject(PatientRole.class);
						// ServiceEvent serviceEvent = query.getEObject(ServiceEvent.class);
						// EncountersSectionEntriesOptional es = query.getEObject(EncountersSectionEntriesOptional.class);
						//
						// boolean useServiceEvent = true;
						//
						// if (es != null) {
						// encounters.addAll(es.getEncounterActivitiess());
						// useServiceEvent = false;
						// } else {
						// }
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

		List<EClass> sortedKeys = new ArrayList<EClass>(sectionbyfile.keySet());
		Comparator<? super EClass> compare = new Comparator<EClass>() {

			@Override
			public int compare(EClass o1, EClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(sortedKeys, compare);
		HSSFCellStyle sectionstyle = sectionsSheet.getWorkbook().createCellStyle();
		sectionstyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		sectionstyle.setRotation((short) -90);

		row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
		offset = 1;
		// undo to go back to two rows for headers row1.createCell(offset++).setCellValue("Document Type");
		for (EClass sectionclass : sortedKeys) {

			HSSFCell cell = row1.createCell(offset++);
			cell.setCellValue(sectionclass.getName());
			cell.setCellStyle(sectionstyle);

		}

		HSSFCellStyle style = sectionsSheet.getWorkbook().createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);

		for (IFile file : files) {
			offset = 0;
			row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
			row1.createCell(offset++).setCellValue(file.getName());
			row1.createCell(offset++).setCellValue(documentsbyfile.get(file).eClass().getName());

			for (EClass sectionclass : sortedKeys) {
				if (sectionbyfile.get(sectionclass).contains(file)) {
					HSSFCell cell = row1.createCell(offset++);
					cell.setCellValue("X");
					cell.setCellStyle(style);
				} else {
					row1.createCell(offset++).setCellValue("");
				}

			}
		}

		row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
		offset = 2;
		for (@SuppressWarnings("unused")
		EClass sectionclass : sortedKeys) {
			HSSFCell cell = row1.createCell(offset++);

			;
			String columnLetter = CellReference.convertNumToColString(cell.getColumnIndex());

			String strFormula = "COUNTIF(" + columnLetter + "2:" + columnLetter + (files.size() + 1) + ",\"X\")";
			cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
			cell.setCellFormula(strFormula);
		}

		// autoSizeColumn
		for (int sheetCtr = 0; sheetCtr < wb.getNumberOfSheets(); sheetCtr++) {
			HSSFSheet aSheet = wb.getSheetAt(sheetCtr);
			HSSFRow topRow = aSheet.getRow(0);
			if (topRow != null) {
				int lastcell = topRow.getLastCellNum();
				for (int columnCtr = 0; columnCtr < lastcell; columnCtr++) {
					monitor.subTask("Formating Sheet " + aSheet.getSheetName());
					aSheet.autoSizeColumn(columnCtr);
					if (aSheet.getColumnWidth(columnCtr) > 9999) {
						aSheet.setColumnWidth(columnCtr, 9999);
					}

				}
			}

		}

		monitor.subTask(
			"Saving  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.XLS");

		FileOutputStream fileOut = new FileOutputStream(
			folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
					DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.XLS");
		wb.write(fileOut);
		fileOut.close();
		monitor.subTask(
			"Completed Saving  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.XLS");

	}

}
