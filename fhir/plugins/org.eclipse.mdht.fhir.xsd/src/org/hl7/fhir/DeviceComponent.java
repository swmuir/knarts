/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The characteristics, operational status and capabilities of a medical-related component of a medical device.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getLastSystemChange <em>Last System Change</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getMeasurementPrinciple <em>Measurement Principle</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getProductionSpecification <em>Production Specification</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceComponent#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceComponent()
 * @model extendedMetaData="name='DeviceComponent' kind='elementOnly'"
 * @generated
 */
public interface DeviceComponent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique instance identifiers assigned to a device by the software, manufacturers, other organizations or owners. For example: handle ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component type as defined in the object-oriented or metric nomenclature partition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Last System Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timestamp for the most recent system change which includes device configuration or setting change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last System Change</em>' containment reference.
	 * @see #setLastSystemChange(Instant)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_LastSystemChange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastSystemChange' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getLastSystemChange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponent#getLastSystemChange <em>Last System Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last System Change</em>' containment reference.
	 * @see #getLastSystemChange()
	 * @generated
	 */
	void setLastSystemChange(Instant value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The link to the source Device that contains administrative device information such as manufacture, serial number, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponent#getSource <em>Source</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The link to the parent resource. For example: Channel is linked to its VMD parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getParent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponent#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Reference value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current operational status of the device. For example: On, Off, Standby, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operational Status</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_OperationalStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationalStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getOperationalStatus();

	/**
	 * Returns the value of the '<em><b>Parameter Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Group</em>' containment reference.
	 * @see #setParameterGroup(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_ParameterGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getParameterGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponent#getParameterGroup <em>Parameter Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Group</em>' containment reference.
	 * @see #getParameterGroup()
	 * @generated
	 */
	void setParameterGroup(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Measurement Principle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measurement Principle</em>' containment reference.
	 * @see #setMeasurementPrinciple(MeasmntPrinciple)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_MeasurementPrinciple()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measurementPrinciple' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasmntPrinciple getMeasurementPrinciple();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponent#getMeasurementPrinciple <em>Measurement Principle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Principle</em>' containment reference.
	 * @see #getMeasurementPrinciple()
	 * @generated
	 */
	void setMeasurementPrinciple(MeasmntPrinciple value);

	/**
	 * Returns the value of the '<em><b>Production Specification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceComponentProductionSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The production specification such as component revision, serial number, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Production Specification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_ProductionSpecification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productionSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceComponentProductionSpecification> getProductionSpecification();

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Code</em>' containment reference.
	 * @see #setLanguageCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_LanguageCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='languageCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getLanguageCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceComponent#getLanguageCode <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' containment reference.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DeviceComponentProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other device properties expressed as a `type` which identifies the property and a value(s) either as a quantity or a code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceComponent_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceComponentProperty> getProperty();

} // DeviceComponent
