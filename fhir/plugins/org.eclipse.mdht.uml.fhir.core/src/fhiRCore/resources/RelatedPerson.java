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
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Person</b></em>'.
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
 *   <li>{@link fhiRCore.resources.RelatedPerson#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getRelationships <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getNames <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getGender <em>Gender</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getAddresses <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getPhotos <em>Photo</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.RelatedPerson#getCommunications <em>Communication</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson()
 * @model
 * @generated
 */
public interface RelatedPerson extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Active()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getActive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RelatedPerson#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RelatedPerson#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getRelationships();

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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Name()
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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Telecom()
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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Gender()
	 * @model containment="true"
	 * @generated
	 */
	Code getGender();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RelatedPerson#getGender <em>Gender</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_BirthDate()
	 * @model containment="true"
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RelatedPerson#getBirthDate <em>Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' containment reference.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Address()
	 * @model containment="true"
	 * @generated
	 */
	EList<Address> getAddresses();

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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Photo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getPhotos();

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
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RelatedPerson#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.RelatedPersonCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRelatedPerson_Communication()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedPersonCommunication> getCommunications();

} // RelatedPerson
