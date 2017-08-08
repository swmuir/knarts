/**
 */
package org.eclipse.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Value Set Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getNullValueSetConstraint()
 * @model
 * @generated
 */
public interface NullValueSetConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ValueSetVersion)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getNullValueSetConstraint_Reference()
	 * @model ordered="false"
	 * @generated
	 */
	ValueSetVersion getReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ValueSetVersion value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getNullValueSetConstraint_Identifier()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getNullValueSetConstraint_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getNullValueSetConstraint_Version()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.term.core.profile.BindingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see org.eclipse.mdht.uml.term.core.profile.BindingKind
	 * @see #setBinding(BindingKind)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getNullValueSetConstraint_Binding()
	 * @model ordered="false"
	 * @generated
	 */
	BindingKind getBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see org.eclipse.mdht.uml.term.core.profile.BindingKind
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BindingKind value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getNullValueSetConstraint_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // NullValueSetConstraint
