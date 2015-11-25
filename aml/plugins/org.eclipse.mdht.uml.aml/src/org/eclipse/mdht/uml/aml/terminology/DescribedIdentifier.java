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

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Described Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier#getDefiningCodeSystem <em>Defining Code System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getDescribedIdentifier()
 * @model
 * @generated
 */
public interface DescribedIdentifier extends ScopedIdentifier {
	/**
	 * Returns the value of the '<em><b>Defining Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Code System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Code System</em>' reference.
	 * @see #setDefiningCodeSystem(EnumerationLiteral)
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getDescribedIdentifier_DefiningCodeSystem()
	 * @model ordered="false"
	 * @generated
	 */
	EnumerationLiteral getDefiningCodeSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier#getDefiningCodeSystem <em>Defining Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Code System</em>' reference.
	 * @see #getDefiningCodeSystem()
	 * @generated
	 */
	void setDefiningCodeSystem(EnumerationLiteral value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Enumeration.ownedLiteral->forAll(ol|ol.stereotypedBy('ConceptReference'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMembersMustBeConceptReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not(self.definingCodeSystem.oclIsUndefined())
	 * implies(
	 * self.definingCodeSystem.stereotypedBy('CodeSystemReference')
	 * or self.definingCodeSystem.stereotypedBy('CodeSystemVersionReference')
	 * )
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDefiningCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DescribedIdentifier
