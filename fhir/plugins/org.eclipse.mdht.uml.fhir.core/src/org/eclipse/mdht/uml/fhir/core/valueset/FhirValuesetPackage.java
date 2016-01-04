/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllSecurityLabels <em>All Security Labels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllSecurityLabels
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllSecurityLabels()
	 * @generated
	 */
	int ALL_SECURITY_LABELS = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NarrativeStatus <em>Narrative Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NarrativeStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNarrativeStatus()
	 * @generated
	 */
	int NARRATIVE_STATUS = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentifierUse <em>Identifier Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentifierUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIdentifierUse()
	 * @generated
	 */
	int IDENTIFIER_USE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentifierTypeCodes <em>Identifier Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentifierTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIdentifierTypeCodes()
	 * @generated
	 */
	int IDENTIFIER_TYPE_CODES = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrganizationType <em>Organization Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrganizationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrganizationType()
	 * @generated
	 */
	int ORGANIZATION_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactPointSystem <em>Contact Point System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactPointSystem
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContactPointSystem()
	 * @generated
	 */
	int CONTACT_POINT_SYSTEM = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactPointUse <em>Contact Point Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactPointUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContactPointUse()
	 * @generated
	 */
	int CONTACT_POINT_USE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AddressUse <em>Address Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AddressUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAddressUse()
	 * @generated
	 */
	int ADDRESS_USE = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AddressType <em>Address Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AddressType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactEntityType <em>Contact Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactEntityType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContactEntityType()
	 * @generated
	 */
	int CONTACT_ENTITY_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NameUse <em>Name Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NameUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNameUse()
	 * @generated
	 */
	int NAME_USE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdministrativeGender <em>Administrative Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdministrativeGender
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdministrativeGender()
	 * @generated
	 */
	int ADMINISTRATIVE_GENDER = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PractitionerRole <em>Practitioner Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PractitionerRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPractitionerRole()
	 * @generated
	 */
	int PRACTITIONER_ROLE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PractitionerSpecialty <em>Practitioner Specialty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PractitionerSpecialty
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPractitionerSpecialty()
	 * @generated
	 */
	int PRACTITIONER_SPECIALTY = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationStatus <em>Location Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLocationStatus()
	 * @generated
	 */
	int LOCATION_STATUS = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationMode <em>Location Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLocationMode()
	 * @generated
	 */
	int LOCATION_MODE = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ServiceDeliveryLocationRoleType <em>Service Delivery Location Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ServiceDeliveryLocationRoleType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getServiceDeliveryLocationRoleType()
	 * @generated
	 */
	int SERVICE_DELIVERY_LOCATION_ROLE_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationType <em>Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PracticeSettingCodeValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPracticeSettingCodeValueSet()
	 * @generated
	 */
	int PRACTICE_SETTING_CODE_VALUE_SET = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ServiceProvisionConditions <em>Service Provision Conditions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ServiceProvisionConditions
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getServiceProvisionConditions()
	 * @generated
	 */
	int SERVICE_PROVISION_CONDITIONS = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReferralMethod <em>Referral Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReferralMethod
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getReferralMethod()
	 * @generated
	 */
	int REFERRAL_METHOD = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DaysOfWeek <em>Days Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DaysOfWeek
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDaysOfWeek()
	 * @generated
	 */
	int DAYS_OF_WEEK = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 <em>Anzsco Australian And New Zealand Standard Classification Of Occupations2013 Version12</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12()
	 * @generated
	 */
	int ANZSCO_AUSTRALIAN_AND_NEW_ZEALAND_STANDARD_CLASSIFICATION_OF_OCCUPATIONS2013_VERSION12 = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MaritalStatusCodes <em>Marital Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MaritalStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMaritalStatusCodes()
	 * @generated
	 */
	int MARITAL_STATUS_CODES = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientContactRelationship <em>Patient Contact Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientContactRelationship
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPatientContactRelationship()
	 * @generated
	 */
	int PATIENT_CONTACT_RELATIONSHIP = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnimalSpecies <em>Animal Species</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnimalSpecies
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAnimalSpecies()
	 * @generated
	 */
	int ANIMAL_SPECIES = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnimalBreeds <em>Animal Breeds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnimalBreeds
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAnimalBreeds()
	 * @generated
	 */
	int ANIMAL_BREEDS = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GenderStatus <em>Gender Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GenderStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGenderStatus()
	 * @generated
	 */
	int GENDER_STATUS = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LinkType <em>Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LinkType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientRelationshipType <em>Patient Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientRelationshipType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPatientRelationshipType()
	 * @generated
	 */
	int PATIENT_RELATIONSHIP_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuantityComparator <em>Quantity Comparator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuantityComparator
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuantityComparator()
	 * @generated
	 */
	int QUANTITY_COMPARATOR = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SignatureTypeCodes <em>Signature Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SignatureTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSignatureTypeCodes()
	 * @generated
	 */
	int SIGNATURE_TYPE_CODES = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceStatus <em>Device Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceStatus()
	 * @generated
	 */
	int DEVICE_STATUS = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnitsOfTime <em>Units Of Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnitsOfTime
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUnitsOfTime()
	 * @generated
	 */
	int UNITS_OF_TIME = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EventTiming <em>Event Timing</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EventTiming
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEventTiming()
	 * @generated
	 */
	int EVENT_TIMING = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TimingAbbreviation <em>Timing Abbreviation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TimingAbbreviation
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTimingAbbreviation()
	 * @generated
	 */
	int TIMING_ABBREVIATION = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataType <em>Module Metadata Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataType()
	 * @generated
	 */
	int MODULE_METADATA_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataStatus <em>Module Metadata Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataStatus()
	 * @generated
	 */
	int MODULE_METADATA_STATUS = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataFocusType <em>Module Metadata Focus Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataFocusType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataFocusType()
	 * @generated
	 */
	int MODULE_METADATA_FOCUS_TYPE = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataContributorType <em>Module Metadata Contributor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataContributorType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataContributorType()
	 * @generated
	 */
	int MODULE_METADATA_CONTRIBUTOR_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentityAssuranceLevel <em>Identity Assurance Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentityAssuranceLevel
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIdentityAssuranceLevel()
	 * @generated
	 */
	int IDENTITY_ASSURANCE_LEVEL = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataResourceType <em>Module Metadata Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataResourceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataResourceType()
	 * @generated
	 */
	int MODULE_METADATA_RESOURCE_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationParameterUse <em>Operation Parameter Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationParameterUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOperationParameterUse()
	 * @generated
	 */
	int OPERATION_PARAMETER_USE = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParameterTypesUsedInOperationDefinitions <em>Parameter Types Used In Operation Definitions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParameterTypesUsedInOperationDefinitions
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParameterTypesUsedInOperationDefinitions()
	 * @generated
	 */
	int PARAMETER_TYPES_USED_IN_OPERATION_DEFINITIONS = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceResourceStatus <em>Conformance Resource Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceResourceStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConformanceResourceStatus()
	 * @generated
	 */
	int CONFORMANCE_RESOURCE_STATUS = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContextOfUseValueSet <em>Context Of Use Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContextOfUseValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContextOfUseValueSet()
	 * @generated
	 */
	int CONTEXT_OF_USE_VALUE_SET = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionCodes <em>Structure Definition Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getStructureDefinitionCodes()
	 * @generated
	 */
	int STRUCTURE_DEFINITION_CODES = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionKind <em>Structure Definition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getStructureDefinitionKind()
	 * @generated
	 */
	int STRUCTURE_DEFINITION_KIND = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType <em>Fhir Defined Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFhirDefinedType()
	 * @generated
	 */
	int FHIR_DEFINED_TYPE = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExtensionContext <em>Extension Context</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExtensionContext
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExtensionContext()
	 * @generated
	 */
	int EXTENSION_CONTEXT = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PropertyRepresentation <em>Property Representation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PropertyRepresentation
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPropertyRepresentation()
	 * @generated
	 */
	int PROPERTY_REPRESENTATION = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincCodes <em>Loinc Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLoincCodes()
	 * @generated
	 */
	int LOINC_CODES = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SlicingRules <em>Slicing Rules</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SlicingRules
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSlicingRules()
	 * @generated
	 */
	int SLICING_RULES = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AggregationMode <em>Aggregation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AggregationMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAggregationMode()
	 * @generated
	 */
	int AGGREGATION_MODE = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConstraintSeverity <em>Constraint Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConstraintSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConstraintSeverity()
	 * @generated
	 */
	int CONSTRAINT_SEVERITY = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BindingStrength <em>Binding Strength</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BindingStrength
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBindingStrength()
	 * @generated
	 */
	int BINDING_STRENGTH = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DesignationUse <em>Designation Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DesignationUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDesignationUse()
	 * @generated
	 */
	int DESIGNATION_USE = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FilterOperator <em>Filter Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FilterOperator
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFilterOperator()
	 * @generated
	 */
	int FILTER_OPERATOR = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GroupType <em>Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GroupType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtMedicationCodes <em>Snomed Ct Medication Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtMedicationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtMedicationCodes()
	 * @generated
	 */
	int SNOMED_CT_MEDICATION_CODES = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationFormCodes <em>Medication Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationFormCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationFormCodes()
	 * @generated
	 */
	int MEDICATION_FORM_CODES = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCategoryCodes <em>Substance Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubstanceCategoryCodes()
	 * @generated
	 */
	int SUBSTANCE_CATEGORY_CODES = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCode <em>Substance Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubstanceCode()
	 * @generated
	 */
	int SUBSTANCE_CODE = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtFormCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtFormCodes()
	 * @generated
	 */
	int SNOMED_CT_FORM_CODES = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemParticipationMode <em>V3 Code System Participation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemParticipationMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV3CodeSystemParticipationMode()
	 * @generated
	 */
	int V3_CODE_SYSTEM_PARTICIPATION_MODE = 66;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CommunicationStatus <em>Communication Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CommunicationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCommunicationStatus()
	 * @generated
	 */
	int COMMUNICATION_STATUS = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterState <em>Encounter State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterState
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterState()
	 * @generated
	 */
	int ENCOUNTER_STATE = 68;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterClass <em>Encounter Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterClass
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterClass()
	 * @generated
	 */
	int ENCOUNTER_CLASS = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterType <em>Encounter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterType()
	 * @generated
	 */
	int ENCOUNTER_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterPriority <em>Encounter Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterPriority()
	 * @generated
	 */
	int ENCOUNTER_PRIORITY = 71;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EpisodeOfCareStatus <em>Episode Of Care Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EpisodeOfCareStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEpisodeOfCareStatus()
	 * @generated
	 */
	int EPISODE_OF_CARE_STATUS = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionProblemDiagnosisCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionProblemDiagnosisCodes()
	 * @generated
	 */
	int CONDITION_PROBLEM_DIAGNOSIS_CODES = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionCategoryCodes <em>Condition Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionCategoryCodes()
	 * @generated
	 */
	int CONDITION_CATEGORY_CODES = 74;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionClinicalStatusCodes <em>Condition Clinical Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionClinicalStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionClinicalStatusCodes()
	 * @generated
	 */
	int CONDITION_CLINICAL_STATUS_CODES = 75;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionVerificationStatus <em>Condition Verification Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionVerificationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionVerificationStatus()
	 * @generated
	 */
	int CONDITION_VERIFICATION_STATUS = 76;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionDiagnosisSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionDiagnosisSeverity()
	 * @generated
	 */
	int CONDITION_DIAGNOSIS_SEVERITY = 77;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionStage <em>Condition Stage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionStage
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionStage()
	 * @generated
	 */
	int CONDITION_STAGE = 78;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ClinicalImpressionStatus <em>Clinical Impression Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ClinicalImpressionStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getClinicalImpressionStatus()
	 * @generated
	 */
	int CLINICAL_IMPRESSION_STATUS = 79;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSubstanceAndNegationCodes <em>Allergy Intolerance Substance And Negation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSubstanceAndNegationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceSubstanceAndNegationCodes()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_SUBSTANCE_AND_NEGATION_CODES = 80;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceStatus <em>Allergy Intolerance Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceStatus()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_STATUS = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCriticality <em>Allergy Intolerance Criticality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCriticality
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceCriticality()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_CRITICALITY = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceType <em>Allergy Intolerance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceType()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_TYPE = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCategory <em>Allergy Intolerance Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceCategory()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_CATEGORY = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCertainty <em>Allergy Intolerance Certainty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCertainty
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceCertainty()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_CERTAINTY = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtManifestationCodes <em>Snomed Ct Manifestation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtManifestationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtManifestationCodes()
	 * @generated
	 */
	int SNOMED_CT_MANIFESTATION_CODES = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSeverity <em>Allergy Intolerance Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceSeverity()
	 * @generated
	 */
	int ALLERGY_INTOLERANCE_SEVERITY = 87;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtRouteCodes <em>Snomed Ct Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtRouteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtRouteCodes()
	 * @generated
	 */
	int SNOMED_CT_ROUTE_CODES = 88;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtClinicalFindings
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtClinicalFindings()
	 * @generated
	 */
	int SNOMED_CT_CLINICAL_FINDINGS = 89;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.InvestigationType <em>Investigation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.InvestigationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getInvestigationType()
	 * @generated
	 */
	int INVESTIGATION_TYPE = 90;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationStatus <em>Observation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationStatus()
	 * @generated
	 */
	int OBSERVATION_STATUS = 91;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationCategoryCodes <em>Observation Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationCategoryCodes()
	 * @generated
	 */
	int OBSERVATION_CATEGORY_CODES = 92;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationValueAbsentReason <em>Observation Value Absent Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationValueAbsentReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationValueAbsentReason()
	 * @generated
	 */
	int OBSERVATION_VALUE_ABSENT_REASON = 93;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationInterpretationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationInterpretationCodes()
	 * @generated
	 */
	int OBSERVATION_INTERPRETATION_CODES = 94;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtBodyStructures <em>Snomed Ct Body Structures</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtBodyStructures
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtBodyStructures()
	 * @generated
	 */
	int SNOMED_CT_BODY_STRUCTURES = 95;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationMethods <em>Observation Methods</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationMethods
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationMethods()
	 * @generated
	 */
	int OBSERVATION_METHODS = 96;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenStatus <em>Specimen Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecimenStatus()
	 * @generated
	 */
	int SPECIMEN_STATUS = 97;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V2SpecimenType <em>V2 Specimen Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V2SpecimenType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV2SpecimenType()
	 * @generated
	 */
	int V2_SPECIMEN_TYPE = 98;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenCollectionMethod <em>Specimen Collection Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenCollectionMethod
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecimenCollectionMethod()
	 * @generated
	 */
	int SPECIMEN_COLLECTION_METHOD = 99;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenTreatmentProcedure <em>Specimen Treatment Procedure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenTreatmentProcedure
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecimenTreatmentProcedure()
	 * @generated
	 */
	int SPECIMEN_TREATMENT_PROCEDURE = 100;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenContainer <em>Specimen Container</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenContainer
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecimenContainer()
	 * @generated
	 */
	int SPECIMEN_CONTAINER = 101;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V2AdditivePreservative <em>V2 Additive Preservative</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V2AdditivePreservative
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV2AdditivePreservative()
	 * @generated
	 */
	int V2_ADDITIVE_PRESERVATIVE = 102;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MeasmntPrinciple <em>Measmnt Principle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MeasmntPrinciple
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMeasmntPrinciple()
	 * @generated
	 */
	int MEASMNT_PRINCIPLE = 103;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricOperationalStatus <em>Device Metric Operational Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricOperationalStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricOperationalStatus()
	 * @generated
	 */
	int DEVICE_METRIC_OPERATIONAL_STATUS = 104;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricColor <em>Device Metric Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricColor
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricColor()
	 * @generated
	 */
	int DEVICE_METRIC_COLOR = 105;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCategory <em>Device Metric Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricCategory()
	 * @generated
	 */
	int DEVICE_METRIC_CATEGORY = 106;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationType <em>Device Metric Calibration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricCalibrationType()
	 * @generated
	 */
	int DEVICE_METRIC_CALIBRATION_TYPE = 107;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationState <em>Device Metric Calibration State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationState
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricCalibrationState()
	 * @generated
	 */
	int DEVICE_METRIC_CALIBRATION_STATE = 108;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationReferenceRangeMeaningCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationReferenceRangeMeaningCodes()
	 * @generated
	 */
	int OBSERVATION_REFERENCE_RANGE_MEANING_CODES = 109;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationRelationshipType <em>Observation Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationRelationshipType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationRelationshipType()
	 * @generated
	 */
	int OBSERVATION_RELATIONSHIP_TYPE = 110;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireStatus <em>Questionnaire Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireStatus()
	 * @generated
	 */
	int QUESTIONNAIRE_STATUS = 111;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireQuestionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireQuestionCodes()
	 * @generated
	 */
	int QUESTIONNAIRE_QUESTION_CODES = 112;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireItemType <em>Questionnaire Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireItemType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireItemType()
	 * @generated
	 */
	int QUESTIONNAIRE_ITEM_TYPE = 113;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireAnswerCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireAnswerCodes()
	 * @generated
	 */
	int QUESTIONNAIRE_ANSWER_CODES = 114;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireResponseStatus <em>Questionnaire Response Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireResponseStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireResponseStatus()
	 * @generated
	 */
	int QUESTIONNAIRE_RESPONSE_STATUS = 115;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FamilyHistoryStatus <em>Family History Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FamilyHistoryStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFamilyHistoryStatus()
	 * @generated
	 */
	int FAMILY_HISTORY_STATUS = 116;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FamilyMember <em>Family Member</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FamilyMember
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFamilyMember()
	 * @generated
	 */
	int FAMILY_MEMBER = 117;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionOutcomeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionOutcomeCodes()
	 * @generated
	 */
	int CONDITION_OUTCOME_CODES = 118;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticReportStatus <em>Diagnostic Report Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticReportStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticReportStatus()
	 * @generated
	 */
	int DIAGNOSTIC_REPORT_STATUS = 119;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticServiceSectionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticServiceSectionCodes()
	 * @generated
	 */
	int DIAGNOSTIC_SERVICE_SECTION_CODES = 120;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticReportCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLoincDiagnosticReportCodes()
	 * @generated
	 */
	int LOINC_DIAGNOSTIC_REPORT_CODES = 121;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentTypeValueSet <em>Document Type Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentTypeValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentTypeValueSet()
	 * @generated
	 */
	int DOCUMENT_TYPE_VALUE_SET = 122;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentClassValueSet <em>Document Class Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentClassValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentClassValueSet()
	 * @generated
	 */
	int DOCUMENT_CLASS_VALUE_SET = 123;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceStatus <em>Document Reference Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentReferenceStatus()
	 * @generated
	 */
	int DOCUMENT_REFERENCE_STATUS = 124;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CompositionStatus <em>Composition Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CompositionStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCompositionStatus()
	 * @generated
	 */
	int COMPOSITION_STATUS = 125;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentRelationshipType <em>Document Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentRelationshipType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentRelationshipType()
	 * @generated
	 */
	int DOCUMENT_RELATIONSHIP_TYPE = 126;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceFormatCodeSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentReferenceFormatCodeSet()
	 * @generated
	 */
	int DOCUMENT_REFERENCE_FORMAT_CODE_SET = 127;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemActCode <em>V3 Code System Act Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemActCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV3CodeSystemActCode()
	 * @generated
	 */
	int V3_CODE_SYSTEM_ACT_CODE = 128;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FacilityTypeCodeValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFacilityTypeCodeValueSet()
	 * @generated
	 */
	int FACILITY_TYPE_CODE_VALUE_SET = 129;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderStatus <em>Diagnostic Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticOrderStatus()
	 * @generated
	 */
	int DIAGNOSTIC_ORDER_STATUS = 130;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderPriority <em>Diagnostic Order Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticOrderPriority()
	 * @generated
	 */
	int DIAGNOSTIC_ORDER_PRIORITY = 131;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderEventCodes <em>Diagnostic Order Event Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderEventCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticOrderEventCodes()
	 * @generated
	 */
	int DIAGNOSTIC_ORDER_EVENT_CODES = 132;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticOrderCodes <em>Loinc Diagnostic Order Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticOrderCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLoincDiagnosticOrderCodes()
	 * @generated
	 */
	int LOINC_DIAGNOSTIC_ORDER_CODES = 133;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCodessnomedCT <em>Procedure Codessnomed CT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCodessnomedCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureCodessnomedCT()
	 * @generated
	 */
	int PROCEDURE_CODESSNOMED_CT = 134;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureReasonCodes <em>Procedure Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureReasonCodes()
	 * @generated
	 */
	int PROCEDURE_REASON_CODES = 135;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestStatus <em>Procedure Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureRequestStatus()
	 * @generated
	 */
	int PROCEDURE_REQUEST_STATUS = 136;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestPriority <em>Procedure Request Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureRequestPriority()
	 * @generated
	 */
	int PROCEDURE_REQUEST_PRIORITY = 137;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReferralStatus <em>Referral Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReferralStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getReferralStatus()
	 * @generated
	 */
	int REFERRAL_STATUS = 138;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AcquisitionModalityCodes <em>Acquisition Modality Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AcquisitionModalityCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAcquisitionModalityCodes()
	 * @generated
	 */
	int ACQUISITION_MODALITY_CODES = 139;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.InstanceAvailability <em>Instance Availability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.InstanceAvailability
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getInstanceAvailability()
	 * @generated
	 */
	int INSTANCE_AVAILABILITY = 140;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureStatus <em>Procedure Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureStatus()
	 * @generated
	 */
	int PROCEDURE_STATUS = 141;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCategoryCodessnomedCT <em>Procedure Category Codessnomed CT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCategoryCodessnomedCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureCategoryCodessnomedCT()
	 * @generated
	 */
	int PROCEDURE_CATEGORY_CODESSNOMED_CT = 142;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureNotPerformedReasonsnomeDCT <em>Procedure Not Performed Reasonsnome DCT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureNotPerformedReasonsnomeDCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureNotPerformedReasonsnomeDCT()
	 * @generated
	 */
	int PROCEDURE_NOT_PERFORMED_REASONSNOME_DCT = 143;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedurePerformerRoleCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedurePerformerRoleCodes()
	 * @generated
	 */
	int PROCEDURE_PERFORMER_ROLE_CODES = 144;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureOutcomeCodessnomedCT <em>Procedure Outcome Codessnomed CT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureOutcomeCodessnomedCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureOutcomeCodessnomedCT()
	 * @generated
	 */
	int PROCEDURE_OUTCOME_CODESSNOMED_CT = 145;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureFollowUpCodessnomedCT <em>Procedure Follow Up Codessnomed CT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureFollowUpCodessnomedCT
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureFollowUpCodessnomedCT()
	 * @generated
	 */
	int PROCEDURE_FOLLOW_UP_CODESSNOMED_CT = 146;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanStatus <em>Care Plan Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanStatus()
	 * @generated
	 */
	int CARE_PLAN_STATUS = 147;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanCategory <em>Care Plan Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanCategory()
	 * @generated
	 */
	int CARE_PLAN_CATEGORY = 148;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanRelationship <em>Care Plan Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanRelationship
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanRelationship()
	 * @generated
	 */
	int CARE_PLAN_RELATIONSHIP = 149;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRoles <em>Participant Roles</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRoles
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipantRoles()
	 * @generated
	 */
	int PARTICIPANT_ROLES = 150;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStartEvent <em>Goal Start Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStartEvent
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalStartEvent()
	 * @generated
	 */
	int GOAL_START_EVENT = 151;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalCategory <em>Goal Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalCategory()
	 * @generated
	 */
	int GOAL_CATEGORY = 152;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStatus <em>Goal Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalStatus()
	 * @generated
	 */
	int GOAL_STATUS = 153;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStatusReason <em>Goal Status Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStatusReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalStatusReason()
	 * @generated
	 */
	int GOAL_STATUS_REASON = 154;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalPriority <em>Goal Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalPriority()
	 * @generated
	 */
	int GOAL_PRIORITY = 155;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationStatementStatus <em>Medication Statement Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationStatementStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationStatementStatus()
	 * @generated
	 */
	int MEDICATION_STATEMENT_STATUS = 156;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationNotGivenCodes <em>Reason Medication Not Given Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationNotGivenCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getReasonMedicationNotGivenCodes()
	 * @generated
	 */
	int REASON_MEDICATION_NOT_GIVEN_CODES = 157;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BodysiteLocationModifier <em>Bodysite Location Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BodysiteLocationModifier
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBodysiteLocationModifier()
	 * @generated
	 */
	int BODYSITE_LOCATION_MODIFIER = 158;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtAnatomicalStructureForAdministrationSiteCodes <em>Snomed Ct Anatomical Structure For Administration Site Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtAnatomicalStructureForAdministrationSiteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtAnatomicalStructureForAdministrationSiteCodes()
	 * @generated
	 */
	int SNOMED_CT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES = 159;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NutritionOrderStatus <em>Nutrition Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NutritionOrderStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNutritionOrderStatus()
	 * @generated
	 */
	int NUTRITION_ORDER_STATUS = 160;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Diet <em>Diet</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Diet
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiet()
	 * @generated
	 */
	int DIET = 161;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FoodTypeCodes <em>Food Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FoodTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFoodTypeCodes()
	 * @generated
	 */
	int FOOD_TYPE_CODES = 162;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DietCodes <em>Diet Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DietCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDietCodes()
	 * @generated
	 */
	int DIET_CODES = 163;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NutrientModifierCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNutrientModifierCodes()
	 * @generated
	 */
	int NUTRIENT_MODIFIER_CODES = 164;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TextureModifierCodes <em>Texture Modifier Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TextureModifierCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTextureModifierCodes()
	 * @generated
	 */
	int TEXTURE_MODIFIER_CODES = 165;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TextureModifiedFoodTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTextureModifiedFoodTypeCodes()
	 * @generated
	 */
	int TEXTURE_MODIFIED_FOOD_TYPE_CODES = 166;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FluidConsistencyTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFluidConsistencyTypeCodes()
	 * @generated
	 */
	int FLUID_CONSISTENCY_TYPE_CODES = 167;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplementTypeCodes <em>Supplement Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplementTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplementTypeCodes()
	 * @generated
	 */
	int SUPPLEMENT_TYPE_CODES = 168;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEnteralFormulaTypeCodes()
	 * @generated
	 */
	int ENTERAL_FORMULA_TYPE_CODES = 169;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaAdditiveTypeCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEnteralFormulaAdditiveTypeCode()
	 * @generated
	 */
	int ENTERAL_FORMULA_ADDITIVE_TYPE_CODE = 170;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralRouteCodes <em>Enteral Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralRouteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEnteralRouteCodes()
	 * @generated
	 */
	int ENTERAL_ROUTE_CODES = 171;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RiskProbability <em>Risk Probability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RiskProbability
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRiskProbability()
	 * @generated
	 */
	int RISK_PROBABILITY = 172;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AppointmentStatus <em>Appointment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AppointmentStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAppointmentStatus()
	 * @generated
	 */
	int APPOINTMENT_STATUS = 173;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterReasonCodes <em>Encounter Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterReasonCodes()
	 * @generated
	 */
	int ENCOUNTER_REASON_CODES = 174;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SlotStatus <em>Slot Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SlotStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSlotStatus()
	 * @generated
	 */
	int SLOT_STATUS = 175;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantType <em>Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipantType()
	 * @generated
	 */
	int PARTICIPANT_TYPE = 176;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRequired <em>Participant Required</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRequired
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipantRequired()
	 * @generated
	 */
	int PARTICIPANT_REQUIRED = 177;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipationStatus <em>Participation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipationStatus()
	 * @generated
	 */
	int PARTICIPATION_STATUS = 178;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CommunicationRequestStatus <em>Communication Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CommunicationRequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCommunicationRequestStatus()
	 * @generated
	 */
	int COMMUNICATION_REQUEST_STATUS = 179;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestStatus <em>Device Use Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceUseRequestStatus()
	 * @generated
	 */
	int DEVICE_USE_REQUEST_STATUS = 180;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestPriority <em>Device Use Request Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestPriority
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceUseRequestPriority()
	 * @generated
	 */
	int DEVICE_USE_REQUEST_PRIORITY = 181;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationOrderStatus <em>Medication Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationOrderStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationOrderStatus()
	 * @generated
	 */
	int MEDICATION_ORDER_STATUS = 182;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActSubstanceAdminSubstitutionCode <em>Act Substance Admin Substitution Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActSubstanceAdminSubstitutionCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActSubstanceAdminSubstitutionCode()
	 * @generated
	 */
	int ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE = 183;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceAdminSubstitutionReason <em>Substance Admin Substitution Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceAdminSubstitutionReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubstanceAdminSubstitutionReason()
	 * @generated
	 */
	int SUBSTANCE_ADMIN_SUBSTITUTION_REASON = 184;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActionList <em>Action List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActionList
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActionList()
	 * @generated
	 */
	int ACTION_LIST = 185;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RulesetCodes <em>Ruleset Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RulesetCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRulesetCodes()
	 * @generated
	 */
	int RULESET_CODES = 186;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestStatus <em>Supply Request Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyRequestStatus()
	 * @generated
	 */
	int SUPPLY_REQUEST_STATUS = 187;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyType <em>Supply Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyType()
	 * @generated
	 */
	int SUPPLY_TYPE = 188;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestReason <em>Supply Request Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyRequestReason()
	 * @generated
	 */
	int SUPPLY_REQUEST_REASON = 189;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestWhen <em>Supply Request When</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestWhen
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyRequestWhen()
	 * @generated
	 */
	int SUPPLY_REQUEST_WHEN = 190;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleVisionPrescriptionProductCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExampleVisionPrescriptionProductCodes()
	 * @generated
	 */
	int EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES = 191;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VisionEyes <em>Vision Eyes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VisionEyes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVisionEyes()
	 * @generated
	 */
	int VISION_EYES = 192;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VisionBase <em>Vision Base</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VisionBase
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVisionBase()
	 * @generated
	 */
	int VISION_BASE = 193;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityCategory <em>Care Plan Activity Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanActivityCategory()
	 * @generated
	 */
	int CARE_PLAN_ACTIVITY_CATEGORY = 194;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivity <em>Care Plan Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivity
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanActivity()
	 * @generated
	 */
	int CARE_PLAN_ACTIVITY = 195;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActivityReason <em>Activity Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActivityReason
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActivityReason()
	 * @generated
	 */
	int ACTIVITY_REASON = 196;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityStatus <em>Care Plan Activity Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanActivityStatus()
	 * @generated
	 */
	int CARE_PLAN_ACTIVITY_STATUS = 197;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureDeviceActionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureDeviceActionCodes()
	 * @generated
	 */
	int PROCEDURE_DEVICE_ACTION_CODES = 198;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Laterality <em>Laterality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Laterality
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLaterality()
	 * @generated
	 */
	int LATERALITY = 199;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.KoStitle <em>Ko Stitle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.KoStitle
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getKoStitle()
	 * @generated
	 */
	int KO_STITLE = 200;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DigitalMediaType <em>Digital Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DigitalMediaType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDigitalMediaType()
	 * @generated
	 */
	int DIGITAL_MEDIA_TYPE = 201;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaSubType <em>Media Sub Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaSubType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMediaSubType()
	 * @generated
	 */
	int MEDIA_SUB_TYPE = 202;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaCollectionViewProjection <em>Media Collection View Projection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaCollectionViewProjection
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMediaCollectionViewProjection()
	 * @generated
	 */
	int MEDIA_COLLECTION_VIEW_PROJECTION = 203;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ManifestationAndSymptomCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getManifestationAndSymptomCodes()
	 * @generated
	 */
	int MANIFESTATION_AND_SYMPTOM_CODES = 204;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdmitSource <em>Admit Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdmitSource
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdmitSource()
	 * @generated
	 */
	int ADMIT_SOURCE = 205;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecialCourtesy <em>Special Courtesy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecialCourtesy
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecialCourtesy()
	 * @generated
	 */
	int SPECIAL_COURTESY = 206;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecialArrangements <em>Special Arrangements</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecialArrangements
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecialArrangements()
	 * @generated
	 */
	int SPECIAL_ARRANGEMENTS = 207;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DischargeDisposition <em>Discharge Disposition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DischargeDisposition
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDischargeDisposition()
	 * @generated
	 */
	int DISCHARGE_DISPOSITION = 208;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterLocationStatus <em>Encounter Location Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterLocationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterLocationStatus()
	 * @generated
	 */
	int ENCOUNTER_LOCATION_STATUS = 209;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemType <em>Naming System Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNamingSystemType()
	 * @generated
	 */
	int NAMING_SYSTEM_TYPE = 210;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemIdentifierType <em>Naming System Identifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemIdentifierType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNamingSystemIdentifierType()
	 * @generated
	 */
	int NAMING_SYSTEM_IDENTIFIER_TYPE = 211;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConceptMapEquivalence <em>Concept Map Equivalence</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConceptMapEquivalence
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConceptMapEquivalence()
	 * @generated
	 */
	int CONCEPT_MAP_EQUIVALENCE = 212;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagCategory <em>Flag Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFlagCategory()
	 * @generated
	 */
	int FLAG_CATEGORY = 213;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagStatus <em>Flag Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFlagStatus()
	 * @generated
	 */
	int FLAG_STATUS = 214;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagCode <em>Flag Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFlagCode()
	 * @generated
	 */
	int FLAG_CODE = 215;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SequenceType <em>Sequence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SequenceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 216;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DbSnp <em>Db Snp</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DbSnp
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDbSnp()
	 * @generated
	 */
	int DB_SNP = 217;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Ensembl <em>Ensembl</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Ensembl
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEnsembl()
	 * @generated
	 */
	int ENSEMBL = 218;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Loinc530345Answerlist <em>Loinc530345 Answerlist</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Loinc530345Answerlist
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLoinc530345Answerlist()
	 * @generated
	 */
	int LOINC530345_ANSWERLIST = 219;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTypeCodes <em>Contract Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractTypeCodes()
	 * @generated
	 */
	int CONTRACT_TYPE_CODES = 220;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractSubtypeCodes <em>Contract Subtype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractSubtypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractSubtypeCodes()
	 * @generated
	 */
	int CONTRACT_SUBTYPE_CODES = 221;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractActionCodes <em>Contract Action Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractActionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractActionCodes()
	 * @generated
	 */
	int CONTRACT_ACTION_CODES = 222;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PurposeOfUse <em>Purpose Of Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PurposeOfUse
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPurposeOfUse()
	 * @generated
	 */
	int PURPOSE_OF_USE = 223;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractActorRoleCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractActorRoleCodes()
	 * @generated
	 */
	int CONTRACT_ACTOR_ROLE_CODES = 224;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractSignerTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractSignerTypeCodes()
	 * @generated
	 */
	int CONTRACT_SIGNER_TYPE_CODES = 225;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTermTypeCodes <em>Contract Term Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTermTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractTermTypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_TYPE_CODES = 226;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTermSubTypeCodes <em>Contract Term Sub Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTermSubTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractTermSubTypeCodes()
	 * @generated
	 */
	int CONTRACT_TERM_SUB_TYPE_CODES = 227;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFhirDocumentTypeCodes()
	 * @generated
	 */
	int FHIR_DOCUMENT_TYPE_CODES = 228;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentClassCodes <em>Fhir Document Class Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentClassCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFhirDocumentClassCodes()
	 * @generated
	 */
	int FHIR_DOCUMENT_CLASS_CODES = 229;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemConfidentiality <em>V3 Code System Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemConfidentiality
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV3CodeSystemConfidentiality()
	 * @generated
	 */
	int V3_CODE_SYSTEM_CONFIDENTIALITY = 230;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CompositionAttestationMode <em>Composition Attestation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CompositionAttestationMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCompositionAttestationMode()
	 * @generated
	 */
	int COMPOSITION_ATTESTATION_MODE = 231;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentSectionCodes <em>Document Section Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentSectionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentSectionCodes()
	 * @generated
	 */
	int DOCUMENT_SECTION_CODES = 232;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListMode <em>List Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getListMode()
	 * @generated
	 */
	int LIST_MODE = 233;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListOrderCodes <em>List Order Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListOrderCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getListOrderCodes()
	 * @generated
	 */
	int LIST_ORDER_CODES = 234;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListEmptyReasons <em>List Empty Reasons</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListEmptyReasons
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getListEmptyReasons()
	 * @generated
	 */
	int LIST_EMPTY_REASONS = 235;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RemittanceOutcome <em>Remittance Outcome</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RemittanceOutcome
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRemittanceOutcome()
	 * @generated
	 */
	int REMITTANCE_OUTCOME = 236;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentTypeCodes <em>Payment Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPaymentTypeCodes()
	 * @generated
	 */
	int PAYMENT_TYPE_CODES = 237;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FormCodes <em>Form Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FormCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFormCodes()
	 * @generated
	 */
	int FORM_CODES = 238;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NoteType <em>Note Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NoteType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNoteType()
	 * @generated
	 */
	int NOTE_TYPE = 239;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceStatementKind <em>Conformance Statement Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceStatementKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConformanceStatementKind()
	 * @generated
	 */
	int CONFORMANCE_STATEMENT_KIND = 240;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnknownContentCode <em>Unknown Content Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnknownContentCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUnknownContentCode()
	 * @generated
	 */
	int UNKNOWN_CONTENT_CODE = 241;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RestfulConformanceMode <em>Restful Conformance Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RestfulConformanceMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRestfulConformanceMode()
	 * @generated
	 */
	int RESTFUL_CONFORMANCE_MODE = 242;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RestfulSecurityService <em>Restful Security Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RestfulSecurityService
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRestfulSecurityService()
	 * @generated
	 */
	int RESTFUL_SECURITY_SERVICE = 243;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TypeRestfulInteraction <em>Type Restful Interaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TypeRestfulInteraction
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTypeRestfulInteraction()
	 * @generated
	 */
	int TYPE_RESTFUL_INTERACTION = 244;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResourceVersionPolicy <em>Resource Version Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResourceVersionPolicy
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getResourceVersionPolicy()
	 * @generated
	 */
	int RESOURCE_VERSION_POLICY = 245;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionalDeleteStatus <em>Conditional Delete Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionalDeleteStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionalDeleteStatus()
	 * @generated
	 */
	int CONDITIONAL_DELETE_STATUS = 246;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchParamType <em>Search Param Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchParamType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSearchParamType()
	 * @generated
	 */
	int SEARCH_PARAM_TYPE = 247;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchModifierCode <em>Search Modifier Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchModifierCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSearchModifierCode()
	 * @generated
	 */
	int SEARCH_MODIFIER_CODE = 248;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SystemRestfulInteraction <em>System Restful Interaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SystemRestfulInteraction
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSystemRestfulInteraction()
	 * @generated
	 */
	int SYSTEM_RESTFUL_INTERACTION = 249;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TransactionMode <em>Transaction Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TransactionMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTransactionMode()
	 * @generated
	 */
	int TRANSACTION_MODE = 250;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationKind <em>Operation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOperationKind()
	 * @generated
	 */
	int OPERATION_KIND = 251;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageTransport <em>Message Transport</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageTransport
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMessageTransport()
	 * @generated
	 */
	int MESSAGE_TRANSPORT = 252;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageEvent <em>Message Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageEvent
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 253;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageSignificanceCategory <em>Message Significance Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageSignificanceCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMessageSignificanceCategory()
	 * @generated
	 */
	int MESSAGE_SIGNIFICANCE_CATEGORY = 254;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceEventMode <em>Conformance Event Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceEventMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConformanceEventMode()
	 * @generated
	 */
	int CONFORMANCE_EVENT_MODE = 255;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentMode <em>Document Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentMode()
	 * @generated
	 */
	int DOCUMENT_MODE = 256;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProfileOriginType <em>Profile Origin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProfileOriginType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProfileOriginType()
	 * @generated
	 */
	int PROFILE_ORIGIN_TYPE = 257;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProfileDestinationType <em>Profile Destination Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProfileDestinationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProfileDestinationType()
	 * @generated
	 */
	int PROFILE_DESTINATION_TYPE = 258;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TestScriptOperationCodes <em>Test Script Operation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TestScriptOperationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTestScriptOperationCodes()
	 * @generated
	 */
	int TEST_SCRIPT_OPERATION_CODES = 259;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContentType <em>Content Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContentType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 260;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionDirectionType <em>Assertion Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionDirectionType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAssertionDirectionType()
	 * @generated
	 */
	int ASSERTION_DIRECTION_TYPE = 261;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionOperatorType <em>Assertion Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionOperatorType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAssertionOperatorType()
	 * @generated
	 */
	int ASSERTION_OPERATOR_TYPE = 262;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionResponseTypes <em>Assertion Response Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionResponseTypes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAssertionResponseTypes()
	 * @generated
	 */
	int ASSERTION_RESPONSE_TYPES = 263;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DataElementStringency <em>Data Element Stringency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DataElementStringency
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDataElementStringency()
	 * @generated
	 */
	int DATA_ELEMENT_STRINGENCY = 264;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleTriggerType <em>Decision Support Rule Trigger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleTriggerType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDecisionSupportRuleTriggerType()
	 * @generated
	 */
	int DECISION_SUPPORT_RULE_TRIGGER_TYPE = 265;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleParticipantType <em>Decision Support Rule Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleParticipantType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDecisionSupportRuleParticipantType()
	 * @generated
	 */
	int DECISION_SUPPORT_RULE_PARTICIPANT_TYPE = 266;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleActionType <em>Decision Support Rule Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleActionType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDecisionSupportRuleActionType()
	 * @generated
	 */
	int DECISION_SUPPORT_RULE_ACTION_TYPE = 267;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResponseType <em>Response Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResponseType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getResponseType()
	 * @generated
	 */
	int RESPONSE_TYPE = 268;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IssueSeverity <em>Issue Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IssueSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIssueSeverity()
	 * @generated
	 */
	int ISSUE_SEVERITY = 269;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IssueType <em>Issue Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IssueType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIssueType()
	 * @generated
	 */
	int ISSUE_TYPE = 270;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationOutcomeCodes <em>Operation Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationOutcomeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOperationOutcomeCodes()
	 * @generated
	 */
	int OPERATION_OUTCOME_CODES = 271;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleMessageReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExampleMessageReasonCodes()
	 * @generated
	 */
	int EXAMPLE_MESSAGE_REASON_CODES = 272;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionStatus <em>Subscription Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubscriptionStatus()
	 * @generated
	 */
	int SUBSCRIPTION_STATUS = 273;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionChannelType <em>Subscription Channel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionChannelType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubscriptionChannelType()
	 * @generated
	 */
	int SUBSCRIPTION_CHANNEL_TYPE = 274;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionTag <em>Subscription Tag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionTag
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubscriptionTag()
	 * @generated
	 */
	int SUBSCRIPTION_TAG = 275;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActCoverageTypeCode <em>Act Coverage Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActCoverageTypeCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActCoverageTypeCode()
	 * @generated
	 */
	int ACT_COVERAGE_TYPE_CODE = 276;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RelationshipCodes <em>Relationship Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RelationshipCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRelationshipCodes()
	 * @generated
	 */
	int RELATIONSHIP_CODES = 277;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccineAdministeredValueSet
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVaccineAdministeredValueSet()
	 * @generated
	 */
	int VACCINE_ADMINISTERED_VALUE_SET = 278;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationRecommendationStatusCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_STATUS_CODES = 279;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationDateCriterionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationRecommendationDateCriterionCodes()
	 * @generated
	 */
	int IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES = 280;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationAdministrationStatus <em>Medication Administration Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationAdministrationStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationAdministrationStatus()
	 * @generated
	 */
	int MEDICATION_ADMINISTRATION_STATUS = 281;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CodesForImmunizationSiteOfAdministration
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCodesForImmunizationSiteOfAdministration()
	 * @generated
	 */
	int CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION = 282;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRouteCodes <em>Immunization Route Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRouteCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationRouteCodes()
	 * @generated
	 */
	int IMMUNIZATION_ROUTE_CODES = 283;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationReasonCodes()
	 * @generated
	 */
	int IMMUNIZATION_REASON_CODES = 284;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonsForNotImmunizingCodes <em>Immunization Reasons For Not Immunizing Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonsForNotImmunizingCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationReasonsForNotImmunizingCodes()
	 * @generated
	 */
	int IMMUNIZATION_REASONS_FOR_NOT_IMMUNIZING_CODES = 285;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseTargetCodes <em>Vaccination Protocol Dose Target Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseTargetCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVaccinationProtocolDoseTargetCodes()
	 * @generated
	 */
	int VACCINATION_PROTOCOL_DOSE_TARGET_CODES = 286;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusCodes <em>Vaccination Protocol Dose Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVaccinationProtocolDoseStatusCodes()
	 * @generated
	 */
	int VACCINATION_PROTOCOL_DOSE_STATUS_CODES = 287;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusReasonCodes <em>Vaccination Protocol Dose Status Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVaccinationProtocolDoseStatusReasonCodes()
	 * @generated
	 */
	int VACCINATION_PROTOCOL_DOSE_STATUS_REASON_CODES = 288;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BundleType <em>Bundle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BundleType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBundleType()
	 * @generated
	 */
	int BUNDLE_TYPE = 289;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchEntryMode <em>Search Entry Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchEntryMode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSearchEntryMode()
	 * @generated
	 */
	int SEARCH_ENTRY_MODE = 290;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.HttpVerb <em>Http Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.HttpVerb
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getHttpVerb()
	 * @generated
	 */
	int HTTP_VERB = 291;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PriorityCodes <em>Priority Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PriorityCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPriorityCodes()
	 * @generated
	 */
	int PRIORITY_CODES = 292;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitCategoryCodes <em>Benefit Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBenefitCategoryCodes()
	 * @generated
	 */
	int BENEFIT_CATEGORY_CODES = 293;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitSubCategoryCodes <em>Benefit Sub Category Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitSubCategoryCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBenefitSubCategoryCodes()
	 * @generated
	 */
	int BENEFIT_SUB_CATEGORY_CODES = 294;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NetworkTypeCodes <em>Network Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NetworkTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNetworkTypeCodes()
	 * @generated
	 */
	int NETWORK_TYPE_CODES = 295;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnitTypeCodes <em>Unit Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnitTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUnitTypeCodes()
	 * @generated
	 */
	int UNIT_TYPE_CODES = 296;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitTermCodes <em>Benefit Term Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitTermCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBenefitTermCodes()
	 * @generated
	 */
	int BENEFIT_TERM_CODES = 297;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitTypeCodes <em>Benefit Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBenefitTypeCodes()
	 * @generated
	 */
	int BENEFIT_TYPE_CODES = 298;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationErrorCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdjudicationErrorCodes()
	 * @generated
	 */
	int ADJUDICATION_ERROR_CODES = 299;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationDispenseStatus <em>Medication Dispense Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationDispenseStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationDispenseStatus()
	 * @generated
	 */
	int MEDICATION_DISPENSE_STATUS = 300;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActPharmacySupplyType <em>Act Pharmacy Supply Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActPharmacySupplyType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActPharmacySupplyType()
	 * @generated
	 */
	int ACT_PHARMACY_SUPPLY_TYPE = 301;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ClaimType <em>Claim Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ClaimType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getClaimType()
	 * @generated
	 */
	int CLAIM_TYPE = 302;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Use <em>Use</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Use
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUse()
	 * @generated
	 */
	int USE = 303;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FundsReservationCodes <em>Funds Reservation Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FundsReservationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFundsReservationCodes()
	 * @generated
	 */
	int FUNDS_RESERVATION_CODES = 304;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PayeeTypeCodes <em>Payee Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PayeeTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPayeeTypeCodes()
	 * @generated
	 */
	int PAYEE_TYPE_CODES = 305;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IcD10Codes <em>Ic D10 Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IcD10Codes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIcD10Codes()
	 * @generated
	 */
	int IC_D10_CODES = 306;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionsCodes <em>Conditions Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionsCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionsCodes()
	 * @generated
	 */
	int CONDITIONS_CODES = 307;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExceptionCodes <em>Exception Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExceptionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExceptionCodes()
	 * @generated
	 */
	int EXCEPTION_CODES = 308;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActIncidentCode <em>Act Incident Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActIncidentCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActIncidentCode()
	 * @generated
	 */
	int ACT_INCIDENT_CODE = 309;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.InterventionCodes <em>Intervention Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.InterventionCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getInterventionCodes()
	 * @generated
	 */
	int INTERVENTION_CODES = 310;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActInvoiceGroupCode <em>Act Invoice Group Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActInvoiceGroupCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActInvoiceGroupCode()
	 * @generated
	 */
	int ACT_INVOICE_GROUP_CODE = 311;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UsclsCodes <em>Uscls Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UsclsCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUsclsCodes()
	 * @generated
	 */
	int USCLS_CODES = 312;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleServicePlaceCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExampleServicePlaceCodes()
	 * @generated
	 */
	int EXAMPLE_SERVICE_PLACE_CODES = 313;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UdiCodes <em>Udi Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UdiCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUdiCodes()
	 * @generated
	 */
	int UDI_CODES = 314;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ToothCodes <em>Tooth Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ToothCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getToothCodes()
	 * @generated
	 */
	int TOOTH_CODES = 315;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SurfaceCodes <em>Surface Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SurfaceCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSurfaceCodes()
	 * @generated
	 */
	int SURFACE_CODES = 316;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModifierTypeCodes <em>Modifier Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModifierTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModifierTypeCodes()
	 * @generated
	 */
	int MODIFIER_TYPE_CODES = 317;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OralProsthoMaterialTypeCodes <em>Oral Prostho Material Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OralProsthoMaterialTypeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOralProsthoMaterialTypeCodes()
	 * @generated
	 */
	int ORAL_PROSTHO_MATERIAL_TYPE_CODES = 318;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdditionalMaterialCodes <em>Additional Material Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdditionalMaterialCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdditionalMaterialCodes()
	 * @generated
	 */
	int ADDITIONAL_MATERIAL_CODES = 319;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TeethCodes <em>Teeth Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TeethCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTeethCodes()
	 * @generated
	 */
	int TEETH_CODES = 320;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MissingToothReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMissingToothReasonCodes()
	 * @generated
	 */
	int MISSING_TOOTH_REASON_CODES = 321;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationCodes <em>Adjudication Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdjudicationCodes()
	 * @generated
	 */
	int ADJUDICATION_CODES = 322;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentAdjustmentReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPaymentAdjustmentReasonCodes()
	 * @generated
	 */
	int PAYMENT_ADJUSTMENT_REASON_CODES = 323;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationReasonCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdjudicationReasonCodes()
	 * @generated
	 */
	int ADJUDICATION_REASON_CODES = 324;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuideDependencyType <em>Guide Dependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuideDependencyType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuideDependencyType()
	 * @generated
	 */
	int GUIDE_DEPENDENCY_TYPE = 325;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuideResourcePurpose <em>Guide Resource Purpose</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuideResourcePurpose
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuideResourcePurpose()
	 * @generated
	 */
	int GUIDE_RESOURCE_PURPOSE = 326;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidePageKind <em>Guide Page Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidePageKind
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuidePageKind()
	 * @generated
	 */
	int GUIDE_PAGE_KIND = 327;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.XPathUsageType <em>XPath Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.XPathUsageType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getXPathUsageType()
	 * @generated
	 */
	int XPATH_USAGE_TYPE = 328;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetParticipantType <em>Order Set Participant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetParticipantType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetParticipantType()
	 * @generated
	 */
	int ORDER_SET_PARTICIPANT_TYPE = 329;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemType <em>Order Set Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemType()
	 * @generated
	 */
	int ORDER_SET_ITEM_TYPE = 330;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemGroupingBehavior <em>Order Set Item Grouping Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemGroupingBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemGroupingBehavior()
	 * @generated
	 */
	int ORDER_SET_ITEM_GROUPING_BEHAVIOR = 331;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemSelectionBehavior <em>Order Set Item Selection Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemSelectionBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemSelectionBehavior()
	 * @generated
	 */
	int ORDER_SET_ITEM_SELECTION_BEHAVIOR = 332;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemRequiredBehavior <em>Order Set Item Required Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemRequiredBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemRequiredBehavior()
	 * @generated
	 */
	int ORDER_SET_ITEM_REQUIRED_BEHAVIOR = 333;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemPrecheckBehavior <em>Order Set Item Precheck Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemPrecheckBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemPrecheckBehavior()
	 * @generated
	 */
	int ORDER_SET_ITEM_PRECHECK_BEHAVIOR = 334;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemCardinalityBehavior <em>Order Set Item Cardinality Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemCardinalityBehavior
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemCardinalityBehavior()
	 * @generated
	 */
	int ORDER_SET_ITEM_CARDINALITY_BEHAVIOR = 335;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEventCurrentState <em>Provenance Event Current State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEventCurrentState
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProvenanceEventCurrentState()
	 * @generated
	 */
	int PROVENANCE_EVENT_CURRENT_STATE = 336;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceParticipantRole <em>Provenance Participant Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceParticipantRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProvenanceParticipantRole()
	 * @generated
	 */
	int PROVENANCE_PARTICIPANT_ROLE = 337;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemRoleLinkType <em>V3 Code System Role Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemRoleLinkType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV3CodeSystemRoleLinkType()
	 * @generated
	 */
	int V3_CODE_SYSTEM_ROLE_LINK_TYPE = 338;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEntityRole <em>Provenance Entity Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEntityRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProvenanceEntityRole()
	 * @generated
	 */
	int PROVENANCE_ENTITY_ROLE = 339;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcessOutcomeCodes <em>Process Outcome Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcessOutcomeCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcessOutcomeCodes()
	 * @generated
	 */
	int PROCESS_OUTCOME_CODES = 340;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MeasurePopulationType <em>Measure Population Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MeasurePopulationType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMeasurePopulationType()
	 * @generated
	 */
	int MEASURE_POPULATION_TYPE = 341;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentStatusCodes <em>Payment Status Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentStatusCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPaymentStatusCodes()
	 * @generated
	 */
	int PAYMENT_STATUS_CODES = 342;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleUseCodesForList <em>Example Use Codes For List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleUseCodesForList
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExampleUseCodesForList()
	 * @generated
	 */
	int EXAMPLE_USE_CODES_FOR_LIST = 343;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListStatus <em>List Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getListStatus()
	 * @generated
	 */
	int LIST_STATUS = 344;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientMedicineChangeTypes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPatientMedicineChangeTypes()
	 * @generated
	 */
	int PATIENT_MEDICINE_CHANGE_TYPES = 345;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseStatus <em>Guidance Response Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuidanceResponseStatus()
	 * @generated
	 */
	int GUIDANCE_RESPONSE_STATUS = 346;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseActionType <em>Guidance Response Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseActionType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuidanceResponseActionType()
	 * @generated
	 */
	int GUIDANCE_RESPONSE_ACTION_TYPE = 347;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueCategory <em>Detected Issue Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueCategory
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDetectedIssueCategory()
	 * @generated
	 */
	int DETECTED_ISSUE_CATEGORY = 348;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueSeverity <em>Detected Issue Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueSeverity
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDetectedIssueSeverity()
	 * @generated
	 */
	int DETECTED_ISSUE_SEVERITY = 349;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueMitigationAction
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDetectedIssueMitigationAction()
	 * @generated
	 */
	int DETECTED_ISSUE_MITIGATION_ACTION = 350;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AccountStatus <em>Account Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AccountStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAccountStatus()
	 * @generated
	 */
	int ACCOUNT_STATUS = 351;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationGivenCodes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getReasonMedicationGivenCodes()
	 * @generated
	 */
	int REASON_MEDICATION_GIVEN_CODES = 352;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantStatus <em>Participant Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipantStatus()
	 * @generated
	 */
	int PARTICIPANT_STATUS = 353;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventId <em>Audit Event Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventId
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventId()
	 * @generated
	 */
	int AUDIT_EVENT_ID = 354;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSubType <em>Audit Event Sub Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSubType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventSubType()
	 * @generated
	 */
	int AUDIT_EVENT_SUB_TYPE = 355;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventAction <em>Audit Event Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventAction
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventAction()
	 * @generated
	 */
	int AUDIT_EVENT_ACTION = 356;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventOutcome <em>Audit Event Outcome</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventOutcome
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventOutcome()
	 * @generated
	 */
	int AUDIT_EVENT_OUTCOME = 357;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditActiveParticipantRoleIdCode <em>Audit Active Participant Role Id Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditActiveParticipantRoleIdCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditActiveParticipantRoleIdCode()
	 * @generated
	 */
	int AUDIT_ACTIVE_PARTICIPANT_ROLE_ID_CODE = 358;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaTypeCode <em>Media Type Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaTypeCode
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMediaTypeCode()
	 * @generated
	 */
	int MEDIA_TYPE_CODE = 359;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventParticipantNetworkType <em>Audit Event Participant Network Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventParticipantNetworkType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventParticipantNetworkType()
	 * @generated
	 */
	int AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE = 360;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSourceType <em>Audit Event Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSourceType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventSourceType()
	 * @generated
	 */
	int AUDIT_EVENT_SOURCE_TYPE = 361;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectType <em>Audit Event Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventObjectType()
	 * @generated
	 */
	int AUDIT_EVENT_OBJECT_TYPE = 362;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectRole <em>Audit Event Object Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectRole
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventObjectRole()
	 * @generated
	 */
	int AUDIT_EVENT_OBJECT_ROLE = 363;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectLifecycle <em>Audit Event Object Lifecycle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectLifecycle
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventObjectLifecycle()
	 * @generated
	 */
	int AUDIT_EVENT_OBJECT_LIFECYCLE = 364;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BasicResourceTypes <em>Basic Resource Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BasicResourceTypes
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBasicResourceTypes()
	 * @generated
	 */
	int BASIC_RESOURCE_TYPES = 365;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderStatus <em>Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderStatus()
	 * @generated
	 */
	int ORDER_STATUS = 366;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyDeliveryStatus <em>Supply Delivery Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyDeliveryStatus
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyDeliveryStatus()
	 * @generated
	 */
	int SUPPLY_DELIVERY_STATUS = 367;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyItemType <em>Supply Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyItemType
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyItemType()
	 * @generated
	 */
	int SUPPLY_ITEM_TYPE = 368;


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
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllSecurityLabels <em>All Security Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All Security Labels</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllSecurityLabels
	 * @generated
	 */
	EEnum getAllSecurityLabels();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.NarrativeStatus <em>Narrative Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Narrative Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NarrativeStatus
	 * @generated
	 */
	EEnum getNarrativeStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentifierUse <em>Identifier Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentifierUse
	 * @generated
	 */
	EEnum getIdentifierUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentifierTypeCodes <em>Identifier Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentifierTypeCodes
	 * @generated
	 */
	EEnum getIdentifierTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Organization Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrganizationType
	 * @generated
	 */
	EEnum getOrganizationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactPointSystem <em>Contact Point System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Point System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactPointSystem
	 * @generated
	 */
	EEnum getContactPointSystem();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactPointUse <em>Contact Point Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Point Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactPointUse
	 * @generated
	 */
	EEnum getContactPointUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AddressUse <em>Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AddressUse
	 * @generated
	 */
	EEnum getAddressUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Address Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AddressType
	 * @generated
	 */
	EEnum getAddressType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactEntityType <em>Contact Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Entity Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactEntityType
	 * @generated
	 */
	EEnum getContactEntityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.NameUse <em>Name Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NameUse
	 * @generated
	 */
	EEnum getNameUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdministrativeGender <em>Administrative Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Administrative Gender</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdministrativeGender
	 * @generated
	 */
	EEnum getAdministrativeGender();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PractitionerRole <em>Practitioner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practitioner Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PractitionerRole
	 * @generated
	 */
	EEnum getPractitionerRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PractitionerSpecialty <em>Practitioner Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practitioner Specialty</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PractitionerSpecialty
	 * @generated
	 */
	EEnum getPractitionerSpecialty();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationStatus <em>Location Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationStatus
	 * @generated
	 */
	EEnum getLocationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationMode <em>Location Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationMode
	 * @generated
	 */
	EEnum getLocationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ServiceDeliveryLocationRoleType <em>Service Delivery Location Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Delivery Location Role Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ServiceDeliveryLocationRoleType
	 * @generated
	 */
	EEnum getServiceDeliveryLocationRoleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationType
	 * @generated
	 */
	EEnum getLocationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Practice Setting Code Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PracticeSettingCodeValueSet
	 * @generated
	 */
	EEnum getPracticeSettingCodeValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ServiceProvisionConditions <em>Service Provision Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Provision Conditions</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ServiceProvisionConditions
	 * @generated
	 */
	EEnum getServiceProvisionConditions();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReferralMethod <em>Referral Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referral Method</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReferralMethod
	 * @generated
	 */
	EEnum getReferralMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DaysOfWeek <em>Days Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Days Of Week</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DaysOfWeek
	 * @generated
	 */
	EEnum getDaysOfWeek();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 <em>Anzsco Australian And New Zealand Standard Classification Of Occupations2013 Version12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anzsco Australian And New Zealand Standard Classification Of Occupations2013 Version12</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12
	 * @generated
	 */
	EEnum getAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MaritalStatusCodes <em>Marital Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Marital Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MaritalStatusCodes
	 * @generated
	 */
	EEnum getMaritalStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientContactRelationship <em>Patient Contact Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Contact Relationship</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientContactRelationship
	 * @generated
	 */
	EEnum getPatientContactRelationship();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnimalSpecies <em>Animal Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Animal Species</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnimalSpecies
	 * @generated
	 */
	EEnum getAnimalSpecies();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnimalBreeds <em>Animal Breeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Animal Breeds</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnimalBreeds
	 * @generated
	 */
	EEnum getAnimalBreeds();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GenderStatus <em>Gender Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GenderStatus
	 * @generated
	 */
	EEnum getGenderStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LinkType
	 * @generated
	 */
	EEnum getLinkType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientRelationshipType <em>Patient Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Relationship Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientRelationshipType
	 * @generated
	 */
	EEnum getPatientRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuantityComparator <em>Quantity Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantity Comparator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuantityComparator
	 * @generated
	 */
	EEnum getQuantityComparator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SignatureTypeCodes <em>Signature Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signature Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SignatureTypeCodes
	 * @generated
	 */
	EEnum getSignatureTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceStatus <em>Device Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceStatus
	 * @generated
	 */
	EEnum getDeviceStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnitsOfTime <em>Units Of Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Of Time</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnitsOfTime
	 * @generated
	 */
	EEnum getUnitsOfTime();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EventTiming <em>Event Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Timing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EventTiming
	 * @generated
	 */
	EEnum getEventTiming();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.TimingAbbreviation <em>Timing Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Abbreviation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TimingAbbreviation
	 * @generated
	 */
	EEnum getTimingAbbreviation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataType <em>Module Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Metadata Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataType
	 * @generated
	 */
	EEnum getModuleMetadataType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataStatus <em>Module Metadata Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Metadata Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataStatus
	 * @generated
	 */
	EEnum getModuleMetadataStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataFocusType <em>Module Metadata Focus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Metadata Focus Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataFocusType
	 * @generated
	 */
	EEnum getModuleMetadataFocusType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataContributorType <em>Module Metadata Contributor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Metadata Contributor Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataContributorType
	 * @generated
	 */
	EEnum getModuleMetadataContributorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentityAssuranceLevel <em>Identity Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identity Assurance Level</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentityAssuranceLevel
	 * @generated
	 */
	EEnum getIdentityAssuranceLevel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataResourceType <em>Module Metadata Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Metadata Resource Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataResourceType
	 * @generated
	 */
	EEnum getModuleMetadataResourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationParameterUse <em>Operation Parameter Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Parameter Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationParameterUse
	 * @generated
	 */
	EEnum getOperationParameterUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParameterTypesUsedInOperationDefinitions <em>Parameter Types Used In Operation Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Types Used In Operation Definitions</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParameterTypesUsedInOperationDefinitions
	 * @generated
	 */
	EEnum getParameterTypesUsedInOperationDefinitions();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceResourceStatus <em>Conformance Resource Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conformance Resource Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceResourceStatus
	 * @generated
	 */
	EEnum getConformanceResourceStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContextOfUseValueSet <em>Context Of Use Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Of Use Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContextOfUseValueSet
	 * @generated
	 */
	EEnum getContextOfUseValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionCodes <em>Structure Definition Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Definition Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionCodes
	 * @generated
	 */
	EEnum getStructureDefinitionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionKind <em>Structure Definition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Definition Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionKind
	 * @generated
	 */
	EEnum getStructureDefinitionKind();

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
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExtensionContext <em>Extension Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Extension Context</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExtensionContext
	 * @generated
	 */
	EEnum getExtensionContext();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PropertyRepresentation <em>Property Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Representation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PropertyRepresentation
	 * @generated
	 */
	EEnum getPropertyRepresentation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincCodes <em>Loinc Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincCodes
	 * @generated
	 */
	EEnum getLoincCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SlicingRules <em>Slicing Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slicing Rules</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SlicingRules
	 * @generated
	 */
	EEnum getSlicingRules();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AggregationMode <em>Aggregation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AggregationMode
	 * @generated
	 */
	EEnum getAggregationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConstraintSeverity <em>Constraint Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConstraintSeverity
	 * @generated
	 */
	EEnum getConstraintSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.BindingStrength <em>Binding Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Strength</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BindingStrength
	 * @generated
	 */
	EEnum getBindingStrength();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DesignationUse <em>Designation Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Designation Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DesignationUse
	 * @generated
	 */
	EEnum getDesignationUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FilterOperator <em>Filter Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Operator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FilterOperator
	 * @generated
	 */
	EEnum getFilterOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GroupType
	 * @generated
	 */
	EEnum getGroupType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtMedicationCodes <em>Snomed Ct Medication Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Medication Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtMedicationCodes
	 * @generated
	 */
	EEnum getSnomedCtMedicationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationFormCodes <em>Medication Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Form Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationFormCodes
	 * @generated
	 */
	EEnum getMedicationFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCategoryCodes <em>Substance Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCategoryCodes
	 * @generated
	 */
	EEnum getSubstanceCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCode <em>Substance Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCode
	 * @generated
	 */
	EEnum getSubstanceCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Form Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtFormCodes
	 * @generated
	 */
	EEnum getSnomedCtFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemParticipationMode <em>V3 Code System Participation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Participation Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemParticipationMode
	 * @generated
	 */
	EEnum getV3CodeSystemParticipationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CommunicationStatus <em>Communication Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CommunicationStatus
	 * @generated
	 */
	EEnum getCommunicationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterState <em>Encounter State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter State</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterState
	 * @generated
	 */
	EEnum getEncounterState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterClass <em>Encounter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Class</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterClass
	 * @generated
	 */
	EEnum getEncounterClass();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterType <em>Encounter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterType
	 * @generated
	 */
	EEnum getEncounterType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterPriority <em>Encounter Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterPriority
	 * @generated
	 */
	EEnum getEncounterPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EpisodeOfCareStatus <em>Episode Of Care Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Episode Of Care Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EpisodeOfCareStatus
	 * @generated
	 */
	EEnum getEpisodeOfCareStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Problem Diagnosis Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionProblemDiagnosisCodes
	 * @generated
	 */
	EEnum getConditionProblemDiagnosisCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionCategoryCodes <em>Condition Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionCategoryCodes
	 * @generated
	 */
	EEnum getConditionCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionClinicalStatusCodes <em>Condition Clinical Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Clinical Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionClinicalStatusCodes
	 * @generated
	 */
	EEnum getConditionClinicalStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionVerificationStatus <em>Condition Verification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Verification Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionVerificationStatus
	 * @generated
	 */
	EEnum getConditionVerificationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Diagnosis Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionDiagnosisSeverity
	 * @generated
	 */
	EEnum getConditionDiagnosisSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionStage <em>Condition Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Stage</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionStage
	 * @generated
	 */
	EEnum getConditionStage();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ClinicalImpressionStatus <em>Clinical Impression Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clinical Impression Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ClinicalImpressionStatus
	 * @generated
	 */
	EEnum getClinicalImpressionStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSubstanceAndNegationCodes <em>Allergy Intolerance Substance And Negation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Substance And Negation Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSubstanceAndNegationCodes
	 * @generated
	 */
	EEnum getAllergyIntoleranceSubstanceAndNegationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceStatus <em>Allergy Intolerance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceStatus
	 * @generated
	 */
	EEnum getAllergyIntoleranceStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCriticality <em>Allergy Intolerance Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Criticality</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCriticality
	 * @generated
	 */
	EEnum getAllergyIntoleranceCriticality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceType <em>Allergy Intolerance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceType
	 * @generated
	 */
	EEnum getAllergyIntoleranceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCategory <em>Allergy Intolerance Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCategory
	 * @generated
	 */
	EEnum getAllergyIntoleranceCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCertainty <em>Allergy Intolerance Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Certainty</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCertainty
	 * @generated
	 */
	EEnum getAllergyIntoleranceCertainty();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtManifestationCodes <em>Snomed Ct Manifestation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Manifestation Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtManifestationCodes
	 * @generated
	 */
	EEnum getSnomedCtManifestationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSeverity <em>Allergy Intolerance Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allergy Intolerance Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSeverity
	 * @generated
	 */
	EEnum getAllergyIntoleranceSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtRouteCodes <em>Snomed Ct Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Route Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtRouteCodes
	 * @generated
	 */
	EEnum getSnomedCtRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Clinical Findings</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtClinicalFindings
	 * @generated
	 */
	EEnum getSnomedCtClinicalFindings();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.InvestigationType <em>Investigation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Investigation Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.InvestigationType
	 * @generated
	 */
	EEnum getInvestigationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationStatus <em>Observation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationStatus
	 * @generated
	 */
	EEnum getObservationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationCategoryCodes <em>Observation Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationCategoryCodes
	 * @generated
	 */
	EEnum getObservationCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationValueAbsentReason <em>Observation Value Absent Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Value Absent Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationValueAbsentReason
	 * @generated
	 */
	EEnum getObservationValueAbsentReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Interpretation Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationInterpretationCodes
	 * @generated
	 */
	EEnum getObservationInterpretationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtBodyStructures <em>Snomed Ct Body Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Body Structures</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtBodyStructures
	 * @generated
	 */
	EEnum getSnomedCtBodyStructures();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationMethods <em>Observation Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Methods</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationMethods
	 * @generated
	 */
	EEnum getObservationMethods();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenStatus <em>Specimen Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenStatus
	 * @generated
	 */
	EEnum getSpecimenStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.V2SpecimenType <em>V2 Specimen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2 Specimen Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V2SpecimenType
	 * @generated
	 */
	EEnum getV2SpecimenType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenCollectionMethod <em>Specimen Collection Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Collection Method</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenCollectionMethod
	 * @generated
	 */
	EEnum getSpecimenCollectionMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenTreatmentProcedure <em>Specimen Treatment Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Treatment Procedure</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenTreatmentProcedure
	 * @generated
	 */
	EEnum getSpecimenTreatmentProcedure();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenContainer <em>Specimen Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specimen Container</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenContainer
	 * @generated
	 */
	EEnum getSpecimenContainer();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.V2AdditivePreservative <em>V2 Additive Preservative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V2 Additive Preservative</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V2AdditivePreservative
	 * @generated
	 */
	EEnum getV2AdditivePreservative();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MeasmntPrinciple <em>Measmnt Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measmnt Principle</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MeasmntPrinciple
	 * @generated
	 */
	EEnum getMeasmntPrinciple();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricOperationalStatus <em>Device Metric Operational Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Operational Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricOperationalStatus
	 * @generated
	 */
	EEnum getDeviceMetricOperationalStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricColor <em>Device Metric Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Color</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricColor
	 * @generated
	 */
	EEnum getDeviceMetricColor();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCategory <em>Device Metric Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCategory
	 * @generated
	 */
	EEnum getDeviceMetricCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationType <em>Device Metric Calibration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Calibration Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationType
	 * @generated
	 */
	EEnum getDeviceMetricCalibrationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationState <em>Device Metric Calibration State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Metric Calibration State</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationState
	 * @generated
	 */
	EEnum getDeviceMetricCalibrationState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Reference Range Meaning Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationReferenceRangeMeaningCodes
	 * @generated
	 */
	EEnum getObservationReferenceRangeMeaningCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationRelationshipType <em>Observation Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Observation Relationship Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationRelationshipType
	 * @generated
	 */
	EEnum getObservationRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireStatus <em>Questionnaire Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireStatus
	 * @generated
	 */
	EEnum getQuestionnaireStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Question Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireQuestionCodes
	 * @generated
	 */
	EEnum getQuestionnaireQuestionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireItemType <em>Questionnaire Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Item Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireItemType
	 * @generated
	 */
	EEnum getQuestionnaireItemType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Answer Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireAnswerCodes
	 * @generated
	 */
	EEnum getQuestionnaireAnswerCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireResponseStatus <em>Questionnaire Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Questionnaire Response Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireResponseStatus
	 * @generated
	 */
	EEnum getQuestionnaireResponseStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FamilyHistoryStatus <em>Family History Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Family History Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FamilyHistoryStatus
	 * @generated
	 */
	EEnum getFamilyHistoryStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FamilyMember <em>Family Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Family Member</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FamilyMember
	 * @generated
	 */
	EEnum getFamilyMember();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Outcome Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionOutcomeCodes
	 * @generated
	 */
	EEnum getConditionOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticReportStatus <em>Diagnostic Report Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Report Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticReportStatus
	 * @generated
	 */
	EEnum getDiagnosticReportStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Service Section Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticServiceSectionCodes
	 * @generated
	 */
	EEnum getDiagnosticServiceSectionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Diagnostic Report Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticReportCodes
	 * @generated
	 */
	EEnum getLoincDiagnosticReportCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentTypeValueSet <em>Document Type Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentTypeValueSet
	 * @generated
	 */
	EEnum getDocumentTypeValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentClassValueSet <em>Document Class Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Class Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentClassValueSet
	 * @generated
	 */
	EEnum getDocumentClassValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceStatus <em>Document Reference Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Reference Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceStatus
	 * @generated
	 */
	EEnum getDocumentReferenceStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CompositionStatus <em>Composition Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CompositionStatus
	 * @generated
	 */
	EEnum getCompositionStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentRelationshipType <em>Document Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Relationship Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentRelationshipType
	 * @generated
	 */
	EEnum getDocumentRelationshipType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Reference Format Code Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceFormatCodeSet
	 * @generated
	 */
	EEnum getDocumentReferenceFormatCodeSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemActCode <em>V3 Code System Act Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Act Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemActCode
	 * @generated
	 */
	EEnum getV3CodeSystemActCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Facility Type Code Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FacilityTypeCodeValueSet
	 * @generated
	 */
	EEnum getFacilityTypeCodeValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderStatus <em>Diagnostic Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Order Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderStatus
	 * @generated
	 */
	EEnum getDiagnosticOrderStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderPriority <em>Diagnostic Order Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Order Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderPriority
	 * @generated
	 */
	EEnum getDiagnosticOrderPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderEventCodes <em>Diagnostic Order Event Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagnostic Order Event Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderEventCodes
	 * @generated
	 */
	EEnum getDiagnosticOrderEventCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticOrderCodes <em>Loinc Diagnostic Order Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc Diagnostic Order Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticOrderCodes
	 * @generated
	 */
	EEnum getLoincDiagnosticOrderCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCodessnomedCT <em>Procedure Codessnomed CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Codessnomed CT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCodessnomedCT
	 * @generated
	 */
	EEnum getProcedureCodessnomedCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureReasonCodes <em>Procedure Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureReasonCodes
	 * @generated
	 */
	EEnum getProcedureReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestStatus <em>Procedure Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestStatus
	 * @generated
	 */
	EEnum getProcedureRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestPriority <em>Procedure Request Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Request Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestPriority
	 * @generated
	 */
	EEnum getProcedureRequestPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReferralStatus <em>Referral Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referral Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReferralStatus
	 * @generated
	 */
	EEnum getReferralStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AcquisitionModalityCodes <em>Acquisition Modality Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Acquisition Modality Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AcquisitionModalityCodes
	 * @generated
	 */
	EEnum getAcquisitionModalityCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.InstanceAvailability <em>Instance Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Availability</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.InstanceAvailability
	 * @generated
	 */
	EEnum getInstanceAvailability();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureStatus <em>Procedure Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureStatus
	 * @generated
	 */
	EEnum getProcedureStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCategoryCodessnomedCT <em>Procedure Category Codessnomed CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Category Codessnomed CT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCategoryCodessnomedCT
	 * @generated
	 */
	EEnum getProcedureCategoryCodessnomedCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureNotPerformedReasonsnomeDCT <em>Procedure Not Performed Reasonsnome DCT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Not Performed Reasonsnome DCT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureNotPerformedReasonsnomeDCT
	 * @generated
	 */
	EEnum getProcedureNotPerformedReasonsnomeDCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Performer Role Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedurePerformerRoleCodes
	 * @generated
	 */
	EEnum getProcedurePerformerRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureOutcomeCodessnomedCT <em>Procedure Outcome Codessnomed CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Outcome Codessnomed CT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureOutcomeCodessnomedCT
	 * @generated
	 */
	EEnum getProcedureOutcomeCodessnomedCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureFollowUpCodessnomedCT <em>Procedure Follow Up Codessnomed CT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Follow Up Codessnomed CT</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureFollowUpCodessnomedCT
	 * @generated
	 */
	EEnum getProcedureFollowUpCodessnomedCT();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanStatus <em>Care Plan Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanStatus
	 * @generated
	 */
	EEnum getCarePlanStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanCategory <em>Care Plan Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanCategory
	 * @generated
	 */
	EEnum getCarePlanCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanRelationship <em>Care Plan Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Relationship</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanRelationship
	 * @generated
	 */
	EEnum getCarePlanRelationship();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRoles <em>Participant Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Roles</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRoles
	 * @generated
	 */
	EEnum getParticipantRoles();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStartEvent <em>Goal Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Start Event</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStartEvent
	 * @generated
	 */
	EEnum getGoalStartEvent();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalCategory <em>Goal Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalCategory
	 * @generated
	 */
	EEnum getGoalCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStatus <em>Goal Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStatus
	 * @generated
	 */
	EEnum getGoalStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStatusReason <em>Goal Status Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Status Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStatusReason
	 * @generated
	 */
	EEnum getGoalStatusReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalPriority <em>Goal Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalPriority
	 * @generated
	 */
	EEnum getGoalPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationStatementStatus <em>Medication Statement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Statement Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationStatementStatus
	 * @generated
	 */
	EEnum getMedicationStatementStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationNotGivenCodes <em>Reason Medication Not Given Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reason Medication Not Given Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationNotGivenCodes
	 * @generated
	 */
	EEnum getReasonMedicationNotGivenCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.BodysiteLocationModifier <em>Bodysite Location Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bodysite Location Modifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BodysiteLocationModifier
	 * @generated
	 */
	EEnum getBodysiteLocationModifier();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtAnatomicalStructureForAdministrationSiteCodes <em>Snomed Ct Anatomical Structure For Administration Site Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Snomed Ct Anatomical Structure For Administration Site Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtAnatomicalStructureForAdministrationSiteCodes
	 * @generated
	 */
	EEnum getSnomedCtAnatomicalStructureForAdministrationSiteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.NutritionOrderStatus <em>Nutrition Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nutrition Order Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NutritionOrderStatus
	 * @generated
	 */
	EEnum getNutritionOrderStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.Diet <em>Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Diet
	 * @generated
	 */
	EEnum getDiet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FoodTypeCodes <em>Food Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Food Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FoodTypeCodes
	 * @generated
	 */
	EEnum getFoodTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DietCodes <em>Diet Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DietCodes
	 * @generated
	 */
	EEnum getDietCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nutrient Modifier Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NutrientModifierCodes
	 * @generated
	 */
	EEnum getNutrientModifierCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.TextureModifierCodes <em>Texture Modifier Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Modifier Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TextureModifierCodes
	 * @generated
	 */
	EEnum getTextureModifierCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Modified Food Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TextureModifiedFoodTypeCodes
	 * @generated
	 */
	EEnum getTextureModifiedFoodTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fluid Consistency Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FluidConsistencyTypeCodes
	 * @generated
	 */
	EEnum getFluidConsistencyTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplementTypeCodes <em>Supplement Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplement Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplementTypeCodes
	 * @generated
	 */
	EEnum getSupplementTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Formula Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaTypeCodes
	 * @generated
	 */
	EEnum getEnteralFormulaTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Formula Additive Type Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaAdditiveTypeCode
	 * @generated
	 */
	EEnum getEnteralFormulaAdditiveTypeCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralRouteCodes <em>Enteral Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enteral Route Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralRouteCodes
	 * @generated
	 */
	EEnum getEnteralRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.RiskProbability <em>Risk Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Probability</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RiskProbability
	 * @generated
	 */
	EEnum getRiskProbability();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AppointmentStatus <em>Appointment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appointment Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AppointmentStatus
	 * @generated
	 */
	EEnum getAppointmentStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterReasonCodes <em>Encounter Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterReasonCodes
	 * @generated
	 */
	EEnum getEncounterReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SlotStatus <em>Slot Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slot Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SlotStatus
	 * @generated
	 */
	EEnum getSlotStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantType <em>Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantType
	 * @generated
	 */
	EEnum getParticipantType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRequired <em>Participant Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Required</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRequired
	 * @generated
	 */
	EEnum getParticipantRequired();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipationStatus <em>Participation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipationStatus
	 * @generated
	 */
	EEnum getParticipationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CommunicationRequestStatus <em>Communication Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CommunicationRequestStatus
	 * @generated
	 */
	EEnum getCommunicationRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestStatus <em>Device Use Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Use Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestStatus
	 * @generated
	 */
	EEnum getDeviceUseRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestPriority <em>Device Use Request Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Use Request Priority</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestPriority
	 * @generated
	 */
	EEnum getDeviceUseRequestPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationOrderStatus <em>Medication Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Order Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationOrderStatus
	 * @generated
	 */
	EEnum getMedicationOrderStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActSubstanceAdminSubstitutionCode <em>Act Substance Admin Substitution Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Substance Admin Substitution Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActSubstanceAdminSubstitutionCode
	 * @generated
	 */
	EEnum getActSubstanceAdminSubstitutionCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceAdminSubstitutionReason <em>Substance Admin Substitution Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substance Admin Substitution Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceAdminSubstitutionReason
	 * @generated
	 */
	EEnum getSubstanceAdminSubstitutionReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActionList <em>Action List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action List</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActionList
	 * @generated
	 */
	EEnum getActionList();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.RulesetCodes <em>Ruleset Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ruleset Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RulesetCodes
	 * @generated
	 */
	EEnum getRulesetCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestStatus <em>Supply Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Request Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestStatus
	 * @generated
	 */
	EEnum getSupplyRequestStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyType <em>Supply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyType
	 * @generated
	 */
	EEnum getSupplyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestReason <em>Supply Request Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Request Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestReason
	 * @generated
	 */
	EEnum getSupplyRequestReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestWhen <em>Supply Request When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Request When</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestWhen
	 * @generated
	 */
	EEnum getSupplyRequestWhen();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Vision Prescription Product Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleVisionPrescriptionProductCodes
	 * @generated
	 */
	EEnum getExampleVisionPrescriptionProductCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.VisionEyes <em>Vision Eyes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vision Eyes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VisionEyes
	 * @generated
	 */
	EEnum getVisionEyes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.VisionBase <em>Vision Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vision Base</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VisionBase
	 * @generated
	 */
	EEnum getVisionBase();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityCategory <em>Care Plan Activity Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Activity Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityCategory
	 * @generated
	 */
	EEnum getCarePlanActivityCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivity <em>Care Plan Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Activity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivity
	 * @generated
	 */
	EEnum getCarePlanActivity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActivityReason <em>Activity Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Reason</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActivityReason
	 * @generated
	 */
	EEnum getActivityReason();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityStatus <em>Care Plan Activity Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Plan Activity Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityStatus
	 * @generated
	 */
	EEnum getCarePlanActivityStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Device Action Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureDeviceActionCodes
	 * @generated
	 */
	EEnum getProcedureDeviceActionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.Laterality <em>Laterality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Laterality</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Laterality
	 * @generated
	 */
	EEnum getLaterality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.KoStitle <em>Ko Stitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ko Stitle</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.KoStitle
	 * @generated
	 */
	EEnum getKoStitle();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DigitalMediaType <em>Digital Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Digital Media Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DigitalMediaType
	 * @generated
	 */
	EEnum getDigitalMediaType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaSubType <em>Media Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Sub Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaSubType
	 * @generated
	 */
	EEnum getMediaSubType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaCollectionViewProjection <em>Media Collection View Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Collection View Projection</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaCollectionViewProjection
	 * @generated
	 */
	EEnum getMediaCollectionViewProjection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Manifestation And Symptom Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ManifestationAndSymptomCodes
	 * @generated
	 */
	EEnum getManifestationAndSymptomCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdmitSource <em>Admit Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Admit Source</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdmitSource
	 * @generated
	 */
	EEnum getAdmitSource();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecialCourtesy <em>Special Courtesy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Courtesy</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecialCourtesy
	 * @generated
	 */
	EEnum getSpecialCourtesy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecialArrangements <em>Special Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Arrangements</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecialArrangements
	 * @generated
	 */
	EEnum getSpecialArrangements();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DischargeDisposition <em>Discharge Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discharge Disposition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DischargeDisposition
	 * @generated
	 */
	EEnum getDischargeDisposition();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterLocationStatus <em>Encounter Location Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Encounter Location Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterLocationStatus
	 * @generated
	 */
	EEnum getEncounterLocationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemType <em>Naming System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Naming System Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemType
	 * @generated
	 */
	EEnum getNamingSystemType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemIdentifierType <em>Naming System Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Naming System Identifier Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemIdentifierType
	 * @generated
	 */
	EEnum getNamingSystemIdentifierType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConceptMapEquivalence <em>Concept Map Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concept Map Equivalence</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConceptMapEquivalence
	 * @generated
	 */
	EEnum getConceptMapEquivalence();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagCategory <em>Flag Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagCategory
	 * @generated
	 */
	EEnum getFlagCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagStatus <em>Flag Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagStatus
	 * @generated
	 */
	EEnum getFlagStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagCode <em>Flag Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flag Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagCode
	 * @generated
	 */
	EEnum getFlagCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sequence Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SequenceType
	 * @generated
	 */
	EEnum getSequenceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DbSnp <em>Db Snp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Db Snp</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DbSnp
	 * @generated
	 */
	EEnum getDbSnp();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.Ensembl <em>Ensembl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ensembl</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Ensembl
	 * @generated
	 */
	EEnum getEnsembl();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.Loinc530345Answerlist <em>Loinc530345 Answerlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loinc530345 Answerlist</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Loinc530345Answerlist
	 * @generated
	 */
	EEnum getLoinc530345Answerlist();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTypeCodes <em>Contract Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTypeCodes
	 * @generated
	 */
	EEnum getContractTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractSubtypeCodes <em>Contract Subtype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Subtype Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractSubtypeCodes
	 * @generated
	 */
	EEnum getContractSubtypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractActionCodes <em>Contract Action Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Action Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractActionCodes
	 * @generated
	 */
	EEnum getContractActionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PurposeOfUse <em>Purpose Of Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Purpose Of Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PurposeOfUse
	 * @generated
	 */
	EEnum getPurposeOfUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Actor Role Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractActorRoleCodes
	 * @generated
	 */
	EEnum getContractActorRoleCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Signer Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractSignerTypeCodes
	 * @generated
	 */
	EEnum getContractSignerTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTermTypeCodes <em>Contract Term Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTermTypeCodes
	 * @generated
	 */
	EEnum getContractTermTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTermSubTypeCodes <em>Contract Term Sub Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contract Term Sub Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTermSubTypeCodes
	 * @generated
	 */
	EEnum getContractTermSubTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Document Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentTypeCodes
	 * @generated
	 */
	EEnum getFhirDocumentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentClassCodes <em>Fhir Document Class Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fhir Document Class Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentClassCodes
	 * @generated
	 */
	EEnum getFhirDocumentClassCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemConfidentiality <em>V3 Code System Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Confidentiality</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemConfidentiality
	 * @generated
	 */
	EEnum getV3CodeSystemConfidentiality();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CompositionAttestationMode <em>Composition Attestation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition Attestation Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CompositionAttestationMode
	 * @generated
	 */
	EEnum getCompositionAttestationMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentSectionCodes <em>Document Section Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Section Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentSectionCodes
	 * @generated
	 */
	EEnum getDocumentSectionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListMode <em>List Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListMode
	 * @generated
	 */
	EEnum getListMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListOrderCodes <em>List Order Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Order Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListOrderCodes
	 * @generated
	 */
	EEnum getListOrderCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListEmptyReasons <em>List Empty Reasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Empty Reasons</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListEmptyReasons
	 * @generated
	 */
	EEnum getListEmptyReasons();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.RemittanceOutcome <em>Remittance Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Remittance Outcome</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RemittanceOutcome
	 * @generated
	 */
	EEnum getRemittanceOutcome();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentTypeCodes <em>Payment Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentTypeCodes
	 * @generated
	 */
	EEnum getPaymentTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FormCodes <em>Form Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FormCodes
	 * @generated
	 */
	EEnum getFormCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NoteType
	 * @generated
	 */
	EEnum getNoteType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceStatementKind <em>Conformance Statement Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conformance Statement Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceStatementKind
	 * @generated
	 */
	EEnum getConformanceStatementKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnknownContentCode <em>Unknown Content Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unknown Content Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnknownContentCode
	 * @generated
	 */
	EEnum getUnknownContentCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.RestfulConformanceMode <em>Restful Conformance Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restful Conformance Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RestfulConformanceMode
	 * @generated
	 */
	EEnum getRestfulConformanceMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.RestfulSecurityService <em>Restful Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restful Security Service</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RestfulSecurityService
	 * @generated
	 */
	EEnum getRestfulSecurityService();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.TypeRestfulInteraction <em>Type Restful Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Restful Interaction</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TypeRestfulInteraction
	 * @generated
	 */
	EEnum getTypeRestfulInteraction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResourceVersionPolicy <em>Resource Version Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Version Policy</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResourceVersionPolicy
	 * @generated
	 */
	EEnum getResourceVersionPolicy();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionalDeleteStatus <em>Conditional Delete Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conditional Delete Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionalDeleteStatus
	 * @generated
	 */
	EEnum getConditionalDeleteStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchParamType <em>Search Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Param Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchParamType
	 * @generated
	 */
	EEnum getSearchParamType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchModifierCode <em>Search Modifier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Modifier Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchModifierCode
	 * @generated
	 */
	EEnum getSearchModifierCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SystemRestfulInteraction <em>System Restful Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Restful Interaction</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SystemRestfulInteraction
	 * @generated
	 */
	EEnum getSystemRestfulInteraction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.TransactionMode <em>Transaction Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TransactionMode
	 * @generated
	 */
	EEnum getTransactionMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationKind <em>Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationKind
	 * @generated
	 */
	EEnum getOperationKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageTransport <em>Message Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Transport</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageTransport
	 * @generated
	 */
	EEnum getMessageTransport();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Event</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageEvent
	 * @generated
	 */
	EEnum getMessageEvent();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageSignificanceCategory <em>Message Significance Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Significance Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageSignificanceCategory
	 * @generated
	 */
	EEnum getMessageSignificanceCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceEventMode <em>Conformance Event Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conformance Event Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceEventMode
	 * @generated
	 */
	EEnum getConformanceEventMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentMode <em>Document Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentMode
	 * @generated
	 */
	EEnum getDocumentMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProfileOriginType <em>Profile Origin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Profile Origin Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProfileOriginType
	 * @generated
	 */
	EEnum getProfileOriginType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProfileDestinationType <em>Profile Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Profile Destination Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProfileDestinationType
	 * @generated
	 */
	EEnum getProfileDestinationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.TestScriptOperationCodes <em>Test Script Operation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Script Operation Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TestScriptOperationCodes
	 * @generated
	 */
	EEnum getTestScriptOperationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContentType
	 * @generated
	 */
	EEnum getContentType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionDirectionType <em>Assertion Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Direction Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionDirectionType
	 * @generated
	 */
	EEnum getAssertionDirectionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionOperatorType <em>Assertion Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Operator Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionOperatorType
	 * @generated
	 */
	EEnum getAssertionOperatorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionResponseTypes <em>Assertion Response Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Response Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionResponseTypes
	 * @generated
	 */
	EEnum getAssertionResponseTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DataElementStringency <em>Data Element Stringency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Element Stringency</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DataElementStringency
	 * @generated
	 */
	EEnum getDataElementStringency();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleTriggerType <em>Decision Support Rule Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Support Rule Trigger Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleTriggerType
	 * @generated
	 */
	EEnum getDecisionSupportRuleTriggerType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleParticipantType <em>Decision Support Rule Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Support Rule Participant Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleParticipantType
	 * @generated
	 */
	EEnum getDecisionSupportRuleParticipantType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleActionType <em>Decision Support Rule Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Support Rule Action Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleActionType
	 * @generated
	 */
	EEnum getDecisionSupportRuleActionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResponseType
	 * @generated
	 */
	EEnum getResponseType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.IssueSeverity <em>Issue Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IssueSeverity
	 * @generated
	 */
	EEnum getIssueSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IssueType
	 * @generated
	 */
	EEnum getIssueType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationOutcomeCodes <em>Operation Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Outcome Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationOutcomeCodes
	 * @generated
	 */
	EEnum getOperationOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Message Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleMessageReasonCodes
	 * @generated
	 */
	EEnum getExampleMessageReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionStatus <em>Subscription Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscription Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionStatus
	 * @generated
	 */
	EEnum getSubscriptionStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionChannelType <em>Subscription Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscription Channel Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionChannelType
	 * @generated
	 */
	EEnum getSubscriptionChannelType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionTag <em>Subscription Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subscription Tag</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionTag
	 * @generated
	 */
	EEnum getSubscriptionTag();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActCoverageTypeCode <em>Act Coverage Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Coverage Type Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActCoverageTypeCode
	 * @generated
	 */
	EEnum getActCoverageTypeCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.RelationshipCodes <em>Relationship Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.RelationshipCodes
	 * @generated
	 */
	EEnum getRelationshipCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccine Administered Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccineAdministeredValueSet
	 * @generated
	 */
	EEnum getVaccineAdministeredValueSet();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationStatusCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Recommendation Date Criterion Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationDateCriterionCodes
	 * @generated
	 */
	EEnum getImmunizationRecommendationDateCriterionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationAdministrationStatus <em>Medication Administration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Administration Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationAdministrationStatus
	 * @generated
	 */
	EEnum getMedicationAdministrationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Codes For Immunization Site Of Administration</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.CodesForImmunizationSiteOfAdministration
	 * @generated
	 */
	EEnum getCodesForImmunizationSiteOfAdministration();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRouteCodes <em>Immunization Route Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Route Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRouteCodes
	 * @generated
	 */
	EEnum getImmunizationRouteCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonCodes
	 * @generated
	 */
	EEnum getImmunizationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonsForNotImmunizingCodes <em>Immunization Reasons For Not Immunizing Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Immunization Reasons For Not Immunizing Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonsForNotImmunizingCodes
	 * @generated
	 */
	EEnum getImmunizationReasonsForNotImmunizingCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseTargetCodes <em>Vaccination Protocol Dose Target Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccination Protocol Dose Target Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseTargetCodes
	 * @generated
	 */
	EEnum getVaccinationProtocolDoseTargetCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusCodes <em>Vaccination Protocol Dose Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccination Protocol Dose Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusCodes
	 * @generated
	 */
	EEnum getVaccinationProtocolDoseStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusReasonCodes <em>Vaccination Protocol Dose Status Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vaccination Protocol Dose Status Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusReasonCodes
	 * @generated
	 */
	EEnum getVaccinationProtocolDoseStatusReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.BundleType <em>Bundle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bundle Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BundleType
	 * @generated
	 */
	EEnum getBundleType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchEntryMode <em>Search Entry Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Entry Mode</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchEntryMode
	 * @generated
	 */
	EEnum getSearchEntryMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.HttpVerb <em>Http Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Verb</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.HttpVerb
	 * @generated
	 */
	EEnum getHttpVerb();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PriorityCodes <em>Priority Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PriorityCodes
	 * @generated
	 */
	EEnum getPriorityCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitCategoryCodes <em>Benefit Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitCategoryCodes
	 * @generated
	 */
	EEnum getBenefitCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitSubCategoryCodes <em>Benefit Sub Category Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Sub Category Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitSubCategoryCodes
	 * @generated
	 */
	EEnum getBenefitSubCategoryCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.NetworkTypeCodes <em>Network Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.NetworkTypeCodes
	 * @generated
	 */
	EEnum getNetworkTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnitTypeCodes <em>Unit Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnitTypeCodes
	 * @generated
	 */
	EEnum getUnitTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitTermCodes <em>Benefit Term Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Term Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitTermCodes
	 * @generated
	 */
	EEnum getBenefitTermCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitTypeCodes <em>Benefit Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Benefit Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitTypeCodes
	 * @generated
	 */
	EEnum getBenefitTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Error Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationErrorCodes
	 * @generated
	 */
	EEnum getAdjudicationErrorCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationDispenseStatus <em>Medication Dispense Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medication Dispense Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationDispenseStatus
	 * @generated
	 */
	EEnum getMedicationDispenseStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActPharmacySupplyType <em>Act Pharmacy Supply Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Pharmacy Supply Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActPharmacySupplyType
	 * @generated
	 */
	EEnum getActPharmacySupplyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ClaimType <em>Claim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Claim Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ClaimType
	 * @generated
	 */
	EEnum getClaimType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.Use <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.Use
	 * @generated
	 */
	EEnum getUse();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.FundsReservationCodes <em>Funds Reservation Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Funds Reservation Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.FundsReservationCodes
	 * @generated
	 */
	EEnum getFundsReservationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PayeeTypeCodes <em>Payee Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payee Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PayeeTypeCodes
	 * @generated
	 */
	EEnum getPayeeTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.IcD10Codes <em>Ic D10 Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ic D10 Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.IcD10Codes
	 * @generated
	 */
	EEnum getIcD10Codes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionsCodes <em>Conditions Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conditions Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionsCodes
	 * @generated
	 */
	EEnum getConditionsCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExceptionCodes <em>Exception Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exception Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExceptionCodes
	 * @generated
	 */
	EEnum getExceptionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActIncidentCode <em>Act Incident Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Incident Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActIncidentCode
	 * @generated
	 */
	EEnum getActIncidentCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.InterventionCodes <em>Intervention Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intervention Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.InterventionCodes
	 * @generated
	 */
	EEnum getInterventionCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActInvoiceGroupCode <em>Act Invoice Group Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Act Invoice Group Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActInvoiceGroupCode
	 * @generated
	 */
	EEnum getActInvoiceGroupCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.UsclsCodes <em>Uscls Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uscls Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UsclsCodes
	 * @generated
	 */
	EEnum getUsclsCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Service Place Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleServicePlaceCodes
	 * @generated
	 */
	EEnum getExampleServicePlaceCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.UdiCodes <em>Udi Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Udi Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.UdiCodes
	 * @generated
	 */
	EEnum getUdiCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ToothCodes <em>Tooth Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tooth Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ToothCodes
	 * @generated
	 */
	EEnum getToothCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SurfaceCodes <em>Surface Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Surface Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SurfaceCodes
	 * @generated
	 */
	EEnum getSurfaceCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModifierTypeCodes <em>Modifier Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modifier Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModifierTypeCodes
	 * @generated
	 */
	EEnum getModifierTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OralProsthoMaterialTypeCodes <em>Oral Prostho Material Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Oral Prostho Material Type Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OralProsthoMaterialTypeCodes
	 * @generated
	 */
	EEnum getOralProsthoMaterialTypeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdditionalMaterialCodes <em>Additional Material Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Additional Material Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdditionalMaterialCodes
	 * @generated
	 */
	EEnum getAdditionalMaterialCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.TeethCodes <em>Teeth Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Teeth Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.TeethCodes
	 * @generated
	 */
	EEnum getTeethCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Missing Tooth Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MissingToothReasonCodes
	 * @generated
	 */
	EEnum getMissingToothReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationCodes <em>Adjudication Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationCodes
	 * @generated
	 */
	EEnum getAdjudicationCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Adjustment Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentAdjustmentReasonCodes
	 * @generated
	 */
	EEnum getPaymentAdjustmentReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjudication Reason Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationReasonCodes
	 * @generated
	 */
	EEnum getAdjudicationReasonCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuideDependencyType <em>Guide Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guide Dependency Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuideDependencyType
	 * @generated
	 */
	EEnum getGuideDependencyType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuideResourcePurpose <em>Guide Resource Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guide Resource Purpose</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuideResourcePurpose
	 * @generated
	 */
	EEnum getGuideResourcePurpose();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidePageKind <em>Guide Page Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guide Page Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidePageKind
	 * @generated
	 */
	EEnum getGuidePageKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.XPathUsageType <em>XPath Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XPath Usage Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.XPathUsageType
	 * @generated
	 */
	EEnum getXPathUsageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetParticipantType <em>Order Set Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Set Participant Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetParticipantType
	 * @generated
	 */
	EEnum getOrderSetParticipantType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemType <em>Order Set Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Set Item Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemType
	 * @generated
	 */
	EEnum getOrderSetItemType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemGroupingBehavior <em>Order Set Item Grouping Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Set Item Grouping Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemGroupingBehavior
	 * @generated
	 */
	EEnum getOrderSetItemGroupingBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemSelectionBehavior <em>Order Set Item Selection Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Set Item Selection Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemSelectionBehavior
	 * @generated
	 */
	EEnum getOrderSetItemSelectionBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemRequiredBehavior <em>Order Set Item Required Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Set Item Required Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemRequiredBehavior
	 * @generated
	 */
	EEnum getOrderSetItemRequiredBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemPrecheckBehavior <em>Order Set Item Precheck Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Set Item Precheck Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemPrecheckBehavior
	 * @generated
	 */
	EEnum getOrderSetItemPrecheckBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemCardinalityBehavior <em>Order Set Item Cardinality Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Set Item Cardinality Behavior</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemCardinalityBehavior
	 * @generated
	 */
	EEnum getOrderSetItemCardinalityBehavior();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEventCurrentState <em>Provenance Event Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Event Current State</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEventCurrentState
	 * @generated
	 */
	EEnum getProvenanceEventCurrentState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceParticipantRole <em>Provenance Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Participant Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceParticipantRole
	 * @generated
	 */
	EEnum getProvenanceParticipantRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemRoleLinkType <em>V3 Code System Role Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V3 Code System Role Link Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemRoleLinkType
	 * @generated
	 */
	EEnum getV3CodeSystemRoleLinkType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEntityRole <em>Provenance Entity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provenance Entity Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEntityRole
	 * @generated
	 */
	EEnum getProvenanceEntityRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcessOutcomeCodes <em>Process Outcome Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Outcome Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcessOutcomeCodes
	 * @generated
	 */
	EEnum getProcessOutcomeCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MeasurePopulationType <em>Measure Population Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Population Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MeasurePopulationType
	 * @generated
	 */
	EEnum getMeasurePopulationType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentStatusCodes <em>Payment Status Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentStatusCodes
	 * @generated
	 */
	EEnum getPaymentStatusCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleUseCodesForList <em>Example Use Codes For List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Example Use Codes For List</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleUseCodesForList
	 * @generated
	 */
	EEnum getExampleUseCodesForList();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListStatus <em>List Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListStatus
	 * @generated
	 */
	EEnum getListStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Patient Medicine Change Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientMedicineChangeTypes
	 * @generated
	 */
	EEnum getPatientMedicineChangeTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseStatus <em>Guidance Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guidance Response Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseStatus
	 * @generated
	 */
	EEnum getGuidanceResponseStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseActionType <em>Guidance Response Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guidance Response Action Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseActionType
	 * @generated
	 */
	EEnum getGuidanceResponseActionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueCategory <em>Detected Issue Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Category</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueCategory
	 * @generated
	 */
	EEnum getDetectedIssueCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueSeverity <em>Detected Issue Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Severity</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueSeverity
	 * @generated
	 */
	EEnum getDetectedIssueSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Detected Issue Mitigation Action</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueMitigationAction
	 * @generated
	 */
	EEnum getDetectedIssueMitigationAction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AccountStatus <em>Account Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AccountStatus
	 * @generated
	 */
	EEnum getAccountStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reason Medication Given Codes</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationGivenCodes
	 * @generated
	 */
	EEnum getReasonMedicationGivenCodes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantStatus <em>Participant Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantStatus
	 * @generated
	 */
	EEnum getParticipantStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventId <em>Audit Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventId
	 * @generated
	 */
	EEnum getAuditEventId();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSubType <em>Audit Event Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Sub Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSubType
	 * @generated
	 */
	EEnum getAuditEventSubType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventAction <em>Audit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Action</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventAction
	 * @generated
	 */
	EEnum getAuditEventAction();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventOutcome <em>Audit Event Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Outcome</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventOutcome
	 * @generated
	 */
	EEnum getAuditEventOutcome();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditActiveParticipantRoleIdCode <em>Audit Active Participant Role Id Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Active Participant Role Id Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditActiveParticipantRoleIdCode
	 * @generated
	 */
	EEnum getAuditActiveParticipantRoleIdCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaTypeCode <em>Media Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaTypeCode
	 * @generated
	 */
	EEnum getMediaTypeCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventParticipantNetworkType <em>Audit Event Participant Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Participant Network Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventParticipantNetworkType
	 * @generated
	 */
	EEnum getAuditEventParticipantNetworkType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSourceType <em>Audit Event Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Source Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSourceType
	 * @generated
	 */
	EEnum getAuditEventSourceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectType <em>Audit Event Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Object Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectType
	 * @generated
	 */
	EEnum getAuditEventObjectType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectRole <em>Audit Event Object Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Object Role</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectRole
	 * @generated
	 */
	EEnum getAuditEventObjectRole();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectLifecycle <em>Audit Event Object Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Audit Event Object Lifecycle</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectLifecycle
	 * @generated
	 */
	EEnum getAuditEventObjectLifecycle();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.BasicResourceTypes <em>Basic Resource Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Resource Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.BasicResourceTypes
	 * @generated
	 */
	EEnum getBasicResourceTypes();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderStatus <em>Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderStatus
	 * @generated
	 */
	EEnum getOrderStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyDeliveryStatus <em>Supply Delivery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Delivery Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyDeliveryStatus
	 * @generated
	 */
	EEnum getSupplyDeliveryStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyItemType <em>Supply Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supply Item Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyItemType
	 * @generated
	 */
	EEnum getSupplyItemType();

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
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllSecurityLabels <em>All Security Labels</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllSecurityLabels
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllSecurityLabels()
		 * @generated
		 */
		EEnum ALL_SECURITY_LABELS = eINSTANCE.getAllSecurityLabels();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NarrativeStatus <em>Narrative Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.NarrativeStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNarrativeStatus()
		 * @generated
		 */
		EEnum NARRATIVE_STATUS = eINSTANCE.getNarrativeStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentifierUse <em>Identifier Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentifierUse
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIdentifierUse()
		 * @generated
		 */
		EEnum IDENTIFIER_USE = eINSTANCE.getIdentifierUse();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentifierTypeCodes <em>Identifier Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentifierTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIdentifierTypeCodes()
		 * @generated
		 */
		EEnum IDENTIFIER_TYPE_CODES = eINSTANCE.getIdentifierTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrganizationType <em>Organization Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrganizationType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrganizationType()
		 * @generated
		 */
		EEnum ORGANIZATION_TYPE = eINSTANCE.getOrganizationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactPointSystem <em>Contact Point System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactPointSystem
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContactPointSystem()
		 * @generated
		 */
		EEnum CONTACT_POINT_SYSTEM = eINSTANCE.getContactPointSystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactPointUse <em>Contact Point Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactPointUse
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContactPointUse()
		 * @generated
		 */
		EEnum CONTACT_POINT_USE = eINSTANCE.getContactPointUse();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AddressUse <em>Address Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AddressUse
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAddressUse()
		 * @generated
		 */
		EEnum ADDRESS_USE = eINSTANCE.getAddressUse();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AddressType <em>Address Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AddressType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAddressType()
		 * @generated
		 */
		EEnum ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContactEntityType <em>Contact Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContactEntityType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContactEntityType()
		 * @generated
		 */
		EEnum CONTACT_ENTITY_TYPE = eINSTANCE.getContactEntityType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NameUse <em>Name Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.NameUse
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNameUse()
		 * @generated
		 */
		EEnum NAME_USE = eINSTANCE.getNameUse();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdministrativeGender <em>Administrative Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdministrativeGender
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdministrativeGender()
		 * @generated
		 */
		EEnum ADMINISTRATIVE_GENDER = eINSTANCE.getAdministrativeGender();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PractitionerRole <em>Practitioner Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PractitionerRole
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPractitionerRole()
		 * @generated
		 */
		EEnum PRACTITIONER_ROLE = eINSTANCE.getPractitionerRole();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PractitionerSpecialty <em>Practitioner Specialty</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PractitionerSpecialty
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPractitionerSpecialty()
		 * @generated
		 */
		EEnum PRACTITIONER_SPECIALTY = eINSTANCE.getPractitionerSpecialty();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationStatus <em>Location Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLocationStatus()
		 * @generated
		 */
		EEnum LOCATION_STATUS = eINSTANCE.getLocationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationMode <em>Location Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLocationMode()
		 * @generated
		 */
		EEnum LOCATION_MODE = eINSTANCE.getLocationMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ServiceDeliveryLocationRoleType <em>Service Delivery Location Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ServiceDeliveryLocationRoleType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getServiceDeliveryLocationRoleType()
		 * @generated
		 */
		EEnum SERVICE_DELIVERY_LOCATION_ROLE_TYPE = eINSTANCE.getServiceDeliveryLocationRoleType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LocationType <em>Location Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.LocationType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLocationType()
		 * @generated
		 */
		EEnum LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PracticeSettingCodeValueSet <em>Practice Setting Code Value Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PracticeSettingCodeValueSet
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPracticeSettingCodeValueSet()
		 * @generated
		 */
		EEnum PRACTICE_SETTING_CODE_VALUE_SET = eINSTANCE.getPracticeSettingCodeValueSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ServiceProvisionConditions <em>Service Provision Conditions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ServiceProvisionConditions
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getServiceProvisionConditions()
		 * @generated
		 */
		EEnum SERVICE_PROVISION_CONDITIONS = eINSTANCE.getServiceProvisionConditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReferralMethod <em>Referral Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReferralMethod
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getReferralMethod()
		 * @generated
		 */
		EEnum REFERRAL_METHOD = eINSTANCE.getReferralMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DaysOfWeek <em>Days Of Week</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DaysOfWeek
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDaysOfWeek()
		 * @generated
		 */
		EEnum DAYS_OF_WEEK = eINSTANCE.getDaysOfWeek();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12 <em>Anzsco Australian And New Zealand Standard Classification Of Occupations2013 Version12</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12()
		 * @generated
		 */
		EEnum ANZSCO_AUSTRALIAN_AND_NEW_ZEALAND_STANDARD_CLASSIFICATION_OF_OCCUPATIONS2013_VERSION12 = eINSTANCE.getAnzscoAustralianAndNewZealandStandardClassificationOfOccupations2013Version12();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MaritalStatusCodes <em>Marital Status Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MaritalStatusCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMaritalStatusCodes()
		 * @generated
		 */
		EEnum MARITAL_STATUS_CODES = eINSTANCE.getMaritalStatusCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientContactRelationship <em>Patient Contact Relationship</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientContactRelationship
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPatientContactRelationship()
		 * @generated
		 */
		EEnum PATIENT_CONTACT_RELATIONSHIP = eINSTANCE.getPatientContactRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnimalSpecies <em>Animal Species</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnimalSpecies
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAnimalSpecies()
		 * @generated
		 */
		EEnum ANIMAL_SPECIES = eINSTANCE.getAnimalSpecies();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AnimalBreeds <em>Animal Breeds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AnimalBreeds
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAnimalBreeds()
		 * @generated
		 */
		EEnum ANIMAL_BREEDS = eINSTANCE.getAnimalBreeds();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GenderStatus <em>Gender Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GenderStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGenderStatus()
		 * @generated
		 */
		EEnum GENDER_STATUS = eINSTANCE.getGenderStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LinkType <em>Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.LinkType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLinkType()
		 * @generated
		 */
		EEnum LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientRelationshipType <em>Patient Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientRelationshipType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPatientRelationshipType()
		 * @generated
		 */
		EEnum PATIENT_RELATIONSHIP_TYPE = eINSTANCE.getPatientRelationshipType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuantityComparator <em>Quantity Comparator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuantityComparator
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuantityComparator()
		 * @generated
		 */
		EEnum QUANTITY_COMPARATOR = eINSTANCE.getQuantityComparator();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SignatureTypeCodes <em>Signature Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SignatureTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSignatureTypeCodes()
		 * @generated
		 */
		EEnum SIGNATURE_TYPE_CODES = eINSTANCE.getSignatureTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceStatus <em>Device Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceStatus()
		 * @generated
		 */
		EEnum DEVICE_STATUS = eINSTANCE.getDeviceStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnitsOfTime <em>Units Of Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnitsOfTime
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUnitsOfTime()
		 * @generated
		 */
		EEnum UNITS_OF_TIME = eINSTANCE.getUnitsOfTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EventTiming <em>Event Timing</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EventTiming
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEventTiming()
		 * @generated
		 */
		EEnum EVENT_TIMING = eINSTANCE.getEventTiming();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TimingAbbreviation <em>Timing Abbreviation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.TimingAbbreviation
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTimingAbbreviation()
		 * @generated
		 */
		EEnum TIMING_ABBREVIATION = eINSTANCE.getTimingAbbreviation();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataType <em>Module Metadata Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataType()
		 * @generated
		 */
		EEnum MODULE_METADATA_TYPE = eINSTANCE.getModuleMetadataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataStatus <em>Module Metadata Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataStatus()
		 * @generated
		 */
		EEnum MODULE_METADATA_STATUS = eINSTANCE.getModuleMetadataStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataFocusType <em>Module Metadata Focus Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataFocusType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataFocusType()
		 * @generated
		 */
		EEnum MODULE_METADATA_FOCUS_TYPE = eINSTANCE.getModuleMetadataFocusType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataContributorType <em>Module Metadata Contributor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataContributorType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataContributorType()
		 * @generated
		 */
		EEnum MODULE_METADATA_CONTRIBUTOR_TYPE = eINSTANCE.getModuleMetadataContributorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IdentityAssuranceLevel <em>Identity Assurance Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.IdentityAssuranceLevel
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIdentityAssuranceLevel()
		 * @generated
		 */
		EEnum IDENTITY_ASSURANCE_LEVEL = eINSTANCE.getIdentityAssuranceLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataResourceType <em>Module Metadata Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModuleMetadataResourceType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModuleMetadataResourceType()
		 * @generated
		 */
		EEnum MODULE_METADATA_RESOURCE_TYPE = eINSTANCE.getModuleMetadataResourceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationParameterUse <em>Operation Parameter Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationParameterUse
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOperationParameterUse()
		 * @generated
		 */
		EEnum OPERATION_PARAMETER_USE = eINSTANCE.getOperationParameterUse();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParameterTypesUsedInOperationDefinitions <em>Parameter Types Used In Operation Definitions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParameterTypesUsedInOperationDefinitions
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParameterTypesUsedInOperationDefinitions()
		 * @generated
		 */
		EEnum PARAMETER_TYPES_USED_IN_OPERATION_DEFINITIONS = eINSTANCE.getParameterTypesUsedInOperationDefinitions();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceResourceStatus <em>Conformance Resource Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceResourceStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConformanceResourceStatus()
		 * @generated
		 */
		EEnum CONFORMANCE_RESOURCE_STATUS = eINSTANCE.getConformanceResourceStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContextOfUseValueSet <em>Context Of Use Value Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContextOfUseValueSet
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContextOfUseValueSet()
		 * @generated
		 */
		EEnum CONTEXT_OF_USE_VALUE_SET = eINSTANCE.getContextOfUseValueSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionCodes <em>Structure Definition Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getStructureDefinitionCodes()
		 * @generated
		 */
		EEnum STRUCTURE_DEFINITION_CODES = eINSTANCE.getStructureDefinitionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionKind <em>Structure Definition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.StructureDefinitionKind
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getStructureDefinitionKind()
		 * @generated
		 */
		EEnum STRUCTURE_DEFINITION_KIND = eINSTANCE.getStructureDefinitionKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType <em>Fhir Defined Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDefinedType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFhirDefinedType()
		 * @generated
		 */
		EEnum FHIR_DEFINED_TYPE = eINSTANCE.getFhirDefinedType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExtensionContext <em>Extension Context</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExtensionContext
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExtensionContext()
		 * @generated
		 */
		EEnum EXTENSION_CONTEXT = eINSTANCE.getExtensionContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PropertyRepresentation <em>Property Representation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PropertyRepresentation
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPropertyRepresentation()
		 * @generated
		 */
		EEnum PROPERTY_REPRESENTATION = eINSTANCE.getPropertyRepresentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincCodes <em>Loinc Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLoincCodes()
		 * @generated
		 */
		EEnum LOINC_CODES = eINSTANCE.getLoincCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SlicingRules <em>Slicing Rules</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SlicingRules
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSlicingRules()
		 * @generated
		 */
		EEnum SLICING_RULES = eINSTANCE.getSlicingRules();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AggregationMode <em>Aggregation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AggregationMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAggregationMode()
		 * @generated
		 */
		EEnum AGGREGATION_MODE = eINSTANCE.getAggregationMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConstraintSeverity <em>Constraint Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConstraintSeverity
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConstraintSeverity()
		 * @generated
		 */
		EEnum CONSTRAINT_SEVERITY = eINSTANCE.getConstraintSeverity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BindingStrength <em>Binding Strength</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.BindingStrength
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBindingStrength()
		 * @generated
		 */
		EEnum BINDING_STRENGTH = eINSTANCE.getBindingStrength();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DesignationUse <em>Designation Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DesignationUse
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDesignationUse()
		 * @generated
		 */
		EEnum DESIGNATION_USE = eINSTANCE.getDesignationUse();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FilterOperator <em>Filter Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FilterOperator
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFilterOperator()
		 * @generated
		 */
		EEnum FILTER_OPERATOR = eINSTANCE.getFilterOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GroupType <em>Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GroupType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGroupType()
		 * @generated
		 */
		EEnum GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtMedicationCodes <em>Snomed Ct Medication Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtMedicationCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtMedicationCodes()
		 * @generated
		 */
		EEnum SNOMED_CT_MEDICATION_CODES = eINSTANCE.getSnomedCtMedicationCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationFormCodes <em>Medication Form Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationFormCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationFormCodes()
		 * @generated
		 */
		EEnum MEDICATION_FORM_CODES = eINSTANCE.getMedicationFormCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCategoryCodes <em>Substance Category Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCategoryCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubstanceCategoryCodes()
		 * @generated
		 */
		EEnum SUBSTANCE_CATEGORY_CODES = eINSTANCE.getSubstanceCategoryCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCode <em>Substance Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubstanceCode()
		 * @generated
		 */
		EEnum SUBSTANCE_CODE = eINSTANCE.getSubstanceCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtFormCodes <em>Snomed Ct Form Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtFormCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtFormCodes()
		 * @generated
		 */
		EEnum SNOMED_CT_FORM_CODES = eINSTANCE.getSnomedCtFormCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemParticipationMode <em>V3 Code System Participation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemParticipationMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV3CodeSystemParticipationMode()
		 * @generated
		 */
		EEnum V3_CODE_SYSTEM_PARTICIPATION_MODE = eINSTANCE.getV3CodeSystemParticipationMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CommunicationStatus <em>Communication Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CommunicationStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCommunicationStatus()
		 * @generated
		 */
		EEnum COMMUNICATION_STATUS = eINSTANCE.getCommunicationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterState <em>Encounter State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterState
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterState()
		 * @generated
		 */
		EEnum ENCOUNTER_STATE = eINSTANCE.getEncounterState();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterClass <em>Encounter Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterClass
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterClass()
		 * @generated
		 */
		EEnum ENCOUNTER_CLASS = eINSTANCE.getEncounterClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterType <em>Encounter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterType()
		 * @generated
		 */
		EEnum ENCOUNTER_TYPE = eINSTANCE.getEncounterType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterPriority <em>Encounter Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterPriority
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterPriority()
		 * @generated
		 */
		EEnum ENCOUNTER_PRIORITY = eINSTANCE.getEncounterPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EpisodeOfCareStatus <em>Episode Of Care Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EpisodeOfCareStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEpisodeOfCareStatus()
		 * @generated
		 */
		EEnum EPISODE_OF_CARE_STATUS = eINSTANCE.getEpisodeOfCareStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionProblemDiagnosisCodes <em>Condition Problem Diagnosis Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionProblemDiagnosisCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionProblemDiagnosisCodes()
		 * @generated
		 */
		EEnum CONDITION_PROBLEM_DIAGNOSIS_CODES = eINSTANCE.getConditionProblemDiagnosisCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionCategoryCodes <em>Condition Category Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionCategoryCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionCategoryCodes()
		 * @generated
		 */
		EEnum CONDITION_CATEGORY_CODES = eINSTANCE.getConditionCategoryCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionClinicalStatusCodes <em>Condition Clinical Status Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionClinicalStatusCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionClinicalStatusCodes()
		 * @generated
		 */
		EEnum CONDITION_CLINICAL_STATUS_CODES = eINSTANCE.getConditionClinicalStatusCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionVerificationStatus <em>Condition Verification Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionVerificationStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionVerificationStatus()
		 * @generated
		 */
		EEnum CONDITION_VERIFICATION_STATUS = eINSTANCE.getConditionVerificationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionDiagnosisSeverity <em>Condition Diagnosis Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionDiagnosisSeverity
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionDiagnosisSeverity()
		 * @generated
		 */
		EEnum CONDITION_DIAGNOSIS_SEVERITY = eINSTANCE.getConditionDiagnosisSeverity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionStage <em>Condition Stage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionStage
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionStage()
		 * @generated
		 */
		EEnum CONDITION_STAGE = eINSTANCE.getConditionStage();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ClinicalImpressionStatus <em>Clinical Impression Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ClinicalImpressionStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getClinicalImpressionStatus()
		 * @generated
		 */
		EEnum CLINICAL_IMPRESSION_STATUS = eINSTANCE.getClinicalImpressionStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSubstanceAndNegationCodes <em>Allergy Intolerance Substance And Negation Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSubstanceAndNegationCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceSubstanceAndNegationCodes()
		 * @generated
		 */
		EEnum ALLERGY_INTOLERANCE_SUBSTANCE_AND_NEGATION_CODES = eINSTANCE.getAllergyIntoleranceSubstanceAndNegationCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceStatus <em>Allergy Intolerance Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceStatus()
		 * @generated
		 */
		EEnum ALLERGY_INTOLERANCE_STATUS = eINSTANCE.getAllergyIntoleranceStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCriticality <em>Allergy Intolerance Criticality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCriticality
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceCriticality()
		 * @generated
		 */
		EEnum ALLERGY_INTOLERANCE_CRITICALITY = eINSTANCE.getAllergyIntoleranceCriticality();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceType <em>Allergy Intolerance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceType()
		 * @generated
		 */
		EEnum ALLERGY_INTOLERANCE_TYPE = eINSTANCE.getAllergyIntoleranceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCategory <em>Allergy Intolerance Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCategory
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceCategory()
		 * @generated
		 */
		EEnum ALLERGY_INTOLERANCE_CATEGORY = eINSTANCE.getAllergyIntoleranceCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCertainty <em>Allergy Intolerance Certainty</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceCertainty
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceCertainty()
		 * @generated
		 */
		EEnum ALLERGY_INTOLERANCE_CERTAINTY = eINSTANCE.getAllergyIntoleranceCertainty();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtManifestationCodes <em>Snomed Ct Manifestation Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtManifestationCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtManifestationCodes()
		 * @generated
		 */
		EEnum SNOMED_CT_MANIFESTATION_CODES = eINSTANCE.getSnomedCtManifestationCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSeverity <em>Allergy Intolerance Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AllergyIntoleranceSeverity
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAllergyIntoleranceSeverity()
		 * @generated
		 */
		EEnum ALLERGY_INTOLERANCE_SEVERITY = eINSTANCE.getAllergyIntoleranceSeverity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtRouteCodes <em>Snomed Ct Route Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtRouteCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtRouteCodes()
		 * @generated
		 */
		EEnum SNOMED_CT_ROUTE_CODES = eINSTANCE.getSnomedCtRouteCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtClinicalFindings <em>Snomed Ct Clinical Findings</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtClinicalFindings
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtClinicalFindings()
		 * @generated
		 */
		EEnum SNOMED_CT_CLINICAL_FINDINGS = eINSTANCE.getSnomedCtClinicalFindings();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.InvestigationType <em>Investigation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.InvestigationType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getInvestigationType()
		 * @generated
		 */
		EEnum INVESTIGATION_TYPE = eINSTANCE.getInvestigationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationStatus <em>Observation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationStatus()
		 * @generated
		 */
		EEnum OBSERVATION_STATUS = eINSTANCE.getObservationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationCategoryCodes <em>Observation Category Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationCategoryCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationCategoryCodes()
		 * @generated
		 */
		EEnum OBSERVATION_CATEGORY_CODES = eINSTANCE.getObservationCategoryCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationValueAbsentReason <em>Observation Value Absent Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationValueAbsentReason
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationValueAbsentReason()
		 * @generated
		 */
		EEnum OBSERVATION_VALUE_ABSENT_REASON = eINSTANCE.getObservationValueAbsentReason();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationInterpretationCodes <em>Observation Interpretation Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationInterpretationCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationInterpretationCodes()
		 * @generated
		 */
		EEnum OBSERVATION_INTERPRETATION_CODES = eINSTANCE.getObservationInterpretationCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtBodyStructures <em>Snomed Ct Body Structures</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtBodyStructures
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtBodyStructures()
		 * @generated
		 */
		EEnum SNOMED_CT_BODY_STRUCTURES = eINSTANCE.getSnomedCtBodyStructures();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationMethods <em>Observation Methods</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationMethods
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationMethods()
		 * @generated
		 */
		EEnum OBSERVATION_METHODS = eINSTANCE.getObservationMethods();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenStatus <em>Specimen Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecimenStatus()
		 * @generated
		 */
		EEnum SPECIMEN_STATUS = eINSTANCE.getSpecimenStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V2SpecimenType <em>V2 Specimen Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.V2SpecimenType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV2SpecimenType()
		 * @generated
		 */
		EEnum V2_SPECIMEN_TYPE = eINSTANCE.getV2SpecimenType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenCollectionMethod <em>Specimen Collection Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenCollectionMethod
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecimenCollectionMethod()
		 * @generated
		 */
		EEnum SPECIMEN_COLLECTION_METHOD = eINSTANCE.getSpecimenCollectionMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenTreatmentProcedure <em>Specimen Treatment Procedure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenTreatmentProcedure
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecimenTreatmentProcedure()
		 * @generated
		 */
		EEnum SPECIMEN_TREATMENT_PROCEDURE = eINSTANCE.getSpecimenTreatmentProcedure();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecimenContainer <em>Specimen Container</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecimenContainer
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecimenContainer()
		 * @generated
		 */
		EEnum SPECIMEN_CONTAINER = eINSTANCE.getSpecimenContainer();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V2AdditivePreservative <em>V2 Additive Preservative</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.V2AdditivePreservative
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV2AdditivePreservative()
		 * @generated
		 */
		EEnum V2_ADDITIVE_PRESERVATIVE = eINSTANCE.getV2AdditivePreservative();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MeasmntPrinciple <em>Measmnt Principle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MeasmntPrinciple
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMeasmntPrinciple()
		 * @generated
		 */
		EEnum MEASMNT_PRINCIPLE = eINSTANCE.getMeasmntPrinciple();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricOperationalStatus <em>Device Metric Operational Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricOperationalStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricOperationalStatus()
		 * @generated
		 */
		EEnum DEVICE_METRIC_OPERATIONAL_STATUS = eINSTANCE.getDeviceMetricOperationalStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricColor <em>Device Metric Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricColor
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricColor()
		 * @generated
		 */
		EEnum DEVICE_METRIC_COLOR = eINSTANCE.getDeviceMetricColor();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCategory <em>Device Metric Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCategory
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricCategory()
		 * @generated
		 */
		EEnum DEVICE_METRIC_CATEGORY = eINSTANCE.getDeviceMetricCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationType <em>Device Metric Calibration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricCalibrationType()
		 * @generated
		 */
		EEnum DEVICE_METRIC_CALIBRATION_TYPE = eINSTANCE.getDeviceMetricCalibrationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationState <em>Device Metric Calibration State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceMetricCalibrationState
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceMetricCalibrationState()
		 * @generated
		 */
		EEnum DEVICE_METRIC_CALIBRATION_STATE = eINSTANCE.getDeviceMetricCalibrationState();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationReferenceRangeMeaningCodes <em>Observation Reference Range Meaning Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationReferenceRangeMeaningCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationReferenceRangeMeaningCodes()
		 * @generated
		 */
		EEnum OBSERVATION_REFERENCE_RANGE_MEANING_CODES = eINSTANCE.getObservationReferenceRangeMeaningCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ObservationRelationshipType <em>Observation Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ObservationRelationshipType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getObservationRelationshipType()
		 * @generated
		 */
		EEnum OBSERVATION_RELATIONSHIP_TYPE = eINSTANCE.getObservationRelationshipType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireStatus <em>Questionnaire Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireStatus()
		 * @generated
		 */
		EEnum QUESTIONNAIRE_STATUS = eINSTANCE.getQuestionnaireStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireQuestionCodes <em>Questionnaire Question Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireQuestionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireQuestionCodes()
		 * @generated
		 */
		EEnum QUESTIONNAIRE_QUESTION_CODES = eINSTANCE.getQuestionnaireQuestionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireItemType <em>Questionnaire Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireItemType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireItemType()
		 * @generated
		 */
		EEnum QUESTIONNAIRE_ITEM_TYPE = eINSTANCE.getQuestionnaireItemType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireAnswerCodes <em>Questionnaire Answer Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireAnswerCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireAnswerCodes()
		 * @generated
		 */
		EEnum QUESTIONNAIRE_ANSWER_CODES = eINSTANCE.getQuestionnaireAnswerCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireResponseStatus <em>Questionnaire Response Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.QuestionnaireResponseStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getQuestionnaireResponseStatus()
		 * @generated
		 */
		EEnum QUESTIONNAIRE_RESPONSE_STATUS = eINSTANCE.getQuestionnaireResponseStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FamilyHistoryStatus <em>Family History Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FamilyHistoryStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFamilyHistoryStatus()
		 * @generated
		 */
		EEnum FAMILY_HISTORY_STATUS = eINSTANCE.getFamilyHistoryStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FamilyMember <em>Family Member</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FamilyMember
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFamilyMember()
		 * @generated
		 */
		EEnum FAMILY_MEMBER = eINSTANCE.getFamilyMember();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionOutcomeCodes <em>Condition Outcome Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionOutcomeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionOutcomeCodes()
		 * @generated
		 */
		EEnum CONDITION_OUTCOME_CODES = eINSTANCE.getConditionOutcomeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticReportStatus <em>Diagnostic Report Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticReportStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticReportStatus()
		 * @generated
		 */
		EEnum DIAGNOSTIC_REPORT_STATUS = eINSTANCE.getDiagnosticReportStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticServiceSectionCodes <em>Diagnostic Service Section Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticServiceSectionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticServiceSectionCodes()
		 * @generated
		 */
		EEnum DIAGNOSTIC_SERVICE_SECTION_CODES = eINSTANCE.getDiagnosticServiceSectionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticReportCodes <em>Loinc Diagnostic Report Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticReportCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLoincDiagnosticReportCodes()
		 * @generated
		 */
		EEnum LOINC_DIAGNOSTIC_REPORT_CODES = eINSTANCE.getLoincDiagnosticReportCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentTypeValueSet <em>Document Type Value Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentTypeValueSet
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentTypeValueSet()
		 * @generated
		 */
		EEnum DOCUMENT_TYPE_VALUE_SET = eINSTANCE.getDocumentTypeValueSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentClassValueSet <em>Document Class Value Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentClassValueSet
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentClassValueSet()
		 * @generated
		 */
		EEnum DOCUMENT_CLASS_VALUE_SET = eINSTANCE.getDocumentClassValueSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceStatus <em>Document Reference Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentReferenceStatus()
		 * @generated
		 */
		EEnum DOCUMENT_REFERENCE_STATUS = eINSTANCE.getDocumentReferenceStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CompositionStatus <em>Composition Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CompositionStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCompositionStatus()
		 * @generated
		 */
		EEnum COMPOSITION_STATUS = eINSTANCE.getCompositionStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentRelationshipType <em>Document Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentRelationshipType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentRelationshipType()
		 * @generated
		 */
		EEnum DOCUMENT_RELATIONSHIP_TYPE = eINSTANCE.getDocumentRelationshipType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceFormatCodeSet <em>Document Reference Format Code Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentReferenceFormatCodeSet
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentReferenceFormatCodeSet()
		 * @generated
		 */
		EEnum DOCUMENT_REFERENCE_FORMAT_CODE_SET = eINSTANCE.getDocumentReferenceFormatCodeSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemActCode <em>V3 Code System Act Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemActCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV3CodeSystemActCode()
		 * @generated
		 */
		EEnum V3_CODE_SYSTEM_ACT_CODE = eINSTANCE.getV3CodeSystemActCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FacilityTypeCodeValueSet <em>Facility Type Code Value Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FacilityTypeCodeValueSet
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFacilityTypeCodeValueSet()
		 * @generated
		 */
		EEnum FACILITY_TYPE_CODE_VALUE_SET = eINSTANCE.getFacilityTypeCodeValueSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderStatus <em>Diagnostic Order Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticOrderStatus()
		 * @generated
		 */
		EEnum DIAGNOSTIC_ORDER_STATUS = eINSTANCE.getDiagnosticOrderStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderPriority <em>Diagnostic Order Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderPriority
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticOrderPriority()
		 * @generated
		 */
		EEnum DIAGNOSTIC_ORDER_PRIORITY = eINSTANCE.getDiagnosticOrderPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderEventCodes <em>Diagnostic Order Event Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DiagnosticOrderEventCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiagnosticOrderEventCodes()
		 * @generated
		 */
		EEnum DIAGNOSTIC_ORDER_EVENT_CODES = eINSTANCE.getDiagnosticOrderEventCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticOrderCodes <em>Loinc Diagnostic Order Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.LoincDiagnosticOrderCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLoincDiagnosticOrderCodes()
		 * @generated
		 */
		EEnum LOINC_DIAGNOSTIC_ORDER_CODES = eINSTANCE.getLoincDiagnosticOrderCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCodessnomedCT <em>Procedure Codessnomed CT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCodessnomedCT
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureCodessnomedCT()
		 * @generated
		 */
		EEnum PROCEDURE_CODESSNOMED_CT = eINSTANCE.getProcedureCodessnomedCT();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureReasonCodes <em>Procedure Reason Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureReasonCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureReasonCodes()
		 * @generated
		 */
		EEnum PROCEDURE_REASON_CODES = eINSTANCE.getProcedureReasonCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestStatus <em>Procedure Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureRequestStatus()
		 * @generated
		 */
		EEnum PROCEDURE_REQUEST_STATUS = eINSTANCE.getProcedureRequestStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestPriority <em>Procedure Request Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureRequestPriority
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureRequestPriority()
		 * @generated
		 */
		EEnum PROCEDURE_REQUEST_PRIORITY = eINSTANCE.getProcedureRequestPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReferralStatus <em>Referral Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReferralStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getReferralStatus()
		 * @generated
		 */
		EEnum REFERRAL_STATUS = eINSTANCE.getReferralStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AcquisitionModalityCodes <em>Acquisition Modality Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AcquisitionModalityCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAcquisitionModalityCodes()
		 * @generated
		 */
		EEnum ACQUISITION_MODALITY_CODES = eINSTANCE.getAcquisitionModalityCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.InstanceAvailability <em>Instance Availability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.InstanceAvailability
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getInstanceAvailability()
		 * @generated
		 */
		EEnum INSTANCE_AVAILABILITY = eINSTANCE.getInstanceAvailability();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureStatus <em>Procedure Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureStatus()
		 * @generated
		 */
		EEnum PROCEDURE_STATUS = eINSTANCE.getProcedureStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCategoryCodessnomedCT <em>Procedure Category Codessnomed CT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureCategoryCodessnomedCT
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureCategoryCodessnomedCT()
		 * @generated
		 */
		EEnum PROCEDURE_CATEGORY_CODESSNOMED_CT = eINSTANCE.getProcedureCategoryCodessnomedCT();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureNotPerformedReasonsnomeDCT <em>Procedure Not Performed Reasonsnome DCT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureNotPerformedReasonsnomeDCT
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureNotPerformedReasonsnomeDCT()
		 * @generated
		 */
		EEnum PROCEDURE_NOT_PERFORMED_REASONSNOME_DCT = eINSTANCE.getProcedureNotPerformedReasonsnomeDCT();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedurePerformerRoleCodes <em>Procedure Performer Role Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedurePerformerRoleCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedurePerformerRoleCodes()
		 * @generated
		 */
		EEnum PROCEDURE_PERFORMER_ROLE_CODES = eINSTANCE.getProcedurePerformerRoleCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureOutcomeCodessnomedCT <em>Procedure Outcome Codessnomed CT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureOutcomeCodessnomedCT
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureOutcomeCodessnomedCT()
		 * @generated
		 */
		EEnum PROCEDURE_OUTCOME_CODESSNOMED_CT = eINSTANCE.getProcedureOutcomeCodessnomedCT();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureFollowUpCodessnomedCT <em>Procedure Follow Up Codessnomed CT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureFollowUpCodessnomedCT
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureFollowUpCodessnomedCT()
		 * @generated
		 */
		EEnum PROCEDURE_FOLLOW_UP_CODESSNOMED_CT = eINSTANCE.getProcedureFollowUpCodessnomedCT();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanStatus <em>Care Plan Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanStatus()
		 * @generated
		 */
		EEnum CARE_PLAN_STATUS = eINSTANCE.getCarePlanStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanCategory <em>Care Plan Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanCategory
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanCategory()
		 * @generated
		 */
		EEnum CARE_PLAN_CATEGORY = eINSTANCE.getCarePlanCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanRelationship <em>Care Plan Relationship</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanRelationship
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanRelationship()
		 * @generated
		 */
		EEnum CARE_PLAN_RELATIONSHIP = eINSTANCE.getCarePlanRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRoles <em>Participant Roles</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRoles
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipantRoles()
		 * @generated
		 */
		EEnum PARTICIPANT_ROLES = eINSTANCE.getParticipantRoles();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStartEvent <em>Goal Start Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStartEvent
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalStartEvent()
		 * @generated
		 */
		EEnum GOAL_START_EVENT = eINSTANCE.getGoalStartEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalCategory <em>Goal Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalCategory
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalCategory()
		 * @generated
		 */
		EEnum GOAL_CATEGORY = eINSTANCE.getGoalCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStatus <em>Goal Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalStatus()
		 * @generated
		 */
		EEnum GOAL_STATUS = eINSTANCE.getGoalStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalStatusReason <em>Goal Status Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalStatusReason
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalStatusReason()
		 * @generated
		 */
		EEnum GOAL_STATUS_REASON = eINSTANCE.getGoalStatusReason();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GoalPriority <em>Goal Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GoalPriority
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGoalPriority()
		 * @generated
		 */
		EEnum GOAL_PRIORITY = eINSTANCE.getGoalPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationStatementStatus <em>Medication Statement Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationStatementStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationStatementStatus()
		 * @generated
		 */
		EEnum MEDICATION_STATEMENT_STATUS = eINSTANCE.getMedicationStatementStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationNotGivenCodes <em>Reason Medication Not Given Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationNotGivenCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getReasonMedicationNotGivenCodes()
		 * @generated
		 */
		EEnum REASON_MEDICATION_NOT_GIVEN_CODES = eINSTANCE.getReasonMedicationNotGivenCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BodysiteLocationModifier <em>Bodysite Location Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.BodysiteLocationModifier
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBodysiteLocationModifier()
		 * @generated
		 */
		EEnum BODYSITE_LOCATION_MODIFIER = eINSTANCE.getBodysiteLocationModifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtAnatomicalStructureForAdministrationSiteCodes <em>Snomed Ct Anatomical Structure For Administration Site Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SnomedCtAnatomicalStructureForAdministrationSiteCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSnomedCtAnatomicalStructureForAdministrationSiteCodes()
		 * @generated
		 */
		EEnum SNOMED_CT_ANATOMICAL_STRUCTURE_FOR_ADMINISTRATION_SITE_CODES = eINSTANCE.getSnomedCtAnatomicalStructureForAdministrationSiteCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NutritionOrderStatus <em>Nutrition Order Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.NutritionOrderStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNutritionOrderStatus()
		 * @generated
		 */
		EEnum NUTRITION_ORDER_STATUS = eINSTANCE.getNutritionOrderStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Diet <em>Diet</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.Diet
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDiet()
		 * @generated
		 */
		EEnum DIET = eINSTANCE.getDiet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FoodTypeCodes <em>Food Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FoodTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFoodTypeCodes()
		 * @generated
		 */
		EEnum FOOD_TYPE_CODES = eINSTANCE.getFoodTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DietCodes <em>Diet Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DietCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDietCodes()
		 * @generated
		 */
		EEnum DIET_CODES = eINSTANCE.getDietCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NutrientModifierCodes <em>Nutrient Modifier Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.NutrientModifierCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNutrientModifierCodes()
		 * @generated
		 */
		EEnum NUTRIENT_MODIFIER_CODES = eINSTANCE.getNutrientModifierCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TextureModifierCodes <em>Texture Modifier Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.TextureModifierCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTextureModifierCodes()
		 * @generated
		 */
		EEnum TEXTURE_MODIFIER_CODES = eINSTANCE.getTextureModifierCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TextureModifiedFoodTypeCodes <em>Texture Modified Food Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.TextureModifiedFoodTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTextureModifiedFoodTypeCodes()
		 * @generated
		 */
		EEnum TEXTURE_MODIFIED_FOOD_TYPE_CODES = eINSTANCE.getTextureModifiedFoodTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FluidConsistencyTypeCodes <em>Fluid Consistency Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FluidConsistencyTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFluidConsistencyTypeCodes()
		 * @generated
		 */
		EEnum FLUID_CONSISTENCY_TYPE_CODES = eINSTANCE.getFluidConsistencyTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplementTypeCodes <em>Supplement Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplementTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplementTypeCodes()
		 * @generated
		 */
		EEnum SUPPLEMENT_TYPE_CODES = eINSTANCE.getSupplementTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaTypeCodes <em>Enteral Formula Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEnteralFormulaTypeCodes()
		 * @generated
		 */
		EEnum ENTERAL_FORMULA_TYPE_CODES = eINSTANCE.getEnteralFormulaTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaAdditiveTypeCode <em>Enteral Formula Additive Type Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralFormulaAdditiveTypeCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEnteralFormulaAdditiveTypeCode()
		 * @generated
		 */
		EEnum ENTERAL_FORMULA_ADDITIVE_TYPE_CODE = eINSTANCE.getEnteralFormulaAdditiveTypeCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EnteralRouteCodes <em>Enteral Route Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EnteralRouteCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEnteralRouteCodes()
		 * @generated
		 */
		EEnum ENTERAL_ROUTE_CODES = eINSTANCE.getEnteralRouteCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RiskProbability <em>Risk Probability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.RiskProbability
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRiskProbability()
		 * @generated
		 */
		EEnum RISK_PROBABILITY = eINSTANCE.getRiskProbability();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AppointmentStatus <em>Appointment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AppointmentStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAppointmentStatus()
		 * @generated
		 */
		EEnum APPOINTMENT_STATUS = eINSTANCE.getAppointmentStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterReasonCodes <em>Encounter Reason Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterReasonCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterReasonCodes()
		 * @generated
		 */
		EEnum ENCOUNTER_REASON_CODES = eINSTANCE.getEncounterReasonCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SlotStatus <em>Slot Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SlotStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSlotStatus()
		 * @generated
		 */
		EEnum SLOT_STATUS = eINSTANCE.getSlotStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantType <em>Participant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipantType()
		 * @generated
		 */
		EEnum PARTICIPANT_TYPE = eINSTANCE.getParticipantType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRequired <em>Participant Required</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantRequired
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipantRequired()
		 * @generated
		 */
		EEnum PARTICIPANT_REQUIRED = eINSTANCE.getParticipantRequired();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipationStatus <em>Participation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipationStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipationStatus()
		 * @generated
		 */
		EEnum PARTICIPATION_STATUS = eINSTANCE.getParticipationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CommunicationRequestStatus <em>Communication Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CommunicationRequestStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCommunicationRequestStatus()
		 * @generated
		 */
		EEnum COMMUNICATION_REQUEST_STATUS = eINSTANCE.getCommunicationRequestStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestStatus <em>Device Use Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceUseRequestStatus()
		 * @generated
		 */
		EEnum DEVICE_USE_REQUEST_STATUS = eINSTANCE.getDeviceUseRequestStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestPriority <em>Device Use Request Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DeviceUseRequestPriority
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDeviceUseRequestPriority()
		 * @generated
		 */
		EEnum DEVICE_USE_REQUEST_PRIORITY = eINSTANCE.getDeviceUseRequestPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationOrderStatus <em>Medication Order Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationOrderStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationOrderStatus()
		 * @generated
		 */
		EEnum MEDICATION_ORDER_STATUS = eINSTANCE.getMedicationOrderStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActSubstanceAdminSubstitutionCode <em>Act Substance Admin Substitution Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActSubstanceAdminSubstitutionCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActSubstanceAdminSubstitutionCode()
		 * @generated
		 */
		EEnum ACT_SUBSTANCE_ADMIN_SUBSTITUTION_CODE = eINSTANCE.getActSubstanceAdminSubstitutionCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubstanceAdminSubstitutionReason <em>Substance Admin Substitution Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubstanceAdminSubstitutionReason
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubstanceAdminSubstitutionReason()
		 * @generated
		 */
		EEnum SUBSTANCE_ADMIN_SUBSTITUTION_REASON = eINSTANCE.getSubstanceAdminSubstitutionReason();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActionList <em>Action List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActionList
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActionList()
		 * @generated
		 */
		EEnum ACTION_LIST = eINSTANCE.getActionList();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RulesetCodes <em>Ruleset Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.RulesetCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRulesetCodes()
		 * @generated
		 */
		EEnum RULESET_CODES = eINSTANCE.getRulesetCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestStatus <em>Supply Request Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyRequestStatus()
		 * @generated
		 */
		EEnum SUPPLY_REQUEST_STATUS = eINSTANCE.getSupplyRequestStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyType <em>Supply Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyType()
		 * @generated
		 */
		EEnum SUPPLY_TYPE = eINSTANCE.getSupplyType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestReason <em>Supply Request Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestReason
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyRequestReason()
		 * @generated
		 */
		EEnum SUPPLY_REQUEST_REASON = eINSTANCE.getSupplyRequestReason();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestWhen <em>Supply Request When</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyRequestWhen
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyRequestWhen()
		 * @generated
		 */
		EEnum SUPPLY_REQUEST_WHEN = eINSTANCE.getSupplyRequestWhen();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleVisionPrescriptionProductCodes <em>Example Vision Prescription Product Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleVisionPrescriptionProductCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExampleVisionPrescriptionProductCodes()
		 * @generated
		 */
		EEnum EXAMPLE_VISION_PRESCRIPTION_PRODUCT_CODES = eINSTANCE.getExampleVisionPrescriptionProductCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VisionEyes <em>Vision Eyes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.VisionEyes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVisionEyes()
		 * @generated
		 */
		EEnum VISION_EYES = eINSTANCE.getVisionEyes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VisionBase <em>Vision Base</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.VisionBase
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVisionBase()
		 * @generated
		 */
		EEnum VISION_BASE = eINSTANCE.getVisionBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityCategory <em>Care Plan Activity Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityCategory
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanActivityCategory()
		 * @generated
		 */
		EEnum CARE_PLAN_ACTIVITY_CATEGORY = eINSTANCE.getCarePlanActivityCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivity <em>Care Plan Activity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivity
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanActivity()
		 * @generated
		 */
		EEnum CARE_PLAN_ACTIVITY = eINSTANCE.getCarePlanActivity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActivityReason <em>Activity Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActivityReason
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActivityReason()
		 * @generated
		 */
		EEnum ACTIVITY_REASON = eINSTANCE.getActivityReason();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityStatus <em>Care Plan Activity Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CarePlanActivityStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCarePlanActivityStatus()
		 * @generated
		 */
		EEnum CARE_PLAN_ACTIVITY_STATUS = eINSTANCE.getCarePlanActivityStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcedureDeviceActionCodes <em>Procedure Device Action Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcedureDeviceActionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcedureDeviceActionCodes()
		 * @generated
		 */
		EEnum PROCEDURE_DEVICE_ACTION_CODES = eINSTANCE.getProcedureDeviceActionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Laterality <em>Laterality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.Laterality
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLaterality()
		 * @generated
		 */
		EEnum LATERALITY = eINSTANCE.getLaterality();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.KoStitle <em>Ko Stitle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.KoStitle
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getKoStitle()
		 * @generated
		 */
		EEnum KO_STITLE = eINSTANCE.getKoStitle();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DigitalMediaType <em>Digital Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DigitalMediaType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDigitalMediaType()
		 * @generated
		 */
		EEnum DIGITAL_MEDIA_TYPE = eINSTANCE.getDigitalMediaType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaSubType <em>Media Sub Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaSubType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMediaSubType()
		 * @generated
		 */
		EEnum MEDIA_SUB_TYPE = eINSTANCE.getMediaSubType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaCollectionViewProjection <em>Media Collection View Projection</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaCollectionViewProjection
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMediaCollectionViewProjection()
		 * @generated
		 */
		EEnum MEDIA_COLLECTION_VIEW_PROJECTION = eINSTANCE.getMediaCollectionViewProjection();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ManifestationAndSymptomCodes <em>Manifestation And Symptom Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ManifestationAndSymptomCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getManifestationAndSymptomCodes()
		 * @generated
		 */
		EEnum MANIFESTATION_AND_SYMPTOM_CODES = eINSTANCE.getManifestationAndSymptomCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdmitSource <em>Admit Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdmitSource
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdmitSource()
		 * @generated
		 */
		EEnum ADMIT_SOURCE = eINSTANCE.getAdmitSource();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecialCourtesy <em>Special Courtesy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecialCourtesy
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecialCourtesy()
		 * @generated
		 */
		EEnum SPECIAL_COURTESY = eINSTANCE.getSpecialCourtesy();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SpecialArrangements <em>Special Arrangements</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SpecialArrangements
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSpecialArrangements()
		 * @generated
		 */
		EEnum SPECIAL_ARRANGEMENTS = eINSTANCE.getSpecialArrangements();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DischargeDisposition <em>Discharge Disposition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DischargeDisposition
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDischargeDisposition()
		 * @generated
		 */
		EEnum DISCHARGE_DISPOSITION = eINSTANCE.getDischargeDisposition();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.EncounterLocationStatus <em>Encounter Location Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.EncounterLocationStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEncounterLocationStatus()
		 * @generated
		 */
		EEnum ENCOUNTER_LOCATION_STATUS = eINSTANCE.getEncounterLocationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemType <em>Naming System Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNamingSystemType()
		 * @generated
		 */
		EEnum NAMING_SYSTEM_TYPE = eINSTANCE.getNamingSystemType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemIdentifierType <em>Naming System Identifier Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.NamingSystemIdentifierType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNamingSystemIdentifierType()
		 * @generated
		 */
		EEnum NAMING_SYSTEM_IDENTIFIER_TYPE = eINSTANCE.getNamingSystemIdentifierType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConceptMapEquivalence <em>Concept Map Equivalence</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConceptMapEquivalence
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConceptMapEquivalence()
		 * @generated
		 */
		EEnum CONCEPT_MAP_EQUIVALENCE = eINSTANCE.getConceptMapEquivalence();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagCategory <em>Flag Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagCategory
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFlagCategory()
		 * @generated
		 */
		EEnum FLAG_CATEGORY = eINSTANCE.getFlagCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagStatus <em>Flag Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFlagStatus()
		 * @generated
		 */
		EEnum FLAG_STATUS = eINSTANCE.getFlagStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FlagCode <em>Flag Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FlagCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFlagCode()
		 * @generated
		 */
		EEnum FLAG_CODE = eINSTANCE.getFlagCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SequenceType <em>Sequence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SequenceType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSequenceType()
		 * @generated
		 */
		EEnum SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DbSnp <em>Db Snp</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DbSnp
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDbSnp()
		 * @generated
		 */
		EEnum DB_SNP = eINSTANCE.getDbSnp();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Ensembl <em>Ensembl</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.Ensembl
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getEnsembl()
		 * @generated
		 */
		EEnum ENSEMBL = eINSTANCE.getEnsembl();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Loinc530345Answerlist <em>Loinc530345 Answerlist</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.Loinc530345Answerlist
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getLoinc530345Answerlist()
		 * @generated
		 */
		EEnum LOINC530345_ANSWERLIST = eINSTANCE.getLoinc530345Answerlist();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTypeCodes <em>Contract Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractTypeCodes()
		 * @generated
		 */
		EEnum CONTRACT_TYPE_CODES = eINSTANCE.getContractTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractSubtypeCodes <em>Contract Subtype Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractSubtypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractSubtypeCodes()
		 * @generated
		 */
		EEnum CONTRACT_SUBTYPE_CODES = eINSTANCE.getContractSubtypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractActionCodes <em>Contract Action Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractActionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractActionCodes()
		 * @generated
		 */
		EEnum CONTRACT_ACTION_CODES = eINSTANCE.getContractActionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PurposeOfUse <em>Purpose Of Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PurposeOfUse
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPurposeOfUse()
		 * @generated
		 */
		EEnum PURPOSE_OF_USE = eINSTANCE.getPurposeOfUse();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractActorRoleCodes <em>Contract Actor Role Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractActorRoleCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractActorRoleCodes()
		 * @generated
		 */
		EEnum CONTRACT_ACTOR_ROLE_CODES = eINSTANCE.getContractActorRoleCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractSignerTypeCodes <em>Contract Signer Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractSignerTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractSignerTypeCodes()
		 * @generated
		 */
		EEnum CONTRACT_SIGNER_TYPE_CODES = eINSTANCE.getContractSignerTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTermTypeCodes <em>Contract Term Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTermTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractTermTypeCodes()
		 * @generated
		 */
		EEnum CONTRACT_TERM_TYPE_CODES = eINSTANCE.getContractTermTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContractTermSubTypeCodes <em>Contract Term Sub Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContractTermSubTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContractTermSubTypeCodes()
		 * @generated
		 */
		EEnum CONTRACT_TERM_SUB_TYPE_CODES = eINSTANCE.getContractTermSubTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentTypeCodes <em>Fhir Document Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFhirDocumentTypeCodes()
		 * @generated
		 */
		EEnum FHIR_DOCUMENT_TYPE_CODES = eINSTANCE.getFhirDocumentTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentClassCodes <em>Fhir Document Class Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirDocumentClassCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFhirDocumentClassCodes()
		 * @generated
		 */
		EEnum FHIR_DOCUMENT_CLASS_CODES = eINSTANCE.getFhirDocumentClassCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemConfidentiality <em>V3 Code System Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemConfidentiality
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV3CodeSystemConfidentiality()
		 * @generated
		 */
		EEnum V3_CODE_SYSTEM_CONFIDENTIALITY = eINSTANCE.getV3CodeSystemConfidentiality();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CompositionAttestationMode <em>Composition Attestation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CompositionAttestationMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCompositionAttestationMode()
		 * @generated
		 */
		EEnum COMPOSITION_ATTESTATION_MODE = eINSTANCE.getCompositionAttestationMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentSectionCodes <em>Document Section Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentSectionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentSectionCodes()
		 * @generated
		 */
		EEnum DOCUMENT_SECTION_CODES = eINSTANCE.getDocumentSectionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListMode <em>List Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getListMode()
		 * @generated
		 */
		EEnum LIST_MODE = eINSTANCE.getListMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListOrderCodes <em>List Order Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListOrderCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getListOrderCodes()
		 * @generated
		 */
		EEnum LIST_ORDER_CODES = eINSTANCE.getListOrderCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListEmptyReasons <em>List Empty Reasons</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListEmptyReasons
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getListEmptyReasons()
		 * @generated
		 */
		EEnum LIST_EMPTY_REASONS = eINSTANCE.getListEmptyReasons();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RemittanceOutcome <em>Remittance Outcome</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.RemittanceOutcome
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRemittanceOutcome()
		 * @generated
		 */
		EEnum REMITTANCE_OUTCOME = eINSTANCE.getRemittanceOutcome();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentTypeCodes <em>Payment Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPaymentTypeCodes()
		 * @generated
		 */
		EEnum PAYMENT_TYPE_CODES = eINSTANCE.getPaymentTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FormCodes <em>Form Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FormCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFormCodes()
		 * @generated
		 */
		EEnum FORM_CODES = eINSTANCE.getFormCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NoteType <em>Note Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.NoteType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNoteType()
		 * @generated
		 */
		EEnum NOTE_TYPE = eINSTANCE.getNoteType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceStatementKind <em>Conformance Statement Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceStatementKind
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConformanceStatementKind()
		 * @generated
		 */
		EEnum CONFORMANCE_STATEMENT_KIND = eINSTANCE.getConformanceStatementKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnknownContentCode <em>Unknown Content Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnknownContentCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUnknownContentCode()
		 * @generated
		 */
		EEnum UNKNOWN_CONTENT_CODE = eINSTANCE.getUnknownContentCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RestfulConformanceMode <em>Restful Conformance Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.RestfulConformanceMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRestfulConformanceMode()
		 * @generated
		 */
		EEnum RESTFUL_CONFORMANCE_MODE = eINSTANCE.getRestfulConformanceMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RestfulSecurityService <em>Restful Security Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.RestfulSecurityService
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRestfulSecurityService()
		 * @generated
		 */
		EEnum RESTFUL_SECURITY_SERVICE = eINSTANCE.getRestfulSecurityService();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TypeRestfulInteraction <em>Type Restful Interaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.TypeRestfulInteraction
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTypeRestfulInteraction()
		 * @generated
		 */
		EEnum TYPE_RESTFUL_INTERACTION = eINSTANCE.getTypeRestfulInteraction();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResourceVersionPolicy <em>Resource Version Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResourceVersionPolicy
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getResourceVersionPolicy()
		 * @generated
		 */
		EEnum RESOURCE_VERSION_POLICY = eINSTANCE.getResourceVersionPolicy();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionalDeleteStatus <em>Conditional Delete Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionalDeleteStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionalDeleteStatus()
		 * @generated
		 */
		EEnum CONDITIONAL_DELETE_STATUS = eINSTANCE.getConditionalDeleteStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchParamType <em>Search Param Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchParamType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSearchParamType()
		 * @generated
		 */
		EEnum SEARCH_PARAM_TYPE = eINSTANCE.getSearchParamType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchModifierCode <em>Search Modifier Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchModifierCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSearchModifierCode()
		 * @generated
		 */
		EEnum SEARCH_MODIFIER_CODE = eINSTANCE.getSearchModifierCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SystemRestfulInteraction <em>System Restful Interaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SystemRestfulInteraction
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSystemRestfulInteraction()
		 * @generated
		 */
		EEnum SYSTEM_RESTFUL_INTERACTION = eINSTANCE.getSystemRestfulInteraction();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TransactionMode <em>Transaction Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.TransactionMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTransactionMode()
		 * @generated
		 */
		EEnum TRANSACTION_MODE = eINSTANCE.getTransactionMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationKind <em>Operation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationKind
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOperationKind()
		 * @generated
		 */
		EEnum OPERATION_KIND = eINSTANCE.getOperationKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageTransport <em>Message Transport</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageTransport
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMessageTransport()
		 * @generated
		 */
		EEnum MESSAGE_TRANSPORT = eINSTANCE.getMessageTransport();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageEvent <em>Message Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageEvent
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMessageEvent()
		 * @generated
		 */
		EEnum MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MessageSignificanceCategory <em>Message Significance Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MessageSignificanceCategory
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMessageSignificanceCategory()
		 * @generated
		 */
		EEnum MESSAGE_SIGNIFICANCE_CATEGORY = eINSTANCE.getMessageSignificanceCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConformanceEventMode <em>Conformance Event Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConformanceEventMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConformanceEventMode()
		 * @generated
		 */
		EEnum CONFORMANCE_EVENT_MODE = eINSTANCE.getConformanceEventMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DocumentMode <em>Document Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DocumentMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDocumentMode()
		 * @generated
		 */
		EEnum DOCUMENT_MODE = eINSTANCE.getDocumentMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProfileOriginType <em>Profile Origin Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProfileOriginType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProfileOriginType()
		 * @generated
		 */
		EEnum PROFILE_ORIGIN_TYPE = eINSTANCE.getProfileOriginType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProfileDestinationType <em>Profile Destination Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProfileDestinationType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProfileDestinationType()
		 * @generated
		 */
		EEnum PROFILE_DESTINATION_TYPE = eINSTANCE.getProfileDestinationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TestScriptOperationCodes <em>Test Script Operation Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.TestScriptOperationCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTestScriptOperationCodes()
		 * @generated
		 */
		EEnum TEST_SCRIPT_OPERATION_CODES = eINSTANCE.getTestScriptOperationCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ContentType <em>Content Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ContentType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getContentType()
		 * @generated
		 */
		EEnum CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionDirectionType <em>Assertion Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionDirectionType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAssertionDirectionType()
		 * @generated
		 */
		EEnum ASSERTION_DIRECTION_TYPE = eINSTANCE.getAssertionDirectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionOperatorType <em>Assertion Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionOperatorType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAssertionOperatorType()
		 * @generated
		 */
		EEnum ASSERTION_OPERATOR_TYPE = eINSTANCE.getAssertionOperatorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AssertionResponseTypes <em>Assertion Response Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AssertionResponseTypes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAssertionResponseTypes()
		 * @generated
		 */
		EEnum ASSERTION_RESPONSE_TYPES = eINSTANCE.getAssertionResponseTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DataElementStringency <em>Data Element Stringency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DataElementStringency
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDataElementStringency()
		 * @generated
		 */
		EEnum DATA_ELEMENT_STRINGENCY = eINSTANCE.getDataElementStringency();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleTriggerType <em>Decision Support Rule Trigger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleTriggerType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDecisionSupportRuleTriggerType()
		 * @generated
		 */
		EEnum DECISION_SUPPORT_RULE_TRIGGER_TYPE = eINSTANCE.getDecisionSupportRuleTriggerType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleParticipantType <em>Decision Support Rule Participant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleParticipantType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDecisionSupportRuleParticipantType()
		 * @generated
		 */
		EEnum DECISION_SUPPORT_RULE_PARTICIPANT_TYPE = eINSTANCE.getDecisionSupportRuleParticipantType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleActionType <em>Decision Support Rule Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DecisionSupportRuleActionType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDecisionSupportRuleActionType()
		 * @generated
		 */
		EEnum DECISION_SUPPORT_RULE_ACTION_TYPE = eINSTANCE.getDecisionSupportRuleActionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ResponseType <em>Response Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ResponseType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getResponseType()
		 * @generated
		 */
		EEnum RESPONSE_TYPE = eINSTANCE.getResponseType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IssueSeverity <em>Issue Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.IssueSeverity
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIssueSeverity()
		 * @generated
		 */
		EEnum ISSUE_SEVERITY = eINSTANCE.getIssueSeverity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IssueType <em>Issue Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.IssueType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIssueType()
		 * @generated
		 */
		EEnum ISSUE_TYPE = eINSTANCE.getIssueType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OperationOutcomeCodes <em>Operation Outcome Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OperationOutcomeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOperationOutcomeCodes()
		 * @generated
		 */
		EEnum OPERATION_OUTCOME_CODES = eINSTANCE.getOperationOutcomeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleMessageReasonCodes <em>Example Message Reason Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleMessageReasonCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExampleMessageReasonCodes()
		 * @generated
		 */
		EEnum EXAMPLE_MESSAGE_REASON_CODES = eINSTANCE.getExampleMessageReasonCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionStatus <em>Subscription Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubscriptionStatus()
		 * @generated
		 */
		EEnum SUBSCRIPTION_STATUS = eINSTANCE.getSubscriptionStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionChannelType <em>Subscription Channel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionChannelType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubscriptionChannelType()
		 * @generated
		 */
		EEnum SUBSCRIPTION_CHANNEL_TYPE = eINSTANCE.getSubscriptionChannelType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionTag <em>Subscription Tag</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SubscriptionTag
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSubscriptionTag()
		 * @generated
		 */
		EEnum SUBSCRIPTION_TAG = eINSTANCE.getSubscriptionTag();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActCoverageTypeCode <em>Act Coverage Type Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActCoverageTypeCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActCoverageTypeCode()
		 * @generated
		 */
		EEnum ACT_COVERAGE_TYPE_CODE = eINSTANCE.getActCoverageTypeCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.RelationshipCodes <em>Relationship Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.RelationshipCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getRelationshipCodes()
		 * @generated
		 */
		EEnum RELATIONSHIP_CODES = eINSTANCE.getRelationshipCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccineAdministeredValueSet <em>Vaccine Administered Value Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccineAdministeredValueSet
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVaccineAdministeredValueSet()
		 * @generated
		 */
		EEnum VACCINE_ADMINISTERED_VALUE_SET = eINSTANCE.getVaccineAdministeredValueSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationStatusCodes <em>Immunization Recommendation Status Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationStatusCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationRecommendationStatusCodes()
		 * @generated
		 */
		EEnum IMMUNIZATION_RECOMMENDATION_STATUS_CODES = eINSTANCE.getImmunizationRecommendationStatusCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationDateCriterionCodes <em>Immunization Recommendation Date Criterion Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRecommendationDateCriterionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationRecommendationDateCriterionCodes()
		 * @generated
		 */
		EEnum IMMUNIZATION_RECOMMENDATION_DATE_CRITERION_CODES = eINSTANCE.getImmunizationRecommendationDateCriterionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationAdministrationStatus <em>Medication Administration Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationAdministrationStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationAdministrationStatus()
		 * @generated
		 */
		EEnum MEDICATION_ADMINISTRATION_STATUS = eINSTANCE.getMedicationAdministrationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.CodesForImmunizationSiteOfAdministration <em>Codes For Immunization Site Of Administration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.CodesForImmunizationSiteOfAdministration
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getCodesForImmunizationSiteOfAdministration()
		 * @generated
		 */
		EEnum CODES_FOR_IMMUNIZATION_SITE_OF_ADMINISTRATION = eINSTANCE.getCodesForImmunizationSiteOfAdministration();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRouteCodes <em>Immunization Route Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationRouteCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationRouteCodes()
		 * @generated
		 */
		EEnum IMMUNIZATION_ROUTE_CODES = eINSTANCE.getImmunizationRouteCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonCodes <em>Immunization Reason Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationReasonCodes()
		 * @generated
		 */
		EEnum IMMUNIZATION_REASON_CODES = eINSTANCE.getImmunizationReasonCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonsForNotImmunizingCodes <em>Immunization Reasons For Not Immunizing Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ImmunizationReasonsForNotImmunizingCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getImmunizationReasonsForNotImmunizingCodes()
		 * @generated
		 */
		EEnum IMMUNIZATION_REASONS_FOR_NOT_IMMUNIZING_CODES = eINSTANCE.getImmunizationReasonsForNotImmunizingCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseTargetCodes <em>Vaccination Protocol Dose Target Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseTargetCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVaccinationProtocolDoseTargetCodes()
		 * @generated
		 */
		EEnum VACCINATION_PROTOCOL_DOSE_TARGET_CODES = eINSTANCE.getVaccinationProtocolDoseTargetCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusCodes <em>Vaccination Protocol Dose Status Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVaccinationProtocolDoseStatusCodes()
		 * @generated
		 */
		EEnum VACCINATION_PROTOCOL_DOSE_STATUS_CODES = eINSTANCE.getVaccinationProtocolDoseStatusCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusReasonCodes <em>Vaccination Protocol Dose Status Reason Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.VaccinationProtocolDoseStatusReasonCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getVaccinationProtocolDoseStatusReasonCodes()
		 * @generated
		 */
		EEnum VACCINATION_PROTOCOL_DOSE_STATUS_REASON_CODES = eINSTANCE.getVaccinationProtocolDoseStatusReasonCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BundleType <em>Bundle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.BundleType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBundleType()
		 * @generated
		 */
		EEnum BUNDLE_TYPE = eINSTANCE.getBundleType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SearchEntryMode <em>Search Entry Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SearchEntryMode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSearchEntryMode()
		 * @generated
		 */
		EEnum SEARCH_ENTRY_MODE = eINSTANCE.getSearchEntryMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.HttpVerb <em>Http Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.HttpVerb
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getHttpVerb()
		 * @generated
		 */
		EEnum HTTP_VERB = eINSTANCE.getHttpVerb();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PriorityCodes <em>Priority Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PriorityCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPriorityCodes()
		 * @generated
		 */
		EEnum PRIORITY_CODES = eINSTANCE.getPriorityCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitCategoryCodes <em>Benefit Category Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitCategoryCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBenefitCategoryCodes()
		 * @generated
		 */
		EEnum BENEFIT_CATEGORY_CODES = eINSTANCE.getBenefitCategoryCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitSubCategoryCodes <em>Benefit Sub Category Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitSubCategoryCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBenefitSubCategoryCodes()
		 * @generated
		 */
		EEnum BENEFIT_SUB_CATEGORY_CODES = eINSTANCE.getBenefitSubCategoryCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.NetworkTypeCodes <em>Network Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.NetworkTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getNetworkTypeCodes()
		 * @generated
		 */
		EEnum NETWORK_TYPE_CODES = eINSTANCE.getNetworkTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UnitTypeCodes <em>Unit Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.UnitTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUnitTypeCodes()
		 * @generated
		 */
		EEnum UNIT_TYPE_CODES = eINSTANCE.getUnitTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitTermCodes <em>Benefit Term Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitTermCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBenefitTermCodes()
		 * @generated
		 */
		EEnum BENEFIT_TERM_CODES = eINSTANCE.getBenefitTermCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BenefitTypeCodes <em>Benefit Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.BenefitTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBenefitTypeCodes()
		 * @generated
		 */
		EEnum BENEFIT_TYPE_CODES = eINSTANCE.getBenefitTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationErrorCodes <em>Adjudication Error Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationErrorCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdjudicationErrorCodes()
		 * @generated
		 */
		EEnum ADJUDICATION_ERROR_CODES = eINSTANCE.getAdjudicationErrorCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MedicationDispenseStatus <em>Medication Dispense Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MedicationDispenseStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMedicationDispenseStatus()
		 * @generated
		 */
		EEnum MEDICATION_DISPENSE_STATUS = eINSTANCE.getMedicationDispenseStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActPharmacySupplyType <em>Act Pharmacy Supply Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActPharmacySupplyType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActPharmacySupplyType()
		 * @generated
		 */
		EEnum ACT_PHARMACY_SUPPLY_TYPE = eINSTANCE.getActPharmacySupplyType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ClaimType <em>Claim Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ClaimType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getClaimType()
		 * @generated
		 */
		EEnum CLAIM_TYPE = eINSTANCE.getClaimType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.Use <em>Use</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.Use
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUse()
		 * @generated
		 */
		EEnum USE = eINSTANCE.getUse();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.FundsReservationCodes <em>Funds Reservation Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.FundsReservationCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getFundsReservationCodes()
		 * @generated
		 */
		EEnum FUNDS_RESERVATION_CODES = eINSTANCE.getFundsReservationCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PayeeTypeCodes <em>Payee Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PayeeTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPayeeTypeCodes()
		 * @generated
		 */
		EEnum PAYEE_TYPE_CODES = eINSTANCE.getPayeeTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.IcD10Codes <em>Ic D10 Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.IcD10Codes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getIcD10Codes()
		 * @generated
		 */
		EEnum IC_D10_CODES = eINSTANCE.getIcD10Codes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ConditionsCodes <em>Conditions Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ConditionsCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getConditionsCodes()
		 * @generated
		 */
		EEnum CONDITIONS_CODES = eINSTANCE.getConditionsCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExceptionCodes <em>Exception Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExceptionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExceptionCodes()
		 * @generated
		 */
		EEnum EXCEPTION_CODES = eINSTANCE.getExceptionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActIncidentCode <em>Act Incident Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActIncidentCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActIncidentCode()
		 * @generated
		 */
		EEnum ACT_INCIDENT_CODE = eINSTANCE.getActIncidentCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.InterventionCodes <em>Intervention Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.InterventionCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getInterventionCodes()
		 * @generated
		 */
		EEnum INTERVENTION_CODES = eINSTANCE.getInterventionCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ActInvoiceGroupCode <em>Act Invoice Group Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ActInvoiceGroupCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getActInvoiceGroupCode()
		 * @generated
		 */
		EEnum ACT_INVOICE_GROUP_CODE = eINSTANCE.getActInvoiceGroupCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UsclsCodes <em>Uscls Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.UsclsCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUsclsCodes()
		 * @generated
		 */
		EEnum USCLS_CODES = eINSTANCE.getUsclsCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleServicePlaceCodes <em>Example Service Place Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleServicePlaceCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExampleServicePlaceCodes()
		 * @generated
		 */
		EEnum EXAMPLE_SERVICE_PLACE_CODES = eINSTANCE.getExampleServicePlaceCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.UdiCodes <em>Udi Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.UdiCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getUdiCodes()
		 * @generated
		 */
		EEnum UDI_CODES = eINSTANCE.getUdiCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ToothCodes <em>Tooth Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ToothCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getToothCodes()
		 * @generated
		 */
		EEnum TOOTH_CODES = eINSTANCE.getToothCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SurfaceCodes <em>Surface Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SurfaceCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSurfaceCodes()
		 * @generated
		 */
		EEnum SURFACE_CODES = eINSTANCE.getSurfaceCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ModifierTypeCodes <em>Modifier Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ModifierTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getModifierTypeCodes()
		 * @generated
		 */
		EEnum MODIFIER_TYPE_CODES = eINSTANCE.getModifierTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OralProsthoMaterialTypeCodes <em>Oral Prostho Material Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OralProsthoMaterialTypeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOralProsthoMaterialTypeCodes()
		 * @generated
		 */
		EEnum ORAL_PROSTHO_MATERIAL_TYPE_CODES = eINSTANCE.getOralProsthoMaterialTypeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdditionalMaterialCodes <em>Additional Material Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdditionalMaterialCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdditionalMaterialCodes()
		 * @generated
		 */
		EEnum ADDITIONAL_MATERIAL_CODES = eINSTANCE.getAdditionalMaterialCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.TeethCodes <em>Teeth Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.TeethCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getTeethCodes()
		 * @generated
		 */
		EEnum TEETH_CODES = eINSTANCE.getTeethCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MissingToothReasonCodes <em>Missing Tooth Reason Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MissingToothReasonCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMissingToothReasonCodes()
		 * @generated
		 */
		EEnum MISSING_TOOTH_REASON_CODES = eINSTANCE.getMissingToothReasonCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationCodes <em>Adjudication Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdjudicationCodes()
		 * @generated
		 */
		EEnum ADJUDICATION_CODES = eINSTANCE.getAdjudicationCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentAdjustmentReasonCodes <em>Payment Adjustment Reason Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentAdjustmentReasonCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPaymentAdjustmentReasonCodes()
		 * @generated
		 */
		EEnum PAYMENT_ADJUSTMENT_REASON_CODES = eINSTANCE.getPaymentAdjustmentReasonCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationReasonCodes <em>Adjudication Reason Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AdjudicationReasonCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAdjudicationReasonCodes()
		 * @generated
		 */
		EEnum ADJUDICATION_REASON_CODES = eINSTANCE.getAdjudicationReasonCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuideDependencyType <em>Guide Dependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuideDependencyType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuideDependencyType()
		 * @generated
		 */
		EEnum GUIDE_DEPENDENCY_TYPE = eINSTANCE.getGuideDependencyType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuideResourcePurpose <em>Guide Resource Purpose</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuideResourcePurpose
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuideResourcePurpose()
		 * @generated
		 */
		EEnum GUIDE_RESOURCE_PURPOSE = eINSTANCE.getGuideResourcePurpose();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidePageKind <em>Guide Page Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidePageKind
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuidePageKind()
		 * @generated
		 */
		EEnum GUIDE_PAGE_KIND = eINSTANCE.getGuidePageKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.XPathUsageType <em>XPath Usage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.XPathUsageType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getXPathUsageType()
		 * @generated
		 */
		EEnum XPATH_USAGE_TYPE = eINSTANCE.getXPathUsageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetParticipantType <em>Order Set Participant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetParticipantType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetParticipantType()
		 * @generated
		 */
		EEnum ORDER_SET_PARTICIPANT_TYPE = eINSTANCE.getOrderSetParticipantType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemType <em>Order Set Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemType()
		 * @generated
		 */
		EEnum ORDER_SET_ITEM_TYPE = eINSTANCE.getOrderSetItemType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemGroupingBehavior <em>Order Set Item Grouping Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemGroupingBehavior
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemGroupingBehavior()
		 * @generated
		 */
		EEnum ORDER_SET_ITEM_GROUPING_BEHAVIOR = eINSTANCE.getOrderSetItemGroupingBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemSelectionBehavior <em>Order Set Item Selection Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemSelectionBehavior
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemSelectionBehavior()
		 * @generated
		 */
		EEnum ORDER_SET_ITEM_SELECTION_BEHAVIOR = eINSTANCE.getOrderSetItemSelectionBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemRequiredBehavior <em>Order Set Item Required Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemRequiredBehavior
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemRequiredBehavior()
		 * @generated
		 */
		EEnum ORDER_SET_ITEM_REQUIRED_BEHAVIOR = eINSTANCE.getOrderSetItemRequiredBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemPrecheckBehavior <em>Order Set Item Precheck Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemPrecheckBehavior
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemPrecheckBehavior()
		 * @generated
		 */
		EEnum ORDER_SET_ITEM_PRECHECK_BEHAVIOR = eINSTANCE.getOrderSetItemPrecheckBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemCardinalityBehavior <em>Order Set Item Cardinality Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderSetItemCardinalityBehavior
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderSetItemCardinalityBehavior()
		 * @generated
		 */
		EEnum ORDER_SET_ITEM_CARDINALITY_BEHAVIOR = eINSTANCE.getOrderSetItemCardinalityBehavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEventCurrentState <em>Provenance Event Current State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEventCurrentState
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProvenanceEventCurrentState()
		 * @generated
		 */
		EEnum PROVENANCE_EVENT_CURRENT_STATE = eINSTANCE.getProvenanceEventCurrentState();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceParticipantRole <em>Provenance Participant Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceParticipantRole
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProvenanceParticipantRole()
		 * @generated
		 */
		EEnum PROVENANCE_PARTICIPANT_ROLE = eINSTANCE.getProvenanceParticipantRole();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemRoleLinkType <em>V3 Code System Role Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.V3CodeSystemRoleLinkType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getV3CodeSystemRoleLinkType()
		 * @generated
		 */
		EEnum V3_CODE_SYSTEM_ROLE_LINK_TYPE = eINSTANCE.getV3CodeSystemRoleLinkType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEntityRole <em>Provenance Entity Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProvenanceEntityRole
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProvenanceEntityRole()
		 * @generated
		 */
		EEnum PROVENANCE_ENTITY_ROLE = eINSTANCE.getProvenanceEntityRole();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ProcessOutcomeCodes <em>Process Outcome Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ProcessOutcomeCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getProcessOutcomeCodes()
		 * @generated
		 */
		EEnum PROCESS_OUTCOME_CODES = eINSTANCE.getProcessOutcomeCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MeasurePopulationType <em>Measure Population Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MeasurePopulationType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMeasurePopulationType()
		 * @generated
		 */
		EEnum MEASURE_POPULATION_TYPE = eINSTANCE.getMeasurePopulationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PaymentStatusCodes <em>Payment Status Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PaymentStatusCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPaymentStatusCodes()
		 * @generated
		 */
		EEnum PAYMENT_STATUS_CODES = eINSTANCE.getPaymentStatusCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ExampleUseCodesForList <em>Example Use Codes For List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ExampleUseCodesForList
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getExampleUseCodesForList()
		 * @generated
		 */
		EEnum EXAMPLE_USE_CODES_FOR_LIST = eINSTANCE.getExampleUseCodesForList();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ListStatus <em>List Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ListStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getListStatus()
		 * @generated
		 */
		EEnum LIST_STATUS = eINSTANCE.getListStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.PatientMedicineChangeTypes <em>Patient Medicine Change Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.PatientMedicineChangeTypes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getPatientMedicineChangeTypes()
		 * @generated
		 */
		EEnum PATIENT_MEDICINE_CHANGE_TYPES = eINSTANCE.getPatientMedicineChangeTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseStatus <em>Guidance Response Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuidanceResponseStatus()
		 * @generated
		 */
		EEnum GUIDANCE_RESPONSE_STATUS = eINSTANCE.getGuidanceResponseStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseActionType <em>Guidance Response Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.GuidanceResponseActionType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getGuidanceResponseActionType()
		 * @generated
		 */
		EEnum GUIDANCE_RESPONSE_ACTION_TYPE = eINSTANCE.getGuidanceResponseActionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueCategory <em>Detected Issue Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueCategory
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDetectedIssueCategory()
		 * @generated
		 */
		EEnum DETECTED_ISSUE_CATEGORY = eINSTANCE.getDetectedIssueCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueSeverity <em>Detected Issue Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueSeverity
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDetectedIssueSeverity()
		 * @generated
		 */
		EEnum DETECTED_ISSUE_SEVERITY = eINSTANCE.getDetectedIssueSeverity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueMitigationAction <em>Detected Issue Mitigation Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.DetectedIssueMitigationAction
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getDetectedIssueMitigationAction()
		 * @generated
		 */
		EEnum DETECTED_ISSUE_MITIGATION_ACTION = eINSTANCE.getDetectedIssueMitigationAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AccountStatus <em>Account Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AccountStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAccountStatus()
		 * @generated
		 */
		EEnum ACCOUNT_STATUS = eINSTANCE.getAccountStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationGivenCodes <em>Reason Medication Given Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ReasonMedicationGivenCodes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getReasonMedicationGivenCodes()
		 * @generated
		 */
		EEnum REASON_MEDICATION_GIVEN_CODES = eINSTANCE.getReasonMedicationGivenCodes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.ParticipantStatus <em>Participant Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.ParticipantStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getParticipantStatus()
		 * @generated
		 */
		EEnum PARTICIPANT_STATUS = eINSTANCE.getParticipantStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventId <em>Audit Event Id</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventId
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventId()
		 * @generated
		 */
		EEnum AUDIT_EVENT_ID = eINSTANCE.getAuditEventId();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSubType <em>Audit Event Sub Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSubType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventSubType()
		 * @generated
		 */
		EEnum AUDIT_EVENT_SUB_TYPE = eINSTANCE.getAuditEventSubType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventAction <em>Audit Event Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventAction
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventAction()
		 * @generated
		 */
		EEnum AUDIT_EVENT_ACTION = eINSTANCE.getAuditEventAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventOutcome <em>Audit Event Outcome</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventOutcome
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventOutcome()
		 * @generated
		 */
		EEnum AUDIT_EVENT_OUTCOME = eINSTANCE.getAuditEventOutcome();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditActiveParticipantRoleIdCode <em>Audit Active Participant Role Id Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditActiveParticipantRoleIdCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditActiveParticipantRoleIdCode()
		 * @generated
		 */
		EEnum AUDIT_ACTIVE_PARTICIPANT_ROLE_ID_CODE = eINSTANCE.getAuditActiveParticipantRoleIdCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.MediaTypeCode <em>Media Type Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.MediaTypeCode
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getMediaTypeCode()
		 * @generated
		 */
		EEnum MEDIA_TYPE_CODE = eINSTANCE.getMediaTypeCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventParticipantNetworkType <em>Audit Event Participant Network Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventParticipantNetworkType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventParticipantNetworkType()
		 * @generated
		 */
		EEnum AUDIT_EVENT_PARTICIPANT_NETWORK_TYPE = eINSTANCE.getAuditEventParticipantNetworkType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSourceType <em>Audit Event Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventSourceType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventSourceType()
		 * @generated
		 */
		EEnum AUDIT_EVENT_SOURCE_TYPE = eINSTANCE.getAuditEventSourceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectType <em>Audit Event Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventObjectType()
		 * @generated
		 */
		EEnum AUDIT_EVENT_OBJECT_TYPE = eINSTANCE.getAuditEventObjectType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectRole <em>Audit Event Object Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectRole
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventObjectRole()
		 * @generated
		 */
		EEnum AUDIT_EVENT_OBJECT_ROLE = eINSTANCE.getAuditEventObjectRole();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectLifecycle <em>Audit Event Object Lifecycle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.AuditEventObjectLifecycle
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getAuditEventObjectLifecycle()
		 * @generated
		 */
		EEnum AUDIT_EVENT_OBJECT_LIFECYCLE = eINSTANCE.getAuditEventObjectLifecycle();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.BasicResourceTypes <em>Basic Resource Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.BasicResourceTypes
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getBasicResourceTypes()
		 * @generated
		 */
		EEnum BASIC_RESOURCE_TYPES = eINSTANCE.getBasicResourceTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.OrderStatus <em>Order Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.OrderStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getOrderStatus()
		 * @generated
		 */
		EEnum ORDER_STATUS = eINSTANCE.getOrderStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyDeliveryStatus <em>Supply Delivery Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyDeliveryStatus
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyDeliveryStatus()
		 * @generated
		 */
		EEnum SUPPLY_DELIVERY_STATUS = eINSTANCE.getSupplyDeliveryStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.core.valueset.SupplyItemType <em>Supply Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.SupplyItemType
		 * @see org.eclipse.mdht.uml.fhir.core.valueset.impl.FhirValuesetPackageImpl#getSupplyItemType()
		 * @generated
		 */
		EEnum SUPPLY_ITEM_TYPE = eINSTANCE.getSupplyItemType();

	}

} //FhirValuesetPackage
