/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Quantity#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Quantity#getComparator <em>Comparator</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Quantity#getUnit <em>Unit</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Quantity#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Quantity#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getQuantity()
 * @model
 * @generated
 */
public interface Quantity extends DataType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getQuantity_Value()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Quantity#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference.
	 * @see #setComparator(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getQuantity_Comparator()
	 * @model containment="true"
	 * @generated
	 */
	Code getComparator();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Quantity#getComparator <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' containment reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(Code value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getQuantity_Unit()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Quantity#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Uri)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getQuantity_System()
	 * @model containment="true"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Quantity#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getQuantity_Code()
	 * @model containment="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Quantity#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

} // Quantity
