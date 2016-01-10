/*******************************************************************************
 * Copyright (c) 2015 David A Carlson
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


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.mdht.uml.fhir.ValueSetBinding;
import org.eclipse.mdht.uml.fhir.ValueSetMember;
import org.eclipse.mdht.uml.fhir.common.terminology.ConceptDescriptor;
import org.eclipse.mdht.uml.fhir.common.util.FhirModelUtil;
import org.eclipse.mdht.uml.fhir.transform.TerminologyCache;
import org.eclipse.mdht.uml.fhir.ui.Activator;
import org.eclipse.mdht.uml.fhir.ui.dialogs.ConceptListDialog;
import org.eclipse.mdht.uml.fhir.ui.dialogs.ConceptSearchDialog;
import org.eclipse.mdht.uml.fhir.ui.views.ConceptTaxonomyView;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.mdht.uml.ui.properties.sections.WrapperAwareModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * The properties section enabled display and edit of ValueSet members.
 * 
 * @author dcarlson
 */
public class ValueSetMemberSection extends WrapperAwareModelerPropertySection {

	protected Enumeration umlEnumeration;
	
	private boolean isExpanded = false;
	
	private Enumeration expansionValueSet = null;

	private FHIRTableViewer memberViewer = null;

	private Button addButton = null;

	private Button removeButton = null;

	private Button expandButton = null;

	private Button showInTaxonomyButton = null;

	private void addMember() {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					this.setLabel("Add Member");

					ConceptDescriptor concept = selectMember();
					if (concept != null) {
						Profile fhirUmlProfile = UMLUtil.getProfile(org.eclipse.mdht.uml.fhir.FHIRPackage.eINSTANCE.getValueSet().getEPackage(), umlEnumeration);					
						EnumerationLiteral literal = umlEnumeration.createOwnedLiteral(concept.getConceptId());

						if (concept.getConceptId() != null) {
							literal.setName(concept.getConceptId());
						}
						if (fhirUmlProfile != null) {
							ValueSetMember member = (ValueSetMember) UMLUtil.safeApplyStereotype(literal, fhirUmlProfile.getOwnedStereotype(org.eclipse.mdht.uml.fhir.FHIRPackage.eINSTANCE.getValueSetMember().getName()));
							if (concept.getCodeSystem() != null) {
								member.setSystem(concept.getCodeSystem());
							}
							if (concept.getDefaultTerm() != null) {
								member.setDisplay(concept.getDefaultTerm());
							}
						}
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

	protected ConceptDescriptor selectMember() {
		ConceptSearchDialog searchDialog = new ConceptSearchDialog(getPart().getSite().getShell());
		searchDialog.open();
		List<ConceptDescriptor> results = searchDialog.getResults();
		ConceptDescriptor selectedResult = null;
		
		if (results.size() == 1) {
			selectedResult = results.get(0);
		}
		else if (results.size() > 1) {
			ConceptListDialog listDialog = new ConceptListDialog(getPart().getSite().getShell());
			listDialog.setConceptList(results);
			listDialog.open();
			Object[] selectionResult = listDialog.getResult();
			if (selectionResult != null && selectionResult.length == 1) {
				selectedResult = (ConceptDescriptor)selectionResult[0];
			}
		}

		return selectedResult;
	}

	private void removeMember(final EnumerationLiteral member) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					this.setLabel("Remove Member");
					umlEnumeration.getOwnedLiterals().remove(member);
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

	private void modifyFields() {

	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = getWidgetFactory().createGroup(parent, "Members");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN;
		composite.setLayout(layout);

		addButton = getWidgetFactory().createButton(composite, null, SWT.PUSH);
		Image addImage = Activator.getDefault().getBundledImage("icons/full/eview16/add.gif");
		addButton.setImage(addImage);
		addButton.setToolTipText("Add member");
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				addMember();
			}
		});

