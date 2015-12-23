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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getRecipients <em>Recipient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getPayloads <em>Payload</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getMediums <em>Medium</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getSent <em>Sent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getReceived <em>Received</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getRequestDetail <em>Request Detail</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Category()
	 * @model
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Sender()
	 * @model
	 * @generated
	 */
	Resource getSender();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Resource value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Recipient()
	 * @model
	 * @generated
	 */
	EList<Resource> getRecipients();

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.CommunicationPayload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Payload()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationPayload> getPayloads();

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Medium()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getMediums();

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Status()
	 * @model
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Encounter()
	 * @model
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getEncounter <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Encounter value);

	/**
	 * Returns the value of the '<em><b>Sent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent</em>' reference.
	 * @see #setSent(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Sent()
	 * @model
	 * @generated
	 */
	DateTime getSent();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getSent <em>Sent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent</em>' reference.
	 * @see #getSent()
	 * @generated
	 */
	void setSent(DateTime value);

	/**
	 * Returns the value of the '<em><b>Received</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received</em>' reference.
	 * @see #setReceived(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Received()
	 * @model
	 * @generated
	 */
	DateTime getReceived();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getReceived <em>Received</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received</em>' reference.
	 * @see #getReceived()
	 * @generated
	 */
	void setReceived(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Reason()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getReasons();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_Subject()
	 * @model
	 * @generated
	 */
	Patient getSubject();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Patient value);

	/**
	 * Returns the value of the '<em><b>Request Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Detail</em>' reference.
	 * @see #setRequestDetail(CommunicationRequest)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getCommunication_RequestDetail()
	 * @model
	 * @generated
	 */
	CommunicationRequest getRequestDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Communication#getRequestDetail <em>Request Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Detail</em>' reference.
	 * @see #getRequestDetail()
	 * @generated
	 */
	void setRequestDetail(CommunicationRequest value);

} // Communication
