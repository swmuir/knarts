/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.MetadataBinding#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadataBinding()
 * @model extendedMetaData="name='MetadataBinding' kind='elementOnly'"
 * @generated
 */
public interface MetadataBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference.
	 * @see #setBindings(SpecificMetadataBinding)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMetadataBinding_Bindings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bindings' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificMetadataBinding getBindings();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.MetadataBinding#getBindings <em>Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindings</em>' containment reference.
	 * @see #getBindings()
	 * @generated
	 */
	void setBindings(SpecificMetadataBinding value);

} // MetadataBinding
