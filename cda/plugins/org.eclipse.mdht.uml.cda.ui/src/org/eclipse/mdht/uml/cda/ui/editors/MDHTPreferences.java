/*******************************************************************************
 * Copyright (c) 2015 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sarp Kaya (NEHTA) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.cda.ui.internal.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class MDHTPreferences extends PreferencePage implements IWorkbenchPreferencePage {

	private static final String NONE = "NONE";

	private static final String SELECT_FILTER = "Select Filter By Type";

	private static final String CONSOLURI = "http://www.openhealthtools.org/mdht/uml/cda/consol";

	private static String CARDINALITY_CHECK_BOX_LABEL = "Show multiplicity after the element name" +
			" in the Properties view";

	private static String CARDINALITY_CHECK_BOX_TOOLTIP = "Show multiplicity after the element name in the" +
			" Properties view. This does not affect the DITA publication (PDF, Online) - " +
			"for that, dita-transform.xml needs to be adjusted to say " +
			"cardinalityAfterElement=\"true\" in <transformToDita>";

	private static String PDF_GEN_DISABLE_CHECK_BOX_LABEL = "Disable built-in PDF generation";

	private static String PDF_GEN_DISABLE_CHECK_BOX_TOOLTIP = "Prevent the automatic generation of PDF " +
			" files in the workspace. This also removes the PDF Generation context menu option";

	public static String CARDINALITY_STORE_VALUE = "CardinalityCheckValue";

	public static String PDF_GEN_STORE_VALUE = "DisablePDFCheckValue";

	/**
	 * @TODO
	 * 		Column Selection for reports needs to become more robust
	 *       This is currently overloaded to omit or keep both patient DOB and name
	 *       The store value was kept the same to avoid storage issues
	 */
	public static String OMIT_DOB_STORE_VALUE = "OmitDOBCheckValue";

	public static String OMIT_UNITS_STORE_VALUE = "OmitUnitsCheckValue";

	public static String OMIT_VALIDATION_STORE_VALUE = "OmitValidationStoreValue";

	public static String CDA_REPORT_DEFAULT_FILTER = "CDAReportDefaultFilter";

	private static String OMIT_DOB_CHECK_BOX_LABEL = "Omit DOB and Patient Name from XLS Reports";

	private static String OMIT_DOB_CHECK_BOX_TOOLTIP = "Do not include DOB and Patient Name in reports";

	private static String OMIT_UNITS_CHECK_BOX_TOOLTIP = "Do not include Units of Measure in reports";

	private static String OMIT_UNITS_CHECK_BOX_LABEL = "Omit Quantity Units from XLS Reports";

	private static String OMIT_VALIDATION_CHECK_BOX_LABEL = "Omit CDA Validation from XLS Reports";

	private static String OMIT_VALIDATION_CHECK_BOX_TOOLTIP = "Do not include DCDA Validation in reports";

	/**
	 * FilterListSelectionDialog
	 * The dialog buttons were not easily accessible to change the text for OK and Cancel
	 *
	 * @TODO This might not be the correct way to do this
	 * @author seanmuir
	 *
	 */
	private static class FilterListSelectionDialog extends ElementListSelectionDialog {

		private static final String SET_FILTER = "Set Filter";

		private static final String CLEAR_FILTER = "Clear Filter";

		/**
		 * @param parent
		 * @param renderer
		 */
		public FilterListSelectionDialog(Shell parent, ILabelProvider renderer) {
			super(parent, renderer);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.ui.dialogs.SelectionDialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		protected void createButtonsForButtonBar(Composite parent) {
			super.createButtonsForButtonBar(parent);
			getButton(IDialogConstants.CANCEL_ID).setText(CLEAR_FILTER);
			getButton(IDialogConstants.OK_ID).setText(SET_FILTER);

		}

	}

	private Button cardinalityCheckBox;

	private Button disablePdfGenerationCheckBox;

	private Button omitDOBCheckBox;

	private Button omitUnitsCheckBox;

	private Text cdaReportFilterText;

	private Button omitValidationCheckBox;

	final ArrayList<String> cdaReportfilters = new ArrayList<String>();

	/**
	 * Creates an new checkbox instance and sets the default
	 * layout data.
	 *
	 * @param group
	 *            the composite in which to create the checkbox
	 * @param label
	 *            the string to set into the checkbox
	 * @return the new checkbox
	 */
	private Button createCheckBox(Composite group, String label, String toolTip) {
		Button button = new Button(group, SWT.CHECK | SWT.LEFT);
		button.setText(label);
		button.setToolTipText(toolTip);
		GridData data = new GridData();
		button.setLayoutData(data);
		return button;
	}

	FilterListSelectionDialog filterSelectionDialog = null;

	private Button createFilterButton(Composite group, String label, String toolTip) {

		ILabelProvider lp = new ILabelProvider() {

			@Override
			public void addListener(ILabelProviderListener listener) {

			}

			@Override
			public void dispose() {

			}

			@Override
			public boolean isLabelProperty(Object element, String property) {

				return false;
			}

			@Override
			public void removeListener(ILabelProviderListener listener) {

			}

			@Override
			public Image getImage(Object element) {

				return null;
			}

			@Override
			public String getText(Object element) {
				EClass ec = (EClass) element;
				String theElementName = ec.getName();

				if (Character.isDigit(theElementName.charAt(theElementName.length() - 1))) {
					theElementName = theElementName.substring(0, theElementName.length() - 1);
				}

				String[] nameArray = theElementName.split("(?=\\p{Upper})");
				StringBuffer sb = new StringBuffer();
				for (String seg : nameArray) {
					sb.append(seg).append(" ");
				}
				sb.append("(s)");

				return sb.toString();
			}
		};

		filterSelectionDialog = new FilterListSelectionDialog(group.getShell(), lp);

		filterSelectionDialog.setTitle(SELECT_FILTER);

		filterSelectionDialog.setMessage(SELECT_FILTER);

		HashMap<EClass, HashSet<EClass>> theSectionCache = new HashMap<EClass, HashSet<EClass>>();
		getFilterHash(theSectionCache);
		filterSelectionDialog.setElements(theSectionCache.keySet().toArray());

		filterSelectionDialog.setMultipleSelection(true);

		Button button = new Button(group, SWT.PUSH | SWT.LEFT);
		button.setText(label);
		button.setToolTipText(toolTip);
		GridData data = new GridData();
		button.setLayoutData(data);

		button.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				cdaReportfilters.clear();
				if (filterSelectionDialog.open() != Window.OK) {
					cdaReportFilterText.setText(NONE);
					return;
				}
				for (Object object : filterSelectionDialog.getResult()) {
					cdaReportfilters.add(((EClass) object).getName());
				}
				cdaReportFilterText.setText(formatFilterNames(cdaReportfilters));
			}
		});
		return button;
	}

	private String formatFilterNames(List<String> filterNames) {
		StringBuilder formattedFilters = new StringBuilder();
		for (String filter : filterNames) {
			if (formattedFilters.length() > 0) {
				formattedFilters.append(System.getProperty("line.separator"));
			}
			formattedFilters.append(formatFilterName(filter));
		}
		return formattedFilters.toString();
	}

	private String formatFilterName(String filterName) {
		StringBuffer formattedFilterName = new StringBuffer();
		if (!StringUtils.isEmpty(filterName)) {
			if (Character.isDigit(filterName.charAt(filterName.length() - 1))) {
				filterName = filterName.substring(0, filterName.length() - 1);
			}
			String[] nameArray = filterName.split("(?=\\p{Upper})");

			for (String seg : nameArray) {
				formattedFilterName.append(seg).append(" ");
			}
			formattedFilterName.append("(s)");
		}

		return formattedFilterName.toString();
	}

	/**
	 * Creates composite control and sets the default layout data.
	 *
	 * @param parent
	 *            the parent of the new composite
	 * @param numColumns
	 *            the number of columns for the new composite
	 * @return the newly-created coposite
	 */
	private Composite createComposite(Composite parent, int numColumns) {
		Composite composite = new Composite(parent, SWT.NULL);

		// GridLayout
		GridLayout layout = new GridLayout();
		layout.numColumns = numColumns;
		composite.setLayout(layout);

		// GridData
		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	/**
	 * (non-Javadoc)
	 * Method declared on PreferencePage
	 */
	@Override
	protected Control createContents(Composite parent) {
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "MDHTPreferences");

		Composite composite_textField = createComposite(parent, 2);
		cardinalityCheckBox = createCheckBox(
			composite_textField, CARDINALITY_CHECK_BOX_LABEL, CARDINALITY_CHECK_BOX_TOOLTIP);

		Composite pdf_composite_textField = createComposite(parent, 2);
		disablePdfGenerationCheckBox = createCheckBox(
			pdf_composite_textField, PDF_GEN_DISABLE_CHECK_BOX_LABEL, PDF_GEN_DISABLE_CHECK_BOX_TOOLTIP);

		Composite dob_composite_textField = createComposite(parent, 2);
		omitDOBCheckBox = createCheckBox(dob_composite_textField, OMIT_DOB_CHECK_BOX_LABEL, OMIT_DOB_CHECK_BOX_TOOLTIP);

		Composite validateion_composite_textField = createComposite(parent, 2);
		omitValidationCheckBox = createCheckBox(
			validateion_composite_textField, OMIT_VALIDATION_CHECK_BOX_LABEL, OMIT_VALIDATION_CHECK_BOX_TOOLTIP);

		Composite units_composite_textField = createComposite(parent, 2);
		omitUnitsCheckBox = createCheckBox(
			units_composite_textField, OMIT_UNITS_CHECK_BOX_LABEL, OMIT_UNITS_CHECK_BOX_TOOLTIP);

		Composite filterLabelComposite = createComposite(parent, 2);
		Label filterLabel = new Label(filterLabelComposite, SWT.LEFT);
		filterLabel.setText("CDA Default Report Filters");

		Composite filter_text = createComposite(parent, 1);
		// filter_text
		cdaReportFilterText = new Text(filter_text, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.LEFT);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.heightHint = 50;
		cdaReportFilterText.setLayoutData(gd);
		cdaReportFilterText.setEditable(false);

		Composite filter_composite = createComposite(parent, 2);
		createFilterButton(filter_composite, "Set Default Filters", "Set the default filters for CDA spreadsheet");

		initializeValues();

		return new Composite(parent, SWT.NULL);
	}

	/**
	 * The <code>ReadmePreferencePage</code> implementation of this <code>PreferencePage</code> method
	 * returns preference store that belongs to the our plugin.
	 * This is important because we want to store
	 * our preferences separately from the workbench.
	 */
	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	public void init(IWorkbench workbench) {
	}

	/**
	 * Initializes states of the controls using default values
	 * in the preference store.
	 */
	private void initializeDefaults() {
		IPreferenceStore store = getPreferenceStore();
		cardinalityCheckBox.setSelection(store.getDefaultBoolean(CARDINALITY_STORE_VALUE));
		disablePdfGenerationCheckBox.setSelection(store.getBoolean(PDF_GEN_STORE_VALUE));
		omitDOBCheckBox.setSelection(store.getBoolean(OMIT_DOB_STORE_VALUE));
		omitUnitsCheckBox.setSelection(store.getBoolean(OMIT_UNITS_STORE_VALUE));
		omitValidationCheckBox.setSelection(store.getBoolean(OMIT_VALIDATION_STORE_VALUE));
		cdaReportFilterText.setText(NONE);
	}

	/**
	 * Initializes states of the controls from the preference store.
	 */
	private void initializeValues() {
		IPreferenceStore store = getPreferenceStore();
		cardinalityCheckBox.setSelection(store.getBoolean(CARDINALITY_STORE_VALUE));
		disablePdfGenerationCheckBox.setSelection(store.getBoolean(PDF_GEN_STORE_VALUE));
		omitDOBCheckBox.setSelection(store.getBoolean(OMIT_DOB_STORE_VALUE));
		omitUnitsCheckBox.setSelection(store.getBoolean(OMIT_UNITS_STORE_VALUE));
		omitValidationCheckBox.setSelection(store.getBoolean(OMIT_VALIDATION_STORE_VALUE));
		String preferenceFilters = store.getString(CDA_REPORT_DEFAULT_FILTER);
		cdaReportFilterText.setText(formatFilterNames(Arrays.asList(preferenceFilters.split("\\s*,\\s*"))));
	}

	@Override
	protected void performDefaults() {
		super.performDefaults();
		initializeDefaults();
	}

	@Override
	public boolean performOk() {
		storeValues();
		return true;
	}

	/**
	 * Stores the values of the controls back to the preference store.
	 */
	private void storeValues() {
		IPreferenceStore store = getPreferenceStore();
		store.setValue(CARDINALITY_STORE_VALUE, cardinalityCheckBox.getSelection());
		store.setValue(PDF_GEN_STORE_VALUE, disablePdfGenerationCheckBox.getSelection());
		store.setValue(OMIT_DOB_STORE_VALUE, omitDOBCheckBox.getSelection());
		store.setValue(OMIT_UNITS_STORE_VALUE, omitUnitsCheckBox.getSelection());
		store.setValue(OMIT_VALIDATION_STORE_VALUE, omitValidationCheckBox.getSelection());
		StringBuilder sb = new StringBuilder();
		for (String filter : cdaReportfilters) {
			if (sb.length() > 0) {
				sb.append(",");
			}
			sb.append(filter);
		}
		store.setValue(CDA_REPORT_DEFAULT_FILTER, sb.toString());
	}

	void getFilterHash(HashMap<EClass, HashSet<EClass>> theSections) {

		EPackage consolPackage = EPackage.Registry.INSTANCE.getEPackage(CONSOLURI);

		TreeIterator<EObject> packageContents = consolPackage.eAllContents();

		ArrayList<EClass> packageSections = new ArrayList<EClass>();

		ArrayList<EClass> rootSections = new ArrayList<EClass>();

		while (packageContents.hasNext()) {

			EObject packageObject = packageContents.next();

			if (packageObject instanceof EClass) {
				EClass eClass = (EClass) packageObject;
				boolean isSection = false;
				for (EClass eClass2 : eClass.getEAllSuperTypes()) {
					if ("Section".equals(eClass2.getName())) {
						isSection = true;
						break;
					}
				}

				if (isSection) {
					packageSections.add(eClass);
				}

			}

		}

		Set<EClass> sectionBaseClasses = new HashSet<EClass>();

		for (EClass section : packageSections) {
			for (EClass parentSection : section.getESuperTypes()) {
				sectionBaseClasses.add(parentSection);
			}
		}

		Comparator<? super EClass> compare = new Comparator<EClass>() {

			@Override
			public int compare(EClass o1, EClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(packageSections, compare);

		for (EClass section : packageSections) {
			if (!sectionBaseClasses.contains(section)) {

				boolean isRealRoot = true;
				for (EClass sectionAgain : packageSections) {
					if (sectionAgain.getName().startsWith(section.getName()) &&
							!sectionAgain.getName().equals(section.getName())) {
						isRealRoot = false;
					}
				}
				if (isRealRoot) {
					rootSections.add(section);
				}
			}
		}

		for (EClass ec3 : rootSections) {
			theSections.put(ec3, new HashSet<EClass>());
			theSections.get(ec3).addAll(ec3.getEAllSuperTypes());
			theSections.get(ec3).add(ec3);

			for (EClass sectionAgain : packageSections) {
				if (ec3.getName().startsWith(sectionAgain.getName()) && !ec3.getName().equals(sectionAgain.getName())) {
					theSections.get(ec3).add(sectionAgain);
				}
			}
		}
	}

}
