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

import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.cda.xml.ui.Activator;
import org.eclipse.mdht.cda.xml.ui.internal.Logger;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.osgi.framework.Bundle;

/**
 * @author seanmuir
 *
 */
public class OpenUsingStyleSheet extends AbstractHandler {

	/**
	 * @TODO dd Eclipse Preference for xsl
	 *
	 *       Opens use IWebBrowser which is different from Browser so some duplication
	 *
	 * @see org.eclipse.mdht.cda.xml.ui.editors.CDAXSL.open(Browser, IFile)
	 * @param browser
	 * @param sourceFile
	 * @throws Exception
	 */
	private static void open(final IWebBrowser browser, IFile sourceFile) throws Exception {

		ConsolPackage.eINSTANCE.getContinuityOfCareDocument();
		// HITSPPackage.eINSTANCE.getPatientSummary();

		org.eclipse.emf.common.util.URI cdaURI = org.eclipse.emf.common.util.URI.createFileURI(
			sourceFile.getLocation().toOSString());
		ClinicalDocument clinicalDocument = CDAUtil.load(cdaURI);

		String xslEntry = null;
		String xslFolder = null;
		if (clinicalDocument instanceof GeneralHeaderConstraints) {
			xslEntry = "resources/xsl/vha/cda.xsl";
			xslFolder = "resources/xsl/vha";
		} else {
			xslEntry = "resources/xsl/CDA.xsl";
			xslFolder = "resources/xsl";
		}

		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		URL fileURL = bundle.getEntry(xslEntry);

		// Create Temporary File
		File tempFile = File.createTempFile(sourceFile.getName(), ".html");

		// Get Temporary Directory
		Path temporaryDirectory = Paths.get(tempFile.getParent());

		// Get folder for xsl
		URI csspath = URIUtil.toURI(FileLocator.toFileURL(bundle.getEntry(xslFolder)));

		// Copy any css files - these need to be in the same directory as the temporary file
		DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(csspath), "*.css");

		for (Path entry : stream) {
			Files.copy(
				entry, temporaryDirectory.resolve(entry.getFileName()),
				java.nio.file.StandardCopyOption.REPLACE_EXISTING);
		}

		applyXSL(sourceFile, tempFile, fileURL);

		browser.openURL(tempFile.toURI().toURL());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {

			ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
			if (selection instanceof IStructuredSelection) {

				final IStructuredSelection iss = (IStructuredSelection) selection;

				@SuppressWarnings("unchecked")
				Iterator<Object> iter = iss.iterator();
				while (iter.hasNext()) {

					Object o = iter.next();
					if (o instanceof IFile) {

						IFile sourceFile = (IFile) o;

						final IWebBrowser browser = PlatformUI.getWorkbench().getBrowserSupport().createBrowser(
							Activator.PLUGIN_ID);

						open(browser, sourceFile);

					}
				}

			}

		} catch (Exception e) {
			Logger.logException(e);
		}
		;

		return null;
	}

	private static void applyXSL(IFile cdaFileName, File temporaryFile, URL styleSheetURL) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();
		Templates template = factory.newTemplates(new StreamSource(styleSheetURL.openConnection().getInputStream()));
		Transformer xformer = template.newTransformer();
		Source source = new StreamSource(cdaFileName.getContents());
		Result result = new StreamResult(new FileOutputStream(temporaryFile));
		xformer.transform(source, result);
	}

}
