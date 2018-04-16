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

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.google.common.base.Stopwatch;

public class PackageCDAHandler extends DeidentifyCDAHandler {

	public static void zipFolder(final IFolder folder, final IFile zipFile) throws IOException, CoreException {
		zipFolder(folder, new FileOutputStream(zipFile.getLocation().toOSString()));
	}

	public static void zipFolder(final IFolder folder, final OutputStream outputStream)
			throws IOException, CoreException {
		try (ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream)) {
			processFolder(folder, zipOutputStream);
		}
	}

	private static void processFolder(final IFolder folder, final ZipOutputStream zipOutputStream)
			throws IOException, CoreException {

		folder.refreshLocal(IResource.DEPTH_INFINITE, null);

		for (final IResource resource : folder.members()) {
			if (resource instanceof IFile) {
				IFile file = (IFile) resource;
				final ZipEntry zipEntry = new ZipEntry(file.getName());
				zipOutputStream.putNextEntry(zipEntry);
				IOUtils.copy(file.getContents(), zipOutputStream);
				zipOutputStream.closeEntry();
			}
		}
	}

	/**
	 * @TODO Most of this is a duplication of the deident parent - need to consolidate procedures better
	 *
	 *       (non-Javadoc)
	 * @see org.eclipse.mdht.cda.xml.ui.handlers.DeidentifyCDAHandler#processFolder(org.eclipse.core.resources.IFolder,
	 *      org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void processFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {

		int filectr = 1;
		long currentProcessingTime = 1;
		long totalBytes = 0;
		long totalBytes2 = 0;
		Stopwatch stopwatch = Stopwatch.createUnstarted();

		setFolderPrefix(folder.getName() + "Deidentified" + DATE_FORMAT3.format(new Date()));

		documents.clear();

		/**
		 * @TODO - Use better approach to selecting document for packaging
		 */
		IFile documentlist = folder.getFile("documents.txt");

		if (!documentlist.exists()) {
			return;
		}

		;

		BufferedReader reader = new BufferedReader(new InputStreamReader(documentlist.getContents()));
		String fileName;
		ArrayList<String> files = new ArrayList<String>();
		try {
			while ((fileName = reader.readLine()) != null) {
				files.add(fileName);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (IResource resource : folder.members()) {

			if (monitor.isCanceled()) {
				monitor.done();
				break;
			}
			if (resource instanceof IFile && files.contains(resource.getName())) {
				IFile file = (IFile) resource;
				IFileStore fs = org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
				if ("XML".equalsIgnoreCase(file.getFileExtension())) {
					documents.add(file);
					IFileStore fs1 = org.eclipse.core.filesystem.EFS.getStore(file.getLocationURI());
					totalBytes += fs1.fetchInfo().getLength();
				}
			}
		}

		totalBytes2 = totalBytes;

		monitor.setTaskName("DeIdentify Folder (" + format2Places.format(totalBytes2 / 1000000.0) + " MB) ");

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

			if (files.contains(document.getName())) {

				monitor.worked(1);

				if (estimatedTimeLeft != 0) {
					if (estimatedTimeLeft > 60) {
						monitor.setTaskName(
							"DeIdentify Folder (" + format2Places.format(totalBytes2 / 1000000.0) +
									" MB), Estimated Time to finish : " + ((int) estimatedTimeLeft / 60) + " Minutes ");
					} else {
						monitor.setTaskName(
							"DeIdentify Folder (" + format2Places.format(totalBytes2 / 1000000.0) +
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
					deidentifyCDA(document);
					stopwatch.stop();
					currentProcessingTime = stopwatch.elapsed(TimeUnit.MILLISECONDS);

					long ratePerSecond = fileSize / stopwatch.elapsed(TimeUnit.MILLISECONDS);

					totalBytes -= fileSize;

					estimatedTimeLeft = (totalBytes / ratePerSecond) / 1000;

				} catch (Exception e) {
					e.printStackTrace();
				}
				if (monitor.isCanceled()) {
					break;
				}

			}
		}

		try {
			zipFolder(folder.getFolder(this.getFolderPrefix()), folder.getFile(this.getFolderPrefix() + ".zip"));

			folder.getFolder(this.getFolderPrefix()).delete(true, null);

			folder.refreshLocal(IResource.DEPTH_INFINITE, null);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
