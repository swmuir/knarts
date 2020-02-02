/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Add operator performs numeric addition of its arguments.
 * 			
 * When adding quantities, the dimensions of each quantity must match, but not necessarily the unit. For example, units of 'cm' and 'm' can be added, but units of 'cm2' and 'cm' cannot. The unit of the result will be the most granular unit of either input.
 * 			
 * The Add operator is defined for the Integer, Decimal, and Quantity types. In addition, a time-valued Quantity can be added to a DateTime or Time using this operator.
 * 
 * For DateTime and Time values, the operator returns the value of the given date/time, incremented by the time-valued quantity, respecting variable length periods for calendar years and months.
 * 
 * For DateTime values, the quantity unit must be one of years, months, days, hours, minutes, seconds, or milliseconds.
 * 
 * For Time values, the quantity unit must be one of hours, minutes, seconds, or milliseconds.
 * 
 * The operation is performed by attempting to derive the highest granularity precision first, working down successive granularities to the granularity of the time-valued quantity.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getAdd()
 * @model extendedMetaData="name='Add' kind='elementOnly'"
 * @generated
 */
public interface Add extends BinaryExpression {
} // Add
