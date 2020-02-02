/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coalesce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Coalesce operator returns the first non-null result in a list of arguments. If all arguments evaluate to null, the result is null. The static type of the first argument determines the type of the result, and all subsequent arguments must be of that same type.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getCoalesce()
 * @model extendedMetaData="name='Coalesce' kind='elementOnly'"
 * @generated
 */
public interface Coalesce extends NaryExpression {
} // Coalesce
