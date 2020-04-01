/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Ratio#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Ratio#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getRatio()
 * @model
 * @generated
 */
public interface Ratio extends DataType {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' containment reference.
	 * @see #setNumerator(Quantity)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getRatio_Numerator()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getNumerator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Ratio#getNumerator <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' containment reference.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(Quantity value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' containment reference.
	 * @see #setDenominator(Quantity)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getRatio_Denominator()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getDenominator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Ratio#getDenominator <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' containment reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(Quantity value);

} // Ratio
