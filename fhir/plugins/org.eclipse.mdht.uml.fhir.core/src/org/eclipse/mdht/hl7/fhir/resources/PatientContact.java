/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Address;
import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.ContactPoint;
import org.eclipse.mdht.hl7.fhir.dataTypes.HumanName;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getRelationships <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getGender <em>Gender</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPatientContact()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Patient_Contact'"
 * @generated
 */
public interface PatientContact extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPatientContact_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getRelationships();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(HumanName)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPatientContact_Name()
	 * @model containment="true"
	 * @generated
	 */
	HumanName getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPatientContact_Telecom()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getTelecoms();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPatientContact_Address()
	 * @model containment="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' containment reference.
	 * @see #setGender(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPatientContact_Gender()
	 * @model containment="true"
	 * @generated
	 */
	Code getGender();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Code value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPatientContact_Organization()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getPatientContact_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.PatientContact#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // PatientContact
