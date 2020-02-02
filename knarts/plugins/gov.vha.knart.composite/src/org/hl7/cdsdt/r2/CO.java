/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents data where coded values are associated with a specific order. 
 * 
 * Note:  CO may be used for things that model rankings and scores, e.g. likert scales, pain, Apgar values, etc, where there is a) implied ordering, b) no implication that the distance between each value is constant, and c) the total number of values is finite. CO may also be used in the context of an ordered code system. In this case, it may not be appropriate or even possible to use the value attribute, but CO may still be used so that models that make use of such code systems may introduce model elements that involve statements about the order of the terms in a domain.
 * 
 * The relative order of values in a code system need not be independently obvious in the literal representation of the CO. It these circumstances, is expected that an application will look up the ordering of these values from some definition of the code system. 
 * 
 * Some of the code systems will directly assign numerical value to the concepts that are suitable for some mathemetical operations.
 * 
 * Though it would generally make sense, applications SHOULD not assume that the translations of the code, if provided, will have the same ordering as the CO. Translations SHALL not be considered when the ordering of the code system is determined.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.CO#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.CO#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getCO()
 * @model extendedMetaData="name='CO' kind='elementOnly'"
 * @generated
 */
public interface CO extends QTY {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code representing the definition of the ordinal item
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CD)
	 * @see org.hl7.cdsdt.r2.R2Package#getCO_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CD getCode();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CO#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CD value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numerical value associated with the coded ordinal value.
	 * The value may be constrained to an integer in some contexts of use. If code is nonNull, value SHALL only be nonNull if the code system explicitly assigns a value to the concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(double)
	 * @see org.hl7.cdsdt.r2.R2Package#getCO_Value()
	 * @model unsettable="true" dataType="org.hl7.cdsdt.r2.Decimal"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.CO#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.CO#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.CO#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

} // CO
