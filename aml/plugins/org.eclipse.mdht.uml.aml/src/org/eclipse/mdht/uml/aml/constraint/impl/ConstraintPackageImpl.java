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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.mdht.uml.aml.constraint.Archetype;
import org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition;
import org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary;
import org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot;
import org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot;
import org.eclipse.mdht.uml.aml.constraint.AuthoredResource;
import org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint;
import org.eclipse.mdht.uml.aml.constraint.Constrains;
import org.eclipse.mdht.uml.aml.constraint.ConstraintFactory;
import org.eclipse.mdht.uml.aml.constraint.ConstraintPackage;
import org.eclipse.mdht.uml.aml.constraint.Lifecycle_state;
import org.eclipse.mdht.uml.aml.constraint.ObjectConstraint;
import org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem;
import org.eclipse.mdht.uml.aml.constraint.ResourceTranslation;

import org.eclipse.mdht.uml.aml.constraint.util.ConstraintValidator;

import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintPackageImpl extends EPackageImpl implements ConstraintPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexObjectConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archetypeLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authoredResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTranslationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archetypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archetypeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archetypeRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAnnotationNodeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifecycle_stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versioN_STATUSEEnum = null;

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
	 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintPackageImpl() {
		super(eNS_URI, ConstraintFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintPackage init() {
		if (isInited) return (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);

		// Obtain or create and register package
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TerminologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConstraintPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConstraintPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConstraintValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConstraintPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintPackage.eNS_URI, theConstraintPackage);
		return theConstraintPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexObjectConstraint() {
		return complexObjectConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexObjectConstraint_Base_Classifier() {
		return (EReference)complexObjectConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateSingleParent__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAllAttributeConstraints__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVARCNarchetypeconceptvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVCARMattributenamereferencemodelvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVCAEXarchetypeattributereferencemodelexistenceconformance__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVDIFVarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVSAMspecialisedarchetypeattributemultiplicityconformance__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVACMCUcardinalityoccurrencesupperboundvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVACMCOcardinalityoccurrencesorphans__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVCACAarchetypeattributereferencemodelcardinalityconformance__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMWACMCLcardinalityoccurrenceslowerboundvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVCATUattributeuniqueness__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVUNTuseNodereferencemodeltypevalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVUNPuseNodepathvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVSUNTuseNodespecialisationparentvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVOBAVobjectnodeassumedvaluevalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVACDFconstraintcodevalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCOBJECTInvariantRmTypeNameValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantProhibitedValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAttributesValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTTuplesValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantBinaryConsistency__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantPrototypeValueConsistency__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCDATEInvariantPatternValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMASSERTIONInvariantTagValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMASSERTIONInvariantExpressionValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMQUERYVARIABLEInvariantContextValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMEXPRITEMInvariantTypeValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMEXPRUNARYOPERATORInvariantoperandValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantleftOperandValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantrightOperandValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMOPERATORKINDInvariantValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVATDFvaluecodevalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVATDAvaluesetassumedvaluecodevalidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYInvariantConsistency__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOrphansValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantCardinalityValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantAlternativesValid__DiagnosticChain_Map() {
		return complexObjectConstraintEClass.getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectConstraint() {
		return objectConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectConstraint_Is_deprecated() {
		return (EAttribute)objectConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateRedefinesGeneralization__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVCORMobjectconstrainttypenameexistence__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVCORMTobjectconstrainttypevalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVCOCDobjectconstraintdefinitionvalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVCOIDobjectnodeidentifiervalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVCOSUobjectnodeidentifiervalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMVSSMspecialisedarchetypesiblingordervalidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMARCHETYPECONSTRAINInvariantpathExists__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCATTRIBUTEInvariantRmAttributeNameValid__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCATTRIBUTEInvariantExistenceValid__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCATTRIBUTEInvariantDifferentialPathValid__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildOccurrencesValidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCARDINALITYInvariantValidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCOBJECTInvariantNodeIdValid__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCOBJECTInvariantOccurrencesValidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCOBJECTInvariantSiblingOrderValidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMSIBLINGORDERInvariantsiblingNodeIdValidity__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCDEFINEDOBJECTInvariantDefaultValueValid__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYTargetPathValid__DiagnosticChain_Map() {
		return objectConstraintEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrains() {
		return constrainsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrains_Base_Generalization() {
		return (EReference)constrainsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstrains__ValidateSpecificObjectConstraint__DiagnosticChain_Map() {
		return constrainsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstrains__ValidateConstrainsRMElement__DiagnosticChain_Map() {
		return constrainsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchetypeLibrary() {
		return archetypeLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchetypeLibrary_Base_Package() {
		return (EReference)archetypeLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetypeLibrary_Has_aom_ids() {
		return (EAttribute)archetypeLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetypeLibrary_Rm_package() {
		return (EAttribute)archetypeLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeLibrary__ValidateOneReferenceModel__DiagnosticChain_Map() {
		return archetypeLibraryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeLibrary__ValidateOnlyArchetypes__DiagnosticChain_Map() {
		return archetypeLibraryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeLibrary__ValidateAOMARCHETYPEHRIDInvariantRmClosureValidity__DiagnosticChain_Map() {
		return archetypeLibraryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchetype() {
		return archetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchetype_Base_Package() {
		return (EReference)archetypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_ArchetypeType() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_AmlVersion() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Is_controlled() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Is_generated() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Release_version() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Version_status() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Build_count() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Other_metadata() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Other_metadata_id() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateMustBeOwned__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateOwnsObjectConstraints__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateSpecializesArchetype__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVOKUobjectkeyunique__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVARDTarchetypedefinitiontypenamevalidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVARIDarchetypeidentifiervalidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVDEOLoriginallanguagespecified__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVARDdescriptionspecified__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVASIDarchetypespecialisationparentidentifiervalidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVALCarchetypelanguageconformance__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVACSDarchetypeconceptspecialisationdepth__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVATCDarchetypecodespecialisationlevelvalidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPEInvariantOriginalLanguageValid__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPEInvariantConceptValid__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPEInvariantDefinitionExists__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPEInvariantTerminologyExists__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPEInvariantSpecialisationValidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPEInvariantRulesValid__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPEHRIDInvariantConceptIdValidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPEHRIDInvariantBaseVersionValidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantIsSpecialised__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetype__ValidateAOMVARIABLEDECLARATIONInvariantNameValid__DiagnosticChain_Map() {
		return archetypeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthoredResource() {
		return authoredResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Copyright() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Current_revision() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Custodian_namespace() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Custodian_organisation() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Licence() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Lifecycle_state() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Original_author_date() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Original_author_email() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Original_author_name() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Original_author_organization() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Original_namespace() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Original_publisher() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Other_contributors() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_OtherDetails() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_OtherDetails_id() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_References() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_References_id() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_ResourceDocumentLanguage() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_ResourceDocumentSyntax() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_ResourceSource() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_ResourceSourceURI() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthoredResource_Base_Namespace() {
		return (EReference)authoredResourceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Resource_package_uri() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Uid() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Ip_acknowledgements() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthoredResource_Ip_acknowledgements_id() {
		return (EAttribute)authoredResourceEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceTranslation() {
		return resourceTranslationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceTranslation_Base_Enumeration() {
		return (EReference)resourceTranslationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Accreditation() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Other_translation_details() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Other_translation_details_id() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Purpose() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Keywords() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Use() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Misuse() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Copyright() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Original_resource_uri() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Original_resource_uriId() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Other_details() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Other_detailsId() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Author_name() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Author_organization() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Author_email() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Author_date() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceTranslation_Version_last_translated() {
		return (EAttribute)resourceTranslationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceTranslation__ValidateAOMVOTMterminologytranslationsvalidity__DiagnosticChain_Map() {
		return resourceTranslationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceTranslation__ValidateTranslationEntries__DiagnosticChain_Map() {
		return resourceTranslationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceTranslation__ValidateUniqueEntries__DiagnosticChain_Map() {
		return resourceTranslationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchetypeDefinition() {
		return archetypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchetypeDefinition_Base_Usage() {
		return (EReference)archetypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeDefinition__ValidateAOMARCHETYPEHRIDInvariantRmClassNameValidity__DiagnosticChain_Map() {
		return archetypeDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchetypeSlot() {
		return archetypeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchetypeSlot_Base_Classifier() {
		return (EReference)archetypeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeSlot__ValidateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity__DiagnosticChain_Map() {
		return archetypeSlotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeSlot__ValidateAOMVDSEVarchetypeslotexcludeconstraintvalidity__DiagnosticChain_Map() {
		return archetypeSlotEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeSlot__ValidateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity__DiagnosticChain_Map() {
		return archetypeSlotEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeSlot__ValidateAOMVDSSIDslotredefinitionchildnodeid__DiagnosticChain_Map() {
		return archetypeSlotEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeSlot__ValidateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity__DiagnosticChain_Map() {
		return archetypeSlotEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeSlot__ValidateAOMVDSIVarchetypeslotincludeconstraintvalidity__DiagnosticChain_Map() {
		return archetypeSlotEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantincludesValid__DiagnosticChain_Map() {
		return archetypeSlotEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantexcludesValid__DiagnosticChain_Map() {
		return archetypeSlotEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchetypeRoot() {
		return archetypeRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeRoot__ValidateAOMVARXNCexternalreferencenodeidentifiervalidity__DiagnosticChain_Map() {
		return archetypeRootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeRoot__ValidateAOMVARXTVexternalreferencetypevalidity__DiagnosticChain_Map() {
		return archetypeRootEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeRoot__ValidateAOMVARXSexternalreferenceconformstoslot__DiagnosticChain_Map() {
		return archetypeRootEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeRoot__ValidateAOMVARXRexternalreferencereferstoresolvableartefact__DiagnosticChain_Map() {
		return archetypeRootEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeRoot__ValidateAOMVARXIDexternalreferenceslotfillingidvalidity__DiagnosticChain_Map() {
		return archetypeRootEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeRoot__ValidateAOMCARCHETYPEROOTInvariantArchetypeRefValidity__DiagnosticChain_Map() {
		return archetypeRootEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchetypeRoot__ValidateAOMVARXAVexternalreferencenodearchetypereferencevalidity__DiagnosticChain_Map() {
		return archetypeRootEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAnnotationNodeItem() {
		return resourceAnnotationNodeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAnnotationNodeItem_Base_Comment() {
		return (EReference)resourceAnnotationNodeItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceAnnotationNodeItem__ValidateAOMVRANPannotationpathvalid__DiagnosticChain_Map() {
		return resourceAnnotationNodeItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLifecycle_state() {
		return lifecycle_stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVERSION_STATUS() {
		return versioN_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintFactory getConstraintFactory() {
		return (ConstraintFactory)getEFactoryInstance();
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
		complexObjectConstraintEClass = createEClass(COMPLEX_OBJECT_CONSTRAINT);
		createEReference(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_SINGLE_PARENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_ALL_ATTRIBUTE_CONSTRAINTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVARC_NARCHETYPECONCEPTVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAR_MATTRIBUTENAMEREFERENCEMODELVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAE_XARCHETYPEATTRIBUTEREFERENCEMODELEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCA_MARCHETYPEATTRIBUTEREFERENCEMODELMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_VARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_PSPECIALISEDARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_ESPECIALISEDARCHETYPEATTRIBUTENODEEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSA_MSPECIALISEDARCHETYPEATTRIBUTEMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACS_OSINGLEVALUEDATTRIBUTECHILDOBJECTOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_UCARDINALITYOCCURRENCESUPPERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_OCARDINALITYOCCURRENCESORPHANS__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAC_AARCHETYPEATTRIBUTEREFERENCEMODELCARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMWACMC_LCARDINALITYOCCURRENCESLOWERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_CSPECIALISEDARCHETYPEATTRIBUTENODECARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAT_UATTRIBUTEUNIQUENESS__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_TUSE_NODEREFERENCEMODELTYPEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_PUSE_NODEPATHVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSUN_TUSE_NODESPECIALISATIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVOBA_VOBJECTNODEASSUMEDVALUEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACD_FCONSTRAINTCODEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_ISPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MNODEIDVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_RM_TYPE_NAME_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_PROHIBITED_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ANY_ALLOWED_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ATTRIBUTES_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_TUPLES_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_REPRESENTATION_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_ASSUMED_VALUE_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_BINARY_CONSISTENCY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_PROTOTYPE_VALUE_CONSISTENCY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCDATE_INVARIANT_PATTERN_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCTERMINOLOGYCODE_INVARIANT_TERMINOLOGY_ID_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_TAG_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_EXPRESSION_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMQUERYVARIABLE_INVARIANT_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRITEM_INVARIANT_TYPE_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRUNARYOPERATOR_INVARIANTOPERAND_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTLEFT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTRIGHT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMOPERATORKIND_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_FVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_AVALUESETASSUMEDVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_FSPECIALISEDARCHETYPEOBJECTNODEIDENTIFIERVALIDITYINFLATSIBLINGS__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_INVARIANT_CONSISTENCY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_ORPHANS_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_OCCURRENCES_LOWER_SUM_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CARDINALITY_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(complexObjectConstraintEClass, COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_ALTERNATIVES_VALID__DIAGNOSTICCHAIN_MAP);

		objectConstraintEClass = createEClass(OBJECT_CONSTRAINT);
		createEAttribute(objectConstraintEClass, OBJECT_CONSTRAINT__IS_DEPRECATED);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectConstraintEClass, OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP);

		constrainsEClass = createEClass(CONSTRAINS);
		createEReference(constrainsEClass, CONSTRAINS__BASE_GENERALIZATION);
		createEOperation(constrainsEClass, CONSTRAINS___VALIDATE_SPECIFIC_OBJECT_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(constrainsEClass, CONSTRAINS___VALIDATE_CONSTRAINS_RM_ELEMENT__DIAGNOSTICCHAIN_MAP);

		archetypeLibraryEClass = createEClass(ARCHETYPE_LIBRARY);
		createEReference(archetypeLibraryEClass, ARCHETYPE_LIBRARY__BASE_PACKAGE);
		createEAttribute(archetypeLibraryEClass, ARCHETYPE_LIBRARY__HAS_AOM_IDS);
		createEAttribute(archetypeLibraryEClass, ARCHETYPE_LIBRARY__RM_PACKAGE);
		createEOperation(archetypeLibraryEClass, ARCHETYPE_LIBRARY___VALIDATE_ONE_REFERENCE_MODEL__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeLibraryEClass, ARCHETYPE_LIBRARY___VALIDATE_ONLY_ARCHETYPES__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeLibraryEClass, ARCHETYPE_LIBRARY___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_CLOSURE_VALIDITY__DIAGNOSTICCHAIN_MAP);

		archetypeEClass = createEClass(ARCHETYPE);
		createEReference(archetypeEClass, ARCHETYPE__BASE_PACKAGE);
		createEAttribute(archetypeEClass, ARCHETYPE__ARCHETYPE_TYPE);
		createEAttribute(archetypeEClass, ARCHETYPE__AML_VERSION);
		createEAttribute(archetypeEClass, ARCHETYPE__IS_CONTROLLED);
		createEAttribute(archetypeEClass, ARCHETYPE__IS_GENERATED);
		createEAttribute(archetypeEClass, ARCHETYPE__RELEASE_VERSION);
		createEAttribute(archetypeEClass, ARCHETYPE__VERSION_STATUS);
		createEAttribute(archetypeEClass, ARCHETYPE__BUILD_COUNT);
		createEAttribute(archetypeEClass, ARCHETYPE__OTHER_METADATA);
		createEAttribute(archetypeEClass, ARCHETYPE__OTHER_METADATA_ID);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_MUST_BE_OWNED__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_OWNS_OBJECT_CONSTRAINTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_SPECIALIZES_ARCHETYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVOK_UOBJECTKEYUNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVARD_TARCHETYPEDEFINITIONTYPENAMEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVARI_DARCHETYPEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVDEO_LORIGINALLANGUAGESPECIFIED__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVAR_DDESCRIPTIONSPECIFIED__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVASI_DARCHETYPESPECIALISATIONPARENTIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVAL_CARCHETYPELANGUAGECONFORMANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVACS_DARCHETYPECONCEPTSPECIALISATIONDEPTH__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVATC_DARCHETYPECODESPECIALISATIONLEVELVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_ORIGINAL_LANGUAGE_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_CONCEPT_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_DEFINITION_EXISTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_TERMINOLOGY_EXISTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_SPECIALISATION_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_RULES_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPEHRID_INVARIANT_CONCEPT_ID_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPEHRID_INVARIANT_BASE_VERSION_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMOPERATIONALTEMPLATE_INVARIANT_IS_SPECIALISED__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMOPERATIONALTEMPLATE_INVARIANT_COMPONENT_TERMINOLOGIES_EXISTENCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTORIGINAL_LANGUAGE_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTCONCEPT_CODE_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTTERM_DEFINITIONS_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANT_PARENT_ARCHETYPE_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeEClass, ARCHETYPE___VALIDATE_AOMVARIABLEDECLARATION_INVARIANT_NAME_VALID__DIAGNOSTICCHAIN_MAP);

		authoredResourceEClass = createEClass(AUTHORED_RESOURCE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__COPYRIGHT);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__CURRENT_REVISION);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__LICENCE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__LIFECYCLE_STATE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__ORIGINAL_NAMESPACE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__ORIGINAL_PUBLISHER);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__OTHER_CONTRIBUTORS);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__OTHER_DETAILS);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__OTHER_DETAILS_ID);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__REFERENCES);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__REFERENCES_ID);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__RESOURCE_SOURCE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__RESOURCE_SOURCE_URI);
		createEReference(authoredResourceEClass, AUTHORED_RESOURCE__BASE_NAMESPACE);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__UID);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS);
		createEAttribute(authoredResourceEClass, AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID);

		resourceTranslationEClass = createEClass(RESOURCE_TRANSLATION);
		createEReference(resourceTranslationEClass, RESOURCE_TRANSLATION__BASE_ENUMERATION);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__ACCREDITATION);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS_ID);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__PURPOSE);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__KEYWORDS);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__USE);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__MISUSE);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__COPYRIGHT);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI_ID);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__OTHER_DETAILS);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__OTHER_DETAILS_ID);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__AUTHOR_NAME);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__AUTHOR_ORGANIZATION);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__AUTHOR_EMAIL);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__AUTHOR_DATE);
		createEAttribute(resourceTranslationEClass, RESOURCE_TRANSLATION__VERSION_LAST_TRANSLATED);
		createEOperation(resourceTranslationEClass, RESOURCE_TRANSLATION___VALIDATE_AOMVOT_MTERMINOLOGYTRANSLATIONSVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(resourceTranslationEClass, RESOURCE_TRANSLATION___VALIDATE_TRANSLATION_ENTRIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(resourceTranslationEClass, RESOURCE_TRANSLATION___VALIDATE_UNIQUE_ENTRIES__DIAGNOSTICCHAIN_MAP);

		archetypeDefinitionEClass = createEClass(ARCHETYPE_DEFINITION);
		createEReference(archetypeDefinitionEClass, ARCHETYPE_DEFINITION__BASE_USAGE);
		createEOperation(archetypeDefinitionEClass, ARCHETYPE_DEFINITION___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_CLASS_NAME_VALIDITY__DIAGNOSTICCHAIN_MAP);

		archetypeSlotEClass = createEClass(ARCHETYPE_SLOT);
		createEReference(archetypeSlotEClass, ARCHETYPE_SLOT__BASE_CLASSIFIER);
		createEOperation(archetypeSlotEClass, ARCHETYPE_SLOT___VALIDATE_AOMVDSS_PSPECIALISEDARCHETYPESLOTDEFINITIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeSlotEClass, ARCHETYPE_SLOT___VALIDATE_AOMVDSE_VARCHETYPESLOTEXCLUDECONSTRAINTVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeSlotEClass, ARCHETYPE_SLOT___VALIDATE_AOMVDSS_MSPECIALISEDARCHETYPESLOTDEFINITIONMATCHVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeSlotEClass, ARCHETYPE_SLOT___VALIDATE_AOMVDSSI_DSLOTREDEFINITIONCHILDNODEID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeSlotEClass, ARCHETYPE_SLOT___VALIDATE_AOMVDSS_CSPECIALISEDARCHETYPESLOTDEFINITIONCLOSEDVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeSlotEClass, ARCHETYPE_SLOT___VALIDATE_AOMVDSI_VARCHETYPESLOTINCLUDECONSTRAINTVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeSlotEClass, ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPESLOT_INVARIANTINCLUDES_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeSlotEClass, ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPESLOT_INVARIANTEXCLUDES_VALID__DIAGNOSTICCHAIN_MAP);

		archetypeRootEClass = createEClass(ARCHETYPE_ROOT);
		createEOperation(archetypeRootEClass, ARCHETYPE_ROOT___VALIDATE_AOMVARXN_CEXTERNALREFERENCENODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeRootEClass, ARCHETYPE_ROOT___VALIDATE_AOMVARXT_VEXTERNALREFERENCETYPEVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeRootEClass, ARCHETYPE_ROOT___VALIDATE_AOMVARX_SEXTERNALREFERENCECONFORMSTOSLOT__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeRootEClass, ARCHETYPE_ROOT___VALIDATE_AOMVARX_REXTERNALREFERENCEREFERSTORESOLVABLEARTEFACT__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeRootEClass, ARCHETYPE_ROOT___VALIDATE_AOMVARXI_DEXTERNALREFERENCESLOTFILLINGIDVALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeRootEClass, ARCHETYPE_ROOT___VALIDATE_AOMCARCHETYPEROOT_INVARIANT_ARCHETYPE_REF_VALIDITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(archetypeRootEClass, ARCHETYPE_ROOT___VALIDATE_AOMVARXA_VEXTERNALREFERENCENODEARCHETYPEREFERENCEVALIDITY__DIAGNOSTICCHAIN_MAP);

		resourceAnnotationNodeItemEClass = createEClass(RESOURCE_ANNOTATION_NODE_ITEM);
		createEReference(resourceAnnotationNodeItemEClass, RESOURCE_ANNOTATION_NODE_ITEM__BASE_COMMENT);
		createEOperation(resourceAnnotationNodeItemEClass, RESOURCE_ANNOTATION_NODE_ITEM___VALIDATE_AOMVRAN_PANNOTATIONPATHVALID__DIAGNOSTICCHAIN_MAP);

		// Create enums
		lifecycle_stateEEnum = createEEnum(LIFECYCLE_STATE);
		versioN_STATUSEEnum = createEEnum(VERSION_STATUS);
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
		TerminologyPackage theTerminologyPackage = (TerminologyPackage)EPackage.Registry.INSTANCE.getEPackage(TerminologyPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		complexObjectConstraintEClass.getESuperTypes().add(this.getObjectConstraint());
		objectConstraintEClass.getESuperTypes().add(theTerminologyPackage.getIdentifiedItem());
		archetypeEClass.getESuperTypes().add(this.getAuthoredResource());
		archetypeSlotEClass.getESuperTypes().add(this.getObjectConstraint());
		archetypeRootEClass.getESuperTypes().add(this.getComplexObjectConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(complexObjectConstraintEClass, ComplexObjectConstraint.class, "ComplexObjectConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexObjectConstraint_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, ComplexObjectConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getComplexObjectConstraint__ValidateSingleParent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateSingleParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAllAttributeConstraints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAllAttributeConstraints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVARCNarchetypeconceptvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARCNarchetypeconceptvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVCARMattributenamereferencemodelvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCARMattributenamereferencemodelvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVCAEXarchetypeattributereferencemodelexistenceconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVDIFVarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDIFVarchetypeattributedifferentialpathvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVSAMspecialisedarchetypeattributemultiplicityconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVACMCUcardinalityoccurrencesupperboundvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVACMCUcardinalityoccurrencesupperboundvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVACMCOcardinalityoccurrencesorphans__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVACMCOcardinalityoccurrencesorphans", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVCACAarchetypeattributereferencemodelcardinalityconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMWACMCLcardinalityoccurrenceslowerboundvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVCATUattributeuniqueness__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCATUattributeuniqueness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVUNTuseNodereferencemodeltypevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVUNTuseNodereferencemodeltypevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVUNPuseNodepathvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVUNPuseNodepathvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVSUNTuseNodespecialisationparentvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSUNTuseNodespecialisationparentvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVOBAVobjectnodeassumedvaluevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVOBAVobjectnodeassumedvaluevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVACDFconstraintcodevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVACDFconstraintcodevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCOBJECTInvariantRmTypeNameValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCOBJECTInvariantRmTypeNameValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantProhibitedValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAttributesValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCCOMPLEXOBJECTInvariantAttributesValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTTuplesValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCCOMPLEXOBJECTTuplesValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantBinaryConsistency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCBOOLEANInvariantBinaryConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantPrototypeValueConsistency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCBOOLEANInvariantPrototypeValueConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCDATEInvariantPatternValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCDATEInvariantPatternValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMASSERTIONInvariantTagValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMASSERTIONInvariantTagValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMASSERTIONInvariantExpressionValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMASSERTIONInvariantExpressionValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMQUERYVARIABLEInvariantContextValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMQUERYVARIABLEInvariantContextValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMEXPRITEMInvariantTypeValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMEXPRITEMInvariantTypeValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMEXPRUNARYOPERATORInvariantoperandValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMEXPRUNARYOPERATORInvariantoperandValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantleftOperandValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMEXPRBINARYOPERATORInvariantleftOperandValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantrightOperandValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMEXPRBINARYOPERATORInvariantrightOperandValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMOPERATORKINDInvariantValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMOPERATORKINDInvariantValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVATDFvaluecodevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVATDFvaluecodevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVATDAvaluesetassumedvaluecodevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVATDAvaluesetassumedvaluecodevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYInvariantConsistency__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantChildrenValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOrphansValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantChildrenOrphansValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantCardinalityValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantCardinalityValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantAlternativesValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantAlternativesValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectConstraintEClass, ObjectConstraint.class, "ObjectConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectConstraint_Is_deprecated(), theTypesPackage.getBoolean(), "is_deprecated", null, 0, 1, ObjectConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateRedefinesGeneralization__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateRedefinesGeneralization", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVCORMobjectconstrainttypenameexistence__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCORMobjectconstrainttypenameexistence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVCORMTobjectconstrainttypevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCORMTobjectconstrainttypevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVCOCDobjectconstraintdefinitionvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCOCDobjectconstraintdefinitionvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVCOIDobjectnodeidentifiervalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCOIDobjectnodeidentifiervalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVCOSUobjectnodeidentifiervalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVCOSUobjectnodeidentifiervalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMVSSMspecialisedarchetypesiblingordervalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVSSMspecialisedarchetypesiblingordervalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMARCHETYPECONSTRAINInvariantpathExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPECONSTRAINInvariantpathExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCATTRIBUTEInvariantRmAttributeNameValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantRmAttributeNameValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCATTRIBUTEInvariantExistenceValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantExistenceValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCATTRIBUTEInvariantDifferentialPathValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantDifferentialPathValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildOccurrencesValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCATTRIBUTEInvariantChildOccurrencesValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCARDINALITYInvariantValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCARDINALITYInvariantValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCOBJECTInvariantNodeIdValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCOBJECTInvariantNodeIdValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCOBJECTInvariantOccurrencesValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCOBJECTInvariantOccurrencesValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCOBJECTInvariantSiblingOrderValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCOBJECTInvariantSiblingOrderValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMSIBLINGORDERInvariantsiblingNodeIdValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCDEFINEDOBJECTInvariantDefaultValueValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCDEFINEDOBJECTInvariantDefaultValueValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYTargetPathValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCCOMPLEXOBJECTPROXYTargetPathValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constrainsEClass, Constrains.class, "Constrains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrains_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null, 1, 1, Constrains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConstrains__ValidateSpecificObjectConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateSpecificObjectConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstrains__ValidateConstrainsRMElement__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateConstrainsRMElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(archetypeLibraryEClass, ArchetypeLibrary.class, "ArchetypeLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchetypeLibrary_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, ArchetypeLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetypeLibrary_Has_aom_ids(), theTypesPackage.getBoolean(), "has_aom_ids", "true", 1, 1, ArchetypeLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetypeLibrary_Rm_package(), theTypesPackage.getString(), "rm_package", null, 1, 1, ArchetypeLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getArchetypeLibrary__ValidateOneReferenceModel__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateOneReferenceModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeLibrary__ValidateOnlyArchetypes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateOnlyArchetypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeLibrary__ValidateAOMARCHETYPEHRIDInvariantRmClosureValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEHRIDInvariantRmClosureValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(archetypeEClass, Archetype.class, "Archetype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchetype_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_ArchetypeType(), theTerminologyPackage.getArchetypeType(), "archetypeType", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_AmlVersion(), theTypesPackage.getString(), "amlVersion", null, 1, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_Is_controlled(), theTypesPackage.getBoolean(), "is_controlled", "false", 1, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_Is_generated(), theTypesPackage.getBoolean(), "is_generated", "false", 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_Release_version(), theTypesPackage.getString(), "release_version", null, 1, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_Version_status(), this.getVERSION_STATUS(), "version_status", null, 1, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_Build_count(), theTypesPackage.getInteger(), "build_count", null, 1, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_Other_metadata(), theTypesPackage.getString(), "other_metadata", null, 0, -1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArchetype_Other_metadata_id(), theTypesPackage.getString(), "other_metadata_id", null, 0, -1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getArchetype__ValidateMustBeOwned__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateMustBeOwned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateOwnsObjectConstraints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateOwnsObjectConstraints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateSpecializesArchetype__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateSpecializesArchetype", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVOKUobjectkeyunique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVOKUobjectkeyunique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVARDTarchetypedefinitiontypenamevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARDTarchetypedefinitiontypenamevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVARIDarchetypeidentifiervalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARIDarchetypeidentifiervalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVDEOLoriginallanguagespecified__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDEOLoriginallanguagespecified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVARDdescriptionspecified__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARDdescriptionspecified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVASIDarchetypespecialisationparentidentifiervalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVASIDarchetypespecialisationparentidentifiervalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVALCarchetypelanguageconformance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVALCarchetypelanguageconformance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVACSDarchetypeconceptspecialisationdepth__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVACSDarchetypeconceptspecialisationdepth", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVATCDarchetypecodespecialisationlevelvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVATCDarchetypecodespecialisationlevelvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPEInvariantOriginalLanguageValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEInvariantOriginalLanguageValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPEInvariantConceptValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEInvariantConceptValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPEInvariantDefinitionExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEInvariantDefinitionExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPEInvariantTerminologyExists__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEInvariantTerminologyExists", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPEInvariantSpecialisationValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEInvariantSpecialisationValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPEInvariantRulesValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEInvariantRulesValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPEHRIDInvariantConceptIdValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEHRIDInvariantConceptIdValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPEHRIDInvariantBaseVersionValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEHRIDInvariantBaseVersionValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantIsSpecialised__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetype__ValidateAOMVARIABLEDECLARATIONInvariantNameValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARIABLEDECLARATIONInvariantNameValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(authoredResourceEClass, AuthoredResource.class, "AuthoredResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthoredResource_Copyright(), theTypesPackage.getString(), "copyright", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Current_revision(), theTypesPackage.getString(), "current_revision", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Custodian_namespace(), theTypesPackage.getString(), "custodian_namespace", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Custodian_organisation(), theTypesPackage.getString(), "custodian_organisation", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Licence(), theTypesPackage.getString(), "licence", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Lifecycle_state(), this.getLifecycle_state(), "lifecycle_state", null, 1, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Original_author_date(), theTypesPackage.getString(), "original_author_date", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Original_author_email(), theTypesPackage.getString(), "original_author_email", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Original_author_name(), theTypesPackage.getString(), "original_author_name", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Original_author_organization(), theTypesPackage.getString(), "original_author_organization", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Original_namespace(), theTypesPackage.getString(), "original_namespace", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Original_publisher(), theTypesPackage.getString(), "original_publisher", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Other_contributors(), theTypesPackage.getString(), "other_contributors", null, 0, -1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_OtherDetails(), theTypesPackage.getString(), "otherDetails", null, 0, -1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_OtherDetails_id(), theTypesPackage.getString(), "otherDetails_id", null, 0, -1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_References(), theTypesPackage.getString(), "references", null, 0, -1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_References_id(), theTypesPackage.getString(), "references_id", null, 0, -1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_ResourceDocumentLanguage(), theTypesPackage.getString(), "resourceDocumentLanguage", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_ResourceDocumentSyntax(), theTypesPackage.getString(), "resourceDocumentSyntax", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_ResourceSource(), theTypesPackage.getString(), "resourceSource", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_ResourceSourceURI(), theTypesPackage.getString(), "resourceSourceURI", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAuthoredResource_Base_Namespace(), theUMLPackage.getNamespace(), null, "base_Namespace", null, 1, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Resource_package_uri(), theTypesPackage.getString(), "resource_package_uri", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Uid(), theTypesPackage.getString(), "uid", null, 0, 1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Ip_acknowledgements(), theTypesPackage.getString(), "ip_acknowledgements", null, 0, -1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthoredResource_Ip_acknowledgements_id(), theTypesPackage.getString(), "ip_acknowledgements_id", null, 0, -1, AuthoredResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceTranslationEClass, ResourceTranslation.class, "ResourceTranslation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceTranslation_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Accreditation(), theTypesPackage.getString(), "accreditation", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Other_translation_details(), theTypesPackage.getString(), "other_translation_details", null, 0, -1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Other_translation_details_id(), theTypesPackage.getString(), "other_translation_details_id", null, 0, -1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Purpose(), theTypesPackage.getString(), "purpose", null, 1, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Keywords(), theTypesPackage.getString(), "keywords", null, 0, -1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Use(), theTypesPackage.getString(), "use", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Misuse(), theTypesPackage.getString(), "misuse", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Copyright(), theTypesPackage.getString(), "copyright", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Original_resource_uri(), theTypesPackage.getString(), "original_resource_uri", null, 0, -1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Original_resource_uriId(), theTypesPackage.getString(), "original_resource_uriId", null, 0, -1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Other_details(), theTypesPackage.getString(), "other_details", null, 0, -1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Other_detailsId(), theTypesPackage.getString(), "other_detailsId", null, 0, -1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Author_name(), theTypesPackage.getString(), "author_name", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Author_organization(), theTypesPackage.getString(), "author_organization", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Author_email(), theTypesPackage.getString(), "author_email", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Author_date(), theTypesPackage.getString(), "author_date", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceTranslation_Version_last_translated(), theTypesPackage.getString(), "version_last_translated", null, 0, 1, ResourceTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getResourceTranslation__ValidateAOMVOTMterminologytranslationsvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVOTMterminologytranslationsvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceTranslation__ValidateTranslationEntries__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateTranslationEntries", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceTranslation__ValidateUniqueEntries__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateUniqueEntries", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(archetypeDefinitionEClass, ArchetypeDefinition.class, "ArchetypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchetypeDefinition_Base_Usage(), theUMLPackage.getUsage(), null, "base_Usage", null, 1, 1, ArchetypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getArchetypeDefinition__ValidateAOMARCHETYPEHRIDInvariantRmClassNameValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPEHRIDInvariantRmClassNameValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(archetypeSlotEClass, ArchetypeSlot.class, "ArchetypeSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchetypeSlot_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, ArchetypeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getArchetypeSlot__ValidateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeSlot__ValidateAOMVDSEVarchetypeslotexcludeconstraintvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDSEVarchetypeslotexcludeconstraintvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeSlot__ValidateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeSlot__ValidateAOMVDSSIDslotredefinitionchildnodeid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDSSIDslotredefinitionchildnodeid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeSlot__ValidateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeSlot__ValidateAOMVDSIVarchetypeslotincludeconstraintvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVDSIVarchetypeslotincludeconstraintvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantincludesValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPESLOTInvariantincludesValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantexcludesValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMARCHETYPESLOTInvariantexcludesValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(archetypeRootEClass, ArchetypeRoot.class, "ArchetypeRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getArchetypeRoot__ValidateAOMVARXNCexternalreferencenodeidentifiervalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARXNCexternalreferencenodeidentifiervalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeRoot__ValidateAOMVARXTVexternalreferencetypevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARXTVexternalreferencetypevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeRoot__ValidateAOMVARXSexternalreferenceconformstoslot__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARXSexternalreferenceconformstoslot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeRoot__ValidateAOMVARXRexternalreferencereferstoresolvableartefact__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARXRexternalreferencereferstoresolvableartefact", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeRoot__ValidateAOMVARXIDexternalreferenceslotfillingidvalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARXIDexternalreferenceslotfillingidvalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeRoot__ValidateAOMCARCHETYPEROOTInvariantArchetypeRefValidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMCARCHETYPEROOTInvariantArchetypeRefValidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getArchetypeRoot__ValidateAOMVARXAVexternalreferencenodearchetypereferencevalidity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVARXAVexternalreferencenodearchetypereferencevalidity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceAnnotationNodeItemEClass, ResourceAnnotationNodeItem.class, "ResourceAnnotationNodeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceAnnotationNodeItem_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, ResourceAnnotationNodeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getResourceAnnotationNodeItem__ValidateAOMVRANPannotationpathvalid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateAOMVRANPannotationpathvalid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lifecycle_stateEEnum, Lifecycle_state.class, "Lifecycle_state");
		addEEnumLiteral(lifecycle_stateEEnum, Lifecycle_state.UNMANAGED);
		addEEnumLiteral(lifecycle_stateEEnum, Lifecycle_state.IN_DEVELOPMENT);
		addEEnumLiteral(lifecycle_stateEEnum, Lifecycle_state.RELEASE_CANDIDATE);
		addEEnumLiteral(lifecycle_stateEEnum, Lifecycle_state.PUBLISHED);
		addEEnumLiteral(lifecycle_stateEEnum, Lifecycle_state.REJECTED);
		addEEnumLiteral(lifecycle_stateEEnum, Lifecycle_state.DEPRECATED);

		initEEnum(versioN_STATUSEEnum, org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS.class, "VERSION_STATUS");
		addEEnumLiteral(versioN_STATUSEEnum, org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS.ALPHA);
		addEEnumLiteral(versioN_STATUSEEnum, org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS.BETA);
		addEEnumLiteral(versioN_STATUSEEnum, org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS.RELEASE_CANDIDATE);
		addEEnumLiteral(versioN_STATUSEEnum, org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS.RELEASED);
		addEEnumLiteral(versioN_STATUSEEnum, org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS.BUILD);

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
			 "originalName", "ConstraintProfile"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVARCNarchetypeconceptvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARCN- archetype concept validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVCARMattributenamereferencemodelvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCARM- attribute name reference model validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVCAEXarchetypeattributereferencemodelexistenceconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCAEX- archetype attribute reference model existence conformance"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCAM- archetype attribute reference model multiplicity conformance"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVDIFVarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDIFV- archetype attribute differential path validity:"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDIFP- specialised archetype attribute differential path validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSANCE- specialised archetype attribute node existence conformance"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVSAMspecialisedarchetypeattributemultiplicityconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSAM- specialised archetype attribute multiplicity conformance"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VACSO- single-valued attribute child object occurrences validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVACMCUcardinalityoccurrencesupperboundvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VACMCU- cardinality/occurrences upper bound validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVACMCOcardinalityoccurrencesorphans__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VACMCO- cardinality/occurrences orphans"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVCACAarchetypeattributereferencemodelcardinalityconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCACA- archetype attribute reference model cardinality conformance"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMWACMCLcardinalityoccurrenceslowerboundvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] WACMCL- cardinality/occurrences lower bound validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSANCC- specialised archetype attribute node cardinality conformance"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVCATUattributeuniqueness__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCATU- attribute uniqueness"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVUNTuseNodereferencemodeltypevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VUNT- use_node reference model type validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVUNPuseNodepathvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VUNP- use_node path validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVSUNTuseNodespecialisationparentvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSUNT- use_node specialisation parent validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVOBAVobjectnodeassumedvaluevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VOBAV- object node assumed value validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVACDFconstraintcodevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VACDF- constraint code validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSONPI- specialised archetype prohibited object node [AOM] node id validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCOBJECTInvariantRmTypeNameValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_OBJECT:Invariant:Rm_type_name_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantProhibitedValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_COMPLEX_OBJECT:Invariant:Prohibited_validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_COMPLEX_OBJECT:Invariant:Any_allowed_validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAttributesValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_COMPLEX_OBJECT:InvariantAttributes_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTTuplesValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_COMPLEX_OBJECT:Tuples_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_PRIMITIVE_OBJECT:Invariant:Representation_validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_PRIMITIVE_OBJECT:Invariant:Assumed_value_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantBinaryConsistency__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_BOOLEAN:Invariant:Binary_consistency"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantPrototypeValueConsistency__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_BOOLEAN:Invariant:Prototype_value_consistency"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCDATEInvariantPatternValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_DATE:Invariant:Pattern_validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_TERMINOLOGY_CODE:Invariant:Terminology_id_validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMASSERTIONInvariantTagValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ASSERTION:Invariant:Tag_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMASSERTIONInvariantExpressionValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ASSERTION:Invariant:Expression_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMQUERYVARIABLEInvariantContextValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] QUERY_VARIABLE:Invariant:Context_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMEXPRITEMInvariantTypeValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] EXPR_ITEM:Invariant:Type_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMEXPRUNARYOPERATORInvariantoperandValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] EXPR_UNARY_OPERATOR:Invariant:operand_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantleftOperandValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] EXPR_BINARY_OPERATOR:Invariant:left_operand_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantrightOperandValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] EXPR_BINARY_OPERATOR:Invariant:right_operand_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMOPERATORKINDInvariantValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] OPERATOR_KIND:Invariant:Validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVATDFvaluecodevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VATDF- value code validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVATDAvaluesetassumedvaluecodevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VATDA- value set assumed value code validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSONIF- specialised archetype object node identifier validity in flat siblings"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYInvariantConsistency__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_COMPLEX_OBJECT_PROXY:Invariant:Consistency"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:Children_validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOrphansValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:Children_orphans_validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:Children_occurrences_lower_sum_validity"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantCardinalityValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:Cardinality_valid"
		   });	
		addAnnotation
		  (getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantAlternativesValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:Alternatives_valid"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVCORMobjectconstrainttypenameexistence__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCORM- object constraint type name existence"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVCORMTobjectconstrainttypevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCORMT - object constraint type validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVCOCDobjectconstraintdefinitionvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCOCD- object constraint definition validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVCOIDobjectnodeidentifiervalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCOID- object node identifier validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVCOSUobjectnodeidentifiervalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VCOSU- object node identifier validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSONT- specialised archetype object node meta-type conformance"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSONCT- specialised archetype object node reference type conformance"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSONIN- specialised archetype new object node identifier validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSONCO- specialised archetype redefine object node occurrences validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSONPT- specialised archetype prohibited object node [AOM] type validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSONPO- specialised archetype object node prohibited occurrences validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMVSSMspecialisedarchetypesiblingordervalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VSSM- specialised archetype sibling order validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMARCHETYPECONSTRAINInvariantpathExists__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_CONSTRAIN:Invariant:path_exists"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCATTRIBUTEInvariantRmAttributeNameValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:Rm_attribute_name_valid"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCATTRIBUTEInvariantExistenceValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:Existence_valid"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCATTRIBUTEInvariantDifferentialPathValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:[Differential_path_valid"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildOccurrencesValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ATTRIBUTE:Invariant:Child_occurrences_validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCARDINALITYInvariantValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] CARDINALITY:Invariant:Validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCOBJECTInvariantNodeIdValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_OBJECT:Invariant:Node_id_valid"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCOBJECTInvariantOccurrencesValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_OBJECT:Invariant:Occurrences_validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCOBJECTInvariantSiblingOrderValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_OBJECT:Invariant:Sibling_order_validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMSIBLINGORDERInvariantsiblingNodeIdValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] SIBLING_ORDER:Invariant:sibling_node_id_validity"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCDEFINEDOBJECTInvariantDefaultValueValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_DEFINED_OBJECT:Invariant:Default_value_valid"
		   });	
		addAnnotation
		  (getObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYTargetPathValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_COMPLEX_OBJECT_PROXY:Target_path_valid"
		   });	
		addAnnotation
		  (getArchetypeLibrary__ValidateAOMARCHETYPEHRIDInvariantRmClosureValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_HRID:Invariant:Rm_closure_validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVOKUobjectkeyunique__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VOKU- object key unique"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVARDTarchetypedefinitiontypenamevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARDT- archetype definition typename validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVARIDarchetypeidentifiervalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARID- archetype identifier validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVDEOLoriginallanguagespecified__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDEOL- original language specified"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVARDdescriptionspecified__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARD- description specified"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVASIDarchetypespecialisationparentidentifiervalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VASID- archetype specialisation parent identifier validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVALCarchetypelanguageconformance__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VALC- archetype language conformance"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVACSDarchetypeconceptspecialisationdepth__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VACSD- archetype concept specialisation depth"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVATCDarchetypecodespecialisationlevelvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VATCD- archetype code specialisation level validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPEInvariantOriginalLanguageValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE:Invariant:Original_language_valid"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPEInvariantConceptValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE:Invariant:Concept_valid"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPEInvariantDefinitionExists__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE:Invariant:Definition_exists"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPEInvariantTerminologyExists__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE:Invariant:Terminology_exists"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPEInvariantSpecialisationValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE:Invariant:Specialisation_validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPEInvariantRulesValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE:Invariant:Rules_valid"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPEHRIDInvariantConceptIdValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_HRID:Invariant:Concept_id_validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPEHRIDInvariantBaseVersionValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_HRID:Invariant:Base_version_validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantIsSpecialised__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] OPERATIONAL_TEMPLATE:Invariant:Is_specialised"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] OPERATIONAL_TEMPLATE:Invariant:Component_terminologies_existence"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_TERMINOLOGY:Invariant:original_language_validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_TERMINOLOGY:Invariant:concept_code_validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_TERMINOLOGY:Invariant:term_definitions_validity"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_TERMINOLOGY:Invariant:Parent_archetype_valid"
		   });	
		addAnnotation
		  (getArchetype__ValidateAOMVARIABLEDECLARATIONInvariantNameValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARIABLE_DECLARATION:Invariant:Name_valid"
		   });	
		addAnnotation
		  (getResourceTranslation__ValidateAOMVOTMterminologytranslationsvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VOTM- terminology translations validity"
		   });	
		addAnnotation
		  (getArchetypeDefinition__ValidateAOMARCHETYPEHRIDInvariantRmClassNameValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_HRID:Invariant:Rm_class_name_validity"
		   });	
		addAnnotation
		  (getArchetypeSlot__ValidateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDSSP- specialised archetype slot definition parent validity"
		   });	
		addAnnotation
		  (getArchetypeSlot__ValidateAOMVDSEVarchetypeslotexcludeconstraintvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDSEV- archetype slot \u2018exclude\u2019 constraint validity"
		   });	
		addAnnotation
		  (getArchetypeSlot__ValidateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDSSM- specialised archetype slot definition match validity"
		   });	
		addAnnotation
		  (getArchetypeSlot__ValidateAOMVDSSIDslotredefinitionchildnodeid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDSSID- slot redefinition child node id"
		   });	
		addAnnotation
		  (getArchetypeSlot__ValidateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDSSC- specialised archetype slot definition closed validity"
		   });	
		addAnnotation
		  (getArchetypeSlot__ValidateAOMVDSIVarchetypeslotincludeconstraintvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VDSIV- archetype slot \u2018include\u2019 constraint validity"
		   });	
		addAnnotation
		  (getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantincludesValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_SLOT:Invariant:includes_valid"
		   });	
		addAnnotation
		  (getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantexcludesValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] ARCHETYPE_SLOT:Invariant:excludes_valid"
		   });	
		addAnnotation
		  (getArchetypeRoot__ValidateAOMVARXNCexternalreferencenodeidentifiervalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARXNC- external reference node identifier validity"
		   });	
		addAnnotation
		  (getArchetypeRoot__ValidateAOMVARXTVexternalreferencetypevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARXTV- external reference type validity"
		   });	
		addAnnotation
		  (getArchetypeRoot__ValidateAOMVARXSexternalreferenceconformstoslot__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARXS- external reference conforms to slot"
		   });	
		addAnnotation
		  (getArchetypeRoot__ValidateAOMVARXRexternalreferencereferstoresolvableartefact__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARXR- external reference refers to resolvable artefact"
		   });	
		addAnnotation
		  (getArchetypeRoot__ValidateAOMVARXIDexternalreferenceslotfillingidvalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARXID- external reference slot filling id validity"
		   });	
		addAnnotation
		  (getArchetypeRoot__ValidateAOMCARCHETYPEROOTInvariantArchetypeRefValidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] C_ARCHETYPE_ROOT:Invariant:Archetype_ref_validity"
		   });	
		addAnnotation
		  (getArchetypeRoot__ValidateAOMVARXAVexternalreferencenodearchetypereferencevalidity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VARXAV- external reference node archetype reference validity"
		   });	
		addAnnotation
		  (getResourceAnnotationNodeItem__ValidateAOMVRANPannotationpathvalid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "originalName", "[AOM] VRANP- annotation path valid"
		   });
	}

} //ConstraintPackageImpl
