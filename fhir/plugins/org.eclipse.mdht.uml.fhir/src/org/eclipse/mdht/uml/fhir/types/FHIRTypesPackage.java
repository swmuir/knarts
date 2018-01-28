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
package org.eclipse.mdht.uml.fhir.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesFactory
 * @model kind="package"
 * @generated
 */
public interface FHIRTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdht/schema/profile/fhir/types/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhirtypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FHIRTypesPackage eINSTANCE = org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.types.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.types.impl.ExtensionImpl
	 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__URL = 0;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_STRING = 1;

	/**
	 * The feature id for the '<em><b>Value Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE_INTEGER = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.types.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.types.impl.DataTypeImpl
	 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.types.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.types.impl.CodeableConceptImpl
	 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getCodeableConcept()
	 * @generated
	 */
	int CODEABLE_CONCEPT = 2;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__CODING = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Codeable Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Codeable Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.types.impl.CodingImpl <em>Coding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.types.impl.CodingImpl
	 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getCoding()
	 * @generated
	 */
	int CODING = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__VERSION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__CODE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__DISPLAY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.types.impl.ContactDetailImpl <em>Contact Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.types.impl.ContactDetailImpl
	 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getContactDetail()
	 * @generated
	 */
	int CONTACT_DETAIL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Telecom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__TELECOM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL__ID = 2;

	/**
	 * The number of structural features of the '<em>Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contact Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.types.impl.ContactPointImpl <em>Contact Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.types.impl.ContactPointImpl
	 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getContactPoint()
	 * @generated
	 */
	int CONTACT_POINT = 5;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.types.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.types.impl.ReferenceImpl
	 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.types.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.Extension#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Extension#getUrl()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.Extension#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Extension#getValueString()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ValueString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.Extension#getValueInteger <em>Value Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Integer</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Extension#getValueInteger()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ValueInteger();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.types.Extension#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Extension#getValue()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.types.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.types.CodeableConcept <em>Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codeable Concept</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.CodeableConcept
	 * @generated
	 */
	EClass getCodeableConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.types.CodeableConcept#getCodings <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.CodeableConcept#getCodings()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Coding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.CodeableConcept#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.CodeableConcept#getText()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EAttribute getCodeableConcept_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.types.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Coding
	 * @generated
	 */
	EClass getCoding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.Coding#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Coding#getSystem()
	 * @see #getCoding()
	 * @generated
	 */
	EAttribute getCoding_System();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.Coding#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Coding#getVersion()
	 * @see #getCoding()
	 * @generated
	 */
	EAttribute getCoding_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.Coding#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Coding#getCode()
	 * @see #getCoding()
	 * @generated
	 */
	EAttribute getCoding_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.Coding#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Coding#getDisplay()
	 * @see #getCoding()
	 * @generated
	 */
	EAttribute getCoding_Display();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.types.ContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Detail</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.ContactDetail
	 * @generated
	 */
	EClass getContactDetail();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.ContactDetail#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.ContactDetail#getName()
	 * @see #getContactDetail()
	 * @generated
	 */
	EAttribute getContactDetail_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.types.ContactDetail#getTelecoms <em>Telecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.ContactDetail#getTelecoms()
	 * @see #getContactDetail()
	 * @generated
	 */
	EReference getContactDetail_Telecom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.ContactDetail#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.ContactDetail#getId()
	 * @see #getContactDetail()
	 * @generated
	 */
	EAttribute getContactDetail_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.types.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.ContactPoint
	 * @generated
	 */
	EClass getContactPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.ContactPoint#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.ContactPoint#getSystem()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_System();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.ContactPoint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.ContactPoint#getValue()
	 * @see #getContactPoint()
	 * @generated
	 */
	EAttribute getContactPoint_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.types.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.types.Reference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.types.Reference#getReference()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Reference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FHIRTypesFactory getFHIRTypesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.types.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.types.impl.ExtensionImpl
		 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__URL = eINSTANCE.getExtension_Url();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VALUE_STRING = eINSTANCE.getExtension_ValueString();

		/**
		 * The meta object literal for the '<em><b>Value Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__VALUE_INTEGER = eINSTANCE.getExtension_ValueInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUE = eINSTANCE.getExtension_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.types.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.types.impl.DataTypeImpl
		 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.types.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.types.impl.CodeableConceptImpl
		 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getCodeableConcept()
		 * @generated
		 */
		EClass CODEABLE_CONCEPT = eINSTANCE.getCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Coding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__CODING = eINSTANCE.getCodeableConcept_Coding();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEABLE_CONCEPT__TEXT = eINSTANCE.getCodeableConcept_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.types.impl.CodingImpl <em>Coding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.types.impl.CodingImpl
		 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getCoding()
		 * @generated
		 */
		EClass CODING = eINSTANCE.getCoding();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODING__SYSTEM = eINSTANCE.getCoding_System();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODING__VERSION = eINSTANCE.getCoding_Version();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODING__CODE = eINSTANCE.getCoding_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODING__DISPLAY = eINSTANCE.getCoding_Display();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.types.impl.ContactDetailImpl <em>Contact Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.types.impl.ContactDetailImpl
		 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getContactDetail()
		 * @generated
		 */
		EClass CONTACT_DETAIL = eINSTANCE.getContactDetail();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_DETAIL__NAME = eINSTANCE.getContactDetail_Name();

		/**
		 * The meta object literal for the '<em><b>Telecom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_DETAIL__TELECOM = eINSTANCE.getContactDetail_Telecom();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_DETAIL__ID = eINSTANCE.getContactDetail_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.types.impl.ContactPointImpl <em>Contact Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.types.impl.ContactPointImpl
		 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getContactPoint()
		 * @generated
		 */
		EClass CONTACT_POINT = eINSTANCE.getContactPoint();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT__SYSTEM = eINSTANCE.getContactPoint_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_POINT__VALUE = eINSTANCE.getContactPoint_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.types.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.types.impl.ReferenceImpl
		 * @see org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();

	}

} //FHIRTypesPackage