		removeButton = getWidgetFactory().createButton(composite, null, SWT.PUSH);
		Image removeImage = Activator.getDefault().getBundledImage("icons/full/eview16/remove.gif");
		removeButton.setImage(removeImage);
		removeButton.setToolTipText("Delete selected member(s)");
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				ISelection selection = memberViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					for (Object selected : ((IStructuredSelection)selection).toList()) {
						if (selected instanceof ValueSetMember) {
							selected = ((ValueSetMember)selected).getBase_EnumerationLiteral();
						}
						if (selected instanceof EnumerationLiteral) {
							removeMember((EnumerationLiteral) selected);
						}
					}
				}
			}
		});

		showInTaxonomyButton = getWidgetFactory().createButton(composite, null, SWT.PUSH);
		Image syncImage = Activator.getDefault().getBundledImage("icons/eview16/sync.gif");
		showInTaxonomyButton.setImage(syncImage);
		showInTaxonomyButton.setToolTipText("Show in taxonomy");
		showInTaxonomyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				ISelection selection = memberViewer.getSelection();
				for (Object selected : ((IStructuredSelection)selection).toList()) {
					if (selected instanceof ValueSetMember) {
						try {
							ConceptDescriptor concept = new ConceptDescriptor();
							concept.setConceptId(((ValueSetMember)selected).getBase_EnumerationLiteral().getName());

							IViewPart taxonomy = getPart().getSite().getWorkbenchWindow().getActivePage().showView(ConceptTaxonomyView.ID);
							IStructuredSelection taxonomySelection = new StructuredSelection(concept);
							((ISetSelectionTarget)taxonomy).selectReveal(taxonomySelection);

						} catch (Exception e) {
							StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error opening taxonomy view", e), 
									StatusManager.SHOW | StatusManager.LOG);
						}
					}
				}
			}
		});

		expandButton = getWidgetFactory().createButton(composite, null, SWT.TOGGLE);
		Image expandImage = Activator.getDefault().getBundledImage("icons/eview16/expand.gif");
		expandButton.setImage(expandImage);
		expandButton.setToolTipText("Expand value set");
		expandButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				isExpanded = expandButton.getSelection();
				
				if (isExpanded) {
					ValueSet valueSet = ProfileUtil.getValueSet(umlEnumeration);
					if (valueSet != null && valueSet.getUri() != null) {
						try {
							expansionValueSet = TerminologyCache.getInstance().expandValueSet(valueSet.getUri());
							
						} catch (Exception e) {
							StatusManager.getManager().handle(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error expanding value set.", e), 
									StatusManager.SHOW | StatusManager.LOG);
						}
					}
				}
				else if (expansionValueSet != null) {
					expansionValueSet.destroy();
					expansionValueSet = null;
				}

				refresh();
			}
		});

		FormData data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(0, 0);
		addButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(addButton, 0);
		removeButton.setLayoutData(data);

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(removeButton, 0);
		showInTaxonomyButton.setLayoutData(data);
		
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(showInTaxonomyButton, 0);
		expandButton.setLayoutData(data);
		
		Table table = getWidgetFactory().createTable(composite, SWT.V_SCROLL | SWT.MULTI);
		data = new FormData();
		data.left = new FormAttachment(addButton, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 0);
		data.bottom = new FormAttachment(100, 0);
		table.setLayoutData(data);

		memberViewer = new FHIRTableViewer(table) {
			@Override
			protected AdapterFactoryContentProvider createContentProvider(AdapterFactory adapterFactory) {
		        return new AdapterFactoryContentProvider(adapterFactory) {
					@Override
					public Object[] getElements(Object object) {
						List<Object> members = new ArrayList<Object>();
						Enumeration inputEnum = (Enumeration) memberViewer.getInput();
						for (EnumerationLiteral member : inputEnum.getOwnedLiterals()) {
							ValueSetMember vsMember = FhirModelUtil.getValueSetMember(member);
							members.add(vsMember != null ? vsMember : member);
						}

						return members.toArray();
					}
		        };
			}

			@Override
		    protected void createColumns() {
		        String[] titles = { "Code", "Display", "System", "Version" };
		        int[] bounds = { 100, 300, 300, 100 };

		        TableViewerColumn codeColumn = createTableViewerColumn(titles[0], bounds[0], 0);
		        TableViewerColumn displayColumn = createTableViewerColumn(titles[1], bounds[1], 1);
		        TableViewerColumn systemColumn = createTableViewerColumn(titles[2], bounds[2], 2);
		        TableViewerColumn versionColumn = createTableViewerColumn(titles[3], bounds[3], 3);

		        // TODO add editing support for each editable column
		        
		    }
		
		};
	}

	@Override
	protected boolean isReadOnly() {
		if (umlEnumeration != null) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlEnumeration);
			if (editingDomain != null && editingDomain.isReadOnly(umlEnumeration.eResource())) {
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
		this.umlEnumeration = null;
		this.expansionValueSet = null;
		isExpanded = false;
		
		EObject element = getEObject();
		if (element instanceof View) {
			element = ((View) element).getElement();
		}
		if (element instanceof Enumeration) {
			umlEnumeration = (Enumeration) element;
		}
		else if (element instanceof Property) {
			Property property = (Property) element;
			ValueSetBinding binding = (ValueSetBinding) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getValueSetBinding());
			if (binding != null && binding.getValueSetReference() != null) {
				ValueSet valueSet = binding.getValueSetReference();
				umlEnumeration = valueSet.getBase_Enumeration();
			}
		}
	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public void refresh() {
		if (umlEnumeration == null) {
			memberViewer.setInput(null);
			return;
		}
		
		if (isExpanded) {
			memberViewer.setInput(expansionValueSet);
		}
		else if (memberViewer != null) {
			memberViewer.setInput(umlEnumeration);
		}
		
		expandButton.setSelection(isExpanded);
		addButton.setEnabled(!isExpanded);
		removeButton.setEnabled(!isExpanded && umlEnumeration.getOwnedLiterals().size() > 0);
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
					if (!isDisposed() && !isNotifierDeleted(notification)) {
						refresh();
					}
				}
			});
		}
	}

}
