/*******************************************************************************
 * Copyright (c) 2017, Sean Muir (HL7) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (HL7) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.actions;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.osgi.framework.Bundle;

/**
 * Main entry point of the 'SampleA' generation module.
 */
public class GenerateAll {

	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;

	protected void collapseFragments(Resource umlResource) {
		EcoreUtil.resolveAll(umlResource.getResourceSet());

		for (Resource controlledResource : UMLUtil.getControlledResources(umlResource)) {
			EList<EObject> umlResourceContents = umlResource.getContents();

			for (ListIterator<EObject> contents = controlledResource.getContents().listIterator(); contents.hasNext();) {
				EObject next = contents.next();

				contents.remove();

				if (next.eContainer() == null) {
					umlResourceContents.add(next);
				}
			}
		}
	}

	/**
	 * Constructor.
	 *
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated NOT
	 */
	public GenerateAll(URI modelURI, IContainer targetFolder, List<? extends Object> arguments) {

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		org.eclipse.mdht.uml.common.UmlPlugin.computeModelPathMapExtensions();

		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

		Package pkg = (Package) UML2Util.load(resourceSet, modelURI, UMLPackage.Literals.PACKAGE);
		collapseFragments(pkg.eResource());

		URI tempModelURI = pkg.eResource().getURI();
		tempModelURI = tempModelURI.trimFileExtension();
		tempModelURI = tempModelURI.trimSegments(1).appendSegment(tempModelURI.lastSegment() + "_TEMP");
		String fileExtension = pkg.eResource().getURI().fileExtension();
		if (!fileExtension.equals(tempModelURI.fileExtension())) {
			tempModelURI = tempModelURI.appendFileExtension(fileExtension);
		}

		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			pkg.eResource().setURI(tempModelURI);
			pkg.eResource().save(saveOptions);

			// pkg.eResource().

		} catch (IOException e) {
			e.printStackTrace();
			// throw new TransformationException("Failed to save transformed model.", e);
		}

		this.modelURI = tempModelURI;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}

		// final URI template0 = getTemplateURI("org.eclipse.acceleo.module.sampleA", new
		// Path("/org/eclipse/acceleo/module/sampleA/main/generate.emtl"));
		// org.eclipse.acceleo.module.sampleA.main.Generate gen0 = new org.eclipse.acceleo.module.sampleA.main.Generate(modelURI,
		// targetFolder.getLocation().toFile(), arguments) {
		// protected URI createTemplateURI(String entry) {
		// return template0;
		// }
		// };
		// gen0.doGenerate(BasicMonitor.toMonitor(monitor));
		monitor.subTask("Loading...");
		org.eclipse.mdht.uml.cda.ui.acceleo.main.Generate gen0 = new org.eclipse.mdht.uml.cda.ui.acceleo.main.Generate(
			modelURI, targetFolder.getLocation().toFile(), arguments);
		monitor.worked(1);
		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID(
			"org.eclipse.acceleo.module.sampleA", "org.eclipse.acceleo.module.sampleA.main.Generate",
			modelURI.toString(), targetFolder.getFullPath().toString(), new ArrayList<String>());
		gen0.setGenerationID(generationID);
		gen0.doGenerate(BasicMonitor.toMonitor(monitor));

	}

	/**
	 * Finds the template in the plug-in. Returns the template plug-in URI.
	 *
	 * @param bundleID
	 *            is the plug-in ID
	 * @param relativePath
	 *            is the relative path of the template in the plug-in
	 * @return the template URI
	 * @throws IOException
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private URI getTemplateURI(String bundleID, IPath relativePath) throws IOException {
		Bundle bundle = Platform.getBundle(bundleID);
		if (bundle == null) {
			// no need to go any further
			return URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		URL url = bundle.getEntry(relativePath.toString());
		if (url == null && relativePath.segmentCount() > 1) {
			Enumeration<URL> entries = bundle.findEntries("/", "*.emtl", true);
			if (entries != null) {
				String[] segmentsRelativePath = relativePath.segments();
				while (url == null && entries.hasMoreElements()) {
					URL entry = entries.nextElement();
					IPath path = new Path(entry.getPath());
					if (path.segmentCount() > relativePath.segmentCount()) {
						path = path.removeFirstSegments(path.segmentCount() - relativePath.segmentCount());
					}
					String[] segmentsPath = path.segments();
					boolean equals = segmentsPath.length == segmentsRelativePath.length;
					for (int i = 0; equals && i < segmentsPath.length; i++) {
						equals = segmentsPath[i].equals(segmentsRelativePath[i]);
					}
					if (equals) {
						url = bundle.getEntry(entry.getPath());
					}
				}
			}
		}
		URI result;
		if (url != null) {
			result = URI.createPlatformPluginURI(new Path(bundleID).append(new Path(url.getPath())).toString(), false);
		} else {
			result = URI.createPlatformResourceURI(new Path(bundleID).append(relativePath).toString(), false);
		}
		return result;
	}

}
