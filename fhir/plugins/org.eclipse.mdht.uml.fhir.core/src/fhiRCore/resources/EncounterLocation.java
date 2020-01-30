/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.EncounterLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterLocation#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterLocation#getPhysicalType <em>Physical Type</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterLocation#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEncounterLocation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Encounter_Location'"
 * @generated
 */
public interface EncounterLocation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterLocation_Location()
	 * @model containment="true"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterLocation#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterLocation_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterLocation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterLocation_PhysicalType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPhysicalType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterLocation#getPhysicalType <em>Physical Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Type</em>' containment reference.
	 * @see #getPhysicalType()
	 * @generated
	 */
	void setPhysicalType(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterLocation_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterLocation#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // EncounterLocation
