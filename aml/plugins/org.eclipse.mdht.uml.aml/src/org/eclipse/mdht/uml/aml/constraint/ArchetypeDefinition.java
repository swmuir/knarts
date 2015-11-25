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
package org.eclipse.mdht.uml.aml.constraint;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Usage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archetype Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition#getBase_Usage <em>Base Usage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeDefinition()
 * @model
 * @generated
 */
public interface ArchetypeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Usage</em>' reference.
	 * @see #setBase_Usage(Usage)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeDefinition_Base_Usage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usage getBase_Usage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition#getBase_Usage <em>Base Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Usage</em>' reference.
	 * @see #getBase_Usage()
	 * @generated
	 */
	void setBase_Usage(Usage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Usage.supplier->exists(s|s.stereotypedBy('ObjectConstraint') and s.oclAsType(Classifier).general->notEmpty())
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_HRID:Invariant:Rm_class_name_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEHRIDInvariantRmClassNameValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ArchetypeDefinition
