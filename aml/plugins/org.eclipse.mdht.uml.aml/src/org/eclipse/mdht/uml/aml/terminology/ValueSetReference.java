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

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.ValueSetReference#getValueSetDefinitions <em>Value Set Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getValueSetReference()
 * @model
 * @generated
 */
public interface ValueSetReference extends ResourceReference {
	/**
	 * Returns the value of the '<em><b>Value Set Definition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Definition</em>' reference list.
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getValueSetReference_ValueSetDefinition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EnumerationLiteral> getValueSetDefinitions();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Value Set Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getValueSetDefinitions()
	 * @generated
	 */
	EnumerationLiteral getValueSetDefinition(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>' from the '<em><b>Value Set Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.EnumerationLiteral} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.EnumerationLiteral} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getValueSetDefinitions()
	 * @generated
	 */
	EnumerationLiteral getValueSetDefinition(String name, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.valueSetDefinition->forAll(d|d.stereotypedBy('ValueSetDefinitionReference'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDefinition(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ValueSetReference
