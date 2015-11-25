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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archetype Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#isHas_aom_ids <em>Has aom ids</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#getRm_package <em>Rm package</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeLibrary()
 * @model
 * @generated
 */
public interface ArchetypeLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeLibrary_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Has aom ids</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has aom ids</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has aom ids</em>' attribute.
	 * @see #setHas_aom_ids(boolean)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeLibrary_Has_aom_ids()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isHas_aom_ids();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#isHas_aom_ids <em>Has aom ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has aom ids</em>' attribute.
	 * @see #isHas_aom_ids()
	 * @generated
	 */
	void setHas_aom_ids(boolean value);

	/**
	 * Returns the value of the '<em><b>Rm package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rm package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rm package</em>' attribute.
	 * @see #setRm_package(String)
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getArchetypeLibrary_Rm_package()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRm_package();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#getRm_package <em>Rm package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rm package</em>' attribute.
	 * @see #getRm_package()
	 * @generated
	 */
	void setRm_package(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  self.base_Package.packageImport.importedPackage->select(stereotypedBy('ReferenceModel'))->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneReferenceModel(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Package.packagedElement->forAll(p|p.stereotypedBy('Archetype'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOnlyArchetypes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The [AOM] Invariant is enforced by the UML semantic for a required Property.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_HRID:Invariant:Rm_closure_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEHRIDInvariantRmClosureValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ArchetypeLibrary
