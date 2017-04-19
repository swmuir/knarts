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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Material;
import org.eclipse.mdht.uml.cda.Patient;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.PlayingEntity;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Filter;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.ADXP;
import org.eclipse.mdht.uml.hl7.datatypes.EN;
import org.eclipse.mdht.uml.hl7.datatypes.ENXP;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.TEL;
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

public class DeidentifyCDAHandler extends AbstractHandler {

	public class DeIdentificationDialog extends TitleAreaDialog {

		org.eclipse.swt.widgets.Table table;

		public DeIdentificationDialog(Shell shell) {
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

			column1.setText("Original Value");
			column2.setText("Random Value");

			column1.setWidth(250);
			column2.setWidth(250);

			for (String key : randmonIds.keySet()) {
				// If null flavor - we get null keys
				if (!StringUtils.isEmpty(key)) {
					final TableItem valueSetsUpdatedItem = new TableItem(table, SWT.NONE);
					valueSetsUpdatedItem.setText(new String[] { key, randmonIds.get(key) });
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

	public String getKey(II ii) {
		if (ii.getRoot() != null) {
			if (ii.getExtension() != null) {
				return ii.getRoot() + "::" + ii.getExtension();
			}
		} else {
			return "noroot x " + ii.getExtension();
		}
		return "nokey";

	}

	HashSet<String> names = new HashSet<String>();

	public String getKey(EN pn) {

		if (pn.getText() != null && pn.getText().trim().length() > 0) {
			names.add(pn.getText());
			return pn.getText();
		}

		StringBuffer b = new StringBuffer();

		for (ENXP e : pn.getPrefixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getGivens()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getFamilies()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		for (ENXP e : pn.getSuffixes()) {
			if (b.length() > 0) {
				b.append(" ");
			}
			names.add(e.getText());
			b.append(e.getText());
		}

		return b.toString();

	}

	final HashMap<String, String> randmonIds = new HashMap<String, String>();

	public void deidentifyCDA(IFile file) throws Exception {

		URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

		ClinicalDocument clinicalDocument = CDAUtil.load(cdaURI);

		Query query = new Query(clinicalDocument);

		// Use inline filters - bit simpler then setting up ctors to passing ramdomids and names
		Filter<II> iiFilter = new Filter<II>() {

			@Override
			public boolean accept(II ii) {

				if (ii.isNullFlavorDefined()) {
					return false;
				}

				if ("templateId".equals(ii.eContainingFeature().getName())) {
					return false;
				}

				if ((!"2.16.840.1.113883.1.3".equals(ii.getRoot())) && ii.getExtension() != null &&
						ii.getExtension().trim().length() > 0) {
					String key = getKey(ii);
					if (!randmonIds.containsKey(key)) {
						if (ii.getExtension() != null) {
							randmonIds.put(key, RandomStringUtils.randomNumeric(ii.getExtension().length()));
						} else {
							randmonIds.put(key, RandomStringUtils.randomNumeric(5));
						}
					}

					if (randmonIds.containsKey(key)) {
						ii.setExtension(randmonIds.get(key));
					}
				}

				return true;
			}

		};
		query.getEObjects(II.class, iiFilter);

		Filter<PN> enFilter = new Filter<PN>() {

			@Override
			public boolean accept(PN pn) {

				if (pn.eContainer() != null &&
						"assignedPerson".equals(pn.eContainer().eContainingFeature().getName())) {
					return false;
				}

				if (pn.eContainer() instanceof Material) {
					return false;
				}
				if (pn.isNullFlavorDefined()) {
					return false;
				}

				if (pn.eContainer() instanceof PlayingEntity) {
					return false;
				}

				if (pn.eContainer() instanceof Person && pn.eContainer().eContainer() instanceof AssignedAuthor) {
					return false;
				}

				String key = getKey(pn);

				if (!randmonIds.containsKey(key)) {

					String[] randoms = key.split(" ");

					String newName = key;
					for (String n : randoms) {
						newName = newName.replace(n, RandomStringUtils.randomAlphabetic(5));
					}

					randmonIds.put(key, newName);

				}

				if (randmonIds.containsKey(key)) {

					pn.getMixed().clear();
					pn.getPrefixes().clear();
					pn.getGivens().clear();
					pn.getFamilies().clear();
					pn.getSuffixes().clear();
					pn.addText(randmonIds.get(key));
				}

				return true;
			}

		};
		query.getEObjects(PN.class, enFilter);

		Filter<AD> adFilter = new Filter<AD>() {

			@Override
			public boolean accept(AD item) {

				if (item.isNullFlavorDefined()) {
					return false;
				}

				if (item.getText() != null && item.getText().trim().length() > 0) {
					item.getMixed().clear();
					item.addText(RandomStringUtils.randomAlphabetic(5));
				}
				for (ADXP a : item.getStreetAddressLines()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getCities()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getCounties()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getCountries()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getStates()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getStreetNames()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}

				for (ADXP a : item.getPostalCodes()) {
					a.getMixed().clear();
					a.addText(RandomStringUtils.randomAlphabetic(5));
				}
				return true;
			}

		};
		query.getEObjects(AD.class, adFilter);

		Filter<TEL> telFilter = new Filter<TEL>() {

			@Override
			public boolean accept(TEL item) {
				if (item.isNullFlavorDefined()) {
					return false;
				}

				String avalue = item.getValue();

				if (!StringUtils.isEmpty(avalue) && avalue.indexOf('#') == 0) {
					return false;

				}

				item.setValue(RandomStringUtils.randomAlphabetic(5));
				return false;
			}
		};
		query.getEObjects(TEL.class, telFilter);

		Filter<Section> sectionFilter = new Filter<Section>() {

			@Override
			public boolean accept(Section item) {

				if (item.getText() != null) {
					ByteArrayOutputStream fa = new ByteArrayOutputStream();
					try {
						CDAUtil.saveSnippet(EcoreUtil.copy(item.getText()), fa);

						String newText = fa.toString();
						for (String n : names) {
							if (n.length() > 1) {
								newText = newText.replace(n, RandomStringUtils.randomAlphabetic(n.length()));
							}
						}
						String s = newText.replace("<strucdoctext xmlns=\"urn:hl7-org:v3\">", "").replace(
							"</strucdoctext>", "");

						StrucDocText hhh = item.createStrucDocText(s);
						item.setText(hhh);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				return false;
			}
		};
		query.getEObjects(Section.class, sectionFilter);

		Filter<Patient> patientFilter = new Filter<Patient>() {

			@Override
			public boolean accept(Patient item) {

				if (item.getBirthTime() != null && !StringUtils.isEmpty(item.getBirthTime().getValue())) {
					String currentDate = item.getBirthTime().getValue();
					if (currentDate.length() < 4) {
						currentDate += "0000";
					}

					;
					item.getBirthTime().setValue(currentDate.substring(0, 4) + "01");

				}

				return false;
			}
		};
		query.getEObjects(Patient.class, patientFilter);

		if (file.getParent() != null) {
			IPath p = file.getParent().getProjectRelativePath();

			p = p.append("DeIndentified");

			IFolder f = file.getProject().getFolder(p);
			if (!f.exists()) {
				f.create(true, true, null);
			}

			int i = file.getName().lastIndexOf(file.getFileExtension());

			IFile df = f.getFile(file.getName().substring(0, i - 1) + "_D" + ".xml");
			CDAUtil.save(clinicalDocument, new FileOutputStream(df.getLocation().toOSString()));
		}

	}

	private void processFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {

		for (IResource resource : folder.members()) {

			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}

			if (resource instanceof IFolder && !resource.getName().equals("DeIndentified")) {
				processFolder((IFolder) resource, monitor);
			}
			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				if ("XML".equalsIgnoreCase(file.getFileExtension())) {
					monitor.worked(1);
					monitor.subTask("Processing " + file.getName());
					try {
						deidentifyCDA(file);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
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

			names.clear();
			randmonIds.clear();

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
								Iterator<Object> iter = iss.iterator();
								while (iter.hasNext() && !monitor.isCanceled()) {
									IFile indexfile = null;
									Object o = iter.next();
									if (o instanceof IFolder) {
										IFolder folder = (IFolder) o;

										indexfile = folder.getFile("Index.txt");

										monitor.beginTask("DeIdentify CDA Documents", folder.members().length);
										processFolder(folder, monitor);

									}
									if (o instanceof IFile) {
										indexfile = ((IFolder) ((IFile) o).getParent()).getFile("Index.txt");
										deidentifyCDA((IFile) o);
									}
									if (indexfile != null) {

										StringBuilder sb2 = new StringBuilder();
										for (String key : randmonIds.keySet()) {

											if (!StringUtils.isEmpty(key)) {
												sb2.append(key).append(" = ").append(randmonIds.get(key)).append(
													'\r').append('\n');
											}

											;
										}

										InputStream input = new ByteArrayInputStream(sb2.toString().getBytes());
										if (!indexfile.exists()) {
											indexfile.create(input, true, null);
										} else {
											indexfile.setContents(input, IResource.FORCE, null);
										}
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
				for (String key : randmonIds.keySet()) {

					if (!StringUtils.isEmpty(key)) {
						sb.append(key).append(" = ").append(randmonIds.get(key)).append('\r').append('\n');
					}

					;
				}

				TextTransfer textTransfer = TextTransfer.getInstance();
				cb.setContents(new Object[] { sb.toString() }, new Transfer[] { textTransfer });

				DeIdentificationDialog dlg = new DeIdentificationDialog(window.getShell());
				dlg.create();
				dlg.open();

				// try {

				// } finally {
				// try {
				// input.close();
				// } catch (IOException e) {
				// //ignore
				// }
				// }
				// return file;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
