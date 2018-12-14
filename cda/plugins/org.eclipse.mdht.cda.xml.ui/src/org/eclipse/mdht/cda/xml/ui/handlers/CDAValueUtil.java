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

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.text.html.parser.ParserDelegator;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Sheet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.ADXP;
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
import org.eclipse.mdht.uml.hl7.datatypes.TEL;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch;

/**
 * @author seanmuir
 *
 */
public class CDAValueUtil {

	static class DocumentMetadata {

		public Date documentDate = null;

		public String documentLibrary = "";

		public String documentOrganization = "";

		public String documentRootID = "";

		public String documentSoftware = "";

		public String documentType = "";

		/**
		 * @TODO - re-factor methods to use doucmentMetadata for file name versus parameter
		 */
		public String fileName = "";

		public AD pcpAddress;

		public PN pcpName;

	}

	protected static class GetValue extends DatatypesSwitch<String> {

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
			return CDAValueUtil.getValueAsString(section, object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseED(org.eclipse.mdht.uml.hl7.datatypes.ED)
		 */
		@Override
		public String caseED(ED object) {
			return CDAValueUtil.getValue(section, object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseII(org.eclipse.mdht.uml.hl7.datatypes.II)
		 */
		@Override
		public String caseII(II object) {
			return CDAValueUtil.getValues(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseON(org.eclipse.mdht.uml.hl7.datatypes.ON)
		 */
		@Override
		public String caseON(ON object) {
			return CDAValueUtil.getValues(object);
		}

		@Override
		public String casePN(PN object) {
			return CDAValueUtil.getValues(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#casePQ(org.eclipse.mdht.uml.hl7.datatypes.PQ)
		 */
		@Override
		public String casePQ(PQ object) {
			return CDAValueUtil.getValue(object);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesSwitch#caseREAL(org.eclipse.mdht.uml.hl7.datatypes.REAL)
		 */
		@Override
		public String caseREAL(REAL object) {
			return CDAValueUtil.getValue(object);
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

	/**
	 * @param section
	 * @param any
	 * @return
	 */
	static String getAnyValue(Section section, ANY any) {
		GetValue getValue = new GetValue(section);
		if (any != null) {
			return getValue.doSwitch(any);
		} else {
			return "";
		}
	}

	static Date getDate(SimpleDateFormat format, String value) {
		try {
			if (value != null) {
				// Check to see if the lengths are similar to limit exceptions
				int l = value.length();
				if (value.contains("-") || value.contains("+")) {
					l = l - 4;
				}
				if (l == format.toPattern().length()) {
					return format.parse(value);
				}
			}
		} catch (Exception ex) {
			System.out.println("boom" + value + " " + format.toPattern());
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

	static CellStyle getDocumentDateStyle(Sheet sheet) {
		if (!GenerateCDADataHandler.documentDateStyles.containsKey(sheet)) {
			CellStyle documentDateStyle = sheet.getWorkbook().createCellStyle();
			CreationHelper createHelper = sheet.getWorkbook().getCreationHelper();
			documentDateStyle.setDataFormat(createHelper.createDataFormat().getFormat("mm/dd/yyyy hh:mm AM/PM"));
			GenerateCDADataHandler.documentDateStyles.put(sheet, documentDateStyle);
		}

		return GenerateCDADataHandler.documentDateStyles.get(sheet);
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

	// static String getKey1234(EN pn) {
	//
	// if (pn.getText() != null && pn.getText().trim().length() > 0) {
	// GenerateCDADataHandler.names.add(pn.getText());
	// return pn.getText();
	// }
	//
	// StringBuffer b = new StringBuffer();
	//
	// for (ENXP e : pn.getPrefixes()) {
	//
	// if (b.length() > 0) {
	// b.append(" ");
	// }
	// GenerateCDADataHandler.names.add(e.getText());
	// b.append(e.getText());
	// }
	//
	// for (ENXP e : pn.getGivens()) {
	// if (b.length() > 0) {
	// b.append(" ");
	// }
	// GenerateCDADataHandler.names.add(e.getText());
	// b.append(e.getText());
	// }
	//
	// for (ENXP e : pn.getFamilies()) {
	// if (b.length() > 0) {
	// b.append(" ");
	// }
	// GenerateCDADataHandler.names.add(e.getText());
	// b.append(e.getText());
	// }
	//
	// for (ENXP e : pn.getSuffixes()) {
	// if (b.length() > 0) {
	// b.append(" ");
	// }
	// GenerateCDADataHandler.names.add(e.getText());
	// b.append(e.getText());
	// }
	//
	// return b.toString();
	//
	// }

	static String getNarrativeText(String htmlString) throws IOException {
		Reader reader = null;
		reader = new StringReader(htmlString);
		GenerateCDADataHandler.ExtractText extractText = new GenerateCDADataHandler.ExtractText();
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

	static String getValue(List<Author> authors, GenerateCDADataHandler.PorO poro) {

		String result = "";
		String authorId = "";

		for (Author a : authors) {

			for (II ii : a.getAssignedAuthor().getIds()) {
				authorId = getKey3(ii);
				break;
			}

			if (a.getAssignedAuthor() != null) {
				AssignedAuthor aa = a.getAssignedAuthor();

				if (GenerateCDADataHandler.PorO.ORGANIZATION.equals(poro)) {
					if (aa.getRepresentedOrganization() != null) {
						for (ON on : aa.getRepresentedOrganization().getNames()) {
							result = getValues(on);
						}
					}
				}

				if (GenerateCDADataHandler.PorO.PERSON.equals(poro)) {
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
			if (GenerateCDADataHandler.PorO.ORGANIZATION.equals(poro)) {
				if (GenerateCDADataHandler.organizations.containsKey(authorId)) {
					result = GenerateCDADataHandler.organizations.get(authorId) + "*";
				}
			} else {
				if (GenerateCDADataHandler.authors.containsKey(authorId)) {
					result = GenerateCDADataHandler.authors.get(authorId) + "*";
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

			if (!GenerateCDADataHandler.omitUnits) {
				String unit = StringUtils.isEmpty(pq.getUnit())
						? ""
						: pq.getUnit();
				sb.append(unit);
			}

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
			if (!StringUtils.isEmpty(StringUtils.trim(ed.getText()))) {
				return ed.getText();
			}

			if (ed.getReference() != null) {
				String reference = ed.getReference().getValue();
				if (!StringUtils.isEmpty(reference)) {

					String result = section.getText().getText(reference.substring(1));
					if (!StringUtils.isEmpty(result)) {
						return StringUtils.abbreviate(result, 1000);
					} else {
						return "Narrative Issue: ID " + reference + " not found in narrative " + reference;
					}

				} else {
					return "Narrative Issue: Reference value is missing ";
				}

			} else {
				return "Narrative Issue: Text Element has no content and reference is missing ";
			}

		}
		return "";
	}

	static String getValueAsString(IVL_TS ivlts) {
		// = encounter.getEffectiveTime();
		StringBuffer sb = new StringBuffer();
		if (ivlts != null) {
			if (ivlts.getLow() != null) {
				if (!StringUtils.isEmpty(ivlts.getLow().getValue())) {
					sb.append(ivlts.getLow().getValue());
				}

			}
			if (ivlts.getHigh() != null) {
				if (!StringUtils.isEmpty(ivlts.getHigh().getValue())) {
					sb.append(ivlts.getHigh().getValue());
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
			} else if (cd.isNullFlavorDefined()) {
				sb.append(cd.getNullFlavor());
			}

		}

		return sb.toString();
	}

	static String getValueAsString(TEL tel) {

		StringBuffer sb = new StringBuffer();

		if (tel != null) {

			if (!StringUtils.isEmpty(tel.getValue())) {
				sb.append(tel.getValue());
			} else if (tel.isNullFlavorDefined()) {
				sb.append(tel.getNullFlavor());
			}

			if (!tel.getUses().isEmpty()) {
				sb.append(" " + tel.getUses().get(0));
			}

		}

		return sb.toString();
	}

	public static String getValues(AD ad) {
		StringBuffer b = new StringBuffer();
		for (ADXP a : ad.getStreetAddressLines()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			b.append(a.getText());
		}

		for (ADXP a : ad.getStates()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			b.append(a.getText());
		}

		return b.toString();
	}

	public static String getValues(EN pn) {

		if (pn.getText() != null && pn.getText().trim().length() > 0) {
			GenerateCDADataHandler.names.add(pn.getText());
			return pn.getText();
		}

		StringBuffer b = new StringBuffer();

		for (ENXP e : pn.getPrefixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			GenerateCDADataHandler.names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getGivens()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			GenerateCDADataHandler.names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getFamilies()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			GenerateCDADataHandler.names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getSuffixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			GenerateCDADataHandler.names.add(e.getText());
			b.append(e.getText());
		}

		return b.toString();

	}

	/**
	 * @param object
	 * @return
	 */
	static String getValues(II ii) {
		return (StringUtils.isEmpty(ii.getRoot())
				? ""
				: ii.getRoot()) +
				(!StringUtils.isEmpty(ii.getRoot()) && !StringUtils.isEmpty(ii.getExtension())
						? ":"
						: "") +
				(StringUtils.isEmpty(ii.getExtension())
						? ""
						: ii.getExtension());
	}

}
