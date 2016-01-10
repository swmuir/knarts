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
package org.eclipse.mdht.uml.fhir.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.common.ui.util.UMLHandlerUtil;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;

public class AddUMLEnumerationHandler extends AbstractHandler {

	public AddUMLEnumerationHandler() {
		super();
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// these APIs throw if the requested thing isn't available
		Element selectedElement = UMLHandlerUtil.getSelectedElementChecked(event, Element.class);
		IWorkbenchPart activePart = HandlerUtil.getActivePartChecked(event);

		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedElement);

		IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Add UML enumeration") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
				// prompt for new classifier name
				String classifierName = getClassifierName(event, activePart);
				if (classifierName == null || classifierName.length() == 0) {
					return Status.CANCEL_STATUS;
				}

				Enumeration newEnum = UMLFactory.eINSTANCE.createEnumeration();
				newEnum.setName(classifierName);

				if (selectedElement instanceof Package) {
					((Package) selectedElement).getOwnedTypes().add(newEnum);
				} else if (selectedElement instanceof Class) {
					((Class) selectedElement).getNestedClassifiers().add(newEnum);
				}

				postProcess(newEnum, event, activePart);

				// TODO this does not select in CommonNavigator. maybe need a refresh first?
				if (activePart instanceof ISetSelectionTarget) {
					((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(newEnum));
				}
				return Status.OK_STATUS;
			}
		};

		IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
		operation.addContext(commandStack.getDefaultUndoContext());
		commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		return null;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open dialog containing all available classes.
	 * @throws ExecutionException 
	 */
	protected String getClassifierName(ExecutionEvent event, IWorkbenchPart activePart) {
		String className = null;

		InputDialog inputDialog = new InputDialog(
			activePart.getSite().getShell(), "New Enumeration", "Enter name", "", null);
		if (inputDialog.open() == Window.OK) {
			className = inputDialog.getValue();
		}
		return className;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Do nothing by default.
	 * 
	 * @param new class
	 */
	protected void postProcess(Enumeration newClassifier, ExecutionEvent event, IWorkbenchPart activePart) {
		// do nothing by default
	}

}
