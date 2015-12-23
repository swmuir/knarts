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

import org.eclipse.mdht.uml.fhir.core.datatype.Address;
import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.HumanName;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getDeceasedx <em>Deceasedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getAddresses <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getMultipleBirthx <em>Multiple Birthx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getPhotos <em>Photo</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getAnimal <em>Animal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getCommunications <em>Communication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getCareProviders <em>Care Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getLinks <em>Link</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends DomainResource {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' reference.
	 * @see #setActive(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Active()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getActive();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getActive <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.HumanName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Name()
	 * @model
	 * @generated
	 */
	EList<HumanName> getNames();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecom</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Telecom()
	 * @model
	 * @generated
	 */
	EList<ContactPoint> getTelecoms();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' reference.
	 * @see #setGender(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Gender()
	 * @model
	 * @generated
	 */
	Code getGender();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getGender <em>Gender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Code value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' reference.
	 * @see #setBirthDate(Date)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_BirthDate()
	 * @model
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getBirthDate <em>Birth Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' reference.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Deceasedx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deceasedx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceasedx</em>' reference.
	 * @see #setDeceasedx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Deceasedx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='deceased[x]'"
	 * @generated
	 */
	DataType getDeceasedx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getDeceasedx <em>Deceasedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceasedx</em>' reference.
	 * @see #getDeceasedx()
	 * @generated
	 */
	void setDeceasedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Address()
	 * @model
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Marital Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marital Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marital Status</em>' reference.
	 * @see #setMaritalStatus(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_MaritalStatus()
	 * @model
	 * @generated
	 */
	CodeableConcept getMaritalStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getMaritalStatus <em>Marital Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marital Status</em>' reference.
	 * @see #getMaritalStatus()
	 * @generated
	 */
	void setMaritalStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Multiple Birthx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Birthx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Birthx</em>' reference.
	 * @see #setMultipleBirthx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_MultipleBirthx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='multipleBirth[x]'"
	 * @generated
	 */
	DataType getMultipleBirthx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getMultipleBirthx <em>Multiple Birthx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Birthx</em>' reference.
	 * @see #getMultipleBirthx()
	 * @generated
	 */
	void setMultipleBirthx(DataType value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Photo()
	 * @model
	 * @generated
	 */
	EList<Attachment> getPhotos();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.PatientContact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatientContact> getContacts();

	/**
	 * Returns the value of the '<em><b>Animal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animal</em>' containment reference.
	 * @see #setAnimal(PatientAnimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Animal()
	 * @model containment="true"
	 * @generated
	 */
	PatientAnimal getAnimal();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getAnimal <em>Animal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animal</em>' containment reference.
	 * @see #getAnimal()
	 * @generated
	 */
	void setAnimal(PatientAnimal value);

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.PatientCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Communication()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatientCommunication> getCommunications();

	/**
	 * Returns the value of the '<em><b>Care Provider</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Provider</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Provider</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_CareProvider()
	 * @model
	 * @generated
	 */
	EList<Resource> getCareProviders();

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managing Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managing Organization</em>' reference.
	 * @see #setManagingOrganization(Organization)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_ManagingOrganization()
	 * @model
	 * @generated
	 */
	Organization getManagingOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.Patient#getManagingOrganization <em>Managing Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.PatientLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatient_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatientLink> getLinks();

} // Patient
