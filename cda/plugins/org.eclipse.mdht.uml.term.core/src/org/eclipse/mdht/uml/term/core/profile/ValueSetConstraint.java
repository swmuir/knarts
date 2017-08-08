/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getExtensibility <em>Extensibility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint()
 * @model
 * @generated
 */
public interface ValueSetConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.term.core.profile.BindingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see org.eclipse.mdht.uml.term.core.profile.BindingKind
	 * @see #setBinding(BindingKind)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Binding()
	 * @model ordered="false"
	 * @generated
	 */
	BindingKind getBinding();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Identifier()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ValueSetVersion)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Reference()
	 * @model ordered="false"
	 * @generated
	 */
	ValueSetVersion getReference();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Version()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Extensibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.term.core.profile.Extensibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensibility</em>' attribute.
	 * @see org.eclipse.mdht.uml.term.core.profile.Extensibility
	 * @see #setExtensibility(Extensibility)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Extensibility()
	 * @model ordered="false"
	 * @generated
	 */
	Extensibility getExtensibility();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getExtensibility <em>Extensibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensibility</em>' attribute.
	 * @see org.eclipse.mdht.uml.term.core.profile.Extensibility
	 * @see #getExtensibility()
	 * @generated
	 */
	void setExtensibility(Extensibility value);

	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.term.core.profile.Guidance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guidance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidance</em>' attribute.
	 * @see org.eclipse.mdht.uml.term.core.profile.Guidance
	 * @see #setGuidance(Guidance)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Guidance()
	 * @model ordered="false"
	 * @generated
	 */
	Guidance getGuidance();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getGuidance <em>Guidance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidance</em>' attribute.
	 * @see org.eclipse.mdht.uml.term.core.profile.Guidance
	 * @see #getGuidance()
	 * @generated
	 */
	void setGuidance(Guidance value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getValueSetConstraint_Uri()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see org.eclipse.mdht.uml.term.core.profile.BindingKind
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BindingKind value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ValueSetVersion value);

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ValueSetConstraint
