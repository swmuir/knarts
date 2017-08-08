/**
 * Copyright (c) 2017 Joerg Kiegeland
 * 
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.fhir.converter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;

/**
 * During XML serialization, default namespaces are used for packages which have
 * an empty namespace prefix set (e.g. by calling
 * <code>EPackage.setNsPrefix("")</code>), otherwise behaves like
 * {@link XMLResourceImpl}
 */
public class DefaultNamespaceCapableResourceImpl extends XMLResourceImpl {

	public DefaultNamespaceCapableResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLSave createXMLSave() {
		return new XMLSaveImpl(createXMLHelper()) {

			@Override
			protected void saveElementID(EObject o) {
				EPackage p = o.eClass().getEPackage();
				if ("".equals(p.getNsPrefix()) && (o.eContainer() == null || o.eContainer() != null && p != o.eContainer().eClass().getEPackage())) {
					// add xmlns=".." if namespace changed
					doc.addAttribute(XMLResource.XML_NS, p.getNsURI());
				}
				super.saveElementID(o);
			}
		};
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new XMLHelperImpl(this) {

			{
				namespaceSupport = new NamespaceSupport() {

					public String getPrefix(String uri) {
						EPackage p = EPackage.Registry.INSTANCE.getEPackage(uri);
						if (p != null && "".equals(p.getNsPrefix())) {
							// deactivate EMF's namespace handling
							return "";
						}
						return super.getPrefix(uri);
					};

				};

			}
		};
	}

}
