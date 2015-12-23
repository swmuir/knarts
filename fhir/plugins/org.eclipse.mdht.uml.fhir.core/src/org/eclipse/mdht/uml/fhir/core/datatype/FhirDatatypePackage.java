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
package org.eclipse.mdht.uml.fhir.core.datatype;

import java.lang.String;

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
 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='dataTypes'"
 * @generated
 */
public interface FhirDatatypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdht/schema/fhir/core/datatype/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FhirDatatypePackage eINSTANCE = org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.BaseImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getBase()
	 * @generated
	 */
	int BASE = 1;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXTENSION = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DataTypeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.StringImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getString()
	 * @generated
	 */
	int STRING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.IdImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getId()
	 * @generated
	 */
	int ID = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ExtensionImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__URL = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VALUEX = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.UriImpl <em>Uri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.UriImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getUri()
	 * @generated
	 */
	int URI = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.BooleanImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.IntegerImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DecimalImpl <em>Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DecimalImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.Base64BinaryImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getBase64Binary()
	 * @generated
	 */
	int BASE64_BINARY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.InstantImpl <em>Instant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.InstantImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DateImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDate()
	 * @generated
	 */
	int DATE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DateTimeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.TimeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getCode()
	 * @generated
	 */
	int CODE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.OidImpl <em>Oid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.OidImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getOid()
	 * @generated
	 */
	int OID = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__ID = URI__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__EXTENSION = URI__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__VALUE = URI__VALUE;

	/**
	 * The number of structural features of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_FEATURE_COUNT = URI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_OPERATION_COUNT = URI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.UnsignedIntImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getUnsignedInt()
	 * @generated
	 */
	int UNSIGNED_INT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__ID = INTEGER__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__EXTENSION = INTEGER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unsigned Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSIGNED_INT_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.PositiveIntImpl <em>Positive Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.PositiveIntImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getPositiveInt()
	 * @generated
	 */
	int POSITIVE_INT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__ID = INTEGER__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__EXTENSION = INTEGER__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT__VALUE = INTEGER__VALUE;

	/**
	 * The number of structural features of the '<em>Positive Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INT_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.MarkdownImpl <em>Markdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.MarkdownImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getMarkdown()
	 * @generated
	 */
	int MARKDOWN = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__ID = STRING__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__EXTENSION = STRING__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__VALUE = STRING__VALUE;

	/**
	 * The number of structural features of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.AnnotationImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Authorx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__AUTHORX = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TIME = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.MetaImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getMeta()
	 * @generated
	 */
	int META = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Version Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VERSION_ID = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__LAST_UPDATED = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__PROFILE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__SECURITY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__TAG = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CodingImpl <em>Coding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.CodingImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getCoding()
	 * @generated
	 */
	int CODING = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__VERSION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__CODE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__DISPLAY = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING__USER_SELECTED = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Coding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.NarrativeImpl <em>Narrative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.NarrativeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getNarrative()
	 * @generated
	 */
	int NARRATIVE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__STATUS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE__DIV = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Narrative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl <em>Backbone Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getBackboneElement()
	 * @generated
	 */
	int BACKBONE_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT__MODIFIER_EXTENSION = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backbone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Backbone Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBONE_ELEMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.NarrativeDivImpl <em>Narrative Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.NarrativeDivImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getNarrativeDiv()
	 * @generated
	 */
	int NARRATIVE_DIV = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_DIV__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_DIV__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_DIV__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The number of structural features of the '<em>Narrative Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_DIV_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Narrative Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_DIV_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.IdentifierImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__SYSTEM = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__VALUE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assigner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ASSIGNER = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeableConceptImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getCodeableConcept()
	 * @generated
	 */
	int CODEABLE_CONCEPT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEABLE_CONCEPT__CODING = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
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
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.PeriodImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__START = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl <em>Human Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getHumanName()
	 * @generated
	 */
	int HUMAN_NAME = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__TEXT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Family</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__FAMILY = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Given</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__GIVEN = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__PREFIX = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__SUFFIX = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME__PERIOD = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Human Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Human Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_NAME_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ContactPointImpl <em>Contact Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ContactPointImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getContactPoint()
	 * @generated
	 */
	int CONTACT_POINT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__SYSTEM = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__VALUE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__USE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__RANK = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT__PERIOD = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Contact Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_POINT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__USE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TEXT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LINE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>District</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__DISTRICT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTAL_CODE = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PERIOD = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.AttachmentImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CONTENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__LANGUAGE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DATA = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__URL = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__SIZE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__HASH = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__TITLE = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATION = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.QuantityImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__COMPARATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__SYSTEM = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__CODE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.MoneyImpl <em>Money</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.MoneyImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getMoney()
	 * @generated
	 */
	int MONEY = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Money</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Money</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONEY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DurationImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SimpleQuantityImpl <em>Simple Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.SimpleQuantityImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getSimpleQuantity()
	 * @generated
	 */
	int SIMPLE_QUANTITY = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Simple Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.RatioImpl <em>Ratio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.RatioImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getRatio()
	 * @generated
	 */
	int RATIO = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__NUMERATOR = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO__DENOMINATOR = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ratio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.RangeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Low</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__LOW = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__HIGH = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__EVENT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__REPEAT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__CODE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl <em>Timing Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getTimingRepeat()
	 * @generated
	 */
	int TIMING_REPEAT = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Boundsx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__BOUNDSX = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__DURATION = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__DURATION_MAX = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duration Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__DURATION_UNITS = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__FREQUENCY = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Frequency Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__FREQUENCY_MAX = BACKBONE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__PERIOD = BACKBONE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Period Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__PERIOD_MAX = BACKBONE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Period Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__PERIOD_UNITS = BACKBONE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT__WHEN = BACKBONE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Timing Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Timing Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_REPEAT_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinition()
	 * @generated
	 */
	int ELEMENT_DEFINITION = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PATH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REPRESENTATION = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__NAME = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__LABEL = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CODE = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Slicing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SLICING = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Short</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SHORT = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__DEFINITION = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__COMMENTS = DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REQUIREMENTS = DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ALIAS = DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MIN = DATA_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX = DATA_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__BASE = DATA_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__TYPE = DATA_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Name Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__NAME_REFERENCE = DATA_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Default Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__DEFAULT_VALUEX = DATA_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Meaning When Missing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MEANING_WHEN_MISSING = DATA_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Fixedx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__FIXEDX = DATA_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Patternx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PATTERNX = DATA_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Examplex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXAMPLEX = DATA_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Min Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MIN_VALUEX = DATA_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Max Valuex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX_VALUEX = DATA_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAX_LENGTH = DATA_TYPE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONDITION = DATA_TYPE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONSTRAINT = DATA_TYPE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MUST_SUPPORT = DATA_TYPE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Is Modifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_MODIFIER = DATA_TYPE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Is Summary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_SUMMARY = DATA_TYPE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__BINDING = DATA_TYPE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MAPPING = DATA_TYPE_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 31;

	/**
	 * The number of operations of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionSlicingImpl <em>Element Definition Slicing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionSlicingImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionSlicing()
	 * @generated
	 */
	int ELEMENT_DEFINITION_SLICING = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING__DISCRIMINATOR = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING__DESCRIPTION = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING__ORDERED = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING__RULES = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Definition Slicing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Element Definition Slicing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_SLICING_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBaseImpl <em>Element Definition Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBaseImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionBase()
	 * @generated
	 */
	int ELEMENT_DEFINITION_BASE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BASE__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BASE__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BASE__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BASE__PATH = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BASE__MIN = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BASE__MAX = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BASE_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BASE_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionTypeRefImpl <em>Element Definition Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionTypeRefImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionTypeRef()
	 * @generated
	 */
	int ELEMENT_DEFINITION_TYPE_REF = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_TYPE_REF__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_TYPE_REF__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_TYPE_REF__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_TYPE_REF__CODE = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_TYPE_REF__PROFILE = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_TYPE_REF__AGGREGATION = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_TYPE_REF_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_TYPE_REF_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl <em>Element Definition Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionConstraint()
	 * @generated
	 */
	int ELEMENT_DEFINITION_CONSTRAINT = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT__KEY = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT__SEVERITY = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Human</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT__HUMAN = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT__XPATH = BACKBONE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Element Definition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Element Definition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_CONSTRAINT_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBindingImpl <em>Element Definition Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBindingImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionBinding()
	 * @generated
	 */
	int ELEMENT_DEFINITION_BINDING = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BINDING__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BINDING__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BINDING__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BINDING__STRENGTH = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BINDING__DESCRIPTION = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Setx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BINDING__VALUE_SETX = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BINDING_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_BINDING_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionMappingImpl <em>Element Definition Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionMappingImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionMapping()
	 * @generated
	 */
	int ELEMENT_DEFINITION_MAPPING = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_MAPPING__ID = BACKBONE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_MAPPING__EXTENSION = BACKBONE_ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Modifier Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_MAPPING__MODIFIER_EXTENSION = BACKBONE_ELEMENT__MODIFIER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_MAPPING__IDENTITY = BACKBONE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_MAPPING__LANGUAGE = BACKBONE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_MAPPING__MAP = BACKBONE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Definition Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_MAPPING_FEATURE_COUNT = BACKBONE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Definition Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_MAPPING_OPERATION_COUNT = BACKBONE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__WHEN = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Whox</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__WHOX = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__CONTENT_TYPE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Blob</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__BLOB = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl <em>Sampled Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getSampledData()
	 * @generated
	 */
	int SAMPLED_DATA = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__ORIGIN = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__PERIOD = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__FACTOR = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__LOWER_LIMIT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__UPPER_LIMIT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__DIMENSIONS = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA__DATA = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sampled Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Sampled Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLED_DATA_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ReferenceImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EXTENSION = DATA_TYPE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DISPLAY = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AgeImpl <em>Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.AgeImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getAge()
	 * @generated
	 */
	int AGE = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.CountImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DistanceImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__ID = QUANTITY__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__EXTENSION = QUANTITY__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VALUE = QUANTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__COMPARATOR = QUANTITY__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__UNIT = QUANTITY__UNIT;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__SYSTEM = QUANTITY__SYSTEM;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__CODE = QUANTITY__CODE;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.UuidImpl <em>Uuid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.UuidImpl
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getUuid()
	 * @generated
	 */
	int UUID = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__ID = URI__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__EXTENSION = URI__EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID__VALUE = URI__VALUE;

	/**
	 * The number of structural features of the '<em>Uuid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_FEATURE_COUNT = URI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uuid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_OPERATION_COUNT = URI_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.Element#getExtensions <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Element#getExtensions()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Extension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Extension#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Url</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Extension#getUrl()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Url();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Extension#getValuex <em>Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Extension#getValuex()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Valuex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Uri
	 * @generated
	 */
	EClass getUri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.Uri#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Uri#getValue()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Decimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.Decimal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Decimal#getValue()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Binary</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Base64Binary
	 * @generated
	 */
	EClass getBase64Binary();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.Base64Binary#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Base64Binary#getValue()
	 * @see #getBase64Binary()
	 * @generated
	 */
	EAttribute getBase64Binary_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Instant
	 * @generated
	 */
	EClass getInstant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.Instant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Instant#getValue()
	 * @see #getInstant()
	 * @generated
	 */
	EAttribute getInstant_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.Date#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Date#getValue()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.DateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.DateTime#getValue()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.core.datatype.Time#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Time#getValue()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oid</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Oid
	 * @generated
	 */
	EClass getOid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsigned Int</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt
	 * @generated
	 */
	EClass getUnsignedInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt <em>Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Int</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt
	 * @generated
	 */
	EClass getPositiveInt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markdown</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Markdown
	 * @generated
	 */
	EClass getMarkdown();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Annotation#getAuthorx <em>Authorx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authorx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Annotation#getAuthorx()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Authorx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Annotation#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Annotation#getTime()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Time();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Meta#getVersionId <em>Version Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Meta#getVersionId()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_VersionId();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Meta#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Updated</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Meta#getLastUpdated()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_LastUpdated();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.Meta#getProfiles <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profile</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Meta#getProfiles()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Profile();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.Meta#getSecurities <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Meta#getSecurities()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Security();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.Meta#getTags <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tag</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Meta#getTags()
	 * @see #getMeta()
	 * @generated
	 */
	EReference getMeta_Tag();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Coding
	 * @generated
	 */
	EClass getCoding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Coding#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Coding#getSystem()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_System();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Coding#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Coding#getVersion()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Version();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Coding#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Coding#getCode()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Code();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Coding#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Coding#getDisplay()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_Display();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Coding#getUserSelected <em>User Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Selected</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Coding#getUserSelected()
	 * @see #getCoding()
	 * @generated
	 */
	EReference getCoding_UserSelected();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrative</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Narrative
	 * @generated
	 */
	EClass getNarrative();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Narrative#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Narrative#getStatus()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Narrative#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Narrative#getDiv()
	 * @see #getNarrative()
	 * @generated
	 */
	EReference getNarrative_Div();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.NarrativeDiv <em>Narrative Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrative Div</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.NarrativeDiv
	 * @generated
	 */
	EClass getNarrativeDiv();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement <em>Backbone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backbone Element</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement
	 * @generated
	 */
	EClass getBackboneElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement#getModifierExtensions <em>Modifier Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifier Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement#getModifierExtensions()
	 * @see #getBackboneElement()
	 * @generated
	 */
	EReference getBackboneElement_ModifierExtension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getUse()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getType()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getSystem()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_System();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getValue()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getPeriod()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Period();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getAssigner <em>Assigner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigner</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Identifier#getAssigner()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Assigner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept <em>Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codeable Concept</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept
	 * @generated
	 */
	EClass getCodeableConcept();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept#getCodings <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept#getCodings()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Coding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept#getText()
	 * @see #getCodeableConcept()
	 * @generated
	 */
	EReference getCodeableConcept_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_Start();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_End();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName <em>Human Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.HumanName
	 * @generated
	 */
	EClass getHumanName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getUse()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getText()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getFamilies <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Family</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getFamilies()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Family();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getGivens <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Given</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getGivens()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Given();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getPrefixes <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prefix</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getPrefixes()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Prefix();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getSuffixes <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suffix</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getSuffixes()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Suffix();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.HumanName#getPeriod()
	 * @see #getHumanName()
	 * @generated
	 */
	EReference getHumanName_Period();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Point</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint
	 * @generated
	 */
	EClass getContactPoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getSystem()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_System();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getValue()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getUse()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rank</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getRank()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Rank();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint#getPeriod()
	 * @see #getContactPoint()
	 * @generated
	 */
	EReference getContactPoint_Period();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getUse()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Use();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getText()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Text();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getLines <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getLines()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Line();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_City();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>District</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getDistrict()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_District();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_State();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postal Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getPostalCode()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_PostalCode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Address#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Address#getPeriod()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Period();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getContentType()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_ContentType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getLanguage()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Language();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getData()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Data();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Url</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getUrl()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Url();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Size</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getSize()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Size();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hash</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getHash()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Hash();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getTitle()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Title();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getCreation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Attachment#getCreation()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Creation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Money <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Money</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Money
	 * @generated
	 */
	EClass getMoney();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comparator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getComparator()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Comparator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Unit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getSystem()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_System();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Quantity#getCode()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Code();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity <em>Simple Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Quantity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity
	 * @generated
	 */
	EClass getSimpleQuantity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Ratio
	 * @generated
	 */
	EClass getRatio();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Ratio#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Numerator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Ratio#getNumerator()
	 * @see #getRatio()
	 * @generated
	 */
	EReference getRatio_Numerator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Ratio#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Denominator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Ratio#getDenominator()
	 * @see #getRatio()
	 * @generated
	 */
	EReference getRatio_Denominator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Range#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Low</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Range#getLow()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Low();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Range#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>High</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Range#getHigh()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_High();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing#getEvents <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Timing#getEvents()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Timing#getRepeat()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Repeat();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Timing#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Timing#getCode()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Code();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat <em>Timing Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Repeat</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat
	 * @generated
	 */
	EClass getTimingRepeat();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getBoundsx <em>Boundsx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boundsx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getBoundsx()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Boundsx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Count</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getCount()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Count();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDuration()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Duration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDurationMax <em>Duration Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDurationMax()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_DurationMax();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDurationUnits <em>Duration Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration Units</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getDurationUnits()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_DurationUnits();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frequency</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getFrequency()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Frequency();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getFrequencyMax <em>Frequency Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frequency Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getFrequencyMax()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_FrequencyMax();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriod()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_Period();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriodMax <em>Period Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriodMax()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_PeriodMax();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriodUnits <em>Period Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Units</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getPeriodUnits()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_PeriodUnits();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>When</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.TimingRepeat#getWhen()
	 * @see #getTimingRepeat()
	 * @generated
	 */
	EReference getTimingRepeat_When();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition
	 * @generated
	 */
	EClass getElementDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getPath()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Path();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getRepresentations <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Representation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getRepresentations()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Representation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getName()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getLabel()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Label();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getCodes <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getCodes()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getSlicing <em>Slicing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slicing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getSlicing()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Slicing();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Short</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getShort()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Short();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getDefinition()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Definition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comments</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getComments()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirements</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getRequirements()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alias</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getAlias()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Alias();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMin()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Min();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMax()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Max();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getBase()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Base();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getTypes <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getTypes()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getNameReference <em>Name Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getNameReference()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_NameReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getDefaultValuex <em>Default Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getDefaultValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_DefaultValuex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meaning When Missing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMeaningWhenMissing()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MeaningWhenMissing();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getFixedx <em>Fixedx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixedx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getFixedx()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Fixedx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getPatternx <em>Patternx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Patternx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getPatternx()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Patternx();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getExamplex <em>Examplex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Examplex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getExamplex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Examplex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMinValuex <em>Min Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMinValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MinValuex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMaxValuex <em>Max Valuex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Valuex</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMaxValuex()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MaxValuex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Length</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMaxLength()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MaxLength();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getConditions <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getConditions()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getConstraints <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getConstraints()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Constraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMustSupport <em>Must Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Must Support</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMustSupport()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_MustSupport();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getIsModifier <em>Is Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Modifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getIsModifier()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_IsModifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getIsSummary <em>Is Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Summary</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getIsSummary()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_IsSummary();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getBinding()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Binding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMappings <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinition#getMappings()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Mapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing <em>Element Definition Slicing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Slicing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing
	 * @generated
	 */
	EClass getElementDefinitionSlicing();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing#getDiscriminators <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discriminator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing#getDiscriminators()
	 * @see #getElementDefinitionSlicing()
	 * @generated
	 */
	EReference getElementDefinitionSlicing_Discriminator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing#getDescription()
	 * @see #getElementDefinitionSlicing()
	 * @generated
	 */
	EReference getElementDefinitionSlicing_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ordered</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing#getOrdered()
	 * @see #getElementDefinitionSlicing()
	 * @generated
	 */
	EReference getElementDefinitionSlicing_Ordered();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rules</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionSlicing#getRules()
	 * @see #getElementDefinitionSlicing()
	 * @generated
	 */
	EReference getElementDefinitionSlicing_Rules();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase <em>Element Definition Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Base</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase
	 * @generated
	 */
	EClass getElementDefinitionBase();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase#getPath()
	 * @see #getElementDefinitionBase()
	 * @generated
	 */
	EReference getElementDefinitionBase_Path();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase#getMin()
	 * @see #getElementDefinitionBase()
	 * @generated
	 */
	EReference getElementDefinitionBase_Min();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBase#getMax()
	 * @see #getElementDefinitionBase()
	 * @generated
	 */
	EReference getElementDefinitionBase_Max();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef <em>Element Definition Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Type Ref</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef
	 * @generated
	 */
	EClass getElementDefinitionTypeRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef#getCode()
	 * @see #getElementDefinitionTypeRef()
	 * @generated
	 */
	EReference getElementDefinitionTypeRef_Code();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef#getProfiles <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profile</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef#getProfiles()
	 * @see #getElementDefinitionTypeRef()
	 * @generated
	 */
	EReference getElementDefinitionTypeRef_Profile();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef#getAggregations <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionTypeRef#getAggregations()
	 * @see #getElementDefinitionTypeRef()
	 * @generated
	 */
	EReference getElementDefinitionTypeRef_Aggregation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint <em>Element Definition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Constraint</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint
	 * @generated
	 */
	EClass getElementDefinitionConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getKey()
	 * @see #getElementDefinitionConstraint()
	 * @generated
	 */
	EReference getElementDefinitionConstraint_Key();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirements</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getRequirements()
	 * @see #getElementDefinitionConstraint()
	 * @generated
	 */
	EReference getElementDefinitionConstraint_Requirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getSeverity()
	 * @see #getElementDefinitionConstraint()
	 * @generated
	 */
	EReference getElementDefinitionConstraint_Severity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getHuman <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Human</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getHuman()
	 * @see #getElementDefinitionConstraint()
	 * @generated
	 */
	EReference getElementDefinitionConstraint_Human();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xpath</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint#getXpath()
	 * @see #getElementDefinitionConstraint()
	 * @generated
	 */
	EReference getElementDefinitionConstraint_Xpath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding <em>Element Definition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Binding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding
	 * @generated
	 */
	EClass getElementDefinitionBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Strength</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding#getStrength()
	 * @see #getElementDefinitionBinding()
	 * @generated
	 */
	EReference getElementDefinitionBinding_Strength();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding#getDescription()
	 * @see #getElementDefinitionBinding()
	 * @generated
	 */
	EReference getElementDefinitionBinding_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding#getValueSetx <em>Value Setx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Setx</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionBinding#getValueSetx()
	 * @see #getElementDefinitionBinding()
	 * @generated
	 */
	EReference getElementDefinitionBinding_ValueSetx();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping <em>Element Definition Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition Mapping</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping
	 * @generated
	 */
	EClass getElementDefinitionMapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping#getIdentity()
	 * @see #getElementDefinitionMapping()
	 * @generated
	 */
	EReference getElementDefinitionMapping_Identity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping#getLanguage()
	 * @see #getElementDefinitionMapping()
	 * @generated
	 */
	EReference getElementDefinitionMapping_Language();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionMapping#getMap()
	 * @see #getElementDefinitionMapping()
	 * @generated
	 */
	EReference getElementDefinitionMapping_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.core.datatype.Signature#getTypes <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Signature#getTypes()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Signature#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>When</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Signature#getWhen()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_When();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Signature#getWhox <em>Whox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whox</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Signature#getWhox()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Whox();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Signature#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Signature#getContentType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ContentType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Signature#getBlob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blob</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Signature#getBlob()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Blob();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData <em>Sampled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampled Data</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SampledData
	 * @generated
	 */
	EClass getSampledData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getOrigin()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Origin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getPeriod()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Period();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Factor</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getFactor()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Factor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Limit</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getLowerLimit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_LowerLimit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper Limit</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getUpperLimit()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_UpperLimit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimensions</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getDimensions()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Dimensions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.SampledData#getData()
	 * @see #getSampledData()
	 * @generated
	 */
	EReference getSampledData_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Reference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Reference#getReference()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Reference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.core.datatype.Reference#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Reference#getDisplay()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Display();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Age
	 * @generated
	 */
	EClass getAge();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.core.datatype.Uuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uuid</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.Uuid
	 * @generated
	 */
	EClass getUuid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FhirDatatypeFactory getFhirDatatypeFactory();

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
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EXTENSION = eINSTANCE.getElement_Extension();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.BaseImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.IdImpl <em>Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.IdImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getId()
		 * @generated
		 */
		EClass ID = eINSTANCE.getId();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.StringImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DataTypeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ExtensionImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__URL = eINSTANCE.getExtension_Url();

		/**
		 * The meta object literal for the '<em><b>Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__VALUEX = eINSTANCE.getExtension_Valuex();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.UriImpl <em>Uri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.UriImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getUri()
		 * @generated
		 */
		EClass URI = eINSTANCE.getUri();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__VALUE = eINSTANCE.getUri_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.BooleanImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.IntegerImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DecimalImpl <em>Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DecimalImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDecimal()
		 * @generated
		 */
		EClass DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL__VALUE = eINSTANCE.getDecimal_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.Base64BinaryImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getBase64Binary()
		 * @generated
		 */
		EClass BASE64_BINARY = eINSTANCE.getBase64Binary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY__VALUE = eINSTANCE.getBase64Binary_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.InstantImpl <em>Instant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.InstantImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getInstant()
		 * @generated
		 */
		EClass INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT__VALUE = eINSTANCE.getInstant_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DateImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__VALUE = eINSTANCE.getDate_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DateTimeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__VALUE = eINSTANCE.getDateTime_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.TimeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__VALUE = eINSTANCE.getTime_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.OidImpl <em>Oid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.OidImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getOid()
		 * @generated
		 */
		EClass OID = eINSTANCE.getOid();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.UnsignedIntImpl <em>Unsigned Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.UnsignedIntImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getUnsignedInt()
		 * @generated
		 */
		EClass UNSIGNED_INT = eINSTANCE.getUnsignedInt();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.PositiveIntImpl <em>Positive Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.PositiveIntImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getPositiveInt()
		 * @generated
		 */
		EClass POSITIVE_INT = eINSTANCE.getPositiveInt();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.MarkdownImpl <em>Markdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.MarkdownImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getMarkdown()
		 * @generated
		 */
		EClass MARKDOWN = eINSTANCE.getMarkdown();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.AnnotationImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Authorx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__AUTHORX = eINSTANCE.getAnnotation_Authorx();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TIME = eINSTANCE.getAnnotation_Time();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.MetaImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Version Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__VERSION_ID = eINSTANCE.getMeta_VersionId();

		/**
		 * The meta object literal for the '<em><b>Last Updated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__LAST_UPDATED = eINSTANCE.getMeta_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__PROFILE = eINSTANCE.getMeta_Profile();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__SECURITY = eINSTANCE.getMeta_Security();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META__TAG = eINSTANCE.getMeta_Tag();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CodingImpl <em>Coding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.CodingImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getCoding()
		 * @generated
		 */
		EClass CODING = eINSTANCE.getCoding();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__SYSTEM = eINSTANCE.getCoding_System();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__VERSION = eINSTANCE.getCoding_Version();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__CODE = eINSTANCE.getCoding_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__DISPLAY = eINSTANCE.getCoding_Display();

		/**
		 * The meta object literal for the '<em><b>User Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING__USER_SELECTED = eINSTANCE.getCoding_UserSelected();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.NarrativeImpl <em>Narrative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.NarrativeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getNarrative()
		 * @generated
		 */
		EClass NARRATIVE = eINSTANCE.getNarrative();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__STATUS = eINSTANCE.getNarrative_Status();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE__DIV = eINSTANCE.getNarrative_Div();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.NarrativeDivImpl <em>Narrative Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.NarrativeDivImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getNarrativeDiv()
		 * @generated
		 */
		EClass NARRATIVE_DIV = eINSTANCE.getNarrativeDiv();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl <em>Backbone Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getBackboneElement()
		 * @generated
		 */
		EClass BACKBONE_ELEMENT = eINSTANCE.getBackboneElement();

		/**
		 * The meta object literal for the '<em><b>Modifier Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKBONE_ELEMENT__MODIFIER_EXTENSION = eINSTANCE.getBackboneElement_ModifierExtension();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.IdentifierImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__USE = eINSTANCE.getIdentifier_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__TYPE = eINSTANCE.getIdentifier_Type();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__SYSTEM = eINSTANCE.getIdentifier_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__VALUE = eINSTANCE.getIdentifier_Value();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__PERIOD = eINSTANCE.getIdentifier_Period();

		/**
		 * The meta object literal for the '<em><b>Assigner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__ASSIGNER = eINSTANCE.getIdentifier_Assigner();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeableConceptImpl <em>Codeable Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.CodeableConceptImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getCodeableConcept()
		 * @generated
		 */
		EClass CODEABLE_CONCEPT = eINSTANCE.getCodeableConcept();

		/**
		 * The meta object literal for the '<em><b>Coding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__CODING = eINSTANCE.getCodeableConcept_Coding();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODEABLE_CONCEPT__TEXT = eINSTANCE.getCodeableConcept_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.PeriodImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__START = eINSTANCE.getPeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl <em>Human Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getHumanName()
		 * @generated
		 */
		EClass HUMAN_NAME = eINSTANCE.getHumanName();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__USE = eINSTANCE.getHumanName_Use();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__TEXT = eINSTANCE.getHumanName_Text();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__FAMILY = eINSTANCE.getHumanName_Family();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__GIVEN = eINSTANCE.getHumanName_Given();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__PREFIX = eINSTANCE.getHumanName_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__SUFFIX = eINSTANCE.getHumanName_Suffix();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN_NAME__PERIOD = eINSTANCE.getHumanName_Period();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ContactPointImpl <em>Contact Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ContactPointImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getContactPoint()
		 * @generated
		 */
		EClass CONTACT_POINT = eINSTANCE.getContactPoint();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__SYSTEM = eINSTANCE.getContactPoint_System();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__VALUE = eINSTANCE.getContactPoint_Value();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__USE = eINSTANCE.getContactPoint_Use();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__RANK = eINSTANCE.getContactPoint_Rank();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_POINT__PERIOD = eINSTANCE.getContactPoint_Period();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.AddressImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__USE = eINSTANCE.getAddress_Use();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TYPE = eINSTANCE.getAddress_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TEXT = eINSTANCE.getAddress_Text();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__LINE = eINSTANCE.getAddress_Line();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>District</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__DISTRICT = eINSTANCE.getAddress_District();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__POSTAL_CODE = eINSTANCE.getAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__PERIOD = eINSTANCE.getAddress_Period();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.AttachmentImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__CONTENT_TYPE = eINSTANCE.getAttachment_ContentType();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__LANGUAGE = eINSTANCE.getAttachment_Language();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__DATA = eINSTANCE.getAttachment_Data();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__URL = eINSTANCE.getAttachment_Url();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__SIZE = eINSTANCE.getAttachment_Size();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__HASH = eINSTANCE.getAttachment_Hash();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__TITLE = eINSTANCE.getAttachment_Title();

		/**
		 * The meta object literal for the '<em><b>Creation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__CREATION = eINSTANCE.getAttachment_Creation();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.MoneyImpl <em>Money</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.MoneyImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getMoney()
		 * @generated
		 */
		EClass MONEY = eINSTANCE.getMoney();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.QuantityImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__COMPARATOR = eINSTANCE.getQuantity_Comparator();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__UNIT = eINSTANCE.getQuantity_Unit();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__SYSTEM = eINSTANCE.getQuantity_System();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__CODE = eINSTANCE.getQuantity_Code();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DurationImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SimpleQuantityImpl <em>Simple Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.SimpleQuantityImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getSimpleQuantity()
		 * @generated
		 */
		EClass SIMPLE_QUANTITY = eINSTANCE.getSimpleQuantity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.RatioImpl <em>Ratio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.RatioImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getRatio()
		 * @generated
		 */
		EClass RATIO = eINSTANCE.getRatio();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO__NUMERATOR = eINSTANCE.getRatio_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIO__DENOMINATOR = eINSTANCE.getRatio_Denominator();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.RangeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__LOW = eINSTANCE.getRange_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__HIGH = eINSTANCE.getRange_High();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__EVENT = eINSTANCE.getTiming_Event();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__REPEAT = eINSTANCE.getTiming_Repeat();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__CODE = eINSTANCE.getTiming_Code();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl <em>Timing Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.TimingRepeatImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getTimingRepeat()
		 * @generated
		 */
		EClass TIMING_REPEAT = eINSTANCE.getTimingRepeat();

		/**
		 * The meta object literal for the '<em><b>Boundsx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__BOUNDSX = eINSTANCE.getTimingRepeat_Boundsx();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__COUNT = eINSTANCE.getTimingRepeat_Count();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__DURATION = eINSTANCE.getTimingRepeat_Duration();

		/**
		 * The meta object literal for the '<em><b>Duration Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__DURATION_MAX = eINSTANCE.getTimingRepeat_DurationMax();

		/**
		 * The meta object literal for the '<em><b>Duration Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__DURATION_UNITS = eINSTANCE.getTimingRepeat_DurationUnits();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__FREQUENCY = eINSTANCE.getTimingRepeat_Frequency();

		/**
		 * The meta object literal for the '<em><b>Frequency Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__FREQUENCY_MAX = eINSTANCE.getTimingRepeat_FrequencyMax();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__PERIOD = eINSTANCE.getTimingRepeat_Period();

		/**
		 * The meta object literal for the '<em><b>Period Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__PERIOD_MAX = eINSTANCE.getTimingRepeat_PeriodMax();

		/**
		 * The meta object literal for the '<em><b>Period Units</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__PERIOD_UNITS = eINSTANCE.getTimingRepeat_PeriodUnits();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_REPEAT__WHEN = eINSTANCE.getTimingRepeat_When();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinition()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PATH = eINSTANCE.getElementDefinition_Path();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__REPRESENTATION = eINSTANCE.getElementDefinition_Representation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__NAME = eINSTANCE.getElementDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__LABEL = eINSTANCE.getElementDefinition_Label();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CODE = eINSTANCE.getElementDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Slicing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SLICING = eINSTANCE.getElementDefinition_Slicing();

		/**
		 * The meta object literal for the '<em><b>Short</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__SHORT = eINSTANCE.getElementDefinition_Short();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__DEFINITION = eINSTANCE.getElementDefinition_Definition();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__COMMENTS = eINSTANCE.getElementDefinition_Comments();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__REQUIREMENTS = eINSTANCE.getElementDefinition_Requirements();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__ALIAS = eINSTANCE.getElementDefinition_Alias();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MIN = eINSTANCE.getElementDefinition_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX = eINSTANCE.getElementDefinition_Max();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__BASE = eINSTANCE.getElementDefinition_Base();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__TYPE = eINSTANCE.getElementDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Name Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__NAME_REFERENCE = eINSTANCE.getElementDefinition_NameReference();

		/**
		 * The meta object literal for the '<em><b>Default Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__DEFAULT_VALUEX = eINSTANCE.getElementDefinition_DefaultValuex();

		/**
		 * The meta object literal for the '<em><b>Meaning When Missing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MEANING_WHEN_MISSING = eINSTANCE.getElementDefinition_MeaningWhenMissing();

		/**
		 * The meta object literal for the '<em><b>Fixedx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__FIXEDX = eINSTANCE.getElementDefinition_Fixedx();

		/**
		 * The meta object literal for the '<em><b>Patternx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PATTERNX = eINSTANCE.getElementDefinition_Patternx();

		/**
		 * The meta object literal for the '<em><b>Examplex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__EXAMPLEX = eINSTANCE.getElementDefinition_Examplex();

		/**
		 * The meta object literal for the '<em><b>Min Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MIN_VALUEX = eINSTANCE.getElementDefinition_MinValuex();

		/**
		 * The meta object literal for the '<em><b>Max Valuex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX_VALUEX = eINSTANCE.getElementDefinition_MaxValuex();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAX_LENGTH = eINSTANCE.getElementDefinition_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONDITION = eINSTANCE.getElementDefinition_Condition();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONSTRAINT = eINSTANCE.getElementDefinition_Constraint();

		/**
		 * The meta object literal for the '<em><b>Must Support</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MUST_SUPPORT = eINSTANCE.getElementDefinition_MustSupport();

		/**
		 * The meta object literal for the '<em><b>Is Modifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__IS_MODIFIER = eINSTANCE.getElementDefinition_IsModifier();

		/**
		 * The meta object literal for the '<em><b>Is Summary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__IS_SUMMARY = eINSTANCE.getElementDefinition_IsSummary();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__BINDING = eINSTANCE.getElementDefinition_Binding();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__MAPPING = eINSTANCE.getElementDefinition_Mapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionSlicingImpl <em>Element Definition Slicing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionSlicingImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionSlicing()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_SLICING = eINSTANCE.getElementDefinitionSlicing();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_SLICING__DISCRIMINATOR = eINSTANCE.getElementDefinitionSlicing_Discriminator();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_SLICING__DESCRIPTION = eINSTANCE.getElementDefinitionSlicing_Description();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_SLICING__ORDERED = eINSTANCE.getElementDefinitionSlicing_Ordered();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_SLICING__RULES = eINSTANCE.getElementDefinitionSlicing_Rules();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBaseImpl <em>Element Definition Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBaseImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionBase()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_BASE = eINSTANCE.getElementDefinitionBase();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_BASE__PATH = eINSTANCE.getElementDefinitionBase_Path();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_BASE__MIN = eINSTANCE.getElementDefinitionBase_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_BASE__MAX = eINSTANCE.getElementDefinitionBase_Max();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionTypeRefImpl <em>Element Definition Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionTypeRefImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionTypeRef()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_TYPE_REF = eINSTANCE.getElementDefinitionTypeRef();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_TYPE_REF__CODE = eINSTANCE.getElementDefinitionTypeRef_Code();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_TYPE_REF__PROFILE = eINSTANCE.getElementDefinitionTypeRef_Profile();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_TYPE_REF__AGGREGATION = eINSTANCE.getElementDefinitionTypeRef_Aggregation();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl <em>Element Definition Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionConstraint()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_CONSTRAINT = eINSTANCE.getElementDefinitionConstraint();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_CONSTRAINT__KEY = eINSTANCE.getElementDefinitionConstraint_Key();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS = eINSTANCE.getElementDefinitionConstraint_Requirements();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_CONSTRAINT__SEVERITY = eINSTANCE.getElementDefinitionConstraint_Severity();

		/**
		 * The meta object literal for the '<em><b>Human</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_CONSTRAINT__HUMAN = eINSTANCE.getElementDefinitionConstraint_Human();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_CONSTRAINT__XPATH = eINSTANCE.getElementDefinitionConstraint_Xpath();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBindingImpl <em>Element Definition Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionBindingImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionBinding()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_BINDING = eINSTANCE.getElementDefinitionBinding();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_BINDING__STRENGTH = eINSTANCE.getElementDefinitionBinding_Strength();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_BINDING__DESCRIPTION = eINSTANCE.getElementDefinitionBinding_Description();

		/**
		 * The meta object literal for the '<em><b>Value Setx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_BINDING__VALUE_SETX = eINSTANCE.getElementDefinitionBinding_ValueSetx();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionMappingImpl <em>Element Definition Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionMappingImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getElementDefinitionMapping()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION_MAPPING = eINSTANCE.getElementDefinitionMapping();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_MAPPING__IDENTITY = eINSTANCE.getElementDefinitionMapping_Identity();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_MAPPING__LANGUAGE = eINSTANCE.getElementDefinitionMapping_Language();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION_MAPPING__MAP = eINSTANCE.getElementDefinitionMapping_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__TYPE = eINSTANCE.getSignature_Type();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__WHEN = eINSTANCE.getSignature_When();

		/**
		 * The meta object literal for the '<em><b>Whox</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__WHOX = eINSTANCE.getSignature_Whox();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__CONTENT_TYPE = eINSTANCE.getSignature_ContentType();

		/**
		 * The meta object literal for the '<em><b>Blob</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__BLOB = eINSTANCE.getSignature_Blob();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl <em>Sampled Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.SampledDataImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getSampledData()
		 * @generated
		 */
		EClass SAMPLED_DATA = eINSTANCE.getSampledData();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__ORIGIN = eINSTANCE.getSampledData_Origin();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__PERIOD = eINSTANCE.getSampledData_Period();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__FACTOR = eINSTANCE.getSampledData_Factor();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__LOWER_LIMIT = eINSTANCE.getSampledData_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__UPPER_LIMIT = eINSTANCE.getSampledData_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__DIMENSIONS = eINSTANCE.getSampledData_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLED_DATA__DATA = eINSTANCE.getSampledData_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.ReferenceImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__DISPLAY = eINSTANCE.getReference_Display();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.AgeImpl <em>Age</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.AgeImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getAge()
		 * @generated
		 */
		EClass AGE = eINSTANCE.getAge();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.CountImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.DistanceImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.UuidImpl <em>Uuid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.UuidImpl
		 * @see org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl#getUuid()
		 * @generated
		 */
		EClass UUID = eINSTANCE.getUuid();

	}

} //FhirDatatypePackage
