/**
 */
package org.eclipse.mdht.uml.term.core.profile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraints#getBase_Property <em>Base Property</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraints#getValueSetConstraint <em>Value Set Constraint</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraints()
 * @model
 * @generated
 */
public interface ValueSetConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraints_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraints#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Value Set Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Value Set Constraint</em>' reference list.
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraints_ValueSetConstraint()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueSetConstraint> getValueSetConstraint();

} // ValueSetConstraints
