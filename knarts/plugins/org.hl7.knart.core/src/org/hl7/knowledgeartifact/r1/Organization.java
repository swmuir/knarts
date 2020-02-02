/**
 */
package org.hl7.knowledgeartifact.r1;

import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies an organization, a corporation, an
 * 				institution, or a government department that has relevance to the
 * 				knowledge artifact. Note that organization extends Party by adding a
 * 				name attribute of type ST.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Organization#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getOrganization()
 * @model extendedMetaData="name='Organization' kind='elementOnly'"
 * @generated
 */
public interface Organization extends Party {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(ST)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getOrganization_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Organization#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(ST value);

} // Organization
