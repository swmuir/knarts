/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proper Includes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ProperIncludes operator returns true if the first operand includes the second, and is strictly larger.
 * 			
 * There are two overloads of this operator:
 * 	List, List : The element type of both lists must be the same.
 * 	Interval, Interval : The point type of both intervals must be the same.
 * 	
 * For the List, List overload, this operator returns true if the first list includes every element of the second list, using matching semantics, and first list is strictly larger.
 * 
 * For the Interval, Interval overload, this operator returns true if the first interval includes the second interval, and the intervals are not equal.
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
 *   <li>{@link org.hl7.elm.r1.ProperIncludes#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getProperIncludes()
 * @model extendedMetaData="name='ProperIncludes' kind='elementOnly'"
 * @generated
 */
public interface ProperIncludes extends BinaryExpression {
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
	 * @see org.hl7.elm.r1.R1Package#getProperIncludes_Precision()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='precision'"
	 * @generated
	 */
	DateTimePrecision getPrecision();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ProperIncludes#getPrecision <em>Precision</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.elm.r1.ProperIncludes#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link org.hl7.elm.r1.ProperIncludes#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(DateTimePrecision)
	 * @generated
	 */
	boolean isSetPrecision();

} // ProperIncludes
