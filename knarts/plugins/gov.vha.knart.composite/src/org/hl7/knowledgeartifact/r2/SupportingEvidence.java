/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supporting Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The evidence grade and the sources of evidence
 * 				associated with this artifact.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.SupportingEvidence#getEvidence <em>Evidence</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getSupportingEvidence()
 * @model extendedMetaData="name='SupportingEvidence' kind='elementOnly'"
 * @generated
 */
public interface SupportingEvidence extends EObject {
	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.Evidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single evidence reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getSupportingEvidence_Evidence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Evidence> getEvidence();

} // SupportingEvidence
