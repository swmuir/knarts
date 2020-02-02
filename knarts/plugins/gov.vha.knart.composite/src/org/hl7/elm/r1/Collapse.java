/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collapse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Collapse operator returns the unique set of intervals that completely covers the ranges present in the given list of intervals.
 * 
 * If the list of intervals is empty, the result is empty. If the list of intervals contains a single interval, the result is a list with that interval. If the list of intervals contains nulls, they will be excluded from the resulting list.
 * 
 * If the argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getCollapse()
 * @model extendedMetaData="name='Collapse' kind='elementOnly'"
 * @generated
 */
public interface Collapse extends UnaryExpression {
} // Collapse
