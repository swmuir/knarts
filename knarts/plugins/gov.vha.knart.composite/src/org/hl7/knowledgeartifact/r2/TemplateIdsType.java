/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Ids Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.TemplateIdsType#getTemplateId <em>Template Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getTemplateIdsType()
 * @model extendedMetaData="name='templateIds_._type' kind='elementOnly'"
 * @generated
 */
public interface TemplateIdsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.II}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the template
	 * 									associated with this resource. Templates are used to constrain
	 * 									the resource model. For more information on this process,
	 * 									please refer to the implementation guide.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getTemplateIdsType_TemplateId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='templateId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<II> getTemplateId();

} // TemplateIdsType
