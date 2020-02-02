/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.RelatedResourcesType#getRelatedResource <em>Related Resource</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getRelatedResourcesType()
 * @model extendedMetaData="name='relatedResources_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.ResourceRelationshipReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Resource</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getRelatedResourcesType_RelatedResource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relatedResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceRelationshipReference> getRelatedResource();

} // RelatedResourcesType
