/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All True</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The AllTrue operator returns true if all the non-null elements in source are true.
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored.
 * 
 * If the source contains no non-null elements, true is returned.
 * 
 * If the source is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getAllTrue()
 * @model extendedMetaData="name='AllTrue' kind='elementOnly'"
 * @generated
 */
public interface AllTrue extends AggregateExpression {
} // AllTrue
