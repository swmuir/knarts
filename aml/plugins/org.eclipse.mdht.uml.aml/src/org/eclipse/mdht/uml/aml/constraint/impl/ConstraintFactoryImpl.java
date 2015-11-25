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
package org.eclipse.mdht.uml.aml.constraint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.uml.aml.constraint.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintFactoryImpl extends EFactoryImpl implements ConstraintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintFactory init() {
		try {
			ConstraintFactory theConstraintFactory = (ConstraintFactory)EPackage.Registry.INSTANCE.getEFactory(ConstraintPackage.eNS_URI);
			if (theConstraintFactory != null) {
				return theConstraintFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstraintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT: return createComplexObjectConstraint();
			case ConstraintPackage.OBJECT_CONSTRAINT: return createObjectConstraint();
			case ConstraintPackage.CONSTRAINS: return createConstrains();
			case ConstraintPackage.ARCHETYPE_LIBRARY: return createArchetypeLibrary();
			case ConstraintPackage.ARCHETYPE: return createArchetype();
			case ConstraintPackage.RESOURCE_TRANSLATION: return createResourceTranslation();
			case ConstraintPackage.ARCHETYPE_DEFINITION: return createArchetypeDefinition();
			case ConstraintPackage.ARCHETYPE_SLOT: return createArchetypeSlot();
			case ConstraintPackage.ARCHETYPE_ROOT: return createArchetypeRoot();
			case ConstraintPackage.RESOURCE_ANNOTATION_NODE_ITEM: return createResourceAnnotationNodeItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConstraintPackage.LIFECYCLE_STATE:
				return createLifecycle_stateFromString(eDataType, initialValue);
			case ConstraintPackage.VERSION_STATUS:
				return createVERSION_STATUSFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConstraintPackage.LIFECYCLE_STATE:
				return convertLifecycle_stateToString(eDataType, instanceValue);
			case ConstraintPackage.VERSION_STATUS:
				return convertVERSION_STATUSToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexObjectConstraint createComplexObjectConstraint() {
		ComplexObjectConstraintImpl complexObjectConstraint = new ComplexObjectConstraintImpl();
		return complexObjectConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectConstraint createObjectConstraint() {
		ObjectConstraintImpl objectConstraint = new ObjectConstraintImpl();
		return objectConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constrains createConstrains() {
		ConstrainsImpl constrains = new ConstrainsImpl();
		return constrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchetypeLibrary createArchetypeLibrary() {
		ArchetypeLibraryImpl archetypeLibrary = new ArchetypeLibraryImpl();
		return archetypeLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archetype createArchetype() {
		ArchetypeImpl archetype = new ArchetypeImpl();
		return archetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTranslation createResourceTranslation() {
		ResourceTranslationImpl resourceTranslation = new ResourceTranslationImpl();
		return resourceTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchetypeDefinition createArchetypeDefinition() {
		ArchetypeDefinitionImpl archetypeDefinition = new ArchetypeDefinitionImpl();
		return archetypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchetypeSlot createArchetypeSlot() {
		ArchetypeSlotImpl archetypeSlot = new ArchetypeSlotImpl();
		return archetypeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchetypeRoot createArchetypeRoot() {
		ArchetypeRootImpl archetypeRoot = new ArchetypeRootImpl();
		return archetypeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAnnotationNodeItem createResourceAnnotationNodeItem() {
		ResourceAnnotationNodeItemImpl resourceAnnotationNodeItem = new ResourceAnnotationNodeItemImpl();
		return resourceAnnotationNodeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle_state createLifecycle_stateFromString(EDataType eDataType, String initialValue) {
		Lifecycle_state result = Lifecycle_state.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifecycle_stateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VERSION_STATUS createVERSION_STATUSFromString(EDataType eDataType, String initialValue) {
		VERSION_STATUS result = VERSION_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVERSION_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintPackage getConstraintPackage() {
		return (ConstraintPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstraintPackage getPackage() {
		return ConstraintPackage.eINSTANCE;
	}

} //ConstraintFactoryImpl
