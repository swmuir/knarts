/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Multiply operator performs numeric multiplication of its arguments.
 * 			
 * For multiplication operations involving quantities, the input quantities must be of the same dimension (not necessarily the same units), and the resulting quantity will have the appropriate unit.
 * 
 * If either argument is null, the result is null.
 * 
 * The Multiply operator is defined for the Integer, Decimal and Quantity types.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getMultiply()
 * @model extendedMetaData="name='Multiply' kind='elementOnly'"
 * @generated
 */
public interface Multiply extends BinaryExpression {
} // Multiply
