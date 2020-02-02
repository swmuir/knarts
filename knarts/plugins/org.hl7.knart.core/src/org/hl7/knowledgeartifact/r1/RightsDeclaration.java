/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rights Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This specifies the intellectual property rights
 * 				associated with this CDS knowledge artifact, including who the
 * 				rights holder is and what rights they assert. It also specifies what
 * 				permissions are granted for usage. The asserted rights and
 * 				persmissions are specified as a free-form text string.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getAssertedRights <em>Asserted Rights</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getRightsDeclaration()
 * @model extendedMetaData="name='RightsDeclaration' kind='elementOnly'"
 * @generated
 */
public interface RightsDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Asserted Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asserted Rights</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asserted Rights</em>' containment reference.
	 * @see #setAssertedRights(ST)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getRightsDeclaration_AssertedRights()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='assertedRights' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getAssertedRights();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getAssertedRights <em>Asserted Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserted Rights</em>' containment reference.
	 * @see #getAssertedRights()
	 * @generated
	 */
	void setAssertedRights(ST value);

	/**
	 * Returns the value of the '<em><b>Rights Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights Holder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights Holder</em>' containment reference.
	 * @see #setRightsHolder(Party)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getRightsDeclaration_RightsHolder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rightsHolder' namespace='##targetNamespace'"
	 * @generated
	 */
	Party getRightsHolder();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getRightsHolder <em>Rights Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights Holder</em>' containment reference.
	 * @see #getRightsHolder()
	 * @generated
	 */
	void setRightsHolder(Party value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(PermissionsType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getRightsDeclaration_Permissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='permissions' namespace='##targetNamespace'"
	 * @generated
	 */
	PermissionsType getPermissions();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.RightsDeclaration#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(PermissionsType value);

} // RightsDeclaration
