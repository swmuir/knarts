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

import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Consumable;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.ManufacturedProduct;
import org.eclipse.mdht.uml.cda.Patient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Filter;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.EN;
import org.eclipse.mdht.uml.hl7.datatypes.ENXP;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_PQ;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.ON;
import org.eclipse.mdht.uml.hl7.datatypes.SXCM_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentEncounterMood;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolSwitch;

public class GenerateCDADataHandler extends AbstractHandler {

	public static class EncountersFilter implements Filter<Encounter> {

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

	private static class FilterAllergyProblemActByEncounter implements Filter<AllergyProblemAct> {

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

	private static class FilterAllergyProblemActByServiceEvent implements Filter<AllergyProblemAct> {

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

	private static class FilterSubstanceAdminstrationsByEncounter implements Filter<MedicationActivity> {

		Encounter encounter;

		public FilterSubstanceAdminstrationsByEncounter(Encounter encounter) {
			super();
			this.encounter = encounter;
		}

		@Override
		public boolean accept(MedicationActivity item) {

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

	}

	private static class FilterSubstanceAdminstrationsByServiceEvent implements Filter<MedicationActivity> {

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

	public static class SigSwitch extends ConsolSwitch<String> {

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

	public static SigSwitch sigSwitch = new SigSwitch();

	public static HashSet<String> names = new HashSet<String>();

	public static final SimpleDateFormat DATE_PRETTY = new SimpleDateFormat("MM/dd/yyyy");

	public static final SimpleDateFormat DATE_FORMAT1 = new SimpleDateFormat("yyyy");

	public static final SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("yyyyMM");

	public static final SimpleDateFormat DATE_FORMAT3 = new SimpleDateFormat("yyyyMMdd");

	public static final SimpleDateFormat DATE_FORMAT4 = new SimpleDateFormat("yyyyMMdd");

	public static final SimpleDateFormat DATE_FORMAT5 = new SimpleDateFormat("yyyyMMddHH");

	public static final SimpleDateFormat DATE_FORMAT6 = new SimpleDateFormat("yyyyMMddHHmm");

	public static final SimpleDateFormat DATE_FORMAT7 = new SimpleDateFormat("yyyyMMddHHmmss");

	public static final SimpleDateFormat DATE_FORMAT8 = new SimpleDateFormat("yyyyMMddHHmmssSSS");

	public static final SimpleDateFormat DATE_FORMAT9 = new SimpleDateFormat("yyyyMMddHHZ");

	public static final SimpleDateFormat DATE_FORMAT10 = new SimpleDateFormat("yyyyMMddHHmmZ");

	public static final SimpleDateFormat DATE_FORMAT11 = new SimpleDateFormat("yyyyMMddHHmmssZ");

	public static final SimpleDateFormat DATE_FORMAT12 = new SimpleDateFormat("yyyyMMddHHmmssSSSZ");;

	/**
	 * @param query
	 * @param substanceAdministrationsSheet
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param name
	 */
	private static void appendToAllergiesSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {

		List<org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct> sas = query.getEObjects(
			org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct.class);

		for (Encounter encounter : encounters) {
			FilterAllergyProblemActByEncounter f = new FilterAllergyProblemActByEncounter(encounter);

			query.getClinicalStatements(AllergyProblemAct.class, f);

			List<AllergyProblemAct> xxx = query.getEObjects(AllergyProblemAct.class, f);

			for (AllergyProblemAct sa : xxx) {

				int offset = 0;

				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows() + 1);

				offset = serializePatient(row, offset, patientRole);

				offset = serializeEncounter(row, offset, encounter);

				offset = serializeAllergyProblemAct(row, offset, sa);

				serializeFileName(row, offset, fileName);

				sas.remove(sa);
			}
		}

		if (serviceEvent != null) {
			FilterAllergyProblemActByServiceEvent filter = new FilterAllergyProblemActByServiceEvent(serviceEvent);
			List<AllergyProblemAct> xxx = query.getEObjects(AllergyProblemAct.class, filter);

			for (AllergyProblemAct sa : xxx) {

				if (!sas.contains(sa)) {

					int offset = 0;

					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows() + 1);

					offset = serializePatient(row, offset, patientRole);

					offset = serializeServiceEvent(row, offset, serviceEvent);

					offset = serializeAllergyProblemAct(row, offset, sa);

					serializeFileName(row, offset, fileName);

					sas.remove(sa);
				}
			}

		}
		for (AllergyProblemAct sa : sas) {
			HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows() + 1);
			int offset = serializePatient(row, 0, patientRole);
			offset = serializeAllergyProblemAct(row, 6, sa);
			serializeFileName(row, offset, fileName);
		}

	};

