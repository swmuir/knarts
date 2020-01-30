/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.HumanName;
import fhiRCore.dataTypes.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Practitioner#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getNames <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getAddresses <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getGender <em>Gender</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getPhotos <em>Photo</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getQualifications <em>Qualification</em>}</li>
 *   <li>{@link fhiRCore.resources.Practitioner#getCommunications <em>Communication</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPractitioner()
 * @model
 * @generated
 */
public interface Practitioner extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Active()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getActive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Practitioner#getActive <em>Active</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Name()
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Telecom()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getTelecoms();

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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Address()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getAddresses();

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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Gender()
	 * @model containment="true"
	 * @generated
	 */
	Code getGender();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Practitioner#getGender <em>Gender</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_BirthDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Practitioner#getBirthDate <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' containment reference.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Photo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getPhotos();

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PractitionerQualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Qualification()
	 * @model containment="true"
	 * @generated
	 */
	EList<PractitionerQualification> getQualifications();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPractitioner_Communication()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCommunications();

} // Practitioner
