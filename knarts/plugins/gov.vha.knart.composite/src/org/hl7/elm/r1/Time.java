/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Time operator constructs a time value from the given components.
 * 			
 * At least one component other than timezoneOffset must be specified, and no component may be specified at a precision below an unspecified precision. For example, minute may be null, but if it is, second, and millisecond must all be null as well.
 * 
 * If timezoneOffset is not specified, it is defaulted to the timezone offset of the evaluation request.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Time#getHour <em>Hour</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Time#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Time#getSecond <em>Second</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Time#getMillisecond <em>Millisecond</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Time#getTimezoneOffset <em>Timezone Offset</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getTime()
 * @model extendedMetaData="name='Time' kind='elementOnly'"
 * @generated
 */
public interface Time extends Expression {
	/**
	 * Returns the value of the '<em><b>Hour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' containment reference.
	 * @see #setHour(Expression)
	 * @see org.hl7.elm.r1.R1Package#getTime_Hour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hour' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getHour();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Time#getHour <em>Hour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' containment reference.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(Expression value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' containment reference.
	 * @see #setMinute(Expression)
	 * @see org.hl7.elm.r1.R1Package#getTime_Minute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minute' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getMinute();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Time#getMinute <em>Minute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' containment reference.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(Expression value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(Expression)
	 * @see org.hl7.elm.r1.R1Package#getTime_Second()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='second' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getSecond();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Time#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Expression value);

	/**
	 * Returns the value of the '<em><b>Millisecond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Millisecond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Millisecond</em>' containment reference.
	 * @see #setMillisecond(Expression)
	 * @see org.hl7.elm.r1.R1Package#getTime_Millisecond()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='millisecond' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getMillisecond();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Time#getMillisecond <em>Millisecond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Millisecond</em>' containment reference.
	 * @see #getMillisecond()
	 * @generated
	 */
	void setMillisecond(Expression value);

	/**
	 * Returns the value of the '<em><b>Timezone Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timezone Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timezone Offset</em>' containment reference.
	 * @see #setTimezoneOffset(Expression)
	 * @see org.hl7.elm.r1.R1Package#getTime_TimezoneOffset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timezoneOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getTimezoneOffset();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Time#getTimezoneOffset <em>Timezone Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone Offset</em>' containment reference.
	 * @see #getTimezoneOffset()
	 * @generated
	 */
	void setTimezoneOffset(Expression value);

} // Time
