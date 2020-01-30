/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Range#getLow <em>Low</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Range#getHigh <em>High</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends DataType {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' containment reference.
	 * @see #setLow(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRange_Low()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getLow();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Range#getLow <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' containment reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(Quantity value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' containment reference.
	 * @see #setHigh(Quantity)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getRange_High()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getHigh();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Range#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(Quantity value);

} // Range
