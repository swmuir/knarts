/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.HumanName;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link fhiRCore.resources.Patient#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getNames <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getGender <em>Gender</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getDeceasedx <em>Deceasedx</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getAddresses <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getMultipleBirthx <em>Multiple Birthx</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getPhotos <em>Photo</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getCommunications <em>Communication</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getGeneralPractitioners <em>General Practitioner</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.Patient#getLinks <em>Link</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Active()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getActive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Patient#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.HumanName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Name()
	 * @model containment="true"
	 * @generated
	 */
	EList<HumanName> getNames();

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Telecom()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getTelecoms();

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
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Gender()
	 * @model containment="true"
	 * @generated
	 */
	Code getGender();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Patient#getGender <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' containment reference.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Code value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' containment reference.
	 * @see #setBirthDate(Date)
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_BirthDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Patient#getBirthDate <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' containment reference.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Deceasedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deceasedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceasedx</em>' containment reference.
	 * @see #setDeceasedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Deceasedx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='deceased[x]'"
	 * @generated
	 */
	DataType getDeceasedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Patient#getDeceasedx <em>Deceasedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceasedx</em>' containment reference.
	 * @see #getDeceasedx()
	 * @generated
	 */
	void setDeceasedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Address()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Marital Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marital Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marital Status</em>' containment reference.
	 * @see #setMaritalStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_MaritalStatus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMaritalStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Patient#getMaritalStatus <em>Marital Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marital Status</em>' containment reference.
	 * @see #getMaritalStatus()
	 * @generated
	 */
	void setMaritalStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Multiple Birthx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Birthx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Birthx</em>' containment reference.
	 * @see #setMultipleBirthx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_MultipleBirthx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='multipleBirth[x]'"
	 * @generated
	 */
	DataType getMultipleBirthx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Patient#getMultipleBirthx <em>Multiple Birthx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Birthx</em>' containment reference.
	 * @see #getMultipleBirthx()
	 * @generated
	 */
	void setMultipleBirthx(DataType value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Photo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getPhotos();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PatientContact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatientContact> getContacts();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PatientCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Communication()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatientCommunication> getCommunications();

	/**
	 * Returns the value of the '<em><b>General Practitioner</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Practitioner</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Practitioner</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_GeneralPractitioner()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getGeneralPractitioners();

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managing Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_ManagingOrganization()
	 * @model containment="true"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Patient#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PatientLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPatient_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<PatientLink> getLinks();

} // Patient
