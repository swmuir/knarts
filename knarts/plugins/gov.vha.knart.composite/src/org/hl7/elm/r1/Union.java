/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Union operator returns the union of its arguments.
 * 			
 * This operator has two overloads:
 * 	List
 * 	Interval
 * 
 * For the list overload, this operator returns a list with all elements from both arguments.
 * 
 * For the interval overload, this operator returns the interval that starts at the earliest starting point in either argument, and ends at the latest starting point in either argument. If the arguments do not overlap or meet, this operator returns null. 
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getUnion()
 * @model extendedMetaData="name='Union' kind='elementOnly'"
 * @generated
 */
public interface Union extends BinaryExpression {
} // Union
