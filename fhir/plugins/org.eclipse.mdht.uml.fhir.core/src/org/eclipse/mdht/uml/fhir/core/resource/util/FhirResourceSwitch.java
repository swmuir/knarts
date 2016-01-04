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
package org.eclipse.mdht.uml.fhir.core.resource.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Element;

import org.eclipse.mdht.uml.fhir.core.resource.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage
 * @generated
 */
public class FhirResourceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FhirResourcePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirResourceSwitch() {
		if (modelPackage == null) {
			modelPackage = FhirResourcePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FhirResourcePackage.PRACTITIONER: {
				Practitioner practitioner = (Practitioner)theEObject;
				T result = casePractitioner(practitioner);
				if (result == null) result = caseDomainResource(practitioner);
				if (result == null) result = caseResource(practitioner);
				if (result == null) result = caseBase(practitioner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOMAIN_RESOURCE: {
				DomainResource domainResource = (DomainResource)theEObject;
				T result = caseDomainResource(domainResource);
				if (result == null) result = caseResource(domainResource);
				if (result == null) result = caseBase(domainResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseBase(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PRACTITIONER_PRACTITIONER_ROLE: {
				PractitionerPractitionerRole practitionerPractitionerRole = (PractitionerPractitionerRole)theEObject;
				T result = casePractitionerPractitionerRole(practitionerPractitionerRole);
				if (result == null) result = caseBackboneElement(practitionerPractitionerRole);
				if (result == null) result = caseDataType(practitionerPractitionerRole);
				if (result == null) result = caseElement(practitionerPractitionerRole);
				if (result == null) result = caseBase(practitionerPractitionerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseDomainResource(location);
				if (result == null) result = caseResource(location);
				if (result == null) result = caseBase(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.LOCATION_POSITION: {
				LocationPosition locationPosition = (LocationPosition)theEObject;
				T result = caseLocationPosition(locationPosition);
				if (result == null) result = caseBackboneElement(locationPosition);
				if (result == null) result = caseDataType(locationPosition);
				if (result == null) result = caseElement(locationPosition);
				if (result == null) result = caseBase(locationPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.HEALTHCARE_SERVICE: {
				HealthcareService healthcareService = (HealthcareService)theEObject;
				T result = caseHealthcareService(healthcareService);
				if (result == null) result = caseDomainResource(healthcareService);
				if (result == null) result = caseResource(healthcareService);
				if (result == null) result = caseBase(healthcareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.HEALTHCARE_SERVICE_SERVICE_TYPE: {
				HealthcareServiceServiceType healthcareServiceServiceType = (HealthcareServiceServiceType)theEObject;
				T result = caseHealthcareServiceServiceType(healthcareServiceServiceType);
				if (result == null) result = caseBackboneElement(healthcareServiceServiceType);
				if (result == null) result = caseDataType(healthcareServiceServiceType);
				if (result == null) result = caseElement(healthcareServiceServiceType);
				if (result == null) result = caseBase(healthcareServiceServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: {
				HealthcareServiceAvailableTime healthcareServiceAvailableTime = (HealthcareServiceAvailableTime)theEObject;
				T result = caseHealthcareServiceAvailableTime(healthcareServiceAvailableTime);
				if (result == null) result = caseBackboneElement(healthcareServiceAvailableTime);
				if (result == null) result = caseDataType(healthcareServiceAvailableTime);
				if (result == null) result = caseElement(healthcareServiceAvailableTime);
				if (result == null) result = caseBase(healthcareServiceAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: {
				HealthcareServiceNotAvailable healthcareServiceNotAvailable = (HealthcareServiceNotAvailable)theEObject;
				T result = caseHealthcareServiceNotAvailable(healthcareServiceNotAvailable);
				if (result == null) result = caseBackboneElement(healthcareServiceNotAvailable);
				if (result == null) result = caseDataType(healthcareServiceNotAvailable);
				if (result == null) result = caseElement(healthcareServiceNotAvailable);
				if (result == null) result = caseBase(healthcareServiceNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PRACTITIONER_QUALIFICATION: {
				PractitionerQualification practitionerQualification = (PractitionerQualification)theEObject;
				T result = casePractitionerQualification(practitionerQualification);
				if (result == null) result = caseBackboneElement(practitionerQualification);
				if (result == null) result = caseDataType(practitionerQualification);
				if (result == null) result = caseElement(practitionerQualification);
				if (result == null) result = caseBase(practitionerQualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PATIENT: {
				Patient patient = (Patient)theEObject;
				T result = casePatient(patient);
				if (result == null) result = caseDomainResource(patient);
				if (result == null) result = caseResource(patient);
				if (result == null) result = caseBase(patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PATIENT_CONTACT: {
				PatientContact patientContact = (PatientContact)theEObject;
				T result = casePatientContact(patientContact);
				if (result == null) result = caseBackboneElement(patientContact);
				if (result == null) result = caseDataType(patientContact);
				if (result == null) result = caseElement(patientContact);
				if (result == null) result = caseBase(patientContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PATIENT_ANIMAL: {
				PatientAnimal patientAnimal = (PatientAnimal)theEObject;
				T result = casePatientAnimal(patientAnimal);
				if (result == null) result = caseBackboneElement(patientAnimal);
				if (result == null) result = caseDataType(patientAnimal);
				if (result == null) result = caseElement(patientAnimal);
				if (result == null) result = caseBase(patientAnimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PATIENT_COMMUNICATION: {
				PatientCommunication patientCommunication = (PatientCommunication)theEObject;
				T result = casePatientCommunication(patientCommunication);
				if (result == null) result = caseBackboneElement(patientCommunication);
				if (result == null) result = caseDataType(patientCommunication);
				if (result == null) result = caseElement(patientCommunication);
				if (result == null) result = caseBase(patientCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PATIENT_LINK: {
				PatientLink patientLink = (PatientLink)theEObject;
				T result = casePatientLink(patientLink);
				if (result == null) result = caseBackboneElement(patientLink);
				if (result == null) result = caseDataType(patientLink);
				if (result == null) result = caseElement(patientLink);
				if (result == null) result = caseBase(patientLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.RELATED_PERSON: {
				RelatedPerson relatedPerson = (RelatedPerson)theEObject;
				T result = caseRelatedPerson(relatedPerson);
				if (result == null) result = caseDomainResource(relatedPerson);
				if (result == null) result = caseResource(relatedPerson);
				if (result == null) result = caseBase(relatedPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseDomainResource(device);
				if (result == null) result = caseResource(device);
				if (result == null) result = caseBase(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseDomainResource(library);
				if (result == null) result = caseResource(library);
				if (result == null) result = caseBase(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_METADATA: {
				ModuleMetadata moduleMetadata = (ModuleMetadata)theEObject;
				T result = caseModuleMetadata(moduleMetadata);
				if (result == null) result = caseDomainResource(moduleMetadata);
				if (result == null) result = caseResource(moduleMetadata);
				if (result == null) result = caseBase(moduleMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_METADATA_COVERAGE: {
				ModuleMetadataCoverage moduleMetadataCoverage = (ModuleMetadataCoverage)theEObject;
				T result = caseModuleMetadataCoverage(moduleMetadataCoverage);
				if (result == null) result = caseBackboneElement(moduleMetadataCoverage);
				if (result == null) result = caseDataType(moduleMetadataCoverage);
				if (result == null) result = caseElement(moduleMetadataCoverage);
				if (result == null) result = caseBase(moduleMetadataCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_METADATA_CONTRIBUTOR: {
				ModuleMetadataContributor moduleMetadataContributor = (ModuleMetadataContributor)theEObject;
				T result = caseModuleMetadataContributor(moduleMetadataContributor);
				if (result == null) result = caseBackboneElement(moduleMetadataContributor);
				if (result == null) result = caseDataType(moduleMetadataContributor);
				if (result == null) result = caseElement(moduleMetadataContributor);
				if (result == null) result = caseBase(moduleMetadataContributor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_METADATA_RELATED_RESOURCE: {
				ModuleMetadataRelatedResource moduleMetadataRelatedResource = (ModuleMetadataRelatedResource)theEObject;
				T result = caseModuleMetadataRelatedResource(moduleMetadataRelatedResource);
				if (result == null) result = caseBackboneElement(moduleMetadataRelatedResource);
				if (result == null) result = caseDataType(moduleMetadataRelatedResource);
				if (result == null) result = caseElement(moduleMetadataRelatedResource);
				if (result == null) result = caseBase(moduleMetadataRelatedResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION: {
				ModuleDefinition moduleDefinition = (ModuleDefinition)theEObject;
				T result = caseModuleDefinition(moduleDefinition);
				if (result == null) result = caseDomainResource(moduleDefinition);
				if (result == null) result = caseResource(moduleDefinition);
				if (result == null) result = caseBase(moduleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION_MODEL: {
				ModuleDefinitionModel moduleDefinitionModel = (ModuleDefinitionModel)theEObject;
				T result = caseModuleDefinitionModel(moduleDefinitionModel);
				if (result == null) result = caseBackboneElement(moduleDefinitionModel);
				if (result == null) result = caseDataType(moduleDefinitionModel);
				if (result == null) result = caseElement(moduleDefinitionModel);
				if (result == null) result = caseBase(moduleDefinitionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION_LIBRARY: {
				ModuleDefinitionLibrary moduleDefinitionLibrary = (ModuleDefinitionLibrary)theEObject;
				T result = caseModuleDefinitionLibrary(moduleDefinitionLibrary);
				if (result == null) result = caseBackboneElement(moduleDefinitionLibrary);
				if (result == null) result = caseDataType(moduleDefinitionLibrary);
				if (result == null) result = caseElement(moduleDefinitionLibrary);
				if (result == null) result = caseBase(moduleDefinitionLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION_CODE_SYSTEM: {
				ModuleDefinitionCodeSystem moduleDefinitionCodeSystem = (ModuleDefinitionCodeSystem)theEObject;
				T result = caseModuleDefinitionCodeSystem(moduleDefinitionCodeSystem);
				if (result == null) result = caseBackboneElement(moduleDefinitionCodeSystem);
				if (result == null) result = caseDataType(moduleDefinitionCodeSystem);
				if (result == null) result = caseElement(moduleDefinitionCodeSystem);
				if (result == null) result = caseBase(moduleDefinitionCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION_VALUE_SET: {
				ModuleDefinitionValueSet moduleDefinitionValueSet = (ModuleDefinitionValueSet)theEObject;
				T result = caseModuleDefinitionValueSet(moduleDefinitionValueSet);
				if (result == null) result = caseBackboneElement(moduleDefinitionValueSet);
				if (result == null) result = caseDataType(moduleDefinitionValueSet);
				if (result == null) result = caseElement(moduleDefinitionValueSet);
				if (result == null) result = caseBase(moduleDefinitionValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION_PARAMETER: {
				ModuleDefinitionParameter moduleDefinitionParameter = (ModuleDefinitionParameter)theEObject;
				T result = caseModuleDefinitionParameter(moduleDefinitionParameter);
				if (result == null) result = caseBackboneElement(moduleDefinitionParameter);
				if (result == null) result = caseDataType(moduleDefinitionParameter);
				if (result == null) result = caseElement(moduleDefinitionParameter);
				if (result == null) result = caseBase(moduleDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.STRUCTURE_DEFINITION: {
				StructureDefinition structureDefinition = (StructureDefinition)theEObject;
				T result = caseStructureDefinition(structureDefinition);
				if (result == null) result = caseDomainResource(structureDefinition);
				if (result == null) result = caseResource(structureDefinition);
				if (result == null) result = caseBase(structureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.STRUCTURE_DEFINITION_CONTACT: {
				StructureDefinitionContact structureDefinitionContact = (StructureDefinitionContact)theEObject;
				T result = caseStructureDefinitionContact(structureDefinitionContact);
				if (result == null) result = caseBackboneElement(structureDefinitionContact);
				if (result == null) result = caseDataType(structureDefinitionContact);
				if (result == null) result = caseElement(structureDefinitionContact);
				if (result == null) result = caseBase(structureDefinitionContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.STRUCTURE_DEFINITION_MAPPING: {
				StructureDefinitionMapping structureDefinitionMapping = (StructureDefinitionMapping)theEObject;
				T result = caseStructureDefinitionMapping(structureDefinitionMapping);
				if (result == null) result = caseBackboneElement(structureDefinitionMapping);
				if (result == null) result = caseDataType(structureDefinitionMapping);
				if (result == null) result = caseElement(structureDefinitionMapping);
				if (result == null) result = caseBase(structureDefinitionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.STRUCTURE_DEFINITION_SNAPSHOT: {
				StructureDefinitionSnapshot structureDefinitionSnapshot = (StructureDefinitionSnapshot)theEObject;
				T result = caseStructureDefinitionSnapshot(structureDefinitionSnapshot);
				if (result == null) result = caseBackboneElement(structureDefinitionSnapshot);
				if (result == null) result = caseDataType(structureDefinitionSnapshot);
				if (result == null) result = caseElement(structureDefinitionSnapshot);
				if (result == null) result = caseBase(structureDefinitionSnapshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.STRUCTURE_DEFINITION_DIFFERENTIAL: {
				StructureDefinitionDifferential structureDefinitionDifferential = (StructureDefinitionDifferential)theEObject;
				T result = caseStructureDefinitionDifferential(structureDefinitionDifferential);
				if (result == null) result = caseBackboneElement(structureDefinitionDifferential);
				if (result == null) result = caseDataType(structureDefinitionDifferential);
				if (result == null) result = caseElement(structureDefinitionDifferential);
				if (result == null) result = caseBase(structureDefinitionDifferential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION_DATA: {
				ModuleDefinitionData moduleDefinitionData = (ModuleDefinitionData)theEObject;
				T result = caseModuleDefinitionData(moduleDefinitionData);
				if (result == null) result = caseBackboneElement(moduleDefinitionData);
				if (result == null) result = caseDataType(moduleDefinitionData);
				if (result == null) result = caseElement(moduleDefinitionData);
				if (result == null) result = caseBase(moduleDefinitionData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION_DATA_CODE_FILTER: {
				ModuleDefinitionDataCodeFilter moduleDefinitionDataCodeFilter = (ModuleDefinitionDataCodeFilter)theEObject;
				T result = caseModuleDefinitionDataCodeFilter(moduleDefinitionDataCodeFilter);
				if (result == null) result = caseBackboneElement(moduleDefinitionDataCodeFilter);
				if (result == null) result = caseDataType(moduleDefinitionDataCodeFilter);
				if (result == null) result = caseElement(moduleDefinitionDataCodeFilter);
				if (result == null) result = caseBase(moduleDefinitionDataCodeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MODULE_DEFINITION_DATA_DATE_FILTER: {
				ModuleDefinitionDataDateFilter moduleDefinitionDataDateFilter = (ModuleDefinitionDataDateFilter)theEObject;
				T result = caseModuleDefinitionDataDateFilter(moduleDefinitionDataDateFilter);
				if (result == null) result = caseBackboneElement(moduleDefinitionDataDateFilter);
				if (result == null) result = caseDataType(moduleDefinitionDataDateFilter);
				if (result == null) result = caseElement(moduleDefinitionDataDateFilter);
				if (result == null) result = caseBase(moduleDefinitionDataDateFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseDomainResource(person);
				if (result == null) result = caseResource(person);
				if (result == null) result = caseBase(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PERSON_LINK: {
				PersonLink personLink = (PersonLink)theEObject;
				T result = casePersonLink(personLink);
				if (result == null) result = caseBackboneElement(personLink);
				if (result == null) result = caseDataType(personLink);
				if (result == null) result = caseElement(personLink);
				if (result == null) result = caseBase(personLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T result = caseValueSet(valueSet);
				if (result == null) result = caseDomainResource(valueSet);
				if (result == null) result = caseResource(valueSet);
				if (result == null) result = caseBase(valueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_CONTACT: {
				ValueSetContact valueSetContact = (ValueSetContact)theEObject;
				T result = caseValueSetContact(valueSetContact);
				if (result == null) result = caseBackboneElement(valueSetContact);
				if (result == null) result = caseDataType(valueSetContact);
				if (result == null) result = caseElement(valueSetContact);
				if (result == null) result = caseBase(valueSetContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM: {
				ValueSetCodeSystem valueSetCodeSystem = (ValueSetCodeSystem)theEObject;
				T result = caseValueSetCodeSystem(valueSetCodeSystem);
				if (result == null) result = caseBackboneElement(valueSetCodeSystem);
				if (result == null) result = caseDataType(valueSetCodeSystem);
				if (result == null) result = caseElement(valueSetCodeSystem);
				if (result == null) result = caseBase(valueSetCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION: {
				ValueSetCodeSystemConceptDefinition valueSetCodeSystemConceptDefinition = (ValueSetCodeSystemConceptDefinition)theEObject;
				T result = caseValueSetCodeSystemConceptDefinition(valueSetCodeSystemConceptDefinition);
				if (result == null) result = caseBackboneElement(valueSetCodeSystemConceptDefinition);
				if (result == null) result = caseDataType(valueSetCodeSystemConceptDefinition);
				if (result == null) result = caseElement(valueSetCodeSystemConceptDefinition);
				if (result == null) result = caseBase(valueSetCodeSystemConceptDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION_DESIGNATION: {
				ValueSetCodeSystemConceptDefinitionDesignation valueSetCodeSystemConceptDefinitionDesignation = (ValueSetCodeSystemConceptDefinitionDesignation)theEObject;
				T result = caseValueSetCodeSystemConceptDefinitionDesignation(valueSetCodeSystemConceptDefinitionDesignation);
				if (result == null) result = caseBackboneElement(valueSetCodeSystemConceptDefinitionDesignation);
				if (result == null) result = caseDataType(valueSetCodeSystemConceptDefinitionDesignation);
				if (result == null) result = caseElement(valueSetCodeSystemConceptDefinitionDesignation);
				if (result == null) result = caseBase(valueSetCodeSystemConceptDefinitionDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_COMPOSE: {
				ValueSetCompose valueSetCompose = (ValueSetCompose)theEObject;
				T result = caseValueSetCompose(valueSetCompose);
				if (result == null) result = caseBackboneElement(valueSetCompose);
				if (result == null) result = caseDataType(valueSetCompose);
				if (result == null) result = caseElement(valueSetCompose);
				if (result == null) result = caseBase(valueSetCompose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_COMPOSE_CONCEPT_SET: {
				ValueSetComposeConceptSet valueSetComposeConceptSet = (ValueSetComposeConceptSet)theEObject;
				T result = caseValueSetComposeConceptSet(valueSetComposeConceptSet);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSet);
				if (result == null) result = caseDataType(valueSetComposeConceptSet);
				if (result == null) result = caseElement(valueSetComposeConceptSet);
				if (result == null) result = caseBase(valueSetComposeConceptSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE: {
				ValueSetComposeConceptSetConceptReference valueSetComposeConceptSetConceptReference = (ValueSetComposeConceptSetConceptReference)theEObject;
				T result = caseValueSetComposeConceptSetConceptReference(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseDataType(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseElement(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseBase(valueSetComposeConceptSetConceptReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_COMPOSE_CONCEPT_SET_FILTER: {
				ValueSetComposeConceptSetFilter valueSetComposeConceptSetFilter = (ValueSetComposeConceptSetFilter)theEObject;
				T result = caseValueSetComposeConceptSetFilter(valueSetComposeConceptSetFilter);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSetFilter);
				if (result == null) result = caseDataType(valueSetComposeConceptSetFilter);
				if (result == null) result = caseElement(valueSetComposeConceptSetFilter);
				if (result == null) result = caseBase(valueSetComposeConceptSetFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_EXPANSION: {
				ValueSetExpansion valueSetExpansion = (ValueSetExpansion)theEObject;
				T result = caseValueSetExpansion(valueSetExpansion);
				if (result == null) result = caseBackboneElement(valueSetExpansion);
				if (result == null) result = caseDataType(valueSetExpansion);
				if (result == null) result = caseElement(valueSetExpansion);
				if (result == null) result = caseBase(valueSetExpansion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_EXPANSION_PARAMETER: {
				ValueSetExpansionParameter valueSetExpansionParameter = (ValueSetExpansionParameter)theEObject;
				T result = caseValueSetExpansionParameter(valueSetExpansionParameter);
				if (result == null) result = caseBackboneElement(valueSetExpansionParameter);
				if (result == null) result = caseDataType(valueSetExpansionParameter);
				if (result == null) result = caseElement(valueSetExpansionParameter);
				if (result == null) result = caseBase(valueSetExpansionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS: {
				ValueSetExpansionContains valueSetExpansionContains = (ValueSetExpansionContains)theEObject;
				T result = caseValueSetExpansionContains(valueSetExpansionContains);
				if (result == null) result = caseBackboneElement(valueSetExpansionContains);
				if (result == null) result = caseDataType(valueSetExpansionContains);
				if (result == null) result = caseElement(valueSetExpansionContains);
				if (result == null) result = caseBase(valueSetExpansionContains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseDomainResource(communication);
				if (result == null) result = caseResource(communication);
				if (result == null) result = caseBase(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COMMUNICATION_PAYLOAD: {
				CommunicationPayload communicationPayload = (CommunicationPayload)theEObject;
				T result = caseCommunicationPayload(communicationPayload);
				if (result == null) result = caseBackboneElement(communicationPayload);
				if (result == null) result = caseDataType(communicationPayload);
				if (result == null) result = caseElement(communicationPayload);
				if (result == null) result = caseBase(communicationPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ENCOUNTER: {
				Encounter encounter = (Encounter)theEObject;
				T result = caseEncounter(encounter);
				if (result == null) result = caseDomainResource(encounter);
				if (result == null) result = caseResource(encounter);
				if (result == null) result = caseBase(encounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ENCOUNTER_STATUS_HISTORY: {
				EncounterStatusHistory encounterStatusHistory = (EncounterStatusHistory)theEObject;
				T result = caseEncounterStatusHistory(encounterStatusHistory);
				if (result == null) result = caseBackboneElement(encounterStatusHistory);
				if (result == null) result = caseDataType(encounterStatusHistory);
				if (result == null) result = caseElement(encounterStatusHistory);
				if (result == null) result = caseBase(encounterStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EPISODE_OF_CARE: {
				EpisodeOfCare episodeOfCare = (EpisodeOfCare)theEObject;
				T result = caseEpisodeOfCare(episodeOfCare);
				if (result == null) result = caseDomainResource(episodeOfCare);
				if (result == null) result = caseResource(episodeOfCare);
				if (result == null) result = caseBase(episodeOfCare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EPISODE_OF_CARE_STATUS_HISTORY: {
				EpisodeOfCareStatusHistory episodeOfCareStatusHistory = (EpisodeOfCareStatusHistory)theEObject;
				T result = caseEpisodeOfCareStatusHistory(episodeOfCareStatusHistory);
				if (result == null) result = caseBackboneElement(episodeOfCareStatusHistory);
				if (result == null) result = caseDataType(episodeOfCareStatusHistory);
				if (result == null) result = caseElement(episodeOfCareStatusHistory);
				if (result == null) result = caseBase(episodeOfCareStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseDomainResource(condition);
				if (result == null) result = caseResource(condition);
				if (result == null) result = caseBase(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONDITION_STAGE: {
				ConditionStage conditionStage = (ConditionStage)theEObject;
				T result = caseConditionStage(conditionStage);
				if (result == null) result = caseBackboneElement(conditionStage);
				if (result == null) result = caseDataType(conditionStage);
				if (result == null) result = caseElement(conditionStage);
				if (result == null) result = caseBase(conditionStage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONDITION_EVIDENCE: {
				ConditionEvidence conditionEvidence = (ConditionEvidence)theEObject;
				T result = caseConditionEvidence(conditionEvidence);
				if (result == null) result = caseBackboneElement(conditionEvidence);
				if (result == null) result = caseDataType(conditionEvidence);
				if (result == null) result = caseElement(conditionEvidence);
				if (result == null) result = caseBase(conditionEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.REFERRAL_REQUEST: {
				ReferralRequest referralRequest = (ReferralRequest)theEObject;
				T result = caseReferralRequest(referralRequest);
				if (result == null) result = caseDomainResource(referralRequest);
				if (result == null) result = caseResource(referralRequest);
				if (result == null) result = caseBase(referralRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EPISODE_OF_CARE_CARE_TEAM: {
				EpisodeOfCareCareTeam episodeOfCareCareTeam = (EpisodeOfCareCareTeam)theEObject;
				T result = caseEpisodeOfCareCareTeam(episodeOfCareCareTeam);
				if (result == null) result = caseBackboneElement(episodeOfCareCareTeam);
				if (result == null) result = caseDataType(episodeOfCareCareTeam);
				if (result == null) result = caseElement(episodeOfCareCareTeam);
				if (result == null) result = caseBase(episodeOfCareCareTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ENCOUNTER_PARTICIPANT: {
				EncounterParticipant encounterParticipant = (EncounterParticipant)theEObject;
				T result = caseEncounterParticipant(encounterParticipant);
				if (result == null) result = caseBackboneElement(encounterParticipant);
				if (result == null) result = caseDataType(encounterParticipant);
				if (result == null) result = caseElement(encounterParticipant);
				if (result == null) result = caseBase(encounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.APPOINTMENT: {
				Appointment appointment = (Appointment)theEObject;
				T result = caseAppointment(appointment);
				if (result == null) result = caseDomainResource(appointment);
				if (result == null) result = caseResource(appointment);
				if (result == null) result = caseBase(appointment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseDomainResource(slot);
				if (result == null) result = caseResource(slot);
				if (result == null) result = caseBase(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = caseDomainResource(schedule);
				if (result == null) result = caseResource(schedule);
				if (result == null) result = caseBase(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.APPOINTMENT_PARTICIPANT: {
				AppointmentParticipant appointmentParticipant = (AppointmentParticipant)theEObject;
				T result = caseAppointmentParticipant(appointmentParticipant);
				if (result == null) result = caseBackboneElement(appointmentParticipant);
				if (result == null) result = caseDataType(appointmentParticipant);
				if (result == null) result = caseElement(appointmentParticipant);
				if (result == null) result = caseBase(appointmentParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION: {
				EncounterHospitalization encounterHospitalization = (EncounterHospitalization)theEObject;
				T result = caseEncounterHospitalization(encounterHospitalization);
				if (result == null) result = caseBackboneElement(encounterHospitalization);
				if (result == null) result = caseDataType(encounterHospitalization);
				if (result == null) result = caseElement(encounterHospitalization);
				if (result == null) result = caseBase(encounterHospitalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ENCOUNTER_LOCATION: {
				EncounterLocation encounterLocation = (EncounterLocation)theEObject;
				T result = caseEncounterLocation(encounterLocation);
				if (result == null) result = caseBackboneElement(encounterLocation);
				if (result == null) result = caseDataType(encounterLocation);
				if (result == null) result = caseElement(encounterLocation);
				if (result == null) result = caseBase(encounterLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COMMUNICATION_REQUEST: {
				CommunicationRequest communicationRequest = (CommunicationRequest)theEObject;
				T result = caseCommunicationRequest(communicationRequest);
				if (result == null) result = caseDomainResource(communicationRequest);
				if (result == null) result = caseResource(communicationRequest);
				if (result == null) result = caseBase(communicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COMMUNICATION_REQUEST_PAYLOAD: {
				CommunicationRequestPayload communicationRequestPayload = (CommunicationRequestPayload)theEObject;
				T result = caseCommunicationRequestPayload(communicationRequestPayload);
				if (result == null) result = caseBackboneElement(communicationRequestPayload);
				if (result == null) result = caseDataType(communicationRequestPayload);
				if (result == null) result = caseElement(communicationRequestPayload);
				if (result == null) result = caseBase(communicationRequestPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseDomainResource(group);
				if (result == null) result = caseResource(group);
				if (result == null) result = caseBase(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.GROUP_CHARACTERISTIC: {
				GroupCharacteristic groupCharacteristic = (GroupCharacteristic)theEObject;
				T result = caseGroupCharacteristic(groupCharacteristic);
				if (result == null) result = caseBackboneElement(groupCharacteristic);
				if (result == null) result = caseDataType(groupCharacteristic);
				if (result == null) result = caseElement(groupCharacteristic);
				if (result == null) result = caseBase(groupCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.GROUP_MEMBER: {
				GroupMember groupMember = (GroupMember)theEObject;
				T result = caseGroupMember(groupMember);
				if (result == null) result = caseBackboneElement(groupMember);
				if (result == null) result = caseDataType(groupMember);
				if (result == null) result = caseElement(groupMember);
				if (result == null) result = caseBase(groupMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION: {
				Medication medication = (Medication)theEObject;
				T result = caseMedication(medication);
				if (result == null) result = caseDomainResource(medication);
				if (result == null) result = caseResource(medication);
				if (result == null) result = caseBase(medication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_PRODUCT: {
				MedicationProduct medicationProduct = (MedicationProduct)theEObject;
				T result = caseMedicationProduct(medicationProduct);
				if (result == null) result = caseBackboneElement(medicationProduct);
				if (result == null) result = caseDataType(medicationProduct);
				if (result == null) result = caseElement(medicationProduct);
				if (result == null) result = caseBase(medicationProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_PRODUCT_INGREDIENT: {
				MedicationProductIngredient medicationProductIngredient = (MedicationProductIngredient)theEObject;
				T result = caseMedicationProductIngredient(medicationProductIngredient);
				if (result == null) result = caseBackboneElement(medicationProductIngredient);
				if (result == null) result = caseDataType(medicationProductIngredient);
				if (result == null) result = caseElement(medicationProductIngredient);
				if (result == null) result = caseBase(medicationProductIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_PRODUCT_BATCH: {
				MedicationProductBatch medicationProductBatch = (MedicationProductBatch)theEObject;
				T result = caseMedicationProductBatch(medicationProductBatch);
				if (result == null) result = caseBackboneElement(medicationProductBatch);
				if (result == null) result = caseDataType(medicationProductBatch);
				if (result == null) result = caseElement(medicationProductBatch);
				if (result == null) result = caseBase(medicationProductBatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_PACKAGE: {
				MedicationPackage medicationPackage = (MedicationPackage)theEObject;
				T result = caseMedicationPackage(medicationPackage);
				if (result == null) result = caseBackboneElement(medicationPackage);
				if (result == null) result = caseDataType(medicationPackage);
				if (result == null) result = caseElement(medicationPackage);
				if (result == null) result = caseBase(medicationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_PACKAGE_CONTENT: {
				MedicationPackageContent medicationPackageContent = (MedicationPackageContent)theEObject;
				T result = caseMedicationPackageContent(medicationPackageContent);
				if (result == null) result = caseBackboneElement(medicationPackageContent);
				if (result == null) result = caseDataType(medicationPackageContent);
				if (result == null) result = caseElement(medicationPackageContent);
				if (result == null) result = caseBase(medicationPackageContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SUBSTANCE: {
				Substance substance = (Substance)theEObject;
				T result = caseSubstance(substance);
				if (result == null) result = caseDomainResource(substance);
				if (result == null) result = caseResource(substance);
				if (result == null) result = caseBase(substance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SUBSTANCE_INSTANCE: {
				SubstanceInstance substanceInstance = (SubstanceInstance)theEObject;
				T result = caseSubstanceInstance(substanceInstance);
				if (result == null) result = caseBackboneElement(substanceInstance);
				if (result == null) result = caseDataType(substanceInstance);
				if (result == null) result = caseElement(substanceInstance);
				if (result == null) result = caseBase(substanceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SUBSTANCE_INGREDIENT: {
				SubstanceIngredient substanceIngredient = (SubstanceIngredient)theEObject;
				T result = caseSubstanceIngredient(substanceIngredient);
				if (result == null) result = caseBackboneElement(substanceIngredient);
				if (result == null) result = caseDataType(substanceIngredient);
				if (result == null) result = caseElement(substanceIngredient);
				if (result == null) result = caseBase(substanceIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLINICAL_IMPRESSION: {
				ClinicalImpression clinicalImpression = (ClinicalImpression)theEObject;
				T result = caseClinicalImpression(clinicalImpression);
				if (result == null) result = caseDomainResource(clinicalImpression);
				if (result == null) result = caseResource(clinicalImpression);
				if (result == null) result = caseBase(clinicalImpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLINICAL_IMPRESSION_INVESTIGATIONS: {
				ClinicalImpressionInvestigations clinicalImpressionInvestigations = (ClinicalImpressionInvestigations)theEObject;
				T result = caseClinicalImpressionInvestigations(clinicalImpressionInvestigations);
				if (result == null) result = caseBackboneElement(clinicalImpressionInvestigations);
				if (result == null) result = caseDataType(clinicalImpressionInvestigations);
				if (result == null) result = caseElement(clinicalImpressionInvestigations);
				if (result == null) result = caseBase(clinicalImpressionInvestigations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLINICAL_IMPRESSION_FINDING: {
				ClinicalImpressionFinding clinicalImpressionFinding = (ClinicalImpressionFinding)theEObject;
				T result = caseClinicalImpressionFinding(clinicalImpressionFinding);
				if (result == null) result = caseBackboneElement(clinicalImpressionFinding);
				if (result == null) result = caseDataType(clinicalImpressionFinding);
				if (result == null) result = caseElement(clinicalImpressionFinding);
				if (result == null) result = caseBase(clinicalImpressionFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLINICAL_IMPRESSION_RULED_OUT: {
				ClinicalImpressionRuledOut clinicalImpressionRuledOut = (ClinicalImpressionRuledOut)theEObject;
				T result = caseClinicalImpressionRuledOut(clinicalImpressionRuledOut);
				if (result == null) result = caseBackboneElement(clinicalImpressionRuledOut);
				if (result == null) result = caseDataType(clinicalImpressionRuledOut);
				if (result == null) result = caseElement(clinicalImpressionRuledOut);
				if (result == null) result = caseBase(clinicalImpressionRuledOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ALLERGY_INTOLERANCE: {
				AllergyIntolerance allergyIntolerance = (AllergyIntolerance)theEObject;
				T result = caseAllergyIntolerance(allergyIntolerance);
				if (result == null) result = caseDomainResource(allergyIntolerance);
				if (result == null) result = caseResource(allergyIntolerance);
				if (result == null) result = caseBase(allergyIntolerance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ALLERGY_INTOLERANCE_REACTION: {
				AllergyIntoleranceReaction allergyIntoleranceReaction = (AllergyIntoleranceReaction)theEObject;
				T result = caseAllergyIntoleranceReaction(allergyIntoleranceReaction);
				if (result == null) result = caseBackboneElement(allergyIntoleranceReaction);
				if (result == null) result = caseDataType(allergyIntoleranceReaction);
				if (result == null) result = caseElement(allergyIntoleranceReaction);
				if (result == null) result = caseBase(allergyIntoleranceReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = caseDomainResource(observation);
				if (result == null) result = caseResource(observation);
				if (result == null) result = caseBase(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SPECIMEN: {
				Specimen specimen = (Specimen)theEObject;
				T result = caseSpecimen(specimen);
				if (result == null) result = caseDomainResource(specimen);
				if (result == null) result = caseResource(specimen);
				if (result == null) result = caseBase(specimen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SPECIMEN_COLLECTION: {
				SpecimenCollection specimenCollection = (SpecimenCollection)theEObject;
				T result = caseSpecimenCollection(specimenCollection);
				if (result == null) result = caseBackboneElement(specimenCollection);
				if (result == null) result = caseDataType(specimenCollection);
				if (result == null) result = caseElement(specimenCollection);
				if (result == null) result = caseBase(specimenCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SPECIMEN_TREATMENT: {
				SpecimenTreatment specimenTreatment = (SpecimenTreatment)theEObject;
				T result = caseSpecimenTreatment(specimenTreatment);
				if (result == null) result = caseBackboneElement(specimenTreatment);
				if (result == null) result = caseDataType(specimenTreatment);
				if (result == null) result = caseElement(specimenTreatment);
				if (result == null) result = caseBase(specimenTreatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SPECIMEN_CONTAINER: {
				SpecimenContainer specimenContainer = (SpecimenContainer)theEObject;
				T result = caseSpecimenContainer(specimenContainer);
				if (result == null) result = caseBackboneElement(specimenContainer);
				if (result == null) result = caseDataType(specimenContainer);
				if (result == null) result = caseElement(specimenContainer);
				if (result == null) result = caseBase(specimenContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE: {
				ObservationReferenceRange observationReferenceRange = (ObservationReferenceRange)theEObject;
				T result = caseObservationReferenceRange(observationReferenceRange);
				if (result == null) result = caseBackboneElement(observationReferenceRange);
				if (result == null) result = caseDataType(observationReferenceRange);
				if (result == null) result = caseElement(observationReferenceRange);
				if (result == null) result = caseBase(observationReferenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OBSERVATION_RELATED: {
				ObservationRelated observationRelated = (ObservationRelated)theEObject;
				T result = caseObservationRelated(observationRelated);
				if (result == null) result = caseBackboneElement(observationRelated);
				if (result == null) result = caseDataType(observationRelated);
				if (result == null) result = caseElement(observationRelated);
				if (result == null) result = caseBase(observationRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OBSERVATION_COMPONENT: {
				ObservationComponent observationComponent = (ObservationComponent)theEObject;
				T result = caseObservationComponent(observationComponent);
				if (result == null) result = caseBackboneElement(observationComponent);
				if (result == null) result = caseDataType(observationComponent);
				if (result == null) result = caseElement(observationComponent);
				if (result == null) result = caseBase(observationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DEVICE_METRIC: {
				DeviceMetric deviceMetric = (DeviceMetric)theEObject;
				T result = caseDeviceMetric(deviceMetric);
				if (result == null) result = caseDomainResource(deviceMetric);
				if (result == null) result = caseResource(deviceMetric);
				if (result == null) result = caseBase(deviceMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DEVICE_COMPONENT: {
				DeviceComponent deviceComponent = (DeviceComponent)theEObject;
				T result = caseDeviceComponent(deviceComponent);
				if (result == null) result = caseDomainResource(deviceComponent);
				if (result == null) result = caseResource(deviceComponent);
				if (result == null) result = caseBase(deviceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION: {
				DeviceComponentProductionSpecification deviceComponentProductionSpecification = (DeviceComponentProductionSpecification)theEObject;
				T result = caseDeviceComponentProductionSpecification(deviceComponentProductionSpecification);
				if (result == null) result = caseBackboneElement(deviceComponentProductionSpecification);
				if (result == null) result = caseDataType(deviceComponentProductionSpecification);
				if (result == null) result = caseElement(deviceComponentProductionSpecification);
				if (result == null) result = caseBase(deviceComponentProductionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DEVICE_METRIC_CALIBRATION: {
				DeviceMetricCalibration deviceMetricCalibration = (DeviceMetricCalibration)theEObject;
				T result = caseDeviceMetricCalibration(deviceMetricCalibration);
				if (result == null) result = caseBackboneElement(deviceMetricCalibration);
				if (result == null) result = caseDataType(deviceMetricCalibration);
				if (result == null) result = caseElement(deviceMetricCalibration);
				if (result == null) result = caseBase(deviceMetricCalibration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE: {
				QuestionnaireResponse questionnaireResponse = (QuestionnaireResponse)theEObject;
				T result = caseQuestionnaireResponse(questionnaireResponse);
				if (result == null) result = caseDomainResource(questionnaireResponse);
				if (result == null) result = caseResource(questionnaireResponse);
				if (result == null) result = caseBase(questionnaireResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = caseDomainResource(questionnaire);
				if (result == null) result = caseResource(questionnaire);
				if (result == null) result = caseBase(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.QUESTIONNAIRE_ITEM: {
				QuestionnaireItem questionnaireItem = (QuestionnaireItem)theEObject;
				T result = caseQuestionnaireItem(questionnaireItem);
				if (result == null) result = caseBackboneElement(questionnaireItem);
				if (result == null) result = caseDataType(questionnaireItem);
				if (result == null) result = caseElement(questionnaireItem);
				if (result == null) result = caseBase(questionnaireItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_ITEM: {
				QuestionnaireResponseItem questionnaireResponseItem = (QuestionnaireResponseItem)theEObject;
				T result = caseQuestionnaireResponseItem(questionnaireResponseItem);
				if (result == null) result = caseBackboneElement(questionnaireResponseItem);
				if (result == null) result = caseDataType(questionnaireResponseItem);
				if (result == null) result = caseElement(questionnaireResponseItem);
				if (result == null) result = caseBase(questionnaireResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER: {
				QuestionnaireResponseItemAnswer questionnaireResponseItemAnswer = (QuestionnaireResponseItemAnswer)theEObject;
				T result = caseQuestionnaireResponseItemAnswer(questionnaireResponseItemAnswer);
				if (result == null) result = caseBackboneElement(questionnaireResponseItemAnswer);
				if (result == null) result = caseDataType(questionnaireResponseItemAnswer);
				if (result == null) result = caseElement(questionnaireResponseItemAnswer);
				if (result == null) result = caseBase(questionnaireResponseItemAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.FAMILY_MEMBER_HISTORY: {
				FamilyMemberHistory familyMemberHistory = (FamilyMemberHistory)theEObject;
				T result = caseFamilyMemberHistory(familyMemberHistory);
				if (result == null) result = caseDomainResource(familyMemberHistory);
				if (result == null) result = caseResource(familyMemberHistory);
				if (result == null) result = caseBase(familyMemberHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.FAMILY_MEMBER_HISTORY_CONDITION: {
				FamilyMemberHistoryCondition familyMemberHistoryCondition = (FamilyMemberHistoryCondition)theEObject;
				T result = caseFamilyMemberHistoryCondition(familyMemberHistoryCondition);
				if (result == null) result = caseBackboneElement(familyMemberHistoryCondition);
				if (result == null) result = caseDataType(familyMemberHistoryCondition);
				if (result == null) result = caseElement(familyMemberHistoryCondition);
				if (result == null) result = caseBase(familyMemberHistoryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DIAGNOSTIC_REPORT: {
				DiagnosticReport diagnosticReport = (DiagnosticReport)theEObject;
				T result = caseDiagnosticReport(diagnosticReport);
				if (result == null) result = caseDomainResource(diagnosticReport);
				if (result == null) result = caseResource(diagnosticReport);
				if (result == null) result = caseBase(diagnosticReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DIAGNOSTIC_REPORT_IMAGE: {
				DiagnosticReportImage diagnosticReportImage = (DiagnosticReportImage)theEObject;
				T result = caseDiagnosticReportImage(diagnosticReportImage);
				if (result == null) result = caseBackboneElement(diagnosticReportImage);
				if (result == null) result = caseDataType(diagnosticReportImage);
				if (result == null) result = caseElement(diagnosticReportImage);
				if (result == null) result = caseBase(diagnosticReportImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = caseDomainResource(media);
				if (result == null) result = caseResource(media);
				if (result == null) result = caseBase(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DIAGNOSTIC_ORDER: {
				DiagnosticOrder diagnosticOrder = (DiagnosticOrder)theEObject;
				T result = caseDiagnosticOrder(diagnosticOrder);
				if (result == null) result = caseDomainResource(diagnosticOrder);
				if (result == null) result = caseResource(diagnosticOrder);
				if (result == null) result = caseBase(diagnosticOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DIAGNOSTIC_ORDER_EVENT: {
				DiagnosticOrderEvent diagnosticOrderEvent = (DiagnosticOrderEvent)theEObject;
				T result = caseDiagnosticOrderEvent(diagnosticOrderEvent);
				if (result == null) result = caseBackboneElement(diagnosticOrderEvent);
				if (result == null) result = caseDataType(diagnosticOrderEvent);
				if (result == null) result = caseElement(diagnosticOrderEvent);
				if (result == null) result = caseBase(diagnosticOrderEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DIAGNOSTIC_ORDER_ITEM: {
				DiagnosticOrderItem diagnosticOrderItem = (DiagnosticOrderItem)theEObject;
				T result = caseDiagnosticOrderItem(diagnosticOrderItem);
				if (result == null) result = caseBackboneElement(diagnosticOrderItem);
				if (result == null) result = caseDataType(diagnosticOrderItem);
				if (result == null) result = caseElement(diagnosticOrderItem);
				if (result == null) result = caseBase(diagnosticOrderItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOCUMENT_REFERENCE: {
				DocumentReference documentReference = (DocumentReference)theEObject;
				T result = caseDocumentReference(documentReference);
				if (result == null) result = caseDomainResource(documentReference);
				if (result == null) result = caseResource(documentReference);
				if (result == null) result = caseBase(documentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOCUMENT_REFERENCE_RELATES_TO: {
				DocumentReferenceRelatesTo documentReferenceRelatesTo = (DocumentReferenceRelatesTo)theEObject;
				T result = caseDocumentReferenceRelatesTo(documentReferenceRelatesTo);
				if (result == null) result = caseBackboneElement(documentReferenceRelatesTo);
				if (result == null) result = caseDataType(documentReferenceRelatesTo);
				if (result == null) result = caseElement(documentReferenceRelatesTo);
				if (result == null) result = caseBase(documentReferenceRelatesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTENT: {
				DocumentReferenceContent documentReferenceContent = (DocumentReferenceContent)theEObject;
				T result = caseDocumentReferenceContent(documentReferenceContent);
				if (result == null) result = caseBackboneElement(documentReferenceContent);
				if (result == null) result = caseDataType(documentReferenceContent);
				if (result == null) result = caseElement(documentReferenceContent);
				if (result == null) result = caseBase(documentReferenceContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT: {
				DocumentReferenceContext documentReferenceContext = (DocumentReferenceContext)theEObject;
				T result = caseDocumentReferenceContext(documentReferenceContext);
				if (result == null) result = caseBackboneElement(documentReferenceContext);
				if (result == null) result = caseDataType(documentReferenceContext);
				if (result == null) result = caseElement(documentReferenceContext);
				if (result == null) result = caseBase(documentReferenceContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT_RELATED: {
				DocumentReferenceContextRelated documentReferenceContextRelated = (DocumentReferenceContextRelated)theEObject;
				T result = caseDocumentReferenceContextRelated(documentReferenceContextRelated);
				if (result == null) result = caseBackboneElement(documentReferenceContextRelated);
				if (result == null) result = caseDataType(documentReferenceContextRelated);
				if (result == null) result = caseElement(documentReferenceContextRelated);
				if (result == null) result = caseBase(documentReferenceContextRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROCEDURE_REQUEST: {
				ProcedureRequest procedureRequest = (ProcedureRequest)theEObject;
				T result = caseProcedureRequest(procedureRequest);
				if (result == null) result = caseDomainResource(procedureRequest);
				if (result == null) result = caseResource(procedureRequest);
				if (result == null) result = caseBase(procedureRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMAGING_STUDY: {
				ImagingStudy imagingStudy = (ImagingStudy)theEObject;
				T result = caseImagingStudy(imagingStudy);
				if (result == null) result = caseDomainResource(imagingStudy);
				if (result == null) result = caseResource(imagingStudy);
				if (result == null) result = caseBase(imagingStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseDomainResource(procedure);
				if (result == null) result = caseResource(procedure);
				if (result == null) result = caseBase(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROCEDURE_PERFORMER: {
				ProcedurePerformer procedurePerformer = (ProcedurePerformer)theEObject;
				T result = caseProcedurePerformer(procedurePerformer);
				if (result == null) result = caseBackboneElement(procedurePerformer);
				if (result == null) result = caseDataType(procedurePerformer);
				if (result == null) result = caseElement(procedurePerformer);
				if (result == null) result = caseBase(procedurePerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROCEDURE_FOCAL_DEVICE: {
				ProcedureFocalDevice procedureFocalDevice = (ProcedureFocalDevice)theEObject;
				T result = caseProcedureFocalDevice(procedureFocalDevice);
				if (result == null) result = caseBackboneElement(procedureFocalDevice);
				if (result == null) result = caseDataType(procedureFocalDevice);
				if (result == null) result = caseElement(procedureFocalDevice);
				if (result == null) result = caseBase(procedureFocalDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMAGING_STUDY_SERIES: {
				ImagingStudySeries imagingStudySeries = (ImagingStudySeries)theEObject;
				T result = caseImagingStudySeries(imagingStudySeries);
				if (result == null) result = caseBackboneElement(imagingStudySeries);
				if (result == null) result = caseDataType(imagingStudySeries);
				if (result == null) result = caseElement(imagingStudySeries);
				if (result == null) result = caseBase(imagingStudySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE: {
				ImagingStudySeriesInstance imagingStudySeriesInstance = (ImagingStudySeriesInstance)theEObject;
				T result = caseImagingStudySeriesInstance(imagingStudySeriesInstance);
				if (result == null) result = caseBackboneElement(imagingStudySeriesInstance);
				if (result == null) result = caseDataType(imagingStudySeriesInstance);
				if (result == null) result = caseElement(imagingStudySeriesInstance);
				if (result == null) result = caseBase(imagingStudySeriesInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CARE_PLAN: {
				CarePlan carePlan = (CarePlan)theEObject;
				T result = caseCarePlan(carePlan);
				if (result == null) result = caseDomainResource(carePlan);
				if (result == null) result = caseResource(carePlan);
				if (result == null) result = caseBase(carePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CARE_PLAN_RELATED_PLAN: {
				CarePlanRelatedPlan carePlanRelatedPlan = (CarePlanRelatedPlan)theEObject;
				T result = caseCarePlanRelatedPlan(carePlanRelatedPlan);
				if (result == null) result = caseBackboneElement(carePlanRelatedPlan);
				if (result == null) result = caseDataType(carePlanRelatedPlan);
				if (result == null) result = caseElement(carePlanRelatedPlan);
				if (result == null) result = caseBase(carePlanRelatedPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CARE_PLAN_PARTICIPANT: {
				CarePlanParticipant carePlanParticipant = (CarePlanParticipant)theEObject;
				T result = caseCarePlanParticipant(carePlanParticipant);
				if (result == null) result = caseBackboneElement(carePlanParticipant);
				if (result == null) result = caseDataType(carePlanParticipant);
				if (result == null) result = caseElement(carePlanParticipant);
				if (result == null) result = caseBase(carePlanParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDomainResource(goal);
				if (result == null) result = caseResource(goal);
				if (result == null) result = caseBase(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.GOAL_OUTCOME: {
				GoalOutcome goalOutcome = (GoalOutcome)theEObject;
				T result = caseGoalOutcome(goalOutcome);
				if (result == null) result = caseBackboneElement(goalOutcome);
				if (result == null) result = caseDataType(goalOutcome);
				if (result == null) result = caseElement(goalOutcome);
				if (result == null) result = caseBase(goalOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CARE_PLAN_ACTIVITY: {
				CarePlanActivity carePlanActivity = (CarePlanActivity)theEObject;
				T result = caseCarePlanActivity(carePlanActivity);
				if (result == null) result = caseBackboneElement(carePlanActivity);
				if (result == null) result = caseDataType(carePlanActivity);
				if (result == null) result = caseElement(carePlanActivity);
				if (result == null) result = caseBase(carePlanActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CARE_PLAN_ACTIVITY_DETAIL: {
				CarePlanActivityDetail carePlanActivityDetail = (CarePlanActivityDetail)theEObject;
				T result = caseCarePlanActivityDetail(carePlanActivityDetail);
				if (result == null) result = caseBackboneElement(carePlanActivityDetail);
				if (result == null) result = caseDataType(carePlanActivityDetail);
				if (result == null) result = caseElement(carePlanActivityDetail);
				if (result == null) result = caseBase(carePlanActivityDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_STATEMENT: {
				MedicationStatement medicationStatement = (MedicationStatement)theEObject;
				T result = caseMedicationStatement(medicationStatement);
				if (result == null) result = caseDomainResource(medicationStatement);
				if (result == null) result = caseResource(medicationStatement);
				if (result == null) result = caseBase(medicationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE: {
				MedicationStatementDosage medicationStatementDosage = (MedicationStatementDosage)theEObject;
				T result = caseMedicationStatementDosage(medicationStatementDosage);
				if (result == null) result = caseBackboneElement(medicationStatementDosage);
				if (result == null) result = caseDataType(medicationStatementDosage);
				if (result == null) result = caseElement(medicationStatementDosage);
				if (result == null) result = caseBase(medicationStatementDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BODY_SITE: {
				BodySite bodySite = (BodySite)theEObject;
				T result = caseBodySite(bodySite);
				if (result == null) result = caseDomainResource(bodySite);
				if (result == null) result = caseResource(bodySite);
				if (result == null) result = caseBase(bodySite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NUTRITION_ORDER: {
				NutritionOrder nutritionOrder = (NutritionOrder)theEObject;
				T result = caseNutritionOrder(nutritionOrder);
				if (result == null) result = caseDomainResource(nutritionOrder);
				if (result == null) result = caseResource(nutritionOrder);
				if (result == null) result = caseBase(nutritionOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET: {
				NutritionOrderOralDiet nutritionOrderOralDiet = (NutritionOrderOralDiet)theEObject;
				T result = caseNutritionOrderOralDiet(nutritionOrderOralDiet);
				if (result == null) result = caseBackboneElement(nutritionOrderOralDiet);
				if (result == null) result = caseDataType(nutritionOrderOralDiet);
				if (result == null) result = caseElement(nutritionOrderOralDiet);
				if (result == null) result = caseBase(nutritionOrderOralDiet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_NUTRIENT: {
				NutritionOrderOralDietNutrient nutritionOrderOralDietNutrient = (NutritionOrderOralDietNutrient)theEObject;
				T result = caseNutritionOrderOralDietNutrient(nutritionOrderOralDietNutrient);
				if (result == null) result = caseBackboneElement(nutritionOrderOralDietNutrient);
				if (result == null) result = caseDataType(nutritionOrderOralDietNutrient);
				if (result == null) result = caseElement(nutritionOrderOralDietNutrient);
				if (result == null) result = caseBase(nutritionOrderOralDietNutrient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE: {
				NutritionOrderOralDietTexture nutritionOrderOralDietTexture = (NutritionOrderOralDietTexture)theEObject;
				T result = caseNutritionOrderOralDietTexture(nutritionOrderOralDietTexture);
				if (result == null) result = caseBackboneElement(nutritionOrderOralDietTexture);
				if (result == null) result = caseDataType(nutritionOrderOralDietTexture);
				if (result == null) result = caseElement(nutritionOrderOralDietTexture);
				if (result == null) result = caseBase(nutritionOrderOralDietTexture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NUTRITION_ORDER_SUPPLEMENT: {
				NutritionOrderSupplement nutritionOrderSupplement = (NutritionOrderSupplement)theEObject;
				T result = caseNutritionOrderSupplement(nutritionOrderSupplement);
				if (result == null) result = caseBackboneElement(nutritionOrderSupplement);
				if (result == null) result = caseDataType(nutritionOrderSupplement);
				if (result == null) result = caseElement(nutritionOrderSupplement);
				if (result == null) result = caseBase(nutritionOrderSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA: {
				NutritionOrderEnteralFormula nutritionOrderEnteralFormula = (NutritionOrderEnteralFormula)theEObject;
				T result = caseNutritionOrderEnteralFormula(nutritionOrderEnteralFormula);
				if (result == null) result = caseBackboneElement(nutritionOrderEnteralFormula);
				if (result == null) result = caseDataType(nutritionOrderEnteralFormula);
				if (result == null) result = caseElement(nutritionOrderEnteralFormula);
				if (result == null) result = caseBase(nutritionOrderEnteralFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION: {
				NutritionOrderEnteralFormulaAdministration nutritionOrderEnteralFormulaAdministration = (NutritionOrderEnteralFormulaAdministration)theEObject;
				T result = caseNutritionOrderEnteralFormulaAdministration(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = caseBackboneElement(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = caseDataType(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = caseElement(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = caseBase(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.RISK_ASSESSMENT: {
				RiskAssessment riskAssessment = (RiskAssessment)theEObject;
				T result = caseRiskAssessment(riskAssessment);
				if (result == null) result = caseDomainResource(riskAssessment);
				if (result == null) result = caseResource(riskAssessment);
				if (result == null) result = caseBase(riskAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.RISK_ASSESSMENT_PREDICTION: {
				RiskAssessmentPrediction riskAssessmentPrediction = (RiskAssessmentPrediction)theEObject;
				T result = caseRiskAssessmentPrediction(riskAssessmentPrediction);
				if (result == null) result = caseBackboneElement(riskAssessmentPrediction);
				if (result == null) result = caseDataType(riskAssessmentPrediction);
				if (result == null) result = caseElement(riskAssessmentPrediction);
				if (result == null) result = caseBase(riskAssessmentPrediction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DEVICE_USE_REQUEST: {
				DeviceUseRequest deviceUseRequest = (DeviceUseRequest)theEObject;
				T result = caseDeviceUseRequest(deviceUseRequest);
				if (result == null) result = caseDomainResource(deviceUseRequest);
				if (result == null) result = caseResource(deviceUseRequest);
				if (result == null) result = caseBase(deviceUseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_ORDER: {
				MedicationOrder medicationOrder = (MedicationOrder)theEObject;
				T result = caseMedicationOrder(medicationOrder);
				if (result == null) result = caseDomainResource(medicationOrder);
				if (result == null) result = caseResource(medicationOrder);
				if (result == null) result = caseBase(medicationOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_ORDER_DOSAGE_INSTRUCTION: {
				MedicationOrderDosageInstruction medicationOrderDosageInstruction = (MedicationOrderDosageInstruction)theEObject;
				T result = caseMedicationOrderDosageInstruction(medicationOrderDosageInstruction);
				if (result == null) result = caseBackboneElement(medicationOrderDosageInstruction);
				if (result == null) result = caseDataType(medicationOrderDosageInstruction);
				if (result == null) result = caseElement(medicationOrderDosageInstruction);
				if (result == null) result = caseBase(medicationOrderDosageInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_ORDER_DISPENSE_REQUEST: {
				MedicationOrderDispenseRequest medicationOrderDispenseRequest = (MedicationOrderDispenseRequest)theEObject;
				T result = caseMedicationOrderDispenseRequest(medicationOrderDispenseRequest);
				if (result == null) result = caseBackboneElement(medicationOrderDispenseRequest);
				if (result == null) result = caseDataType(medicationOrderDispenseRequest);
				if (result == null) result = caseElement(medicationOrderDispenseRequest);
				if (result == null) result = caseBase(medicationOrderDispenseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_ORDER_SUBSTITUTION: {
				MedicationOrderSubstitution medicationOrderSubstitution = (MedicationOrderSubstitution)theEObject;
				T result = caseMedicationOrderSubstitution(medicationOrderSubstitution);
				if (result == null) result = caseBackboneElement(medicationOrderSubstitution);
				if (result == null) result = caseDataType(medicationOrderSubstitution);
				if (result == null) result = caseElement(medicationOrderSubstitution);
				if (result == null) result = caseBase(medicationOrderSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = caseDomainResource(order);
				if (result == null) result = caseResource(order);
				if (result == null) result = caseBase(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ORDER_WHEN: {
				OrderWhen orderWhen = (OrderWhen)theEObject;
				T result = caseOrderWhen(orderWhen);
				if (result == null) result = caseBackboneElement(orderWhen);
				if (result == null) result = caseDataType(orderWhen);
				if (result == null) result = caseElement(orderWhen);
				if (result == null) result = caseBase(orderWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROCESS_REQUEST: {
				ProcessRequest processRequest = (ProcessRequest)theEObject;
				T result = caseProcessRequest(processRequest);
				if (result == null) result = caseDomainResource(processRequest);
				if (result == null) result = caseResource(processRequest);
				if (result == null) result = caseBase(processRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROCESS_REQUEST_ITEMS: {
				ProcessRequestItems processRequestItems = (ProcessRequestItems)theEObject;
				T result = caseProcessRequestItems(processRequestItems);
				if (result == null) result = caseBackboneElement(processRequestItems);
				if (result == null) result = caseDataType(processRequestItems);
				if (result == null) result = caseElement(processRequestItems);
				if (result == null) result = caseBase(processRequestItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SUPPLY_REQUEST: {
				SupplyRequest supplyRequest = (SupplyRequest)theEObject;
				T result = caseSupplyRequest(supplyRequest);
				if (result == null) result = caseDomainResource(supplyRequest);
				if (result == null) result = caseResource(supplyRequest);
				if (result == null) result = caseBase(supplyRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SUPPLY_REQUEST_WHEN: {
				SupplyRequestWhen supplyRequestWhen = (SupplyRequestWhen)theEObject;
				T result = caseSupplyRequestWhen(supplyRequestWhen);
				if (result == null) result = caseBackboneElement(supplyRequestWhen);
				if (result == null) result = caseDataType(supplyRequestWhen);
				if (result == null) result = caseElement(supplyRequestWhen);
				if (result == null) result = caseBase(supplyRequestWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VISION_PRESCRIPTION: {
				VisionPrescription visionPrescription = (VisionPrescription)theEObject;
				T result = caseVisionPrescription(visionPrescription);
				if (result == null) result = caseDomainResource(visionPrescription);
				if (result == null) result = caseResource(visionPrescription);
				if (result == null) result = caseBase(visionPrescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.VISION_PRESCRIPTION_DISPENSE: {
				VisionPrescriptionDispense visionPrescriptionDispense = (VisionPrescriptionDispense)theEObject;
				T result = caseVisionPrescriptionDispense(visionPrescriptionDispense);
				if (result == null) result = caseBackboneElement(visionPrescriptionDispense);
				if (result == null) result = caseDataType(visionPrescriptionDispense);
				if (result == null) result = caseElement(visionPrescriptionDispense);
				if (result == null) result = caseBase(visionPrescriptionDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION: {
				ImagingObjectSelection imagingObjectSelection = (ImagingObjectSelection)theEObject;
				T result = caseImagingObjectSelection(imagingObjectSelection);
				if (result == null) result = caseDomainResource(imagingObjectSelection);
				if (result == null) result = caseResource(imagingObjectSelection);
				if (result == null) result = caseBase(imagingObjectSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY: {
				ImagingObjectSelectionStudy imagingObjectSelectionStudy = (ImagingObjectSelectionStudy)theEObject;
				T result = caseImagingObjectSelectionStudy(imagingObjectSelectionStudy);
				if (result == null) result = caseBackboneElement(imagingObjectSelectionStudy);
				if (result == null) result = caseDataType(imagingObjectSelectionStudy);
				if (result == null) result = caseElement(imagingObjectSelectionStudy);
				if (result == null) result = caseBase(imagingObjectSelectionStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES: {
				ImagingObjectSelectionStudySeries imagingObjectSelectionStudySeries = (ImagingObjectSelectionStudySeries)theEObject;
				T result = caseImagingObjectSelectionStudySeries(imagingObjectSelectionStudySeries);
				if (result == null) result = caseBackboneElement(imagingObjectSelectionStudySeries);
				if (result == null) result = caseDataType(imagingObjectSelectionStudySeries);
				if (result == null) result = caseElement(imagingObjectSelectionStudySeries);
				if (result == null) result = caseBase(imagingObjectSelectionStudySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE: {
				ImagingObjectSelectionStudySeriesInstance imagingObjectSelectionStudySeriesInstance = (ImagingObjectSelectionStudySeriesInstance)theEObject;
				T result = caseImagingObjectSelectionStudySeriesInstance(imagingObjectSelectionStudySeriesInstance);
				if (result == null) result = caseBackboneElement(imagingObjectSelectionStudySeriesInstance);
				if (result == null) result = caseDataType(imagingObjectSelectionStudySeriesInstance);
				if (result == null) result = caseElement(imagingObjectSelectionStudySeriesInstance);
				if (result == null) result = caseBase(imagingObjectSelectionStudySeriesInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES: {
				ImagingObjectSelectionStudySeriesInstanceFrames imagingObjectSelectionStudySeriesInstanceFrames = (ImagingObjectSelectionStudySeriesInstanceFrames)theEObject;
				T result = caseImagingObjectSelectionStudySeriesInstanceFrames(imagingObjectSelectionStudySeriesInstanceFrames);
				if (result == null) result = caseBackboneElement(imagingObjectSelectionStudySeriesInstanceFrames);
				if (result == null) result = caseDataType(imagingObjectSelectionStudySeriesInstanceFrames);
				if (result == null) result = caseElement(imagingObjectSelectionStudySeriesInstanceFrames);
				if (result == null) result = caseBase(imagingObjectSelectionStudySeriesInstanceFrames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NAMING_SYSTEM: {
				NamingSystem namingSystem = (NamingSystem)theEObject;
				T result = caseNamingSystem(namingSystem);
				if (result == null) result = caseDomainResource(namingSystem);
				if (result == null) result = caseResource(namingSystem);
				if (result == null) result = caseBase(namingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NAMING_SYSTEM_CONTACT: {
				NamingSystemContact namingSystemContact = (NamingSystemContact)theEObject;
				T result = caseNamingSystemContact(namingSystemContact);
				if (result == null) result = caseBackboneElement(namingSystemContact);
				if (result == null) result = caseDataType(namingSystemContact);
				if (result == null) result = caseElement(namingSystemContact);
				if (result == null) result = caseBase(namingSystemContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.NAMING_SYSTEM_UNIQUE_ID: {
				NamingSystemUniqueId namingSystemUniqueId = (NamingSystemUniqueId)theEObject;
				T result = caseNamingSystemUniqueId(namingSystemUniqueId);
				if (result == null) result = caseBackboneElement(namingSystemUniqueId);
				if (result == null) result = caseDataType(namingSystemUniqueId);
				if (result == null) result = caseElement(namingSystemUniqueId);
				if (result == null) result = caseBase(namingSystemUniqueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE: {
				DecisionSupportServiceModule decisionSupportServiceModule = (DecisionSupportServiceModule)theEObject;
				T result = caseDecisionSupportServiceModule(decisionSupportServiceModule);
				if (result == null) result = caseDomainResource(decisionSupportServiceModule);
				if (result == null) result = caseResource(decisionSupportServiceModule);
				if (result == null) result = caseBase(decisionSupportServiceModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER: {
				DecisionSupportServiceModuleParameter decisionSupportServiceModuleParameter = (DecisionSupportServiceModuleParameter)theEObject;
				T result = caseDecisionSupportServiceModuleParameter(decisionSupportServiceModuleParameter);
				if (result == null) result = caseBackboneElement(decisionSupportServiceModuleParameter);
				if (result == null) result = caseDataType(decisionSupportServiceModuleParameter);
				if (result == null) result = caseElement(decisionSupportServiceModuleParameter);
				if (result == null) result = caseBase(decisionSupportServiceModuleParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER_CODE_FILTER: {
				DecisionSupportServiceModuleParameterCodeFilter decisionSupportServiceModuleParameterCodeFilter = (DecisionSupportServiceModuleParameterCodeFilter)theEObject;
				T result = caseDecisionSupportServiceModuleParameterCodeFilter(decisionSupportServiceModuleParameterCodeFilter);
				if (result == null) result = caseBackboneElement(decisionSupportServiceModuleParameterCodeFilter);
				if (result == null) result = caseDataType(decisionSupportServiceModuleParameterCodeFilter);
				if (result == null) result = caseElement(decisionSupportServiceModuleParameterCodeFilter);
				if (result == null) result = caseBase(decisionSupportServiceModuleParameterCodeFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DECISION_SUPPORT_SERVICE_MODULE_PARAMETER_DATE_FILTER: {
				DecisionSupportServiceModuleParameterDateFilter decisionSupportServiceModuleParameterDateFilter = (DecisionSupportServiceModuleParameterDateFilter)theEObject;
				T result = caseDecisionSupportServiceModuleParameterDateFilter(decisionSupportServiceModuleParameterDateFilter);
				if (result == null) result = caseBackboneElement(decisionSupportServiceModuleParameterDateFilter);
				if (result == null) result = caseDataType(decisionSupportServiceModuleParameterDateFilter);
				if (result == null) result = caseElement(decisionSupportServiceModuleParameterDateFilter);
				if (result == null) result = caseBase(decisionSupportServiceModuleParameterDateFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONCEPT_MAP: {
				ConceptMap conceptMap = (ConceptMap)theEObject;
				T result = caseConceptMap(conceptMap);
				if (result == null) result = caseDomainResource(conceptMap);
				if (result == null) result = caseResource(conceptMap);
				if (result == null) result = caseBase(conceptMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONCEPT_MAP_CONTACT: {
				ConceptMapContact conceptMapContact = (ConceptMapContact)theEObject;
				T result = caseConceptMapContact(conceptMapContact);
				if (result == null) result = caseBackboneElement(conceptMapContact);
				if (result == null) result = caseDataType(conceptMapContact);
				if (result == null) result = caseElement(conceptMapContact);
				if (result == null) result = caseBase(conceptMapContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT: {
				ConceptMapSourceElement conceptMapSourceElement = (ConceptMapSourceElement)theEObject;
				T result = caseConceptMapSourceElement(conceptMapSourceElement);
				if (result == null) result = caseBackboneElement(conceptMapSourceElement);
				if (result == null) result = caseDataType(conceptMapSourceElement);
				if (result == null) result = caseElement(conceptMapSourceElement);
				if (result == null) result = caseBase(conceptMapSourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT: {
				ConceptMapSourceElementTargetElement conceptMapSourceElementTargetElement = (ConceptMapSourceElementTargetElement)theEObject;
				T result = caseConceptMapSourceElementTargetElement(conceptMapSourceElementTargetElement);
				if (result == null) result = caseBackboneElement(conceptMapSourceElementTargetElement);
				if (result == null) result = caseDataType(conceptMapSourceElementTargetElement);
				if (result == null) result = caseElement(conceptMapSourceElementTargetElement);
				if (result == null) result = caseBase(conceptMapSourceElementTargetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONCEPT_MAP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT: {
				ConceptMapSourceElementTargetElementOtherElement conceptMapSourceElementTargetElementOtherElement = (ConceptMapSourceElementTargetElementOtherElement)theEObject;
				T result = caseConceptMapSourceElementTargetElementOtherElement(conceptMapSourceElementTargetElementOtherElement);
				if (result == null) result = caseBackboneElement(conceptMapSourceElementTargetElementOtherElement);
				if (result == null) result = caseDataType(conceptMapSourceElementTargetElementOtherElement);
				if (result == null) result = caseElement(conceptMapSourceElementTargetElementOtherElement);
				if (result == null) result = caseBase(conceptMapSourceElementTargetElementOtherElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.FLAG: {
				Flag flag = (Flag)theEObject;
				T result = caseFlag(flag);
				if (result == null) result = caseDomainResource(flag);
				if (result == null) result = caseResource(flag);
				if (result == null) result = caseBase(flag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseDomainResource(sequence);
				if (result == null) result = caseResource(sequence);
				if (result == null) result = caseBase(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SEQUENCE_COORDINATE: {
				SequenceCoordinate sequenceCoordinate = (SequenceCoordinate)theEObject;
				T result = caseSequenceCoordinate(sequenceCoordinate);
				if (result == null) result = caseBackboneElement(sequenceCoordinate);
				if (result == null) result = caseDataType(sequenceCoordinate);
				if (result == null) result = caseElement(sequenceCoordinate);
				if (result == null) result = caseBase(sequenceCoordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SEQUENCE_QUALITY: {
				SequenceQuality sequenceQuality = (SequenceQuality)theEObject;
				T result = caseSequenceQuality(sequenceQuality);
				if (result == null) result = caseBackboneElement(sequenceQuality);
				if (result == null) result = caseDataType(sequenceQuality);
				if (result == null) result = caseElement(sequenceQuality);
				if (result == null) result = caseBase(sequenceQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SEQUENCE_CHIP: {
				SequenceChip sequenceChip = (SequenceChip)theEObject;
				T result = caseSequenceChip(sequenceChip);
				if (result == null) result = caseBackboneElement(sequenceChip);
				if (result == null) result = caseDataType(sequenceChip);
				if (result == null) result = caseElement(sequenceChip);
				if (result == null) result = caseBase(sequenceChip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SEQUENCE_REPOSITORY: {
				SequenceRepository sequenceRepository = (SequenceRepository)theEObject;
				T result = caseSequenceRepository(sequenceRepository);
				if (result == null) result = caseBackboneElement(sequenceRepository);
				if (result == null) result = caseDataType(sequenceRepository);
				if (result == null) result = caseElement(sequenceRepository);
				if (result == null) result = caseBase(sequenceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseDomainResource(contract);
				if (result == null) result = caseResource(contract);
				if (result == null) result = caseBase(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_ACTOR: {
				ContractActor contractActor = (ContractActor)theEObject;
				T result = caseContractActor(contractActor);
				if (result == null) result = caseBackboneElement(contractActor);
				if (result == null) result = caseDataType(contractActor);
				if (result == null) result = caseElement(contractActor);
				if (result == null) result = caseBase(contractActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_VALUED_ITEM: {
				ContractValuedItem contractValuedItem = (ContractValuedItem)theEObject;
				T result = caseContractValuedItem(contractValuedItem);
				if (result == null) result = caseBackboneElement(contractValuedItem);
				if (result == null) result = caseDataType(contractValuedItem);
				if (result == null) result = caseElement(contractValuedItem);
				if (result == null) result = caseBase(contractValuedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_SIGNATORY: {
				ContractSignatory contractSignatory = (ContractSignatory)theEObject;
				T result = caseContractSignatory(contractSignatory);
				if (result == null) result = caseBackboneElement(contractSignatory);
				if (result == null) result = caseDataType(contractSignatory);
				if (result == null) result = caseElement(contractSignatory);
				if (result == null) result = caseBase(contractSignatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_TERM: {
				ContractTerm contractTerm = (ContractTerm)theEObject;
				T result = caseContractTerm(contractTerm);
				if (result == null) result = caseBackboneElement(contractTerm);
				if (result == null) result = caseDataType(contractTerm);
				if (result == null) result = caseElement(contractTerm);
				if (result == null) result = caseBase(contractTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_TERM_TERM_ACTOR: {
				ContractTermTermActor contractTermTermActor = (ContractTermTermActor)theEObject;
				T result = caseContractTermTermActor(contractTermTermActor);
				if (result == null) result = caseBackboneElement(contractTermTermActor);
				if (result == null) result = caseDataType(contractTermTermActor);
				if (result == null) result = caseElement(contractTermTermActor);
				if (result == null) result = caseBase(contractTermTermActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_TERM_TERM_VALUED_ITEM: {
				ContractTermTermValuedItem contractTermTermValuedItem = (ContractTermTermValuedItem)theEObject;
				T result = caseContractTermTermValuedItem(contractTermTermValuedItem);
				if (result == null) result = caseBackboneElement(contractTermTermValuedItem);
				if (result == null) result = caseDataType(contractTermTermValuedItem);
				if (result == null) result = caseElement(contractTermTermValuedItem);
				if (result == null) result = caseBase(contractTermTermValuedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_FRIENDLY_LANGUAGE: {
				ContractFriendlyLanguage contractFriendlyLanguage = (ContractFriendlyLanguage)theEObject;
				T result = caseContractFriendlyLanguage(contractFriendlyLanguage);
				if (result == null) result = caseBackboneElement(contractFriendlyLanguage);
				if (result == null) result = caseDataType(contractFriendlyLanguage);
				if (result == null) result = caseElement(contractFriendlyLanguage);
				if (result == null) result = caseBase(contractFriendlyLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_LEGAL_LANGUAGE: {
				ContractLegalLanguage contractLegalLanguage = (ContractLegalLanguage)theEObject;
				T result = caseContractLegalLanguage(contractLegalLanguage);
				if (result == null) result = caseBackboneElement(contractLegalLanguage);
				if (result == null) result = caseDataType(contractLegalLanguage);
				if (result == null) result = caseElement(contractLegalLanguage);
				if (result == null) result = caseBase(contractLegalLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONTRACT_COMPUTABLE_LANGUAGE: {
				ContractComputableLanguage contractComputableLanguage = (ContractComputableLanguage)theEObject;
				T result = caseContractComputableLanguage(contractComputableLanguage);
				if (result == null) result = caseBackboneElement(contractComputableLanguage);
				if (result == null) result = caseDataType(contractComputableLanguage);
				if (result == null) result = caseElement(contractComputableLanguage);
				if (result == null) result = caseBase(contractComputableLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseDomainResource(composition);
				if (result == null) result = caseResource(composition);
				if (result == null) result = caseBase(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COMPOSITION_ATTESTER: {
				CompositionAttester compositionAttester = (CompositionAttester)theEObject;
				T result = caseCompositionAttester(compositionAttester);
				if (result == null) result = caseBackboneElement(compositionAttester);
				if (result == null) result = caseDataType(compositionAttester);
				if (result == null) result = caseElement(compositionAttester);
				if (result == null) result = caseBase(compositionAttester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COMPOSITION_EVENT: {
				CompositionEvent compositionEvent = (CompositionEvent)theEObject;
				T result = caseCompositionEvent(compositionEvent);
				if (result == null) result = caseBackboneElement(compositionEvent);
				if (result == null) result = caseDataType(compositionEvent);
				if (result == null) result = caseElement(compositionEvent);
				if (result == null) result = caseBase(compositionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COMPOSITION_SECTION: {
				CompositionSection compositionSection = (CompositionSection)theEObject;
				T result = caseCompositionSection(compositionSection);
				if (result == null) result = caseBackboneElement(compositionSection);
				if (result == null) result = caseDataType(compositionSection);
				if (result == null) result = caseElement(compositionSection);
				if (result == null) result = caseBase(compositionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseResource(binary);
				if (result == null) result = caseBase(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOCUMENT_MANIFEST: {
				DocumentManifest documentManifest = (DocumentManifest)theEObject;
				T result = caseDocumentManifest(documentManifest);
				if (result == null) result = caseDomainResource(documentManifest);
				if (result == null) result = caseResource(documentManifest);
				if (result == null) result = caseBase(documentManifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOCUMENT_MANIFEST_CONTENT: {
				DocumentManifestContent documentManifestContent = (DocumentManifestContent)theEObject;
				T result = caseDocumentManifestContent(documentManifestContent);
				if (result == null) result = caseBackboneElement(documentManifestContent);
				if (result == null) result = caseDataType(documentManifestContent);
				if (result == null) result = caseElement(documentManifestContent);
				if (result == null) result = caseBase(documentManifestContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DOCUMENT_MANIFEST_RELATED: {
				DocumentManifestRelated documentManifestRelated = (DocumentManifestRelated)theEObject;
				T result = caseDocumentManifestRelated(documentManifestRelated);
				if (result == null) result = caseBackboneElement(documentManifestRelated);
				if (result == null) result = caseDataType(documentManifestRelated);
				if (result == null) result = caseElement(documentManifestRelated);
				if (result == null) result = caseBase(documentManifestRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PAYMENT_RECONCILIATION: {
				PaymentReconciliation paymentReconciliation = (PaymentReconciliation)theEObject;
				T result = casePaymentReconciliation(paymentReconciliation);
				if (result == null) result = caseDomainResource(paymentReconciliation);
				if (result == null) result = caseResource(paymentReconciliation);
				if (result == null) result = caseBase(paymentReconciliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PAYMENT_RECONCILIATION_DETAILS: {
				PaymentReconciliationDetails paymentReconciliationDetails = (PaymentReconciliationDetails)theEObject;
				T result = casePaymentReconciliationDetails(paymentReconciliationDetails);
				if (result == null) result = caseBackboneElement(paymentReconciliationDetails);
				if (result == null) result = caseDataType(paymentReconciliationDetails);
				if (result == null) result = caseElement(paymentReconciliationDetails);
				if (result == null) result = caseBase(paymentReconciliationDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PAYMENT_RECONCILIATION_NOTES: {
				PaymentReconciliationNotes paymentReconciliationNotes = (PaymentReconciliationNotes)theEObject;
				T result = casePaymentReconciliationNotes(paymentReconciliationNotes);
				if (result == null) result = caseBackboneElement(paymentReconciliationNotes);
				if (result == null) result = caseDataType(paymentReconciliationNotes);
				if (result == null) result = caseElement(paymentReconciliationNotes);
				if (result == null) result = caseBase(paymentReconciliationNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DEVICE_USE_STATEMENT: {
				DeviceUseStatement deviceUseStatement = (DeviceUseStatement)theEObject;
				T result = caseDeviceUseStatement(deviceUseStatement);
				if (result == null) result = caseDomainResource(deviceUseStatement);
				if (result == null) result = caseResource(deviceUseStatement);
				if (result == null) result = caseBase(deviceUseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT: {
				TestScript testScript = (TestScript)theEObject;
				T result = caseTestScript(testScript);
				if (result == null) result = caseDomainResource(testScript);
				if (result == null) result = caseResource(testScript);
				if (result == null) result = caseBase(testScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_CONTACT: {
				TestScriptContact testScriptContact = (TestScriptContact)theEObject;
				T result = caseTestScriptContact(testScriptContact);
				if (result == null) result = caseBackboneElement(testScriptContact);
				if (result == null) result = caseDataType(testScriptContact);
				if (result == null) result = caseElement(testScriptContact);
				if (result == null) result = caseBase(testScriptContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_METADATA: {
				TestScriptMetadata testScriptMetadata = (TestScriptMetadata)theEObject;
				T result = caseTestScriptMetadata(testScriptMetadata);
				if (result == null) result = caseBackboneElement(testScriptMetadata);
				if (result == null) result = caseDataType(testScriptMetadata);
				if (result == null) result = caseElement(testScriptMetadata);
				if (result == null) result = caseBase(testScriptMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_METADATA_LINK: {
				TestScriptMetadataLink testScriptMetadataLink = (TestScriptMetadataLink)theEObject;
				T result = caseTestScriptMetadataLink(testScriptMetadataLink);
				if (result == null) result = caseBackboneElement(testScriptMetadataLink);
				if (result == null) result = caseDataType(testScriptMetadataLink);
				if (result == null) result = caseElement(testScriptMetadataLink);
				if (result == null) result = caseBase(testScriptMetadataLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_METADATA_CAPABILITY: {
				TestScriptMetadataCapability testScriptMetadataCapability = (TestScriptMetadataCapability)theEObject;
				T result = caseTestScriptMetadataCapability(testScriptMetadataCapability);
				if (result == null) result = caseBackboneElement(testScriptMetadataCapability);
				if (result == null) result = caseDataType(testScriptMetadataCapability);
				if (result == null) result = caseElement(testScriptMetadataCapability);
				if (result == null) result = caseBase(testScriptMetadataCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE: {
				Conformance conformance = (Conformance)theEObject;
				T result = caseConformance(conformance);
				if (result == null) result = caseDomainResource(conformance);
				if (result == null) result = caseResource(conformance);
				if (result == null) result = caseBase(conformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_CONTACT: {
				ConformanceContact conformanceContact = (ConformanceContact)theEObject;
				T result = caseConformanceContact(conformanceContact);
				if (result == null) result = caseBackboneElement(conformanceContact);
				if (result == null) result = caseDataType(conformanceContact);
				if (result == null) result = caseElement(conformanceContact);
				if (result == null) result = caseBase(conformanceContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_SOFTWARE: {
				ConformanceSoftware conformanceSoftware = (ConformanceSoftware)theEObject;
				T result = caseConformanceSoftware(conformanceSoftware);
				if (result == null) result = caseBackboneElement(conformanceSoftware);
				if (result == null) result = caseDataType(conformanceSoftware);
				if (result == null) result = caseElement(conformanceSoftware);
				if (result == null) result = caseBase(conformanceSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_IMPLEMENTATION: {
				ConformanceImplementation conformanceImplementation = (ConformanceImplementation)theEObject;
				T result = caseConformanceImplementation(conformanceImplementation);
				if (result == null) result = caseBackboneElement(conformanceImplementation);
				if (result == null) result = caseDataType(conformanceImplementation);
				if (result == null) result = caseElement(conformanceImplementation);
				if (result == null) result = caseBase(conformanceImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_REST: {
				ConformanceRest conformanceRest = (ConformanceRest)theEObject;
				T result = caseConformanceRest(conformanceRest);
				if (result == null) result = caseBackboneElement(conformanceRest);
				if (result == null) result = caseDataType(conformanceRest);
				if (result == null) result = caseElement(conformanceRest);
				if (result == null) result = caseBase(conformanceRest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY: {
				ConformanceRestSecurity conformanceRestSecurity = (ConformanceRestSecurity)theEObject;
				T result = caseConformanceRestSecurity(conformanceRestSecurity);
				if (result == null) result = caseBackboneElement(conformanceRestSecurity);
				if (result == null) result = caseDataType(conformanceRestSecurity);
				if (result == null) result = caseElement(conformanceRestSecurity);
				if (result == null) result = caseBase(conformanceRestSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_REST_SECURITY_CERTIFICATE: {
				ConformanceRestSecurityCertificate conformanceRestSecurityCertificate = (ConformanceRestSecurityCertificate)theEObject;
				T result = caseConformanceRestSecurityCertificate(conformanceRestSecurityCertificate);
				if (result == null) result = caseBackboneElement(conformanceRestSecurityCertificate);
				if (result == null) result = caseDataType(conformanceRestSecurityCertificate);
				if (result == null) result = caseElement(conformanceRestSecurityCertificate);
				if (result == null) result = caseBase(conformanceRestSecurityCertificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE: {
				ConformanceRestResource conformanceRestResource = (ConformanceRestResource)theEObject;
				T result = caseConformanceRestResource(conformanceRestResource);
				if (result == null) result = caseBackboneElement(conformanceRestResource);
				if (result == null) result = caseDataType(conformanceRestResource);
				if (result == null) result = caseElement(conformanceRestResource);
				if (result == null) result = caseBase(conformanceRestResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_RESOURCE_INTERACTION: {
				ConformanceRestResourceResourceInteraction conformanceRestResourceResourceInteraction = (ConformanceRestResourceResourceInteraction)theEObject;
				T result = caseConformanceRestResourceResourceInteraction(conformanceRestResourceResourceInteraction);
				if (result == null) result = caseBackboneElement(conformanceRestResourceResourceInteraction);
				if (result == null) result = caseDataType(conformanceRestResourceResourceInteraction);
				if (result == null) result = caseElement(conformanceRestResourceResourceInteraction);
				if (result == null) result = caseBase(conformanceRestResourceResourceInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_REST_RESOURCE_SEARCH_PARAM: {
				ConformanceRestResourceSearchParam conformanceRestResourceSearchParam = (ConformanceRestResourceSearchParam)theEObject;
				T result = caseConformanceRestResourceSearchParam(conformanceRestResourceSearchParam);
				if (result == null) result = caseBackboneElement(conformanceRestResourceSearchParam);
				if (result == null) result = caseDataType(conformanceRestResourceSearchParam);
				if (result == null) result = caseElement(conformanceRestResourceSearchParam);
				if (result == null) result = caseBase(conformanceRestResourceSearchParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_REST_SYSTEM_INTERACTION: {
				ConformanceRestSystemInteraction conformanceRestSystemInteraction = (ConformanceRestSystemInteraction)theEObject;
				T result = caseConformanceRestSystemInteraction(conformanceRestSystemInteraction);
				if (result == null) result = caseBackboneElement(conformanceRestSystemInteraction);
				if (result == null) result = caseDataType(conformanceRestSystemInteraction);
				if (result == null) result = caseElement(conformanceRestSystemInteraction);
				if (result == null) result = caseBase(conformanceRestSystemInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_REST_OPERATION: {
				ConformanceRestOperation conformanceRestOperation = (ConformanceRestOperation)theEObject;
				T result = caseConformanceRestOperation(conformanceRestOperation);
				if (result == null) result = caseBackboneElement(conformanceRestOperation);
				if (result == null) result = caseDataType(conformanceRestOperation);
				if (result == null) result = caseElement(conformanceRestOperation);
				if (result == null) result = caseBase(conformanceRestOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OPERATION_DEFINITION: {
				OperationDefinition operationDefinition = (OperationDefinition)theEObject;
				T result = caseOperationDefinition(operationDefinition);
				if (result == null) result = caseDomainResource(operationDefinition);
				if (result == null) result = caseResource(operationDefinition);
				if (result == null) result = caseBase(operationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OPERATION_DEFINITION_CONTACT: {
				OperationDefinitionContact operationDefinitionContact = (OperationDefinitionContact)theEObject;
				T result = caseOperationDefinitionContact(operationDefinitionContact);
				if (result == null) result = caseBackboneElement(operationDefinitionContact);
				if (result == null) result = caseDataType(operationDefinitionContact);
				if (result == null) result = caseElement(operationDefinitionContact);
				if (result == null) result = caseBase(operationDefinitionContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OPERATION_DEFINITION_PARAMETER: {
				OperationDefinitionParameter operationDefinitionParameter = (OperationDefinitionParameter)theEObject;
				T result = caseOperationDefinitionParameter(operationDefinitionParameter);
				if (result == null) result = caseBackboneElement(operationDefinitionParameter);
				if (result == null) result = caseDataType(operationDefinitionParameter);
				if (result == null) result = caseElement(operationDefinitionParameter);
				if (result == null) result = caseBase(operationDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OPERATION_DEFINITION_PARAMETER_BINDING: {
				OperationDefinitionParameterBinding operationDefinitionParameterBinding = (OperationDefinitionParameterBinding)theEObject;
				T result = caseOperationDefinitionParameterBinding(operationDefinitionParameterBinding);
				if (result == null) result = caseBackboneElement(operationDefinitionParameterBinding);
				if (result == null) result = caseDataType(operationDefinitionParameterBinding);
				if (result == null) result = caseElement(operationDefinitionParameterBinding);
				if (result == null) result = caseBase(operationDefinitionParameterBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_MESSAGING: {
				ConformanceMessaging conformanceMessaging = (ConformanceMessaging)theEObject;
				T result = caseConformanceMessaging(conformanceMessaging);
				if (result == null) result = caseBackboneElement(conformanceMessaging);
				if (result == null) result = caseDataType(conformanceMessaging);
				if (result == null) result = caseElement(conformanceMessaging);
				if (result == null) result = caseBase(conformanceMessaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_MESSAGING_ENDPOINT: {
				ConformanceMessagingEndpoint conformanceMessagingEndpoint = (ConformanceMessagingEndpoint)theEObject;
				T result = caseConformanceMessagingEndpoint(conformanceMessagingEndpoint);
				if (result == null) result = caseBackboneElement(conformanceMessagingEndpoint);
				if (result == null) result = caseDataType(conformanceMessagingEndpoint);
				if (result == null) result = caseElement(conformanceMessagingEndpoint);
				if (result == null) result = caseBase(conformanceMessagingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_MESSAGING_EVENT: {
				ConformanceMessagingEvent conformanceMessagingEvent = (ConformanceMessagingEvent)theEObject;
				T result = caseConformanceMessagingEvent(conformanceMessagingEvent);
				if (result == null) result = caseBackboneElement(conformanceMessagingEvent);
				if (result == null) result = caseDataType(conformanceMessagingEvent);
				if (result == null) result = caseElement(conformanceMessagingEvent);
				if (result == null) result = caseBase(conformanceMessagingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CONFORMANCE_DOCUMENT: {
				ConformanceDocument conformanceDocument = (ConformanceDocument)theEObject;
				T result = caseConformanceDocument(conformanceDocument);
				if (result == null) result = caseBackboneElement(conformanceDocument);
				if (result == null) result = caseDataType(conformanceDocument);
				if (result == null) result = caseElement(conformanceDocument);
				if (result == null) result = caseBase(conformanceDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_ORIGIN: {
				TestScriptOrigin testScriptOrigin = (TestScriptOrigin)theEObject;
				T result = caseTestScriptOrigin(testScriptOrigin);
				if (result == null) result = caseBackboneElement(testScriptOrigin);
				if (result == null) result = caseDataType(testScriptOrigin);
				if (result == null) result = caseElement(testScriptOrigin);
				if (result == null) result = caseBase(testScriptOrigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_DESTINATION: {
				TestScriptDestination testScriptDestination = (TestScriptDestination)theEObject;
				T result = caseTestScriptDestination(testScriptDestination);
				if (result == null) result = caseBackboneElement(testScriptDestination);
				if (result == null) result = caseDataType(testScriptDestination);
				if (result == null) result = caseElement(testScriptDestination);
				if (result == null) result = caseBase(testScriptDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_FIXTURE: {
				TestScriptFixture testScriptFixture = (TestScriptFixture)theEObject;
				T result = caseTestScriptFixture(testScriptFixture);
				if (result == null) result = caseBackboneElement(testScriptFixture);
				if (result == null) result = caseDataType(testScriptFixture);
				if (result == null) result = caseElement(testScriptFixture);
				if (result == null) result = caseBase(testScriptFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_VARIABLE: {
				TestScriptVariable testScriptVariable = (TestScriptVariable)theEObject;
				T result = caseTestScriptVariable(testScriptVariable);
				if (result == null) result = caseBackboneElement(testScriptVariable);
				if (result == null) result = caseDataType(testScriptVariable);
				if (result == null) result = caseElement(testScriptVariable);
				if (result == null) result = caseBase(testScriptVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_SETUP: {
				TestScriptSetup testScriptSetup = (TestScriptSetup)theEObject;
				T result = caseTestScriptSetup(testScriptSetup);
				if (result == null) result = caseBackboneElement(testScriptSetup);
				if (result == null) result = caseDataType(testScriptSetup);
				if (result == null) result = caseElement(testScriptSetup);
				if (result == null) result = caseBase(testScriptSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION: {
				TestScriptSetupSetupAction testScriptSetupSetupAction = (TestScriptSetupSetupAction)theEObject;
				T result = caseTestScriptSetupSetupAction(testScriptSetupSetupAction);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupAction);
				if (result == null) result = caseDataType(testScriptSetupSetupAction);
				if (result == null) result = caseElement(testScriptSetupSetupAction);
				if (result == null) result = caseBase(testScriptSetupSetupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION: {
				TestScriptSetupSetupActionOperation testScriptSetupSetupActionOperation = (TestScriptSetupSetupActionOperation)theEObject;
				T result = caseTestScriptSetupSetupActionOperation(testScriptSetupSetupActionOperation);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionOperation);
				if (result == null) result = caseDataType(testScriptSetupSetupActionOperation);
				if (result == null) result = caseElement(testScriptSetupSetupActionOperation);
				if (result == null) result = caseBase(testScriptSetupSetupActionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER: {
				TestScriptSetupSetupActionOperationRequestHeader testScriptSetupSetupActionOperationRequestHeader = (TestScriptSetupSetupActionOperationRequestHeader)theEObject;
				T result = caseTestScriptSetupSetupActionOperationRequestHeader(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseDataType(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseElement(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseBase(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT: {
				TestScriptSetupSetupActionAssert testScriptSetupSetupActionAssert = (TestScriptSetupSetupActionAssert)theEObject;
				T result = caseTestScriptSetupSetupActionAssert(testScriptSetupSetupActionAssert);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionAssert);
				if (result == null) result = caseDataType(testScriptSetupSetupActionAssert);
				if (result == null) result = caseElement(testScriptSetupSetupActionAssert);
				if (result == null) result = caseBase(testScriptSetupSetupActionAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_TEST: {
				TestScriptTest testScriptTest = (TestScriptTest)theEObject;
				T result = caseTestScriptTest(testScriptTest);
				if (result == null) result = caseBackboneElement(testScriptTest);
				if (result == null) result = caseDataType(testScriptTest);
				if (result == null) result = caseElement(testScriptTest);
				if (result == null) result = caseBase(testScriptTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_TEST_TEST_ACTION: {
				TestScriptTestTestAction testScriptTestTestAction = (TestScriptTestTestAction)theEObject;
				T result = caseTestScriptTestTestAction(testScriptTestTestAction);
				if (result == null) result = caseBackboneElement(testScriptTestTestAction);
				if (result == null) result = caseDataType(testScriptTestTestAction);
				if (result == null) result = caseElement(testScriptTestTestAction);
				if (result == null) result = caseBase(testScriptTestTestAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_TEARDOWN: {
				TestScriptTeardown testScriptTeardown = (TestScriptTeardown)theEObject;
				T result = caseTestScriptTeardown(testScriptTeardown);
				if (result == null) result = caseBackboneElement(testScriptTeardown);
				if (result == null) result = caseDataType(testScriptTeardown);
				if (result == null) result = caseElement(testScriptTeardown);
				if (result == null) result = caseBase(testScriptTeardown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.TEST_SCRIPT_TEARDOWN_TEARDOWN_ACTION: {
				TestScriptTeardownTeardownAction testScriptTeardownTeardownAction = (TestScriptTeardownTeardownAction)theEObject;
				T result = caseTestScriptTeardownTeardownAction(testScriptTeardownTeardownAction);
				if (result == null) result = caseBackboneElement(testScriptTeardownTeardownAction);
				if (result == null) result = caseDataType(testScriptTeardownTeardownAction);
				if (result == null) result = caseElement(testScriptTeardownTeardownAction);
				if (result == null) result = caseBase(testScriptTeardownTeardownAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseDomainResource(dataElement);
				if (result == null) result = caseResource(dataElement);
				if (result == null) result = caseBase(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DATA_ELEMENT_CONTACT: {
				DataElementContact dataElementContact = (DataElementContact)theEObject;
				T result = caseDataElementContact(dataElementContact);
				if (result == null) result = caseBackboneElement(dataElementContact);
				if (result == null) result = caseDataType(dataElementContact);
				if (result == null) result = caseElement(dataElementContact);
				if (result == null) result = caseBase(dataElementContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DATA_ELEMENT_MAPPING: {
				DataElementMapping dataElementMapping = (DataElementMapping)theEObject;
				T result = caseDataElementMapping(dataElementMapping);
				if (result == null) result = caseBackboneElement(dataElementMapping);
				if (result == null) result = caseDataType(dataElementMapping);
				if (result == null) result = caseElement(dataElementMapping);
				if (result == null) result = caseBase(dataElementMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DECISION_SUPPORT_RULE: {
				DecisionSupportRule decisionSupportRule = (DecisionSupportRule)theEObject;
				T result = caseDecisionSupportRule(decisionSupportRule);
				if (result == null) result = caseDomainResource(decisionSupportRule);
				if (result == null) result = caseResource(decisionSupportRule);
				if (result == null) result = caseBase(decisionSupportRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DECISION_SUPPORT_RULE_TRIGGER: {
				DecisionSupportRuleTrigger decisionSupportRuleTrigger = (DecisionSupportRuleTrigger)theEObject;
				T result = caseDecisionSupportRuleTrigger(decisionSupportRuleTrigger);
				if (result == null) result = caseBackboneElement(decisionSupportRuleTrigger);
				if (result == null) result = caseDataType(decisionSupportRuleTrigger);
				if (result == null) result = caseElement(decisionSupportRuleTrigger);
				if (result == null) result = caseBase(decisionSupportRuleTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DECISION_SUPPORT_RULE_ACTION: {
				DecisionSupportRuleAction decisionSupportRuleAction = (DecisionSupportRuleAction)theEObject;
				T result = caseDecisionSupportRuleAction(decisionSupportRuleAction);
				if (result == null) result = caseBackboneElement(decisionSupportRuleAction);
				if (result == null) result = caseDataType(decisionSupportRuleAction);
				if (result == null) result = caseElement(decisionSupportRuleAction);
				if (result == null) result = caseBase(decisionSupportRuleAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DECISION_SUPPORT_RULE_ACTION_CUSTOMIZATION: {
				DecisionSupportRuleActionCustomization decisionSupportRuleActionCustomization = (DecisionSupportRuleActionCustomization)theEObject;
				T result = caseDecisionSupportRuleActionCustomization(decisionSupportRuleActionCustomization);
				if (result == null) result = caseBackboneElement(decisionSupportRuleActionCustomization);
				if (result == null) result = caseDataType(decisionSupportRuleActionCustomization);
				if (result == null) result = caseElement(decisionSupportRuleActionCustomization);
				if (result == null) result = caseBase(decisionSupportRuleActionCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MESSAGE_HEADER: {
				MessageHeader messageHeader = (MessageHeader)theEObject;
				T result = caseMessageHeader(messageHeader);
				if (result == null) result = caseDomainResource(messageHeader);
				if (result == null) result = caseResource(messageHeader);
				if (result == null) result = caseBase(messageHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MESSAGE_HEADER_RESPONSE: {
				MessageHeaderResponse messageHeaderResponse = (MessageHeaderResponse)theEObject;
				T result = caseMessageHeaderResponse(messageHeaderResponse);
				if (result == null) result = caseBackboneElement(messageHeaderResponse);
				if (result == null) result = caseDataType(messageHeaderResponse);
				if (result == null) result = caseElement(messageHeaderResponse);
				if (result == null) result = caseBase(messageHeaderResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OPERATION_OUTCOME: {
				OperationOutcome operationOutcome = (OperationOutcome)theEObject;
				T result = caseOperationOutcome(operationOutcome);
				if (result == null) result = caseDomainResource(operationOutcome);
				if (result == null) result = caseResource(operationOutcome);
				if (result == null) result = caseBase(operationOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.OPERATION_OUTCOME_ISSUE: {
				OperationOutcomeIssue operationOutcomeIssue = (OperationOutcomeIssue)theEObject;
				T result = caseOperationOutcomeIssue(operationOutcomeIssue);
				if (result == null) result = caseBackboneElement(operationOutcomeIssue);
				if (result == null) result = caseDataType(operationOutcomeIssue);
				if (result == null) result = caseElement(operationOutcomeIssue);
				if (result == null) result = caseBase(operationOutcomeIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MESSAGE_HEADER_MESSAGE_SOURCE: {
				MessageHeaderMessageSource messageHeaderMessageSource = (MessageHeaderMessageSource)theEObject;
				T result = caseMessageHeaderMessageSource(messageHeaderMessageSource);
				if (result == null) result = caseBackboneElement(messageHeaderMessageSource);
				if (result == null) result = caseDataType(messageHeaderMessageSource);
				if (result == null) result = caseElement(messageHeaderMessageSource);
				if (result == null) result = caseBase(messageHeaderMessageSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MESSAGE_HEADER_MESSAGE_DESTINATION: {
				MessageHeaderMessageDestination messageHeaderMessageDestination = (MessageHeaderMessageDestination)theEObject;
				T result = caseMessageHeaderMessageDestination(messageHeaderMessageDestination);
				if (result == null) result = caseBackboneElement(messageHeaderMessageDestination);
				if (result == null) result = caseDataType(messageHeaderMessageDestination);
				if (result == null) result = caseElement(messageHeaderMessageDestination);
				if (result == null) result = caseBase(messageHeaderMessageDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = caseDomainResource(subscription);
				if (result == null) result = caseResource(subscription);
				if (result == null) result = caseBase(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SUBSCRIPTION_CHANNEL: {
				SubscriptionChannel subscriptionChannel = (SubscriptionChannel)theEObject;
				T result = caseSubscriptionChannel(subscriptionChannel);
				if (result == null) result = caseBackboneElement(subscriptionChannel);
				if (result == null) result = caseDataType(subscriptionChannel);
				if (result == null) result = caseElement(subscriptionChannel);
				if (result == null) result = caseBase(subscriptionChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ENROLLMENT_RESPONSE: {
				EnrollmentResponse enrollmentResponse = (EnrollmentResponse)theEObject;
				T result = caseEnrollmentResponse(enrollmentResponse);
				if (result == null) result = caseDomainResource(enrollmentResponse);
				if (result == null) result = caseResource(enrollmentResponse);
				if (result == null) result = caseBase(enrollmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ENROLLMENT_REQUEST: {
				EnrollmentRequest enrollmentRequest = (EnrollmentRequest)theEObject;
				T result = caseEnrollmentRequest(enrollmentRequest);
				if (result == null) result = caseDomainResource(enrollmentRequest);
				if (result == null) result = caseResource(enrollmentRequest);
				if (result == null) result = caseBase(enrollmentRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = caseDomainResource(coverage);
				if (result == null) result = caseResource(coverage);
				if (result == null) result = caseBase(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION: {
				ImmunizationRecommendation immunizationRecommendation = (ImmunizationRecommendation)theEObject;
				T result = caseImmunizationRecommendation(immunizationRecommendation);
				if (result == null) result = caseDomainResource(immunizationRecommendation);
				if (result == null) result = caseResource(immunizationRecommendation);
				if (result == null) result = caseBase(immunizationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: {
				ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation = (ImmunizationRecommendationRecommendation)theEObject;
				T result = caseImmunizationRecommendationRecommendation(immunizationRecommendationRecommendation);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendation);
				if (result == null) result = caseDataType(immunizationRecommendationRecommendation);
				if (result == null) result = caseElement(immunizationRecommendationRecommendation);
				if (result == null) result = caseBase(immunizationRecommendationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_DATE_CRITERION: {
				ImmunizationRecommendationRecommendationDateCriterion immunizationRecommendationRecommendationDateCriterion = (ImmunizationRecommendationRecommendationDateCriterion)theEObject;
				T result = caseImmunizationRecommendationRecommendationDateCriterion(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseDataType(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseElement(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseBase(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL: {
				ImmunizationRecommendationRecommendationProtocol immunizationRecommendationRecommendationProtocol = (ImmunizationRecommendationRecommendationProtocol)theEObject;
				T result = caseImmunizationRecommendationRecommendationProtocol(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = caseDataType(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = caseElement(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = caseBase(immunizationRecommendationRecommendationProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMMUNIZATION: {
				Immunization immunization = (Immunization)theEObject;
				T result = caseImmunization(immunization);
				if (result == null) result = caseDomainResource(immunization);
				if (result == null) result = caseResource(immunization);
				if (result == null) result = caseBase(immunization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMMUNIZATION_EXPLANATION: {
				ImmunizationExplanation immunizationExplanation = (ImmunizationExplanation)theEObject;
				T result = caseImmunizationExplanation(immunizationExplanation);
				if (result == null) result = caseBackboneElement(immunizationExplanation);
				if (result == null) result = caseDataType(immunizationExplanation);
				if (result == null) result = caseElement(immunizationExplanation);
				if (result == null) result = caseBase(immunizationExplanation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMMUNIZATION_REACTION: {
				ImmunizationReaction immunizationReaction = (ImmunizationReaction)theEObject;
				T result = caseImmunizationReaction(immunizationReaction);
				if (result == null) result = caseBackboneElement(immunizationReaction);
				if (result == null) result = caseDataType(immunizationReaction);
				if (result == null) result = caseElement(immunizationReaction);
				if (result == null) result = caseBase(immunizationReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL: {
				ImmunizationVaccinationProtocol immunizationVaccinationProtocol = (ImmunizationVaccinationProtocol)theEObject;
				T result = caseImmunizationVaccinationProtocol(immunizationVaccinationProtocol);
				if (result == null) result = caseBackboneElement(immunizationVaccinationProtocol);
				if (result == null) result = caseDataType(immunizationVaccinationProtocol);
				if (result == null) result = caseElement(immunizationVaccinationProtocol);
				if (result == null) result = caseBase(immunizationVaccinationProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseResource(bundle);
				if (result == null) result = caseBase(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BUNDLE_LINK: {
				BundleLink bundleLink = (BundleLink)theEObject;
				T result = caseBundleLink(bundleLink);
				if (result == null) result = caseBackboneElement(bundleLink);
				if (result == null) result = caseDataType(bundleLink);
				if (result == null) result = caseElement(bundleLink);
				if (result == null) result = caseBase(bundleLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BUNDLE_ENTRY: {
				BundleEntry bundleEntry = (BundleEntry)theEObject;
				T result = caseBundleEntry(bundleEntry);
				if (result == null) result = caseBackboneElement(bundleEntry);
				if (result == null) result = caseDataType(bundleEntry);
				if (result == null) result = caseElement(bundleEntry);
				if (result == null) result = caseBase(bundleEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BUNDLE_ENTRY_SEARCH: {
				BundleEntrySearch bundleEntrySearch = (BundleEntrySearch)theEObject;
				T result = caseBundleEntrySearch(bundleEntrySearch);
				if (result == null) result = caseBackboneElement(bundleEntrySearch);
				if (result == null) result = caseDataType(bundleEntrySearch);
				if (result == null) result = caseElement(bundleEntrySearch);
				if (result == null) result = caseBase(bundleEntrySearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BUNDLE_ENTRY_REQUEST: {
				BundleEntryRequest bundleEntryRequest = (BundleEntryRequest)theEObject;
				T result = caseBundleEntryRequest(bundleEntryRequest);
				if (result == null) result = caseBackboneElement(bundleEntryRequest);
				if (result == null) result = caseDataType(bundleEntryRequest);
				if (result == null) result = caseElement(bundleEntryRequest);
				if (result == null) result = caseBase(bundleEntryRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BUNDLE_ENTRY_RESPONSE: {
				BundleEntryResponse bundleEntryResponse = (BundleEntryResponse)theEObject;
				T result = caseBundleEntryResponse(bundleEntryResponse);
				if (result == null) result = caseBackboneElement(bundleEntryResponse);
				if (result == null) result = caseDataType(bundleEntryResponse);
				if (result == null) result = caseElement(bundleEntryResponse);
				if (result == null) result = caseBase(bundleEntryResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ELIGIBILITY_RESPONSE: {
				EligibilityResponse eligibilityResponse = (EligibilityResponse)theEObject;
				T result = caseEligibilityResponse(eligibilityResponse);
				if (result == null) result = caseDomainResource(eligibilityResponse);
				if (result == null) result = caseResource(eligibilityResponse);
				if (result == null) result = caseBase(eligibilityResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ELIGIBILITY_REQUEST: {
				EligibilityRequest eligibilityRequest = (EligibilityRequest)theEObject;
				T result = caseEligibilityRequest(eligibilityRequest);
				if (result == null) result = caseDomainResource(eligibilityRequest);
				if (result == null) result = caseResource(eligibilityRequest);
				if (result == null) result = caseBase(eligibilityRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS: {
				EligibilityResponseBenefits eligibilityResponseBenefits = (EligibilityResponseBenefits)theEObject;
				T result = caseEligibilityResponseBenefits(eligibilityResponseBenefits);
				if (result == null) result = caseBackboneElement(eligibilityResponseBenefits);
				if (result == null) result = caseDataType(eligibilityResponseBenefits);
				if (result == null) result = caseElement(eligibilityResponseBenefits);
				if (result == null) result = caseBase(eligibilityResponseBenefits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_BENEFITS_BENEFIT: {
				EligibilityResponseBenefitsBenefit eligibilityResponseBenefitsBenefit = (EligibilityResponseBenefitsBenefit)theEObject;
				T result = caseEligibilityResponseBenefitsBenefit(eligibilityResponseBenefitsBenefit);
				if (result == null) result = caseBackboneElement(eligibilityResponseBenefitsBenefit);
				if (result == null) result = caseDataType(eligibilityResponseBenefitsBenefit);
				if (result == null) result = caseElement(eligibilityResponseBenefitsBenefit);
				if (result == null) result = caseBase(eligibilityResponseBenefitsBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ELIGIBILITY_RESPONSE_ERRORS: {
				EligibilityResponseErrors eligibilityResponseErrors = (EligibilityResponseErrors)theEObject;
				T result = caseEligibilityResponseErrors(eligibilityResponseErrors);
				if (result == null) result = caseBackboneElement(eligibilityResponseErrors);
				if (result == null) result = caseDataType(eligibilityResponseErrors);
				if (result == null) result = caseElement(eligibilityResponseErrors);
				if (result == null) result = caseBase(eligibilityResponseErrors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PARAMETERS: {
				Parameters parameters = (Parameters)theEObject;
				T result = caseParameters(parameters);
				if (result == null) result = caseResource(parameters);
				if (result == null) result = caseBase(parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PARAMETERS_PARAMETER: {
				ParametersParameter parametersParameter = (ParametersParameter)theEObject;
				T result = caseParametersParameter(parametersParameter);
				if (result == null) result = caseBackboneElement(parametersParameter);
				if (result == null) result = caseDataType(parametersParameter);
				if (result == null) result = caseElement(parametersParameter);
				if (result == null) result = caseBase(parametersParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_DISPENSE: {
				MedicationDispense medicationDispense = (MedicationDispense)theEObject;
				T result = caseMedicationDispense(medicationDispense);
				if (result == null) result = caseDomainResource(medicationDispense);
				if (result == null) result = caseResource(medicationDispense);
				if (result == null) result = caseBase(medicationDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_DISPENSE_DOSAGE_INSTRUCTION: {
				MedicationDispenseDosageInstruction medicationDispenseDosageInstruction = (MedicationDispenseDosageInstruction)theEObject;
				T result = caseMedicationDispenseDosageInstruction(medicationDispenseDosageInstruction);
				if (result == null) result = caseBackboneElement(medicationDispenseDosageInstruction);
				if (result == null) result = caseDataType(medicationDispenseDosageInstruction);
				if (result == null) result = caseElement(medicationDispenseDosageInstruction);
				if (result == null) result = caseBase(medicationDispenseDosageInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_DISPENSE_SUBSTITUTION: {
				MedicationDispenseSubstitution medicationDispenseSubstitution = (MedicationDispenseSubstitution)theEObject;
				T result = caseMedicationDispenseSubstitution(medicationDispenseSubstitution);
				if (result == null) result = caseBackboneElement(medicationDispenseSubstitution);
				if (result == null) result = caseDataType(medicationDispenseSubstitution);
				if (result == null) result = caseElement(medicationDispenseSubstitution);
				if (result == null) result = caseBase(medicationDispenseSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE: {
				ClaimResponse claimResponse = (ClaimResponse)theEObject;
				T result = caseClaimResponse(claimResponse);
				if (result == null) result = caseDomainResource(claimResponse);
				if (result == null) result = caseResource(claimResponse);
				if (result == null) result = caseBase(claimResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseDomainResource(claim);
				if (result == null) result = caseResource(claim);
				if (result == null) result = caseBase(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_PAYEE: {
				ClaimPayee claimPayee = (ClaimPayee)theEObject;
				T result = caseClaimPayee(claimPayee);
				if (result == null) result = caseBackboneElement(claimPayee);
				if (result == null) result = caseDataType(claimPayee);
				if (result == null) result = caseElement(claimPayee);
				if (result == null) result = caseBase(claimPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_DIAGNOSIS: {
				ClaimDiagnosis claimDiagnosis = (ClaimDiagnosis)theEObject;
				T result = caseClaimDiagnosis(claimDiagnosis);
				if (result == null) result = caseBackboneElement(claimDiagnosis);
				if (result == null) result = caseDataType(claimDiagnosis);
				if (result == null) result = caseElement(claimDiagnosis);
				if (result == null) result = caseBase(claimDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_COVERAGE: {
				ClaimCoverage claimCoverage = (ClaimCoverage)theEObject;
				T result = caseClaimCoverage(claimCoverage);
				if (result == null) result = caseBackboneElement(claimCoverage);
				if (result == null) result = caseDataType(claimCoverage);
				if (result == null) result = caseElement(claimCoverage);
				if (result == null) result = caseBase(claimCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_ITEMS: {
				ClaimItems claimItems = (ClaimItems)theEObject;
				T result = caseClaimItems(claimItems);
				if (result == null) result = caseBackboneElement(claimItems);
				if (result == null) result = caseDataType(claimItems);
				if (result == null) result = caseElement(claimItems);
				if (result == null) result = caseBase(claimItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL: {
				ClaimItemsDetail claimItemsDetail = (ClaimItemsDetail)theEObject;
				T result = caseClaimItemsDetail(claimItemsDetail);
				if (result == null) result = caseBackboneElement(claimItemsDetail);
				if (result == null) result = caseDataType(claimItemsDetail);
				if (result == null) result = caseElement(claimItemsDetail);
				if (result == null) result = caseBase(claimItemsDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL_SUB_DETAIL: {
				ClaimItemsDetailSubDetail claimItemsDetailSubDetail = (ClaimItemsDetailSubDetail)theEObject;
				T result = caseClaimItemsDetailSubDetail(claimItemsDetailSubDetail);
				if (result == null) result = caseBackboneElement(claimItemsDetailSubDetail);
				if (result == null) result = caseDataType(claimItemsDetailSubDetail);
				if (result == null) result = caseElement(claimItemsDetailSubDetail);
				if (result == null) result = caseBase(claimItemsDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_ITEMS_PROSTHESIS: {
				ClaimItemsProsthesis claimItemsProsthesis = (ClaimItemsProsthesis)theEObject;
				T result = caseClaimItemsProsthesis(claimItemsProsthesis);
				if (result == null) result = caseBackboneElement(claimItemsProsthesis);
				if (result == null) result = caseDataType(claimItemsProsthesis);
				if (result == null) result = caseElement(claimItemsProsthesis);
				if (result == null) result = caseBase(claimItemsProsthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_MISSING_TEETH: {
				ClaimMissingTeeth claimMissingTeeth = (ClaimMissingTeeth)theEObject;
				T result = caseClaimMissingTeeth(claimMissingTeeth);
				if (result == null) result = caseBackboneElement(claimMissingTeeth);
				if (result == null) result = caseDataType(claimMissingTeeth);
				if (result == null) result = caseElement(claimMissingTeeth);
				if (result == null) result = caseBase(claimMissingTeeth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS: {
				ClaimResponseItems claimResponseItems = (ClaimResponseItems)theEObject;
				T result = caseClaimResponseItems(claimResponseItems);
				if (result == null) result = caseBackboneElement(claimResponseItems);
				if (result == null) result = caseDataType(claimResponseItems);
				if (result == null) result = caseElement(claimResponseItems);
				if (result == null) result = caseBase(claimResponseItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_ADJUDICATION: {
				ClaimResponseItemsItemAdjudication claimResponseItemsItemAdjudication = (ClaimResponseItemsItemAdjudication)theEObject;
				T result = caseClaimResponseItemsItemAdjudication(claimResponseItemsItemAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseItemsItemAdjudication);
				if (result == null) result = caseDataType(claimResponseItemsItemAdjudication);
				if (result == null) result = caseElement(claimResponseItemsItemAdjudication);
				if (result == null) result = caseBase(claimResponseItemsItemAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL: {
				ClaimResponseItemsItemDetail claimResponseItemsItemDetail = (ClaimResponseItemsItemDetail)theEObject;
				T result = caseClaimResponseItemsItemDetail(claimResponseItemsItemDetail);
				if (result == null) result = caseBackboneElement(claimResponseItemsItemDetail);
				if (result == null) result = caseDataType(claimResponseItemsItemDetail);
				if (result == null) result = caseElement(claimResponseItemsItemDetail);
				if (result == null) result = caseBase(claimResponseItemsItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_DETAIL_ADJUDICATION: {
				ClaimResponseItemsItemDetailDetailAdjudication claimResponseItemsItemDetailDetailAdjudication = (ClaimResponseItemsItemDetailDetailAdjudication)theEObject;
				T result = caseClaimResponseItemsItemDetailDetailAdjudication(claimResponseItemsItemDetailDetailAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseItemsItemDetailDetailAdjudication);
				if (result == null) result = caseDataType(claimResponseItemsItemDetailDetailAdjudication);
				if (result == null) result = caseElement(claimResponseItemsItemDetailDetailAdjudication);
				if (result == null) result = caseBase(claimResponseItemsItemDetailDetailAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL: {
				ClaimResponseItemsItemDetailSubDetail claimResponseItemsItemDetailSubDetail = (ClaimResponseItemsItemDetailSubDetail)theEObject;
				T result = caseClaimResponseItemsItemDetailSubDetail(claimResponseItemsItemDetailSubDetail);
				if (result == null) result = caseBackboneElement(claimResponseItemsItemDetailSubDetail);
				if (result == null) result = caseDataType(claimResponseItemsItemDetailSubDetail);
				if (result == null) result = caseElement(claimResponseItemsItemDetailSubDetail);
				if (result == null) result = caseBase(claimResponseItemsItemDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS_ITEM_DETAIL_SUB_DETAIL_SUBDETAIL_ADJUDICATION: {
				ClaimResponseItemsItemDetailSubDetailSubdetailAdjudication claimResponseItemsItemDetailSubDetailSubdetailAdjudication = (ClaimResponseItemsItemDetailSubDetailSubdetailAdjudication)theEObject;
				T result = caseClaimResponseItemsItemDetailSubDetailSubdetailAdjudication(claimResponseItemsItemDetailSubDetailSubdetailAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseItemsItemDetailSubDetailSubdetailAdjudication);
				if (result == null) result = caseDataType(claimResponseItemsItemDetailSubDetailSubdetailAdjudication);
				if (result == null) result = caseElement(claimResponseItemsItemDetailSubDetailSubdetailAdjudication);
				if (result == null) result = caseBase(claimResponseItemsItemDetailSubDetailSubdetailAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM: {
				ClaimResponseAddedItem claimResponseAddedItem = (ClaimResponseAddedItem)theEObject;
				T result = caseClaimResponseAddedItem(claimResponseAddedItem);
				if (result == null) result = caseBackboneElement(claimResponseAddedItem);
				if (result == null) result = caseDataType(claimResponseAddedItem);
				if (result == null) result = caseElement(claimResponseAddedItem);
				if (result == null) result = caseBase(claimResponseAddedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEM_ADJUDICATION: {
				ClaimResponseAddedItemAddedItemAdjudication claimResponseAddedItemAddedItemAdjudication = (ClaimResponseAddedItemAddedItemAdjudication)theEObject;
				T result = caseClaimResponseAddedItemAddedItemAdjudication(claimResponseAddedItemAddedItemAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseAddedItemAddedItemAdjudication);
				if (result == null) result = caseDataType(claimResponseAddedItemAddedItemAdjudication);
				if (result == null) result = caseElement(claimResponseAddedItemAddedItemAdjudication);
				if (result == null) result = caseBase(claimResponseAddedItemAddedItemAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEMS_DETAIL: {
				ClaimResponseAddedItemAddedItemsDetail claimResponseAddedItemAddedItemsDetail = (ClaimResponseAddedItemAddedItemsDetail)theEObject;
				T result = caseClaimResponseAddedItemAddedItemsDetail(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = caseBackboneElement(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = caseDataType(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = caseElement(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = caseBase(claimResponseAddedItemAddedItemsDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEMS_DETAIL_ADDED_ITEM_DETAIL_ADJUDICATION: {
				ClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication = (ClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication)theEObject;
				T result = caseClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication(claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = caseDataType(claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = caseElement(claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = caseBase(claimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS: {
				ClaimResponseErrors claimResponseErrors = (ClaimResponseErrors)theEObject;
				T result = caseClaimResponseErrors(claimResponseErrors);
				if (result == null) result = caseBackboneElement(claimResponseErrors);
				if (result == null) result = caseDataType(claimResponseErrors);
				if (result == null) result = caseElement(claimResponseErrors);
				if (result == null) result = caseBase(claimResponseErrors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_NOTES: {
				ClaimResponseNotes claimResponseNotes = (ClaimResponseNotes)theEObject;
				T result = caseClaimResponseNotes(claimResponseNotes);
				if (result == null) result = caseBackboneElement(claimResponseNotes);
				if (result == null) result = caseDataType(claimResponseNotes);
				if (result == null) result = caseElement(claimResponseNotes);
				if (result == null) result = caseBase(claimResponseNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE: {
				ClaimResponseCoverage claimResponseCoverage = (ClaimResponseCoverage)theEObject;
				T result = caseClaimResponseCoverage(claimResponseCoverage);
				if (result == null) result = caseBackboneElement(claimResponseCoverage);
				if (result == null) result = caseDataType(claimResponseCoverage);
				if (result == null) result = caseElement(claimResponseCoverage);
				if (result == null) result = caseBase(claimResponseCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT: {
				ExplanationOfBenefit explanationOfBenefit = (ExplanationOfBenefit)theEObject;
				T result = caseExplanationOfBenefit(explanationOfBenefit);
				if (result == null) result = caseDomainResource(explanationOfBenefit);
				if (result == null) result = caseResource(explanationOfBenefit);
				if (result == null) result = caseBase(explanationOfBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_PAYEE: {
				ExplanationOfBenefitPayee explanationOfBenefitPayee = (ExplanationOfBenefitPayee)theEObject;
				T result = caseExplanationOfBenefitPayee(explanationOfBenefitPayee);
				if (result == null) result = caseBackboneElement(explanationOfBenefitPayee);
				if (result == null) result = caseDataType(explanationOfBenefitPayee);
				if (result == null) result = caseElement(explanationOfBenefitPayee);
				if (result == null) result = caseBase(explanationOfBenefitPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: {
				ExplanationOfBenefitDiagnosis explanationOfBenefitDiagnosis = (ExplanationOfBenefitDiagnosis)theEObject;
				T result = caseExplanationOfBenefitDiagnosis(explanationOfBenefitDiagnosis);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDiagnosis);
				if (result == null) result = caseDataType(explanationOfBenefitDiagnosis);
				if (result == null) result = caseElement(explanationOfBenefitDiagnosis);
				if (result == null) result = caseBase(explanationOfBenefitDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_COVERAGE: {
				ExplanationOfBenefitCoverage explanationOfBenefitCoverage = (ExplanationOfBenefitCoverage)theEObject;
				T result = caseExplanationOfBenefitCoverage(explanationOfBenefitCoverage);
				if (result == null) result = caseBackboneElement(explanationOfBenefitCoverage);
				if (result == null) result = caseDataType(explanationOfBenefitCoverage);
				if (result == null) result = caseElement(explanationOfBenefitCoverage);
				if (result == null) result = caseBase(explanationOfBenefitCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS: {
				ExplanationOfBenefitItems explanationOfBenefitItems = (ExplanationOfBenefitItems)theEObject;
				T result = caseExplanationOfBenefitItems(explanationOfBenefitItems);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItems);
				if (result == null) result = caseDataType(explanationOfBenefitItems);
				if (result == null) result = caseElement(explanationOfBenefitItems);
				if (result == null) result = caseBase(explanationOfBenefitItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_ITEM_ADJUDICATION: {
				ExplanationOfBenefitItemsItemAdjudication explanationOfBenefitItemsItemAdjudication = (ExplanationOfBenefitItemsItemAdjudication)theEObject;
				T result = caseExplanationOfBenefitItemsItemAdjudication(explanationOfBenefitItemsItemAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemsItemAdjudication);
				if (result == null) result = caseDataType(explanationOfBenefitItemsItemAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitItemsItemAdjudication);
				if (result == null) result = caseBase(explanationOfBenefitItemsItemAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_DETAIL: {
				ExplanationOfBenefitItemsDetail explanationOfBenefitItemsDetail = (ExplanationOfBenefitItemsDetail)theEObject;
				T result = caseExplanationOfBenefitItemsDetail(explanationOfBenefitItemsDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemsDetail);
				if (result == null) result = caseDataType(explanationOfBenefitItemsDetail);
				if (result == null) result = caseElement(explanationOfBenefitItemsDetail);
				if (result == null) result = caseBase(explanationOfBenefitItemsDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_DETAIL_DETAIL_ADJUDICATION: {
				ExplanationOfBenefitItemsDetailDetailAdjudication explanationOfBenefitItemsDetailDetailAdjudication = (ExplanationOfBenefitItemsDetailDetailAdjudication)theEObject;
				T result = caseExplanationOfBenefitItemsDetailDetailAdjudication(explanationOfBenefitItemsDetailDetailAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemsDetailDetailAdjudication);
				if (result == null) result = caseDataType(explanationOfBenefitItemsDetailDetailAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitItemsDetailDetailAdjudication);
				if (result == null) result = caseBase(explanationOfBenefitItemsDetailDetailAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_DETAIL_SUB_DETAIL: {
				ExplanationOfBenefitItemsDetailSubDetail explanationOfBenefitItemsDetailSubDetail = (ExplanationOfBenefitItemsDetailSubDetail)theEObject;
				T result = caseExplanationOfBenefitItemsDetailSubDetail(explanationOfBenefitItemsDetailSubDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemsDetailSubDetail);
				if (result == null) result = caseDataType(explanationOfBenefitItemsDetailSubDetail);
				if (result == null) result = caseElement(explanationOfBenefitItemsDetailSubDetail);
				if (result == null) result = caseBase(explanationOfBenefitItemsDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_DETAIL_SUB_DETAIL_SUB_DETAIL_ADJUDICATION: {
				ExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudication explanationOfBenefitItemsDetailSubDetailSubDetailAdjudication = (ExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudication)theEObject;
				T result = caseExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudication(explanationOfBenefitItemsDetailSubDetailSubDetailAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemsDetailSubDetailSubDetailAdjudication);
				if (result == null) result = caseDataType(explanationOfBenefitItemsDetailSubDetailSubDetailAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitItemsDetailSubDetailSubDetailAdjudication);
				if (result == null) result = caseBase(explanationOfBenefitItemsDetailSubDetailSubDetailAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ITEMS_PROSTHESIS: {
				ExplanationOfBenefitItemsProsthesis explanationOfBenefitItemsProsthesis = (ExplanationOfBenefitItemsProsthesis)theEObject;
				T result = caseExplanationOfBenefitItemsProsthesis(explanationOfBenefitItemsProsthesis);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemsProsthesis);
				if (result == null) result = caseDataType(explanationOfBenefitItemsProsthesis);
				if (result == null) result = caseElement(explanationOfBenefitItemsProsthesis);
				if (result == null) result = caseBase(explanationOfBenefitItemsProsthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM: {
				ExplanationOfBenefitAddedItem explanationOfBenefitAddedItem = (ExplanationOfBenefitAddedItem)theEObject;
				T result = caseExplanationOfBenefitAddedItem(explanationOfBenefitAddedItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItem);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItem);
				if (result == null) result = caseElement(explanationOfBenefitAddedItem);
				if (result == null) result = caseBase(explanationOfBenefitAddedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_ADJUDICATION: {
				ExplanationOfBenefitAddedItemAddedItemAdjudication explanationOfBenefitAddedItemAddedItemAdjudication = (ExplanationOfBenefitAddedItemAddedItemAdjudication)theEObject;
				T result = caseExplanationOfBenefitAddedItemAddedItemAdjudication(explanationOfBenefitAddedItemAddedItemAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItemAddedItemAdjudication);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItemAddedItemAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitAddedItemAddedItemAdjudication);
				if (result == null) result = caseBase(explanationOfBenefitAddedItemAddedItemAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL: {
				ExplanationOfBenefitAddedItemAddedItemsDetail explanationOfBenefitAddedItemAddedItemsDetail = (ExplanationOfBenefitAddedItemAddedItemsDetail)theEObject;
				T result = caseExplanationOfBenefitAddedItemAddedItemsDetail(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = caseElement(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = caseBase(explanationOfBenefitAddedItemAddedItemsDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEMS_DETAIL_ADDED_ITEM_DETAIL_ADJUDICATION: {
				ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication explanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication = (ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication)theEObject;
				T result = caseExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication(explanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = caseBase(explanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH: {
				ExplanationOfBenefitMissingTeeth explanationOfBenefitMissingTeeth = (ExplanationOfBenefitMissingTeeth)theEObject;
				T result = caseExplanationOfBenefitMissingTeeth(explanationOfBenefitMissingTeeth);
				if (result == null) result = caseBackboneElement(explanationOfBenefitMissingTeeth);
				if (result == null) result = caseDataType(explanationOfBenefitMissingTeeth);
				if (result == null) result = caseElement(explanationOfBenefitMissingTeeth);
				if (result == null) result = caseBase(explanationOfBenefitMissingTeeth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_NOTES: {
				ExplanationOfBenefitNotes explanationOfBenefitNotes = (ExplanationOfBenefitNotes)theEObject;
				T result = caseExplanationOfBenefitNotes(explanationOfBenefitNotes);
				if (result == null) result = caseBackboneElement(explanationOfBenefitNotes);
				if (result == null) result = caseDataType(explanationOfBenefitNotes);
				if (result == null) result = caseElement(explanationOfBenefitNotes);
				if (result == null) result = caseBase(explanationOfBenefitNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: {
				ExplanationOfBenefitBenefitBalance explanationOfBenefitBenefitBalance = (ExplanationOfBenefitBenefitBalance)theEObject;
				T result = caseExplanationOfBenefitBenefitBalance(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseBackboneElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseDataType(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseBase(explanationOfBenefitBenefitBalance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT: {
				ExplanationOfBenefitBenefitBalanceBenefit explanationOfBenefitBenefitBalanceBenefit = (ExplanationOfBenefitBenefitBalanceBenefit)theEObject;
				T result = caseExplanationOfBenefitBenefitBalanceBenefit(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseBackboneElement(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseDataType(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseElement(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseBase(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMPLEMENTATION_GUIDE: {
				ImplementationGuide implementationGuide = (ImplementationGuide)theEObject;
				T result = caseImplementationGuide(implementationGuide);
				if (result == null) result = caseDomainResource(implementationGuide);
				if (result == null) result = caseResource(implementationGuide);
				if (result == null) result = caseBase(implementationGuide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_CONTACT: {
				ImplementationGuideContact implementationGuideContact = (ImplementationGuideContact)theEObject;
				T result = caseImplementationGuideContact(implementationGuideContact);
				if (result == null) result = caseBackboneElement(implementationGuideContact);
				if (result == null) result = caseDataType(implementationGuideContact);
				if (result == null) result = caseElement(implementationGuideContact);
				if (result == null) result = caseBase(implementationGuideContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_DEPENDENCY: {
				ImplementationGuideDependency implementationGuideDependency = (ImplementationGuideDependency)theEObject;
				T result = caseImplementationGuideDependency(implementationGuideDependency);
				if (result == null) result = caseBackboneElement(implementationGuideDependency);
				if (result == null) result = caseDataType(implementationGuideDependency);
				if (result == null) result = caseElement(implementationGuideDependency);
				if (result == null) result = caseBase(implementationGuideDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE: {
				ImplementationGuidePackage implementationGuidePackage = (ImplementationGuidePackage)theEObject;
				T result = caseImplementationGuidePackage(implementationGuidePackage);
				if (result == null) result = caseBackboneElement(implementationGuidePackage);
				if (result == null) result = caseDataType(implementationGuidePackage);
				if (result == null) result = caseElement(implementationGuidePackage);
				if (result == null) result = caseBase(implementationGuidePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PACKAGE_RESOURCE: {
				ImplementationGuidePackageResource implementationGuidePackageResource = (ImplementationGuidePackageResource)theEObject;
				T result = caseImplementationGuidePackageResource(implementationGuidePackageResource);
				if (result == null) result = caseBackboneElement(implementationGuidePackageResource);
				if (result == null) result = caseDataType(implementationGuidePackageResource);
				if (result == null) result = caseElement(implementationGuidePackageResource);
				if (result == null) result = caseBase(implementationGuidePackageResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_GLOBAL: {
				ImplementationGuideGlobal implementationGuideGlobal = (ImplementationGuideGlobal)theEObject;
				T result = caseImplementationGuideGlobal(implementationGuideGlobal);
				if (result == null) result = caseBackboneElement(implementationGuideGlobal);
				if (result == null) result = caseDataType(implementationGuideGlobal);
				if (result == null) result = caseElement(implementationGuideGlobal);
				if (result == null) result = caseBase(implementationGuideGlobal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.IMPLEMENTATION_GUIDE_PAGE: {
				ImplementationGuidePage implementationGuidePage = (ImplementationGuidePage)theEObject;
				T result = caseImplementationGuidePage(implementationGuidePage);
				if (result == null) result = caseBackboneElement(implementationGuidePage);
				if (result == null) result = caseDataType(implementationGuidePage);
				if (result == null) result = caseElement(implementationGuidePage);
				if (result == null) result = caseBase(implementationGuidePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SEARCH_PARAMETER: {
				SearchParameter searchParameter = (SearchParameter)theEObject;
				T result = caseSearchParameter(searchParameter);
				if (result == null) result = caseDomainResource(searchParameter);
				if (result == null) result = caseResource(searchParameter);
				if (result == null) result = caseBase(searchParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SEARCH_PARAMETER_CONTACT: {
				SearchParameterContact searchParameterContact = (SearchParameterContact)theEObject;
				T result = caseSearchParameterContact(searchParameterContact);
				if (result == null) result = caseBackboneElement(searchParameterContact);
				if (result == null) result = caseDataType(searchParameterContact);
				if (result == null) result = caseElement(searchParameterContact);
				if (result == null) result = caseBase(searchParameterContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE: {
				ExpansionProfile expansionProfile = (ExpansionProfile)theEObject;
				T result = caseExpansionProfile(expansionProfile);
				if (result == null) result = caseDomainResource(expansionProfile);
				if (result == null) result = caseResource(expansionProfile);
				if (result == null) result = caseBase(expansionProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_CONTACT: {
				ExpansionProfileContact expansionProfileContact = (ExpansionProfileContact)theEObject;
				T result = caseExpansionProfileContact(expansionProfileContact);
				if (result == null) result = caseBackboneElement(expansionProfileContact);
				if (result == null) result = caseDataType(expansionProfileContact);
				if (result == null) result = caseElement(expansionProfileContact);
				if (result == null) result = caseBase(expansionProfileContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM: {
				ExpansionProfileCodeSystem expansionProfileCodeSystem = (ExpansionProfileCodeSystem)theEObject;
				T result = caseExpansionProfileCodeSystem(expansionProfileCodeSystem);
				if (result == null) result = caseBackboneElement(expansionProfileCodeSystem);
				if (result == null) result = caseDataType(expansionProfileCodeSystem);
				if (result == null) result = caseElement(expansionProfileCodeSystem);
				if (result == null) result = caseBase(expansionProfileCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE: {
				ExpansionProfileCodeSystemCodeSystemInclude expansionProfileCodeSystemCodeSystemInclude = (ExpansionProfileCodeSystemCodeSystemInclude)theEObject;
				T result = caseExpansionProfileCodeSystemCodeSystemInclude(expansionProfileCodeSystemCodeSystemInclude);
				if (result == null) result = caseBackboneElement(expansionProfileCodeSystemCodeSystemInclude);
				if (result == null) result = caseDataType(expansionProfileCodeSystemCodeSystemInclude);
				if (result == null) result = caseElement(expansionProfileCodeSystemCodeSystemInclude);
				if (result == null) result = caseBase(expansionProfileCodeSystemCodeSystemInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_INCLUDE_CODE_SYSTEM_INCLUDE_CODE_SYSTEM: {
				ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem expansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem = (ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem)theEObject;
				T result = caseExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem(expansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem);
				if (result == null) result = caseBackboneElement(expansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem);
				if (result == null) result = caseDataType(expansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem);
				if (result == null) result = caseElement(expansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem);
				if (result == null) result = caseBase(expansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_EXCLUDE: {
				ExpansionProfileCodeSystemCodeSystemExclude expansionProfileCodeSystemCodeSystemExclude = (ExpansionProfileCodeSystemCodeSystemExclude)theEObject;
				T result = caseExpansionProfileCodeSystemCodeSystemExclude(expansionProfileCodeSystemCodeSystemExclude);
				if (result == null) result = caseBackboneElement(expansionProfileCodeSystemCodeSystemExclude);
				if (result == null) result = caseDataType(expansionProfileCodeSystemCodeSystemExclude);
				if (result == null) result = caseElement(expansionProfileCodeSystemCodeSystemExclude);
				if (result == null) result = caseBase(expansionProfileCodeSystemCodeSystemExclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_CODE_SYSTEM_CODE_SYSTEM_EXCLUDE_CODE_SYSTEM_EXCLUDE_CODE_SYSTEM: {
				ExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem expansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem = (ExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem)theEObject;
				T result = caseExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem(expansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem);
				if (result == null) result = caseBackboneElement(expansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem);
				if (result == null) result = caseDataType(expansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem);
				if (result == null) result = caseElement(expansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem);
				if (result == null) result = caseBase(expansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION: {
				ExpansionProfileDesignation expansionProfileDesignation = (ExpansionProfileDesignation)theEObject;
				T result = caseExpansionProfileDesignation(expansionProfileDesignation);
				if (result == null) result = caseBackboneElement(expansionProfileDesignation);
				if (result == null) result = caseDataType(expansionProfileDesignation);
				if (result == null) result = caseElement(expansionProfileDesignation);
				if (result == null) result = caseBase(expansionProfileDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_INCLUDE: {
				ExpansionProfileDesignationDesignationInclude expansionProfileDesignationDesignationInclude = (ExpansionProfileDesignationDesignationInclude)theEObject;
				T result = caseExpansionProfileDesignationDesignationInclude(expansionProfileDesignationDesignationInclude);
				if (result == null) result = caseBackboneElement(expansionProfileDesignationDesignationInclude);
				if (result == null) result = caseDataType(expansionProfileDesignationDesignationInclude);
				if (result == null) result = caseElement(expansionProfileDesignationDesignationInclude);
				if (result == null) result = caseBase(expansionProfileDesignationDesignationInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_INCLUDE_DESIGNATION_INCLUDE_DESIGNATION: {
				ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation = (ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation)theEObject;
				T result = caseExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = caseBackboneElement(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = caseDataType(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = caseElement(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = caseBase(expansionProfileDesignationDesignationIncludeDesignationIncludeDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE: {
				ExpansionProfileDesignationDesignationExclude expansionProfileDesignationDesignationExclude = (ExpansionProfileDesignationDesignationExclude)theEObject;
				T result = caseExpansionProfileDesignationDesignationExclude(expansionProfileDesignationDesignationExclude);
				if (result == null) result = caseBackboneElement(expansionProfileDesignationDesignationExclude);
				if (result == null) result = caseDataType(expansionProfileDesignationDesignationExclude);
				if (result == null) result = caseElement(expansionProfileDesignationDesignationExclude);
				if (result == null) result = caseBase(expansionProfileDesignationDesignationExclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.EXPANSION_PROFILE_DESIGNATION_DESIGNATION_EXCLUDE_DESIGNATION_EXCLUDE_DESIGNATION: {
				ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation = (ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation)theEObject;
				T result = caseExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = caseBackboneElement(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = caseDataType(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = caseElement(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = caseBase(expansionProfileDesignationDesignationExcludeDesignationExcludeDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ORDER_SET: {
				OrderSet orderSet = (OrderSet)theEObject;
				T result = caseOrderSet(orderSet);
				if (result == null) result = caseDomainResource(orderSet);
				if (result == null) result = caseResource(orderSet);
				if (result == null) result = caseBase(orderSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ORDER_SET_ITEM: {
				OrderSetItem orderSetItem = (OrderSetItem)theEObject;
				T result = caseOrderSetItem(orderSetItem);
				if (result == null) result = caseBackboneElement(orderSetItem);
				if (result == null) result = caseDataType(orderSetItem);
				if (result == null) result = caseElement(orderSetItem);
				if (result == null) result = caseBase(orderSetItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ORDER_SET_ITEM_CUSTOMIZATION: {
				OrderSetItemCustomization orderSetItemCustomization = (OrderSetItemCustomization)theEObject;
				T result = caseOrderSetItemCustomization(orderSetItemCustomization);
				if (result == null) result = caseBackboneElement(orderSetItemCustomization);
				if (result == null) result = caseDataType(orderSetItemCustomization);
				if (result == null) result = caseElement(orderSetItemCustomization);
				if (result == null) result = caseBase(orderSetItemCustomization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROVENANCE: {
				Provenance provenance = (Provenance)theEObject;
				T result = caseProvenance(provenance);
				if (result == null) result = caseDomainResource(provenance);
				if (result == null) result = caseResource(provenance);
				if (result == null) result = caseBase(provenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROVENANCE_AGENT: {
				ProvenanceAgent provenanceAgent = (ProvenanceAgent)theEObject;
				T result = caseProvenanceAgent(provenanceAgent);
				if (result == null) result = caseBackboneElement(provenanceAgent);
				if (result == null) result = caseDataType(provenanceAgent);
				if (result == null) result = caseElement(provenanceAgent);
				if (result == null) result = caseBase(provenanceAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROVENANCE_AGENT_RELATED_AGENT: {
				ProvenanceAgentRelatedAgent provenanceAgentRelatedAgent = (ProvenanceAgentRelatedAgent)theEObject;
				T result = caseProvenanceAgentRelatedAgent(provenanceAgentRelatedAgent);
				if (result == null) result = caseBackboneElement(provenanceAgentRelatedAgent);
				if (result == null) result = caseDataType(provenanceAgentRelatedAgent);
				if (result == null) result = caseElement(provenanceAgentRelatedAgent);
				if (result == null) result = caseBase(provenanceAgentRelatedAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROVENANCE_ENTITY: {
				ProvenanceEntity provenanceEntity = (ProvenanceEntity)theEObject;
				T result = caseProvenanceEntity(provenanceEntity);
				if (result == null) result = caseBackboneElement(provenanceEntity);
				if (result == null) result = caseDataType(provenanceEntity);
				if (result == null) result = caseElement(provenanceEntity);
				if (result == null) result = caseBase(provenanceEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROCESS_RESPONSE: {
				ProcessResponse processResponse = (ProcessResponse)theEObject;
				T result = caseProcessResponse(processResponse);
				if (result == null) result = caseDomainResource(processResponse);
				if (result == null) result = caseResource(processResponse);
				if (result == null) result = caseBase(processResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PROCESS_RESPONSE_NOTES: {
				ProcessResponseNotes processResponseNotes = (ProcessResponseNotes)theEObject;
				T result = caseProcessResponseNotes(processResponseNotes);
				if (result == null) result = caseBackboneElement(processResponseNotes);
				if (result == null) result = caseDataType(processResponseNotes);
				if (result == null) result = caseElement(processResponseNotes);
				if (result == null) result = caseBase(processResponseNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = caseDomainResource(measure);
				if (result == null) result = caseResource(measure);
				if (result == null) result = caseBase(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEASURE_POPULATION: {
				MeasurePopulation measurePopulation = (MeasurePopulation)theEObject;
				T result = caseMeasurePopulation(measurePopulation);
				if (result == null) result = caseBackboneElement(measurePopulation);
				if (result == null) result = caseDataType(measurePopulation);
				if (result == null) result = caseElement(measurePopulation);
				if (result == null) result = caseBase(measurePopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.PAYMENT_NOTICE: {
				PaymentNotice paymentNotice = (PaymentNotice)theEObject;
				T result = casePaymentNotice(paymentNotice);
				if (result == null) result = caseDomainResource(paymentNotice);
				if (result == null) result = caseResource(paymentNotice);
				if (result == null) result = caseBase(paymentNotice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseDomainResource(list);
				if (result == null) result = caseResource(list);
				if (result == null) result = caseBase(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.LIST_ENTRY: {
				ListEntry listEntry = (ListEntry)theEObject;
				T result = caseListEntry(listEntry);
				if (result == null) result = caseBackboneElement(listEntry);
				if (result == null) result = caseDataType(listEntry);
				if (result == null) result = caseElement(listEntry);
				if (result == null) result = caseBase(listEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.GUIDANCE_RESPONSE: {
				GuidanceResponse guidanceResponse = (GuidanceResponse)theEObject;
				T result = caseGuidanceResponse(guidanceResponse);
				if (result == null) result = caseDomainResource(guidanceResponse);
				if (result == null) result = caseResource(guidanceResponse);
				if (result == null) result = caseBase(guidanceResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.GUIDANCE_RESPONSE_ACTION: {
				GuidanceResponseAction guidanceResponseAction = (GuidanceResponseAction)theEObject;
				T result = caseGuidanceResponseAction(guidanceResponseAction);
				if (result == null) result = caseBackboneElement(guidanceResponseAction);
				if (result == null) result = caseDataType(guidanceResponseAction);
				if (result == null) result = caseElement(guidanceResponseAction);
				if (result == null) result = caseBase(guidanceResponseAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DETECTED_ISSUE: {
				DetectedIssue detectedIssue = (DetectedIssue)theEObject;
				T result = caseDetectedIssue(detectedIssue);
				if (result == null) result = caseDomainResource(detectedIssue);
				if (result == null) result = caseResource(detectedIssue);
				if (result == null) result = caseBase(detectedIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.DETECTED_ISSUE_MITIGATION: {
				DetectedIssueMitigation detectedIssueMitigation = (DetectedIssueMitigation)theEObject;
				T result = caseDetectedIssueMitigation(detectedIssueMitigation);
				if (result == null) result = caseBackboneElement(detectedIssueMitigation);
				if (result == null) result = caseDataType(detectedIssueMitigation);
				if (result == null) result = caseElement(detectedIssueMitigation);
				if (result == null) result = caseBase(detectedIssueMitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseDomainResource(account);
				if (result == null) result = caseResource(account);
				if (result == null) result = caseBase(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_ADMINISTRATION: {
				MedicationAdministration medicationAdministration = (MedicationAdministration)theEObject;
				T result = caseMedicationAdministration(medicationAdministration);
				if (result == null) result = caseDomainResource(medicationAdministration);
				if (result == null) result = caseResource(medicationAdministration);
				if (result == null) result = caseBase(medicationAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE: {
				MedicationAdministrationDosage medicationAdministrationDosage = (MedicationAdministrationDosage)theEObject;
				T result = caseMedicationAdministrationDosage(medicationAdministrationDosage);
				if (result == null) result = caseBackboneElement(medicationAdministrationDosage);
				if (result == null) result = caseDataType(medicationAdministrationDosage);
				if (result == null) result = caseElement(medicationAdministrationDosage);
				if (result == null) result = caseBase(medicationAdministrationDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.APPOINTMENT_RESPONSE: {
				AppointmentResponse appointmentResponse = (AppointmentResponse)theEObject;
				T result = caseAppointmentResponse(appointmentResponse);
				if (result == null) result = caseDomainResource(appointmentResponse);
				if (result == null) result = caseResource(appointmentResponse);
				if (result == null) result = caseBase(appointmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.AUDIT_EVENT: {
				AuditEvent auditEvent = (AuditEvent)theEObject;
				T result = caseAuditEvent(auditEvent);
				if (result == null) result = caseDomainResource(auditEvent);
				if (result == null) result = caseResource(auditEvent);
				if (result == null) result = caseBase(auditEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.AUDIT_EVENT_EVENT: {
				AuditEventEvent auditEventEvent = (AuditEventEvent)theEObject;
				T result = caseAuditEventEvent(auditEventEvent);
				if (result == null) result = caseBackboneElement(auditEventEvent);
				if (result == null) result = caseDataType(auditEventEvent);
				if (result == null) result = caseElement(auditEventEvent);
				if (result == null) result = caseBase(auditEventEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT: {
				AuditEventParticipant auditEventParticipant = (AuditEventParticipant)theEObject;
				T result = caseAuditEventParticipant(auditEventParticipant);
				if (result == null) result = caseBackboneElement(auditEventParticipant);
				if (result == null) result = caseDataType(auditEventParticipant);
				if (result == null) result = caseElement(auditEventParticipant);
				if (result == null) result = caseBase(auditEventParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.AUDIT_EVENT_PARTICIPANT_NETWORK: {
				AuditEventParticipantNetwork auditEventParticipantNetwork = (AuditEventParticipantNetwork)theEObject;
				T result = caseAuditEventParticipantNetwork(auditEventParticipantNetwork);
				if (result == null) result = caseBackboneElement(auditEventParticipantNetwork);
				if (result == null) result = caseDataType(auditEventParticipantNetwork);
				if (result == null) result = caseElement(auditEventParticipantNetwork);
				if (result == null) result = caseBase(auditEventParticipantNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.AUDIT_EVENT_SOURCE: {
				AuditEventSource auditEventSource = (AuditEventSource)theEObject;
				T result = caseAuditEventSource(auditEventSource);
				if (result == null) result = caseBackboneElement(auditEventSource);
				if (result == null) result = caseDataType(auditEventSource);
				if (result == null) result = caseElement(auditEventSource);
				if (result == null) result = caseBase(auditEventSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.AUDIT_EVENT_OBJECT: {
				AuditEventObject auditEventObject = (AuditEventObject)theEObject;
				T result = caseAuditEventObject(auditEventObject);
				if (result == null) result = caseBackboneElement(auditEventObject);
				if (result == null) result = caseDataType(auditEventObject);
				if (result == null) result = caseElement(auditEventObject);
				if (result == null) result = caseBase(auditEventObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.AUDIT_EVENT_OBJECT_DETAIL: {
				AuditEventObjectDetail auditEventObjectDetail = (AuditEventObjectDetail)theEObject;
				T result = caseAuditEventObjectDetail(auditEventObjectDetail);
				if (result == null) result = caseBackboneElement(auditEventObjectDetail);
				if (result == null) result = caseDataType(auditEventObjectDetail);
				if (result == null) result = caseElement(auditEventObjectDetail);
				if (result == null) result = caseBase(auditEventObjectDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.BASIC: {
				Basic basic = (Basic)theEObject;
				T result = caseBasic(basic);
				if (result == null) result = caseDomainResource(basic);
				if (result == null) result = caseResource(basic);
				if (result == null) result = caseBase(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ORDER_RESPONSE: {
				OrderResponse orderResponse = (OrderResponse)theEObject;
				T result = caseOrderResponse(orderResponse);
				if (result == null) result = caseDomainResource(orderResponse);
				if (result == null) result = caseResource(orderResponse);
				if (result == null) result = caseBase(orderResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.SUPPLY_DELIVERY: {
				SupplyDelivery supplyDelivery = (SupplyDelivery)theEObject;
				T result = caseSupplyDelivery(supplyDelivery);
				if (result == null) result = caseDomainResource(supplyDelivery);
				if (result == null) result = caseResource(supplyDelivery);
				if (result == null) result = caseBase(supplyDelivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseDomainResource(organization);
				if (result == null) result = caseResource(organization);
				if (result == null) result = caseBase(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FhirResourcePackage.ORGANIZATION_CONTACT: {
				OrganizationContact organizationContact = (OrganizationContact)theEObject;
				T result = caseOrganizationContact(organizationContact);
				if (result == null) result = caseBackboneElement(organizationContact);
				if (result == null) result = caseDataType(organizationContact);
				if (result == null) result = caseElement(organizationContact);
				if (result == null) result = caseBase(organizationContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitioner(Practitioner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainResource(DomainResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Practitioner Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerPractitionerRole(PractitionerPractitionerRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationPosition(LocationPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareService(HealthcareService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceServiceType(HealthcareServiceServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Available Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceAvailableTime(HealthcareServiceAvailableTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Not Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceNotAvailable(HealthcareServiceNotAvailable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Qualification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerQualification(PractitionerQualification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientContact(PatientContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Animal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Animal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientAnimal(PatientAnimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientCommunication(PatientCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientLink(PatientLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedPerson(RelatedPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadata(ModuleMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataCoverage(ModuleMetadataCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Contributor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataContributor(ModuleMetadataContributor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Metadata Related Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Metadata Related Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleMetadataRelatedResource(ModuleMetadataRelatedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinition(ModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionModel(ModuleDefinitionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionLibrary(ModuleDefinitionLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionCodeSystem(ModuleDefinitionCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionValueSet(ModuleDefinitionValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionParameter(ModuleDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinition(StructureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionContact(StructureDefinitionContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionMapping(StructureDefinitionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Snapshot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionSnapshot(StructureDefinitionSnapshot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Differential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Differential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionDifferential(StructureDefinitionDifferential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionData(ModuleDefinitionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Data Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Data Code Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionDataCodeFilter(ModuleDefinitionDataCodeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition Data Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition Data Date Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinitionDataDateFilter(ModuleDefinitionDataDateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonLink(PersonLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSet(ValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetContact(ValueSetContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetCodeSystem(ValueSetCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Code System Concept Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Code System Concept Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetCodeSystemConceptDefinition(ValueSetCodeSystemConceptDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Code System Concept Definition Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Code System Concept Definition Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetCodeSystemConceptDefinitionDesignation(ValueSetCodeSystemConceptDefinitionDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetCompose(ValueSetCompose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetComposeConceptSet(ValueSetComposeConceptSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Concept Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Concept Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetComposeConceptSetConceptReference(ValueSetComposeConceptSetConceptReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetComposeConceptSetFilter(ValueSetComposeConceptSetFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Expansion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetExpansion(ValueSetExpansion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Expansion Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Expansion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetExpansionParameter(ValueSetExpansionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Expansion Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Expansion Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetExpansionContains(ValueSetExpansionContains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPayload(CommunicationPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Status History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Status History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterStatusHistory(EncounterStatusHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCare(EpisodeOfCare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care Status History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care Status History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionStage(ConditionStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionEvidence(ConditionEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralRequest(ReferralRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCareCareTeam(EpisodeOfCareCareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterParticipant(EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointment(Appointment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointmentParticipant(AppointmentParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Hospitalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Hospitalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterHospitalization(EncounterHospitalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterLocation(EncounterLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationRequest(CommunicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Request Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Request Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationRequestPayload(CommunicationRequestPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupCharacteristic(GroupCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupMember(GroupMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedication(Medication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationProduct(MedicationProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Product Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Product Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationProductIngredient(MedicationProductIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Product Batch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Product Batch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationProductBatch(MedicationProductBatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationPackage(MedicationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Package Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Package Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationPackageContent(MedicationPackageContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstance(Substance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceInstance(SubstanceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceIngredient(SubstanceIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpression(ClinicalImpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Investigations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Investigations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionInvestigations(ClinicalImpressionInvestigations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Finding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Finding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionFinding(ClinicalImpressionFinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Ruled Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Ruled Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionRuledOut(ClinicalImpressionRuledOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntolerance(AllergyIntolerance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceReaction(AllergyIntoleranceReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimen(Specimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenCollection(SpecimenCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenTreatment(SpecimenTreatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenContainer(SpecimenContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Reference Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationReferenceRange(ObservationReferenceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationRelated(ObservationRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationComponent(ObservationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetric(DeviceMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceComponent(DeviceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Component Production Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Component Production Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceComponentProductionSpecification(DeviceComponentProductionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Metric Calibration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Metric Calibration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceMetricCalibration(DeviceMetricCalibration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponse(QuestionnaireResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItem(QuestionnaireItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseItem(QuestionnaireResponseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Response Item Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Response Item Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireResponseItemAnswer(QuestionnaireResponseItemAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Member History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Member History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyMemberHistory(FamilyMemberHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Member History Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Member History Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyMemberHistoryCondition(FamilyMemberHistoryCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReport(DiagnosticReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReportImage(DiagnosticReportImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedia(Media object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticOrder(DiagnosticOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Order Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Order Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticOrderEvent(DiagnosticOrderEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Order Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Order Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticOrderItem(DiagnosticOrderItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReference(DocumentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Relates To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Relates To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceRelatesTo(DocumentReferenceRelatesTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceContent(DocumentReferenceContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceContext(DocumentReferenceContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Reference Context Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Reference Context Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentReferenceContextRelated(DocumentReferenceContextRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureRequest(ProcedureRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudy(ImagingStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePerformer(ProcedurePerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Focal Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Focal Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureFocalDevice(ProcedureFocalDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudySeries(ImagingStudySeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Series Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Series Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudySeriesInstance(ImagingStudySeriesInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlan(CarePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Related Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Related Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanRelatedPlan(CarePlanRelatedPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanParticipant(CarePlanParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalOutcome(GoalOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanActivity(CarePlanActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Activity Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Activity Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanActivityDetail(CarePlanActivityDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatement(MedicationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Statement Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Statement Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatementDosage(MedicationStatementDosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodySite(BodySite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrder(NutritionOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderOralDiet(NutritionOrderOralDiet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet Nutrient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet Nutrient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderOralDietNutrient(NutritionOrderOralDietNutrient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet Texture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Oral Diet Texture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderOralDietTexture(NutritionOrderOralDietTexture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderSupplement(NutritionOrderSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Enteral Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Enteral Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderEnteralFormula(NutritionOrderEnteralFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Order Enteral Formula Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Order Enteral Formula Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionOrderEnteralFormulaAdministration(NutritionOrderEnteralFormulaAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessment(RiskAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Assessment Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Assessment Prediction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessmentPrediction(RiskAssessmentPrediction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Use Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Use Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUseRequest(DeviceUseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrder(MedicationOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Dosage Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Dosage Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderDosageInstruction(MedicationOrderDosageInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Dispense Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Dispense Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderDispenseRequest(MedicationOrderDispenseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderSubstitution(MedicationOrderSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderWhen(OrderWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRequest(ProcessRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Request Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Request Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRequestItems(ProcessRequestItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequest(SupplyRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequestWhen(SupplyRequestWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescription(VisionPrescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescriptionDispense(VisionPrescriptionDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelection(ImagingObjectSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelectionStudy(ImagingObjectSelectionStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection Study Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelectionStudySeries(ImagingObjectSelectionStudySeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection Study Series Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection Study Series Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelectionStudySeriesInstance(ImagingObjectSelectionStudySeriesInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Object Selection Study Series Instance Frames</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Object Selection Study Series Instance Frames</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingObjectSelectionStudySeriesInstanceFrames(ImagingObjectSelectionStudySeriesInstanceFrames object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystem(NamingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemContact(NamingSystemContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Naming System Unique Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming System Unique Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingSystemUniqueId(NamingSystemUniqueId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Service Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Service Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportServiceModule(DecisionSupportServiceModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Service Module Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Service Module Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportServiceModuleParameter(DecisionSupportServiceModuleParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Service Module Parameter Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Service Module Parameter Code Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportServiceModuleParameterCodeFilter(DecisionSupportServiceModuleParameterCodeFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Service Module Parameter Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Service Module Parameter Date Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportServiceModuleParameterDateFilter(DecisionSupportServiceModuleParameterDateFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMap(ConceptMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapContact(ConceptMapContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Source Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapSourceElement(ConceptMapSourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Source Element Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Source Element Target Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapSourceElementTargetElement(ConceptMapSourceElementTargetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Source Element Target Element Other Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Source Element Target Element Other Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapSourceElementTargetElementOtherElement(ConceptMapSourceElementTargetElementOtherElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlag(Flag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceCoordinate(SequenceCoordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceQuality(SequenceQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Chip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Chip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceChip(SequenceChip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceRepository(SequenceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractActor(ContractActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Valued Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractValuedItem(ContractValuedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Signatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Signatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractSignatory(ContractSignatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTerm(ContractTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Term Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Term Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermTermActor(ContractTermTermActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Term Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Term Valued Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermTermValuedItem(ContractTermTermValuedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Friendly Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Friendly Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractFriendlyLanguage(ContractFriendlyLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Legal Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Legal Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractLegalLanguage(ContractLegalLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Computable Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Computable Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractComputableLanguage(ContractComputableLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Attester</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Attester</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionAttester(CompositionAttester object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionEvent(CompositionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionSection(CompositionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentManifest(DocumentManifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Manifest Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Manifest Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentManifestContent(DocumentManifestContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Manifest Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Manifest Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentManifestRelated(DocumentManifestRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliation(PaymentReconciliation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliationDetails(PaymentReconciliationDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Reconciliation Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Reconciliation Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentReconciliationNotes(PaymentReconciliationNotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Use Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Use Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUseStatement(DeviceUseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScript(TestScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptContact(TestScriptContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptMetadata(TestScriptMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Metadata Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Metadata Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptMetadataLink(TestScriptMetadataLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Metadata Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Metadata Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptMetadataCapability(TestScriptMetadataCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformance(Conformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceContact(ConformanceContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceSoftware(ConformanceSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceImplementation(ConformanceImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRest(ConformanceRest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRestSecurity(ConformanceRestSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest Security Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest Security Certificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRestSecurityCertificate(ConformanceRestSecurityCertificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRestResource(ConformanceRestResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest Resource Resource Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest Resource Resource Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRestResourceResourceInteraction(ConformanceRestResourceResourceInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest Resource Search Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest Resource Search Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRestResourceSearchParam(ConformanceRestResourceSearchParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest System Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest System Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRestSystemInteraction(ConformanceRestSystemInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Rest Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Rest Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceRestOperation(ConformanceRestOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinition(OperationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionContact(OperationDefinitionContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionParameter(OperationDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Parameter Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionParameterBinding(OperationDefinitionParameterBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Messaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Messaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceMessaging(ConformanceMessaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Messaging Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Messaging Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceMessagingEndpoint(ConformanceMessagingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Messaging Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Messaging Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceMessagingEvent(ConformanceMessagingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceDocument(ConformanceDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Origin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Origin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptOrigin(TestScriptOrigin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptDestination(TestScriptDestination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptFixture(TestScriptFixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptVariable(TestScriptVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetup(TestScriptSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupAction(TestScriptSetupSetupAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionOperation(TestScriptSetupSetupActionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Operation Request Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Operation Request Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionOperationRequestHeader(TestScriptSetupSetupActionOperationRequestHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Setup Setup Action Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptSetupSetupActionAssert(TestScriptSetupSetupActionAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTest(TestScriptTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Test Test Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Test Test Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTestTestAction(TestScriptTestTestAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Teardown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTeardown(TestScriptTeardown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Script Teardown Teardown Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Script Teardown Teardown Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScriptTeardownTeardownAction(TestScriptTeardownTeardownAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElementContact(DataElementContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElementMapping(DataElementMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportRule(DecisionSupportRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Rule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Rule Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportRuleTrigger(DecisionSupportRuleTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Rule Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Rule Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportRuleAction(DecisionSupportRuleAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Support Rule Action Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Support Rule Action Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSupportRuleActionCustomization(DecisionSupportRuleActionCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeader(MessageHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderResponse(MessageHeaderResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationOutcome(OperationOutcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Outcome Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Outcome Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationOutcomeIssue(OperationOutcomeIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Message Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Message Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderMessageSource(MessageHeaderMessageSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Header Message Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Header Message Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageHeaderMessageDestination(MessageHeaderMessageDestination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscription(Subscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriptionChannel(SubscriptionChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrollment Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrollment Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrollmentResponse(EnrollmentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enrollment Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enrollment Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnrollmentRequest(EnrollmentRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverage(Coverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendation(ImmunizationRecommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation Date Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation Date Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationRecommendationDateCriterion(ImmunizationRecommendationRecommendationDateCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Recommendation Recommendation Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRecommendationRecommendationProtocol(ImmunizationRecommendationRecommendationProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunization(Immunization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Explanation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Explanation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationExplanation(ImmunizationExplanation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationReaction(ImmunizationReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Vaccination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Vaccination Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationVaccinationProtocol(ImmunizationVaccinationProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundle(Bundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleLink(BundleLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntry(BundleEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntrySearch(BundleEntrySearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntryRequest(BundleEntryRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Entry Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Entry Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleEntryResponse(BundleEntryResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponse(EligibilityResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityRequest(EligibilityRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Benefits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Benefits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseBenefits(EligibilityResponseBenefits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Benefits Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Benefits Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseBenefitsBenefit(EligibilityResponseBenefitsBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eligibility Response Errors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eligibility Response Errors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEligibilityResponseErrors(EligibilityResponseErrors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameters(Parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersParameter(ParametersParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispense(MedicationDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Dosage Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Dosage Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispenseDosageInstruction(MedicationDispenseDosageInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispenseSubstitution(MedicationDispenseSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponse(ClaimResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Payee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Payee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimPayee(ClaimPayee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimDiagnosis(ClaimDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimCoverage(ClaimCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItems(ClaimItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Items Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Items Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItemsDetail(ClaimItemsDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Items Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Items Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItemsDetailSubDetail(ClaimItemsDetailSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Items Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Items Prosthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItemsProsthesis(ClaimItemsProsthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Missing Teeth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Missing Teeth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimMissingTeeth(ClaimMissingTeeth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItems(ClaimResponseItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Items Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Items Item Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemsItemAdjudication(ClaimResponseItemsItemAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Items Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Items Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemsItemDetail(ClaimResponseItemsItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Items Item Detail Detail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Items Item Detail Detail Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemsItemDetailDetailAdjudication(ClaimResponseItemsItemDetailDetailAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Items Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Items Item Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemsItemDetailSubDetail(ClaimResponseItemsItemDetailSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Items Item Detail Sub Detail Subdetail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Items Item Detail Sub Detail Subdetail Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemsItemDetailSubDetailSubdetailAdjudication(ClaimResponseItemsItemDetailSubDetailSubdetailAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Added Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Added Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddedItem(ClaimResponseAddedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Item Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddedItemAddedItemAdjudication(ClaimResponseAddedItemAddedItemAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Items Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Items Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddedItemAddedItemsDetail(ClaimResponseAddedItemAddedItemsDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Items Detail Added Item Detail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Items Detail Added Item Detail Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication(ClaimResponseAddedItemAddedItemsDetailAddedItemDetailAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Errors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Errors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseErrors(ClaimResponseErrors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseNotes(ClaimResponseNotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseCoverage(ClaimResponseCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefit(ExplanationOfBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitPayee(ExplanationOfBenefitPayee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitCoverage(ExplanationOfBenefitCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItems(ExplanationOfBenefitItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Item Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemsItemAdjudication(ExplanationOfBenefitItemsItemAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemsDetail(ExplanationOfBenefitItemsDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Detail Detail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Detail Detail Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemsDetailDetailAdjudication(ExplanationOfBenefitItemsDetailDetailAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemsDetailSubDetail(ExplanationOfBenefitItemsDetailSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Detail Sub Detail Sub Detail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Detail Sub Detail Sub Detail Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudication(ExplanationOfBenefitItemsDetailSubDetailSubDetailAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Items Prosthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemsProsthesis(ExplanationOfBenefitItemsProsthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddedItem(ExplanationOfBenefitAddedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Item Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddedItemAddedItemAdjudication(ExplanationOfBenefitAddedItemAddedItemAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Items Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Items Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddedItemAddedItemsDetail(ExplanationOfBenefitAddedItemAddedItemsDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Items Detail Added Item Detail Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Items Detail Added Item Detail Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication(ExplanationOfBenefitAddedItemAddedItemsDetailAddedItemDetailAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Missing Teeth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Missing Teeth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitMissingTeeth(ExplanationOfBenefitMissingTeeth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitNotes(ExplanationOfBenefitNotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Benefit Balance Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitBenefitBalanceBenefit(ExplanationOfBenefitBenefitBalanceBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuide(ImplementationGuide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideContact(ImplementationGuideContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDependency(ImplementationGuideDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuidePackage(ImplementationGuidePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Package Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Package Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuidePackageResource(ImplementationGuidePackageResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideGlobal(ImplementationGuideGlobal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuidePage(ImplementationGuidePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameter(SearchParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameterContact(SearchParameterContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfile(ExpansionProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileContact(ExpansionProfileContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileCodeSystem(ExpansionProfileCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Code System Code System Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Code System Code System Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileCodeSystemCodeSystemInclude(ExpansionProfileCodeSystemCodeSystemInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Code System Code System Include Code System Include Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Code System Code System Include Code System Include Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem(ExpansionProfileCodeSystemCodeSystemIncludeCodeSystemIncludeCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Code System Code System Exclude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Code System Code System Exclude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileCodeSystemCodeSystemExclude(ExpansionProfileCodeSystemCodeSystemExclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Code System Code System Exclude Code System Exclude Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Code System Code System Exclude Code System Exclude Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem(ExpansionProfileCodeSystemCodeSystemExcludeCodeSystemExcludeCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignation(ExpansionProfileDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignationDesignationInclude(ExpansionProfileDesignationDesignationInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Include Designation Include Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Include Designation Include Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation(ExpansionProfileDesignationDesignationIncludeDesignationIncludeDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Exclude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Exclude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignationDesignationExclude(ExpansionProfileDesignationDesignationExclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Exclude Designation Exclude Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Profile Designation Designation Exclude Designation Exclude Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation(ExpansionProfileDesignationDesignationExcludeDesignationExcludeDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderSet(OrderSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Set Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Set Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderSetItem(OrderSetItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Set Item Customization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Set Item Customization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderSetItemCustomization(OrderSetItemCustomization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenance(Provenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceAgent(ProvenanceAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Agent Related Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Agent Related Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceAgentRelatedAgent(ProvenanceAgentRelatedAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenance Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenance Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenanceEntity(ProvenanceEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessResponse(ProcessResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Response Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Response Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessResponseNotes(ProcessResponseNotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurePopulation(MeasurePopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Notice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Notice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentNotice(PaymentNotice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListEntry(ListEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponse(GuidanceResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Response Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Response Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceResponseAction(GuidanceResponseAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssue(DetectedIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue Mitigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssueMitigation(DetectedIssueMitigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministration(MedicationAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministrationDosage(MedicationAdministrationDosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointmentResponse(AppointmentResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEvent(AuditEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventEvent(AuditEventEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventParticipant(AuditEventParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Participant Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Participant Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventParticipantNetwork(AuditEventParticipantNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventSource(AuditEventSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventObject(AuditEventObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Object Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Object Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventObjectDetail(AuditEventObjectDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasic(Basic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderResponse(OrderResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyDelivery(SupplyDelivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationContact(OrganizationContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase(Base object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backbone Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackboneElement(BackboneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FhirResourceSwitch
