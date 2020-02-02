/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContributionsType#getContribution <em>Contribution</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getContributionsType()
 * @model extendedMetaData="name='contributions_._type' kind='elementOnly'"
 * @generated
 */
public interface ContributionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contribution</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.Contribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContributionsType_Contribution()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contribution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Contribution> getContribution();

} // ContributionsType
