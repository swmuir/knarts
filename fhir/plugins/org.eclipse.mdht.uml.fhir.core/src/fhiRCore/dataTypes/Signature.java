/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Signature#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Signature#getWhen <em>When</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Signature#getWho <em>Who</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Signature#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Signature#getTargetFormat <em>Target Format</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Signature#getSigFormat <em>Sig Format</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.Signature#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSignature_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Coding> getTypes();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Instant)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSignature_When()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Instant getWhen();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Signature#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Instant value);

	/**
	 * Returns the value of the '<em><b>Who</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who</em>' containment reference.
	 * @see #setWho(Reference)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSignature_Who()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getWho();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Signature#getWho <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who</em>' containment reference.
	 * @see #getWho()
	 * @generated
	 */
	void setWho(Reference value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Behalf Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #setOnBehalfOf(Reference)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSignature_OnBehalfOf()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOnBehalfOf();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Signature#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Format</em>' containment reference.
	 * @see #setTargetFormat(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSignature_TargetFormat()
	 * @model containment="true"
	 * @generated
	 */
	Code getTargetFormat();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Signature#getTargetFormat <em>Target Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Format</em>' containment reference.
	 * @see #getTargetFormat()
	 * @generated
	 */
	void setTargetFormat(Code value);

	/**
	 * Returns the value of the '<em><b>Sig Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sig Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sig Format</em>' containment reference.
	 * @see #setSigFormat(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSignature_SigFormat()
	 * @model containment="true"
	 * @generated
	 */
	Code getSigFormat();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Signature#getSigFormat <em>Sig Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig Format</em>' containment reference.
	 * @see #getSigFormat()
	 * @generated
	 */
	void setSigFormat(Code value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Base64Binary)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getSignature_Data()
	 * @model containment="true"
	 * @generated
	 */
	Base64Binary getData();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Signature#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Base64Binary value);

} // Signature
