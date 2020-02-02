/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Start operator returns the starting point of an interval. 
 * 			
 * If the low boundary of the interval is open, this operator returns the Successor of the low value of the interval. Note that if the low value of the interval is null, the result is null.
 * 
 * If the low boundary of the interval is closed and the low value of the interval is not null, this operator returns the low value of the interval. Otherwise, the result is the minimum value of the point type of the interval.
 * 
 * If the argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 *
 * @see org.hl7.elm.r1.R1Package#getStart()
 * @model extendedMetaData="name='Start' kind='elementOnly'"
 * @generated
 */
public interface Start extends UnaryExpression {
} // Start
