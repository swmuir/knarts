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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.aml.terminology.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage
 * @generated
 */
public class TerminologyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TerminologyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TerminologyPackage.eINSTANCE;
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
	protected TerminologySwitch<Adapter> modelSwitch =
		new TerminologySwitch<Adapter>() {
			@Override
			public Adapter caseIdentifiedItem(IdentifiedItem object) {
				return createIdentifiedItemAdapter();
			}
			@Override
			public Adapter casePermissibleValue(PermissibleValue object) {
				return createPermissibleValueAdapter();
			}
			@Override
			public Adapter caseScopedIdentifier(ScopedIdentifier object) {
				return createScopedIdentifierAdapter();
			}
			@Override
			public Adapter caseEnumeratedValueDomain(EnumeratedValueDomain object) {
				return createEnumeratedValueDomainAdapter();
			}
			@Override
			public Adapter caseResourceReference(ResourceReference object) {
				return createResourceReferenceAdapter();
			}
			@Override
			public Adapter caseCodeSystemReference(CodeSystemReference object) {
				return createCodeSystemReferenceAdapter();
			}
			@Override
			public Adapter caseCodeSystemVersionReference(CodeSystemVersionReference object) {
				return createCodeSystemVersionReferenceAdapter();
			}
			@Override
			public Adapter caseConceptReference(ConceptReference object) {
				return createConceptReferenceAdapter();
			}
			@Override
			public Adapter caseValueSetDefinitionReference(ValueSetDefinitionReference object) {
				return createValueSetDefinitionReferenceAdapter();
			}
			@Override
			public Adapter caseValueSetReference(ValueSetReference object) {
				return createValueSetReferenceAdapter();
			}
			@Override
			public Adapter caseArchetypeTerm(ArchetypeTerm object) {
				return createArchetypeTermAdapter();
			}
			@Override
			public Adapter caseTermResourceTranslation(TermResourceTranslation object) {
				return createTermResourceTranslationAdapter();
			}
			@Override
			public Adapter caseIdEntry(IdEntry object) {
				return createIdEntryAdapter();
			}
			@Override
			public Adapter caseEntry(Entry object) {
				return createEntryAdapter();
			}
			@Override
			public Adapter caseDescribedIdentifier(DescribedIdentifier object) {
				return createDescribedIdentifierAdapter();
			}
			@Override
			public Adapter caseabout(about object) {
				return createaboutAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue <em>Permissible Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.PermissibleValue
	 * @generated
	 */
	public Adapter createPermissibleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier <em>Scoped Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier
	 * @generated
	 */
	public Adapter createScopedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain <em>Enumerated Value Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain
	 * @generated
	 */
	public Adapter createEnumeratedValueDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.ResourceReference <em>Resource Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.ResourceReference
	 * @generated
	 */
	public Adapter createResourceReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.CodeSystemReference <em>Code System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.CodeSystemReference
	 * @generated
	 */
	public Adapter createCodeSystemReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference <em>Code System Version Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference
	 * @generated
	 */
	public Adapter createCodeSystemVersionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.ConceptReference <em>Concept Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.ConceptReference
	 * @generated
	 */
	public Adapter createConceptReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference <em>Value Set Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference
	 * @generated
	 */
	public Adapter createValueSetDefinitionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.ValueSetReference <em>Value Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.ValueSetReference
	 * @generated
	 */
	public Adapter createValueSetReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm <em>Archetype Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm
	 * @generated
	 */
	public Adapter createArchetypeTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation <em>Term Resource Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation
	 * @generated
	 */
	public Adapter createTermResourceTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.IdEntry <em>Id Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdEntry
	 * @generated
	 */
	public Adapter createIdEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier <em>Described Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier
	 * @generated
	 */
	public Adapter createDescribedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.aml.terminology.about <em>about</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.aml.terminology.about
	 * @generated
	 */
	public Adapter createaboutAdapter() {
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

} //TerminologyAdapterFactory
