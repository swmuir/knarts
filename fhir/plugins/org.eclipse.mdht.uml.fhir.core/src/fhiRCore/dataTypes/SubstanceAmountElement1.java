/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Amount Element1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.SubstanceAmountElement1#getLowLimit <em>Low Limit</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.SubstanceAmountElement1#getHighLimit <em>High Limit</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getSubstanceAmountElement1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceAmount_Element1'"
 * @generated
 */
public interface SubstanceAmountElement1 extends Element {
	/**
	 * Returns the value of the '<em><b>Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Limit</em>' containment reference.
	 * @see #setLowLimit(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSubstanceAmountElement1_LowLimit()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getLowLimit();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.SubstanceAmountElement1#getLowLimit <em>Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Limit</em>' containment reference.
	 * @see #getLowLimit()
	 * @generated
	 */
	void setLowLimit(Quantity value);

	/**
	 * Returns the value of the '<em><b>High Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Limit</em>' containment reference.
	 * @see #setHighLimit(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSubstanceAmountElement1_HighLimit()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getHighLimit();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.SubstanceAmountElement1#getHighLimit <em>High Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Limit</em>' containment reference.
	 * @see #getHighLimit()
	 * @generated
	 */
	void setHighLimit(Quantity value);

} // SubstanceAmountElement1
