/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Coding#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Coding#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Coding#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Coding#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Coding#getUserSelected <em>User Selected</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getCoding()
 * @model
 * @generated
 */
public interface Coding extends DataType {
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getCoding_System()
	 * @model containment="true"
	 * @generated
	 */
	Uri getSystem();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Coding#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getCoding_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Coding#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getCoding_Code()
	 * @model containment="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Coding#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getCoding_Display()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisplay();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Coding#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>User Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Selected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Selected</em>' containment reference.
	 * @see #setUserSelected(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getCoding_UserSelected()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getUserSelected();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Coding#getUserSelected <em>User Selected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Selected</em>' containment reference.
	 * @see #getUserSelected()
	 * @generated
	 */
	void setUserSelected(fhiRCore.dataTypes.Boolean value);

} // Coding
