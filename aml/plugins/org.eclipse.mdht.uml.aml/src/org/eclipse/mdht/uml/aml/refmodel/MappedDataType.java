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
package org.eclipse.mdht.uml.aml.refmodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Abstraction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.MappedDataType#getBase_Abstraction <em>Base Abstraction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage#getMappedDataType()
 * @model
 * @generated
 */
public interface MappedDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Abstraction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Abstraction</em>' reference.
	 * @see #setBase_Abstraction(Abstraction)
	 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage#getMappedDataType_Base_Abstraction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Abstraction getBase_Abstraction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.refmodel.MappedDataType#getBase_Abstraction <em>Base Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Abstraction</em>' reference.
	 * @see #getBase_Abstraction()
	 * @generated
	 */
	void setBase_Abstraction(Abstraction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Abstraction.supplier->exists(s|s.oclIsKindOf(PrimitiveType) and ((s.namespace.name='XMLPrimitiveTypes') or (s.namespace.name='PrimitiveTypes')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateIsAMLDataType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // MappedDataType
