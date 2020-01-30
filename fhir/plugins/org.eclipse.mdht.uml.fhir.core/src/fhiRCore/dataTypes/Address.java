/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Address#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getLines <em>Line</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getCity <em>City</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getDistrict <em>District</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getState <em>State</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getCountry <em>Country</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Address#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends DataType {
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_Use()
	 * @model containment="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_Type()
	 * @model containment="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_Line()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getLines();

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference.
	 * @see #setCity(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_City()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCity();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getCity <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' containment reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>District</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>District</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>District</em>' containment reference.
	 * @see #setDistrict(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_District()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDistrict();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getDistrict <em>District</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' containment reference.
	 * @see #getDistrict()
	 * @generated
	 */
	void setDistrict(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_State()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getState();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_PostalCode()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPostalCode();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_Country()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCountry();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getAddress_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Address#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // Address
