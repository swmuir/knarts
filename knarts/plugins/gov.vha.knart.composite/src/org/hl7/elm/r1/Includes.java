/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Includes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Includes operator returns true if the first operand completely includes the second.
 * 			
 * There are two overloads of this operator:
 * 	List, List : The element type of both lists must be the same.
 * 	Interval, Interval : The point type of both intervals must be the same.
 * 
 * For the List, List overload, this operator returns true if the first operand includes every element of the second operand, using matching semantics.
 * 
 * For the Interval, Interval overload, this operator returns true if starting point of the first interval is less than or equal to the starting point of the second interval, and the ending point of the first interval is greater than or equal to the ending point of the second interval.
 * 
 * This operator uses the semantics described in the Start and End operators to determine interval boundaries.
 * 
 * If either argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Includes#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getIncludes()
 * @model extendedMetaData="name='Includes' kind='elementOnly'"
 * @generated
 */
public interface Includes extends BinaryExpression {
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
	 * @see org.hl7.elm.r1.R1Package#getIncludes_Precision()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='precision'"
	 * @generated
	 */
	DateTimePrecision getPrecision();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Includes#getPrecision <em>Precision</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.elm.r1.Includes#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.Includes#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @generated
	 */
	boolean isSetPrecision();

} // Includes
