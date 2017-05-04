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
package org.eclipse.mdht.cda.xml.ui.editors;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.mdht.cda.xml.ui.Activator;
import org.eclipse.mdht.cda.xml.ui.internal.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.osgi.framework.Bundle;

/**
 * @author seanmuir
 *
 */
public class CDAXSL extends EditorPart {

	Browser browser;

	IFile source;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);

		if (input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) input;
			source = fileInput.getFile();
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {

		browser = new Browser(parent, SWT.BORDER);
		try {
			open(browser, source);
		} catch (Exception e) {
			Logger.logException(e);
		}
	}

	/**
	 * Opens use IWebBrowser which is different from Browser so some duplication
	 *
	 * Using Browser to set parent composite
	 *
	 * @TOOO Add Eclipse Preference for xsl
	 * @param browser
	 * @param sourceFile
	 * @throws Exception
	 */
	private static void open(Browser browser, IFile sourceFile) throws Exception {

		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		URL fileURL = bundle.getEntry("resources/xsl/vha/cda.xsl");

		// Create Temporary File
		File tempFile = File.createTempFile(sourceFile.getName(), ".html");

		// Get Temporary Directory
		Path temporaryDirectory = Paths.get(tempFile.getParent());

		// Get folder for xsl
		URI csspath = URIUtil.toURI(FileLocator.toFileURL(bundle.getEntry("resources/xsl/vha")));

		// Copy any css files - these need to be in the same directory as the temporary file
		DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(csspath), "*.css");

		for (Path entry : stream) {
			Files.copy(
				entry, temporaryDirectory.resolve(entry.getFileName()),
				java.nio.file.StandardCopyOption.REPLACE_EXISTING);
		}

		applyXSL(sourceFile, tempFile, fileURL);

		browser.setUrl(tempFile.toURI().toURL().toString());
	}

	private static void applyXSL(IFile cdaFileName, File temporaryFile, URL styleSheetURL) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();
		Templates template = factory.newTemplates(new StreamSource(styleSheetURL.openConnection().getInputStream()));
		Transformer xformer = template.newTransformer();
		Source source = new StreamSource(cdaFileName.getContents());
		Result result = new StreamResult(new FileOutputStream(temporaryFile));
		xformer.transform(source, result);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {

	}

}
