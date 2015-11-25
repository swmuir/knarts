/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.aml.terminology;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#getIds <em>Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getIdentifiedItem()
 * @model
 * @generated
 */
public interface IdentifiedItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getIdentifiedItem_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference list.
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getIdentifiedItem_Id()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EnumerationLiteral> getIds();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIds()
	 * @generated
	 */
	EnumerationLiteral getId(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIds()
	 * @generated
	 */
	EnumerationLiteral getId(String name, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.id->forAll(l1 | self.id->forAll(l2 | l1.oclAsType(EnumerationLiteral).namespace = l2.oclAsType(EnumerationLiteral).namespace implies l1 = l2))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateUniqueScopes(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IdentifiedItem
