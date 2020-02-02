/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A quantity constructed as the quotient of a numerator quantity divided by a denominator quantity. 
 * Common factors in the numerator and denominator are not automatically cancelled out. 
 * The RTO datatype supports titers (e.g., "1:128") and other quantities produced by laboratories that truly represent ratios. Ratios are not simply "structured numerics", particularly blood pressure measurements (e.g. "120/60") are not ratios.
 * Notes: 
 * 1.	Ratios are different from rational numbers, i.e., in ratios common factors in the numerator and denominator never cancel out. A ratio of two real or integer numbers is not automatically reduced to a real number. This datatype is not defined to generally represent rational numbers. It is used only if common factors in numerator and denominator are not supposed to cancel out. This is only rarely the case. For observation values, ratios occur almost exclusively with titers. In most other cases, REAL should be used instead of the RTO.
 * 2.	Since many implementation technologies expect generics to be collections, or only have one parameter, RTO is not implemented as a generic in this specification. Constraints at the point where the RTO is used will define which form of QTY are used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.RTO#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.RTO#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getRTO()
 * @model extendedMetaData="name='RTO' kind='elementOnly'"
 * @generated
 */
public interface RTO extends QTY {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity that is being divided in the ratio
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numerator</em>' containment reference.
	 * @see #setNumerator(QTY)
	 * @see org.hl7.cdsdt.r2.R2Package#getRTO_Numerator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numerator' namespace='##targetNamespace'"
	 * @generated
	 */
	QTY getNumerator();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.RTO#getNumerator <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' containment reference.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(QTY value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity that divides the numerator in the ratio. 
	 * The denominator SHALL not be zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Denominator</em>' containment reference.
	 * @see #setDenominator(QTY)
	 * @see org.hl7.cdsdt.r2.R2Package#getRTO_Denominator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='denominator' namespace='##targetNamespace'"
	 * @generated
	 */
	QTY getDenominator();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.RTO#getDenominator <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' containment reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(QTY value);

} // RTO
