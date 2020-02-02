/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predecessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Predecessor operator returns the predecessor of the argument. For example, the predecessor of 2 is 1. If the argument is already the minimum value for the type, a run-time error is thrown.
 * 			
 * The Predecessor operator is defined for the Integer, Decimal, DateTime, and Time types.
 * 
 * For Integer, Predecessor is equivalent to subtracting 1.
 * 
 * For Decimal, Predecessor is equivalent to subtracting the minimum precision value for the Decimal type, or 10^-08.
 * 
 * For DateTime and Time values, Predecessor is equivalent to subtracting a time-unit quantity for the lowest specified precision of the value. For example, if the DateTime is fully specified, Predecessor is equivalent to subtracting 1 millisecond; if the DateTime is specified to the second, Predecessor is equivalent to subtracting one second, etc.
 * 
 * If the argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getPredecessor()
 * @model extendedMetaData="name='Predecessor' kind='elementOnly'"
 * @generated
 */
public interface Predecessor extends UnaryExpression {
} // Predecessor
