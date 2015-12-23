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
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detected Issue</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getImplicateds <em>Implicated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getMitigations <em>Mitigation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue()
 * @model
 * @generated
 */
public interface DetectedIssue extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Patient()
	 * @model
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Category()
	 * @model
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' reference.
	 * @see #setSeverity(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Severity()
	 * @model
	 * @generated
	 */
	Code getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getSeverity <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Code value);

	/**
	 * Returns the value of the '<em><b>Implicated</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicated</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicated</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Implicated()
	 * @model
	 * @generated
	 */
	EList<Resource> getImplicateds();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' reference.
	 * @see #setDetail(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Detail()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getDetail <em>Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(org.eclipse.mdht.uml.fhir.core.datatype.String value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Date()
	 * @model
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getDate <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Author()
	 * @model
	 * @generated
	 */
	Resource getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Resource value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Identifier()
	 * @model
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Uri)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Reference()
	 * @model
	 * @generated
	 */
	Uri getReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssue#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.DetectedIssueMitigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mitigation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigation</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDetectedIssue_Mitigation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DetectedIssueMitigation> getMitigations();

} // DetectedIssue
