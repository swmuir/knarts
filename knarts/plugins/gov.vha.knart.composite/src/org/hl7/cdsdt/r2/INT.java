/**
 */
package org.hl7.cdsdt.r2;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Integer numbers (-1,0,1,2, 100, 3398129, etc.) are precise numbers that are results of counting and enumerating. Integer numbers are discrete, the set of integers is infinite but countable. No arbitrary limit is imposed on the range of integer numbers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.INT#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getINT()
 * @model extendedMetaData="name='INT' kind='empty'"
 * @generated
 */
public interface INT extends QTY {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the INT. Note that this specification imposes no limitations on the size of integer, but most implementations will map this to a 32 or 64 bit integer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see org.hl7.cdsdt.r2.R2Package#getINT_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.INT#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

} // INT
