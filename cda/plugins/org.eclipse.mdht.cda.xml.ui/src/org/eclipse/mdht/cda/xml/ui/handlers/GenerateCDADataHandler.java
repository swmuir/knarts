/*******************************************************************************
 * Copyright (c) 2017, 2018 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *     seanmuir - add filtering by sections
 *
 *******************************************************************************/
package org.eclipse.mdht.cda.xml.ui.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.cda.xml.ui.Activator;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.InFulfillmentOf;
import org.eclipse.mdht.uml.cda.InformationRecipient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.ui.editors.MDHTPreferences;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.mdht.uml.cda.util.CDAUtil.ValidationHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;

import com.google.common.base.Stopwatch;

public class GenerateCDADataHandler extends GenerateCDABaseHandler {

	private static String SPLITBYDOCUMENT = "org.eclipse.mdht.cda.xml.ui.splitbydocument";

	private static String FILTER = "org.eclipse.mdht.cda.xml.ui.filter";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final String splitOption = event.getParameter(SPLITBYDOCUMENT);
		final String filterOption = event.getParameter(FILTER);

		// Omit DOB from generated Spreadsheets
		omitDOB = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getBoolean(
			MDHTPreferences.OMIT_DOB_STORE_VALUE);

		omitUnits = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getBoolean(
			MDHTPreferences.OMIT_UNITS_STORE_VALUE);

		preferenceFilters = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getString(
			MDHTPreferences.CDA_REPORT_DEFAULT_FILTER);

		final HashSet<EClass> theSections = new HashSet<EClass>();

		final HashMap<EClass, HashSet<EClass>> theSectionCache = new HashMap<EClass, HashSet<EClass>>();

		if (filterOption != null) {

			IWorkbenchWindow window2 = HandlerUtil.getActiveWorkbenchWindowChecked(event);

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

			ElementListSelectionDialog filterSelectionDialog = new ElementListSelectionDialog(window2.getShell(), lp);

			filterSelectionDialog.setTitle("Select Section");

			filterSelectionDialog.setMessage("Select a section(s):");

			filterSelectionDialog.setMultipleSelection(true);

			getFilterHash(theSectionCache);

			filterSelectionDialog.setElements(theSectionCache.keySet().toArray());

			;

			if (filterSelectionDialog.open() != Window.OK) {
				return null;
			}
			// return the selection

			for (Object object : filterSelectionDialog.getResult()) {
				theSections.add((EClass) object);
			}

		} else if (filterOption == null && !StringUtils.isEmpty(preferenceFilters)) {
			getFilterHash(theSectionCache);
			List<String> result = Arrays.asList(preferenceFilters.split("\\s*,\\s*"));
			for (String r : result) {
				if (!theSectionCache.containsKey(ConsolPackage.eINSTANCE.getEClassifier(r))) {
					System.out.println("aaaa");
				} else {
					theSections.add((EClass) ConsolPackage.eINSTANCE.getEClassifier(r));
				}
			}
		}

