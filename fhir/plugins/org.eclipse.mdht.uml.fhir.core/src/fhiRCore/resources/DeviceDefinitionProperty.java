/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionProperty#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionProperty#getValueQuantities <em>Value Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinitionProperty#getValueCodes <em>Value Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionProperty()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceDefinition_Property'"
 * @generated
 */
public interface DeviceDefinitionProperty extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionProperty_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinitionProperty#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Quantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Quantity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionProperty_ValueQuantity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Quantity> getValueQuantities();

	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinitionProperty_ValueCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getValueCodes();

} // DeviceDefinitionProperty
