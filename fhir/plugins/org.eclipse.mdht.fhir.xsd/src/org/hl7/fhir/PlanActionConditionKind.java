/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Action Condition Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the kinds of conditions that can appear on actions
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PlanActionConditionKind#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPlanActionConditionKind()
 * @model extendedMetaData="name='PlanActionConditionKind' kind='elementOnly'"
 * @generated
 */
public interface PlanActionConditionKind extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.PlanActionConditionKindList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.PlanActionConditionKindList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(PlanActionConditionKindList)
	 * @see org.hl7.fhir.FhirPackage#getPlanActionConditionKind_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	PlanActionConditionKindList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PlanActionConditionKind#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.PlanActionConditionKindList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PlanActionConditionKindList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.PlanActionConditionKind#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(PlanActionConditionKindList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.PlanActionConditionKind#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(PlanActionConditionKindList)
	 * @generated
	 */
	boolean isSetValue();

} // PlanActionConditionKind
