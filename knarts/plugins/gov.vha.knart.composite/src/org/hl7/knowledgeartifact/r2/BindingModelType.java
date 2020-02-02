/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.BindingModelType#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getBindingModelType()
 * @model extendedMetaData="name='bindingModel_._type' kind='empty'"
 * @generated
 */
public interface BindingModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * The default value is <code>"Encapsulated"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #isSetModel()
	 * @see #unsetModel()
	 * @see #setModel(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getBindingModelType_Model()
	 * @model default="Encapsulated" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='model'"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.BindingModelType#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #isSetModel()
	 * @see #unsetModel()
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.BindingModelType#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModel()
	 * @see #getModel()
	 * @see #setModel(String)
	 * @generated
	 */
	void unsetModel();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.BindingModelType#getModel <em>Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model</em>' attribute is set.
	 * @see #unsetModel()
	 * @see #getModel()
	 * @see #setModel(String)
	 * @generated
	 */
	boolean isSetModel();

} // BindingModelType
