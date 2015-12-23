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
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Vaccination Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getSeries <em>Series</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getSeriesDoses <em>Series Doses</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getTargetDiseases <em>Target Disease</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getDoseStatusReason <em>Dose Status Reason</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Immunization_VaccinationProtocol'"
 * @generated
 */
public interface ImmunizationVaccinationProtocol extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Dose Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Sequence</em>' reference.
	 * @see #setDoseSequence(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol_DoseSequence()
	 * @model required="true"
	 * @generated
	 */
	PositiveInt getDoseSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getDoseSequence <em>Dose Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Sequence</em>' reference.
	 * @see #getDoseSequence()
	 * @generated
	 */
	void setDoseSequence(PositiveInt value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' reference.
	 * @see #setAuthority(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol_Authority()
	 * @model
	 * @generated
	 */
	Organization getAuthority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getAuthority <em>Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Organization value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' reference.
	 * @see #setSeries(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol_Series()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getSeries();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getSeries <em>Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Series Doses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series Doses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Doses</em>' reference.
	 * @see #setSeriesDoses(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol_SeriesDoses()
	 * @model
	 * @generated
	 */
	PositiveInt getSeriesDoses();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getSeriesDoses <em>Series Doses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Doses</em>' reference.
	 * @see #getSeriesDoses()
	 * @generated
	 */
	void setSeriesDoses(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Target Disease</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Disease</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Disease</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol_TargetDisease()
	 * @model required="true"
	 * @generated
	 */
	EList<CodeableConcept> getTargetDiseases();

	/**
	 * Returns the value of the '<em><b>Dose Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Status</em>' reference.
	 * @see #setDoseStatus(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol_DoseStatus()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getDoseStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getDoseStatus <em>Dose Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Status</em>' reference.
	 * @see #getDoseStatus()
	 * @generated
	 */
	void setDoseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Status Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Status Reason</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Status Reason</em>' reference.
	 * @see #setDoseStatusReason(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getImmunizationVaccinationProtocol_DoseStatusReason()
	 * @model
	 * @generated
	 */
	CodeableConcept getDoseStatusReason();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol#getDoseStatusReason <em>Dose Status Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Status Reason</em>' reference.
	 * @see #getDoseStatusReason()
	 * @generated
	 */
	void setDoseStatusReason(CodeableConcept value);

} // ImmunizationVaccinationProtocol
