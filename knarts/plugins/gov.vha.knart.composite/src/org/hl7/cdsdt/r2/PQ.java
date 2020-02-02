/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A dimensioned quantity expressing the result of measuring.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.PQ#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.PQ#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getPQ()
 * @model extendedMetaData="name='PQ' kind='empty'"
 * @generated
 */
public interface PQ extends QTY {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit of measure specified in the Unified Code for Units of Measure (UCUM). 
	 * UCUM defines two forms of expression, case sensitive and case insensitive. PQ uses the case sensitive codes. The codeSystem OID for the case sensitive form is 2.16.840.1.113883.6.8. The default value for unit is the UCUM code "1" (unity).
	 * Equality of physical quantities does not require the values and units to be equal independently. Value and unit is only how we represent physical quantities. For example, 1 m equals 100 cm. Although the units are different and the values are different, the physical quantities are equal. Therefore one should never expect a particular unit for a physical quantity but instead allow for automated conversion between different comparable units. 
	 * The unit SHALL come from UCUM, which only specifies unambiguous measurement units. Sometimes it is not clear how some measurements in healthcare map to UCUM codes.
	 * Note: The general pattern for a measurement is  value unit of Thing. In this scheme, the PQ represents the  value and the unit, and the Thing is described by some coded concept that is linked to the PQ by the context of use. This maps obviously to some measurements, such as Patient Body Temperature of 37 Celsius, and 250 mg/day of Salicylate.
	 * However for some measurements that arise in healthcare, the scheme is not so obvious. Two classic examples are 5 Drinks of Beer, and 3 Acetaminophen tablets. At first glance it is tempting to classify these measurements like this: 5 drinks of Beer and 3 Acetaminophen tablets. The problem with this is that UCUM does not support units of "beer", "tablets" or "scoops".
	 * The reason for this is that neither tablets or scoops are proper units. What kind of tablets? How big is the glass? In these kinds of cases, the concept that appears to be a unit needs to further specified before interoperability is established. If a correct amount is required, then it is generally appropriate to specify an exact measurement with an appropriate UCUM unit. If this is not possible, then the concept is not part of the measurement. UCUM provides a unit called unity for use in these cases. The proper way to understand these measurements as 3 1 Acetaminophen tablets, where 1 is the UCUM unit for unity, and the Thing has a qualifier. The context of use will need to provide the extra qualifying information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getPQ_Unit()
	 * @model dataType="org.hl7.cdsdt.r2.Code" required="true"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.PQ#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number which is multiplied by the unit to make the PQ.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(double)
	 * @see org.hl7.cdsdt.r2.R2Package#getPQ_Value()
	 * @model unsettable="true" dataType="org.hl7.cdsdt.r2.Decimal" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.PQ#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.PQ#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.PQ#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

} // PQ
