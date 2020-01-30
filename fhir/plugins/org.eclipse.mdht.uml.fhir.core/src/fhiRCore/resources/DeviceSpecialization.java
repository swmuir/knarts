/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DeviceSpecialization#getSystemType <em>System Type</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceSpecialization#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDeviceSpecialization()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Device_Specialization'"
 * @generated
 */
public interface DeviceSpecialization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>System Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' containment reference.
	 * @see #setSystemType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceSpecialization_SystemType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getSystemType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceSpecialization#getSystemType <em>System Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' containment reference.
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceSpecialization_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceSpecialization#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

} // DeviceSpecialization
