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
 * A representation of the model object '<em><b>Permissible Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue#getMeaning <em>Meaning</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getPermissibleValue()
 * @model
 * @generated
 */
public interface PermissibleValue extends IdentifiedItem {
	/**
	 * Returns the value of the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration Literal</em>' reference.
	 * @see #setBase_EnumerationLiteral(EnumerationLiteral)
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getPermissibleValue_Base_EnumerationLiteral()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EnumerationLiteral getBase_EnumerationLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration Literal</em>' reference.
	 * @see #getBase_EnumerationLiteral()
	 * @generated
	 */
	void setBase_EnumerationLiteral(EnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' reference.
	 * @see #setMeaning(EnumerationLiteral)
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getPermissibleValue_Meaning()
	 * @model ordered="false"
	 * @generated
	 */
	EnumerationLiteral getMeaning();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue#getMeaning <em>Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(EnumerationLiteral value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not(self.meaning.oclIsUndefined())
	 * implies
	 * self.meaning.stereotypedBy('ConceptReference')
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustBeConceptReference(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PermissibleValue
