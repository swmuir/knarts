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
package org.eclipse.mdht.uml.aml.constraint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.aml.constraint.*;

import org.eclipse.mdht.uml.aml.terminology.IdentifiedItem;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage
 * @generated
 */
public class ConstraintAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstraintPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConstraintPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintSwitch<Adapter> modelSwitch =
		new ConstraintSwitch<Adapter>() {
			@Override
			public Adapter caseComplexObjectConstraint(ComplexObjectConstraint object) {
				return createComplexObjectConstraintAdapter();
			}
			@Override
			public Adapter caseObjectConstraint(ObjectConstraint object) {
				return createObjectConstraintAdapter();
			}
			@Override
			public Adapter caseConstrains(Constrains object) {
				return createConstrainsAdapter();
			}
			@Override
			public Adapter caseArchetypeLibrary(ArchetypeLibrary object) {
				return createArchetypeLibraryAdapter();
			}
			@Override
			public Adapter caseArchetype(Archetype object) {
				return createArchetypeAdapter();
			}
			@Override
			public Adapter caseAuthoredResource(AuthoredResource object) {
				return createAuthoredResourceAdapter();
			}
			@Override
			public Adapter caseResourceTranslation(ResourceTranslation object) {
				return createResourceTranslationAdapter();
			}
			@Override
			public Adapter caseArchetypeDefinition(ArchetypeDefinition object) {
				return createArchetypeDefinitionAdapter();
			}
			@Override
			public Adapter caseArchetypeSlot(ArchetypeSlot object) {
				return createArchetypeSlotAdapter();
			}
			@Override
			public Adapter caseArchetypeRoot(ArchetypeRoot object) {
				return createArchetypeRootAdapter();
			}
			@Override
			public Adapter caseResourceAnnotationNodeItem(ResourceAnnotationNodeItem object) {
				return createResourceAnnotationNodeItemAdapter();
			}
			@Override
			public Adapter caseIdentifiedItem(IdentifiedItem object) {
				return createIdentifiedItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint <em>Complex Object Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint
	 * @generated
	 */
	public Adapter createComplexObjectConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint <em>Object Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint
	 * @generated
	 */
	public Adapter createObjectConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.Constrains <em>Constrains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.Constrains
	 * @generated
	 */
	public Adapter createConstrainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary <em>Archetype Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary
	 * @generated
	 */
	public Adapter createArchetypeLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.Archetype <em>Archetype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype
	 * @generated
	 */
	public Adapter createArchetypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource <em>Authored Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource
	 * @generated
	 */
	public Adapter createAuthoredResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation <em>Resource Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation
	 * @generated
	 */
	public Adapter createResourceTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition <em>Archetype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition
	 * @generated
	 */
	public Adapter createArchetypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot <em>Archetype Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot
	 * @generated
	 */
	public Adapter createArchetypeSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot <em>Archetype Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot
	 * @generated
	 */
	public Adapter createArchetypeRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem <em>Resource Annotation Node Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem
	 * @generated
	 */
	public Adapter createResourceAnnotationNodeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.IdentifiedItem <em>Identified Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdentifiedItem
	 * @generated
	 */
	public Adapter createIdentifiedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConstraintAdapterFactory
