/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Median</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Median operator returns the median of the elements in source.
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored.
 * 
 * If the source contains no non-null elements, null is returned.
 * 
 * If the source is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getMedian()
 * @model extendedMetaData="name='Median' kind='elementOnly'"
 * @generated
 */
public interface Median extends AggregateExpression {
} // Median
