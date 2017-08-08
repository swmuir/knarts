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

import java.util.ArrayList;
import java.util.function.Consumer;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.PixelConverter;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.mdht.uml.term.core.profile.ContextToValueSet;
import org.eclipse.mdht.uml.term.core.profile.TermFactory;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraints;
import org.eclipse.mdht.uml.term.core.util.ITermProfileConstants;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.mdht.uml.term.ui.TerminologyService;
import org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
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

/**
 * The profile properties section for Value Set Constraint.
 */
public class ValueSetConstraintsSection extends ResettableModelerPropertySection {

	class MyComboBoxViewerCellEditor extends ComboBoxViewerCellEditor {

		/**
		 * @param parent
		 */
		public MyComboBoxViewerCellEditor(Composite parent) {
			super(parent);
		}

		/**
		 * @param parent
		 * @param style
		 */
		public MyComboBoxViewerCellEditor(Composite parent, int style) {
			super(parent, style);
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.jface.viewers.ComboBoxViewerCellEditor#doGetValue()
		 */
		@Override
		protected Object doGetValue() {
			Object result = super.doGetValue();
			if (result == null) {
				result = this.getViewer().getCCombo().getText();
			}
			return result;
		}

	};

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.ui.properties.sections.ResettableModelerPropertySection#resetFields()
	 */
	@Override
	protected void resetFields() {

	}

	private Property property;

	private static String[] CONTEXTS = null;

	private static final String CONTEXT_PROPERTY = "context";

	private static final String URI_PROPERTY = "uri";

	private TableViewer viewer;

	private class NewRowAction extends Action {
		public NewRowAction() {
			super("Insert New Row");
		}

		@Override
		public void run() {
			EditableTableItem newItem = new EditableTableItem(null);
			modifyFields(newItem);
			viewer.add(newItem);
			viewer.getControl().getParent().layout(true);
		}
	}

	private void attachLabelProvider(TableViewer viewer) {
		viewer.setLabelProvider(new ITableLabelProvider() {
			public Image getColumnImage(Object element, int columnIndex) {
				return null;
			}

			public String getColumnText(Object element, int columnIndex) {
				EditableTableItem tableItem = (EditableTableItem) element;
				switch (columnIndex) {
					case 1:
						return tableItem.constraint;
					case 0:
						return tableItem.context;

					default:
						return "Invalid column: " + columnIndex;
				}
			}

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener lpl) {
			}
		});
	}

