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
package org.eclipse.mdht.uml.aml.terminology.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.mdht.uml.aml.terminology.*;

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
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage
 * @generated
 */
public class TerminologySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TerminologyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologySwitch() {
		if (modelPackage == null) {
			modelPackage = TerminologyPackage.eINSTANCE;
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
			case TerminologyPackage.IDENTIFIED_ITEM: {
				IdentifiedItem identifiedItem = (IdentifiedItem)theEObject;
				T result = caseIdentifiedItem(identifiedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.PERMISSIBLE_VALUE: {
				PermissibleValue permissibleValue = (PermissibleValue)theEObject;
				T result = casePermissibleValue(permissibleValue);
				if (result == null) result = caseIdentifiedItem(permissibleValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.SCOPED_IDENTIFIER: {
				ScopedIdentifier scopedIdentifier = (ScopedIdentifier)theEObject;
				T result = caseScopedIdentifier(scopedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN: {
				EnumeratedValueDomain enumeratedValueDomain = (EnumeratedValueDomain)theEObject;
				T result = caseEnumeratedValueDomain(enumeratedValueDomain);
				if (result == null) result = caseIdentifiedItem(enumeratedValueDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.RESOURCE_REFERENCE: {
				ResourceReference resourceReference = (ResourceReference)theEObject;
				T result = caseResourceReference(resourceReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.CODE_SYSTEM_REFERENCE: {
				CodeSystemReference codeSystemReference = (CodeSystemReference)theEObject;
				T result = caseCodeSystemReference(codeSystemReference);
				if (result == null) result = caseResourceReference(codeSystemReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE: {
				CodeSystemVersionReference codeSystemVersionReference = (CodeSystemVersionReference)theEObject;
				T result = caseCodeSystemVersionReference(codeSystemVersionReference);
				if (result == null) result = caseResourceReference(codeSystemVersionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.CONCEPT_REFERENCE: {
				ConceptReference conceptReference = (ConceptReference)theEObject;
				T result = caseConceptReference(conceptReference);
				if (result == null) result = caseResourceReference(conceptReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE: {
				ValueSetDefinitionReference valueSetDefinitionReference = (ValueSetDefinitionReference)theEObject;
				T result = caseValueSetDefinitionReference(valueSetDefinitionReference);
				if (result == null) result = caseResourceReference(valueSetDefinitionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.VALUE_SET_REFERENCE: {
				ValueSetReference valueSetReference = (ValueSetReference)theEObject;
				T result = caseValueSetReference(valueSetReference);
				if (result == null) result = caseResourceReference(valueSetReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.ARCHETYPE_TERM: {
				ArchetypeTerm archetypeTerm = (ArchetypeTerm)theEObject;
				T result = caseArchetypeTerm(archetypeTerm);
				if (result == null) result = casePermissibleValue(archetypeTerm);
				if (result == null) result = caseIdentifiedItem(archetypeTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.TERM_RESOURCE_TRANSLATION: {
				TermResourceTranslation termResourceTranslation = (TermResourceTranslation)theEObject;
				T result = caseTermResourceTranslation(termResourceTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.ID_ENTRY: {
				IdEntry idEntry = (IdEntry)theEObject;
				T result = caseIdEntry(idEntry);
				if (result == null) result = caseEntry(idEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.ENTRY: {
				Entry entry = (Entry)theEObject;
				T result = caseEntry(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.DESCRIBED_IDENTIFIER: {
				DescribedIdentifier describedIdentifier = (DescribedIdentifier)theEObject;
				T result = caseDescribedIdentifier(describedIdentifier);
				if (result == null) result = caseScopedIdentifier(describedIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.ABOUT: {
				about about = (about)theEObject;
				T result = caseabout(about);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Permissible Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permissible Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissibleValue(PermissibleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedIdentifier(ScopedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Value Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Value Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedValueDomain(EnumeratedValueDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceReference(ResourceReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemReference(CodeSystemReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionReference(CodeSystemVersionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptReference(ConceptReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Definition Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDefinitionReference(ValueSetDefinitionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetReference(ValueSetReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archetype Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchetypeTerm(ArchetypeTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Resource Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Resource Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermResourceTranslation(TermResourceTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdEntry(IdEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedIdentifier(DescribedIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>about</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>about</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseabout(about object) {
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

} //TerminologySwitch
