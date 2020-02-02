/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Mode operator returns the statistical mode of the elements in source.
 * 			
 * If a path is specified, elements with no value for the property specified by the path are ignored.
 * 
 * If the source contains no non-null elements, null is returned.
 * 
 * If the source is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getMode()
 * @model extendedMetaData="name='Mode' kind='elementOnly'"
 * @generated
 */
public interface Mode extends AggregateExpression {
} // Mode
