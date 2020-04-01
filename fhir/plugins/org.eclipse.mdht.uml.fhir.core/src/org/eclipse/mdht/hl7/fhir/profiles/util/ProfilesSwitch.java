/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Base;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Coding;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Element;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinition;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement3;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

import org.eclipse.mdht.hl7.fhir.profiles.*;

import org.eclipse.mdht.hl7.fhir.resources.ActivityDefinition;
import org.eclipse.mdht.hl7.fhir.resources.CodeSystem;
import org.eclipse.mdht.hl7.fhir.resources.CodeSystemConceptDefinition;
import org.eclipse.mdht.hl7.fhir.resources.Composition;
import org.eclipse.mdht.hl7.fhir.resources.CompositionSection;
import org.eclipse.mdht.hl7.fhir.resources.DiagnosticReport;
import org.eclipse.mdht.hl7.fhir.resources.DomainResource;
import org.eclipse.mdht.hl7.fhir.resources.Evidence;
import org.eclipse.mdht.hl7.fhir.resources.EvidenceVariable;
import org.eclipse.mdht.hl7.fhir.resources.EvidenceVariableCharacteristic;
import org.eclipse.mdht.hl7.fhir.resources.FamilyMemberHistory;
import org.eclipse.mdht.hl7.fhir.resources.FamilyMemberHistoryCondition;
import org.eclipse.mdht.hl7.fhir.resources.Group;
import org.eclipse.mdht.hl7.fhir.resources.GuidanceResponse;
import org.eclipse.mdht.hl7.fhir.resources.Library;
import org.eclipse.mdht.hl7.fhir.resources.Measure;
import org.eclipse.mdht.hl7.fhir.resources.Observation;
import org.eclipse.mdht.hl7.fhir.resources.ObservationComponent;
import org.eclipse.mdht.hl7.fhir.resources.ObservationReferenceRange;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinition;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionAction;
import org.eclipse.mdht.hl7.fhir.resources.Provenance;
import org.eclipse.mdht.hl7.fhir.resources.ProvenanceAgent;
import org.eclipse.mdht.hl7.fhir.resources.Questionnaire;
import org.eclipse.mdht.hl7.fhir.resources.RequestGroup;
import org.eclipse.mdht.hl7.fhir.resources.RequestGroupAction;
import org.eclipse.mdht.hl7.fhir.resources.Resource;
import org.eclipse.mdht.hl7.fhir.resources.ServiceRequest;
import org.eclipse.mdht.hl7.fhir.resources.ValueSet;

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
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage
 * @generated
 */
