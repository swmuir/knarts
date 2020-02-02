/**
 */
package org.hl7.elm.r1.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.hl7.elm.r1.R1Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class R1XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		R1Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the R1ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new R1ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new R1ResourceFactoryImpl());
		}
		return registrations;
	}

} //R1XMLProcessor
