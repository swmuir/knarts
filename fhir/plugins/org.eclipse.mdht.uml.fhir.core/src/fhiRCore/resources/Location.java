/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Location#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getAlias <em>Alias</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getMode <em>Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getAddress <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getPhysicalType <em>Physical Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getPosition <em>Position</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getHoursOfOperations <em>Hours Of Operation</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getAvailabilityExceptions <em>Availability Exceptions</em>}</li>
 *   <li>{@link fhiRCore.resources.Location#getEndpoints <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Status</em>' containment reference.
	 * @see #setOperationalStatus(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_OperationalStatus()
	 * @model containment="true"
	 * @generated
	 */
	Coding getOperationalStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getOperationalStatus <em>Operational Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Status</em>' containment reference.
	 * @see #getOperationalStatus()
	 * @generated
	 */
	void setOperationalStatus(Coding value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Alias()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Mode()
	 * @model containment="true"
	 * @generated
	 */
	Code getMode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Code value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

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
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Telecom()
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
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Address()
	 * @model containment="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Physical Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Type</em>' containment reference.
	 * @see #setPhysicalType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_PhysicalType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPhysicalType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getPhysicalType <em>Physical Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Type</em>' containment reference.
	 * @see #getPhysicalType()
	 * @generated
	 */
	void setPhysicalType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(LocationPosition)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Position()
	 * @model containment="true"
	 * @generated
	 */
	LocationPosition getPosition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(LocationPosition value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_ManagingOrganization()
	 * @model containment="true"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference.
	 * @see #setPartOf(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_PartOf()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPartOf();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getPartOf <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' containment reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Hours Of Operation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.LocationHoursOfOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours Of Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours Of Operation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_HoursOfOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocationHoursOfOperation> getHoursOfOperations();

	/**
	 * Returns the value of the '<em><b>Availability Exceptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability Exceptions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Exceptions</em>' containment reference.
	 * @see #setAvailabilityExceptions(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_AvailabilityExceptions()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getAvailabilityExceptions();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Location#getAvailabilityExceptions <em>Availability Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Exceptions</em>' containment reference.
	 * @see #getAvailabilityExceptions()
	 * @generated
	 */
	void setAvailabilityExceptions(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getLocation_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEndpoints();

} // Location
