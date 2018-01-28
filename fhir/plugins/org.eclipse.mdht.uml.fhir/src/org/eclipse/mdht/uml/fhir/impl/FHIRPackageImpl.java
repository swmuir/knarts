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
package org.eclipse.mdht.uml.fhir.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.mdht.uml.fhir.BindingStrengthKind;
import org.eclipse.mdht.uml.fhir.Comments;
import org.eclipse.mdht.uml.fhir.ConformanceResource;
import org.eclipse.mdht.uml.fhir.DataElement;
import org.eclipse.mdht.uml.fhir.Definition;
import org.eclipse.mdht.uml.fhir.DerivationKind;
import org.eclipse.mdht.uml.fhir.Description;
import org.eclipse.mdht.uml.fhir.Element;
import org.eclipse.mdht.uml.fhir.ElementDefinition;
import org.eclipse.mdht.uml.fhir.ElementSlicing;
import org.eclipse.mdht.uml.fhir.FHIRFactory;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.PropertyRepresentationKind;
import org.eclipse.mdht.uml.fhir.Requirements;
import org.eclipse.mdht.uml.fhir.SearchParameter;
import org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass;
import org.eclipse.mdht.uml.fhir.ShortDescription;
import org.eclipse.mdht.uml.fhir.SlicingRulesKind;
import org.eclipse.mdht.uml.fhir.StructureDefinition;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.mdht.uml.fhir.ValueSet;
import org.eclipse.mdht.uml.fhir.ValueSetBinding;

import org.eclipse.mdht.uml.fhir.ValueSetMember;
import org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage;

