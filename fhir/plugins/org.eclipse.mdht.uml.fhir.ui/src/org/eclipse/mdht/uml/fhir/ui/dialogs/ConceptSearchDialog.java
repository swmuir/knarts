package org.eclipse.mdht.uml.fhir.ui.dialogs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.mdht.uml.fhir.common.terminology.CodeSystem;
import org.eclipse.mdht.uml.fhir.common.terminology.Concept;
import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;
import org.eclipse.mdht.uml.fhir.transform.TerminologyCache;
import org.eclipse.mdht.uml.fhir.transform.TerminologyUtil;
import org.eclipse.mdht.uml.fhir.ui.Activator;
import org.eclipse.mdht.uml.fhir.ui.providers.DescriptionComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.statushandlers.StatusManager;


/**
 * @author <a href="mailto:dcarlson@xmlmodeling.com">Dave Carlson (XMLmodeling.com)</a> 
 */
public class ConceptSearchDialog extends Dialog {
	private List<ConceptDescriptor> topLevelConceptList = null;
	
	/** The size of the dialogs search history. */
	private static final int HISTORY_SIZE= 5;

	private List<String> searchTextHistory;
	
	private Combo codeSystemField;
	
	private CodeSystem codeSystem;

	private Combo searchParentField;
	
	private ConceptDescriptor parentConcept = null;
	
	private List<ConceptDescriptor> conceptResults = new ArrayList<ConceptDescriptor>();

	private Combo searchTextField;
	
	private Text integerIdField;

	private Button searchButton;
	
	private Rectangle fDialogPositionInit;

	private IDialogSettings fDialogSettings;
	
	/**
	 * Creates a new dialog with the given shell as parent.
	 * @param parentShell the parent shell
	 */
	public ConceptSearchDialog(Shell parentShell) {
		super(parentShell);

		fDialogPositionInit= null;
		searchTextHistory= new ArrayList<String>(HISTORY_SIZE - 1);

		readConfiguration();

//		setShellStyle(getShellStyle() ^ SWT.APPLICATION_MODAL | SWT.MODELESS);
		setBlockOnOpen(true);
	}
	
	public ConceptDescriptor getParentConcept() {
		return parentConcept;
	}
	
	public void setParentConcept(ConceptDescriptor parent) {
		parentConcept = parent;

		List<ConceptDescriptor> parents = topLevelConceptList;
		if (parentConcept != null && !parents.contains(parentConcept)) {
			parents.add(parentConcept);
		}

		if (searchParentField != null) {
			fillConceptList(searchParentField, parents);
			updateParentSelection();
		}
	}
	
	public List<ConceptDescriptor> getResults() {
		return conceptResults;
	}

	private void fillCodeSystemList(Combo comboBox, List<CodeSystem> codeSystems) {
		String[] items = new String[codeSystems.size()];
		
		int itemIndex = 0;
		for (CodeSystem codeSystem : codeSystems) {
			items[itemIndex++] = codeSystem.getName();
		}
		
		comboBox.setItems(items);
		comboBox.select(0);
		codeSystem = codeSystems.get(0);
	}

	private void updateParentSelection() {
		if (searchParentField != null) {
			if (parentConcept == null) {
				searchParentField.select(0);
			}
			else {
				searchParentField.select(topLevelConceptList.indexOf(parentConcept) + 1);
			}
		}
	}

	private List<ConceptDescriptor> getTopLevelConcepts() {
		topLevelConceptList = new ArrayList<ConceptDescriptor>();

		if (codeSystem != null) {
			try {
				List<Concept> rootConcepts = TerminologyCache.getInstance().getRootConcepts(codeSystem);
				for (Concept concept : rootConcepts) {
					List<ConceptDescriptor> children = concept.getChildren();
					for (ConceptDescriptor child : children) {
						topLevelConceptList.add(child);
					}
				}
			} catch (IOException e) {
				StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error getting root concepts for: " + codeSystem.getUri(), e), 
						StatusManager.SHOW | StatusManager.LOG);
			}
			
			// sort by label
			Collections.sort(topLevelConceptList, new DescriptionComparator());
		}
		
