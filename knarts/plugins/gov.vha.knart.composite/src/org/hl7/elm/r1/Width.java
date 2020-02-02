/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Width</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Width operator returns the width of an interval. The result of this operator is equivalent to invoking: End(i) - Start(i) + point-size.
 * 			
 * Note that this operator is not defined for intervals of type DateTime and Time.
 * 
 * If the argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getWidth()
 * @model extendedMetaData="name='Width' kind='elementOnly'"
 * @generated
 */
public interface Width extends UnaryExpression {
} // Width
