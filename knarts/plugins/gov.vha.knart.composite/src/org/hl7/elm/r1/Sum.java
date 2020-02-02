/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Sum operator returns the sum of non-null elements in the source.
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored. 
 * 
 * If the source contains no non-null elements, null is returned.
 * 
 * If the list is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getSum()
 * @model extendedMetaData="name='Sum' kind='elementOnly'"
 * @generated
 */
public interface Sum extends AggregateExpression {
} // Sum