	/**
	 * @param wb
	 * @param patientRole
	 * @param encounters
	 */
	private static void appendToEncounterSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			List<Encounter> encounters, String fileName) {

		for (Encounter encoutner : encounters) {

			if (encoutner.getEffectiveTime() != null) {
				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows() + 1);
				int offset = serializePatient(row, 0, patientRole);
				offset = serializeEncounter(row, offset, encoutner);
				serializeFileName(row, offset, fileName);
			}
		}
	}

	private static void appendToPatientSheet(Query query, HSSFSheet sheet, PatientRole patientRole, String fileName) {

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

		row.createCell(offset++).setCellValue(organization);

		row.createCell(offset++).setCellValue(software);

		serializeFileName(row, offset, fileName);

	}

	/**
	 * @param wb
	 * @param patientRole
	 * @param serviceEvent
	 * @param encounters
	 * @param fileName
	 */
	private static void appendToSubstanceAdministrationSheet(Query query, HSSFSheet sheet, PatientRole patientRole,
			ServiceEvent serviceEvent, List<Encounter> encounters, String fileName) {

		List<org.openhealthtools.mdht.uml.cda.consol.MedicationActivity> sas = query.getEObjects(
			org.openhealthtools.mdht.uml.cda.consol.MedicationActivity.class);

		for (Encounter encounter : encounters) {
			FilterSubstanceAdminstrationsByEncounter f = new FilterSubstanceAdminstrationsByEncounter(encounter);
			List<MedicationActivity> xxx = query.getEObjects(MedicationActivity.class, f);

			for (SubstanceAdministration sa : xxx) {

				int offset = 0;

				HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows() + 1);

				offset = serializePatient(row, offset, patientRole);

				offset = serializeEncounter(row, offset, encounter);

				offset = serializeSubstanceAdministration(row, offset, sa);

				serializeFileName(row, offset, fileName);

				sas.remove(sa);
			}
		}

