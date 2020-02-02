/**
 */
package org.hl7.knowledgeartifact.r2.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class R2XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R2XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		R2Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the R2ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new R2ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new R2ResourceFactoryImpl());
		}
		return registrations;
	}

} //R2XMLProcessor
