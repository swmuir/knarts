/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Set Item Precheck Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines selection frequency behavior for an action or group
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OrderSetItemPrecheckBehavior#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOrderSetItemPrecheckBehavior()
 * @model extendedMetaData="name='OrderSetItemPrecheckBehavior' kind='elementOnly'"
 * @generated
 */
public interface OrderSetItemPrecheckBehavior extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.OrderSetItemPrecheckBehaviorList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.OrderSetItemPrecheckBehaviorList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(OrderSetItemPrecheckBehaviorList)
	 * @see org.hl7.fhir.FhirPackage#getOrderSetItemPrecheckBehavior_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	OrderSetItemPrecheckBehaviorList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OrderSetItemPrecheckBehavior#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.OrderSetItemPrecheckBehaviorList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OrderSetItemPrecheckBehaviorList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.OrderSetItemPrecheckBehavior#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(OrderSetItemPrecheckBehaviorList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.OrderSetItemPrecheckBehavior#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(OrderSetItemPrecheckBehaviorList)
	 * @generated
	 */
	boolean isSetValue();

} // OrderSetItemPrecheckBehavior