		if (serviceEvent != null) {
			FilterSubstanceAdminstrationsByServiceEvent filter = new FilterSubstanceAdminstrationsByServiceEvent(
				serviceEvent);
			List<MedicationActivity> xxx = query.getEObjects(MedicationActivity.class, filter);

			for (SubstanceAdministration sa : xxx) {

				if (!sas.contains(sa)) {

					int offset = 0;

					HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows() + 1);

					offset = serializePatient(row, offset, patientRole);

					offset = serializeServiceEvent(row, offset, serviceEvent);

					offset = serializeSubstanceAdministration(row, offset, sa);

					serializeFileName(row, offset, fileName);

					sas.remove(sa);
				}
			}

		}
		for (SubstanceAdministration sa : sas) {

			HSSFRow row = sheet.createRow(sheet.getPhysicalNumberOfRows() + 1);

			int offset = serializePatient(row, 0, patientRole);

			row.createCell(4).setCellValue("NO ENCOUNTER");

			offset = serializeSubstanceAdministration(row, 6, sa);
			serializeFileName(row, offset, fileName);
		}

	};

	static int createAllergyHeader(HSSFRow row, int offset) {
		// All Des Verify Date Event Type Reaction Severity Source
		row.createCell(offset++).setCellValue("Allergy ID");
		row.createCell(offset++).setCellValue("Allergy Event Type");
		row.createCell(offset++).setCellValue("Allergy Description");
		row.createCell(offset++).setCellValue("Allergy Verify Date");

		row.createCell(offset++).setCellValue("Allergy Reaction");
		row.createCell(offset++).setCellValue("Allergy Severity");
		row.createCell(offset++).setCellValue("Allergy Status");
		row.createCell(offset++).setCellValue("Allergy Source");
		// row.createCell(offset++).setCellValue("Allergy Prescription");
		return offset;
	}

	static int createEncounterHeader(HSSFRow row, int offset) {

		row.createCell(offset++).setCellValue("Encounter ID");
		row.createCell(offset++).setCellValue("Encounter Date");
		row.createCell(offset++).setCellValue("Encountner Category");
		row.createCell(offset++).setCellValue("Encoutner Description");

		return offset;
	};

	static int createPatientHeader(HSSFRow row, int offset) {

		row.createCell(offset++).setCellValue("Patient ID");
		row.createCell(offset++).setCellValue("Patient DOB");
		return offset;
	}

	static int createPatientHeader2(HSSFRow row, int offset) {

		row.createCell(offset++).setCellValue("CDA Document Type");
		row.createCell(offset++).setCellValue("Organization");
		row.createCell(offset++).setCellValue("Software");
		return offset;
	}

	static int createSubstanceAdministrationHeader(HSSFRow row, int offset) {

		row.createCell(offset++).setCellValue("Medication ID");
		row.createCell(offset++).setCellValue("Medication Name");
		row.createCell(offset++).setCellValue("Medication Code");
		row.createCell(offset++).setCellValue("Medication Code System");
		row.createCell(offset++).setCellValue("Medication Code System Name");
		row.createCell(offset++).setCellValue("Medication Status");
		row.createCell(offset++).setCellValue("Medication Quantity");
		row.createCell(offset++).setCellValue("Medication Expiration");
		row.createCell(offset++).setCellValue("Medication Provider");
		row.createCell(offset++).setCellValue("Medication Prescription");
		return offset;
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

	public static String getKey(EN pn) {

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

	public static String getKey(II ii) {
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
	private static Object getKey2(II ii) {
		if (!StringUtils.isEmpty(ii.getExtension())) {
			return ii.getExtension();
		}

		if (!StringUtils.isEmpty(ii.getRoot())) {
			return ii.getRoot();
		}

		return "";

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

	public static String getValue(Section section, ED ed) {
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

	private static void handleDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
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

	private static boolean matchesEncounter(Encounter encounter, Act act) {

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

	// iterative breadth-first traversal of diagnostic tree using queue
	private static void processDiagnostic(Diagnostic diagnostic, ValidationHandler handler) {
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
	private static int serializeAllergyProblemAct(HSSFRow row, int offset, AllergyProblemAct allergyProblemAct) {

		StringBuffer sb = new StringBuffer();

		for (II ii : allergyProblemAct.getIds()) {
			sb.append(getKey2(ii));
		}

		row.createCell(offset++).setCellValue(sb.toString());

		sb = new StringBuffer();

		;

		if (!allergyProblemAct.getAllergyObservations().isEmpty()) {

			for (AllergyObservation allergyObservation : allergyProblemAct.getAllergyObservations()) {

				if (!allergyObservation.getValues().isEmpty()) {
					row.createCell(offset++).setCellValue(
						getValueAsString(allergyProblemAct.getSection(), (CD) allergyObservation.getValues().get(0)));
				} else {
					row.createCell(offset++).setCellValue("");
				}

				String allergyDescription = "";

				if (Boolean.TRUE.equals(allergyObservation.getNegationInd())) {
					allergyDescription = "NO KNOWN ALLERGIES";
				} else {
					if (!allergyObservation.getParticipants().isEmpty()) {

						try {
							allergyDescription = getValueAsString(
								allergyProblemAct.getSection(), allergyObservation.getParticipants().get(
									0).getParticipantRole().getPlayingEntity().getCode());
						} catch (RuntimeException re) {

						}

					} else {

					}
				}

				row.createCell(offset++).setCellValue(allergyDescription);

				Date d = getDate(getValueAsString(allergyObservation.getEffectiveTime()));
				if (d != null) {
					row.createCell(offset++).setCellValue(DATE_PRETTY.format(d));
				} else {
					row.createCell(offset++).setCellValue("");
				}

				if (!allergyObservation.getConsolReactionObservations().isEmpty()) {
					for (ReactionObservation ro : allergyObservation.getConsolReactionObservations()) {

						if (!ro.getValues().isEmpty()) {
							row.createCell(offset++).setCellValue(
								getValueAsString(allergyProblemAct.getSection(), (CD) ro.getValues().get(0)));
						} else {
							row.createCell(offset++).setCellValue("");
						}

						break;
					}
				} else {
					row.createCell(offset++).setCellValue("");
				}

				if (allergyObservation.getConsolSeverityObservation() != null) {

					if (!allergyObservation.getConsolSeverityObservation().getValues().isEmpty()) {
						row.createCell(offset++).setCellValue(
							getValueAsString(
								allergyProblemAct.getSection(),
								(CD) allergyObservation.getConsolSeverityObservation().getValues().get(0)));
					} else {
						row.createCell(offset++).setCellValue("");
					}

				} else {
					row.createCell(offset++).setCellValue("");
				}

				if (allergyProblemAct.getStatusCode() != null &&
						!StringUtils.isEmpty(allergyProblemAct.getStatusCode().getCode())) {
					row.createCell(offset++).setCellValue(allergyProblemAct.getStatusCode().getCode());
				} else {
					row.createCell(offset++).setCellValue("Missing Status");
				}

				String authorValue = "";
				for (Author author : allergyObservation.getAuthors()) {

					if (author.getAssignedAuthor() != null) {

						if (author.getAssignedAuthor().getAssignedPerson() != null) {

							if (author.getAssignedAuthor().getAssignedPerson().getNames() != null) {
								for (EN en : author.getAssignedAuthor().getAssignedPerson().getNames()) {
									authorValue = en.getText();
									break;
								}
							}
						}
					}
				}
				row.createCell(offset++).setCellValue(authorValue);
				break;
			}
		} else {
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
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

		row.createCell(offset++).setCellValue(getValueAsString(encounter.getSection(), encounter.getCode()));
		// place holder encounter description
		row.createCell(offset++).setCellValue(getValue(encounter.getSection(), encounter.getText()));

		return offset;

	}

	/**
	 * @param row
	 * @param offset
	 * @param encoutner
	 */
	private static int serializeFileName(HSSFRow row, int offset, String fileName) {

		HSSFCell cell = row.createCell(offset++);
		cell.setCellValue(fileName);

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

		StringBuffer sb = new StringBuffer();
		for (II ii : patientRole.getIds()) {
			sb.append(getKey2(ii));
		}

		cell.setCellValue(sb.toString());

		offset = serializePatient(row, offset, patientRole.getPatient());
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

	}

	/**
	 * @param row
	 * @param offset
	 * @param serviceEvent
	 * @return
	 */
	private static int serializeServiceEvent(HSSFRow row, int offset, ServiceEvent serviceEvent) {
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

						row.createCell(offset++).setCellValue(
							getValueAsString(
								substanceAdministration.getSection(),
								manufacturedProduct.getManufacturedMaterial().getCode()));

						row.createCell(offset++).setCellValue(
							manufacturedProduct.getManufacturedMaterial().getCode().getCode());

						row.createCell(offset++).setCellValue(
							manufacturedProduct.getManufacturedMaterial().getCode().getCodeSystem());

						row.createCell(offset++).setCellValue(
							manufacturedProduct.getManufacturedMaterial().getCode().getCodeSystemName());

						hasCode = true;

					}

				}

			}

		}

		if (!hasCode) {
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");
			row.createCell(offset++).setCellValue("");

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

		String authorValue = "";
		for (Author author : substanceAdministration.getAuthors()) {

			if (author.getAssignedAuthor() != null) {

				if (author.getAssignedAuthor().getAssignedPerson() != null) {

					if (author.getAssignedAuthor().getAssignedPerson().getNames() != null) {
						for (EN en : author.getAssignedAuthor().getAssignedPerson().getNames()) {
							authorValue = getValues(en);
							break;
						}

					}
				}

			}
			;

		}

		row.createCell(offset++).setCellValue(authorValue);
		row.createCell(offset++).setCellValue(sigSwitch.doSwitch(substanceAdministration));

		return offset;

	}

	private static boolean shouldHandle(Diagnostic diagnostic) {
		// filter out diagnostics with no message or with root diagnostic message
		if (diagnostic.getMessage() == null || diagnostic.getMessage().startsWith("Diagnosis of")) {
			return false;
		}
		return true;
	}

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
								Iterator<Object> iter = iss.iterator();
								while (iter.hasNext() && !monitor.isCanceled()) {

									Object o = iter.next();
									if (o instanceof IFolder) {
										IFolder folder = (IFolder) o;

										monitor.beginTask("Generate Spreadsheet", folder.members().length);
										processFolder(folder, monitor);

									}
								}
							} catch (PartInitException e) {

							} catch (CoreException e) {

							} catch (Exception e) {

							}
						}
					});
				} catch (InvocationTargetException e) {

				} catch (InterruptedException e) {

				}

				for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				}
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
	// private static int serializePatient(HSSFRow row, int offset, PatientRole patientRole) {
	//
	// return 0;
	//
	// }

	private void processFolder(IFolder folder, IProgressMonitor monitor) throws CoreException, Exception {

		ConsolPackage.eINSTANCE.eClass();

		HSSFWorkbook wb = new HSSFWorkbook();
		int offset = 0;

		HSSFSheet patientsSheet = wb.createSheet("Patients");

		HSSFRow row = patientsSheet.createRow(0);
		offset = createPatientHeader(row, 0);
		createPatientHeader2(row, offset);

		HSSFSheet encountersSheet = wb.createSheet("Encounters");

		row = encountersSheet.createRow(0);

		offset = createPatientHeader(row, 0);
		createEncounterHeader(row, offset);

		HSSFSheet allergySheet = wb.createSheet("Allergies");
		row = allergySheet.createRow(0);

		offset = createPatientHeader(row, 0);
		offset = createEncounterHeader(row, offset);
		createAllergyHeader(row, offset);

		HSSFSheet substanceAdministrationsSheet = wb.createSheet("Medications");

		row = substanceAdministrationsSheet.createRow(0);

		offset = createPatientHeader(row, 0);
		offset = createEncounterHeader(row, offset);
		createSubstanceAdministrationHeader(row, offset);

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
						appendToPatientSheet(query, patientsSheet, patientRole, file.getName());
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
			folder.getLocation().toOSString() + "_" + DATE_FORMAT3.format(new Date()) + ".xls");
		wb.write(fileOut);
		fileOut.close();

	}

}
