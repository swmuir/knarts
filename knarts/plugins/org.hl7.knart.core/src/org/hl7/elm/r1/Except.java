/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Except</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Except operator returns the set difference of the two arguments.
 * 			
 * This operator has two overloads:
 * 	List, List
 * 	Interval, Interval
 * 
 * For the list overload, this operator returns a list with the elements that appear in the first operand, that do not appear in the second operand, using matching semantics.
 * 
 * For the interval overload, this operator returns the portion of the first interval that does not overlap with the second. If the second argument is properly contained within the first and does not start or end it, this operator returns null.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getExcept()
 * @model extendedMetaData="name='Except' kind='elementOnly'"
 * @generated
 */
public interface Except extends BinaryExpression {
} // Except