	private void attachContentProvider(TableViewer viewer) {
		viewer.setContentProvider(new IStructuredContentProvider() {
			public Object[] getElements(Object inputElement) {
				return (Object[]) inputElement;
			}

			public void dispose() {
			}

			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}
		});
	}

	private TableViewer buildAndLayoutTable(Composite composite, final Table table) {
		TableViewer tableViewer = new TableViewer(table);

		PixelConverter pixelConverter = new PixelConverter(composite);
		TableLayout layout = new TableLayout();
		layout.addColumnData(new ColumnWeightData(10, pixelConverter.convertWidthInCharsToPixels(40), true));
		layout.addColumnData(new ColumnWeightData(10, pixelConverter.convertWidthInCharsToPixels(40), true));

		table.setLayout(layout);

		TableColumn contextColumn = new TableColumn(table, SWT.CENTER);
		contextColumn.setText("Context");
		TableColumn uriColumn = new TableColumn(table, SWT.CENTER);
		uriColumn.setText("URI");
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		return tableViewer;
	}

	private void attachCellEditors(final TableViewer viewer, Composite parent) {
		viewer.setCellModifier(new ICellModifier() {
			public boolean canModify(Object element, String property) {
				return true;
			}

			public Object getValue(Object element, String property) {
				EditableTableItem tableItem = (EditableTableItem) element;
				if (CONTEXT_PROPERTY.equals(property)) {
					int result = org.apache.commons.lang.ArrayUtils.indexOf(CONTEXTS, tableItem.context);
					if (result != -1) {
						return new Integer(result);
					} else {
						return new Integer(0);
					}
				} else {
					return tableItem.constraint != null
							? tableItem.constraint
							: "xxxx";
				}
			}

			public void modify(Object element, String property, Object value) {
				TableItem tableItem = (TableItem) element;
				EditableTableItem data = (EditableTableItem) tableItem.getData();
				if (CONTEXT_PROPERTY.equals(property)) {
					String context = CONTEXTS[(Integer) value];
					data.context = enumeration.getOwnedLiteral(context).getName();
				} else {
					data.constraint = (String) value;
				}

				modifyFields(data);

				viewer.refresh(data);
			}

		});

		ComboBoxViewerCellEditor uriComboBox = new MyComboBoxViewerCellEditor(parent);
		uriComboBox.setContentProvider(ArrayContentProvider.getInstance());

		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IExtensionPoint ep = reg.getExtensionPoint("org.eclipse.mdht.uml.term.ui.service");

		IExtension[] extensions = ep.getExtensions();
		TerminologyService ts = null;
		try {
			ts = (TerminologyService) extensions[0].getConfigurationElements()[0].createExecutableExtension("service");
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (ts != null && !ts.getValueSets().isEmpty()) {
			uriComboBox.setInput(ts.getValueSets().toArray(new String[0]));
		} else {
			uriComboBox.setInput(new String[] { "" });
		}
		// new TextCellEditor(parent) new TextCellEditor(parent)
		viewer.setCellEditors(new CellEditor[] { new ComboBoxCellEditor(parent, CONTEXTS), uriComboBox });

		viewer.setColumnProperties(new String[] { CONTEXT_PROPERTY, URI_PROPERTY });
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

	class EditableTableItem {
		private String context = "";

		private String constraint = "";

		ContextToValueSet ctov;

		public EditableTableItem(ContextToValueSet ctov) {
			this.ctov = ctov;
			if (this.ctov != null) {
				this.context = ctov.getKey();
				this.constraint = ctov.getValue();
			}
		}
	}

	Table table = null;

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

		org.eclipse.swt.widgets.Group composite = getWidgetFactory().createGroup(parent, "Value Sets");
		FormLayout layout = new FormLayout();
		layout.marginWidth = ITabbedPropertyConstants.HSPACE + 2;
		layout.marginHeight = ITabbedPropertyConstants.VSPACE;
		layout.spacing = ITabbedPropertyConstants.VMARGIN + 1;
		composite.setLayout(layout);
		table = getWidgetFactory().createTable(composite, SWT.FULL_SELECTION | SWT.BORDER);
		table.setLinesVisible(true);
		viewer = buildAndLayoutTable(composite, table);
		attachContentProvider(viewer);
		attachLabelProvider(viewer);

		MenuManager popupMenu = new MenuManager();
		IAction newRowAction = new NewRowAction();
		popupMenu.add(newRowAction);
		Menu menu = popupMenu.createContextMenu(table);
		table.setMenu(menu);
		FormData data = null;

		PixelConverter pixelConverter = new PixelConverter(composite);

		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.width = pixelConverter.convertWidthInCharsToPixels(150);
		data.height = 400;
		table.setLayoutData(data);

		composite.requestLayout();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#refresh()
	 */
	Enumeration enumeration = null;

	@Override
	public void refresh() {

		ValueSetConstraints valueSetConstraints = TermProfileUtil.getValueSetConstraints(property);

		if (property != null) {
			for (Element e : property.getNearestPackage().allOwnedElements()) {
				if (e instanceof Enumeration && TermProfileUtil.getContext((Enumeration) e) != null) {
					enumeration = (Enumeration) e;
					ArrayList<String> literals = new ArrayList<String>();
					for (EnumerationLiteral el : enumeration.getOwnedLiterals()) {
						literals.add(el.getName());
					}
					CONTEXTS = literals.toArray(new String[0]);
				}
			}

		}
		final ArrayList<EditableTableItem> list = new ArrayList<EditableTableItem>();

		Consumer<? super ContextToValueSet> action = new Consumer<ContextToValueSet>() {

			@Override
			public void accept(ContextToValueSet t) {
				list.add(new EditableTableItem(t));
			}
		};
		valueSetConstraints.getConstraints().forEach(action);

		viewer.setInput(list.toArray());

		viewer.getControl().getParent().layout(true);

		attachCellEditors(viewer, table);
		super.refresh();
	}

	private void modifyFields(final EditableTableItem update) {

		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(property);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "temp") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Profile ctsProfile = TermProfileUtil.getTerminologyProfile(property.eResource().getResourceSet());
					if (ctsProfile == null) {
						return Status.CANCEL_STATUS;
					}
					Stereotype stereotype = TermProfileUtil.getAppliedStereotype(
						property, ITermProfileConstants.VALUE_SET_CONSTRAINTS);

					if (stereotype == null) {
						return Status.CANCEL_STATUS;
					}

					ValueSetConstraints valueSetConstraints = (ValueSetConstraints) property.getStereotypeApplication(
						stereotype);

					if (update.ctov == null) {
						ContextToValueSet contextToValueSet = TermFactory.eINSTANCE.createContextToValueSet();
						contextToValueSet.setKey(update.context);
						contextToValueSet.setValue(update.constraint);
						update.ctov = contextToValueSet;
						valueSetConstraints.getConstraints().add(contextToValueSet);
					} else {
						int index = valueSetConstraints.getConstraints().indexOf(update.ctov);
						valueSetConstraints.getConstraints().get(index).setKey(update.context);
						valueSetConstraints.getConstraints().get(index).setValue(update.constraint);

					}

					return Status.OK_STATUS;
				}
			};

			execute(operation);

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

}
