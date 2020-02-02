/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Equal operator returns true if the arguments are equal; false if the arguments are known unequal, and null otherwise. Equality semantics are defined to be value-based.
 * 
 * For simple types, this means that equality returns true if and only if the result of each argument evaluates to the same value.
 * 
 * For quantities, this means that the dimensions of each quantity must match, but not necessarily the unit. For example, units of 'cm' and 'm' are comparable, but units of 'cm2' and 'cm' are not.
 * 
 * For tuple types, this means that equality returns true if and only if the tuples are of the same type, and the values for all elements by name are equal.
 * 
 * For list types, this means that equality returns true if and only if the lists contain elements of the same type, have the same number of elements, and for each element in the lists, in order, the elements are equal using the same semantics.
 * 
 * For interval types, equality returns true if and only if the intervals are over the same point type, and they have the same value for the starting and ending points of the interval as determined by the Start and End operators.
 * 
 * For comparisons involving date/time or time values with imprecision, note that the result of the comparison may be null, depending on whether the values involved are specified to the level of precision used for the comparison.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getEqual()
 * @model extendedMetaData="name='Equal' kind='elementOnly'"
 * @generated
 */
public interface Equal extends BinaryExpression {
} // Equal
