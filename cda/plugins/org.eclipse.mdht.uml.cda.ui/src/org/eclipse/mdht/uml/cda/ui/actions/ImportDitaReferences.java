/*******************************************************************************
 * Copyright (c) 2015 National E-Health Transition Authority (NEHTA).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (National E-Health Transition Authority (NEHTA)) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.actions;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.cda.core.util.CDACommonUtils;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.CopyFilesAndFoldersOperation;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.osgi.framework.Bundle;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

/**
 * ImportDitaReferences - Currently dita does can not include relative addressed content as references that are not directly under parent dita
 * directory (../../content)
 * This action will copy (overwrite) over the content from another dita project to include; The dita transformation looks for this content when
 * creating references
 *
 * @author seanmuir
 *
 */
public class ImportDitaReferences implements IObjectActionDelegate {

	protected IWorkbenchPart activePart;

	private ISelection selection;

	public static void importDitaProject(IWorkspace workspace, IProject includeFrom, IProject selectedProject) {

		IFolder ditaFolder = selectedProject.getFolder("dita/classes/" + includeFrom.getName());

		if (includeFrom.getFolder("dita/classes/").exists()) {

			try {
				// Do a delete and copy to make sure content is up todate
				if (ditaFolder.exists()) {
					ditaFolder.delete(true, null);
				}
				ditaFolder.create(true, true, null);
				IResource[] resources = new IResource[1];
				resources[0] = includeFrom.getFolder("dita/classes/");
				workspace.copy(
					resources, workspace.getRoot().getFolder(ditaFolder.getFullPath()).getFullPath(), true, null);

				fixRelativePaths(workspace.getRoot().getFolder(ditaFolder.getFullPath()).getLocation().toFile());

				// Refresh
				selectedProject.refreshLocal(IResource.DEPTH_INFINITE, null);

			} catch (CoreException e) {

			}

		}

	}

	/**
	 * Fix relative links to the "terminology" folder for imported Dita projects as they need to navigate two folder levels higher
	 *
	 * @param dir
	 */
	private static void fixRelativePaths(File dir) {
		if (dir.list() != null) {
			for (String child : dir.list()) {
				try {
					File file = new File(dir, child);
					if (child.endsWith(".dita")) {
						String contents = CDACommonUtils.stringFromFile(file);
						String fixedContents = contents.replace(
							"<xref href=\"../../terminology/", "<xref href=\"../../../../terminology/");
						if (!contents.equals(fixedContents)) {
							CDACommonUtils.stringToFile(fixedContents, file);
						}
					}
					fixRelativePaths(file);
				} catch (IOException e) {
					// skip current file
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@SuppressWarnings("rawtypes")
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
				Object element = it.next();
				IProject selectedProject = null;
				if (element instanceof IProject) {
					selectedProject = (IProject) element;
				} else if (element instanceof IAdaptable) {
					selectedProject = ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (selectedProject != null) {

					LabelProvider projectLabelProvider = new LabelProvider() {
						@Override
						public String getText(Object element) {
							IProject p = (IProject) element;
							return p.getName();
						}
					};

					ElementListSelectionDialog dialog = new ElementListSelectionDialog(
						activePart.getSite().getShell(), projectLabelProvider);

					IWorkspace workspace = ResourcesPlugin.getWorkspace();

					ArrayList<IProject> projects = new ArrayList<IProject>();
					Collections.addAll(projects, workspace.getRoot().getProjects());
					final String selectedProjectName = selectedProject.getName();
					Predicate<? super IProject> predicate = new Predicate<IProject>() {

						public boolean apply(IProject arg0) {
							if (arg0.getName() != null && arg0.getName().endsWith(".doc") &&
									!selectedProjectName.equals(arg0.getName())) {
								return true;
							} else {
								return false;
							}
						}
					};
					Collection<IProject> docProjects = Collections2.filter(projects, predicate);
					dialog.setMultipleSelection(true);
					dialog.setElements(docProjects.toArray(new IProject[docProjects.size()]));
					dialog.setTitle("Dita Projects to Import");
					dialog.open();

					dialog.getResult();

					if (dialog.getReturnCode() == Window.OK) {

						for (Object object : dialog.getResult()) {
							importDitaProject(workspace, (IProject) object, selectedProject);
						}

						try {
							importReferences(selectedProject);
						} catch (Exception e) {

						}

					}

				}
			}
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction arg0, ISelection selection) {
		this.selection = selection;

	}

	void importReferences(IProject project) throws Exception {

		CopyFilesAndFoldersOperation copyOperation = new CopyFilesAndFoldersOperation(activePart.getSite().getShell());
		Bundle bundle = Platform.getBundle(org.eclipse.mdht.uml.cda.ui.internal.Activator.PLUGIN_ID);
		ArrayList<java.net.URI> elements = new ArrayList<java.net.URI>();

		Enumeration<java.net.URL> entries = bundle.findEntries("resources/dita/content", "References.dita", true);

		while (entries.hasMoreElements()) {

			elements.add(FileLocator.toFileURL(new URL(bundle.getEntry("/"), entries.nextElement().getPath())).toURI());

		}

		java.net.URI[] ditauris = new java.net.URI[elements.size()];
		elements.toArray(ditauris);
		copyOperation.copyFiles(ditauris, project.getFolder(new Path("dita/content")));

		entries = bundle.findEntries("resources/dita/content", "content.ditamap", true);

		while (entries.hasMoreElements()) {

			elements.add(FileLocator.toFileURL(new URL(bundle.getEntry("/"), entries.nextElement().getPath())).toURI());

		}

		ditauris = new java.net.URI[elements.size()];
		elements.toArray(ditauris);
		copyOperation.copyFiles(ditauris, project.getFolder(new Path("dita/content")));

	}

}
