/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Interval selector defines an interval value. An interval must be defined using a point type that supports comparison, as well as Successor and Predecessor operations, and Minimum and Maximum Value operations.
 * 			
 * The low and high bounds of the interval may each be defined as open or closed. Following standard terminology usage in interval mathematics, an open interval is defined to exclude the specified point, whereas a closed interval includes the point. The default is closed, indicating an inclusive interval.
 * 
 * The low and high elements are both optional. If the low element is not specified, the low bound of the resulting interval is null. If the high element is not specified, the high bound of the resulting interval is null.
 * 
 * The static type of the low bound determines the type of the interval, and the high bound must be of the same type.
 * 
 * If the low bound of the interval is null and open, the low bound of the interval is interpreted as unknown, and computations involving the low boundary will result in null.
 * 
 * If the low bound of the interval is null and closed, the interval is interpreted to start at the minimum value of the point type, and computations involving the low boundary will be performed with that value.
 * 
 * If the high bound of the interval is null and open, the high bound of the interval is unknown, and computations involving the high boundary will result in null. 
 * 
 * If the high bound of the interval is null and closed, the interval is interpreted to end at the maximum value of the point type, and computations involving the high boundary will be performed with that interpretation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Interval#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Interval#getLowClosedExpression <em>Low Closed Expression</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Interval#getHigh <em>High</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Interval#getHighClosedExpression <em>High Closed Expression</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Interval#isHighClosed <em>High Closed</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Interval#isLowClosed <em>Low Closed</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getInterval()
 * @model extendedMetaData="name='Interval' kind='elementOnly'"
 * @generated
 */
public interface Interval extends Expression {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' containment reference.
	 * @see #setLow(Expression)
	 * @see org.hl7.elm.r1.R1Package#getInterval_Low()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getLow();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Interval#getLow <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' containment reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(Expression value);

	/**
	 * Returns the value of the '<em><b>Low Closed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Closed Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Closed Expression</em>' containment reference.
	 * @see #setLowClosedExpression(Expression)
	 * @see org.hl7.elm.r1.R1Package#getInterval_LowClosedExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowClosedExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getLowClosedExpression();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Interval#getLowClosedExpression <em>Low Closed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Closed Expression</em>' containment reference.
	 * @see #getLowClosedExpression()
	 * @generated
	 */
	void setLowClosedExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' containment reference.
	 * @see #setHigh(Expression)
	 * @see org.hl7.elm.r1.R1Package#getInterval_High()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getHigh();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Interval#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(Expression value);

	/**
	 * Returns the value of the '<em><b>High Closed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Closed Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Closed Expression</em>' containment reference.
	 * @see #setHighClosedExpression(Expression)
	 * @see org.hl7.elm.r1.R1Package#getInterval_HighClosedExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='highClosedExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getHighClosedExpression();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Interval#getHighClosedExpression <em>High Closed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Closed Expression</em>' containment reference.
	 * @see #getHighClosedExpression()
	 * @generated
	 */
	void setHighClosedExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>High Closed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Closed</em>' attribute.
	 * @see #isSetHighClosed()
	 * @see #unsetHighClosed()
	 * @see #setHighClosed(boolean)
	 * @see org.hl7.elm.r1.R1Package#getInterval_HighClosed()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='highClosed'"
	 * @generated
	 */
	boolean isHighClosed();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Interval#isHighClosed <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Closed</em>' attribute.
	 * @see #isSetHighClosed()
	 * @see #unsetHighClosed()
	 * @see #isHighClosed()
	 * @generated
	 */
	void setHighClosed(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.elm.r1.Interval#isHighClosed <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHighClosed()
	 * @see #isHighClosed()
	 * @see #setHighClosed(boolean)
	 * @generated
	 */
	void unsetHighClosed();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.Interval#isHighClosed <em>High Closed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>High Closed</em>' attribute is set.
	 * @see #unsetHighClosed()
	 * @see #isHighClosed()
	 * @see #setHighClosed(boolean)
	 * @generated
	 */
	boolean isSetHighClosed();

	/**
	 * Returns the value of the '<em><b>Low Closed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Closed</em>' attribute.
	 * @see #isSetLowClosed()
	 * @see #unsetLowClosed()
	 * @see #setLowClosed(boolean)
	 * @see org.hl7.elm.r1.R1Package#getInterval_LowClosed()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='lowClosed'"
	 * @generated
	 */
	boolean isLowClosed();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Interval#isLowClosed <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Closed</em>' attribute.
	 * @see #isSetLowClosed()
	 * @see #unsetLowClosed()
	 * @see #isLowClosed()
	 * @generated
	 */
	void setLowClosed(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.elm.r1.Interval#isLowClosed <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowClosed()
	 * @see #isLowClosed()
	 * @see #setLowClosed(boolean)
	 * @generated
	 */
	void unsetLowClosed();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.Interval#isLowClosed <em>Low Closed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Low Closed</em>' attribute is set.
	 * @see #unsetLowClosed()
	 * @see #isLowClosed()
	 * @see #setLowClosed(boolean)
	 * @generated
	 */
	boolean isSetLowClosed();

} // Interval