public class ProfilesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProfilesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilesSwitch() {
		if (modelPackage == null) {
			modelPackage = ProfilesPackage.eINSTANCE;
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
			case ProfilesPackage.PICOELEMENT: {
				Picoelement picoelement = (Picoelement)theEObject;
				T result = casePicoelement(picoelement);
				if (result == null) result = caseEvidenceVariable(picoelement);
				if (result == null) result = caseDomainResource(picoelement);
				if (result == null) result = caseResource(picoelement);
				if (result == null) result = caseBase(picoelement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.PICOELEMENT_CHARACTERISTIC1: {
				PicoelementCharacteristic1 picoelementCharacteristic1 = (PicoelementCharacteristic1)theEObject;
				T result = casePicoelementCharacteristic1(picoelementCharacteristic1);
				if (result == null) result = caseEvidenceVariableCharacteristic(picoelementCharacteristic1);
				if (result == null) result = caseBackboneElement(picoelementCharacteristic1);
				if (result == null) result = caseDataType(picoelementCharacteristic1);
				if (result == null) result = caseElement(picoelementCharacteristic1);
				if (result == null) result = caseBase(picoelementCharacteristic1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BMI: {
				Bmi bmi = (Bmi)theEObject;
				T result = caseBmi(bmi);
				if (result == null) result = caseVitalsigns(bmi);
				if (result == null) result = caseObservation(bmi);
				if (result == null) result = caseDomainResource(bmi);
				if (result == null) result = caseResource(bmi);
				if (result == null) result = caseBase(bmi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.VITALSIGNS: {
				Vitalsigns vitalsigns = (Vitalsigns)theEObject;
				T result = caseVitalsigns(vitalsigns);
				if (result == null) result = caseObservation(vitalsigns);
				if (result == null) result = caseDomainResource(vitalsigns);
				if (result == null) result = caseResource(vitalsigns);
				if (result == null) result = caseBase(vitalsigns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.VITALSIGNS_CODEABLE_CONCEPT1: {
				VitalsignsCodeableConcept1 vitalsignsCodeableConcept1 = (VitalsignsCodeableConcept1)theEObject;
				T result = caseVitalsignsCodeableConcept1(vitalsignsCodeableConcept1);
				if (result == null) result = caseCodeableConcept(vitalsignsCodeableConcept1);
				if (result == null) result = caseDataType(vitalsignsCodeableConcept1);
				if (result == null) result = caseElement(vitalsignsCodeableConcept1);
				if (result == null) result = caseBase(vitalsignsCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.VITALSIGNS_CODEABLE_CONCEPT1_CODING1: {
				VitalsignsCodeableConcept1Coding1 vitalsignsCodeableConcept1Coding1 = (VitalsignsCodeableConcept1Coding1)theEObject;
				T result = caseVitalsignsCodeableConcept1Coding1(vitalsignsCodeableConcept1Coding1);
				if (result == null) result = caseCoding(vitalsignsCodeableConcept1Coding1);
				if (result == null) result = caseDataType(vitalsignsCodeableConcept1Coding1);
				if (result == null) result = caseElement(vitalsignsCodeableConcept1Coding1);
				if (result == null) result = caseBase(vitalsignsCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.VITALSIGNS_COMPONENT1: {
				VitalsignsComponent1 vitalsignsComponent1 = (VitalsignsComponent1)theEObject;
				T result = caseVitalsignsComponent1(vitalsignsComponent1);
				if (result == null) result = caseObservationComponent(vitalsignsComponent1);
				if (result == null) result = caseBackboneElement(vitalsignsComponent1);
				if (result == null) result = caseDataType(vitalsignsComponent1);
				if (result == null) result = caseElement(vitalsignsComponent1);
				if (result == null) result = caseBase(vitalsignsComponent1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1: {
				BmiCodeableConcept1 bmiCodeableConcept1 = (BmiCodeableConcept1)theEObject;
				T result = caseBmiCodeableConcept1(bmiCodeableConcept1);
				if (result == null) result = caseCodeableConcept(bmiCodeableConcept1);
				if (result == null) result = caseDataType(bmiCodeableConcept1);
				if (result == null) result = caseElement(bmiCodeableConcept1);
				if (result == null) result = caseBase(bmiCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1_CODING1: {
				BmiCodeableConcept1Coding1 bmiCodeableConcept1Coding1 = (BmiCodeableConcept1Coding1)theEObject;
				T result = caseBmiCodeableConcept1Coding1(bmiCodeableConcept1Coding1);
				if (result == null) result = caseCoding(bmiCodeableConcept1Coding1);
				if (result == null) result = caseDataType(bmiCodeableConcept1Coding1);
				if (result == null) result = caseElement(bmiCodeableConcept1Coding1);
				if (result == null) result = caseBase(bmiCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BMI_QUANTITY1: {
				BmiQuantity1 bmiQuantity1 = (BmiQuantity1)theEObject;
				T result = caseBmiQuantity1(bmiQuantity1);
				if (result == null) result = caseQuantity(bmiQuantity1);
				if (result == null) result = caseDataType(bmiQuantity1);
				if (result == null) result = caseElement(bmiQuantity1);
				if (result == null) result = caseBase(bmiQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.DEVICEMETRICOBSERVATION: {
				Devicemetricobservation devicemetricobservation = (Devicemetricobservation)theEObject;
				T result = caseDevicemetricobservation(devicemetricobservation);
				if (result == null) result = caseObservation(devicemetricobservation);
				if (result == null) result = caseDomainResource(devicemetricobservation);
				if (result == null) result = caseResource(devicemetricobservation);
				if (result == null) result = caseBase(devicemetricobservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION: {
				Cdshooksserviceplandefinition cdshooksserviceplandefinition = (Cdshooksserviceplandefinition)theEObject;
				T result = caseCdshooksserviceplandefinition(cdshooksserviceplandefinition);
				if (result == null) result = casePlanDefinition(cdshooksserviceplandefinition);
				if (result == null) result = caseDomainResource(cdshooksserviceplandefinition);
				if (result == null) result = caseResource(cdshooksserviceplandefinition);
				if (result == null) result = caseBase(cdshooksserviceplandefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1: {
				CdshooksserviceplandefinitionAction1 cdshooksserviceplandefinitionAction1 = (CdshooksserviceplandefinitionAction1)theEObject;
				T result = caseCdshooksserviceplandefinitionAction1(cdshooksserviceplandefinitionAction1);
				if (result == null) result = casePlanDefinitionAction(cdshooksserviceplandefinitionAction1);
				if (result == null) result = caseBackboneElement(cdshooksserviceplandefinitionAction1);
				if (result == null) result = caseDataType(cdshooksserviceplandefinitionAction1);
				if (result == null) result = caseElement(cdshooksserviceplandefinitionAction1);
				if (result == null) result = caseBase(cdshooksserviceplandefinitionAction1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CQFQUESTIONNAIRE: {
				Cqfquestionnaire cqfquestionnaire = (Cqfquestionnaire)theEObject;
				T result = caseCqfquestionnaire(cqfquestionnaire);
				if (result == null) result = caseQuestionnaire(cqfquestionnaire);
				if (result == null) result = caseDomainResource(cqfquestionnaire);
				if (result == null) result = caseResource(cqfquestionnaire);
				if (result == null) result = caseBase(cqfquestionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.COMPUTABLEPLANDEFINITION: {
				Computableplandefinition computableplandefinition = (Computableplandefinition)theEObject;
				T result = caseComputableplandefinition(computableplandefinition);
				if (result == null) result = casePlanDefinition(computableplandefinition);
				if (result == null) result = caseDomainResource(computableplandefinition);
				if (result == null) result = caseResource(computableplandefinition);
				if (result == null) result = caseBase(computableplandefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SHAREABLELIBRARY: {
				Shareablelibrary shareablelibrary = (Shareablelibrary)theEObject;
				T result = caseShareablelibrary(shareablelibrary);
				if (result == null) result = caseLibrary(shareablelibrary);
				if (result == null) result = caseDomainResource(shareablelibrary);
				if (result == null) result = caseResource(shareablelibrary);
				if (result == null) result = caseBase(shareablelibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CDSHOOKSGUIDANCERESPONSE: {
				Cdshooksguidanceresponse cdshooksguidanceresponse = (Cdshooksguidanceresponse)theEObject;
				T result = caseCdshooksguidanceresponse(cdshooksguidanceresponse);
				if (result == null) result = caseGuidanceResponse(cdshooksguidanceresponse);
				if (result == null) result = caseDomainResource(cdshooksguidanceresponse);
				if (result == null) result = caseResource(cdshooksguidanceresponse);
				if (result == null) result = caseBase(cdshooksguidanceresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SHAREABLEACTIVITYDEFINITION: {
				Shareableactivitydefinition shareableactivitydefinition = (Shareableactivitydefinition)theEObject;
				T result = caseShareableactivitydefinition(shareableactivitydefinition);
				if (result == null) result = caseActivityDefinition(shareableactivitydefinition);
				if (result == null) result = caseDomainResource(shareableactivitydefinition);
				if (result == null) result = caseResource(shareableactivitydefinition);
				if (result == null) result = caseBase(shareableactivitydefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SHAREABLEMEASURE: {
				Shareablemeasure shareablemeasure = (Shareablemeasure)theEObject;
				T result = caseShareablemeasure(shareablemeasure);
				if (result == null) result = caseMeasure(shareablemeasure);
				if (result == null) result = caseDomainResource(shareablemeasure);
				if (result == null) result = caseResource(shareablemeasure);
				if (result == null) result = caseBase(shareablemeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.RESPRATE: {
				Resprate resprate = (Resprate)theEObject;
				T result = caseResprate(resprate);
				if (result == null) result = caseVitalsigns(resprate);
				if (result == null) result = caseObservation(resprate);
				if (result == null) result = caseDomainResource(resprate);
				if (result == null) result = caseResource(resprate);
				if (result == null) result = caseBase(resprate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1: {
				ResprateCodeableConcept1 resprateCodeableConcept1 = (ResprateCodeableConcept1)theEObject;
				T result = caseResprateCodeableConcept1(resprateCodeableConcept1);
				if (result == null) result = caseCodeableConcept(resprateCodeableConcept1);
				if (result == null) result = caseDataType(resprateCodeableConcept1);
				if (result == null) result = caseElement(resprateCodeableConcept1);
				if (result == null) result = caseBase(resprateCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1_CODING1: {
				ResprateCodeableConcept1Coding1 resprateCodeableConcept1Coding1 = (ResprateCodeableConcept1Coding1)theEObject;
				T result = caseResprateCodeableConcept1Coding1(resprateCodeableConcept1Coding1);
				if (result == null) result = caseCoding(resprateCodeableConcept1Coding1);
				if (result == null) result = caseDataType(resprateCodeableConcept1Coding1);
				if (result == null) result = caseElement(resprateCodeableConcept1Coding1);
				if (result == null) result = caseBase(resprateCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.RESPRATE_QUANTITY1: {
				ResprateQuantity1 resprateQuantity1 = (ResprateQuantity1)theEObject;
				T result = caseResprateQuantity1(resprateQuantity1);
				if (result == null) result = caseQuantity(resprateQuantity1);
				if (result == null) result = caseDataType(resprateQuantity1);
				if (result == null) result = caseElement(resprateQuantity1);
				if (result == null) result = caseBase(resprateQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.FAMILYMEMBERHISTORYGENETIC: {
				Familymemberhistorygenetic familymemberhistorygenetic = (Familymemberhistorygenetic)theEObject;
				T result = caseFamilymemberhistorygenetic(familymemberhistorygenetic);
				if (result == null) result = caseFamilyMemberHistory(familymemberhistorygenetic);
				if (result == null) result = caseDomainResource(familymemberhistorygenetic);
				if (result == null) result = caseResource(familymemberhistorygenetic);
				if (result == null) result = caseBase(familymemberhistorygenetic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.FAMILYMEMBERHISTORYGENETIC_CONDITION1: {
				FamilymemberhistorygeneticCondition1 familymemberhistorygeneticCondition1 = (FamilymemberhistorygeneticCondition1)theEObject;
				T result = caseFamilymemberhistorygeneticCondition1(familymemberhistorygeneticCondition1);
				if (result == null) result = caseFamilyMemberHistoryCondition(familymemberhistorygeneticCondition1);
				if (result == null) result = caseBackboneElement(familymemberhistorygeneticCondition1);
				if (result == null) result = caseDataType(familymemberhistorygeneticCondition1);
				if (result == null) result = caseElement(familymemberhistorygeneticCondition1);
				if (result == null) result = caseBase(familymemberhistorygeneticCondition1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HDLCHOLESTEROL: {
				Hdlcholesterol hdlcholesterol = (Hdlcholesterol)theEObject;
				T result = caseHdlcholesterol(hdlcholesterol);
				if (result == null) result = caseObservation(hdlcholesterol);
				if (result == null) result = caseDomainResource(hdlcholesterol);
				if (result == null) result = caseResource(hdlcholesterol);
				if (result == null) result = caseBase(hdlcholesterol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HDLCHOLESTEROL_REFERENCE_RANGE1: {
				HdlcholesterolReferenceRange1 hdlcholesterolReferenceRange1 = (HdlcholesterolReferenceRange1)theEObject;
				T result = caseHdlcholesterolReferenceRange1(hdlcholesterolReferenceRange1);
				if (result == null) result = caseObservationReferenceRange(hdlcholesterolReferenceRange1);
				if (result == null) result = caseBackboneElement(hdlcholesterolReferenceRange1);
				if (result == null) result = caseDataType(hdlcholesterolReferenceRange1);
				if (result == null) result = caseElement(hdlcholesterolReferenceRange1);
				if (result == null) result = caseBase(hdlcholesterolReferenceRange1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SHAREABLEPLANDEFINITION: {
				Shareableplandefinition shareableplandefinition = (Shareableplandefinition)theEObject;
				T result = caseShareableplandefinition(shareableplandefinition);
				if (result == null) result = casePlanDefinition(shareableplandefinition);
				if (result == null) result = caseDomainResource(shareableplandefinition);
				if (result == null) result = caseResource(shareableplandefinition);
				if (result == null) result = caseBase(shareableplandefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.LIPIDPROFILE: {
				Lipidprofile lipidprofile = (Lipidprofile)theEObject;
				T result = caseLipidprofile(lipidprofile);
				if (result == null) result = caseDiagnosticReport(lipidprofile);
				if (result == null) result = caseDomainResource(lipidprofile);
				if (result == null) result = caseResource(lipidprofile);
				if (result == null) result = caseBase(lipidprofile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CHOLESTEROL: {
				Cholesterol cholesterol = (Cholesterol)theEObject;
				T result = caseCholesterol(cholesterol);
				if (result == null) result = caseObservation(cholesterol);
				if (result == null) result = caseDomainResource(cholesterol);
				if (result == null) result = caseResource(cholesterol);
				if (result == null) result = caseBase(cholesterol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CHOLESTEROL_QUANTITY1: {
				CholesterolQuantity1 cholesterolQuantity1 = (CholesterolQuantity1)theEObject;
				T result = caseCholesterolQuantity1(cholesterolQuantity1);
				if (result == null) result = caseQuantity(cholesterolQuantity1);
				if (result == null) result = caseDataType(cholesterolQuantity1);
				if (result == null) result = caseElement(cholesterolQuantity1);
				if (result == null) result = caseBase(cholesterolQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CHOLESTEROL_REFERENCE_RANGE1: {
				CholesterolReferenceRange1 cholesterolReferenceRange1 = (CholesterolReferenceRange1)theEObject;
				T result = caseCholesterolReferenceRange1(cholesterolReferenceRange1);
				if (result == null) result = caseObservationReferenceRange(cholesterolReferenceRange1);
				if (result == null) result = caseBackboneElement(cholesterolReferenceRange1);
				if (result == null) result = caseDataType(cholesterolReferenceRange1);
				if (result == null) result = caseElement(cholesterolReferenceRange1);
				if (result == null) result = caseBase(cholesterolReferenceRange1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.TRIGLYCERIDE: {
				Triglyceride triglyceride = (Triglyceride)theEObject;
				T result = caseTriglyceride(triglyceride);
				if (result == null) result = caseObservation(triglyceride);
				if (result == null) result = caseDomainResource(triglyceride);
				if (result == null) result = caseResource(triglyceride);
				if (result == null) result = caseBase(triglyceride);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.TRIGLYCERIDE_REFERENCE_RANGE1: {
				TriglycerideReferenceRange1 triglycerideReferenceRange1 = (TriglycerideReferenceRange1)theEObject;
				T result = caseTriglycerideReferenceRange1(triglycerideReferenceRange1);
				if (result == null) result = caseObservationReferenceRange(triglycerideReferenceRange1);
				if (result == null) result = caseBackboneElement(triglycerideReferenceRange1);
				if (result == null) result = caseDataType(triglycerideReferenceRange1);
				if (result == null) result = caseElement(triglycerideReferenceRange1);
				if (result == null) result = caseBase(triglycerideReferenceRange1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.LDLCHOLESTEROL: {
				Ldlcholesterol ldlcholesterol = (Ldlcholesterol)theEObject;
				T result = caseLdlcholesterol(ldlcholesterol);
				if (result == null) result = caseObservation(ldlcholesterol);
				if (result == null) result = caseDomainResource(ldlcholesterol);
				if (result == null) result = caseResource(ldlcholesterol);
				if (result == null) result = caseBase(ldlcholesterol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.LDLCHOLESTEROL_REFERENCE_RANGE1: {
				LdlcholesterolReferenceRange1 ldlcholesterolReferenceRange1 = (LdlcholesterolReferenceRange1)theEObject;
				T result = caseLdlcholesterolReferenceRange1(ldlcholesterolReferenceRange1);
				if (result == null) result = caseObservationReferenceRange(ldlcholesterolReferenceRange1);
				if (result == null) result = caseBackboneElement(ldlcholesterolReferenceRange1);
				if (result == null) result = caseDataType(ldlcholesterolReferenceRange1);
				if (result == null) result = caseElement(ldlcholesterolReferenceRange1);
				if (result == null) result = caseBase(ldlcholesterolReferenceRange1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYTEMP: {
				Bodytemp bodytemp = (Bodytemp)theEObject;
				T result = caseBodytemp(bodytemp);
				if (result == null) result = caseVitalsigns(bodytemp);
				if (result == null) result = caseObservation(bodytemp);
				if (result == null) result = caseDomainResource(bodytemp);
				if (result == null) result = caseResource(bodytemp);
				if (result == null) result = caseBase(bodytemp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1: {
				BodytempCodeableConcept1 bodytempCodeableConcept1 = (BodytempCodeableConcept1)theEObject;
				T result = caseBodytempCodeableConcept1(bodytempCodeableConcept1);
				if (result == null) result = caseCodeableConcept(bodytempCodeableConcept1);
				if (result == null) result = caseDataType(bodytempCodeableConcept1);
				if (result == null) result = caseElement(bodytempCodeableConcept1);
				if (result == null) result = caseBase(bodytempCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1_CODING1: {
				BodytempCodeableConcept1Coding1 bodytempCodeableConcept1Coding1 = (BodytempCodeableConcept1Coding1)theEObject;
				T result = caseBodytempCodeableConcept1Coding1(bodytempCodeableConcept1Coding1);
				if (result == null) result = caseCoding(bodytempCodeableConcept1Coding1);
				if (result == null) result = caseDataType(bodytempCodeableConcept1Coding1);
				if (result == null) result = caseElement(bodytempCodeableConcept1Coding1);
				if (result == null) result = caseBase(bodytempCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYTEMP_QUANTITY1: {
				BodytempQuantity1 bodytempQuantity1 = (BodytempQuantity1)theEObject;
				T result = caseBodytempQuantity1(bodytempQuantity1);
				if (result == null) result = caseQuantity(bodytempQuantity1);
				if (result == null) result = caseDataType(bodytempQuantity1);
				if (result == null) result = caseElement(bodytempQuantity1);
				if (result == null) result = caseBase(bodytempQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.METADATA_RESOURCE: {
				MetadataResource metadataResource = (MetadataResource)theEObject;
				T result = caseMetadataResource(metadataResource);
				if (result == null) result = caseDomainResource(metadataResource);
				if (result == null) result = caseResource(metadataResource);
				if (result == null) result = caseBase(metadataResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HEARTRATE: {
				Heartrate heartrate = (Heartrate)theEObject;
				T result = caseHeartrate(heartrate);
				if (result == null) result = caseVitalsigns(heartrate);
				if (result == null) result = caseObservation(heartrate);
				if (result == null) result = caseDomainResource(heartrate);
				if (result == null) result = caseResource(heartrate);
				if (result == null) result = caseBase(heartrate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1: {
				HeartrateCodeableConcept1 heartrateCodeableConcept1 = (HeartrateCodeableConcept1)theEObject;
				T result = caseHeartrateCodeableConcept1(heartrateCodeableConcept1);
				if (result == null) result = caseCodeableConcept(heartrateCodeableConcept1);
				if (result == null) result = caseDataType(heartrateCodeableConcept1);
				if (result == null) result = caseElement(heartrateCodeableConcept1);
				if (result == null) result = caseBase(heartrateCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1_CODING1: {
				HeartrateCodeableConcept1Coding1 heartrateCodeableConcept1Coding1 = (HeartrateCodeableConcept1Coding1)theEObject;
				T result = caseHeartrateCodeableConcept1Coding1(heartrateCodeableConcept1Coding1);
				if (result == null) result = caseCoding(heartrateCodeableConcept1Coding1);
				if (result == null) result = caseDataType(heartrateCodeableConcept1Coding1);
				if (result == null) result = caseElement(heartrateCodeableConcept1Coding1);
				if (result == null) result = caseBase(heartrateCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HEARTRATE_QUANTITY1: {
				HeartrateQuantity1 heartrateQuantity1 = (HeartrateQuantity1)theEObject;
				T result = caseHeartrateQuantity1(heartrateQuantity1);
				if (result == null) result = caseQuantity(heartrateQuantity1);
				if (result == null) result = caseDataType(heartrateQuantity1);
				if (result == null) result = caseElement(heartrateQuantity1);
				if (result == null) result = caseBase(heartrateQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYHEIGHT: {
				Bodyheight bodyheight = (Bodyheight)theEObject;
				T result = caseBodyheight(bodyheight);
				if (result == null) result = caseVitalsigns(bodyheight);
				if (result == null) result = caseObservation(bodyheight);
				if (result == null) result = caseDomainResource(bodyheight);
				if (result == null) result = caseResource(bodyheight);
				if (result == null) result = caseBase(bodyheight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1: {
				BodyheightCodeableConcept1 bodyheightCodeableConcept1 = (BodyheightCodeableConcept1)theEObject;
				T result = caseBodyheightCodeableConcept1(bodyheightCodeableConcept1);
				if (result == null) result = caseCodeableConcept(bodyheightCodeableConcept1);
				if (result == null) result = caseDataType(bodyheightCodeableConcept1);
				if (result == null) result = caseElement(bodyheightCodeableConcept1);
				if (result == null) result = caseBase(bodyheightCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1_CODING1: {
				BodyheightCodeableConcept1Coding1 bodyheightCodeableConcept1Coding1 = (BodyheightCodeableConcept1Coding1)theEObject;
				T result = caseBodyheightCodeableConcept1Coding1(bodyheightCodeableConcept1Coding1);
				if (result == null) result = caseCoding(bodyheightCodeableConcept1Coding1);
				if (result == null) result = caseDataType(bodyheightCodeableConcept1Coding1);
				if (result == null) result = caseElement(bodyheightCodeableConcept1Coding1);
				if (result == null) result = caseBase(bodyheightCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYHEIGHT_QUANTITY1: {
				BodyheightQuantity1 bodyheightQuantity1 = (BodyheightQuantity1)theEObject;
				T result = caseBodyheightQuantity1(bodyheightQuantity1);
				if (result == null) result = caseQuantity(bodyheightQuantity1);
				if (result == null) result = caseDataType(bodyheightQuantity1);
				if (result == null) result = caseElement(bodyheightQuantity1);
				if (result == null) result = caseBase(bodyheightQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.ELEMENTDEFINITIONDE: {
				Elementdefinitionde elementdefinitionde = (Elementdefinitionde)theEObject;
				T result = caseElementdefinitionde(elementdefinitionde);
				if (result == null) result = caseElementDefinition(elementdefinitionde);
				if (result == null) result = caseBackboneElement(elementdefinitionde);
				if (result == null) result = caseDataType(elementdefinitionde);
				if (result == null) result = caseElement(elementdefinitionde);
				if (result == null) result = caseBase(elementdefinitionde);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.ELEMENTDEFINITIONDE_ELEMENT31: {
				ElementdefinitiondeElement31 elementdefinitiondeElement31 = (ElementdefinitiondeElement31)theEObject;
				T result = caseElementdefinitiondeElement31(elementdefinitiondeElement31);
				if (result == null) result = caseElementDefinitionElement3(elementdefinitiondeElement31);
				if (result == null) result = caseElement(elementdefinitiondeElement31);
				if (result == null) result = caseBase(elementdefinitiondeElement31);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.DIAGNOSTICREPORTGENETICS: {
				Diagnosticreportgenetics diagnosticreportgenetics = (Diagnosticreportgenetics)theEObject;
				T result = caseDiagnosticreportgenetics(diagnosticreportgenetics);
				if (result == null) result = caseDiagnosticReport(diagnosticreportgenetics);
				if (result == null) result = caseDomainResource(diagnosticreportgenetics);
				if (result == null) result = caseResource(diagnosticreportgenetics);
				if (result == null) result = caseBase(diagnosticreportgenetics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SHAREABLECODESYSTEM: {
				Shareablecodesystem shareablecodesystem = (Shareablecodesystem)theEObject;
				T result = caseShareablecodesystem(shareablecodesystem);
				if (result == null) result = caseCodeSystem(shareablecodesystem);
				if (result == null) result = caseDomainResource(shareablecodesystem);
				if (result == null) result = caseResource(shareablecodesystem);
				if (result == null) result = caseBase(shareablecodesystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SHAREABLECODESYSTEM_CONCEPT_DEFINITION1: {
				ShareablecodesystemConceptDefinition1 shareablecodesystemConceptDefinition1 = (ShareablecodesystemConceptDefinition1)theEObject;
				T result = caseShareablecodesystemConceptDefinition1(shareablecodesystemConceptDefinition1);
				if (result == null) result = caseCodeSystemConceptDefinition(shareablecodesystemConceptDefinition1);
				if (result == null) result = caseBackboneElement(shareablecodesystemConceptDefinition1);
				if (result == null) result = caseDataType(shareablecodesystemConceptDefinition1);
				if (result == null) result = caseElement(shareablecodesystemConceptDefinition1);
				if (result == null) result = caseBase(shareablecodesystemConceptDefinition1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.OXYGENSAT: {
				Oxygensat oxygensat = (Oxygensat)theEObject;
				T result = caseOxygensat(oxygensat);
				if (result == null) result = caseVitalsigns(oxygensat);
				if (result == null) result = caseObservation(oxygensat);
				if (result == null) result = caseDomainResource(oxygensat);
				if (result == null) result = caseResource(oxygensat);
				if (result == null) result = caseBase(oxygensat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1: {
				OxygensatCodeableConcept1 oxygensatCodeableConcept1 = (OxygensatCodeableConcept1)theEObject;
				T result = caseOxygensatCodeableConcept1(oxygensatCodeableConcept1);
				if (result == null) result = caseCodeableConcept(oxygensatCodeableConcept1);
				if (result == null) result = caseDataType(oxygensatCodeableConcept1);
				if (result == null) result = caseElement(oxygensatCodeableConcept1);
				if (result == null) result = caseBase(oxygensatCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1_CODING1: {
				OxygensatCodeableConcept1Coding1 oxygensatCodeableConcept1Coding1 = (OxygensatCodeableConcept1Coding1)theEObject;
				T result = caseOxygensatCodeableConcept1Coding1(oxygensatCodeableConcept1Coding1);
				if (result == null) result = caseCoding(oxygensatCodeableConcept1Coding1);
				if (result == null) result = caseDataType(oxygensatCodeableConcept1Coding1);
				if (result == null) result = caseElement(oxygensatCodeableConcept1Coding1);
				if (result == null) result = caseBase(oxygensatCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.OXYGENSAT_QUANTITY1: {
				OxygensatQuantity1 oxygensatQuantity1 = (OxygensatQuantity1)theEObject;
				T result = caseOxygensatQuantity1(oxygensatQuantity1);
				if (result == null) result = caseQuantity(oxygensatQuantity1);
				if (result == null) result = caseDataType(oxygensatQuantity1);
				if (result == null) result = caseElement(oxygensatQuantity1);
				if (result == null) result = caseBase(oxygensatQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CLINICALDOCUMENT: {
				Clinicaldocument clinicaldocument = (Clinicaldocument)theEObject;
				T result = caseClinicaldocument(clinicaldocument);
				if (result == null) result = caseComposition(clinicaldocument);
				if (result == null) result = caseDomainResource(clinicaldocument);
				if (result == null) result = caseResource(clinicaldocument);
				if (result == null) result = caseBase(clinicaldocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CQLLIBRARY: {
				Cqllibrary cqllibrary = (Cqllibrary)theEObject;
				T result = caseCqllibrary(cqllibrary);
				if (result == null) result = caseLibrary(cqllibrary);
				if (result == null) result = caseDomainResource(cqllibrary);
				if (result == null) result = caseResource(cqllibrary);
				if (result == null) result = caseBase(cqllibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HEADCIRCUM: {
				Headcircum headcircum = (Headcircum)theEObject;
				T result = caseHeadcircum(headcircum);
				if (result == null) result = caseVitalsigns(headcircum);
				if (result == null) result = caseObservation(headcircum);
				if (result == null) result = caseDomainResource(headcircum);
				if (result == null) result = caseResource(headcircum);
				if (result == null) result = caseBase(headcircum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1: {
				HeadcircumCodeableConcept1 headcircumCodeableConcept1 = (HeadcircumCodeableConcept1)theEObject;
				T result = caseHeadcircumCodeableConcept1(headcircumCodeableConcept1);
				if (result == null) result = caseCodeableConcept(headcircumCodeableConcept1);
				if (result == null) result = caseDataType(headcircumCodeableConcept1);
				if (result == null) result = caseElement(headcircumCodeableConcept1);
				if (result == null) result = caseBase(headcircumCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1_CODING1: {
				HeadcircumCodeableConcept1Coding1 headcircumCodeableConcept1Coding1 = (HeadcircumCodeableConcept1Coding1)theEObject;
				T result = caseHeadcircumCodeableConcept1Coding1(headcircumCodeableConcept1Coding1);
				if (result == null) result = caseCoding(headcircumCodeableConcept1Coding1);
				if (result == null) result = caseDataType(headcircumCodeableConcept1Coding1);
				if (result == null) result = caseElement(headcircumCodeableConcept1Coding1);
				if (result == null) result = caseBase(headcircumCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HEADCIRCUM_QUANTITY1: {
				HeadcircumQuantity1 headcircumQuantity1 = (HeadcircumQuantity1)theEObject;
				T result = caseHeadcircumQuantity1(headcircumQuantity1);
				if (result == null) result = caseQuantity(headcircumQuantity1);
				if (result == null) result = caseDataType(headcircumQuantity1);
				if (result == null) result = caseElement(headcircumQuantity1);
				if (result == null) result = caseBase(headcircumQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SYNCHRONIZATIONPLANDEFINITION: {
				Synchronizationplandefinition synchronizationplandefinition = (Synchronizationplandefinition)theEObject;
				T result = caseSynchronizationplandefinition(synchronizationplandefinition);
				if (result == null) result = casePlanDefinition(synchronizationplandefinition);
				if (result == null) result = caseDomainResource(synchronizationplandefinition);
				if (result == null) result = caseResource(synchronizationplandefinition);
				if (result == null) result = caseBase(synchronizationplandefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.VITALSPANEL: {
				Vitalspanel vitalspanel = (Vitalspanel)theEObject;
				T result = caseVitalspanel(vitalspanel);
				if (result == null) result = caseVitalsigns(vitalspanel);
				if (result == null) result = caseObservation(vitalspanel);
				if (result == null) result = caseDomainResource(vitalspanel);
				if (result == null) result = caseResource(vitalspanel);
				if (result == null) result = caseBase(vitalspanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1: {
				VitalspanelCodeableConcept1 vitalspanelCodeableConcept1 = (VitalspanelCodeableConcept1)theEObject;
				T result = caseVitalspanelCodeableConcept1(vitalspanelCodeableConcept1);
				if (result == null) result = caseCodeableConcept(vitalspanelCodeableConcept1);
				if (result == null) result = caseDataType(vitalspanelCodeableConcept1);
				if (result == null) result = caseElement(vitalspanelCodeableConcept1);
				if (result == null) result = caseBase(vitalspanelCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1_CODING1: {
				VitalspanelCodeableConcept1Coding1 vitalspanelCodeableConcept1Coding1 = (VitalspanelCodeableConcept1Coding1)theEObject;
				T result = caseVitalspanelCodeableConcept1Coding1(vitalspanelCodeableConcept1Coding1);
				if (result == null) result = caseCoding(vitalspanelCodeableConcept1Coding1);
				if (result == null) result = caseDataType(vitalspanelCodeableConcept1Coding1);
				if (result == null) result = caseElement(vitalspanelCodeableConcept1Coding1);
				if (result == null) result = caseBase(vitalspanelCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SYNTHESIS: {
				Synthesis synthesis = (Synthesis)theEObject;
				T result = caseSynthesis(synthesis);
				if (result == null) result = caseEvidence(synthesis);
				if (result == null) result = caseDomainResource(synthesis);
				if (result == null) result = caseResource(synthesis);
				if (result == null) result = caseBase(synthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION: {
				SubstanceDefinition substanceDefinition = (SubstanceDefinition)theEObject;
				T result = caseSubstanceDefinition(substanceDefinition);
				if (result == null) result = caseDomainResource(substanceDefinition);
				if (result == null) result = caseResource(substanceDefinition);
				if (result == null) result = caseBase(substanceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_MOIETY: {
				SubstanceDefinitionMoiety substanceDefinitionMoiety = (SubstanceDefinitionMoiety)theEObject;
				T result = caseSubstanceDefinitionMoiety(substanceDefinitionMoiety);
				if (result == null) result = caseBackboneElement(substanceDefinitionMoiety);
				if (result == null) result = caseDataType(substanceDefinitionMoiety);
				if (result == null) result = caseElement(substanceDefinitionMoiety);
				if (result == null) result = caseBase(substanceDefinitionMoiety);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY: {
				SubstanceDefinitionProperty substanceDefinitionProperty = (SubstanceDefinitionProperty)theEObject;
				T result = caseSubstanceDefinitionProperty(substanceDefinitionProperty);
				if (result == null) result = caseBackboneElement(substanceDefinitionProperty);
				if (result == null) result = caseDataType(substanceDefinitionProperty);
				if (result == null) result = caseElement(substanceDefinitionProperty);
				if (result == null) result = caseBase(substanceDefinitionProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE: {
				SubstanceDefinitionStructure substanceDefinitionStructure = (SubstanceDefinitionStructure)theEObject;
				T result = caseSubstanceDefinitionStructure(substanceDefinitionStructure);
				if (result == null) result = caseBackboneElement(substanceDefinitionStructure);
				if (result == null) result = caseDataType(substanceDefinitionStructure);
				if (result == null) result = caseElement(substanceDefinitionStructure);
				if (result == null) result = caseBase(substanceDefinitionStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE: {
				SubstanceDefinitionStructureIsotope substanceDefinitionStructureIsotope = (SubstanceDefinitionStructureIsotope)theEObject;
				T result = caseSubstanceDefinitionStructureIsotope(substanceDefinitionStructureIsotope);
				if (result == null) result = caseBackboneElement(substanceDefinitionStructureIsotope);
				if (result == null) result = caseDataType(substanceDefinitionStructureIsotope);
				if (result == null) result = caseElement(substanceDefinitionStructureIsotope);
				if (result == null) result = caseBase(substanceDefinitionStructureIsotope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT: {
				SubstanceDefinitionStructureIsotopeMolecularWeight substanceDefinitionStructureIsotopeMolecularWeight = (SubstanceDefinitionStructureIsotopeMolecularWeight)theEObject;
				T result = caseSubstanceDefinitionStructureIsotopeMolecularWeight(substanceDefinitionStructureIsotopeMolecularWeight);
				if (result == null) result = caseBackboneElement(substanceDefinitionStructureIsotopeMolecularWeight);
				if (result == null) result = caseDataType(substanceDefinitionStructureIsotopeMolecularWeight);
				if (result == null) result = caseElement(substanceDefinitionStructureIsotopeMolecularWeight);
				if (result == null) result = caseBase(substanceDefinitionStructureIsotopeMolecularWeight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION: {
				SubstanceDefinitionStructureRepresentation substanceDefinitionStructureRepresentation = (SubstanceDefinitionStructureRepresentation)theEObject;
				T result = caseSubstanceDefinitionStructureRepresentation(substanceDefinitionStructureRepresentation);
				if (result == null) result = caseBackboneElement(substanceDefinitionStructureRepresentation);
				if (result == null) result = caseDataType(substanceDefinitionStructureRepresentation);
				if (result == null) result = caseElement(substanceDefinitionStructureRepresentation);
				if (result == null) result = caseBase(substanceDefinitionStructureRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_CODE: {
				SubstanceDefinitionCode substanceDefinitionCode = (SubstanceDefinitionCode)theEObject;
				T result = caseSubstanceDefinitionCode(substanceDefinitionCode);
				if (result == null) result = caseBackboneElement(substanceDefinitionCode);
				if (result == null) result = caseDataType(substanceDefinitionCode);
				if (result == null) result = caseElement(substanceDefinitionCode);
				if (result == null) result = caseBase(substanceDefinitionCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME: {
				SubstanceDefinitionName substanceDefinitionName = (SubstanceDefinitionName)theEObject;
				T result = caseSubstanceDefinitionName(substanceDefinitionName);
				if (result == null) result = caseBackboneElement(substanceDefinitionName);
				if (result == null) result = caseDataType(substanceDefinitionName);
				if (result == null) result = caseElement(substanceDefinitionName);
				if (result == null) result = caseBase(substanceDefinitionName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME_OFFICIAL: {
				SubstanceDefinitionNameOfficial substanceDefinitionNameOfficial = (SubstanceDefinitionNameOfficial)theEObject;
				T result = caseSubstanceDefinitionNameOfficial(substanceDefinitionNameOfficial);
				if (result == null) result = caseBackboneElement(substanceDefinitionNameOfficial);
				if (result == null) result = caseDataType(substanceDefinitionNameOfficial);
				if (result == null) result = caseElement(substanceDefinitionNameOfficial);
				if (result == null) result = caseBase(substanceDefinitionNameOfficial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP: {
				SubstanceDefinitionRelationship substanceDefinitionRelationship = (SubstanceDefinitionRelationship)theEObject;
				T result = caseSubstanceDefinitionRelationship(substanceDefinitionRelationship);
				if (result == null) result = caseBackboneElement(substanceDefinitionRelationship);
				if (result == null) result = caseDataType(substanceDefinitionRelationship);
				if (result == null) result = caseElement(substanceDefinitionRelationship);
				if (result == null) result = caseBase(substanceDefinitionRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.PROVENANCERELEVANTHISTORY: {
				Provenancerelevanthistory provenancerelevanthistory = (Provenancerelevanthistory)theEObject;
				T result = caseProvenancerelevanthistory(provenancerelevanthistory);
				if (result == null) result = caseProvenance(provenancerelevanthistory);
				if (result == null) result = caseDomainResource(provenancerelevanthistory);
				if (result == null) result = caseResource(provenancerelevanthistory);
				if (result == null) result = caseBase(provenancerelevanthistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.PROVENANCERELEVANTHISTORY_AGENT1: {
				ProvenancerelevanthistoryAgent1 provenancerelevanthistoryAgent1 = (ProvenancerelevanthistoryAgent1)theEObject;
				T result = caseProvenancerelevanthistoryAgent1(provenancerelevanthistoryAgent1);
				if (result == null) result = caseProvenanceAgent(provenancerelevanthistoryAgent1);
				if (result == null) result = caseBackboneElement(provenancerelevanthistoryAgent1);
				if (result == null) result = caseDataType(provenancerelevanthistoryAgent1);
				if (result == null) result = caseElement(provenancerelevanthistoryAgent1);
				if (result == null) result = caseBase(provenancerelevanthistoryAgent1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CATALOG: {
				Catalog catalog = (Catalog)theEObject;
				T result = caseCatalog(catalog);
				if (result == null) result = caseComposition(catalog);
				if (result == null) result = caseDomainResource(catalog);
				if (result == null) result = caseResource(catalog);
				if (result == null) result = caseBase(catalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CATALOG_SECTION1: {
				CatalogSection1 catalogSection1 = (CatalogSection1)theEObject;
				T result = caseCatalogSection1(catalogSection1);
				if (result == null) result = caseCompositionSection(catalogSection1);
				if (result == null) result = caseBackboneElement(catalogSection1);
				if (result == null) result = caseDataType(catalogSection1);
				if (result == null) result = caseElement(catalogSection1);
				if (result == null) result = caseBase(catalogSection1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYWEIGHT: {
				Bodyweight bodyweight = (Bodyweight)theEObject;
				T result = caseBodyweight(bodyweight);
				if (result == null) result = caseVitalsigns(bodyweight);
				if (result == null) result = caseObservation(bodyweight);
				if (result == null) result = caseDomainResource(bodyweight);
				if (result == null) result = caseResource(bodyweight);
				if (result == null) result = caseBase(bodyweight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1: {
				BodyweightCodeableConcept1 bodyweightCodeableConcept1 = (BodyweightCodeableConcept1)theEObject;
				T result = caseBodyweightCodeableConcept1(bodyweightCodeableConcept1);
				if (result == null) result = caseCodeableConcept(bodyweightCodeableConcept1);
				if (result == null) result = caseDataType(bodyweightCodeableConcept1);
				if (result == null) result = caseElement(bodyweightCodeableConcept1);
				if (result == null) result = caseBase(bodyweightCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1_CODING1: {
				BodyweightCodeableConcept1Coding1 bodyweightCodeableConcept1Coding1 = (BodyweightCodeableConcept1Coding1)theEObject;
				T result = caseBodyweightCodeableConcept1Coding1(bodyweightCodeableConcept1Coding1);
				if (result == null) result = caseCoding(bodyweightCodeableConcept1Coding1);
				if (result == null) result = caseDataType(bodyweightCodeableConcept1Coding1);
				if (result == null) result = caseElement(bodyweightCodeableConcept1Coding1);
				if (result == null) result = caseBase(bodyweightCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BODYWEIGHT_QUANTITY1: {
				BodyweightQuantity1 bodyweightQuantity1 = (BodyweightQuantity1)theEObject;
				T result = caseBodyweightQuantity1(bodyweightQuantity1);
				if (result == null) result = caseQuantity(bodyweightQuantity1);
				if (result == null) result = caseDataType(bodyweightQuantity1);
				if (result == null) result = caseElement(bodyweightQuantity1);
				if (result == null) result = caseBase(bodyweightQuantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP: {
				Bp bp = (Bp)theEObject;
				T result = caseBp(bp);
				if (result == null) result = caseVitalsigns(bp);
				if (result == null) result = caseObservation(bp);
				if (result == null) result = caseDomainResource(bp);
				if (result == null) result = caseResource(bp);
				if (result == null) result = caseBase(bp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_CODEABLE_CONCEPT1: {
				BpCodeableConcept1 bpCodeableConcept1 = (BpCodeableConcept1)theEObject;
				T result = caseBpCodeableConcept1(bpCodeableConcept1);
				if (result == null) result = caseCodeableConcept(bpCodeableConcept1);
				if (result == null) result = caseDataType(bpCodeableConcept1);
				if (result == null) result = caseElement(bpCodeableConcept1);
				if (result == null) result = caseBase(bpCodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_CODEABLE_CONCEPT1_CODING1: {
				BpCodeableConcept1Coding1 bpCodeableConcept1Coding1 = (BpCodeableConcept1Coding1)theEObject;
				T result = caseBpCodeableConcept1Coding1(bpCodeableConcept1Coding1);
				if (result == null) result = caseCoding(bpCodeableConcept1Coding1);
				if (result == null) result = caseDataType(bpCodeableConcept1Coding1);
				if (result == null) result = caseElement(bpCodeableConcept1Coding1);
				if (result == null) result = caseBase(bpCodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_COMPONENT11: {
				BpComponent11 bpComponent11 = (BpComponent11)theEObject;
				T result = caseBpComponent11(bpComponent11);
				if (result == null) result = caseVitalsignsComponent1(bpComponent11);
				if (result == null) result = caseObservationComponent(bpComponent11);
				if (result == null) result = caseBackboneElement(bpComponent11);
				if (result == null) result = caseDataType(bpComponent11);
				if (result == null) result = caseElement(bpComponent11);
				if (result == null) result = caseBase(bpComponent11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1: {
				BpComponent11CodeableConcept1 bpComponent11CodeableConcept1 = (BpComponent11CodeableConcept1)theEObject;
				T result = caseBpComponent11CodeableConcept1(bpComponent11CodeableConcept1);
				if (result == null) result = caseCodeableConcept(bpComponent11CodeableConcept1);
				if (result == null) result = caseDataType(bpComponent11CodeableConcept1);
				if (result == null) result = caseElement(bpComponent11CodeableConcept1);
				if (result == null) result = caseBase(bpComponent11CodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1: {
				BpComponent11CodeableConcept1Coding1 bpComponent11CodeableConcept1Coding1 = (BpComponent11CodeableConcept1Coding1)theEObject;
				T result = caseBpComponent11CodeableConcept1Coding1(bpComponent11CodeableConcept1Coding1);
				if (result == null) result = caseCoding(bpComponent11CodeableConcept1Coding1);
				if (result == null) result = caseDataType(bpComponent11CodeableConcept1Coding1);
				if (result == null) result = caseElement(bpComponent11CodeableConcept1Coding1);
				if (result == null) result = caseBase(bpComponent11CodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_COMPONENT11_QUANTITY1: {
				BpComponent11Quantity1 bpComponent11Quantity1 = (BpComponent11Quantity1)theEObject;
				T result = caseBpComponent11Quantity1(bpComponent11Quantity1);
				if (result == null) result = caseQuantity(bpComponent11Quantity1);
				if (result == null) result = caseDataType(bpComponent11Quantity1);
				if (result == null) result = caseElement(bpComponent11Quantity1);
				if (result == null) result = caseBase(bpComponent11Quantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_COMPONENT12: {
				BpComponent12 bpComponent12 = (BpComponent12)theEObject;
				T result = caseBpComponent12(bpComponent12);
				if (result == null) result = caseVitalsignsComponent1(bpComponent12);
				if (result == null) result = caseObservationComponent(bpComponent12);
				if (result == null) result = caseBackboneElement(bpComponent12);
				if (result == null) result = caseDataType(bpComponent12);
				if (result == null) result = caseElement(bpComponent12);
				if (result == null) result = caseBase(bpComponent12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1: {
				BpComponent12CodeableConcept1 bpComponent12CodeableConcept1 = (BpComponent12CodeableConcept1)theEObject;
				T result = caseBpComponent12CodeableConcept1(bpComponent12CodeableConcept1);
				if (result == null) result = caseCodeableConcept(bpComponent12CodeableConcept1);
				if (result == null) result = caseDataType(bpComponent12CodeableConcept1);
				if (result == null) result = caseElement(bpComponent12CodeableConcept1);
				if (result == null) result = caseBase(bpComponent12CodeableConcept1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1: {
				BpComponent12CodeableConcept1Coding1 bpComponent12CodeableConcept1Coding1 = (BpComponent12CodeableConcept1Coding1)theEObject;
				T result = caseBpComponent12CodeableConcept1Coding1(bpComponent12CodeableConcept1Coding1);
				if (result == null) result = caseCoding(bpComponent12CodeableConcept1Coding1);
				if (result == null) result = caseDataType(bpComponent12CodeableConcept1Coding1);
				if (result == null) result = caseElement(bpComponent12CodeableConcept1Coding1);
				if (result == null) result = caseBase(bpComponent12CodeableConcept1Coding1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.BP_COMPONENT12_QUANTITY1: {
				BpComponent12Quantity1 bpComponent12Quantity1 = (BpComponent12Quantity1)theEObject;
				T result = caseBpComponent12Quantity1(bpComponent12Quantity1);
				if (result == null) result = caseQuantity(bpComponent12Quantity1);
				if (result == null) result = caseDataType(bpComponent12Quantity1);
				if (result == null) result = caseElement(bpComponent12Quantity1);
				if (result == null) result = caseBase(bpComponent12Quantity1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SERVICEREQUESTGENETICS: {
				Servicerequestgenetics servicerequestgenetics = (Servicerequestgenetics)theEObject;
				T result = caseServicerequestgenetics(servicerequestgenetics);
				if (result == null) result = caseServiceRequest(servicerequestgenetics);
				if (result == null) result = caseDomainResource(servicerequestgenetics);
				if (result == null) result = caseResource(servicerequestgenetics);
				if (result == null) result = caseBase(servicerequestgenetics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.SHAREABLEVALUESET: {
				Shareablevalueset shareablevalueset = (Shareablevalueset)theEObject;
				T result = caseShareablevalueset(shareablevalueset);
				if (result == null) result = caseValueSet(shareablevalueset);
				if (result == null) result = caseDomainResource(shareablevalueset);
				if (result == null) result = caseResource(shareablevalueset);
				if (result == null) result = caseBase(shareablevalueset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.GROUPDEFINITION: {
				Groupdefinition groupdefinition = (Groupdefinition)theEObject;
				T result = caseGroupdefinition(groupdefinition);
				if (result == null) result = caseGroup(groupdefinition);
				if (result == null) result = caseDomainResource(groupdefinition);
				if (result == null) result = caseResource(groupdefinition);
				if (result == null) result = caseBase(groupdefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.ACTUALGROUP: {
				Actualgroup actualgroup = (Actualgroup)theEObject;
				T result = caseActualgroup(actualgroup);
				if (result == null) result = caseGroup(actualgroup);
				if (result == null) result = caseDomainResource(actualgroup);
				if (result == null) result = caseResource(actualgroup);
				if (result == null) result = caseBase(actualgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.HLARESULT: {
				Hlaresult hlaresult = (Hlaresult)theEObject;
				T result = caseHlaresult(hlaresult);
				if (result == null) result = caseDiagnosticReport(hlaresult);
				if (result == null) result = caseDomainResource(hlaresult);
				if (result == null) result = caseResource(hlaresult);
				if (result == null) result = caseBase(hlaresult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CDSHOOKSREQUESTGROUP: {
				Cdshooksrequestgroup cdshooksrequestgroup = (Cdshooksrequestgroup)theEObject;
				T result = caseCdshooksrequestgroup(cdshooksrequestgroup);
				if (result == null) result = caseRequestGroup(cdshooksrequestgroup);
				if (result == null) result = caseDomainResource(cdshooksrequestgroup);
				if (result == null) result = caseResource(cdshooksrequestgroup);
				if (result == null) result = caseBase(cdshooksrequestgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.CDSHOOKSREQUESTGROUP_ACTION1: {
				CdshooksrequestgroupAction1 cdshooksrequestgroupAction1 = (CdshooksrequestgroupAction1)theEObject;
				T result = caseCdshooksrequestgroupAction1(cdshooksrequestgroupAction1);
				if (result == null) result = caseRequestGroupAction(cdshooksrequestgroupAction1);
				if (result == null) result = caseBackboneElement(cdshooksrequestgroupAction1);
				if (result == null) result = caseDataType(cdshooksrequestgroupAction1);
				if (result == null) result = caseElement(cdshooksrequestgroupAction1);
				if (result == null) result = caseBase(cdshooksrequestgroupAction1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilesPackage.OBSERVATIONGENETICS: {
				Observationgenetics observationgenetics = (Observationgenetics)theEObject;
				T result = caseObservationgenetics(observationgenetics);
				if (result == null) result = caseObservation(observationgenetics);
				if (result == null) result = caseDomainResource(observationgenetics);
				if (result == null) result = caseResource(observationgenetics);
				if (result == null) result = caseBase(observationgenetics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picoelement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picoelement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePicoelement(Picoelement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picoelement Characteristic1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picoelement Characteristic1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePicoelementCharacteristic1(PicoelementCharacteristic1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bmi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bmi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBmi(Bmi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitalsigns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitalsigns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalsigns(Vitalsigns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitalsigns Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitalsigns Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalsignsCodeableConcept1(VitalsignsCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitalsigns Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitalsigns Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalsignsCodeableConcept1Coding1(VitalsignsCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitalsigns Component1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitalsigns Component1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalsignsComponent1(VitalsignsComponent1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bmi Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bmi Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBmiCodeableConcept1(BmiCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bmi Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bmi Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBmiCodeableConcept1Coding1(BmiCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bmi Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bmi Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBmiQuantity1(BmiQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devicemetricobservation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devicemetricobservation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevicemetricobservation(Devicemetricobservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cdshooksserviceplandefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cdshooksserviceplandefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdshooksserviceplandefinition(Cdshooksserviceplandefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cdshooksserviceplandefinition Action1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cdshooksserviceplandefinition Action1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdshooksserviceplandefinitionAction1(CdshooksserviceplandefinitionAction1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cqfquestionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cqfquestionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCqfquestionnaire(Cqfquestionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computableplandefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computableplandefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputableplandefinition(Computableplandefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shareablelibrary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shareablelibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareablelibrary(Shareablelibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cdshooksguidanceresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cdshooksguidanceresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdshooksguidanceresponse(Cdshooksguidanceresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shareableactivitydefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shareableactivitydefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareableactivitydefinition(Shareableactivitydefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shareablemeasure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shareablemeasure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareablemeasure(Shareablemeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resprate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resprate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResprate(Resprate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resprate Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resprate Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResprateCodeableConcept1(ResprateCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resprate Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resprate Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResprateCodeableConcept1Coding1(ResprateCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resprate Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resprate Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResprateQuantity1(ResprateQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familymemberhistorygenetic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familymemberhistorygenetic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilymemberhistorygenetic(Familymemberhistorygenetic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Familymemberhistorygenetic Condition1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Familymemberhistorygenetic Condition1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilymemberhistorygeneticCondition1(FamilymemberhistorygeneticCondition1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hdlcholesterol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hdlcholesterol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHdlcholesterol(Hdlcholesterol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hdlcholesterol Reference Range1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hdlcholesterol Reference Range1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHdlcholesterolReferenceRange1(HdlcholesterolReferenceRange1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shareableplandefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shareableplandefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareableplandefinition(Shareableplandefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lipidprofile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lipidprofile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLipidprofile(Lipidprofile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cholesterol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cholesterol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCholesterol(Cholesterol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cholesterol Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cholesterol Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCholesterolQuantity1(CholesterolQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cholesterol Reference Range1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cholesterol Reference Range1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCholesterolReferenceRange1(CholesterolReferenceRange1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triglyceride</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triglyceride</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriglyceride(Triglyceride object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triglyceride Reference Range1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triglyceride Reference Range1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriglycerideReferenceRange1(TriglycerideReferenceRange1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ldlcholesterol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ldlcholesterol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLdlcholesterol(Ldlcholesterol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ldlcholesterol Reference Range1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ldlcholesterol Reference Range1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLdlcholesterolReferenceRange1(LdlcholesterolReferenceRange1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodytemp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodytemp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodytemp(Bodytemp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodytemp Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodytemp Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodytempCodeableConcept1(BodytempCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodytemp Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodytemp Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodytempCodeableConcept1Coding1(BodytempCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodytemp Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodytemp Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodytempQuantity1(BodytempQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataResource(MetadataResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heartrate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heartrate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartrate(Heartrate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heartrate Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heartrate Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartrateCodeableConcept1(HeartrateCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heartrate Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heartrate Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartrateCodeableConcept1Coding1(HeartrateCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heartrate Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heartrate Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartrateQuantity1(HeartrateQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodyheight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodyheight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyheight(Bodyheight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodyheight Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodyheight Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyheightCodeableConcept1(BodyheightCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodyheight Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodyheight Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyheightCodeableConcept1Coding1(BodyheightCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodyheight Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodyheight Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyheightQuantity1(BodyheightQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementdefinitionde</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementdefinitionde</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementdefinitionde(Elementdefinitionde object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementdefinitionde Element31</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementdefinitionde Element31</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementdefinitiondeElement31(ElementdefinitiondeElement31 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnosticreportgenetics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnosticreportgenetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticreportgenetics(Diagnosticreportgenetics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shareablecodesystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shareablecodesystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareablecodesystem(Shareablecodesystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shareablecodesystem Concept Definition1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shareablecodesystem Concept Definition1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareablecodesystemConceptDefinition1(ShareablecodesystemConceptDefinition1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oxygensat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oxygensat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOxygensat(Oxygensat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oxygensat Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oxygensat Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOxygensatCodeableConcept1(OxygensatCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oxygensat Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oxygensat Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOxygensatCodeableConcept1Coding1(OxygensatCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oxygensat Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oxygensat Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOxygensatQuantity1(OxygensatQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinicaldocument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinicaldocument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicaldocument(Clinicaldocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cqllibrary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cqllibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCqllibrary(Cqllibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Headcircum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Headcircum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadcircum(Headcircum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Headcircum Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Headcircum Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadcircumCodeableConcept1(HeadcircumCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Headcircum Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Headcircum Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadcircumCodeableConcept1Coding1(HeadcircumCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Headcircum Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Headcircum Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadcircumQuantity1(HeadcircumQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronizationplandefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronizationplandefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationplandefinition(Synchronizationplandefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitalspanel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitalspanel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalspanel(Vitalspanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitalspanel Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitalspanel Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalspanelCodeableConcept1(VitalspanelCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitalspanel Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitalspanel Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalspanelCodeableConcept1Coding1(VitalspanelCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynthesis(Synthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinition(SubstanceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Moiety</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Moiety</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionMoiety(SubstanceDefinitionMoiety object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionProperty(SubstanceDefinitionProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionStructure(SubstanceDefinitionStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Structure Isotope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Structure Isotope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionStructureIsotope(SubstanceDefinitionStructureIsotope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Structure Isotope Molecular Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Structure Isotope Molecular Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionStructureIsotopeMolecularWeight(SubstanceDefinitionStructureIsotopeMolecularWeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Structure Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Structure Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionStructureRepresentation(SubstanceDefinitionStructureRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionCode(SubstanceDefinitionCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionName(SubstanceDefinitionName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Name Official</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Name Official</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionNameOfficial(SubstanceDefinitionNameOfficial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Definition Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Definition Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceDefinitionRelationship(SubstanceDefinitionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenancerelevanthistory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenancerelevanthistory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenancerelevanthistory(Provenancerelevanthistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provenancerelevanthistory Agent1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provenancerelevanthistory Agent1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvenancerelevanthistoryAgent1(ProvenancerelevanthistoryAgent1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalog(Catalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Section1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Section1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogSection1(CatalogSection1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodyweight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodyweight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyweight(Bodyweight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodyweight Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodyweight Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyweightCodeableConcept1(BodyweightCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodyweight Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodyweight Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyweightCodeableConcept1Coding1(BodyweightCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bodyweight Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bodyweight Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyweightQuantity1(BodyweightQuantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBp(Bp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpCodeableConcept1(BpCodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpCodeableConcept1Coding1(BpCodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Component11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Component11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpComponent11(BpComponent11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Component11 Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Component11 Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpComponent11CodeableConcept1(BpComponent11CodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Component11 Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Component11 Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpComponent11CodeableConcept1Coding1(BpComponent11CodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Component11 Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Component11 Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpComponent11Quantity1(BpComponent11Quantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Component12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Component12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpComponent12(BpComponent12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Component12 Codeable Concept1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Component12 Codeable Concept1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpComponent12CodeableConcept1(BpComponent12CodeableConcept1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Component12 Codeable Concept1 Coding1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Component12 Codeable Concept1 Coding1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpComponent12CodeableConcept1Coding1(BpComponent12CodeableConcept1Coding1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bp Component12 Quantity1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bp Component12 Quantity1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpComponent12Quantity1(BpComponent12Quantity1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicerequestgenetics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicerequestgenetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicerequestgenetics(Servicerequestgenetics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shareablevalueset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shareablevalueset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareablevalueset(Shareablevalueset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groupdefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groupdefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupdefinition(Groupdefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actualgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actualgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualgroup(Actualgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hlaresult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hlaresult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHlaresult(Hlaresult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cdshooksrequestgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cdshooksrequestgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdshooksrequestgroup(Cdshooksrequestgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cdshooksrequestgroup Action1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cdshooksrequestgroup Action1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdshooksrequestgroupAction1(CdshooksrequestgroupAction1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observationgenetics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observationgenetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationgenetics(Observationgenetics object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codeable Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeableConcept(CodeableConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoding(Coding object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinition(ElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition Element3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition Element3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinitionElement3(ElementDefinitionElement3 object) {
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

} //ProfilesSwitch
