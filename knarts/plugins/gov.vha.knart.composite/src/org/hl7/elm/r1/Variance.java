/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Variance operator returns the statistical variance of the elements in source.
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored.
 * 
 * If the source contains no non-null elements, null is returned.
 * 
 * If the source is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getVariance()
 * @model extendedMetaData="name='Variance' kind='elementOnly'"
 * @generated
 */
public interface Variance extends AggregateExpression {
} // Variance
