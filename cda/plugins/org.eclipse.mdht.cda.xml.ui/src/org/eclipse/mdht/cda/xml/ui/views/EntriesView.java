/*******************************************************************************
 * Copyright (c) 2012 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.views;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.mdht.cda.xml.ui.editors.CDAAnalyzer;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Component4;
import org.eclipse.mdht.uml.cda.DocumentRoot;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Entry;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.Material;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Procedure;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.cda.util.CDASwitch;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.EN;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.SXCM_TS;
import org.eclipse.mdht.uml.hl7.datatypes.TS;
import org.eclipse.mdht.uml.hl7.datatypes.URL;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.part.ViewPart;

public class EntriesView extends ViewPart {

	private static String getPath(EObject eObject) {
		String path = "";
		while (eObject != null && !(eObject instanceof DocumentRoot) && !(eObject instanceof Section)) {
			EStructuralFeature feature = eObject.eContainingFeature();
			EObject container = eObject.eContainer();
			Object value = container.eGet(feature);
			if (feature.isMany()) {
				List<?> list = (List<?>) value;
				int index = list.indexOf(eObject) + 1;
				path = "/" + feature.getName() + "[" + index + "]" + path;
			} else {
				path = "/" + feature.getName() + "[1]" + path;
			}
			eObject = eObject.eContainer();
		}
		return path;
	}

	static class CDATableSwitch extends CDASwitch<String> {

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.cda.util.CDASwitch#caseSection(org.eclipse.mdht.uml.cda.Section)
		 */
		@Override
		public String caseSection(Section object) {
			return "<tr><td>" + object.eClass().getName() + "</td><td>" + getPath(object) + "</td></tr>";
		}

		StringBuffer result = null;

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.cda.util.CDASwitch#caseClinicalStatement(org.eclipse.mdht.uml.cda.ClinicalStatement)
		 */
		@Override
		public String caseClinicalStatement(ClinicalStatement object) {
			return "<tr bgcolor=\"LIGHTGRAY\" ><td>" + object.eClass().getName() + "</td><td>" + getPath(object) +
					"</td></tr>";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.cda.util.CDASwitch#caseEntry(org.eclipse.mdht.uml.cda.Entry)
		 */
		@Override
		public String caseEntry(Entry object) {
			StringBuffer sb = new StringBuffer();
			sb.append(
				"<tr bgcolor=\"LIGHTGRAY\" ><td>" + object.eClass().getName() + "</td><td>" + getPath(object) +
						"</td></tr>");

			sb.append("<tr><td colspan=\"2\" >");
			sb.append(
				"<table width=\"100%\"  border=\"1\" style=\"margin-left: " + 0 +
						"%\"  > <colgroup><col span=\"1\" style=\"width: 30%;\"><col span=\"1\" style=\"width: 70%;\"></colgroup><tbody>");

			sb.append("<tr><td>").append("typeCode").append("</td><td>").append(object.getTypeCode()).append(
				"</td></tr>");
			sb.append("<tr><td>").append("contextConductionInd").append("</td><td>").append(
				object.getContextConductionInd()).append("</td></tr>");
			sb.append("</tbody></table>");
			sb.append("</td></tr>");
			object.getTypeCode();
			object.getContextConductionInd();
			return sb.toString();
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.cda.util.CDASwitch#caseEntryRelationship(org.eclipse.mdht.uml.cda.EntryRelationship)
		 */
		@Override
		public String caseEntryRelationship(EntryRelationship object) {

			StringBuffer sb = new StringBuffer();
			sb.append(
				"<tr bgcolor=\"LIGHTGRAY\" ><td>" + object.eClass().getName() + "</td><td>" + getPath(object) +
						"</td></tr>");

			sb.append("<tr><td colspan=\"2\" >");
			sb.append(
				"<table width=\"100%\"  border=\"1\" style=\"margin-left: " + 0 +
						"%\"  > <colgroup><col span=\"1\" style=\"width: 30%;\"><col span=\"1\" style=\"width: 70%;\"></colgroup><tbody>");

			sb.append("<tr><td>").append("typeCode").append("</td><td>").append(object.getTypeCode()).append(
				"</td></tr>");
			sb.append("<tr><td>").append("contextConductionInd").append("</td><td>").append(
				object.getContextConductionInd()).append("</td></tr>");

			sb.append("</tbody></table>");
			sb.append("</td></tr>");
			object.getTypeCode();
			object.getContextConductionInd();

			return sb.toString();
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.cda.util.CDASwitch#caseANY(org.eclipse.mdht.uml.hl7.datatypes.ANY)
		 */
		@Override
		public String caseANY(ANY object) {

			return "";
			// super.caseANY(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.cda.util.CDASwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public String defaultCase(EObject object) {
			if (object instanceof AnyType) {
				return "";
			}
			StringBuffer sb = new StringBuffer();
			sb.append(
				"<tr bgcolor=\"LIGHTGRAY\" ><td>" + object.eClass().getName() + "</td><td>" + getPath(object) +
						"</td></tr>");
			return sb.toString();

		}

		@Override
		public String doSwitch(EObject eObject) {
			result = new StringBuffer();
			result.append(super.doSwitch(eObject));
			return result.toString();
		}

	}

	static class DataTypeTableSwitch extends DatatypesSwitch<String> {

		int margin;

		/**
		 * @return the margin
		 */
		public int getMargin() {
			return margin;
		}

		/**
		 * @param margin
		 *            the margin to set
		 */
		public void setMargin(int margin) {
			this.margin = margin;
		}

		StringBuffer result = null;

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.emf.ecore.util.Switch#doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public String doSwitch(EObject eObject) {
			result = new StringBuffer();
			String m = String.valueOf(10);

			result.append(
				"<table width=\"100%\"  border=\"1\" style=\"margin-left: " + 0 +
						"%\"  > <colgroup><col span=\"1\" style=\"width: 30%;\"><col span=\"1\" style=\"width: 70%;\"></colgroup><tbody>");
			if (eObject.eContainingFeature() != null) {
				result.append("<tr><td>Element</td><td><b>").append(eObject.eContainingFeature().getName()).append(
					"</b></td></tr>");

			} else {
				result.append("<tr><td>Element</td><td>UNKNONWN</td></tr>");
			}
			String path = getPath(eObject);
			// System.out.println(path);
			result.append("<tr><td>Location</td><td><small>").append(path).append("</small></td></tr>");

			super.doSwitch(eObject);
			result.append("</tbody></table>");
			return result.toString();

		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseTS(org.eclipse.mdht.uml.hl7.datatypes.TS)
		 */
		@Override
		public String caseTS(TS object) {
			result.append("<tr><td>").append("root").append("</td><td>").append(object.getValue()).append("</td></tr>");
			result.append("<tr><td>").append("nullFlavorTS").append("</td><td>").append(object.isNullFlavorDefined()
					? object.getNullFlavor()
					: "null").append("</td></tr>");
			return "";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#casePN(org.eclipse.mdht.uml.hl7.datatypes.PN)
		 */
		@Override
		public String caseEN(EN object) {

			result.append("<tr><td>").append("root").append("</td><td>").append(
				org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDADataHandler.getValues(object)).append("</td></tr>");
			result.append("<tr><td>").append("nullFlavorTS").append("</td><td>").append(object.isNullFlavorDefined()
					? object.getNullFlavor()
					: "null").append("</td></tr>");
			return "";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseII(org.eclipse.mdht.uml.hl7.datatypes.II)
		 */
		@Override
		public String caseII(II object) {
			result.append("<tr><td>").append("root").append("</td><td>").append(object.getRoot()).append("</td></tr>");
			result.append("<tr><td>").append("extension").append("</td><td>").append(object.getExtension()).append(
				"</td></tr>");
			result.append("<tr><td>").append("assigningAuthorityName").append("</td><td>").append(
				object.getAssigningAuthorityName()).append("</td></tr>");
			result.append("<tr><td>").append("nullFlavorII").append("</td><td>").append(object.isNullFlavorDefined()
					? object.getNullFlavor()
					: "null").append("</td></tr>");

			return result.toString();
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public String defaultCase(EObject object) {
			result.append("<tr><td>").append("Class Name (MissingSwitch)").append("</td><td>").append(
				object.eClass().getName()).append("</td></tr>");

			return result.toString();
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseAD(org.eclipse.mdht.uml.hl7.datatypes.AD)
		 */
		@Override
		public String caseAD(AD object) {
			result.append("<tr><td>").append("text").append("</td><td>").append(object.getText()).append("</td></tr>");
			return "";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseCD(org.eclipse.mdht.uml.hl7.datatypes.CD)
		 */
		@Override
		public String caseCD(CD object) {
			result.append("<tr><td>").append("code").append("</td><td>").append(object.getCode()).append("</td></tr>");
			result.append("<tr><td>").append("displayName").append("</td><td>").append(object.getDisplayName()).append(
				"</td></tr>");
			result.append("<tr><td>").append("codeSystem").append("</td><td>").append(object.getCodeSystem()).append(
				"</td></tr>");
			result.append("<tr><td>").append("codeSystemName").append("</td><td>").append(
				object.getCodeSystemName()).append("</td></tr>");
			result.append("<tr><td>").append("codeSystemVersion").append("</td><td>").append(
				object.getCodeSystemVersion()).append("</td></tr>");
			result.append("<tr><td>").append("nullFlavor").append("</td><td>").append(object.isNullFlavorDefined()
					? object.getNullFlavor()
					: "null").append("</td></tr>");
			return "";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseED(org.eclipse.mdht.uml.hl7.datatypes.ED)
		 */
		@Override
		public String caseED(ED object) {
			result.append("<tr><td>").append("text").append("</td><td>").append(object.getText()).append("</td></tr>");
			result.append("<tr><td>").append("nullFlavor").append("</td><td>").append(object.isNullFlavorDefined()
					? object.getNullFlavor()
					: "null").append("</td></tr>");

			return "";
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseTEL(org.eclipse.mdht.uml.hl7.datatypes.TEL)
		 */
		@Override
		public String caseURL(URL object) {
			result.append("<tr><td>").append("code").append("</td><td>").append(object.getValue()).append("</td></tr>");
			result.append("<tr><td>").append("nullFlavor").append("</td><td>").append(object.isNullFlavorDefined()
					? object.getNullFlavor()
					: "null").append("</td></tr>");

			return "";
		}

	}

	private static StringBuffer getCDRow(CD cd, String rowStyle) {
		StringBuffer result = new StringBuffer();

		if (cd != null) {

			result.append("<tr ").append(rowStyle).append(" >");
			result.append("<td><small>").append(cd.eContainingFeature().getName()).append("</small></td>");
			result.append("<td><small>").append((cd.getCode() != null
					? cd.getCode()
					: "")).append("</small></td>");
			result.append("<td><small>").append((cd.getDisplayName() != null
					? cd.getDisplayName()
					: "")).append("</small></td>");
			result.append("<td><small>").append(cd.getOriginalText() != null
					? cd.getOriginalText().getText()
					: "");

			if (cd.getOriginalText() != null && cd.getOriginalText().getReference() != null &&
					cd.getOriginalText().getReference().getValue() != null &&
					cd.eContainer() instanceof ClinicalStatement) {
				ClinicalStatement clinicalStatement = (ClinicalStatement) cd.eContainer();
				if (clinicalStatement.getSection() != null && clinicalStatement.getSection().getText() != null) {
					result.append(
						clinicalStatement.getSection().getText().getText(
							cd.getOriginalText().getReference().getValue().substring(1)));
				}

			}
			result.append("</small></td>");
			result.append("<td><small>").append((cd.getCodeSystemName() != null
					? cd.getCodeSystemName()
					: "")).append("</small></td>");
			result.append("<td><small>").append((cd.getCodeSystem() != null
					? cd.getCodeSystem()
					: "")).append("</small></td>");
			result.append("<td><small>").append((cd.getCodeSystemVersion() != null
					? cd.getCodeSystemVersion()
					: "")).append("</small></td>");

			result.append("</tr>");

			for (CD translation : cd.getTranslations()) {
				result.append(getCDRow(translation, "style=\"background-color: #FFF5EE\""));
			}
		}

		return result;
	}

	private static StringBuffer getProcedureDetails(Procedure procedure) {

		StringBuffer result = new StringBuffer();
		result.append("<table width=\"100%\"  ><tbody>");

		result.append("<tr><td>").append(getClinicalStatementDetails(procedure)).append("</td></tr>");

		for (II ii : procedure.getIds()) {
			result.append("<tr><td><small>").append(ii.getRoot()).append("</small></td></tr>");
		}

		result.append(
			"<tr><td><table  width=\"100%\" ><thead><tr><th><small>Attribute</small></th><th><small>Value(s)</small></th></tr></thead> <tbody>");
		if (procedure.getStatusCode() != null) {
			result.append(getCDRow(procedure.getStatusCode(), ""));
		}
		if (procedure.getCode() != null) {
			result.append(getCDRow(procedure.getCode(), ""));
		}
		for (CE ce : procedure.getMethodCodes()) {
			result.append(getCDRow(ce, ""));
		}
		result.append("</tbody></table></td></tr>");

		for (EntryRelationship er : procedure.getEntryRelationships()) {
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}

		result.append("</tbody></table>");

		return result;
	}

	private static StringBuffer getOrganizerDetails(Organizer organizer) {

		StringBuffer result = new StringBuffer();
		result.append("<table width=\"100%\"  ><tbody>");

		result.append("<tr><td>").append(getClinicalStatementDetails(organizer)).append("</td></tr>");

		for (II ii : organizer.getIds()) {
			result.append("<tr><td><small>").append(ii.getRoot()).append("</small></td></tr>");
		}

		result.append(
			"<tr><td><table  width=\"100%\" ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");
		if (organizer.getStatusCode() != null) {
			result.append(getCDRow(organizer.getStatusCode(), ""));
		}
		if (organizer.getCode() != null) {
			result.append(getCDRow(organizer.getCode(), ""));
		}

		result.append("</tbody></table></td></tr>");

		for (Component4 component4 : organizer.getComponents()) {
			if (component4.getObservation() != null) {
				result.append("<tr><td>").append(getObservationDetails(component4.getObservation())).append(
					"</td></tr>");
			}
		}

		result.append("</tbody></table>");

		return result;
	}

	private static StringBuffer getObservationDetails(Observation observation) {

		StringBuffer result = new StringBuffer();
		result.append("<table width=\"100%\"  ><tbody>");

		result.append("<tr><td>").append(getClinicalStatementDetails(observation)).append("</td></tr>");

		for (II ii : observation.getIds()) {
			result.append("<tr><td><small>").append(ii.getRoot()).append("</small></td></tr>");
		}

		result.append(
			"<tr><td><table  width=\"100%\" ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");

		if (observation.getClassCode() != null) {
			result.append(getCDRow(observation.getClassCode(), "ClassCode"));
		}

		if (observation.getClassCode() != null) {
			result.append(getCDRow(observation.getMoodCode(), "MoodCode"));
		}

		if (observation.getNegationInd() != null) {
			result.append(getCDRow(observation.getNegationInd(), "ClassCode"));
		}

		if (observation.getStatusCode() != null) {
			result.append(getCDRow(observation.getStatusCode(), ""));
		}
		if (observation.getCode() != null) {
			result.append(getCDRow(observation.getCode(), ""));
		}
		for (ANY any : observation.getValues()) {
			if (any instanceof CD) {
				result.append(getCDRow((CD) any, "style=\"background-color:#FFFFAA\""));
			}
		}

		for (II ii : observation.getIds()) {
			result.append(getCDRow(ii, ""));
			// result.append("<tr><td colspan=\"30\" >").append(ii.getRoot()).append("</td></tr>");
		}

		if (observation.getEffectiveTime() != null) {
			result.append(getCDRow(observation.getEffectiveTime(), ""));

		}

		result.append("</tbody></table></td></tr>");

		for (EntryRelationship er : observation.getEntryRelationships()) {
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}

		result.append("</tbody></table>");

		return result;
	}

	private static StringBuffer getEncountersDetails(Encounter encounter) {

		StringBuffer result = new StringBuffer();
		result.append("<table width=\"100%\"  ><tbody>");

		result.append("<tr><td>").append(getClinicalStatementDetails(encounter)).append("</td></tr>");
		result.append(
			"<tr><td><table width=\"100%\"><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead><tbody>");
		result.append("</tbody></table>");

		return result;
	}

	private static StringBuffer getClinicalStatementDetails(ClinicalStatement cs) {

		StringBuffer result = new StringBuffer();

		result.append(
			"<table  width=\"100%\"  ><thead><tr style=\"background-color:#F0F0F0\" ><th><small>Clinical Statement</small></th><th><small>Template ID(s)</small></th></tr></thead><tbody>");
		// style=\"background-color:#F0F0F0\"
		StringBuffer templateIds = new StringBuffer();
		for (II ii : cs.getTemplateIds()) {
			templateIds.append(templateIds.length() > 0
					? ", "
					: "").append(ii.getRoot());
		}

		String prefix = "";
		if (cs.eContainer() instanceof EntryRelationship && cs.eContainer().eContainer() instanceof ClinicalStatement) {
			prefix = cs.eContainer().eContainer().eClass().getName() + "->";
		}

		cs.getMoodCode();

		cs.getClassCode();

		result.append("<tr><td><small>").append(prefix).append(cs.eClass().getName()).append(
			"</small></td><td><small>").append(templateIds).append("</small></td></tr>");

		result.append(
			"<thead><tr style=\"background-color:#F0F0F0\" ><th><small>Class Code</small></th><th><small>Mood Code</small></th></tr></thead>");

		result.append("<tr><td><small>").append("").append(cs.getClassCode().getLiteral()).append(
			"</small></td><td><small>").append(cs.getMoodCode().getLiteral()).append("</small></td></tr>");

		result.append("</tbody></table>");

		return result;

	}

	private static StringBuffer getEntryRelationshipDetails(EntryRelationship er) {
		StringBuffer result = new StringBuffer();
		if (er.getAct() != null) {
			result.append("<tr><td>").append(getActDetails(er.getAct())).append("</td></tr>");
		}
		if (er.getObservation() != null) {
			result.append("<tr><td>").append(getObservationDetails(er.getObservation())).append("</td></tr>");
		}
		if (er.getEncounter() != null) {
			result.append("<tr><td>").append(getEncountersDetails(er.getEncounter())).append("</td></tr>");
		}

		if (er.getOrganizer() != null) {
			result.append("<tr><td>").append(getOrganizerDetails(er.getOrganizer())).append("</td></tr>");
		}
		if (er.getProcedure() != null) {
			result.append("<tr><td>").append(getProcedureDetails(er.getProcedure())).append("</td></tr>");
		}
		return result;
	}

	private static String getValue(TS xxx) {

		if (xxx != null && !StringUtils.isEmpty(xxx.getValue())) {
			return xxx.getValue();
		}

		return "";
	}

	private static StringBuffer getActDetails(Act act) {

		StringBuffer result = new StringBuffer();

		result.append("<table width=\"100%\" ><tbody>");

		result.append("<tr><td colspan=\"30\" >").append(getClinicalStatementDetails(act)).append("</td></tr>");

		result.append(
			"<tr><td><table  width=\"100%\" ><thead><tr><th><small>Attribute</small></th><th><small>Value(s)</small></th></tr></thead> <tbody>");
		if (act.getClassCode() != null) {
			result.append(getCDRow(act.getClassCode(), "ClassCode"));
		}

		if (act.getClassCode() != null) {
			result.append(getCDRow(act.getMoodCode(), "MoodCode"));
		}

		if (act.getNegationInd() != null) {
			result.append(getCDRow(act.getNegationInd(), "ClassCode"));
		}

		if (act.getStatusCode() != null) {
			result.append(getCDRow(act.getStatusCode(), ""));
		}
		if (act.getCode() != null) {
			result.append(getCDRow(act.getCode(), ""));
		}

		for (II ii : act.getIds()) {
			result.append(getCDRow(ii, ""));
		}

		if (act.getEffectiveTime() != null) {
			result.append(getCDRow(act.getEffectiveTime(), ""));

		}

		result.append("</tbody></table>").append("</td></tr>");

		for (EntryRelationship er : act.getEntryRelationships()) {
			result.append("");
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}

		result.append("</tbody></table>");

		return result;
	}

	/**
	 * @param effectiveTime
	 * @param rowStyle
	 * @return
	 */
	private static Object getCDRow(IVL_TS effectiveTime, String rowStyle) {
		StringBuffer result = new StringBuffer();
		if (effectiveTime != null) {

			result.append("<tr ").append(" >");
			result.append("<td><small>").append(effectiveTime.eContainingFeature().getName()).append("</small></td>");
			result.append("<td><small>").append((effectiveTime.getValue() != null
					? effectiveTime.getValue()
					: "")).append("</small></td>");

			result.append("<td><small>").append((effectiveTime.getLow() != null
					? effectiveTime.getLow().getValue()
					: "")).append("</small></td>");

			result.append("<td><small>").append((effectiveTime.getHigh() != null
					? effectiveTime.getHigh().getValue()
					: "")).append("</small></td>");
			result.append("</tr>");

		}

		return result;
	}

	/**
	 * @param ii
	 * @param rowStyle
	 * @return
	 */
	private static StringBuffer getCDRow(II ii, String attribute) {
		StringBuffer result = new StringBuffer();
		if (ii != null) {

			result.append("<tr ").append(" >");
			result.append("<td><small>").append(ii.eContainingFeature().getName()).append("</small></td>");
			result.append("<td><small>").append((ii.getExtension() != null
					? ii.getExtension()
					: "")).append("</small></td>");
			result.append("<td><small>").append((ii.getRoot() != null
					? ii.getRoot()
					: "")).append("</small></td>");

			result.append("</tr>");

		}

		return result;
	}

	/**
	 * @param negationInd
	 * @param rowStyle
	 * @return
	 */
	private static Object getCDRow(Boolean negationInd, String attribute) {
		StringBuffer result = new StringBuffer();
		if (negationInd != null) {

			result.append("<tr ").append(" >");
			result.append("<td><small>").append(attribute).append("</small></td>");
			result.append("<td><small>").append((negationInd != null
					? negationInd
					: "")).append("</small></td>");

			result.append("</tr>");

		}

		return result;
	}

	/**
	 * @param classCode
	 * @param rowStyle
	 * @return
	 */
	private static StringBuffer getCDRow(Enumerator classCode, String attribute) {

		StringBuffer result = new StringBuffer();
		if (classCode != null) {

			result.append("<tr ").append(" >");
			result.append("<td><small>").append(attribute).append("</small></td>");
			result.append("<td><small>").append((classCode != null
					? classCode.getLiteral()
					: "")).append("</small></td>");

			result.append("</tr>");

		}

		return result;

	}

	private static StringBuffer getSubstanceAdministrationDetails(SubstanceAdministration substanceAdministration) {

		StringBuffer result = new StringBuffer();

		result.append("<table width=\"100%\" ><tbody>");

		result.append("<tr><td colspan=\"30\" >").append(getClinicalStatementDetails(substanceAdministration)).append(
			"</td></tr>");

		for (II ii : substanceAdministration.getIds()) {
			result.append("<tr><td colspan=\"30\" >").append(ii.getRoot()).append("</td></tr>");
		}

		result.append(
			"<tr><td colspan=\"30\" ><table  width=\"100%\"  ><thead><tr><th><small>Attribute</small></th><th><small>Code</small></th><th><small>DisplayName</small></th><th><small>OriginalText</small></th><th><small>CodeSystemName</small></th><th><small>CodeSystem</small></th><th><small>CodeSystemVersion</small></th></tr></thead> <tbody>");
		if (substanceAdministration.getStatusCode() != null) {
			result.append(getCDRow(substanceAdministration.getStatusCode(), ""));
		}
		if (substanceAdministration.getCode() != null) {
			result.append(getCDRow(substanceAdministration.getCode(), ""));
		}
		result.append("</tbody></table>").append("</td></tr>");

		if (substanceAdministration.getAdministrationUnitCode() != null) {
			result.append(getCDRow(substanceAdministration.getAdministrationUnitCode(), ""));
		}

		for (CD cd : substanceAdministration.getApproachSiteCodes()) {
			result.append(getCDRow(cd, ""));
		}

		if (substanceAdministration.getRouteCode() != null) {
			result.append(getCDRow(substanceAdministration.getRouteCode(), ""));

		}

		if (substanceAdministration.getConsumable() != null &&
				substanceAdministration.getConsumable().getManufacturedProduct() != null &&
				substanceAdministration.getConsumable().getManufacturedProduct().getManufacturedMaterial() != null) {
			Material manufacturedMaterial = substanceAdministration.getConsumable().getManufacturedProduct().getManufacturedMaterial();

			result.append(getCDRow(manufacturedMaterial.getCode(), ""));
			result.append(getCDRow(manufacturedMaterial.getName(), ""));

		}

		for (II ii : substanceAdministration.getIds()) {
			result.append(getCDRow(ii, ""));
		}
		for (SXCM_TS sxcm_ts : substanceAdministration.getEffectiveTimes()) {
			if (sxcm_ts instanceof IVL_TS) {
				result.append(getCDRow((IVL_TS) sxcm_ts, ""));
			}

		}

		result.append("</tbody></table>").append("</td></tr>");

		for (EntryRelationship er : substanceAdministration.getEntryRelationships()) {
			result.append("");
			result.append("<tr><td>").append(getEntryRelationshipDetails(er)).append("</td></tr>");
		}

		result.append("</tbody></table>");

		return result;
	}

	/**
	 * @param name
	 * @param rowStyle
	 * @return
	 */
	private static Object getCDRow(EN name, String rowStyle) {

		return null;
	}

	public void addTableListener(Table table) {

		table.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				if (event.item.getData() instanceof Section) {
					Section section = (Section) event.item.getData();
					StringBuffer sbe = new StringBuffer();
					DataTypeTableSwitch dataTypeTableSwitch = new DataTypeTableSwitch();
					CDATableSwitch cdaTableSwitch = new CDATableSwitch();
					dataTypeTableSwitch.setMargin(0);
					sbe.append("<html><head></head><body><table  width=\"100%\"  ><tbody>");
					sbe.append("<tr><td>").append(cdaTableSwitch.doSwitch(section)).append("</td></tr>");
					String path = getPath(section);
					TreeIterator<EObject> eAllContents = section.eAllContents();
					while (eAllContents.hasNext()) {
						EObject next = eAllContents.next();
						if (next instanceof ANY) {
							sbe.append("<tr><td colspan=\"2\" >").append(dataTypeTableSwitch.doSwitch(next)).append(
								"</td></tr>");

						} else {
							String result = cdaTableSwitch.doSwitch(next);
							dataTypeTableSwitch.setMargin(dataTypeTableSwitch.getMargin() + 1);
							if (!StringUtils.isEmpty(result)) {
								sbe.append(cdaTableSwitch.doSwitch(next));
								path = getPath(next);
								System.out.println(path);
								// sbe.append("<tr><td>Location</td><td>").append(path).append("</td></tr>");
							}

						}
					}
					sbe.append("</tbody></table></body></html>");
					browser.setText(sbe.toString());
				}
			}
		});

	}

	Browser browser;

	public EntriesView() {
	}

	public void clearView() {
		browser.setText("");
	}

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.BORDER);
		if (getSite().getPage().getPerspective() != null) {
			for (IEditorReference editorReference : getSite().getPage().getEditorReferences()) {
				if ("org.eclipse.mdht.cda.xml.ui.editors.CDAAnalyzer".equals(editorReference.getId())) {
					CDAAnalyzer analyzer = (CDAAnalyzer) editorReference.getEditor(false);
					if (analyzer != null) {
						this.addTableListener(analyzer.getTable());
					}
				}
			}
		}

	}

	@Override
	public void setFocus() {
	}

}
