/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Count operator returns the number of non-null elements in the source.
 * 			
 * If a path is specified, the count returns the number of elements that have a value for the property specified by the path.
 * 
 * If the list is empty, the result is 0.
 * 
 * If the list is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getCount()
 * @model extendedMetaData="name='Count' kind='elementOnly'"
 * @generated
 */
public interface Count extends AggregateExpression {
} // Count
