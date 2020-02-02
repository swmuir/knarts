/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Data Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ResponseDataTypeType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getResponseDataTypeType()
 * @model extendedMetaData="name='responseDataType_._type' kind='empty'"
 * @generated
 */
public interface ResponseDataTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.knowledgeartifact.r1.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r1.ValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ValueType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getResponseDataTypeType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ResponseDataTypeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r1.ValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r1.ResponseDataTypeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ValueType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r1.ResponseDataTypeType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ValueType)
	 * @generated
	 */
	boolean isSetValue();

} // ResponseDataTypeType
