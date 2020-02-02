/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A contribution is made by a specific contributor
 * 				(organization, person, etc.), and was made in a particular way, as
 * 				specified by the contributor's role. For example, a contributor may
 * 				have been an author, or may have been a reviewer.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Contribution#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Contribution#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getContribution()
 * @model extendedMetaData="name='Contribution' kind='elementOnly'"
 * @generated
 */
public interface Contribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference.
	 * @see #setContributor(Party)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getContribution_Contributor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace'"
	 * @generated
	 */
	Party getContributor();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Contribution#getContributor <em>Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor</em>' containment reference.
	 * @see #getContributor()
	 * @generated
	 */
	void setContributor(Party value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getContribution_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleType getRole();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Contribution#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleType value);

} // Contribution
