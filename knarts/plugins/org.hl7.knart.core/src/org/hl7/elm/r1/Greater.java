/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Greater operator returns true if the first argument is greater than the second argument.
 * 
 * For comparisons involving quantities, the dimensions of each quantity must match, but not necessarily the unit. For example, units of 'cm' and 'm' are comparable, but units of 'cm2' and 'cm' are not.
 * 
 * If either argument is null, the result is null.
 * 
 * The Greater operator is defined for the Integer, Decimal, String, DateTime, Time, and Quantity types.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getGreater()
 * @model extendedMetaData="name='Greater' kind='elementOnly'"
 * @generated
 */
public interface Greater extends BinaryExpression {
} // Greater
