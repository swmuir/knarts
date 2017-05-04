/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding support for restoring defaults
 *     Christian W. Damus - implement handling of live validation roll-back (artf3318)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.term.ui.properties;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.ui.search.IElementFilter;
import org.eclipse.mdht.uml.common.ui.util.UMLUIUtil;
import org.eclipse.mdht.uml.term.core.profile.BindingKind;
import org.eclipse.mdht.uml.term.core.profile.Extensibility;
import org.eclipse.mdht.uml.term.core.profile.Guidance;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
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
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * The profile properties section for Value Set Constraint.
 */
public class ValueSetConstraintSection extends ResettableModelerPropertySection {

	private class ComboEnumeration {

		private CCombo enumerationCombo;

		private boolean modified = false;

		/**
		 * @return the enumerationCombo
		 */
		public CCombo getEnumerationCombo() {
			return enumerationCombo;
		}

		/**
		 * @param cCombo
		 * @param enumerator
		 */
		public ComboEnumeration(Composite composite, Control top, Control left, String name, List values) {
			super();

			/* ---- binding combo ---- */

			enumerationCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);

			// enumerationCombo.setToolTipText("tool tip here");

			for (Object object : values) {
				if (object instanceof Enumerator) {
					Enumerator enumerator = (Enumerator) object;
					enumerationCombo.add(enumerator.getLiteral(), enumerator.getValue());
				}

			}

			enumerationCombo.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
					modified = true;
					modifyFields();
				}

