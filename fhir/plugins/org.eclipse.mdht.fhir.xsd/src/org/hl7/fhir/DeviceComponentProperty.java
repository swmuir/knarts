/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Component Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceComponentProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponentProperty#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponentProperty#getValueCode <em>Value Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceComponentProperty()
 * @model extendedMetaData="name='DeviceComponent.Property' kind='elementOnly'"
 * @generated
 */
public interface DeviceComponentProperty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code for the device property identifying the property being reported such as 'time capability'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponentProperty_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponentProperty#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Quantity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property value when the property being reported is a quantity such as the resolution of a real time clock.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponentProperty_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Quantity> getValueQuantity();

	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property value when the property being reported is a code, such as the code indicating that the device supports a real time clock using absolute time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponentProperty_ValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getValueCode();

} // DeviceComponentProperty
