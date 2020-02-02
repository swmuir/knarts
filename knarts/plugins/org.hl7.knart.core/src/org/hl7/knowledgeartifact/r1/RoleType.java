/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.RoleType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getRoleType()
 * @model extendedMetaData="name='role_._type' kind='empty'"
 * @generated
 */
public interface RoleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.knowledgeartifact.r1.ContributorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r1.ContributorType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ContributorType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getRoleType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ContributorType getValue();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.RoleType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.knowledgeartifact.r1.ContributorType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ContributorType value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r1.RoleType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ContributorType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r1.RoleType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ContributorType)
	 * @generated
	 */
	boolean isSetValue();

} // RoleType
