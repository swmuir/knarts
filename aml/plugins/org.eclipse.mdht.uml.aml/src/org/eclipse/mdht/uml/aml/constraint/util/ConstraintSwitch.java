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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.mdht.uml.aml.constraint.*;

import org.eclipse.mdht.uml.aml.terminology.IdentifiedItem;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage
 * @generated
 */
public class ConstraintSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstraintPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSwitch() {
		if (modelPackage == null) {
			modelPackage = ConstraintPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT: {
				ComplexObjectConstraint complexObjectConstraint = (ComplexObjectConstraint)theEObject;
				T result = caseComplexObjectConstraint(complexObjectConstraint);
				if (result == null) result = caseObjectConstraint(complexObjectConstraint);
				if (result == null) result = caseIdentifiedItem(complexObjectConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.OBJECT_CONSTRAINT: {
				ObjectConstraint objectConstraint = (ObjectConstraint)theEObject;
				T result = caseObjectConstraint(objectConstraint);
				if (result == null) result = caseIdentifiedItem(objectConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.CONSTRAINS: {
				Constrains constrains = (Constrains)theEObject;
				T result = caseConstrains(constrains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.ARCHETYPE_LIBRARY: {
				ArchetypeLibrary archetypeLibrary = (ArchetypeLibrary)theEObject;
				T result = caseArchetypeLibrary(archetypeLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.ARCHETYPE: {
				Archetype archetype = (Archetype)theEObject;
				T result = caseArchetype(archetype);
				if (result == null) result = caseAuthoredResource(archetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.AUTHORED_RESOURCE: {
				AuthoredResource authoredResource = (AuthoredResource)theEObject;
				T result = caseAuthoredResource(authoredResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.RESOURCE_TRANSLATION: {
				ResourceTranslation resourceTranslation = (ResourceTranslation)theEObject;
				T result = caseResourceTranslation(resourceTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.ARCHETYPE_DEFINITION: {
				ArchetypeDefinition archetypeDefinition = (ArchetypeDefinition)theEObject;
				T result = caseArchetypeDefinition(archetypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.ARCHETYPE_SLOT: {
				ArchetypeSlot archetypeSlot = (ArchetypeSlot)theEObject;
				T result = caseArchetypeSlot(archetypeSlot);
				if (result == null) result = caseObjectConstraint(archetypeSlot);
				if (result == null) result = caseIdentifiedItem(archetypeSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.ARCHETYPE_ROOT: {
				ArchetypeRoot archetypeRoot = (ArchetypeRoot)theEObject;
				T result = caseArchetypeRoot(archetypeRoot);
				if (result == null) result = caseComplexObjectConstraint(archetypeRoot);
				if (result == null) result = caseObjectConstraint(archetypeRoot);
				if (result == null) result = caseIdentifiedItem(archetypeRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintPackage.RESOURCE_ANNOTATION_NODE_ITEM: {
				ResourceAnnotationNodeItem resourceAnnotationNodeItem = (ResourceAnnotationNodeItem)theEObject;
				T result = caseResourceAnnotationNodeItem(resourceAnnotationNodeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Object Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexObjectConstraint(ComplexObjectConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectConstraint(ObjectConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrains(Constrains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archetype Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archetype Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchetypeLibrary(ArchetypeLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archetype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchetype(Archetype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authored Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authored Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthoredResource(AuthoredResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTranslation(ResourceTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archetype Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archetype Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchetypeDefinition(ArchetypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archetype Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchetypeSlot(ArchetypeSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archetype Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchetypeRoot(ArchetypeRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Annotation Node Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Annotation Node Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAnnotationNodeItem(ResourceAnnotationNodeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedItem(IdentifiedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConstraintSwitch
