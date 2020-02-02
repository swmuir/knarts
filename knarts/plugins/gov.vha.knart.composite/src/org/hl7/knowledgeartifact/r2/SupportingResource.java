/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supporting Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Didactic or other informational resources
 * 				associated with the artifact that can be provided to the CDS
 * 				recipient. Information resources can include inline text commentary
 * 				and links to web resources.Note, supporting resources excludes
 * 				supporting evidence. For supporting evidence, use
 * 				SupportingEvidence.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SupportingResource#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getSupportingResource()
 * @model extendedMetaData="name='SupportingResource' kind='elementOnly'"
 * @generated
 */
public interface SupportingResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.KnowledgeResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual supporting resource.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSupportingResource_Resource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KnowledgeResource> getResource();

} // SupportingResource
