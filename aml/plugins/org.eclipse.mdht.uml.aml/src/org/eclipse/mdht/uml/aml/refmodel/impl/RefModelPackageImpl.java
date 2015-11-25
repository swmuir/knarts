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
package org.eclipse.mdht.uml.aml.refmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.mdht.uml.aml.refmodel.Infrastructure;
import org.eclipse.mdht.uml.aml.refmodel.MappedDataType;
import org.eclipse.mdht.uml.aml.refmodel.RefModelFactory;
import org.eclipse.mdht.uml.aml.refmodel.RefModelPackage;
import org.eclipse.mdht.uml.aml.refmodel.ReferenceModel;

import org.eclipse.mdht.uml.aml.refmodel.util.RefModelValidator;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefModelPackageImpl extends EPackageImpl implements RefModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappedDataTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefModelPackageImpl() {
		super(eNS_URI, RefModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RefModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefModelPackage init() {
		if (isInited) return (RefModelPackage)EPackage.Registry.INSTANCE.getEPackage(RefModelPackage.eNS_URI);

		// Obtain or create and register package
		RefModelPackageImpl theRefModelPackage = (RefModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RefModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RefModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRefModelPackage.createPackageContents();

		// Initialize created meta-data
		theRefModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRefModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RefModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRefModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefModelPackage.eNS_URI, theRefModelPackage);
		return theRefModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Base_Property() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntime() {
		return runtimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntime_Base_Property() {
		return (EReference)runtimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceModel() {
		return referenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceModel_Base_Package() {
		return (EReference)referenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceModel_RmPublisher() {
		return (EAttribute)referenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceModel_RmNamespace() {
		return (EAttribute)referenceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceModel_RmVersion() {
		return (EAttribute)referenceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReferenceModel__ValidateAOMARCHETYPEHRIDInvariantRmPublisherValidity__DiagnosticChain_Map() {
		return referenceModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappedDataType() {
		return mappedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedDataType_Base_Abstraction() {
		return (EReference)mappedDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMappedDataType__ValidateIsAMLDataType__DiagnosticChain_Map() {
		return mappedDataTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefModelFactory getRefModelFactory() {
		return (RefModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEReference(infrastructureEClass, INFRASTRUCTURE__BASE_PROPERTY);

		runtimeEClass = createEClass(RUNTIME);
		createEReference(runtimeEClass, RUNTIME__BASE_PROPERTY);

		referenceModelEClass = createEClass(REFERENCE_MODEL);
		createEReference(referenceModelEClass, REFERENCE_MODEL__BASE_PACKAGE);
		createEAttribute(referenceModelEClass, REFERENCE_MODEL__RM_PUBLISHER);
		createEAttribute(referenceModelEClass, REFERENCE_MODEL__RM_NAMESPACE);
		createEAttribute(referenceModelEClass, REFERENCE_MODEL__RM_VERSION);
		createEOperation(referenceModelEClass, REFERENCE_MODEL___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_PUBLISHER_VALIDITY__DIAGNOSTICCHAIN_MAP);

		mappedDataTypeEClass = createEClass(MAPPED_DATA_TYPE);
		createEReference(mappedDataTypeEClass, MAPPED_DATA_TYPE__BASE_ABSTRACTION);
		createEOperation(mappedDataTypeEClass, MAPPED_DATA_TYPE___VALIDATE_IS_AML_DATA_TYPE__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructure_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(runtimeEClass, org.eclipse.mdht.uml.aml.refmodel.Runtime.class, "Runtime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntime_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, org.eclipse.mdht.uml.aml.refmodel.Runtime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referenceModelEClass, ReferenceModel.class, "ReferenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceModel_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, ReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceModel_RmPublisher(), theTypesPackage.getString(), "rmPublisher", null, 1, 1, ReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceModel_RmNamespace(), theTypesPackage.getString(), "rmNamespace", null, 0, 1, ReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceModel_RmVersion(), theTypesPackage.getString(), "rmVersion", null, 0, 1, ReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getReferenceModel__ValidateAOMARCHETYPEHRIDInvariantRmPublisherValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEHRIDInvariantRmPublisherValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mappedDataTypeEClass, MappedDataType.class, "MappedDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappedDataType_Base_Abstraction(), theUMLPackage.getAbstraction(), null, "base_Abstraction", null, 1, 1, MappedDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMappedDataType__ValidateIsAMLDataType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateIsAMLDataType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "ReferenceModelProfile"
		   });	
		addAnnotation
		  (getReferenceModel__ValidateAOMARCHETYPEHRIDInvariantRmPublisherValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_HRID:Invariant:Rm_publisher_validity"
		   });
	}

} //RefModelPackageImpl
