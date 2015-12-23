/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.valueset;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='valueSets'"
 * @generated
 */
public interface FhirValuesetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "valueset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdht/schema/fhir/core/valueset/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "valueset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FhirValuesetPackage eINSTANCE = org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DataType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResourceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType <em>Fhir Defined Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFhirDefinedType()
	 * @generated
	 */
	int FHIR_DEFINED_TYPE = 2;


	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType <em>Fhir Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Defined Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType
	 * @generated
	 */
	EEnum getFhirDefinedType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FhirValuesetFactory getFhirValuesetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DataType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResourceType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType <em>Fhir Defined Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFhirDefinedType()
		 * @generated
		 */
		EEnum FHIR_DEFINED_TYPE = eINSTANCE.getFhirDefinedType();

	}

} //FhirValuesetPackage
