/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained Artifact List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContainedArtifactList#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifactList()
 * @model extendedMetaData="name='ContainedArtifactList' kind='elementOnly'"
 * @generated
 */
public interface ContainedArtifactList extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.ContainedArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContainedArtifactList_Artifact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContainedArtifact> getArtifact();

} // ContainedArtifactList
