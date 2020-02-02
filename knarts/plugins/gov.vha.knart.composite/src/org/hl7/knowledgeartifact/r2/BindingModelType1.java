/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Model Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.BindingModelType1#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getBindingModelType1()
 * @model extendedMetaData="name='bindingModel_._1_._type' kind='empty'"
 * @generated
 */
public interface BindingModelType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getBindingModelType1_Model()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='model'"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.BindingModelType1#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // BindingModelType1
