/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Contains operator returns true if the first operand contains the second.
 * 			
 * There are two overloads of this operator:
 * 	List, T : The type of T must be the same as the element type of the list.
 * 	Interval, T : The type of T must be the same as the point type of the interval.
 * 	
 * For the List, T overload, this operator returns true if the given element is in the list, using matching semantics.
 * 
 * For the Interval, T overload, this operator returns true if the given point is greater than or equal to the starting point of the interval, and less than or equal to the ending point of the interval. For open interval boundaries, exclusive comparison operators are used. For closed interval boundaries, if the interval boundary is null, the result of the boundary comparison is considered true.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Contains#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getContains()
 * @model extendedMetaData="name='Contains' kind='elementOnly'"
 * @generated
 */
public interface Contains extends BinaryExpression {
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
	 * @see org.hl7.elm.r1.R1Package#getContains_Precision()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='precision'"
	 * @generated
	 */
	DateTimePrecision getPrecision();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Contains#getPrecision <em>Precision</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.elm.r1.Contains#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.Contains#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @generated
	 */
	boolean isSetPrecision();

} // Contains
