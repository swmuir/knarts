/*******************************************************************************
 * Copyright (c) 2017,2018 seanmuir.
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.cda.xml.ui.Activator;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.InFulfillmentOf;
import org.eclipse.mdht.uml.cda.InformationRecipient;
import org.eclipse.mdht.uml.cda.PatientRole;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.ui.editors.MDHTPreferences;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.CDAUtil.Query;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;

import com.google.common.base.Stopwatch;

/**
 * @author seanmuir
 *
 */
public class GenerateCDADataFilteredHandler extends GenerateCDABaseHandler {

	Set<EClassifier> populateFilters(String sectionFilter) {
		Set<EClassifier> filters = new HashSet<EClassifier>();

		for (EClassifier ec : ConsolPackage.eINSTANCE.getEClassifiers()) {

			if (CDAPackage.eINSTANCE.getSection().isSuperTypeOf((EClass) ec) && ec.getName().contains(sectionFilter)) {
				filters.add(ec);
			}

		}

		for (EClassifier ec : HITSPPackage.eINSTANCE.getEClassifiers()) {
			if (CDAPackage.eINSTANCE.getSection().isSuperTypeOf((EClass) ec) && ec.getName().contains(sectionFilter)) {
				filters.add(ec);
			}
		}

		return filters;

	}

