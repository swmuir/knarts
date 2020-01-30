/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Point</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.ContactPoint#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ContactPoint#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ContactPoint#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ContactPoint#getRank <em>Rank</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ContactPoint#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getContactPoint()
 * @model
 * @generated
 */
public interface ContactPoint extends DataType {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getContactPoint_System()
	 * @model containment="true"
	 * @generated
	 */
	Code getSystem();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ContactPoint#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Code value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getContactPoint_Value()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ContactPoint#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getContactPoint_Use()
	 * @model containment="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ContactPoint#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' containment reference.
	 * @see #setRank(PositiveInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getContactPoint_Rank()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getRank();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ContactPoint#getRank <em>Rank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' containment reference.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getContactPoint_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ContactPoint#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // ContactPoint
