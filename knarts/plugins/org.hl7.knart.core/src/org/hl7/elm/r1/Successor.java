/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Successor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Successor operator returns the successor of the argument. For example, the successor of 1 is 2. If the argument is already the maximum value for the type, a run-time error is thrown.
 * 			
 * The Successor operator is defined for the Integer, Decimal, DateTime, and Time types.
 * 
 * For Integer, Successor is equivalent to adding 1.
 * 
 * For Decimal, Successor is equivalent to adding the minimum precision value for the Decimal type, or 10^-08.
 * 
 * For DateTime and Time values, Successor is equivalent to adding a time-unit quantity for the lowest specified precision of the value. For example, if the DateTime is fully specified, Successor is equivalent to adding 1 millisecond; if the DateTime is specified to the second, Successor is equivalent to adding one second, etc.
 * 
 * If the argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getSuccessor()
 * @model extendedMetaData="name='Successor' kind='elementOnly'"
 * @generated
 */
public interface Successor extends UnaryExpression {
} // Successor
