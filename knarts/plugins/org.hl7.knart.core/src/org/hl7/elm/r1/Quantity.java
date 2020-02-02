/**
 */
package org.hl7.elm.r1;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Quantity type defines a clinical quantity. For example, the quantity 10 days or 30 mmHg. The value is a decimal, while the unit is expected to be a valid UCUM unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Quantity#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Quantity#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getQuantity()
 * @model extendedMetaData="name='Quantity' kind='elementOnly'"
 * @generated
 */
public interface Quantity extends Expression {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.hl7.elm.r1.R1Package#getQuantity_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Quantity#getUnit <em>Unit</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see org.hl7.elm.r1.R1Package#getQuantity_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Quantity#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

} // Quantity
