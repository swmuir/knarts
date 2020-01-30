/**
 */
package fhiRCore.dataTypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.ReferenceRange#getLow <em>Low</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ReferenceRange#getHigh <em>High</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ReferenceRange#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ReferenceRange#getAppliesTos <em>Applies To</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ReferenceRange#getAge <em>Age</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ReferenceRange#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getReferenceRange()
 * @model
 * @generated
 */
public interface ReferenceRange extends DataType {
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getReferenceRange_Low()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getLow();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ReferenceRange#getLow <em>Low</em>}' containment reference.
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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getReferenceRange_High()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getHigh();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ReferenceRange#getHigh <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' containment reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(Quantity value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getReferenceRange_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ReferenceRange#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see fhiRCore.dataTypes.DataTypesPackage#getReferenceRange_AppliesTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getAppliesTos();

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' containment reference.
	 * @see #setAge(Range)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getReferenceRange_Age()
	 * @model containment="true"
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ReferenceRange#getAge <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' containment reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Range value);

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getReferenceRange_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ReferenceRange#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

} // ReferenceRange
