/*******************************************************************************
 * Copyright (c) 2017 seanmuir.
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

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Filter;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.google.common.base.Stopwatch;

public class StripCDANarrativeHandler extends AbstractHandler {

	protected String folderPrefix = "NarrativeRemoved";

	/**
	 * @return the folderPrefix
	 */
	public String getFolderPrefix() {
		return folderPrefix;
	}

	/**
	 * @param folderPrefix
	 *            the folderPrefix to set
	 */
	public void setFolderPrefix(String folderPrefix) {
		this.folderPrefix = folderPrefix;
	}

	public static final SimpleDateFormat DATE_FORMAT3 = new SimpleDateFormat("yyyyMMdd");

	public class StripCDANarrativeDialog extends TitleAreaDialog {

		org.eclipse.swt.widgets.Table table;

		public StripCDANarrativeDialog(Shell shell) {
			super(shell);

		}

		@Override
		public void create() {
			super.create();
			setTitle("DeIdentification Results");
		}

		@Override
		protected Control createDialogArea(Composite parent) {

			final ScrolledComposite composite = new ScrolledComposite(parent, SWT.V_SCROLL);
			composite.setLayout(new GridLayout());
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			table = new org.eclipse.swt.widgets.Table(composite, SWT.BORDER | SWT.MULTI);
			table.setHeaderVisible(true);

			table.setSize(100, 100);

			composite.setContent(table);
			composite.setExpandHorizontal(true);
			composite.setExpandVertical(true);
			composite.setAlwaysShowScrollBars(true);
			composite.setMinSize(table.computeSize(SWT.DEFAULT, SWT.DEFAULT));

			table.setLinesVisible(true);

			final GridData gridData = new GridData();
			gridData.widthHint = 500;
			table.setLayoutData(gridData);

			table.setHeaderVisible(true);
			final TableColumn column1 = new TableColumn(table, SWT.LEFT);

			final TableColumn column2 = new TableColumn(table, SWT.LEFT);

			column1.setText("File Name");
			column2.setText("Size (MB)");

			column1.setWidth(250);
			column2.setWidth(250);

			for (IFile file : documents) {
				IFileStore fs1;
				try {
					fs1 = org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
					final TableItem valueSetsUpdatedItem = new TableItem(table, SWT.NONE);
					valueSetsUpdatedItem.setText(
						new String[] {
								fs1.fetchInfo().getName(), String.valueOf(fs1.fetchInfo().getLength() / 1000000) });

				} catch (CoreException e) {

				}
			}

			return composite;
		}

		@Override
		protected void createButtonsForButtonBar(Composite parent) {

			Button okButton = createButton(parent, OK, "Ok", false);

			okButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setReturnCode(OK);
					close();
				}
			});
		}

	}

	public void stripNarratives(final IFile file) throws Exception {

		URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

		ClinicalDocument clinicalDocument = null;

		// Use inline filters - bit simpler then setting up ctors to passing ramdomids and names
		Filter<ED> iiFilter = new Filter<ED>() {

			@Override
			public boolean accept(ED ed) {

				if (ed.getReference() != null && !StringUtils.isEmpty(ed.getReference().getValue())) {

					Section section = CDAUtil.getSection(ed);

					if (section != null) {
						String result = org.eclipse.mdht.cda.xml.ui.handlers.CDAValueUtil.getValue(section, ed);
						if (!StringUtils.isEmpty(result)) {
							EcoreUtil.delete(ed.getReference());

							// ed.getReference().eUnset(feature);

							// ed.getReference().eContainingFeature()cdaURI;
							;

							ed.eUnset(
								DatatypesPackage.eINSTANCE.eClass().getEStructuralFeature(
									DatatypesPackage.eINSTANCE.getED_Reference().getFeatureID()));

							// ed.eUnset(ed.getReference().eContainingFeature());

							// ed.setReference(null);
							// ed.addText(result);
							// if (ed.eContainer() instanceof CD) {
							// CD cd = (CD) ed.eContainer();
							//
							// cd.getOriginalText().set
							// }
						}
					}

					// System.out.println(ed.getReference().getValue());
				}

				// if (ii.isNullFlavorDefined()) {
				// return false;
				// }
				//
				// if ("templateId".equals(ii.eContainingFeature().getName())) {
				// return false;
				// }
				//
				// if ((!"2.16.840.1.113883.1.3".equals(ii.getRoot())) && ii.getExtension() != null &&
				// ii.getExtension().trim().length() > 0) {
				// String key = getKey(file.getName(), ii);
				// if (!randomIds.containsKey(key)) {
				// String randomString = lookForExistingAcrossFiles(getKey(ii));
				// if (StringUtils.isEmpty(randomString)) {
				// if (ii.getExtension() != null) {
				// randomString = RandomStringUtils.randomNumeric(ii.getExtension().length());
				// } else {
				// randomString = RandomStringUtils.randomNumeric(5);
				// }
				// }
				// randomIds.put(key, randomString);
				//
				// }
				//
				// if (randomIds.containsKey(key)) {
				// ii.setExtension(randomIds.get(key));
				// }
				// }

				return true;
			}

		};

		try (InputStream is = Files.newInputStream(Paths.get(cdaURI.toFileString()))) {

			clinicalDocument = CDAUtil.load(is, ((ValidationHandler) null));

			Query query = new Query(clinicalDocument);

			query.getEObjects(ED.class, iiFilter);

			is.close();
		} catch (IOWrappedException iowe) {
			System.out.println("error processing " + cdaURI.toFileString());
			return;
		}

		for (Section section : clinicalDocument.getSections()) {

			StrucDocText sdc = CDAFactory.eINSTANCE.createStrucDocText();
			sdc.addText("NARRATIVE REMOVED");
			section.setText(sdc);

		}

		if (file.getParent() != null) {
			IPath p = file.getParent().getProjectRelativePath();

			p = p.append(folderPrefix);

			IFolder f = file.getProject().getFolder(p);
			if (!f.exists()) {
				f.create(true, true, null);
			}

			int i = file.getName().lastIndexOf(file.getFileExtension());

			IFile df = f.getFile(file.getName().substring(0, i - 1) + "_NoNarrative.xml");

			try (OutputStream fileOut = Files.newOutputStream(Paths.get(df.getLocation().toOSString()))) {
				CDAUtil.save(clinicalDocument, fileOut);
			}

		}

		clinicalDocument.eResource().unload();
	}

	ArrayList<IFile> documents = new ArrayList<IFile>();

	protected static DecimalFormat format2Places = new DecimalFormat(".##");

	protected void processFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {

		int filectr = 1;
		long currentProcessingTime = 1;
		long totalBytes = 0;
		long totalBytes2 = 0;
		Stopwatch stopwatch = Stopwatch.createUnstarted();

		documents.clear();

		for (IResource resource : folder.members()) {

			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}

			if (resource instanceof IFolder && !resource.getName().equals("NarrativeRemoved")) {
				processFolder((IFolder) resource, monitor);
			}

			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
				if ("XML".equalsIgnoreCase(file.getFileExtension())) {
					documents.add(file);
					IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
					totalBytes += fs1.fetchInfo().getLength();
				}
			}
		}

		totalBytes2 = totalBytes;

		monitor.setTaskName("Strip Narratives Folder (" + format2Places.format(totalBytes2 / 1000000.0) + " MB) ");

		Comparator<? super IFile> c = new Comparator<IFile>() {

			@Override
			public int compare(IFile file1, IFile file2) {
				try {
					IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(file1.getLocationURI());
					IFileStore fs2 = org.eclipse.core.filesystem.EFS.getStore(file2.getLocationURI());
					if (fs1.fetchInfo().getLength() < fs2.fetchInfo().getLength()) {
						return 1;
					} else {
						return -1;
					}
				} catch (CoreException e) {

				}
				return 0;
			}
		};
		Collections.sort(documents, c);

		currentProcessingTime = 0;
		long estimatedTimeLeft = 0;
		for (IFile document : documents) {
			monitor.worked(1);

			if (estimatedTimeLeft != 0) {
				if (estimatedTimeLeft > 60) {
					monitor.setTaskName(
						"Strip Narratives Folder (" + format2Places.format(totalBytes2 / 1000000.0) +
								" MB), Estimated Time to finish : " + ((int) estimatedTimeLeft / 60) + " Minutes ");
				} else {
					monitor.setTaskName(
						"Strip Narratives Folder (" + format2Places.format(totalBytes2 / 1000000.0) +
								" MB), Estimated Time to finish : " + ((int) estimatedTimeLeft) + " Seconds ");
				}
			}

			IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(document.getLocationURI());
			long fileSize = fs1.fetchInfo().getLength();

			monitor.subTask(
				"Processing " + StringUtils.center(StringUtils.abbreviate(document.getName(), 16), 16) + "(" +
						format2Places.format(fs1.fetchInfo().getLength() / 1000000.0) + " MB)" + " File # " +
						StringUtils.center(String.valueOf(filectr++), 10) + " LAST " +
						StringUtils.center(String.valueOf(currentProcessingTime / 1000.0), 6) + " Seconds");
			try {
				stopwatch.reset();
				stopwatch.start();
				stripNarratives(document);
				stopwatch.stop();
				currentProcessingTime = stopwatch.elapsed(TimeUnit.MILLISECONDS);

				long ratePerSecond = fileSize / stopwatch.elapsed(TimeUnit.MILLISECONDS);

				totalBytes -= fileSize;

				if (ratePerSecond != 0) {
					estimatedTimeLeft = (totalBytes / ratePerSecond) / 1000;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			if (monitor.isCanceled()) {
				break;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {

			ProgressMonitorDialog pd = new ProgressMonitorDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());

			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			if (selection instanceof IStructuredSelection) {

				final IStructuredSelection iss = (IStructuredSelection) selection;

				try {
					pd.run(true, true, new IRunnableWithProgress() {

						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {

							try {
								@SuppressWarnings("unchecked")
								Iterator<Object> iter = iss.iterator();
								while (iter.hasNext() && !monitor.isCanceled()) {
									Object o = iter.next();
									if (o instanceof IFolder) {
										IFolder folder = (IFolder) o;
										monitor.beginTask("DeIdentify CDA Documents", folder.members().length);
										processFolder(folder, monitor);
									}
									if (o instanceof IFile) {
										stripNarratives((IFile) o);
									}
								}
							} catch (PartInitException e) {

							} catch (CoreException e) {

							} catch (Exception e) {

							}
						}
					});
				} catch (InvocationTargetException e) {

				} catch (InterruptedException e) {

				}

				for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				}

				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

				Clipboard cb = new Clipboard(Display.getDefault());

				StringBuilder sb = new StringBuilder();
				for (IFile document : documents) {
					sb.append(document.getName());
				}

				TextTransfer textTransfer = TextTransfer.getInstance();
				cb.setContents(new Object[] { sb.toString() }, new Transfer[] { textTransfer });

				StripCDANarrativeDialog dlg = new StripCDANarrativeDialog(window.getShell());
				dlg.create();
				dlg.open();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
