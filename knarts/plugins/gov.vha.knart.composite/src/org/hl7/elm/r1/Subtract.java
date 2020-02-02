/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Subtract operator performs numeric subtraction of its arguments.
 * 			
 * When subtracting quantities, the dimensions of each quantity must match, but not necessarily the unit. For example, units of 'cm' and 'm' can be subtracted, but units of 'cm2' and 'cm' cannot. The unit of the result will be the most granular unit of either input.
 * 
 * The Subtract operator is defined for the Integer, Decimal, and Quantity types. In addition, a time-valued Quantity can be subtracted from a DateTime or Time using this operator.
 * 
 * For DateTime and Time values, the operator returns the value of the given date/time, decremented by the time-valued quantity, respective variable length periods for calendar years and months.
 * 
 * The operation is performed by attempting to derive the highest granularity precision first, working down successive granularities to the granularity of the time-valued quantity.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getSubtract()
 * @model extendedMetaData="name='Subtract' kind='elementOnly'"
 * @generated
 */
public interface Subtract extends BinaryExpression {
} // Subtract