	ArrayList<EClass> getFilterList() {
		TreeIterator<EObject> aaall = ConsolPackage.eINSTANCE.eAllContents();
		Set<EClass> packageBaseClass = new HashSet<EClass>();
		while (aaall.hasNext()) {
			EObject eo = aaall.next();

			if (eo instanceof EClass) {
				EClass eClass = (EClass) eo;
				for (EClass eClass2 : eClass.getEAllSuperTypes()) {
					if ("ClinicalStatement".equals(eClass2.getName())) {
						packageBaseClass.add(eClass);
						break;
					}

				}
			}

		}

		ArrayList<EClass> baseClasses = new ArrayList<EClass>();

		for (EClass ec : packageBaseClass) {
			boolean isBase = true;
			for (EClass ec2 : ec.getESuperTypes()) {
				if (packageBaseClass.contains(ec2)) {
					isBase = false;
				}
			}
			if (isBase) {
				baseClasses.add(ec);
			}
		}

		Comparator<? super EClass> compare = new Comparator<EClass>() {

			@Override
			public int compare(EClass o1, EClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(baseClasses, compare);

		return baseClasses;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Omit DOB from generated Spreadsheets
		omitDOB = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getBoolean(
			MDHTPreferences.OMIT_DOB_STORE_VALUE);

		omitUnits = org.eclipse.mdht.uml.cda.ui.internal.Activator.getDefault().getPreferenceStore().getBoolean(
			MDHTPreferences.OMIT_UNITS_STORE_VALUE);

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
				return ec.getName();
			}
		};
		ElementListSelectionDialog filterSelectionDialog = new ElementListSelectionDialog(window2.getShell(), lp);

		filterSelectionDialog.setTitle("Select Filter By Type");

		filterSelectionDialog.setMessage("Select a Filter:");

		filterSelectionDialog.setElements(this.getFilterList().toArray());

		;

		if (filterSelectionDialog.open() != Window.OK) {
			return null;
		}
		// return the selection
		final EClass result = (EClass) (filterSelectionDialog.getResult()[0]);

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
										processFolderUsingFilter(folder, result, monitor);
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
					ResultsDialog dlg = new ResultsDialog(window.getShell());
					dlg.create();
					dlg.open();
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

	HashMap<IFile, DocumentMetadata> documentsbyfile = new HashMap<IFile, DocumentMetadata>();

	protected HashMap<String, ArrayList<IFile>> sectionbyfile = new HashMap<String, ArrayList<IFile>>();

	void processFolderUsingFilter(IFolder folder, EClass result2, IProgressMonitor monitor) throws Exception {

		// final Set<EClassifier> filterSet = populateFilters(result2);

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
		documentDateStyles.clear();
		SXSSFWorkbook wb = new SXSSFWorkbook(100);

		wb.setCompressTempFiles(true);
		// HashMap<Integer, String> sheets = new HashMap<Integer, String>();

		sectionbyfile.clear();

		documentsbyfile.clear();

		files.clear();

		errors.clear();
		int offset = 0;

		SXSSFSheet documentsSheet = wb.createSheet("Documents");

		SXSSFSheet sectionsSheet = wb.createSheet("Sections");

		SXSSFRow row1 = null;
		SXSSFRow row2 = documentsSheet.createRow(0);
		offset = createPatientHeader(row1, row2, 0);
		createPatientHeader2(row1, row2, offset);

		// SXSSFSheet encountersSheet = wb.createSheet("Encounters");

		row1 = null;
		// row2 = encountersSheet.createRow(0);

		offset = createPatientHeader(row1, row2, 0);
		createEncounterHeader(row1, row2, offset);

		String fileLocation = folder.getParent().getLocation().toOSString() + System.getProperty("file.separator") +
				DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + result2.getName() + "_SA.xlsx";
		File theFile = new File(fileLocation);

		// If the file exists, check to see if we can open it
		// this is the excel
		if (theFile.exists()) {
			org.apache.commons.io.FileUtils.touch(theFile);
		}

		int filectr = 1;
		long currentProcessingTime = 1;
		Stopwatch stopwatch = Stopwatch.createUnstarted();

		String rolledUpSheet = result2.getName();
		SXSSFSheet newSheet = wb.createSheet(rolledUpSheet);
		newSheet.setRandomAccessWindowSize(50);

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
						URI cdaURI = URI.createFileURI(file.getLocation().toOSString());

						ClinicalDocument clinicalDocument = CDAUtil.load(cdaURI);

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

						documentsbyfile.put(file, documentMetadata); // clinicalDocument.eClass().getName());

						if (clinicalDocument instanceof GeneralHeaderConstraints) {

							EncountersSectionEntriesOptional es = query.getEObject(
								EncountersSectionEntriesOptional.class);

							if (es != null) {
								encounters.addAll(es.getEncounterActivitiess());
							}

							;

							/**
							 * @TODO
							 * 		This is very slow - if the approach is accepted need to optimize
							 */
							Collection<ClinicalStatement> clinicalStatements = EcoreUtil.getObjectsByType(
								CDAUtil.getAllClinicalStatements(clinicalDocument), result2);

							Set<Section> sections = new HashSet<Section>();
							for (ClinicalStatement clinicalStatement : clinicalStatements) {
								sections.add(clinicalStatement.getSection());
							}

							for (Section section : sections) {
								if (section == null) {
									continue;
								}
								SectionSwitch sectionSwitch = new SectionSwitch(
									query, newSheet, documentMetadata, patientRole, serviceEvent, encounters,
									file.getName());
								sectionSwitch.doSwitch(section);
								newSheet.flushRows();
								// }

								String sheetName = sheetName(section);
								if (!sectionbyfile.containsKey(sheetName)) {
									sectionbyfile.put(sheetName, new ArrayList<IFile>());
								}

								sectionbyfile.get(sheetName).add(file);

							}
						} else if (clinicalDocument instanceof org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument) {
							/**
							 * @TODO
							 * 		Only support filter by for Consol at the moment
							 *
							 */

							// org.openhealthtools.mdht.uml.cda.ccd.EncountersSection es = query.getEObject(
							// org.openhealthtools.mdht.uml.cda.ccd.EncountersSection.class);
							//
							// if (es != null) {
							// encounters.addAll(es.getEncounters());
							// }
							//
							// // appendToEncounterSheet(
							// // query, encountersSheet, documentMetadata, patientRole, encounters, file.getName());
							//
							// for (Section section : clinicalDocument.getSections()) {
							// // if (!filterSet.contains(section.eClass())) {
							// // continue;
							// // }
							// String sheetName = result2.getName();
							// if (!(section instanceof org.openhealthtools.mdht.uml.cda.ccd.EncountersSection)) {
							// // if (!sheets.containsKey(section.eClass().getClassifierID())) {
							// // SXSSFSheet newSheet = wb.createSheet(sheetName);
							// // newSheet.setRandomAccessWindowSize(50);
							// // // sheets.put(section.eClass().getClassifierID(), newSheet.getSheetName());
							// // for (EClassifier s : filterSet) {
							// // sheets.put(s.getClassifierID(), newSheet.getSheetName());
							// // }
							// // }
							// C32SectionSwitch sectionSwitch = new C32SectionSwitch(
							// query, newSheet, documentMetadata, patientRole, serviceEvent, encounters,
							// file.getName());
							// Boolean result = sectionSwitch.doSwitch(section);
							// if (!result) {
							// CCDSectionSwitch ccdSectionSwitch = new CCDSectionSwitch(
							// query, newSheet, documentMetadata, patientRole, serviceEvent, encounters,
							// file.getName());
							// result = ccdSectionSwitch.doSwitch(section);
							// }
							// newSheet.flushRows();
							// }
							// if (!sectionbyfile.containsKey(sheetName)) {
							// sectionbyfile.put(sheetName, new ArrayList<IFile>());
							// }
							// sectionbyfile.get(sheetName).add(file);
							// }

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

		row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());

		offset = 0;
		row1.createCell(offset++).setCellValue("File Name");
		// row1.createCell(offset++).setCellValue("Document");
		offset = createDocumentMedadataHeadder(row1, offset++);
		// undo to go back to two rows for headers row1.createCell(offset++).setCellValue("Document Type");
		for (String sectionclass : sortedKeys) {
			Cell cell = row1.createCell(offset++);
			cell.setCellValue(sectionclass);
			if (sectionstyle != null) {
				cell.setCellStyle(sectionstyle);
			}
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
			if (documentsbyfile.containsKey(file)) {
				offset = 0;
				row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
				row1.createCell(offset++).setCellValue(file.getName());
				DocumentMetadata documentMetadata = documentsbyfile.get(file);
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

		row1 = sectionsSheet.createRow(sectionsSheet.getPhysicalNumberOfRows());
		offset = 2;
		for (@SuppressWarnings("unused")
		String sectionclass : sortedKeys) {
			Cell cell = row1.createCell(offset++);
			String columnLetter = CellReference.convertNumToColString(cell.getColumnIndex());
			String strFormula = "COUNTIF(" + columnLetter + "2:" + columnLetter + (lastRow + 1) + ",\"X\")";
			cell.setCellType(Cell.CELL_TYPE_FORMULA);
			cell.setCellFormula(strFormula);
		}

		monitor.subTask(
			"Serializing  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
					result2.getName() + "_SA.xlsx");

		FileOutputStream fileOut = new FileOutputStream(fileLocation);
		wb.write(fileOut);
		fileOut.close();
		wb.close();
		wb.dispose();

		monitor.subTask(
			"Flushing Memory  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
					result2.getName() + "_SA.xlsx");

		monitor.subTask(
			"Reloading  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() + result2.getName() +
					"_SA.xlsx");

		if (folder.members().length < 50) {
			format(fileLocation, monitor);
		}
		monitor.subTask(
			"Completed Saving  " + DATE_FORMAT3.format(new Date()) + "_" + folder.getName().toUpperCase() +
					result2.getName() + "_SA.xlsx");

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.cda.xml.ui.handlers.GenerateCDABaseHandler#getSectionCount(org.eclipse.core.resources.IFile)
	 */
	@Override
	public int getSectionCount(IFile file) {
		int sectionCount = 0;
		for (String eclass : sectionbyfile.keySet()) {
			if (sectionbyfile.get(eclass).contains(file)) {
				sectionCount++;
			}
		}
		return sectionCount;
	}

}
