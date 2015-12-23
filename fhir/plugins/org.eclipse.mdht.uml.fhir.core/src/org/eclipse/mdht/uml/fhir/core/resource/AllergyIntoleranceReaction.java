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
import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getExposureRoute <em>Exposure Route</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AllergyIntolerance_Reaction'"
 * @generated
 */
public interface AllergyIntoleranceReaction extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction_Substance()
	 * @model
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getSubstance <em>Substance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certainty</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty</em>' reference.
	 * @see #setCertainty(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction_Certainty()
	 * @model
	 * @generated
	 */
	Code getCertainty();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getCertainty <em>Certainty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certainty</em>' reference.
	 * @see #getCertainty()
	 * @generated
	 */
	void setCertainty(Code value);

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifestation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifestation</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction_Manifestation()
	 * @model required="true"
	 * @generated
	 */
	EList<CodeableConcept> getManifestations();

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction_Onset()
	 * @model
	 * @generated
	 */
	DateTime getOnset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getOnset <em>Onset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset</em>' reference.
	 * @see #getOnset()
	 * @generated
	 */
	void setOnset(DateTime value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction_Severity()
	 * @model
	 * @generated
	 */
	Code getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getSeverity <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Code value);

	/**
	 * Returns the value of the '<em><b>Exposure Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure Route</em>' reference.
	 * @see #setExposureRoute(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction_ExposureRoute()
	 * @model
	 * @generated
	 */
	CodeableConcept getExposureRoute();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getExposureRoute <em>Exposure Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Route</em>' reference.
	 * @see #getExposureRoute()
	 * @generated
	 */
	void setExposureRoute(CodeableConcept value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getAllergyIntoleranceReaction_Note()
	 * @model
	 * @generated
	 */
	Annotation getNote();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.AllergyIntoleranceReaction#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Annotation value);

} // AllergyIntoleranceReaction
