/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Divide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Divide operator performs numeric division of its arguments. Note that the result type of Divide is Decimal, even if its arguments are of type Integer. For integer division, use the truncated divide operator.
 * 			
 * For division operations involving quantities, the input quantities must be in compatible dimensions (not necessarily the same units), and the resulting quantity will have the appropriate unit.
 * 
 * If either argument is null, the result is null.
 * 
 * The Divide operator is defined for the Integer, Decimal and Quantity types.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getDivide()
 * @model extendedMetaData="name='Divide' kind='elementOnly'"
 * @generated
 */
public interface Divide extends BinaryExpression {
} // Divide
