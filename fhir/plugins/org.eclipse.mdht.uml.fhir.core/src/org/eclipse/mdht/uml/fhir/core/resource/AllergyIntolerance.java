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

import org.eclipse.mdht.uml.fhir.core.datatype.Annotation;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getRecordedDate <em>Recorded Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getLastOccurence <em>Last Occurence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getReactions <em>Reaction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance()
 * @model
 * @generated
 */
public interface AllergyIntolerance extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Onset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset</em>' reference.
	 * @see #setOnset(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Onset()
	 * @model
	 * @generated
	 */
	DateTime getOnset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getOnset <em>Onset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset</em>' reference.
	 * @see #getOnset()
	 * @generated
	 */
	void setOnset(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorded Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Date</em>' reference.
	 * @see #setRecordedDate(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_RecordedDate()
	 * @model
	 * @generated
	 */
	DateTime getRecordedDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getRecordedDate <em>Recorded Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Date</em>' reference.
	 * @see #getRecordedDate()
	 * @generated
	 */
	void setRecordedDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorder</em>' reference.
	 * @see #setRecorder(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Recorder()
	 * @model
	 * @generated
	 */
	Resource getRecorder();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getRecorder <em>Recorder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Resource value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Patient()
	 * @model required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporter</em>' reference.
	 * @see #setReporter(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Reporter()
	 * @model
	 * @generated
	 */
	Resource getReporter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getReporter <em>Reporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(Resource value);

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance</em>' reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Substance()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getSubstance <em>Substance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Status()
	 * @model
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criticality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' reference.
	 * @see #setCriticality(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Criticality()
	 * @model
	 * @generated
	 */
	Code getCriticality();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getCriticality <em>Criticality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' reference.
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(Code value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Type()
	 * @model
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Category()
	 * @model
	 * @generated
	 */
	Code getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Code value);

	/**
	 * Returns the value of the '<em><b>Last Occurence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Occurence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Occurence</em>' reference.
	 * @see #setLastOccurence(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_LastOccurence()
	 * @model
	 * @generated
	 */
	DateTime getLastOccurence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getLastOccurence <em>Last Occurence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Occurence</em>' reference.
	 * @see #getLastOccurence()
	 * @generated
	 */
	void setLastOccurence(DateTime value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference.
	 * @see #setNote(Annotation)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Note()
	 * @model
	 * @generated
	 */
	Annotation getNote();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Annotation value);

	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntolerance_Reaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllergyIntoleranceReaction> getReactions();

} // AllergyIntolerance
