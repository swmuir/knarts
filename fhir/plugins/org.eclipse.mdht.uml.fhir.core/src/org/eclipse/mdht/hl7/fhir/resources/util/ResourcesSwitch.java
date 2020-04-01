/**
 */
package org.eclipse.mdht.hl7.fhir.resources.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Base;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Element;

import org.eclipse.mdht.hl7.fhir.resources.*;

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
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage
 * @generated
 */
public class ResourcesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesSwitch() {
		if (modelPackage == null) {
			modelPackage = ResourcesPackage.eINSTANCE;
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
			case ResourcesPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseDomainResource(organization);
				if (result == null) result = caseResource(organization);
				if (result == null) result = caseBase(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOMAIN_RESOURCE: {
				DomainResource domainResource = (DomainResource)theEObject;
				T result = caseDomainResource(domainResource);
				if (result == null) result = caseResource(domainResource);
				if (result == null) result = caseBase(domainResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseBase(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ORGANIZATION_CONTACT: {
				OrganizationContact organizationContact = (OrganizationContact)theEObject;
				T result = caseOrganizationContact(organizationContact);
				if (result == null) result = caseBackboneElement(organizationContact);
				if (result == null) result = caseDataType(organizationContact);
				if (result == null) result = caseElement(organizationContact);
				if (result == null) result = caseBase(organizationContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER: {
				Practitioner practitioner = (Practitioner)theEObject;
				T result = casePractitioner(practitioner);
				if (result == null) result = caseDomainResource(practitioner);
				if (result == null) result = caseResource(practitioner);
				if (result == null) result = caseBase(practitioner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_QUALIFICATION: {
				PractitionerQualification practitionerQualification = (PractitionerQualification)theEObject;
				T result = casePractitionerQualification(practitionerQualification);
				if (result == null) result = caseBackboneElement(practitionerQualification);
				if (result == null) result = caseDataType(practitionerQualification);
				if (result == null) result = caseElement(practitionerQualification);
				if (result == null) result = caseBase(practitionerQualification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T result = caseValueSet(valueSet);
				if (result == null) result = caseDomainResource(valueSet);
				if (result == null) result = caseResource(valueSet);
				if (result == null) result = caseBase(valueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE: {
				ValueSetCompose valueSetCompose = (ValueSetCompose)theEObject;
				T result = caseValueSetCompose(valueSetCompose);
				if (result == null) result = caseBackboneElement(valueSetCompose);
				if (result == null) result = caseDataType(valueSetCompose);
				if (result == null) result = caseElement(valueSetCompose);
				if (result == null) result = caseBase(valueSetCompose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET: {
				ValueSetComposeConceptSet valueSetComposeConceptSet = (ValueSetComposeConceptSet)theEObject;
				T result = caseValueSetComposeConceptSet(valueSetComposeConceptSet);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSet);
				if (result == null) result = caseDataType(valueSetComposeConceptSet);
				if (result == null) result = caseElement(valueSetComposeConceptSet);
				if (result == null) result = caseBase(valueSetComposeConceptSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE: {
				ValueSetComposeConceptSetConceptReference valueSetComposeConceptSetConceptReference = (ValueSetComposeConceptSetConceptReference)theEObject;
				T result = caseValueSetComposeConceptSetConceptReference(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseDataType(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseElement(valueSetComposeConceptSetConceptReference);
				if (result == null) result = caseBase(valueSetComposeConceptSetConceptReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_CONCEPT_REFERENCE_DESIGNATION: {
				ValueSetComposeConceptSetConceptReferenceDesignation valueSetComposeConceptSetConceptReferenceDesignation = (ValueSetComposeConceptSetConceptReferenceDesignation)theEObject;
				T result = caseValueSetComposeConceptSetConceptReferenceDesignation(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = caseDataType(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = caseElement(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = caseBase(valueSetComposeConceptSetConceptReferenceDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_COMPOSE_CONCEPT_SET_FILTER: {
				ValueSetComposeConceptSetFilter valueSetComposeConceptSetFilter = (ValueSetComposeConceptSetFilter)theEObject;
				T result = caseValueSetComposeConceptSetFilter(valueSetComposeConceptSetFilter);
				if (result == null) result = caseBackboneElement(valueSetComposeConceptSetFilter);
				if (result == null) result = caseDataType(valueSetComposeConceptSetFilter);
				if (result == null) result = caseElement(valueSetComposeConceptSetFilter);
				if (result == null) result = caseBase(valueSetComposeConceptSetFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_EXPANSION: {
				ValueSetExpansion valueSetExpansion = (ValueSetExpansion)theEObject;
				T result = caseValueSetExpansion(valueSetExpansion);
				if (result == null) result = caseBackboneElement(valueSetExpansion);
				if (result == null) result = caseDataType(valueSetExpansion);
				if (result == null) result = caseElement(valueSetExpansion);
				if (result == null) result = caseBase(valueSetExpansion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_EXPANSION_PARAMETER: {
				ValueSetExpansionParameter valueSetExpansionParameter = (ValueSetExpansionParameter)theEObject;
				T result = caseValueSetExpansionParameter(valueSetExpansionParameter);
				if (result == null) result = caseBackboneElement(valueSetExpansionParameter);
				if (result == null) result = caseDataType(valueSetExpansionParameter);
				if (result == null) result = caseElement(valueSetExpansionParameter);
				if (result == null) result = caseBase(valueSetExpansionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VALUE_SET_EXPANSION_CONTAINS: {
				ValueSetExpansionContains valueSetExpansionContains = (ValueSetExpansionContains)theEObject;
				T result = caseValueSetExpansionContains(valueSetExpansionContains);
				if (result == null) result = caseBackboneElement(valueSetExpansionContains);
				if (result == null) result = caseDataType(valueSetExpansionContains);
				if (result == null) result = caseElement(valueSetExpansionContains);
				if (result == null) result = caseBase(valueSetExpansionContains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENDPOINT: {
				Endpoint endpoint = (Endpoint)theEObject;
				T result = caseEndpoint(endpoint);
				if (result == null) result = caseDomainResource(endpoint);
				if (result == null) result = caseResource(endpoint);
				if (result == null) result = caseBase(endpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseDomainResource(library);
				if (result == null) result = caseResource(library);
				if (result == null) result = caseBase(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT: {
				MeasureReport measureReport = (MeasureReport)theEObject;
				T result = caseMeasureReport(measureReport);
				if (result == null) result = caseDomainResource(measureReport);
				if (result == null) result = caseResource(measureReport);
				if (result == null) result = caseBase(measureReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = caseDomainResource(measure);
				if (result == null) result = caseResource(measure);
				if (result == null) result = caseBase(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_GROUP: {
				MeasureGroup measureGroup = (MeasureGroup)theEObject;
				T result = caseMeasureGroup(measureGroup);
				if (result == null) result = caseBackboneElement(measureGroup);
				if (result == null) result = caseDataType(measureGroup);
				if (result == null) result = caseElement(measureGroup);
				if (result == null) result = caseBase(measureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_GROUP_POPULATION: {
				MeasureGroupPopulation measureGroupPopulation = (MeasureGroupPopulation)theEObject;
				T result = caseMeasureGroupPopulation(measureGroupPopulation);
				if (result == null) result = caseBackboneElement(measureGroupPopulation);
				if (result == null) result = caseDataType(measureGroupPopulation);
				if (result == null) result = caseElement(measureGroupPopulation);
				if (result == null) result = caseBase(measureGroupPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_GROUP_STRATIFIER: {
				MeasureGroupStratifier measureGroupStratifier = (MeasureGroupStratifier)theEObject;
				T result = caseMeasureGroupStratifier(measureGroupStratifier);
				if (result == null) result = caseBackboneElement(measureGroupStratifier);
				if (result == null) result = caseDataType(measureGroupStratifier);
				if (result == null) result = caseElement(measureGroupStratifier);
				if (result == null) result = caseBase(measureGroupStratifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_GROUP_STRATIFIER_COMPONENT: {
				MeasureGroupStratifierComponent measureGroupStratifierComponent = (MeasureGroupStratifierComponent)theEObject;
				T result = caseMeasureGroupStratifierComponent(measureGroupStratifierComponent);
				if (result == null) result = caseBackboneElement(measureGroupStratifierComponent);
				if (result == null) result = caseDataType(measureGroupStratifierComponent);
				if (result == null) result = caseElement(measureGroupStratifierComponent);
				if (result == null) result = caseBase(measureGroupStratifierComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_SUPPLEMENTAL_DATA: {
				MeasureSupplementalData measureSupplementalData = (MeasureSupplementalData)theEObject;
				T result = caseMeasureSupplementalData(measureSupplementalData);
				if (result == null) result = caseBackboneElement(measureSupplementalData);
				if (result == null) result = caseDataType(measureSupplementalData);
				if (result == null) result = caseElement(measureSupplementalData);
				if (result == null) result = caseBase(measureSupplementalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP: {
				MeasureReportGroup measureReportGroup = (MeasureReportGroup)theEObject;
				T result = caseMeasureReportGroup(measureReportGroup);
				if (result == null) result = caseBackboneElement(measureReportGroup);
				if (result == null) result = caseDataType(measureReportGroup);
				if (result == null) result = caseElement(measureReportGroup);
				if (result == null) result = caseBase(measureReportGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_POPULATION: {
				MeasureReportGroupPopulation measureReportGroupPopulation = (MeasureReportGroupPopulation)theEObject;
				T result = caseMeasureReportGroupPopulation(measureReportGroupPopulation);
				if (result == null) result = caseBackboneElement(measureReportGroupPopulation);
				if (result == null) result = caseDataType(measureReportGroupPopulation);
				if (result == null) result = caseElement(measureReportGroupPopulation);
				if (result == null) result = caseBase(measureReportGroupPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER: {
				MeasureReportGroupStratifier measureReportGroupStratifier = (MeasureReportGroupStratifier)theEObject;
				T result = caseMeasureReportGroupStratifier(measureReportGroupStratifier);
				if (result == null) result = caseBackboneElement(measureReportGroupStratifier);
				if (result == null) result = caseDataType(measureReportGroupStratifier);
				if (result == null) result = caseElement(measureReportGroupStratifier);
				if (result == null) result = caseBase(measureReportGroupStratifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP: {
				MeasureReportGroupStratifierStratifierGroup measureReportGroupStratifierStratifierGroup = (MeasureReportGroupStratifierStratifierGroup)theEObject;
				T result = caseMeasureReportGroupStratifierStratifierGroup(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = caseBackboneElement(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = caseDataType(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = caseElement(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = caseBase(measureReportGroupStratifierStratifierGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_COMPONENT: {
				MeasureReportGroupStratifierStratifierGroupComponent measureReportGroupStratifierStratifierGroupComponent = (MeasureReportGroupStratifierStratifierGroupComponent)theEObject;
				T result = caseMeasureReportGroupStratifierStratifierGroupComponent(measureReportGroupStratifierStratifierGroupComponent);
				if (result == null) result = caseBackboneElement(measureReportGroupStratifierStratifierGroupComponent);
				if (result == null) result = caseDataType(measureReportGroupStratifierStratifierGroupComponent);
				if (result == null) result = caseElement(measureReportGroupStratifierStratifierGroupComponent);
				if (result == null) result = caseBase(measureReportGroupStratifierStratifierGroupComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION: {
				MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation measureReportGroupStratifierStratifierGroupStratifierGroupPopulation = (MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation)theEObject;
				T result = caseMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = caseBackboneElement(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = caseDataType(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = caseElement(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = caseBase(measureReportGroupStratifierStratifierGroupStratifierGroupPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT: {
				Patient patient = (Patient)theEObject;
				T result = casePatient(patient);
				if (result == null) result = caseDomainResource(patient);
				if (result == null) result = caseResource(patient);
				if (result == null) result = caseBase(patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT_CONTACT: {
				PatientContact patientContact = (PatientContact)theEObject;
				T result = casePatientContact(patientContact);
				if (result == null) result = caseBackboneElement(patientContact);
				if (result == null) result = caseDataType(patientContact);
				if (result == null) result = caseElement(patientContact);
				if (result == null) result = caseBase(patientContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT_COMMUNICATION: {
				PatientCommunication patientCommunication = (PatientCommunication)theEObject;
				T result = casePatientCommunication(patientCommunication);
				if (result == null) result = caseBackboneElement(patientCommunication);
				if (result == null) result = caseDataType(patientCommunication);
				if (result == null) result = caseElement(patientCommunication);
				if (result == null) result = caseBase(patientCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PATIENT_LINK: {
				PatientLink patientLink = (PatientLink)theEObject;
				T result = casePatientLink(patientLink);
				if (result == null) result = caseBackboneElement(patientLink);
				if (result == null) result = caseDataType(patientLink);
				if (result == null) result = caseElement(patientLink);
				if (result == null) result = caseBase(patientLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseDomainResource(list);
				if (result == null) result = caseResource(list);
				if (result == null) result = caseBase(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LIST_ENTRY: {
				ListEntry listEntry = (ListEntry)theEObject;
				T result = caseListEntry(listEntry);
				if (result == null) result = caseBackboneElement(listEntry);
				if (result == null) result = caseDataType(listEntry);
				if (result == null) result = caseElement(listEntry);
				if (result == null) result = caseBase(listEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER: {
				Encounter encounter = (Encounter)theEObject;
				T result = caseEncounter(encounter);
				if (result == null) result = caseDomainResource(encounter);
				if (result == null) result = caseResource(encounter);
				if (result == null) result = caseBase(encounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_STATUS_HISTORY: {
				EncounterStatusHistory encounterStatusHistory = (EncounterStatusHistory)theEObject;
				T result = caseEncounterStatusHistory(encounterStatusHistory);
				if (result == null) result = caseBackboneElement(encounterStatusHistory);
				if (result == null) result = caseDataType(encounterStatusHistory);
				if (result == null) result = caseElement(encounterStatusHistory);
				if (result == null) result = caseBase(encounterStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_CLASS_HISTORY: {
				EncounterClassHistory encounterClassHistory = (EncounterClassHistory)theEObject;
				T result = caseEncounterClassHistory(encounterClassHistory);
				if (result == null) result = caseBackboneElement(encounterClassHistory);
				if (result == null) result = caseDataType(encounterClassHistory);
				if (result == null) result = caseElement(encounterClassHistory);
				if (result == null) result = caseBase(encounterClassHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_PARTICIPANT: {
				EncounterParticipant encounterParticipant = (EncounterParticipant)theEObject;
				T result = caseEncounterParticipant(encounterParticipant);
				if (result == null) result = caseBackboneElement(encounterParticipant);
				if (result == null) result = caseDataType(encounterParticipant);
				if (result == null) result = caseElement(encounterParticipant);
				if (result == null) result = caseBase(encounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS: {
				EncounterDiagnosis encounterDiagnosis = (EncounterDiagnosis)theEObject;
				T result = caseEncounterDiagnosis(encounterDiagnosis);
				if (result == null) result = caseBackboneElement(encounterDiagnosis);
				if (result == null) result = caseDataType(encounterDiagnosis);
				if (result == null) result = caseElement(encounterDiagnosis);
				if (result == null) result = caseBase(encounterDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_HOSPITALIZATION: {
				EncounterHospitalization encounterHospitalization = (EncounterHospitalization)theEObject;
				T result = caseEncounterHospitalization(encounterHospitalization);
				if (result == null) result = caseBackboneElement(encounterHospitalization);
				if (result == null) result = caseDataType(encounterHospitalization);
				if (result == null) result = caseElement(encounterHospitalization);
				if (result == null) result = caseBase(encounterHospitalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENCOUNTER_LOCATION: {
				EncounterLocation encounterLocation = (EncounterLocation)theEObject;
				T result = caseEncounterLocation(encounterLocation);
				if (result == null) result = caseBackboneElement(encounterLocation);
				if (result == null) result = caseDataType(encounterLocation);
				if (result == null) result = caseElement(encounterLocation);
				if (result == null) result = caseBase(encounterLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EPISODE_OF_CARE: {
				EpisodeOfCare episodeOfCare = (EpisodeOfCare)theEObject;
				T result = caseEpisodeOfCare(episodeOfCare);
				if (result == null) result = caseDomainResource(episodeOfCare);
				if (result == null) result = caseResource(episodeOfCare);
				if (result == null) result = caseBase(episodeOfCare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EPISODE_OF_CARE_STATUS_HISTORY: {
				EpisodeOfCareStatusHistory episodeOfCareStatusHistory = (EpisodeOfCareStatusHistory)theEObject;
				T result = caseEpisodeOfCareStatusHistory(episodeOfCareStatusHistory);
				if (result == null) result = caseBackboneElement(episodeOfCareStatusHistory);
				if (result == null) result = caseDataType(episodeOfCareStatusHistory);
				if (result == null) result = caseElement(episodeOfCareStatusHistory);
				if (result == null) result = caseBase(episodeOfCareStatusHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EPISODE_OF_CARE_DIAGNOSIS: {
				EpisodeOfCareDiagnosis episodeOfCareDiagnosis = (EpisodeOfCareDiagnosis)theEObject;
				T result = caseEpisodeOfCareDiagnosis(episodeOfCareDiagnosis);
				if (result == null) result = caseBackboneElement(episodeOfCareDiagnosis);
				if (result == null) result = caseDataType(episodeOfCareDiagnosis);
				if (result == null) result = caseElement(episodeOfCareDiagnosis);
				if (result == null) result = caseBase(episodeOfCareDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseDomainResource(condition);
				if (result == null) result = caseResource(condition);
				if (result == null) result = caseBase(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONDITION_STAGE: {
				ConditionStage conditionStage = (ConditionStage)theEObject;
				T result = caseConditionStage(conditionStage);
				if (result == null) result = caseBackboneElement(conditionStage);
				if (result == null) result = caseDataType(conditionStage);
				if (result == null) result = caseElement(conditionStage);
				if (result == null) result = caseBase(conditionStage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONDITION_EVIDENCE: {
				ConditionEvidence conditionEvidence = (ConditionEvidence)theEObject;
				T result = caseConditionEvidence(conditionEvidence);
				if (result == null) result = caseBackboneElement(conditionEvidence);
				if (result == null) result = caseDataType(conditionEvidence);
				if (result == null) result = caseElement(conditionEvidence);
				if (result == null) result = caseBase(conditionEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLINICAL_IMPRESSION: {
				ClinicalImpression clinicalImpression = (ClinicalImpression)theEObject;
				T result = caseClinicalImpression(clinicalImpression);
				if (result == null) result = caseDomainResource(clinicalImpression);
				if (result == null) result = caseResource(clinicalImpression);
				if (result == null) result = caseBase(clinicalImpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLINICAL_IMPRESSION_INVESTIGATION: {
				ClinicalImpressionInvestigation clinicalImpressionInvestigation = (ClinicalImpressionInvestigation)theEObject;
				T result = caseClinicalImpressionInvestigation(clinicalImpressionInvestigation);
				if (result == null) result = caseBackboneElement(clinicalImpressionInvestigation);
				if (result == null) result = caseDataType(clinicalImpressionInvestigation);
				if (result == null) result = caseElement(clinicalImpressionInvestigation);
				if (result == null) result = caseBase(clinicalImpressionInvestigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLINICAL_IMPRESSION_FINDING: {
				ClinicalImpressionFinding clinicalImpressionFinding = (ClinicalImpressionFinding)theEObject;
				T result = caseClinicalImpressionFinding(clinicalImpressionFinding);
				if (result == null) result = caseBackboneElement(clinicalImpressionFinding);
				if (result == null) result = caseDataType(clinicalImpressionFinding);
				if (result == null) result = caseElement(clinicalImpressionFinding);
				if (result == null) result = caseBase(clinicalImpressionFinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = caseDomainResource(observation);
				if (result == null) result = caseResource(observation);
				if (result == null) result = caseBase(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION_COMPONENT: {
				ObservationComponent observationComponent = (ObservationComponent)theEObject;
				T result = caseObservationComponent(observationComponent);
				if (result == null) result = caseBackboneElement(observationComponent);
				if (result == null) result = caseDataType(observationComponent);
				if (result == null) result = caseElement(observationComponent);
				if (result == null) result = caseBase(observationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE: {
				ObservationReferenceRange observationReferenceRange = (ObservationReferenceRange)theEObject;
				T result = caseObservationReferenceRange(observationReferenceRange);
				if (result == null) result = caseBackboneElement(observationReferenceRange);
				if (result == null) result = caseDataType(observationReferenceRange);
				if (result == null) result = caseElement(observationReferenceRange);
				if (result == null) result = caseBase(observationReferenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_PLAN: {
				CarePlan carePlan = (CarePlan)theEObject;
				T result = caseCarePlan(carePlan);
				if (result == null) result = caseDomainResource(carePlan);
				if (result == null) result = caseResource(carePlan);
				if (result == null) result = caseBase(carePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION: {
				PlanDefinition planDefinition = (PlanDefinition)theEObject;
				T result = casePlanDefinition(planDefinition);
				if (result == null) result = caseDomainResource(planDefinition);
				if (result == null) result = caseResource(planDefinition);
				if (result == null) result = caseBase(planDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_GOAL: {
				PlanDefinitionGoal planDefinitionGoal = (PlanDefinitionGoal)theEObject;
				T result = casePlanDefinitionGoal(planDefinitionGoal);
				if (result == null) result = caseBackboneElement(planDefinitionGoal);
				if (result == null) result = caseDataType(planDefinitionGoal);
				if (result == null) result = caseElement(planDefinitionGoal);
				if (result == null) result = caseBase(planDefinitionGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_GOAL_TARGET: {
				PlanDefinitionGoalTarget planDefinitionGoalTarget = (PlanDefinitionGoalTarget)theEObject;
				T result = casePlanDefinitionGoalTarget(planDefinitionGoalTarget);
				if (result == null) result = caseBackboneElement(planDefinitionGoalTarget);
				if (result == null) result = caseDataType(planDefinitionGoalTarget);
				if (result == null) result = caseElement(planDefinitionGoalTarget);
				if (result == null) result = caseBase(planDefinitionGoalTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION: {
				PlanDefinitionAction planDefinitionAction = (PlanDefinitionAction)theEObject;
				T result = casePlanDefinitionAction(planDefinitionAction);
				if (result == null) result = caseBackboneElement(planDefinitionAction);
				if (result == null) result = caseDataType(planDefinitionAction);
				if (result == null) result = caseElement(planDefinitionAction);
				if (result == null) result = caseBase(planDefinitionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION_CONDITION: {
				PlanDefinitionActionCondition planDefinitionActionCondition = (PlanDefinitionActionCondition)theEObject;
				T result = casePlanDefinitionActionCondition(planDefinitionActionCondition);
				if (result == null) result = caseBackboneElement(planDefinitionActionCondition);
				if (result == null) result = caseDataType(planDefinitionActionCondition);
				if (result == null) result = caseElement(planDefinitionActionCondition);
				if (result == null) result = caseBase(planDefinitionActionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION_RELATED_ACTION: {
				PlanDefinitionActionRelatedAction planDefinitionActionRelatedAction = (PlanDefinitionActionRelatedAction)theEObject;
				T result = casePlanDefinitionActionRelatedAction(planDefinitionActionRelatedAction);
				if (result == null) result = caseBackboneElement(planDefinitionActionRelatedAction);
				if (result == null) result = caseDataType(planDefinitionActionRelatedAction);
				if (result == null) result = caseElement(planDefinitionActionRelatedAction);
				if (result == null) result = caseBase(planDefinitionActionRelatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION_PARTICIPANT: {
				PlanDefinitionActionParticipant planDefinitionActionParticipant = (PlanDefinitionActionParticipant)theEObject;
				T result = casePlanDefinitionActionParticipant(planDefinitionActionParticipant);
				if (result == null) result = caseBackboneElement(planDefinitionActionParticipant);
				if (result == null) result = caseDataType(planDefinitionActionParticipant);
				if (result == null) result = caseElement(planDefinitionActionParticipant);
				if (result == null) result = caseBase(planDefinitionActionParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP: {
				StructureMap structureMap = (StructureMap)theEObject;
				T result = caseStructureMap(structureMap);
				if (result == null) result = caseDomainResource(structureMap);
				if (result == null) result = caseResource(structureMap);
				if (result == null) result = caseBase(structureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_STRUCTURE: {
				StructureMapStructure structureMapStructure = (StructureMapStructure)theEObject;
				T result = caseStructureMapStructure(structureMapStructure);
				if (result == null) result = caseBackboneElement(structureMapStructure);
				if (result == null) result = caseDataType(structureMapStructure);
				if (result == null) result = caseElement(structureMapStructure);
				if (result == null) result = caseBase(structureMapStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP: {
				StructureMapGroup structureMapGroup = (StructureMapGroup)theEObject;
				T result = caseStructureMapGroup(structureMapGroup);
				if (result == null) result = caseBackboneElement(structureMapGroup);
				if (result == null) result = caseDataType(structureMapGroup);
				if (result == null) result = caseElement(structureMapGroup);
				if (result == null) result = caseBase(structureMapGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT: {
				StructureMapGroupInput structureMapGroupInput = (StructureMapGroupInput)theEObject;
				T result = caseStructureMapGroupInput(structureMapGroupInput);
				if (result == null) result = caseBackboneElement(structureMapGroupInput);
				if (result == null) result = caseDataType(structureMapGroupInput);
				if (result == null) result = caseElement(structureMapGroupInput);
				if (result == null) result = caseBase(structureMapGroupInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE: {
				StructureMapGroupRule structureMapGroupRule = (StructureMapGroupRule)theEObject;
				T result = caseStructureMapGroupRule(structureMapGroupRule);
				if (result == null) result = caseBackboneElement(structureMapGroupRule);
				if (result == null) result = caseDataType(structureMapGroupRule);
				if (result == null) result = caseElement(structureMapGroupRule);
				if (result == null) result = caseBase(structureMapGroupRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE: {
				StructureMapGroupRuleSource structureMapGroupRuleSource = (StructureMapGroupRuleSource)theEObject;
				T result = caseStructureMapGroupRuleSource(structureMapGroupRuleSource);
				if (result == null) result = caseBackboneElement(structureMapGroupRuleSource);
				if (result == null) result = caseDataType(structureMapGroupRuleSource);
				if (result == null) result = caseElement(structureMapGroupRuleSource);
				if (result == null) result = caseBase(structureMapGroupRuleSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET: {
				StructureMapGroupRuleTarget structureMapGroupRuleTarget = (StructureMapGroupRuleTarget)theEObject;
				T result = caseStructureMapGroupRuleTarget(structureMapGroupRuleTarget);
				if (result == null) result = caseBackboneElement(structureMapGroupRuleTarget);
				if (result == null) result = caseDataType(structureMapGroupRuleTarget);
				if (result == null) result = caseElement(structureMapGroupRuleTarget);
				if (result == null) result = caseBase(structureMapGroupRuleTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET_PARAMETER: {
				StructureMapGroupRuleTargetParameter structureMapGroupRuleTargetParameter = (StructureMapGroupRuleTargetParameter)theEObject;
				T result = caseStructureMapGroupRuleTargetParameter(structureMapGroupRuleTargetParameter);
				if (result == null) result = caseBackboneElement(structureMapGroupRuleTargetParameter);
				if (result == null) result = caseDataType(structureMapGroupRuleTargetParameter);
				if (result == null) result = caseElement(structureMapGroupRuleTargetParameter);
				if (result == null) result = caseBase(structureMapGroupRuleTargetParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_DEPENDENT: {
				StructureMapGroupRuleDependent structureMapGroupRuleDependent = (StructureMapGroupRuleDependent)theEObject;
				T result = caseStructureMapGroupRuleDependent(structureMapGroupRuleDependent);
				if (result == null) result = caseBackboneElement(structureMapGroupRuleDependent);
				if (result == null) result = caseDataType(structureMapGroupRuleDependent);
				if (result == null) result = caseElement(structureMapGroupRuleDependent);
				if (result == null) result = caseBase(structureMapGroupRuleDependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PLAN_DEFINITION_ACTION_DYNAMIC_VALUE: {
				PlanDefinitionActionDynamicValue planDefinitionActionDynamicValue = (PlanDefinitionActionDynamicValue)theEObject;
				T result = casePlanDefinitionActionDynamicValue(planDefinitionActionDynamicValue);
				if (result == null) result = caseBackboneElement(planDefinitionActionDynamicValue);
				if (result == null) result = caseDataType(planDefinitionActionDynamicValue);
				if (result == null) result = caseElement(planDefinitionActionDynamicValue);
				if (result == null) result = caseBase(planDefinitionActionDynamicValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_PLAN_ACTIVITY: {
				CarePlanActivity carePlanActivity = (CarePlanActivity)theEObject;
				T result = caseCarePlanActivity(carePlanActivity);
				if (result == null) result = caseBackboneElement(carePlanActivity);
				if (result == null) result = caseDataType(carePlanActivity);
				if (result == null) result = caseElement(carePlanActivity);
				if (result == null) result = caseBase(carePlanActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_PLAN_ACTIVITY_DETAIL: {
				CarePlanActivityDetail carePlanActivityDetail = (CarePlanActivityDetail)theEObject;
				T result = caseCarePlanActivityDetail(carePlanActivityDetail);
				if (result == null) result = caseBackboneElement(carePlanActivityDetail);
				if (result == null) result = caseDataType(carePlanActivityDetail);
				if (result == null) result = caseElement(carePlanActivityDetail);
				if (result == null) result = caseBase(carePlanActivityDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_TEAM: {
				CareTeam careTeam = (CareTeam)theEObject;
				T result = caseCareTeam(careTeam);
				if (result == null) result = caseDomainResource(careTeam);
				if (result == null) result = caseResource(careTeam);
				if (result == null) result = caseBase(careTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CARE_TEAM_PARTICIPANT: {
				CareTeamParticipant careTeamParticipant = (CareTeamParticipant)theEObject;
				T result = caseCareTeamParticipant(careTeamParticipant);
				if (result == null) result = caseBackboneElement(careTeamParticipant);
				if (result == null) result = caseDataType(careTeamParticipant);
				if (result == null) result = caseElement(careTeamParticipant);
				if (result == null) result = caseBase(careTeamParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDomainResource(goal);
				if (result == null) result = caseResource(goal);
				if (result == null) result = caseBase(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GOAL_TARGET: {
				GoalTarget goalTarget = (GoalTarget)theEObject;
				T result = caseGoalTarget(goalTarget);
				if (result == null) result = caseBackboneElement(goalTarget);
				if (result == null) result = caseDataType(goalTarget);
				if (result == null) result = caseElement(goalTarget);
				if (result == null) result = caseBase(goalTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.APPOINTMENT: {
				Appointment appointment = (Appointment)theEObject;
				T result = caseAppointment(appointment);
				if (result == null) result = caseDomainResource(appointment);
				if (result == null) result = caseResource(appointment);
				if (result == null) result = caseBase(appointment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.APPOINTMENT_PARTICIPANT: {
				AppointmentParticipant appointmentParticipant = (AppointmentParticipant)theEObject;
				T result = caseAppointmentParticipant(appointmentParticipant);
				if (result == null) result = caseBackboneElement(appointmentParticipant);
				if (result == null) result = caseDataType(appointmentParticipant);
				if (result == null) result = caseElement(appointmentParticipant);
				if (result == null) result = caseBase(appointmentParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = caseDomainResource(slot);
				if (result == null) result = caseResource(slot);
				if (result == null) result = caseBase(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = caseDomainResource(schedule);
				if (result == null) result = caseResource(schedule);
				if (result == null) result = caseBase(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SERVICE_REQUEST: {
				ServiceRequest serviceRequest = (ServiceRequest)theEObject;
				T result = caseServiceRequest(serviceRequest);
				if (result == null) result = caseDomainResource(serviceRequest);
				if (result == null) result = caseResource(serviceRequest);
				if (result == null) result = caseBase(serviceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACTIVITY_DEFINITION: {
				ActivityDefinition activityDefinition = (ActivityDefinition)theEObject;
				T result = caseActivityDefinition(activityDefinition);
				if (result == null) result = caseDomainResource(activityDefinition);
				if (result == null) result = caseResource(activityDefinition);
				if (result == null) result = caseBase(activityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACTIVITY_DEFINITION_PARTICIPANT: {
				ActivityDefinitionParticipant activityDefinitionParticipant = (ActivityDefinitionParticipant)theEObject;
				T result = caseActivityDefinitionParticipant(activityDefinitionParticipant);
				if (result == null) result = caseBackboneElement(activityDefinitionParticipant);
				if (result == null) result = caseDataType(activityDefinitionParticipant);
				if (result == null) result = caseElement(activityDefinitionParticipant);
				if (result == null) result = caseBase(activityDefinitionParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE: {
				ActivityDefinitionDynamicValue activityDefinitionDynamicValue = (ActivityDefinitionDynamicValue)theEObject;
				T result = caseActivityDefinitionDynamicValue(activityDefinitionDynamicValue);
				if (result == null) result = caseBackboneElement(activityDefinitionDynamicValue);
				if (result == null) result = caseDataType(activityDefinitionDynamicValue);
				if (result == null) result = caseElement(activityDefinitionDynamicValue);
				if (result == null) result = caseBase(activityDefinitionDynamicValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseDomainResource(location);
				if (result == null) result = caseResource(location);
				if (result == null) result = caseBase(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LOCATION_POSITION: {
				LocationPosition locationPosition = (LocationPosition)theEObject;
				T result = caseLocationPosition(locationPosition);
				if (result == null) result = caseBackboneElement(locationPosition);
				if (result == null) result = caseDataType(locationPosition);
				if (result == null) result = caseElement(locationPosition);
				if (result == null) result = caseBase(locationPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LOCATION_HOURS_OF_OPERATION: {
				LocationHoursOfOperation locationHoursOfOperation = (LocationHoursOfOperation)theEObject;
				T result = caseLocationHoursOfOperation(locationHoursOfOperation);
				if (result == null) result = caseBackboneElement(locationHoursOfOperation);
				if (result == null) result = caseDataType(locationHoursOfOperation);
				if (result == null) result = caseElement(locationHoursOfOperation);
				if (result == null) result = caseBase(locationHoursOfOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_DEFINITION: {
				SpecimenDefinition specimenDefinition = (SpecimenDefinition)theEObject;
				T result = caseSpecimenDefinition(specimenDefinition);
				if (result == null) result = caseDomainResource(specimenDefinition);
				if (result == null) result = caseResource(specimenDefinition);
				if (result == null) result = caseBase(specimenDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED: {
				SpecimenDefinitionTypeTested specimenDefinitionTypeTested = (SpecimenDefinitionTypeTested)theEObject;
				T result = caseSpecimenDefinitionTypeTested(specimenDefinitionTypeTested);
				if (result == null) result = caseBackboneElement(specimenDefinitionTypeTested);
				if (result == null) result = caseDataType(specimenDefinitionTypeTested);
				if (result == null) result = caseElement(specimenDefinitionTypeTested);
				if (result == null) result = caseBase(specimenDefinitionTypeTested);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER: {
				SpecimenDefinitionTypeTestedContainer specimenDefinitionTypeTestedContainer = (SpecimenDefinitionTypeTestedContainer)theEObject;
				T result = caseSpecimenDefinitionTypeTestedContainer(specimenDefinitionTypeTestedContainer);
				if (result == null) result = caseBackboneElement(specimenDefinitionTypeTestedContainer);
				if (result == null) result = caseDataType(specimenDefinitionTypeTestedContainer);
				if (result == null) result = caseElement(specimenDefinitionTypeTestedContainer);
				if (result == null) result = caseBase(specimenDefinitionTypeTestedContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_CONTAINER_ADDITIVE: {
				SpecimenDefinitionTypeTestedContainerAdditive specimenDefinitionTypeTestedContainerAdditive = (SpecimenDefinitionTypeTestedContainerAdditive)theEObject;
				T result = caseSpecimenDefinitionTypeTestedContainerAdditive(specimenDefinitionTypeTestedContainerAdditive);
				if (result == null) result = caseBackboneElement(specimenDefinitionTypeTestedContainerAdditive);
				if (result == null) result = caseDataType(specimenDefinitionTypeTestedContainerAdditive);
				if (result == null) result = caseElement(specimenDefinitionTypeTestedContainerAdditive);
				if (result == null) result = caseBase(specimenDefinitionTypeTestedContainerAdditive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_DEFINITION_TYPE_TESTED_HANDLING: {
				SpecimenDefinitionTypeTestedHandling specimenDefinitionTypeTestedHandling = (SpecimenDefinitionTypeTestedHandling)theEObject;
				T result = caseSpecimenDefinitionTypeTestedHandling(specimenDefinitionTypeTestedHandling);
				if (result == null) result = caseBackboneElement(specimenDefinitionTypeTestedHandling);
				if (result == null) result = caseDataType(specimenDefinitionTypeTestedHandling);
				if (result == null) result = caseElement(specimenDefinitionTypeTestedHandling);
				if (result == null) result = caseBase(specimenDefinitionTypeTestedHandling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION_DEFINITION: {
				ObservationDefinition observationDefinition = (ObservationDefinition)theEObject;
				T result = caseObservationDefinition(observationDefinition);
				if (result == null) result = caseDomainResource(observationDefinition);
				if (result == null) result = caseResource(observationDefinition);
				if (result == null) result = caseBase(observationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS: {
				ObservationDefinitionQuantitativeDetails observationDefinitionQuantitativeDetails = (ObservationDefinitionQuantitativeDetails)theEObject;
				T result = caseObservationDefinitionQuantitativeDetails(observationDefinitionQuantitativeDetails);
				if (result == null) result = caseBackboneElement(observationDefinitionQuantitativeDetails);
				if (result == null) result = caseDataType(observationDefinitionQuantitativeDetails);
				if (result == null) result = caseElement(observationDefinitionQuantitativeDetails);
				if (result == null) result = caseBase(observationDefinitionQuantitativeDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL: {
				ObservationDefinitionQualifiedInterval observationDefinitionQualifiedInterval = (ObservationDefinitionQualifiedInterval)theEObject;
				T result = caseObservationDefinitionQualifiedInterval(observationDefinitionQualifiedInterval);
				if (result == null) result = caseBackboneElement(observationDefinitionQualifiedInterval);
				if (result == null) result = caseDataType(observationDefinitionQualifiedInterval);
				if (result == null) result = caseElement(observationDefinitionQualifiedInterval);
				if (result == null) result = caseBase(observationDefinitionQualifiedInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = caseDomainResource(coverage);
				if (result == null) result = caseResource(coverage);
				if (result == null) result = caseBase(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_CLASS: {
				CoverageClass coverageClass = (CoverageClass)theEObject;
				T result = caseCoverageClass(coverageClass);
				if (result == null) result = caseBackboneElement(coverageClass);
				if (result == null) result = caseDataType(coverageClass);
				if (result == null) result = caseElement(coverageClass);
				if (result == null) result = caseBase(coverageClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY: {
				CoverageCostToBeneficiary coverageCostToBeneficiary = (CoverageCostToBeneficiary)theEObject;
				T result = caseCoverageCostToBeneficiary(coverageCostToBeneficiary);
				if (result == null) result = caseBackboneElement(coverageCostToBeneficiary);
				if (result == null) result = caseDataType(coverageCostToBeneficiary);
				if (result == null) result = caseElement(coverageCostToBeneficiary);
				if (result == null) result = caseBase(coverageCostToBeneficiary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY_EXEMPTION: {
				CoverageCostToBeneficiaryExemption coverageCostToBeneficiaryExemption = (CoverageCostToBeneficiaryExemption)theEObject;
				T result = caseCoverageCostToBeneficiaryExemption(coverageCostToBeneficiaryExemption);
				if (result == null) result = caseBackboneElement(coverageCostToBeneficiaryExemption);
				if (result == null) result = caseDataType(coverageCostToBeneficiaryExemption);
				if (result == null) result = caseElement(coverageCostToBeneficiaryExemption);
				if (result == null) result = caseBase(coverageCostToBeneficiaryExemption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseDomainResource(contract);
				if (result == null) result = caseResource(contract);
				if (result == null) result = caseBase(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_CONTENT_DEFINITION: {
				ContractContentDefinition contractContentDefinition = (ContractContentDefinition)theEObject;
				T result = caseContractContentDefinition(contractContentDefinition);
				if (result == null) result = caseBackboneElement(contractContentDefinition);
				if (result == null) result = caseDataType(contractContentDefinition);
				if (result == null) result = caseElement(contractContentDefinition);
				if (result == null) result = caseBase(contractContentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM: {
				ContractTerm contractTerm = (ContractTerm)theEObject;
				T result = caseContractTerm(contractTerm);
				if (result == null) result = caseBackboneElement(contractTerm);
				if (result == null) result = caseDataType(contractTerm);
				if (result == null) result = caseElement(contractTerm);
				if (result == null) result = caseBase(contractTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_SECURITY_LABEL: {
				ContractTermSecurityLabel contractTermSecurityLabel = (ContractTermSecurityLabel)theEObject;
				T result = caseContractTermSecurityLabel(contractTermSecurityLabel);
				if (result == null) result = caseBackboneElement(contractTermSecurityLabel);
				if (result == null) result = caseDataType(contractTermSecurityLabel);
				if (result == null) result = caseElement(contractTermSecurityLabel);
				if (result == null) result = caseBase(contractTermSecurityLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER: {
				ContractTermContractOffer contractTermContractOffer = (ContractTermContractOffer)theEObject;
				T result = caseContractTermContractOffer(contractTermContractOffer);
				if (result == null) result = caseBackboneElement(contractTermContractOffer);
				if (result == null) result = caseDataType(contractTermContractOffer);
				if (result == null) result = caseElement(contractTermContractOffer);
				if (result == null) result = caseBase(contractTermContractOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_CONTRACT_PARTY: {
				ContractTermContractOfferContractParty contractTermContractOfferContractParty = (ContractTermContractOfferContractParty)theEObject;
				T result = caseContractTermContractOfferContractParty(contractTermContractOfferContractParty);
				if (result == null) result = caseBackboneElement(contractTermContractOfferContractParty);
				if (result == null) result = caseDataType(contractTermContractOfferContractParty);
				if (result == null) result = caseElement(contractTermContractOfferContractParty);
				if (result == null) result = caseBase(contractTermContractOfferContractParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_OFFER_ANSWER: {
				ContractTermContractOfferAnswer contractTermContractOfferAnswer = (ContractTermContractOfferAnswer)theEObject;
				T result = caseContractTermContractOfferAnswer(contractTermContractOfferAnswer);
				if (result == null) result = caseBackboneElement(contractTermContractOfferAnswer);
				if (result == null) result = caseDataType(contractTermContractOfferAnswer);
				if (result == null) result = caseElement(contractTermContractOfferAnswer);
				if (result == null) result = caseBase(contractTermContractOfferAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET: {
				ContractTermContractAsset contractTermContractAsset = (ContractTermContractAsset)theEObject;
				T result = caseContractTermContractAsset(contractTermContractAsset);
				if (result == null) result = caseBackboneElement(contractTermContractAsset);
				if (result == null) result = caseDataType(contractTermContractAsset);
				if (result == null) result = caseElement(contractTermContractAsset);
				if (result == null) result = caseBase(contractTermContractAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_ASSET_CONTEXT: {
				ContractTermContractAssetAssetContext contractTermContractAssetAssetContext = (ContractTermContractAssetAssetContext)theEObject;
				T result = caseContractTermContractAssetAssetContext(contractTermContractAssetAssetContext);
				if (result == null) result = caseBackboneElement(contractTermContractAssetAssetContext);
				if (result == null) result = caseDataType(contractTermContractAssetAssetContext);
				if (result == null) result = caseElement(contractTermContractAssetAssetContext);
				if (result == null) result = caseBase(contractTermContractAssetAssetContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_CONTRACT_ASSET_VALUED_ITEM: {
				ContractTermContractAssetValuedItem contractTermContractAssetValuedItem = (ContractTermContractAssetValuedItem)theEObject;
				T result = caseContractTermContractAssetValuedItem(contractTermContractAssetValuedItem);
				if (result == null) result = caseBackboneElement(contractTermContractAssetValuedItem);
				if (result == null) result = caseDataType(contractTermContractAssetValuedItem);
				if (result == null) result = caseElement(contractTermContractAssetValuedItem);
				if (result == null) result = caseBase(contractTermContractAssetValuedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_ACTION: {
				ContractTermAction contractTermAction = (ContractTermAction)theEObject;
				T result = caseContractTermAction(contractTermAction);
				if (result == null) result = caseBackboneElement(contractTermAction);
				if (result == null) result = caseDataType(contractTermAction);
				if (result == null) result = caseElement(contractTermAction);
				if (result == null) result = caseBase(contractTermAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_TERM_ACTION_ACTION_SUBJECT: {
				ContractTermActionActionSubject contractTermActionActionSubject = (ContractTermActionActionSubject)theEObject;
				T result = caseContractTermActionActionSubject(contractTermActionActionSubject);
				if (result == null) result = caseBackboneElement(contractTermActionActionSubject);
				if (result == null) result = caseDataType(contractTermActionActionSubject);
				if (result == null) result = caseElement(contractTermActionActionSubject);
				if (result == null) result = caseBase(contractTermActionActionSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_SIGNATORY: {
				ContractSignatory contractSignatory = (ContractSignatory)theEObject;
				T result = caseContractSignatory(contractSignatory);
				if (result == null) result = caseBackboneElement(contractSignatory);
				if (result == null) result = caseDataType(contractSignatory);
				if (result == null) result = caseElement(contractSignatory);
				if (result == null) result = caseBase(contractSignatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_FRIENDLY_LANGUAGE: {
				ContractFriendlyLanguage contractFriendlyLanguage = (ContractFriendlyLanguage)theEObject;
				T result = caseContractFriendlyLanguage(contractFriendlyLanguage);
				if (result == null) result = caseBackboneElement(contractFriendlyLanguage);
				if (result == null) result = caseDataType(contractFriendlyLanguage);
				if (result == null) result = caseElement(contractFriendlyLanguage);
				if (result == null) result = caseBase(contractFriendlyLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_LEGAL_LANGUAGE: {
				ContractLegalLanguage contractLegalLanguage = (ContractLegalLanguage)theEObject;
				T result = caseContractLegalLanguage(contractLegalLanguage);
				if (result == null) result = caseBackboneElement(contractLegalLanguage);
				if (result == null) result = caseDataType(contractLegalLanguage);
				if (result == null) result = caseElement(contractLegalLanguage);
				if (result == null) result = caseBase(contractLegalLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONTRACT_COMPUTABLE_LANGUAGE: {
				ContractComputableLanguage contractComputableLanguage = (ContractComputableLanguage)theEObject;
				T result = caseContractComputableLanguage(contractComputableLanguage);
				if (result == null) result = caseBackboneElement(contractComputableLanguage);
				if (result == null) result = caseDataType(contractComputableLanguage);
				if (result == null) result = caseElement(contractComputableLanguage);
				if (result == null) result = caseBase(contractComputableLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RELATED_PERSON: {
				RelatedPerson relatedPerson = (RelatedPerson)theEObject;
				T result = caseRelatedPerson(relatedPerson);
				if (result == null) result = caseDomainResource(relatedPerson);
				if (result == null) result = caseResource(relatedPerson);
				if (result == null) result = caseBase(relatedPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RELATED_PERSON_COMMUNICATION: {
				RelatedPersonCommunication relatedPersonCommunication = (RelatedPersonCommunication)theEObject;
				T result = caseRelatedPersonCommunication(relatedPersonCommunication);
				if (result == null) result = caseBackboneElement(relatedPersonCommunication);
				if (result == null) result = caseDataType(relatedPersonCommunication);
				if (result == null) result = caseElement(relatedPersonCommunication);
				if (result == null) result = caseBase(relatedPersonCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROVENANCE: {
				Provenance provenance = (Provenance)theEObject;
				T result = caseProvenance(provenance);
				if (result == null) result = caseDomainResource(provenance);
				if (result == null) result = caseResource(provenance);
				if (result == null) result = caseBase(provenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROVENANCE_AGENT: {
				ProvenanceAgent provenanceAgent = (ProvenanceAgent)theEObject;
				T result = caseProvenanceAgent(provenanceAgent);
				if (result == null) result = caseBackboneElement(provenanceAgent);
				if (result == null) result = caseDataType(provenanceAgent);
				if (result == null) result = caseElement(provenanceAgent);
				if (result == null) result = caseBase(provenanceAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROVENANCE_ENTITY: {
				ProvenanceEntity provenanceEntity = (ProvenanceEntity)theEObject;
				T result = caseProvenanceEntity(provenanceEntity);
				if (result == null) result = caseBackboneElement(provenanceEntity);
				if (result == null) result = caseDataType(provenanceEntity);
				if (result == null) result = caseElement(provenanceEntity);
				if (result == null) result = caseBase(provenanceEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN: {
				Specimen specimen = (Specimen)theEObject;
				T result = caseSpecimen(specimen);
				if (result == null) result = caseDomainResource(specimen);
				if (result == null) result = caseResource(specimen);
				if (result == null) result = caseBase(specimen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_COLLECTION: {
				SpecimenCollection specimenCollection = (SpecimenCollection)theEObject;
				T result = caseSpecimenCollection(specimenCollection);
				if (result == null) result = caseBackboneElement(specimenCollection);
				if (result == null) result = caseDataType(specimenCollection);
				if (result == null) result = caseElement(specimenCollection);
				if (result == null) result = caseBase(specimenCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_PROCESSING: {
				SpecimenProcessing specimenProcessing = (SpecimenProcessing)theEObject;
				T result = caseSpecimenProcessing(specimenProcessing);
				if (result == null) result = caseBackboneElement(specimenProcessing);
				if (result == null) result = caseDataType(specimenProcessing);
				if (result == null) result = caseElement(specimenProcessing);
				if (result == null) result = caseBase(specimenProcessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SPECIMEN_CONTAINER: {
				SpecimenContainer specimenContainer = (SpecimenContainer)theEObject;
				T result = caseSpecimenContainer(specimenContainer);
				if (result == null) result = caseBackboneElement(specimenContainer);
				if (result == null) result = caseDataType(specimenContainer);
				if (result == null) result = caseElement(specimenContainer);
				if (result == null) result = caseBase(specimenContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE: {
				Substance substance = (Substance)theEObject;
				T result = caseSubstance(substance);
				if (result == null) result = caseDomainResource(substance);
				if (result == null) result = caseResource(substance);
				if (result == null) result = caseBase(substance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_INSTANCE: {
				SubstanceInstance substanceInstance = (SubstanceInstance)theEObject;
				T result = caseSubstanceInstance(substanceInstance);
				if (result == null) result = caseBackboneElement(substanceInstance);
				if (result == null) result = caseDataType(substanceInstance);
				if (result == null) result = caseElement(substanceInstance);
				if (result == null) result = caseBase(substanceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_INGREDIENT: {
				SubstanceIngredient substanceIngredient = (SubstanceIngredient)theEObject;
				T result = caseSubstanceIngredient(substanceIngredient);
				if (result == null) result = caseBackboneElement(substanceIngredient);
				if (result == null) result = caseDataType(substanceIngredient);
				if (result == null) result = caseElement(substanceIngredient);
				if (result == null) result = caseBase(substanceIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_ADMINISTRATION: {
				MedicationAdministration medicationAdministration = (MedicationAdministration)theEObject;
				T result = caseMedicationAdministration(medicationAdministration);
				if (result == null) result = caseDomainResource(medicationAdministration);
				if (result == null) result = caseResource(medicationAdministration);
				if (result == null) result = caseBase(medicationAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_ADMINISTRATION_PERFORMER: {
				MedicationAdministrationPerformer medicationAdministrationPerformer = (MedicationAdministrationPerformer)theEObject;
				T result = caseMedicationAdministrationPerformer(medicationAdministrationPerformer);
				if (result == null) result = caseBackboneElement(medicationAdministrationPerformer);
				if (result == null) result = caseDataType(medicationAdministrationPerformer);
				if (result == null) result = caseElement(medicationAdministrationPerformer);
				if (result == null) result = caseBase(medicationAdministrationPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_ADMINISTRATION_DOSAGE: {
				MedicationAdministrationDosage medicationAdministrationDosage = (MedicationAdministrationDosage)theEObject;
				T result = caseMedicationAdministrationDosage(medicationAdministrationDosage);
				if (result == null) result = caseBackboneElement(medicationAdministrationDosage);
				if (result == null) result = caseDataType(medicationAdministrationDosage);
				if (result == null) result = caseElement(medicationAdministrationDosage);
				if (result == null) result = caseBase(medicationAdministrationDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_REQUEST: {
				MedicationRequest medicationRequest = (MedicationRequest)theEObject;
				T result = caseMedicationRequest(medicationRequest);
				if (result == null) result = caseDomainResource(medicationRequest);
				if (result == null) result = caseResource(medicationRequest);
				if (result == null) result = caseBase(medicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST: {
				MedicationRequestDispenseRequest medicationRequestDispenseRequest = (MedicationRequestDispenseRequest)theEObject;
				T result = caseMedicationRequestDispenseRequest(medicationRequestDispenseRequest);
				if (result == null) result = caseBackboneElement(medicationRequestDispenseRequest);
				if (result == null) result = caseDataType(medicationRequestDispenseRequest);
				if (result == null) result = caseElement(medicationRequestDispenseRequest);
				if (result == null) result = caseBase(medicationRequestDispenseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_REQUEST_DISPENSE_REQUEST_INITIAL_FILL: {
				MedicationRequestDispenseRequestInitialFill medicationRequestDispenseRequestInitialFill = (MedicationRequestDispenseRequestInitialFill)theEObject;
				T result = caseMedicationRequestDispenseRequestInitialFill(medicationRequestDispenseRequestInitialFill);
				if (result == null) result = caseBackboneElement(medicationRequestDispenseRequestInitialFill);
				if (result == null) result = caseDataType(medicationRequestDispenseRequestInitialFill);
				if (result == null) result = caseElement(medicationRequestDispenseRequestInitialFill);
				if (result == null) result = caseBase(medicationRequestDispenseRequestInitialFill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_REQUEST_SUBSTITUTION: {
				MedicationRequestSubstitution medicationRequestSubstitution = (MedicationRequestSubstitution)theEObject;
				T result = caseMedicationRequestSubstitution(medicationRequestSubstitution);
				if (result == null) result = caseBackboneElement(medicationRequestSubstitution);
				if (result == null) result = caseDataType(medicationRequestSubstitution);
				if (result == null) result = caseElement(medicationRequestSubstitution);
				if (result == null) result = caseBase(medicationRequestSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DETECTED_ISSUE: {
				DetectedIssue detectedIssue = (DetectedIssue)theEObject;
				T result = caseDetectedIssue(detectedIssue);
				if (result == null) result = caseDomainResource(detectedIssue);
				if (result == null) result = caseResource(detectedIssue);
				if (result == null) result = caseBase(detectedIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DETECTED_ISSUE_EVIDENCE: {
				DetectedIssueEvidence detectedIssueEvidence = (DetectedIssueEvidence)theEObject;
				T result = caseDetectedIssueEvidence(detectedIssueEvidence);
				if (result == null) result = caseBackboneElement(detectedIssueEvidence);
				if (result == null) result = caseDataType(detectedIssueEvidence);
				if (result == null) result = caseElement(detectedIssueEvidence);
				if (result == null) result = caseBase(detectedIssueEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DETECTED_ISSUE_MITIGATION: {
				DetectedIssueMitigation detectedIssueMitigation = (DetectedIssueMitigation)theEObject;
				T result = caseDetectedIssueMitigation(detectedIssueMitigation);
				if (result == null) result = caseBackboneElement(detectedIssueMitigation);
				if (result == null) result = caseDataType(detectedIssueMitigation);
				if (result == null) result = caseElement(detectedIssueMitigation);
				if (result == null) result = caseBase(detectedIssueMitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseDomainResource(device);
				if (result == null) result = caseResource(device);
				if (result == null) result = caseBase(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_UDI_CARRIER: {
				DeviceUdiCarrier deviceUdiCarrier = (DeviceUdiCarrier)theEObject;
				T result = caseDeviceUdiCarrier(deviceUdiCarrier);
				if (result == null) result = caseBackboneElement(deviceUdiCarrier);
				if (result == null) result = caseDataType(deviceUdiCarrier);
				if (result == null) result = caseElement(deviceUdiCarrier);
				if (result == null) result = caseBase(deviceUdiCarrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_DEVICE_NAME: {
				DeviceDeviceName deviceDeviceName = (DeviceDeviceName)theEObject;
				T result = caseDeviceDeviceName(deviceDeviceName);
				if (result == null) result = caseBackboneElement(deviceDeviceName);
				if (result == null) result = caseDataType(deviceDeviceName);
				if (result == null) result = caseElement(deviceDeviceName);
				if (result == null) result = caseBase(deviceDeviceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_SPECIALIZATION: {
				DeviceSpecialization deviceSpecialization = (DeviceSpecialization)theEObject;
				T result = caseDeviceSpecialization(deviceSpecialization);
				if (result == null) result = caseBackboneElement(deviceSpecialization);
				if (result == null) result = caseDataType(deviceSpecialization);
				if (result == null) result = caseElement(deviceSpecialization);
				if (result == null) result = caseBase(deviceSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_VERSION: {
				DeviceVersion deviceVersion = (DeviceVersion)theEObject;
				T result = caseDeviceVersion(deviceVersion);
				if (result == null) result = caseBackboneElement(deviceVersion);
				if (result == null) result = caseDataType(deviceVersion);
				if (result == null) result = caseElement(deviceVersion);
				if (result == null) result = caseBase(deviceVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_PROPERTY: {
				DeviceProperty deviceProperty = (DeviceProperty)theEObject;
				T result = caseDeviceProperty(deviceProperty);
				if (result == null) result = caseBackboneElement(deviceProperty);
				if (result == null) result = caseDataType(deviceProperty);
				if (result == null) result = caseElement(deviceProperty);
				if (result == null) result = caseBase(deviceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_DEFINITION: {
				DeviceDefinition deviceDefinition = (DeviceDefinition)theEObject;
				T result = caseDeviceDefinition(deviceDefinition);
				if (result == null) result = caseDomainResource(deviceDefinition);
				if (result == null) result = caseResource(deviceDefinition);
				if (result == null) result = caseBase(deviceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_DEFINITION_UDI_DEVICE_IDENTIFIER: {
				DeviceDefinitionUdiDeviceIdentifier deviceDefinitionUdiDeviceIdentifier = (DeviceDefinitionUdiDeviceIdentifier)theEObject;
				T result = caseDeviceDefinitionUdiDeviceIdentifier(deviceDefinitionUdiDeviceIdentifier);
				if (result == null) result = caseBackboneElement(deviceDefinitionUdiDeviceIdentifier);
				if (result == null) result = caseDataType(deviceDefinitionUdiDeviceIdentifier);
				if (result == null) result = caseElement(deviceDefinitionUdiDeviceIdentifier);
				if (result == null) result = caseBase(deviceDefinitionUdiDeviceIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_DEFINITION_DEVICE_NAME: {
				DeviceDefinitionDeviceName deviceDefinitionDeviceName = (DeviceDefinitionDeviceName)theEObject;
				T result = caseDeviceDefinitionDeviceName(deviceDefinitionDeviceName);
				if (result == null) result = caseBackboneElement(deviceDefinitionDeviceName);
				if (result == null) result = caseDataType(deviceDefinitionDeviceName);
				if (result == null) result = caseElement(deviceDefinitionDeviceName);
				if (result == null) result = caseBase(deviceDefinitionDeviceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_DEFINITION_SPECIALIZATION: {
				DeviceDefinitionSpecialization deviceDefinitionSpecialization = (DeviceDefinitionSpecialization)theEObject;
				T result = caseDeviceDefinitionSpecialization(deviceDefinitionSpecialization);
				if (result == null) result = caseBackboneElement(deviceDefinitionSpecialization);
				if (result == null) result = caseDataType(deviceDefinitionSpecialization);
				if (result == null) result = caseElement(deviceDefinitionSpecialization);
				if (result == null) result = caseBase(deviceDefinitionSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_DEFINITION_CAPABILITY: {
				DeviceDefinitionCapability deviceDefinitionCapability = (DeviceDefinitionCapability)theEObject;
				T result = caseDeviceDefinitionCapability(deviceDefinitionCapability);
				if (result == null) result = caseBackboneElement(deviceDefinitionCapability);
				if (result == null) result = caseDataType(deviceDefinitionCapability);
				if (result == null) result = caseElement(deviceDefinitionCapability);
				if (result == null) result = caseBase(deviceDefinitionCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_DEFINITION_PROPERTY: {
				DeviceDefinitionProperty deviceDefinitionProperty = (DeviceDefinitionProperty)theEObject;
				T result = caseDeviceDefinitionProperty(deviceDefinitionProperty);
				if (result == null) result = caseBackboneElement(deviceDefinitionProperty);
				if (result == null) result = caseDataType(deviceDefinitionProperty);
				if (result == null) result = caseElement(deviceDefinitionProperty);
				if (result == null) result = caseBase(deviceDefinitionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_DEFINITION_MATERIAL: {
				DeviceDefinitionMaterial deviceDefinitionMaterial = (DeviceDefinitionMaterial)theEObject;
				T result = caseDeviceDefinitionMaterial(deviceDefinitionMaterial);
				if (result == null) result = caseBackboneElement(deviceDefinitionMaterial);
				if (result == null) result = caseDataType(deviceDefinitionMaterial);
				if (result == null) result = caseElement(deviceDefinitionMaterial);
				if (result == null) result = caseBase(deviceDefinitionMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE: {
				DocumentReference documentReference = (DocumentReference)theEObject;
				T result = caseDocumentReference(documentReference);
				if (result == null) result = caseDomainResource(documentReference);
				if (result == null) result = caseResource(documentReference);
				if (result == null) result = caseBase(documentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE_RELATES_TO: {
				DocumentReferenceRelatesTo documentReferenceRelatesTo = (DocumentReferenceRelatesTo)theEObject;
				T result = caseDocumentReferenceRelatesTo(documentReferenceRelatesTo);
				if (result == null) result = caseBackboneElement(documentReferenceRelatesTo);
				if (result == null) result = caseDataType(documentReferenceRelatesTo);
				if (result == null) result = caseElement(documentReferenceRelatesTo);
				if (result == null) result = caseBase(documentReferenceRelatesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTENT: {
				DocumentReferenceContent documentReferenceContent = (DocumentReferenceContent)theEObject;
				T result = caseDocumentReferenceContent(documentReferenceContent);
				if (result == null) result = caseBackboneElement(documentReferenceContent);
				if (result == null) result = caseDataType(documentReferenceContent);
				if (result == null) result = caseElement(documentReferenceContent);
				if (result == null) result = caseBase(documentReferenceContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT: {
				DocumentReferenceContext documentReferenceContext = (DocumentReferenceContext)theEObject;
				T result = caseDocumentReferenceContext(documentReferenceContext);
				if (result == null) result = caseBackboneElement(documentReferenceContext);
				if (result == null) result = caseDataType(documentReferenceContext);
				if (result == null) result = caseElement(documentReferenceContext);
				if (result == null) result = caseBase(documentReferenceContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_ASSESSMENT: {
				RiskAssessment riskAssessment = (RiskAssessment)theEObject;
				T result = caseRiskAssessment(riskAssessment);
				if (result == null) result = caseDomainResource(riskAssessment);
				if (result == null) result = caseResource(riskAssessment);
				if (result == null) result = caseBase(riskAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION: {
				RiskAssessmentPrediction riskAssessmentPrediction = (RiskAssessmentPrediction)theEObject;
				T result = caseRiskAssessmentPrediction(riskAssessmentPrediction);
				if (result == null) result = caseBackboneElement(riskAssessmentPrediction);
				if (result == null) result = caseDataType(riskAssessmentPrediction);
				if (result == null) result = caseElement(riskAssessmentPrediction);
				if (result == null) result = caseBase(riskAssessmentPrediction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = caseDomainResource(account);
				if (result == null) result = caseResource(account);
				if (result == null) result = caseBase(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACCOUNT_COVERAGE: {
				AccountCoverage accountCoverage = (AccountCoverage)theEObject;
				T result = caseAccountCoverage(accountCoverage);
				if (result == null) result = caseBackboneElement(accountCoverage);
				if (result == null) result = caseDataType(accountCoverage);
				if (result == null) result = caseElement(accountCoverage);
				if (result == null) result = caseBase(accountCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ACCOUNT_GUARANTOR: {
				AccountGuarantor accountGuarantor = (AccountGuarantor)theEObject;
				T result = caseAccountGuarantor(accountGuarantor);
				if (result == null) result = caseBackboneElement(accountGuarantor);
				if (result == null) result = caseDataType(accountGuarantor);
				if (result == null) result = caseElement(accountGuarantor);
				if (result == null) result = caseBase(accountGuarantor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT: {
				MedicinalProduct medicinalProduct = (MedicinalProduct)theEObject;
				T result = caseMedicinalProduct(medicinalProduct);
				if (result == null) result = caseDomainResource(medicinalProduct);
				if (result == null) result = caseResource(medicinalProduct);
				if (result == null) result = caseBase(medicinalProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTACT: {
				MedicinalProductContact medicinalProductContact = (MedicinalProductContact)theEObject;
				T result = caseMedicinalProductContact(medicinalProductContact);
				if (result == null) result = caseBackboneElement(medicinalProductContact);
				if (result == null) result = caseDataType(medicinalProductContact);
				if (result == null) result = caseElement(medicinalProductContact);
				if (result == null) result = caseBase(medicinalProductContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME: {
				MedicinalProductName medicinalProductName = (MedicinalProductName)theEObject;
				T result = caseMedicinalProductName(medicinalProductName);
				if (result == null) result = caseBackboneElement(medicinalProductName);
				if (result == null) result = caseDataType(medicinalProductName);
				if (result == null) result = caseElement(medicinalProductName);
				if (result == null) result = caseBase(medicinalProductName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_NAME_PART: {
				MedicinalProductNameNamePart medicinalProductNameNamePart = (MedicinalProductNameNamePart)theEObject;
				T result = caseMedicinalProductNameNamePart(medicinalProductNameNamePart);
				if (result == null) result = caseBackboneElement(medicinalProductNameNamePart);
				if (result == null) result = caseDataType(medicinalProductNameNamePart);
				if (result == null) result = caseElement(medicinalProductNameNamePart);
				if (result == null) result = caseBase(medicinalProductNameNamePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE: {
				MedicinalProductNameCountryLanguage medicinalProductNameCountryLanguage = (MedicinalProductNameCountryLanguage)theEObject;
				T result = caseMedicinalProductNameCountryLanguage(medicinalProductNameCountryLanguage);
				if (result == null) result = caseBackboneElement(medicinalProductNameCountryLanguage);
				if (result == null) result = caseDataType(medicinalProductNameCountryLanguage);
				if (result == null) result = caseElement(medicinalProductNameCountryLanguage);
				if (result == null) result = caseBase(medicinalProductNameCountryLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_MANUFACTURING_BUSINESS_OPERATION: {
				MedicinalProductManufacturingBusinessOperation medicinalProductManufacturingBusinessOperation = (MedicinalProductManufacturingBusinessOperation)theEObject;
				T result = caseMedicinalProductManufacturingBusinessOperation(medicinalProductManufacturingBusinessOperation);
				if (result == null) result = caseBackboneElement(medicinalProductManufacturingBusinessOperation);
				if (result == null) result = caseDataType(medicinalProductManufacturingBusinessOperation);
				if (result == null) result = caseElement(medicinalProductManufacturingBusinessOperation);
				if (result == null) result = caseBase(medicinalProductManufacturingBusinessOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION: {
				MedicinalProductSpecialDesignation medicinalProductSpecialDesignation = (MedicinalProductSpecialDesignation)theEObject;
				T result = caseMedicinalProductSpecialDesignation(medicinalProductSpecialDesignation);
				if (result == null) result = caseBackboneElement(medicinalProductSpecialDesignation);
				if (result == null) result = caseDataType(medicinalProductSpecialDesignation);
				if (result == null) result = caseElement(medicinalProductSpecialDesignation);
				if (result == null) result = caseBase(medicinalProductSpecialDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL: {
				MedicinalProductPharmaceutical medicinalProductPharmaceutical = (MedicinalProductPharmaceutical)theEObject;
				T result = caseMedicinalProductPharmaceutical(medicinalProductPharmaceutical);
				if (result == null) result = caseDomainResource(medicinalProductPharmaceutical);
				if (result == null) result = caseResource(medicinalProductPharmaceutical);
				if (result == null) result = caseBase(medicinalProductPharmaceutical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_CHARACTERISTICS: {
				MedicinalProductPharmaceuticalCharacteristics medicinalProductPharmaceuticalCharacteristics = (MedicinalProductPharmaceuticalCharacteristics)theEObject;
				T result = caseMedicinalProductPharmaceuticalCharacteristics(medicinalProductPharmaceuticalCharacteristics);
				if (result == null) result = caseBackboneElement(medicinalProductPharmaceuticalCharacteristics);
				if (result == null) result = caseDataType(medicinalProductPharmaceuticalCharacteristics);
				if (result == null) result = caseElement(medicinalProductPharmaceuticalCharacteristics);
				if (result == null) result = caseBase(medicinalProductPharmaceuticalCharacteristics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION: {
				MedicinalProductPharmaceuticalRouteOfAdministration medicinalProductPharmaceuticalRouteOfAdministration = (MedicinalProductPharmaceuticalRouteOfAdministration)theEObject;
				T result = caseMedicinalProductPharmaceuticalRouteOfAdministration(medicinalProductPharmaceuticalRouteOfAdministration);
				if (result == null) result = caseBackboneElement(medicinalProductPharmaceuticalRouteOfAdministration);
				if (result == null) result = caseDataType(medicinalProductPharmaceuticalRouteOfAdministration);
				if (result == null) result = caseElement(medicinalProductPharmaceuticalRouteOfAdministration);
				if (result == null) result = caseBase(medicinalProductPharmaceuticalRouteOfAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES: {
				MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies medicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies = (MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies)theEObject;
				T result = caseMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies);
				if (result == null) result = caseBackboneElement(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies);
				if (result == null) result = caseDataType(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies);
				if (result == null) result = caseElement(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies);
				if (result == null) result = caseBase(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_PHARMACEUTICAL_ROUTE_OF_ADMINISTRATION_TARGET_SPECIES_WITHDRAWAL_PERIOD: {
				MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod medicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod = (MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod)theEObject;
				T result = caseMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod);
				if (result == null) result = caseBackboneElement(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod);
				if (result == null) result = caseDataType(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod);
				if (result == null) result = caseElement(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod);
				if (result == null) result = caseBase(medicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT: {
				MedicinalProductIngredient medicinalProductIngredient = (MedicinalProductIngredient)theEObject;
				T result = caseMedicinalProductIngredient(medicinalProductIngredient);
				if (result == null) result = caseDomainResource(medicinalProductIngredient);
				if (result == null) result = caseResource(medicinalProductIngredient);
				if (result == null) result = caseBase(medicinalProductIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE: {
				MedicinalProductIngredientSpecifiedSubstance medicinalProductIngredientSpecifiedSubstance = (MedicinalProductIngredientSpecifiedSubstance)theEObject;
				T result = caseMedicinalProductIngredientSpecifiedSubstance(medicinalProductIngredientSpecifiedSubstance);
				if (result == null) result = caseBackboneElement(medicinalProductIngredientSpecifiedSubstance);
				if (result == null) result = caseDataType(medicinalProductIngredientSpecifiedSubstance);
				if (result == null) result = caseElement(medicinalProductIngredientSpecifiedSubstance);
				if (result == null) result = caseBase(medicinalProductIngredientSpecifiedSubstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH: {
				MedicinalProductIngredientSpecifiedSubstanceStrength medicinalProductIngredientSpecifiedSubstanceStrength = (MedicinalProductIngredientSpecifiedSubstanceStrength)theEObject;
				T result = caseMedicinalProductIngredientSpecifiedSubstanceStrength(medicinalProductIngredientSpecifiedSubstanceStrength);
				if (result == null) result = caseBackboneElement(medicinalProductIngredientSpecifiedSubstanceStrength);
				if (result == null) result = caseDataType(medicinalProductIngredientSpecifiedSubstanceStrength);
				if (result == null) result = caseElement(medicinalProductIngredientSpecifiedSubstanceStrength);
				if (result == null) result = caseBase(medicinalProductIngredientSpecifiedSubstanceStrength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH: {
				MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength medicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength = (MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength)theEObject;
				T result = caseMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength(medicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength);
				if (result == null) result = caseBackboneElement(medicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength);
				if (result == null) result = caseDataType(medicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength);
				if (result == null) result = caseElement(medicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength);
				if (result == null) result = caseBase(medicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SUBSTANCE: {
				MedicinalProductIngredientSubstance medicinalProductIngredientSubstance = (MedicinalProductIngredientSubstance)theEObject;
				T result = caseMedicinalProductIngredientSubstance(medicinalProductIngredientSubstance);
				if (result == null) result = caseBackboneElement(medicinalProductIngredientSubstance);
				if (result == null) result = caseDataType(medicinalProductIngredientSubstance);
				if (result == null) result = caseElement(medicinalProductIngredientSubstance);
				if (result == null) result = caseBase(medicinalProductIngredientSubstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED: {
				MedicinalProductPackaged medicinalProductPackaged = (MedicinalProductPackaged)theEObject;
				T result = caseMedicinalProductPackaged(medicinalProductPackaged);
				if (result == null) result = caseDomainResource(medicinalProductPackaged);
				if (result == null) result = caseResource(medicinalProductPackaged);
				if (result == null) result = caseBase(medicinalProductPackaged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_BATCH_IDENTIFIER: {
				MedicinalProductPackagedBatchIdentifier medicinalProductPackagedBatchIdentifier = (MedicinalProductPackagedBatchIdentifier)theEObject;
				T result = caseMedicinalProductPackagedBatchIdentifier(medicinalProductPackagedBatchIdentifier);
				if (result == null) result = caseBackboneElement(medicinalProductPackagedBatchIdentifier);
				if (result == null) result = caseDataType(medicinalProductPackagedBatchIdentifier);
				if (result == null) result = caseElement(medicinalProductPackagedBatchIdentifier);
				if (result == null) result = caseBase(medicinalProductPackagedBatchIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM: {
				MedicinalProductPackagedPackageItem medicinalProductPackagedPackageItem = (MedicinalProductPackagedPackageItem)theEObject;
				T result = caseMedicinalProductPackagedPackageItem(medicinalProductPackagedPackageItem);
				if (result == null) result = caseBackboneElement(medicinalProductPackagedPackageItem);
				if (result == null) result = caseDataType(medicinalProductPackagedPackageItem);
				if (result == null) result = caseElement(medicinalProductPackagedPackageItem);
				if (result == null) result = caseBase(medicinalProductPackagedPackageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION: {
				MedicinalProductAuthorization medicinalProductAuthorization = (MedicinalProductAuthorization)theEObject;
				T result = caseMedicinalProductAuthorization(medicinalProductAuthorization);
				if (result == null) result = caseDomainResource(medicinalProductAuthorization);
				if (result == null) result = caseResource(medicinalProductAuthorization);
				if (result == null) result = caseBase(medicinalProductAuthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION: {
				MedicinalProductAuthorizationJurisdictionalAuthorization medicinalProductAuthorizationJurisdictionalAuthorization = (MedicinalProductAuthorizationJurisdictionalAuthorization)theEObject;
				T result = caseMedicinalProductAuthorizationJurisdictionalAuthorization(medicinalProductAuthorizationJurisdictionalAuthorization);
				if (result == null) result = caseBackboneElement(medicinalProductAuthorizationJurisdictionalAuthorization);
				if (result == null) result = caseDataType(medicinalProductAuthorizationJurisdictionalAuthorization);
				if (result == null) result = caseElement(medicinalProductAuthorizationJurisdictionalAuthorization);
				if (result == null) result = caseBase(medicinalProductAuthorizationJurisdictionalAuthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE: {
				MedicinalProductAuthorizationProcedure medicinalProductAuthorizationProcedure = (MedicinalProductAuthorizationProcedure)theEObject;
				T result = caseMedicinalProductAuthorizationProcedure(medicinalProductAuthorizationProcedure);
				if (result == null) result = caseBackboneElement(medicinalProductAuthorizationProcedure);
				if (result == null) result = caseDataType(medicinalProductAuthorizationProcedure);
				if (result == null) result = caseElement(medicinalProductAuthorizationProcedure);
				if (result == null) result = caseBase(medicinalProductAuthorizationProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_MANUFACTURED: {
				MedicinalProductManufactured medicinalProductManufactured = (MedicinalProductManufactured)theEObject;
				T result = caseMedicinalProductManufactured(medicinalProductManufactured);
				if (result == null) result = caseDomainResource(medicinalProductManufactured);
				if (result == null) result = caseResource(medicinalProductManufactured);
				if (result == null) result = caseBase(medicinalProductManufactured);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_STUDY: {
				ResearchStudy researchStudy = (ResearchStudy)theEObject;
				T result = caseResearchStudy(researchStudy);
				if (result == null) result = caseDomainResource(researchStudy);
				if (result == null) result = caseResource(researchStudy);
				if (result == null) result = caseBase(researchStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_STUDY_ARM: {
				ResearchStudyArm researchStudyArm = (ResearchStudyArm)theEObject;
				T result = caseResearchStudyArm(researchStudyArm);
				if (result == null) result = caseBackboneElement(researchStudyArm);
				if (result == null) result = caseDataType(researchStudyArm);
				if (result == null) result = caseElement(researchStudyArm);
				if (result == null) result = caseBase(researchStudyArm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_STUDY_OBJECTIVE: {
				ResearchStudyObjective researchStudyObjective = (ResearchStudyObjective)theEObject;
				T result = caseResearchStudyObjective(researchStudyObjective);
				if (result == null) result = caseBackboneElement(researchStudyObjective);
				if (result == null) result = caseDataType(researchStudyObjective);
				if (result == null) result = caseElement(researchStudyObjective);
				if (result == null) result = caseBase(researchStudyObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseDomainResource(group);
				if (result == null) result = caseResource(group);
				if (result == null) result = caseBase(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GROUP_CHARACTERISTIC: {
				GroupCharacteristic groupCharacteristic = (GroupCharacteristic)theEObject;
				T result = caseGroupCharacteristic(groupCharacteristic);
				if (result == null) result = caseBackboneElement(groupCharacteristic);
				if (result == null) result = caseDataType(groupCharacteristic);
				if (result == null) result = caseElement(groupCharacteristic);
				if (result == null) result = caseBase(groupCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GROUP_MEMBER: {
				GroupMember groupMember = (GroupMember)theEObject;
				T result = caseGroupMember(groupMember);
				if (result == null) result = caseBackboneElement(groupMember);
				if (result == null) result = caseDataType(groupMember);
				if (result == null) result = caseElement(groupMember);
				if (result == null) result = caseBase(groupMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EVIDENCE_VARIABLE: {
				EvidenceVariable evidenceVariable = (EvidenceVariable)theEObject;
				T result = caseEvidenceVariable(evidenceVariable);
				if (result == null) result = caseDomainResource(evidenceVariable);
				if (result == null) result = caseResource(evidenceVariable);
				if (result == null) result = caseBase(evidenceVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EVIDENCE_VARIABLE_CHARACTERISTIC: {
				EvidenceVariableCharacteristic evidenceVariableCharacteristic = (EvidenceVariableCharacteristic)theEObject;
				T result = caseEvidenceVariableCharacteristic(evidenceVariableCharacteristic);
				if (result == null) result = caseBackboneElement(evidenceVariableCharacteristic);
				if (result == null) result = caseDataType(evidenceVariableCharacteristic);
				if (result == null) result = caseElement(evidenceVariableCharacteristic);
				if (result == null) result = caseBase(evidenceVariableCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_SUBJECT: {
				ResearchSubject researchSubject = (ResearchSubject)theEObject;
				T result = caseResearchSubject(researchSubject);
				if (result == null) result = caseDomainResource(researchSubject);
				if (result == null) result = caseResource(researchSubject);
				if (result == null) result = caseBase(researchSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENT: {
				Consent consent = (Consent)theEObject;
				T result = caseConsent(consent);
				if (result == null) result = caseDomainResource(consent);
				if (result == null) result = caseResource(consent);
				if (result == null) result = caseBase(consent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENT_POLICY: {
				ConsentPolicy consentPolicy = (ConsentPolicy)theEObject;
				T result = caseConsentPolicy(consentPolicy);
				if (result == null) result = caseBackboneElement(consentPolicy);
				if (result == null) result = caseDataType(consentPolicy);
				if (result == null) result = caseElement(consentPolicy);
				if (result == null) result = caseBase(consentPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENT_VERIFICATION: {
				ConsentVerification consentVerification = (ConsentVerification)theEObject;
				T result = caseConsentVerification(consentVerification);
				if (result == null) result = caseBackboneElement(consentVerification);
				if (result == null) result = caseDataType(consentVerification);
				if (result == null) result = caseElement(consentVerification);
				if (result == null) result = caseBase(consentVerification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENTPROVISION: {
				Consentprovision consentprovision = (Consentprovision)theEObject;
				T result = caseConsentprovision(consentprovision);
				if (result == null) result = caseBackboneElement(consentprovision);
				if (result == null) result = caseDataType(consentprovision);
				if (result == null) result = caseElement(consentprovision);
				if (result == null) result = caseBase(consentprovision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENTPROVISIONPROVISION_ACTOR: {
				ConsentprovisionprovisionActor consentprovisionprovisionActor = (ConsentprovisionprovisionActor)theEObject;
				T result = caseConsentprovisionprovisionActor(consentprovisionprovisionActor);
				if (result == null) result = caseBackboneElement(consentprovisionprovisionActor);
				if (result == null) result = caseDataType(consentprovisionprovisionActor);
				if (result == null) result = caseElement(consentprovisionprovisionActor);
				if (result == null) result = caseBase(consentprovisionprovisionActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONSENTPROVISIONPROVISION_DATA: {
				ConsentprovisionprovisionData consentprovisionprovisionData = (ConsentprovisionprovisionData)theEObject;
				T result = caseConsentprovisionprovisionData(consentprovisionprovisionData);
				if (result == null) result = caseBackboneElement(consentprovisionprovisionData);
				if (result == null) result = caseDataType(consentprovisionprovisionData);
				if (result == null) result = caseElement(consentprovisionprovisionData);
				if (result == null) result = caseBase(consentprovisionprovisionData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EVENT_DEFINITION: {
				EventDefinition eventDefinition = (EventDefinition)theEObject;
				T result = caseEventDefinition(eventDefinition);
				if (result == null) result = caseDomainResource(eventDefinition);
				if (result == null) result = caseResource(eventDefinition);
				if (result == null) result = caseBase(eventDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CHARGE_ITEM: {
				ChargeItem chargeItem = (ChargeItem)theEObject;
				T result = caseChargeItem(chargeItem);
				if (result == null) result = caseDomainResource(chargeItem);
				if (result == null) result = caseResource(chargeItem);
				if (result == null) result = caseBase(chargeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CHARGE_ITEM_DEFINITION: {
				ChargeItemDefinition chargeItemDefinition = (ChargeItemDefinition)theEObject;
				T result = caseChargeItemDefinition(chargeItemDefinition);
				if (result == null) result = caseDomainResource(chargeItemDefinition);
				if (result == null) result = caseResource(chargeItemDefinition);
				if (result == null) result = caseBase(chargeItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_APPLICABILITY: {
				ChargeItemDefinitionApplicability chargeItemDefinitionApplicability = (ChargeItemDefinitionApplicability)theEObject;
				T result = caseChargeItemDefinitionApplicability(chargeItemDefinitionApplicability);
				if (result == null) result = caseBackboneElement(chargeItemDefinitionApplicability);
				if (result == null) result = caseDataType(chargeItemDefinitionApplicability);
				if (result == null) result = caseElement(chargeItemDefinitionApplicability);
				if (result == null) result = caseBase(chargeItemDefinitionApplicability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP: {
				ChargeItemDefinitionPropertyGroup chargeItemDefinitionPropertyGroup = (ChargeItemDefinitionPropertyGroup)theEObject;
				T result = caseChargeItemDefinitionPropertyGroup(chargeItemDefinitionPropertyGroup);
				if (result == null) result = caseBackboneElement(chargeItemDefinitionPropertyGroup);
				if (result == null) result = caseDataType(chargeItemDefinitionPropertyGroup);
				if (result == null) result = caseElement(chargeItemDefinitionPropertyGroup);
				if (result == null) result = caseBase(chargeItemDefinitionPropertyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CHARGE_ITEM_DEFINITION_PROPERTY_GROUP_PRICE_COMPONENT: {
				ChargeItemDefinitionPropertyGroupPriceComponent chargeItemDefinitionPropertyGroupPriceComponent = (ChargeItemDefinitionPropertyGroupPriceComponent)theEObject;
				T result = caseChargeItemDefinitionPropertyGroupPriceComponent(chargeItemDefinitionPropertyGroupPriceComponent);
				if (result == null) result = caseBackboneElement(chargeItemDefinitionPropertyGroupPriceComponent);
				if (result == null) result = caseDataType(chargeItemDefinitionPropertyGroupPriceComponent);
				if (result == null) result = caseElement(chargeItemDefinitionPropertyGroupPriceComponent);
				if (result == null) result = caseBase(chargeItemDefinitionPropertyGroupPriceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CHARGE_ITEM_PERFORMER: {
				ChargeItemPerformer chargeItemPerformer = (ChargeItemPerformer)theEObject;
				T result = caseChargeItemPerformer(chargeItemPerformer);
				if (result == null) result = caseBackboneElement(chargeItemPerformer);
				if (result == null) result = caseDataType(chargeItemPerformer);
				if (result == null) result = caseElement(chargeItemPerformer);
				if (result == null) result = caseBase(chargeItemPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION: {
				Medication medication = (Medication)theEObject;
				T result = caseMedication(medication);
				if (result == null) result = caseDomainResource(medication);
				if (result == null) result = caseResource(medication);
				if (result == null) result = caseBase(medication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_INGREDIENT: {
				MedicationIngredient medicationIngredient = (MedicationIngredient)theEObject;
				T result = caseMedicationIngredient(medicationIngredient);
				if (result == null) result = caseBackboneElement(medicationIngredient);
				if (result == null) result = caseDataType(medicationIngredient);
				if (result == null) result = caseElement(medicationIngredient);
				if (result == null) result = caseBase(medicationIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_BATCH: {
				MedicationBatch medicationBatch = (MedicationBatch)theEObject;
				T result = caseMedicationBatch(medicationBatch);
				if (result == null) result = caseBackboneElement(medicationBatch);
				if (result == null) result = caseDataType(medicationBatch);
				if (result == null) result = caseElement(medicationBatch);
				if (result == null) result = caseBase(medicationBatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DIAGNOSTIC_REPORT: {
				DiagnosticReport diagnosticReport = (DiagnosticReport)theEObject;
				T result = caseDiagnosticReport(diagnosticReport);
				if (result == null) result = caseDomainResource(diagnosticReport);
				if (result == null) result = caseResource(diagnosticReport);
				if (result == null) result = caseBase(diagnosticReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA: {
				DiagnosticReportMedia diagnosticReportMedia = (DiagnosticReportMedia)theEObject;
				T result = caseDiagnosticReportMedia(diagnosticReportMedia);
				if (result == null) result = caseBackboneElement(diagnosticReportMedia);
				if (result == null) result = caseDataType(diagnosticReportMedia);
				if (result == null) result = caseElement(diagnosticReportMedia);
				if (result == null) result = caseBase(diagnosticReportMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY: {
				ImagingStudy imagingStudy = (ImagingStudy)theEObject;
				T result = caseImagingStudy(imagingStudy);
				if (result == null) result = caseDomainResource(imagingStudy);
				if (result == null) result = caseResource(imagingStudy);
				if (result == null) result = caseBase(imagingStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY_SERIES: {
				ImagingStudySeries imagingStudySeries = (ImagingStudySeries)theEObject;
				T result = caseImagingStudySeries(imagingStudySeries);
				if (result == null) result = caseBackboneElement(imagingStudySeries);
				if (result == null) result = caseDataType(imagingStudySeries);
				if (result == null) result = caseElement(imagingStudySeries);
				if (result == null) result = caseBase(imagingStudySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY_SERIES_PERFORMER: {
				ImagingStudySeriesPerformer imagingStudySeriesPerformer = (ImagingStudySeriesPerformer)theEObject;
				T result = caseImagingStudySeriesPerformer(imagingStudySeriesPerformer);
				if (result == null) result = caseBackboneElement(imagingStudySeriesPerformer);
				if (result == null) result = caseDataType(imagingStudySeriesPerformer);
				if (result == null) result = caseElement(imagingStudySeriesPerformer);
				if (result == null) result = caseBase(imagingStudySeriesPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMAGING_STUDY_SERIES_INSTANCE: {
				ImagingStudySeriesInstance imagingStudySeriesInstance = (ImagingStudySeriesInstance)theEObject;
				T result = caseImagingStudySeriesInstance(imagingStudySeriesInstance);
				if (result == null) result = caseBackboneElement(imagingStudySeriesInstance);
				if (result == null) result = caseDataType(imagingStudySeriesInstance);
				if (result == null) result = caseElement(imagingStudySeriesInstance);
				if (result == null) result = caseBase(imagingStudySeriesInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseDomainResource(procedure);
				if (result == null) result = caseResource(procedure);
				if (result == null) result = caseBase(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCEDURE_PERFORMER: {
				ProcedurePerformer procedurePerformer = (ProcedurePerformer)theEObject;
				T result = caseProcedurePerformer(procedurePerformer);
				if (result == null) result = caseBackboneElement(procedurePerformer);
				if (result == null) result = caseDataType(procedurePerformer);
				if (result == null) result = caseElement(procedurePerformer);
				if (result == null) result = caseBase(procedurePerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PROCEDURE_FOCAL_DEVICE: {
				ProcedureFocalDevice procedureFocalDevice = (ProcedureFocalDevice)theEObject;
				T result = caseProcedureFocalDevice(procedureFocalDevice);
				if (result == null) result = caseBackboneElement(procedureFocalDevice);
				if (result == null) result = caseDataType(procedureFocalDevice);
				if (result == null) result = caseElement(procedureFocalDevice);
				if (result == null) result = caseBase(procedureFocalDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = caseDomainResource(media);
				if (result == null) result = caseResource(media);
				if (result == null) result = caseBase(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseDomainResource(communication);
				if (result == null) result = caseResource(communication);
				if (result == null) result = caseBase(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMMUNICATION_PAYLOAD: {
				CommunicationPayload communicationPayload = (CommunicationPayload)theEObject;
				T result = caseCommunicationPayload(communicationPayload);
				if (result == null) result = caseBackboneElement(communicationPayload);
				if (result == null) result = caseDataType(communicationPayload);
				if (result == null) result = caseElement(communicationPayload);
				if (result == null) result = caseBase(communicationPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE: {
				ClaimResponse claimResponse = (ClaimResponse)theEObject;
				T result = caseClaimResponse(claimResponse);
				if (result == null) result = caseDomainResource(claimResponse);
				if (result == null) result = caseResource(claimResponse);
				if (result == null) result = caseBase(claimResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ITEM: {
				ClaimResponseItem claimResponseItem = (ClaimResponseItem)theEObject;
				T result = caseClaimResponseItem(claimResponseItem);
				if (result == null) result = caseBackboneElement(claimResponseItem);
				if (result == null) result = caseDataType(claimResponseItem);
				if (result == null) result = caseElement(claimResponseItem);
				if (result == null) result = caseBase(claimResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ADJUDICATION: {
				ClaimResponseItemAdjudication claimResponseItemAdjudication = (ClaimResponseItemAdjudication)theEObject;
				T result = caseClaimResponseItemAdjudication(claimResponseItemAdjudication);
				if (result == null) result = caseBackboneElement(claimResponseItemAdjudication);
				if (result == null) result = caseDataType(claimResponseItemAdjudication);
				if (result == null) result = caseElement(claimResponseItemAdjudication);
				if (result == null) result = caseBase(claimResponseItemAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL: {
				ClaimResponseItemItemDetail claimResponseItemItemDetail = (ClaimResponseItemItemDetail)theEObject;
				T result = caseClaimResponseItemItemDetail(claimResponseItemItemDetail);
				if (result == null) result = caseBackboneElement(claimResponseItemItemDetail);
				if (result == null) result = caseDataType(claimResponseItemItemDetail);
				if (result == null) result = caseElement(claimResponseItemItemDetail);
				if (result == null) result = caseBase(claimResponseItemItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL_SUB_DETAIL: {
				ClaimResponseItemItemDetailSubDetail claimResponseItemItemDetailSubDetail = (ClaimResponseItemItemDetailSubDetail)theEObject;
				T result = caseClaimResponseItemItemDetailSubDetail(claimResponseItemItemDetailSubDetail);
				if (result == null) result = caseBackboneElement(claimResponseItemItemDetailSubDetail);
				if (result == null) result = caseDataType(claimResponseItemItemDetailSubDetail);
				if (result == null) result = caseElement(claimResponseItemItemDetailSubDetail);
				if (result == null) result = caseBase(claimResponseItemItemDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM: {
				ClaimResponseAddedItem claimResponseAddedItem = (ClaimResponseAddedItem)theEObject;
				T result = caseClaimResponseAddedItem(claimResponseAddedItem);
				if (result == null) result = caseBackboneElement(claimResponseAddedItem);
				if (result == null) result = caseDataType(claimResponseAddedItem);
				if (result == null) result = caseElement(claimResponseAddedItem);
				if (result == null) result = caseBase(claimResponseAddedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEM_DETAIL: {
				ClaimResponseAddedItemAddedItemDetail claimResponseAddedItemAddedItemDetail = (ClaimResponseAddedItemAddedItemDetail)theEObject;
				T result = caseClaimResponseAddedItemAddedItemDetail(claimResponseAddedItemAddedItemDetail);
				if (result == null) result = caseBackboneElement(claimResponseAddedItemAddedItemDetail);
				if (result == null) result = caseDataType(claimResponseAddedItemAddedItemDetail);
				if (result == null) result = caseElement(claimResponseAddedItemAddedItemDetail);
				if (result == null) result = caseBase(claimResponseAddedItemAddedItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ADDED_ITEM_ADDED_ITEM_DETAIL_ADDED_ITEM_SUB_DETAIL: {
				ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail claimResponseAddedItemAddedItemDetailAddedItemSubDetail = (ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail)theEObject;
				T result = caseClaimResponseAddedItemAddedItemDetailAddedItemSubDetail(claimResponseAddedItemAddedItemDetailAddedItemSubDetail);
				if (result == null) result = caseBackboneElement(claimResponseAddedItemAddedItemDetailAddedItemSubDetail);
				if (result == null) result = caseDataType(claimResponseAddedItemAddedItemDetailAddedItemSubDetail);
				if (result == null) result = caseElement(claimResponseAddedItemAddedItemDetailAddedItemSubDetail);
				if (result == null) result = caseBase(claimResponseAddedItemAddedItemDetailAddedItemSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_TOTAL: {
				ClaimResponseTotal claimResponseTotal = (ClaimResponseTotal)theEObject;
				T result = caseClaimResponseTotal(claimResponseTotal);
				if (result == null) result = caseBackboneElement(claimResponseTotal);
				if (result == null) result = caseDataType(claimResponseTotal);
				if (result == null) result = caseElement(claimResponseTotal);
				if (result == null) result = caseBase(claimResponseTotal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_PAYMENT: {
				ClaimResponsePayment claimResponsePayment = (ClaimResponsePayment)theEObject;
				T result = caseClaimResponsePayment(claimResponsePayment);
				if (result == null) result = caseBackboneElement(claimResponsePayment);
				if (result == null) result = caseDataType(claimResponsePayment);
				if (result == null) result = caseElement(claimResponsePayment);
				if (result == null) result = caseBase(claimResponsePayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_NOTE: {
				ClaimResponseNote claimResponseNote = (ClaimResponseNote)theEObject;
				T result = caseClaimResponseNote(claimResponseNote);
				if (result == null) result = caseBackboneElement(claimResponseNote);
				if (result == null) result = caseDataType(claimResponseNote);
				if (result == null) result = caseElement(claimResponseNote);
				if (result == null) result = caseBase(claimResponseNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_INSURANCE: {
				ClaimResponseInsurance claimResponseInsurance = (ClaimResponseInsurance)theEObject;
				T result = caseClaimResponseInsurance(claimResponseInsurance);
				if (result == null) result = caseBackboneElement(claimResponseInsurance);
				if (result == null) result = caseDataType(claimResponseInsurance);
				if (result == null) result = caseElement(claimResponseInsurance);
				if (result == null) result = caseBase(claimResponseInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RESPONSE_ERROR: {
				ClaimResponseError claimResponseError = (ClaimResponseError)theEObject;
				T result = caseClaimResponseError(claimResponseError);
				if (result == null) result = caseBackboneElement(claimResponseError);
				if (result == null) result = caseDataType(claimResponseError);
				if (result == null) result = caseElement(claimResponseError);
				if (result == null) result = caseBase(claimResponseError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseDomainResource(claim);
				if (result == null) result = caseResource(claim);
				if (result == null) result = caseBase(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_RELATED_CLAIM: {
				ClaimRelatedClaim claimRelatedClaim = (ClaimRelatedClaim)theEObject;
				T result = caseClaimRelatedClaim(claimRelatedClaim);
				if (result == null) result = caseBackboneElement(claimRelatedClaim);
				if (result == null) result = caseDataType(claimRelatedClaim);
				if (result == null) result = caseElement(claimRelatedClaim);
				if (result == null) result = caseBase(claimRelatedClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_PAYEE: {
				ClaimPayee claimPayee = (ClaimPayee)theEObject;
				T result = caseClaimPayee(claimPayee);
				if (result == null) result = caseBackboneElement(claimPayee);
				if (result == null) result = caseDataType(claimPayee);
				if (result == null) result = caseElement(claimPayee);
				if (result == null) result = caseBase(claimPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_CARE_TEAM: {
				ClaimCareTeam claimCareTeam = (ClaimCareTeam)theEObject;
				T result = caseClaimCareTeam(claimCareTeam);
				if (result == null) result = caseBackboneElement(claimCareTeam);
				if (result == null) result = caseDataType(claimCareTeam);
				if (result == null) result = caseElement(claimCareTeam);
				if (result == null) result = caseBase(claimCareTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_SUPPORTING_INFORMATION: {
				ClaimSupportingInformation claimSupportingInformation = (ClaimSupportingInformation)theEObject;
				T result = caseClaimSupportingInformation(claimSupportingInformation);
				if (result == null) result = caseBackboneElement(claimSupportingInformation);
				if (result == null) result = caseDataType(claimSupportingInformation);
				if (result == null) result = caseElement(claimSupportingInformation);
				if (result == null) result = caseBase(claimSupportingInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_DIAGNOSIS: {
				ClaimDiagnosis claimDiagnosis = (ClaimDiagnosis)theEObject;
				T result = caseClaimDiagnosis(claimDiagnosis);
				if (result == null) result = caseBackboneElement(claimDiagnosis);
				if (result == null) result = caseDataType(claimDiagnosis);
				if (result == null) result = caseElement(claimDiagnosis);
				if (result == null) result = caseBase(claimDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_PROCEDURE: {
				ClaimProcedure claimProcedure = (ClaimProcedure)theEObject;
				T result = caseClaimProcedure(claimProcedure);
				if (result == null) result = caseBackboneElement(claimProcedure);
				if (result == null) result = caseDataType(claimProcedure);
				if (result == null) result = caseElement(claimProcedure);
				if (result == null) result = caseBase(claimProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_INSURANCE: {
				ClaimInsurance claimInsurance = (ClaimInsurance)theEObject;
				T result = caseClaimInsurance(claimInsurance);
				if (result == null) result = caseBackboneElement(claimInsurance);
				if (result == null) result = caseDataType(claimInsurance);
				if (result == null) result = caseElement(claimInsurance);
				if (result == null) result = caseBase(claimInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ACCIDENT: {
				ClaimAccident claimAccident = (ClaimAccident)theEObject;
				T result = caseClaimAccident(claimAccident);
				if (result == null) result = caseBackboneElement(claimAccident);
				if (result == null) result = caseDataType(claimAccident);
				if (result == null) result = caseElement(claimAccident);
				if (result == null) result = caseBase(claimAccident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ITEM: {
				ClaimItem claimItem = (ClaimItem)theEObject;
				T result = caseClaimItem(claimItem);
				if (result == null) result = caseBackboneElement(claimItem);
				if (result == null) result = caseDataType(claimItem);
				if (result == null) result = caseElement(claimItem);
				if (result == null) result = caseBase(claimItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ITEM_DETAIL: {
				ClaimItemDetail claimItemDetail = (ClaimItemDetail)theEObject;
				T result = caseClaimItemDetail(claimItemDetail);
				if (result == null) result = caseBackboneElement(claimItemDetail);
				if (result == null) result = caseDataType(claimItemDetail);
				if (result == null) result = caseElement(claimItemDetail);
				if (result == null) result = caseBase(claimItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CLAIM_ITEM_DETAIL_SUB_DETAIL: {
				ClaimItemDetailSubDetail claimItemDetailSubDetail = (ClaimItemDetailSubDetail)theEObject;
				T result = caseClaimItemDetailSubDetail(claimItemDetailSubDetail);
				if (result == null) result = caseBackboneElement(claimItemDetailSubDetail);
				if (result == null) result = caseDataType(claimItemDetailSubDetail);
				if (result == null) result = caseElement(claimItemDetailSubDetail);
				if (result == null) result = caseBase(claimItemDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_REQUEST: {
				DeviceRequest deviceRequest = (DeviceRequest)theEObject;
				T result = caseDeviceRequest(deviceRequest);
				if (result == null) result = caseDomainResource(deviceRequest);
				if (result == null) result = caseResource(deviceRequest);
				if (result == null) result = caseBase(deviceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_REQUEST_PARAMETER: {
				DeviceRequestParameter deviceRequestParameter = (DeviceRequestParameter)theEObject;
				T result = caseDeviceRequestParameter(deviceRequestParameter);
				if (result == null) result = caseBackboneElement(deviceRequestParameter);
				if (result == null) result = caseDataType(deviceRequestParameter);
				if (result == null) result = caseElement(deviceRequestParameter);
				if (result == null) result = caseBase(deviceRequestParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMMUNICATION_REQUEST: {
				CommunicationRequest communicationRequest = (CommunicationRequest)theEObject;
				T result = caseCommunicationRequest(communicationRequest);
				if (result == null) result = caseDomainResource(communicationRequest);
				if (result == null) result = caseResource(communicationRequest);
				if (result == null) result = caseBase(communicationRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD: {
				CommunicationRequestPayload communicationRequestPayload = (CommunicationRequestPayload)theEObject;
				T result = caseCommunicationRequestPayload(communicationRequestPayload);
				if (result == null) result = caseBackboneElement(communicationRequestPayload);
				if (result == null) result = caseDataType(communicationRequestPayload);
				if (result == null) result = caseElement(communicationRequestPayload);
				if (result == null) result = caseBase(communicationRequestPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.HEALTHCARE_SERVICE: {
				HealthcareService healthcareService = (HealthcareService)theEObject;
				T result = caseHealthcareService(healthcareService);
				if (result == null) result = caseDomainResource(healthcareService);
				if (result == null) result = caseResource(healthcareService);
				if (result == null) result = caseBase(healthcareService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.HEALTHCARE_SERVICE_ELIGIBILITY: {
				HealthcareServiceEligibility healthcareServiceEligibility = (HealthcareServiceEligibility)theEObject;
				T result = caseHealthcareServiceEligibility(healthcareServiceEligibility);
				if (result == null) result = caseBackboneElement(healthcareServiceEligibility);
				if (result == null) result = caseDataType(healthcareServiceEligibility);
				if (result == null) result = caseElement(healthcareServiceEligibility);
				if (result == null) result = caseBase(healthcareServiceEligibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME: {
				HealthcareServiceAvailableTime healthcareServiceAvailableTime = (HealthcareServiceAvailableTime)theEObject;
				T result = caseHealthcareServiceAvailableTime(healthcareServiceAvailableTime);
				if (result == null) result = caseBackboneElement(healthcareServiceAvailableTime);
				if (result == null) result = caseDataType(healthcareServiceAvailableTime);
				if (result == null) result = caseElement(healthcareServiceAvailableTime);
				if (result == null) result = caseBase(healthcareServiceAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE: {
				HealthcareServiceNotAvailable healthcareServiceNotAvailable = (HealthcareServiceNotAvailable)theEObject;
				T result = caseHealthcareServiceNotAvailable(healthcareServiceNotAvailable);
				if (result == null) result = caseBackboneElement(healthcareServiceNotAvailable);
				if (result == null) result = caseDataType(healthcareServiceNotAvailable);
				if (result == null) result = caseElement(healthcareServiceNotAvailable);
				if (result == null) result = caseBase(healthcareServiceNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NAMING_SYSTEM: {
				NamingSystem namingSystem = (NamingSystem)theEObject;
				T result = caseNamingSystem(namingSystem);
				if (result == null) result = caseDomainResource(namingSystem);
				if (result == null) result = caseResource(namingSystem);
				if (result == null) result = caseBase(namingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID: {
				NamingSystemUniqueId namingSystemUniqueId = (NamingSystemUniqueId)theEObject;
				T result = caseNamingSystemUniqueId(namingSystemUniqueId);
				if (result == null) result = caseBackboneElement(namingSystemUniqueId);
				if (result == null) result = caseDataType(namingSystemUniqueId);
				if (result == null) result = caseElement(namingSystemUniqueId);
				if (result == null) result = caseBase(namingSystemUniqueId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BODY_STRUCTURE: {
				BodyStructure bodyStructure = (BodyStructure)theEObject;
				T result = caseBodyStructure(bodyStructure);
				if (result == null) result = caseDomainResource(bodyStructure);
				if (result == null) result = caseResource(bodyStructure);
				if (result == null) result = caseBase(bodyStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseDomainResource(task);
				if (result == null) result = caseResource(task);
				if (result == null) result = caseBase(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK_RESTRICTION: {
				TaskRestriction taskRestriction = (TaskRestriction)theEObject;
				T result = caseTaskRestriction(taskRestriction);
				if (result == null) result = caseBackboneElement(taskRestriction);
				if (result == null) result = caseDataType(taskRestriction);
				if (result == null) result = caseElement(taskRestriction);
				if (result == null) result = caseBase(taskRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK_PARAMETER: {
				TaskParameter taskParameter = (TaskParameter)theEObject;
				T result = caseTaskParameter(taskParameter);
				if (result == null) result = caseBackboneElement(taskParameter);
				if (result == null) result = caseDataType(taskParameter);
				if (result == null) result = caseElement(taskParameter);
				if (result == null) result = caseBase(taskParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TASK_OUTPUT: {
				TaskOutput taskOutput = (TaskOutput)theEObject;
				T result = caseTaskOutput(taskOutput);
				if (result == null) result = caseBackboneElement(taskOutput);
				if (result == null) result = caseDataType(taskOutput);
				if (result == null) result = caseElement(taskOutput);
				if (result == null) result = caseBase(taskOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE: {
				QuestionnaireResponse questionnaireResponse = (QuestionnaireResponse)theEObject;
				T result = caseQuestionnaireResponse(questionnaireResponse);
				if (result == null) result = caseDomainResource(questionnaireResponse);
				if (result == null) result = caseResource(questionnaireResponse);
				if (result == null) result = caseBase(questionnaireResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = caseDomainResource(questionnaire);
				if (result == null) result = caseResource(questionnaire);
				if (result == null) result = caseBase(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_ITEM: {
				QuestionnaireItem questionnaireItem = (QuestionnaireItem)theEObject;
				T result = caseQuestionnaireItem(questionnaireItem);
				if (result == null) result = caseBackboneElement(questionnaireItem);
				if (result == null) result = caseDataType(questionnaireItem);
				if (result == null) result = caseElement(questionnaireItem);
				if (result == null) result = caseBase(questionnaireItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN: {
				QuestionnaireItemEnableWhen questionnaireItemEnableWhen = (QuestionnaireItemEnableWhen)theEObject;
				T result = caseQuestionnaireItemEnableWhen(questionnaireItemEnableWhen);
				if (result == null) result = caseBackboneElement(questionnaireItemEnableWhen);
				if (result == null) result = caseDataType(questionnaireItemEnableWhen);
				if (result == null) result = caseElement(questionnaireItemEnableWhen);
				if (result == null) result = caseBase(questionnaireItemEnableWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION: {
				QuestionnaireItemAnswerOption questionnaireItemAnswerOption = (QuestionnaireItemAnswerOption)theEObject;
				T result = caseQuestionnaireItemAnswerOption(questionnaireItemAnswerOption);
				if (result == null) result = caseBackboneElement(questionnaireItemAnswerOption);
				if (result == null) result = caseDataType(questionnaireItemAnswerOption);
				if (result == null) result = caseElement(questionnaireItemAnswerOption);
				if (result == null) result = caseBase(questionnaireItemAnswerOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_ITEM_INITIAL: {
				QuestionnaireItemInitial questionnaireItemInitial = (QuestionnaireItemInitial)theEObject;
				T result = caseQuestionnaireItemInitial(questionnaireItemInitial);
				if (result == null) result = caseBackboneElement(questionnaireItemInitial);
				if (result == null) result = caseDataType(questionnaireItemInitial);
				if (result == null) result = caseElement(questionnaireItemInitial);
				if (result == null) result = caseBase(questionnaireItemInitial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM: {
				QuestionnaireResponseItem questionnaireResponseItem = (QuestionnaireResponseItem)theEObject;
				T result = caseQuestionnaireResponseItem(questionnaireResponseItem);
				if (result == null) result = caseBackboneElement(questionnaireResponseItem);
				if (result == null) result = caseDataType(questionnaireResponseItem);
				if (result == null) result = caseElement(questionnaireResponseItem);
				if (result == null) result = caseBase(questionnaireResponseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER: {
				QuestionnaireResponseItemAnswer questionnaireResponseItemAnswer = (QuestionnaireResponseItemAnswer)theEObject;
				T result = caseQuestionnaireResponseItemAnswer(questionnaireResponseItemAnswer);
				if (result == null) result = caseBackboneElement(questionnaireResponseItemAnswer);
				if (result == null) result = caseDataType(questionnaireResponseItemAnswer);
				if (result == null) result = caseElement(questionnaireResponseItemAnswer);
				if (result == null) result = caseBase(questionnaireResponseItemAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT: {
				ExplanationOfBenefit explanationOfBenefit = (ExplanationOfBenefit)theEObject;
				T result = caseExplanationOfBenefit(explanationOfBenefit);
				if (result == null) result = caseDomainResource(explanationOfBenefit);
				if (result == null) result = caseResource(explanationOfBenefit);
				if (result == null) result = caseBase(explanationOfBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_RELATED_CLAIM: {
				ExplanationOfBenefitRelatedClaim explanationOfBenefitRelatedClaim = (ExplanationOfBenefitRelatedClaim)theEObject;
				T result = caseExplanationOfBenefitRelatedClaim(explanationOfBenefitRelatedClaim);
				if (result == null) result = caseBackboneElement(explanationOfBenefitRelatedClaim);
				if (result == null) result = caseDataType(explanationOfBenefitRelatedClaim);
				if (result == null) result = caseElement(explanationOfBenefitRelatedClaim);
				if (result == null) result = caseBase(explanationOfBenefitRelatedClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PAYEE: {
				ExplanationOfBenefitPayee explanationOfBenefitPayee = (ExplanationOfBenefitPayee)theEObject;
				T result = caseExplanationOfBenefitPayee(explanationOfBenefitPayee);
				if (result == null) result = caseBackboneElement(explanationOfBenefitPayee);
				if (result == null) result = caseDataType(explanationOfBenefitPayee);
				if (result == null) result = caseElement(explanationOfBenefitPayee);
				if (result == null) result = caseBase(explanationOfBenefitPayee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM: {
				ExplanationOfBenefitCareTeam explanationOfBenefitCareTeam = (ExplanationOfBenefitCareTeam)theEObject;
				T result = caseExplanationOfBenefitCareTeam(explanationOfBenefitCareTeam);
				if (result == null) result = caseBackboneElement(explanationOfBenefitCareTeam);
				if (result == null) result = caseDataType(explanationOfBenefitCareTeam);
				if (result == null) result = caseElement(explanationOfBenefitCareTeam);
				if (result == null) result = caseBase(explanationOfBenefitCareTeam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_SUPPORTING_INFORMATION: {
				ExplanationOfBenefitSupportingInformation explanationOfBenefitSupportingInformation = (ExplanationOfBenefitSupportingInformation)theEObject;
				T result = caseExplanationOfBenefitSupportingInformation(explanationOfBenefitSupportingInformation);
				if (result == null) result = caseBackboneElement(explanationOfBenefitSupportingInformation);
				if (result == null) result = caseDataType(explanationOfBenefitSupportingInformation);
				if (result == null) result = caseElement(explanationOfBenefitSupportingInformation);
				if (result == null) result = caseBase(explanationOfBenefitSupportingInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS: {
				ExplanationOfBenefitDiagnosis explanationOfBenefitDiagnosis = (ExplanationOfBenefitDiagnosis)theEObject;
				T result = caseExplanationOfBenefitDiagnosis(explanationOfBenefitDiagnosis);
				if (result == null) result = caseBackboneElement(explanationOfBenefitDiagnosis);
				if (result == null) result = caseDataType(explanationOfBenefitDiagnosis);
				if (result == null) result = caseElement(explanationOfBenefitDiagnosis);
				if (result == null) result = caseBase(explanationOfBenefitDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE: {
				ExplanationOfBenefitProcedure explanationOfBenefitProcedure = (ExplanationOfBenefitProcedure)theEObject;
				T result = caseExplanationOfBenefitProcedure(explanationOfBenefitProcedure);
				if (result == null) result = caseBackboneElement(explanationOfBenefitProcedure);
				if (result == null) result = caseDataType(explanationOfBenefitProcedure);
				if (result == null) result = caseElement(explanationOfBenefitProcedure);
				if (result == null) result = caseBase(explanationOfBenefitProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_INSURANCE: {
				ExplanationOfBenefitInsurance explanationOfBenefitInsurance = (ExplanationOfBenefitInsurance)theEObject;
				T result = caseExplanationOfBenefitInsurance(explanationOfBenefitInsurance);
				if (result == null) result = caseBackboneElement(explanationOfBenefitInsurance);
				if (result == null) result = caseDataType(explanationOfBenefitInsurance);
				if (result == null) result = caseElement(explanationOfBenefitInsurance);
				if (result == null) result = caseBase(explanationOfBenefitInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ACCIDENT: {
				ExplanationOfBenefitAccident explanationOfBenefitAccident = (ExplanationOfBenefitAccident)theEObject;
				T result = caseExplanationOfBenefitAccident(explanationOfBenefitAccident);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAccident);
				if (result == null) result = caseDataType(explanationOfBenefitAccident);
				if (result == null) result = caseElement(explanationOfBenefitAccident);
				if (result == null) result = caseBase(explanationOfBenefitAccident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM: {
				ExplanationOfBenefitItem explanationOfBenefitItem = (ExplanationOfBenefitItem)theEObject;
				T result = caseExplanationOfBenefitItem(explanationOfBenefitItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItem);
				if (result == null) result = caseDataType(explanationOfBenefitItem);
				if (result == null) result = caseElement(explanationOfBenefitItem);
				if (result == null) result = caseBase(explanationOfBenefitItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_ADJUDICATION: {
				ExplanationOfBenefitItemAdjudication explanationOfBenefitItemAdjudication = (ExplanationOfBenefitItemAdjudication)theEObject;
				T result = caseExplanationOfBenefitItemAdjudication(explanationOfBenefitItemAdjudication);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemAdjudication);
				if (result == null) result = caseDataType(explanationOfBenefitItemAdjudication);
				if (result == null) result = caseElement(explanationOfBenefitItemAdjudication);
				if (result == null) result = caseBase(explanationOfBenefitItemAdjudication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL: {
				ExplanationOfBenefitItemDetail explanationOfBenefitItemDetail = (ExplanationOfBenefitItemDetail)theEObject;
				T result = caseExplanationOfBenefitItemDetail(explanationOfBenefitItemDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemDetail);
				if (result == null) result = caseDataType(explanationOfBenefitItemDetail);
				if (result == null) result = caseElement(explanationOfBenefitItemDetail);
				if (result == null) result = caseBase(explanationOfBenefitItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ITEM_DETAIL_SUB_DETAIL: {
				ExplanationOfBenefitItemDetailSubDetail explanationOfBenefitItemDetailSubDetail = (ExplanationOfBenefitItemDetailSubDetail)theEObject;
				T result = caseExplanationOfBenefitItemDetailSubDetail(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = caseDataType(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = caseElement(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = caseBase(explanationOfBenefitItemDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM: {
				ExplanationOfBenefitAddedItem explanationOfBenefitAddedItem = (ExplanationOfBenefitAddedItem)theEObject;
				T result = caseExplanationOfBenefitAddedItem(explanationOfBenefitAddedItem);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItem);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItem);
				if (result == null) result = caseElement(explanationOfBenefitAddedItem);
				if (result == null) result = caseBase(explanationOfBenefitAddedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL: {
				ExplanationOfBenefitAddedItemAddedItemDetail explanationOfBenefitAddedItemAddedItemDetail = (ExplanationOfBenefitAddedItemAddedItemDetail)theEObject;
				T result = caseExplanationOfBenefitAddedItemAddedItemDetail(explanationOfBenefitAddedItemAddedItemDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItemAddedItemDetail);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItemAddedItemDetail);
				if (result == null) result = caseElement(explanationOfBenefitAddedItemAddedItemDetail);
				if (result == null) result = caseBase(explanationOfBenefitAddedItemAddedItemDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_ADDED_ITEM_ADDED_ITEM_DETAIL_ADDED_ITEM_DETAIL_SUB_DETAIL: {
				ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail explanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail = (ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail)theEObject;
				T result = caseExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail(explanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail);
				if (result == null) result = caseBackboneElement(explanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail);
				if (result == null) result = caseDataType(explanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail);
				if (result == null) result = caseElement(explanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail);
				if (result == null) result = caseBase(explanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_TOTAL: {
				ExplanationOfBenefitTotal explanationOfBenefitTotal = (ExplanationOfBenefitTotal)theEObject;
				T result = caseExplanationOfBenefitTotal(explanationOfBenefitTotal);
				if (result == null) result = caseBackboneElement(explanationOfBenefitTotal);
				if (result == null) result = caseDataType(explanationOfBenefitTotal);
				if (result == null) result = caseElement(explanationOfBenefitTotal);
				if (result == null) result = caseBase(explanationOfBenefitTotal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PAYMENT: {
				ExplanationOfBenefitPayment explanationOfBenefitPayment = (ExplanationOfBenefitPayment)theEObject;
				T result = caseExplanationOfBenefitPayment(explanationOfBenefitPayment);
				if (result == null) result = caseBackboneElement(explanationOfBenefitPayment);
				if (result == null) result = caseDataType(explanationOfBenefitPayment);
				if (result == null) result = caseElement(explanationOfBenefitPayment);
				if (result == null) result = caseBase(explanationOfBenefitPayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_NOTE: {
				ExplanationOfBenefitNote explanationOfBenefitNote = (ExplanationOfBenefitNote)theEObject;
				T result = caseExplanationOfBenefitNote(explanationOfBenefitNote);
				if (result == null) result = caseBackboneElement(explanationOfBenefitNote);
				if (result == null) result = caseDataType(explanationOfBenefitNote);
				if (result == null) result = caseElement(explanationOfBenefitNote);
				if (result == null) result = caseBase(explanationOfBenefitNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE: {
				ExplanationOfBenefitBenefitBalance explanationOfBenefitBenefitBalance = (ExplanationOfBenefitBenefitBalance)theEObject;
				T result = caseExplanationOfBenefitBenefitBalance(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseBackboneElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseDataType(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseElement(explanationOfBenefitBenefitBalance);
				if (result == null) result = caseBase(explanationOfBenefitBenefitBalance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE_BENEFIT: {
				ExplanationOfBenefitBenefitBalanceBenefit explanationOfBenefitBenefitBalanceBenefit = (ExplanationOfBenefitBenefitBalanceBenefit)theEObject;
				T result = caseExplanationOfBenefitBenefitBalanceBenefit(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseBackboneElement(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseDataType(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseElement(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = caseBase(explanationOfBenefitBenefitBalanceBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP: {
				ConceptMap conceptMap = (ConceptMap)theEObject;
				T result = caseConceptMap(conceptMap);
				if (result == null) result = caseDomainResource(conceptMap);
				if (result == null) result = caseResource(conceptMap);
				if (result == null) result = caseBase(conceptMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP: {
				ConceptMapGroup conceptMapGroup = (ConceptMapGroup)theEObject;
				T result = caseConceptMapGroup(conceptMapGroup);
				if (result == null) result = caseBackboneElement(conceptMapGroup);
				if (result == null) result = caseDataType(conceptMapGroup);
				if (result == null) result = caseElement(conceptMapGroup);
				if (result == null) result = caseBase(conceptMapGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT: {
				ConceptMapGroupSourceElement conceptMapGroupSourceElement = (ConceptMapGroupSourceElement)theEObject;
				T result = caseConceptMapGroupSourceElement(conceptMapGroupSourceElement);
				if (result == null) result = caseBackboneElement(conceptMapGroupSourceElement);
				if (result == null) result = caseDataType(conceptMapGroupSourceElement);
				if (result == null) result = caseElement(conceptMapGroupSourceElement);
				if (result == null) result = caseBase(conceptMapGroupSourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT: {
				ConceptMapGroupSourceElementTargetElement conceptMapGroupSourceElementTargetElement = (ConceptMapGroupSourceElementTargetElement)theEObject;
				T result = caseConceptMapGroupSourceElementTargetElement(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = caseBackboneElement(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = caseDataType(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = caseElement(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = caseBase(conceptMapGroupSourceElementTargetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT_OTHER_ELEMENT: {
				ConceptMapGroupSourceElementTargetElementOtherElement conceptMapGroupSourceElementTargetElementOtherElement = (ConceptMapGroupSourceElementTargetElementOtherElement)theEObject;
				T result = caseConceptMapGroupSourceElementTargetElementOtherElement(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = caseBackboneElement(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = caseDataType(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = caseElement(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = caseBase(conceptMapGroupSourceElementTargetElementOtherElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM: {
				CodeSystem codeSystem = (CodeSystem)theEObject;
				T result = caseCodeSystem(codeSystem);
				if (result == null) result = caseDomainResource(codeSystem);
				if (result == null) result = caseResource(codeSystem);
				if (result == null) result = caseBase(codeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_FILTER: {
				CodeSystemFilter codeSystemFilter = (CodeSystemFilter)theEObject;
				T result = caseCodeSystemFilter(codeSystemFilter);
				if (result == null) result = caseBackboneElement(codeSystemFilter);
				if (result == null) result = caseDataType(codeSystemFilter);
				if (result == null) result = caseElement(codeSystemFilter);
				if (result == null) result = caseBase(codeSystemFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_PROPERTY: {
				CodeSystemProperty codeSystemProperty = (CodeSystemProperty)theEObject;
				T result = caseCodeSystemProperty(codeSystemProperty);
				if (result == null) result = caseBackboneElement(codeSystemProperty);
				if (result == null) result = caseDataType(codeSystemProperty);
				if (result == null) result = caseElement(codeSystemProperty);
				if (result == null) result = caseBase(codeSystemProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION: {
				CodeSystemConceptDefinition codeSystemConceptDefinition = (CodeSystemConceptDefinition)theEObject;
				T result = caseCodeSystemConceptDefinition(codeSystemConceptDefinition);
				if (result == null) result = caseBackboneElement(codeSystemConceptDefinition);
				if (result == null) result = caseDataType(codeSystemConceptDefinition);
				if (result == null) result = caseElement(codeSystemConceptDefinition);
				if (result == null) result = caseBase(codeSystemConceptDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_DESIGNATION: {
				CodeSystemConceptDefinitionDesignation codeSystemConceptDefinitionDesignation = (CodeSystemConceptDefinitionDesignation)theEObject;
				T result = caseCodeSystemConceptDefinitionDesignation(codeSystemConceptDefinitionDesignation);
				if (result == null) result = caseBackboneElement(codeSystemConceptDefinitionDesignation);
				if (result == null) result = caseDataType(codeSystemConceptDefinitionDesignation);
				if (result == null) result = caseElement(codeSystemConceptDefinitionDesignation);
				if (result == null) result = caseBase(codeSystemConceptDefinitionDesignation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CODE_SYSTEM_CONCEPT_DEFINITION_CONCEPT_PROPERTY: {
				CodeSystemConceptDefinitionConceptProperty codeSystemConceptDefinitionConceptProperty = (CodeSystemConceptDefinitionConceptProperty)theEObject;
				T result = caseCodeSystemConceptDefinitionConceptProperty(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = caseBackboneElement(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = caseDataType(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = caseElement(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = caseBase(codeSystemConceptDefinitionConceptProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CONCEPT_MAP_GROUP_UNMAPPED: {
				ConceptMapGroupUnmapped conceptMapGroupUnmapped = (ConceptMapGroupUnmapped)theEObject;
				T result = caseConceptMapGroupUnmapped(conceptMapGroupUnmapped);
				if (result == null) result = caseBackboneElement(conceptMapGroupUnmapped);
				if (result == null) result = caseDataType(conceptMapGroupUnmapped);
				if (result == null) result = caseElement(conceptMapGroupUnmapped);
				if (result == null) result = caseBase(conceptMapGroupUnmapped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REQUEST_GROUP: {
				RequestGroup requestGroup = (RequestGroup)theEObject;
				T result = caseRequestGroup(requestGroup);
				if (result == null) result = caseDomainResource(requestGroup);
				if (result == null) result = caseResource(requestGroup);
				if (result == null) result = caseBase(requestGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REQUEST_GROUP_ACTION: {
				RequestGroupAction requestGroupAction = (RequestGroupAction)theEObject;
				T result = caseRequestGroupAction(requestGroupAction);
				if (result == null) result = caseBackboneElement(requestGroupAction);
				if (result == null) result = caseDataType(requestGroupAction);
				if (result == null) result = caseElement(requestGroupAction);
				if (result == null) result = caseBase(requestGroupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REQUEST_GROUP_ACTION_CONDITION: {
				RequestGroupActionCondition requestGroupActionCondition = (RequestGroupActionCondition)theEObject;
				T result = caseRequestGroupActionCondition(requestGroupActionCondition);
				if (result == null) result = caseBackboneElement(requestGroupActionCondition);
				if (result == null) result = caseDataType(requestGroupActionCondition);
				if (result == null) result = caseElement(requestGroupActionCondition);
				if (result == null) result = caseBase(requestGroupActionCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION: {
				RequestGroupActionRelatedAction requestGroupActionRelatedAction = (RequestGroupActionRelatedAction)theEObject;
				T result = caseRequestGroupActionRelatedAction(requestGroupActionRelatedAction);
				if (result == null) result = caseBackboneElement(requestGroupActionRelatedAction);
				if (result == null) result = caseDataType(requestGroupActionRelatedAction);
				if (result == null) result = caseElement(requestGroupActionRelatedAction);
				if (result == null) result = caseBase(requestGroupActionRelatedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES: {
				TerminologyCapabilities terminologyCapabilities = (TerminologyCapabilities)theEObject;
				T result = caseTerminologyCapabilities(terminologyCapabilities);
				if (result == null) result = caseDomainResource(terminologyCapabilities);
				if (result == null) result = caseResource(terminologyCapabilities);
				if (result == null) result = caseBase(terminologyCapabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_SOFTWARE: {
				TerminologyCapabilitiesSoftware terminologyCapabilitiesSoftware = (TerminologyCapabilitiesSoftware)theEObject;
				T result = caseTerminologyCapabilitiesSoftware(terminologyCapabilitiesSoftware);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesSoftware);
				if (result == null) result = caseDataType(terminologyCapabilitiesSoftware);
				if (result == null) result = caseElement(terminologyCapabilitiesSoftware);
				if (result == null) result = caseBase(terminologyCapabilitiesSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_IMPLEMENTATION: {
				TerminologyCapabilitiesImplementation terminologyCapabilitiesImplementation = (TerminologyCapabilitiesImplementation)theEObject;
				T result = caseTerminologyCapabilitiesImplementation(terminologyCapabilitiesImplementation);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesImplementation);
				if (result == null) result = caseDataType(terminologyCapabilitiesImplementation);
				if (result == null) result = caseElement(terminologyCapabilitiesImplementation);
				if (result == null) result = caseBase(terminologyCapabilitiesImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM: {
				TerminologyCapabilitiesCodeSystem terminologyCapabilitiesCodeSystem = (TerminologyCapabilitiesCodeSystem)theEObject;
				T result = caseTerminologyCapabilitiesCodeSystem(terminologyCapabilitiesCodeSystem);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesCodeSystem);
				if (result == null) result = caseDataType(terminologyCapabilitiesCodeSystem);
				if (result == null) result = caseElement(terminologyCapabilitiesCodeSystem);
				if (result == null) result = caseBase(terminologyCapabilitiesCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION: {
				TerminologyCapabilitiesCodeSystemVersion terminologyCapabilitiesCodeSystemVersion = (TerminologyCapabilitiesCodeSystemVersion)theEObject;
				T result = caseTerminologyCapabilitiesCodeSystemVersion(terminologyCapabilitiesCodeSystemVersion);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesCodeSystemVersion);
				if (result == null) result = caseDataType(terminologyCapabilitiesCodeSystemVersion);
				if (result == null) result = caseElement(terminologyCapabilitiesCodeSystemVersion);
				if (result == null) result = caseBase(terminologyCapabilitiesCodeSystemVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM_VERSION_FILTER: {
				TerminologyCapabilitiesCodeSystemVersionFilter terminologyCapabilitiesCodeSystemVersionFilter = (TerminologyCapabilitiesCodeSystemVersionFilter)theEObject;
				T result = caseTerminologyCapabilitiesCodeSystemVersionFilter(terminologyCapabilitiesCodeSystemVersionFilter);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesCodeSystemVersionFilter);
				if (result == null) result = caseDataType(terminologyCapabilitiesCodeSystemVersionFilter);
				if (result == null) result = caseElement(terminologyCapabilitiesCodeSystemVersionFilter);
				if (result == null) result = caseBase(terminologyCapabilitiesCodeSystemVersionFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION: {
				TerminologyCapabilitiesExpansion terminologyCapabilitiesExpansion = (TerminologyCapabilitiesExpansion)theEObject;
				T result = caseTerminologyCapabilitiesExpansion(terminologyCapabilitiesExpansion);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesExpansion);
				if (result == null) result = caseDataType(terminologyCapabilitiesExpansion);
				if (result == null) result = caseElement(terminologyCapabilitiesExpansion);
				if (result == null) result = caseBase(terminologyCapabilitiesExpansion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_EXPANSION_PARAMETER: {
				TerminologyCapabilitiesExpansionParameter terminologyCapabilitiesExpansionParameter = (TerminologyCapabilitiesExpansionParameter)theEObject;
				T result = caseTerminologyCapabilitiesExpansionParameter(terminologyCapabilitiesExpansionParameter);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesExpansionParameter);
				if (result == null) result = caseDataType(terminologyCapabilitiesExpansionParameter);
				if (result == null) result = caseElement(terminologyCapabilitiesExpansionParameter);
				if (result == null) result = caseBase(terminologyCapabilitiesExpansionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_VALIDATE_CODE: {
				TerminologyCapabilitiesValidateCode terminologyCapabilitiesValidateCode = (TerminologyCapabilitiesValidateCode)theEObject;
				T result = caseTerminologyCapabilitiesValidateCode(terminologyCapabilitiesValidateCode);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesValidateCode);
				if (result == null) result = caseDataType(terminologyCapabilitiesValidateCode);
				if (result == null) result = caseElement(terminologyCapabilitiesValidateCode);
				if (result == null) result = caseBase(terminologyCapabilitiesValidateCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION: {
				TerminologyCapabilitiesTranslation terminologyCapabilitiesTranslation = (TerminologyCapabilitiesTranslation)theEObject;
				T result = caseTerminologyCapabilitiesTranslation(terminologyCapabilitiesTranslation);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesTranslation);
				if (result == null) result = caseDataType(terminologyCapabilitiesTranslation);
				if (result == null) result = caseElement(terminologyCapabilitiesTranslation);
				if (result == null) result = caseBase(terminologyCapabilitiesTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CLOSURE: {
				TerminologyCapabilitiesClosure terminologyCapabilitiesClosure = (TerminologyCapabilitiesClosure)theEObject;
				T result = caseTerminologyCapabilitiesClosure(terminologyCapabilitiesClosure);
				if (result == null) result = caseBackboneElement(terminologyCapabilitiesClosure);
				if (result == null) result = caseDataType(terminologyCapabilitiesClosure);
				if (result == null) result = caseElement(terminologyCapabilitiesClosure);
				if (result == null) result = caseBase(terminologyCapabilitiesClosure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_METRIC: {
				DeviceMetric deviceMetric = (DeviceMetric)theEObject;
				T result = caseDeviceMetric(deviceMetric);
				if (result == null) result = caseDomainResource(deviceMetric);
				if (result == null) result = caseResource(deviceMetric);
				if (result == null) result = caseBase(deviceMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_METRIC_CALIBRATION: {
				DeviceMetricCalibration deviceMetricCalibration = (DeviceMetricCalibration)theEObject;
				T result = caseDeviceMetricCalibration(deviceMetricCalibration);
				if (result == null) result = caseBackboneElement(deviceMetricCalibration);
				if (result == null) result = caseDataType(deviceMetricCalibration);
				if (result == null) result = caseElement(deviceMetricCalibration);
				if (result == null) result = caseBase(deviceMetricCalibration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.FLAG: {
				Flag flag = (Flag)theEObject;
				T result = caseFlag(flag);
				if (result == null) result = caseDomainResource(flag);
				if (result == null) result = caseResource(flag);
				if (result == null) result = caseBase(flag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_EVALUATION: {
				ImmunizationEvaluation immunizationEvaluation = (ImmunizationEvaluation)theEObject;
				T result = caseImmunizationEvaluation(immunizationEvaluation);
				if (result == null) result = caseDomainResource(immunizationEvaluation);
				if (result == null) result = caseResource(immunizationEvaluation);
				if (result == null) result = caseBase(immunizationEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION: {
				Immunization immunization = (Immunization)theEObject;
				T result = caseImmunization(immunization);
				if (result == null) result = caseDomainResource(immunization);
				if (result == null) result = caseResource(immunization);
				if (result == null) result = caseBase(immunization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_PERFORMER: {
				ImmunizationPerformer immunizationPerformer = (ImmunizationPerformer)theEObject;
				T result = caseImmunizationPerformer(immunizationPerformer);
				if (result == null) result = caseBackboneElement(immunizationPerformer);
				if (result == null) result = caseDataType(immunizationPerformer);
				if (result == null) result = caseElement(immunizationPerformer);
				if (result == null) result = caseBase(immunizationPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_EDUCATION: {
				ImmunizationEducation immunizationEducation = (ImmunizationEducation)theEObject;
				T result = caseImmunizationEducation(immunizationEducation);
				if (result == null) result = caseBackboneElement(immunizationEducation);
				if (result == null) result = caseDataType(immunizationEducation);
				if (result == null) result = caseElement(immunizationEducation);
				if (result == null) result = caseBase(immunizationEducation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_REACTION: {
				ImmunizationReaction immunizationReaction = (ImmunizationReaction)theEObject;
				T result = caseImmunizationReaction(immunizationReaction);
				if (result == null) result = caseBackboneElement(immunizationReaction);
				if (result == null) result = caseDataType(immunizationReaction);
				if (result == null) result = caseElement(immunizationReaction);
				if (result == null) result = caseBase(immunizationReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED: {
				ImmunizationProtocolApplied immunizationProtocolApplied = (ImmunizationProtocolApplied)theEObject;
				T result = caseImmunizationProtocolApplied(immunizationProtocolApplied);
				if (result == null) result = caseBackboneElement(immunizationProtocolApplied);
				if (result == null) result = caseDataType(immunizationProtocolApplied);
				if (result == null) result = caseElement(immunizationProtocolApplied);
				if (result == null) result = caseBase(immunizationProtocolApplied);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION: {
				MedicinalProductIndication medicinalProductIndication = (MedicinalProductIndication)theEObject;
				T result = caseMedicinalProductIndication(medicinalProductIndication);
				if (result == null) result = caseDomainResource(medicinalProductIndication);
				if (result == null) result = caseResource(medicinalProductIndication);
				if (result == null) result = caseBase(medicinalProductIndication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION_OTHER_THERAPY: {
				MedicinalProductIndicationOtherTherapy medicinalProductIndicationOtherTherapy = (MedicinalProductIndicationOtherTherapy)theEObject;
				T result = caseMedicinalProductIndicationOtherTherapy(medicinalProductIndicationOtherTherapy);
				if (result == null) result = caseBackboneElement(medicinalProductIndicationOtherTherapy);
				if (result == null) result = caseDataType(medicinalProductIndicationOtherTherapy);
				if (result == null) result = caseElement(medicinalProductIndicationOtherTherapy);
				if (result == null) result = caseBase(medicinalProductIndicationOtherTherapy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT: {
				MedicinalProductUndesirableEffect medicinalProductUndesirableEffect = (MedicinalProductUndesirableEffect)theEObject;
				T result = caseMedicinalProductUndesirableEffect(medicinalProductUndesirableEffect);
				if (result == null) result = caseDomainResource(medicinalProductUndesirableEffect);
				if (result == null) result = caseResource(medicinalProductUndesirableEffect);
				if (result == null) result = caseBase(medicinalProductUndesirableEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseResource(binary);
				if (result == null) result = caseBase(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_MANIFEST: {
				DocumentManifest documentManifest = (DocumentManifest)theEObject;
				T result = caseDocumentManifest(documentManifest);
				if (result == null) result = caseDomainResource(documentManifest);
				if (result == null) result = caseResource(documentManifest);
				if (result == null) result = caseBase(documentManifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DOCUMENT_MANIFEST_RELATED: {
				DocumentManifestRelated documentManifestRelated = (DocumentManifestRelated)theEObject;
				T result = caseDocumentManifestRelated(documentManifestRelated);
				if (result == null) result = caseBackboneElement(documentManifestRelated);
				if (result == null) result = caseDataType(documentManifestRelated);
				if (result == null) result = caseElement(documentManifestRelated);
				if (result == null) result = caseBase(documentManifestRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GUIDANCE_RESPONSE: {
				GuidanceResponse guidanceResponse = (GuidanceResponse)theEObject;
				T result = caseGuidanceResponse(guidanceResponse);
				if (result == null) result = caseDomainResource(guidanceResponse);
				if (result == null) result = caseResource(guidanceResponse);
				if (result == null) result = caseBase(guidanceResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_OUTCOME: {
				OperationOutcome operationOutcome = (OperationOutcome)theEObject;
				T result = caseOperationOutcome(operationOutcome);
				if (result == null) result = caseDomainResource(operationOutcome);
				if (result == null) result = caseResource(operationOutcome);
				if (result == null) result = caseBase(operationOutcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE: {
				OperationOutcomeIssue operationOutcomeIssue = (OperationOutcomeIssue)theEObject;
				T result = caseOperationOutcomeIssue(operationOutcomeIssue);
				if (result == null) result = caseBackboneElement(operationOutcomeIssue);
				if (result == null) result = caseDataType(operationOutcomeIssue);
				if (result == null) result = caseElement(operationOutcomeIssue);
				if (result == null) result = caseBase(operationOutcomeIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PARAMETERS: {
				Parameters parameters = (Parameters)theEObject;
				T result = caseParameters(parameters);
				if (result == null) result = caseResource(parameters);
				if (result == null) result = caseBase(parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PARAMETERS_PARAMETER: {
				ParametersParameter parametersParameter = (ParametersParameter)theEObject;
				T result = caseParametersParameter(parametersParameter);
				if (result == null) result = caseBackboneElement(parametersParameter);
				if (result == null) result = caseDataType(parametersParameter);
				if (result == null) result = caseElement(parametersParameter);
				if (result == null) result = caseBase(parametersParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE: {
				ImplementationGuide implementationGuide = (ImplementationGuide)theEObject;
				T result = caseImplementationGuide(implementationGuide);
				if (result == null) result = caseDomainResource(implementationGuide);
				if (result == null) result = caseResource(implementationGuide);
				if (result == null) result = caseBase(implementationGuide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEPENDS_ON: {
				ImplementationGuideDependsOn implementationGuideDependsOn = (ImplementationGuideDependsOn)theEObject;
				T result = caseImplementationGuideDependsOn(implementationGuideDependsOn);
				if (result == null) result = caseBackboneElement(implementationGuideDependsOn);
				if (result == null) result = caseDataType(implementationGuideDependsOn);
				if (result == null) result = caseElement(implementationGuideDependsOn);
				if (result == null) result = caseBase(implementationGuideDependsOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_GLOBAL: {
				ImplementationGuideGlobal implementationGuideGlobal = (ImplementationGuideGlobal)theEObject;
				T result = caseImplementationGuideGlobal(implementationGuideGlobal);
				if (result == null) result = caseBackboneElement(implementationGuideGlobal);
				if (result == null) result = caseDataType(implementationGuideGlobal);
				if (result == null) result = caseElement(implementationGuideGlobal);
				if (result == null) result = caseBase(implementationGuideGlobal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION: {
				ImplementationGuideDefinition implementationGuideDefinition = (ImplementationGuideDefinition)theEObject;
				T result = caseImplementationGuideDefinition(implementationGuideDefinition);
				if (result == null) result = caseBackboneElement(implementationGuideDefinition);
				if (result == null) result = caseDataType(implementationGuideDefinition);
				if (result == null) result = caseElement(implementationGuideDefinition);
				if (result == null) result = caseBase(implementationGuideDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_GROUPING: {
				ImplementationGuideDefinitionGrouping implementationGuideDefinitionGrouping = (ImplementationGuideDefinitionGrouping)theEObject;
				T result = caseImplementationGuideDefinitionGrouping(implementationGuideDefinitionGrouping);
				if (result == null) result = caseBackboneElement(implementationGuideDefinitionGrouping);
				if (result == null) result = caseDataType(implementationGuideDefinitionGrouping);
				if (result == null) result = caseElement(implementationGuideDefinitionGrouping);
				if (result == null) result = caseBase(implementationGuideDefinitionGrouping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_RESOURCE: {
				ImplementationGuideDefinitionResource implementationGuideDefinitionResource = (ImplementationGuideDefinitionResource)theEObject;
				T result = caseImplementationGuideDefinitionResource(implementationGuideDefinitionResource);
				if (result == null) result = caseBackboneElement(implementationGuideDefinitionResource);
				if (result == null) result = caseDataType(implementationGuideDefinitionResource);
				if (result == null) result = caseElement(implementationGuideDefinitionResource);
				if (result == null) result = caseBase(implementationGuideDefinitionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PAGE: {
				ImplementationGuideDefinitionPage implementationGuideDefinitionPage = (ImplementationGuideDefinitionPage)theEObject;
				T result = caseImplementationGuideDefinitionPage(implementationGuideDefinitionPage);
				if (result == null) result = caseBackboneElement(implementationGuideDefinitionPage);
				if (result == null) result = caseDataType(implementationGuideDefinitionPage);
				if (result == null) result = caseElement(implementationGuideDefinitionPage);
				if (result == null) result = caseBase(implementationGuideDefinitionPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_PARAMETER: {
				ImplementationGuideDefinitionParameter implementationGuideDefinitionParameter = (ImplementationGuideDefinitionParameter)theEObject;
				T result = caseImplementationGuideDefinitionParameter(implementationGuideDefinitionParameter);
				if (result == null) result = caseBackboneElement(implementationGuideDefinitionParameter);
				if (result == null) result = caseDataType(implementationGuideDefinitionParameter);
				if (result == null) result = caseElement(implementationGuideDefinitionParameter);
				if (result == null) result = caseBase(implementationGuideDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_DEFINITION_TEMPLATE: {
				ImplementationGuideDefinitionTemplate implementationGuideDefinitionTemplate = (ImplementationGuideDefinitionTemplate)theEObject;
				T result = caseImplementationGuideDefinitionTemplate(implementationGuideDefinitionTemplate);
				if (result == null) result = caseBackboneElement(implementationGuideDefinitionTemplate);
				if (result == null) result = caseDataType(implementationGuideDefinitionTemplate);
				if (result == null) result = caseElement(implementationGuideDefinitionTemplate);
				if (result == null) result = caseBase(implementationGuideDefinitionTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST: {
				ImplementationGuideManifest implementationGuideManifest = (ImplementationGuideManifest)theEObject;
				T result = caseImplementationGuideManifest(implementationGuideManifest);
				if (result == null) result = caseBackboneElement(implementationGuideManifest);
				if (result == null) result = caseDataType(implementationGuideManifest);
				if (result == null) result = caseElement(implementationGuideManifest);
				if (result == null) result = caseBase(implementationGuideManifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_RESOURCE: {
				ImplementationGuideManifestManifestResource implementationGuideManifestManifestResource = (ImplementationGuideManifestManifestResource)theEObject;
				T result = caseImplementationGuideManifestManifestResource(implementationGuideManifestManifestResource);
				if (result == null) result = caseBackboneElement(implementationGuideManifestManifestResource);
				if (result == null) result = caseDataType(implementationGuideManifestManifestResource);
				if (result == null) result = caseElement(implementationGuideManifestManifestResource);
				if (result == null) result = caseBase(implementationGuideManifestManifestResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMPLEMENTATION_GUIDE_MANIFEST_MANIFEST_PAGE: {
				ImplementationGuideManifestManifestPage implementationGuideManifestManifestPage = (ImplementationGuideManifestManifestPage)theEObject;
				T result = caseImplementationGuideManifestManifestPage(implementationGuideManifestManifestPage);
				if (result == null) result = caseBackboneElement(implementationGuideManifestManifestPage);
				if (result == null) result = caseDataType(implementationGuideManifestManifestPage);
				if (result == null) result = caseElement(implementationGuideManifestManifestPage);
				if (result == null) result = caseBase(implementationGuideManifestManifestPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEARCH_PARAMETER: {
				SearchParameter searchParameter = (SearchParameter)theEObject;
				T result = caseSearchParameter(searchParameter);
				if (result == null) result = caseDomainResource(searchParameter);
				if (result == null) result = caseResource(searchParameter);
				if (result == null) result = caseBase(searchParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SEARCH_PARAMETER_COMPONENT: {
				SearchParameterComponent searchParameterComponent = (SearchParameterComponent)theEObject;
				T result = caseSearchParameterComponent(searchParameterComponent);
				if (result == null) result = caseBackboneElement(searchParameterComponent);
				if (result == null) result = caseDataType(searchParameterComponent);
				if (result == null) result = caseElement(searchParameterComponent);
				if (result == null) result = caseBase(searchParameterComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION: {
				OperationDefinition operationDefinition = (OperationDefinition)theEObject;
				T result = caseOperationDefinition(operationDefinition);
				if (result == null) result = caseDomainResource(operationDefinition);
				if (result == null) result = caseResource(operationDefinition);
				if (result == null) result = caseBase(operationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER: {
				OperationDefinitionParameter operationDefinitionParameter = (OperationDefinitionParameter)theEObject;
				T result = caseOperationDefinitionParameter(operationDefinitionParameter);
				if (result == null) result = caseBackboneElement(operationDefinitionParameter);
				if (result == null) result = caseDataType(operationDefinitionParameter);
				if (result == null) result = caseElement(operationDefinitionParameter);
				if (result == null) result = caseBase(operationDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_BINDING: {
				OperationDefinitionParameterBinding operationDefinitionParameterBinding = (OperationDefinitionParameterBinding)theEObject;
				T result = caseOperationDefinitionParameterBinding(operationDefinitionParameterBinding);
				if (result == null) result = caseBackboneElement(operationDefinitionParameterBinding);
				if (result == null) result = caseDataType(operationDefinitionParameterBinding);
				if (result == null) result = caseElement(operationDefinitionParameterBinding);
				if (result == null) result = caseBase(operationDefinitionParameterBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM: {
				OperationDefinitionParameterReferencedFrom operationDefinitionParameterReferencedFrom = (OperationDefinitionParameterReferencedFrom)theEObject;
				T result = caseOperationDefinitionParameterReferencedFrom(operationDefinitionParameterReferencedFrom);
				if (result == null) result = caseBackboneElement(operationDefinitionParameterReferencedFrom);
				if (result == null) result = caseDataType(operationDefinitionParameterReferencedFrom);
				if (result == null) result = caseElement(operationDefinitionParameterReferencedFrom);
				if (result == null) result = caseBase(operationDefinitionParameterReferencedFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.OPERATION_DEFINITION_OVERLOAD: {
				OperationDefinitionOverload operationDefinitionOverload = (OperationDefinitionOverload)theEObject;
				T result = caseOperationDefinitionOverload(operationDefinitionOverload);
				if (result == null) result = caseBackboneElement(operationDefinitionOverload);
				if (result == null) result = caseDataType(operationDefinitionOverload);
				if (result == null) result = caseElement(operationDefinitionOverload);
				if (result == null) result = caseBase(operationDefinitionOverload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PAYMENT_RECONCILIATION: {
				PaymentReconciliation paymentReconciliation = (PaymentReconciliation)theEObject;
				T result = casePaymentReconciliation(paymentReconciliation);
				if (result == null) result = caseDomainResource(paymentReconciliation);
				if (result == null) result = caseResource(paymentReconciliation);
				if (result == null) result = caseBase(paymentReconciliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PAYMENT_RECONCILIATION_DETAILS: {
				PaymentReconciliationDetails paymentReconciliationDetails = (PaymentReconciliationDetails)theEObject;
				T result = casePaymentReconciliationDetails(paymentReconciliationDetails);
				if (result == null) result = caseBackboneElement(paymentReconciliationDetails);
				if (result == null) result = caseDataType(paymentReconciliationDetails);
				if (result == null) result = caseElement(paymentReconciliationDetails);
				if (result == null) result = caseBase(paymentReconciliationDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PAYMENT_RECONCILIATION_NOTES: {
				PaymentReconciliationNotes paymentReconciliationNotes = (PaymentReconciliationNotes)theEObject;
				T result = casePaymentReconciliationNotes(paymentReconciliationNotes);
				if (result == null) result = caseBackboneElement(paymentReconciliationNotes);
				if (result == null) result = caseDataType(paymentReconciliationNotes);
				if (result == null) result = caseElement(paymentReconciliationNotes);
				if (result == null) result = caseBase(paymentReconciliationNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_ROLE: {
				PractitionerRole practitionerRole = (PractitionerRole)theEObject;
				T result = casePractitionerRole(practitionerRole);
				if (result == null) result = caseDomainResource(practitionerRole);
				if (result == null) result = caseResource(practitionerRole);
				if (result == null) result = caseBase(practitionerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_ROLE_AVAILABLE_TIME: {
				PractitionerRoleAvailableTime practitionerRoleAvailableTime = (PractitionerRoleAvailableTime)theEObject;
				T result = casePractitionerRoleAvailableTime(practitionerRoleAvailableTime);
				if (result == null) result = caseBackboneElement(practitionerRoleAvailableTime);
				if (result == null) result = caseDataType(practitionerRoleAvailableTime);
				if (result == null) result = caseElement(practitionerRoleAvailableTime);
				if (result == null) result = caseBase(practitionerRoleAvailableTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PRACTITIONER_ROLE_NOT_AVAILABLE: {
				PractitionerRoleNotAvailable practitionerRoleNotAvailable = (PractitionerRoleNotAvailable)theEObject;
				T result = casePractitionerRoleNotAvailable(practitionerRoleNotAvailable);
				if (result == null) result = caseBackboneElement(practitionerRoleNotAvailable);
				if (result == null) result = caseDataType(practitionerRoleNotAvailable);
				if (result == null) result = caseElement(practitionerRoleNotAvailable);
				if (result == null) result = caseBase(practitionerRoleNotAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.DEVICE_USE_STATEMENT: {
				DeviceUseStatement deviceUseStatement = (DeviceUseStatement)theEObject;
				T result = caseDeviceUseStatement(deviceUseStatement);
				if (result == null) result = caseDomainResource(deviceUseStatement);
				if (result == null) result = caseResource(deviceUseStatement);
				if (result == null) result = caseBase(deviceUseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.FAMILY_MEMBER_HISTORY: {
				FamilyMemberHistory familyMemberHistory = (FamilyMemberHistory)theEObject;
				T result = caseFamilyMemberHistory(familyMemberHistory);
				if (result == null) result = caseDomainResource(familyMemberHistory);
				if (result == null) result = caseResource(familyMemberHistory);
				if (result == null) result = caseBase(familyMemberHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION: {
				FamilyMemberHistoryCondition familyMemberHistoryCondition = (FamilyMemberHistoryCondition)theEObject;
				T result = caseFamilyMemberHistoryCondition(familyMemberHistoryCondition);
				if (result == null) result = caseBackboneElement(familyMemberHistoryCondition);
				if (result == null) result = caseDataType(familyMemberHistoryCondition);
				if (result == null) result = caseElement(familyMemberHistoryCondition);
				if (result == null) result = caseBase(familyMemberHistoryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ORGANIZATION_AFFILIATION: {
				OrganizationAffiliation organizationAffiliation = (OrganizationAffiliation)theEObject;
				T result = caseOrganizationAffiliation(organizationAffiliation);
				if (result == null) result = caseDomainResource(organizationAffiliation);
				if (result == null) result = caseResource(organizationAffiliation);
				if (result == null) result = caseBase(organizationAffiliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_DEFINITION: {
				ResearchDefinition researchDefinition = (ResearchDefinition)theEObject;
				T result = caseResearchDefinition(researchDefinition);
				if (result == null) result = caseDomainResource(researchDefinition);
				if (result == null) result = caseResource(researchDefinition);
				if (result == null) result = caseBase(researchDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION: {
				ResearchElementDefinition researchElementDefinition = (ResearchElementDefinition)theEObject;
				T result = caseResearchElementDefinition(researchElementDefinition);
				if (result == null) result = caseDomainResource(researchElementDefinition);
				if (result == null) result = caseResource(researchElementDefinition);
				if (result == null) result = caseBase(researchElementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RESEARCH_ELEMENT_DEFINITION_CHARACTERISTIC: {
				ResearchElementDefinitionCharacteristic researchElementDefinitionCharacteristic = (ResearchElementDefinitionCharacteristic)theEObject;
				T result = caseResearchElementDefinitionCharacteristic(researchElementDefinitionCharacteristic);
				if (result == null) result = caseBackboneElement(researchElementDefinitionCharacteristic);
				if (result == null) result = caseDataType(researchElementDefinitionCharacteristic);
				if (result == null) result = caseElement(researchElementDefinitionCharacteristic);
				if (result == null) result = caseBase(researchElementDefinitionCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ADVERSE_EVENT: {
				AdverseEvent adverseEvent = (AdverseEvent)theEObject;
				T result = caseAdverseEvent(adverseEvent);
				if (result == null) result = caseDomainResource(adverseEvent);
				if (result == null) result = caseResource(adverseEvent);
				if (result == null) result = caseBase(adverseEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY: {
				AdverseEventSuspectEntity adverseEventSuspectEntity = (AdverseEventSuspectEntity)theEObject;
				T result = caseAdverseEventSuspectEntity(adverseEventSuspectEntity);
				if (result == null) result = caseBackboneElement(adverseEventSuspectEntity);
				if (result == null) result = caseDataType(adverseEventSuspectEntity);
				if (result == null) result = caseElement(adverseEventSuspectEntity);
				if (result == null) result = caseBase(adverseEventSuspectEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY_CAUSALITY: {
				AdverseEventSuspectEntityCausality adverseEventSuspectEntityCausality = (AdverseEventSuspectEntityCausality)theEObject;
				T result = caseAdverseEventSuspectEntityCausality(adverseEventSuspectEntityCausality);
				if (result == null) result = caseBackboneElement(adverseEventSuspectEntityCausality);
				if (result == null) result = caseDataType(adverseEventSuspectEntityCausality);
				if (result == null) result = caseElement(adverseEventSuspectEntityCausality);
				if (result == null) result = caseBase(adverseEventSuspectEntityCausality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS: {
				RiskEvidenceSynthesis riskEvidenceSynthesis = (RiskEvidenceSynthesis)theEObject;
				T result = caseRiskEvidenceSynthesis(riskEvidenceSynthesis);
				if (result == null) result = caseDomainResource(riskEvidenceSynthesis);
				if (result == null) result = caseResource(riskEvidenceSynthesis);
				if (result == null) result = caseBase(riskEvidenceSynthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_SAMPLE_SIZE: {
				RiskEvidenceSynthesisSampleSize riskEvidenceSynthesisSampleSize = (RiskEvidenceSynthesisSampleSize)theEObject;
				T result = caseRiskEvidenceSynthesisSampleSize(riskEvidenceSynthesisSampleSize);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisSampleSize);
				if (result == null) result = caseDataType(riskEvidenceSynthesisSampleSize);
				if (result == null) result = caseElement(riskEvidenceSynthesisSampleSize);
				if (result == null) result = caseBase(riskEvidenceSynthesisSampleSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE: {
				RiskEvidenceSynthesisRiskEstimate riskEvidenceSynthesisRiskEstimate = (RiskEvidenceSynthesisRiskEstimate)theEObject;
				T result = caseRiskEvidenceSynthesisRiskEstimate(riskEvidenceSynthesisRiskEstimate);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisRiskEstimate);
				if (result == null) result = caseDataType(riskEvidenceSynthesisRiskEstimate);
				if (result == null) result = caseElement(riskEvidenceSynthesisRiskEstimate);
				if (result == null) result = caseBase(riskEvidenceSynthesisRiskEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE_PRECISION_ESTIMATE: {
				RiskEvidenceSynthesisRiskEstimatePrecisionEstimate riskEvidenceSynthesisRiskEstimatePrecisionEstimate = (RiskEvidenceSynthesisRiskEstimatePrecisionEstimate)theEObject;
				T result = caseRiskEvidenceSynthesisRiskEstimatePrecisionEstimate(riskEvidenceSynthesisRiskEstimatePrecisionEstimate);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisRiskEstimatePrecisionEstimate);
				if (result == null) result = caseDataType(riskEvidenceSynthesisRiskEstimatePrecisionEstimate);
				if (result == null) result = caseElement(riskEvidenceSynthesisRiskEstimatePrecisionEstimate);
				if (result == null) result = caseBase(riskEvidenceSynthesisRiskEstimatePrecisionEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY: {
				RiskEvidenceSynthesisCertainty riskEvidenceSynthesisCertainty = (RiskEvidenceSynthesisCertainty)theEObject;
				T result = caseRiskEvidenceSynthesisCertainty(riskEvidenceSynthesisCertainty);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisCertainty);
				if (result == null) result = caseDataType(riskEvidenceSynthesisCertainty);
				if (result == null) result = caseElement(riskEvidenceSynthesisCertainty);
				if (result == null) result = caseBase(riskEvidenceSynthesisCertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT: {
				RiskEvidenceSynthesisCertaintyCertaintySubcomponent riskEvidenceSynthesisCertaintyCertaintySubcomponent = (RiskEvidenceSynthesisCertaintyCertaintySubcomponent)theEObject;
				T result = caseRiskEvidenceSynthesisCertaintyCertaintySubcomponent(riskEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = caseBackboneElement(riskEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = caseDataType(riskEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = caseElement(riskEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = caseBase(riskEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT: {
				TestScript testScript = (TestScript)theEObject;
				T result = caseTestScript(testScript);
				if (result == null) result = caseDomainResource(testScript);
				if (result == null) result = caseResource(testScript);
				if (result == null) result = caseBase(testScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_ORIGIN: {
				TestScriptOrigin testScriptOrigin = (TestScriptOrigin)theEObject;
				T result = caseTestScriptOrigin(testScriptOrigin);
				if (result == null) result = caseBackboneElement(testScriptOrigin);
				if (result == null) result = caseDataType(testScriptOrigin);
				if (result == null) result = caseElement(testScriptOrigin);
				if (result == null) result = caseBase(testScriptOrigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_DESTINATION: {
				TestScriptDestination testScriptDestination = (TestScriptDestination)theEObject;
				T result = caseTestScriptDestination(testScriptDestination);
				if (result == null) result = caseBackboneElement(testScriptDestination);
				if (result == null) result = caseDataType(testScriptDestination);
				if (result == null) result = caseElement(testScriptDestination);
				if (result == null) result = caseBase(testScriptDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_METADATA: {
				TestScriptMetadata testScriptMetadata = (TestScriptMetadata)theEObject;
				T result = caseTestScriptMetadata(testScriptMetadata);
				if (result == null) result = caseBackboneElement(testScriptMetadata);
				if (result == null) result = caseDataType(testScriptMetadata);
				if (result == null) result = caseElement(testScriptMetadata);
				if (result == null) result = caseBase(testScriptMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_METADATA_LINK: {
				TestScriptMetadataLink testScriptMetadataLink = (TestScriptMetadataLink)theEObject;
				T result = caseTestScriptMetadataLink(testScriptMetadataLink);
				if (result == null) result = caseBackboneElement(testScriptMetadataLink);
				if (result == null) result = caseDataType(testScriptMetadataLink);
				if (result == null) result = caseElement(testScriptMetadataLink);
				if (result == null) result = caseBase(testScriptMetadataLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_METADATA_CAPABILITY: {
				TestScriptMetadataCapability testScriptMetadataCapability = (TestScriptMetadataCapability)theEObject;
				T result = caseTestScriptMetadataCapability(testScriptMetadataCapability);
				if (result == null) result = caseBackboneElement(testScriptMetadataCapability);
				if (result == null) result = caseDataType(testScriptMetadataCapability);
				if (result == null) result = caseElement(testScriptMetadataCapability);
				if (result == null) result = caseBase(testScriptMetadataCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT: {
				CapabilityStatement capabilityStatement = (CapabilityStatement)theEObject;
				T result = caseCapabilityStatement(capabilityStatement);
				if (result == null) result = caseDomainResource(capabilityStatement);
				if (result == null) result = caseResource(capabilityStatement);
				if (result == null) result = caseBase(capabilityStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE: {
				CapabilityStatementSoftware capabilityStatementSoftware = (CapabilityStatementSoftware)theEObject;
				T result = caseCapabilityStatementSoftware(capabilityStatementSoftware);
				if (result == null) result = caseBackboneElement(capabilityStatementSoftware);
				if (result == null) result = caseDataType(capabilityStatementSoftware);
				if (result == null) result = caseElement(capabilityStatementSoftware);
				if (result == null) result = caseBase(capabilityStatementSoftware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_IMPLEMENTATION: {
				CapabilityStatementImplementation capabilityStatementImplementation = (CapabilityStatementImplementation)theEObject;
				T result = caseCapabilityStatementImplementation(capabilityStatementImplementation);
				if (result == null) result = caseBackboneElement(capabilityStatementImplementation);
				if (result == null) result = caseDataType(capabilityStatementImplementation);
				if (result == null) result = caseElement(capabilityStatementImplementation);
				if (result == null) result = caseBase(capabilityStatementImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST: {
				CapabilityStatementRest capabilityStatementRest = (CapabilityStatementRest)theEObject;
				T result = caseCapabilityStatementRest(capabilityStatementRest);
				if (result == null) result = caseBackboneElement(capabilityStatementRest);
				if (result == null) result = caseDataType(capabilityStatementRest);
				if (result == null) result = caseElement(capabilityStatementRest);
				if (result == null) result = caseBase(capabilityStatementRest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SECURITY: {
				CapabilityStatementRestSecurity capabilityStatementRestSecurity = (CapabilityStatementRestSecurity)theEObject;
				T result = caseCapabilityStatementRestSecurity(capabilityStatementRestSecurity);
				if (result == null) result = caseBackboneElement(capabilityStatementRestSecurity);
				if (result == null) result = caseDataType(capabilityStatementRestSecurity);
				if (result == null) result = caseElement(capabilityStatementRestSecurity);
				if (result == null) result = caseBase(capabilityStatementRestSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE: {
				CapabilityStatementRestResource capabilityStatementRestResource = (CapabilityStatementRestResource)theEObject;
				T result = caseCapabilityStatementRestResource(capabilityStatementRestResource);
				if (result == null) result = caseBackboneElement(capabilityStatementRestResource);
				if (result == null) result = caseDataType(capabilityStatementRestResource);
				if (result == null) result = caseElement(capabilityStatementRestResource);
				if (result == null) result = caseBase(capabilityStatementRestResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_RESOURCE_INTERACTION: {
				CapabilityStatementRestResourceResourceInteraction capabilityStatementRestResourceResourceInteraction = (CapabilityStatementRestResourceResourceInteraction)theEObject;
				T result = caseCapabilityStatementRestResourceResourceInteraction(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = caseBackboneElement(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = caseDataType(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = caseElement(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = caseBase(capabilityStatementRestResourceResourceInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_SEARCH_PARAM: {
				CapabilityStatementRestResourceSearchParam capabilityStatementRestResourceSearchParam = (CapabilityStatementRestResourceSearchParam)theEObject;
				T result = caseCapabilityStatementRestResourceSearchParam(capabilityStatementRestResourceSearchParam);
				if (result == null) result = caseBackboneElement(capabilityStatementRestResourceSearchParam);
				if (result == null) result = caseDataType(capabilityStatementRestResourceSearchParam);
				if (result == null) result = caseElement(capabilityStatementRestResourceSearchParam);
				if (result == null) result = caseBase(capabilityStatementRestResourceSearchParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION: {
				CapabilityStatementRestResourceOperation capabilityStatementRestResourceOperation = (CapabilityStatementRestResourceOperation)theEObject;
				T result = caseCapabilityStatementRestResourceOperation(capabilityStatementRestResourceOperation);
				if (result == null) result = caseBackboneElement(capabilityStatementRestResourceOperation);
				if (result == null) result = caseDataType(capabilityStatementRestResourceOperation);
				if (result == null) result = caseElement(capabilityStatementRestResourceOperation);
				if (result == null) result = caseBase(capabilityStatementRestResourceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_SYSTEM_INTERACTION: {
				CapabilityStatementRestSystemInteraction capabilityStatementRestSystemInteraction = (CapabilityStatementRestSystemInteraction)theEObject;
				T result = caseCapabilityStatementRestSystemInteraction(capabilityStatementRestSystemInteraction);
				if (result == null) result = caseBackboneElement(capabilityStatementRestSystemInteraction);
				if (result == null) result = caseDataType(capabilityStatementRestSystemInteraction);
				if (result == null) result = caseElement(capabilityStatementRestSystemInteraction);
				if (result == null) result = caseBase(capabilityStatementRestSystemInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPARTMENT_DEFINITION: {
				CompartmentDefinition compartmentDefinition = (CompartmentDefinition)theEObject;
				T result = caseCompartmentDefinition(compartmentDefinition);
				if (result == null) result = caseDomainResource(compartmentDefinition);
				if (result == null) result = caseResource(compartmentDefinition);
				if (result == null) result = caseBase(compartmentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPARTMENT_DEFINITION_RESOURCE: {
				CompartmentDefinitionResource compartmentDefinitionResource = (CompartmentDefinitionResource)theEObject;
				T result = caseCompartmentDefinitionResource(compartmentDefinitionResource);
				if (result == null) result = caseBackboneElement(compartmentDefinitionResource);
				if (result == null) result = caseDataType(compartmentDefinitionResource);
				if (result == null) result = caseElement(compartmentDefinitionResource);
				if (result == null) result = caseBase(compartmentDefinitionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING: {
				CapabilityStatementMessaging capabilityStatementMessaging = (CapabilityStatementMessaging)theEObject;
				T result = caseCapabilityStatementMessaging(capabilityStatementMessaging);
				if (result == null) result = caseBackboneElement(capabilityStatementMessaging);
				if (result == null) result = caseDataType(capabilityStatementMessaging);
				if (result == null) result = caseElement(capabilityStatementMessaging);
				if (result == null) result = caseBase(capabilityStatementMessaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_ENDPOINT: {
				CapabilityStatementMessagingEndpoint capabilityStatementMessagingEndpoint = (CapabilityStatementMessagingEndpoint)theEObject;
				T result = caseCapabilityStatementMessagingEndpoint(capabilityStatementMessagingEndpoint);
				if (result == null) result = caseBackboneElement(capabilityStatementMessagingEndpoint);
				if (result == null) result = caseDataType(capabilityStatementMessagingEndpoint);
				if (result == null) result = caseElement(capabilityStatementMessagingEndpoint);
				if (result == null) result = caseBase(capabilityStatementMessagingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING_SUPPORTED_MESSAGE: {
				CapabilityStatementMessagingSupportedMessage capabilityStatementMessagingSupportedMessage = (CapabilityStatementMessagingSupportedMessage)theEObject;
				T result = caseCapabilityStatementMessagingSupportedMessage(capabilityStatementMessagingSupportedMessage);
				if (result == null) result = caseBackboneElement(capabilityStatementMessagingSupportedMessage);
				if (result == null) result = caseDataType(capabilityStatementMessagingSupportedMessage);
				if (result == null) result = caseElement(capabilityStatementMessagingSupportedMessage);
				if (result == null) result = caseBase(capabilityStatementMessagingSupportedMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_DEFINITION: {
				MessageDefinition messageDefinition = (MessageDefinition)theEObject;
				T result = caseMessageDefinition(messageDefinition);
				if (result == null) result = caseDomainResource(messageDefinition);
				if (result == null) result = caseResource(messageDefinition);
				if (result == null) result = caseBase(messageDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_DEFINITION_FOCUS: {
				MessageDefinitionFocus messageDefinitionFocus = (MessageDefinitionFocus)theEObject;
				T result = caseMessageDefinitionFocus(messageDefinitionFocus);
				if (result == null) result = caseBackboneElement(messageDefinitionFocus);
				if (result == null) result = caseDataType(messageDefinitionFocus);
				if (result == null) result = caseElement(messageDefinitionFocus);
				if (result == null) result = caseBase(messageDefinitionFocus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE: {
				MessageDefinitionAllowedResponse messageDefinitionAllowedResponse = (MessageDefinitionAllowedResponse)theEObject;
				T result = caseMessageDefinitionAllowedResponse(messageDefinitionAllowedResponse);
				if (result == null) result = caseBackboneElement(messageDefinitionAllowedResponse);
				if (result == null) result = caseDataType(messageDefinitionAllowedResponse);
				if (result == null) result = caseElement(messageDefinitionAllowedResponse);
				if (result == null) result = caseBase(messageDefinitionAllowedResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GRAPH_DEFINITION: {
				GraphDefinition graphDefinition = (GraphDefinition)theEObject;
				T result = caseGraphDefinition(graphDefinition);
				if (result == null) result = caseDomainResource(graphDefinition);
				if (result == null) result = caseResource(graphDefinition);
				if (result == null) result = caseBase(graphDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GRAPH_DEFINITION_LINK: {
				GraphDefinitionLink graphDefinitionLink = (GraphDefinitionLink)theEObject;
				T result = caseGraphDefinitionLink(graphDefinitionLink);
				if (result == null) result = caseBackboneElement(graphDefinitionLink);
				if (result == null) result = caseDataType(graphDefinitionLink);
				if (result == null) result = caseElement(graphDefinitionLink);
				if (result == null) result = caseBase(graphDefinitionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET: {
				GraphDefinitionLinkTarget graphDefinitionLinkTarget = (GraphDefinitionLinkTarget)theEObject;
				T result = caseGraphDefinitionLinkTarget(graphDefinitionLinkTarget);
				if (result == null) result = caseBackboneElement(graphDefinitionLinkTarget);
				if (result == null) result = caseDataType(graphDefinitionLinkTarget);
				if (result == null) result = caseElement(graphDefinitionLinkTarget);
				if (result == null) result = caseBase(graphDefinitionLinkTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT: {
				GraphDefinitionLinkTargetCompartment graphDefinitionLinkTargetCompartment = (GraphDefinitionLinkTargetCompartment)theEObject;
				T result = caseGraphDefinitionLinkTargetCompartment(graphDefinitionLinkTargetCompartment);
				if (result == null) result = caseBackboneElement(graphDefinitionLinkTargetCompartment);
				if (result == null) result = caseDataType(graphDefinitionLinkTargetCompartment);
				if (result == null) result = caseElement(graphDefinitionLinkTargetCompartment);
				if (result == null) result = caseBase(graphDefinitionLinkTargetCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CAPABILITY_STATEMENT_DOCUMENT: {
				CapabilityStatementDocument capabilityStatementDocument = (CapabilityStatementDocument)theEObject;
				T result = caseCapabilityStatementDocument(capabilityStatementDocument);
				if (result == null) result = caseBackboneElement(capabilityStatementDocument);
				if (result == null) result = caseDataType(capabilityStatementDocument);
				if (result == null) result = caseElement(capabilityStatementDocument);
				if (result == null) result = caseBase(capabilityStatementDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_FIXTURE: {
				TestScriptFixture testScriptFixture = (TestScriptFixture)theEObject;
				T result = caseTestScriptFixture(testScriptFixture);
				if (result == null) result = caseBackboneElement(testScriptFixture);
				if (result == null) result = caseDataType(testScriptFixture);
				if (result == null) result = caseElement(testScriptFixture);
				if (result == null) result = caseBase(testScriptFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_VARIABLE: {
				TestScriptVariable testScriptVariable = (TestScriptVariable)theEObject;
				T result = caseTestScriptVariable(testScriptVariable);
				if (result == null) result = caseBackboneElement(testScriptVariable);
				if (result == null) result = caseDataType(testScriptVariable);
				if (result == null) result = caseElement(testScriptVariable);
				if (result == null) result = caseBase(testScriptVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP: {
				TestScriptSetup testScriptSetup = (TestScriptSetup)theEObject;
				T result = caseTestScriptSetup(testScriptSetup);
				if (result == null) result = caseBackboneElement(testScriptSetup);
				if (result == null) result = caseDataType(testScriptSetup);
				if (result == null) result = caseElement(testScriptSetup);
				if (result == null) result = caseBase(testScriptSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION: {
				TestScriptSetupSetupAction testScriptSetupSetupAction = (TestScriptSetupSetupAction)theEObject;
				T result = caseTestScriptSetupSetupAction(testScriptSetupSetupAction);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupAction);
				if (result == null) result = caseDataType(testScriptSetupSetupAction);
				if (result == null) result = caseElement(testScriptSetupSetupAction);
				if (result == null) result = caseBase(testScriptSetupSetupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION: {
				TestScriptSetupSetupActionOperation testScriptSetupSetupActionOperation = (TestScriptSetupSetupActionOperation)theEObject;
				T result = caseTestScriptSetupSetupActionOperation(testScriptSetupSetupActionOperation);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionOperation);
				if (result == null) result = caseDataType(testScriptSetupSetupActionOperation);
				if (result == null) result = caseElement(testScriptSetupSetupActionOperation);
				if (result == null) result = caseBase(testScriptSetupSetupActionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER: {
				TestScriptSetupSetupActionOperationRequestHeader testScriptSetupSetupActionOperationRequestHeader = (TestScriptSetupSetupActionOperationRequestHeader)theEObject;
				T result = caseTestScriptSetupSetupActionOperationRequestHeader(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseDataType(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseElement(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = caseBase(testScriptSetupSetupActionOperationRequestHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT: {
				TestScriptSetupSetupActionAssert testScriptSetupSetupActionAssert = (TestScriptSetupSetupActionAssert)theEObject;
				T result = caseTestScriptSetupSetupActionAssert(testScriptSetupSetupActionAssert);
				if (result == null) result = caseBackboneElement(testScriptSetupSetupActionAssert);
				if (result == null) result = caseDataType(testScriptSetupSetupActionAssert);
				if (result == null) result = caseElement(testScriptSetupSetupActionAssert);
				if (result == null) result = caseBase(testScriptSetupSetupActionAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_TEST: {
				TestScriptTest testScriptTest = (TestScriptTest)theEObject;
				T result = caseTestScriptTest(testScriptTest);
				if (result == null) result = caseBackboneElement(testScriptTest);
				if (result == null) result = caseDataType(testScriptTest);
				if (result == null) result = caseElement(testScriptTest);
				if (result == null) result = caseBase(testScriptTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_TEST_TEST_ACTION: {
				TestScriptTestTestAction testScriptTestTestAction = (TestScriptTestTestAction)theEObject;
				T result = caseTestScriptTestTestAction(testScriptTestTestAction);
				if (result == null) result = caseBackboneElement(testScriptTestTestAction);
				if (result == null) result = caseDataType(testScriptTestTestAction);
				if (result == null) result = caseElement(testScriptTestTestAction);
				if (result == null) result = caseBase(testScriptTestTestAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN: {
				TestScriptTeardown testScriptTeardown = (TestScriptTeardown)theEObject;
				T result = caseTestScriptTeardown(testScriptTeardown);
				if (result == null) result = caseBackboneElement(testScriptTeardown);
				if (result == null) result = caseDataType(testScriptTeardown);
				if (result == null) result = caseElement(testScriptTeardown);
				if (result == null) result = caseBase(testScriptTeardown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN_TEARDOWN_ACTION: {
				TestScriptTeardownTeardownAction testScriptTeardownTeardownAction = (TestScriptTeardownTeardownAction)theEObject;
				T result = caseTestScriptTeardownTeardownAction(testScriptTeardownTeardownAction);
				if (result == null) result = caseBackboneElement(testScriptTeardownTeardownAction);
				if (result == null) result = caseDataType(testScriptTeardownTeardownAction);
				if (result == null) result = caseElement(testScriptTeardownTeardownAction);
				if (result == null) result = caseBase(testScriptTeardownTeardownAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT: {
				BiologicallyDerivedProduct biologicallyDerivedProduct = (BiologicallyDerivedProduct)theEObject;
				T result = caseBiologicallyDerivedProduct(biologicallyDerivedProduct);
				if (result == null) result = caseDomainResource(biologicallyDerivedProduct);
				if (result == null) result = caseResource(biologicallyDerivedProduct);
				if (result == null) result = caseBase(biologicallyDerivedProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION: {
				BiologicallyDerivedProductCollection biologicallyDerivedProductCollection = (BiologicallyDerivedProductCollection)theEObject;
				T result = caseBiologicallyDerivedProductCollection(biologicallyDerivedProductCollection);
				if (result == null) result = caseBackboneElement(biologicallyDerivedProductCollection);
				if (result == null) result = caseDataType(biologicallyDerivedProductCollection);
				if (result == null) result = caseElement(biologicallyDerivedProductCollection);
				if (result == null) result = caseBase(biologicallyDerivedProductCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING: {
				BiologicallyDerivedProductProcessing biologicallyDerivedProductProcessing = (BiologicallyDerivedProductProcessing)theEObject;
				T result = caseBiologicallyDerivedProductProcessing(biologicallyDerivedProductProcessing);
				if (result == null) result = caseBackboneElement(biologicallyDerivedProductProcessing);
				if (result == null) result = caseDataType(biologicallyDerivedProductProcessing);
				if (result == null) result = caseElement(biologicallyDerivedProductProcessing);
				if (result == null) result = caseBase(biologicallyDerivedProductProcessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_MANIPULATION: {
				BiologicallyDerivedProductManipulation biologicallyDerivedProductManipulation = (BiologicallyDerivedProductManipulation)theEObject;
				T result = caseBiologicallyDerivedProductManipulation(biologicallyDerivedProductManipulation);
				if (result == null) result = caseBackboneElement(biologicallyDerivedProductManipulation);
				if (result == null) result = caseDataType(biologicallyDerivedProductManipulation);
				if (result == null) result = caseElement(biologicallyDerivedProductManipulation);
				if (result == null) result = caseBase(biologicallyDerivedProductManipulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE: {
				BiologicallyDerivedProductStorage biologicallyDerivedProductStorage = (BiologicallyDerivedProductStorage)theEObject;
				T result = caseBiologicallyDerivedProductStorage(biologicallyDerivedProductStorage);
				if (result == null) result = caseBackboneElement(biologicallyDerivedProductStorage);
				if (result == null) result = caseDataType(biologicallyDerivedProductStorage);
				if (result == null) result = caseElement(biologicallyDerivedProductStorage);
				if (result == null) result = caseBase(biologicallyDerivedProductStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENROLLMENT_REQUEST: {
				EnrollmentRequest enrollmentRequest = (EnrollmentRequest)theEObject;
				T result = caseEnrollmentRequest(enrollmentRequest);
				if (result == null) result = caseDomainResource(enrollmentRequest);
				if (result == null) result = caseResource(enrollmentRequest);
				if (result == null) result = caseBase(enrollmentRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_HEADER: {
				MessageHeader messageHeader = (MessageHeader)theEObject;
				T result = caseMessageHeader(messageHeader);
				if (result == null) result = caseDomainResource(messageHeader);
				if (result == null) result = caseResource(messageHeader);
				if (result == null) result = caseBase(messageHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_DESTINATION: {
				MessageHeaderMessageDestination messageHeaderMessageDestination = (MessageHeaderMessageDestination)theEObject;
				T result = caseMessageHeaderMessageDestination(messageHeaderMessageDestination);
				if (result == null) result = caseBackboneElement(messageHeaderMessageDestination);
				if (result == null) result = caseDataType(messageHeaderMessageDestination);
				if (result == null) result = caseElement(messageHeaderMessageDestination);
				if (result == null) result = caseBase(messageHeaderMessageDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_HEADER_MESSAGE_SOURCE: {
				MessageHeaderMessageSource messageHeaderMessageSource = (MessageHeaderMessageSource)theEObject;
				T result = caseMessageHeaderMessageSource(messageHeaderMessageSource);
				if (result == null) result = caseBackboneElement(messageHeaderMessageSource);
				if (result == null) result = caseDataType(messageHeaderMessageSource);
				if (result == null) result = caseElement(messageHeaderMessageSource);
				if (result == null) result = caseBase(messageHeaderMessageSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MESSAGE_HEADER_RESPONSE: {
				MessageHeaderResponse messageHeaderResponse = (MessageHeaderResponse)theEObject;
				T result = caseMessageHeaderResponse(messageHeaderResponse);
				if (result == null) result = caseBackboneElement(messageHeaderResponse);
				if (result == null) result = caseDataType(messageHeaderResponse);
				if (result == null) result = caseElement(messageHeaderResponse);
				if (result == null) result = caseBase(messageHeaderResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PAYMENT_NOTICE: {
				PaymentNotice paymentNotice = (PaymentNotice)theEObject;
				T result = casePaymentNotice(paymentNotice);
				if (result == null) result = caseDomainResource(paymentNotice);
				if (result == null) result = caseResource(paymentNotice);
				if (result == null) result = caseBase(paymentNotice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = caseDomainResource(subscription);
				if (result == null) result = caseResource(subscription);
				if (result == null) result = caseBase(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSCRIPTION_CHANNEL: {
				SubscriptionChannel subscriptionChannel = (SubscriptionChannel)theEObject;
				T result = caseSubscriptionChannel(subscriptionChannel);
				if (result == null) result = caseBackboneElement(subscriptionChannel);
				if (result == null) result = caseDataType(subscriptionChannel);
				if (result == null) result = caseElement(subscriptionChannel);
				if (result == null) result = caseBase(subscriptionChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LINKAGE: {
				Linkage linkage = (Linkage)theEObject;
				T result = caseLinkage(linkage);
				if (result == null) result = caseDomainResource(linkage);
				if (result == null) result = caseResource(linkage);
				if (result == null) result = caseBase(linkage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.LINKAGE_ITEM: {
				LinkageItem linkageItem = (LinkageItem)theEObject;
				T result = caseLinkageItem(linkageItem);
				if (result == null) result = caseBackboneElement(linkageItem);
				if (result == null) result = caseDataType(linkageItem);
				if (result == null) result = caseElement(linkageItem);
				if (result == null) result = caseBase(linkageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CATALOG_ENTRY: {
				CatalogEntry catalogEntry = (CatalogEntry)theEObject;
				T result = caseCatalogEntry(catalogEntry);
				if (result == null) result = caseDomainResource(catalogEntry);
				if (result == null) result = caseResource(catalogEntry);
				if (result == null) result = caseBase(catalogEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.CATALOG_ENTRY_RELATED_ENTRY: {
				CatalogEntryRelatedEntry catalogEntryRelatedEntry = (CatalogEntryRelatedEntry)theEObject;
				T result = caseCatalogEntryRelatedEntry(catalogEntryRelatedEntry);
				if (result == null) result = caseBackboneElement(catalogEntryRelatedEntry);
				if (result == null) result = caseDataType(catalogEntryRelatedEntry);
				if (result == null) result = caseElement(catalogEntryRelatedEntry);
				if (result == null) result = caseBase(catalogEntryRelatedEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseDomainResource(composition);
				if (result == null) result = caseResource(composition);
				if (result == null) result = caseBase(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION_ATTESTER: {
				CompositionAttester compositionAttester = (CompositionAttester)theEObject;
				T result = caseCompositionAttester(compositionAttester);
				if (result == null) result = caseBackboneElement(compositionAttester);
				if (result == null) result = caseDataType(compositionAttester);
				if (result == null) result = caseElement(compositionAttester);
				if (result == null) result = caseBase(compositionAttester);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION_RELATES_TO: {
				CompositionRelatesTo compositionRelatesTo = (CompositionRelatesTo)theEObject;
				T result = caseCompositionRelatesTo(compositionRelatesTo);
				if (result == null) result = caseBackboneElement(compositionRelatesTo);
				if (result == null) result = caseDataType(compositionRelatesTo);
				if (result == null) result = caseElement(compositionRelatesTo);
				if (result == null) result = caseBase(compositionRelatesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION_EVENT: {
				CompositionEvent compositionEvent = (CompositionEvent)theEObject;
				T result = caseCompositionEvent(compositionEvent);
				if (result == null) result = caseBackboneElement(compositionEvent);
				if (result == null) result = caseDataType(compositionEvent);
				if (result == null) result = caseElement(compositionEvent);
				if (result == null) result = caseBase(compositionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COMPOSITION_SECTION: {
				CompositionSection compositionSection = (CompositionSection)theEObject;
				T result = caseCompositionSection(compositionSection);
				if (result == null) result = caseBackboneElement(compositionSection);
				if (result == null) result = caseDataType(compositionSection);
				if (result == null) result = caseElement(compositionSection);
				if (result == null) result = caseBase(compositionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID: {
				SubstanceNucleicAcid substanceNucleicAcid = (SubstanceNucleicAcid)theEObject;
				T result = caseSubstanceNucleicAcid(substanceNucleicAcid);
				if (result == null) result = caseDomainResource(substanceNucleicAcid);
				if (result == null) result = caseResource(substanceNucleicAcid);
				if (result == null) result = caseBase(substanceNucleicAcid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT: {
				SubstanceNucleicAcidSubunit substanceNucleicAcidSubunit = (SubstanceNucleicAcidSubunit)theEObject;
				T result = caseSubstanceNucleicAcidSubunit(substanceNucleicAcidSubunit);
				if (result == null) result = caseBackboneElement(substanceNucleicAcidSubunit);
				if (result == null) result = caseDataType(substanceNucleicAcidSubunit);
				if (result == null) result = caseElement(substanceNucleicAcidSubunit);
				if (result == null) result = caseBase(substanceNucleicAcidSubunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT_LINKAGE: {
				SubstanceNucleicAcidSubunitLinkage substanceNucleicAcidSubunitLinkage = (SubstanceNucleicAcidSubunitLinkage)theEObject;
				T result = caseSubstanceNucleicAcidSubunitLinkage(substanceNucleicAcidSubunitLinkage);
				if (result == null) result = caseBackboneElement(substanceNucleicAcidSubunitLinkage);
				if (result == null) result = caseDataType(substanceNucleicAcidSubunitLinkage);
				if (result == null) result = caseElement(substanceNucleicAcidSubunitLinkage);
				if (result == null) result = caseBase(substanceNucleicAcidSubunitLinkage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_NUCLEIC_ACID_SUBUNIT_SUGAR: {
				SubstanceNucleicAcidSubunitSugar substanceNucleicAcidSubunitSugar = (SubstanceNucleicAcidSubunitSugar)theEObject;
				T result = caseSubstanceNucleicAcidSubunitSugar(substanceNucleicAcidSubunitSugar);
				if (result == null) result = caseBackboneElement(substanceNucleicAcidSubunitSugar);
				if (result == null) result = caseDataType(substanceNucleicAcidSubunitSugar);
				if (result == null) result = caseElement(substanceNucleicAcidSubunitSugar);
				if (result == null) result = caseBase(substanceNucleicAcidSubunitSugar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUPPLY_REQUEST: {
				SupplyRequest supplyRequest = (SupplyRequest)theEObject;
				T result = caseSupplyRequest(supplyRequest);
				if (result == null) result = caseDomainResource(supplyRequest);
				if (result == null) result = caseResource(supplyRequest);
				if (result == null) result = caseBase(supplyRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUPPLY_REQUEST_PARAMETER: {
				SupplyRequestParameter supplyRequestParameter = (SupplyRequestParameter)theEObject;
				T result = caseSupplyRequestParameter(supplyRequestParameter);
				if (result == null) result = caseBackboneElement(supplyRequestParameter);
				if (result == null) result = caseDataType(supplyRequestParameter);
				if (result == null) result = caseElement(supplyRequestParameter);
				if (result == null) result = caseBase(supplyRequestParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS: {
				EffectEvidenceSynthesis effectEvidenceSynthesis = (EffectEvidenceSynthesis)theEObject;
				T result = caseEffectEvidenceSynthesis(effectEvidenceSynthesis);
				if (result == null) result = caseDomainResource(effectEvidenceSynthesis);
				if (result == null) result = caseResource(effectEvidenceSynthesis);
				if (result == null) result = caseBase(effectEvidenceSynthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_SAMPLE_SIZE: {
				EffectEvidenceSynthesisSampleSize effectEvidenceSynthesisSampleSize = (EffectEvidenceSynthesisSampleSize)theEObject;
				T result = caseEffectEvidenceSynthesisSampleSize(effectEvidenceSynthesisSampleSize);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisSampleSize);
				if (result == null) result = caseDataType(effectEvidenceSynthesisSampleSize);
				if (result == null) result = caseElement(effectEvidenceSynthesisSampleSize);
				if (result == null) result = caseBase(effectEvidenceSynthesisSampleSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE: {
				EffectEvidenceSynthesisResultsByExposure effectEvidenceSynthesisResultsByExposure = (EffectEvidenceSynthesisResultsByExposure)theEObject;
				T result = caseEffectEvidenceSynthesisResultsByExposure(effectEvidenceSynthesisResultsByExposure);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisResultsByExposure);
				if (result == null) result = caseDataType(effectEvidenceSynthesisResultsByExposure);
				if (result == null) result = caseElement(effectEvidenceSynthesisResultsByExposure);
				if (result == null) result = caseBase(effectEvidenceSynthesisResultsByExposure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE: {
				EffectEvidenceSynthesisEffectEstimate effectEvidenceSynthesisEffectEstimate = (EffectEvidenceSynthesisEffectEstimate)theEObject;
				T result = caseEffectEvidenceSynthesisEffectEstimate(effectEvidenceSynthesisEffectEstimate);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisEffectEstimate);
				if (result == null) result = caseDataType(effectEvidenceSynthesisEffectEstimate);
				if (result == null) result = caseElement(effectEvidenceSynthesisEffectEstimate);
				if (result == null) result = caseBase(effectEvidenceSynthesisEffectEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE_PRECISION_ESTIMATE: {
				EffectEvidenceSynthesisEffectEstimatePrecisionEstimate effectEvidenceSynthesisEffectEstimatePrecisionEstimate = (EffectEvidenceSynthesisEffectEstimatePrecisionEstimate)theEObject;
				T result = caseEffectEvidenceSynthesisEffectEstimatePrecisionEstimate(effectEvidenceSynthesisEffectEstimatePrecisionEstimate);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisEffectEstimatePrecisionEstimate);
				if (result == null) result = caseDataType(effectEvidenceSynthesisEffectEstimatePrecisionEstimate);
				if (result == null) result = caseElement(effectEvidenceSynthesisEffectEstimatePrecisionEstimate);
				if (result == null) result = caseBase(effectEvidenceSynthesisEffectEstimatePrecisionEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY: {
				EffectEvidenceSynthesisCertainty effectEvidenceSynthesisCertainty = (EffectEvidenceSynthesisCertainty)theEObject;
				T result = caseEffectEvidenceSynthesisCertainty(effectEvidenceSynthesisCertainty);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisCertainty);
				if (result == null) result = caseDataType(effectEvidenceSynthesisCertainty);
				if (result == null) result = caseElement(effectEvidenceSynthesisCertainty);
				if (result == null) result = caseBase(effectEvidenceSynthesisCertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_CERTAINTY_CERTAINTY_SUBCOMPONENT: {
				EffectEvidenceSynthesisCertaintyCertaintySubcomponent effectEvidenceSynthesisCertaintyCertaintySubcomponent = (EffectEvidenceSynthesisCertaintyCertaintySubcomponent)theEObject;
				T result = caseEffectEvidenceSynthesisCertaintyCertaintySubcomponent(effectEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = caseBackboneElement(effectEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = caseDataType(effectEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = caseElement(effectEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = caseBase(effectEvidenceSynthesisCertaintyCertaintySubcomponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN: {
				InsurancePlan insurancePlan = (InsurancePlan)theEObject;
				T result = caseInsurancePlan(insurancePlan);
				if (result == null) result = caseDomainResource(insurancePlan);
				if (result == null) result = caseResource(insurancePlan);
				if (result == null) result = caseBase(insurancePlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_CONTACT: {
				InsurancePlanContact insurancePlanContact = (InsurancePlanContact)theEObject;
				T result = caseInsurancePlanContact(insurancePlanContact);
				if (result == null) result = caseBackboneElement(insurancePlanContact);
				if (result == null) result = caseDataType(insurancePlanContact);
				if (result == null) result = caseElement(insurancePlanContact);
				if (result == null) result = caseBase(insurancePlanContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE: {
				InsurancePlanCoverage insurancePlanCoverage = (InsurancePlanCoverage)theEObject;
				T result = caseInsurancePlanCoverage(insurancePlanCoverage);
				if (result == null) result = caseBackboneElement(insurancePlanCoverage);
				if (result == null) result = caseDataType(insurancePlanCoverage);
				if (result == null) result = caseElement(insurancePlanCoverage);
				if (result == null) result = caseBase(insurancePlanCoverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE_COVERAGE_BENEFIT: {
				InsurancePlanCoverageCoverageBenefit insurancePlanCoverageCoverageBenefit = (InsurancePlanCoverageCoverageBenefit)theEObject;
				T result = caseInsurancePlanCoverageCoverageBenefit(insurancePlanCoverageCoverageBenefit);
				if (result == null) result = caseBackboneElement(insurancePlanCoverageCoverageBenefit);
				if (result == null) result = caseDataType(insurancePlanCoverageCoverageBenefit);
				if (result == null) result = caseElement(insurancePlanCoverageCoverageBenefit);
				if (result == null) result = caseBase(insurancePlanCoverageCoverageBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_COVERAGE_COVERAGE_BENEFIT_LIMIT: {
				InsurancePlanCoverageCoverageBenefitLimit insurancePlanCoverageCoverageBenefitLimit = (InsurancePlanCoverageCoverageBenefitLimit)theEObject;
				T result = caseInsurancePlanCoverageCoverageBenefitLimit(insurancePlanCoverageCoverageBenefitLimit);
				if (result == null) result = caseBackboneElement(insurancePlanCoverageCoverageBenefitLimit);
				if (result == null) result = caseDataType(insurancePlanCoverageCoverageBenefitLimit);
				if (result == null) result = caseElement(insurancePlanCoverageCoverageBenefitLimit);
				if (result == null) result = caseBase(insurancePlanCoverageCoverageBenefitLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_PLAN: {
				InsurancePlanPlan insurancePlanPlan = (InsurancePlanPlan)theEObject;
				T result = caseInsurancePlanPlan(insurancePlanPlan);
				if (result == null) result = caseBackboneElement(insurancePlanPlan);
				if (result == null) result = caseDataType(insurancePlanPlan);
				if (result == null) result = caseElement(insurancePlanPlan);
				if (result == null) result = caseBase(insurancePlanPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_PLAN_GENERAL_COST: {
				InsurancePlanPlanGeneralCost insurancePlanPlanGeneralCost = (InsurancePlanPlanGeneralCost)theEObject;
				T result = caseInsurancePlanPlanGeneralCost(insurancePlanPlanGeneralCost);
				if (result == null) result = caseBackboneElement(insurancePlanPlanGeneralCost);
				if (result == null) result = caseDataType(insurancePlanPlanGeneralCost);
				if (result == null) result = caseElement(insurancePlanPlanGeneralCost);
				if (result == null) result = caseBase(insurancePlanPlanGeneralCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST: {
				InsurancePlanPlanSpecificCost insurancePlanPlanSpecificCost = (InsurancePlanPlanSpecificCost)theEObject;
				T result = caseInsurancePlanPlanSpecificCost(insurancePlanPlanSpecificCost);
				if (result == null) result = caseBackboneElement(insurancePlanPlanSpecificCost);
				if (result == null) result = caseDataType(insurancePlanPlanSpecificCost);
				if (result == null) result = caseElement(insurancePlanPlanSpecificCost);
				if (result == null) result = caseBase(insurancePlanPlanSpecificCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT: {
				InsurancePlanPlanSpecificCostPlanBenefit insurancePlanPlanSpecificCostPlanBenefit = (InsurancePlanPlanSpecificCostPlanBenefit)theEObject;
				T result = caseInsurancePlanPlanSpecificCostPlanBenefit(insurancePlanPlanSpecificCostPlanBenefit);
				if (result == null) result = caseBackboneElement(insurancePlanPlanSpecificCostPlanBenefit);
				if (result == null) result = caseDataType(insurancePlanPlanSpecificCostPlanBenefit);
				if (result == null) result = caseElement(insurancePlanPlanSpecificCostPlanBenefit);
				if (result == null) result = caseBase(insurancePlanPlanSpecificCostPlanBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INSURANCE_PLAN_PLAN_SPECIFIC_COST_PLAN_BENEFIT_COST: {
				InsurancePlanPlanSpecificCostPlanBenefitCost insurancePlanPlanSpecificCostPlanBenefitCost = (InsurancePlanPlanSpecificCostPlanBenefitCost)theEObject;
				T result = caseInsurancePlanPlanSpecificCostPlanBenefitCost(insurancePlanPlanSpecificCostPlanBenefitCost);
				if (result == null) result = caseBackboneElement(insurancePlanPlanSpecificCostPlanBenefitCost);
				if (result == null) result = caseDataType(insurancePlanPlanSpecificCostPlanBenefitCost);
				if (result == null) result = caseElement(insurancePlanPlanSpecificCostPlanBenefitCost);
				if (result == null) result = caseBase(insurancePlanPlanSpecificCostPlanBenefitCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = caseDomainResource(evidence);
				if (result == null) result = caseResource(evidence);
				if (result == null) result = caseBase(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION: {
				SubstanceReferenceInformation substanceReferenceInformation = (SubstanceReferenceInformation)theEObject;
				T result = caseSubstanceReferenceInformation(substanceReferenceInformation);
				if (result == null) result = caseDomainResource(substanceReferenceInformation);
				if (result == null) result = caseResource(substanceReferenceInformation);
				if (result == null) result = caseBase(substanceReferenceInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE: {
				SubstanceReferenceInformationGene substanceReferenceInformationGene = (SubstanceReferenceInformationGene)theEObject;
				T result = caseSubstanceReferenceInformationGene(substanceReferenceInformationGene);
				if (result == null) result = caseBackboneElement(substanceReferenceInformationGene);
				if (result == null) result = caseDataType(substanceReferenceInformationGene);
				if (result == null) result = caseElement(substanceReferenceInformationGene);
				if (result == null) result = caseBase(substanceReferenceInformationGene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_GENE_ELEMENT: {
				SubstanceReferenceInformationGeneElement substanceReferenceInformationGeneElement = (SubstanceReferenceInformationGeneElement)theEObject;
				T result = caseSubstanceReferenceInformationGeneElement(substanceReferenceInformationGeneElement);
				if (result == null) result = caseBackboneElement(substanceReferenceInformationGeneElement);
				if (result == null) result = caseDataType(substanceReferenceInformationGeneElement);
				if (result == null) result = caseElement(substanceReferenceInformationGeneElement);
				if (result == null) result = caseBase(substanceReferenceInformationGeneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION: {
				SubstanceReferenceInformationClassification substanceReferenceInformationClassification = (SubstanceReferenceInformationClassification)theEObject;
				T result = caseSubstanceReferenceInformationClassification(substanceReferenceInformationClassification);
				if (result == null) result = caseBackboneElement(substanceReferenceInformationClassification);
				if (result == null) result = caseDataType(substanceReferenceInformationClassification);
				if (result == null) result = caseElement(substanceReferenceInformationClassification);
				if (result == null) result = caseBase(substanceReferenceInformationClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_TARGET: {
				SubstanceReferenceInformationTarget substanceReferenceInformationTarget = (SubstanceReferenceInformationTarget)theEObject;
				T result = caseSubstanceReferenceInformationTarget(substanceReferenceInformationTarget);
				if (result == null) result = caseBackboneElement(substanceReferenceInformationTarget);
				if (result == null) result = caseDataType(substanceReferenceInformationTarget);
				if (result == null) result = caseElement(substanceReferenceInformationTarget);
				if (result == null) result = caseBase(substanceReferenceInformationTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_POLYMER: {
				SubstancePolymer substancePolymer = (SubstancePolymer)theEObject;
				T result = caseSubstancePolymer(substancePolymer);
				if (result == null) result = caseDomainResource(substancePolymer);
				if (result == null) result = caseResource(substancePolymer);
				if (result == null) result = caseBase(substancePolymer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET: {
				SubstancePolymerMonomerSet substancePolymerMonomerSet = (SubstancePolymerMonomerSet)theEObject;
				T result = caseSubstancePolymerMonomerSet(substancePolymerMonomerSet);
				if (result == null) result = caseBackboneElement(substancePolymerMonomerSet);
				if (result == null) result = caseDataType(substancePolymerMonomerSet);
				if (result == null) result = caseElement(substancePolymerMonomerSet);
				if (result == null) result = caseBase(substancePolymerMonomerSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL: {
				SubstancePolymerMonomerSetStartingMaterial substancePolymerMonomerSetStartingMaterial = (SubstancePolymerMonomerSetStartingMaterial)theEObject;
				T result = caseSubstancePolymerMonomerSetStartingMaterial(substancePolymerMonomerSetStartingMaterial);
				if (result == null) result = caseBackboneElement(substancePolymerMonomerSetStartingMaterial);
				if (result == null) result = caseDataType(substancePolymerMonomerSetStartingMaterial);
				if (result == null) result = caseElement(substancePolymerMonomerSetStartingMaterial);
				if (result == null) result = caseBase(substancePolymerMonomerSetStartingMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT: {
				SubstancePolymerRepeat substancePolymerRepeat = (SubstancePolymerRepeat)theEObject;
				T result = caseSubstancePolymerRepeat(substancePolymerRepeat);
				if (result == null) result = caseBackboneElement(substancePolymerRepeat);
				if (result == null) result = caseDataType(substancePolymerRepeat);
				if (result == null) result = caseElement(substancePolymerRepeat);
				if (result == null) result = caseBase(substancePolymerRepeat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT: {
				SubstancePolymerRepeatRepeatUnit substancePolymerRepeatRepeatUnit = (SubstancePolymerRepeatRepeatUnit)theEObject;
				T result = caseSubstancePolymerRepeatRepeatUnit(substancePolymerRepeatRepeatUnit);
				if (result == null) result = caseBackboneElement(substancePolymerRepeatRepeatUnit);
				if (result == null) result = caseDataType(substancePolymerRepeatRepeatUnit);
				if (result == null) result = caseElement(substancePolymerRepeatRepeatUnit);
				if (result == null) result = caseBase(substancePolymerRepeatRepeatUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT_DEGREE_OF_POLYMERISATION: {
				SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation substancePolymerRepeatRepeatUnitDegreeOfPolymerisation = (SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation)theEObject;
				T result = caseSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation(substancePolymerRepeatRepeatUnitDegreeOfPolymerisation);
				if (result == null) result = caseBackboneElement(substancePolymerRepeatRepeatUnitDegreeOfPolymerisation);
				if (result == null) result = caseDataType(substancePolymerRepeatRepeatUnitDegreeOfPolymerisation);
				if (result == null) result = caseElement(substancePolymerRepeatRepeatUnitDegreeOfPolymerisation);
				if (result == null) result = caseBase(substancePolymerRepeatRepeatUnitDegreeOfPolymerisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT_STRUCTURAL_REPRESENTATION: {
				SubstancePolymerRepeatRepeatUnitStructuralRepresentation substancePolymerRepeatRepeatUnitStructuralRepresentation = (SubstancePolymerRepeatRepeatUnitStructuralRepresentation)theEObject;
				T result = caseSubstancePolymerRepeatRepeatUnitStructuralRepresentation(substancePolymerRepeatRepeatUnitStructuralRepresentation);
				if (result == null) result = caseBackboneElement(substancePolymerRepeatRepeatUnitStructuralRepresentation);
				if (result == null) result = caseDataType(substancePolymerRepeatRepeatUnitStructuralRepresentation);
				if (result == null) result = caseElement(substancePolymerRepeatRepeatUnitStructuralRepresentation);
				if (result == null) result = caseBase(substancePolymerRepeatRepeatUnitStructuralRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_PROTEIN: {
				SubstanceProtein substanceProtein = (SubstanceProtein)theEObject;
				T result = caseSubstanceProtein(substanceProtein);
				if (result == null) result = caseDomainResource(substanceProtein);
				if (result == null) result = caseResource(substanceProtein);
				if (result == null) result = caseBase(substanceProtein);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_PROTEIN_SUBUNIT: {
				SubstanceProteinSubunit substanceProteinSubunit = (SubstanceProteinSubunit)theEObject;
				T result = caseSubstanceProteinSubunit(substanceProteinSubunit);
				if (result == null) result = caseBackboneElement(substanceProteinSubunit);
				if (result == null) result = caseDataType(substanceProteinSubunit);
				if (result == null) result = caseElement(substanceProteinSubunit);
				if (result == null) result = caseBase(substanceProteinSubunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL: {
				SubstanceSourceMaterial substanceSourceMaterial = (SubstanceSourceMaterial)theEObject;
				T result = caseSubstanceSourceMaterial(substanceSourceMaterial);
				if (result == null) result = caseDomainResource(substanceSourceMaterial);
				if (result == null) result = caseResource(substanceSourceMaterial);
				if (result == null) result = caseBase(substanceSourceMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION: {
				SubstanceSourceMaterialFractionDescription substanceSourceMaterialFractionDescription = (SubstanceSourceMaterialFractionDescription)theEObject;
				T result = caseSubstanceSourceMaterialFractionDescription(substanceSourceMaterialFractionDescription);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialFractionDescription);
				if (result == null) result = caseDataType(substanceSourceMaterialFractionDescription);
				if (result == null) result = caseElement(substanceSourceMaterialFractionDescription);
				if (result == null) result = caseBase(substanceSourceMaterialFractionDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM: {
				SubstanceSourceMaterialOrganism substanceSourceMaterialOrganism = (SubstanceSourceMaterialOrganism)theEObject;
				T result = caseSubstanceSourceMaterialOrganism(substanceSourceMaterialOrganism);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialOrganism);
				if (result == null) result = caseDataType(substanceSourceMaterialOrganism);
				if (result == null) result = caseElement(substanceSourceMaterialOrganism);
				if (result == null) result = caseBase(substanceSourceMaterialOrganism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_AUTHOR: {
				SubstanceSourceMaterialOrganismAuthor substanceSourceMaterialOrganismAuthor = (SubstanceSourceMaterialOrganismAuthor)theEObject;
				T result = caseSubstanceSourceMaterialOrganismAuthor(substanceSourceMaterialOrganismAuthor);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialOrganismAuthor);
				if (result == null) result = caseDataType(substanceSourceMaterialOrganismAuthor);
				if (result == null) result = caseElement(substanceSourceMaterialOrganismAuthor);
				if (result == null) result = caseBase(substanceSourceMaterialOrganismAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_HYBRID: {
				SubstanceSourceMaterialOrganismHybrid substanceSourceMaterialOrganismHybrid = (SubstanceSourceMaterialOrganismHybrid)theEObject;
				T result = caseSubstanceSourceMaterialOrganismHybrid(substanceSourceMaterialOrganismHybrid);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialOrganismHybrid);
				if (result == null) result = caseDataType(substanceSourceMaterialOrganismHybrid);
				if (result == null) result = caseElement(substanceSourceMaterialOrganismHybrid);
				if (result == null) result = caseBase(substanceSourceMaterialOrganismHybrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_ORGANISM_ORGANISM_GENERAL: {
				SubstanceSourceMaterialOrganismOrganismGeneral substanceSourceMaterialOrganismOrganismGeneral = (SubstanceSourceMaterialOrganismOrganismGeneral)theEObject;
				T result = caseSubstanceSourceMaterialOrganismOrganismGeneral(substanceSourceMaterialOrganismOrganismGeneral);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialOrganismOrganismGeneral);
				if (result == null) result = caseDataType(substanceSourceMaterialOrganismOrganismGeneral);
				if (result == null) result = caseElement(substanceSourceMaterialOrganismOrganismGeneral);
				if (result == null) result = caseBase(substanceSourceMaterialOrganismOrganismGeneral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_PART_DESCRIPTION: {
				SubstanceSourceMaterialPartDescription substanceSourceMaterialPartDescription = (SubstanceSourceMaterialPartDescription)theEObject;
				T result = caseSubstanceSourceMaterialPartDescription(substanceSourceMaterialPartDescription);
				if (result == null) result = caseBackboneElement(substanceSourceMaterialPartDescription);
				if (result == null) result = caseDataType(substanceSourceMaterialPartDescription);
				if (result == null) result = caseElement(substanceSourceMaterialPartDescription);
				if (result == null) result = caseBase(substanceSourceMaterialPartDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION: {
				MedicinalProductContraindication medicinalProductContraindication = (MedicinalProductContraindication)theEObject;
				T result = caseMedicinalProductContraindication(medicinalProductContraindication);
				if (result == null) result = caseDomainResource(medicinalProductContraindication);
				if (result == null) result = caseResource(medicinalProductContraindication);
				if (result == null) result = caseBase(medicinalProductContraindication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_CONTRAINDICATION_OTHER_THERAPY: {
				MedicinalProductContraindicationOtherTherapy medicinalProductContraindicationOtherTherapy = (MedicinalProductContraindicationOtherTherapy)theEObject;
				T result = caseMedicinalProductContraindicationOtherTherapy(medicinalProductContraindicationOtherTherapy);
				if (result == null) result = caseBackboneElement(medicinalProductContraindicationOtherTherapy);
				if (result == null) result = caseDataType(medicinalProductContraindicationOtherTherapy);
				if (result == null) result = caseElement(medicinalProductContraindicationOtherTherapy);
				if (result == null) result = caseBase(medicinalProductContraindicationOtherTherapy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE: {
				MolecularSequence molecularSequence = (MolecularSequence)theEObject;
				T result = caseMolecularSequence(molecularSequence);
				if (result == null) result = caseDomainResource(molecularSequence);
				if (result == null) result = caseResource(molecularSequence);
				if (result == null) result = caseBase(molecularSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ: {
				MolecularSequenceReferenceSeq molecularSequenceReferenceSeq = (MolecularSequenceReferenceSeq)theEObject;
				T result = caseMolecularSequenceReferenceSeq(molecularSequenceReferenceSeq);
				if (result == null) result = caseBackboneElement(molecularSequenceReferenceSeq);
				if (result == null) result = caseDataType(molecularSequenceReferenceSeq);
				if (result == null) result = caseElement(molecularSequenceReferenceSeq);
				if (result == null) result = caseBase(molecularSequenceReferenceSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE_VARIANT: {
				MolecularSequenceVariant molecularSequenceVariant = (MolecularSequenceVariant)theEObject;
				T result = caseMolecularSequenceVariant(molecularSequenceVariant);
				if (result == null) result = caseBackboneElement(molecularSequenceVariant);
				if (result == null) result = caseDataType(molecularSequenceVariant);
				if (result == null) result = caseElement(molecularSequenceVariant);
				if (result == null) result = caseBase(molecularSequenceVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY: {
				MolecularSequenceQuality molecularSequenceQuality = (MolecularSequenceQuality)theEObject;
				T result = caseMolecularSequenceQuality(molecularSequenceQuality);
				if (result == null) result = caseBackboneElement(molecularSequenceQuality);
				if (result == null) result = caseDataType(molecularSequenceQuality);
				if (result == null) result = caseElement(molecularSequenceQuality);
				if (result == null) result = caseBase(molecularSequenceQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC: {
				MolecularSequenceQualityRoc molecularSequenceQualityRoc = (MolecularSequenceQualityRoc)theEObject;
				T result = caseMolecularSequenceQualityRoc(molecularSequenceQualityRoc);
				if (result == null) result = caseBackboneElement(molecularSequenceQualityRoc);
				if (result == null) result = caseDataType(molecularSequenceQualityRoc);
				if (result == null) result = caseElement(molecularSequenceQualityRoc);
				if (result == null) result = caseBase(molecularSequenceQualityRoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY: {
				MolecularSequenceRepository molecularSequenceRepository = (MolecularSequenceRepository)theEObject;
				T result = caseMolecularSequenceRepository(molecularSequenceRepository);
				if (result == null) result = caseBackboneElement(molecularSequenceRepository);
				if (result == null) result = caseDataType(molecularSequenceRepository);
				if (result == null) result = caseElement(molecularSequenceRepository);
				if (result == null) result = caseBase(molecularSequenceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT: {
				MolecularSequenceStructureVariant molecularSequenceStructureVariant = (MolecularSequenceStructureVariant)theEObject;
				T result = caseMolecularSequenceStructureVariant(molecularSequenceStructureVariant);
				if (result == null) result = caseBackboneElement(molecularSequenceStructureVariant);
				if (result == null) result = caseDataType(molecularSequenceStructureVariant);
				if (result == null) result = caseElement(molecularSequenceStructureVariant);
				if (result == null) result = caseBase(molecularSequenceStructureVariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_OUTER: {
				MolecularSequenceStructureVariantOuter molecularSequenceStructureVariantOuter = (MolecularSequenceStructureVariantOuter)theEObject;
				T result = caseMolecularSequenceStructureVariantOuter(molecularSequenceStructureVariantOuter);
				if (result == null) result = caseBackboneElement(molecularSequenceStructureVariantOuter);
				if (result == null) result = caseDataType(molecularSequenceStructureVariantOuter);
				if (result == null) result = caseElement(molecularSequenceStructureVariantOuter);
				if (result == null) result = caseBase(molecularSequenceStructureVariantOuter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MOLECULAR_SEQUENCE_STRUCTURE_VARIANT_INNER: {
				MolecularSequenceStructureVariantInner molecularSequenceStructureVariantInner = (MolecularSequenceStructureVariantInner)theEObject;
				T result = caseMolecularSequenceStructureVariantInner(molecularSequenceStructureVariantInner);
				if (result == null) result = caseBackboneElement(molecularSequenceStructureVariantInner);
				if (result == null) result = caseDataType(molecularSequenceStructureVariantInner);
				if (result == null) result = caseElement(molecularSequenceStructureVariantInner);
				if (result == null) result = caseBase(molecularSequenceStructureVariantInner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ALLERGY_INTOLERANCE: {
				AllergyIntolerance allergyIntolerance = (AllergyIntolerance)theEObject;
				T result = caseAllergyIntolerance(allergyIntolerance);
				if (result == null) result = caseDomainResource(allergyIntolerance);
				if (result == null) result = caseResource(allergyIntolerance);
				if (result == null) result = caseBase(allergyIntolerance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ALLERGY_INTOLERANCE_REACTION: {
				AllergyIntoleranceReaction allergyIntoleranceReaction = (AllergyIntoleranceReaction)theEObject;
				T result = caseAllergyIntoleranceReaction(allergyIntoleranceReaction);
				if (result == null) result = caseBackboneElement(allergyIntoleranceReaction);
				if (result == null) result = caseDataType(allergyIntoleranceReaction);
				if (result == null) result = caseElement(allergyIntoleranceReaction);
				if (result == null) result = caseBase(allergyIntoleranceReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INVOICE: {
				Invoice invoice = (Invoice)theEObject;
				T result = caseInvoice(invoice);
				if (result == null) result = caseDomainResource(invoice);
				if (result == null) result = caseResource(invoice);
				if (result == null) result = caseBase(invoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INVOICE_PARTICIPANT: {
				InvoiceParticipant invoiceParticipant = (InvoiceParticipant)theEObject;
				T result = caseInvoiceParticipant(invoiceParticipant);
				if (result == null) result = caseBackboneElement(invoiceParticipant);
				if (result == null) result = caseDataType(invoiceParticipant);
				if (result == null) result = caseElement(invoiceParticipant);
				if (result == null) result = caseBase(invoiceParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INVOICE_LINE_ITEM: {
				InvoiceLineItem invoiceLineItem = (InvoiceLineItem)theEObject;
				T result = caseInvoiceLineItem(invoiceLineItem);
				if (result == null) result = caseBackboneElement(invoiceLineItem);
				if (result == null) result = caseDataType(invoiceLineItem);
				if (result == null) result = caseElement(invoiceLineItem);
				if (result == null) result = caseBase(invoiceLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.INVOICE_LINE_ITEM_PRICE_COMPONENT: {
				InvoiceLineItemPriceComponent invoiceLineItemPriceComponent = (InvoiceLineItemPriceComponent)theEObject;
				T result = caseInvoiceLineItemPriceComponent(invoiceLineItemPriceComponent);
				if (result == null) result = caseBackboneElement(invoiceLineItemPriceComponent);
				if (result == null) result = caseDataType(invoiceLineItemPriceComponent);
				if (result == null) result = caseElement(invoiceLineItemPriceComponent);
				if (result == null) result = caseBase(invoiceLineItemPriceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENROLLMENT_RESPONSE: {
				EnrollmentResponse enrollmentResponse = (EnrollmentResponse)theEObject;
				T result = caseEnrollmentResponse(enrollmentResponse);
				if (result == null) result = caseDomainResource(enrollmentResponse);
				if (result == null) result = caseResource(enrollmentResponse);
				if (result == null) result = caseBase(enrollmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION: {
				ImmunizationRecommendation immunizationRecommendation = (ImmunizationRecommendation)theEObject;
				T result = caseImmunizationRecommendation(immunizationRecommendation);
				if (result == null) result = caseDomainResource(immunizationRecommendation);
				if (result == null) result = caseResource(immunizationRecommendation);
				if (result == null) result = caseBase(immunizationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION: {
				ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation = (ImmunizationRecommendationRecommendation)theEObject;
				T result = caseImmunizationRecommendationRecommendation(immunizationRecommendationRecommendation);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendation);
				if (result == null) result = caseDataType(immunizationRecommendationRecommendation);
				if (result == null) result = caseElement(immunizationRecommendationRecommendation);
				if (result == null) result = caseBase(immunizationRecommendationRecommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_DATE_CRITERION: {
				ImmunizationRecommendationRecommendationDateCriterion immunizationRecommendationRecommendationDateCriterion = (ImmunizationRecommendationRecommendationDateCriterion)theEObject;
				T result = caseImmunizationRecommendationRecommendationDateCriterion(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseBackboneElement(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseDataType(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseElement(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = caseBase(immunizationRecommendationRecommendationDateCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VERIFICATION_RESULT: {
				VerificationResult verificationResult = (VerificationResult)theEObject;
				T result = caseVerificationResult(verificationResult);
				if (result == null) result = caseDomainResource(verificationResult);
				if (result == null) result = caseResource(verificationResult);
				if (result == null) result = caseBase(verificationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE: {
				VerificationResultPrimarySource verificationResultPrimarySource = (VerificationResultPrimarySource)theEObject;
				T result = caseVerificationResultPrimarySource(verificationResultPrimarySource);
				if (result == null) result = caseBackboneElement(verificationResultPrimarySource);
				if (result == null) result = caseDataType(verificationResultPrimarySource);
				if (result == null) result = caseElement(verificationResultPrimarySource);
				if (result == null) result = caseBase(verificationResultPrimarySource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VERIFICATION_RESULT_ATTESTATION: {
				VerificationResultAttestation verificationResultAttestation = (VerificationResultAttestation)theEObject;
				T result = caseVerificationResultAttestation(verificationResultAttestation);
				if (result == null) result = caseBackboneElement(verificationResultAttestation);
				if (result == null) result = caseDataType(verificationResultAttestation);
				if (result == null) result = caseElement(verificationResultAttestation);
				if (result == null) result = caseBase(verificationResultAttestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VERIFICATION_RESULT_VALIDATOR: {
				VerificationResultValidator verificationResultValidator = (VerificationResultValidator)theEObject;
				T result = caseVerificationResultValidator(verificationResultValidator);
				if (result == null) result = caseBackboneElement(verificationResultValidator);
				if (result == null) result = caseDataType(verificationResultValidator);
				if (result == null) result = caseElement(verificationResultValidator);
				if (result == null) result = caseBase(verificationResultValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseResource(bundle);
				if (result == null) result = caseBase(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_LINK: {
				BundleLink bundleLink = (BundleLink)theEObject;
				T result = caseBundleLink(bundleLink);
				if (result == null) result = caseBackboneElement(bundleLink);
				if (result == null) result = caseDataType(bundleLink);
				if (result == null) result = caseElement(bundleLink);
				if (result == null) result = caseBase(bundleLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_ENTRY: {
				BundleEntry bundleEntry = (BundleEntry)theEObject;
				T result = caseBundleEntry(bundleEntry);
				if (result == null) result = caseBackboneElement(bundleEntry);
				if (result == null) result = caseDataType(bundleEntry);
				if (result == null) result = caseElement(bundleEntry);
				if (result == null) result = caseBase(bundleEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.ENTRY_RESOURCE: {
				Entry_Resource entry_Resource = (Entry_Resource)theEObject;
				T result = caseEntry_Resource(entry_Resource);
				if (result == null) result = caseResource(entry_Resource);
				if (result == null) result = caseBase(entry_Resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_ENTRY_SEARCH: {
				BundleEntrySearch bundleEntrySearch = (BundleEntrySearch)theEObject;
				T result = caseBundleEntrySearch(bundleEntrySearch);
				if (result == null) result = caseBackboneElement(bundleEntrySearch);
				if (result == null) result = caseDataType(bundleEntrySearch);
				if (result == null) result = caseElement(bundleEntrySearch);
				if (result == null) result = caseBase(bundleEntrySearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_ENTRY_REQUEST: {
				BundleEntryRequest bundleEntryRequest = (BundleEntryRequest)theEObject;
				T result = caseBundleEntryRequest(bundleEntryRequest);
				if (result == null) result = caseBackboneElement(bundleEntryRequest);
				if (result == null) result = caseDataType(bundleEntryRequest);
				if (result == null) result = caseElement(bundleEntryRequest);
				if (result == null) result = caseBase(bundleEntryRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BUNDLE_ENTRY_RESPONSE: {
				BundleEntryResponse bundleEntryResponse = (BundleEntryResponse)theEObject;
				T result = caseBundleEntryResponse(bundleEntryResponse);
				if (result == null) result = caseBackboneElement(bundleEntryResponse);
				if (result == null) result = caseDataType(bundleEntryResponse);
				if (result == null) result = caseElement(bundleEntryResponse);
				if (result == null) result = caseBase(bundleEntryResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT: {
				TestReport testReport = (TestReport)theEObject;
				T result = caseTestReport(testReport);
				if (result == null) result = caseDomainResource(testReport);
				if (result == null) result = caseResource(testReport);
				if (result == null) result = caseBase(testReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_PARTICIPANT: {
				TestReportParticipant testReportParticipant = (TestReportParticipant)theEObject;
				T result = caseTestReportParticipant(testReportParticipant);
				if (result == null) result = caseBackboneElement(testReportParticipant);
				if (result == null) result = caseDataType(testReportParticipant);
				if (result == null) result = caseElement(testReportParticipant);
				if (result == null) result = caseBase(testReportParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_SETUP: {
				TestReportSetup testReportSetup = (TestReportSetup)theEObject;
				T result = caseTestReportSetup(testReportSetup);
				if (result == null) result = caseBackboneElement(testReportSetup);
				if (result == null) result = caseDataType(testReportSetup);
				if (result == null) result = caseElement(testReportSetup);
				if (result == null) result = caseBase(testReportSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION: {
				TestReportSetupSetupAction testReportSetupSetupAction = (TestReportSetupSetupAction)theEObject;
				T result = caseTestReportSetupSetupAction(testReportSetupSetupAction);
				if (result == null) result = caseBackboneElement(testReportSetupSetupAction);
				if (result == null) result = caseDataType(testReportSetupSetupAction);
				if (result == null) result = caseElement(testReportSetupSetupAction);
				if (result == null) result = caseBase(testReportSetupSetupAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_OPERATION: {
				TestReportSetupSetupActionOperation testReportSetupSetupActionOperation = (TestReportSetupSetupActionOperation)theEObject;
				T result = caseTestReportSetupSetupActionOperation(testReportSetupSetupActionOperation);
				if (result == null) result = caseBackboneElement(testReportSetupSetupActionOperation);
				if (result == null) result = caseDataType(testReportSetupSetupActionOperation);
				if (result == null) result = caseElement(testReportSetupSetupActionOperation);
				if (result == null) result = caseBase(testReportSetupSetupActionOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT: {
				TestReportSetupSetupActionAssert testReportSetupSetupActionAssert = (TestReportSetupSetupActionAssert)theEObject;
				T result = caseTestReportSetupSetupActionAssert(testReportSetupSetupActionAssert);
				if (result == null) result = caseBackboneElement(testReportSetupSetupActionAssert);
				if (result == null) result = caseDataType(testReportSetupSetupActionAssert);
				if (result == null) result = caseElement(testReportSetupSetupActionAssert);
				if (result == null) result = caseBase(testReportSetupSetupActionAssert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_TEST: {
				TestReportTest testReportTest = (TestReportTest)theEObject;
				T result = caseTestReportTest(testReportTest);
				if (result == null) result = caseBackboneElement(testReportTest);
				if (result == null) result = caseDataType(testReportTest);
				if (result == null) result = caseElement(testReportTest);
				if (result == null) result = caseBase(testReportTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION: {
				TestReportTestTestAction testReportTestTestAction = (TestReportTestTestAction)theEObject;
				T result = caseTestReportTestTestAction(testReportTestTestAction);
				if (result == null) result = caseBackboneElement(testReportTestTestAction);
				if (result == null) result = caseDataType(testReportTestTestAction);
				if (result == null) result = caseElement(testReportTestTestAction);
				if (result == null) result = caseBase(testReportTestTestAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_TEARDOWN: {
				TestReportTeardown testReportTeardown = (TestReportTeardown)theEObject;
				T result = caseTestReportTeardown(testReportTeardown);
				if (result == null) result = caseBackboneElement(testReportTeardown);
				if (result == null) result = caseDataType(testReportTeardown);
				if (result == null) result = caseElement(testReportTeardown);
				if (result == null) result = caseBase(testReportTeardown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.TEST_REPORT_TEARDOWN_TEARDOWN_ACTION: {
				TestReportTeardownTeardownAction testReportTeardownTeardownAction = (TestReportTeardownTeardownAction)theEObject;
				T result = caseTestReportTeardownTeardownAction(testReportTeardownTeardownAction);
				if (result == null) result = caseBackboneElement(testReportTeardownTeardownAction);
				if (result == null) result = caseDataType(testReportTeardownTeardownAction);
				if (result == null) result = caseElement(testReportTeardownTeardownAction);
				if (result == null) result = caseBase(testReportTeardownTeardownAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_ORDER: {
				NutritionOrder nutritionOrder = (NutritionOrder)theEObject;
				T result = caseNutritionOrder(nutritionOrder);
				if (result == null) result = caseDomainResource(nutritionOrder);
				if (result == null) result = caseResource(nutritionOrder);
				if (result == null) result = caseBase(nutritionOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET: {
				NutritionOrderOralDiet nutritionOrderOralDiet = (NutritionOrderOralDiet)theEObject;
				T result = caseNutritionOrderOralDiet(nutritionOrderOralDiet);
				if (result == null) result = caseBackboneElement(nutritionOrderOralDiet);
				if (result == null) result = caseDataType(nutritionOrderOralDiet);
				if (result == null) result = caseElement(nutritionOrderOralDiet);
				if (result == null) result = caseBase(nutritionOrderOralDiet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET_NUTRIENT: {
				NutritionOrderOralDietNutrient nutritionOrderOralDietNutrient = (NutritionOrderOralDietNutrient)theEObject;
				T result = caseNutritionOrderOralDietNutrient(nutritionOrderOralDietNutrient);
				if (result == null) result = caseBackboneElement(nutritionOrderOralDietNutrient);
				if (result == null) result = caseDataType(nutritionOrderOralDietNutrient);
				if (result == null) result = caseElement(nutritionOrderOralDietNutrient);
				if (result == null) result = caseBase(nutritionOrderOralDietNutrient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_ORDER_ORAL_DIET_TEXTURE: {
				NutritionOrderOralDietTexture nutritionOrderOralDietTexture = (NutritionOrderOralDietTexture)theEObject;
				T result = caseNutritionOrderOralDietTexture(nutritionOrderOralDietTexture);
				if (result == null) result = caseBackboneElement(nutritionOrderOralDietTexture);
				if (result == null) result = caseDataType(nutritionOrderOralDietTexture);
				if (result == null) result = caseElement(nutritionOrderOralDietTexture);
				if (result == null) result = caseBase(nutritionOrderOralDietTexture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_ORDER_SUPPLEMENT: {
				NutritionOrderSupplement nutritionOrderSupplement = (NutritionOrderSupplement)theEObject;
				T result = caseNutritionOrderSupplement(nutritionOrderSupplement);
				if (result == null) result = caseBackboneElement(nutritionOrderSupplement);
				if (result == null) result = caseDataType(nutritionOrderSupplement);
				if (result == null) result = caseElement(nutritionOrderSupplement);
				if (result == null) result = caseBase(nutritionOrderSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA: {
				NutritionOrderEnteralFormula nutritionOrderEnteralFormula = (NutritionOrderEnteralFormula)theEObject;
				T result = caseNutritionOrderEnteralFormula(nutritionOrderEnteralFormula);
				if (result == null) result = caseBackboneElement(nutritionOrderEnteralFormula);
				if (result == null) result = caseDataType(nutritionOrderEnteralFormula);
				if (result == null) result = caseElement(nutritionOrderEnteralFormula);
				if (result == null) result = caseBase(nutritionOrderEnteralFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION: {
				NutritionOrderEnteralFormulaAdministration nutritionOrderEnteralFormulaAdministration = (NutritionOrderEnteralFormulaAdministration)theEObject;
				T result = caseNutritionOrderEnteralFormulaAdministration(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = caseBackboneElement(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = caseDataType(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = caseElement(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = caseBase(nutritionOrderEnteralFormulaAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseDomainResource(person);
				if (result == null) result = caseResource(person);
				if (result == null) result = caseBase(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.PERSON_LINK: {
				PersonLink personLink = (PersonLink)theEObject;
				T result = casePersonLink(personLink);
				if (result == null) result = caseBackboneElement(personLink);
				if (result == null) result = caseDataType(personLink);
				if (result == null) result = caseElement(personLink);
				if (result == null) result = caseBase(personLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_STATEMENT: {
				MedicationStatement medicationStatement = (MedicationStatement)theEObject;
				T result = caseMedicationStatement(medicationStatement);
				if (result == null) result = caseDomainResource(medicationStatement);
				if (result == null) result = caseResource(medicationStatement);
				if (result == null) result = caseBase(medicationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.APPOINTMENT_RESPONSE: {
				AppointmentResponse appointmentResponse = (AppointmentResponse)theEObject;
				T result = caseAppointmentResponse(appointmentResponse);
				if (result == null) result = caseDomainResource(appointmentResponse);
				if (result == null) result = caseResource(appointmentResponse);
				if (result == null) result = caseBase(appointmentResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT: {
				AuditEvent auditEvent = (AuditEvent)theEObject;
				T result = caseAuditEvent(auditEvent);
				if (result == null) result = caseDomainResource(auditEvent);
				if (result == null) result = caseResource(auditEvent);
				if (result == null) result = caseBase(auditEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_AGENT: {
				AuditEventAgent auditEventAgent = (AuditEventAgent)theEObject;
				T result = caseAuditEventAgent(auditEventAgent);
				if (result == null) result = caseBackboneElement(auditEventAgent);
				if (result == null) result = caseDataType(auditEventAgent);
				if (result == null) result = caseElement(auditEventAgent);
				if (result == null) result = caseBase(auditEventAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_AGENT_NETWORK: {
				AuditEventAgentNetwork auditEventAgentNetwork = (AuditEventAgentNetwork)theEObject;
				T result = caseAuditEventAgentNetwork(auditEventAgentNetwork);
				if (result == null) result = caseBackboneElement(auditEventAgentNetwork);
				if (result == null) result = caseDataType(auditEventAgentNetwork);
				if (result == null) result = caseElement(auditEventAgentNetwork);
				if (result == null) result = caseBase(auditEventAgentNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_SOURCE: {
				AuditEventSource auditEventSource = (AuditEventSource)theEObject;
				T result = caseAuditEventSource(auditEventSource);
				if (result == null) result = caseBackboneElement(auditEventSource);
				if (result == null) result = caseDataType(auditEventSource);
				if (result == null) result = caseElement(auditEventSource);
				if (result == null) result = caseBase(auditEventSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_ENTITY: {
				AuditEventEntity auditEventEntity = (AuditEventEntity)theEObject;
				T result = caseAuditEventEntity(auditEventEntity);
				if (result == null) result = caseBackboneElement(auditEventEntity);
				if (result == null) result = caseDataType(auditEventEntity);
				if (result == null) result = caseElement(auditEventEntity);
				if (result == null) result = caseBase(auditEventEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.AUDIT_EVENT_ENTITY_DETAIL: {
				AuditEventEntityDetail auditEventEntityDetail = (AuditEventEntityDetail)theEObject;
				T result = caseAuditEventEntityDetail(auditEventEntityDetail);
				if (result == null) result = caseBackboneElement(auditEventEntityDetail);
				if (result == null) result = caseDataType(auditEventEntityDetail);
				if (result == null) result = caseElement(auditEventEntityDetail);
				if (result == null) result = caseBase(auditEventEntityDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.BASIC: {
				Basic basic = (Basic)theEObject;
				T result = caseBasic(basic);
				if (result == null) result = caseDomainResource(basic);
				if (result == null) result = caseResource(basic);
				if (result == null) result = caseBase(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST: {
				CoverageEligibilityRequest coverageEligibilityRequest = (CoverageEligibilityRequest)theEObject;
				T result = caseCoverageEligibilityRequest(coverageEligibilityRequest);
				if (result == null) result = caseDomainResource(coverageEligibilityRequest);
				if (result == null) result = caseResource(coverageEligibilityRequest);
				if (result == null) result = caseBase(coverageEligibilityRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_SUPPORTING_INFORMATION: {
				CoverageEligibilityRequestSupportingInformation coverageEligibilityRequestSupportingInformation = (CoverageEligibilityRequestSupportingInformation)theEObject;
				T result = caseCoverageEligibilityRequestSupportingInformation(coverageEligibilityRequestSupportingInformation);
				if (result == null) result = caseBackboneElement(coverageEligibilityRequestSupportingInformation);
				if (result == null) result = caseDataType(coverageEligibilityRequestSupportingInformation);
				if (result == null) result = caseElement(coverageEligibilityRequestSupportingInformation);
				if (result == null) result = caseBase(coverageEligibilityRequestSupportingInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_INSURANCE: {
				CoverageEligibilityRequestInsurance coverageEligibilityRequestInsurance = (CoverageEligibilityRequestInsurance)theEObject;
				T result = caseCoverageEligibilityRequestInsurance(coverageEligibilityRequestInsurance);
				if (result == null) result = caseBackboneElement(coverageEligibilityRequestInsurance);
				if (result == null) result = caseDataType(coverageEligibilityRequestInsurance);
				if (result == null) result = caseElement(coverageEligibilityRequestInsurance);
				if (result == null) result = caseBase(coverageEligibilityRequestInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS: {
				CoverageEligibilityRequestDetails coverageEligibilityRequestDetails = (CoverageEligibilityRequestDetails)theEObject;
				T result = caseCoverageEligibilityRequestDetails(coverageEligibilityRequestDetails);
				if (result == null) result = caseBackboneElement(coverageEligibilityRequestDetails);
				if (result == null) result = caseDataType(coverageEligibilityRequestDetails);
				if (result == null) result = caseElement(coverageEligibilityRequestDetails);
				if (result == null) result = caseBase(coverageEligibilityRequestDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS: {
				CoverageEligibilityRequestDetailsDiagnosis coverageEligibilityRequestDetailsDiagnosis = (CoverageEligibilityRequestDetailsDiagnosis)theEObject;
				T result = caseCoverageEligibilityRequestDetailsDiagnosis(coverageEligibilityRequestDetailsDiagnosis);
				if (result == null) result = caseBackboneElement(coverageEligibilityRequestDetailsDiagnosis);
				if (result == null) result = caseDataType(coverageEligibilityRequestDetailsDiagnosis);
				if (result == null) result = caseElement(coverageEligibilityRequestDetailsDiagnosis);
				if (result == null) result = caseBase(coverageEligibilityRequestDetailsDiagnosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INTERACTION: {
				MedicinalProductInteraction medicinalProductInteraction = (MedicinalProductInteraction)theEObject;
				T result = caseMedicinalProductInteraction(medicinalProductInteraction);
				if (result == null) result = caseDomainResource(medicinalProductInteraction);
				if (result == null) result = caseResource(medicinalProductInteraction);
				if (result == null) result = caseBase(medicinalProductInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICINAL_PRODUCT_INTERACTION_INTERACTANT: {
				MedicinalProductInteractionInteractant medicinalProductInteractionInteractant = (MedicinalProductInteractionInteractant)theEObject;
				T result = caseMedicinalProductInteractionInteractant(medicinalProductInteractionInteractant);
				if (result == null) result = caseBackboneElement(medicinalProductInteractionInteractant);
				if (result == null) result = caseDataType(medicinalProductInteractionInteractant);
				if (result == null) result = caseElement(medicinalProductInteractionInteractant);
				if (result == null) result = caseBase(medicinalProductInteractionInteractant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VISION_PRESCRIPTION: {
				VisionPrescription visionPrescription = (VisionPrescription)theEObject;
				T result = caseVisionPrescription(visionPrescription);
				if (result == null) result = caseDomainResource(visionPrescription);
				if (result == null) result = caseResource(visionPrescription);
				if (result == null) result = caseBase(visionPrescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION: {
				VisionPrescriptionLensSpecification visionPrescriptionLensSpecification = (VisionPrescriptionLensSpecification)theEObject;
				T result = caseVisionPrescriptionLensSpecification(visionPrescriptionLensSpecification);
				if (result == null) result = caseBackboneElement(visionPrescriptionLensSpecification);
				if (result == null) result = caseDataType(visionPrescriptionLensSpecification);
				if (result == null) result = caseElement(visionPrescriptionLensSpecification);
				if (result == null) result = caseBase(visionPrescriptionLensSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM: {
				VisionPrescriptionLensSpecificationPrism visionPrescriptionLensSpecificationPrism = (VisionPrescriptionLensSpecificationPrism)theEObject;
				T result = caseVisionPrescriptionLensSpecificationPrism(visionPrescriptionLensSpecificationPrism);
				if (result == null) result = caseBackboneElement(visionPrescriptionLensSpecificationPrism);
				if (result == null) result = caseDataType(visionPrescriptionLensSpecificationPrism);
				if (result == null) result = caseElement(visionPrescriptionLensSpecificationPrism);
				if (result == null) result = caseBase(visionPrescriptionLensSpecificationPrism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUPPLY_DELIVERY: {
				SupplyDelivery supplyDelivery = (SupplyDelivery)theEObject;
				T result = caseSupplyDelivery(supplyDelivery);
				if (result == null) result = caseDomainResource(supplyDelivery);
				if (result == null) result = caseResource(supplyDelivery);
				if (result == null) result = caseBase(supplyDelivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM: {
				SupplyDeliverySuppliedItem supplyDeliverySuppliedItem = (SupplyDeliverySuppliedItem)theEObject;
				T result = caseSupplyDeliverySuppliedItem(supplyDeliverySuppliedItem);
				if (result == null) result = caseBackboneElement(supplyDeliverySuppliedItem);
				if (result == null) result = caseDataType(supplyDeliverySuppliedItem);
				if (result == null) result = caseElement(supplyDeliverySuppliedItem);
				if (result == null) result = caseBase(supplyDeliverySuppliedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_DISPENSE: {
				MedicationDispense medicationDispense = (MedicationDispense)theEObject;
				T result = caseMedicationDispense(medicationDispense);
				if (result == null) result = caseDomainResource(medicationDispense);
				if (result == null) result = caseResource(medicationDispense);
				if (result == null) result = caseBase(medicationDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_DISPENSE_PERFORMER: {
				MedicationDispensePerformer medicationDispensePerformer = (MedicationDispensePerformer)theEObject;
				T result = caseMedicationDispensePerformer(medicationDispensePerformer);
				if (result == null) result = caseBackboneElement(medicationDispensePerformer);
				if (result == null) result = caseDataType(medicationDispensePerformer);
				if (result == null) result = caseElement(medicationDispensePerformer);
				if (result == null) result = caseBase(medicationDispensePerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_DISPENSE_SUBSTITUTION: {
				MedicationDispenseSubstitution medicationDispenseSubstitution = (MedicationDispenseSubstitution)theEObject;
				T result = caseMedicationDispenseSubstitution(medicationDispenseSubstitution);
				if (result == null) result = caseBackboneElement(medicationDispenseSubstitution);
				if (result == null) result = caseDataType(medicationDispenseSubstitution);
				if (result == null) result = caseElement(medicationDispenseSubstitution);
				if (result == null) result = caseBase(medicationDispenseSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE: {
				MedicationKnowledge medicationKnowledge = (MedicationKnowledge)theEObject;
				T result = caseMedicationKnowledge(medicationKnowledge);
				if (result == null) result = caseDomainResource(medicationKnowledge);
				if (result == null) result = caseResource(medicationKnowledge);
				if (result == null) result = caseBase(medicationKnowledge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_RELATED_MEDICATION_KNOWLEDGE: {
				MedicationKnowledgeRelatedMedicationKnowledge medicationKnowledgeRelatedMedicationKnowledge = (MedicationKnowledgeRelatedMedicationKnowledge)theEObject;
				T result = caseMedicationKnowledgeRelatedMedicationKnowledge(medicationKnowledgeRelatedMedicationKnowledge);
				if (result == null) result = caseBackboneElement(medicationKnowledgeRelatedMedicationKnowledge);
				if (result == null) result = caseDataType(medicationKnowledgeRelatedMedicationKnowledge);
				if (result == null) result = caseElement(medicationKnowledgeRelatedMedicationKnowledge);
				if (result == null) result = caseBase(medicationKnowledgeRelatedMedicationKnowledge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_MONOGRAPH: {
				MedicationKnowledgeMonograph medicationKnowledgeMonograph = (MedicationKnowledgeMonograph)theEObject;
				T result = caseMedicationKnowledgeMonograph(medicationKnowledgeMonograph);
				if (result == null) result = caseBackboneElement(medicationKnowledgeMonograph);
				if (result == null) result = caseDataType(medicationKnowledgeMonograph);
				if (result == null) result = caseElement(medicationKnowledgeMonograph);
				if (result == null) result = caseBase(medicationKnowledgeMonograph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT: {
				MedicationKnowledgeIngredient medicationKnowledgeIngredient = (MedicationKnowledgeIngredient)theEObject;
				T result = caseMedicationKnowledgeIngredient(medicationKnowledgeIngredient);
				if (result == null) result = caseBackboneElement(medicationKnowledgeIngredient);
				if (result == null) result = caseDataType(medicationKnowledgeIngredient);
				if (result == null) result = caseElement(medicationKnowledgeIngredient);
				if (result == null) result = caseBase(medicationKnowledgeIngredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_COST: {
				MedicationKnowledgeCost medicationKnowledgeCost = (MedicationKnowledgeCost)theEObject;
				T result = caseMedicationKnowledgeCost(medicationKnowledgeCost);
				if (result == null) result = caseBackboneElement(medicationKnowledgeCost);
				if (result == null) result = caseDataType(medicationKnowledgeCost);
				if (result == null) result = caseElement(medicationKnowledgeCost);
				if (result == null) result = caseBase(medicationKnowledgeCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_MONITORING_PROGRAM: {
				MedicationKnowledgeMonitoringProgram medicationKnowledgeMonitoringProgram = (MedicationKnowledgeMonitoringProgram)theEObject;
				T result = caseMedicationKnowledgeMonitoringProgram(medicationKnowledgeMonitoringProgram);
				if (result == null) result = caseBackboneElement(medicationKnowledgeMonitoringProgram);
				if (result == null) result = caseDataType(medicationKnowledgeMonitoringProgram);
				if (result == null) result = caseElement(medicationKnowledgeMonitoringProgram);
				if (result == null) result = caseBase(medicationKnowledgeMonitoringProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES: {
				MedicationKnowledgeAdministrationGuidelines medicationKnowledgeAdministrationGuidelines = (MedicationKnowledgeAdministrationGuidelines)theEObject;
				T result = caseMedicationKnowledgeAdministrationGuidelines(medicationKnowledgeAdministrationGuidelines);
				if (result == null) result = caseBackboneElement(medicationKnowledgeAdministrationGuidelines);
				if (result == null) result = caseDataType(medicationKnowledgeAdministrationGuidelines);
				if (result == null) result = caseElement(medicationKnowledgeAdministrationGuidelines);
				if (result == null) result = caseBase(medicationKnowledgeAdministrationGuidelines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE: {
				MedicationKnowledgeAdministrationGuidelinesDosage medicationKnowledgeAdministrationGuidelinesDosage = (MedicationKnowledgeAdministrationGuidelinesDosage)theEObject;
				T result = caseMedicationKnowledgeAdministrationGuidelinesDosage(medicationKnowledgeAdministrationGuidelinesDosage);
				if (result == null) result = caseBackboneElement(medicationKnowledgeAdministrationGuidelinesDosage);
				if (result == null) result = caseDataType(medicationKnowledgeAdministrationGuidelinesDosage);
				if (result == null) result = caseElement(medicationKnowledgeAdministrationGuidelinesDosage);
				if (result == null) result = caseBase(medicationKnowledgeAdministrationGuidelinesDosage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS: {
				MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics medicationKnowledgeAdministrationGuidelinesPatientCharacteristics = (MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics)theEObject;
				T result = caseMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics(medicationKnowledgeAdministrationGuidelinesPatientCharacteristics);
				if (result == null) result = caseBackboneElement(medicationKnowledgeAdministrationGuidelinesPatientCharacteristics);
				if (result == null) result = caseDataType(medicationKnowledgeAdministrationGuidelinesPatientCharacteristics);
				if (result == null) result = caseElement(medicationKnowledgeAdministrationGuidelinesPatientCharacteristics);
				if (result == null) result = caseBase(medicationKnowledgeAdministrationGuidelinesPatientCharacteristics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_MEDICINE_CLASSIFICATION: {
				MedicationKnowledgeMedicineClassification medicationKnowledgeMedicineClassification = (MedicationKnowledgeMedicineClassification)theEObject;
				T result = caseMedicationKnowledgeMedicineClassification(medicationKnowledgeMedicineClassification);
				if (result == null) result = caseBackboneElement(medicationKnowledgeMedicineClassification);
				if (result == null) result = caseDataType(medicationKnowledgeMedicineClassification);
				if (result == null) result = caseElement(medicationKnowledgeMedicineClassification);
				if (result == null) result = caseBase(medicationKnowledgeMedicineClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_PACKAGING: {
				MedicationKnowledgePackaging medicationKnowledgePackaging = (MedicationKnowledgePackaging)theEObject;
				T result = caseMedicationKnowledgePackaging(medicationKnowledgePackaging);
				if (result == null) result = caseBackboneElement(medicationKnowledgePackaging);
				if (result == null) result = caseDataType(medicationKnowledgePackaging);
				if (result == null) result = caseElement(medicationKnowledgePackaging);
				if (result == null) result = caseBase(medicationKnowledgePackaging);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_DRUG_CHARACTERISTIC: {
				MedicationKnowledgeDrugCharacteristic medicationKnowledgeDrugCharacteristic = (MedicationKnowledgeDrugCharacteristic)theEObject;
				T result = caseMedicationKnowledgeDrugCharacteristic(medicationKnowledgeDrugCharacteristic);
				if (result == null) result = caseBackboneElement(medicationKnowledgeDrugCharacteristic);
				if (result == null) result = caseDataType(medicationKnowledgeDrugCharacteristic);
				if (result == null) result = caseElement(medicationKnowledgeDrugCharacteristic);
				if (result == null) result = caseBase(medicationKnowledgeDrugCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY: {
				MedicationKnowledgeRegulatory medicationKnowledgeRegulatory = (MedicationKnowledgeRegulatory)theEObject;
				T result = caseMedicationKnowledgeRegulatory(medicationKnowledgeRegulatory);
				if (result == null) result = caseBackboneElement(medicationKnowledgeRegulatory);
				if (result == null) result = caseDataType(medicationKnowledgeRegulatory);
				if (result == null) result = caseElement(medicationKnowledgeRegulatory);
				if (result == null) result = caseBase(medicationKnowledgeRegulatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SUBSTITUTION: {
				MedicationKnowledgeRegulatorySubstitution medicationKnowledgeRegulatorySubstitution = (MedicationKnowledgeRegulatorySubstitution)theEObject;
				T result = caseMedicationKnowledgeRegulatorySubstitution(medicationKnowledgeRegulatorySubstitution);
				if (result == null) result = caseBackboneElement(medicationKnowledgeRegulatorySubstitution);
				if (result == null) result = caseDataType(medicationKnowledgeRegulatorySubstitution);
				if (result == null) result = caseElement(medicationKnowledgeRegulatorySubstitution);
				if (result == null) result = caseBase(medicationKnowledgeRegulatorySubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_SCHEDULE: {
				MedicationKnowledgeRegulatorySchedule medicationKnowledgeRegulatorySchedule = (MedicationKnowledgeRegulatorySchedule)theEObject;
				T result = caseMedicationKnowledgeRegulatorySchedule(medicationKnowledgeRegulatorySchedule);
				if (result == null) result = caseBackboneElement(medicationKnowledgeRegulatorySchedule);
				if (result == null) result = caseDataType(medicationKnowledgeRegulatorySchedule);
				if (result == null) result = caseElement(medicationKnowledgeRegulatorySchedule);
				if (result == null) result = caseBase(medicationKnowledgeRegulatorySchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY_MAX_DISPENSE: {
				MedicationKnowledgeRegulatoryMaxDispense medicationKnowledgeRegulatoryMaxDispense = (MedicationKnowledgeRegulatoryMaxDispense)theEObject;
				T result = caseMedicationKnowledgeRegulatoryMaxDispense(medicationKnowledgeRegulatoryMaxDispense);
				if (result == null) result = caseBackboneElement(medicationKnowledgeRegulatoryMaxDispense);
				if (result == null) result = caseDataType(medicationKnowledgeRegulatoryMaxDispense);
				if (result == null) result = caseElement(medicationKnowledgeRegulatoryMaxDispense);
				if (result == null) result = caseBase(medicationKnowledgeRegulatoryMaxDispense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.MEDICATION_KNOWLEDGE_KINETICS: {
				MedicationKnowledgeKinetics medicationKnowledgeKinetics = (MedicationKnowledgeKinetics)theEObject;
				T result = caseMedicationKnowledgeKinetics(medicationKnowledgeKinetics);
				if (result == null) result = caseBackboneElement(medicationKnowledgeKinetics);
				if (result == null) result = caseDataType(medicationKnowledgeKinetics);
				if (result == null) result = caseElement(medicationKnowledgeKinetics);
				if (result == null) result = caseBase(medicationKnowledgeKinetics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE: {
				CoverageEligibilityResponse coverageEligibilityResponse = (CoverageEligibilityResponse)theEObject;
				T result = caseCoverageEligibilityResponse(coverageEligibilityResponse);
				if (result == null) result = caseDomainResource(coverageEligibilityResponse);
				if (result == null) result = caseResource(coverageEligibilityResponse);
				if (result == null) result = caseBase(coverageEligibilityResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE: {
				CoverageEligibilityResponseInsurance coverageEligibilityResponseInsurance = (CoverageEligibilityResponseInsurance)theEObject;
				T result = caseCoverageEligibilityResponseInsurance(coverageEligibilityResponseInsurance);
				if (result == null) result = caseBackboneElement(coverageEligibilityResponseInsurance);
				if (result == null) result = caseDataType(coverageEligibilityResponseInsurance);
				if (result == null) result = caseElement(coverageEligibilityResponseInsurance);
				if (result == null) result = caseBase(coverageEligibilityResponseInsurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS: {
				CoverageEligibilityResponseInsuranceItems coverageEligibilityResponseInsuranceItems = (CoverageEligibilityResponseInsuranceItems)theEObject;
				T result = caseCoverageEligibilityResponseInsuranceItems(coverageEligibilityResponseInsuranceItems);
				if (result == null) result = caseBackboneElement(coverageEligibilityResponseInsuranceItems);
				if (result == null) result = caseDataType(coverageEligibilityResponseInsuranceItems);
				if (result == null) result = caseElement(coverageEligibilityResponseInsuranceItems);
				if (result == null) result = caseBase(coverageEligibilityResponseInsuranceItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS_BENEFIT: {
				CoverageEligibilityResponseInsuranceItemsBenefit coverageEligibilityResponseInsuranceItemsBenefit = (CoverageEligibilityResponseInsuranceItemsBenefit)theEObject;
				T result = caseCoverageEligibilityResponseInsuranceItemsBenefit(coverageEligibilityResponseInsuranceItemsBenefit);
				if (result == null) result = caseBackboneElement(coverageEligibilityResponseInsuranceItemsBenefit);
				if (result == null) result = caseDataType(coverageEligibilityResponseInsuranceItemsBenefit);
				if (result == null) result = caseElement(coverageEligibilityResponseInsuranceItemsBenefit);
				if (result == null) result = caseBase(coverageEligibilityResponseInsuranceItemsBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_ERRORS: {
				CoverageEligibilityResponseErrors coverageEligibilityResponseErrors = (CoverageEligibilityResponseErrors)theEObject;
				T result = caseCoverageEligibilityResponseErrors(coverageEligibilityResponseErrors);
				if (result == null) result = caseBackboneElement(coverageEligibilityResponseErrors);
				if (result == null) result = caseDataType(coverageEligibilityResponseErrors);
				if (result == null) result = caseElement(coverageEligibilityResponseErrors);
				if (result == null) result = caseBase(coverageEligibilityResponseErrors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION: {
				StructureDefinition structureDefinition = (StructureDefinition)theEObject;
				T result = caseStructureDefinition(structureDefinition);
				if (result == null) result = caseDomainResource(structureDefinition);
				if (result == null) result = caseResource(structureDefinition);
				if (result == null) result = caseBase(structureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION_MAPPING: {
				StructureDefinitionMapping structureDefinitionMapping = (StructureDefinitionMapping)theEObject;
				T result = caseStructureDefinitionMapping(structureDefinitionMapping);
				if (result == null) result = caseBackboneElement(structureDefinitionMapping);
				if (result == null) result = caseDataType(structureDefinitionMapping);
				if (result == null) result = caseElement(structureDefinitionMapping);
				if (result == null) result = caseBase(structureDefinitionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION_CONTEXT: {
				StructureDefinitionContext structureDefinitionContext = (StructureDefinitionContext)theEObject;
				T result = caseStructureDefinitionContext(structureDefinitionContext);
				if (result == null) result = caseBackboneElement(structureDefinitionContext);
				if (result == null) result = caseDataType(structureDefinitionContext);
				if (result == null) result = caseElement(structureDefinitionContext);
				if (result == null) result = caseBase(structureDefinitionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION_SNAPSHOT: {
				StructureDefinitionSnapshot structureDefinitionSnapshot = (StructureDefinitionSnapshot)theEObject;
				T result = caseStructureDefinitionSnapshot(structureDefinitionSnapshot);
				if (result == null) result = caseBackboneElement(structureDefinitionSnapshot);
				if (result == null) result = caseDataType(structureDefinitionSnapshot);
				if (result == null) result = caseElement(structureDefinitionSnapshot);
				if (result == null) result = caseBase(structureDefinitionSnapshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcesPackage.STRUCTURE_DEFINITION_DIFFERENTIAL: {
				StructureDefinitionDifferential structureDefinitionDifferential = (StructureDefinitionDifferential)theEObject;
				T result = caseStructureDefinitionDifferential(structureDefinitionDifferential);
				if (result == null) result = caseBackboneElement(structureDefinitionDifferential);
				if (result == null) result = caseDataType(structureDefinitionDifferential);
				if (result == null) result = caseElement(structureDefinitionDifferential);
				if (result == null) result = caseBase(structureDefinitionDifferential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Concept Reference Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Compose Concept Set Concept Reference Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetComposeConceptSetConceptReferenceDesignation(ValueSetComposeConceptSetConceptReferenceDesignation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpoint(Endpoint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReport(MeasureReport object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroup(MeasureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupPopulation(MeasureGroupPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Stratifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupStratifier(MeasureGroupStratifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Group Stratifier Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Group Stratifier Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureGroupStratifierComponent(MeasureGroupStratifierComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Supplemental Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Supplemental Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureSupplementalData(MeasureSupplementalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroup(MeasureReportGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupPopulation(MeasureReportGroupPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupStratifier(MeasureReportGroupStratifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupStratifierStratifierGroup(MeasureReportGroupStratifierStratifierGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupStratifierStratifierGroupComponent(MeasureReportGroupStratifierStratifierGroupComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation(MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Class History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Class History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterClassHistory(EncounterClassHistory object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterDiagnosis(EncounterDiagnosis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Episode Of Care Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Of Care Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeOfCareDiagnosis(EpisodeOfCareDiagnosis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Impression Investigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Impression Investigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalImpressionInvestigation(ClinicalImpressionInvestigation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinition(PlanDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionGoal(PlanDefinitionGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Goal Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Goal Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionGoalTarget(PlanDefinitionGoalTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionAction(PlanDefinitionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionActionCondition(PlanDefinitionActionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action Related Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionActionRelatedAction(PlanDefinitionActionRelatedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionActionParticipant(PlanDefinitionActionParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMap(StructureMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapStructure(StructureMapStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroup(StructureMapGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupInput(StructureMapGroupInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRule(StructureMapGroupRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRuleSource(StructureMapGroupRuleSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRuleTarget(StructureMapGroupRuleTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule Target Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule Target Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRuleTargetParameter(StructureMapGroupRuleTargetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Map Group Rule Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Map Group Rule Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureMapGroupRuleDependent(StructureMapGroupRuleDependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Definition Action Dynamic Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Definition Action Dynamic Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanDefinitionActionDynamicValue(PlanDefinitionActionDynamicValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareTeam(CareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Team Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Team Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareTeamParticipant(CareTeamParticipant object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Goal Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalTarget(GoalTarget object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRequest(ServiceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinition(ActivityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinitionParticipant(ActivityDefinitionParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Definition Dynamic Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Definition Dynamic Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefinitionDynamicValue(ActivityDefinitionDynamicValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Location Hours Of Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Hours Of Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationHoursOfOperation(LocationHoursOfOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinition(SpecimenDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinitionTypeTested(SpecimenDefinitionTypeTested object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinitionTypeTestedContainer(SpecimenDefinitionTypeTestedContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested Container Additive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested Container Additive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinitionTypeTestedContainerAdditive(SpecimenDefinitionTypeTestedContainerAdditive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested Handling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Definition Type Tested Handling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenDefinitionTypeTestedHandling(SpecimenDefinitionTypeTestedHandling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationDefinition(ObservationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Definition Quantitative Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Definition Quantitative Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationDefinitionQuantitativeDetails(ObservationDefinitionQuantitativeDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Definition Qualified Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Definition Qualified Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationDefinitionQualifiedInterval(ObservationDefinitionQualifiedInterval object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageClass(CoverageClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Cost To Beneficiary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Cost To Beneficiary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageCostToBeneficiary(CoverageCostToBeneficiary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Cost To Beneficiary Exemption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Cost To Beneficiary Exemption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageCostToBeneficiaryExemption(CoverageCostToBeneficiaryExemption object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Contract Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractContentDefinition(ContractContentDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Security Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Security Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermSecurityLabel(ContractTermSecurityLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Contract Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Contract Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermContractOffer(ContractTermContractOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Contract Offer Contract Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Contract Offer Contract Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermContractOfferContractParty(ContractTermContractOfferContractParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Contract Offer Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Contract Offer Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermContractOfferAnswer(ContractTermContractOfferAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Contract Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Contract Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermContractAsset(ContractTermContractAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Contract Asset Asset Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Contract Asset Asset Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermContractAssetAssetContext(ContractTermContractAssetAssetContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Contract Asset Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Contract Asset Valued Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermContractAssetValuedItem(ContractTermContractAssetValuedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermAction(ContractTermAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Term Action Action Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Term Action Action Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractTermActionActionSubject(ContractTermActionActionSubject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Related Person Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Person Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedPersonCommunication(RelatedPersonCommunication object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenProcessing(SpecimenProcessing object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administration Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administration Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministrationPerformer(MedicationAdministrationPerformer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequest(MedicationRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Dispense Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Dispense Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestDispenseRequest(MedicationRequestDispenseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Dispense Request Initial Fill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Dispense Request Initial Fill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestDispenseRequestInitialFill(MedicationRequestDispenseRequestInitialFill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Request Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Request Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationRequestSubstitution(MedicationRequestSubstitution object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Detected Issue Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detected Issue Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectedIssueEvidence(DetectedIssueEvidence object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Device Udi Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Udi Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceUdiCarrier(DeviceUdiCarrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Device Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Device Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDeviceName(DeviceDeviceName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceSpecialization(DeviceSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceVersion(DeviceVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceProperty(DeviceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinition(DeviceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Udi Device Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Udi Device Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionUdiDeviceIdentifier(DeviceDefinitionUdiDeviceIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Device Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Device Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionDeviceName(DeviceDefinitionDeviceName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionSpecialization(DeviceDefinitionSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionCapability(DeviceDefinitionCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionProperty(DeviceDefinitionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Definition Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Definition Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDefinitionMaterial(DeviceDefinitionMaterial object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Account Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountCoverage(AccountCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Guarantor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Guarantor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountGuarantor(AccountGuarantor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProduct(MedicinalProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductContact(MedicinalProductContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductName(MedicinalProductName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Name Name Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Name Name Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductNameNamePart(MedicinalProductNameNamePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Name Country Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Name Country Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductNameCountryLanguage(MedicinalProductNameCountryLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Manufacturing Business Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Manufacturing Business Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductManufacturingBusinessOperation(MedicinalProductManufacturingBusinessOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Special Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Special Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductSpecialDesignation(MedicinalProductSpecialDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceutical(MedicinalProductPharmaceutical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceuticalCharacteristics(MedicinalProductPharmaceuticalCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Route Of Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Route Of Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceuticalRouteOfAdministration(MedicinalProductPharmaceuticalRouteOfAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Route Of Administration Target Species</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Route Of Administration Target Species</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies(MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Route Of Administration Target Species Withdrawal Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Pharmaceutical Route Of Administration Target Species Withdrawal Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod(MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredient(MedicinalProductIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Specified Substance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Specified Substance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredientSpecifiedSubstance(MedicinalProductIngredientSpecifiedSubstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Specified Substance Strength</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Specified Substance Strength</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredientSpecifiedSubstanceStrength(MedicinalProductIngredientSpecifiedSubstanceStrength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Specified Substance Strength Reference Strength</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Specified Substance Strength Reference Strength</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength(MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Substance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Ingredient Substance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIngredientSubstance(MedicinalProductIngredientSubstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Packaged</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Packaged</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPackaged(MedicinalProductPackaged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Packaged Batch Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Packaged Batch Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPackagedBatchIdentifier(MedicinalProductPackagedBatchIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Packaged Package Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Packaged Package Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductPackagedPackageItem(MedicinalProductPackagedPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductAuthorization(MedicinalProductAuthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Authorization Jurisdictional Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Authorization Jurisdictional Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductAuthorizationJurisdictionalAuthorization(MedicinalProductAuthorizationJurisdictionalAuthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Authorization Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Authorization Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductAuthorizationProcedure(MedicinalProductAuthorizationProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Manufactured</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Manufactured</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductManufactured(MedicinalProductManufactured object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudy(ResearchStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Study Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudyArm(ResearchStudyArm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Study Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Study Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchStudyObjective(ResearchStudyObjective object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceVariable(EvidenceVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Variable Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Variable Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceVariableCharacteristic(EvidenceVariableCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchSubject(ResearchSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsent(Consent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentPolicy(ConsentPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentVerification(ConsentVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consentprovision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consentprovision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentprovision(Consentprovision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consentprovisionprovision Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consentprovisionprovision Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentprovisionprovisionActor(ConsentprovisionprovisionActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consentprovisionprovision Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consentprovisionprovision Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentprovisionprovisionData(ConsentprovisionprovisionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDefinition(EventDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItem(ChargeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemDefinition(ChargeItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Definition Applicability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Definition Applicability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemDefinitionApplicability(ChargeItemDefinitionApplicability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Definition Property Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Definition Property Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemDefinitionPropertyGroup(ChargeItemDefinitionPropertyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Definition Property Group Price Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Definition Property Group Price Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemDefinitionPropertyGroupPriceComponent(ChargeItemDefinitionPropertyGroupPriceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Charge Item Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Charge Item Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChargeItemPerformer(ChargeItemPerformer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationIngredient(MedicationIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Batch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Batch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationBatch(MedicationBatch object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Report Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Report Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticReportMedia(DiagnosticReportMedia object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Study Series Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Study Series Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingStudySeriesPerformer(ImagingStudySeriesPerformer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItem(ClaimResponseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemAdjudication(ClaimResponseItemAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemItemDetail(ClaimResponseItemItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Item Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Item Item Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseItemItemDetailSubDetail(ClaimResponseItemItemDetailSubDetail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddedItemAddedItemDetail(ClaimResponseAddedItemAddedItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Item Detail Added Item Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Added Item Added Item Detail Added Item Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseAddedItemAddedItemDetailAddedItemSubDetail(ClaimResponseAddedItemAddedItemDetailAddedItemSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Total</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Total</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseTotal(ClaimResponseTotal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponsePayment(ClaimResponsePayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseNote(ClaimResponseNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseInsurance(ClaimResponseInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Response Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Response Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimResponseError(ClaimResponseError object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Related Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Related Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimRelatedClaim(ClaimRelatedClaim object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimCareTeam(ClaimCareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Supporting Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Supporting Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimSupportingInformation(ClaimSupportingInformation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Claim Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimProcedure(ClaimProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimInsurance(ClaimInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Accident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Accident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimAccident(ClaimAccident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItem(ClaimItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItemDetail(ClaimItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Item Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimItemDetailSubDetail(ClaimItemDetailSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRequest(DeviceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Request Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Request Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRequestParameter(DeviceRequestParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Service Eligibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Service Eligibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareServiceEligibility(HealthcareServiceEligibility object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Body Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyStructure(BodyStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRestriction(TaskRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskParameter(TaskParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutput(TaskOutput object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item Enable When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item Enable When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItemEnableWhen(QuestionnaireItemEnableWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item Answer Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item Answer Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItemAnswerOption(QuestionnaireItemAnswerOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Item Initial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Item Initial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireItemInitial(QuestionnaireItemInitial object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Related Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Related Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitRelatedClaim(ExplanationOfBenefitRelatedClaim object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Care Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Supporting Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Supporting Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitSupportingInformation(ExplanationOfBenefitSupportingInformation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitInsurance(ExplanationOfBenefitInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Accident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Accident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAccident(ExplanationOfBenefitAccident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItem(ExplanationOfBenefitItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Adjudication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemAdjudication(ExplanationOfBenefitItemAdjudication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemDetail(ExplanationOfBenefitItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Item Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitItemDetailSubDetail(ExplanationOfBenefitItemDetailSubDetail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Item Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Item Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddedItemAddedItemDetail(ExplanationOfBenefitAddedItemAddedItemDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Item Detail Added Item Detail Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Added Item Added Item Detail Added Item Detail Sub Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail(ExplanationOfBenefitAddedItemAddedItemDetailAddedItemDetailSubDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Total</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Total</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitTotal(ExplanationOfBenefitTotal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitPayment(ExplanationOfBenefitPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation Of Benefit Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation Of Benefit Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanationOfBenefitNote(ExplanationOfBenefitNote object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroup(ConceptMapGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group Source Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroupSourceElement(ConceptMapGroupSourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group Source Element Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group Source Element Target Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroupSourceElementTargetElement(ConceptMapGroupSourceElementTargetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group Source Element Target Element Other Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group Source Element Target Element Other Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroupSourceElementTargetElementOtherElement(ConceptMapGroupSourceElementTargetElementOtherElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystem(CodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemFilter(CodeSystemFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemProperty(CodeSystemProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Concept Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Concept Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConceptDefinition(CodeSystemConceptDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Concept Definition Designation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Concept Definition Designation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConceptDefinitionDesignation(CodeSystemConceptDefinitionDesignation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Concept Definition Concept Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Concept Definition Concept Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemConceptDefinitionConceptProperty(CodeSystemConceptDefinitionConceptProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Map Group Unmapped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Map Group Unmapped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMapGroupUnmapped(ConceptMapGroupUnmapped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroup(RequestGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupAction(RequestGroupAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Action Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Action Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupActionCondition(RequestGroupActionCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Group Action Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Group Action Related Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestGroupActionRelatedAction(RequestGroupActionRelatedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilities(TerminologyCapabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesSoftware(TerminologyCapabilitiesSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesImplementation(TerminologyCapabilitiesImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesCodeSystem(TerminologyCapabilitiesCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Code System Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Code System Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesCodeSystemVersion(TerminologyCapabilitiesCodeSystemVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Code System Version Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Code System Version Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesCodeSystemVersionFilter(TerminologyCapabilitiesCodeSystemVersionFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Expansion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesExpansion(TerminologyCapabilitiesExpansion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Expansion Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Expansion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesExpansionParameter(TerminologyCapabilitiesExpansionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Validate Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Validate Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesValidateCode(TerminologyCapabilitiesValidateCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesTranslation(TerminologyCapabilitiesTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Capabilities Closure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Capabilities Closure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyCapabilitiesClosure(TerminologyCapabilitiesClosure object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationEvaluation(ImmunizationEvaluation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationPerformer(ImmunizationPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Education</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Education</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationEducation(ImmunizationEducation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Protocol Applied</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Protocol Applied</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationProtocolApplied(ImmunizationProtocolApplied object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIndication(MedicinalProductIndication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Indication Other Therapy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Indication Other Therapy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductIndicationOtherTherapy(MedicinalProductIndicationOtherTherapy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Undesirable Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Undesirable Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductUndesirableEffect(MedicinalProductUndesirableEffect object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Depends On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDependsOn(ImplementationGuideDependsOn object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDefinition(ImplementationGuideDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Definition Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Definition Grouping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDefinitionGrouping(ImplementationGuideDefinitionGrouping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Definition Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Definition Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDefinitionResource(ImplementationGuideDefinitionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Definition Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Definition Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDefinitionPage(ImplementationGuideDefinitionPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDefinitionParameter(ImplementationGuideDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Definition Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Definition Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideDefinitionTemplate(ImplementationGuideDefinitionTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideManifest(ImplementationGuideManifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Manifest Manifest Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Manifest Manifest Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideManifestManifestResource(ImplementationGuideManifestManifestResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Guide Manifest Manifest Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Guide Manifest Manifest Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationGuideManifestManifestPage(ImplementationGuideManifestManifestPage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Search Parameter Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Parameter Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchParameterComponent(SearchParameterComponent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Parameter Referenced From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Parameter Referenced From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionParameterReferencedFrom(OperationDefinitionParameterReferencedFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Definition Overload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Definition Overload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDefinitionOverload(OperationDefinitionOverload object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRole(PractitionerRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role Available Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRoleAvailableTime(PractitionerRoleAvailableTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Practitioner Role Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Practitioner Role Not Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePractitionerRoleNotAvailable(PractitionerRoleNotAvailable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Organization Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Affiliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationAffiliation(OrganizationAffiliation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchDefinition(ResearchDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchElementDefinition(ResearchElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Research Element Definition Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Research Element Definition Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResearchElementDefinitionCharacteristic(ResearchElementDefinitionCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEvent(AdverseEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event Suspect Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event Suspect Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEventSuspectEntity(AdverseEventSuspectEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event Suspect Entity Causality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event Suspect Entity Causality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEventSuspectEntityCausality(AdverseEventSuspectEntityCausality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesis(RiskEvidenceSynthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Sample Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Sample Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisSampleSize(RiskEvidenceSynthesisSampleSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Risk Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Risk Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisRiskEstimate(RiskEvidenceSynthesisRiskEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Risk Estimate Precision Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Risk Estimate Precision Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisRiskEstimatePrecisionEstimate(RiskEvidenceSynthesisRiskEstimatePrecisionEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Certainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Certainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisCertainty(RiskEvidenceSynthesisCertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Certainty Certainty Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Evidence Synthesis Certainty Certainty Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskEvidenceSynthesisCertaintyCertaintySubcomponent(RiskEvidenceSynthesisCertaintyCertaintySubcomponent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatement(CapabilityStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementSoftware(CapabilityStatementSoftware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementImplementation(CapabilityStatementImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRest(CapabilityStatementRest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestSecurity(CapabilityStatementRestSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestResource(CapabilityStatementRestResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Resource Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Resource Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestResourceResourceInteraction(CapabilityStatementRestResourceResourceInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Search Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Search Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestResourceSearchParam(CapabilityStatementRestResourceSearchParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest Resource Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestResourceOperation(CapabilityStatementRestResourceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Rest System Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Rest System Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementRestSystemInteraction(CapabilityStatementRestSystemInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentDefinition(CompartmentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Definition Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Definition Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentDefinitionResource(CompartmentDefinitionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Messaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Messaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementMessaging(CapabilityStatementMessaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Messaging Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Messaging Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementMessagingEndpoint(CapabilityStatementMessagingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Messaging Supported Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Messaging Supported Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementMessagingSupportedMessage(CapabilityStatementMessagingSupportedMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinition(MessageDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition Focus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition Focus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinitionFocus(MessageDefinitionFocus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition Allowed Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition Allowed Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinitionAllowedResponse(MessageDefinitionAllowedResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDefinition(GraphDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Definition Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Definition Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDefinitionLink(GraphDefinitionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Definition Link Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Definition Link Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDefinitionLinkTarget(GraphDefinitionLinkTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Definition Link Target Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Definition Link Target Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDefinitionLinkTargetCompartment(GraphDefinitionLinkTargetCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Statement Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Statement Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityStatementDocument(CapabilityStatementDocument object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProduct(BiologicallyDerivedProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductCollection(BiologicallyDerivedProductCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductProcessing(BiologicallyDerivedProductProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Manipulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Manipulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductManipulation(BiologicallyDerivedProductManipulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biologically Derived Product Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biologically Derived Product Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiologicallyDerivedProductStorage(BiologicallyDerivedProductStorage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkage(Linkage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkage Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkageItem(LinkageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogEntry(CatalogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Entry Related Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Entry Related Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogEntryRelatedEntry(CatalogEntryRelatedEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Composition Relates To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Relates To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionRelatesTo(CompositionRelatesTo object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Substance Nucleic Acid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Nucleic Acid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceNucleicAcid(SubstanceNucleicAcid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Subunit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Subunit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceNucleicAcidSubunit(SubstanceNucleicAcidSubunit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Subunit Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Subunit Linkage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceNucleicAcidSubunitLinkage(SubstanceNucleicAcidSubunitLinkage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Subunit Sugar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Nucleic Acid Subunit Sugar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceNucleicAcidSubunitSugar(SubstanceNucleicAcidSubunitSugar object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Supply Request Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Request Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyRequestParameter(SupplyRequestParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesis(EffectEvidenceSynthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Sample Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Sample Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisSampleSize(EffectEvidenceSynthesisSampleSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Results By Exposure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Results By Exposure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisResultsByExposure(EffectEvidenceSynthesisResultsByExposure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Effect Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Effect Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisEffectEstimate(EffectEvidenceSynthesisEffectEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Effect Estimate Precision Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Effect Estimate Precision Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisEffectEstimatePrecisionEstimate(EffectEvidenceSynthesisEffectEstimatePrecisionEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Certainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Certainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisCertainty(EffectEvidenceSynthesisCertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Certainty Certainty Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effect Evidence Synthesis Certainty Certainty Subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectEvidenceSynthesisCertaintyCertaintySubcomponent(EffectEvidenceSynthesisCertaintyCertaintySubcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlan(InsurancePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanContact(InsurancePlanContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanCoverage(InsurancePlanCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Coverage Coverage Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Coverage Coverage Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanCoverageCoverageBenefit(InsurancePlanCoverageCoverageBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Coverage Coverage Benefit Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Coverage Coverage Benefit Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanCoverageCoverageBenefitLimit(InsurancePlanCoverageCoverageBenefitLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanPlan(InsurancePlanPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Plan General Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Plan General Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanPlanGeneralCost(InsurancePlanPlanGeneralCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Plan Specific Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Plan Specific Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanPlanSpecificCost(InsurancePlanPlanSpecificCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Plan Specific Cost Plan Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Plan Specific Cost Plan Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanPlanSpecificCostPlanBenefit(InsurancePlanPlanSpecificCostPlanBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Plan Plan Specific Cost Plan Benefit Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Plan Plan Specific Cost Plan Benefit Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsurancePlanPlanSpecificCostPlanBenefitCost(InsurancePlanPlanSpecificCostPlanBenefitCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformation(SubstanceReferenceInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information Gene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information Gene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformationGene(SubstanceReferenceInformationGene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information Gene Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information Gene Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformationGeneElement(SubstanceReferenceInformationGeneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformationClassification(SubstanceReferenceInformationClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Reference Information Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Reference Information Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceReferenceInformationTarget(SubstanceReferenceInformationTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymer(SubstancePolymer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Monomer Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Monomer Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerMonomerSet(SubstancePolymerMonomerSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Monomer Set Starting Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Monomer Set Starting Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerMonomerSetStartingMaterial(SubstancePolymerMonomerSetStartingMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerRepeat(SubstancePolymerRepeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Repeat Repeat Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Repeat Repeat Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerRepeatRepeatUnit(SubstancePolymerRepeatRepeatUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Repeat Repeat Unit Degree Of Polymerisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Repeat Repeat Unit Degree Of Polymerisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation(SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Polymer Repeat Repeat Unit Structural Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Polymer Repeat Repeat Unit Structural Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstancePolymerRepeatRepeatUnitStructuralRepresentation(SubstancePolymerRepeatRepeatUnitStructuralRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Protein</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Protein</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceProtein(SubstanceProtein object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Protein Subunit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Protein Subunit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceProteinSubunit(SubstanceProteinSubunit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterial(SubstanceSourceMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Fraction Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Fraction Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialFractionDescription(SubstanceSourceMaterialFractionDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Organism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Organism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialOrganism(SubstanceSourceMaterialOrganism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Organism Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Organism Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialOrganismAuthor(SubstanceSourceMaterialOrganismAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Organism Hybrid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Organism Hybrid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialOrganismHybrid(SubstanceSourceMaterialOrganismHybrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Organism Organism General</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Organism Organism General</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialOrganismOrganismGeneral(SubstanceSourceMaterialOrganismOrganismGeneral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Source Material Part Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Source Material Part Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceSourceMaterialPartDescription(SubstanceSourceMaterialPartDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Contraindication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Contraindication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductContraindication(MedicinalProductContraindication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Contraindication Other Therapy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Contraindication Other Therapy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductContraindicationOtherTherapy(MedicinalProductContraindicationOtherTherapy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequence(MolecularSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Reference Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Reference Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceReferenceSeq(MolecularSequenceReferenceSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceVariant(MolecularSequenceVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceQuality(MolecularSequenceQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Quality Roc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Quality Roc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceQualityRoc(MolecularSequenceQualityRoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceRepository(MolecularSequenceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Structure Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Structure Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceStructureVariant(MolecularSequenceStructureVariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Structure Variant Outer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Structure Variant Outer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceStructureVariantOuter(MolecularSequenceStructureVariantOuter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Sequence Structure Variant Inner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Sequence Structure Variant Inner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSequenceStructureVariantInner(MolecularSequenceStructureVariantInner object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoice(Invoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceParticipant(InvoiceParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceLineItem(InvoiceLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Line Item Price Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Line Item Price Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceLineItemPriceComponent(InvoiceLineItemPriceComponent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResult(VerificationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result Primary Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result Primary Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResultPrimarySource(VerificationResultPrimarySource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result Attestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result Attestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResultAttestation(VerificationResultAttestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Result Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Result Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationResultValidator(VerificationResultValidator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Entry Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry_Resource(Entry_Resource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Test Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReport(TestReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportParticipant(TestReportParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetup(TestReportSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetupSetupAction(TestReportSetupSetupAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetupSetupActionOperation(TestReportSetupSetupActionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Setup Setup Action Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportSetupSetupActionAssert(TestReportSetupSetupActionAssert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTest(TestReportTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Test Test Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Test Test Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTestTestAction(TestReportTestTestAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Teardown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTeardown(TestReportTeardown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Report Teardown Teardown Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Report Teardown Teardown Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReportTeardownTeardownAction(TestReportTeardownTeardownAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventAgent(AuditEventAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Agent Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Agent Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventAgentNetwork(AuditEventAgentNetwork object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventEntity(AuditEventEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit Event Entity Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit Event Entity Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditEventEntityDetail(AuditEventEntityDetail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequest(CoverageEligibilityRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Supporting Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Supporting Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequestSupportingInformation(CoverageEligibilityRequestSupportingInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequestInsurance(CoverageEligibilityRequestInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequestDetails(CoverageEligibilityRequestDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Details Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Request Details Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityRequestDetailsDiagnosis(CoverageEligibilityRequestDetailsDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductInteraction(MedicinalProductInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicinal Product Interaction Interactant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicinal Product Interaction Interactant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicinalProductInteractionInteractant(MedicinalProductInteractionInteractant object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription Lens Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription Lens Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescriptionLensSpecification(VisionPrescriptionLensSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision Prescription Lens Specification Prism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision Prescription Lens Specification Prism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisionPrescriptionLensSpecificationPrism(VisionPrescriptionLensSpecificationPrism object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Supply Delivery Supplied Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Delivery Supplied Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyDeliverySuppliedItem(SupplyDeliverySuppliedItem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispensePerformer(MedicationDispensePerformer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledge(MedicationKnowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Related Medication Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Related Medication Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeRelatedMedicationKnowledge(MedicationKnowledgeRelatedMedicationKnowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Monograph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Monograph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeMonograph(MedicationKnowledgeMonograph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeIngredient(MedicationKnowledgeIngredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeCost(MedicationKnowledgeCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Monitoring Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Monitoring Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeMonitoringProgram(MedicationKnowledgeMonitoringProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Administration Guidelines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Administration Guidelines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeAdministrationGuidelines(MedicationKnowledgeAdministrationGuidelines object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Administration Guidelines Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Administration Guidelines Dosage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeAdministrationGuidelinesDosage(MedicationKnowledgeAdministrationGuidelinesDosage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Administration Guidelines Patient Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Administration Guidelines Patient Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics(MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Medicine Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Medicine Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeMedicineClassification(MedicationKnowledgeMedicineClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Packaging</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgePackaging(MedicationKnowledgePackaging object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Drug Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Drug Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeDrugCharacteristic(MedicationKnowledgeDrugCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeRegulatory(MedicationKnowledgeRegulatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeRegulatorySubstitution(MedicationKnowledgeRegulatorySubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeRegulatorySchedule(MedicationKnowledgeRegulatorySchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory Max Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Regulatory Max Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeRegulatoryMaxDispense(MedicationKnowledgeRegulatoryMaxDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Knowledge Kinetics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Knowledge Kinetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationKnowledgeKinetics(MedicationKnowledgeKinetics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponse(CoverageEligibilityResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponseInsurance(CoverageEligibilityResponseInsurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Insurance Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Insurance Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponseInsuranceItems(CoverageEligibilityResponseInsuranceItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Insurance Items Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Insurance Items Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponseInsuranceItemsBenefit(CoverageEligibilityResponseInsuranceItemsBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Errors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Eligibility Response Errors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEligibilityResponseErrors(CoverageEligibilityResponseErrors object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Structure Definition Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Definition Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureDefinitionContext(StructureDefinitionContext object) {
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

} //ResourcesSwitch
