/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Of Employment Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 74165-2 History of Employment Status (CodeSystem: LOINC urn:oid:2.16.840.1.113883.6.1)
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.HistoryOfEmploymentStatus#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getHistoryOfEmploymentStatus()
 * @model extendedMetaData="name='HistoryOfEmploymentStatus' kind='elementOnly'"
 * @generated
 */
public interface HistoryOfEmploymentStatus extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.HistoryOfEmploymentStatusList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.HistoryOfEmploymentStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(HistoryOfEmploymentStatusList)
	 * @see org.hl7.fhir.FhirPackage#getHistoryOfEmploymentStatus_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	HistoryOfEmploymentStatusList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.HistoryOfEmploymentStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.HistoryOfEmploymentStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(HistoryOfEmploymentStatusList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.HistoryOfEmploymentStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(HistoryOfEmploymentStatusList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.HistoryOfEmploymentStatus#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(HistoryOfEmploymentStatusList)
	 * @generated
	 */
	boolean isSetValue();

} // HistoryOfEmploymentStatus