import org.eclipse.mdht.uml.fhir.types.impl.FHIRTypesPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FHIRPackageImpl extends EPackageImpl implements FHIRPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementSlicingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParameter_ComponentClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum derivationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyRepresentationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingStrengthKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum slicingRulesKindEEnum = null;

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
	 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FHIRPackageImpl() {
		super(eNS_URI, FHIRFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FHIRPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FHIRPackage init() {
		if (isInited) return (FHIRPackage)EPackage.Registry.INSTANCE.getEPackage(FHIRPackage.eNS_URI);

		// Obtain or create and register package
		FHIRPackageImpl theFHIRPackage = (FHIRPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FHIRPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FHIRPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FHIRTypesPackageImpl theFHIRTypesPackage = (FHIRTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FHIRTypesPackage.eNS_URI) instanceof FHIRTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FHIRTypesPackage.eNS_URI) : FHIRTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theFHIRPackage.createPackageContents();
		theFHIRTypesPackage.createPackageContents();

		// Initialize created meta-data
		theFHIRPackage.initializePackageContents();
		theFHIRTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFHIRPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FHIRPackage.eNS_URI, theFHIRPackage);
		return theFHIRPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeChoice() {
		return typeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeChoice_Base_Property() {
		return (EReference)typeChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeChoice_Types() {
		return (EReference)typeChoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinition() {
		return structureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Base_Class() {
		return (EReference)structureDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureDefinition_Display() {
		return (EAttribute)structureDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureDefinition_ContextType() {
		return (EAttribute)structureDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureDefinition_Context() {
		return (EAttribute)structureDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureDefinition_IsLogical() {
		return (EAttribute)structureDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureDefinition_Derivation() {
		return (EAttribute)structureDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceResource() {
		return conformanceResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResource_Uri() {
		return (EAttribute)conformanceResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResource_Version() {
		return (EAttribute)conformanceResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResource_Name() {
		return (EAttribute)conformanceResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResource_Status() {
		return (EAttribute)conformanceResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResource_Experimental() {
		return (EAttribute)conformanceResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResource_Publisher() {
		return (EAttribute)conformanceResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_Contact() {
		return (EReference)conformanceResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResource_Date() {
		return (EAttribute)conformanceResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_UseContext() {
		return (EReference)conformanceResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResource_Copyright() {
		return (EAttribute)conformanceResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Extension() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinition() {
		return elementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Base_Property() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_Name() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_Label() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_MustSupport() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_IsModifier() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_IsSummary() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_Representation() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Default() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_MeaningWhenMissing() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Fixed() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Pattern() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Example() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDefinition_Comment() {
		return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortDescription() {
		return shortDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortDescription_Base_Comment() {
		return (EReference)shortDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescription_Base_Comment() {
		return (EReference)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Base_Comment() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirements() {
		return requirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirements_Base_Comment() {
		return (EReference)requirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComments() {
		return commentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComments_Base_Comment() {
		return (EReference)commentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetBinding() {
		return valueSetBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetBinding_Base_Property() {
		return (EReference)valueSetBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetBinding_Strength() {
		return (EAttribute)valueSetBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetBinding_Description() {
		return (EAttribute)valueSetBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetBinding_ValueSetUri() {
		return (EAttribute)valueSetBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetBinding_ValueSetReference() {
		return (EReference)valueSetBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSet() {
		return valueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Base_Enumeration() {
		return (EReference)valueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElement() {
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Base_Class() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetMember() {
		return valueSetMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetMember_Base_EnumerationLiteral() {
		return (EReference)valueSetMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetMember_System() {
		return (EAttribute)valueSetMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetMember_Version() {
		return (EAttribute)valueSetMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetMember_Code() {
		return (EAttribute)valueSetMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetMember_Display() {
		return (EAttribute)valueSetMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetMember_Abstract() {
		return (EAttribute)valueSetMemberEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementSlicing() {
		return elementSlicingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSlicing_Discriminator() {
		return (EAttribute)elementSlicingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSlicing_Description() {
		return (EAttribute)elementSlicingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSlicing_Ordered() {
		return (EAttribute)elementSlicingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSlicing_Rules() {
		return (EAttribute)elementSlicingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementSlicing_Base_Property() {
		return (EReference)elementSlicingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParameter() {
		return searchParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Base_Class() {
		return (EReference)searchParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Jurisdiction() {
		return (EReference)searchParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Purpose() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Code() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Base() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Type() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_DerivedFrom() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Description() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Expression() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Xpath() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_XpathUsage() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Target() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Comparator() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Modifier() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_Chain() {
		return (EAttribute)searchParameterEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Component() {
		return (EReference)searchParameterEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_BaseResource() {
		return (EReference)searchParameterEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParameter_ComponentClass() {
		return searchParameter_ComponentClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_ComponentClass_Definition() {
		return (EReference)searchParameter_ComponentClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParameter_ComponentClass_Expression() {
		return (EAttribute)searchParameter_ComponentClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDerivationKind() {
		return derivationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyRepresentationKind() {
		return propertyRepresentationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingStrengthKind() {
		return bindingStrengthKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSlicingRulesKind() {
		return slicingRulesKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHIRFactory getFHIRFactory() {
		return (FHIRFactory)getEFactoryInstance();
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
		typeChoiceEClass = createEClass(TYPE_CHOICE);
		createEReference(typeChoiceEClass, TYPE_CHOICE__BASE_PROPERTY);
		createEReference(typeChoiceEClass, TYPE_CHOICE__TYPES);

		structureDefinitionEClass = createEClass(STRUCTURE_DEFINITION);
		createEReference(structureDefinitionEClass, STRUCTURE_DEFINITION__BASE_CLASS);
		createEAttribute(structureDefinitionEClass, STRUCTURE_DEFINITION__DISPLAY);
		createEAttribute(structureDefinitionEClass, STRUCTURE_DEFINITION__CONTEXT_TYPE);
		createEAttribute(structureDefinitionEClass, STRUCTURE_DEFINITION__CONTEXT);
		createEAttribute(structureDefinitionEClass, STRUCTURE_DEFINITION__IS_LOGICAL);
		createEAttribute(structureDefinitionEClass, STRUCTURE_DEFINITION__DERIVATION);

		conformanceResourceEClass = createEClass(CONFORMANCE_RESOURCE);
		createEAttribute(conformanceResourceEClass, CONFORMANCE_RESOURCE__URI);
		createEAttribute(conformanceResourceEClass, CONFORMANCE_RESOURCE__VERSION);
		createEAttribute(conformanceResourceEClass, CONFORMANCE_RESOURCE__NAME);
		createEAttribute(conformanceResourceEClass, CONFORMANCE_RESOURCE__STATUS);
		createEAttribute(conformanceResourceEClass, CONFORMANCE_RESOURCE__EXPERIMENTAL);
		createEAttribute(conformanceResourceEClass, CONFORMANCE_RESOURCE__PUBLISHER);
		createEReference(conformanceResourceEClass, CONFORMANCE_RESOURCE__CONTACT);
		createEAttribute(conformanceResourceEClass, CONFORMANCE_RESOURCE__DATE);
		createEReference(conformanceResourceEClass, CONFORMANCE_RESOURCE__USE_CONTEXT);
		createEAttribute(conformanceResourceEClass, CONFORMANCE_RESOURCE__COPYRIGHT);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEReference(elementEClass, ELEMENT__EXTENSION);

		elementDefinitionEClass = createEClass(ELEMENT_DEFINITION);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__BASE_PROPERTY);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__NAME);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__LABEL);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__MUST_SUPPORT);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__IS_MODIFIER);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__IS_SUMMARY);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__REPRESENTATION);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__DEFAULT);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__MEANING_WHEN_MISSING);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__FIXED);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__PATTERN);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__EXAMPLE);
		createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__COMMENT);

		shortDescriptionEClass = createEClass(SHORT_DESCRIPTION);
		createEReference(shortDescriptionEClass, SHORT_DESCRIPTION__BASE_COMMENT);

		descriptionEClass = createEClass(DESCRIPTION);
		createEReference(descriptionEClass, DESCRIPTION__BASE_COMMENT);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__BASE_COMMENT);

		requirementsEClass = createEClass(REQUIREMENTS);
		createEReference(requirementsEClass, REQUIREMENTS__BASE_COMMENT);

		commentsEClass = createEClass(COMMENTS);
		createEReference(commentsEClass, COMMENTS__BASE_COMMENT);

		valueSetBindingEClass = createEClass(VALUE_SET_BINDING);
		createEReference(valueSetBindingEClass, VALUE_SET_BINDING__BASE_PROPERTY);
		createEAttribute(valueSetBindingEClass, VALUE_SET_BINDING__STRENGTH);
		createEAttribute(valueSetBindingEClass, VALUE_SET_BINDING__DESCRIPTION);
		createEAttribute(valueSetBindingEClass, VALUE_SET_BINDING__VALUE_SET_URI);
		createEReference(valueSetBindingEClass, VALUE_SET_BINDING__VALUE_SET_REFERENCE);

		valueSetEClass = createEClass(VALUE_SET);
		createEReference(valueSetEClass, VALUE_SET__BASE_ENUMERATION);

		dataElementEClass = createEClass(DATA_ELEMENT);
		createEReference(dataElementEClass, DATA_ELEMENT__BASE_CLASS);

		valueSetMemberEClass = createEClass(VALUE_SET_MEMBER);
		createEReference(valueSetMemberEClass, VALUE_SET_MEMBER__BASE_ENUMERATION_LITERAL);
		createEAttribute(valueSetMemberEClass, VALUE_SET_MEMBER__SYSTEM);
		createEAttribute(valueSetMemberEClass, VALUE_SET_MEMBER__VERSION);
		createEAttribute(valueSetMemberEClass, VALUE_SET_MEMBER__CODE);
		createEAttribute(valueSetMemberEClass, VALUE_SET_MEMBER__DISPLAY);
		createEAttribute(valueSetMemberEClass, VALUE_SET_MEMBER__ABSTRACT);

		elementSlicingEClass = createEClass(ELEMENT_SLICING);
		createEAttribute(elementSlicingEClass, ELEMENT_SLICING__DISCRIMINATOR);
		createEAttribute(elementSlicingEClass, ELEMENT_SLICING__DESCRIPTION);
		createEAttribute(elementSlicingEClass, ELEMENT_SLICING__ORDERED);
		createEAttribute(elementSlicingEClass, ELEMENT_SLICING__RULES);
		createEReference(elementSlicingEClass, ELEMENT_SLICING__BASE_PROPERTY);

		searchParameterEClass = createEClass(SEARCH_PARAMETER);
		createEReference(searchParameterEClass, SEARCH_PARAMETER__BASE_CLASS);
		createEReference(searchParameterEClass, SEARCH_PARAMETER__JURISDICTION);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__PURPOSE);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__CODE);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__BASE);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__TYPE);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__DERIVED_FROM);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__DESCRIPTION);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__EXPRESSION);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__XPATH);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__XPATH_USAGE);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__TARGET);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__COMPARATOR);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__MODIFIER);
		createEAttribute(searchParameterEClass, SEARCH_PARAMETER__CHAIN);
		createEReference(searchParameterEClass, SEARCH_PARAMETER__COMPONENT);
		createEReference(searchParameterEClass, SEARCH_PARAMETER__BASE_RESOURCE);

		searchParameter_ComponentClassEClass = createEClass(SEARCH_PARAMETER_COMPONENT_CLASS);
		createEReference(searchParameter_ComponentClassEClass, SEARCH_PARAMETER_COMPONENT_CLASS__DEFINITION);
		createEAttribute(searchParameter_ComponentClassEClass, SEARCH_PARAMETER_COMPONENT_CLASS__EXPRESSION);

		// Create enums
		derivationKindEEnum = createEEnum(DERIVATION_KIND);
		propertyRepresentationKindEEnum = createEEnum(PROPERTY_REPRESENTATION_KIND);
		bindingStrengthKindEEnum = createEEnum(BINDING_STRENGTH_KIND);
		slicingRulesKindEEnum = createEEnum(SLICING_RULES_KIND);
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
		FHIRTypesPackage theFHIRTypesPackage = (FHIRTypesPackage)EPackage.Registry.INSTANCE.getEPackage(FHIRTypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFHIRTypesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		structureDefinitionEClass.getESuperTypes().add(this.getConformanceResource());
		conformanceResourceEClass.getESuperTypes().add(this.getElement());
		elementDefinitionEClass.getESuperTypes().add(this.getElement());
		valueSetEClass.getESuperTypes().add(this.getConformanceResource());
		dataElementEClass.getESuperTypes().add(this.getConformanceResource());
		searchParameterEClass.getESuperTypes().add(this.getConformanceResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(typeChoiceEClass, TypeChoice.class, "TypeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeChoice_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, TypeChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeChoice_Types(), theUMLPackage.getClassifier(), null, "types", null, 0, -1, TypeChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structureDefinitionEClass, StructureDefinition.class, "StructureDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureDefinition_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, StructureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructureDefinition_Display(), theTypesPackage.getString(), "display", null, 0, 1, StructureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructureDefinition_ContextType(), theTypesPackage.getString(), "contextType", null, 0, 1, StructureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructureDefinition_Context(), theTypesPackage.getString(), "context", null, 0, -1, StructureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructureDefinition_IsLogical(), ecorePackage.getEBooleanObject(), "isLogical", null, 0, 1, StructureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructureDefinition_Derivation(), this.getDerivationKind(), "derivation", null, 0, 1, StructureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conformanceResourceEClass, ConformanceResource.class, "ConformanceResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConformanceResource_Uri(), theTypesPackage.getString(), "uri", null, 0, 1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConformanceResource_Version(), theTypesPackage.getString(), "version", null, 0, 1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConformanceResource_Name(), theTypesPackage.getString(), "name", null, 0, 1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConformanceResource_Status(), theTypesPackage.getString(), "status", null, 0, 1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConformanceResource_Experimental(), theTypesPackage.getBoolean(), "experimental", null, 0, 1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConformanceResource_Publisher(), theTypesPackage.getString(), "publisher", null, 0, 1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConformanceResource_Contact(), theFHIRTypesPackage.getContactDetail(), null, "contact", null, 0, -1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConformanceResource_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConformanceResource_UseContext(), theFHIRTypesPackage.getCodeableConcept(), null, "useContext", null, 0, -1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConformanceResource_Copyright(), theTypesPackage.getString(), "copyright", null, 0, 1, ConformanceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), theTypesPackage.getString(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Extension(), theFHIRTypesPackage.getExtension(), null, "extension", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementDefinitionEClass, ElementDefinition.class, "ElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinition_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementDefinition_Name(), theTypesPackage.getString(), "name", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementDefinition_Label(), theTypesPackage.getString(), "label", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementDefinition_MustSupport(), ecorePackage.getEBooleanObject(), "mustSupport", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementDefinition_IsModifier(), ecorePackage.getEBooleanObject(), "isModifier", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementDefinition_IsSummary(), ecorePackage.getEBooleanObject(), "isSummary", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementDefinition_Representation(), this.getPropertyRepresentationKind(), "representation", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementDefinition_Default(), theFHIRTypesPackage.getDataType(), null, "default", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementDefinition_MeaningWhenMissing(), theTypesPackage.getString(), "meaningWhenMissing", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementDefinition_Fixed(), theFHIRTypesPackage.getDataType(), null, "fixed", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementDefinition_Pattern(), theFHIRTypesPackage.getDataType(), null, "pattern", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementDefinition_Example(), theFHIRTypesPackage.getDataType(), null, "example", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementDefinition_Comment(), theTypesPackage.getString(), "comment", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(shortDescriptionEClass, ShortDescription.class, "ShortDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortDescription_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, ShortDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescription_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinition_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requirementsEClass, Requirements.class, "Requirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirements_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(commentsEClass, Comments.class, "Comments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComments_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, Comments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSetBindingEClass, ValueSetBinding.class, "ValueSetBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSetBinding_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ValueSetBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetBinding_Strength(), this.getBindingStrengthKind(), "strength", "example", 1, 1, ValueSetBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetBinding_Description(), theTypesPackage.getString(), "description", null, 0, 1, ValueSetBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetBinding_ValueSetUri(), theTypesPackage.getString(), "valueSetUri", null, 0, 1, ValueSetBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSetBinding_ValueSetReference(), this.getValueSet(), null, "valueSetReference", null, 0, 1, ValueSetBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSetEClass, ValueSet.class, "ValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSet_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1, 1, ValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataElementEClass, DataElement.class, "DataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataElement_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSetMemberEClass, ValueSetMember.class, "ValueSetMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSetMember_Base_EnumerationLiteral(), theUMLPackage.getEnumerationLiteral(), null, "base_EnumerationLiteral", null, 1, 1, ValueSetMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetMember_System(), theTypesPackage.getString(), "system", null, 0, 1, ValueSetMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetMember_Version(), theTypesPackage.getString(), "version", null, 0, 1, ValueSetMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetMember_Code(), theTypesPackage.getString(), "code", null, 0, 1, ValueSetMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetMember_Display(), theTypesPackage.getString(), "display", null, 0, 1, ValueSetMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getValueSetMember_Abstract(), ecorePackage.getEBooleanObject(), "abstract", null, 0, 1, ValueSetMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementSlicingEClass, ElementSlicing.class, "ElementSlicing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementSlicing_Discriminator(), theTypesPackage.getString(), "discriminator", null, 0, -1, ElementSlicing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementSlicing_Description(), theTypesPackage.getString(), "description", null, 0, 1, ElementSlicing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementSlicing_Ordered(), ecorePackage.getEBooleanObject(), "ordered", null, 0, 1, ElementSlicing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementSlicing_Rules(), this.getSlicingRulesKind(), "rules", null, 1, 1, ElementSlicing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementSlicing_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ElementSlicing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(searchParameterEClass, SearchParameter.class, "SearchParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchParameter_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSearchParameter_Jurisdiction(), theFHIRTypesPackage.getCodeableConcept(), null, "jurisdiction", null, 0, -1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Purpose(), theTypesPackage.getString(), "purpose", null, 0, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Code(), theTypesPackage.getString(), "code", null, 1, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Base(), theTypesPackage.getString(), "base", null, 1, -1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Type(), theTypesPackage.getString(), "type", null, 1, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_DerivedFrom(), theTypesPackage.getString(), "derivedFrom", null, 0, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Description(), theTypesPackage.getString(), "description", null, 1, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Expression(), theTypesPackage.getString(), "expression", null, 0, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Xpath(), theTypesPackage.getString(), "xpath", null, 0, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_XpathUsage(), theTypesPackage.getString(), "xpathUsage", null, 0, 1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Target(), theTypesPackage.getString(), "target", null, 0, -1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Comparator(), theTypesPackage.getString(), "comparator", null, 0, -1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Modifier(), theTypesPackage.getString(), "modifier", null, 0, -1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_Chain(), theTypesPackage.getString(), "chain", null, 0, -1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSearchParameter_Component(), this.getSearchParameter_ComponentClass(), null, "component", null, 0, -1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSearchParameter_BaseResource(), theUMLPackage.getNamedElement(), null, "baseResource", null, 1, -1, SearchParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(searchParameter_ComponentClassEClass, SearchParameter_ComponentClass.class, "SearchParameter_ComponentClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchParameter_ComponentClass_Definition(), theFHIRTypesPackage.getReference(), null, "definition", null, 1, 1, SearchParameter_ComponentClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchParameter_ComponentClass_Expression(), theTypesPackage.getString(), "expression", null, 1, 1, SearchParameter_ComponentClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(derivationKindEEnum, DerivationKind.class, "DerivationKind");
		addEEnumLiteral(derivationKindEEnum, DerivationKind.CONSTRAINT);
		addEEnumLiteral(derivationKindEEnum, DerivationKind.SPECIALIZATION);

		initEEnum(propertyRepresentationKindEEnum, PropertyRepresentationKind.class, "PropertyRepresentationKind");
		addEEnumLiteral(propertyRepresentationKindEEnum, PropertyRepresentationKind.XML_ATTR);

		initEEnum(bindingStrengthKindEEnum, BindingStrengthKind.class, "BindingStrengthKind");
		addEEnumLiteral(bindingStrengthKindEEnum, BindingStrengthKind.REQUIRED);
		addEEnumLiteral(bindingStrengthKindEEnum, BindingStrengthKind.EXTENSIBLE);
		addEEnumLiteral(bindingStrengthKindEEnum, BindingStrengthKind.PREFERRED);
		addEEnumLiteral(bindingStrengthKindEEnum, BindingStrengthKind.EXAMPLE);

		initEEnum(slicingRulesKindEEnum, SlicingRulesKind.class, "SlicingRulesKind");
		addEEnumLiteral(slicingRulesKindEEnum, SlicingRulesKind.CLOSED);
		addEEnumLiteral(slicingRulesKindEEnum, SlicingRulesKind.OPEN);
		addEEnumLiteral(slicingRulesKindEEnum, SlicingRulesKind.OPEN_AT_END);

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
			 "originalName", "FHIR"
		   });	
		addAnnotation
		  (searchParameter_ComponentClassEClass, 
		   source, 
		   new String[] {
			 "originalName", "ComponentClass"
		   });
	}

} //FHIRPackageImpl
