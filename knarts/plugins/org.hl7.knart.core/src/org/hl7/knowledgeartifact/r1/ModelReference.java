/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to some model by its Universal Resource Identifier.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ModelReference#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ModelReference#getReferencedModel <em>Referenced Model</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getModelReference()
 * @model extendedMetaData="name='ModelReference' kind='elementOnly'"
 * @generated
 */
public interface ModelReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(ST)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getModelReference_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ModelReference#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(ST value);

	/**
	 * Returns the value of the '<em><b>Referenced Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the object that is being
	 * 						referenced.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Model</em>' containment reference.
	 * @see #setReferencedModel(ReferencedModelType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getModelReference_ReferencedModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referencedModel' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferencedModelType getReferencedModel();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ModelReference#getReferencedModel <em>Referenced Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Model</em>' containment reference.
	 * @see #getReferencedModel()
	 * @generated
	 */
	void setReferencedModel(ReferencedModelType value);

} // ModelReference
