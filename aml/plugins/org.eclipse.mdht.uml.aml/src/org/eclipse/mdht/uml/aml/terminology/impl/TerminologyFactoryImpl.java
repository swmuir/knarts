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
package org.eclipse.mdht.uml.aml.terminology.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.uml.aml.terminology.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyFactoryImpl extends EFactoryImpl implements TerminologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TerminologyFactory init() {
		try {
			TerminologyFactory theTerminologyFactory = (TerminologyFactory)EPackage.Registry.INSTANCE.getEFactory(TerminologyPackage.eNS_URI);
			if (theTerminologyFactory != null) {
				return theTerminologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TerminologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyFactoryImpl() {
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
			case TerminologyPackage.IDENTIFIED_ITEM: return createIdentifiedItem();
			case TerminologyPackage.PERMISSIBLE_VALUE: return createPermissibleValue();
			case TerminologyPackage.SCOPED_IDENTIFIER: return createScopedIdentifier();
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN: return createEnumeratedValueDomain();
			case TerminologyPackage.CODE_SYSTEM_REFERENCE: return createCodeSystemReference();
			case TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE: return createCodeSystemVersionReference();
			case TerminologyPackage.CONCEPT_REFERENCE: return createConceptReference();
			case TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE: return createValueSetDefinitionReference();
			case TerminologyPackage.VALUE_SET_REFERENCE: return createValueSetReference();
			case TerminologyPackage.ARCHETYPE_TERM: return createArchetypeTerm();
			case TerminologyPackage.TERM_RESOURCE_TRANSLATION: return createTermResourceTranslation();
			case TerminologyPackage.ID_ENTRY: return createIdEntry();
			case TerminologyPackage.ENTRY: return createEntry();
			case TerminologyPackage.DESCRIBED_IDENTIFIER: return createDescribedIdentifier();
			case TerminologyPackage.ABOUT: return createabout();
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
			case TerminologyPackage.ARCHETYPE_TYPE:
				return createArchetypeTypeFromString(eDataType, initialValue);
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
			case TerminologyPackage.ARCHETYPE_TYPE:
				return convertArchetypeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiedItem createIdentifiedItem() {
		IdentifiedItemImpl identifiedItem = new IdentifiedItemImpl();
		return identifiedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissibleValue createPermissibleValue() {
		PermissibleValueImpl permissibleValue = new PermissibleValueImpl();
		return permissibleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifier createScopedIdentifier() {
		ScopedIdentifierImpl scopedIdentifier = new ScopedIdentifierImpl();
		return scopedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValueDomain createEnumeratedValueDomain() {
		EnumeratedValueDomainImpl enumeratedValueDomain = new EnumeratedValueDomainImpl();
		return enumeratedValueDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemReference createCodeSystemReference() {
		CodeSystemReferenceImpl codeSystemReference = new CodeSystemReferenceImpl();
		return codeSystemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersionReference createCodeSystemVersionReference() {
		CodeSystemVersionReferenceImpl codeSystemVersionReference = new CodeSystemVersionReferenceImpl();
		return codeSystemVersionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptReference createConceptReference() {
		ConceptReferenceImpl conceptReference = new ConceptReferenceImpl();
		return conceptReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetDefinitionReference createValueSetDefinitionReference() {
		ValueSetDefinitionReferenceImpl valueSetDefinitionReference = new ValueSetDefinitionReferenceImpl();
		return valueSetDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetReference createValueSetReference() {
		ValueSetReferenceImpl valueSetReference = new ValueSetReferenceImpl();
		return valueSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchetypeTerm createArchetypeTerm() {
		ArchetypeTermImpl archetypeTerm = new ArchetypeTermImpl();
		return archetypeTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermResourceTranslation createTermResourceTranslation() {
		TermResourceTranslationImpl termResourceTranslation = new TermResourceTranslationImpl();
		return termResourceTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdEntry createIdEntry() {
		IdEntryImpl idEntry = new IdEntryImpl();
		return idEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribedIdentifier createDescribedIdentifier() {
		DescribedIdentifierImpl describedIdentifier = new DescribedIdentifierImpl();
		return describedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public about createabout() {
		aboutImpl about = new aboutImpl();
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchetypeType createArchetypeTypeFromString(EDataType eDataType, String initialValue) {
		ArchetypeType result = ArchetypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArchetypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackage getTerminologyPackage() {
		return (TerminologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TerminologyPackage getPackage() {
		return TerminologyPackage.eINSTANCE;
	}

} //TerminologyFactoryImpl
