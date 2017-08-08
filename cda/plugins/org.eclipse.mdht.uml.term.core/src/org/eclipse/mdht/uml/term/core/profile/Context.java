/**
 */
package org.eclipse.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.Context#getBase_Enumeration <em>Base Enumeration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration</em>' reference.
	 * @see #setBase_Enumeration(Enumeration)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContext_Base_Enumeration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumeration getBase_Enumeration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.Context#getBase_Enumeration <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration</em>' reference.
	 * @see #getBase_Enumeration()
	 * @generated
	 */
	void setBase_Enumeration(Enumeration value);

} // Context
