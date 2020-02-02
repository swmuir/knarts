/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Binding Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EventBindingTypeType#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventBindingTypeType()
 * @model extendedMetaData="name='eventBindingType_._type' kind='empty'"
 * @generated
 */
public interface EventBindingTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see #setBinding(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEventBindingTypeType_Binding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='binding'"
	 * @generated
	 */
	String getBinding();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.EventBindingTypeType#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(String value);

} // EventBindingTypeType
