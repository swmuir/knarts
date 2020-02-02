/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Min operator returns the minimum element in the source. 
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored.
 * 
 * If the source contains no non-null elements, null is returned.
 * 
 * If the source is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getMin()
 * @model extendedMetaData="name='Min' kind='elementOnly'"
 * @generated
 */
public interface Min extends AggregateExpression {
} // Min
