/**
 */
package org.eclipse.mdht.uml.aml.constraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConstraintProfile'"
 * @generated
 */
public interface ConstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/AML/20150501/ConstraintProfile.xmi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "constraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintPackage eINSTANCE = org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ObjectConstraintImpl <em>Object Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ObjectConstraintImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getObjectConstraint()
	 * @generated
	 */
	int OBJECT_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT__BASE_NAMED_ELEMENT = TerminologyPackage.IDENTIFIED_ITEM__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT__ID = TerminologyPackage.IDENTIFIED_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Is deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT__IS_DEPRECATED = TerminologyPackage.IDENTIFIED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT_FEATURE_COUNT = TerminologyPackage.IDENTIFIED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Unique Scopes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefines Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate AOMVCOR Mobjectconstrainttypenameexistence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate AOMVCORM Tobjectconstrainttypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate AOMVCOC Dobjectconstraintdefinitionvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate AOMVCOI Dobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate AOMVCOS Uobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate AOMVSON Tspecialisedarchetypeobjectnodemetatypeconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate AOMVSONC Tspecialisedarchetypeobjectnodereferencetypeconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate AOMVSONI Nspecialisedarchetypenewobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Validate AOMVSONC Ospecialisedarchetyperedefineobjectnodeoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Tspecialisedarchetypeprohibitedobjectnode AO Mtypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Ospecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Validate AOMVSS Mspecialisedarchetypesiblingordervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPECONSTRAIN Invariantpath Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Rm Attribute Name Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Existence Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Differential Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Child Occurrences Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Validate AOMCARDINALITY Invariant Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Node Id Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Occurrences Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Sibling Order Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Validate AOMSIBLINGORDER Invariantsibling Node Id Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Validate AOMCDEFINEDOBJECT Invariant Default Value Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECTPROXY Target Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Object Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONSTRAINT_OPERATION_COUNT = TerminologyPackage.IDENTIFIED_ITEM_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ComplexObjectConstraintImpl <em>Complex Object Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ComplexObjectConstraintImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getComplexObjectConstraint()
	 * @generated
	 */
	int COMPLEX_OBJECT_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT__BASE_NAMED_ELEMENT = OBJECT_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT__ID = OBJECT_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Is deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT__IS_DEPRECATED = OBJECT_CONSTRAINT__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER = OBJECT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Object Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT_FEATURE_COUNT = OBJECT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Unique Scopes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefines Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOR Mobjectconstrainttypenameexistence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCORM Tobjectconstrainttypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOC Dobjectconstraintdefinitionvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOI Dobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOS Uobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSON Tspecialisedarchetypeobjectnodemetatypeconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONC Tspecialisedarchetypeobjectnodereferencetypeconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONI Nspecialisedarchetypenewobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONC Ospecialisedarchetyperedefineobjectnodeoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Tspecialisedarchetypeprohibitedobjectnode AO Mtypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Ospecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSS Mspecialisedarchetypesiblingordervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPECONSTRAIN Invariantpath Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Rm Attribute Name Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Existence Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Differential Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Child Occurrences Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCARDINALITY Invariant Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Node Id Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Occurrences Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Sibling Order Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMSIBLINGORDER Invariantsibling Node Id Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCDEFINEDOBJECT Invariant Default Value Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECTPROXY Target Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Single Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_SINGLE_PARENT__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate All Attribute Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_ALL_ATTRIBUTE_CONSTRAINTS__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate AOMVARC Narchetypeconceptvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVARC_NARCHETYPECONCEPTVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate AOMVCAR Mattributenamereferencemodelvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAR_MATTRIBUTENAMEREFERENCEMODELVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate AOMVCAE Xarchetypeattributereferencemodelexistenceconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAE_XARCHETYPEATTRIBUTEREFERENCEMODELEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate AOMVCA Marchetypeattributereferencemodelmultiplicityconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCA_MARCHETYPEATTRIBUTEREFERENCEMODELMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate AOMVDIF Varchetypeattributedifferentialpathvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_VARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate AOMVDIF Pspecialisedarchetypeattributedifferentialpathvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_PSPECIALISEDARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate AOMVSANC Especialisedarchetypeattributenodeexistenceconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_ESPECIALISEDARCHETYPEATTRIBUTENODEEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Validate AOMVSA Mspecialisedarchetypeattributemultiplicityconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSA_MSPECIALISEDARCHETYPEATTRIBUTEMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Validate AOMVACS Osinglevaluedattributechildobjectoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACS_OSINGLEVALUEDATTRIBUTECHILDOBJECTOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Validate AOMVACMC Ucardinalityoccurrencesupperboundvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_UCARDINALITYOCCURRENCESUPPERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Validate AOMVACMC Ocardinalityoccurrencesorphans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_OCARDINALITYOCCURRENCESORPHANS__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Validate AOMVCAC Aarchetypeattributereferencemodelcardinalityconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAC_AARCHETYPEATTRIBUTEREFERENCEMODELCARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Validate AOMWACMC Lcardinalityoccurrenceslowerboundvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMWACMC_LCARDINALITYOCCURRENCESLOWERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Validate AOMVSANC Cspecialisedarchetypeattributenodecardinalityconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_CSPECIALISEDARCHETYPEATTRIBUTENODECARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Validate AOMVCAT Uattributeuniqueness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAT_UATTRIBUTEUNIQUENESS__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Validate AOMVUN Tuse Nodereferencemodeltypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_TUSE_NODEREFERENCEMODELTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Validate AOMVUN Puse Nodepathvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_PUSE_NODEPATHVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Validate AOMVSUN Tuse Nodespecialisationparentvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSUN_TUSE_NODESPECIALISATIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Validate AOMVOBA Vobjectnodeassumedvaluevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVOBA_VOBJECTNODEASSUMEDVALUEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Validate AOMVACD Fconstraintcodevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACD_FCONSTRAINTCODEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Ispecialisedarchetypeprohibitedobjectnode AO Mnodeidvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_ISPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MNODEIDVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Rm Type Name Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_RM_TYPE_NAME_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Prohibited Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_PROHIBITED_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Any Allowed Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ANY_ALLOWED_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Attributes Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ATTRIBUTES_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECT Tuples Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_TUPLES_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Validate AOMCPRIMITIVEOBJECT Invariant Representation Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_REPRESENTATION_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Validate AOMCPRIMITIVEOBJECT Invariant Assumed Value Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_ASSUMED_VALUE_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Validate AOMCBOOLEAN Invariant Binary Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_BINARY_CONSISTENCY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Validate AOMCBOOLEAN Invariant Prototype Value Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_PROTOTYPE_VALUE_CONSISTENCY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Validate AOMCDATE Invariant Pattern Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCDATE_INVARIANT_PATTERN_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Validate AOMCTERMINOLOGYCODE Invariant Terminology Id Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCTERMINOLOGYCODE_INVARIANT_TERMINOLOGY_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Validate AOMASSERTION Invariant Tag Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_TAG_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Validate AOMASSERTION Invariant Expression Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_EXPRESSION_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Validate AOMQUERYVARIABLE Invariant Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMQUERYVARIABLE_INVARIANT_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Validate AOMEXPRITEM Invariant Type Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRITEM_INVARIANT_TYPE_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Validate AOMEXPRUNARYOPERATOR Invariantoperand Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRUNARYOPERATOR_INVARIANTOPERAND_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Validate AOMEXPRBINARYOPERATOR Invariantleft Operand Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTLEFT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Validate AOMEXPRBINARYOPERATOR Invariantright Operand Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTRIGHT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Validate AOMOPERATORKIND Invariant Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMOPERATORKIND_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Validate AOMVATD Fvaluecodevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_FVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Validate AOMVATD Avaluesetassumedvaluecodevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_AVALUESETASSUMEDVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Validate AOMVSONI Fspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_FSPECIALISEDARCHETYPEOBJECTNODEIDENTIFIERVALIDITYINFLATSIBLINGS__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECTPROXY Invariant Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_INVARIANT_CONSISTENCY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Children Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Children Orphans Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_ORPHANS_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Children Occurrences Lower Sum Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_OCCURRENCES_LOWER_SUM_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Cardinality Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CARDINALITY_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Alternatives Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_ALTERNATIVES_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 50;

	/**
	 * The number of operations of the '<em>Complex Object Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT = OBJECT_CONSTRAINT_OPERATION_COUNT + 51;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ConstrainsImpl <em>Constrains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstrainsImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getConstrains()
	 * @generated
	 */
	int CONSTRAINS = 2;

	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINS__BASE_GENERALIZATION = 0;

	/**
	 * The number of structural features of the '<em>Constrains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Specific Object Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINS___VALIDATE_SPECIFIC_OBJECT_CONSTRAINT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Validate Constrains RM Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINS___VALIDATE_CONSTRAINS_RM_ELEMENT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Constrains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeLibraryImpl <em>Archetype Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeLibraryImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetypeLibrary()
	 * @generated
	 */
	int ARCHETYPE_LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_LIBRARY__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Has aom ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_LIBRARY__HAS_AOM_IDS = 1;

	/**
	 * The feature id for the '<em><b>Rm package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_LIBRARY__RM_PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Archetype Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Validate One Reference Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_LIBRARY___VALIDATE_ONE_REFERENCE_MODEL__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Validate Only Archetypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_LIBRARY___VALIDATE_ONLY_ARCHETYPES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPEHRID Invariant Rm Closure Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_LIBRARY___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_CLOSURE_VALIDITY__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Archetype Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_LIBRARY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl <em>Authored Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getAuthoredResource()
	 * @generated
	 */
	int AUTHORED_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__COPYRIGHT = 0;

	/**
	 * The feature id for the '<em><b>Current revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__CURRENT_REVISION = 1;

	/**
	 * The feature id for the '<em><b>Custodian namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Custodian organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION = 3;

	/**
	 * The feature id for the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__LICENCE = 4;

	/**
	 * The feature id for the '<em><b>Lifecycle state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__LIFECYCLE_STATE = 5;

	/**
	 * The feature id for the '<em><b>Original author date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE = 6;

	/**
	 * The feature id for the '<em><b>Original author email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL = 7;

	/**
	 * The feature id for the '<em><b>Original author name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Original author organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION = 9;

	/**
	 * The feature id for the '<em><b>Original namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__ORIGINAL_NAMESPACE = 10;

	/**
	 * The feature id for the '<em><b>Original publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__ORIGINAL_PUBLISHER = 11;

	/**
	 * The feature id for the '<em><b>Other contributors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__OTHER_CONTRIBUTORS = 12;

	/**
	 * The feature id for the '<em><b>Other Details</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__OTHER_DETAILS = 13;

	/**
	 * The feature id for the '<em><b>Other Details id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__OTHER_DETAILS_ID = 14;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__REFERENCES = 15;

	/**
	 * The feature id for the '<em><b>References id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__REFERENCES_ID = 16;

	/**
	 * The feature id for the '<em><b>Resource Document Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE = 17;

	/**
	 * The feature id for the '<em><b>Resource Document Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX = 18;

	/**
	 * The feature id for the '<em><b>Resource Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__RESOURCE_SOURCE = 19;

	/**
	 * The feature id for the '<em><b>Resource Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__RESOURCE_SOURCE_URI = 20;

	/**
	 * The feature id for the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__BASE_NAMESPACE = 21;

	/**
	 * The feature id for the '<em><b>Resource package uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI = 22;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__UID = 23;

	/**
	 * The feature id for the '<em><b>Ip acknowledgements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS = 24;

	/**
	 * The feature id for the '<em><b>Ip acknowledgements id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID = 25;

	/**
	 * The number of structural features of the '<em>Authored Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Authored Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORED_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl <em>Archetype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetype()
	 * @generated
	 */
	int ARCHETYPE = 4;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__COPYRIGHT = AUTHORED_RESOURCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Current revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__CURRENT_REVISION = AUTHORED_RESOURCE__CURRENT_REVISION;

	/**
	 * The feature id for the '<em><b>Custodian namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__CUSTODIAN_NAMESPACE = AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Custodian organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__CUSTODIAN_ORGANISATION = AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION;

	/**
	 * The feature id for the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__LICENCE = AUTHORED_RESOURCE__LICENCE;

	/**
	 * The feature id for the '<em><b>Lifecycle state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__LIFECYCLE_STATE = AUTHORED_RESOURCE__LIFECYCLE_STATE;

	/**
	 * The feature id for the '<em><b>Original author date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ORIGINAL_AUTHOR_DATE = AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE;

	/**
	 * The feature id for the '<em><b>Original author email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ORIGINAL_AUTHOR_EMAIL = AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL;

	/**
	 * The feature id for the '<em><b>Original author name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ORIGINAL_AUTHOR_NAME = AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME;

	/**
	 * The feature id for the '<em><b>Original author organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ORIGINAL_AUTHOR_ORGANIZATION = AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Original namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ORIGINAL_NAMESPACE = AUTHORED_RESOURCE__ORIGINAL_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Original publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ORIGINAL_PUBLISHER = AUTHORED_RESOURCE__ORIGINAL_PUBLISHER;

	/**
	 * The feature id for the '<em><b>Other contributors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__OTHER_CONTRIBUTORS = AUTHORED_RESOURCE__OTHER_CONTRIBUTORS;

	/**
	 * The feature id for the '<em><b>Other Details</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__OTHER_DETAILS = AUTHORED_RESOURCE__OTHER_DETAILS;

	/**
	 * The feature id for the '<em><b>Other Details id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__OTHER_DETAILS_ID = AUTHORED_RESOURCE__OTHER_DETAILS_ID;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__REFERENCES = AUTHORED_RESOURCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>References id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__REFERENCES_ID = AUTHORED_RESOURCE__REFERENCES_ID;

	/**
	 * The feature id for the '<em><b>Resource Document Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RESOURCE_DOCUMENT_LANGUAGE = AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Resource Document Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RESOURCE_DOCUMENT_SYNTAX = AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX;

	/**
	 * The feature id for the '<em><b>Resource Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RESOURCE_SOURCE = AUTHORED_RESOURCE__RESOURCE_SOURCE;

	/**
	 * The feature id for the '<em><b>Resource Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RESOURCE_SOURCE_URI = AUTHORED_RESOURCE__RESOURCE_SOURCE_URI;

	/**
	 * The feature id for the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__BASE_NAMESPACE = AUTHORED_RESOURCE__BASE_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Resource package uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RESOURCE_PACKAGE_URI = AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__UID = AUTHORED_RESOURCE__UID;

	/**
	 * The feature id for the '<em><b>Ip acknowledgements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__IP_ACKNOWLEDGEMENTS = AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS;

	/**
	 * The feature id for the '<em><b>Ip acknowledgements id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__IP_ACKNOWLEDGEMENTS_ID = AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__BASE_PACKAGE = AUTHORED_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archetype Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ARCHETYPE_TYPE = AUTHORED_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aml Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__AML_VERSION = AUTHORED_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is controlled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__IS_CONTROLLED = AUTHORED_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__IS_GENERATED = AUTHORED_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Release version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RELEASE_VERSION = AUTHORED_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__VERSION_STATUS = AUTHORED_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Build count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__BUILD_COUNT = AUTHORED_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Other metadata</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__OTHER_METADATA = AUTHORED_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Other metadata id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__OTHER_METADATA_ID = AUTHORED_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Archetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_FEATURE_COUNT = AUTHORED_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Validate Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_MUST_BE_OWNED__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Owns Object Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_OWNS_OBJECT_CONSTRAINTS__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Specializes Archetype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_SPECIALIZES_ARCHETYPE__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate AOMVOK Uobjectkeyunique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVOK_UOBJECTKEYUNIQUE__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate AOMVARD Tarchetypedefinitiontypenamevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVARD_TARCHETYPEDEFINITIONTYPENAMEVALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate AOMVARI Darchetypeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVARI_DARCHETYPEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate AOMVDEO Loriginallanguagespecified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVDEO_LORIGINALLANGUAGESPECIFIED__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate AOMVAR Ddescriptionspecified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVAR_DDESCRIPTIONSPECIFIED__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate AOMVASI Darchetypespecialisationparentidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVASI_DARCHETYPESPECIALISATIONPARENTIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Validate AOMVAL Carchetypelanguageconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVAL_CARCHETYPELANGUAGECONFORMANCE__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Validate AOMVACS Darchetypeconceptspecialisationdepth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVACS_DARCHETYPECONCEPTSPECIALISATIONDEPTH__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Validate AOMVATC Darchetypecodespecialisationlevelvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVATC_DARCHETYPECODESPECIALISATIONLEVELVALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPE Invariant Original Language Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_ORIGINAL_LANGUAGE_VALID__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPE Invariant Concept Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_CONCEPT_VALID__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPE Invariant Definition Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_DEFINITION_EXISTS__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPE Invariant Terminology Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_TERMINOLOGY_EXISTS__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPE Invariant Specialisation Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_SPECIALISATION_VALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPE Invariant Rules Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_RULES_VALID__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPEHRID Invariant Concept Id Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPEHRID_INVARIANT_CONCEPT_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPEHRID Invariant Base Version Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPEHRID_INVARIANT_BASE_VERSION_VALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Validate AOMOPERATIONALTEMPLATE Invariant Is Specialised</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMOPERATIONALTEMPLATE_INVARIANT_IS_SPECIALISED__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Validate AOMOPERATIONALTEMPLATE Invariant Component Terminologies Existence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMOPERATIONALTEMPLATE_INVARIANT_COMPONENT_TERMINOLOGIES_EXISTENCE__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariantoriginal Language Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTORIGINAL_LANGUAGE_VALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariantconcept Code Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTCONCEPT_CODE_VALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariantterm Definitions Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTTERM_DEFINITIONS_VALIDITY__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariant Parent Archetype Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANT_PARENT_ARCHETYPE_VALID__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Validate AOMVARIABLEDECLARATION Invariant Name Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE___VALIDATE_AOMVARIABLEDECLARATION_INVARIANT_NAME_VALID__DIAGNOSTICCHAIN_MAP = AUTHORED_RESOURCE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Archetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_OPERATION_COUNT = AUTHORED_RESOURCE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl <em>Resource Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getResourceTranslation()
	 * @generated
	 */
	int RESOURCE_TRANSLATION = 6;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__BASE_ENUMERATION = 0;

	/**
	 * The feature id for the '<em><b>Accreditation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__ACCREDITATION = 1;

	/**
	 * The feature id for the '<em><b>Other translation details</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS = 2;

	/**
	 * The feature id for the '<em><b>Other translation details id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS_ID = 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__PURPOSE = 4;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__KEYWORDS = 5;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__USE = 6;

	/**
	 * The feature id for the '<em><b>Misuse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__MISUSE = 7;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__COPYRIGHT = 8;

	/**
	 * The feature id for the '<em><b>Original resource uri</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI = 9;

	/**
	 * The feature id for the '<em><b>Original resource uri Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI_ID = 10;

	/**
	 * The feature id for the '<em><b>Other details</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__OTHER_DETAILS = 11;

	/**
	 * The feature id for the '<em><b>Other details Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__OTHER_DETAILS_ID = 12;

	/**
	 * The feature id for the '<em><b>Author name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__AUTHOR_NAME = 13;

	/**
	 * The feature id for the '<em><b>Author organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__AUTHOR_ORGANIZATION = 14;

	/**
	 * The feature id for the '<em><b>Author email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__AUTHOR_EMAIL = 15;

	/**
	 * The feature id for the '<em><b>Author date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__AUTHOR_DATE = 16;

	/**
	 * The feature id for the '<em><b>Version last translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION__VERSION_LAST_TRANSLATED = 17;

	/**
	 * The number of structural features of the '<em>Resource Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION_FEATURE_COUNT = 18;

	/**
	 * The operation id for the '<em>Validate AOMVOT Mterminologytranslationsvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION___VALIDATE_AOMVOT_MTERMINOLOGYTRANSLATIONSVALIDITY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Validate Translation Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION___VALIDATE_TRANSLATION_ENTRIES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Validate Unique Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION___VALIDATE_UNIQUE_ENTRIES__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Resource Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TRANSLATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeDefinitionImpl <em>Archetype Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeDefinitionImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetypeDefinition()
	 * @generated
	 */
	int ARCHETYPE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_DEFINITION__BASE_USAGE = 0;

	/**
	 * The number of structural features of the '<em>Archetype Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPEHRID Invariant Rm Class Name Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_DEFINITION___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_CLASS_NAME_VALIDITY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Archetype Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_DEFINITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeSlotImpl <em>Archetype Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeSlotImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetypeSlot()
	 * @generated
	 */
	int ARCHETYPE_SLOT = 8;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT__BASE_NAMED_ELEMENT = OBJECT_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT__ID = OBJECT_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Is deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT__IS_DEPRECATED = OBJECT_CONSTRAINT__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT__BASE_CLASSIFIER = OBJECT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Archetype Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT_FEATURE_COUNT = OBJECT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Unique Scopes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefines Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOR Mobjectconstrainttypenameexistence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCORM Tobjectconstrainttypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOC Dobjectconstraintdefinitionvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOI Dobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOS Uobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSON Tspecialisedarchetypeobjectnodemetatypeconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONC Tspecialisedarchetypeobjectnodereferencetypeconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONI Nspecialisedarchetypenewobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONC Ospecialisedarchetyperedefineobjectnodeoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Tspecialisedarchetypeprohibitedobjectnode AO Mtypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Ospecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSS Mspecialisedarchetypesiblingordervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPECONSTRAIN Invariantpath Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Rm Attribute Name Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Existence Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Differential Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Child Occurrences Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCARDINALITY Invariant Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Node Id Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Occurrences Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Sibling Order Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMSIBLINGORDER Invariantsibling Node Id Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCDEFINEDOBJECT Invariant Default Value Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECTPROXY Target Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVDSS Pspecialisedarchetypeslotdefinitionparentvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVDSS_PSPECIALISEDARCHETYPESLOTDEFINITIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate AOMVDSE Varchetypeslotexcludeconstraintvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVDSE_VARCHETYPESLOTEXCLUDECONSTRAINTVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate AOMVDSS Mspecialisedarchetypeslotdefinitionmatchvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVDSS_MSPECIALISEDARCHETYPESLOTDEFINITIONMATCHVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate AOMVDSSI Dslotredefinitionchildnodeid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVDSSI_DSLOTREDEFINITIONCHILDNODEID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate AOMVDSS Cspecialisedarchetypeslotdefinitionclosedvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVDSS_CSPECIALISEDARCHETYPESLOTDEFINITIONCLOSEDVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate AOMVDSI Varchetypeslotincludeconstraintvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMVDSI_VARCHETYPESLOTINCLUDECONSTRAINTVALIDITY__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPESLOT Invariantincludes Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPESLOT_INVARIANTINCLUDES_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPESLOT Invariantexcludes Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPESLOT_INVARIANTEXCLUDES_VALID__DIAGNOSTICCHAIN_MAP = OBJECT_CONSTRAINT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Archetype Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_SLOT_OPERATION_COUNT = OBJECT_CONSTRAINT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeRootImpl <em>Archetype Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeRootImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetypeRoot()
	 * @generated
	 */
	int ARCHETYPE_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT__BASE_NAMED_ELEMENT = COMPLEX_OBJECT_CONSTRAINT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT__ID = COMPLEX_OBJECT_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Is deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT__IS_DEPRECATED = COMPLEX_OBJECT_CONSTRAINT__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT__BASE_CLASSIFIER = COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER;

	/**
	 * The number of structural features of the '<em>Archetype Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT_FEATURE_COUNT = COMPLEX_OBJECT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Unique Scopes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefines Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOR Mobjectconstrainttypenameexistence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCORM Tobjectconstrainttypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOC Dobjectconstraintdefinitionvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOI Dobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCOS Uobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSON Tspecialisedarchetypeobjectnodemetatypeconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONC Tspecialisedarchetypeobjectnodereferencetypeconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONI Nspecialisedarchetypenewobjectnodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONC Ospecialisedarchetyperedefineobjectnodeoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Tspecialisedarchetypeprohibitedobjectnode AO Mtypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Ospecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSS Mspecialisedarchetypesiblingordervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPECONSTRAIN Invariantpath Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Rm Attribute Name Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Existence Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Differential Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Child Occurrences Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCARDINALITY Invariant Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Node Id Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Occurrences Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Sibling Order Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMSIBLINGORDER Invariantsibling Node Id Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCDEFINEDOBJECT Invariant Default Value Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECTPROXY Target Path Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Single Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_SINGLE_PARENT__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_SINGLE_PARENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate All Attribute Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_ALL_ATTRIBUTE_CONSTRAINTS__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_ALL_ATTRIBUTE_CONSTRAINTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVARC Narchetypeconceptvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVARC_NARCHETYPECONCEPTVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVARC_NARCHETYPECONCEPTVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCAR Mattributenamereferencemodelvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCAR_MATTRIBUTENAMEREFERENCEMODELVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAR_MATTRIBUTENAMEREFERENCEMODELVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCAE Xarchetypeattributereferencemodelexistenceconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCAE_XARCHETYPEATTRIBUTEREFERENCEMODELEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAE_XARCHETYPEATTRIBUTEREFERENCEMODELEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCA Marchetypeattributereferencemodelmultiplicityconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCA_MARCHETYPEATTRIBUTEREFERENCEMODELMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCA_MARCHETYPEATTRIBUTEREFERENCEMODELMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVDIF Varchetypeattributedifferentialpathvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVDIF_VARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_VARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVDIF Pspecialisedarchetypeattributedifferentialpathvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVDIF_PSPECIALISEDARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_PSPECIALISEDARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSANC Especialisedarchetypeattributenodeexistenceconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSANC_ESPECIALISEDARCHETYPEATTRIBUTENODEEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_ESPECIALISEDARCHETYPEATTRIBUTENODEEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSA Mspecialisedarchetypeattributemultiplicityconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSA_MSPECIALISEDARCHETYPEATTRIBUTEMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSA_MSPECIALISEDARCHETYPEATTRIBUTEMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVACS Osinglevaluedattributechildobjectoccurrencesvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVACS_OSINGLEVALUEDATTRIBUTECHILDOBJECTOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACS_OSINGLEVALUEDATTRIBUTECHILDOBJECTOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVACMC Ucardinalityoccurrencesupperboundvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVACMC_UCARDINALITYOCCURRENCESUPPERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_UCARDINALITYOCCURRENCESUPPERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVACMC Ocardinalityoccurrencesorphans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVACMC_OCARDINALITYOCCURRENCESORPHANS__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_OCARDINALITYOCCURRENCESORPHANS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCAC Aarchetypeattributereferencemodelcardinalityconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCAC_AARCHETYPEATTRIBUTEREFERENCEMODELCARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAC_AARCHETYPEATTRIBUTEREFERENCEMODELCARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMWACMC Lcardinalityoccurrenceslowerboundvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMWACMC_LCARDINALITYOCCURRENCESLOWERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMWACMC_LCARDINALITYOCCURRENCESLOWERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSANC Cspecialisedarchetypeattributenodecardinalityconformance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSANC_CSPECIALISEDARCHETYPEATTRIBUTENODECARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_CSPECIALISEDARCHETYPEATTRIBUTENODECARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVCAT Uattributeuniqueness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVCAT_UATTRIBUTEUNIQUENESS__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAT_UATTRIBUTEUNIQUENESS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVUN Tuse Nodereferencemodeltypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVUN_TUSE_NODEREFERENCEMODELTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_TUSE_NODEREFERENCEMODELTYPEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVUN Puse Nodepathvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVUN_PUSE_NODEPATHVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_PUSE_NODEPATHVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSUN Tuse Nodespecialisationparentvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSUN_TUSE_NODESPECIALISATIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSUN_TUSE_NODESPECIALISATIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVOBA Vobjectnodeassumedvaluevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVOBA_VOBJECTNODEASSUMEDVALUEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVOBA_VOBJECTNODEASSUMEDVALUEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVACD Fconstraintcodevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVACD_FCONSTRAINTCODEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACD_FCONSTRAINTCODEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONP Ispecialisedarchetypeprohibitedobjectnode AO Mnodeidvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSONP_ISPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MNODEIDVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_ISPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MNODEIDVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCOBJECT Invariant Rm Type Name Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCOBJECT_INVARIANT_RM_TYPE_NAME_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_RM_TYPE_NAME_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Prohibited Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_PROHIBITED_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_PROHIBITED_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Any Allowed Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ANY_ALLOWED_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ANY_ALLOWED_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Attributes Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ATTRIBUTES_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ATTRIBUTES_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECT Tuples Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCCOMPLEXOBJECT_TUPLES_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_TUPLES_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCPRIMITIVEOBJECT Invariant Representation Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_REPRESENTATION_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_REPRESENTATION_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCPRIMITIVEOBJECT Invariant Assumed Value Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_ASSUMED_VALUE_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_ASSUMED_VALUE_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCBOOLEAN Invariant Binary Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCBOOLEAN_INVARIANT_BINARY_CONSISTENCY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_BINARY_CONSISTENCY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCBOOLEAN Invariant Prototype Value Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCBOOLEAN_INVARIANT_PROTOTYPE_VALUE_CONSISTENCY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_PROTOTYPE_VALUE_CONSISTENCY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCDATE Invariant Pattern Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCDATE_INVARIANT_PATTERN_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCDATE_INVARIANT_PATTERN_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCTERMINOLOGYCODE Invariant Terminology Id Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCTERMINOLOGYCODE_INVARIANT_TERMINOLOGY_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCTERMINOLOGYCODE_INVARIANT_TERMINOLOGY_ID_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMASSERTION Invariant Tag Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMASSERTION_INVARIANT_TAG_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_TAG_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMASSERTION Invariant Expression Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMASSERTION_INVARIANT_EXPRESSION_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_EXPRESSION_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMQUERYVARIABLE Invariant Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMQUERYVARIABLE_INVARIANT_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMQUERYVARIABLE_INVARIANT_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMEXPRITEM Invariant Type Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMEXPRITEM_INVARIANT_TYPE_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRITEM_INVARIANT_TYPE_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMEXPRUNARYOPERATOR Invariantoperand Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMEXPRUNARYOPERATOR_INVARIANTOPERAND_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRUNARYOPERATOR_INVARIANTOPERAND_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMEXPRBINARYOPERATOR Invariantleft Operand Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTLEFT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTLEFT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMEXPRBINARYOPERATOR Invariantright Operand Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTRIGHT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTRIGHT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMOPERATORKIND Invariant Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMOPERATORKIND_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMOPERATORKIND_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVATD Fvaluecodevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVATD_FVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_FVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVATD Avaluesetassumedvaluecodevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVATD_AVALUESETASSUMEDVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_AVALUESETASSUMEDVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVSONI Fspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVSONI_FSPECIALISEDARCHETYPEOBJECTNODEIDENTIFIERVALIDITYINFLATSIBLINGS__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_FSPECIALISEDARCHETYPEOBJECTNODEIDENTIFIERVALIDITYINFLATSIBLINGS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCCOMPLEXOBJECTPROXY Invariant Consistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_INVARIANT_CONSISTENCY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_INVARIANT_CONSISTENCY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Children Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Children Orphans Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_ORPHANS_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_ORPHANS_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Children Occurrences Lower Sum Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_OCCURRENCES_LOWER_SUM_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_OCCURRENCES_LOWER_SUM_VALIDITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Cardinality Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CARDINALITY_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CARDINALITY_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMCATTRIBUTE Invariant Alternatives Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCATTRIBUTE_INVARIANT_ALTERNATIVES_VALID__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_ALTERNATIVES_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVARXN Cexternalreferencenodeidentifiervalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVARXN_CEXTERNALREFERENCENODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate AOMVARXT Vexternalreferencetypevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVARXT_VEXTERNALREFERENCETYPEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate AOMVARX Sexternalreferenceconformstoslot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVARX_SEXTERNALREFERENCECONFORMSTOSLOT__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate AOMVARX Rexternalreferencereferstoresolvableartefact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVARX_REXTERNALREFERENCEREFERSTORESOLVABLEARTEFACT__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate AOMVARXI Dexternalreferenceslotfillingidvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVARXI_DEXTERNALREFERENCESLOTFILLINGIDVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate AOMCARCHETYPEROOT Invariant Archetype Ref Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMCARCHETYPEROOT_INVARIANT_ARCHETYPE_REF_VALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate AOMVARXA Vexternalreferencenodearchetypereferencevalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT___VALIDATE_AOMVARXA_VEXTERNALREFERENCENODEARCHETYPEREFERENCEVALIDITY__DIAGNOSTICCHAIN_MAP = COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Archetype Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_ROOT_OPERATION_COUNT = COMPLEX_OBJECT_CONSTRAINT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceAnnotationNodeItemImpl <em>Resource Annotation Node Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ResourceAnnotationNodeItemImpl
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getResourceAnnotationNodeItem()
	 * @generated
	 */
	int RESOURCE_ANNOTATION_NODE_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ANNOTATION_NODE_ITEM__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Resource Annotation Node Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ANNOTATION_NODE_ITEM_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate AOMVRAN Pannotationpathvalid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ANNOTATION_NODE_ITEM___VALIDATE_AOMVRAN_PANNOTATIONPATHVALID__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Resource Annotation Node Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ANNOTATION_NODE_ITEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.Lifecycle_state <em>Lifecycle state</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.Lifecycle_state
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getLifecycle_state()
	 * @generated
	 */
	int LIFECYCLE_STATE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS <em>VERSION STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS
	 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getVERSION_STATUS()
	 * @generated
	 */
	int VERSION_STATUS = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint <em>Complex Object Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Object Constraint</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint
	 * @generated
	 */
	EClass getComplexObjectConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#getBase_Classifier()
	 * @see #getComplexObjectConstraint()
	 * @generated
	 */
	EReference getComplexObjectConstraint_Base_Classifier();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateSingleParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Single Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Single Parent</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateSingleParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateSingleParent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAllAttributeConstraints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate All Attribute Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate All Attribute Constraints</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAllAttributeConstraints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAllAttributeConstraints__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVARCNarchetypeconceptvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARC Narchetypeconceptvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARC Narchetypeconceptvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVARCNarchetypeconceptvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVARCNarchetypeconceptvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCARMattributenamereferencemodelvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCAR Mattributenamereferencemodelvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCAR Mattributenamereferencemodelvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCARMattributenamereferencemodelvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVCARMattributenamereferencemodelvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCAE Xarchetypeattributereferencemodelexistenceconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCAE Xarchetypeattributereferencemodelexistenceconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVCAEXarchetypeattributereferencemodelexistenceconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCA Marchetypeattributereferencemodelmultiplicityconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCA Marchetypeattributereferencemodelmultiplicityconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVDIFVarchetypeattributedifferentialpathvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDIF Varchetypeattributedifferentialpathvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDIF Varchetypeattributedifferentialpathvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVDIFVarchetypeattributedifferentialpathvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVDIFVarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDIF Pspecialisedarchetypeattributedifferentialpathvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDIF Pspecialisedarchetypeattributedifferentialpathvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSANC Especialisedarchetypeattributenodeexistenceconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSANC Especialisedarchetypeattributenodeexistenceconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSA Mspecialisedarchetypeattributemultiplicityconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSA Mspecialisedarchetypeattributemultiplicityconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVSAMspecialisedarchetypeattributemultiplicityconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVACS Osinglevaluedattributechildobjectoccurrencesvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVACS Osinglevaluedattributechildobjectoccurrencesvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVACMCUcardinalityoccurrencesupperboundvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVACMC Ucardinalityoccurrencesupperboundvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVACMC Ucardinalityoccurrencesupperboundvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVACMCUcardinalityoccurrencesupperboundvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVACMCUcardinalityoccurrencesupperboundvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVACMCOcardinalityoccurrencesorphans(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVACMC Ocardinalityoccurrencesorphans</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVACMC Ocardinalityoccurrencesorphans</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVACMCOcardinalityoccurrencesorphans(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVACMCOcardinalityoccurrencesorphans__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCAC Aarchetypeattributereferencemodelcardinalityconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCAC Aarchetypeattributereferencemodelcardinalityconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVCACAarchetypeattributereferencemodelcardinalityconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMWACMC Lcardinalityoccurrenceslowerboundvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMWACMC Lcardinalityoccurrenceslowerboundvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMWACMCLcardinalityoccurrenceslowerboundvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSANC Cspecialisedarchetypeattributenodecardinalityconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSANC Cspecialisedarchetypeattributenodecardinalityconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCATUattributeuniqueness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCAT Uattributeuniqueness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCAT Uattributeuniqueness</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVCATUattributeuniqueness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVCATUattributeuniqueness__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVUNTuseNodereferencemodeltypevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVUN Tuse Nodereferencemodeltypevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVUN Tuse Nodereferencemodeltypevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVUNTuseNodereferencemodeltypevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVUNTuseNodereferencemodeltypevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVUNPuseNodepathvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVUN Puse Nodepathvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVUN Puse Nodepathvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVUNPuseNodepathvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVUNPuseNodepathvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSUNTuseNodespecialisationparentvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSUN Tuse Nodespecialisationparentvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSUN Tuse Nodespecialisationparentvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSUNTuseNodespecialisationparentvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVSUNTuseNodespecialisationparentvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVOBAVobjectnodeassumedvaluevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVOBA Vobjectnodeassumedvaluevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVOBA Vobjectnodeassumedvaluevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVOBAVobjectnodeassumedvaluevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVOBAVobjectnodeassumedvaluevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVACDFconstraintcodevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVACD Fconstraintcodevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVACD Fconstraintcodevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVACDFconstraintcodevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVACDFconstraintcodevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSONP Ispecialisedarchetypeprohibitedobjectnode AO Mnodeidvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSONP Ispecialisedarchetypeprohibitedobjectnode AO Mnodeidvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCOBJECTInvariantRmTypeNameValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCOBJECT Invariant Rm Type Name Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCOBJECT Invariant Rm Type Name Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCOBJECTInvariantRmTypeNameValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCOBJECTInvariantRmTypeNameValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCCOMPLEXOBJECT Invariant Prohibited Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Prohibited Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantProhibitedValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCCOMPLEXOBJECT Invariant Any Allowed Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Any Allowed Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTInvariantAttributesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCCOMPLEXOBJECT Invariant Attributes Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCCOMPLEXOBJECT Invariant Attributes Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTInvariantAttributesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAttributesValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTTuplesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCCOMPLEXOBJECT Tuples Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCCOMPLEXOBJECT Tuples Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTTuplesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTTuplesValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCPRIMITIVEOBJECT Invariant Representation Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCPRIMITIVEOBJECT Invariant Representation Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCPRIMITIVEOBJECT Invariant Assumed Value Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCPRIMITIVEOBJECT Invariant Assumed Value Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCBOOLEANInvariantBinaryConsistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCBOOLEAN Invariant Binary Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCBOOLEAN Invariant Binary Consistency</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCBOOLEANInvariantBinaryConsistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantBinaryConsistency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCBOOLEANInvariantPrototypeValueConsistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCBOOLEAN Invariant Prototype Value Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCBOOLEAN Invariant Prototype Value Consistency</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCBOOLEANInvariantPrototypeValueConsistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantPrototypeValueConsistency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCDATEInvariantPatternValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCDATE Invariant Pattern Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCDATE Invariant Pattern Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCDATEInvariantPatternValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCDATEInvariantPatternValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCTERMINOLOGYCODE Invariant Terminology Id Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCTERMINOLOGYCODE Invariant Terminology Id Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMASSERTIONInvariantTagValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMASSERTION Invariant Tag Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMASSERTION Invariant Tag Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMASSERTIONInvariantTagValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMASSERTIONInvariantTagValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMASSERTIONInvariantExpressionValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMASSERTION Invariant Expression Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMASSERTION Invariant Expression Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMASSERTIONInvariantExpressionValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMASSERTIONInvariantExpressionValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMQUERYVARIABLEInvariantContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMQUERYVARIABLE Invariant Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMQUERYVARIABLE Invariant Context Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMQUERYVARIABLEInvariantContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMQUERYVARIABLEInvariantContextValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMEXPRITEMInvariantTypeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMEXPRITEM Invariant Type Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMEXPRITEM Invariant Type Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMEXPRITEMInvariantTypeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMEXPRITEMInvariantTypeValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMEXPRUNARYOPERATORInvariantoperandValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMEXPRUNARYOPERATOR Invariantoperand Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMEXPRUNARYOPERATOR Invariantoperand Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMEXPRUNARYOPERATORInvariantoperandValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMEXPRUNARYOPERATORInvariantoperandValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMEXPRBINARYOPERATORInvariantleftOperandValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMEXPRBINARYOPERATOR Invariantleft Operand Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMEXPRBINARYOPERATOR Invariantleft Operand Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMEXPRBINARYOPERATORInvariantleftOperandValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantleftOperandValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMEXPRBINARYOPERATORInvariantrightOperandValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMEXPRBINARYOPERATOR Invariantright Operand Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMEXPRBINARYOPERATOR Invariantright Operand Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMEXPRBINARYOPERATORInvariantrightOperandValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantrightOperandValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMOPERATORKINDInvariantValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMOPERATORKIND Invariant Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMOPERATORKIND Invariant Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMOPERATORKINDInvariantValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMOPERATORKINDInvariantValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVATDFvaluecodevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVATD Fvaluecodevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVATD Fvaluecodevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVATDFvaluecodevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVATDFvaluecodevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVATDAvaluesetassumedvaluecodevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVATD Avaluesetassumedvaluecodevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVATD Avaluesetassumedvaluecodevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVATDAvaluesetassumedvaluecodevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVATDAvaluesetassumedvaluecodevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSONI Fspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSONI Fspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCCOMPLEXOBJECTPROXY Invariant Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCCOMPLEXOBJECTPROXY Invariant Consistency</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYInvariantConsistency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantChildrenValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Children Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Children Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantChildrenValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantChildrenOrphansValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Children Orphans Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Children Orphans Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantChildrenOrphansValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOrphansValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Children Occurrences Lower Sum Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Children Occurrences Lower Sum Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantCardinalityValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Cardinality Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Cardinality Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantCardinalityValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantCardinalityValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantAlternativesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Alternatives Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Alternatives Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint#validateAOMCATTRIBUTEInvariantAlternativesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantAlternativesValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint <em>Object Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Constraint</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint
	 * @generated
	 */
	EClass getObjectConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#isIs_deprecated <em>Is deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is deprecated</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#isIs_deprecated()
	 * @see #getObjectConstraint()
	 * @generated
	 */
	EAttribute getObjectConstraint_Is_deprecated();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateRedefinesGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefines Generalization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Redefines Generalization</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateRedefinesGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateRedefinesGeneralization__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCORMobjectconstrainttypenameexistence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCOR Mobjectconstrainttypenameexistence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCOR Mobjectconstrainttypenameexistence</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCORMobjectconstrainttypenameexistence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVCORMobjectconstrainttypenameexistence__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCORMTobjectconstrainttypevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCORM Tobjectconstrainttypevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCORM Tobjectconstrainttypevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCORMTobjectconstrainttypevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVCORMTobjectconstrainttypevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCOCDobjectconstraintdefinitionvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCOC Dobjectconstraintdefinitionvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCOC Dobjectconstraintdefinitionvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCOCDobjectconstraintdefinitionvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVCOCDobjectconstraintdefinitionvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCOIDobjectnodeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCOI Dobjectnodeidentifiervalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCOI Dobjectnodeidentifiervalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCOIDobjectnodeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVCOIDobjectnodeidentifiervalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCOSUobjectnodeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVCOS Uobjectnodeidentifiervalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVCOS Uobjectnodeidentifiervalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVCOSUobjectnodeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVCOSUobjectnodeidentifiervalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSON Tspecialisedarchetypeobjectnodemetatypeconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSON Tspecialisedarchetypeobjectnodemetatypeconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSONC Tspecialisedarchetypeobjectnodereferencetypeconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSONC Tspecialisedarchetypeobjectnodereferencetypeconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSONI Nspecialisedarchetypenewobjectnodeidentifiervalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSONI Nspecialisedarchetypenewobjectnodeidentifiervalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSONC Ospecialisedarchetyperedefineobjectnodeoccurrencesvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSONC Ospecialisedarchetyperedefineobjectnodeoccurrencesvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSONP Tspecialisedarchetypeprohibitedobjectnode AO Mtypevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSONP Tspecialisedarchetypeprohibitedobjectnode AO Mtypevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSONP Ospecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSONP Ospecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSSMspecialisedarchetypesiblingordervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVSS Mspecialisedarchetypesiblingordervalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVSS Mspecialisedarchetypesiblingordervalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMVSSMspecialisedarchetypesiblingordervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMVSSMspecialisedarchetypesiblingordervalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMARCHETYPECONSTRAINInvariantpathExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPECONSTRAIN Invariantpath Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPECONSTRAIN Invariantpath Exists</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMARCHETYPECONSTRAINInvariantpathExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMARCHETYPECONSTRAINInvariantpathExists__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCATTRIBUTEInvariantRmAttributeNameValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Rm Attribute Name Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Rm Attribute Name Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCATTRIBUTEInvariantRmAttributeNameValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCATTRIBUTEInvariantRmAttributeNameValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCATTRIBUTEInvariantExistenceValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Existence Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Existence Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCATTRIBUTEInvariantExistenceValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCATTRIBUTEInvariantExistenceValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCATTRIBUTEInvariantDifferentialPathValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Differential Path Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Differential Path Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCATTRIBUTEInvariantDifferentialPathValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCATTRIBUTEInvariantDifferentialPathValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCATTRIBUTE Invariant Child Occurrences Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCATTRIBUTE Invariant Child Occurrences Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildOccurrencesValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCARDINALITYInvariantValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCARDINALITY Invariant Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCARDINALITY Invariant Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCARDINALITYInvariantValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCARDINALITYInvariantValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCOBJECTInvariantNodeIdValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCOBJECT Invariant Node Id Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCOBJECT Invariant Node Id Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCOBJECTInvariantNodeIdValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCOBJECTInvariantNodeIdValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCOBJECTInvariantOccurrencesValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCOBJECT Invariant Occurrences Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCOBJECT Invariant Occurrences Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCOBJECTInvariantOccurrencesValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCOBJECTInvariantOccurrencesValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCOBJECTInvariantSiblingOrderValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCOBJECT Invariant Sibling Order Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCOBJECT Invariant Sibling Order Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCOBJECTInvariantSiblingOrderValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCOBJECTInvariantSiblingOrderValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMSIBLINGORDER Invariantsibling Node Id Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMSIBLINGORDER Invariantsibling Node Id Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMSIBLINGORDERInvariantsiblingNodeIdValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCDEFINEDOBJECT Invariant Default Value Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCDEFINEDOBJECT Invariant Default Value Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCDEFINEDOBJECTInvariantDefaultValueValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCCOMPLEXOBJECTPROXY Target Path Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCCOMPLEXOBJECTPROXY Target Path Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ObjectConstraint#validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYTargetPathValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.Constrains <em>Constrains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrains</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Constrains
	 * @generated
	 */
	EClass getConstrains();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.Constrains#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Constrains#getBase_Generalization()
	 * @see #getConstrains()
	 * @generated
	 */
	EReference getConstrains_Base_Generalization();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Constrains#validateSpecificObjectConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specific Object Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Specific Object Constraint</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Constrains#validateSpecificObjectConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConstrains__ValidateSpecificObjectConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Constrains#validateConstrainsRMElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Constrains RM Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Constrains RM Element</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Constrains#validateConstrainsRMElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConstrains__ValidateConstrainsRMElement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary <em>Archetype Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype Library</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary
	 * @generated
	 */
	EClass getArchetypeLibrary();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#getBase_Package()
	 * @see #getArchetypeLibrary()
	 * @generated
	 */
	EReference getArchetypeLibrary_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#isHas_aom_ids <em>Has aom ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has aom ids</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#isHas_aom_ids()
	 * @see #getArchetypeLibrary()
	 * @generated
	 */
	EAttribute getArchetypeLibrary_Has_aom_ids();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#getRm_package <em>Rm package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rm package</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#getRm_package()
	 * @see #getArchetypeLibrary()
	 * @generated
	 */
	EAttribute getArchetypeLibrary_Rm_package();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#validateOneReferenceModel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate One Reference Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate One Reference Model</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#validateOneReferenceModel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeLibrary__ValidateOneReferenceModel__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#validateOnlyArchetypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Only Archetypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Only Archetypes</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#validateOnlyArchetypes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeLibrary__ValidateOnlyArchetypes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#validateAOMARCHETYPEHRIDInvariantRmClosureValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPEHRID Invariant Rm Closure Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPEHRID Invariant Rm Closure Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary#validateAOMARCHETYPEHRIDInvariantRmClosureValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeLibrary__ValidateAOMARCHETYPEHRIDInvariantRmClosureValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.Archetype <em>Archetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype
	 * @generated
	 */
	EClass getArchetype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#getBase_Package()
	 * @see #getArchetype()
	 * @generated
	 */
	EReference getArchetype_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getArchetypeType <em>Archetype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archetype Type</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#getArchetypeType()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_ArchetypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getAmlVersion <em>Aml Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aml Version</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#getAmlVersion()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_AmlVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#isIs_controlled <em>Is controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is controlled</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#isIs_controlled()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Is_controlled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#isIs_generated <em>Is generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is generated</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#isIs_generated()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Is_generated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getRelease_version <em>Release version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release version</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#getRelease_version()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Release_version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getVersion_status <em>Version status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version status</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#getVersion_status()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Version_status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getBuild_count <em>Build count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build count</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#getBuild_count()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Build_count();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getOther_metadatas <em>Other metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other metadata</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#getOther_metadatas()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Other_metadata();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#getOther_metadata_ids <em>Other metadata id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other metadata id</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#getOther_metadata_ids()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Other_metadata_id();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateMustBeOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Must Be Owned</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateMustBeOwned(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateMustBeOwned__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateOwnsObjectConstraints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Owns Object Constraints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Owns Object Constraints</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateOwnsObjectConstraints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateOwnsObjectConstraints__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateSpecializesArchetype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specializes Archetype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Specializes Archetype</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateSpecializesArchetype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateSpecializesArchetype__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVOKUobjectkeyunique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVOK Uobjectkeyunique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVOK Uobjectkeyunique</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVOKUobjectkeyunique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVOKUobjectkeyunique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVARDTarchetypedefinitiontypenamevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARD Tarchetypedefinitiontypenamevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARD Tarchetypedefinitiontypenamevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVARDTarchetypedefinitiontypenamevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVARDTarchetypedefinitiontypenamevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVARIDarchetypeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARI Darchetypeidentifiervalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARI Darchetypeidentifiervalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVARIDarchetypeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVARIDarchetypeidentifiervalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVDEOLoriginallanguagespecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDEO Loriginallanguagespecified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDEO Loriginallanguagespecified</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVDEOLoriginallanguagespecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVDEOLoriginallanguagespecified__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVARDdescriptionspecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVAR Ddescriptionspecified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVAR Ddescriptionspecified</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVARDdescriptionspecified(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVARDdescriptionspecified__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVASIDarchetypespecialisationparentidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVASI Darchetypespecialisationparentidentifiervalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVASI Darchetypespecialisationparentidentifiervalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVASIDarchetypespecialisationparentidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVASIDarchetypespecialisationparentidentifiervalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVALCarchetypelanguageconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVAL Carchetypelanguageconformance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVAL Carchetypelanguageconformance</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVALCarchetypelanguageconformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVALCarchetypelanguageconformance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVACSDarchetypeconceptspecialisationdepth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVACS Darchetypeconceptspecialisationdepth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVACS Darchetypeconceptspecialisationdepth</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVACSDarchetypeconceptspecialisationdepth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVACSDarchetypeconceptspecialisationdepth__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVATCDarchetypecodespecialisationlevelvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVATC Darchetypecodespecialisationlevelvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVATC Darchetypecodespecialisationlevelvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVATCDarchetypecodespecialisationlevelvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVATCDarchetypecodespecialisationlevelvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantOriginalLanguageValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPE Invariant Original Language Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPE Invariant Original Language Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantOriginalLanguageValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPEInvariantOriginalLanguageValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantConceptValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPE Invariant Concept Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPE Invariant Concept Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantConceptValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPEInvariantConceptValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantDefinitionExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPE Invariant Definition Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPE Invariant Definition Exists</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantDefinitionExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPEInvariantDefinitionExists__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantTerminologyExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPE Invariant Terminology Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPE Invariant Terminology Exists</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantTerminologyExists(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPEInvariantTerminologyExists__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantSpecialisationValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPE Invariant Specialisation Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPE Invariant Specialisation Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantSpecialisationValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPEInvariantSpecialisationValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantRulesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPE Invariant Rules Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPE Invariant Rules Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEInvariantRulesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPEInvariantRulesValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEHRIDInvariantConceptIdValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPEHRID Invariant Concept Id Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPEHRID Invariant Concept Id Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEHRIDInvariantConceptIdValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPEHRIDInvariantConceptIdValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEHRIDInvariantBaseVersionValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPEHRID Invariant Base Version Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPEHRID Invariant Base Version Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPEHRIDInvariantBaseVersionValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPEHRIDInvariantBaseVersionValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMOPERATIONALTEMPLATE Invariant Is Specialised</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMOPERATIONALTEMPLATE Invariant Is Specialised</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantIsSpecialised__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMOPERATIONALTEMPLATE Invariant Component Terminologies Existence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMOPERATIONALTEMPLATE Invariant Component Terminologies Existence</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPETERMINOLOGY Invariantoriginal Language Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariantoriginal Language Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPETERMINOLOGY Invariantconcept Code Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariantconcept Code Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPETERMINOLOGY Invariantterm Definitions Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariantterm Definitions Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPETERMINOLOGY Invariant Parent Archetype Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariant Parent Archetype Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVARIABLEDECLARATIONInvariantNameValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARIABLEDECLARATION Invariant Name Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARIABLEDECLARATION Invariant Name Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.Archetype#validateAOMVARIABLEDECLARATIONInvariantNameValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetype__ValidateAOMVARIABLEDECLARATIONInvariantNameValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource <em>Authored Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authored Resource</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource
	 * @generated
	 */
	EClass getAuthoredResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCopyright()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCurrent_revision <em>Current revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current revision</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCurrent_revision()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Current_revision();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCustodian_namespace <em>Custodian namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custodian namespace</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCustodian_namespace()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Custodian_namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCustodian_organisation <em>Custodian organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custodian organisation</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getCustodian_organisation()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Custodian_organisation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getLicence <em>Licence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Licence</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getLicence()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Licence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getLifecycle_state <em>Lifecycle state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle state</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getLifecycle_state()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Lifecycle_state();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_date <em>Original author date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original author date</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_date()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Original_author_date();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_email <em>Original author email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original author email</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_email()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Original_author_email();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_name <em>Original author name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original author name</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_name()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Original_author_name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_organization <em>Original author organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original author organization</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_author_organization()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Original_author_organization();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_namespace <em>Original namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original namespace</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_namespace()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Original_namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_publisher <em>Original publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original publisher</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOriginal_publisher()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Original_publisher();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOther_contributors <em>Other contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other contributors</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOther_contributors()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Other_contributors();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOtherDetails <em>Other Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Details</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOtherDetails()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_OtherDetails();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOtherDetails_ids <em>Other Details id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Details id</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getOtherDetails_ids()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_OtherDetails_id();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getReferences()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_References();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getReferences_ids <em>References id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References id</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getReferences_ids()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_References_id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceDocumentLanguage <em>Resource Document Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Document Language</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceDocumentLanguage()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_ResourceDocumentLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceDocumentSyntax <em>Resource Document Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Document Syntax</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceDocumentSyntax()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_ResourceDocumentSyntax();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceSource <em>Resource Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Source</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceSource()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_ResourceSource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceSourceURI <em>Resource Source URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Source URI</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResourceSourceURI()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_ResourceSourceURI();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getBase_Namespace <em>Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Namespace</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getBase_Namespace()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EReference getAuthoredResource_Base_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResource_package_uri <em>Resource package uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource package uri</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getResource_package_uri()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Resource_package_uri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getUid()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Uid();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getIp_acknowledgements <em>Ip acknowledgements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ip acknowledgements</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getIp_acknowledgements()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Ip_acknowledgements();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getIp_acknowledgements_ids <em>Ip acknowledgements id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ip acknowledgements id</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.AuthoredResource#getIp_acknowledgements_ids()
	 * @see #getAuthoredResource()
	 * @generated
	 */
	EAttribute getAuthoredResource_Ip_acknowledgements_id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation <em>Resource Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Translation</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation
	 * @generated
	 */
	EClass getResourceTranslation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getBase_Enumeration()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EReference getResourceTranslation_Base_Enumeration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAccreditation <em>Accreditation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accreditation</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAccreditation()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Accreditation();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_translation_details <em>Other translation details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other translation details</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_translation_details()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Other_translation_details();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_translation_details_ids <em>Other translation details id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other translation details id</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_translation_details_ids()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Other_translation_details_id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getPurpose()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Purpose();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getKeywords()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getUse()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getMisuse <em>Misuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Misuse</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getMisuse()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Misuse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getCopyright()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Copyright();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOriginal_resource_uris <em>Original resource uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Original resource uri</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOriginal_resource_uris()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Original_resource_uri();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOriginal_resource_uriIds <em>Original resource uri Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Original resource uri Id</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOriginal_resource_uriIds()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Original_resource_uriId();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_details <em>Other details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other details</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_details()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Other_details();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_detailsIds <em>Other details Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other details Id</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getOther_detailsIds()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Other_detailsId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_name <em>Author name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author name</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_name()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Author_name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_organization <em>Author organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author organization</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_organization()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Author_organization();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_email <em>Author email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author email</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_email()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Author_email();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_date <em>Author date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author date</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getAuthor_date()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Author_date();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getVersion_last_translated <em>Version last translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version last translated</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#getVersion_last_translated()
	 * @see #getResourceTranslation()
	 * @generated
	 */
	EAttribute getResourceTranslation_Version_last_translated();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#validateAOMVOTMterminologytranslationsvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVOT Mterminologytranslationsvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVOT Mterminologytranslationsvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#validateAOMVOTMterminologytranslationsvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResourceTranslation__ValidateAOMVOTMterminologytranslationsvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#validateTranslationEntries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Translation Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Translation Entries</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#validateTranslationEntries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResourceTranslation__ValidateTranslationEntries__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#validateUniqueEntries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unique Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Unique Entries</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceTranslation#validateUniqueEntries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResourceTranslation__ValidateUniqueEntries__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition <em>Archetype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype Definition</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition
	 * @generated
	 */
	EClass getArchetypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition#getBase_Usage <em>Base Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Usage</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition#getBase_Usage()
	 * @see #getArchetypeDefinition()
	 * @generated
	 */
	EReference getArchetypeDefinition_Base_Usage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition#validateAOMARCHETYPEHRIDInvariantRmClassNameValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPEHRID Invariant Rm Class Name Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPEHRID Invariant Rm Class Name Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeDefinition#validateAOMARCHETYPEHRIDInvariantRmClassNameValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeDefinition__ValidateAOMARCHETYPEHRIDInvariantRmClassNameValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot <em>Archetype Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype Slot</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot
	 * @generated
	 */
	EClass getArchetypeSlot();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#getBase_Classifier()
	 * @see #getArchetypeSlot()
	 * @generated
	 */
	EReference getArchetypeSlot_Base_Classifier();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDSS Pspecialisedarchetypeslotdefinitionparentvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDSS Pspecialisedarchetypeslotdefinitionparentvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeSlot__ValidateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSEVarchetypeslotexcludeconstraintvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDSE Varchetypeslotexcludeconstraintvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDSE Varchetypeslotexcludeconstraintvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSEVarchetypeslotexcludeconstraintvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeSlot__ValidateAOMVDSEVarchetypeslotexcludeconstraintvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDSS Mspecialisedarchetypeslotdefinitionmatchvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDSS Mspecialisedarchetypeslotdefinitionmatchvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeSlot__ValidateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSSIDslotredefinitionchildnodeid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDSSI Dslotredefinitionchildnodeid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDSSI Dslotredefinitionchildnodeid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSSIDslotredefinitionchildnodeid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeSlot__ValidateAOMVDSSIDslotredefinitionchildnodeid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDSS Cspecialisedarchetypeslotdefinitionclosedvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDSS Cspecialisedarchetypeslotdefinitionclosedvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeSlot__ValidateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSIVarchetypeslotincludeconstraintvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVDSI Varchetypeslotincludeconstraintvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVDSI Varchetypeslotincludeconstraintvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMVDSIVarchetypeslotincludeconstraintvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeSlot__ValidateAOMVDSIVarchetypeslotincludeconstraintvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMARCHETYPESLOTInvariantincludesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPESLOT Invariantincludes Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPESLOT Invariantincludes Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMARCHETYPESLOTInvariantincludesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantincludesValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMARCHETYPESLOTInvariantexcludesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPESLOT Invariantexcludes Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPESLOT Invariantexcludes Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot#validateAOMARCHETYPESLOTInvariantexcludesValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantexcludesValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot <em>Archetype Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype Root</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot
	 * @generated
	 */
	EClass getArchetypeRoot();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXNCexternalreferencenodeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARXN Cexternalreferencenodeidentifiervalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARXN Cexternalreferencenodeidentifiervalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXNCexternalreferencenodeidentifiervalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeRoot__ValidateAOMVARXNCexternalreferencenodeidentifiervalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXTVexternalreferencetypevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARXT Vexternalreferencetypevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARXT Vexternalreferencetypevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXTVexternalreferencetypevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeRoot__ValidateAOMVARXTVexternalreferencetypevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXSexternalreferenceconformstoslot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARX Sexternalreferenceconformstoslot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARX Sexternalreferenceconformstoslot</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXSexternalreferenceconformstoslot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeRoot__ValidateAOMVARXSexternalreferenceconformstoslot__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXRexternalreferencereferstoresolvableartefact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARX Rexternalreferencereferstoresolvableartefact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARX Rexternalreferencereferstoresolvableartefact</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXRexternalreferencereferstoresolvableartefact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeRoot__ValidateAOMVARXRexternalreferencereferstoresolvableartefact__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXIDexternalreferenceslotfillingidvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARXI Dexternalreferenceslotfillingidvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARXI Dexternalreferenceslotfillingidvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXIDexternalreferenceslotfillingidvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeRoot__ValidateAOMVARXIDexternalreferenceslotfillingidvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMCARCHETYPEROOTInvariantArchetypeRefValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMCARCHETYPEROOT Invariant Archetype Ref Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMCARCHETYPEROOT Invariant Archetype Ref Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMCARCHETYPEROOTInvariantArchetypeRefValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeRoot__ValidateAOMCARCHETYPEROOTInvariantArchetypeRefValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXAVexternalreferencenodearchetypereferencevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVARXA Vexternalreferencenodearchetypereferencevalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVARXA Vexternalreferencenodearchetypereferencevalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ArchetypeRoot#validateAOMVARXAVexternalreferencenodearchetypereferencevalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeRoot__ValidateAOMVARXAVexternalreferencenodearchetypereferencevalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem <em>Resource Annotation Node Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Annotation Node Item</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem
	 * @generated
	 */
	EClass getResourceAnnotationNodeItem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem#getBase_Comment()
	 * @see #getResourceAnnotationNodeItem()
	 * @generated
	 */
	EReference getResourceAnnotationNodeItem_Base_Comment();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem#validateAOMVRANPannotationpathvalid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVRAN Pannotationpathvalid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVRAN Pannotationpathvalid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.constraint.ResourceAnnotationNodeItem#validateAOMVRANPannotationpathvalid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResourceAnnotationNodeItem__ValidateAOMVRANPannotationpathvalid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.aml.constraint.Lifecycle_state <em>Lifecycle state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle state</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.Lifecycle_state
	 * @generated
	 */
	EEnum getLifecycle_state();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS <em>VERSION STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VERSION STATUS</em>'.
	 * @see org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS
	 * @generated
	 */
	EEnum getVERSION_STATUS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintFactory getConstraintFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ComplexObjectConstraintImpl <em>Complex Object Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ComplexObjectConstraintImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getComplexObjectConstraint()
		 * @generated
		 */
		EClass COMPLEX_OBJECT_CONSTRAINT = eINSTANCE.getComplexObjectConstraint();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER = eINSTANCE.getComplexObjectConstraint_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Validate Single Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_SINGLE_PARENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateSingleParent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate All Attribute Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_ALL_ATTRIBUTE_CONSTRAINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAllAttributeConstraints__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARC Narchetypeconceptvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVARC_NARCHETYPECONCEPTVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVARCNarchetypeconceptvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCAR Mattributenamereferencemodelvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAR_MATTRIBUTENAMEREFERENCEMODELVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVCARMattributenamereferencemodelvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCAE Xarchetypeattributereferencemodelexistenceconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAE_XARCHETYPEATTRIBUTEREFERENCEMODELEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVCAEXarchetypeattributereferencemodelexistenceconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCA Marchetypeattributereferencemodelmultiplicityconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCA_MARCHETYPEATTRIBUTEREFERENCEMODELMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDIF Varchetypeattributedifferentialpathvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_VARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVDIFVarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDIF Pspecialisedarchetypeattributedifferentialpathvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_PSPECIALISEDARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSANC Especialisedarchetypeattributenodeexistenceconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_ESPECIALISEDARCHETYPEATTRIBUTENODEEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSA Mspecialisedarchetypeattributemultiplicityconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSA_MSPECIALISEDARCHETYPEATTRIBUTEMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVSAMspecialisedarchetypeattributemultiplicityconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVACS Osinglevaluedattributechildobjectoccurrencesvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACS_OSINGLEVALUEDATTRIBUTECHILDOBJECTOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVACMC Ucardinalityoccurrencesupperboundvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_UCARDINALITYOCCURRENCESUPPERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVACMCUcardinalityoccurrencesupperboundvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVACMC Ocardinalityoccurrencesorphans</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_OCARDINALITYOCCURRENCESORPHANS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVACMCOcardinalityoccurrencesorphans__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCAC Aarchetypeattributereferencemodelcardinalityconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAC_AARCHETYPEATTRIBUTEREFERENCEMODELCARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVCACAarchetypeattributereferencemodelcardinalityconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMWACMC Lcardinalityoccurrenceslowerboundvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMWACMC_LCARDINALITYOCCURRENCESLOWERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMWACMCLcardinalityoccurrenceslowerboundvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSANC Cspecialisedarchetypeattributenodecardinalityconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_CSPECIALISEDARCHETYPEATTRIBUTENODECARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCAT Uattributeuniqueness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAT_UATTRIBUTEUNIQUENESS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVCATUattributeuniqueness__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVUN Tuse Nodereferencemodeltypevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_TUSE_NODEREFERENCEMODELTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVUNTuseNodereferencemodeltypevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVUN Puse Nodepathvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_PUSE_NODEPATHVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVUNPuseNodepathvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSUN Tuse Nodespecialisationparentvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSUN_TUSE_NODESPECIALISATIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVSUNTuseNodespecialisationparentvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVOBA Vobjectnodeassumedvaluevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVOBA_VOBJECTNODEASSUMEDVALUEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVOBAVobjectnodeassumedvaluevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVACD Fconstraintcodevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACD_FCONSTRAINTCODEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVACDFconstraintcodevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSONP Ispecialisedarchetypeprohibitedobjectnode AO Mnodeidvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_ISPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MNODEIDVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCOBJECT Invariant Rm Type Name Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_RM_TYPE_NAME_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCOBJECTInvariantRmTypeNameValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCCOMPLEXOBJECT Invariant Prohibited Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_PROHIBITED_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantProhibitedValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCCOMPLEXOBJECT Invariant Any Allowed Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ANY_ALLOWED_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCCOMPLEXOBJECT Invariant Attributes Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ATTRIBUTES_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTInvariantAttributesValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCCOMPLEXOBJECT Tuples Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_TUPLES_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTTuplesValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCPRIMITIVEOBJECT Invariant Representation Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_REPRESENTATION_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCPRIMITIVEOBJECT Invariant Assumed Value Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_ASSUMED_VALUE_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCBOOLEAN Invariant Binary Consistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_BINARY_CONSISTENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantBinaryConsistency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCBOOLEAN Invariant Prototype Value Consistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_PROTOTYPE_VALUE_CONSISTENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCBOOLEANInvariantPrototypeValueConsistency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCDATE Invariant Pattern Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCDATE_INVARIANT_PATTERN_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCDATEInvariantPatternValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCTERMINOLOGYCODE Invariant Terminology Id Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCTERMINOLOGYCODE_INVARIANT_TERMINOLOGY_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMASSERTION Invariant Tag Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_TAG_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMASSERTIONInvariantTagValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMASSERTION Invariant Expression Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_EXPRESSION_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMASSERTIONInvariantExpressionValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMQUERYVARIABLE Invariant Context Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMQUERYVARIABLE_INVARIANT_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMQUERYVARIABLEInvariantContextValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMEXPRITEM Invariant Type Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRITEM_INVARIANT_TYPE_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMEXPRITEMInvariantTypeValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMEXPRUNARYOPERATOR Invariantoperand Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRUNARYOPERATOR_INVARIANTOPERAND_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMEXPRUNARYOPERATORInvariantoperandValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMEXPRBINARYOPERATOR Invariantleft Operand Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTLEFT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantleftOperandValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMEXPRBINARYOPERATOR Invariantright Operand Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTRIGHT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMEXPRBINARYOPERATORInvariantrightOperandValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMOPERATORKIND Invariant Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMOPERATORKIND_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMOPERATORKINDInvariantValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVATD Fvaluecodevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_FVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVATDFvaluecodevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVATD Avaluesetassumedvaluecodevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_AVALUESETASSUMEDVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVATDAvaluesetassumedvaluecodevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSONI Fspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_FSPECIALISEDARCHETYPEOBJECTNODEIDENTIFIERVALIDITYINFLATSIBLINGS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCCOMPLEXOBJECTPROXY Invariant Consistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_INVARIANT_CONSISTENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYInvariantConsistency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Children Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Children Orphans Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_ORPHANS_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOrphansValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Children Occurrences Lower Sum Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_OCCURRENCES_LOWER_SUM_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Cardinality Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CARDINALITY_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantCardinalityValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Alternatives Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_ALTERNATIVES_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getComplexObjectConstraint__ValidateAOMCATTRIBUTEInvariantAlternativesValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ObjectConstraintImpl <em>Object Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ObjectConstraintImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getObjectConstraint()
		 * @generated
		 */
		EClass OBJECT_CONSTRAINT = eINSTANCE.getObjectConstraint();

		/**
		 * The meta object literal for the '<em><b>Is deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_CONSTRAINT__IS_DEPRECATED = eINSTANCE.getObjectConstraint_Is_deprecated();

		/**
		 * The meta object literal for the '<em><b>Validate Redefines Generalization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateRedefinesGeneralization__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCOR Mobjectconstrainttypenameexistence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVCORMobjectconstrainttypenameexistence__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCORM Tobjectconstrainttypevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVCORMTobjectconstrainttypevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCOC Dobjectconstraintdefinitionvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVCOCDobjectconstraintdefinitionvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCOI Dobjectnodeidentifiervalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVCOIDobjectnodeidentifiervalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVCOS Uobjectnodeidentifiervalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVCOSUobjectnodeidentifiervalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSON Tspecialisedarchetypeobjectnodemetatypeconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSONC Tspecialisedarchetypeobjectnodereferencetypeconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSONI Nspecialisedarchetypenewobjectnodeidentifiervalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSONC Ospecialisedarchetyperedefineobjectnodeoccurrencesvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSONP Tspecialisedarchetypeprohibitedobjectnode AO Mtypevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSONP Ospecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVSS Mspecialisedarchetypesiblingordervalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMVSSMspecialisedarchetypesiblingordervalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPECONSTRAIN Invariantpath Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMARCHETYPECONSTRAINInvariantpathExists__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Rm Attribute Name Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCATTRIBUTEInvariantRmAttributeNameValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Existence Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCATTRIBUTEInvariantExistenceValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Differential Path Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCATTRIBUTEInvariantDifferentialPathValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCATTRIBUTE Invariant Child Occurrences Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCATTRIBUTEInvariantChildOccurrencesValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCARDINALITY Invariant Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCARDINALITYInvariantValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCOBJECT Invariant Node Id Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCOBJECTInvariantNodeIdValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCOBJECT Invariant Occurrences Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCOBJECTInvariantOccurrencesValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCOBJECT Invariant Sibling Order Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCOBJECTInvariantSiblingOrderValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMSIBLINGORDER Invariantsibling Node Id Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMSIBLINGORDERInvariantsiblingNodeIdValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCDEFINEDOBJECT Invariant Default Value Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCDEFINEDOBJECTInvariantDefaultValueValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCCOMPLEXOBJECTPROXY Target Path Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getObjectConstraint__ValidateAOMCCOMPLEXOBJECTPROXYTargetPathValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ConstrainsImpl <em>Constrains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstrainsImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getConstrains()
		 * @generated
		 */
		EClass CONSTRAINS = eINSTANCE.getConstrains();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINS__BASE_GENERALIZATION = eINSTANCE.getConstrains_Base_Generalization();

		/**
		 * The meta object literal for the '<em><b>Validate Specific Object Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINS___VALIDATE_SPECIFIC_OBJECT_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConstrains__ValidateSpecificObjectConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate Constrains RM Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSTRAINS___VALIDATE_CONSTRAINS_RM_ELEMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConstrains__ValidateConstrainsRMElement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeLibraryImpl <em>Archetype Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeLibraryImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetypeLibrary()
		 * @generated
		 */
		EClass ARCHETYPE_LIBRARY = eINSTANCE.getArchetypeLibrary();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE_LIBRARY__BASE_PACKAGE = eINSTANCE.getArchetypeLibrary_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Has aom ids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE_LIBRARY__HAS_AOM_IDS = eINSTANCE.getArchetypeLibrary_Has_aom_ids();

		/**
		 * The meta object literal for the '<em><b>Rm package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE_LIBRARY__RM_PACKAGE = eINSTANCE.getArchetypeLibrary_Rm_package();

		/**
		 * The meta object literal for the '<em><b>Validate One Reference Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_LIBRARY___VALIDATE_ONE_REFERENCE_MODEL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeLibrary__ValidateOneReferenceModel__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate Only Archetypes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_LIBRARY___VALIDATE_ONLY_ARCHETYPES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeLibrary__ValidateOnlyArchetypes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPEHRID Invariant Rm Closure Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_LIBRARY___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_CLOSURE_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeLibrary__ValidateAOMARCHETYPEHRIDInvariantRmClosureValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl <em>Archetype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetype()
		 * @generated
		 */
		EClass ARCHETYPE = eINSTANCE.getArchetype();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE__BASE_PACKAGE = eINSTANCE.getArchetype_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Archetype Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__ARCHETYPE_TYPE = eINSTANCE.getArchetype_ArchetypeType();

		/**
		 * The meta object literal for the '<em><b>Aml Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__AML_VERSION = eINSTANCE.getArchetype_AmlVersion();

		/**
		 * The meta object literal for the '<em><b>Is controlled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__IS_CONTROLLED = eINSTANCE.getArchetype_Is_controlled();

		/**
		 * The meta object literal for the '<em><b>Is generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__IS_GENERATED = eINSTANCE.getArchetype_Is_generated();

		/**
		 * The meta object literal for the '<em><b>Release version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__RELEASE_VERSION = eINSTANCE.getArchetype_Release_version();

		/**
		 * The meta object literal for the '<em><b>Version status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__VERSION_STATUS = eINSTANCE.getArchetype_Version_status();

		/**
		 * The meta object literal for the '<em><b>Build count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__BUILD_COUNT = eINSTANCE.getArchetype_Build_count();

		/**
		 * The meta object literal for the '<em><b>Other metadata</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__OTHER_METADATA = eINSTANCE.getArchetype_Other_metadata();

		/**
		 * The meta object literal for the '<em><b>Other metadata id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__OTHER_METADATA_ID = eINSTANCE.getArchetype_Other_metadata_id();

		/**
		 * The meta object literal for the '<em><b>Validate Must Be Owned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_MUST_BE_OWNED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateMustBeOwned__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate Owns Object Constraints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_OWNS_OBJECT_CONSTRAINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateOwnsObjectConstraints__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate Specializes Archetype</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_SPECIALIZES_ARCHETYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateSpecializesArchetype__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVOK Uobjectkeyunique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVOK_UOBJECTKEYUNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVOKUobjectkeyunique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARD Tarchetypedefinitiontypenamevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVARD_TARCHETYPEDEFINITIONTYPENAMEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVARDTarchetypedefinitiontypenamevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARI Darchetypeidentifiervalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVARI_DARCHETYPEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVARIDarchetypeidentifiervalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDEO Loriginallanguagespecified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVDEO_LORIGINALLANGUAGESPECIFIED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVDEOLoriginallanguagespecified__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVAR Ddescriptionspecified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVAR_DDESCRIPTIONSPECIFIED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVARDdescriptionspecified__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVASI Darchetypespecialisationparentidentifiervalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVASI_DARCHETYPESPECIALISATIONPARENTIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVASIDarchetypespecialisationparentidentifiervalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVAL Carchetypelanguageconformance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVAL_CARCHETYPELANGUAGECONFORMANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVALCarchetypelanguageconformance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVACS Darchetypeconceptspecialisationdepth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVACS_DARCHETYPECONCEPTSPECIALISATIONDEPTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVACSDarchetypeconceptspecialisationdepth__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVATC Darchetypecodespecialisationlevelvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVATC_DARCHETYPECODESPECIALISATIONLEVELVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVATCDarchetypecodespecialisationlevelvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPE Invariant Original Language Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_ORIGINAL_LANGUAGE_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPEInvariantOriginalLanguageValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPE Invariant Concept Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_CONCEPT_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPEInvariantConceptValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPE Invariant Definition Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_DEFINITION_EXISTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPEInvariantDefinitionExists__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPE Invariant Terminology Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_TERMINOLOGY_EXISTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPEInvariantTerminologyExists__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPE Invariant Specialisation Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_SPECIALISATION_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPEInvariantSpecialisationValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPE Invariant Rules Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_RULES_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPEInvariantRulesValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPEHRID Invariant Concept Id Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPEHRID_INVARIANT_CONCEPT_ID_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPEHRIDInvariantConceptIdValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPEHRID Invariant Base Version Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPEHRID_INVARIANT_BASE_VERSION_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPEHRIDInvariantBaseVersionValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMOPERATIONALTEMPLATE Invariant Is Specialised</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMOPERATIONALTEMPLATE_INVARIANT_IS_SPECIALISED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantIsSpecialised__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMOPERATIONALTEMPLATE Invariant Component Terminologies Existence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMOPERATIONALTEMPLATE_INVARIANT_COMPONENT_TERMINOLOGIES_EXISTENCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPETERMINOLOGY Invariantoriginal Language Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTORIGINAL_LANGUAGE_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPETERMINOLOGY Invariantconcept Code Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTCONCEPT_CODE_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPETERMINOLOGY Invariantterm Definitions Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTTERM_DEFINITIONS_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPETERMINOLOGY Invariant Parent Archetype Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANT_PARENT_ARCHETYPE_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARIABLEDECLARATION Invariant Name Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE___VALIDATE_AOMVARIABLEDECLARATION_INVARIANT_NAME_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetype__ValidateAOMVARIABLEDECLARATIONInvariantNameValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl <em>Authored Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.AuthoredResourceImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getAuthoredResource()
		 * @generated
		 */
		EClass AUTHORED_RESOURCE = eINSTANCE.getAuthoredResource();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__COPYRIGHT = eINSTANCE.getAuthoredResource_Copyright();

		/**
		 * The meta object literal for the '<em><b>Current revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__CURRENT_REVISION = eINSTANCE.getAuthoredResource_Current_revision();

		/**
		 * The meta object literal for the '<em><b>Custodian namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__CUSTODIAN_NAMESPACE = eINSTANCE.getAuthoredResource_Custodian_namespace();

		/**
		 * The meta object literal for the '<em><b>Custodian organisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__CUSTODIAN_ORGANISATION = eINSTANCE.getAuthoredResource_Custodian_organisation();

		/**
		 * The meta object literal for the '<em><b>Licence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__LICENCE = eINSTANCE.getAuthoredResource_Licence();

		/**
		 * The meta object literal for the '<em><b>Lifecycle state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__LIFECYCLE_STATE = eINSTANCE.getAuthoredResource_Lifecycle_state();

		/**
		 * The meta object literal for the '<em><b>Original author date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__ORIGINAL_AUTHOR_DATE = eINSTANCE.getAuthoredResource_Original_author_date();

		/**
		 * The meta object literal for the '<em><b>Original author email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__ORIGINAL_AUTHOR_EMAIL = eINSTANCE.getAuthoredResource_Original_author_email();

		/**
		 * The meta object literal for the '<em><b>Original author name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__ORIGINAL_AUTHOR_NAME = eINSTANCE.getAuthoredResource_Original_author_name();

		/**
		 * The meta object literal for the '<em><b>Original author organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__ORIGINAL_AUTHOR_ORGANIZATION = eINSTANCE.getAuthoredResource_Original_author_organization();

		/**
		 * The meta object literal for the '<em><b>Original namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__ORIGINAL_NAMESPACE = eINSTANCE.getAuthoredResource_Original_namespace();

		/**
		 * The meta object literal for the '<em><b>Original publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__ORIGINAL_PUBLISHER = eINSTANCE.getAuthoredResource_Original_publisher();

		/**
		 * The meta object literal for the '<em><b>Other contributors</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__OTHER_CONTRIBUTORS = eINSTANCE.getAuthoredResource_Other_contributors();

		/**
		 * The meta object literal for the '<em><b>Other Details</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__OTHER_DETAILS = eINSTANCE.getAuthoredResource_OtherDetails();

		/**
		 * The meta object literal for the '<em><b>Other Details id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__OTHER_DETAILS_ID = eINSTANCE.getAuthoredResource_OtherDetails_id();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__REFERENCES = eINSTANCE.getAuthoredResource_References();

		/**
		 * The meta object literal for the '<em><b>References id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__REFERENCES_ID = eINSTANCE.getAuthoredResource_References_id();

		/**
		 * The meta object literal for the '<em><b>Resource Document Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__RESOURCE_DOCUMENT_LANGUAGE = eINSTANCE.getAuthoredResource_ResourceDocumentLanguage();

		/**
		 * The meta object literal for the '<em><b>Resource Document Syntax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__RESOURCE_DOCUMENT_SYNTAX = eINSTANCE.getAuthoredResource_ResourceDocumentSyntax();

		/**
		 * The meta object literal for the '<em><b>Resource Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__RESOURCE_SOURCE = eINSTANCE.getAuthoredResource_ResourceSource();

		/**
		 * The meta object literal for the '<em><b>Resource Source URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__RESOURCE_SOURCE_URI = eINSTANCE.getAuthoredResource_ResourceSourceURI();

		/**
		 * The meta object literal for the '<em><b>Base Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORED_RESOURCE__BASE_NAMESPACE = eINSTANCE.getAuthoredResource_Base_Namespace();

		/**
		 * The meta object literal for the '<em><b>Resource package uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__RESOURCE_PACKAGE_URI = eINSTANCE.getAuthoredResource_Resource_package_uri();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__UID = eINSTANCE.getAuthoredResource_Uid();

		/**
		 * The meta object literal for the '<em><b>Ip acknowledgements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS = eINSTANCE.getAuthoredResource_Ip_acknowledgements();

		/**
		 * The meta object literal for the '<em><b>Ip acknowledgements id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORED_RESOURCE__IP_ACKNOWLEDGEMENTS_ID = eINSTANCE.getAuthoredResource_Ip_acknowledgements_id();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl <em>Resource Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ResourceTranslationImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getResourceTranslation()
		 * @generated
		 */
		EClass RESOURCE_TRANSLATION = eINSTANCE.getResourceTranslation();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TRANSLATION__BASE_ENUMERATION = eINSTANCE.getResourceTranslation_Base_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Accreditation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__ACCREDITATION = eINSTANCE.getResourceTranslation_Accreditation();

		/**
		 * The meta object literal for the '<em><b>Other translation details</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS = eINSTANCE.getResourceTranslation_Other_translation_details();

		/**
		 * The meta object literal for the '<em><b>Other translation details id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__OTHER_TRANSLATION_DETAILS_ID = eINSTANCE.getResourceTranslation_Other_translation_details_id();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__PURPOSE = eINSTANCE.getResourceTranslation_Purpose();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__KEYWORDS = eINSTANCE.getResourceTranslation_Keywords();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__USE = eINSTANCE.getResourceTranslation_Use();

		/**
		 * The meta object literal for the '<em><b>Misuse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__MISUSE = eINSTANCE.getResourceTranslation_Misuse();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__COPYRIGHT = eINSTANCE.getResourceTranslation_Copyright();

		/**
		 * The meta object literal for the '<em><b>Original resource uri</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI = eINSTANCE.getResourceTranslation_Original_resource_uri();

		/**
		 * The meta object literal for the '<em><b>Original resource uri Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__ORIGINAL_RESOURCE_URI_ID = eINSTANCE.getResourceTranslation_Original_resource_uriId();

		/**
		 * The meta object literal for the '<em><b>Other details</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__OTHER_DETAILS = eINSTANCE.getResourceTranslation_Other_details();

		/**
		 * The meta object literal for the '<em><b>Other details Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__OTHER_DETAILS_ID = eINSTANCE.getResourceTranslation_Other_detailsId();

		/**
		 * The meta object literal for the '<em><b>Author name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__AUTHOR_NAME = eINSTANCE.getResourceTranslation_Author_name();

		/**
		 * The meta object literal for the '<em><b>Author organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__AUTHOR_ORGANIZATION = eINSTANCE.getResourceTranslation_Author_organization();

		/**
		 * The meta object literal for the '<em><b>Author email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__AUTHOR_EMAIL = eINSTANCE.getResourceTranslation_Author_email();

		/**
		 * The meta object literal for the '<em><b>Author date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__AUTHOR_DATE = eINSTANCE.getResourceTranslation_Author_date();

		/**
		 * The meta object literal for the '<em><b>Version last translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TRANSLATION__VERSION_LAST_TRANSLATED = eINSTANCE.getResourceTranslation_Version_last_translated();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVOT Mterminologytranslationsvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_TRANSLATION___VALIDATE_AOMVOT_MTERMINOLOGYTRANSLATIONSVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResourceTranslation__ValidateAOMVOTMterminologytranslationsvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate Translation Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_TRANSLATION___VALIDATE_TRANSLATION_ENTRIES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResourceTranslation__ValidateTranslationEntries__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate Unique Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_TRANSLATION___VALIDATE_UNIQUE_ENTRIES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResourceTranslation__ValidateUniqueEntries__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeDefinitionImpl <em>Archetype Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeDefinitionImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetypeDefinition()
		 * @generated
		 */
		EClass ARCHETYPE_DEFINITION = eINSTANCE.getArchetypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE_DEFINITION__BASE_USAGE = eINSTANCE.getArchetypeDefinition_Base_Usage();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPEHRID Invariant Rm Class Name Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_DEFINITION___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_CLASS_NAME_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeDefinition__ValidateAOMARCHETYPEHRIDInvariantRmClassNameValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeSlotImpl <em>Archetype Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeSlotImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetypeSlot()
		 * @generated
		 */
		EClass ARCHETYPE_SLOT = eINSTANCE.getArchetypeSlot();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE_SLOT__BASE_CLASSIFIER = eINSTANCE.getArchetypeSlot_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDSS Pspecialisedarchetypeslotdefinitionparentvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_SLOT___VALIDATE_AOMVDSS_PSPECIALISEDARCHETYPESLOTDEFINITIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeSlot__ValidateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDSE Varchetypeslotexcludeconstraintvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_SLOT___VALIDATE_AOMVDSE_VARCHETYPESLOTEXCLUDECONSTRAINTVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeSlot__ValidateAOMVDSEVarchetypeslotexcludeconstraintvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDSS Mspecialisedarchetypeslotdefinitionmatchvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_SLOT___VALIDATE_AOMVDSS_MSPECIALISEDARCHETYPESLOTDEFINITIONMATCHVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeSlot__ValidateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDSSI Dslotredefinitionchildnodeid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_SLOT___VALIDATE_AOMVDSSI_DSLOTREDEFINITIONCHILDNODEID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeSlot__ValidateAOMVDSSIDslotredefinitionchildnodeid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDSS Cspecialisedarchetypeslotdefinitionclosedvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_SLOT___VALIDATE_AOMVDSS_CSPECIALISEDARCHETYPESLOTDEFINITIONCLOSEDVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeSlot__ValidateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVDSI Varchetypeslotincludeconstraintvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_SLOT___VALIDATE_AOMVDSI_VARCHETYPESLOTINCLUDECONSTRAINTVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeSlot__ValidateAOMVDSIVarchetypeslotincludeconstraintvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPESLOT Invariantincludes Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPESLOT_INVARIANTINCLUDES_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantincludesValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPESLOT Invariantexcludes Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPESLOT_INVARIANTEXCLUDES_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeSlot__ValidateAOMARCHETYPESLOTInvariantexcludesValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeRootImpl <em>Archetype Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeRootImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getArchetypeRoot()
		 * @generated
		 */
		EClass ARCHETYPE_ROOT = eINSTANCE.getArchetypeRoot();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARXN Cexternalreferencenodeidentifiervalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_ROOT___VALIDATE_AOMVARXN_CEXTERNALREFERENCENODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeRoot__ValidateAOMVARXNCexternalreferencenodeidentifiervalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARXT Vexternalreferencetypevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_ROOT___VALIDATE_AOMVARXT_VEXTERNALREFERENCETYPEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeRoot__ValidateAOMVARXTVexternalreferencetypevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARX Sexternalreferenceconformstoslot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_ROOT___VALIDATE_AOMVARX_SEXTERNALREFERENCECONFORMSTOSLOT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeRoot__ValidateAOMVARXSexternalreferenceconformstoslot__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARX Rexternalreferencereferstoresolvableartefact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_ROOT___VALIDATE_AOMVARX_REXTERNALREFERENCEREFERSTORESOLVABLEARTEFACT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeRoot__ValidateAOMVARXRexternalreferencereferstoresolvableartefact__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARXI Dexternalreferenceslotfillingidvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_ROOT___VALIDATE_AOMVARXI_DEXTERNALREFERENCESLOTFILLINGIDVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeRoot__ValidateAOMVARXIDexternalreferenceslotfillingidvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMCARCHETYPEROOT Invariant Archetype Ref Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_ROOT___VALIDATE_AOMCARCHETYPEROOT_INVARIANT_ARCHETYPE_REF_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeRoot__ValidateAOMCARCHETYPEROOTInvariantArchetypeRefValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVARXA Vexternalreferencenodearchetypereferencevalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_ROOT___VALIDATE_AOMVARXA_VEXTERNALREFERENCENODEARCHETYPEREFERENCEVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeRoot__ValidateAOMVARXAVexternalreferencenodearchetypereferencevalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.impl.ResourceAnnotationNodeItemImpl <em>Resource Annotation Node Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ResourceAnnotationNodeItemImpl
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getResourceAnnotationNodeItem()
		 * @generated
		 */
		EClass RESOURCE_ANNOTATION_NODE_ITEM = eINSTANCE.getResourceAnnotationNodeItem();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ANNOTATION_NODE_ITEM__BASE_COMMENT = eINSTANCE.getResourceAnnotationNodeItem_Base_Comment();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVRAN Pannotationpathvalid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_ANNOTATION_NODE_ITEM___VALIDATE_AOMVRAN_PANNOTATIONPATHVALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResourceAnnotationNodeItem__ValidateAOMVRANPannotationpathvalid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.Lifecycle_state <em>Lifecycle state</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.Lifecycle_state
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getLifecycle_state()
		 * @generated
		 */
		EEnum LIFECYCLE_STATE = eINSTANCE.getLifecycle_state();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS <em>VERSION STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS
		 * @see org.eclipse.mdht.uml.aml.constraint.impl.ConstraintPackageImpl#getVERSION_STATUS()
		 * @generated
		 */
		EEnum VERSION_STATUS = eINSTANCE.getVERSION_STATUS();

	}

} //ConstraintPackage
