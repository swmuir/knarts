/**
 */
package org.eclipse.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context To Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet()
 * @model
 * @generated
 */
public interface ContextToValueSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_Key()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getContextToValueSet_Value()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ContextToValueSet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ContextToValueSet
