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
package org.hl7.fhir;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public interface FhirFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FhirFactory eINSTANCE = org.hl7.fhir.impl.FhirFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Account Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Status</em>'.
	 * @generated
	 */
	AccountStatus createAccountStatus();

	/**
	 * Returns a new object of class '<em>Action Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Definition</em>'.
	 * @generated
	 */
	ActionDefinition createActionDefinition();

	/**
	 * Returns a new object of class '<em>Action Definition Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Definition Behavior</em>'.
	 * @generated
	 */
	ActionDefinitionBehavior createActionDefinitionBehavior();

	/**
	 * Returns a new object of class '<em>Action Definition Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Definition Customization</em>'.
	 * @generated
	 */
	ActionDefinitionCustomization createActionDefinitionCustomization();

	/**
	 * Returns a new object of class '<em>Action Definition Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Definition Related Action</em>'.
	 * @generated
	 */
	ActionDefinitionRelatedAction createActionDefinitionRelatedAction();

	/**
	 * Returns a new object of class '<em>Action List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action List</em>'.
	 * @generated
	 */
	ActionList createActionList();

	/**
	 * Returns a new object of class '<em>Action Relationship Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Relationship Anchor</em>'.
	 * @generated
	 */
	ActionRelationshipAnchor createActionRelationshipAnchor();

	/**
	 * Returns a new object of class '<em>Action Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Relationship Type</em>'.
	 * @generated
	 */
	ActionRelationshipType createActionRelationshipType();

	/**
	 * Returns a new object of class '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Type</em>'.
	 * @generated
	 */
	ActionType createActionType();

	/**
	 * Returns a new object of class '<em>Activity Definition Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Definition Category</em>'.
	 * @generated
	 */
	ActivityDefinitionCategory createActivityDefinitionCategory();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Type</em>'.
	 * @generated
	 */
	AddressType createAddressType();

	/**
	 * Returns a new object of class '<em>Address Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Use</em>'.
	 * @generated
	 */
	AddressUse createAddressUse();

	/**
	 * Returns a new object of class '<em>Administrative Gender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Administrative Gender</em>'.
	 * @generated
	 */
	AdministrativeGender createAdministrativeGender();

	/**
	 * Returns a new object of class '<em>Age</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age</em>'.
	 * @generated
	 */
	Age createAge();

	/**
	 * Returns a new object of class '<em>Aggregation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Mode</em>'.
	 * @generated
	 */
	AggregationMode createAggregationMode();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance</em>'.
	 * @generated
	 */
	AllergyIntolerance createAllergyIntolerance();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Category</em>'.
	 * @generated
	 */
	AllergyIntoleranceCategory createAllergyIntoleranceCategory();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Certainty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Certainty</em>'.
	 * @generated
	 */
	AllergyIntoleranceCertainty createAllergyIntoleranceCertainty();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Criticality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Criticality</em>'.
	 * @generated
	 */
	AllergyIntoleranceCriticality createAllergyIntoleranceCriticality();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Reaction</em>'.
	 * @generated
	 */
	AllergyIntoleranceReaction createAllergyIntoleranceReaction();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Severity</em>'.
	 * @generated
	 */
	AllergyIntoleranceSeverity createAllergyIntoleranceSeverity();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Status</em>'.
	 * @generated
	 */
	AllergyIntoleranceStatus createAllergyIntoleranceStatus();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Type</em>'.
	 * @generated
	 */
	AllergyIntoleranceType createAllergyIntoleranceType();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment</em>'.
	 * @generated
	 */
	Appointment createAppointment();

	/**
	 * Returns a new object of class '<em>Appointment Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment Participant</em>'.
	 * @generated
	 */
	AppointmentParticipant createAppointmentParticipant();

	/**
	 * Returns a new object of class '<em>Appointment Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment Response</em>'.
	 * @generated
	 */
	AppointmentResponse createAppointmentResponse();

	/**
	 * Returns a new object of class '<em>Appointment Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment Status</em>'.
	 * @generated
	 */
	AppointmentStatus createAppointmentStatus();

	/**
	 * Returns a new object of class '<em>Assertion Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Direction Type</em>'.
	 * @generated
	 */
	AssertionDirectionType createAssertionDirectionType();

	/**
	 * Returns a new object of class '<em>Assertion Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Operator Type</em>'.
	 * @generated
	 */
	AssertionOperatorType createAssertionOperatorType();

	/**
	 * Returns a new object of class '<em>Assertion Response Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Response Types</em>'.
	 * @generated
	 */
	AssertionResponseTypes createAssertionResponseTypes();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Audit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event</em>'.
	 * @generated
	 */
	AuditEvent createAuditEvent();

	/**
	 * Returns a new object of class '<em>Audit Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Action</em>'.
	 * @generated
	 */
	AuditEventAction createAuditEventAction();

	/**
	 * Returns a new object of class '<em>Audit Event Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Agent</em>'.
	 * @generated
	 */
	AuditEventAgent createAuditEventAgent();

	/**
	 * Returns a new object of class '<em>Audit Event Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Detail</em>'.
	 * @generated
	 */
	AuditEventDetail createAuditEventDetail();

	/**
	 * Returns a new object of class '<em>Audit Event Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Entity</em>'.
	 * @generated
	 */
	AuditEventEntity createAuditEventEntity();

	/**
	 * Returns a new object of class '<em>Audit Event Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Network</em>'.
	 * @generated
	 */
	AuditEventNetwork createAuditEventNetwork();

	/**
	 * Returns a new object of class '<em>Audit Event Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Outcome</em>'.
	 * @generated
	 */
	AuditEventOutcome createAuditEventOutcome();

	/**
	 * Returns a new object of class '<em>Audit Event Participant Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Participant Network Type</em>'.
	 * @generated
	 */
	AuditEventParticipantNetworkType createAuditEventParticipantNetworkType();

	/**
	 * Returns a new object of class '<em>Audit Event Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Event Source</em>'.
	 * @generated
	 */
	AuditEventSource createAuditEventSource();

	/**
	 * Returns a new object of class '<em>Backbone Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Backbone Element</em>'.
	 * @generated
	 */
	BackboneElement createBackboneElement();

	/**
	 * Returns a new object of class '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base64 Binary</em>'.
	 * @generated
	 */
	Base64Binary createBase64Binary();

	/**
	 * Returns a new object of class '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic</em>'.
	 * @generated
	 */
	Basic createBasic();

	/**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
	Binary createBinary();

	/**
	 * Returns a new object of class '<em>Binding Strength</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Strength</em>'.
	 * @generated
	 */
	BindingStrength createBindingStrength();

	/**
	 * Returns a new object of class '<em>Body Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Site</em>'.
	 * @generated
	 */
	BodySite createBodySite();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle</em>'.
	 * @generated
	 */
	Bundle createBundle();

	/**
	 * Returns a new object of class '<em>Bundle Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Entry</em>'.
	 * @generated
	 */
	BundleEntry createBundleEntry();

	/**
	 * Returns a new object of class '<em>Bundle Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Link</em>'.
	 * @generated
	 */
	BundleLink createBundleLink();

	/**
	 * Returns a new object of class '<em>Bundle Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Request</em>'.
	 * @generated
	 */
	BundleRequest createBundleRequest();

	/**
	 * Returns a new object of class '<em>Bundle Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Response</em>'.
	 * @generated
	 */
	BundleResponse createBundleResponse();

	/**
	 * Returns a new object of class '<em>Bundle Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Search</em>'.
	 * @generated
	 */
	BundleSearch createBundleSearch();

	/**
	 * Returns a new object of class '<em>Bundle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Type</em>'.
	 * @generated
	 */
	BundleType createBundleType();

	/**
	 * Returns a new object of class '<em>Care Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan</em>'.
	 * @generated
	 */
	CarePlan createCarePlan();

	/**
	 * Returns a new object of class '<em>Care Plan Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Activity</em>'.
	 * @generated
	 */
	CarePlanActivity createCarePlanActivity();

	/**
	 * Returns a new object of class '<em>Care Plan Activity Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Activity Status</em>'.
	 * @generated
	 */
	CarePlanActivityStatus createCarePlanActivityStatus();

	/**
	 * Returns a new object of class '<em>Care Plan Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Detail</em>'.
	 * @generated
	 */
	CarePlanDetail createCarePlanDetail();

	/**
	 * Returns a new object of class '<em>Care Plan Related Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Related Plan</em>'.
	 * @generated
	 */
	CarePlanRelatedPlan createCarePlanRelatedPlan();

	/**
	 * Returns a new object of class '<em>Care Plan Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Relationship</em>'.
	 * @generated
	 */
	CarePlanRelationship createCarePlanRelationship();

	/**
	 * Returns a new object of class '<em>Care Plan Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Status</em>'.
	 * @generated
	 */
	CarePlanStatus createCarePlanStatus();

	/**
	 * Returns a new object of class '<em>Care Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Team</em>'.
	 * @generated
	 */
	CareTeam createCareTeam();

	/**
	 * Returns a new object of class '<em>Care Team Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Team Participant</em>'.
	 * @generated
	 */
	CareTeamParticipant createCareTeamParticipant();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Claim Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Coverage</em>'.
	 * @generated
	 */
	ClaimCoverage createClaimCoverage();

	/**
	 * Returns a new object of class '<em>Claim Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Detail</em>'.
	 * @generated
	 */
	ClaimDetail createClaimDetail();

	/**
	 * Returns a new object of class '<em>Claim Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Diagnosis</em>'.
	 * @generated
	 */
	ClaimDiagnosis createClaimDiagnosis();

	/**
	 * Returns a new object of class '<em>Claim Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Item</em>'.
	 * @generated
	 */
	ClaimItem createClaimItem();

	/**
	 * Returns a new object of class '<em>Claim Missing Teeth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Missing Teeth</em>'.
	 * @generated
	 */
	ClaimMissingTeeth createClaimMissingTeeth();

	/**
	 * Returns a new object of class '<em>Claim Onset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Onset</em>'.
	 * @generated
	 */
	ClaimOnset createClaimOnset();

	/**
	 * Returns a new object of class '<em>Claim Payee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Payee</em>'.
	 * @generated
	 */
	ClaimPayee createClaimPayee();

	/**
	 * Returns a new object of class '<em>Claim Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Procedure</em>'.
	 * @generated
	 */
	ClaimProcedure createClaimProcedure();

	/**
	 * Returns a new object of class '<em>Claim Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Prosthesis</em>'.
	 * @generated
	 */
	ClaimProsthesis createClaimProsthesis();

	/**
	 * Returns a new object of class '<em>Claim Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Related</em>'.
	 * @generated
	 */
	ClaimRelated createClaimRelated();

	/**
	 * Returns a new object of class '<em>Claim Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response</em>'.
	 * @generated
	 */
	ClaimResponse createClaimResponse();

	/**
	 * Returns a new object of class '<em>Claim Response Add Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Add Item</em>'.
	 * @generated
	 */
	ClaimResponseAddItem createClaimResponseAddItem();

	/**
	 * Returns a new object of class '<em>Claim Response Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Adjudication</em>'.
	 * @generated
	 */
	ClaimResponseAdjudication createClaimResponseAdjudication();

	/**
	 * Returns a new object of class '<em>Claim Response Adjudication1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Adjudication1</em>'.
	 * @generated
	 */
	ClaimResponseAdjudication1 createClaimResponseAdjudication1();

	/**
	 * Returns a new object of class '<em>Claim Response Adjudication2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Adjudication2</em>'.
	 * @generated
	 */
	ClaimResponseAdjudication2 createClaimResponseAdjudication2();

	/**
	 * Returns a new object of class '<em>Claim Response Adjudication3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Adjudication3</em>'.
	 * @generated
	 */
	ClaimResponseAdjudication3 createClaimResponseAdjudication3();

	/**
	 * Returns a new object of class '<em>Claim Response Adjudication4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Adjudication4</em>'.
	 * @generated
	 */
	ClaimResponseAdjudication4 createClaimResponseAdjudication4();

	/**
	 * Returns a new object of class '<em>Claim Response Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Coverage</em>'.
	 * @generated
	 */
	ClaimResponseCoverage createClaimResponseCoverage();

	/**
	 * Returns a new object of class '<em>Claim Response Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Detail</em>'.
	 * @generated
	 */
	ClaimResponseDetail createClaimResponseDetail();

	/**
	 * Returns a new object of class '<em>Claim Response Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Detail1</em>'.
	 * @generated
	 */
	ClaimResponseDetail1 createClaimResponseDetail1();

	/**
	 * Returns a new object of class '<em>Claim Response Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Error</em>'.
	 * @generated
	 */
	ClaimResponseError createClaimResponseError();

	/**
	 * Returns a new object of class '<em>Claim Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Item</em>'.
	 * @generated
	 */
	ClaimResponseItem createClaimResponseItem();

	/**
	 * Returns a new object of class '<em>Claim Response Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Note</em>'.
	 * @generated
	 */
	ClaimResponseNote createClaimResponseNote();

	/**
	 * Returns a new object of class '<em>Claim Response Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Response Sub Detail</em>'.
	 * @generated
	 */
	ClaimResponseSubDetail createClaimResponseSubDetail();

	/**
	 * Returns a new object of class '<em>Claim Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Sub Detail</em>'.
	 * @generated
	 */
	ClaimSubDetail createClaimSubDetail();

	/**
	 * Returns a new object of class '<em>Claim Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Type</em>'.
	 * @generated
	 */
	ClaimType createClaimType();

	/**
	 * Returns a new object of class '<em>Claim Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Type2</em>'.
	 * @generated
	 */
	ClaimType2 createClaimType2();

	/**
	 * Returns a new object of class '<em>Clinical Impression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression</em>'.
	 * @generated
	 */
	ClinicalImpression createClinicalImpression();

	/**
	 * Returns a new object of class '<em>Clinical Impression Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Finding</em>'.
	 * @generated
	 */
	ClinicalImpressionFinding createClinicalImpressionFinding();

	/**
	 * Returns a new object of class '<em>Clinical Impression Investigations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Investigations</em>'.
	 * @generated
	 */
	ClinicalImpressionInvestigations createClinicalImpressionInvestigations();

	/**
	 * Returns a new object of class '<em>Clinical Impression Ruled Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Ruled Out</em>'.
	 * @generated
	 */
	ClinicalImpressionRuledOut createClinicalImpressionRuledOut();

	/**
	 * Returns a new object of class '<em>Clinical Impression Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Impression Status</em>'.
	 * @generated
	 */
	ClinicalImpressionStatus createClinicalImpressionStatus();

	/**
	 * Returns a new object of class '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code</em>'.
	 * @generated
	 */
	Code createCode();

	/**
	 * Returns a new object of class '<em>Codeable Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Codeable Concept</em>'.
	 * @generated
	 */
	CodeableConcept createCodeableConcept();

	/**
	 * Returns a new object of class '<em>Code System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System</em>'.
	 * @generated
	 */
	CodeSystem createCodeSystem();

	/**
	 * Returns a new object of class '<em>Code System Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Concept</em>'.
	 * @generated
	 */
	CodeSystemConcept createCodeSystemConcept();

	/**
	 * Returns a new object of class '<em>Code System Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Contact</em>'.
	 * @generated
	 */
	CodeSystemContact createCodeSystemContact();

	/**
	 * Returns a new object of class '<em>Code System Content Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Content Mode</em>'.
	 * @generated
	 */
	CodeSystemContentMode createCodeSystemContentMode();

	/**
	 * Returns a new object of class '<em>Code System Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Designation</em>'.
	 * @generated
	 */
	CodeSystemDesignation createCodeSystemDesignation();

	/**
	 * Returns a new object of class '<em>Code System Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Filter</em>'.
	 * @generated
	 */
	CodeSystemFilter createCodeSystemFilter();

	/**
	 * Returns a new object of class '<em>Code System Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Property</em>'.
	 * @generated
	 */
	CodeSystemProperty createCodeSystemProperty();

	/**
	 * Returns a new object of class '<em>Code System Property1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Property1</em>'.
	 * @generated
	 */
	CodeSystemProperty1 createCodeSystemProperty1();

	/**
	 * Returns a new object of class '<em>Coding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coding</em>'.
	 * @generated
	 */
	Coding createCoding();

	/**
	 * Returns a new object of class '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication</em>'.
	 * @generated
	 */
	Communication createCommunication();

	/**
	 * Returns a new object of class '<em>Communication Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Payload</em>'.
	 * @generated
	 */
	CommunicationPayload createCommunicationPayload();

	/**
	 * Returns a new object of class '<em>Communication Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Request</em>'.
	 * @generated
	 */
	CommunicationRequest createCommunicationRequest();

	/**
	 * Returns a new object of class '<em>Communication Request Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Request Payload</em>'.
	 * @generated
	 */
	CommunicationRequestPayload createCommunicationRequestPayload();

	/**
	 * Returns a new object of class '<em>Communication Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Request Status</em>'.
	 * @generated
	 */
	CommunicationRequestStatus createCommunicationRequestStatus();

	/**
	 * Returns a new object of class '<em>Communication Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Status</em>'.
	 * @generated
	 */
	CommunicationStatus createCommunicationStatus();

	/**
	 * Returns a new object of class '<em>Compartment Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Definition</em>'.
	 * @generated
	 */
	CompartmentDefinition createCompartmentDefinition();

	/**
	 * Returns a new object of class '<em>Compartment Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Definition Contact</em>'.
	 * @generated
	 */
	CompartmentDefinitionContact createCompartmentDefinitionContact();

	/**
	 * Returns a new object of class '<em>Compartment Definition Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Definition Resource</em>'.
	 * @generated
	 */
	CompartmentDefinitionResource createCompartmentDefinitionResource();

	/**
	 * Returns a new object of class '<em>Compartment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Type</em>'.
	 * @generated
	 */
	CompartmentType createCompartmentType();

	/**
	 * Returns a new object of class '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition</em>'.
	 * @generated
	 */
	Composition createComposition();

	/**
	 * Returns a new object of class '<em>Composition Attestation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Attestation Mode</em>'.
	 * @generated
	 */
	CompositionAttestationMode createCompositionAttestationMode();

	/**
	 * Returns a new object of class '<em>Composition Attester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Attester</em>'.
	 * @generated
	 */
	CompositionAttester createCompositionAttester();

	/**
	 * Returns a new object of class '<em>Composition Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Event</em>'.
	 * @generated
	 */
	CompositionEvent createCompositionEvent();

	/**
	 * Returns a new object of class '<em>Composition Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Section</em>'.
	 * @generated
	 */
	CompositionSection createCompositionSection();

	/**
	 * Returns a new object of class '<em>Composition Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Status</em>'.
	 * @generated
	 */
	CompositionStatus createCompositionStatus();

	/**
	 * Returns a new object of class '<em>Concept Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map</em>'.
	 * @generated
	 */
	ConceptMap createConceptMap();

	/**
	 * Returns a new object of class '<em>Concept Map Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Contact</em>'.
	 * @generated
	 */
	ConceptMapContact createConceptMapContact();

	/**
	 * Returns a new object of class '<em>Concept Map Depends On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Depends On</em>'.
	 * @generated
	 */
	ConceptMapDependsOn createConceptMapDependsOn();

	/**
	 * Returns a new object of class '<em>Concept Map Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Element</em>'.
	 * @generated
	 */
	ConceptMapElement createConceptMapElement();

	/**
	 * Returns a new object of class '<em>Concept Map Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Equivalence</em>'.
	 * @generated
	 */
	ConceptMapEquivalence createConceptMapEquivalence();

	/**
	 * Returns a new object of class '<em>Concept Map Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map Target</em>'.
	 * @generated
	 */
	ConceptMapTarget createConceptMapTarget();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Conditional Delete Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Delete Status</em>'.
	 * @generated
	 */
	ConditionalDeleteStatus createConditionalDeleteStatus();

	/**
	 * Returns a new object of class '<em>Condition Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Evidence</em>'.
	 * @generated
	 */
	ConditionEvidence createConditionEvidence();

	/**
	 * Returns a new object of class '<em>Condition Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Stage</em>'.
	 * @generated
	 */
	ConditionStage createConditionStage();

	/**
	 * Returns a new object of class '<em>Condition Verification Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Verification Status</em>'.
	 * @generated
	 */
	ConditionVerificationStatus createConditionVerificationStatus();

	/**
	 * Returns a new object of class '<em>Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance</em>'.
	 * @generated
	 */
	Conformance createConformance();

	/**
	 * Returns a new object of class '<em>Conformance Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Certificate</em>'.
	 * @generated
	 */
	ConformanceCertificate createConformanceCertificate();

	/**
	 * Returns a new object of class '<em>Conformance Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Contact</em>'.
	 * @generated
	 */
	ConformanceContact createConformanceContact();

	/**
	 * Returns a new object of class '<em>Conformance Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Document</em>'.
	 * @generated
	 */
	ConformanceDocument createConformanceDocument();

	/**
	 * Returns a new object of class '<em>Conformance Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Endpoint</em>'.
	 * @generated
	 */
	ConformanceEndpoint createConformanceEndpoint();

	/**
	 * Returns a new object of class '<em>Conformance Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Event</em>'.
	 * @generated
	 */
	ConformanceEvent createConformanceEvent();

	/**
	 * Returns a new object of class '<em>Conformance Event Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Event Mode</em>'.
	 * @generated
	 */
	ConformanceEventMode createConformanceEventMode();

	/**
	 * Returns a new object of class '<em>Conformance Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Implementation</em>'.
	 * @generated
	 */
	ConformanceImplementation createConformanceImplementation();

	/**
	 * Returns a new object of class '<em>Conformance Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Interaction</em>'.
	 * @generated
	 */
	ConformanceInteraction createConformanceInteraction();

	/**
	 * Returns a new object of class '<em>Conformance Interaction1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Interaction1</em>'.
	 * @generated
	 */
	ConformanceInteraction1 createConformanceInteraction1();

	/**
	 * Returns a new object of class '<em>Conformance Messaging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Messaging</em>'.
	 * @generated
	 */
	ConformanceMessaging createConformanceMessaging();

	/**
	 * Returns a new object of class '<em>Conformance Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Operation</em>'.
	 * @generated
	 */
	ConformanceOperation createConformanceOperation();

	/**
	 * Returns a new object of class '<em>Conformance Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Resource</em>'.
	 * @generated
	 */
	ConformanceResource createConformanceResource();

	/**
	 * Returns a new object of class '<em>Conformance Resource Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Resource Status</em>'.
	 * @generated
	 */
	ConformanceResourceStatus createConformanceResourceStatus();

	/**
	 * Returns a new object of class '<em>Conformance Rest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Rest</em>'.
	 * @generated
	 */
	ConformanceRest createConformanceRest();

	/**
	 * Returns a new object of class '<em>Conformance Search Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Search Param</em>'.
	 * @generated
	 */
	ConformanceSearchParam createConformanceSearchParam();

	/**
	 * Returns a new object of class '<em>Conformance Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Security</em>'.
	 * @generated
	 */
	ConformanceSecurity createConformanceSecurity();

	/**
	 * Returns a new object of class '<em>Conformance Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Software</em>'.
	 * @generated
	 */
	ConformanceSoftware createConformanceSoftware();

	/**
	 * Returns a new object of class '<em>Conformance Statement Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Statement Kind</em>'.
	 * @generated
	 */
	ConformanceStatementKind createConformanceStatementKind();

	/**
	 * Returns a new object of class '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent</em>'.
	 * @generated
	 */
	Consent createConsent();

	/**
	 * Returns a new object of class '<em>Consent Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Agent</em>'.
	 * @generated
	 */
	ConsentAgent createConsentAgent();

	/**
	 * Returns a new object of class '<em>Consent Agent1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Agent1</em>'.
	 * @generated
	 */
	ConsentAgent1 createConsentAgent1();

	/**
	 * Returns a new object of class '<em>Consent Except</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Except</em>'.
	 * @generated
	 */
	ConsentExcept createConsentExcept();

	/**
	 * Returns a new object of class '<em>Consent Friendly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Friendly</em>'.
	 * @generated
	 */
	ConsentFriendly createConsentFriendly();

	/**
	 * Returns a new object of class '<em>Consent Legal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Legal</em>'.
	 * @generated
	 */
	ConsentLegal createConsentLegal();

	/**
	 * Returns a new object of class '<em>Consent Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent Status</em>'.
	 * @generated
	 */
	ConsentStatus createConsentStatus();

	/**
	 * Returns a new object of class '<em>Constraint Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Severity</em>'.
	 * @generated
	 */
	ConstraintSeverity createConstraintSeverity();

	/**
	 * Returns a new object of class '<em>Contact Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Point</em>'.
	 * @generated
	 */
	ContactPoint createContactPoint();

	/**
	 * Returns a new object of class '<em>Contact Point System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Point System</em>'.
	 * @generated
	 */
	ContactPointSystem createContactPointSystem();

	/**
	 * Returns a new object of class '<em>Contact Point Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Point Use</em>'.
	 * @generated
	 */
	ContactPointUse createContactPointUse();

	/**
	 * Returns a new object of class '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Type</em>'.
	 * @generated
	 */
	ContentType createContentType();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Contract Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Agent</em>'.
	 * @generated
	 */
	ContractAgent createContractAgent();

	/**
	 * Returns a new object of class '<em>Contract Agent1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Agent1</em>'.
	 * @generated
	 */
	ContractAgent1 createContractAgent1();

	/**
	 * Returns a new object of class '<em>Contract Friendly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Friendly</em>'.
	 * @generated
	 */
	ContractFriendly createContractFriendly();

	/**
	 * Returns a new object of class '<em>Contract Legal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Legal</em>'.
	 * @generated
	 */
	ContractLegal createContractLegal();

	/**
	 * Returns a new object of class '<em>Contract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Rule</em>'.
	 * @generated
	 */
	ContractRule createContractRule();

	/**
	 * Returns a new object of class '<em>Contract Signer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Signer</em>'.
	 * @generated
	 */
	ContractSigner createContractSigner();

	/**
	 * Returns a new object of class '<em>Contract Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Term</em>'.
	 * @generated
	 */
	ContractTerm createContractTerm();

	/**
	 * Returns a new object of class '<em>Contract Valued Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Valued Item</em>'.
	 * @generated
	 */
	ContractValuedItem createContractValuedItem();

	/**
	 * Returns a new object of class '<em>Contract Valued Item1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Valued Item1</em>'.
	 * @generated
	 */
	ContractValuedItem1 createContractValuedItem1();

	/**
	 * Returns a new object of class '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count</em>'.
	 * @generated
	 */
	Count createCount();

	/**
	 * Returns a new object of class '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage</em>'.
	 * @generated
	 */
	Coverage createCoverage();

	/**
	 * Returns a new object of class '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element</em>'.
	 * @generated
	 */
	DataElement createDataElement();

	/**
	 * Returns a new object of class '<em>Data Element Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element Contact</em>'.
	 * @generated
	 */
	DataElementContact createDataElementContact();

	/**
	 * Returns a new object of class '<em>Data Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element Mapping</em>'.
	 * @generated
	 */
	DataElementMapping createDataElementMapping();

	/**
	 * Returns a new object of class '<em>Data Element Stringency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element Stringency</em>'.
	 * @generated
	 */
	DataElementStringency createDataElementStringency();

	/**
	 * Returns a new object of class '<em>Data Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement</em>'.
	 * @generated
	 */
	DataRequirement createDataRequirement();

	/**
	 * Returns a new object of class '<em>Data Requirement Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement Code Filter</em>'.
	 * @generated
	 */
	DataRequirementCodeFilter createDataRequirementCodeFilter();

	/**
	 * Returns a new object of class '<em>Data Requirement Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Requirement Date Filter</em>'.
	 * @generated
	 */
	DataRequirementDateFilter createDataRequirementDateFilter();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>Days Of Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Days Of Week</em>'.
	 * @generated
	 */
	DaysOfWeek createDaysOfWeek();

	/**
	 * Returns a new object of class '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal</em>'.
	 * @generated
	 */
	Decimal createDecimal();

	/**
	 * Returns a new object of class '<em>Decision Support Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Support Rule</em>'.
	 * @generated
	 */
	DecisionSupportRule createDecisionSupportRule();

	/**
	 * Returns a new object of class '<em>Decision Support Service Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Support Service Module</em>'.
	 * @generated
	 */
	DecisionSupportServiceModule createDecisionSupportServiceModule();

	/**
	 * Returns a new object of class '<em>Detected Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detected Issue</em>'.
	 * @generated
	 */
	DetectedIssue createDetectedIssue();

	/**
	 * Returns a new object of class '<em>Detected Issue Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detected Issue Mitigation</em>'.
	 * @generated
	 */
	DetectedIssueMitigation createDetectedIssueMitigation();

	/**
	 * Returns a new object of class '<em>Detected Issue Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detected Issue Severity</em>'.
	 * @generated
	 */
	DetectedIssueSeverity createDetectedIssueSeverity();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Device Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Component</em>'.
	 * @generated
	 */
	DeviceComponent createDeviceComponent();

	/**
	 * Returns a new object of class '<em>Device Component Production Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Component Production Specification</em>'.
	 * @generated
	 */
	DeviceComponentProductionSpecification createDeviceComponentProductionSpecification();

	/**
	 * Returns a new object of class '<em>Device Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric</em>'.
	 * @generated
	 */
	DeviceMetric createDeviceMetric();

	/**
	 * Returns a new object of class '<em>Device Metric Calibration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric Calibration</em>'.
	 * @generated
	 */
	DeviceMetricCalibration createDeviceMetricCalibration();

	/**
	 * Returns a new object of class '<em>Device Metric Calibration State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric Calibration State</em>'.
	 * @generated
	 */
	DeviceMetricCalibrationState createDeviceMetricCalibrationState();

	/**
	 * Returns a new object of class '<em>Device Metric Calibration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric Calibration Type</em>'.
	 * @generated
	 */
	DeviceMetricCalibrationType createDeviceMetricCalibrationType();

	/**
	 * Returns a new object of class '<em>Device Metric Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric Category</em>'.
	 * @generated
	 */
	DeviceMetricCategory createDeviceMetricCategory();

	/**
	 * Returns a new object of class '<em>Device Metric Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric Color</em>'.
	 * @generated
	 */
	DeviceMetricColor createDeviceMetricColor();

	/**
	 * Returns a new object of class '<em>Device Metric Operational Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Metric Operational Status</em>'.
	 * @generated
	 */
	DeviceMetricOperationalStatus createDeviceMetricOperationalStatus();

	/**
	 * Returns a new object of class '<em>Device Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Status</em>'.
	 * @generated
	 */
	DeviceStatus createDeviceStatus();

	/**
	 * Returns a new object of class '<em>Device Use Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Use Request</em>'.
	 * @generated
	 */
	DeviceUseRequest createDeviceUseRequest();

	/**
	 * Returns a new object of class '<em>Device Use Request Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Use Request Priority</em>'.
	 * @generated
	 */
	DeviceUseRequestPriority createDeviceUseRequestPriority();

	/**
	 * Returns a new object of class '<em>Device Use Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Use Request Status</em>'.
	 * @generated
	 */
	DeviceUseRequestStatus createDeviceUseRequestStatus();

	/**
	 * Returns a new object of class '<em>Device Use Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Use Statement</em>'.
	 * @generated
	 */
	DeviceUseStatement createDeviceUseStatement();

	/**
	 * Returns a new object of class '<em>Diagnostic Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Order</em>'.
	 * @generated
	 */
	DiagnosticOrder createDiagnosticOrder();

	/**
	 * Returns a new object of class '<em>Diagnostic Order Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Order Event</em>'.
	 * @generated
	 */
	DiagnosticOrderEvent createDiagnosticOrderEvent();

	/**
	 * Returns a new object of class '<em>Diagnostic Order Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Order Item</em>'.
	 * @generated
	 */
	DiagnosticOrderItem createDiagnosticOrderItem();

	/**
	 * Returns a new object of class '<em>Diagnostic Order Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Order Priority</em>'.
	 * @generated
	 */
	DiagnosticOrderPriority createDiagnosticOrderPriority();

	/**
	 * Returns a new object of class '<em>Diagnostic Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Order Status</em>'.
	 * @generated
	 */
	DiagnosticOrderStatus createDiagnosticOrderStatus();

	/**
	 * Returns a new object of class '<em>Diagnostic Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Report</em>'.
	 * @generated
	 */
	DiagnosticReport createDiagnosticReport();

	/**
	 * Returns a new object of class '<em>Diagnostic Report Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Report Image</em>'.
	 * @generated
	 */
	DiagnosticReportImage createDiagnosticReportImage();

	/**
	 * Returns a new object of class '<em>Diagnostic Report Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Report Status</em>'.
	 * @generated
	 */
	DiagnosticReportStatus createDiagnosticReportStatus();

	/**
	 * Returns a new object of class '<em>Digital Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Media Type</em>'.
	 * @generated
	 */
	DigitalMediaType createDigitalMediaType();

	/**
	 * Returns a new object of class '<em>Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance</em>'.
	 * @generated
	 */
	Distance createDistance();

	/**
	 * Returns a new object of class '<em>Document Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Manifest</em>'.
	 * @generated
	 */
	DocumentManifest createDocumentManifest();

	/**
	 * Returns a new object of class '<em>Document Manifest Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Manifest Content</em>'.
	 * @generated
	 */
	DocumentManifestContent createDocumentManifestContent();

	/**
	 * Returns a new object of class '<em>Document Manifest Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Manifest Related</em>'.
	 * @generated
	 */
	DocumentManifestRelated createDocumentManifestRelated();

	/**
	 * Returns a new object of class '<em>Document Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Mode</em>'.
	 * @generated
	 */
	DocumentMode createDocumentMode();

	/**
	 * Returns a new object of class '<em>Document Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference</em>'.
	 * @generated
	 */
	DocumentReference createDocumentReference();

	/**
	 * Returns a new object of class '<em>Document Reference Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Content</em>'.
	 * @generated
	 */
	DocumentReferenceContent createDocumentReferenceContent();

	/**
	 * Returns a new object of class '<em>Document Reference Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Context</em>'.
	 * @generated
	 */
	DocumentReferenceContext createDocumentReferenceContext();

	/**
	 * Returns a new object of class '<em>Document Reference Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Related</em>'.
	 * @generated
	 */
	DocumentReferenceRelated createDocumentReferenceRelated();

	/**
	 * Returns a new object of class '<em>Document Reference Relates To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Relates To</em>'.
	 * @generated
	 */
	DocumentReferenceRelatesTo createDocumentReferenceRelatesTo();

	/**
	 * Returns a new object of class '<em>Document Reference Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Reference Status</em>'.
	 * @generated
	 */
	DocumentReferenceStatus createDocumentReferenceStatus();

	/**
	 * Returns a new object of class '<em>Document Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Relationship Type</em>'.
	 * @generated
	 */
	DocumentRelationshipType createDocumentRelationshipType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Domain Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Resource</em>'.
	 * @generated
	 */
	DomainResource createDomainResource();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();

	/**
	 * Returns a new object of class '<em>DWeb Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DWeb Type</em>'.
	 * @generated
	 */
	DWebType createDWebType();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition</em>'.
	 * @generated
	 */
	ElementDefinition createElementDefinition();

	/**
	 * Returns a new object of class '<em>Element Definition Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition Base</em>'.
	 * @generated
	 */
	ElementDefinitionBase createElementDefinitionBase();

	/**
	 * Returns a new object of class '<em>Element Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition Binding</em>'.
	 * @generated
	 */
	ElementDefinitionBinding createElementDefinitionBinding();

	/**
	 * Returns a new object of class '<em>Element Definition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition Constraint</em>'.
	 * @generated
	 */
	ElementDefinitionConstraint createElementDefinitionConstraint();

	/**
	 * Returns a new object of class '<em>Element Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition Mapping</em>'.
	 * @generated
	 */
	ElementDefinitionMapping createElementDefinitionMapping();

	/**
	 * Returns a new object of class '<em>Element Definition Slicing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition Slicing</em>'.
	 * @generated
	 */
	ElementDefinitionSlicing createElementDefinitionSlicing();

	/**
	 * Returns a new object of class '<em>Element Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Definition Type</em>'.
	 * @generated
	 */
	ElementDefinitionType createElementDefinitionType();

	/**
	 * Returns a new object of class '<em>Eligibility Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eligibility Request</em>'.
	 * @generated
	 */
	EligibilityRequest createEligibilityRequest();

	/**
	 * Returns a new object of class '<em>Eligibility Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eligibility Response</em>'.
	 * @generated
	 */
	EligibilityResponse createEligibilityResponse();

	/**
	 * Returns a new object of class '<em>Eligibility Response Benefit Balance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eligibility Response Benefit Balance</em>'.
	 * @generated
	 */
	EligibilityResponseBenefitBalance createEligibilityResponseBenefitBalance();

	/**
	 * Returns a new object of class '<em>Eligibility Response Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eligibility Response Error</em>'.
	 * @generated
	 */
	EligibilityResponseError createEligibilityResponseError();

	/**
	 * Returns a new object of class '<em>Eligibility Response Financial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eligibility Response Financial</em>'.
	 * @generated
	 */
	EligibilityResponseFinancial createEligibilityResponseFinancial();

	/**
	 * Returns a new object of class '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter</em>'.
	 * @generated
	 */
	Encounter createEncounter();

	/**
	 * Returns a new object of class '<em>Encounter Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Class</em>'.
	 * @generated
	 */
	EncounterClass createEncounterClass();

	/**
	 * Returns a new object of class '<em>Encounter Hospitalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Hospitalization</em>'.
	 * @generated
	 */
	EncounterHospitalization createEncounterHospitalization();

	/**
	 * Returns a new object of class '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Location</em>'.
	 * @generated
	 */
	EncounterLocation createEncounterLocation();

	/**
	 * Returns a new object of class '<em>Encounter Location Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Location Status</em>'.
	 * @generated
	 */
	EncounterLocationStatus createEncounterLocationStatus();

	/**
	 * Returns a new object of class '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Participant</em>'.
	 * @generated
	 */
	EncounterParticipant createEncounterParticipant();

	/**
	 * Returns a new object of class '<em>Encounter State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter State</em>'.
	 * @generated
	 */
	EncounterState createEncounterState();

	/**
	 * Returns a new object of class '<em>Encounter Status History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Status History</em>'.
	 * @generated
	 */
	EncounterStatusHistory createEncounterStatusHistory();

	/**
	 * Returns a new object of class '<em>Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint</em>'.
	 * @generated
	 */
	Endpoint createEndpoint();

	/**
	 * Returns a new object of class '<em>Endpoint Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoint Status</em>'.
	 * @generated
	 */
	EndpointStatus createEndpointStatus();

	/**
	 * Returns a new object of class '<em>Enrollment Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrollment Request</em>'.
	 * @generated
	 */
	EnrollmentRequest createEnrollmentRequest();

	/**
	 * Returns a new object of class '<em>Enrollment Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enrollment Response</em>'.
	 * @generated
	 */
	EnrollmentResponse createEnrollmentResponse();

	/**
	 * Returns a new object of class '<em>Episode Of Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Of Care</em>'.
	 * @generated
	 */
	EpisodeOfCare createEpisodeOfCare();

	/**
	 * Returns a new object of class '<em>Episode Of Care Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Of Care Status</em>'.
	 * @generated
	 */
	EpisodeOfCareStatus createEpisodeOfCareStatus();

	/**
	 * Returns a new object of class '<em>Episode Of Care Status History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Of Care Status History</em>'.
	 * @generated
	 */
	EpisodeOfCareStatusHistory createEpisodeOfCareStatusHistory();

	/**
	 * Returns a new object of class '<em>Event Timing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Timing</em>'.
	 * @generated
	 */
	EventTiming createEventTiming();

	/**
	 * Returns a new object of class '<em>Expansion Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile</em>'.
	 * @generated
	 */
	ExpansionProfile createExpansionProfile();

	/**
	 * Returns a new object of class '<em>Expansion Profile Code System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Code System</em>'.
	 * @generated
	 */
	ExpansionProfileCodeSystem createExpansionProfileCodeSystem();

	/**
	 * Returns a new object of class '<em>Expansion Profile Code System1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Code System1</em>'.
	 * @generated
	 */
	ExpansionProfileCodeSystem1 createExpansionProfileCodeSystem1();

	/**
	 * Returns a new object of class '<em>Expansion Profile Code System2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Code System2</em>'.
	 * @generated
	 */
	ExpansionProfileCodeSystem2 createExpansionProfileCodeSystem2();

	/**
	 * Returns a new object of class '<em>Expansion Profile Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Contact</em>'.
	 * @generated
	 */
	ExpansionProfileContact createExpansionProfileContact();

	/**
	 * Returns a new object of class '<em>Expansion Profile Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Designation</em>'.
	 * @generated
	 */
	ExpansionProfileDesignation createExpansionProfileDesignation();

	/**
	 * Returns a new object of class '<em>Expansion Profile Designation1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Designation1</em>'.
	 * @generated
	 */
	ExpansionProfileDesignation1 createExpansionProfileDesignation1();

	/**
	 * Returns a new object of class '<em>Expansion Profile Designation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Designation2</em>'.
	 * @generated
	 */
	ExpansionProfileDesignation2 createExpansionProfileDesignation2();

	/**
	 * Returns a new object of class '<em>Expansion Profile Exclude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Exclude</em>'.
	 * @generated
	 */
	ExpansionProfileExclude createExpansionProfileExclude();

	/**
	 * Returns a new object of class '<em>Expansion Profile Exclude1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Exclude1</em>'.
	 * @generated
	 */
	ExpansionProfileExclude1 createExpansionProfileExclude1();

	/**
	 * Returns a new object of class '<em>Expansion Profile Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Include</em>'.
	 * @generated
	 */
	ExpansionProfileInclude createExpansionProfileInclude();

	/**
	 * Returns a new object of class '<em>Expansion Profile Include1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Profile Include1</em>'.
	 * @generated
	 */
	ExpansionProfileInclude1 createExpansionProfileInclude1();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit</em>'.
	 * @generated
	 */
	ExplanationOfBenefit createExplanationOfBenefit();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Add Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Add Item</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAddItem createExplanationOfBenefitAddItem();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Adjudication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Adjudication</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAdjudication createExplanationOfBenefitAdjudication();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Adjudication1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Adjudication1</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAdjudication1 createExplanationOfBenefitAdjudication1();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Adjudication2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Adjudication2</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAdjudication2 createExplanationOfBenefitAdjudication2();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Adjudication3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Adjudication3</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAdjudication3 createExplanationOfBenefitAdjudication3();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Adjudication4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Adjudication4</em>'.
	 * @generated
	 */
	ExplanationOfBenefitAdjudication4 createExplanationOfBenefitAdjudication4();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Benefit Balance</em>'.
	 * @generated
	 */
	ExplanationOfBenefitBenefitBalance createExplanationOfBenefitBenefitBalance();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Coverage</em>'.
	 * @generated
	 */
	ExplanationOfBenefitCoverage createExplanationOfBenefitCoverage();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Detail</em>'.
	 * @generated
	 */
	ExplanationOfBenefitDetail createExplanationOfBenefitDetail();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Detail1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Detail1</em>'.
	 * @generated
	 */
	ExplanationOfBenefitDetail1 createExplanationOfBenefitDetail1();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Diagnosis</em>'.
	 * @generated
	 */
	ExplanationOfBenefitDiagnosis createExplanationOfBenefitDiagnosis();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Financial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Financial</em>'.
	 * @generated
	 */
	ExplanationOfBenefitFinancial createExplanationOfBenefitFinancial();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Item</em>'.
	 * @generated
	 */
	ExplanationOfBenefitItem createExplanationOfBenefitItem();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Missing Teeth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Missing Teeth</em>'.
	 * @generated
	 */
	ExplanationOfBenefitMissingTeeth createExplanationOfBenefitMissingTeeth();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Note</em>'.
	 * @generated
	 */
	ExplanationOfBenefitNote createExplanationOfBenefitNote();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Onset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Onset</em>'.
	 * @generated
	 */
	ExplanationOfBenefitOnset createExplanationOfBenefitOnset();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Payee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Payee</em>'.
	 * @generated
	 */
	ExplanationOfBenefitPayee createExplanationOfBenefitPayee();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Procedure</em>'.
	 * @generated
	 */
	ExplanationOfBenefitProcedure createExplanationOfBenefitProcedure();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Prosthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Prosthesis</em>'.
	 * @generated
	 */
	ExplanationOfBenefitProsthesis createExplanationOfBenefitProsthesis();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Related</em>'.
	 * @generated
	 */
	ExplanationOfBenefitRelated createExplanationOfBenefitRelated();

	/**
	 * Returns a new object of class '<em>Explanation Of Benefit Sub Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explanation Of Benefit Sub Detail</em>'.
	 * @generated
	 */
	ExplanationOfBenefitSubDetail createExplanationOfBenefitSubDetail();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Extension Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Context</em>'.
	 * @generated
	 */
	ExtensionContext createExtensionContext();

	/**
	 * Returns a new object of class '<em>Family History Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Status</em>'.
	 * @generated
	 */
	FamilyHistoryStatus createFamilyHistoryStatus();

	/**
	 * Returns a new object of class '<em>Family Member History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Member History</em>'.
	 * @generated
	 */
	FamilyMemberHistory createFamilyMemberHistory();

	/**
	 * Returns a new object of class '<em>Family Member History Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Member History Condition</em>'.
	 * @generated
	 */
	FamilyMemberHistoryCondition createFamilyMemberHistoryCondition();

	/**
	 * Returns a new object of class '<em>Filter Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Operator</em>'.
	 * @generated
	 */
	FilterOperator createFilterOperator();

	/**
	 * Returns a new object of class '<em>Flag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flag</em>'.
	 * @generated
	 */
	Flag createFlag();

	/**
	 * Returns a new object of class '<em>Flag Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flag Status</em>'.
	 * @generated
	 */
	FlagStatus createFlagStatus();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Goal Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Outcome</em>'.
	 * @generated
	 */
	GoalOutcome createGoalOutcome();

	/**
	 * Returns a new object of class '<em>Goal Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Status</em>'.
	 * @generated
	 */
	GoalStatus createGoalStatus();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Group Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Characteristic</em>'.
	 * @generated
	 */
	GroupCharacteristic createGroupCharacteristic();

	/**
	 * Returns a new object of class '<em>Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Member</em>'.
	 * @generated
	 */
	GroupMember createGroupMember();

	/**
	 * Returns a new object of class '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Type</em>'.
	 * @generated
	 */
	GroupType createGroupType();

	/**
	 * Returns a new object of class '<em>Guidance Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guidance Response</em>'.
	 * @generated
	 */
	GuidanceResponse createGuidanceResponse();

	/**
	 * Returns a new object of class '<em>Guidance Response Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guidance Response Action</em>'.
	 * @generated
	 */
	GuidanceResponseAction createGuidanceResponseAction();

	/**
	 * Returns a new object of class '<em>Guidance Response Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guidance Response Behavior</em>'.
	 * @generated
	 */
	GuidanceResponseBehavior createGuidanceResponseBehavior();

	/**
	 * Returns a new object of class '<em>Guidance Response Related Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guidance Response Related Action</em>'.
	 * @generated
	 */
	GuidanceResponseRelatedAction createGuidanceResponseRelatedAction();

	/**
	 * Returns a new object of class '<em>Guidance Response Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guidance Response Status</em>'.
	 * @generated
	 */
	GuidanceResponseStatus createGuidanceResponseStatus();

	/**
	 * Returns a new object of class '<em>Guide Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guide Dependency Type</em>'.
	 * @generated
	 */
	GuideDependencyType createGuideDependencyType();

	/**
	 * Returns a new object of class '<em>Guide Page Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guide Page Kind</em>'.
	 * @generated
	 */
	GuidePageKind createGuidePageKind();

	/**
	 * Returns a new object of class '<em>Healthcare Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service</em>'.
	 * @generated
	 */
	HealthcareService createHealthcareService();

	/**
	 * Returns a new object of class '<em>Healthcare Service Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service Available Time</em>'.
	 * @generated
	 */
	HealthcareServiceAvailableTime createHealthcareServiceAvailableTime();

	/**
	 * Returns a new object of class '<em>Healthcare Service Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Service Not Available</em>'.
	 * @generated
	 */
	HealthcareServiceNotAvailable createHealthcareServiceNotAvailable();

	/**
	 * Returns a new object of class '<em>HTTP Verb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Verb</em>'.
	 * @generated
	 */
	HTTPVerb createHTTPVerb();

	/**
	 * Returns a new object of class '<em>Human Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Name</em>'.
	 * @generated
	 */
	HumanName createHumanName();

	/**
	 * Returns a new object of class '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id</em>'.
	 * @generated
	 */
	Id createId();

	/**
	 * Returns a new object of class '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier</em>'.
	 * @generated
	 */
	Identifier createIdentifier();

	/**
	 * Returns a new object of class '<em>Identifier Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Use</em>'.
	 * @generated
	 */
	IdentifierUse createIdentifierUse();

	/**
	 * Returns a new object of class '<em>Identity Assurance Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Assurance Level</em>'.
	 * @generated
	 */
	IdentityAssuranceLevel createIdentityAssuranceLevel();

	/**
	 * Returns a new object of class '<em>Imaging Excerpt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Excerpt</em>'.
	 * @generated
	 */
	ImagingExcerpt createImagingExcerpt();

	/**
	 * Returns a new object of class '<em>Imaging Excerpt Dicom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Excerpt Dicom</em>'.
	 * @generated
	 */
	ImagingExcerptDicom createImagingExcerptDicom();

	/**
	 * Returns a new object of class '<em>Imaging Excerpt Dicom1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Excerpt Dicom1</em>'.
	 * @generated
	 */
	ImagingExcerptDicom1 createImagingExcerptDicom1();

	/**
	 * Returns a new object of class '<em>Imaging Excerpt Dicom2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Excerpt Dicom2</em>'.
	 * @generated
	 */
	ImagingExcerptDicom2 createImagingExcerptDicom2();

	/**
	 * Returns a new object of class '<em>Imaging Excerpt Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Excerpt Instance</em>'.
	 * @generated
	 */
	ImagingExcerptInstance createImagingExcerptInstance();

	/**
	 * Returns a new object of class '<em>Imaging Excerpt Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Excerpt Series</em>'.
	 * @generated
	 */
	ImagingExcerptSeries createImagingExcerptSeries();

	/**
	 * Returns a new object of class '<em>Imaging Excerpt Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Excerpt Study</em>'.
	 * @generated
	 */
	ImagingExcerptStudy createImagingExcerptStudy();

	/**
	 * Returns a new object of class '<em>Imaging Excerpt Viewable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Excerpt Viewable</em>'.
	 * @generated
	 */
	ImagingExcerptViewable createImagingExcerptViewable();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection</em>'.
	 * @generated
	 */
	ImagingObjectSelection createImagingObjectSelection();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection Frame</em>'.
	 * @generated
	 */
	ImagingObjectSelectionFrame createImagingObjectSelectionFrame();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection Instance</em>'.
	 * @generated
	 */
	ImagingObjectSelectionInstance createImagingObjectSelectionInstance();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection Series</em>'.
	 * @generated
	 */
	ImagingObjectSelectionSeries createImagingObjectSelectionSeries();

	/**
	 * Returns a new object of class '<em>Imaging Object Selection Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Object Selection Study</em>'.
	 * @generated
	 */
	ImagingObjectSelectionStudy createImagingObjectSelectionStudy();

	/**
	 * Returns a new object of class '<em>Imaging Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study</em>'.
	 * @generated
	 */
	ImagingStudy createImagingStudy();

	/**
	 * Returns a new object of class '<em>Imaging Study Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study Instance</em>'.
	 * @generated
	 */
	ImagingStudyInstance createImagingStudyInstance();

	/**
	 * Returns a new object of class '<em>Imaging Study Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Study Series</em>'.
	 * @generated
	 */
	ImagingStudySeries createImagingStudySeries();

	/**
	 * Returns a new object of class '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization</em>'.
	 * @generated
	 */
	Immunization createImmunization();

	/**
	 * Returns a new object of class '<em>Immunization Explanation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Explanation</em>'.
	 * @generated
	 */
	ImmunizationExplanation createImmunizationExplanation();

	/**
	 * Returns a new object of class '<em>Immunization Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Reaction</em>'.
	 * @generated
	 */
	ImmunizationReaction createImmunizationReaction();

	/**
	 * Returns a new object of class '<em>Immunization Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation</em>'.
	 * @generated
	 */
	ImmunizationRecommendation createImmunizationRecommendation();

	/**
	 * Returns a new object of class '<em>Immunization Recommendation Date Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation Date Criterion</em>'.
	 * @generated
	 */
	ImmunizationRecommendationDateCriterion createImmunizationRecommendationDateCriterion();

	/**
	 * Returns a new object of class '<em>Immunization Recommendation Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation Protocol</em>'.
	 * @generated
	 */
	ImmunizationRecommendationProtocol createImmunizationRecommendationProtocol();

	/**
	 * Returns a new object of class '<em>Immunization Recommendation Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Recommendation Recommendation</em>'.
	 * @generated
	 */
	ImmunizationRecommendationRecommendation createImmunizationRecommendationRecommendation();

	/**
	 * Returns a new object of class '<em>Immunization Vaccination Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Vaccination Protocol</em>'.
	 * @generated
	 */
	ImmunizationVaccinationProtocol createImmunizationVaccinationProtocol();

	/**
	 * Returns a new object of class '<em>Implementation Guide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide</em>'.
	 * @generated
	 */
	ImplementationGuide createImplementationGuide();

	/**
	 * Returns a new object of class '<em>Implementation Guide Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Contact</em>'.
	 * @generated
	 */
	ImplementationGuideContact createImplementationGuideContact();

	/**
	 * Returns a new object of class '<em>Implementation Guide Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Dependency</em>'.
	 * @generated
	 */
	ImplementationGuideDependency createImplementationGuideDependency();

	/**
	 * Returns a new object of class '<em>Implementation Guide Global</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Global</em>'.
	 * @generated
	 */
	ImplementationGuideGlobal createImplementationGuideGlobal();

	/**
	 * Returns a new object of class '<em>Implementation Guide Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Package</em>'.
	 * @generated
	 */
	ImplementationGuidePackage createImplementationGuidePackage();

	/**
	 * Returns a new object of class '<em>Implementation Guide Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Page</em>'.
	 * @generated
	 */
	ImplementationGuidePage createImplementationGuidePage();

	/**
	 * Returns a new object of class '<em>Implementation Guide Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Guide Resource</em>'.
	 * @generated
	 */
	ImplementationGuideResource createImplementationGuideResource();

	/**
	 * Returns a new object of class '<em>Instance Availability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Availability</em>'.
	 * @generated
	 */
	InstanceAvailability createInstanceAvailability();

	/**
	 * Returns a new object of class '<em>Instant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instant</em>'.
	 * @generated
	 */
	Instant createInstant();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	Integer createInteger();

	/**
	 * Returns a new object of class '<em>Issue Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Severity</em>'.
	 * @generated
	 */
	IssueSeverity createIssueSeverity();

	/**
	 * Returns a new object of class '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Type</em>'.
	 * @generated
	 */
	IssueType createIssueType();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Library Code System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Code System</em>'.
	 * @generated
	 */
	LibraryCodeSystem createLibraryCodeSystem();

	/**
	 * Returns a new object of class '<em>Library Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Library</em>'.
	 * @generated
	 */
	LibraryLibrary createLibraryLibrary();

	/**
	 * Returns a new object of class '<em>Library Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Model</em>'.
	 * @generated
	 */
	LibraryModel createLibraryModel();

	/**
	 * Returns a new object of class '<em>Library Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Value Set</em>'.
	 * @generated
	 */
	LibraryValueSet createLibraryValueSet();

	/**
	 * Returns a new object of class '<em>Linkage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linkage</em>'.
	 * @generated
	 */
	Linkage createLinkage();

	/**
	 * Returns a new object of class '<em>Linkage Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linkage Item</em>'.
	 * @generated
	 */
	LinkageItem createLinkageItem();

	/**
	 * Returns a new object of class '<em>Linkage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linkage Type</em>'.
	 * @generated
	 */
	LinkageType createLinkageType();

	/**
	 * Returns a new object of class '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Type</em>'.
	 * @generated
	 */
	LinkType createLinkType();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Entry</em>'.
	 * @generated
	 */
	ListEntry createListEntry();

	/**
	 * Returns a new object of class '<em>List Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Mode</em>'.
	 * @generated
	 */
	ListMode createListMode();

	/**
	 * Returns a new object of class '<em>List Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Status</em>'.
	 * @generated
	 */
	ListStatus createListStatus();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Location Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Mode</em>'.
	 * @generated
	 */
	LocationMode createLocationMode();

	/**
	 * Returns a new object of class '<em>Location Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Position</em>'.
	 * @generated
	 */
	LocationPosition createLocationPosition();

	/**
	 * Returns a new object of class '<em>Location Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Status</em>'.
	 * @generated
	 */
	LocationStatus createLocationStatus();

	/**
	 * Returns a new object of class '<em>Markdown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markdown</em>'.
	 * @generated
	 */
	Markdown createMarkdown();

	/**
	 * Returns a new object of class '<em>Measmnt Principle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measmnt Principle</em>'.
	 * @generated
	 */
	MeasmntPrinciple createMeasmntPrinciple();

	/**
	 * Returns a new object of class '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure</em>'.
	 * @generated
	 */
	Measure createMeasure();

	/**
	 * Returns a new object of class '<em>Measure Data Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Data Usage</em>'.
	 * @generated
	 */
	MeasureDataUsage createMeasureDataUsage();

	/**
	 * Returns a new object of class '<em>Measure Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Group</em>'.
	 * @generated
	 */
	MeasureGroup createMeasureGroup();

	/**
	 * Returns a new object of class '<em>Measure Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Population</em>'.
	 * @generated
	 */
	MeasurePopulation createMeasurePopulation();

	/**
	 * Returns a new object of class '<em>Measure Population Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Population Type</em>'.
	 * @generated
	 */
	MeasurePopulationType createMeasurePopulationType();

	/**
	 * Returns a new object of class '<em>Measure Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report</em>'.
	 * @generated
	 */
	MeasureReport createMeasureReport();

	/**
	 * Returns a new object of class '<em>Measure Report Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group</em>'.
	 * @generated
	 */
	MeasureReportGroup createMeasureReportGroup();

	/**
	 * Returns a new object of class '<em>Measure Report Group1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group1</em>'.
	 * @generated
	 */
	MeasureReportGroup1 createMeasureReportGroup1();

	/**
	 * Returns a new object of class '<em>Measure Report Group2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Group2</em>'.
	 * @generated
	 */
	MeasureReportGroup2 createMeasureReportGroup2();

	/**
	 * Returns a new object of class '<em>Measure Report Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Population</em>'.
	 * @generated
	 */
	MeasureReportPopulation createMeasureReportPopulation();

	/**
	 * Returns a new object of class '<em>Measure Report Population1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Population1</em>'.
	 * @generated
	 */
	MeasureReportPopulation1 createMeasureReportPopulation1();

	/**
	 * Returns a new object of class '<em>Measure Report Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Status</em>'.
	 * @generated
	 */
	MeasureReportStatus createMeasureReportStatus();

	/**
	 * Returns a new object of class '<em>Measure Report Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Stratifier</em>'.
	 * @generated
	 */
	MeasureReportStratifier createMeasureReportStratifier();

	/**
	 * Returns a new object of class '<em>Measure Report Supplemental Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Supplemental Data</em>'.
	 * @generated
	 */
	MeasureReportSupplementalData createMeasureReportSupplementalData();

	/**
	 * Returns a new object of class '<em>Measure Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Report Type</em>'.
	 * @generated
	 */
	MeasureReportType createMeasureReportType();

	/**
	 * Returns a new object of class '<em>Measure Scoring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Scoring</em>'.
	 * @generated
	 */
	MeasureScoring createMeasureScoring();

	/**
	 * Returns a new object of class '<em>Measure Stratifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Stratifier</em>'.
	 * @generated
	 */
	MeasureStratifier createMeasureStratifier();

	/**
	 * Returns a new object of class '<em>Measure Supplemental Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Supplemental Data</em>'.
	 * @generated
	 */
	MeasureSupplementalData createMeasureSupplementalData();

	/**
	 * Returns a new object of class '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Type</em>'.
	 * @generated
	 */
	MeasureType createMeasureType();

	/**
	 * Returns a new object of class '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media</em>'.
	 * @generated
	 */
	Media createMedia();

	/**
	 * Returns a new object of class '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication</em>'.
	 * @generated
	 */
	Medication createMedication();

	/**
	 * Returns a new object of class '<em>Medication Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration</em>'.
	 * @generated
	 */
	MedicationAdministration createMedicationAdministration();

	/**
	 * Returns a new object of class '<em>Medication Administration Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration Dosage</em>'.
	 * @generated
	 */
	MedicationAdministrationDosage createMedicationAdministrationDosage();

	/**
	 * Returns a new object of class '<em>Medication Administration Event History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration Event History</em>'.
	 * @generated
	 */
	MedicationAdministrationEventHistory createMedicationAdministrationEventHistory();

	/**
	 * Returns a new object of class '<em>Medication Administration Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administration Status</em>'.
	 * @generated
	 */
	MedicationAdministrationStatus createMedicationAdministrationStatus();

	/**
	 * Returns a new object of class '<em>Medication Batch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Batch</em>'.
	 * @generated
	 */
	MedicationBatch createMedicationBatch();

	/**
	 * Returns a new object of class '<em>Medication Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Content</em>'.
	 * @generated
	 */
	MedicationContent createMedicationContent();

	/**
	 * Returns a new object of class '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense</em>'.
	 * @generated
	 */
	MedicationDispense createMedicationDispense();

	/**
	 * Returns a new object of class '<em>Medication Dispense Dosage Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense Dosage Instruction</em>'.
	 * @generated
	 */
	MedicationDispenseDosageInstruction createMedicationDispenseDosageInstruction();

	/**
	 * Returns a new object of class '<em>Medication Dispense Event History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense Event History</em>'.
	 * @generated
	 */
	MedicationDispenseEventHistory createMedicationDispenseEventHistory();

	/**
	 * Returns a new object of class '<em>Medication Dispense Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense Status</em>'.
	 * @generated
	 */
	MedicationDispenseStatus createMedicationDispenseStatus();

	/**
	 * Returns a new object of class '<em>Medication Dispense Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense Substitution</em>'.
	 * @generated
	 */
	MedicationDispenseSubstitution createMedicationDispenseSubstitution();

	/**
	 * Returns a new object of class '<em>Medication Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Ingredient</em>'.
	 * @generated
	 */
	MedicationIngredient createMedicationIngredient();

	/**
	 * Returns a new object of class '<em>Medication Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order</em>'.
	 * @generated
	 */
	MedicationOrder createMedicationOrder();

	/**
	 * Returns a new object of class '<em>Medication Order Dispense Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Dispense Request</em>'.
	 * @generated
	 */
	MedicationOrderDispenseRequest createMedicationOrderDispenseRequest();

	/**
	 * Returns a new object of class '<em>Medication Order Dosage Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Dosage Instruction</em>'.
	 * @generated
	 */
	MedicationOrderDosageInstruction createMedicationOrderDosageInstruction();

	/**
	 * Returns a new object of class '<em>Medication Order Event History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Event History</em>'.
	 * @generated
	 */
	MedicationOrderEventHistory createMedicationOrderEventHistory();

	/**
	 * Returns a new object of class '<em>Medication Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Status</em>'.
	 * @generated
	 */
	MedicationOrderStatus createMedicationOrderStatus();

	/**
	 * Returns a new object of class '<em>Medication Order Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Substitution</em>'.
	 * @generated
	 */
	MedicationOrderSubstitution createMedicationOrderSubstitution();

	/**
	 * Returns a new object of class '<em>Medication Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Package</em>'.
	 * @generated
	 */
	MedicationPackage createMedicationPackage();

	/**
	 * Returns a new object of class '<em>Medication Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Product</em>'.
	 * @generated
	 */
	MedicationProduct createMedicationProduct();

	/**
	 * Returns a new object of class '<em>Medication Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Statement</em>'.
	 * @generated
	 */
	MedicationStatement createMedicationStatement();

	/**
	 * Returns a new object of class '<em>Medication Statement Dosage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Statement Dosage</em>'.
	 * @generated
	 */
	MedicationStatementDosage createMedicationStatementDosage();

	/**
	 * Returns a new object of class '<em>Medication Statement Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Statement Status</em>'.
	 * @generated
	 */
	MedicationStatementStatus createMedicationStatementStatus();

	/**
	 * Returns a new object of class '<em>Message Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header</em>'.
	 * @generated
	 */
	MessageHeader createMessageHeader();

	/**
	 * Returns a new object of class '<em>Message Header Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Destination</em>'.
	 * @generated
	 */
	MessageHeaderDestination createMessageHeaderDestination();

	/**
	 * Returns a new object of class '<em>Message Header Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Response</em>'.
	 * @generated
	 */
	MessageHeaderResponse createMessageHeaderResponse();

	/**
	 * Returns a new object of class '<em>Message Header Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Header Source</em>'.
	 * @generated
	 */
	MessageHeaderSource createMessageHeaderSource();

	/**
	 * Returns a new object of class '<em>Message Significance Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Significance Category</em>'.
	 * @generated
	 */
	MessageSignificanceCategory createMessageSignificanceCategory();

	/**
	 * Returns a new object of class '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta</em>'.
	 * @generated
	 */
	Meta createMeta();

	/**
	 * Returns a new object of class '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition</em>'.
	 * @generated
	 */
	ModuleDefinition createModuleDefinition();

	/**
	 * Returns a new object of class '<em>Module Definition Code Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition Code Filter</em>'.
	 * @generated
	 */
	ModuleDefinitionCodeFilter createModuleDefinitionCodeFilter();

	/**
	 * Returns a new object of class '<em>Module Definition Code System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition Code System</em>'.
	 * @generated
	 */
	ModuleDefinitionCodeSystem createModuleDefinitionCodeSystem();

	/**
	 * Returns a new object of class '<em>Module Definition Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition Data</em>'.
	 * @generated
	 */
	ModuleDefinitionData createModuleDefinitionData();

	/**
	 * Returns a new object of class '<em>Module Definition Date Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition Date Filter</em>'.
	 * @generated
	 */
	ModuleDefinitionDateFilter createModuleDefinitionDateFilter();

	/**
	 * Returns a new object of class '<em>Module Definition Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition Library</em>'.
	 * @generated
	 */
	ModuleDefinitionLibrary createModuleDefinitionLibrary();

	/**
	 * Returns a new object of class '<em>Module Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition Model</em>'.
	 * @generated
	 */
	ModuleDefinitionModel createModuleDefinitionModel();

	/**
	 * Returns a new object of class '<em>Module Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition Parameter</em>'.
	 * @generated
	 */
	ModuleDefinitionParameter createModuleDefinitionParameter();

	/**
	 * Returns a new object of class '<em>Module Definition Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition Value Set</em>'.
	 * @generated
	 */
	ModuleDefinitionValueSet createModuleDefinitionValueSet();

	/**
	 * Returns a new object of class '<em>Module Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata</em>'.
	 * @generated
	 */
	ModuleMetadata createModuleMetadata();

	/**
	 * Returns a new object of class '<em>Module Metadata Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Contact</em>'.
	 * @generated
	 */
	ModuleMetadataContact createModuleMetadataContact();

	/**
	 * Returns a new object of class '<em>Module Metadata Contact1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Contact1</em>'.
	 * @generated
	 */
	ModuleMetadataContact1 createModuleMetadataContact1();

	/**
	 * Returns a new object of class '<em>Module Metadata Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Contributor</em>'.
	 * @generated
	 */
	ModuleMetadataContributor createModuleMetadataContributor();

	/**
	 * Returns a new object of class '<em>Module Metadata Contributor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Contributor Type</em>'.
	 * @generated
	 */
	ModuleMetadataContributorType createModuleMetadataContributorType();

	/**
	 * Returns a new object of class '<em>Module Metadata Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Coverage</em>'.
	 * @generated
	 */
	ModuleMetadataCoverage createModuleMetadataCoverage();

	/**
	 * Returns a new object of class '<em>Module Metadata Related Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Related Resource</em>'.
	 * @generated
	 */
	ModuleMetadataRelatedResource createModuleMetadataRelatedResource();

	/**
	 * Returns a new object of class '<em>Module Metadata Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Resource Type</em>'.
	 * @generated
	 */
	ModuleMetadataResourceType createModuleMetadataResourceType();

	/**
	 * Returns a new object of class '<em>Module Metadata Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Status</em>'.
	 * @generated
	 */
	ModuleMetadataStatus createModuleMetadataStatus();

	/**
	 * Returns a new object of class '<em>Module Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Metadata Type</em>'.
	 * @generated
	 */
	ModuleMetadataType createModuleMetadataType();

	/**
	 * Returns a new object of class '<em>Money</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Money</em>'.
	 * @generated
	 */
	Money createMoney();

	/**
	 * Returns a new object of class '<em>Name Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Use</em>'.
	 * @generated
	 */
	NameUse createNameUse();

	/**
	 * Returns a new object of class '<em>Naming System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System</em>'.
	 * @generated
	 */
	NamingSystem createNamingSystem();

	/**
	 * Returns a new object of class '<em>Naming System Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System Contact</em>'.
	 * @generated
	 */
	NamingSystemContact createNamingSystemContact();

	/**
	 * Returns a new object of class '<em>Naming System Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System Identifier Type</em>'.
	 * @generated
	 */
	NamingSystemIdentifierType createNamingSystemIdentifierType();

	/**
	 * Returns a new object of class '<em>Naming System Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System Type</em>'.
	 * @generated
	 */
	NamingSystemType createNamingSystemType();

	/**
	 * Returns a new object of class '<em>Naming System Unique Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming System Unique Id</em>'.
	 * @generated
	 */
	NamingSystemUniqueId createNamingSystemUniqueId();

	/**
	 * Returns a new object of class '<em>Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Narrative</em>'.
	 * @generated
	 */
	Narrative createNarrative();

	/**
	 * Returns a new object of class '<em>Narrative Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Narrative Status</em>'.
	 * @generated
	 */
	NarrativeStatus createNarrativeStatus();

	/**
	 * Returns a new object of class '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note Type</em>'.
	 * @generated
	 */
	NoteType createNoteType();

	/**
	 * Returns a new object of class '<em>Nutrition Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order</em>'.
	 * @generated
	 */
	NutritionOrder createNutritionOrder();

	/**
	 * Returns a new object of class '<em>Nutrition Order Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Administration</em>'.
	 * @generated
	 */
	NutritionOrderAdministration createNutritionOrderAdministration();

	/**
	 * Returns a new object of class '<em>Nutrition Order Enteral Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Enteral Formula</em>'.
	 * @generated
	 */
	NutritionOrderEnteralFormula createNutritionOrderEnteralFormula();

	/**
	 * Returns a new object of class '<em>Nutrition Order Nutrient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Nutrient</em>'.
	 * @generated
	 */
	NutritionOrderNutrient createNutritionOrderNutrient();

	/**
	 * Returns a new object of class '<em>Nutrition Order Oral Diet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Oral Diet</em>'.
	 * @generated
	 */
	NutritionOrderOralDiet createNutritionOrderOralDiet();

	/**
	 * Returns a new object of class '<em>Nutrition Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Status</em>'.
	 * @generated
	 */
	NutritionOrderStatus createNutritionOrderStatus();

	/**
	 * Returns a new object of class '<em>Nutrition Order Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Supplement</em>'.
	 * @generated
	 */
	NutritionOrderSupplement createNutritionOrderSupplement();

	/**
	 * Returns a new object of class '<em>Nutrition Order Texture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Order Texture</em>'.
	 * @generated
	 */
	NutritionOrderTexture createNutritionOrderTexture();

	/**
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

	/**
	 * Returns a new object of class '<em>Observation Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Component</em>'.
	 * @generated
	 */
	ObservationComponent createObservationComponent();

	/**
	 * Returns a new object of class '<em>Observation Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Reference Range</em>'.
	 * @generated
	 */
	ObservationReferenceRange createObservationReferenceRange();

	/**
	 * Returns a new object of class '<em>Observation Related</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Related</em>'.
	 * @generated
	 */
	ObservationRelated createObservationRelated();

	/**
	 * Returns a new object of class '<em>Observation Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Relationship Type</em>'.
	 * @generated
	 */
	ObservationRelationshipType createObservationRelationshipType();

	/**
	 * Returns a new object of class '<em>Observation Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Status</em>'.
	 * @generated
	 */
	ObservationStatus createObservationStatus();

	/**
	 * Returns a new object of class '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oid</em>'.
	 * @generated
	 */
	Oid createOid();

	/**
	 * Returns a new object of class '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition</em>'.
	 * @generated
	 */
	OperationDefinition createOperationDefinition();

	/**
	 * Returns a new object of class '<em>Operation Definition Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition Binding</em>'.
	 * @generated
	 */
	OperationDefinitionBinding createOperationDefinitionBinding();

	/**
	 * Returns a new object of class '<em>Operation Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition Contact</em>'.
	 * @generated
	 */
	OperationDefinitionContact createOperationDefinitionContact();

	/**
	 * Returns a new object of class '<em>Operation Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition Parameter</em>'.
	 * @generated
	 */
	OperationDefinitionParameter createOperationDefinitionParameter();

	/**
	 * Returns a new object of class '<em>Operation Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Kind</em>'.
	 * @generated
	 */
	OperationKind createOperationKind();

	/**
	 * Returns a new object of class '<em>Operation Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Outcome</em>'.
	 * @generated
	 */
	OperationOutcome createOperationOutcome();

	/**
	 * Returns a new object of class '<em>Operation Outcome Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Outcome Issue</em>'.
	 * @generated
	 */
	OperationOutcomeIssue createOperationOutcomeIssue();

	/**
	 * Returns a new object of class '<em>Operation Parameter Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Parameter Use</em>'.
	 * @generated
	 */
	OperationParameterUse createOperationParameterUse();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Order Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Response</em>'.
	 * @generated
	 */
	OrderResponse createOrderResponse();

	/**
	 * Returns a new object of class '<em>Order Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Set</em>'.
	 * @generated
	 */
	OrderSet createOrderSet();

	/**
	 * Returns a new object of class '<em>Order Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Status</em>'.
	 * @generated
	 */
	OrderStatus createOrderStatus();

	/**
	 * Returns a new object of class '<em>Order When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order When</em>'.
	 * @generated
	 */
	OrderWhen createOrderWhen();

	/**
	 * Returns a new object of class '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization</em>'.
	 * @generated
	 */
	Organization createOrganization();

	/**
	 * Returns a new object of class '<em>Organization Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Contact</em>'.
	 * @generated
	 */
	OrganizationContact createOrganizationContact();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns a new object of class '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters</em>'.
	 * @generated
	 */
	Parameters createParameters();

	/**
	 * Returns a new object of class '<em>Parameters Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters Parameter</em>'.
	 * @generated
	 */
	ParametersParameter createParametersParameter();

	/**
	 * Returns a new object of class '<em>Participant Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Required</em>'.
	 * @generated
	 */
	ParticipantRequired createParticipantRequired();

	/**
	 * Returns a new object of class '<em>Participant Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Type</em>'.
	 * @generated
	 */
	ParticipantType createParticipantType();

	/**
	 * Returns a new object of class '<em>Participation Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participation Status</em>'.
	 * @generated
	 */
	ParticipationStatus createParticipationStatus();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Patient Animal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Animal</em>'.
	 * @generated
	 */
	PatientAnimal createPatientAnimal();

	/**
	 * Returns a new object of class '<em>Patient Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Communication</em>'.
	 * @generated
	 */
	PatientCommunication createPatientCommunication();

	/**
	 * Returns a new object of class '<em>Patient Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Contact</em>'.
	 * @generated
	 */
	PatientContact createPatientContact();

	/**
	 * Returns a new object of class '<em>Patient Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Link</em>'.
	 * @generated
	 */
	PatientLink createPatientLink();

	/**
	 * Returns a new object of class '<em>Payment Notice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Notice</em>'.
	 * @generated
	 */
	PaymentNotice createPaymentNotice();

	/**
	 * Returns a new object of class '<em>Payment Reconciliation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Reconciliation</em>'.
	 * @generated
	 */
	PaymentReconciliation createPaymentReconciliation();

	/**
	 * Returns a new object of class '<em>Payment Reconciliation Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Reconciliation Detail</em>'.
	 * @generated
	 */
	PaymentReconciliationDetail createPaymentReconciliationDetail();

	/**
	 * Returns a new object of class '<em>Payment Reconciliation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Reconciliation Note</em>'.
	 * @generated
	 */
	PaymentReconciliationNote createPaymentReconciliationNote();

	/**
	 * Returns a new object of class '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period</em>'.
	 * @generated
	 */
	Period createPeriod();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Person Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Link</em>'.
	 * @generated
	 */
	PersonLink createPersonLink();

	/**
	 * Returns a new object of class '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Int</em>'.
	 * @generated
	 */
	PositiveInt createPositiveInt();

	/**
	 * Returns a new object of class '<em>Practitioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner</em>'.
	 * @generated
	 */
	Practitioner createPractitioner();

	/**
	 * Returns a new object of class '<em>Practitioner Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Practitioner Role</em>'.
	 * @generated
	 */
	PractitionerPractitionerRole createPractitionerPractitionerRole();

	/**
	 * Returns a new object of class '<em>Practitioner Qualification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Qualification</em>'.
	 * @generated
	 */
	PractitionerQualification createPractitionerQualification();

	/**
	 * Returns a new object of class '<em>Practitioner Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Role</em>'.
	 * @generated
	 */
	PractitionerRole createPractitionerRole();

	/**
	 * Returns a new object of class '<em>Practitioner Role Available Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Role Available Time</em>'.
	 * @generated
	 */
	PractitionerRoleAvailableTime createPractitionerRoleAvailableTime();

	/**
	 * Returns a new object of class '<em>Practitioner Role Not Available</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Practitioner Role Not Available</em>'.
	 * @generated
	 */
	PractitionerRoleNotAvailable createPractitionerRoleNotAvailable();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	Procedure createProcedure();

	/**
	 * Returns a new object of class '<em>Procedure Focal Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Focal Device</em>'.
	 * @generated
	 */
	ProcedureFocalDevice createProcedureFocalDevice();

	/**
	 * Returns a new object of class '<em>Procedure Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Performer</em>'.
	 * @generated
	 */
	ProcedurePerformer createProcedurePerformer();

	/**
	 * Returns a new object of class '<em>Procedure Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Request</em>'.
	 * @generated
	 */
	ProcedureRequest createProcedureRequest();

	/**
	 * Returns a new object of class '<em>Procedure Request Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Request Priority</em>'.
	 * @generated
	 */
	ProcedureRequestPriority createProcedureRequestPriority();

	/**
	 * Returns a new object of class '<em>Procedure Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Request Status</em>'.
	 * @generated
	 */
	ProcedureRequestStatus createProcedureRequestStatus();

	/**
	 * Returns a new object of class '<em>Procedure Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Status</em>'.
	 * @generated
	 */
	ProcedureStatus createProcedureStatus();

	/**
	 * Returns a new object of class '<em>Process Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Request</em>'.
	 * @generated
	 */
	ProcessRequest createProcessRequest();

	/**
	 * Returns a new object of class '<em>Process Request Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Request Item</em>'.
	 * @generated
	 */
	ProcessRequestItem createProcessRequestItem();

	/**
	 * Returns a new object of class '<em>Process Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Response</em>'.
	 * @generated
	 */
	ProcessResponse createProcessResponse();

	/**
	 * Returns a new object of class '<em>Process Response Notes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Response Notes</em>'.
	 * @generated
	 */
	ProcessResponseNotes createProcessResponseNotes();

	/**
	 * Returns a new object of class '<em>Property Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Representation</em>'.
	 * @generated
	 */
	PropertyRepresentation createPropertyRepresentation();

	/**
	 * Returns a new object of class '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Type</em>'.
	 * @generated
	 */
	PropertyType createPropertyType();

	/**
	 * Returns a new object of class '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol</em>'.
	 * @generated
	 */
	Protocol createProtocol();

	/**
	 * Returns a new object of class '<em>Protocol Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Activity</em>'.
	 * @generated
	 */
	ProtocolActivity createProtocolActivity();

	/**
	 * Returns a new object of class '<em>Protocol Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Component</em>'.
	 * @generated
	 */
	ProtocolComponent createProtocolComponent();

	/**
	 * Returns a new object of class '<em>Protocol Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Condition</em>'.
	 * @generated
	 */
	ProtocolCondition createProtocolCondition();

	/**
	 * Returns a new object of class '<em>Protocol Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Detail</em>'.
	 * @generated
	 */
	ProtocolDetail createProtocolDetail();

	/**
	 * Returns a new object of class '<em>Protocol Next</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Next</em>'.
	 * @generated
	 */
	ProtocolNext createProtocolNext();

	/**
	 * Returns a new object of class '<em>Protocol Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Precondition</em>'.
	 * @generated
	 */
	ProtocolPrecondition createProtocolPrecondition();

	/**
	 * Returns a new object of class '<em>Protocol Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Status</em>'.
	 * @generated
	 */
	ProtocolStatus createProtocolStatus();

	/**
	 * Returns a new object of class '<em>Protocol Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Step</em>'.
	 * @generated
	 */
	ProtocolStep createProtocolStep();

	/**
	 * Returns a new object of class '<em>Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Type</em>'.
	 * @generated
	 */
	ProtocolType createProtocolType();

	/**
	 * Returns a new object of class '<em>Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance</em>'.
	 * @generated
	 */
	Provenance createProvenance();

	/**
	 * Returns a new object of class '<em>Provenance Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Agent</em>'.
	 * @generated
	 */
	ProvenanceAgent createProvenanceAgent();

	/**
	 * Returns a new object of class '<em>Provenance Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Entity</em>'.
	 * @generated
	 */
	ProvenanceEntity createProvenanceEntity();

	/**
	 * Returns a new object of class '<em>Provenance Entity Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Entity Role</em>'.
	 * @generated
	 */
	ProvenanceEntityRole createProvenanceEntityRole();

	/**
	 * Returns a new object of class '<em>Provenance Related Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Related Agent</em>'.
	 * @generated
	 */
	ProvenanceRelatedAgent createProvenanceRelatedAgent();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Quantity Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity Comparator</em>'.
	 * @generated
	 */
	QuantityComparator createQuantityComparator();

	/**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
	Questionnaire createQuestionnaire();

	/**
	 * Returns a new object of class '<em>Questionnaire Enable When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Enable When</em>'.
	 * @generated
	 */
	QuestionnaireEnableWhen createQuestionnaireEnableWhen();

	/**
	 * Returns a new object of class '<em>Questionnaire Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Item</em>'.
	 * @generated
	 */
	QuestionnaireItem createQuestionnaireItem();

	/**
	 * Returns a new object of class '<em>Questionnaire Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Item Type</em>'.
	 * @generated
	 */
	QuestionnaireItemType createQuestionnaireItemType();

	/**
	 * Returns a new object of class '<em>Questionnaire Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Option</em>'.
	 * @generated
	 */
	QuestionnaireOption createQuestionnaireOption();

	/**
	 * Returns a new object of class '<em>Questionnaire Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response</em>'.
	 * @generated
	 */
	QuestionnaireResponse createQuestionnaireResponse();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Answer</em>'.
	 * @generated
	 */
	QuestionnaireResponseAnswer createQuestionnaireResponseAnswer();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Item</em>'.
	 * @generated
	 */
	QuestionnaireResponseItem createQuestionnaireResponseItem();

	/**
	 * Returns a new object of class '<em>Questionnaire Response Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Response Status</em>'.
	 * @generated
	 */
	QuestionnaireResponseStatus createQuestionnaireResponseStatus();

	/**
	 * Returns a new object of class '<em>Questionnaire Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire Status</em>'.
	 * @generated
	 */
	QuestionnaireStatus createQuestionnaireStatus();

	/**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
	Range createRange();

	/**
	 * Returns a new object of class '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratio</em>'.
	 * @generated
	 */
	Ratio createRatio();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Reference Version Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Version Rules</em>'.
	 * @generated
	 */
	ReferenceVersionRules createReferenceVersionRules();

	/**
	 * Returns a new object of class '<em>Referral Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referral Category</em>'.
	 * @generated
	 */
	ReferralCategory createReferralCategory();

	/**
	 * Returns a new object of class '<em>Referral Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referral Request</em>'.
	 * @generated
	 */
	ReferralRequest createReferralRequest();

	/**
	 * Returns a new object of class '<em>Referral Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referral Status</em>'.
	 * @generated
	 */
	ReferralStatus createReferralStatus();

	/**
	 * Returns a new object of class '<em>Related Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Person</em>'.
	 * @generated
	 */
	RelatedPerson createRelatedPerson();

	/**
	 * Returns a new object of class '<em>Remittance Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remittance Outcome</em>'.
	 * @generated
	 */
	RemittanceOutcome createRemittanceOutcome();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Resource Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Container</em>'.
	 * @generated
	 */
	ResourceContainer createResourceContainer();

	/**
	 * Returns a new object of class '<em>Resource Version Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Version Policy</em>'.
	 * @generated
	 */
	ResourceVersionPolicy createResourceVersionPolicy();

	/**
	 * Returns a new object of class '<em>Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Type</em>'.
	 * @generated
	 */
	ResponseType createResponseType();

	/**
	 * Returns a new object of class '<em>Restful Conformance Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restful Conformance Mode</em>'.
	 * @generated
	 */
	RestfulConformanceMode createRestfulConformanceMode();

	/**
	 * Returns a new object of class '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Assessment</em>'.
	 * @generated
	 */
	RiskAssessment createRiskAssessment();

	/**
	 * Returns a new object of class '<em>Risk Assessment Prediction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Assessment Prediction</em>'.
	 * @generated
	 */
	RiskAssessmentPrediction createRiskAssessmentPrediction();

	/**
	 * Returns a new object of class '<em>Sampled Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampled Data</em>'.
	 * @generated
	 */
	SampledData createSampledData();

	/**
	 * Returns a new object of class '<em>Sampled Data Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampled Data Data Type</em>'.
	 * @generated
	 */
	SampledDataDataType createSampledDataDataType();

	/**
	 * Returns a new object of class '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule</em>'.
	 * @generated
	 */
	Schedule createSchedule();

	/**
	 * Returns a new object of class '<em>Search Entry Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Entry Mode</em>'.
	 * @generated
	 */
	SearchEntryMode createSearchEntryMode();

	/**
	 * Returns a new object of class '<em>Search Modifier Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Modifier Code</em>'.
	 * @generated
	 */
	SearchModifierCode createSearchModifierCode();

	/**
	 * Returns a new object of class '<em>Search Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Parameter</em>'.
	 * @generated
	 */
	SearchParameter createSearchParameter();

	/**
	 * Returns a new object of class '<em>Search Parameter Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Parameter Contact</em>'.
	 * @generated
	 */
	SearchParameterContact createSearchParameterContact();

	/**
	 * Returns a new object of class '<em>Search Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Param Type</em>'.
	 * @generated
	 */
	SearchParamType createSearchParamType();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Sequence Inner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Inner</em>'.
	 * @generated
	 */
	SequenceInner createSequenceInner();

	/**
	 * Returns a new object of class '<em>Sequence Outer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Outer</em>'.
	 * @generated
	 */
	SequenceOuter createSequenceOuter();

	/**
	 * Returns a new object of class '<em>Sequence Quality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Quality</em>'.
	 * @generated
	 */
	SequenceQuality createSequenceQuality();

	/**
	 * Returns a new object of class '<em>Sequence Reference Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Reference Seq</em>'.
	 * @generated
	 */
	SequenceReferenceSeq createSequenceReferenceSeq();

	/**
	 * Returns a new object of class '<em>Sequence Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Repository</em>'.
	 * @generated
	 */
	SequenceRepository createSequenceRepository();

	/**
	 * Returns a new object of class '<em>Sequence Structure Variation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Structure Variation</em>'.
	 * @generated
	 */
	SequenceStructureVariation createSequenceStructureVariation();

	/**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
	SequenceType createSequenceType();

	/**
	 * Returns a new object of class '<em>Sequence Variation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Variation</em>'.
	 * @generated
	 */
	SequenceVariation createSequenceVariation();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>Simple Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Quantity</em>'.
	 * @generated
	 */
	SimpleQuantity createSimpleQuantity();

	/**
	 * Returns a new object of class '<em>Slicing Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slicing Rules</em>'.
	 * @generated
	 */
	SlicingRules createSlicingRules();

	/**
	 * Returns a new object of class '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot</em>'.
	 * @generated
	 */
	Slot createSlot();

	/**
	 * Returns a new object of class '<em>Slot Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Status</em>'.
	 * @generated
	 */
	SlotStatus createSlotStatus();

	/**
	 * Returns a new object of class '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen</em>'.
	 * @generated
	 */
	Specimen createSpecimen();

	/**
	 * Returns a new object of class '<em>Specimen Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Collection</em>'.
	 * @generated
	 */
	SpecimenCollection createSpecimenCollection();

	/**
	 * Returns a new object of class '<em>Specimen Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Container</em>'.
	 * @generated
	 */
	SpecimenContainer createSpecimenContainer();

	/**
	 * Returns a new object of class '<em>Specimen Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Status</em>'.
	 * @generated
	 */
	SpecimenStatus createSpecimenStatus();

	/**
	 * Returns a new object of class '<em>Specimen Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Treatment</em>'.
	 * @generated
	 */
	SpecimenTreatment createSpecimenTreatment();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Structure Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition</em>'.
	 * @generated
	 */
	StructureDefinition createStructureDefinition();

	/**
	 * Returns a new object of class '<em>Structure Definition Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Contact</em>'.
	 * @generated
	 */
	StructureDefinitionContact createStructureDefinitionContact();

	/**
	 * Returns a new object of class '<em>Structure Definition Differential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Differential</em>'.
	 * @generated
	 */
	StructureDefinitionDifferential createStructureDefinitionDifferential();

	/**
	 * Returns a new object of class '<em>Structure Definition Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Kind</em>'.
	 * @generated
	 */
	StructureDefinitionKind createStructureDefinitionKind();

	/**
	 * Returns a new object of class '<em>Structure Definition Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Mapping</em>'.
	 * @generated
	 */
	StructureDefinitionMapping createStructureDefinitionMapping();

	/**
	 * Returns a new object of class '<em>Structure Definition Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Definition Snapshot</em>'.
	 * @generated
	 */
	StructureDefinitionSnapshot createStructureDefinitionSnapshot();

	/**
	 * Returns a new object of class '<em>Structure Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map</em>'.
	 * @generated
	 */
	StructureMap createStructureMap();

	/**
	 * Returns a new object of class '<em>Structure Map Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Contact</em>'.
	 * @generated
	 */
	StructureMapContact createStructureMapContact();

	/**
	 * Returns a new object of class '<em>Structure Map Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Context Type</em>'.
	 * @generated
	 */
	StructureMapContextType createStructureMapContextType();

	/**
	 * Returns a new object of class '<em>Structure Map Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Dependent</em>'.
	 * @generated
	 */
	StructureMapDependent createStructureMapDependent();

	/**
	 * Returns a new object of class '<em>Structure Map Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Group</em>'.
	 * @generated
	 */
	StructureMapGroup createStructureMapGroup();

	/**
	 * Returns a new object of class '<em>Structure Map Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Input</em>'.
	 * @generated
	 */
	StructureMapInput createStructureMapInput();

	/**
	 * Returns a new object of class '<em>Structure Map Input Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Input Mode</em>'.
	 * @generated
	 */
	StructureMapInputMode createStructureMapInputMode();

	/**
	 * Returns a new object of class '<em>Structure Map List Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map List Mode</em>'.
	 * @generated
	 */
	StructureMapListMode createStructureMapListMode();

	/**
	 * Returns a new object of class '<em>Structure Map Model Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Model Mode</em>'.
	 * @generated
	 */
	StructureMapModelMode createStructureMapModelMode();

	/**
	 * Returns a new object of class '<em>Structure Map Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Parameter</em>'.
	 * @generated
	 */
	StructureMapParameter createStructureMapParameter();

	/**
	 * Returns a new object of class '<em>Structure Map Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Rule</em>'.
	 * @generated
	 */
	StructureMapRule createStructureMapRule();

	/**
	 * Returns a new object of class '<em>Structure Map Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Source</em>'.
	 * @generated
	 */
	StructureMapSource createStructureMapSource();

	/**
	 * Returns a new object of class '<em>Structure Map Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Structure</em>'.
	 * @generated
	 */
	StructureMapStructure createStructureMapStructure();

	/**
	 * Returns a new object of class '<em>Structure Map Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Target</em>'.
	 * @generated
	 */
	StructureMapTarget createStructureMapTarget();

	/**
	 * Returns a new object of class '<em>Structure Map Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Map Transform</em>'.
	 * @generated
	 */
	StructureMapTransform createStructureMapTransform();

	/**
	 * Returns a new object of class '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription</em>'.
	 * @generated
	 */
	Subscription createSubscription();

	/**
	 * Returns a new object of class '<em>Subscription Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription Channel</em>'.
	 * @generated
	 */
	SubscriptionChannel createSubscriptionChannel();

	/**
	 * Returns a new object of class '<em>Subscription Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription Channel Type</em>'.
	 * @generated
	 */
	SubscriptionChannelType createSubscriptionChannelType();

	/**
	 * Returns a new object of class '<em>Subscription Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription Status</em>'.
	 * @generated
	 */
	SubscriptionStatus createSubscriptionStatus();

	/**
	 * Returns a new object of class '<em>Substance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance</em>'.
	 * @generated
	 */
	Substance createSubstance();

	/**
	 * Returns a new object of class '<em>Substance Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Ingredient</em>'.
	 * @generated
	 */
	SubstanceIngredient createSubstanceIngredient();

	/**
	 * Returns a new object of class '<em>Substance Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Instance</em>'.
	 * @generated
	 */
	SubstanceInstance createSubstanceInstance();

	/**
	 * Returns a new object of class '<em>Supply Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Delivery</em>'.
	 * @generated
	 */
	SupplyDelivery createSupplyDelivery();

	/**
	 * Returns a new object of class '<em>Supply Delivery Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Delivery Status</em>'.
	 * @generated
	 */
	SupplyDeliveryStatus createSupplyDeliveryStatus();

	/**
	 * Returns a new object of class '<em>Supply Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Request</em>'.
	 * @generated
	 */
	SupplyRequest createSupplyRequest();

	/**
	 * Returns a new object of class '<em>Supply Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Request Status</em>'.
	 * @generated
	 */
	SupplyRequestStatus createSupplyRequestStatus();

	/**
	 * Returns a new object of class '<em>Supply Request When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Request When</em>'.
	 * @generated
	 */
	SupplyRequestWhen createSupplyRequestWhen();

	/**
	 * Returns a new object of class '<em>System Restful Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Restful Interaction</em>'.
	 * @generated
	 */
	SystemRestfulInteraction createSystemRestfulInteraction();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Task Fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Fulfillment</em>'.
	 * @generated
	 */
	TaskFulfillment createTaskFulfillment();

	/**
	 * Returns a new object of class '<em>Task Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Input</em>'.
	 * @generated
	 */
	TaskInput createTaskInput();

	/**
	 * Returns a new object of class '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Output</em>'.
	 * @generated
	 */
	TaskOutput createTaskOutput();

	/**
	 * Returns a new object of class '<em>Task Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Priority</em>'.
	 * @generated
	 */
	TaskPriority createTaskPriority();

	/**
	 * Returns a new object of class '<em>Task Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Status</em>'.
	 * @generated
	 */
	TaskStatus createTaskStatus();

	/**
	 * Returns a new object of class '<em>Test Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script</em>'.
	 * @generated
	 */
	TestScript createTestScript();

	/**
	 * Returns a new object of class '<em>Test Script Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Action</em>'.
	 * @generated
	 */
	TestScriptAction createTestScriptAction();

	/**
	 * Returns a new object of class '<em>Test Script Action1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Action1</em>'.
	 * @generated
	 */
	TestScriptAction1 createTestScriptAction1();

	/**
	 * Returns a new object of class '<em>Test Script Action2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Action2</em>'.
	 * @generated
	 */
	TestScriptAction2 createTestScriptAction2();

	/**
	 * Returns a new object of class '<em>Test Script Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Assert</em>'.
	 * @generated
	 */
	TestScriptAssert createTestScriptAssert();

	/**
	 * Returns a new object of class '<em>Test Script Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Capability</em>'.
	 * @generated
	 */
	TestScriptCapability createTestScriptCapability();

	/**
	 * Returns a new object of class '<em>Test Script Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Contact</em>'.
	 * @generated
	 */
	TestScriptContact createTestScriptContact();

	/**
	 * Returns a new object of class '<em>Test Script Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Destination</em>'.
	 * @generated
	 */
	TestScriptDestination createTestScriptDestination();

	/**
	 * Returns a new object of class '<em>Test Script Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Fixture</em>'.
	 * @generated
	 */
	TestScriptFixture createTestScriptFixture();

	/**
	 * Returns a new object of class '<em>Test Script Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Link</em>'.
	 * @generated
	 */
	TestScriptLink createTestScriptLink();

	/**
	 * Returns a new object of class '<em>Test Script Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Metadata</em>'.
	 * @generated
	 */
	TestScriptMetadata createTestScriptMetadata();

	/**
	 * Returns a new object of class '<em>Test Script Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Operation</em>'.
	 * @generated
	 */
	TestScriptOperation createTestScriptOperation();

	/**
	 * Returns a new object of class '<em>Test Script Origin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Origin</em>'.
	 * @generated
	 */
	TestScriptOrigin createTestScriptOrigin();

	/**
	 * Returns a new object of class '<em>Test Script Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Param</em>'.
	 * @generated
	 */
	TestScriptParam createTestScriptParam();

	/**
	 * Returns a new object of class '<em>Test Script Param1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Param1</em>'.
	 * @generated
	 */
	TestScriptParam1 createTestScriptParam1();

	/**
	 * Returns a new object of class '<em>Test Script Param2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Param2</em>'.
	 * @generated
	 */
	TestScriptParam2 createTestScriptParam2();

	/**
	 * Returns a new object of class '<em>Test Script Param3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Param3</em>'.
	 * @generated
	 */
	TestScriptParam3 createTestScriptParam3();

	/**
	 * Returns a new object of class '<em>Test Script Request Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Request Header</em>'.
	 * @generated
	 */
	TestScriptRequestHeader createTestScriptRequestHeader();

	/**
	 * Returns a new object of class '<em>Test Script Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Rule</em>'.
	 * @generated
	 */
	TestScriptRule createTestScriptRule();

	/**
	 * Returns a new object of class '<em>Test Script Rule1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Rule1</em>'.
	 * @generated
	 */
	TestScriptRule1 createTestScriptRule1();

	/**
	 * Returns a new object of class '<em>Test Script Rule2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Rule2</em>'.
	 * @generated
	 */
	TestScriptRule2 createTestScriptRule2();

	/**
	 * Returns a new object of class '<em>Test Script Rule3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Rule3</em>'.
	 * @generated
	 */
	TestScriptRule3 createTestScriptRule3();

	/**
	 * Returns a new object of class '<em>Test Script Ruleset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Ruleset</em>'.
	 * @generated
	 */
	TestScriptRuleset createTestScriptRuleset();

	/**
	 * Returns a new object of class '<em>Test Script Ruleset1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Ruleset1</em>'.
	 * @generated
	 */
	TestScriptRuleset1 createTestScriptRuleset1();

	/**
	 * Returns a new object of class '<em>Test Script Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Setup</em>'.
	 * @generated
	 */
	TestScriptSetup createTestScriptSetup();

	/**
	 * Returns a new object of class '<em>Test Script Teardown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Teardown</em>'.
	 * @generated
	 */
	TestScriptTeardown createTestScriptTeardown();

	/**
	 * Returns a new object of class '<em>Test Script Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Test</em>'.
	 * @generated
	 */
	TestScriptTest createTestScriptTest();

	/**
	 * Returns a new object of class '<em>Test Script Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Script Variable</em>'.
	 * @generated
	 */
	TestScriptVariable createTestScriptVariable();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing</em>'.
	 * @generated
	 */
	Timing createTiming();

	/**
	 * Returns a new object of class '<em>Timing Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Repeat</em>'.
	 * @generated
	 */
	TimingRepeat createTimingRepeat();

	/**
	 * Returns a new object of class '<em>Transaction Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Mode</em>'.
	 * @generated
	 */
	TransactionMode createTransactionMode();

	/**
	 * Returns a new object of class '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Definition</em>'.
	 * @generated
	 */
	TriggerDefinition createTriggerDefinition();

	/**
	 * Returns a new object of class '<em>Trigger Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Type</em>'.
	 * @generated
	 */
	TriggerType createTriggerType();

	/**
	 * Returns a new object of class '<em>Type Derivation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Derivation Rule</em>'.
	 * @generated
	 */
	TypeDerivationRule createTypeDerivationRule();

	/**
	 * Returns a new object of class '<em>Type Restful Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Restful Interaction</em>'.
	 * @generated
	 */
	TypeRestfulInteraction createTypeRestfulInteraction();

	/**
	 * Returns a new object of class '<em>Units Of Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Units Of Time</em>'.
	 * @generated
	 */
	UnitsOfTime createUnitsOfTime();

	/**
	 * Returns a new object of class '<em>Unknown Content Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Content Code</em>'.
	 * @generated
	 */
	UnknownContentCode createUnknownContentCode();

	/**
	 * Returns a new object of class '<em>Unsigned Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Int</em>'.
	 * @generated
	 */
	UnsignedInt createUnsignedInt();

	/**
	 * Returns a new object of class '<em>Uri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri</em>'.
	 * @generated
	 */
	Uri createUri();

	/**
	 * Returns a new object of class '<em>Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use</em>'.
	 * @generated
	 */
	Use createUse();

	/**
	 * Returns a new object of class '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uuid</em>'.
	 * @generated
	 */
	Uuid createUuid();

	/**
	 * Returns a new object of class '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set</em>'.
	 * @generated
	 */
	ValueSet createValueSet();

	/**
	 * Returns a new object of class '<em>Value Set Compose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Compose</em>'.
	 * @generated
	 */
	ValueSetCompose createValueSetCompose();

	/**
	 * Returns a new object of class '<em>Value Set Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Concept</em>'.
	 * @generated
	 */
	ValueSetConcept createValueSetConcept();

	/**
	 * Returns a new object of class '<em>Value Set Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Contact</em>'.
	 * @generated
	 */
	ValueSetContact createValueSetContact();

	/**
	 * Returns a new object of class '<em>Value Set Contains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Contains</em>'.
	 * @generated
	 */
	ValueSetContains createValueSetContains();

	/**
	 * Returns a new object of class '<em>Value Set Designation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Designation</em>'.
	 * @generated
	 */
	ValueSetDesignation createValueSetDesignation();

	/**
	 * Returns a new object of class '<em>Value Set Expansion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Expansion</em>'.
	 * @generated
	 */
	ValueSetExpansion createValueSetExpansion();

	/**
	 * Returns a new object of class '<em>Value Set Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Filter</em>'.
	 * @generated
	 */
	ValueSetFilter createValueSetFilter();

	/**
	 * Returns a new object of class '<em>Value Set Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Include</em>'.
	 * @generated
	 */
	ValueSetInclude createValueSetInclude();

	/**
	 * Returns a new object of class '<em>Value Set Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Parameter</em>'.
	 * @generated
	 */
	ValueSetParameter createValueSetParameter();

	/**
	 * Returns a new object of class '<em>Vision Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Base</em>'.
	 * @generated
	 */
	VisionBase createVisionBase();

	/**
	 * Returns a new object of class '<em>Vision Eyes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Eyes</em>'.
	 * @generated
	 */
	VisionEyes createVisionEyes();

	/**
	 * Returns a new object of class '<em>Vision Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Prescription</em>'.
	 * @generated
	 */
	VisionPrescription createVisionPrescription();

	/**
	 * Returns a new object of class '<em>Vision Prescription Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision Prescription Dispense</em>'.
	 * @generated
	 */
	VisionPrescriptionDispense createVisionPrescriptionDispense();

	/**
	 * Returns a new object of class '<em>XPath Usage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XPath Usage Type</em>'.
	 * @generated
	 */
	XPathUsageType createXPathUsageType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FhirPackage getFhirPackage();

} //FhirFactory