				public void widgetSelected(SelectionEvent e) {
					modified = true;
					modifyFields();
				}
			});

			CLabel bindingLabel = getWidgetFactory().createCLabel(composite, name); // $NON-NLS-1$
			FormData data = new FormData();
			if (left != null) {
				data.left = new FormAttachment(left, 0);
			} else {
				data.left = new FormAttachment(0, 0);
			}
			data.top = new FormAttachment(top, 0);
			bindingLabel.setLayoutData(data);

			data = new FormData();
			data.left = new FormAttachment(bindingLabel, 0);
			data.top = new FormAttachment(top, 0);
			enumerationCombo.setLayoutData(data);
		}

	}

	private Property property;

	private Text idText;

	private boolean idModified = false;

	private Text nameText;

	private boolean nameModified = false;

	private Text versionText;

	private boolean versionModified = false;

	private CCombo bindingCombo;

	private boolean bindingModified = false;

	private Text valueSetRefText;

	private boolean valueSetRefTextModified = false;

	private Button valueSetRefButton;

	private Button valueSetRefDeleteButton;

	ComboEnumeration guidanceEnumeration = null;

	ComboEnumeration extensibilityEnumeration = null;

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent event) {
			if (idText == event.getSource()) {
				idModified = true;
			}
			if (nameText == event.getSource()) {
				nameModified = true;
			}
			if (versionText == event.getSource()) {
				versionModified = true;
			}

			if (valueSetRefText == event.getSource()) {
				valueSetRefTextModified = true;
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
			modifyFields();
		}

		public void focusLost(FocusEvent event) {
			modifyFields();
		}
	};

	private void modifyFields() {
		if (!(idModified || nameModified || versionModified || bindingModified || valueSetRefTextModified ||
				(guidanceEnumeration != null & guidanceEnumeration.modified) ||
				(extensibilityEnumeration != null & extensibilityEnumeration.modified))) {
			return;
		}

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Profile ctsProfile = TermProfileUtil.getTerminologyProfile(property.eResource().getResourceSet());
					if (ctsProfile == null) {
						return Status.CANCEL_STATUS;
					}
					Enumeration bindingKind = (Enumeration) ctsProfile.getOwnedType(ITermProfileConstants.BINDING_KIND);

					Stereotype stereotype = TermProfileUtil.getAppliedStereotype(
						property, ITermProfileConstants.VALUE_SET_CONSTRAINT);

					ValueSetConstraint valueSetConstraint = (ValueSetConstraint) property.getStereotypeApplication(
						stereotype);

					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					} else if (idModified) {
						idModified = false;
						this.setLabel("Set Value Set ID");

						if (stereotype != null) {
							String value = idText.getText().trim();
							property.setValue(
								stereotype, ITermProfileConstants.VALUE_SET_CONSTRAINT_ID, value.length() > 0
										? value
										: null);

						}
					} else if (nameModified) {
						nameModified = false;
						this.setLabel("Set Value Set Name");

						if (stereotype != null) {
							String value = nameText.getText().trim();
							property.setValue(
								stereotype, ITermProfileConstants.VALUE_SET_CONSTRAINT_NAME, value.length() > 0
										? value
										: null);

						}
					} else if (versionModified) {
						versionModified = false;
						this.setLabel("Set Value Set Version");

						if (stereotype != null) {
							String value = versionText.getText().trim();
							property.setValue(
								stereotype, ITermProfileConstants.VALUE_SET_CONSTRAINT_VERSION, value.length() > 0
										? value
										: null);

						}
					} else if (valueSetRefTextModified) {
						valueSetRefTextModified = false;
						this.setLabel("Set valueSetRefTextModified");

						if (valueSetConstraint != null) {
							valueSetConstraint.setUri(valueSetRefText.getText().trim());
						}
					} else if (bindingModified) {
						bindingModified = false;
						this.setLabel("Set Binding");
						if (stereotype != null && bindingKind != null) {
							if (bindingCombo.getSelectionIndex() == 0) {
								// remove stereotype property
								property.setValue(stereotype, ITermProfileConstants.VALUE_SET_CONSTRAINT_BINDING, null);
							} else {
								EnumerationLiteral literal = bindingKind.getOwnedLiterals().get(
									bindingCombo.getSelectionIndex());
								property.setValue(
									stereotype, ITermProfileConstants.VALUE_SET_CONSTRAINT_BINDING, literal);
							}
						}
					} else if ((guidanceEnumeration != null & guidanceEnumeration.modified)) {

						this.setLabel("Set Guidance");
						if (valueSetConstraint != null) {

							if (guidanceEnumeration.getEnumerationCombo().getSelectionIndex() == 0) {
								valueSetConstraint.setGuidance(null);
							} else {
								valueSetConstraint.setGuidance(
									Guidance.get(guidanceEnumeration.getEnumerationCombo().getSelectionIndex()));
							}
							guidanceEnumeration.modified = false;
						}

					} else if ((extensibilityEnumeration != null & extensibilityEnumeration.modified)) {

						this.setLabel("Set Extensibility");
						if (valueSetConstraint != null) {

							if (extensibilityEnumeration.getEnumerationCombo().getSelectionIndex() == 0) {
								valueSetConstraint.setExtensibility(null);
							} else {
								valueSetConstraint.setExtensibility(
									Extensibility.get(
										extensibilityEnumeration.getEnumerationCombo().getSelectionIndex()));
							}

							extensibilityEnumeration.modified = false;
						}

					} else {
						return Status.CANCEL_STATUS;
					}

					updateViews();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	protected void resetFields() {

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Restore Default Values") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);

					if (valueSetConstraint == null) {
						return Status.CANCEL_STATUS;
					}

					valueSetConstraint.eUnset(TermPackage.Literals.VALUE_SET_CONSTRAINT__IDENTIFIER);
					valueSetConstraint.eUnset(TermPackage.Literals.VALUE_SET_CONSTRAINT__NAME);
					valueSetConstraint.eUnset(TermPackage.Literals.VALUE_SET_CONSTRAINT__VERSION);
					valueSetConstraint.eUnset(TermPackage.Literals.VALUE_SET_CONSTRAINT__BINDING);

					updateViews();
					refresh();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void addValueSetReference() {

		IElementFilter filter = new IElementFilter() {
			public boolean accept(Element element) {
				if ((element instanceof Enumeration) &&
						TermProfileUtil.getValueSetVersion((Enumeration) element) != null) {
					return true;
				}
				return false;
			}
		};

		final Enumeration valueSetEnum = (Enumeration) DialogLaunchUtil.chooseElement(
			filter, UMLUIUtil.loadModelsfromWorkspace(), getPart().getSite().getShell(), null, "Select a Value Set");
		if (valueSetEnum == null) {
			return;
		}

		final Stereotype valueSetStereotype = TermProfileUtil.getAppliedStereotype(
			valueSetEnum, ITermProfileConstants.VALUE_SET_VERSION);
		if (valueSetStereotype == null) {
			MessageDialog.openError(
				getPart().getSite().getShell(), "Invalid Enumeration",
				"The selected Enumertion must be a <<ValueSetVersion>>");
			return;
		}
		final ValueSetVersion valueSet = (ValueSetVersion) valueSetEnum.getStereotypeApplication(valueSetStereotype);

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
					if (valueSetConstraint == null) {
						return Status.CANCEL_STATUS;
					}
					this.setLabel("Set ValueSet reference");
					valueSetConstraint.setReference(valueSet);

					valueSetConstraint.setIdentifier(null);
					valueSetConstraint.setName(null);
					valueSetConstraint.setVersion(null);
					valueSetConstraint.setBinding(null);

					refresh();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void deleteValueSetReference() {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);
					if (valueSetConstraint == null || valueSetConstraint.getReference() == null) {
						return Status.CANCEL_STATUS;
					}

					this.setLabel("Remove ValueSet reference");
					valueSetConstraint.setReference(null);

					valueSetConstraint.setIdentifier(null);
					valueSetConstraint.setName(null);
					valueSetConstraint.setVersion(null);
					valueSetConstraint.setBinding(null);

					refresh();

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Shell shell = new Shell();
		GC gc = new GC(shell);
		gc.setFont(shell.getFont());
		Point point = gc.textExtent("");//$NON-NLS-1$
		int buttonHeight = point.y + 10;
		gc.dispose();
		shell.dispose();

		Composite composite = getWidgetFactory().createGroup(parent, "Value Set");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);

		FormData data = null;

		/* ------ ValueSet reference ------ */
		valueSetRefText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$

		valueSetRefText.addModifyListener(modifyListener);
		valueSetRefText.addKeyListener(keyListener);
		valueSetRefText.addFocusListener(focusListener);

		valueSetRefButton = getWidgetFactory().createButton(composite, "Select Value Set...", SWT.PUSH); //$NON-NLS-1$
		valueSetRefButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				addValueSetReference();
			}
		});

		valueSetRefDeleteButton = getWidgetFactory().createButton(composite, "X", SWT.PUSH); //$NON-NLS-1$
		valueSetRefDeleteButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				deleteValueSetReference();
			}
		});

		// Row 1
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.height = buttonHeight;
		data.top = new FormAttachment(0, 0);
		valueSetRefButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(valueSetRefButton, 0);
		data.height = buttonHeight;
		data.top = new FormAttachment(0, 0); // data.top = new FormAttachment(valueSetRefButton, 0, SWT.CENTER);
		valueSetRefDeleteButton.setLayoutData(data);

		/* ---- Restore Defaults button ---- */
		createRestoreDefaultsButton(composite);
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 0);// data.top = new FormAttachment(valueSetRefText, 0, SWT.CENTER);
		restoreDefaultsButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(valueSetRefDeleteButton, 0);
		data.right = new FormAttachment(restoreDefaultsButton, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(0, 0); // data.top = new FormAttachment(valueSetRefButton, 0, SWT.CENTER);
		valueSetRefText.setLayoutData(data);
		// Row 2
		/* ------ Name field ------ */
		nameText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel nameLabel = getWidgetFactory().createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(valueSetRefText, 0); // data.top = new FormAttachment(valueSetRefText, 0, SWT.CENTER);
		nameLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(nameLabel, 0);
		data.right = new FormAttachment(50, 0);
		data.top = new FormAttachment(valueSetRefText, 0); // new FormAttachment(0, 0); // data.top = new FormAttachment(1,
															// ITabbedPropertyConstants.VSPACE);
		nameText.setLayoutData(data);

		nameText.addModifyListener(modifyListener);
		nameText.addKeyListener(keyListener);
		nameText.addFocusListener(focusListener);

		/* ------ ID field ------ */
		idText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel idLabel = getWidgetFactory().createCLabel(composite, "ID:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(nameText, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(valueSetRefText, 0);// data.top = new FormAttachment(valueSetRefText, 0, SWT.CENTER);
		idLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(idLabel, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(valueSetRefText, 0);// data.top = new FormAttachment(valueSetRefText, 0, ITabbedPropertyConstants.VSPACE);
		idText.setLayoutData(data);

		// Row 3
		/* ---- binding combo ---- */
		bindingCombo = getWidgetFactory().createCCombo(composite, SWT.FLAT | SWT.READ_ONLY | SWT.BORDER);
		bindingCombo.setItems(new String[] { "Static", "Dynamic" });
		bindingCombo.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				bindingModified = true;
				modifyFields();
			}

			public void widgetSelected(SelectionEvent e) {
				bindingModified = true;
				modifyFields();
			}
		});

		CLabel bindingLabel = getWidgetFactory().createCLabel(composite, "Binding:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(nameText, 0); // data.top = new FormAttachment(bindingCombo, 0, SWT.CENTER);
		bindingLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(bindingLabel, 0);
		data.top = new FormAttachment(nameText, 0); // data.top = new FormAttachment(30, 50, ITabbedPropertyConstants.VSPACE);
		bindingCombo.setLayoutData(data);

		/* ------ Version field ------ */
		versionText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		CLabel versionLabel = getWidgetFactory().createCLabel(composite, "Version:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(bindingCombo, ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(nameText, 0); // data.top = new FormAttachment(versionText, 0, SWT.CENTER);
		versionLabel.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(versionLabel, 0);
		data.right = new FormAttachment(50, 0);
		data.top = new FormAttachment(nameText, 0); // data.top = new FormAttachment(30, 50, ITabbedPropertyConstants.VSPACE);
		versionText.setLayoutData(data);

		guidanceEnumeration = new ComboEnumeration(composite, versionText, null, "Guidance : ", Guidance.VALUES);

		extensibilityEnumeration = new ComboEnumeration(
			composite, versionText, guidanceEnumeration.getEnumerationCombo(), "Extensibility : ",
			Extensibility.VALUES);

		// addHiddenTextFieldToForm(composite);

	}

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
		Assert.isTrue(element instanceof NamedElement);
		this.property = (Property) element;
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	private void setText(Text text, String value) {
		System.out.println(value);
		text.removeModifyListener(modifyListener);
		text.removeKeyListener(keyListener);
		text.removeFocusListener(focusListener);
		text.setText(StringUtils.isEmpty(value)
				? ""
				: value);
		text.addModifyListener(modifyListener);
		text.addKeyListener(keyListener);
		text.addFocusListener(focusListener);
	}

	@Override
	public void refresh() {

		// Fix related to a bug. See addHiddenTextFieldToForm() javadoc
		// if (fake != null && !fake.isDisposed()) {
		// fake.setFocus();
		// }

		// if (true) {
		// setText(valueSetRefText, "aaaaa");
		//
		// valueSetRefText.setFocus();
		// return;
		// }
		Profile ctsProfile = TermProfileUtil.getTerminologyProfile(property.eResource().getResourceSet());
		if (ctsProfile == null) {
			return;
		}
		Enumeration bindingKind = (Enumeration) ctsProfile.getOwnedType(ITermProfileConstants.BINDING_KIND);

		ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);

		ValueSetVersion valueSet = null;
		Enumeration referenceEnum = null;
		if (valueSetConstraint != null && valueSetConstraint.getReference() != null) {
			valueSet = valueSetConstraint.getReference();
			referenceEnum = valueSet.getBase_Enumeration();
			valueSetRefText.setText(valueSet.getEnumerationQualifiedName());
			valueSetRefText.setEnabled(false);
			valueSetRefText.setEditable(false);
			// valueSetRefText.layout();
		} else {
			valueSetRefText.setEditable(true);

			setText(valueSetRefText, valueSetConstraint.getUri());

			valueSetRefText.setFocus();

			// if (!StringUtils.isEmpty(valueSetConstraint.getUri())) {
			// valueSetRefText.setText(valueSetConstraint.getUri());
			// } else {
			// valueSetRefText.setText("");
			// }

		}

		// idText.setFocus();

		String id = valueSet == null
				? valueSetConstraint.getIdentifier()
				: valueSet.getIdentifier();
		// idText.setText(id != null
		// ? id
		// : "");
		setText(idText, id);

		// idText.removeModifyListener(modifyListener);
		// idText.removeKeyListener(keyListener);
		// idText.removeFocusListener(focusListener);
		// if (valueSetConstraint != null) {
		//
		// } else {
		// idText.setText("");
		// }
		// idText.addModifyListener(modifyListener);
		// idText.addKeyListener(keyListener);
		// idText.addFocusListener(focusListener);

		// nameText.removeModifyListener(modifyListener);
		// nameText.removeKeyListener(keyListener);
		// nameText.removeFocusListener(focusListener);
		// if (valueSetConstraint != null) {
		String name = valueSet == null
				? valueSetConstraint.getName()
				: valueSet.getEnumerationName();

		setText(nameText, name);
		// nameText.setText(name != null
		// ? name
		// : "");
		// } else {
		// nameText.setText("");
		// }
		// nameText.addModifyListener(modifyListener);
		// nameText.addKeyListener(keyListener);
		// nameText.addFocusListener(focusListener);

		String version = valueSet == null
				? valueSetConstraint.getVersion()
				: valueSet.getVersion();
		setText(versionText, version);

		// versionText.removeModifyListener(modifyListener);
		// versionText.removeKeyListener(keyListener);
		// versionText.removeFocusListener(focusListener);
		// if (valueSetConstraint != null) {
		// String version = valueSet == null
		// ? valueSetConstraint.getVersion()
		// : valueSet.getVersion();
		// versionText.setText(version != null
		// ? version
		// : "");
		// } else {
		// versionText.setText("");
		// }
		// versionText.addModifyListener(modifyListener);
		// versionText.addKeyListener(keyListener);
		// versionText.addFocusListener(focusListener);

		bindingCombo.select(0);
		if (valueSetConstraint != null) {
			BindingKind binding = valueSet == null
					? valueSetConstraint.getBinding()
					: valueSet.getBinding();

			if (bindingKind != null && binding != null) {
				EnumerationLiteral literal = bindingKind.getOwnedLiteral(binding.getName());
				int index = bindingKind.getOwnedLiterals().indexOf(literal);
				bindingCombo.select(index);
			}
		}

		if (guidanceEnumeration != null) {
			guidanceEnumeration.getEnumerationCombo().select(
				Guidance.get(valueSetConstraint.getGuidance().getLiteral()).getValue());
		}

		if (extensibilityEnumeration != null) {
			extensibilityEnumeration.getEnumerationCombo().select(
				Extensibility.get(valueSetConstraint.getExtensibility().getLiteral()).getValue());
		}

		if (isReadOnly()) {
			valueSetRefText.setEnabled(false);
			idText.setEnabled(false);
			nameText.setEnabled(false);
			versionText.setEnabled(false);
			bindingCombo.setEnabled(false);
		} else {
			valueSetRefText.setEnabled(true);
			idText.setEnabled(referenceEnum == null);
			nameText.setEnabled(referenceEnum == null);
			versionText.setEnabled(referenceEnum == null);
			bindingCombo.setEnabled(referenceEnum == null);
			restoreDefaultsButton.setEnabled(valueSetConstraint != null);
		}

		nameText.setFocus();

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
		// fire notification for any stereotype property changes to update views
		// this is a bogus notification of change to property name, but can't find a better option
		Notification notification = new NotificationImpl(Notification.SET, null, property.getName()) {
			@Override
			public Object getNotifier() {
				return property;
			}

			@Override
			public int getFeatureID(Class expectedClass) {
				return UMLPackage.PROPERTY__NAME;
			}
		};
		property.eNotify(notification);
	}
}
