/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Ids Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.TemplateIdsType1#getTemplateId <em>Template Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getTemplateIdsType1()
 * @model extendedMetaData="name='templateIds_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface TemplateIdsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.VersionedIdentifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getTemplateIdsType1_TemplateId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='templateId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersionedIdentifier> getTemplateId();

} // TemplateIdsType1