		try {

			boolean completed = true;
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
										monitor.beginTask("Generate Spreadsheet", folder.members().length);
										processFolder2(folder, monitor, splitOption, theSections, theSectionCache);
									}
								}
							} catch (IOException e) {
								ILog log = Activator.getDefault().getLog();
								log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
								throw new InvocationTargetException(e);
							} catch (Exception e) {
								ILog log = Activator.getDefault().getLog();
								log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
							}
						}
					});
				} catch (InvocationTargetException e) {
					ILog log = Activator.getDefault().getLog();
					log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					MessageBox dialog = new MessageBox(window.getShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText("Error processing CDA");
					dialog.setMessage("Make sure Excel file is closed!" + e.getMessage());
					dialog.open();
					completed = false;
				} catch (InterruptedException e) {
					ILog log = Activator.getDefault().getLog();
					log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error generating report", e));
				}

				if (completed) {
					for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
						project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					}
					IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					// ResultsDialog dlg = new ResultsDialog(window.getShell());
					// dlg.create();
					// dlg.open();
				}
			}

		} catch (Exception e) {
			ILog log = org.eclipse.mdht.cda.xml.ui.Activator.getDefault().getLog();
			log.log(
				new Status(
					IStatus.ERROR, org.eclipse.mdht.cda.xml.ui.Activator.PLUGIN_ID, "Error generating report", e));
		}

		return null;
	}

	HashMap<Integer, SXSSFWorkbook> workbooks = new HashMap<Integer, SXSSFWorkbook>();

	HashMap<Integer, EClass> documents = new HashMap<Integer, EClass>();

	HashMap<Integer, HashMap<Integer, String>> sheets = new HashMap<Integer, HashMap<Integer, String>>();

	protected HashMap<Integer, HashMap<String, ArrayList<IFile>>> sectionbyfileByDocument = new HashMap<Integer, HashMap<String, ArrayList<IFile>>>();

	HashMap<Integer, HashMap<IFile, DocumentMetadata>> documentsbyfile = new HashMap<Integer, HashMap<IFile, DocumentMetadata>>();

	protected HashMap<Integer, HashMap<String, ArrayList<IFile>>> documentsbysectionbyfile = new HashMap<Integer, HashMap<String, ArrayList<IFile>>>();

	private static final String CONSOLIDATED = "CONSOLIDATED";

	ArrayList<IFile> getSectionHash(int document, String sheetIndex, String splitOption) {
		int documentIndex;

		if (CONSOLIDATED.equals(splitOption)) {
			documentIndex = 9909;
		} else {
			documentIndex = document; // .getClassifierID();
		}

		if (!documentsbysectionbyfile.containsKey(documentIndex)) {
			documentsbysectionbyfile.put(documentIndex, new HashMap<String, ArrayList<IFile>>());
		}
		if (!documentsbysectionbyfile.get(documentIndex).containsKey(sheetIndex)) {
			documentsbysectionbyfile.get(documentIndex).put(sheetIndex, new ArrayList<IFile>());
		}
		ArrayList<IFile> result = documentsbysectionbyfile.get(documentIndex).get(sheetIndex);

		return result;

	}

	HashMap<IFile, DocumentMetadata> getDMHash(int document, String splitOption) {
		int documentIndex;

		if (CONSOLIDATED.equals(splitOption)) {
			documentIndex = 9909;
		} else {
			documentIndex = document; // .getClassifierID();
		}

		if (!documentsbyfile.containsKey(documentIndex)) {
			documentsbyfile.put(documentIndex, new HashMap<IFile, DocumentMetadata>());
		}
		return documentsbyfile.get(documentIndex);

	}

	String getSheet(EClass document, EClass sectionEClass, String splitOption) {
		int documentIndex;

		if (CONSOLIDATED.equals(splitOption)) {
			documentIndex = 9909;
		} else {
			documentIndex = document.getClassifierID();
		}

		if (!sheets.containsKey(documentIndex)) {
			sheets.put(documentIndex, new HashMap<Integer, String>());
		}
		if (!sheets.get(documentIndex).containsKey(sectionEClass.getClassifierID())) {

			String sheetName = sheetName(sectionEClass);
			/*
			 * get and create appears to not use the same length of string
			 * So walk the collection and see if we have the previous version of section created first
			 *
			 *
			 */
			for (Integer akey : sheets.get(documentIndex).keySet()) {
				if (sheetName.startsWith(sheets.get(documentIndex).get(akey))) {
					sheets.get(documentIndex).put(sectionEClass.getClassifierID(), sheets.get(documentIndex).get(akey));
					return sheets.get(documentIndex).get(akey);
				}
			}

			SXSSFWorkbook wb = getWorkbook(document, splitOption);

			SXSSFSheet newSheet = wb.createSheet(sheetName);
			newSheet.setRandomAccessWindowSize(50);
			sheets.get(documentIndex).put(sectionEClass.getClassifierID(), newSheet.getSheetName());

		}
		return sheets.get(documentIndex).get(sectionEClass.getClassifierID());

	}

	SXSSFWorkbook getWorkbook(EClass document, String splitOption) {

		int documentIndex;

		if (CONSOLIDATED.equals(splitOption)) {
			documentIndex = 9909;
		} else {
			documentIndex = document.getClassifierID();
		}

		if (!workbooks.containsKey(documentIndex)) {
			int offset = 0;
			SXSSFWorkbook wb = new SXSSFWorkbook(100);

			wb.setCompressTempFiles(true);

			SXSSFSheet documentsSheet = wb.createSheet("Documents");

			SXSSFSheet sectionsSheet = wb.createSheet("Sections");

			SXSSFSheet encountersSheet = wb.createSheet("Encounters");

			SXSSFSheet demographicsSheet = wb.createSheet("Demographics");

			sectionbyfileByDocument.put(documentIndex, new HashMap<String, ArrayList<IFile>>());

			SXSSFRow row1 = null;
			SXSSFRow row2 = documentsSheet.createRow(0);
			offset = createPatientHeader(row1, row2, 0);
			createPatientHeader2(row1, row2, offset);

			row1 = null;
			row2 = encountersSheet.createRow(0);

			offset = createPatientHeader(row1, row2, 0);
			createEncounterHeader(row1, row2, offset);

			row1 = null;
			row2 = demographicsSheet.createRow(0);

			offset = createPatientHeader(row1, row2, 0);
			offset = createDemographicsHeader(row1, row2, offset);

			workbooks.put(documentIndex, wb);
			documents.put(documentIndex, document);
		}

		return workbooks.get(documentIndex);

	}

	String getFileName(Integer eclass, String splitOption) {

		if (CONSOLIDATED.equals(splitOption)) {
			return CONSOLIDATED;
		} else {
			return documents.get(eclass).getName();
		}

	}

	/**
	 * If there is no null flavor and there is a entries or large narrative return true
	 * else
	 * return
	 * false
	 *
	 * @param section
	 * @return boolean
	 */
	private boolean shouldCountSection(Section section) {
		if (section.isNullFlavorUndefined()) {
			if (!section.getEntries().isEmpty()) {
				return true;
			}
			if (section.getText() != null && section.getText().getText() != null) {
				if (section.getText().getText().length() > 50) {
					return true;
				}
			}
		}
		return false;
	}

	static String getMemoryUssage() {
		Map<String, String> memoryMap = new HashMap<>();

		for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
			memoryMap.put("gc.getName() count", String.valueOf(gc.getCollectionCount()));
			memoryMap.put("gc.getName() time", String.valueOf(gc.getCollectionTime()));
		}
		MemoryMXBean memBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage memHeapUsage = memBean.getHeapMemoryUsage();
		MemoryUsage nonHeapUsage = memBean.getNonHeapMemoryUsage();
		memoryMap.put("heapInit", String.valueOf(memHeapUsage.getInit()));
		memoryMap.put("heapMax", String.valueOf(memHeapUsage.getMax()));
		memoryMap.put("heapCommit", String.valueOf(memHeapUsage.getCommitted()));
		memoryMap.put("heapUsed", String.valueOf(memHeapUsage.getUsed()));
		memoryMap.put("nonHeapInit", String.valueOf(nonHeapUsage.getInit()));
		memoryMap.put("nonHeapMax", String.valueOf(nonHeapUsage.getMax()));
		memoryMap.put("nonHeapCommit", String.valueOf(nonHeapUsage.getCommitted()));
		memoryMap.put("nonHeapUsed", String.valueOf(nonHeapUsage.getUsed()));
		return memoryMap.toString();
	}

	private static final String MDHTCONSOLE = "MDHTCONSOLE";

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		org.eclipse.ui.console.IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new org.eclipse.ui.console.IConsole[] { myConsole });
		return myConsole;
	}

	void processFolder2(IFolder folder, IProgressMonitor monitor, String splitOption, HashSet<EClass> sectionFilter,
			HashMap<EClass, HashSet<EClass>> theSectionCache) throws Exception {

		MessageConsole myConsole = findConsole(MDHTCONSOLE);
		// IWorkbench wb = PlatformUI.getWorkbench();
		// IWorkbenchWindow win = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		// IWorkbenchPage page = win.getActivePage();
		//
		// // WorkbenchPage page = ...;// obtain the active page
		// String id = IConsoleConstants.ID_CONSOLE_VIEW;
		// IConsoleView view = (IConsoleView) page.showView(id);
		// view.display(myConsole);

		MessageConsoleStream out = myConsole.newMessageStream();
		out.println("Hello from Generic console sample action");

		/*
		 * Set Ratio low as to prevent Zip Bomb Detection
		 */
		ZipSecureFile.setMinInflateRatio(0.000001);

		ConsolPackage.eINSTANCE.getContinuityOfCareDocument();
		HITSPPackage.eINSTANCE.getPatientSummary();

		/*
		 * There is a limitation on the number of cell styles you can create
		 * We create a global instance of the documentDateStyle for use in the getDocumentDateStyle()
		 * Set it to null on start up because it is bound to a particular workbook
		 *
		 * Not optimal but did not want to send the documentDateStyle as an argument to all the serialization methods
		 */
		// documentDateStyle = null;

		documentDateStyles.clear();
		sheets.clear();

		sectionbyfileByDocument.clear();
		documentsbysectionbyfile.clear();
		documentsbyfile.clear();

		workbooks.clear();

		files.clear();

		errors.clear();

		documents.clear();

		int offset = 0;

		int filectr = 1;
		long currentProcessingTime = 1;
		Stopwatch stopwatch = Stopwatch.createUnstarted();

		int totalFiles = folder.members().length;
		for (IResource resource : folder.members()) {
			stopwatch.reset();
			stopwatch.start();
			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}

			if (resource instanceof IFile) {

				IFile file = (IFile) resource;

				if ("XML".equalsIgnoreCase(file.getFileExtension())) {
					files.add(file);
					monitor.worked(1);
					double estimatedTimeLeft = ((folder.members().length - filectr) *
							(currentProcessingTime / filectr)) / 1000.0;

					if (estimatedTimeLeft > 60) {
						monitor.setTaskName(
							"Generate Spreadsheet, Estimated Time to finish : " + ((int) estimatedTimeLeft / 60) +
									" Minutes ");
					} else {
						monitor.setTaskName(
							"Generate Spreadsheet, Estimated Time to finish : " + ((int) estimatedTimeLeft) +
									" Seconds ");
					}

					monitor.subTask(
						"Processing File " + StringUtils.leftPad(String.valueOf(filectr++), 5) + " of " +
								StringUtils.leftPad(String.valueOf(totalFiles), 5) + " Average Time per File " +
								(currentProcessingTime / filectr) / 1000.0 + " Seconds ");
					try {

						out.println(getMemoryUssage());

						URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

						out.println("Start Load " + currentProcessingTime);
						ClinicalDocument clinicalDocument = CDAUtil.load(
							new FileInputStream(cdaURI.toFileString()), ((ValidationHandler) null));
						out.println("End Load " + currentProcessingTime);

						SXSSFWorkbook wb = this.getWorkbook(clinicalDocument.eClass(), splitOption);
						HashMap<String, ArrayList<IFile>> ddsectionbyfile = sectionbyfileByDocument.get(
							clinicalDocument.eClass());

						SXSSFSheet documentsSheet = wb.getSheet("Documents");
						SXSSFSheet demographicsSheet = wb.getSheet("Demographics");
						SXSSFSheet encountersSheet = wb.getSheet("Encounters");

						List<Encounter> encounters = new ArrayList<Encounter>();

						Query query = new Query(clinicalDocument);

						// Need to initialize author references because the order of the sections being return is not necessarily the physical order
						List<Author> authors = query.getEObjects(Author.class);
						initAuthorReferences(authors, PorO.ORGANIZATION);
						initAuthorReferences(authors, PorO.PERSON);

						PatientRole patientRole = query.getEObject(PatientRole.class);
						ServiceEvent serviceEvent = query.getEObject(ServiceEvent.class);
						InformationRecipient ir = query.getEObject(InformationRecipient.class);
						InFulfillmentOf iffo = query.getEObject(InFulfillmentOf.class);
						DocumentMetadata documentMetadata = appendToPatientSheet(
							query, documentsSheet, patientRole, ir, iffo, file.getName());

						appendToDemographicsSheet(query, demographicsSheet, documentMetadata, patientRole);

						getDMHash(clinicalDocument.eClass().getClassifierID(), splitOption).put(file, documentMetadata);

						if (clinicalDocument instanceof GeneralHeaderConstraints) {
							out.println("Start Processing " + currentProcessingTime);
							EncountersSectionEntriesOptional es = query.getEObject(
								EncountersSectionEntriesOptional.class);

							if (es != null) {
								encounters.addAll(es.getEncounterActivitiess());
							}

							appendToEncounterSheet(
								query, encountersSheet, documentMetadata, patientRole, encounters, file.getName());

							for (Section section : clinicalDocument.getSections()) {

								EClass theSectionEClass = section.eClass();

								if (!sectionFilter.isEmpty() && !sectionFilter.contains(section.eClass())) {

									boolean found = false;
									for (EClass sectionClass : sectionFilter) {
										if (theSectionCache.get(sectionClass).contains(section.eClass())) {
											theSectionEClass = sectionClass;
											found = true;
											break;
										}
									}
									if (!found) {
										continue;

									}
								}

								String sheetIndex = getSheet(clinicalDocument.eClass(), theSectionEClass, splitOption);
								if (!(section instanceof EncountersSectionEntriesOptional)) {
									SectionSwitch sectionSwitch = new SectionSwitch(
										query, wb.getSheet(sheetIndex), documentMetadata, patientRole, serviceEvent,
										encounters, file.getName());
									sectionSwitch.doSwitch(section);
									wb.getSheet(sheetIndex).flushRows();
								}
								if (section.getText() != null && section.getText().getText() != null) {
									if (section.getText().getText().length() < 50) {

									}
								}

								if (shouldCountSection(section)) {
									getSectionHash(
										clinicalDocument.eClass().getClassifierID(), sheetIndex, splitOption).add(file);

								}

							}
							out.println("End Processing " + currentProcessingTime);
						} else {

							org.openhealthtools.mdht.uml.cda.ccd.EncountersSection es = query.getEObject(
								org.openhealthtools.mdht.uml.cda.ccd.EncountersSection.class);

							if (es != null) {
								encounters.addAll(es.getEncounters());
							}

							appendToEncounterSheet(
								query, encountersSheet, documentMetadata, patientRole, encounters, file.getName());

							for (Section section : clinicalDocument.getSections()) {
								String sheetIndex = getSheet(clinicalDocument.eClass(), section.eClass(), splitOption);
								if (!(section instanceof org.openhealthtools.mdht.uml.cda.ccd.EncountersSection)) {
									C32SectionSwitch sectionSwitch = new C32SectionSwitch(
										query, wb.getSheet(sheetIndex), documentMetadata, patientRole, serviceEvent,
										encounters, file.getName());
									Boolean result = sectionSwitch.doSwitch(section);
									if (!result) {
										CCDSectionSwitch ccdSectionSwitch = new CCDSectionSwitch(
											query, wb.getSheet(sheetIndex), documentMetadata, patientRole, serviceEvent,
											encounters, file.getName());
										result = ccdSectionSwitch.doSwitch(section);
									}
									wb.getSheet(sheetIndex).flushRows();
								}
								if (shouldCountSection(section)) {
									getSectionHash(
										clinicalDocument.eClass().getClassifierID(), sheetIndex, splitOption).add(file);
								}
							}

						}
						clinicalDocument.eResource().unload();
						currentProcessingTime += stopwatch.elapsed(TimeUnit.MILLISECONDS);
					} catch (Exception exception) {
						exception.printStackTrace();
						errors.put(file, exception);
					}
				}
				stopwatch.stop();
			}

		}

		monitor.beginTask("Generate Spreadsheet", folder.members().length);

		for (Integer eClass : workbooks.keySet()) {

			HashMap<String, ArrayList<IFile>> sectionbyfile = documentsbysectionbyfile.get(eClass);

			if (sectionbyfile == null) {
				sectionbyfile = new HashMap<String, ArrayList<IFile>>();
			}

			SXSSFWorkbook wb = workbooks.get(eClass);
			SXSSFSheet sectionsSheet = wb.getSheet("Sections");

			List<String> sortedKeys = new ArrayList<String>(sectionbyfile.keySet());
			Collections.sort(sortedKeys);

			Font boldFont = wb.createFont();
			boldFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
			CellStyle sectionstyle = null;
			if (sectionsSheet.getWorkbook().getNumCellStyles() < 100) {
				sectionstyle = sectionsSheet.getWorkbook().createCellStyle();
				sectionstyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
				sectionstyle.setRotation((short) -90);
				sectionstyle.setFont(boldFont);
			}

			SXSSFRow row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());

			offset = 0;
			// row1.createCell(offset++).setCellValue("File Name");
			// row1.createCell(offset++).setCellValue("Document");
			offset = createDocumentMedadataHeadder(row1, offset++);
			int metadataoffset = offset;

			// undo to go back to two rows for headers row1.createCell(offset++).setCellValue("Document Type");
			for (String sectionclass : sortedKeys) {
				Cell cell = row1.createCell(offset++);
				cell.setCellValue(sectionclass);
				if (sectionstyle != null) {
					cell.setCellStyle(sectionstyle);
				}
			}

			row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
			// offset = 2;
			for (@SuppressWarnings("unused")
			String sectionclass : sortedKeys) {
				Cell cell = row1.createCell(metadataoffset++);
				String columnLetter = CellReference.convertNumToColString(cell.getColumnIndex());
				String strFormula = "COUNTIF(" + columnLetter + "3:" + columnLetter + (files.size() + 2) + ",\"X\")";
				cell.setCellType(Cell.CELL_TYPE_FORMULA);
				cell.setCellFormula(strFormula);
			}

			CellStyle style = null;
			if (sectionsSheet.getWorkbook().getNumCellStyles() < 100) {
				style = sectionsSheet.getWorkbook().createCellStyle();
				style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				style.setAlignment(CellStyle.ALIGN_CENTER);
			}

			// style.setFont(font);

			// CellStyle boldstyle = wb.createCellStyle();

			// boldstyle.setFont(boldFont);
			int lastRow = 0;
			for (IFile file : files) {
				if (getDMHash(eClass, splitOption).containsKey(file)) {
					offset = 0;
					row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
					// row1.createCell(offset++).setCellValue(file.getName());
					DocumentMetadata documentMetadata = getDMHash(eClass, splitOption).get(file);
					offset = serializeDocumentMetadata(row1, offset, documentMetadata);
					lastRow = row1.getRowNum();
					for (String sectionclass : sortedKeys) {
						if (sectionbyfile.get(sectionclass).contains(file)) {
							Cell cell = row1.createCell(offset++);
							cell.setCellValue("X");
							if (style != null) {
								cell.setCellStyle(style);
							}
						} else {
							row1.createCell(offset++).setCellValue("");
						}
					}
				}
			}

			// row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
			// // offset = 2;
			// for (@SuppressWarnings("unused")
			// String sectionclass : sortedKeys) {
			// Cell cell = row1.createCell(metadataoffset++);
			// String columnLetter = CellReference.convertNumToColString(cell.getColumnIndex());
			// String strFormula = "COUNTIF(" + columnLetter + "2:" + columnLetter + (lastRow + 1) + ",\"X\")";
			// cell.setCellType(Cell.CELL_TYPE_FORMULA);
			// cell.setCellFormula(strFormula);
			// }

			String fileLocation = folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
					DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
					getFileName(eClass, splitOption) + "_SA.xlsx";
			File theFile = new File(fileLocation);

			// If the file exists, check to see if we can open it
			// this is the excel
			if (theFile.exists()) {
				org.apache.commons.io.FileUtils.touch(theFile);
			}

			monitor.subTask(
				"Serializing  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.xlsx");

			FileOutputStream fileOut = new FileOutputStream(fileLocation);
			wb.write(fileOut);
			fileOut.close();
			wb.close();
			wb.dispose();

			monitor.subTask(
				"Flushing Memory  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
						"_SA.xlsx");

			monitor.subTask(
				"Reloading  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + "_SA.xlsx");

			if (false && folder.members().length < 50) {
				format(fileLocation, monitor);
			}
			monitor.subTask(
				"Completed Saving  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
						"_SA.xlsx");

		}

	}

	/**
	 * @param query
	 * @param demographicsSheet
	 * @param patientRole
	 * @param ir
	 * @param iffo
	 * @param string
	 */
	private void appendToDemographicsSheet(Query query, SXSSFSheet sheet, DocumentMetadata documentMetadata,
			PatientRole patientRole) {

		Row row = sheet.createRow(sheet.getPhysicalNumberOfRows());

		int offset = serializePatient2(row, 0, documentMetadata, patientRole);
		/*
		 * race
		 * gender
		 * patient name
		 * address
		 * dob XXX
		 * phone #
		 * ethnicity
		 * document id XXX
		 * language
		 * phone #
		 */
		serializeSectionAndFileName(row, offset, null, documentMetadata.fileName);

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDABaseHandler#getSectionCount(org.eclipse.core.resources.IFile)
	 */
	@Override
	public int getSectionCount(IFile file) {
		int count = 0;
		for (Integer i : documentsbysectionbyfile.keySet()) {
			for (String s : documentsbysectionbyfile.get(i).keySet()) {
				if (documentsbysectionbyfile.get(i).get(s).contains(file)) {
					count++;
				}
			}
		}

		// TODO Auto-generated method stub
		return count;
	}

	void getFilterHash(HashMap<EClass, HashSet<EClass>> theSections) {

		TreeIterator<EObject> packageContents = ConsolPackage.eINSTANCE.eAllContents();

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
