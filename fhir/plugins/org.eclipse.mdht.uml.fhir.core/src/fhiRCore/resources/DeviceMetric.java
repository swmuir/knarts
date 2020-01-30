/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Timing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Metric</b></em>'.
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
 *   <li>{@link fhiRCore.resources.DeviceMetric#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getUnit <em>Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getParent <em>Parent</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getColor <em>Color</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getMeasurementPeriod <em>Measurement Period</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceMetric#getCalibrations <em>Calibration</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric()
 * @model
 * @generated
 */
public interface DeviceMetric extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceMetric#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_Unit()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceMetric#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_Source()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceMetric#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_Parent()
	 * @model containment="true"
	 * @generated
	 */
	Reference getParent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceMetric#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Reference value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Status</em>' containment reference.
	 * @see #setOperationalStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_OperationalStatus()
	 * @model containment="true"
	 * @generated
	 */
	Code getOperationalStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceMetric#getOperationalStatus <em>Operational Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Status</em>' containment reference.
	 * @see #getOperationalStatus()
	 * @generated
	 */
	void setOperationalStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_Color()
	 * @model containment="true"
	 * @generated
	 */
	Code getColor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceMetric#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Code value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_Category()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceMetric#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Code value);

	/**
	 * Returns the value of the '<em><b>Measurement Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Period</em>' containment reference.
	 * @see #setMeasurementPeriod(Timing)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_MeasurementPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Timing getMeasurementPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceMetric#getMeasurementPeriod <em>Measurement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Period</em>' containment reference.
	 * @see #getMeasurementPeriod()
	 * @generated
	 */
	void setMeasurementPeriod(Timing value);

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceMetricCalibration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceMetric_Calibration()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceMetricCalibration> getCalibrations();

} // DeviceMetric
