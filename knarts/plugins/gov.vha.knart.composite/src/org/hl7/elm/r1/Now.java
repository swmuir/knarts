/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Now</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Now operator returns the date and time of the start timestamp associated with the evaluation request. Now is defined in this way for two reasons:
 * 1) The operation will always return the same value within any given evaluation, ensuring that the result of an expression containing Now will always return the same result.
 * 
 * 2) The operation will return the timestamp associated with the evaluation request, allowing the evaluation to be performed with the same timezone information as the data delivered with the evaluation request.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getNow()
 * @model extendedMetaData="name='Now' kind='elementOnly'"
 * @generated
 */
public interface Now extends Expression {
} // Now
