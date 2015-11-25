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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage
 * @generated
 */
public interface ConstraintFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintFactory eINSTANCE = org.eclipse.mdht.uml.aml.constraint.impl.ConstraintFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Object Constraint</em>'.
	 * @generated
	 */
	ComplexObjectConstraint createComplexObjectConstraint();

	/**
	 * Returns a new object of class '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Constraint</em>'.
	 * @generated
	 */
	ObjectConstraint createObjectConstraint();

	/**
	 * Returns a new object of class '<em>Constrains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constrains</em>'.
	 * @generated
	 */
	Constrains createConstrains();

	/**
	 * Returns a new object of class '<em>Archetype Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype Library</em>'.
	 * @generated
	 */
	ArchetypeLibrary createArchetypeLibrary();

	/**
	 * Returns a new object of class '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype</em>'.
	 * @generated
	 */
	Archetype createArchetype();

	/**
	 * Returns a new object of class '<em>Resource Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Translation</em>'.
	 * @generated
	 */
	ResourceTranslation createResourceTranslation();

	/**
	 * Returns a new object of class '<em>Archetype Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype Definition</em>'.
	 * @generated
	 */
	ArchetypeDefinition createArchetypeDefinition();

	/**
	 * Returns a new object of class '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype Slot</em>'.
	 * @generated
	 */
	ArchetypeSlot createArchetypeSlot();

	/**
	 * Returns a new object of class '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype Root</em>'.
	 * @generated
	 */
	ArchetypeRoot createArchetypeRoot();

	/**
	 * Returns a new object of class '<em>Resource Annotation Node Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Annotation Node Item</em>'.
	 * @generated
	 */
	ResourceAnnotationNodeItem createResourceAnnotationNodeItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstraintPackage getConstraintPackage();

} //ConstraintFactory
