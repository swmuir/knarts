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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Except</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s privacy policy, which is in accordance with governing jurisdictional and organization privacy policies that grant or withhold consent:.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentExcept#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConsentExcept()
 * @model extendedMetaData="name='Consent.Except' kind='elementOnly'"
 * @generated
 */
public interface ConsentExcept extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Applies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant time or time-period when this Consent Provision is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies</em>' containment reference.
	 * @see #setApplies(Period)
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Applies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applies' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getApplies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentExcept#getApplies <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies</em>' containment reference.
	 * @see #getApplies()
	 * @generated
	 */
	void setApplies(Period value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type exception to the base Consent policy such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentExcept#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subtype of this exception to the base Consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference.
	 * @see #setSubType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentExcept#getSubType <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' containment reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The matter of concern in the context of this provision of the agrement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Topic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getTopic();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action stipulated by this Consent Exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAction();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConsentAgent1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An actor having a role in this exeption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Agent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConsentAgent1> getAgent();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human readable form of this Consent Exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConsentExcept_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentExcept#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.hl7.fhir.String value);

} // ConsentExcept
