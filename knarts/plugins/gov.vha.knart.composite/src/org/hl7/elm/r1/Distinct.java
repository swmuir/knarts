/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distinct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Distinct operator takes a list of elements and returns a list containing only the unique elements within the input. For example, given the list of integers { 1, 1, 1, 2, 2, 3, 4, 4 }, the result of Distinct would be { 1, 2, 3, 4 }.
 * 			
 * The operator uses matching comparison semantics as defined in the Matches operator.
 * 
 * If the source argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getDistinct()
 * @model extendedMetaData="name='Distinct' kind='elementOnly'"
 * @generated
 */
public interface Distinct extends UnaryExpression {
} // Distinct
