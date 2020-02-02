/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Intersect operator returns the intersection of its arguments.
 * 			
 * This operator has two overloads:
 * 	List
 * 	Interval
 * 
 * For the list overload, this operator returns a list with the elements that appear in both lists, using matching semantics.
 * 
 * For the interval overload, this operator returns the interval that defines the overlapping portion of both arguments. If the arguments do not overlap, this operator returns null.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getIntersect()
 * @model extendedMetaData="name='Intersect' kind='elementOnly'"
 * @generated
 */
public interface Intersect extends BinaryExpression {
} // Intersect
