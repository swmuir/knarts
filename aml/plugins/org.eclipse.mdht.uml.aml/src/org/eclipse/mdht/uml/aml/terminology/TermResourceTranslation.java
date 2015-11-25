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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Resource Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#getBase_Enumeration <em>Base Enumeration</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getTermResourceTranslation()
 * @model
 * @generated
 */
public interface TermResourceTranslation extends EObject {
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
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getTermResourceTranslation_Base_Enumeration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumeration getBase_Enumeration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#getBase_Enumeration <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration</em>' reference.
	 * @see #getBase_Enumeration()
	 * @generated
	 */
	void setBase_Enumeration(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(EnumerationLiteral)
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getTermResourceTranslation_Language()
	 * @model ordered="false"
	 * @generated
	 */
	EnumerationLiteral getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(EnumerationLiteral value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Enumeration.ownedLiteral->forAll(ol|ol.stereotypedBy('Entry'))
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTranslationEntries(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TermResourceTranslation
