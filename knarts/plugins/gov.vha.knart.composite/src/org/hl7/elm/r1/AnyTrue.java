/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any True</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The AnyTrue operator returns true if any non-null element in source is true.
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored.
 * 
 * If the source contains no non-null elements, false is returned.
 * 
 * If the source is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getAnyTrue()
 * @model extendedMetaData="name='AnyTrue' kind='elementOnly'"
 * @generated
 */
public interface AnyTrue extends AggregateExpression {
} // AnyTrue
