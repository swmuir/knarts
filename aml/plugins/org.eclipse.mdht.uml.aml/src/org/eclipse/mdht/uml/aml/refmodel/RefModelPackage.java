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
package org.eclipse.mdht.uml.aml.refmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ReferenceModelProfile'"
 * @generated
 */
public interface RefModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/AML/20150501/ReferenceModelProfile.xmi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefModelPackage eINSTANCE = org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.refmodel.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.refmodel.impl.InfrastructureImpl
	 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.refmodel.impl.RuntimeImpl <em>Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RuntimeImpl
	 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl#getRuntime()
	 * @generated
	 */
	int RUNTIME = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.refmodel.impl.ReferenceModelImpl <em>Reference Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.refmodel.impl.ReferenceModelImpl
	 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl#getReferenceModel()
	 * @generated
	 */
	int REFERENCE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Rm Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL__RM_PUBLISHER = 1;

	/**
	 * The feature id for the '<em><b>Rm Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL__RM_NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Rm Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL__RM_VERSION = 3;

	/**
	 * The number of structural features of the '<em>Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPEHRID Invariant Rm Publisher Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_PUBLISHER_VALIDITY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.refmodel.impl.MappedDataTypeImpl <em>Mapped Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.refmodel.impl.MappedDataTypeImpl
	 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl#getMappedDataType()
	 * @generated
	 */
	int MAPPED_DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_DATA_TYPE__BASE_ABSTRACTION = 0;

	/**
	 * The number of structural features of the '<em>Mapped Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Is AML Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_DATA_TYPE___VALIDATE_IS_AML_DATA_TYPE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Mapped Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_DATA_TYPE_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.refmodel.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.refmodel.Infrastructure#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.Infrastructure#getBase_Property()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.refmodel.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.Runtime
	 * @generated
	 */
	EClass getRuntime();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.refmodel.Runtime#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.Runtime#getBase_Property()
	 * @see #getRuntime()
	 * @generated
	 */
	EReference getRuntime_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel <em>Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Model</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.ReferenceModel
	 * @generated
	 */
	EClass getReferenceModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getBase_Package()
	 * @see #getReferenceModel()
	 * @generated
	 */
	EReference getReferenceModel_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmPublisher <em>Rm Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rm Publisher</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmPublisher()
	 * @see #getReferenceModel()
	 * @generated
	 */
	EAttribute getReferenceModel_RmPublisher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmNamespace <em>Rm Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rm Namespace</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmNamespace()
	 * @see #getReferenceModel()
	 * @generated
	 */
	EAttribute getReferenceModel_RmNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmVersion <em>Rm Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rm Version</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmVersion()
	 * @see #getReferenceModel()
	 * @generated
	 */
	EAttribute getReferenceModel_RmVersion();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#validateAOMARCHETYPEHRIDInvariantRmPublisherValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPEHRID Invariant Rm Publisher Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPEHRID Invariant Rm Publisher Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#validateAOMARCHETYPEHRIDInvariantRmPublisherValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getReferenceModel__ValidateAOMARCHETYPEHRIDInvariantRmPublisherValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.refmodel.MappedDataType <em>Mapped Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Data Type</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.MappedDataType
	 * @generated
	 */
	EClass getMappedDataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.refmodel.MappedDataType#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see org.eclipse.mdht.uml.aml.refmodel.MappedDataType#getBase_Abstraction()
	 * @see #getMappedDataType()
	 * @generated
	 */
	EReference getMappedDataType_Base_Abstraction();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.refmodel.MappedDataType#validateIsAMLDataType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Is AML Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Is AML Data Type</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.refmodel.MappedDataType#validateIsAMLDataType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMappedDataType__ValidateIsAMLDataType__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefModelFactory getRefModelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.refmodel.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.refmodel.impl.InfrastructureImpl
		 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__BASE_PROPERTY = eINSTANCE.getInfrastructure_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.refmodel.impl.RuntimeImpl <em>Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RuntimeImpl
		 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl#getRuntime()
		 * @generated
		 */
		EClass RUNTIME = eINSTANCE.getRuntime();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME__BASE_PROPERTY = eINSTANCE.getRuntime_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.refmodel.impl.ReferenceModelImpl <em>Reference Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.refmodel.impl.ReferenceModelImpl
		 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl#getReferenceModel()
		 * @generated
		 */
		EClass REFERENCE_MODEL = eINSTANCE.getReferenceModel();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MODEL__BASE_PACKAGE = eINSTANCE.getReferenceModel_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Rm Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_MODEL__RM_PUBLISHER = eINSTANCE.getReferenceModel_RmPublisher();

		/**
		 * The meta object literal for the '<em><b>Rm Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_MODEL__RM_NAMESPACE = eINSTANCE.getReferenceModel_RmNamespace();

		/**
		 * The meta object literal for the '<em><b>Rm Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_MODEL__RM_VERSION = eINSTANCE.getReferenceModel_RmVersion();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPEHRID Invariant Rm Publisher Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_MODEL___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_PUBLISHER_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getReferenceModel__ValidateAOMARCHETYPEHRIDInvariantRmPublisherValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.refmodel.impl.MappedDataTypeImpl <em>Mapped Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.refmodel.impl.MappedDataTypeImpl
		 * @see org.eclipse.mdht.uml.aml.refmodel.impl.RefModelPackageImpl#getMappedDataType()
		 * @generated
		 */
		EClass MAPPED_DATA_TYPE = eINSTANCE.getMappedDataType();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_DATA_TYPE__BASE_ABSTRACTION = eINSTANCE.getMappedDataType_Base_Abstraction();

		/**
		 * The meta object literal for the '<em><b>Validate Is AML Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPED_DATA_TYPE___VALIDATE_IS_AML_DATA_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMappedDataType__ValidateIsAMLDataType__DiagnosticChain_Map();

	}

} //RefModelPackage
