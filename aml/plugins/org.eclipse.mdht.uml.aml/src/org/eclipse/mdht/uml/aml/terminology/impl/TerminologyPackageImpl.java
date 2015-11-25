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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm;
import org.eclipse.mdht.uml.aml.terminology.ArchetypeType;
import org.eclipse.mdht.uml.aml.terminology.CodeSystemReference;
import org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference;
import org.eclipse.mdht.uml.aml.terminology.ConceptReference;
import org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier;
import org.eclipse.mdht.uml.aml.terminology.Entry;
import org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain;
import org.eclipse.mdht.uml.aml.terminology.IdEntry;
import org.eclipse.mdht.uml.aml.terminology.IdentifiedItem;
import org.eclipse.mdht.uml.aml.terminology.PermissibleValue;
import org.eclipse.mdht.uml.aml.terminology.ResourceReference;
import org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier;
import org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation;
import org.eclipse.mdht.uml.aml.terminology.TerminologyFactory;
import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;
import org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference;
import org.eclipse.mdht.uml.aml.terminology.ValueSetReference;
import org.eclipse.mdht.uml.aml.terminology.about;

import org.eclipse.mdht.uml.aml.terminology.util.TerminologyValidator;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyPackageImpl extends EPackageImpl implements TerminologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissibleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedValueDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemVersionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetDefinitionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archetypeTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termResourceTranslationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aboutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum archetypeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TerminologyPackageImpl() {
		super(eNS_URI, TerminologyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TerminologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TerminologyPackage init() {
		if (isInited) return (TerminologyPackage)EPackage.Registry.INSTANCE.getEPackage(TerminologyPackage.eNS_URI);

		// Obtain or create and register package
		TerminologyPackageImpl theTerminologyPackage = (TerminologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TerminologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TerminologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTerminologyPackage.createPackageContents();

		// Initialize created meta-data
		theTerminologyPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTerminologyPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TerminologyValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTerminologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TerminologyPackage.eNS_URI, theTerminologyPackage);
		return theTerminologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedItem() {
		return identifiedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiedItem_Base_NamedElement() {
		return (EReference)identifiedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiedItem_Id() {
		return (EReference)identifiedItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdentifiedItem__ValidateUniqueScopes__DiagnosticChain_Map() {
		return identifiedItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermissibleValue() {
		return permissibleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermissibleValue_Base_EnumerationLiteral() {
		return (EReference)permissibleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermissibleValue_Meaning() {
		return (EReference)permissibleValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPermissibleValue__ValidateMustBeConceptReference__DiagnosticChain_Map() {
		return permissibleValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopedIdentifier() {
		return scopedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopedIdentifier_Uri() {
		return (EAttribute)scopedIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopedIdentifier_IdentifierURIPattern() {
		return (EAttribute)scopedIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopedIdentifier_Base_Enumeration() {
		return (EReference)scopedIdentifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedValueDomain() {
		return enumeratedValueDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedValueDomain_Base_Enumeration() {
		return (EReference)enumeratedValueDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedValueDomain_ValueSetBinding() {
		return (EReference)enumeratedValueDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeratedValueDomain__ValidatePermissibleValues__DiagnosticChain_Map() {
		return enumeratedValueDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumeratedValueDomain__ValidateBindingIsValueSetOrDefinition__DiagnosticChain_Map() {
		return enumeratedValueDomainEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceReference() {
		return resourceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceReference_Uri() {
		return (EAttribute)resourceReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceReference_Base_EnumerationLiteral() {
		return (EReference)resourceReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemReference() {
		return codeSystemReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemVersionReference() {
		return codeSystemVersionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersionReference_CodeSystem() {
		return (EReference)codeSystemVersionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptReference() {
		return conceptReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptReference_Designation() {
		return (EAttribute)conceptReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptReference__ValidateMustBeScopedIdentifier__DiagnosticChain_Map() {
		return conceptReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetDefinitionReference() {
		return valueSetDefinitionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDefinitionReference_ValueSet() {
		return (EReference)valueSetDefinitionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetReference() {
		return valueSetReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetReference_ValueSetDefinition() {
		return (EReference)valueSetReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSetReference__ValidateDefinition__DiagnosticChain_Map() {
		return valueSetReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchetypeTerm() {
		return archetypeTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchetypeTerm_Value_set_members() {
		return (EReference)archetypeTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchetypeTerm_Term_bindings() {
		return (EReference)archetypeTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVTLClanguageconsistency__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVTVSIDvaluesetiddefined__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVTVSUQvaluesetmembersunique__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVTVSMDvaluesetmembersdefined__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMARCHETYPETERMInvariantcodeValidCode__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVALUESETInvariantIdValid__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVALUESETInvariantMembersValid__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVETDFexternaltermvalidity__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVTCBKterminologyconstraintbindingkeyvalid__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVTSDspecialisationlevelofcodes__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeTerm__ValidateAOMVTTBKterminologytermbindingkeyvalid__DiagnosticChain_Map() {
		return archetypeTermEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermResourceTranslation() {
		return termResourceTranslationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermResourceTranslation_Base_Enumeration() {
		return (EReference)termResourceTranslationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermResourceTranslation_Language() {
		return (EReference)termResourceTranslationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTermResourceTranslation__ValidateTranslationEntries__DiagnosticChain_Map() {
		return termResourceTranslationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdEntry() {
		return idEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdEntry_Ref() {
		return (EReference)idEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdEntry_Base_EnumerationLiteral() {
		return (EReference)idEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdEntry__ValidateAOMARCHETYPETERMInvariantdescriptionValid__DiagnosticChain_Map() {
		return idEntryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Text() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_Base_NamedElement() {
		return (EReference)entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntry__ValidateAOMARCHETYPETERMInvarianttextValid__DiagnosticChain_Map() {
		return entryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribedIdentifier() {
		return describedIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescribedIdentifier_DefiningCodeSystem() {
		return (EReference)describedIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescribedIdentifier__ValidateMembersMustBeConceptReference__DiagnosticChain_Map() {
		return describedIdentifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescribedIdentifier__ValidateDefiningCodeSystem__DiagnosticChain_Map() {
		return describedIdentifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getabout() {
		return aboutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getabout_Base_Abstraction() {
		return (EReference)aboutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getabout__ValidateIsConceptReference__DiagnosticChain_Map() {
		return aboutEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArchetypeType() {
		return archetypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyFactory getTerminologyFactory() {
		return (TerminologyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiedItemEClass = createEClass(IDENTIFIED_ITEM);
		createEReference(identifiedItemEClass, IDENTIFIED_ITEM__BASE_NAMED_ELEMENT);
		createEReference(identifiedItemEClass, IDENTIFIED_ITEM__ID);
		createEOperation(identifiedItemEClass, IDENTIFIED_ITEM___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP);

		permissibleValueEClass = createEClass(PERMISSIBLE_VALUE);
		createEReference(permissibleValueEClass, PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL);
		createEReference(permissibleValueEClass, PERMISSIBLE_VALUE__MEANING);
		createEOperation(permissibleValueEClass, PERMISSIBLE_VALUE___VALIDATE_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP);

		scopedIdentifierEClass = createEClass(SCOPED_IDENTIFIER);
		createEAttribute(scopedIdentifierEClass, SCOPED_IDENTIFIER__URI);
		createEAttribute(scopedIdentifierEClass, SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN);
		createEReference(scopedIdentifierEClass, SCOPED_IDENTIFIER__BASE_ENUMERATION);

		enumeratedValueDomainEClass = createEClass(ENUMERATED_VALUE_DOMAIN);
		createEReference(enumeratedValueDomainEClass, ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION);
		createEReference(enumeratedValueDomainEClass, ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING);
		createEOperation(enumeratedValueDomainEClass, ENUMERATED_VALUE_DOMAIN___VALIDATE_PERMISSIBLE_VALUES__DIAGNOSTICCHAIN_MAP);
		createEOperation(enumeratedValueDomainEClass, ENUMERATED_VALUE_DOMAIN___VALIDATE_BINDING_IS_VALUE_SET_OR_DEFINITION__DIAGNOSTICCHAIN_MAP);

		resourceReferenceEClass = createEClass(RESOURCE_REFERENCE);
		createEAttribute(resourceReferenceEClass, RESOURCE_REFERENCE__URI);
		createEReference(resourceReferenceEClass, RESOURCE_REFERENCE__BASE_ENUMERATION_LITERAL);

		codeSystemReferenceEClass = createEClass(CODE_SYSTEM_REFERENCE);

		codeSystemVersionReferenceEClass = createEClass(CODE_SYSTEM_VERSION_REFERENCE);
		createEReference(codeSystemVersionReferenceEClass, CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM);

		conceptReferenceEClass = createEClass(CONCEPT_REFERENCE);
		createEAttribute(conceptReferenceEClass, CONCEPT_REFERENCE__DESIGNATION);
		createEOperation(conceptReferenceEClass, CONCEPT_REFERENCE___VALIDATE_MUST_BE_SCOPED_IDENTIFIER__DIAGNOSTICCHAIN_MAP);

		valueSetDefinitionReferenceEClass = createEClass(VALUE_SET_DEFINITION_REFERENCE);
		createEReference(valueSetDefinitionReferenceEClass, VALUE_SET_DEFINITION_REFERENCE__VALUE_SET);

		valueSetReferenceEClass = createEClass(VALUE_SET_REFERENCE);
		createEReference(valueSetReferenceEClass, VALUE_SET_REFERENCE__VALUE_SET_DEFINITION);
		createEOperation(valueSetReferenceEClass, VALUE_SET_REFERENCE___VALIDATE_DEFINITION__DIAGNOSTICCHAIN_MAP);

		archetypeTermEClass = createEClass(ARCHETYPE_TERM);
		createEReference(archetypeTermEClass, ARCHETYPE_TERM__VALUE_SET_MEMBERS);
		createEReference(archetypeTermEClass, ARCHETYPE_TERM__TERM_BINDINGS);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVTL_CLANGUAGECONSISTENCY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVTVSI_DVALUESETIDDEFINED__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVTVSU_QVALUESETMEMBERSUNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVTVSM_DVALUESETMEMBERSDEFINED__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMARCHETYPETERM_INVARIANTCODE_VALID_CODE__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVALUESET_INVARIANT_ID_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVALUESET_INVARIANT_MEMBERS_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTTERM_BINDINGS_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVETD_FEXTERNALTERMVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVTCB_KTERMINOLOGYCONSTRAINTBINDINGKEYVALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVTS_DSPECIALISATIONLEVELOFCODES__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeTermEClass, ARCHETYPE_TERM___VALIDATE_AOMVTTB_KTERMINOLOGYTERMBINDINGKEYVALID__DIAGNOSTICCHAIN_MAP);

		termResourceTranslationEClass = createEClass(TERM_RESOURCE_TRANSLATION);
		createEReference(termResourceTranslationEClass, TERM_RESOURCE_TRANSLATION__BASE_ENUMERATION);
		createEReference(termResourceTranslationEClass, TERM_RESOURCE_TRANSLATION__LANGUAGE);
		createEOperation(termResourceTranslationEClass, TERM_RESOURCE_TRANSLATION___VALIDATE_TRANSLATION_ENTRIES__DIAGNOSTICCHAIN_MAP);

		idEntryEClass = createEClass(ID_ENTRY);
		createEReference(idEntryEClass, ID_ENTRY__REF);
		createEReference(idEntryEClass, ID_ENTRY__BASE_ENUMERATION_LITERAL);
		createEOperation(idEntryEClass, ID_ENTRY___VALIDATE_AOMARCHETYPETERM_INVARIANTDESCRIPTION_VALID__DIAGNOSTICCHAIN_MAP);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__TEXT);
		createEReference(entryEClass, ENTRY__BASE_NAMED_ELEMENT);
		createEOperation(entryEClass, ENTRY___VALIDATE_AOMARCHETYPETERM_INVARIANTTEXT_VALID__DIAGNOSTICCHAIN_MAP);

		describedIdentifierEClass = createEClass(DESCRIBED_IDENTIFIER);
		createEReference(describedIdentifierEClass, DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM);
		createEOperation(describedIdentifierEClass, DESCRIBED_IDENTIFIER___VALIDATE_MEMBERS_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(describedIdentifierEClass, DESCRIBED_IDENTIFIER___VALIDATE_DEFINING_CODE_SYSTEM__DIAGNOSTICCHAIN_MAP);

		aboutEClass = createEClass(ABOUT);
		createEReference(aboutEClass, ABOUT__BASE_ABSTRACTION);
		createEOperation(aboutEClass, ABOUT___VALIDATE_IS_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP);

		// Create enums
		archetypeTypeEEnum = createEEnum(ARCHETYPE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		permissibleValueEClass.getESuperTypes().add(this.getIdentifiedItem());
		enumeratedValueDomainEClass.getESuperTypes().add(this.getIdentifiedItem());
		codeSystemReferenceEClass.getESuperTypes().add(this.getResourceReference());
		codeSystemVersionReferenceEClass.getESuperTypes().add(this.getResourceReference());
		conceptReferenceEClass.getESuperTypes().add(this.getResourceReference());
		valueSetDefinitionReferenceEClass.getESuperTypes().add(this.getResourceReference());
		valueSetReferenceEClass.getESuperTypes().add(this.getResourceReference());
		archetypeTermEClass.getESuperTypes().add(this.getPermissibleValue());
		idEntryEClass.getESuperTypes().add(this.getEntry());
		describedIdentifierEClass.getESuperTypes().add(this.getScopedIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiedItemEClass, IdentifiedItem.class, "IdentifiedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifiedItem_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 1, 1, IdentifiedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIdentifiedItem_Id(), theUMLPackage.getEnumerationLiteral(), null, "id", null, 0, -1, IdentifiedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getIdentifiedItem__ValidateUniqueScopes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateUniqueScopes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(permissibleValueEClass, PermissibleValue.class, "PermissibleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermissibleValue_Base_EnumerationLiteral(), theUMLPackage.getEnumerationLiteral(), null, "base_EnumerationLiteral", null, 1, 1, PermissibleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPermissibleValue_Meaning(), theUMLPackage.getEnumerationLiteral(), null, "meaning", null, 0, 1, PermissibleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPermissibleValue__ValidateMustBeConceptReference__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateMustBeConceptReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scopedIdentifierEClass, ScopedIdentifier.class, "ScopedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScopedIdentifier_Uri(), theTypesPackage.getString(), "uri", null, 0, 1, ScopedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getScopedIdentifier_IdentifierURIPattern(), theTypesPackage.getString(), "identifierURIPattern", null, 0, 1, ScopedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScopedIdentifier_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1, 1, ScopedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumeratedValueDomainEClass, EnumeratedValueDomain.class, "EnumeratedValueDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedValueDomain_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1, 1, EnumeratedValueDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnumeratedValueDomain_ValueSetBinding(), theUMLPackage.getEnumerationLiteral(), null, "valueSetBinding", null, 0, 1, EnumeratedValueDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getEnumeratedValueDomain__ValidatePermissibleValues__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validatePermissibleValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnumeratedValueDomain__ValidateBindingIsValueSetOrDefinition__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateBindingIsValueSetOrDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceReferenceEClass, ResourceReference.class, "ResourceReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceReference_Uri(), theTypesPackage.getString(), "uri", null, 0, 1, ResourceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceReference_Base_EnumerationLiteral(), theUMLPackage.getEnumerationLiteral(), null, "base_EnumerationLiteral", null, 1, 1, ResourceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(codeSystemReferenceEClass, CodeSystemReference.class, "CodeSystemReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeSystemVersionReferenceEClass, CodeSystemVersionReference.class, "CodeSystemVersionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeSystemVersionReference_CodeSystem(), theUMLPackage.getEnumerationLiteral(), null, "codeSystem", null, 0, 1, CodeSystemVersionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conceptReferenceEClass, ConceptReference.class, "ConceptReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConceptReference_Designation(), theTypesPackage.getString(), "designation", null, 0, -1, ConceptReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConceptReference__ValidateMustBeScopedIdentifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateMustBeScopedIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueSetDefinitionReferenceEClass, ValueSetDefinitionReference.class, "ValueSetDefinitionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSetDefinitionReference_ValueSet(), theUMLPackage.getEnumerationLiteral(), null, "valueSet", null, 0, 1, ValueSetDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSetReferenceEClass, ValueSetReference.class, "ValueSetReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSetReference_ValueSetDefinition(), theUMLPackage.getEnumerationLiteral(), null, "valueSetDefinition", null, 0, -1, ValueSetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getValueSetReference__ValidateDefinition__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(archetypeTermEClass, ArchetypeTerm.class, "ArchetypeTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchetypeTerm_Value_set_members(), theUMLPackage.getEnumerationLiteral(), null, "value_set_members", null, 0, -1, ArchetypeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArchetypeTerm_Term_bindings(), theUMLPackage.getEnumerationLiteral(), null, "term_bindings", null, 0, -1, ArchetypeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVTLClanguageconsistency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVTLClanguageconsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVTVSIDvaluesetiddefined__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVTVSIDvaluesetiddefined", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVTVSUQvaluesetmembersunique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVTVSUQvaluesetmembersunique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVTVSMDvaluesetmembersdefined__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVTVSMDvaluesetmembersdefined", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMARCHETYPETERMInvariantcodeValidCode__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPETERMInvariantcodeValidCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVALUESETInvariantIdValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVALUESETInvariantIdValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVALUESETInvariantMembersValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVALUESETInvariantMembersValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVETDFexternaltermvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVETDFexternaltermvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVTCBKterminologyconstraintbindingkeyvalid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVTCBKterminologyconstraintbindingkeyvalid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVTSDspecialisationlevelofcodes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVTSDspecialisationlevelofcodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeTerm__ValidateAOMVTTBKterminologytermbindingkeyvalid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVTTBKterminologytermbindingkeyvalid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(termResourceTranslationEClass, TermResourceTranslation.class, "TermResourceTranslation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermResourceTranslation_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1, 1, TermResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTermResourceTranslation_Language(), theUMLPackage.getEnumerationLiteral(), null, "language", null, 0, 1, TermResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTermResourceTranslation__ValidateTranslationEntries__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateTranslationEntries", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(idEntryEClass, IdEntry.class, "IdEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdEntry_Ref(), theUMLPackage.getEnumerationLiteral(), null, "ref", null, 1, 1, IdEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIdEntry_Base_EnumerationLiteral(), theUMLPackage.getEnumerationLiteral(), null, "base_EnumerationLiteral", null, 1, 1, IdEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getIdEntry__ValidateAOMARCHETYPETERMInvariantdescriptionValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPETERMInvariantdescriptionValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Text(), theTypesPackage.getString(), "text", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntry_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getEntry__ValidateAOMARCHETYPETERMInvarianttextValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPETERMInvarianttextValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(describedIdentifierEClass, DescribedIdentifier.class, "DescribedIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescribedIdentifier_DefiningCodeSystem(), theUMLPackage.getEnumerationLiteral(), null, "definingCodeSystem", null, 0, 1, DescribedIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDescribedIdentifier__ValidateMembersMustBeConceptReference__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateMembersMustBeConceptReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDescribedIdentifier__ValidateDefiningCodeSystem__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateDefiningCodeSystem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aboutEClass, about.class, "about", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getabout_Base_Abstraction(), theUMLPackage.getAbstraction(), null, "base_Abstraction", null, 1, 1, about.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getabout__ValidateIsConceptReference__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateIsConceptReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(archetypeTypeEEnum, ArchetypeType.class, "ArchetypeType");
		addEEnumLiteral(archetypeTypeEEnum, ArchetypeType.ARCHETYPE);
		addEEnumLiteral(archetypeTypeEEnum, ArchetypeType.TEMPLATE);
		addEEnumLiteral(archetypeTypeEEnum, ArchetypeType.TEMPLATE_OVERLAY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "TerminologyProfile"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVTLClanguageconsistency__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VTLC- language consistency"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVTVSIDvaluesetiddefined__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VTVSID- value-set id defined"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVTVSUQvaluesetmembersunique__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VTVSUQ- value-set members unique"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVTVSMDvaluesetmembersdefined__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VTVSMD- value-set members defined"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMARCHETYPETERMInvariantcodeValidCode__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_TERM:Invariant:code_valid_code"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVALUESETInvariantIdValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VALUE_SET:Invariant:Id_valid"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVALUESETInvariantMembersValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VALUE_SET:Invariant:Members_valid"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_TERMINOLOGY:Invariant:term_bindings_validity"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVETDFexternaltermvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VETDF- external term validity"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVTCBKterminologyconstraintbindingkeyvalid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VTCBK- terminology constraint binding key valid"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVTSDspecialisationlevelofcodes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VTSD- specialisation level of codes"
		   });	
		addAnnotation
		  (getArchetypeTerm__ValidateAOMVTTBKterminologytermbindingkeyvalid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VTTBK- terminology term binding key valid"
		   });	
		addAnnotation
		  (getIdEntry__ValidateAOMARCHETYPETERMInvariantdescriptionValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_TERM:Invariant:description_valid"
		   });	
		addAnnotation
		  (getEntry__ValidateAOMARCHETYPETERMInvarianttextValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_TERM:Invariant:text_valid"
		   });
	}

} //TerminologyPackageImpl
