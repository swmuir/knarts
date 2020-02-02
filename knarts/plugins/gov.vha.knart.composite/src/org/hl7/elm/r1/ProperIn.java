/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proper In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ProperIn operator tests for proper membership in an interval or list.
 * 			
 * There are two overloads of this operator:
 * 	T, List : The type of T must be the same as the element type of the list.
 * 	T, Interval : The type of T must be the same as the point type of the interval.
 * 	
 * For the T, List overload, this operator returns if the given element is in the given list, and it is not the only element in the list, using matching semantics.
 * 
 * For the T, Interval overload, this operator returns true if the given point is greater than the starting point, and less than the ending point of the interval, as determined by the Start and End operators.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.ProperIn#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getProperIn()
 * @model extendedMetaData="name='ProperIn' kind='elementOnly'"
 * @generated
 */
public interface ProperIn extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.elm.r1.DateTimePrecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see org.hl7.elm.r1.DateTimePrecision
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @see org.hl7.elm.r1.R1Package#getProperIn_Precision()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='precision'"
	 * @generated
	 */
	DateTimePrecision getPrecision();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ProperIn#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see org.hl7.elm.r1.DateTimePrecision
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(DateTimePrecision value);

	/**
	 * Unsets the value of the '{@link org.hl7.elm.r1.ProperIn#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.ProperIn#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @generated
	 */
	boolean isSetPrecision();

} // ProperIn
