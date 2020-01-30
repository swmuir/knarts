/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DeviceVersion#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceVersion#getComponent <em>Component</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceVersion#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDeviceVersion()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Device_Version'"
 * @generated
 */
public interface DeviceVersion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceVersion_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceVersion#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceVersion_Component()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getComponent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceVersion#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Identifier value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceVersion_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceVersion#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhiRCore.dataTypes.String value);

} // DeviceVersion
