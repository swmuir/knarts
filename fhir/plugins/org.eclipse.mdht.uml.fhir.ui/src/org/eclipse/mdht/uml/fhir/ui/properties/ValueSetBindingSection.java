/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.properties;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.fhir.BindingStrengthKind;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.mdht.uml.fhir.ValueSetBinding;
import org.eclipse.mdht.uml.fhir.ui.dialogs.FHIRDialogUtil;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * The profile properties section for Value Set Binding.
 */
public class ValueSetBindingSection extends ResettableModelerPropertySection {

	protected Property property;

	private CCombo bindingStrengthCombo;

	private boolean bindingStrengthModified = false;

	private Text descriptionText;

	private boolean descriptionModified = false;

	private Button searchValueSetsButton;

	private CLabel valueSetLabel;

	private Button valueSetButton;

	private Button valueSetDeleteButton;

	private Text valueSetUriText;

	private boolean valueSetUriModified = false;

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		Point point = gc.textExtent("");//$NON-NLS-1$
		int buttonHeight = point.y + 10;
		// int charHeight = point.y;
		gc.dispose();
		shell.dispose();

		Composite composite = getWidgetFactory().createFlatFormComposite(parent);

		int numberOfRows = 4;
		FormData data = null;

		/* ---- Binding strength combo ---- */
		bindingStrengthCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT);
		bindingStrengthCombo.setItems(new String[] { "required", "extensible", "preferred", "example" });
		bindingStrengthCombo.setVisibleItemCount(5);
		bindingStrengthCombo.setEditable(false);
		bindingStrengthCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				bindingStrengthModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				bindingStrengthModified = true;
				modifyFields();
			}
		});

		CLabel bindingStrengthLabel = getWidgetFactory().createCLabel(composite, "Strength:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(bindingStrengthCombo, 0, SWT.CENTER);
		bindingStrengthLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(bindingStrengthLabel, 0);
		data.top = new FormAttachment(0, 2, ITabbedPropertyConstants.VSPACE);
		bindingStrengthCombo.setLayoutData(data);

		CLabel descriptionLabel = getWidgetFactory().createCLabel(composite, "Description:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(bindingStrengthCombo, 10);
		data.top = new FormAttachment(bindingStrengthCombo, 0, SWT.CENTER);
		descriptionLabel.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(bindingStrengthCombo, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

		descriptionText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(descriptionLabel, 0);
		data.right = new FormAttachment(restoreDefaultsButton, ITabbedPropertyConstants.VSPACE);
		data.top = new FormAttachment(bindingStrengthCombo, 0, SWT.CENTER);
		descriptionText.setLayoutData(data);


		/* ------ Value set reference ------ */
		valueSetLabel = getWidgetFactory().createCLabel(composite, ""); //$NON-NLS-1$

		valueSetButton = getWidgetFactory().createButton(composite, "Select Value Set", SWT.PUSH); //$NON-NLS-1$
		valueSetButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				addValueSetReference();
			}
		});

		searchValueSetsButton = getWidgetFactory().createButton(composite, "Search", SWT.PUSH); //$NON-NLS-1$
		searchValueSetsButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				addValueSetFromSearch();
			}
		});

		valueSetDeleteButton = getWidgetFactory().createButton(composite, "X", SWT.PUSH); //$NON-NLS-1$
		valueSetDeleteButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				deleteValueSetReference();
			}
		});

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.height = buttonHeight;
		data.top = new FormAttachment(1, numberOfRows, ITabbedPropertyConstants.VSPACE + 5);
		valueSetButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(valueSetButton, 0);
		data.height = buttonHeight;
		data.top = new FormAttachment(valueSetButton, 0, SWT.CENTER);
		searchValueSetsButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(searchValueSetsButton, 0);
		data.height = buttonHeight;
		data.top = new FormAttachment(searchValueSetsButton, 0, SWT.CENTER);
		valueSetDeleteButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(valueSetDeleteButton, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(valueSetButton, 0, SWT.CENTER);
		valueSetLabel.setLayoutData(data);

		CLabel valueSetUriLabel = getWidgetFactory().createCLabel(composite, "OR, Value Set URI:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(2, numberOfRows, ITabbedPropertyConstants.VSPACE + 5);
		valueSetUriLabel.setLayoutData(data);
		
		valueSetUriText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(valueSetUriLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(valueSetUriLabel, 0, SWT.CENTER);
		valueSetUriText.setLayoutData(data);

		CLabel referenceConstraintLabel = getWidgetFactory().createCLabel(composite, 
				"Only ONE may be specified, value set reference or value set URI.");
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(3, numberOfRows, ITabbedPropertyConstants.VSPACE + 2);
		referenceConstraintLabel.setLayoutData(data);
		
	}

	@Override
	public void refresh() {
		ValueSetBinding binding = (ValueSetBinding) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getValueSetBinding());
		if (binding != null) {
			if (binding.getStrength() != null) {
				bindingStrengthCombo.setText(binding.getStrength().getName());
			}
			else {
				bindingStrengthCombo.setText("example");
			}
			
			if (binding.getValueSetReference() != null) {
				ValueSet valueSet = binding.getValueSetReference();
				String label = "";
				if (valueSet.getName() != null) {
					label += valueSet.getName();
				}
				else {
					label += valueSet.getBase_Enumeration().getName();
				}
				
				if (valueSet.getUri() != null) {
					label += " (" + valueSet.getUri() + ")";
				}
				valueSetLabel.setText(label);
				
			} else {
				valueSetLabel.setText("");
			}
			valueSetLabel.layout();

			refreshDescriptionText(binding);
			refreshValueSetUriText(binding);
		}
		else {
			bindingStrengthCombo.setText("");
			descriptionText.setText("");
			valueSetLabel.setText("");
			valueSetUriText.setText("");
		}

		if (isReadOnly()) {
			restoreDefaultsButton.setEnabled(false);
			bindingStrengthCombo.setEnabled(false);
			valueSetButton.setEnabled(false);
			valueSetDeleteButton.setEnabled(false);
			searchValueSetsButton.setEnabled(false);
		} 
		else {
			restoreDefaultsButton.setEnabled(binding != null);
			bindingStrengthCombo.setEnabled(true);
			valueSetButton.setEnabled(true);
			valueSetDeleteButton.setEnabled(true);
			searchValueSetsButton.setEnabled(true);
		}
	}

	protected void refreshDescriptionText(ValueSetBinding binding) {
		descriptionText.removeModifyListener(modifyListener);
		descriptionText.removeKeyListener(keyListener);
		descriptionText.removeFocusListener(focusListener);
		if (binding.getDescription() != null) {
			descriptionText.setText(binding.getDescription());
		}
		else {
			descriptionText.setText("");
		}
		descriptionText.addModifyListener(modifyListener);
		descriptionText.addKeyListener(keyListener);
		descriptionText.addFocusListener(focusListener);

		descriptionText.setEnabled(!isReadOnly());
	}

	protected void refreshValueSetUriText(ValueSetBinding binding) {
		valueSetUriText.removeModifyListener(modifyListener);
		valueSetUriText.removeKeyListener(keyListener);
		valueSetUriText.removeFocusListener(focusListener);
		if (binding.getValueSetUri() != null) {
			valueSetUriText.setText(binding.getValueSetUri());
		}
		else {
			valueSetUriText.setText("");
		}
		valueSetUriText.addModifyListener(modifyListener);
		valueSetUriText.addKeyListener(keyListener);
		valueSetUriText.addFocusListener(focusListener);

		valueSetUriText.setEnabled(!isReadOnly());
	}

	@Override
	protected void resetFields() {

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Restore Default Values") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					ValueSetBinding binding = (ValueSetBinding) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getValueSetBinding());
					if (binding == null) {
						return Status.CANCEL_STATUS;
					}
					
					Stereotype stereotype = (ProfileUtil.getStereotype(binding));
					if (stereotype != null) {
						property.unapplyStereotype(stereotype);
						updateViews();
						refresh();
					}

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}
	
	private ValueSetBinding getValueSetBinding() {
		ValueSetBinding valueSetBinding = null;
		
		Profile fhirProfile = org.eclipse.uml2.uml.util.UMLUtil.getProfile(
				FHIRPackage.eINSTANCE.getValueSetBinding().getEPackage(), property);
		if (fhirProfile != null) {
			valueSetBinding = (ValueSetBinding) org.eclipse.uml2.uml.util.UMLUtil.safeApplyStereotype(property, fhirProfile.getOwnedStereotype(FHIRPackage.eINSTANCE.getValueSetBinding().getName()));
		}
		
		return valueSetBinding;
	}

	private void modifyFields() {
		if (!(bindingStrengthModified | descriptionModified | valueSetUriModified)) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (bindingStrengthModified) {
						bindingStrengthModified = false;
						this.setLabel("Set Binding Strength");
						try {
							ValueSetBinding binding = getValueSetBinding();
							if (binding != null) {
								BindingStrengthKind strength = BindingStrengthKind.get(bindingStrengthCombo.getText());
								if (strength != null) {
									binding.setStrength(strength);
								}
							}

						} catch (IllegalArgumentException e) {
							return Status.CANCEL_STATUS;
						}
					}
					else if (descriptionModified) {
						descriptionModified = false;
						this.setLabel("Set Binding Description");

						ValueSetBinding binding = getValueSetBinding();
						if (binding != null) {
							binding.setDescription(descriptionText.getText());
						}
					}
					else if (valueSetUriModified) {
						valueSetUriModified = false;
						this.setLabel("Set Binding URI");

						ValueSetBinding binding = getValueSetBinding();
						if (binding != null) {
							binding.setValueSetUri(valueSetUriText.getText());
							binding.setValueSetReference(null);
						}
					}
					else {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	protected void addValueSetFromSearch() {
		/*
		ConceptListDialog searchDialog = new ConceptListDialog(getPart().getSite().getShell());
		searchDialog.open();

		Concept selectedConcept = null;
		Object[] result = searchDialog.getResult();
		if (result != null) {
			for (int i = 0; i < result.length; i++) {
				if (result[i] instanceof Concept) {
					selectedConcept = (Concept) result[i];
					break;
				}
			}
		}
		if (selectedConcept != null) {
			final Concept conceptDescriptor = selectedConcept;
			try {
				TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

				IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
					@Override
					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
						this.setLabel("Set Meaning concept");

						try {
							ConceptSystem conceptSystem = null;
							
//							ConceptSystem conceptSystem = OTFConceptSystemUtil.getConceptSystem(
//								UMLUtil.getTopPackage(property), "SOLOR System");
	
							if (conceptSystem != null) {
//								final Concept concept = OTFConceptSystemUtil.getConcept(
//										conceptSystem, conceptDescriptor.getPrimordialUuid().toString(), conceptDescriptor.getDefaultTerm());
//	
//								addConcept(concept);
								refresh();
	
								return Status.OK_STATUS;
							} else {
								return Status.CANCEL_STATUS;
							}
						} catch (Exception e) {
							//TODO log error
							e.printStackTrace();
							return Status.CANCEL_STATUS;
						}
					}
				};

				execute(operation);

			} catch (Exception e) {
				throw new RuntimeException(e.getCause());
			}
		}
		*/
	}
	
	protected void addValueSetReference() {
		final ValueSet valueSet = FHIRDialogUtil.selectValueSet(
			property.eResource().getResourceSet(), getPart().getSite().getShell());
		if (valueSet == null) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					this.setLabel("Set ValueSet reference");

					addValueSet(valueSet);
					refresh();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void addValueSet(ValueSet valueSet) {
		Profile fhirProfile = org.eclipse.uml2.uml.util.UMLUtil.getProfile(
				FHIRPackage.eINSTANCE.getValueSetBinding().getEPackage(), property);
		if (fhirProfile != null) {
			ValueSetBinding valueSetBinding = (ValueSetBinding) org.eclipse.uml2.uml.util.UMLUtil.safeApplyStereotype(property, fhirProfile.getOwnedStereotype(FHIRPackage.eINSTANCE.getValueSetBinding().getName()));

			if (valueSetBinding.getValueSetReference() == null || !valueSetBinding.getValueSetReference().equals(valueSet)) {
				valueSetBinding.setValueSetReference(valueSet);
				valueSetBinding.setDescription(valueSet.getName());
				
				// only one reference may be specified
				valueSetBinding.setValueSetUri(null);
			}
		}
	}

	protected void deleteValueSetReference() {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					this.setLabel("Remove Value Set reference");
					
					ValueSetBinding binding = (ValueSetBinding) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getValueSetBinding());
					if (binding != null) {
						binding.setValueSetReference(null);
					}

					refresh();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (descriptionText == event.getSource()) {
				descriptionModified = true;
			}
			if (valueSetUriText == event.getSource()) {
				valueSetUriModified = true;
			}
		}
	};

	private KeyListener keyListener = new KeyListener() {
		public void keyPressed(KeyEvent e) {
			// do nothing
		}

		public void keyReleased(KeyEvent e) {
			if (SWT.CR == e.character || SWT.KEYPAD_CR == e.character) {
				modifyFields();
			}
		}
	};

	private FocusListener focusListener = new FocusListener() {
		public void focusGained(FocusEvent e) {
			// do nothing
		}

		public void focusLost(FocusEvent event) {
			modifyFields();
		}
	};

	@Override
	protected boolean isReadOnly() {
		if (property != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);
			if (editingDomain != null && editingDomain.isReadOnly(property.eResource())) {
				return true;
			}
		}

		return super.isReadOnly();
	}

	/*
	 * Override super implementation to allow for objects that are not IAdaptable.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection#addToEObjectList(java.lang.Object)
	 */
	@Override
	protected boolean addToEObjectList(Object object) {
		boolean added = super.addToEObjectList(object);
		if (!added && object instanceof Element) {
			getEObjectList().add(object);
			added = true;
		}
		return added;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		EObject element = getEObject();

		if (element instanceof Association) {
			element = UMLUtil.getNavigableEnd((Association) element);
		}
		Assert.isTrue(element instanceof Property);
		this.property = (Property) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	/**
	 * Update if necessary, upon receiving the model event.
	 * 
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * @param notification
	 *            -
	 *            even notification
	 * @param element
	 *            -
	 *            element that has changed
	 */
	@Override
	public void update(final Notification notification, EObject element) {
		if (!isDisposed()) {
			postUpdateRequest(new Runnable() {

				public void run() {
					// widget not disposed and UML element is not deleted
					if (!isDisposed() && property.eResource() != null) {
						refresh();
					}
				}
			});
		}
	}

	protected void updateViews() {
		// fire notification for any stereotype umlClass changes to update views
		// this is a bogus notification of change to umlClass name, but can't find a better option
		Notification notification = new NotificationImpl(Notification.SET, null, property.getName()) {
			@Override
			public Object getNotifier() {
				return property;
			}

			@Override
			public int getFeatureID(java.lang.Class expectedClass) {
				return UMLPackage.PROPERTY__NAME;
			}
		};
		property.eNotify(notification);
	}
}
