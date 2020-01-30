/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Period#getStart <em>Start</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Period#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getPeriod()
 * @model
 * @generated
 */
public interface Period extends DataType {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(DateTime)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getPeriod_Start()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getStart();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Period#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(DateTime value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(DateTime)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getPeriod_End()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getEnd();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Period#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(DateTime value);

} // Period
