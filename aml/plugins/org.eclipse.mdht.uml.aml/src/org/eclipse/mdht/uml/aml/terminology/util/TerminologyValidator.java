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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.terminology.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage
 * @generated
 */
public class TerminologyValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TerminologyValidator INSTANCE = new TerminologyValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.mdht.uml.aml.terminology";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Scopes' of 'Identified Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IDENTIFIED_ITEM__UNIQUE_SCOPES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Must Be Concept Reference' of 'Permissible Value'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERMISSIBLE_VALUE__MUST_BE_CONCEPT_REFERENCE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Permissible Values' of 'Enumerated Value Domain'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUMERATED_VALUE_DOMAIN__PERMISSIBLE_VALUES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Binding Is Value Set Or Definition' of 'Enumerated Value Domain'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUMERATED_VALUE_DOMAIN__BINDING_IS_VALUE_SET_OR_DEFINITION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Must Be Scoped Identifier' of 'Concept Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCEPT_REFERENCE__MUST_BE_SCOPED_IDENTIFIER = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Definition' of 'Value Set Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_SET_REFERENCE__DEFINITION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVTL Clanguageconsistency' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVTL_CLANGUAGECONSISTENCY = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVTVSI Dvaluesetiddefined' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVTVSI_DVALUESETIDDEFINED = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVTVSU Qvaluesetmembersunique' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVTVSU_QVALUESETMEMBERSUNIQUE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVTVSM Dvaluesetmembersdefined' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVTVSM_DVALUESETMEMBERSDEFINED = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPETERM Invariantcode Valid Code' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMARCHETYPETERM_INVARIANTCODE_VALID_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVALUESET Invariant Id Valid' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVALUESET_INVARIANT_ID_VALID = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVALUESET Invariant Members Valid' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVALUESET_INVARIANT_MEMBERS_VALID = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPETERMINOLOGY Invariantterm Bindings Validity' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMARCHETYPETERMINOLOGY_INVARIANTTERM_BINDINGS_VALIDITY = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVETD Fexternaltermvalidity' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVETD_FEXTERNALTERMVALIDITY = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVTCB Kterminologyconstraintbindingkeyvalid' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVTCB_KTERMINOLOGYCONSTRAINTBINDINGKEYVALID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVTS Dspecialisationlevelofcodes' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVTS_DSPECIALISATIONLEVELOFCODES = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVTTB Kterminologytermbindingkeyvalid' of 'Archetype Term'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_TERM__AOMVTTB_KTERMINOLOGYTERMBINDINGKEYVALID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Translation Entries' of 'Term Resource Translation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERM_RESOURCE_TRANSLATION__TRANSLATION_ENTRIES = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPETERM Invariantdescription Valid' of 'Id Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ID_ENTRY__AOMARCHETYPETERM_INVARIANTDESCRIPTION_VALID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPETERM Invarianttext Valid' of 'Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRY__AOMARCHETYPETERM_INVARIANTTEXT_VALID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Members Must Be Concept Reference' of 'Described Identifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESCRIBED_IDENTIFIER__MEMBERS_MUST_BE_CONCEPT_REFERENCE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Defining Code System' of 'Described Identifier'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Is Concept Reference' of 'about'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABOUT__IS_CONCEPT_REFERENCE = 24;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 24;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TerminologyPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TerminologyPackage.IDENTIFIED_ITEM:
				return validateIdentifiedItem((IdentifiedItem)value, diagnostics, context);
			case TerminologyPackage.PERMISSIBLE_VALUE:
				return validatePermissibleValue((PermissibleValue)value, diagnostics, context);
			case TerminologyPackage.SCOPED_IDENTIFIER:
				return validateScopedIdentifier((ScopedIdentifier)value, diagnostics, context);
			case TerminologyPackage.ENUMERATED_VALUE_DOMAIN:
				return validateEnumeratedValueDomain((EnumeratedValueDomain)value, diagnostics, context);
			case TerminologyPackage.RESOURCE_REFERENCE:
				return validateResourceReference((ResourceReference)value, diagnostics, context);
			case TerminologyPackage.CODE_SYSTEM_REFERENCE:
				return validateCodeSystemReference((CodeSystemReference)value, diagnostics, context);
			case TerminologyPackage.CODE_SYSTEM_VERSION_REFERENCE:
				return validateCodeSystemVersionReference((CodeSystemVersionReference)value, diagnostics, context);
			case TerminologyPackage.CONCEPT_REFERENCE:
				return validateConceptReference((ConceptReference)value, diagnostics, context);
			case TerminologyPackage.VALUE_SET_DEFINITION_REFERENCE:
				return validateValueSetDefinitionReference((ValueSetDefinitionReference)value, diagnostics, context);
			case TerminologyPackage.VALUE_SET_REFERENCE:
				return validateValueSetReference((ValueSetReference)value, diagnostics, context);
			case TerminologyPackage.ARCHETYPE_TERM:
				return validateArchetypeTerm((ArchetypeTerm)value, diagnostics, context);
			case TerminologyPackage.TERM_RESOURCE_TRANSLATION:
				return validateTermResourceTranslation((TermResourceTranslation)value, diagnostics, context);
			case TerminologyPackage.ID_ENTRY:
				return validateIdEntry((IdEntry)value, diagnostics, context);
			case TerminologyPackage.ENTRY:
				return validateEntry((Entry)value, diagnostics, context);
			case TerminologyPackage.DESCRIBED_IDENTIFIER:
				return validateDescribedIdentifier((DescribedIdentifier)value, diagnostics, context);
			case TerminologyPackage.ABOUT:
				return validateabout((about)value, diagnostics, context);
			case TerminologyPackage.ARCHETYPE_TYPE:
				return validateArchetypeType((ArchetypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiedItem(IdentifiedItem identifiedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(identifiedItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(identifiedItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(identifiedItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(identifiedItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(identifiedItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(identifiedItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(identifiedItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(identifiedItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(identifiedItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifiedItem_validateUniqueScopes(identifiedItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateUniqueScopes constraint of '<em>Identified Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiedItem_validateUniqueScopes(IdentifiedItem identifiedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return identifiedItem.validateUniqueScopes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissibleValue(PermissibleValue permissibleValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(permissibleValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifiedItem_validateUniqueScopes(permissibleValue, diagnostics, context);
		if (result || diagnostics != null) result &= validatePermissibleValue_validateMustBeConceptReference(permissibleValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMustBeConceptReference constraint of '<em>Permissible Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissibleValue_validateMustBeConceptReference(PermissibleValue permissibleValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return permissibleValue.validateMustBeConceptReference(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopedIdentifier(ScopedIdentifier scopedIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scopedIdentifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedValueDomain(EnumeratedValueDomain enumeratedValueDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumeratedValueDomain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifiedItem_validateUniqueScopes(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumeratedValueDomain_validatePermissibleValues(enumeratedValueDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumeratedValueDomain_validateBindingIsValueSetOrDefinition(enumeratedValueDomain, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePermissibleValues constraint of '<em>Enumerated Value Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedValueDomain_validatePermissibleValues(EnumeratedValueDomain enumeratedValueDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enumeratedValueDomain.validatePermissibleValues(diagnostics, context);
	}

	/**
	 * Validates the validateBindingIsValueSetOrDefinition constraint of '<em>Enumerated Value Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeratedValueDomain_validateBindingIsValueSetOrDefinition(EnumeratedValueDomain enumeratedValueDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enumeratedValueDomain.validateBindingIsValueSetOrDefinition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceReference(ResourceReference resourceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemReference(CodeSystemReference codeSystemReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemVersionReference(CodeSystemVersionReference codeSystemVersionReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemVersionReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptReference(ConceptReference conceptReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conceptReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conceptReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conceptReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conceptReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conceptReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conceptReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conceptReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conceptReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conceptReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateConceptReference_validateMustBeScopedIdentifier(conceptReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMustBeScopedIdentifier constraint of '<em>Concept Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptReference_validateMustBeScopedIdentifier(ConceptReference conceptReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conceptReference.validateMustBeScopedIdentifier(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetDefinitionReference(ValueSetDefinitionReference valueSetDefinitionReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetDefinitionReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetReference(ValueSetReference valueSetReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueSetReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueSetReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueSetReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueSetReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueSetReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueSetReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueSetReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueSetReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueSetReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueSetReference_validateDefinition(valueSetReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDefinition constraint of '<em>Value Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetReference_validateDefinition(ValueSetReference valueSetReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valueSetReference.validateDefinition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(archetypeTerm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentifiedItem_validateUniqueScopes(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validatePermissibleValue_validateMustBeConceptReference(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVTLClanguageconsistency(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVTVSIDvaluesetiddefined(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVTVSUQvaluesetmembersunique(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVTVSMDvaluesetmembersdefined(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMARCHETYPETERMInvariantcodeValidCode(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVALUESETInvariantIdValid(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVALUESETInvariantMembersValid(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVETDFexternaltermvalidity(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVTCBKterminologyconstraintbindingkeyvalid(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVTSDspecialisationlevelofcodes(archetypeTerm, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeTerm_validateAOMVTTBKterminologytermbindingkeyvalid(archetypeTerm, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMVTLClanguageconsistency constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVTLClanguageconsistency(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVTLClanguageconsistency(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVTVSIDvaluesetiddefined constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVTVSIDvaluesetiddefined(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVTVSIDvaluesetiddefined(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVTVSUQvaluesetmembersunique constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVTVSUQvaluesetmembersunique(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVTVSUQvaluesetmembersunique(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVTVSMDvaluesetmembersdefined constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVTVSMDvaluesetmembersdefined(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVTVSMDvaluesetmembersdefined(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPETERMInvariantcodeValidCode constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMARCHETYPETERMInvariantcodeValidCode(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMARCHETYPETERMInvariantcodeValidCode(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVALUESETInvariantIdValid constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVALUESETInvariantIdValid(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVALUESETInvariantIdValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVALUESETInvariantMembersValid constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVALUESETInvariantMembersValid(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVALUESETInvariantMembersValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVETDFexternaltermvalidity constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVETDFexternaltermvalidity(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVETDFexternaltermvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVTCBKterminologyconstraintbindingkeyvalid constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVTCBKterminologyconstraintbindingkeyvalid(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVTCBKterminologyconstraintbindingkeyvalid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVTSDspecialisationlevelofcodes constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVTSDspecialisationlevelofcodes(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVTSDspecialisationlevelofcodes(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVTTBKterminologytermbindingkeyvalid constraint of '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeTerm_validateAOMVTTBKterminologytermbindingkeyvalid(ArchetypeTerm archetypeTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeTerm.validateAOMVTTBKterminologytermbindingkeyvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermResourceTranslation(TermResourceTranslation termResourceTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(termResourceTranslation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(termResourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(termResourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(termResourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(termResourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(termResourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(termResourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(termResourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(termResourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTermResourceTranslation_validateTranslationEntries(termResourceTranslation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTranslationEntries constraint of '<em>Term Resource Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermResourceTranslation_validateTranslationEntries(TermResourceTranslation termResourceTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return termResourceTranslation.validateTranslationEntries(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdEntry(IdEntry idEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(idEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntry_validateAOMARCHETYPETERMInvarianttextValid(idEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdEntry_validateAOMARCHETYPETERMInvariantdescriptionValid(idEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMARCHETYPETERMInvariantdescriptionValid constraint of '<em>Id Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdEntry_validateAOMARCHETYPETERMInvariantdescriptionValid(IdEntry idEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return idEntry.validateAOMARCHETYPETERMInvariantdescriptionValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntry(Entry entry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntry_validateAOMARCHETYPETERMInvarianttextValid(entry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMARCHETYPETERMInvarianttextValid constraint of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntry_validateAOMARCHETYPETERMInvarianttextValid(Entry entry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entry.validateAOMARCHETYPETERMInvarianttextValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribedIdentifier(DescribedIdentifier describedIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(describedIdentifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescribedIdentifier_validateMembersMustBeConceptReference(describedIdentifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateDescribedIdentifier_validateDefiningCodeSystem(describedIdentifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMembersMustBeConceptReference constraint of '<em>Described Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribedIdentifier_validateMembersMustBeConceptReference(DescribedIdentifier describedIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return describedIdentifier.validateMembersMustBeConceptReference(diagnostics, context);
	}

	/**
	 * Validates the validateDefiningCodeSystem constraint of '<em>Described Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribedIdentifier_validateDefiningCodeSystem(DescribedIdentifier describedIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return describedIdentifier.validateDefiningCodeSystem(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateabout(about about, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(about, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(about, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(about, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(about, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(about, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(about, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(about, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(about, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(about, diagnostics, context);
		if (result || diagnostics != null) result &= validateabout_validateIsConceptReference(about, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIsConceptReference constraint of '<em>about</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateabout_validateIsConceptReference(about about, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return about.validateIsConceptReference(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeType(ArchetypeType archetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TerminologyValidator
