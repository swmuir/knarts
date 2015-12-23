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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Hospitalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getAdmitSource <em>Admit Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getAdmittingDiagnosis <em>Admitting Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getReAdmission <em>Re Admission</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getDietPreferences <em>Diet Preference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getSpecialCourtesies <em>Special Courtesy</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getSpecialArrangements <em>Special Arrangement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getDischargeDisposition <em>Discharge Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getDischargeDiagnosis <em>Discharge Diagnosis</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Encounter_Hospitalization'"
 * @generated
 */
public interface EncounterHospitalization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Pre Admission Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Admission Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Admission Identifier</em>' reference.
	 * @see #setPreAdmissionIdentifier(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_PreAdmissionIdentifier()
	 * @model
	 * @generated
	 */
	Identifier getPreAdmissionIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Admission Identifier</em>' reference.
	 * @see #getPreAdmissionIdentifier()
	 * @generated
	 */
	void setPreAdmissionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Location)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_Origin()
	 * @model
	 * @generated
	 */
	Location getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Location value);

	/**
	 * Returns the value of the '<em><b>Admit Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admit Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admit Source</em>' reference.
	 * @see #setAdmitSource(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_AdmitSource()
	 * @model
	 * @generated
	 */
	CodeableConcept getAdmitSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getAdmitSource <em>Admit Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admit Source</em>' reference.
	 * @see #getAdmitSource()
	 * @generated
	 */
	void setAdmitSource(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Admitting Diagnosis</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admitting Diagnosis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admitting Diagnosis</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_AdmittingDiagnosis()
	 * @model
	 * @generated
	 */
	EList<Condition> getAdmittingDiagnosis();

	/**
	 * Returns the value of the '<em><b>Re Admission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Re Admission</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Re Admission</em>' reference.
	 * @see #setReAdmission(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_ReAdmission()
	 * @model
	 * @generated
	 */
	CodeableConcept getReAdmission();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getReAdmission <em>Re Admission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Re Admission</em>' reference.
	 * @see #getReAdmission()
	 * @generated
	 */
	void setReAdmission(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diet Preference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diet Preference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diet Preference</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_DietPreference()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getDietPreferences();

	/**
	 * Returns the value of the '<em><b>Special Courtesy</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Courtesy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Courtesy</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_SpecialCourtesy()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getSpecialCourtesies();

	/**
	 * Returns the value of the '<em><b>Special Arrangement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Arrangement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Arrangement</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_SpecialArrangement()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getSpecialArrangements();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Location)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_Destination()
	 * @model
	 * @generated
	 */
	Location getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Location value);

	/**
	 * Returns the value of the '<em><b>Discharge Disposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discharge Disposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discharge Disposition</em>' reference.
	 * @see #setDischargeDisposition(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_DischargeDisposition()
	 * @model
	 * @generated
	 */
	CodeableConcept getDischargeDisposition();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization#getDischargeDisposition <em>Discharge Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discharge Disposition</em>' reference.
	 * @see #getDischargeDisposition()
	 * @generated
	 */
	void setDischargeDisposition(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Discharge Diagnosis</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discharge Diagnosis</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discharge Diagnosis</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEncounterHospitalization_DischargeDiagnosis()
	 * @model
	 * @generated
	 */
	EList<Condition> getDischargeDiagnosis();

} // EncounterHospitalization
