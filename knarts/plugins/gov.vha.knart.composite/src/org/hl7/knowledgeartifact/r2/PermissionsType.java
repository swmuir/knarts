/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.PermissionsType#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getPermissionsType()
 * @model extendedMetaData="name='permissions_._type' kind='elementOnly'"
 * @generated
 */
public interface PermissionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.ST}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getPermissionsType_Permissions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='permissions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ST> getPermissions();

} // PermissionsType
