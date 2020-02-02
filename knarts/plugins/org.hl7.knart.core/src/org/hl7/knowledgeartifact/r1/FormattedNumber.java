/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formatted Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getStyle <em>Style</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getFormattedNumber()
 * @model extendedMetaData="name='FormattedNumber' kind='elementOnly'"
 * @generated
 */
public interface FormattedNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label for the formatted number. Use of this element is exclusive with the value attribute. If the value attribute is specified, it will be used. Otherwise, this element will be used for the label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #setLabel(int)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getFormattedNumber_Label()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	int getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(int value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabel()
	 * @see #getLabel()
	 * @see #setLabel(int)
	 * @generated
	 */
	void unsetLabel();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getLabel <em>Label</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label</em>' attribute is set.
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @see #setLabel(int)
	 * @generated
	 */
	boolean isSetLabel();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statements in some style language for rendering of the label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' attribute list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getFormattedNumber_Style()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='style' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getStyle();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(int)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getFormattedNumber_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r1.FormattedNumber#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	boolean isSetValue();

} // FormattedNumber
