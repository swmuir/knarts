/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Metadata Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SpecificMetadataBinding#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SpecificMetadataBinding#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificMetadataBinding()
 * @model extendedMetaData="name='SpecificMetadataBinding' kind='elementOnly'"
 * @generated
 */
public interface SpecificMetadataBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Type</em>' containment reference.
	 * @see #setBindingType(BindingTypeType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificMetadataBinding_BindingType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bindingType' namespace='##targetNamespace'"
	 * @generated
	 */
	BindingTypeType getBindingType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.SpecificMetadataBinding#getBindingType <em>Binding Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Type</em>' containment reference.
	 * @see #getBindingType()
	 * @generated
	 */
	void setBindingType(BindingTypeType value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSpecificMetadataBinding_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.SpecificMetadataBinding#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

} // SpecificMetadataBinding
