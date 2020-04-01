/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Instant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Metric Calibration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.DeviceMetricCalibration#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.DeviceMetricCalibration#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.DeviceMetricCalibration#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getDeviceMetricCalibration()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceMetric_Calibration'"
 * @generated
 */
public interface DeviceMetricCalibration extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getDeviceMetricCalibration_Type()
	 * @model containment="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.DeviceMetricCalibration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getDeviceMetricCalibration_State()
	 * @model containment="true"
	 * @generated
	 */
	Code getState();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.DeviceMetricCalibration#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(Code value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Instant)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getDeviceMetricCalibration_Time()
	 * @model containment="true"
	 * @generated
	 */
	Instant getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.DeviceMetricCalibration#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Instant value);

} // DeviceMetricCalibration
