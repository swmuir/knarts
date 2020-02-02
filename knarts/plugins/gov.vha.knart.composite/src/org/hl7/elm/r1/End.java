/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The End operator returns the ending point of an interval.
 * 			
 * If the high boundary of the interval is open, this operator returns the Predecessor of the high value of the interval. Note that if the high value of the interval is null, the result is null.
 * 
 * If the high boundary of the interval is closed and the high value of the interval is not null, this operator returns the high value of the interval. Otherwise, the result is the maximum value of the point type of the interval.
 * 
 * If the argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getEnd()
 * @model extendedMetaData="name='End' kind='elementOnly'"
 * @generated
 */
public interface End extends UnaryExpression {
} // End
