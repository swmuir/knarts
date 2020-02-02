/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Times</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Times operator performs the cartesian product of two lists of tuples. The return type of a Times operator is a tuple with all the components from the tuple types of both arguments. The result will contain a tuple for each possible combination of tuples from both arguments with the values for each component derived from the pairing of the source tuples.
 * 			
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getTimes()
 * @model extendedMetaData="name='Times' kind='elementOnly'"
 * @generated
 */
public interface Times extends BinaryExpression {
} // Times
