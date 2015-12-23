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
package org.eclipse.mdht.uml.fhir.core.valueset.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.FhirDatatypePackageImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

import org.eclipse.mdht.uml.fhir.core.resource.impl.FhirResourcePackageImpl;

import org.eclipse.mdht.uml.fhir.core.valueset.DataType;
import org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType;
import org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetFactory;
import org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage;
import org.eclipse.mdht.uml.fhir.core.valueset.ResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirValuesetPackageImpl extends EPackageImpl implements FhirValuesetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDefinedTypeEEnum = null;

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
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FhirValuesetPackageImpl() {
		super(eNS_URI, FhirValuesetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FhirValuesetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FhirValuesetPackage init() {
		if (isInited) return (FhirValuesetPackage)EPackage.Registry.INSTANCE.getEPackage(FhirValuesetPackage.eNS_URI);

		// Obtain or create and register package
		FhirValuesetPackageImpl theFhirValuesetPackage = (FhirValuesetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FhirValuesetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FhirValuesetPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FhirDatatypePackageImpl theFhirDatatypePackage = (FhirDatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FhirDatatypePackage.eNS_URI) instanceof FhirDatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FhirDatatypePackage.eNS_URI) : FhirDatatypePackage.eINSTANCE);
		FhirResourcePackageImpl theFhirResourcePackage = (FhirResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI) instanceof FhirResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FhirResourcePackage.eNS_URI) : FhirResourcePackage.eINSTANCE);

		// Load packages
		theFhirResourcePackage.loadPackage();

		// Create package meta-data objects
		theFhirValuesetPackage.createPackageContents();
		theFhirDatatypePackage.createPackageContents();

		// Initialize created meta-data
		theFhirValuesetPackage.initializePackageContents();
		theFhirDatatypePackage.initializePackageContents();

		// Fix loaded packages
		theFhirResourcePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theFhirValuesetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FhirValuesetPackage.eNS_URI, theFhirValuesetPackage);
		return theFhirValuesetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceType() {
		return resourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFhirDefinedType() {
		return fhirDefinedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirValuesetFactory getFhirValuesetFactory() {
		return (FhirValuesetFactory)getEFactoryInstance();
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

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		resourceTypeEEnum = createEEnum(RESOURCE_TYPE);
		fhirDefinedTypeEEnum = createEEnum(FHIR_DEFINED_TYPE);
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

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.ADDRESS);
		addEEnumLiteral(dataTypeEEnum, DataType.AGE);
		addEEnumLiteral(dataTypeEEnum, DataType.ANNOTATION);
		addEEnumLiteral(dataTypeEEnum, DataType.ATTACHMENT);
		addEEnumLiteral(dataTypeEEnum, DataType.BACKBONE_ELEMENT);
		addEEnumLiteral(dataTypeEEnum, DataType.CODEABLE_CONCEPT);
		addEEnumLiteral(dataTypeEEnum, DataType.CODING);
		addEEnumLiteral(dataTypeEEnum, DataType.CONTACT_POINT);
		addEEnumLiteral(dataTypeEEnum, DataType.COUNT);
		addEEnumLiteral(dataTypeEEnum, DataType.DISTANCE);
		addEEnumLiteral(dataTypeEEnum, DataType.DURATION);
		addEEnumLiteral(dataTypeEEnum, DataType.ELEMENT);
		addEEnumLiteral(dataTypeEEnum, DataType.ELEMENT_DEFINITION);
		addEEnumLiteral(dataTypeEEnum, DataType.EXTENSION);
		addEEnumLiteral(dataTypeEEnum, DataType.HUMAN_NAME);
		addEEnumLiteral(dataTypeEEnum, DataType.IDENTIFIER);
		addEEnumLiteral(dataTypeEEnum, DataType.META);
		addEEnumLiteral(dataTypeEEnum, DataType.MONEY);
		addEEnumLiteral(dataTypeEEnum, DataType.NARRATIVE);
		addEEnumLiteral(dataTypeEEnum, DataType.PERIOD);
		addEEnumLiteral(dataTypeEEnum, DataType.QUANTITY);
		addEEnumLiteral(dataTypeEEnum, DataType.RANGE);
		addEEnumLiteral(dataTypeEEnum, DataType.RATIO);
		addEEnumLiteral(dataTypeEEnum, DataType.REFERENCE);
		addEEnumLiteral(dataTypeEEnum, DataType.SAMPLED_DATA);
		addEEnumLiteral(dataTypeEEnum, DataType.SIGNATURE);
		addEEnumLiteral(dataTypeEEnum, DataType.SIMPLE_QUANTITY);
		addEEnumLiteral(dataTypeEEnum, DataType.TIMING);
		addEEnumLiteral(dataTypeEEnum, DataType.BASE64_BINARY);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.CODE);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE);
		addEEnumLiteral(dataTypeEEnum, DataType.DATE_TIME);
		addEEnumLiteral(dataTypeEEnum, DataType.DECIMAL);
		addEEnumLiteral(dataTypeEEnum, DataType.ID);
		addEEnumLiteral(dataTypeEEnum, DataType.INSTANT);
		addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.MARKDOWN);
		addEEnumLiteral(dataTypeEEnum, DataType.OID);
		addEEnumLiteral(dataTypeEEnum, DataType.POSITIVE_INT);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.TIME);
		addEEnumLiteral(dataTypeEEnum, DataType.UNSIGNED_INT);
		addEEnumLiteral(dataTypeEEnum, DataType.URI);
		addEEnumLiteral(dataTypeEEnum, DataType.UUID);
		addEEnumLiteral(dataTypeEEnum, DataType.XHTML);

		initEEnum(resourceTypeEEnum, ResourceType.class, "ResourceType");
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ACCOUNT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ALLERGY_INTOLERANCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.APPOINTMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.APPOINTMENT_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.AUDIT_EVENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BASIC);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BINARY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BODY_SITE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.BUNDLE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CARE_PLAN);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CLAIM);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CLAIM_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CLINICAL_IMPRESSION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COMMUNICATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COMMUNICATION_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COMPOSITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CONCEPT_MAP);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CONDITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CONFORMANCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.CONTRACT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.COVERAGE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DATA_ELEMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DETECTED_ISSUE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE_COMPONENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE_METRIC);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE_USE_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DEVICE_USE_STATEMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DIAGNOSTIC_ORDER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DIAGNOSTIC_REPORT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DOCUMENT_MANIFEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DOCUMENT_REFERENCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.DOMAIN_RESOURCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ELIGIBILITY_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ELIGIBILITY_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ENCOUNTER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ENROLLMENT_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ENROLLMENT_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.EPISODE_OF_CARE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.EXPLANATION_OF_BENEFIT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.FAMILY_MEMBER_HISTORY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.FLAG);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.GOAL);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.GROUP);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.HEALTHCARE_SERVICE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMAGING_OBJECT_SELECTION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMAGING_STUDY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMMUNIZATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMMUNIZATION_RECOMMENDATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.IMPLEMENTATION_GUIDE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.LIST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.LOCATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDIA);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION_ADMINISTRATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION_DISPENSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION_ORDER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MEDICATION_STATEMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.MESSAGE_HEADER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.NAMING_SYSTEM);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.NUTRITION_ORDER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.OBSERVATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.OPERATION_DEFINITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.OPERATION_OUTCOME);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ORDER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ORDER_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.ORGANIZATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PARAMETERS);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PATIENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PAYMENT_NOTICE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PAYMENT_RECONCILIATION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PERSON);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PRACTITIONER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCEDURE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCEDURE_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCESS_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROCESS_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.PROVENANCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.QUESTIONNAIRE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.QUESTIONNAIRE_RESPONSE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.REFERRAL_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.RELATED_PERSON);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.RESOURCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.RISK_ASSESSMENT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SCHEDULE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SEARCH_PARAMETER);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SLOT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SPECIMEN);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.STRUCTURE_DEFINITION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SUBSCRIPTION);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SUBSTANCE);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SUPPLY_DELIVERY);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.SUPPLY_REQUEST);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.TEST_SCRIPT);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.VALUE_SET);
		addEEnumLiteral(resourceTypeEEnum, ResourceType.VISION_PRESCRIPTION);

		initEEnum(fhirDefinedTypeEEnum, FhirDefinedType.class, "FhirDefinedType");
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ADDRESS);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.AGE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ANNOTATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ATTACHMENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.BACKBONE_ELEMENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CODEABLE_CONCEPT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CODING);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CONTACT_POINT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.COUNT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DISTANCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DURATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ELEMENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ELEMENT_DEFINITION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.EXTENSION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.HUMAN_NAME);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.IDENTIFIER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.META);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MONEY);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.NARRATIVE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PERIOD);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.QUANTITY);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.RANGE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.RATIO);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.REFERENCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SAMPLED_DATA);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SIGNATURE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SIMPLE_QUANTITY);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.TIMING);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.BASE64_BINARY);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.BOOLEAN);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CODE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DATE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DATE_TIME);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DECIMAL);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ID);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.INSTANT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.INTEGER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MARKDOWN);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.OID);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.POSITIVE_INT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.STRING);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.TIME);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.UNSIGNED_INT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.URI);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.UUID);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.XHTML);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ACCOUNT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ALLERGY_INTOLERANCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.APPOINTMENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.APPOINTMENT_RESPONSE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.AUDIT_EVENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.BASIC);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.BINARY);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.BODY_SITE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.BUNDLE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CARE_PLAN);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CLAIM);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CLAIM_RESPONSE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CLINICAL_IMPRESSION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.COMMUNICATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.COMMUNICATION_REQUEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.COMPOSITION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CONCEPT_MAP);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CONDITION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CONFORMANCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.CONTRACT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.COVERAGE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DATA_ELEMENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DETECTED_ISSUE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DEVICE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DEVICE_COMPONENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DEVICE_METRIC);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DEVICE_USE_REQUEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DEVICE_USE_STATEMENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DIAGNOSTIC_ORDER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DIAGNOSTIC_REPORT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DOCUMENT_MANIFEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DOCUMENT_REFERENCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.DOMAIN_RESOURCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ELIGIBILITY_REQUEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ELIGIBILITY_RESPONSE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ENCOUNTER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ENROLLMENT_REQUEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ENROLLMENT_RESPONSE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.EPISODE_OF_CARE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.EXPLANATION_OF_BENEFIT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.FAMILY_MEMBER_HISTORY);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.FLAG);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.GOAL);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.GROUP);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.HEALTHCARE_SERVICE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.IMAGING_OBJECT_SELECTION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.IMAGING_STUDY);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.IMMUNIZATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.IMMUNIZATION_RECOMMENDATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.IMPLEMENTATION_GUIDE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.LIST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.LOCATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MEDIA);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MEDICATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MEDICATION_ADMINISTRATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MEDICATION_DISPENSE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MEDICATION_ORDER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MEDICATION_STATEMENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.MESSAGE_HEADER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.NAMING_SYSTEM);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.NUTRITION_ORDER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.OBSERVATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.OPERATION_DEFINITION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.OPERATION_OUTCOME);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ORDER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ORDER_RESPONSE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.ORGANIZATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PARAMETERS);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PATIENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PAYMENT_NOTICE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PAYMENT_RECONCILIATION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PERSON);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PRACTITIONER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PROCEDURE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PROCEDURE_REQUEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PROCESS_REQUEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PROCESS_RESPONSE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.PROVENANCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.QUESTIONNAIRE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.QUESTIONNAIRE_RESPONSE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.REFERRAL_REQUEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.RELATED_PERSON);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.RESOURCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.RISK_ASSESSMENT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SCHEDULE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SEARCH_PARAMETER);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SLOT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SPECIMEN);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.STRUCTURE_DEFINITION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SUBSCRIPTION);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SUBSTANCE);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SUPPLY_DELIVERY);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.SUPPLY_REQUEST);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.TEST_SCRIPT);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.VALUE_SET);
		addEEnumLiteral(fhirDefinedTypeEEnum, FhirDefinedType.VISION_PRESCRIPTION);

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
			 "originalName", "valueSets"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "originalName", "Address"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "originalName", "Age"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "originalName", "Annotation"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "originalName", "Attachment"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "originalName", "BackboneElement"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "originalName", "Coding"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "originalName", "ContactPoint"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "originalName", "Count"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "originalName", "Distance"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "originalName", "Duration"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(11), 
		   source, 
		   new String[] {
			 "originalName", "Element"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(12), 
		   source, 
		   new String[] {
			 "originalName", "ElementDefinition"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(13), 
		   source, 
		   new String[] {
			 "originalName", "Extension"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(14), 
		   source, 
		   new String[] {
			 "originalName", "HumanName"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(15), 
		   source, 
		   new String[] {
			 "originalName", "Identifier"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(16), 
		   source, 
		   new String[] {
			 "originalName", "Meta"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(17), 
		   source, 
		   new String[] {
			 "originalName", "Money"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(18), 
		   source, 
		   new String[] {
			 "originalName", "Narrative"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(19), 
		   source, 
		   new String[] {
			 "originalName", "Period"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(20), 
		   source, 
		   new String[] {
			 "originalName", "Quantity"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(21), 
		   source, 
		   new String[] {
			 "originalName", "Range"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(22), 
		   source, 
		   new String[] {
			 "originalName", "Ratio"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(23), 
		   source, 
		   new String[] {
			 "originalName", "Reference"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(24), 
		   source, 
		   new String[] {
			 "originalName", "SampledData"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(25), 
		   source, 
		   new String[] {
			 "originalName", "Signature"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(26), 
		   source, 
		   new String[] {
			 "originalName", "SimpleQuantity"
		   });	
		addAnnotation
		  (dataTypeEEnum.getELiterals().get(27), 
		   source, 
		   new String[] {
			 "originalName", "Timing"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "originalName", "Account"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "originalName", "AllergyIntolerance"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "originalName", "Appointment"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "originalName", "AppointmentResponse"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "originalName", "AuditEvent"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "originalName", "Basic"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "originalName", "Binary"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "originalName", "BodySite"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "originalName", "Bundle"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "originalName", "CarePlan"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "originalName", "Claim"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(11), 
		   source, 
		   new String[] {
			 "originalName", "ClaimResponse"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(12), 
		   source, 
		   new String[] {
			 "originalName", "ClinicalImpression"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(13), 
		   source, 
		   new String[] {
			 "originalName", "Communication"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(14), 
		   source, 
		   new String[] {
			 "originalName", "CommunicationRequest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(15), 
		   source, 
		   new String[] {
			 "originalName", "Composition"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(16), 
		   source, 
		   new String[] {
			 "originalName", "ConceptMap"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(17), 
		   source, 
		   new String[] {
			 "originalName", "Condition"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(18), 
		   source, 
		   new String[] {
			 "originalName", "Conformance"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(19), 
		   source, 
		   new String[] {
			 "originalName", "Contract"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(20), 
		   source, 
		   new String[] {
			 "originalName", "Coverage"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(21), 
		   source, 
		   new String[] {
			 "originalName", "DataElement"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(22), 
		   source, 
		   new String[] {
			 "originalName", "DetectedIssue"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(23), 
		   source, 
		   new String[] {
			 "originalName", "Device"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(24), 
		   source, 
		   new String[] {
			 "originalName", "DeviceComponent"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(25), 
		   source, 
		   new String[] {
			 "originalName", "DeviceMetric"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(26), 
		   source, 
		   new String[] {
			 "originalName", "DeviceUseRequest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(27), 
		   source, 
		   new String[] {
			 "originalName", "DeviceUseStatement"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(28), 
		   source, 
		   new String[] {
			 "originalName", "DiagnosticOrder"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(29), 
		   source, 
		   new String[] {
			 "originalName", "DiagnosticReport"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(30), 
		   source, 
		   new String[] {
			 "originalName", "DocumentManifest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(31), 
		   source, 
		   new String[] {
			 "originalName", "DocumentReference"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(32), 
		   source, 
		   new String[] {
			 "originalName", "DomainResource"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(33), 
		   source, 
		   new String[] {
			 "originalName", "EligibilityRequest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(34), 
		   source, 
		   new String[] {
			 "originalName", "EligibilityResponse"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(35), 
		   source, 
		   new String[] {
			 "originalName", "Encounter"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(36), 
		   source, 
		   new String[] {
			 "originalName", "EnrollmentRequest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(37), 
		   source, 
		   new String[] {
			 "originalName", "EnrollmentResponse"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(38), 
		   source, 
		   new String[] {
			 "originalName", "EpisodeOfCare"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(39), 
		   source, 
		   new String[] {
			 "originalName", "ExplanationOfBenefit"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(40), 
		   source, 
		   new String[] {
			 "originalName", "FamilyMemberHistory"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(41), 
		   source, 
		   new String[] {
			 "originalName", "Flag"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(42), 
		   source, 
		   new String[] {
			 "originalName", "Goal"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(43), 
		   source, 
		   new String[] {
			 "originalName", "Group"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(44), 
		   source, 
		   new String[] {
			 "originalName", "HealthcareService"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(45), 
		   source, 
		   new String[] {
			 "originalName", "ImagingObjectSelection"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(46), 
		   source, 
		   new String[] {
			 "originalName", "ImagingStudy"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(47), 
		   source, 
		   new String[] {
			 "originalName", "Immunization"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(48), 
		   source, 
		   new String[] {
			 "originalName", "ImmunizationRecommendation"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(49), 
		   source, 
		   new String[] {
			 "originalName", "ImplementationGuide"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(50), 
		   source, 
		   new String[] {
			 "originalName", "List"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(51), 
		   source, 
		   new String[] {
			 "originalName", "Location"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(52), 
		   source, 
		   new String[] {
			 "originalName", "Media"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(53), 
		   source, 
		   new String[] {
			 "originalName", "Medication"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(54), 
		   source, 
		   new String[] {
			 "originalName", "MedicationAdministration"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(55), 
		   source, 
		   new String[] {
			 "originalName", "MedicationDispense"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(56), 
		   source, 
		   new String[] {
			 "originalName", "MedicationOrder"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(57), 
		   source, 
		   new String[] {
			 "originalName", "MedicationStatement"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(58), 
		   source, 
		   new String[] {
			 "originalName", "MessageHeader"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(59), 
		   source, 
		   new String[] {
			 "originalName", "NamingSystem"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(60), 
		   source, 
		   new String[] {
			 "originalName", "NutritionOrder"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(61), 
		   source, 
		   new String[] {
			 "originalName", "Observation"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(62), 
		   source, 
		   new String[] {
			 "originalName", "OperationDefinition"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(63), 
		   source, 
		   new String[] {
			 "originalName", "OperationOutcome"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(64), 
		   source, 
		   new String[] {
			 "originalName", "Order"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(65), 
		   source, 
		   new String[] {
			 "originalName", "OrderResponse"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(66), 
		   source, 
		   new String[] {
			 "originalName", "Organization"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(67), 
		   source, 
		   new String[] {
			 "originalName", "Parameters"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(68), 
		   source, 
		   new String[] {
			 "originalName", "Patient"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(69), 
		   source, 
		   new String[] {
			 "originalName", "PaymentNotice"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(70), 
		   source, 
		   new String[] {
			 "originalName", "PaymentReconciliation"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(71), 
		   source, 
		   new String[] {
			 "originalName", "Person"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(72), 
		   source, 
		   new String[] {
			 "originalName", "Practitioner"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(73), 
		   source, 
		   new String[] {
			 "originalName", "Procedure"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(74), 
		   source, 
		   new String[] {
			 "originalName", "ProcedureRequest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(75), 
		   source, 
		   new String[] {
			 "originalName", "ProcessRequest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(76), 
		   source, 
		   new String[] {
			 "originalName", "ProcessResponse"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(77), 
		   source, 
		   new String[] {
			 "originalName", "Provenance"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(78), 
		   source, 
		   new String[] {
			 "originalName", "Questionnaire"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(79), 
		   source, 
		   new String[] {
			 "originalName", "QuestionnaireResponse"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(80), 
		   source, 
		   new String[] {
			 "originalName", "ReferralRequest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(81), 
		   source, 
		   new String[] {
			 "originalName", "RelatedPerson"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(82), 
		   source, 
		   new String[] {
			 "originalName", "Resource"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(83), 
		   source, 
		   new String[] {
			 "originalName", "RiskAssessment"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(84), 
		   source, 
		   new String[] {
			 "originalName", "Schedule"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(85), 
		   source, 
		   new String[] {
			 "originalName", "SearchParameter"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(86), 
		   source, 
		   new String[] {
			 "originalName", "Slot"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(87), 
		   source, 
		   new String[] {
			 "originalName", "Specimen"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(88), 
		   source, 
		   new String[] {
			 "originalName", "StructureDefinition"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(89), 
		   source, 
		   new String[] {
			 "originalName", "Subscription"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(90), 
		   source, 
		   new String[] {
			 "originalName", "Substance"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(91), 
		   source, 
		   new String[] {
			 "originalName", "SupplyDelivery"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(92), 
		   source, 
		   new String[] {
			 "originalName", "SupplyRequest"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(93), 
		   source, 
		   new String[] {
			 "originalName", "TestScript"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(94), 
		   source, 
		   new String[] {
			 "originalName", "ValueSet"
		   });	
		addAnnotation
		  (resourceTypeEEnum.getELiterals().get(95), 
		   source, 
		   new String[] {
			 "originalName", "VisionPrescription"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum, 
		   source, 
		   new String[] {
			 "originalName", "FHIRDefinedType"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "originalName", "Address"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "originalName", "Age"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "originalName", "Annotation"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "originalName", "Attachment"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "originalName", "BackboneElement"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "originalName", "Coding"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "originalName", "ContactPoint"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "originalName", "Count"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "originalName", "Distance"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "originalName", "Duration"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(11), 
		   source, 
		   new String[] {
			 "originalName", "Element"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(12), 
		   source, 
		   new String[] {
			 "originalName", "ElementDefinition"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(13), 
		   source, 
		   new String[] {
			 "originalName", "Extension"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(14), 
		   source, 
		   new String[] {
			 "originalName", "HumanName"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(15), 
		   source, 
		   new String[] {
			 "originalName", "Identifier"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(16), 
		   source, 
		   new String[] {
			 "originalName", "Meta"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(17), 
		   source, 
		   new String[] {
			 "originalName", "Money"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(18), 
		   source, 
		   new String[] {
			 "originalName", "Narrative"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(19), 
		   source, 
		   new String[] {
			 "originalName", "Period"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(20), 
		   source, 
		   new String[] {
			 "originalName", "Quantity"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(21), 
		   source, 
		   new String[] {
			 "originalName", "Range"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(22), 
		   source, 
		   new String[] {
			 "originalName", "Ratio"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(23), 
		   source, 
		   new String[] {
			 "originalName", "Reference"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(24), 
		   source, 
		   new String[] {
			 "originalName", "SampledData"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(25), 
		   source, 
		   new String[] {
			 "originalName", "Signature"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(26), 
		   source, 
		   new String[] {
			 "originalName", "SimpleQuantity"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(27), 
		   source, 
		   new String[] {
			 "originalName", "Timing"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(46), 
		   source, 
		   new String[] {
			 "originalName", "Account"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(47), 
		   source, 
		   new String[] {
			 "originalName", "AllergyIntolerance"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(48), 
		   source, 
		   new String[] {
			 "originalName", "Appointment"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(49), 
		   source, 
		   new String[] {
			 "originalName", "AppointmentResponse"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(50), 
		   source, 
		   new String[] {
			 "originalName", "AuditEvent"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(51), 
		   source, 
		   new String[] {
			 "originalName", "Basic"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(52), 
		   source, 
		   new String[] {
			 "originalName", "Binary"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(53), 
		   source, 
		   new String[] {
			 "originalName", "BodySite"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(54), 
		   source, 
		   new String[] {
			 "originalName", "Bundle"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(55), 
		   source, 
		   new String[] {
			 "originalName", "CarePlan"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(56), 
		   source, 
		   new String[] {
			 "originalName", "Claim"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(57), 
		   source, 
		   new String[] {
			 "originalName", "ClaimResponse"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(58), 
		   source, 
		   new String[] {
			 "originalName", "ClinicalImpression"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(59), 
		   source, 
		   new String[] {
			 "originalName", "Communication"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(60), 
		   source, 
		   new String[] {
			 "originalName", "CommunicationRequest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(61), 
		   source, 
		   new String[] {
			 "originalName", "Composition"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(62), 
		   source, 
		   new String[] {
			 "originalName", "ConceptMap"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(63), 
		   source, 
		   new String[] {
			 "originalName", "Condition"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(64), 
		   source, 
		   new String[] {
			 "originalName", "Conformance"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(65), 
		   source, 
		   new String[] {
			 "originalName", "Contract"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(66), 
		   source, 
		   new String[] {
			 "originalName", "Coverage"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(67), 
		   source, 
		   new String[] {
			 "originalName", "DataElement"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(68), 
		   source, 
		   new String[] {
			 "originalName", "DetectedIssue"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(69), 
		   source, 
		   new String[] {
			 "originalName", "Device"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(70), 
		   source, 
		   new String[] {
			 "originalName", "DeviceComponent"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(71), 
		   source, 
		   new String[] {
			 "originalName", "DeviceMetric"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(72), 
		   source, 
		   new String[] {
			 "originalName", "DeviceUseRequest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(73), 
		   source, 
		   new String[] {
			 "originalName", "DeviceUseStatement"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(74), 
		   source, 
		   new String[] {
			 "originalName", "DiagnosticOrder"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(75), 
		   source, 
		   new String[] {
			 "originalName", "DiagnosticReport"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(76), 
		   source, 
		   new String[] {
			 "originalName", "DocumentManifest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(77), 
		   source, 
		   new String[] {
			 "originalName", "DocumentReference"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(78), 
		   source, 
		   new String[] {
			 "originalName", "DomainResource"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(79), 
		   source, 
		   new String[] {
			 "originalName", "EligibilityRequest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(80), 
		   source, 
		   new String[] {
			 "originalName", "EligibilityResponse"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(81), 
		   source, 
		   new String[] {
			 "originalName", "Encounter"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(82), 
		   source, 
		   new String[] {
			 "originalName", "EnrollmentRequest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(83), 
		   source, 
		   new String[] {
			 "originalName", "EnrollmentResponse"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(84), 
		   source, 
		   new String[] {
			 "originalName", "EpisodeOfCare"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(85), 
		   source, 
		   new String[] {
			 "originalName", "ExplanationOfBenefit"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(86), 
		   source, 
		   new String[] {
			 "originalName", "FamilyMemberHistory"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(87), 
		   source, 
		   new String[] {
			 "originalName", "Flag"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(88), 
		   source, 
		   new String[] {
			 "originalName", "Goal"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(89), 
		   source, 
		   new String[] {
			 "originalName", "Group"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(90), 
		   source, 
		   new String[] {
			 "originalName", "HealthcareService"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(91), 
		   source, 
		   new String[] {
			 "originalName", "ImagingObjectSelection"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(92), 
		   source, 
		   new String[] {
			 "originalName", "ImagingStudy"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(93), 
		   source, 
		   new String[] {
			 "originalName", "Immunization"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(94), 
		   source, 
		   new String[] {
			 "originalName", "ImmunizationRecommendation"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(95), 
		   source, 
		   new String[] {
			 "originalName", "ImplementationGuide"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(96), 
		   source, 
		   new String[] {
			 "originalName", "List"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(97), 
		   source, 
		   new String[] {
			 "originalName", "Location"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(98), 
		   source, 
		   new String[] {
			 "originalName", "Media"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(99), 
		   source, 
		   new String[] {
			 "originalName", "Medication"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(100), 
		   source, 
		   new String[] {
			 "originalName", "MedicationAdministration"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(101), 
		   source, 
		   new String[] {
			 "originalName", "MedicationDispense"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(102), 
		   source, 
		   new String[] {
			 "originalName", "MedicationOrder"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(103), 
		   source, 
		   new String[] {
			 "originalName", "MedicationStatement"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(104), 
		   source, 
		   new String[] {
			 "originalName", "MessageHeader"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(105), 
		   source, 
		   new String[] {
			 "originalName", "NamingSystem"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(106), 
		   source, 
		   new String[] {
			 "originalName", "NutritionOrder"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(107), 
		   source, 
		   new String[] {
			 "originalName", "Observation"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(108), 
		   source, 
		   new String[] {
			 "originalName", "OperationDefinition"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(109), 
		   source, 
		   new String[] {
			 "originalName", "OperationOutcome"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(110), 
		   source, 
		   new String[] {
			 "originalName", "Order"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(111), 
		   source, 
		   new String[] {
			 "originalName", "OrderResponse"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(112), 
		   source, 
		   new String[] {
			 "originalName", "Organization"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(113), 
		   source, 
		   new String[] {
			 "originalName", "Parameters"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(114), 
		   source, 
		   new String[] {
			 "originalName", "Patient"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(115), 
		   source, 
		   new String[] {
			 "originalName", "PaymentNotice"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(116), 
		   source, 
		   new String[] {
			 "originalName", "PaymentReconciliation"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(117), 
		   source, 
		   new String[] {
			 "originalName", "Person"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(118), 
		   source, 
		   new String[] {
			 "originalName", "Practitioner"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(119), 
		   source, 
		   new String[] {
			 "originalName", "Procedure"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(120), 
		   source, 
		   new String[] {
			 "originalName", "ProcedureRequest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(121), 
		   source, 
		   new String[] {
			 "originalName", "ProcessRequest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(122), 
		   source, 
		   new String[] {
			 "originalName", "ProcessResponse"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(123), 
		   source, 
		   new String[] {
			 "originalName", "Provenance"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(124), 
		   source, 
		   new String[] {
			 "originalName", "Questionnaire"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(125), 
		   source, 
		   new String[] {
			 "originalName", "QuestionnaireResponse"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(126), 
		   source, 
		   new String[] {
			 "originalName", "ReferralRequest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(127), 
		   source, 
		   new String[] {
			 "originalName", "RelatedPerson"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(128), 
		   source, 
		   new String[] {
			 "originalName", "Resource"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(129), 
		   source, 
		   new String[] {
			 "originalName", "RiskAssessment"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(130), 
		   source, 
		   new String[] {
			 "originalName", "Schedule"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(131), 
		   source, 
		   new String[] {
			 "originalName", "SearchParameter"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(132), 
		   source, 
		   new String[] {
			 "originalName", "Slot"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(133), 
		   source, 
		   new String[] {
			 "originalName", "Specimen"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(134), 
		   source, 
		   new String[] {
			 "originalName", "StructureDefinition"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(135), 
		   source, 
		   new String[] {
			 "originalName", "Subscription"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(136), 
		   source, 
		   new String[] {
			 "originalName", "Substance"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(137), 
		   source, 
		   new String[] {
			 "originalName", "SupplyDelivery"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(138), 
		   source, 
		   new String[] {
			 "originalName", "SupplyRequest"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(139), 
		   source, 
		   new String[] {
			 "originalName", "TestScript"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(140), 
		   source, 
		   new String[] {
			 "originalName", "ValueSet"
		   });	
		addAnnotation
		  (fhirDefinedTypeEEnum.getELiterals().get(141), 
		   source, 
		   new String[] {
			 "originalName", "VisionPrescription"
		   });
	}

} //FhirValuesetPackageImpl