		return topLevelConceptList;
	}
	
	private void fillConceptList(Combo comboBox, List<ConceptDescriptor> concepts) {
		String[] items = new String[concepts.size() + 1];
		items[0] = "";
		
		int itemIndex = 1;
		for (ConceptDescriptor concept : concepts) {
			String desc = concept.getDefaultTerm();
			if (concept instanceof Concept) {
				TerminologyUtil.getPreferredSynonym((Concept)concept);
			}
			items[itemIndex++] = desc;
		}
		
		comboBox.setItems(items);
	}

	protected boolean isResizable() {
		return true;
	}

	/**
	 * Returns <code>true</code> if control can be used.
	 *
	 * @param control the control to be checked
	 * @return <code>true</code> if control can be used
	 */
	private boolean okToUse(Control control) {
		return control != null && !control.isDisposed();
	}

	/*
	 * @see org.eclipse.jface.window.Window#create()
	 */
	public void create() {
		super.create();

		Shell shell= getShell();

		// fill in combo contents
		updateCombo(searchTextField, searchTextHistory);

		// set dialog position
		if (fDialogPositionInit != null)
			shell.setBounds(fDialogPositionInit);

		shell.setText("Search Concepts");
		// shell.setImage(null);
	}

	/*
	 * @see org.eclipse.jface.window.Window#createContents(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createContents(Composite parent) {

		Composite panel = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.makeColumnsEqualWidth = true;
		panel.setLayout(layout);
		panel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Composite codeSystemGroup = createCodeSystemGroup(panel);
		setGridData(codeSystemGroup, SWT.FILL, true, SWT.TOP, false);

		Composite descriptionGroup = createDescriptionGroup(panel);
		setGridData(descriptionGroup, SWT.FILL, true, SWT.TOP, false);

		Composite identifierGroup = createIdentifierGroup(panel);
		setGridData(identifierGroup, SWT.FILL, true, SWT.TOP, false);

		Composite buttonPanelB = createButtonSection(panel);
		setGridData(buttonPanelB, SWT.FILL, true, SWT.BOTTOM, false);

		updateButtonState();

		applyDialogFont(panel);

		return panel;
	}

	/**
	 * Create a panel to select code system.
	 *
	 * @param parent the parent composite
	 * @return the description input panel
	 */
	private Composite createCodeSystemGroup(Composite parent) {
		Composite panel= new Composite(parent, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.marginWidth= 0;
		layout.marginHeight= 0;
		panel.setLayout(layout);

		Group group= new Group(panel, SWT.SHADOW_ETCHED_IN);
		group.setText("Code System to Search");
		GridLayout groupLayout= new GridLayout();
		groupLayout.numColumns= 2;
		group.setLayout(groupLayout);
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Label codeSystemLabel= new Label(group, SWT.LEFT);
		codeSystemLabel.setText("Code System");
		setGridData(codeSystemLabel, SWT.LEFT, false, SWT.CENTER, false);

		codeSystemField = new Combo(group, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		setGridData(codeSystemField, SWT.FILL, true, SWT.CENTER, false);
		addDecorationMargin(codeSystemField);
		fillCodeSystemList(codeSystemField, TerminologyCache.getInstance().getCodeSystems());
//		updateCodeSystemSelection();
		
		codeSystemField.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int idx = codeSystemField.getSelectionIndex();
				codeSystem = TerminologyCache.getInstance().getCodeSystems().get(idx);

				fillConceptList(searchParentField, getTopLevelConcepts());
				searchParentField.setEnabled(topLevelConceptList.size() > 0);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

		return panel;
	}

	/**
	 * Create a panel to search by description.
	 *
	 * @param parent the parent composite
	 * @return the description input panel
	 */
	private Composite createDescriptionGroup(Composite parent) {
		Composite panel= new Composite(parent, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.marginWidth= 0;
		layout.marginHeight= 0;
		panel.setLayout(layout);

		Group group= new Group(panel, SWT.SHADOW_ETCHED_IN);
		group.setText("Search by Description");
		GridLayout groupLayout= new GridLayout();
		groupLayout.numColumns= 2;
		group.setLayout(groupLayout);
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		ModifyListener listener= new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateFieldsEnabled();
				updateButtonState();
			}
		};

		Label parentLabel= new Label(group, SWT.LEFT);
		parentLabel.setText("Parent");
		setGridData(parentLabel, SWT.LEFT, false, SWT.CENTER, false);

		searchParentField= new Combo(group, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		setGridData(searchParentField, SWT.FILL, true, SWT.CENTER, false);
		addDecorationMargin(searchParentField);
		fillConceptList(searchParentField, getTopLevelConcepts());
		updateParentSelection();
		
		searchParentField.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int idx = searchParentField.getSelectionIndex();
				if (idx == 0) {
					parentConcept = null;
				}
				else {
					parentConcept = topLevelConceptList.get(idx-1);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		Label textLabel= new Label(group, SWT.LEFT);
		textLabel.setText("Text");
		setGridData(textLabel, SWT.LEFT, false, SWT.CENTER, false);

		searchTextField= new Combo(group, SWT.DROP_DOWN | SWT.BORDER);
		setGridData(searchTextField, SWT.FILL, true, SWT.CENTER, false);
		addDecorationMargin(searchTextField);
		searchTextField.addModifyListener(listener);

		return panel;
	}

	/**
	 * Create a panel to search by integer ID or UUID.
	 *
	 * @param parent the parent composite
	 * @return the ID input panel
	 */
	private Composite createIdentifierGroup(Composite parent) {

		Composite panel= new Composite(parent, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.marginWidth= 0;
		layout.marginHeight= 0;
		panel.setLayout(layout);

		Group group= new Group(panel, SWT.SHADOW_ETCHED_IN);
		group.setText("Search by ID");
		GridLayout groupLayout= new GridLayout();
		groupLayout.numColumns= 2;
		group.setLayout(groupLayout);
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		ModifyListener listener= new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateFieldsEnabled();
				updateButtonState();
			}
		};

		Label intIdLabel= new Label(group, SWT.LEFT);
		intIdLabel.setText("Concept ID");
		setGridData(intIdLabel, SWT.LEFT, false, SWT.CENTER, false);

		integerIdField = new Text(group, SWT.BORDER);
		setGridData(integerIdField, SWT.FILL, true, SWT.CENTER, false);
		addDecorationMargin(integerIdField);
		integerIdField.addModifyListener(listener);

		return panel;
	}

	/**
	 * Create Search and Close buttons.
	 *
	 * @param parent the parent composite
	 * @return the button panel
	 */
	private Composite createButtonSection(Composite parent) {
		Composite panel= new Composite(parent, SWT.NULL);
		GridLayout layout= new GridLayout();
		layout.numColumns= 2;
		layout.marginWidth= 0;
		layout.marginHeight= 0;
		panel.setLayout(layout);

		searchButton= makeButton(panel, "Search", 102, true, new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				performSearch();
				updateFindHistory();
				close();
			}
		});
		setGridData(searchButton, SWT.LEFT, false, SWT.BOTTOM, false);

		Button closeButton = createButton(panel, 101, "Close", false);
		setGridData(closeButton, SWT.RIGHT, false, SWT.BOTTOM, false);

		return panel;
	}

	/*
	 * @see Dialog#buttonPressed
	 */
	protected void buttonPressed(int buttonID) {
		if (buttonID == 101)
			close();
	}


	/**
	 * Returns the dialog's boundaries.
	 * @return the dialog's boundaries
	 */
	private Rectangle getDialogBoundaries() {
		if (okToUse(getShell()))
			return getShell().getBounds();
		return fDialogPositionInit;
	}

	/*
	 * @see org.eclipse.jface.dialogs.Dialog#getInitialSize()
	 */
	protected Point getInitialSize() {
		Point initialSize= super.getInitialSize();
		Point minSize= getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
		if (initialSize.x < minSize.x || initialSize.y < minSize.y)
			return minSize;
		return initialSize;
	}

	/**
	 * Returns the dialog's history.
	 * @return the dialog's history
	 */
	private List<String> getFindHistory() {
		return searchTextHistory;
	}
	/**
	 * Retrieves the string to search for from the appropriate text input field and returns it.
	 * @return the search string
	 */
	private String getFindString() {
		if (okToUse(searchTextField)) {
			return searchTextField.getText();
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.jface.window.Window#close()
	 */
	public boolean close() {
		handleDialogClose();
		return super.close();
	}

	/**
	 * Removes focus changed listener from browser and stores settings for re-open.
	 */
	private void handleDialogClose() {
		// store current settings in case of re-open
		storeSettings();

	}

	/**
	 * Stores the current state in the dialog settings.
	 */
	private void storeSettings() {
		fDialogPositionInit= getDialogBoundaries();

		writeConfiguration();
	}

	/**
	 * Creates a button.
	 * @param parent the parent control
	 * @param label the button label
	 * @param id the button id
	 * @param dfltButton is this button the default button
	 * @param listener a button pressed listener
	 * @return the new button
	 */
	private Button makeButton(Composite parent, String label, int id, boolean dfltButton, SelectionListener listener) {
		Button button= createButton(parent, id, label, dfltButton);
		button.addSelectionListener(listener);
		return button;
	}
	
	private void performSearch() {
		if (searchTextField.getText().length() > 0) {
			performDescriptionSearch();
		}
		else if (integerIdField.getText().length() > 0) {
			performIdSearch();
		}
	}

	/**
	 * Search for concept(s) using description.
	 */
	private void performDescriptionSearch() {
		conceptResults = new ArrayList<ConceptDescriptor>();
		String matchText = searchTextField.getText();
		if (matchText != null && matchText.length() > 0) {
			try {
				String parentConceptId = null;
				if (parentConcept != null) {
					parentConceptId = parentConcept.getConceptId();
				}
				
				List<ConceptDescriptor> results = TerminologyCache.getInstance().searchDescriptions(codeSystem, parentConceptId, matchText);
				conceptResults.addAll(results);

			} catch (Exception e) {
				StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error searching by description", e), 
						StatusManager.SHOW | StatusManager.LOG);
			}
		}
	}

	/**
	 * Search for concept(s) using concept ID.
	 */
	private void performIdSearch() {
		conceptResults = new ArrayList<ConceptDescriptor>();
		String idValue = integerIdField.getText();
		if (idValue != null && idValue.length() > 0) {
			
			try {
				Concept concept = TerminologyCache.getInstance().getConcept(codeSystem, idValue);
				if (concept != null) {
					conceptResults.add(concept);
				}

			} catch (Exception e) {
				StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error finding concept by ID", e), 
						StatusManager.SHOW | StatusManager.LOG);
			}
		}
	}

	/**
	 * Attaches the given layout specification to the <code>component</code>.
	 *
	 * @param component the component
	 * @param horizontalAlignment horizontal alignment
	 * @param grabExcessHorizontalSpace grab excess horizontal space
	 * @param verticalAlignment vertical alignment
	 * @param grabExcessVerticalSpace grab excess vertical space
	 */
	private void setGridData(Control component, int horizontalAlignment, boolean grabExcessHorizontalSpace, int verticalAlignment, boolean grabExcessVerticalSpace) {
		GridData gd;
		if (component instanceof Button && (((Button)component).getStyle() & SWT.PUSH) != 0) {
//			SWTUtil.setButtonDimensionHint((Button)component);
			gd= (GridData)component.getLayoutData();
		} else {
			gd= new GridData();
			component.setLayoutData(gd);
			gd.horizontalAlignment= horizontalAlignment;
			gd.grabExcessHorizontalSpace= grabExcessHorizontalSpace;
		}
		gd.verticalAlignment= verticalAlignment;
		gd.grabExcessVerticalSpace= grabExcessVerticalSpace;
	}

	/**
	 * Adds enough space in the control's layout data margin for the content assist
	 * decoration.
	 * @param control the control that needs a margin
	 */
	private void addDecorationMargin(Control control) {
		Object layoutData= control.getLayoutData();
		if (!(layoutData instanceof GridData))
			return;
		GridData gd= (GridData)layoutData;
		FieldDecoration dec= FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
		gd.horizontalIndent= dec.getImage().getBounds().width;
	}

	/**
	 * Updates the enabled state of the fields.
	 */
	private void updateFieldsEnabled() {
		if (searchTextField.getText().length() > 0) {
			integerIdField.setEnabled(false);
		}
		else if (integerIdField.getText().length() > 0) {
			searchTextField.setEnabled(false);
		}
		else {
			searchTextField.setEnabled(true);
			integerIdField.setEnabled(true);
		}
	}

	/**
	 * Updates the enabled state of the buttons.
	 */
	private void updateButtonState() {
//		if (okToUse(getShell()) && okToUse(searchButton)) {
//
//			String str= getFindString();
//			boolean hasSearchText = str != null && str.length() > 0;
//
//			searchButton.setEnabled(hasSearchText);
//		}
		
		boolean enabled = searchTextField.getText().length() > 0
				|| integerIdField.getText().length() > 0;
		searchButton.setEnabled(enabled);
	}

	/**
	 * Updates the given combo with the given content.
	 * @param combo combo to be updated
	 * @param content to be put into the combo
	 */
	private void updateCombo(Combo combo, List<String> content) {
		combo.removeAll();
		for (int i= 0; i < content.size(); i++) {
			combo.add(content.get(i));
		}
	}

	/**
	 * Called after executed find action to update the history.
	 */
	private void updateFindHistory() {
		if (okToUse(searchTextField)) {
//			searchTextField.removeModifyListener(fFindModifyListener);
			updateHistory(searchTextField, searchTextHistory);
//			searchTextField.addModifyListener(fFindModifyListener);
		}
	}

	/**
	 * Updates the combo with the history.
	 * @param combo to be updated
	 * @param history to be put into the combo
	 */
	private void updateHistory(Combo combo, List<String> history) {
		String findString= combo.getText();
		int index= history.indexOf(findString);
		if (index != 0) {
			if (index != -1) {
				history.remove(index);
			}
			history.add(0, findString);
			Point selection= combo.getSelection();
			updateCombo(combo, history);
			combo.setText(findString);
			combo.setSelection(selection);
		}
	}

	//--------------- configuration handling --------------

	/**
	 * Returns the dialog settings object used to share state
	 * between several find/replace dialogs.
	 *
	 * @return the dialog settings to be used
	 */
	private IDialogSettings getDialogSettings() {
		IDialogSettings settings= Activator.getDefault().getDialogSettings();
		fDialogSettings= settings.getSection(getClass().getName());
		if (fDialogSettings == null)
			fDialogSettings= settings.addNewSection(getClass().getName());
		return fDialogSettings;
	}

	/*
	 * @see org.eclipse.jface.dialogs.Dialog#getDialogBoundsSettings()
	 */
	protected IDialogSettings getDialogBoundsSettings() {
		String sectionName= getClass().getName() + "_dialogBounds"; //$NON-NLS-1$
		IDialogSettings settings= Activator.getDefault().getDialogSettings();
		IDialogSettings section= settings.getSection(sectionName);
		if (section == null)
			section= settings.addNewSection(sectionName);
		return section;
	}

	/*
	 * @see org.eclipse.jface.dialogs.Dialog#getDialogBoundsStrategy()
	 */
	protected int getDialogBoundsStrategy() {
		return DIALOG_PERSISTLOCATION | DIALOG_PERSISTSIZE;
	}

	/**
	 * Initializes itself from the dialog settings with the same state
	 * as at the previous invocation.
	 */
	private void readConfiguration() {
		IDialogSettings s= getDialogSettings();

//		fWrapInit= s.get("wrap") == null || s.getBoolean("wrap"); //$NON-NLS-1$ //$NON-NLS-2$
//		fCaseInit= s.getBoolean("casesensitive"); //$NON-NLS-1$
//		fWholeWordInit= s.getBoolean("wholeword"); //$NON-NLS-1$
//		fIncrementalInit= s.getBoolean("incremental"); //$NON-NLS-1$
//		fIsRegExInit= s.getBoolean("isRegEx"); //$NON-NLS-1$

		String[] findHistory= s.getArray("findhistory"); //$NON-NLS-1$
		if (findHistory != null) {
			List<String> history= getFindHistory();
			history.clear();
			for (int i= 0; i < findHistory.length; i++)
				history.add(findHistory[i]);
		}

	}

	/**
	 * Stores its current configuration in the dialog store.
	 */
	private void writeConfiguration() {
		IDialogSettings s= getDialogSettings();

//		s.put("wrap", fWrapInit); //$NON-NLS-1$
//		s.put("casesensitive", fCaseInit); //$NON-NLS-1$
//		s.put("wholeword", fWholeWordInit); //$NON-NLS-1$
//		s.put("incremental", fIncrementalInit); //$NON-NLS-1$
//		s.put("isRegEx", fIsRegExInit); //$NON-NLS-1$

		List<String> history= getFindHistory();
		String findString= getFindString();
		if (findString.length() > 0)
			history.add(0, findString);
		writeHistory(history, s, "findhistory"); //$NON-NLS-1$
	}

	/**
	 * Writes the given history into the given dialog store.
	 *
	 * @param history the history
	 * @param settings the dialog settings
	 * @param sectionName the section name
	 * @since 3.2
	 */
	private void writeHistory(List<String> history, IDialogSettings settings, String sectionName) {
		int itemCount= history.size();
		Set<String> distinctItems= new HashSet<String>(itemCount);
		for (int i= 0; i < itemCount; i++) {
			String item = (String)history.get(i);
			if (distinctItems.contains(item)) {
				history.remove(i--);
				itemCount--;
			} else {
				distinctItems.add(item);
			}
		}

		while (history.size() > 8)
			history.remove(8);

		String[] names= new String[history.size()];
		history.toArray(names);
		settings.put(sectionName, names);

	}
}
