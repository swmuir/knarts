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

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Version Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference#getCodeSystem <em>Code System</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getCodeSystemVersionReference()
 * @model
 * @generated
 */
public interface CodeSystemVersionReference extends ResourceReference {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code System</em>' reference.
	 * @see #setCodeSystem(EnumerationLiteral)
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getCodeSystemVersionReference_CodeSystem()
	 * @model ordered="false"
	 * @generated
	 */
	EnumerationLiteral getCodeSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference#getCodeSystem <em>Code System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(EnumerationLiteral value);

} // CodeSystemVersionReference
