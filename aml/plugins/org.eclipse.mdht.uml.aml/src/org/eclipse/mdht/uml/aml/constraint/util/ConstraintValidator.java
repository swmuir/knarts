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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.constraint.*;

import org.eclipse.mdht.uml.aml.terminology.util.TerminologyValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage
 * @generated
 */
public class ConstraintValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConstraintValidator INSTANCE = new ConstraintValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.mdht.uml.aml.constraint";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Single Parent' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__SINGLE_PARENT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate All Attribute Constraints' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__ALL_ATTRIBUTE_CONSTRAINTS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARC Narchetypeconceptvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVARC_NARCHETYPECONCEPTVALIDITY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCAR Mattributenamereferencemodelvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVCAR_MATTRIBUTENAMEREFERENCEMODELVALIDITY = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCAE Xarchetypeattributereferencemodelexistenceconformance' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVCAE_XARCHETYPEATTRIBUTEREFERENCEMODELEXISTENCECONFORMANCE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCA Marchetypeattributereferencemodelmultiplicityconformance' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVCA_MARCHETYPEATTRIBUTEREFERENCEMODELMULTIPLICITYCONFORMANCE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDIF Varchetypeattributedifferentialpathvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVDIF_VARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDIF Pspecialisedarchetypeattributedifferentialpathvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVDIF_PSPECIALISEDARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSANC Especialisedarchetypeattributenodeexistenceconformance' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVSANC_ESPECIALISEDARCHETYPEATTRIBUTENODEEXISTENCECONFORMANCE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSA Mspecialisedarchetypeattributemultiplicityconformance' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVSA_MSPECIALISEDARCHETYPEATTRIBUTEMULTIPLICITYCONFORMANCE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVACS Osinglevaluedattributechildobjectoccurrencesvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVACS_OSINGLEVALUEDATTRIBUTECHILDOBJECTOCCURRENCESVALIDITY = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVACMC Ucardinalityoccurrencesupperboundvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVACMC_UCARDINALITYOCCURRENCESUPPERBOUNDVALIDITY = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVACMC Ocardinalityoccurrencesorphans' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVACMC_OCARDINALITYOCCURRENCESORPHANS = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCAC Aarchetypeattributereferencemodelcardinalityconformance' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVCAC_AARCHETYPEATTRIBUTEREFERENCEMODELCARDINALITYCONFORMANCE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMWACMC Lcardinalityoccurrenceslowerboundvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMWACMC_LCARDINALITYOCCURRENCESLOWERBOUNDVALIDITY = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSANC Cspecialisedarchetypeattributenodecardinalityconformance' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVSANC_CSPECIALISEDARCHETYPEATTRIBUTENODECARDINALITYCONFORMANCE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCAT Uattributeuniqueness' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVCAT_UATTRIBUTEUNIQUENESS = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVUN Tuse Nodereferencemodeltypevalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVUN_TUSE_NODEREFERENCEMODELTYPEVALIDITY = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVUN Puse Nodepathvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVUN_PUSE_NODEPATHVALIDITY = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSUN Tuse Nodespecialisationparentvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVSUN_TUSE_NODESPECIALISATIONPARENTVALIDITY = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVOBA Vobjectnodeassumedvaluevalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVOBA_VOBJECTNODEASSUMEDVALUEVALIDITY = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVACD Fconstraintcodevalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVACD_FCONSTRAINTCODEVALIDITY = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSONP Ispecialisedarchetypeprohibitedobjectnode AO Mnodeidvalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVSONP_ISPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MNODEIDVALIDITY = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCOBJECT Invariant Rm Type Name Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCOBJECT_INVARIANT_RM_TYPE_NAME_VALID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCCOMPLEXOBJECT Invariant Prohibited Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECT_INVARIANT_PROHIBITED_VALIDITY = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCCOMPLEXOBJECT Invariant Any Allowed Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECT_INVARIANT_ANY_ALLOWED_VALIDITY = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCCOMPLEXOBJECT Invariant Attributes Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECT_INVARIANT_ATTRIBUTES_VALID = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCCOMPLEXOBJECT Tuples Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECT_TUPLES_VALID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCPRIMITIVEOBJECT Invariant Representation Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCPRIMITIVEOBJECT_INVARIANT_REPRESENTATION_VALIDITY = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCPRIMITIVEOBJECT Invariant Assumed Value Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCPRIMITIVEOBJECT_INVARIANT_ASSUMED_VALUE_VALID = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCBOOLEAN Invariant Binary Consistency' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCBOOLEAN_INVARIANT_BINARY_CONSISTENCY = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCBOOLEAN Invariant Prototype Value Consistency' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCBOOLEAN_INVARIANT_PROTOTYPE_VALUE_CONSISTENCY = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCDATE Invariant Pattern Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCDATE_INVARIANT_PATTERN_VALIDITY = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCTERMINOLOGYCODE Invariant Terminology Id Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCTERMINOLOGYCODE_INVARIANT_TERMINOLOGY_ID_VALIDITY = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMASSERTION Invariant Tag Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMASSERTION_INVARIANT_TAG_VALID = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMASSERTION Invariant Expression Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMASSERTION_INVARIANT_EXPRESSION_VALID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMQUERYVARIABLE Invariant Context Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMQUERYVARIABLE_INVARIANT_CONTEXT_VALID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMEXPRITEM Invariant Type Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMEXPRITEM_INVARIANT_TYPE_VALID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMEXPRUNARYOPERATOR Invariantoperand Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMEXPRUNARYOPERATOR_INVARIANTOPERAND_VALID = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMEXPRBINARYOPERATOR Invariantleft Operand Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMEXPRBINARYOPERATOR_INVARIANTLEFT_OPERAND_VALID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMEXPRBINARYOPERATOR Invariantright Operand Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMEXPRBINARYOPERATOR_INVARIANTRIGHT_OPERAND_VALID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMOPERATORKIND Invariant Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMOPERATORKIND_INVARIANT_VALIDITY = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVATD Fvaluecodevalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVATD_FVALUECODEVALIDITY = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVATD Avaluesetassumedvaluecodevalidity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVATD_AVALUESETASSUMEDVALUECODEVALIDITY = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSONI Fspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMVSONI_FSPECIALISEDARCHETYPEOBJECTNODEIDENTIFIERVALIDITYINFLATSIBLINGS = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCCOMPLEXOBJECTPROXY Invariant Consistency' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECTPROXY_INVARIANT_CONSISTENCY = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Children Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CHILDREN_VALIDITY = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Children Orphans Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CHILDREN_ORPHANS_VALIDITY = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Children Occurrences Lower Sum Validity' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CHILDREN_OCCURRENCES_LOWER_SUM_VALIDITY = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Cardinality Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CARDINALITY_VALID = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Alternatives Valid' of 'Complex Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_ALTERNATIVES_VALID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Redefines Generalization' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__REDEFINES_GENERALIZATION = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCOR Mobjectconstrainttypenameexistence' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCORM Tobjectconstrainttypevalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCOC Dobjectconstraintdefinitionvalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCOI Dobjectnodeidentifiervalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVCOS Uobjectnodeidentifiervalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSON Tspecialisedarchetypeobjectnodemetatypeconformance' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSONC Tspecialisedarchetypeobjectnodereferencetypeconformance' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSONI Nspecialisedarchetypenewobjectnodeidentifiervalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSONC Ospecialisedarchetyperedefineobjectnodeoccurrencesvalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSONP Tspecialisedarchetypeprohibitedobjectnode AO Mtypevalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSONP Ospecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVSS Mspecialisedarchetypesiblingordervalidity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPECONSTRAIN Invariantpath Exists' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Rm Attribute Name Valid' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Existence Valid' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Differential Path Valid' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCATTRIBUTE Invariant Child Occurrences Validity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCARDINALITY Invariant Validity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCARDINALITY_INVARIANT_VALIDITY = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCOBJECT Invariant Node Id Valid' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCOBJECT_INVARIANT_NODE_ID_VALID = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCOBJECT Invariant Occurrences Validity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCOBJECT Invariant Sibling Order Validity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMSIBLINGORDER Invariantsibling Node Id Validity' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCDEFINEDOBJECT Invariant Default Value Valid' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCCOMPLEXOBJECTPROXY Target Path Valid' of 'Object Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Specific Object Constraint' of 'Constrains'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINS__SPECIFIC_OBJECT_CONSTRAINT = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Constrains RM Element' of 'Constrains'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINS__CONSTRAINS_RM_ELEMENT = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate One Reference Model' of 'Archetype Library'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_LIBRARY__ONE_REFERENCE_MODEL = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Only Archetypes' of 'Archetype Library'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_LIBRARY__ONLY_ARCHETYPES = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPEHRID Invariant Rm Closure Validity' of 'Archetype Library'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_LIBRARY__AOMARCHETYPEHRID_INVARIANT_RM_CLOSURE_VALIDITY = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Must Be Owned' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__MUST_BE_OWNED = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Owns Object Constraints' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__OWNS_OBJECT_CONSTRAINTS = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Specializes Archetype' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__SPECIALIZES_ARCHETYPE = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVOK Uobjectkeyunique' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVOK_UOBJECTKEYUNIQUE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARD Tarchetypedefinitiontypenamevalidity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVARD_TARCHETYPEDEFINITIONTYPENAMEVALIDITY = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARI Darchetypeidentifiervalidity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVARI_DARCHETYPEIDENTIFIERVALIDITY = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDEO Loriginallanguagespecified' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVDEO_LORIGINALLANGUAGESPECIFIED = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVAR Ddescriptionspecified' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVAR_DDESCRIPTIONSPECIFIED = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVASI Darchetypespecialisationparentidentifiervalidity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVASI_DARCHETYPESPECIALISATIONPARENTIDENTIFIERVALIDITY = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVAL Carchetypelanguageconformance' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVAL_CARCHETYPELANGUAGECONFORMANCE = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVACS Darchetypeconceptspecialisationdepth' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVACS_DARCHETYPECONCEPTSPECIALISATIONDEPTH = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVATC Darchetypecodespecialisationlevelvalidity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVATC_DARCHETYPECODESPECIALISATIONLEVELVALIDITY = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPE Invariant Original Language Valid' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPE_INVARIANT_ORIGINAL_LANGUAGE_VALID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPE Invariant Concept Valid' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPE_INVARIANT_CONCEPT_VALID = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPE Invariant Definition Exists' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPE_INVARIANT_DEFINITION_EXISTS = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPE Invariant Terminology Exists' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPE_INVARIANT_TERMINOLOGY_EXISTS = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPE Invariant Specialisation Validity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPE_INVARIANT_SPECIALISATION_VALIDITY = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPE Invariant Rules Valid' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPE_INVARIANT_RULES_VALID = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPEHRID Invariant Concept Id Validity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPEHRID_INVARIANT_CONCEPT_ID_VALIDITY = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPEHRID Invariant Base Version Validity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPEHRID_INVARIANT_BASE_VERSION_VALIDITY = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMOPERATIONALTEMPLATE Invariant Is Specialised' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMOPERATIONALTEMPLATE_INVARIANT_IS_SPECIALISED = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMOPERATIONALTEMPLATE Invariant Component Terminologies Existence' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMOPERATIONALTEMPLATE_INVARIANT_COMPONENT_TERMINOLOGIES_EXISTENCE = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPETERMINOLOGY Invariantoriginal Language Validity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPETERMINOLOGY_INVARIANTORIGINAL_LANGUAGE_VALIDITY = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPETERMINOLOGY Invariantconcept Code Validity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPETERMINOLOGY_INVARIANTCONCEPT_CODE_VALIDITY = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPETERMINOLOGY Invariantterm Definitions Validity' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPETERMINOLOGY_INVARIANTTERM_DEFINITIONS_VALIDITY = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPETERMINOLOGY Invariant Parent Archetype Valid' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMARCHETYPETERMINOLOGY_INVARIANT_PARENT_ARCHETYPE_VALID = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARIABLEDECLARATION Invariant Name Valid' of 'Archetype'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE__AOMVARIABLEDECLARATION_INVARIANT_NAME_VALID = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVOT Mterminologytranslationsvalidity' of 'Resource Translation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_TRANSLATION__AOMVOT_MTERMINOLOGYTRANSLATIONSVALIDITY = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Translation Entries' of 'Resource Translation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_TRANSLATION__TRANSLATION_ENTRIES = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unique Entries' of 'Resource Translation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_TRANSLATION__UNIQUE_ENTRIES = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPEHRID Invariant Rm Class Name Validity' of 'Archetype Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_DEFINITION__AOMARCHETYPEHRID_INVARIANT_RM_CLASS_NAME_VALIDITY = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDSS Pspecialisedarchetypeslotdefinitionparentvalidity' of 'Archetype Slot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_SLOT__AOMVDSS_PSPECIALISEDARCHETYPESLOTDEFINITIONPARENTVALIDITY = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDSE Varchetypeslotexcludeconstraintvalidity' of 'Archetype Slot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_SLOT__AOMVDSE_VARCHETYPESLOTEXCLUDECONSTRAINTVALIDITY = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDSS Mspecialisedarchetypeslotdefinitionmatchvalidity' of 'Archetype Slot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_SLOT__AOMVDSS_MSPECIALISEDARCHETYPESLOTDEFINITIONMATCHVALIDITY = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDSSI Dslotredefinitionchildnodeid' of 'Archetype Slot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_SLOT__AOMVDSSI_DSLOTREDEFINITIONCHILDNODEID = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDSS Cspecialisedarchetypeslotdefinitionclosedvalidity' of 'Archetype Slot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_SLOT__AOMVDSS_CSPECIALISEDARCHETYPESLOTDEFINITIONCLOSEDVALIDITY = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVDSI Varchetypeslotincludeconstraintvalidity' of 'Archetype Slot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_SLOT__AOMVDSI_VARCHETYPESLOTINCLUDECONSTRAINTVALIDITY = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPESLOT Invariantincludes Valid' of 'Archetype Slot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_SLOT__AOMARCHETYPESLOT_INVARIANTINCLUDES_VALID = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPESLOT Invariantexcludes Valid' of 'Archetype Slot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_SLOT__AOMARCHETYPESLOT_INVARIANTEXCLUDES_VALID = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARXN Cexternalreferencenodeidentifiervalidity' of 'Archetype Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_ROOT__AOMVARXN_CEXTERNALREFERENCENODEIDENTIFIERVALIDITY = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARXT Vexternalreferencetypevalidity' of 'Archetype Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_ROOT__AOMVARXT_VEXTERNALREFERENCETYPEVALIDITY = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARX Sexternalreferenceconformstoslot' of 'Archetype Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_ROOT__AOMVARX_SEXTERNALREFERENCECONFORMSTOSLOT = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARX Rexternalreferencereferstoresolvableartefact' of 'Archetype Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_ROOT__AOMVARX_REXTERNALREFERENCEREFERSTORESOLVABLEARTEFACT = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARXI Dexternalreferenceslotfillingidvalidity' of 'Archetype Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_ROOT__AOMVARXI_DEXTERNALREFERENCESLOTFILLINGIDVALIDITY = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMCARCHETYPEROOT Invariant Archetype Ref Validity' of 'Archetype Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_ROOT__AOMCARCHETYPEROOT_INVARIANT_ARCHETYPE_REF_VALIDITY = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVARXA Vexternalreferencenodearchetypereferencevalidity' of 'Archetype Root'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARCHETYPE_ROOT__AOMVARXA_VEXTERNALREFERENCENODEARCHETYPEREFERENCEVALIDITY = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMVRAN Pannotationpathvalid' of 'Resource Annotation Node Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_ANNOTATION_NODE_ITEM__AOMVRAN_PANNOTATIONPATHVALID = 128;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 128;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyValidator terminologyValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintValidator() {
		super();
		terminologyValidator = TerminologyValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ConstraintPackage.eINSTANCE;
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
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT:
				return validateComplexObjectConstraint((ComplexObjectConstraint)value, diagnostics, context);
			case ConstraintPackage.OBJECT_CONSTRAINT:
				return validateObjectConstraint((ObjectConstraint)value, diagnostics, context);
			case ConstraintPackage.CONSTRAINS:
				return validateConstrains((Constrains)value, diagnostics, context);
			case ConstraintPackage.ARCHETYPE_LIBRARY:
				return validateArchetypeLibrary((ArchetypeLibrary)value, diagnostics, context);
			case ConstraintPackage.ARCHETYPE:
				return validateArchetype((Archetype)value, diagnostics, context);
			case ConstraintPackage.AUTHORED_RESOURCE:
				return validateAuthoredResource((AuthoredResource)value, diagnostics, context);
			case ConstraintPackage.RESOURCE_TRANSLATION:
				return validateResourceTranslation((ResourceTranslation)value, diagnostics, context);
			case ConstraintPackage.ARCHETYPE_DEFINITION:
				return validateArchetypeDefinition((ArchetypeDefinition)value, diagnostics, context);
			case ConstraintPackage.ARCHETYPE_SLOT:
				return validateArchetypeSlot((ArchetypeSlot)value, diagnostics, context);
			case ConstraintPackage.ARCHETYPE_ROOT:
				return validateArchetypeRoot((ArchetypeRoot)value, diagnostics, context);
			case ConstraintPackage.RESOURCE_ANNOTATION_NODE_ITEM:
				return validateResourceAnnotationNodeItem((ResourceAnnotationNodeItem)value, diagnostics, context);
			case ConstraintPackage.LIFECYCLE_STATE:
				return validateLifecycle_state((Lifecycle_state)value, diagnostics, context);
			case ConstraintPackage.VERSION_STATUS:
				return validateVERSION_STATUS((VERSION_STATUS)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(complexObjectConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= terminologyValidator.validateIdentifiedItem_validateUniqueScopes(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateRedefinesGeneralization(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCORMobjectconstrainttypenameexistence(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCORMTobjectconstrainttypevalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOCDobjectconstraintdefinitionvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOIDobjectnodeidentifiervalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOSUobjectnodeidentifiervalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSSMspecialisedarchetypesiblingordervalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMARCHETYPECONSTRAINInvariantpathExists(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantRmAttributeNameValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantExistenceValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantDifferentialPathValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCARDINALITYInvariantValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantNodeIdValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantOccurrencesValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantSiblingOrderValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateSingleParent(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAllAttributeConstraints(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVARCNarchetypeconceptvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCARMattributenamereferencemodelvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVDIFVarchetypeattributedifferentialpathvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVACMCUcardinalityoccurrencesupperboundvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVACMCOcardinalityoccurrencesorphans(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCATUattributeuniqueness(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVUNTuseNodereferencemodeltypevalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVUNPuseNodepathvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSUNTuseNodespecialisationparentvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVOBAVobjectnodeassumedvaluevalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVACDFconstraintcodevalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCOBJECTInvariantRmTypeNameValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantAttributesValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTTuplesValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCBOOLEANInvariantBinaryConsistency(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCBOOLEANInvariantPrototypeValueConsistency(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCDATEInvariantPatternValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMASSERTIONInvariantTagValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMASSERTIONInvariantExpressionValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMQUERYVARIABLEInvariantContextValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMEXPRITEMInvariantTypeValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMEXPRUNARYOPERATORInvariantoperandValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMEXPRBINARYOPERATORInvariantleftOperandValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMEXPRBINARYOPERATORInvariantrightOperandValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMOPERATORKINDInvariantValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVATDFvaluecodevalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVATDAvaluesetassumedvaluecodevalidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenOrphansValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantCardinalityValid(complexObjectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantAlternativesValid(complexObjectConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSingleParent constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateSingleParent(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateSingleParent(diagnostics, context);
	}

	/**
	 * Validates the validateAllAttributeConstraints constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAllAttributeConstraints(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAllAttributeConstraints(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARCNarchetypeconceptvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVARCNarchetypeconceptvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVARCNarchetypeconceptvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCARMattributenamereferencemodelvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVCARMattributenamereferencemodelvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVCARMattributenamereferencemodelvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVDIFVarchetypeattributedifferentialpathvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVDIFVarchetypeattributedifferentialpathvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVDIFVarchetypeattributedifferentialpathvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVACMCUcardinalityoccurrencesupperboundvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVACMCUcardinalityoccurrencesupperboundvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVACMCUcardinalityoccurrencesupperboundvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVACMCOcardinalityoccurrencesorphans constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVACMCOcardinalityoccurrencesorphans(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVACMCOcardinalityoccurrencesorphans(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCATUattributeuniqueness constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVCATUattributeuniqueness(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVCATUattributeuniqueness(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVUNTuseNodereferencemodeltypevalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVUNTuseNodereferencemodeltypevalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVUNTuseNodereferencemodeltypevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVUNPuseNodepathvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVUNPuseNodepathvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVUNPuseNodepathvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSUNTuseNodespecialisationparentvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVSUNTuseNodespecialisationparentvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVSUNTuseNodespecialisationparentvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVOBAVobjectnodeassumedvaluevalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVOBAVobjectnodeassumedvaluevalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVOBAVobjectnodeassumedvaluevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVACDFconstraintcodevalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVACDFconstraintcodevalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVACDFconstraintcodevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCOBJECTInvariantRmTypeNameValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCOBJECTInvariantRmTypeNameValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCOBJECTInvariantRmTypeNameValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCCOMPLEXOBJECTInvariantAttributesValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantAttributesValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCCOMPLEXOBJECTInvariantAttributesValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCCOMPLEXOBJECTTuplesValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTTuplesValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCCOMPLEXOBJECTTuplesValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCBOOLEANInvariantBinaryConsistency constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCBOOLEANInvariantBinaryConsistency(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCBOOLEANInvariantBinaryConsistency(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCBOOLEANInvariantPrototypeValueConsistency constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCBOOLEANInvariantPrototypeValueConsistency(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCBOOLEANInvariantPrototypeValueConsistency(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCDATEInvariantPatternValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCDATEInvariantPatternValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCDATEInvariantPatternValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMASSERTIONInvariantTagValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMASSERTIONInvariantTagValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMASSERTIONInvariantTagValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMASSERTIONInvariantExpressionValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMASSERTIONInvariantExpressionValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMASSERTIONInvariantExpressionValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMQUERYVARIABLEInvariantContextValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMQUERYVARIABLEInvariantContextValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMQUERYVARIABLEInvariantContextValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMEXPRITEMInvariantTypeValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMEXPRITEMInvariantTypeValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMEXPRITEMInvariantTypeValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMEXPRUNARYOPERATORInvariantoperandValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMEXPRUNARYOPERATORInvariantoperandValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMEXPRUNARYOPERATORInvariantoperandValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMEXPRBINARYOPERATORInvariantleftOperandValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMEXPRBINARYOPERATORInvariantleftOperandValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMEXPRBINARYOPERATORInvariantleftOperandValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMEXPRBINARYOPERATORInvariantrightOperandValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMEXPRBINARYOPERATORInvariantrightOperandValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMEXPRBINARYOPERATORInvariantrightOperandValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMOPERATORKINDInvariantValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMOPERATORKINDInvariantValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMOPERATORKINDInvariantValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVATDFvaluecodevalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVATDFvaluecodevalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVATDFvaluecodevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVATDAvaluesetassumedvaluecodevalidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVATDAvaluesetassumedvaluecodevalidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVATDAvaluesetassumedvaluecodevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantChildrenValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCATTRIBUTEInvariantChildrenValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantChildrenOrphansValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenOrphansValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCATTRIBUTEInvariantChildrenOrphansValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantCardinalityValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantCardinalityValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCATTRIBUTEInvariantCardinalityValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantAlternativesValid constraint of '<em>Complex Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantAlternativesValid(ComplexObjectConstraint complexObjectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexObjectConstraint.validateAOMCATTRIBUTEInvariantAlternativesValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= terminologyValidator.validateIdentifiedItem_validateUniqueScopes(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateRedefinesGeneralization(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCORMobjectconstrainttypenameexistence(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCORMTobjectconstrainttypevalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOCDobjectconstraintdefinitionvalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOIDobjectnodeidentifiervalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOSUobjectnodeidentifiervalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSSMspecialisedarchetypesiblingordervalidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMARCHETYPECONSTRAINInvariantpathExists(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantRmAttributeNameValid(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantExistenceValid(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantDifferentialPathValid(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCARDINALITYInvariantValidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantNodeIdValid(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantOccurrencesValidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantSiblingOrderValidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(objectConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(objectConstraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateRedefinesGeneralization constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateRedefinesGeneralization(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateRedefinesGeneralization(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCORMobjectconstrainttypenameexistence constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVCORMobjectconstrainttypenameexistence(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVCORMobjectconstrainttypenameexistence(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCORMTobjectconstrainttypevalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVCORMTobjectconstrainttypevalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVCORMTobjectconstrainttypevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCOCDobjectconstraintdefinitionvalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVCOCDobjectconstraintdefinitionvalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVCOCDobjectconstraintdefinitionvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCOIDobjectnodeidentifiervalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVCOIDobjectnodeidentifiervalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVCOIDobjectnodeidentifiervalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVCOSUobjectnodeidentifiervalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVCOSUobjectnodeidentifiervalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVCOSUobjectnodeidentifiervalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVSSMspecialisedarchetypesiblingordervalidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMVSSMspecialisedarchetypesiblingordervalidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMVSSMspecialisedarchetypesiblingordervalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPECONSTRAINInvariantpathExists constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMARCHETYPECONSTRAINInvariantpathExists(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMARCHETYPECONSTRAINInvariantpathExists(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantRmAttributeNameValid constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCATTRIBUTEInvariantRmAttributeNameValid(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCATTRIBUTEInvariantRmAttributeNameValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantExistenceValid constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCATTRIBUTEInvariantExistenceValid(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCATTRIBUTEInvariantExistenceValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantDifferentialPathValid constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCATTRIBUTEInvariantDifferentialPathValid(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCATTRIBUTEInvariantDifferentialPathValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCATTRIBUTEInvariantChildOccurrencesValidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCARDINALITYInvariantValidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCARDINALITYInvariantValidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCARDINALITYInvariantValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCOBJECTInvariantNodeIdValid constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCOBJECTInvariantNodeIdValid(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCOBJECTInvariantNodeIdValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCOBJECTInvariantOccurrencesValidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCOBJECTInvariantOccurrencesValidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCOBJECTInvariantOccurrencesValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCOBJECTInvariantSiblingOrderValidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCOBJECTInvariantSiblingOrderValidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCOBJECTInvariantSiblingOrderValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCDEFINEDOBJECTInvariantDefaultValueValid constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCCOMPLEXOBJECTPROXYTargetPathValid constraint of '<em>Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectConstraint_validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(ObjectConstraint objectConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return objectConstraint.validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrains(Constrains constrains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constrains, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstrains_validateSpecificObjectConstraint(constrains, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstrains_validateConstrainsRMElement(constrains, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSpecificObjectConstraint constraint of '<em>Constrains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrains_validateSpecificObjectConstraint(Constrains constrains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return constrains.validateSpecificObjectConstraint(diagnostics, context);
	}

	/**
	 * Validates the validateConstrainsRMElement constraint of '<em>Constrains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrains_validateConstrainsRMElement(Constrains constrains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return constrains.validateConstrainsRMElement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeLibrary(ArchetypeLibrary archetypeLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(archetypeLibrary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeLibrary_validateOneReferenceModel(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeLibrary_validateOnlyArchetypes(archetypeLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeLibrary_validateAOMARCHETYPEHRIDInvariantRmClosureValidity(archetypeLibrary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOneReferenceModel constraint of '<em>Archetype Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeLibrary_validateOneReferenceModel(ArchetypeLibrary archetypeLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeLibrary.validateOneReferenceModel(diagnostics, context);
	}

	/**
	 * Validates the validateOnlyArchetypes constraint of '<em>Archetype Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeLibrary_validateOnlyArchetypes(ArchetypeLibrary archetypeLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeLibrary.validateOnlyArchetypes(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEHRIDInvariantRmClosureValidity constraint of '<em>Archetype Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeLibrary_validateAOMARCHETYPEHRIDInvariantRmClosureValidity(ArchetypeLibrary archetypeLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeLibrary.validateAOMARCHETYPEHRIDInvariantRmClosureValidity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(archetype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateMustBeOwned(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateOwnsObjectConstraints(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateSpecializesArchetype(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVOKUobjectkeyunique(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVARDTarchetypedefinitiontypenamevalidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVARIDarchetypeidentifiervalidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVDEOLoriginallanguagespecified(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVARDdescriptionspecified(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVASIDarchetypespecialisationparentidentifiervalidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVALCarchetypelanguageconformance(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVACSDarchetypeconceptspecialisationdepth(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVATCDarchetypecodespecialisationlevelvalidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPEInvariantOriginalLanguageValid(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPEInvariantConceptValid(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPEInvariantDefinitionExists(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPEInvariantTerminologyExists(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPEInvariantSpecialisationValidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPEInvariantRulesValid(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPEHRIDInvariantConceptIdValidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPEHRIDInvariantBaseVersionValidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid(archetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetype_validateAOMVARIABLEDECLARATIONInvariantNameValid(archetype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMustBeOwned constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateMustBeOwned(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateMustBeOwned(diagnostics, context);
	}

	/**
	 * Validates the validateOwnsObjectConstraints constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateOwnsObjectConstraints(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateOwnsObjectConstraints(diagnostics, context);
	}

	/**
	 * Validates the validateSpecializesArchetype constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateSpecializesArchetype(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateSpecializesArchetype(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVOKUobjectkeyunique constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVOKUobjectkeyunique(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVOKUobjectkeyunique(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARDTarchetypedefinitiontypenamevalidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVARDTarchetypedefinitiontypenamevalidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVARDTarchetypedefinitiontypenamevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARIDarchetypeidentifiervalidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVARIDarchetypeidentifiervalidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVARIDarchetypeidentifiervalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVDEOLoriginallanguagespecified constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVDEOLoriginallanguagespecified(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVDEOLoriginallanguagespecified(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARDdescriptionspecified constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVARDdescriptionspecified(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVARDdescriptionspecified(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVASIDarchetypespecialisationparentidentifiervalidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVASIDarchetypespecialisationparentidentifiervalidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVASIDarchetypespecialisationparentidentifiervalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVALCarchetypelanguageconformance constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVALCarchetypelanguageconformance(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVALCarchetypelanguageconformance(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVACSDarchetypeconceptspecialisationdepth constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVACSDarchetypeconceptspecialisationdepth(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVACSDarchetypeconceptspecialisationdepth(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVATCDarchetypecodespecialisationlevelvalidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVATCDarchetypecodespecialisationlevelvalidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVATCDarchetypecodespecialisationlevelvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEInvariantOriginalLanguageValid constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPEInvariantOriginalLanguageValid(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPEInvariantOriginalLanguageValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEInvariantConceptValid constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPEInvariantConceptValid(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPEInvariantConceptValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEInvariantDefinitionExists constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPEInvariantDefinitionExists(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPEInvariantDefinitionExists(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEInvariantTerminologyExists constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPEInvariantTerminologyExists(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPEInvariantTerminologyExists(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEInvariantSpecialisationValidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPEInvariantSpecialisationValidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPEInvariantSpecialisationValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEInvariantRulesValid constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPEInvariantRulesValid(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPEInvariantRulesValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEHRIDInvariantConceptIdValidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPEHRIDInvariantConceptIdValidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPEHRIDInvariantConceptIdValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPEHRIDInvariantBaseVersionValidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPEHRIDInvariantBaseVersionValidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPEHRIDInvariantBaseVersionValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised(diagnostics, context);
	}

	/**
	 * Validates the validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARIABLEDECLARATIONInvariantNameValid constraint of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetype_validateAOMVARIABLEDECLARATIONInvariantNameValid(Archetype archetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetype.validateAOMVARIABLEDECLARATIONInvariantNameValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthoredResource(AuthoredResource authoredResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authoredResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTranslation(ResourceTranslation resourceTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceTranslation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceTranslation_validateAOMVOTMterminologytranslationsvalidity(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceTranslation_validateTranslationEntries(resourceTranslation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceTranslation_validateUniqueEntries(resourceTranslation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMVOTMterminologytranslationsvalidity constraint of '<em>Resource Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTranslation_validateAOMVOTMterminologytranslationsvalidity(ResourceTranslation resourceTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceTranslation.validateAOMVOTMterminologytranslationsvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateTranslationEntries constraint of '<em>Resource Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTranslation_validateTranslationEntries(ResourceTranslation resourceTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceTranslation.validateTranslationEntries(diagnostics, context);
	}

	/**
	 * Validates the validateUniqueEntries constraint of '<em>Resource Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTranslation_validateUniqueEntries(ResourceTranslation resourceTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceTranslation.validateUniqueEntries(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeDefinition(ArchetypeDefinition archetypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(archetypeDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(archetypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(archetypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(archetypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(archetypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(archetypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(archetypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(archetypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(archetypeDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeDefinition_validateAOMARCHETYPEHRIDInvariantRmClassNameValidity(archetypeDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMARCHETYPEHRIDInvariantRmClassNameValidity constraint of '<em>Archetype Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeDefinition_validateAOMARCHETYPEHRIDInvariantRmClassNameValidity(ArchetypeDefinition archetypeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeDefinition.validateAOMARCHETYPEHRIDInvariantRmClassNameValidity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(archetypeSlot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= terminologyValidator.validateIdentifiedItem_validateUniqueScopes(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateRedefinesGeneralization(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCORMobjectconstrainttypenameexistence(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCORMTobjectconstrainttypevalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOCDobjectconstraintdefinitionvalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOIDobjectnodeidentifiervalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOSUobjectnodeidentifiervalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSSMspecialisedarchetypesiblingordervalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMARCHETYPECONSTRAINInvariantpathExists(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantRmAttributeNameValid(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantExistenceValid(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantDifferentialPathValid(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCARDINALITYInvariantValidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantNodeIdValid(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantOccurrencesValidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantSiblingOrderValidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeSlot_validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeSlot_validateAOMVDSEVarchetypeslotexcludeconstraintvalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeSlot_validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeSlot_validateAOMVDSSIDslotredefinitionchildnodeid(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeSlot_validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeSlot_validateAOMVDSIVarchetypeslotincludeconstraintvalidity(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeSlot_validateAOMARCHETYPESLOTInvariantincludesValid(archetypeSlot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeSlot_validateAOMARCHETYPESLOTInvariantexcludesValid(archetypeSlot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity constraint of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot_validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeSlot.validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVDSEVarchetypeslotexcludeconstraintvalidity constraint of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot_validateAOMVDSEVarchetypeslotexcludeconstraintvalidity(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeSlot.validateAOMVDSEVarchetypeslotexcludeconstraintvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity constraint of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot_validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeSlot.validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVDSSIDslotredefinitionchildnodeid constraint of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot_validateAOMVDSSIDslotredefinitionchildnodeid(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeSlot.validateAOMVDSSIDslotredefinitionchildnodeid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity constraint of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot_validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeSlot.validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVDSIVarchetypeslotincludeconstraintvalidity constraint of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot_validateAOMVDSIVarchetypeslotincludeconstraintvalidity(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeSlot.validateAOMVDSIVarchetypeslotincludeconstraintvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPESLOTInvariantincludesValid constraint of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot_validateAOMARCHETYPESLOTInvariantincludesValid(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeSlot.validateAOMARCHETYPESLOTInvariantincludesValid(diagnostics, context);
	}

	/**
	 * Validates the validateAOMARCHETYPESLOTInvariantexcludesValid constraint of '<em>Archetype Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeSlot_validateAOMARCHETYPESLOTInvariantexcludesValid(ArchetypeSlot archetypeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeSlot.validateAOMARCHETYPESLOTInvariantexcludesValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeRoot(ArchetypeRoot archetypeRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(archetypeRoot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= terminologyValidator.validateIdentifiedItem_validateUniqueScopes(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateRedefinesGeneralization(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCORMobjectconstrainttypenameexistence(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCORMTobjectconstrainttypevalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOCDobjectconstraintdefinitionvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOIDobjectnodeidentifiervalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVCOSUobjectnodeidentifiervalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMVSSMspecialisedarchetypesiblingordervalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMARCHETYPECONSTRAINInvariantpathExists(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantRmAttributeNameValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantExistenceValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantDifferentialPathValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCARDINALITYInvariantValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantNodeIdValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantOccurrencesValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCOBJECTInvariantSiblingOrderValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectConstraint_validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateSingleParent(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAllAttributeConstraints(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVARCNarchetypeconceptvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCARMattributenamereferencemodelvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVDIFVarchetypeattributedifferentialpathvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVACMCUcardinalityoccurrencesupperboundvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVACMCOcardinalityoccurrencesorphans(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVCATUattributeuniqueness(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVUNTuseNodereferencemodeltypevalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVUNPuseNodepathvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSUNTuseNodespecialisationparentvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVOBAVobjectnodeassumedvaluevalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVACDFconstraintcodevalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCOBJECTInvariantRmTypeNameValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTInvariantAttributesValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTTuplesValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCBOOLEANInvariantBinaryConsistency(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCBOOLEANInvariantPrototypeValueConsistency(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCDATEInvariantPatternValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMASSERTIONInvariantTagValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMASSERTIONInvariantExpressionValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMQUERYVARIABLEInvariantContextValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMEXPRITEMInvariantTypeValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMEXPRUNARYOPERATORInvariantoperandValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMEXPRBINARYOPERATORInvariantleftOperandValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMEXPRBINARYOPERATORInvariantrightOperandValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMOPERATORKINDInvariantValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVATDFvaluecodevalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVATDAvaluesetassumedvaluecodevalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenOrphansValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantCardinalityValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexObjectConstraint_validateAOMCATTRIBUTEInvariantAlternativesValid(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeRoot_validateAOMVARXNCexternalreferencenodeidentifiervalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeRoot_validateAOMVARXTVexternalreferencetypevalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeRoot_validateAOMVARXSexternalreferenceconformstoslot(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeRoot_validateAOMVARXRexternalreferencereferstoresolvableartefact(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeRoot_validateAOMVARXIDexternalreferenceslotfillingidvalidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeRoot_validateAOMCARCHETYPEROOTInvariantArchetypeRefValidity(archetypeRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateArchetypeRoot_validateAOMVARXAVexternalreferencenodearchetypereferencevalidity(archetypeRoot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMVARXNCexternalreferencenodeidentifiervalidity constraint of '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeRoot_validateAOMVARXNCexternalreferencenodeidentifiervalidity(ArchetypeRoot archetypeRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeRoot.validateAOMVARXNCexternalreferencenodeidentifiervalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARXTVexternalreferencetypevalidity constraint of '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeRoot_validateAOMVARXTVexternalreferencetypevalidity(ArchetypeRoot archetypeRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeRoot.validateAOMVARXTVexternalreferencetypevalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARXSexternalreferenceconformstoslot constraint of '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeRoot_validateAOMVARXSexternalreferenceconformstoslot(ArchetypeRoot archetypeRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeRoot.validateAOMVARXSexternalreferenceconformstoslot(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARXRexternalreferencereferstoresolvableartefact constraint of '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeRoot_validateAOMVARXRexternalreferencereferstoresolvableartefact(ArchetypeRoot archetypeRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeRoot.validateAOMVARXRexternalreferencereferstoresolvableartefact(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARXIDexternalreferenceslotfillingidvalidity constraint of '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeRoot_validateAOMVARXIDexternalreferenceslotfillingidvalidity(ArchetypeRoot archetypeRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeRoot.validateAOMVARXIDexternalreferenceslotfillingidvalidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMCARCHETYPEROOTInvariantArchetypeRefValidity constraint of '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeRoot_validateAOMCARCHETYPEROOTInvariantArchetypeRefValidity(ArchetypeRoot archetypeRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeRoot.validateAOMCARCHETYPEROOTInvariantArchetypeRefValidity(diagnostics, context);
	}

	/**
	 * Validates the validateAOMVARXAVexternalreferencenodearchetypereferencevalidity constraint of '<em>Archetype Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchetypeRoot_validateAOMVARXAVexternalreferencenodearchetypereferencevalidity(ArchetypeRoot archetypeRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return archetypeRoot.validateAOMVARXAVexternalreferencenodearchetypereferencevalidity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceAnnotationNodeItem(ResourceAnnotationNodeItem resourceAnnotationNodeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceAnnotationNodeItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceAnnotationNodeItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceAnnotationNodeItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceAnnotationNodeItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceAnnotationNodeItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceAnnotationNodeItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceAnnotationNodeItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceAnnotationNodeItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceAnnotationNodeItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceAnnotationNodeItem_validateAOMVRANPannotationpathvalid(resourceAnnotationNodeItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMVRANPannotationpathvalid constraint of '<em>Resource Annotation Node Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceAnnotationNodeItem_validateAOMVRANPannotationpathvalid(ResourceAnnotationNodeItem resourceAnnotationNodeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceAnnotationNodeItem.validateAOMVRANPannotationpathvalid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifecycle_state(Lifecycle_state lifecycle_state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVERSION_STATUS(VERSION_STATUS versioN_STATUS, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ConstraintValidator
