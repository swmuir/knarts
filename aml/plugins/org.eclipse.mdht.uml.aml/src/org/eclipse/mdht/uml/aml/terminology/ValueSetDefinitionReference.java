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
 * A representation of the model object '<em><b>Value Set Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getValueSetDefinitionReference()
 * @model
 * @generated
 */
public interface ValueSetDefinitionReference extends ResourceReference {
	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' reference.
	 * @see #setValueSet(EnumerationLiteral)
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#getValueSetDefinitionReference_ValueSet()
	 * @model ordered="false"
	 * @generated
	 */
	EnumerationLiteral getValueSet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference#getValueSet <em>Value Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(EnumerationLiteral value);

} // ValueSetDefinitionReference
