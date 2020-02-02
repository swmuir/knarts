/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SingletonFrom expression extracts a single element from the source list. If the source list is empty, the result is null. If the source list contains one element, that element is returned. If the list contains more than one element, a run-time error is thrown. If the source list is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getSingletonFrom()
 * @model extendedMetaData="name='SingletonFrom' kind='elementOnly'"
 * @generated
 */
public interface SingletonFrom extends UnaryExpression {
} // SingletonFrom
