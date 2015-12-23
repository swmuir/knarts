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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referral Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getRecipients <em>Recipient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getReason <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getServiceRequesteds <em>Service Requested</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getFulfillmentTime <em>Fulfillment Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest()
 * @model
 * @generated
 */
public interface ReferralRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Status()
	 * @model required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' reference.
	 * @see #setDate(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Date()
	 * @model
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getDate <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Type()
	 * @model
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialty</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' reference.
	 * @see #setSpecialty(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Specialty()
	 * @model
	 * @generated
	 */
	CodeableConcept getSpecialty();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getSpecialty <em>Specialty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialty</em>' reference.
	 * @see #getSpecialty()
	 * @generated
	 */
	void setSpecialty(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Priority()
	 * @model
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Patient()
	 * @model
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requester</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requester</em>' reference.
	 * @see #setRequester(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Requester()
	 * @model
	 * @generated
	 */
	Resource getRequester();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getRequester <em>Requester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Resource value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Recipient()
	 * @model
	 * @generated
	 */
	EList<Resource> getRecipients();

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' reference.
	 * @see #setEncounter(Encounter)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Encounter()
	 * @model
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getEncounter <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Encounter value);

	/**
	 * Returns the value of the '<em><b>Date Sent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Sent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Sent</em>' reference.
	 * @see #setDateSent(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_DateSent()
	 * @model
	 * @generated
	 */
	DateTime getDateSent();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getDateSent <em>Date Sent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Sent</em>' reference.
	 * @see #getDateSent()
	 * @generated
	 */
	void setDateSent(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Reason()
	 * @model
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getReason <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Service Requested</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Requested</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Requested</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_ServiceRequested()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getServiceRequesteds();

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Information</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_SupportingInformation()
	 * @model
	 * @generated
	 */
	EList<Resource> getSupportingInformations();

	/**
	 * Returns the value of the '<em><b>Fulfillment Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillment Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Time</em>' reference.
	 * @see #setFulfillmentTime(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getReferralRequest_FulfillmentTime()
	 * @model
	 * @generated
	 */
	Period getFulfillmentTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest#getFulfillmentTime <em>Fulfillment Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Time</em>' reference.
	 * @see #getFulfillmentTime()
	 * @generated
	 */
	void setFulfillmentTime(Period value);

} // ReferralRequest
