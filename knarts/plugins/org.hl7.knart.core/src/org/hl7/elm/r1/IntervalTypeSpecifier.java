/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IntervalTypeSpecifier defines an interval type by specifying the point type. Any type can serve as the point type for an interval, so long as it supports comparison operators, minimum and maximum value determination, as well as predecessor and successor functions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.IntervalTypeSpecifier#getPointType <em>Point Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getIntervalTypeSpecifier()
 * @model extendedMetaData="name='IntervalTypeSpecifier' kind='elementOnly'"
 * @generated
 */
public interface IntervalTypeSpecifier extends TypeSpecifier {
	/**
	 * Returns the value of the '<em><b>Point Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Type</em>' containment reference.
	 * @see #setPointType(TypeSpecifier)
	 * @see org.hl7.elm.r1.R1Package#getIntervalTypeSpecifier_PointType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSpecifier getPointType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.IntervalTypeSpecifier#getPointType <em>Point Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Type</em>' containment reference.
	 * @see #getPointType()
	 * @generated
	 */
	void setPointType(TypeSpecifier value);

} // IntervalTypeSpecifier
