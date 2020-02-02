/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.BindingTypeType#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getBindingTypeType()
 * @model extendedMetaData="name='bindingType_._type' kind='empty'"
 * @generated
 */
public interface BindingTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.knowledgeartifact.r2.MetadataBindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r2.MetadataBindingType
	 * @see #isSetBinding()
	 * @see #unsetBinding()
	 * @see #setBinding(MetadataBindingType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getBindingTypeType_Binding()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='binding'"
	 * @generated
	 */
	MetadataBindingType getBinding();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.BindingTypeType#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r2.MetadataBindingType
	 * @see #isSetBinding()
	 * @see #unsetBinding()
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(MetadataBindingType value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.BindingTypeType#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBinding()
	 * @see #getBinding()
	 * @see #setBinding(MetadataBindingType)
	 * @generated
	 */
	void unsetBinding();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.BindingTypeType#getBinding <em>Binding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Binding</em>' attribute is set.
	 * @see #unsetBinding()
	 * @see #getBinding()
	 * @see #setBinding(MetadataBindingType)
	 * @generated
	 */
	boolean isSetBinding();

} // BindingTypeType
