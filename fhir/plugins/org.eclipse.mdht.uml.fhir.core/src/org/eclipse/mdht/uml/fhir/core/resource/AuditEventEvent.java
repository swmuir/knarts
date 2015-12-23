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

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getOutcomeDesc <em>Outcome Desc</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getPurposeOfEvents <em>Purpose Of Event</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAuditEventEvent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AuditEvent_Event'"
 * @generated
 */
public interface AuditEventEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAuditEventEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAuditEventEvent_Subtype()
	 * @model
	 * @generated
	 */
	EList<Coding> getSubtypes();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAuditEventEvent_Action()
	 * @model
	 * @generated
	 */
	Code getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Code value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' reference.
	 * @see #setDateTime(Instant)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAuditEventEvent_DateTime()
	 * @model required="true"
	 * @generated
	 */
	Instant getDateTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getDateTime <em>Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Instant value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome</em>' reference.
	 * @see #setOutcome(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAuditEventEvent_Outcome()
	 * @model
	 * @generated
	 */
	Code getOutcome();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getOutcome <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Code value);

	/**
	 * Returns the value of the '<em><b>Outcome Desc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome Desc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome Desc</em>' reference.
	 * @see #setOutcomeDesc(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAuditEventEvent_OutcomeDesc()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getOutcomeDesc();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AuditEventEvent#getOutcomeDesc <em>Outcome Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome Desc</em>' reference.
	 * @see #getOutcomeDesc()
	 * @generated
	 */
	void setOutcomeDesc(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Purpose Of Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Of Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Of Event</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAuditEventEvent_PurposeOfEvent()
	 * @model
	 * @generated
	 */
	EList<Coding> getPurposeOfEvents();

} // AuditEventEvent
