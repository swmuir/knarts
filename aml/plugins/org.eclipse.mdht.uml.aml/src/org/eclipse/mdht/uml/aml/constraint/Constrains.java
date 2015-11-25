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

import org.eclipse.uml2.uml.Generalization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.Constrains#getBase_Generalization <em>Base Generalization</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getConstrains()
 * @model
 * @generated
 */
public interface Constrains extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Generalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Generalization</em>' reference.
	 * @see #setBase_Generalization(Generalization)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getConstrains_Base_Generalization()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Generalization getBase_Generalization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.Constrains#getBase_Generalization <em>Base Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Generalization</em>' reference.
	 * @see #getBase_Generalization()
	 * @generated
	 */
	void setBase_Generalization(Generalization value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Generalization.specific.stereotypedBy('ObjectConstraint')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSpecificObjectConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (
	 * self.base_Generalization.specific.namespace.oclAsType(Package).nestingPackage.packageImport.importedPackage
	 * ->select(p|p.stereotypedBy('ReferenceModel'))->exists(referenceModel|self.base_Generalization.general.getNearestReferenceModel()=referenceModel)
	 * )
	 * or
	 * self.base_Generalization.general.stereotypedBy('ObjectConstraint')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateConstrainsRMElement(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Constrains
