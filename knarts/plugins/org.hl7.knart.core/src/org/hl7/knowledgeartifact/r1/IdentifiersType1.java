/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiers Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.IdentifiersType1#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getIdentifiersType1()
 * @model extendedMetaData="name='identifiers_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface IdentifiersType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.VersionedIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of a CDS knowledge artifact consists of two parts:  (1) a base identifier which uniquely identifies the CDS Knowledge Artifact from all other CDS Knowledge Artifacts, regardless of version.  (2) a version identifier which uniquely identifies the CDS Knowledge Artifact from all other CDS Knowledge Artifact versions.
	 * 
	 * Essentially, the full identifier is for a particular "artifact version".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getIdentifiersType1_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersionedIdentifier> getIdentifier();

} // IdentifiersType1
