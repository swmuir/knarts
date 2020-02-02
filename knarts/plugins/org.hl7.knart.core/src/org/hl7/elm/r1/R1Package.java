/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * 
 * 			This file defines the expression extensions that introduce clinically relevant dependencies such as clinical data access, terminology, and value set considerations.
 * 		
 * This file defines the core expression components used throughout artifacts based on the Expression Logical Model. The core expression components defined here are intended to be general purpose, and do not reference anything specific to the clinical quality domain. This layering is intended to isolate the conceptual elements of a general purpose expression language from the clinically-focused operations relevant to the clinical quality domain.
 * <!-- end-model-doc -->
 * @see org.hl7.elm.r1.R1Factory
 * @model kind="package"
 * @generated
 */
public interface R1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "r1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:hl7-org:elm:r1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "r1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	R1Package eINSTANCE = org.hl7.elm.r1.impl.R1PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ElementImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 41;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LOCAL_ID = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ExpressionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 48;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.UnaryExpressionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 160;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AbsImpl <em>Abs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AbsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAbs()
	 * @generated
	 */
	int ABS = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Abs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.BinaryExpressionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AddImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AfterImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AggregateExpressionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAggregateExpression()
	 * @generated
	 */
	int AGGREGATE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__PATH = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AliasedQuerySourceImpl <em>Aliased Query Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AliasedQuerySourceImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAliasedQuerySource()
	 * @generated
	 */
	int ALIASED_QUERY_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_QUERY_SOURCE__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_QUERY_SOURCE__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_QUERY_SOURCE__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_QUERY_SOURCE__ALIAS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aliased Query Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_QUERY_SOURCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aliased Query Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIASED_QUERY_SOURCE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AliasRefImpl <em>Alias Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AliasRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAliasRef()
	 * @generated
	 */
	int ALIAS_REF = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_REF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_REF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_REF__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alias Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alias Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AllTrueImpl <em>All True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AllTrueImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAllTrue()
	 * @generated
	 */
	int ALL_TRUE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRUE__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRUE__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRUE__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRUE__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>All True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRUE_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_TRUE_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AndImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAnd()
	 * @generated
	 */
	int AND = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AnyTrueImpl <em>Any True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AnyTrueImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAnyTrue()
	 * @generated
	 */
	int ANY_TRUE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TRUE__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TRUE__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TRUE__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TRUE__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Any True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TRUE_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TRUE_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AsImpl <em>As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAs()
	 * @generated
	 */
	int AS = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>As Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS__AS_TYPE_SPECIFIER = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>As Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS__AS_TYPE = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS__STRICT = UNARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.AvgImpl <em>Avg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.AvgImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAvg()
	 * @generated
	 */
	int AVG = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Avg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.BeforeImpl <em>Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.BeforeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getBefore()
	 * @generated
	 */
	int BEFORE = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SortByItemImpl <em>Sort By Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SortByItemImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSortByItem()
	 * @generated
	 */
	int SORT_BY_ITEM = 136;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_ITEM__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_ITEM__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_ITEM__DIRECTION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sort By Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_ITEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sort By Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_ITEM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ByColumnImpl <em>By Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ByColumnImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getByColumn()
	 * @generated
	 */
	int BY_COLUMN = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COLUMN__ANNOTATION = SORT_BY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COLUMN__LOCAL_ID = SORT_BY_ITEM__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COLUMN__DIRECTION = SORT_BY_ITEM__DIRECTION;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COLUMN__PATH = SORT_BY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>By Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COLUMN_FEATURE_COUNT = SORT_BY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>By Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_COLUMN_OPERATION_COUNT = SORT_BY_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ByDirectionImpl <em>By Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ByDirectionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getByDirection()
	 * @generated
	 */
	int BY_DIRECTION = 14;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_DIRECTION__ANNOTATION = SORT_BY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_DIRECTION__LOCAL_ID = SORT_BY_ITEM__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_DIRECTION__DIRECTION = SORT_BY_ITEM__DIRECTION;

	/**
	 * The number of structural features of the '<em>By Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_DIRECTION_FEATURE_COUNT = SORT_BY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>By Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_DIRECTION_OPERATION_COUNT = SORT_BY_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ByExpressionImpl <em>By Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ByExpressionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getByExpression()
	 * @generated
	 */
	int BY_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_EXPRESSION__ANNOTATION = SORT_BY_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_EXPRESSION__LOCAL_ID = SORT_BY_ITEM__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_EXPRESSION__DIRECTION = SORT_BY_ITEM__DIRECTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_EXPRESSION__EXPRESSION = SORT_BY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>By Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_EXPRESSION_FEATURE_COUNT = SORT_BY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>By Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BY_EXPRESSION_OPERATION_COUNT = SORT_BY_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CalculateAgeImpl <em>Calculate Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CalculateAgeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCalculateAge()
	 * @generated
	 */
	int CALCULATE_AGE = 16;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE__PRECISION = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calculate Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Calculate Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CalculateAgeAtImpl <em>Calculate Age At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CalculateAgeAtImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCalculateAgeAt()
	 * @generated
	 */
	int CALCULATE_AGE_AT = 17;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE_AT__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE_AT__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE_AT__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE_AT__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calculate Age At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE_AT_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Calculate Age At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATE_AGE_AT_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CaseImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCase()
	 * @generated
	 */
	int CASE = 18;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Comparand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__COMPARAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CASE_ITEM = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CaseItemImpl <em>Case Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CaseItemImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCaseItem()
	 * @generated
	 */
	int CASE_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ITEM__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ITEM__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ITEM__WHEN = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ITEM__THEN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ITEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Case Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_ITEM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CeilingImpl <em>Ceiling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CeilingImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCeiling()
	 * @generated
	 */
	int CEILING = 20;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Ceiling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ceiling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.NaryExpressionImpl <em>Nary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.NaryExpressionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getNaryExpression()
	 * @generated
	 */
	int NARY_EXPRESSION = 100;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_EXPRESSION__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CoalesceImpl <em>Coalesce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CoalesceImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCoalesce()
	 * @generated
	 */
	int COALESCE = 21;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COALESCE__ANNOTATION = NARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COALESCE__LOCAL_ID = NARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COALESCE__OPERAND = NARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Coalesce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COALESCE_FEATURE_COUNT = NARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coalesce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COALESCE_OPERATION_COUNT = NARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CodeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCode()
	 * @generated
	 */
	int CODE = 22;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SYSTEM = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CODE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DISPLAY = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CodeSystemDefImpl <em>Code System Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CodeSystemDefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCodeSystemDef()
	 * @generated
	 */
	int CODE_SYSTEM_DEF = 23;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_DEF__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_DEF__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_DEF__ACCESS_LEVEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_DEF__ID = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_DEF__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_DEF__VERSION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Code System Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_DEF_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Code System Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_DEF_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CodeSystemRefImpl <em>Code System Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CodeSystemRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCodeSystemRef()
	 * @generated
	 */
	int CODE_SYSTEM_REF = 24;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REF__LIBRARY_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REF__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code System Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Code System Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CollapseImpl <em>Collapse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CollapseImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCollapse()
	 * @generated
	 */
	int COLLAPSE = 25;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Collapse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collapse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CombineImpl <em>Combine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CombineImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCombine()
	 * @generated
	 */
	int COMBINE = 26;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__SEPARATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Combine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ConcatenateImpl <em>Concatenate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ConcatenateImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getConcatenate()
	 * @generated
	 */
	int CONCATENATE = 27;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE__ANNOTATION = NARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE__LOCAL_ID = NARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE__OPERAND = NARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Concatenate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_FEATURE_COUNT = NARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concatenate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_OPERATION_COUNT = NARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ConceptImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 28;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CODE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__DISPLAY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ContainsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 29;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ConvertImpl <em>Convert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ConvertImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getConvert()
	 * @generated
	 */
	int CONVERT = 30;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>To Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__TO_TYPE_SPECIFIER = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__TO_TYPE = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Convert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Convert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CountImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 31;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.CurrentImpl <em>Current</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.CurrentImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getCurrent()
	 * @generated
	 */
	int CURRENT = 32;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT__SCOPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.DateFromImpl <em>Date From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.DateFromImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDateFrom()
	 * @generated
	 */
	int DATE_FROM = 33;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FROM__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FROM__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FROM__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Date From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FROM_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FROM_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.DateTimeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 34;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__YEAR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MONTH = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__DAY = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__HOUR = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MINUTE = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__SECOND = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Millisecond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MILLISECOND = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timezone Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__TIMEZONE_OFFSET = EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.DateTimeComponentFromImpl <em>Date Time Component From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.DateTimeComponentFromImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDateTimeComponentFrom()
	 * @generated
	 */
	int DATE_TIME_COMPONENT_FROM = 35;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_COMPONENT_FROM__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_COMPONENT_FROM__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_COMPONENT_FROM__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_COMPONENT_FROM__PRECISION = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Component From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_COMPONENT_FROM_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time Component From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_COMPONENT_FROM_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.DefineClauseImpl <em>Define Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.DefineClauseImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDefineClause()
	 * @generated
	 */
	int DEFINE_CLAUSE = 36;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_CLAUSE__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_CLAUSE__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_CLAUSE__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_CLAUSE__IDENTIFIER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Define Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_CLAUSE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Define Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_CLAUSE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.DifferenceBetweenImpl <em>Difference Between</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.DifferenceBetweenImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDifferenceBetween()
	 * @generated
	 */
	int DIFFERENCE_BETWEEN = 37;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_BETWEEN__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_BETWEEN__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_BETWEEN__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_BETWEEN__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Difference Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_BETWEEN_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Difference Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENCE_BETWEEN_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.DistinctImpl <em>Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.DistinctImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDistinct()
	 * @generated
	 */
	int DISTINCT = 38;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.DivideImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 39;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.DurationBetweenImpl <em>Duration Between</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.DurationBetweenImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDurationBetween()
	 * @generated
	 */
	int DURATION_BETWEEN = 40;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BETWEEN__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BETWEEN__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BETWEEN__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BETWEEN__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BETWEEN_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Duration Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BETWEEN_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.EndImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getEnd()
	 * @generated
	 */
	int END = 42;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.EndsImpl <em>Ends</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.EndsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getEnds()
	 * @generated
	 */
	int ENDS = 43;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.EqualImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 44;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ExceptImpl <em>Except</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ExceptImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getExcept()
	 * @generated
	 */
	int EXCEPT = 45;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Except</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Except</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ExistsImpl <em>Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ExistsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getExists()
	 * @generated
	 */
	int EXISTS = 46;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ExpandImpl <em>Expand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ExpandImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getExpand()
	 * @generated
	 */
	int EXPAND = 47;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Expand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ExpressionDefImpl <em>Expression Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ExpressionDefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getExpressionDef()
	 * @generated
	 */
	int EXPRESSION_DEF = 49;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEF__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEF__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEF__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEF__ACCESS_LEVEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEF__CONTEXT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEF__NAME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Expression Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEF_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Expression Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DEF_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ExpressionRefImpl <em>Expression Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ExpressionRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getExpressionRef()
	 * @generated
	 */
	int EXPRESSION_REF = 50;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_REF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_REF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_REF__LIBRARY_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_REF__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.FilterImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 51;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONDITION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__SCOPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.FirstImpl <em>First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.FirstImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getFirst()
	 * @generated
	 */
	int FIRST = 52;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST__ORDER_BY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.FloorImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 53;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ForEachImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getForEach()
	 * @generated
	 */
	int FOR_EACH = 54;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ELEMENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SCOPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.FunctionDefImpl <em>Function Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.FunctionDefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getFunctionDef()
	 * @generated
	 */
	int FUNCTION_DEF = 55;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__ANNOTATION = EXPRESSION_DEF__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__LOCAL_ID = EXPRESSION_DEF__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__EXPRESSION = EXPRESSION_DEF__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__ACCESS_LEVEL = EXPRESSION_DEF__ACCESS_LEVEL;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__CONTEXT = EXPRESSION_DEF__CONTEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__NAME = EXPRESSION_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF__OPERAND = EXPRESSION_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF_FEATURE_COUNT = EXPRESSION_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEF_OPERATION_COUNT = EXPRESSION_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.FunctionRefImpl <em>Function Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.FunctionRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getFunctionRef()
	 * @generated
	 */
	int FUNCTION_REF = 56;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF__ANNOTATION = EXPRESSION_REF__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF__LOCAL_ID = EXPRESSION_REF__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF__LIBRARY_NAME = EXPRESSION_REF__LIBRARY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF__NAME = EXPRESSION_REF__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF__OPERAND = EXPRESSION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF_FEATURE_COUNT = EXPRESSION_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF_OPERATION_COUNT = EXPRESSION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.GreaterImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 57;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.GreaterOrEqualImpl <em>Greater Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.GreaterOrEqualImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getGreaterOrEqual()
	 * @generated
	 */
	int GREATER_OR_EQUAL = 58;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Greater Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OR_EQUAL_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IdentifierRefImpl <em>Identifier Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IdentifierRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIdentifierRef()
	 * @generated
	 */
	int IDENTIFIER_REF = 59;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REF__LIBRARY_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REF__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifier Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Identifier Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IfImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIf()
	 * @generated
	 */
	int IF = 60;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.InImpl <em>In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.InImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIn()
	 * @generated
	 */
	int IN = 61;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IncludedInImpl <em>Included In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IncludedInImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIncludedIn()
	 * @generated
	 */
	int INCLUDED_IN = 62;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_IN__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_IN__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_IN__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_IN__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Included In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_IN_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Included In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_IN_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IncludesImpl <em>Includes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IncludesImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIncludes()
	 * @generated
	 */
	int INCLUDES = 63;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDES_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.InCodeSystemImpl <em>In Code System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.InCodeSystemImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getInCodeSystem()
	 * @generated
	 */
	int IN_CODE_SYSTEM = 64;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CODE_SYSTEM__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CODE_SYSTEM__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CODE_SYSTEM__CODE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codesystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CODE_SYSTEM__CODESYSTEM = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Code System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CODE_SYSTEM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>In Code System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CODE_SYSTEM_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IndexerImpl <em>Indexer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IndexerImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIndexer()
	 * @generated
	 */
	int INDEXER = 65;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXER__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXER__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXER__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Indexer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Indexer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IndexOfImpl <em>Index Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IndexOfImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIndexOf()
	 * @generated
	 */
	int INDEX_OF = 66;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF__ELEMENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Index Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Index Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.InstanceImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 67;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CLASS_TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.InstanceElementImpl <em>Instance Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.InstanceElementImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getInstanceElement()
	 * @generated
	 */
	int INSTANCE_ELEMENT = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ELEMENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Instance Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instance Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IntersectImpl <em>Intersect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IntersectImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIntersect()
	 * @generated
	 */
	int INTERSECT = 69;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECT__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECT__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECT__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Intersect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECT_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intersect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECT_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IntervalImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 70;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Low</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LOW = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Low Closed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LOW_CLOSED_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__HIGH = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>High Closed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__HIGH_CLOSED_EXPRESSION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>High Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__HIGH_CLOSED = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Low Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LOW_CLOSED = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TypeSpecifierImpl <em>Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TypeSpecifierImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTypeSpecifier()
	 * @generated
	 */
	int TYPE_SPECIFIER = 159;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFIER__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFIER__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The number of structural features of the '<em>Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFIER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPECIFIER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IntervalTypeSpecifierImpl <em>Interval Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IntervalTypeSpecifierImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIntervalTypeSpecifier()
	 * @generated
	 */
	int INTERVAL_TYPE_SPECIFIER = 71;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE_SPECIFIER__ANNOTATION = TYPE_SPECIFIER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE_SPECIFIER__LOCAL_ID = TYPE_SPECIFIER__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Point Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE_SPECIFIER__POINT_TYPE = TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interval Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE_SPECIFIER_FEATURE_COUNT = TYPE_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interval Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_TYPE_SPECIFIER_OPERATION_COUNT = TYPE_SPECIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.InValueSetImpl <em>In Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.InValueSetImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getInValueSet()
	 * @generated
	 */
	int IN_VALUE_SET = 72;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_SET__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_SET__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_SET__CODE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valueset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_SET__VALUESET = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_SET_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>In Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VALUE_SET_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IsImpl <em>Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIs()
	 * @generated
	 */
	int IS = 73;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Is Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS__IS_TYPE_SPECIFIER = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS__IS_TYPE = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IsFalseImpl <em>Is False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IsFalseImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIsFalse()
	 * @generated
	 */
	int IS_FALSE = 74;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FALSE__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FALSE__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FALSE__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Is False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FALSE_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_FALSE_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IsNullImpl <em>Is Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IsNullImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIsNull()
	 * @generated
	 */
	int IS_NULL = 75;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NULL_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.IsTrueImpl <em>Is True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.IsTrueImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getIsTrue()
	 * @generated
	 */
	int IS_TRUE = 76;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRUE__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRUE__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRUE__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Is True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRUE_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRUE_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.LastImpl <em>Last</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.LastImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getLast()
	 * @generated
	 */
	int LAST = 77;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST__ORDER_BY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Last</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.LengthImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 78;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.LessImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getLess()
	 * @generated
	 */
	int LESS = 79;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.LessOrEqualImpl <em>Less Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.LessOrEqualImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getLessOrEqual()
	 * @generated
	 */
	int LESS_OR_EQUAL = 80;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Less Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ListImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getList()
	 * @generated
	 */
	int LIST = 81;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TYPE_SPECIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ListTypeSpecifierImpl <em>List Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ListTypeSpecifierImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getListTypeSpecifier()
	 * @generated
	 */
	int LIST_TYPE_SPECIFIER = 82;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_SPECIFIER__ANNOTATION = TYPE_SPECIFIER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_SPECIFIER__LOCAL_ID = TYPE_SPECIFIER__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_SPECIFIER__ELEMENT_TYPE = TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_SPECIFIER_FEATURE_COUNT = TYPE_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_SPECIFIER_OPERATION_COUNT = TYPE_SPECIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.LiteralImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 83;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE_TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.LnImpl <em>Ln</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.LnImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getLn()
	 * @generated
	 */
	int LN = 84;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Ln</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ln</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LN_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.LogImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getLog()
	 * @generated
	 */
	int LOG = 85;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.LowerImpl <em>Lower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.LowerImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getLower()
	 * @generated
	 */
	int LOWER = 86;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Lower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MatchesImpl <em>Matches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MatchesImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMatches()
	 * @generated
	 */
	int MATCHES = 87;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Matches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Matches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MaxImpl <em>Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MaxImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMax()
	 * @generated
	 */
	int MAX = 88;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MaxValueImpl <em>Max Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MaxValueImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMaxValue()
	 * @generated
	 */
	int MAX_VALUE = 89;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE__VALUE_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MedianImpl <em>Median</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MedianImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMedian()
	 * @generated
	 */
	int MEDIAN = 90;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Median</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Median</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MeetsImpl <em>Meets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MeetsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMeets()
	 * @generated
	 */
	int MEETS = 91;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MeetsAfterImpl <em>Meets After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MeetsAfterImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMeetsAfter()
	 * @generated
	 */
	int MEETS_AFTER = 92;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_AFTER__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_AFTER__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_AFTER__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_AFTER__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meets After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_AFTER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meets After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_AFTER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MeetsBeforeImpl <em>Meets Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MeetsBeforeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMeetsBefore()
	 * @generated
	 */
	int MEETS_BEFORE = 93;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_BEFORE__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_BEFORE__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_BEFORE__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_BEFORE__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meets Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_BEFORE_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meets Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETS_BEFORE_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MinImpl <em>Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MinImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMin()
	 * @generated
	 */
	int MIN = 94;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MinValueImpl <em>Min Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MinValueImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMinValue()
	 * @generated
	 */
	int MIN_VALUE = 95;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE__VALUE_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ModeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMode()
	 * @generated
	 */
	int MODE = 96;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ModuloImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 97;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.MultiplyImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 98;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.NamedTypeSpecifierImpl <em>Named Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.NamedTypeSpecifierImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getNamedTypeSpecifier()
	 * @generated
	 */
	int NAMED_TYPE_SPECIFIER = 99;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_SPECIFIER__ANNOTATION = TYPE_SPECIFIER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_SPECIFIER__LOCAL_ID = TYPE_SPECIFIER__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_SPECIFIER__NAME = TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_SPECIFIER_FEATURE_COUNT = TYPE_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_SPECIFIER_OPERATION_COUNT = TYPE_SPECIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.NegateImpl <em>Negate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.NegateImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getNegate()
	 * @generated
	 */
	int NEGATE = 101;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.NotImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getNot()
	 * @generated
	 */
	int NOT = 102;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.NotEqualImpl <em>Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.NotEqualImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getNotEqual()
	 * @generated
	 */
	int NOT_EQUAL = 103;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.NowImpl <em>Now</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.NowImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getNow()
	 * @generated
	 */
	int NOW = 104;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOW__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOW__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The number of structural features of the '<em>Now</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOW_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Now</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOW_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.NullImpl <em>Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.NullImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getNull()
	 * @generated
	 */
	int NULL = 105;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL__VALUE_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.OperandDefImpl <em>Operand Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.OperandDefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getOperandDef()
	 * @generated
	 */
	int OPERAND_DEF = 106;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_DEF__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_DEF__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_DEF__OPERAND_TYPE_SPECIFIER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_DEF__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operand Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_DEF__OPERAND_TYPE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operand Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_DEF_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operand Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_DEF_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.OperandRefImpl <em>Operand Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.OperandRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getOperandRef()
	 * @generated
	 */
	int OPERAND_REF = 107;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_REF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_REF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_REF__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operand Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operand Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.OrImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getOr()
	 * @generated
	 */
	int OR = 108;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.OverlapsImpl <em>Overlaps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.OverlapsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getOverlaps()
	 * @generated
	 */
	int OVERLAPS = 109;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overlaps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Overlaps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.OverlapsAfterImpl <em>Overlaps After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.OverlapsAfterImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getOverlapsAfter()
	 * @generated
	 */
	int OVERLAPS_AFTER = 110;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_AFTER__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_AFTER__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_AFTER__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_AFTER__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overlaps After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_AFTER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Overlaps After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_AFTER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.OverlapsBeforeImpl <em>Overlaps Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.OverlapsBeforeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getOverlapsBefore()
	 * @generated
	 */
	int OVERLAPS_BEFORE = 111;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_BEFORE__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_BEFORE__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_BEFORE__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_BEFORE__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Overlaps Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_BEFORE_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Overlaps Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPS_BEFORE_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ParameterDefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getParameterDef()
	 * @generated
	 */
	int PARAMETER_DEF = 112;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__DEFAULT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__PARAMETER_TYPE_SPECIFIER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__ACCESS_LEVEL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__NAME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__PARAMETER_TYPE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parameter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ParameterRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getParameterRef()
	 * @generated
	 */
	int PARAMETER_REF = 113;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__LIBRARY_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.PopulationStdDevImpl <em>Population Std Dev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.PopulationStdDevImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getPopulationStdDev()
	 * @generated
	 */
	int POPULATION_STD_DEV = 114;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_STD_DEV__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_STD_DEV__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_STD_DEV__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_STD_DEV__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Population Std Dev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_STD_DEV_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Population Std Dev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_STD_DEV_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.PopulationVarianceImpl <em>Population Variance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.PopulationVarianceImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getPopulationVariance()
	 * @generated
	 */
	int POPULATION_VARIANCE = 115;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_VARIANCE__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_VARIANCE__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_VARIANCE__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_VARIANCE__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Population Variance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_VARIANCE_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Population Variance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_VARIANCE_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.PositionOfImpl <em>Position Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.PositionOfImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getPositionOf()
	 * @generated
	 */
	int POSITION_OF = 116;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OF__PATTERN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OF__STRING = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.PowerImpl <em>Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.PowerImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getPower()
	 * @generated
	 */
	int POWER = 117;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.PredecessorImpl <em>Predecessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.PredecessorImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getPredecessor()
	 * @generated
	 */
	int PREDECESSOR = 118;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Predecessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Predecessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDECESSOR_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ProperContainsImpl <em>Proper Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ProperContainsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getProperContains()
	 * @generated
	 */
	int PROPER_CONTAINS = 119;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_CONTAINS__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_CONTAINS__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_CONTAINS__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_CONTAINS__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proper Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_CONTAINS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proper Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_CONTAINS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ProperInImpl <em>Proper In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ProperInImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getProperIn()
	 * @generated
	 */
	int PROPER_IN = 120;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_IN__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_IN__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_IN__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_IN__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proper In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_IN_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proper In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_IN_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ProperIncludedInImpl <em>Proper Included In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ProperIncludedInImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getProperIncludedIn()
	 * @generated
	 */
	int PROPER_INCLUDED_IN = 121;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDED_IN__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDED_IN__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDED_IN__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDED_IN__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proper Included In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDED_IN_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proper Included In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDED_IN_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ProperIncludesImpl <em>Proper Includes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ProperIncludesImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getProperIncludes()
	 * @generated
	 */
	int PROPER_INCLUDES = 122;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDES__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDES__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDES__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDES__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proper Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDES_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proper Includes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_INCLUDES_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.PropertyImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 123;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PATH = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCOPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.QuantityImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 124;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.QueryImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 125;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Define</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DEFINE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__RELATIONSHIP = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__WHERE = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__RETURN = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SORT = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.QueryDefineRefImpl <em>Query Define Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.QueryDefineRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getQueryDefineRef()
	 * @generated
	 */
	int QUERY_DEFINE_REF = 126;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINE_REF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINE_REF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINE_REF__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Define Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Define Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEFINE_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.RelationshipClauseImpl <em>Relationship Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.RelationshipClauseImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getRelationshipClause()
	 * @generated
	 */
	int RELATIONSHIP_CLAUSE = 127;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CLAUSE__ANNOTATION = ALIASED_QUERY_SOURCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CLAUSE__LOCAL_ID = ALIASED_QUERY_SOURCE__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CLAUSE__EXPRESSION = ALIASED_QUERY_SOURCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CLAUSE__ALIAS = ALIASED_QUERY_SOURCE__ALIAS;

	/**
	 * The feature id for the '<em><b>Such That</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CLAUSE__SUCH_THAT = ALIASED_QUERY_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CLAUSE_FEATURE_COUNT = ALIASED_QUERY_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relationship Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CLAUSE_OPERATION_COUNT = ALIASED_QUERY_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.RetrieveImpl <em>Retrieve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.RetrieveImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getRetrieve()
	 * @generated
	 */
	int RETRIEVE = 128;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__CODES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__DATE_RANGE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__CODE_PROPERTY = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__DATA_TYPE = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date High Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__DATE_HIGH_PROPERTY = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Low Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__DATE_LOW_PROPERTY = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__DATE_PROPERTY = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__ID_PROPERTY = EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__SCOPE = EXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE__TEMPLATE_ID = EXPRESSION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Retrieve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Retrieve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIEVE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ReturnClauseImpl <em>Return Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ReturnClauseImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getReturnClause()
	 * @generated
	 */
	int RETURN_CLAUSE = 129;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE__DISTINCT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Return Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Return Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CLAUSE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.RoundImpl <em>Round</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.RoundImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getRound()
	 * @generated
	 */
	int ROUND = 130;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__PRECISION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SameAsImpl <em>Same As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SameAsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSameAs()
	 * @generated
	 */
	int SAME_AS = 131;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Same As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Same As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_AS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SameOrAfterImpl <em>Same Or After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SameOrAfterImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSameOrAfter()
	 * @generated
	 */
	int SAME_OR_AFTER = 132;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_AFTER__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_AFTER__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_AFTER__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_AFTER__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Same Or After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_AFTER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Same Or After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_AFTER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SameOrBeforeImpl <em>Same Or Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SameOrBeforeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSameOrBefore()
	 * @generated
	 */
	int SAME_OR_BEFORE = 133;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_BEFORE__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_BEFORE__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_BEFORE__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_BEFORE__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Same Or Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_BEFORE_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Same Or Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAME_OR_BEFORE_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SingletonFromImpl <em>Singleton From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SingletonFromImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSingletonFrom()
	 * @generated
	 */
	int SINGLETON_FROM = 134;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FROM__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FROM__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FROM__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Singleton From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FROM_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Singleton From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FROM_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SortImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSort()
	 * @generated
	 */
	int SORT = 135;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__BY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SortClauseImpl <em>Sort Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SortClauseImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSortClause()
	 * @generated
	 */
	int SORT_CLAUSE = 137;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_CLAUSE__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_CLAUSE__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_CLAUSE__BY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sort Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_CLAUSE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sort Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_CLAUSE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SplitImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 138;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>String To Split</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__STRING_TO_SPLIT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__SEPARATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.StartImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getStart()
	 * @generated
	 */
	int START = 139;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.StartsImpl <em>Starts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.StartsImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getStarts()
	 * @generated
	 */
	int STARTS = 140;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS__PRECISION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Starts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Starts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.StdDevImpl <em>Std Dev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.StdDevImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getStdDev()
	 * @generated
	 */
	int STD_DEV = 141;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DEV__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DEV__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DEV__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DEV__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Std Dev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DEV_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Std Dev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_DEV_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SubstringImpl <em>Substring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SubstringImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSubstring()
	 * @generated
	 */
	int SUBSTRING = 142;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>String To Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING__STRING_TO_SUB = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING__START_INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING__LENGTH = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Substring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Substring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRING_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SubtractImpl <em>Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SubtractImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSubtract()
	 * @generated
	 */
	int SUBTRACT = 143;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SuccessorImpl <em>Successor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SuccessorImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSuccessor()
	 * @generated
	 */
	int SUCCESSOR = 144;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Successor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Successor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESSOR_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.SumImpl <em>Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.SumImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSum()
	 * @generated
	 */
	int SUM = 145;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TernaryExpressionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTernaryExpression()
	 * @generated
	 */
	int TERNARY_EXPRESSION = 146;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ternary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ternary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TimeImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTime()
	 * @generated
	 */
	int TIME = 147;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__HOUR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MINUTE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__SECOND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Millisecond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MILLISECOND = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timezone Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TIMEZONE_OFFSET = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TimeFromImpl <em>Time From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TimeFromImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTimeFrom()
	 * @generated
	 */
	int TIME_FROM = 148;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FROM__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FROM__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FROM__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Time From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FROM_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FROM_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TimeOfDayImpl <em>Time Of Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TimeOfDayImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTimeOfDay()
	 * @generated
	 */
	int TIME_OF_DAY = 149;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The number of structural features of the '<em>Time Of Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Of Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TimesImpl <em>Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TimesImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTimes()
	 * @generated
	 */
	int TIMES = 150;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TimezoneFromImpl <em>Timezone From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TimezoneFromImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTimezoneFrom()
	 * @generated
	 */
	int TIMEZONE_FROM = 151;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEZONE_FROM__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEZONE_FROM__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEZONE_FROM__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Timezone From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEZONE_FROM_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timezone From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEZONE_FROM_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TodayImpl <em>Today</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TodayImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getToday()
	 * @generated
	 */
	int TODAY = 152;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TODAY__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TODAY__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The number of structural features of the '<em>Today</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TODAY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Today</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TODAY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TruncateImpl <em>Truncate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TruncateImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTruncate()
	 * @generated
	 */
	int TRUNCATE = 153;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATE__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATE__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATE__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Truncate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATE_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Truncate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATE_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TruncatedDivideImpl <em>Truncated Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TruncatedDivideImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTruncatedDivide()
	 * @generated
	 */
	int TRUNCATED_DIVIDE = 154;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_DIVIDE__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_DIVIDE__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_DIVIDE__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Truncated Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_DIVIDE_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Truncated Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUNCATED_DIVIDE_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TupleImpl <em>Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TupleImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTuple()
	 * @generated
	 */
	int TUPLE = 155;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TupleElementImpl <em>Tuple Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TupleElementImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTupleElement()
	 * @generated
	 */
	int TUPLE_ELEMENT = 156;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Tuple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tuple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TupleElementDefinitionImpl <em>Tuple Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TupleElementDefinitionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTupleElementDefinition()
	 * @generated
	 */
	int TUPLE_ELEMENT_DEFINITION = 157;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_DEFINITION__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_DEFINITION__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_DEFINITION__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_DEFINITION__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tuple Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tuple Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_DEFINITION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.TupleTypeSpecifierImpl <em>Tuple Type Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.TupleTypeSpecifierImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getTupleTypeSpecifier()
	 * @generated
	 */
	int TUPLE_TYPE_SPECIFIER = 158;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_SPECIFIER__ANNOTATION = TYPE_SPECIFIER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_SPECIFIER__LOCAL_ID = TYPE_SPECIFIER__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_SPECIFIER__ELEMENT = TYPE_SPECIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_SPECIFIER_FEATURE_COUNT = TYPE_SPECIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple Type Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_SPECIFIER_OPERATION_COUNT = TYPE_SPECIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.UnionImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 161;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.UpperImpl <em>Upper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.UpperImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getUpper()
	 * @generated
	 */
	int UPPER = 162;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Upper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ValueSetDefImpl <em>Value Set Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ValueSetDefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getValueSetDef()
	 * @generated
	 */
	int VALUE_SET_DEF = 163;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF__LOCAL_ID = ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF__CODE_SYSTEM = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF__ACCESS_LEVEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF__ID = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF__NAME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF__VERSION = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Value Set Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Value Set Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEF_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.ValueSetRefImpl <em>Value Set Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.ValueSetRefImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getValueSetRef()
	 * @generated
	 */
	int VALUE_SET_REF = 164;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REF__ANNOTATION = EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REF__LOCAL_ID = EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REF__LIBRARY_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REF__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Set Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Set Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.VarianceImpl <em>Variance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.VarianceImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getVariance()
	 * @generated
	 */
	int VARIANCE = 165;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__ANNOTATION = AGGREGATE_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__LOCAL_ID = AGGREGATE_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__SOURCE = AGGREGATE_EXPRESSION__SOURCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE__PATH = AGGREGATE_EXPRESSION__PATH;

	/**
	 * The number of structural features of the '<em>Variance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.WidthImpl <em>Width</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.WidthImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getWidth()
	 * @generated
	 */
	int WIDTH = 166;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH__ANNOTATION = UNARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH__LOCAL_ID = UNARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDTH_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.WithImpl <em>With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.WithImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getWith()
	 * @generated
	 */
	int WITH = 167;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__ANNOTATION = RELATIONSHIP_CLAUSE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__LOCAL_ID = RELATIONSHIP_CLAUSE__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__EXPRESSION = RELATIONSHIP_CLAUSE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__ALIAS = RELATIONSHIP_CLAUSE__ALIAS;

	/**
	 * The feature id for the '<em><b>Such That</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__SUCH_THAT = RELATIONSHIP_CLAUSE__SUCH_THAT;

	/**
	 * The number of structural features of the '<em>With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_FEATURE_COUNT = RELATIONSHIP_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_OPERATION_COUNT = RELATIONSHIP_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.WithoutImpl <em>Without</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.WithoutImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getWithout()
	 * @generated
	 */
	int WITHOUT = 168;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT__ANNOTATION = RELATIONSHIP_CLAUSE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT__LOCAL_ID = RELATIONSHIP_CLAUSE__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT__EXPRESSION = RELATIONSHIP_CLAUSE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT__ALIAS = RELATIONSHIP_CLAUSE__ALIAS;

	/**
	 * The feature id for the '<em><b>Such That</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT__SUCH_THAT = RELATIONSHIP_CLAUSE__SUCH_THAT;

	/**
	 * The number of structural features of the '<em>Without</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT_FEATURE_COUNT = RELATIONSHIP_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Without</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHOUT_OPERATION_COUNT = RELATIONSHIP_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.impl.XorImpl
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getXor()
	 * @generated
	 */
	int XOR = 169;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__ANNOTATION = BINARY_EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__LOCAL_ID = BINARY_EXPRESSION__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__OPERAND = BINARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.AccessModifier <em>Access Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.AccessModifier
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 170;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.DateTimePrecision <em>Date Time Precision</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.DateTimePrecision
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDateTimePrecision()
	 * @generated
	 */
	int DATE_TIME_PRECISION = 171;

	/**
	 * The meta object id for the '{@link org.hl7.elm.r1.SortDirection <em>Sort Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.SortDirection
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSortDirection()
	 * @generated
	 */
	int SORT_DIRECTION = 172;

	/**
	 * The meta object id for the '<em>Access Modifier Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.AccessModifier
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getAccessModifierObject()
	 * @generated
	 */
	int ACCESS_MODIFIER_OBJECT = 173;

	/**
	 * The meta object id for the '<em>Date Time Precision Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.DateTimePrecision
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getDateTimePrecisionObject()
	 * @generated
	 */
	int DATE_TIME_PRECISION_OBJECT = 174;

	/**
	 * The meta object id for the '<em>Sort Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hl7.elm.r1.SortDirection
	 * @see org.hl7.elm.r1.impl.R1PackageImpl#getSortDirectionObject()
	 * @generated
	 */
	int SORT_DIRECTION_OBJECT = 175;


	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Abs <em>Abs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs</em>'.
	 * @see org.hl7.elm.r1.Abs
	 * @generated
	 */
	EClass getAbs();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see org.hl7.elm.r1.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see org.hl7.elm.r1.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.After#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.After#getPrecision()
	 * @see #getAfter()
	 * @generated
	 */
	EAttribute getAfter_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.AggregateExpression <em>Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Expression</em>'.
	 * @see org.hl7.elm.r1.AggregateExpression
	 * @generated
	 */
	EClass getAggregateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.AggregateExpression#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.AggregateExpression#getSource()
	 * @see #getAggregateExpression()
	 * @generated
	 */
	EReference getAggregateExpression_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.AggregateExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.hl7.elm.r1.AggregateExpression#getPath()
	 * @see #getAggregateExpression()
	 * @generated
	 */
	EAttribute getAggregateExpression_Path();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.AliasedQuerySource <em>Aliased Query Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aliased Query Source</em>'.
	 * @see org.hl7.elm.r1.AliasedQuerySource
	 * @generated
	 */
	EClass getAliasedQuerySource();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.AliasedQuerySource#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.hl7.elm.r1.AliasedQuerySource#getExpression()
	 * @see #getAliasedQuerySource()
	 * @generated
	 */
	EReference getAliasedQuerySource_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.AliasedQuerySource#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.hl7.elm.r1.AliasedQuerySource#getAlias()
	 * @see #getAliasedQuerySource()
	 * @generated
	 */
	EAttribute getAliasedQuerySource_Alias();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.AliasRef <em>Alias Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Ref</em>'.
	 * @see org.hl7.elm.r1.AliasRef
	 * @generated
	 */
	EClass getAliasRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.AliasRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.AliasRef#getName()
	 * @see #getAliasRef()
	 * @generated
	 */
	EAttribute getAliasRef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.AllTrue <em>All True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All True</em>'.
	 * @see org.hl7.elm.r1.AllTrue
	 * @generated
	 */
	EClass getAllTrue();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.hl7.elm.r1.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.AnyTrue <em>Any True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any True</em>'.
	 * @see org.hl7.elm.r1.AnyTrue
	 * @generated
	 */
	EClass getAnyTrue();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.As <em>As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>As</em>'.
	 * @see org.hl7.elm.r1.As
	 * @generated
	 */
	EClass getAs();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.As#getAsTypeSpecifier <em>As Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>As Type Specifier</em>'.
	 * @see org.hl7.elm.r1.As#getAsTypeSpecifier()
	 * @see #getAs()
	 * @generated
	 */
	EReference getAs_AsTypeSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.As#getAsType <em>As Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Type</em>'.
	 * @see org.hl7.elm.r1.As#getAsType()
	 * @see #getAs()
	 * @generated
	 */
	EAttribute getAs_AsType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.As#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see org.hl7.elm.r1.As#isStrict()
	 * @see #getAs()
	 * @generated
	 */
	EAttribute getAs_Strict();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Avg <em>Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avg</em>'.
	 * @see org.hl7.elm.r1.Avg
	 * @generated
	 */
	EClass getAvg();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before</em>'.
	 * @see org.hl7.elm.r1.Before
	 * @generated
	 */
	EClass getBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Before#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.Before#getPrecision()
	 * @see #getBefore()
	 * @generated
	 */
	EAttribute getBefore_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.hl7.elm.r1.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.BinaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see org.hl7.elm.r1.BinaryExpression#getOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ByColumn <em>By Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Column</em>'.
	 * @see org.hl7.elm.r1.ByColumn
	 * @generated
	 */
	EClass getByColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ByColumn#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.hl7.elm.r1.ByColumn#getPath()
	 * @see #getByColumn()
	 * @generated
	 */
	EAttribute getByColumn_Path();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ByDirection <em>By Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Direction</em>'.
	 * @see org.hl7.elm.r1.ByDirection
	 * @generated
	 */
	EClass getByDirection();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ByExpression <em>By Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>By Expression</em>'.
	 * @see org.hl7.elm.r1.ByExpression
	 * @generated
	 */
	EClass getByExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.ByExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.hl7.elm.r1.ByExpression#getExpression()
	 * @see #getByExpression()
	 * @generated
	 */
	EReference getByExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.CalculateAge <em>Calculate Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculate Age</em>'.
	 * @see org.hl7.elm.r1.CalculateAge
	 * @generated
	 */
	EClass getCalculateAge();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.CalculateAge#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.CalculateAge#getPrecision()
	 * @see #getCalculateAge()
	 * @generated
	 */
	EAttribute getCalculateAge_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.CalculateAgeAt <em>Calculate Age At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculate Age At</em>'.
	 * @see org.hl7.elm.r1.CalculateAgeAt
	 * @generated
	 */
	EClass getCalculateAgeAt();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.CalculateAgeAt#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.CalculateAgeAt#getPrecision()
	 * @see #getCalculateAgeAt()
	 * @generated
	 */
	EAttribute getCalculateAgeAt_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.hl7.elm.r1.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Case#getComparand <em>Comparand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparand</em>'.
	 * @see org.hl7.elm.r1.Case#getComparand()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Comparand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Case#getCaseItem <em>Case Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case Item</em>'.
	 * @see org.hl7.elm.r1.Case#getCaseItem()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_CaseItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Case#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.hl7.elm.r1.Case#getElse()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Else();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.CaseItem <em>Case Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Item</em>'.
	 * @see org.hl7.elm.r1.CaseItem
	 * @generated
	 */
	EClass getCaseItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.CaseItem#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see org.hl7.elm.r1.CaseItem#getWhen()
	 * @see #getCaseItem()
	 * @generated
	 */
	EReference getCaseItem_When();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.CaseItem#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.hl7.elm.r1.CaseItem#getThen()
	 * @see #getCaseItem()
	 * @generated
	 */
	EReference getCaseItem_Then();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Ceiling <em>Ceiling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ceiling</em>'.
	 * @see org.hl7.elm.r1.Ceiling
	 * @generated
	 */
	EClass getCeiling();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Coalesce <em>Coalesce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coalesce</em>'.
	 * @see org.hl7.elm.r1.Coalesce
	 * @generated
	 */
	EClass getCoalesce();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.hl7.elm.r1.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Code#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.hl7.elm.r1.Code#getSystem()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_System();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Code#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hl7.elm.r1.Code#getCode()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Code#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.hl7.elm.r1.Code#getDisplay()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Display();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.CodeSystemDef <em>Code System Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code System Def</em>'.
	 * @see org.hl7.elm.r1.CodeSystemDef
	 * @generated
	 */
	EClass getCodeSystemDef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.CodeSystemDef#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see org.hl7.elm.r1.CodeSystemDef#getAccessLevel()
	 * @see #getCodeSystemDef()
	 * @generated
	 */
	EAttribute getCodeSystemDef_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.CodeSystemDef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hl7.elm.r1.CodeSystemDef#getId()
	 * @see #getCodeSystemDef()
	 * @generated
	 */
	EAttribute getCodeSystemDef_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.CodeSystemDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.CodeSystemDef#getName()
	 * @see #getCodeSystemDef()
	 * @generated
	 */
	EAttribute getCodeSystemDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.CodeSystemDef#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.hl7.elm.r1.CodeSystemDef#getVersion()
	 * @see #getCodeSystemDef()
	 * @generated
	 */
	EAttribute getCodeSystemDef_Version();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.CodeSystemRef <em>Code System Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code System Ref</em>'.
	 * @see org.hl7.elm.r1.CodeSystemRef
	 * @generated
	 */
	EClass getCodeSystemRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.CodeSystemRef#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see org.hl7.elm.r1.CodeSystemRef#getLibraryName()
	 * @see #getCodeSystemRef()
	 * @generated
	 */
	EAttribute getCodeSystemRef_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.CodeSystemRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.CodeSystemRef#getName()
	 * @see #getCodeSystemRef()
	 * @generated
	 */
	EAttribute getCodeSystemRef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Collapse <em>Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collapse</em>'.
	 * @see org.hl7.elm.r1.Collapse
	 * @generated
	 */
	EClass getCollapse();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Combine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combine</em>'.
	 * @see org.hl7.elm.r1.Combine
	 * @generated
	 */
	EClass getCombine();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Combine#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.Combine#getSource()
	 * @see #getCombine()
	 * @generated
	 */
	EReference getCombine_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Combine#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see org.hl7.elm.r1.Combine#getSeparator()
	 * @see #getCombine()
	 * @generated
	 */
	EReference getCombine_Separator();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Concatenate <em>Concatenate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenate</em>'.
	 * @see org.hl7.elm.r1.Concatenate
	 * @generated
	 */
	EClass getConcatenate();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see org.hl7.elm.r1.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Concept#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.hl7.elm.r1.Concept#getCode()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Concept#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.hl7.elm.r1.Concept#getDisplay()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Display();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see org.hl7.elm.r1.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Contains#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.Contains#getPrecision()
	 * @see #getContains()
	 * @generated
	 */
	EAttribute getContains_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Convert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert</em>'.
	 * @see org.hl7.elm.r1.Convert
	 * @generated
	 */
	EClass getConvert();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Convert#getToTypeSpecifier <em>To Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Type Specifier</em>'.
	 * @see org.hl7.elm.r1.Convert#getToTypeSpecifier()
	 * @see #getConvert()
	 * @generated
	 */
	EReference getConvert_ToTypeSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Convert#getToType <em>To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Type</em>'.
	 * @see org.hl7.elm.r1.Convert#getToType()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_ToType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see org.hl7.elm.r1.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Current <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current</em>'.
	 * @see org.hl7.elm.r1.Current
	 * @generated
	 */
	EClass getCurrent();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Current#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.hl7.elm.r1.Current#getScope()
	 * @see #getCurrent()
	 * @generated
	 */
	EAttribute getCurrent_Scope();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.DateFrom <em>Date From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date From</em>'.
	 * @see org.hl7.elm.r1.DateFrom
	 * @generated
	 */
	EClass getDateFrom();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see org.hl7.elm.r1.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DateTime#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year</em>'.
	 * @see org.hl7.elm.r1.DateTime#getYear()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_Year();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DateTime#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Month</em>'.
	 * @see org.hl7.elm.r1.DateTime#getMonth()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_Month();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DateTime#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Day</em>'.
	 * @see org.hl7.elm.r1.DateTime#getDay()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_Day();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DateTime#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hour</em>'.
	 * @see org.hl7.elm.r1.DateTime#getHour()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_Hour();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DateTime#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minute</em>'.
	 * @see org.hl7.elm.r1.DateTime#getMinute()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_Minute();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DateTime#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see org.hl7.elm.r1.DateTime#getSecond()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_Second();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DateTime#getMillisecond <em>Millisecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Millisecond</em>'.
	 * @see org.hl7.elm.r1.DateTime#getMillisecond()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_Millisecond();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DateTime#getTimezoneOffset <em>Timezone Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timezone Offset</em>'.
	 * @see org.hl7.elm.r1.DateTime#getTimezoneOffset()
	 * @see #getDateTime()
	 * @generated
	 */
	EReference getDateTime_TimezoneOffset();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.DateTimeComponentFrom <em>Date Time Component From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Component From</em>'.
	 * @see org.hl7.elm.r1.DateTimeComponentFrom
	 * @generated
	 */
	EClass getDateTimeComponentFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.DateTimeComponentFrom#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.DateTimeComponentFrom#getPrecision()
	 * @see #getDateTimeComponentFrom()
	 * @generated
	 */
	EAttribute getDateTimeComponentFrom_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.DefineClause <em>Define Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define Clause</em>'.
	 * @see org.hl7.elm.r1.DefineClause
	 * @generated
	 */
	EClass getDefineClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.DefineClause#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.hl7.elm.r1.DefineClause#getExpression()
	 * @see #getDefineClause()
	 * @generated
	 */
	EReference getDefineClause_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.DefineClause#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.hl7.elm.r1.DefineClause#getIdentifier()
	 * @see #getDefineClause()
	 * @generated
	 */
	EAttribute getDefineClause_Identifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.DifferenceBetween <em>Difference Between</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference Between</em>'.
	 * @see org.hl7.elm.r1.DifferenceBetween
	 * @generated
	 */
	EClass getDifferenceBetween();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.DifferenceBetween#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.DifferenceBetween#getPrecision()
	 * @see #getDifferenceBetween()
	 * @generated
	 */
	EAttribute getDifferenceBetween_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Distinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distinct</em>'.
	 * @see org.hl7.elm.r1.Distinct
	 * @generated
	 */
	EClass getDistinct();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see org.hl7.elm.r1.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.DurationBetween <em>Duration Between</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Between</em>'.
	 * @see org.hl7.elm.r1.DurationBetween
	 * @generated
	 */
	EClass getDurationBetween();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.DurationBetween#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.DurationBetween#getPrecision()
	 * @see #getDurationBetween()
	 * @generated
	 */
	EAttribute getDurationBetween_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.hl7.elm.r1.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Element#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.hl7.elm.r1.Element#getAnnotation()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Element#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.hl7.elm.r1.Element#getLocalId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_LocalId();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see org.hl7.elm.r1.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Ends <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ends</em>'.
	 * @see org.hl7.elm.r1.Ends
	 * @generated
	 */
	EClass getEnds();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Ends#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.Ends#getPrecision()
	 * @see #getEnds()
	 * @generated
	 */
	EAttribute getEnds_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see org.hl7.elm.r1.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Except <em>Except</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Except</em>'.
	 * @see org.hl7.elm.r1.Except
	 * @generated
	 */
	EClass getExcept();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Exists <em>Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists</em>'.
	 * @see org.hl7.elm.r1.Exists
	 * @generated
	 */
	EClass getExists();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Expand <em>Expand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expand</em>'.
	 * @see org.hl7.elm.r1.Expand
	 * @generated
	 */
	EClass getExpand();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.hl7.elm.r1.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ExpressionDef <em>Expression Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Def</em>'.
	 * @see org.hl7.elm.r1.ExpressionDef
	 * @generated
	 */
	EClass getExpressionDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.ExpressionDef#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.hl7.elm.r1.ExpressionDef#getExpression()
	 * @see #getExpressionDef()
	 * @generated
	 */
	EReference getExpressionDef_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ExpressionDef#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see org.hl7.elm.r1.ExpressionDef#getAccessLevel()
	 * @see #getExpressionDef()
	 * @generated
	 */
	EAttribute getExpressionDef_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ExpressionDef#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.hl7.elm.r1.ExpressionDef#getContext()
	 * @see #getExpressionDef()
	 * @generated
	 */
	EAttribute getExpressionDef_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ExpressionDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.ExpressionDef#getName()
	 * @see #getExpressionDef()
	 * @generated
	 */
	EAttribute getExpressionDef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ExpressionRef <em>Expression Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Ref</em>'.
	 * @see org.hl7.elm.r1.ExpressionRef
	 * @generated
	 */
	EClass getExpressionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ExpressionRef#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see org.hl7.elm.r1.ExpressionRef#getLibraryName()
	 * @see #getExpressionRef()
	 * @generated
	 */
	EAttribute getExpressionRef_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ExpressionRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.ExpressionRef#getName()
	 * @see #getExpressionRef()
	 * @generated
	 */
	EAttribute getExpressionRef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.hl7.elm.r1.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Filter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.Filter#getSource()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Filter#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.hl7.elm.r1.Filter#getCondition()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Filter#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.hl7.elm.r1.Filter#getScope()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Scope();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.First <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First</em>'.
	 * @see org.hl7.elm.r1.First
	 * @generated
	 */
	EClass getFirst();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.First#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.First#getSource()
	 * @see #getFirst()
	 * @generated
	 */
	EReference getFirst_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.First#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.hl7.elm.r1.First#getOrderBy()
	 * @see #getFirst()
	 * @generated
	 */
	EAttribute getFirst_OrderBy();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see org.hl7.elm.r1.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see org.hl7.elm.r1.ForEach
	 * @generated
	 */
	EClass getForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.ForEach#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.ForEach#getSource()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.ForEach#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.hl7.elm.r1.ForEach#getElement()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ForEach#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.hl7.elm.r1.ForEach#getScope()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_Scope();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Def</em>'.
	 * @see org.hl7.elm.r1.FunctionDef
	 * @generated
	 */
	EClass getFunctionDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.FunctionDef#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see org.hl7.elm.r1.FunctionDef#getOperand()
	 * @see #getFunctionDef()
	 * @generated
	 */
	EReference getFunctionDef_Operand();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.FunctionRef <em>Function Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Ref</em>'.
	 * @see org.hl7.elm.r1.FunctionRef
	 * @generated
	 */
	EClass getFunctionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.FunctionRef#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see org.hl7.elm.r1.FunctionRef#getOperand()
	 * @see #getFunctionRef()
	 * @generated
	 */
	EReference getFunctionRef_Operand();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see org.hl7.elm.r1.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Or Equal</em>'.
	 * @see org.hl7.elm.r1.GreaterOrEqual
	 * @generated
	 */
	EClass getGreaterOrEqual();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.IdentifierRef <em>Identifier Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Ref</em>'.
	 * @see org.hl7.elm.r1.IdentifierRef
	 * @generated
	 */
	EClass getIdentifierRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.IdentifierRef#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see org.hl7.elm.r1.IdentifierRef#getLibraryName()
	 * @see #getIdentifierRef()
	 * @generated
	 */
	EAttribute getIdentifierRef_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.IdentifierRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.IdentifierRef#getName()
	 * @see #getIdentifierRef()
	 * @generated
	 */
	EAttribute getIdentifierRef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.hl7.elm.r1.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.hl7.elm.r1.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.hl7.elm.r1.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.hl7.elm.r1.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In</em>'.
	 * @see org.hl7.elm.r1.In
	 * @generated
	 */
	EClass getIn();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.In#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.In#getPrecision()
	 * @see #getIn()
	 * @generated
	 */
	EAttribute getIn_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.IncludedIn <em>Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included In</em>'.
	 * @see org.hl7.elm.r1.IncludedIn
	 * @generated
	 */
	EClass getIncludedIn();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.IncludedIn#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.IncludedIn#getPrecision()
	 * @see #getIncludedIn()
	 * @generated
	 */
	EAttribute getIncludedIn_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Includes</em>'.
	 * @see org.hl7.elm.r1.Includes
	 * @generated
	 */
	EClass getIncludes();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Includes#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.Includes#getPrecision()
	 * @see #getIncludes()
	 * @generated
	 */
	EAttribute getIncludes_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.InCodeSystem <em>In Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Code System</em>'.
	 * @see org.hl7.elm.r1.InCodeSystem
	 * @generated
	 */
	EClass getInCodeSystem();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.InCodeSystem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.elm.r1.InCodeSystem#getCode()
	 * @see #getInCodeSystem()
	 * @generated
	 */
	EReference getInCodeSystem_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.InCodeSystem#getCodesystem <em>Codesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codesystem</em>'.
	 * @see org.hl7.elm.r1.InCodeSystem#getCodesystem()
	 * @see #getInCodeSystem()
	 * @generated
	 */
	EReference getInCodeSystem_Codesystem();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Indexer <em>Indexer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexer</em>'.
	 * @see org.hl7.elm.r1.Indexer
	 * @generated
	 */
	EClass getIndexer();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.IndexOf <em>Index Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Of</em>'.
	 * @see org.hl7.elm.r1.IndexOf
	 * @generated
	 */
	EClass getIndexOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.IndexOf#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.IndexOf#getSource()
	 * @see #getIndexOf()
	 * @generated
	 */
	EReference getIndexOf_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.IndexOf#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.hl7.elm.r1.IndexOf#getElement()
	 * @see #getIndexOf()
	 * @generated
	 */
	EReference getIndexOf_Element();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.hl7.elm.r1.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Instance#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.hl7.elm.r1.Instance#getElement()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Instance#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Type</em>'.
	 * @see org.hl7.elm.r1.Instance#getClassType()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ClassType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.InstanceElement <em>Instance Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Element</em>'.
	 * @see org.hl7.elm.r1.InstanceElement
	 * @generated
	 */
	EClass getInstanceElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.InstanceElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.elm.r1.InstanceElement#getValue()
	 * @see #getInstanceElement()
	 * @generated
	 */
	EReference getInstanceElement_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.InstanceElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.InstanceElement#getName()
	 * @see #getInstanceElement()
	 * @generated
	 */
	EAttribute getInstanceElement_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Intersect <em>Intersect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersect</em>'.
	 * @see org.hl7.elm.r1.Intersect
	 * @generated
	 */
	EClass getIntersect();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see org.hl7.elm.r1.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Interval#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low</em>'.
	 * @see org.hl7.elm.r1.Interval#getLow()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Low();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Interval#getLowClosedExpression <em>Low Closed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Low Closed Expression</em>'.
	 * @see org.hl7.elm.r1.Interval#getLowClosedExpression()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_LowClosedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Interval#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High</em>'.
	 * @see org.hl7.elm.r1.Interval#getHigh()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_High();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Interval#getHighClosedExpression <em>High Closed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>High Closed Expression</em>'.
	 * @see org.hl7.elm.r1.Interval#getHighClosedExpression()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_HighClosedExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Interval#isHighClosed <em>High Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Closed</em>'.
	 * @see org.hl7.elm.r1.Interval#isHighClosed()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_HighClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Interval#isLowClosed <em>Low Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Closed</em>'.
	 * @see org.hl7.elm.r1.Interval#isLowClosed()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_LowClosed();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.IntervalTypeSpecifier <em>Interval Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Type Specifier</em>'.
	 * @see org.hl7.elm.r1.IntervalTypeSpecifier
	 * @generated
	 */
	EClass getIntervalTypeSpecifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.IntervalTypeSpecifier#getPointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Type</em>'.
	 * @see org.hl7.elm.r1.IntervalTypeSpecifier#getPointType()
	 * @see #getIntervalTypeSpecifier()
	 * @generated
	 */
	EReference getIntervalTypeSpecifier_PointType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.InValueSet <em>In Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Value Set</em>'.
	 * @see org.hl7.elm.r1.InValueSet
	 * @generated
	 */
	EClass getInValueSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.InValueSet#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.hl7.elm.r1.InValueSet#getCode()
	 * @see #getInValueSet()
	 * @generated
	 */
	EReference getInValueSet_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.InValueSet#getValueset <em>Valueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valueset</em>'.
	 * @see org.hl7.elm.r1.InValueSet#getValueset()
	 * @see #getInValueSet()
	 * @generated
	 */
	EReference getInValueSet_Valueset();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Is <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is</em>'.
	 * @see org.hl7.elm.r1.Is
	 * @generated
	 */
	EClass getIs();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Is#getIsTypeSpecifier <em>Is Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Type Specifier</em>'.
	 * @see org.hl7.elm.r1.Is#getIsTypeSpecifier()
	 * @see #getIs()
	 * @generated
	 */
	EReference getIs_IsTypeSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Is#getIsType <em>Is Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Type</em>'.
	 * @see org.hl7.elm.r1.Is#getIsType()
	 * @see #getIs()
	 * @generated
	 */
	EAttribute getIs_IsType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.IsFalse <em>Is False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is False</em>'.
	 * @see org.hl7.elm.r1.IsFalse
	 * @generated
	 */
	EClass getIsFalse();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.IsNull <em>Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Null</em>'.
	 * @see org.hl7.elm.r1.IsNull
	 * @generated
	 */
	EClass getIsNull();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.IsTrue <em>Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is True</em>'.
	 * @see org.hl7.elm.r1.IsTrue
	 * @generated
	 */
	EClass getIsTrue();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Last <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last</em>'.
	 * @see org.hl7.elm.r1.Last
	 * @generated
	 */
	EClass getLast();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Last#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.Last#getSource()
	 * @see #getLast()
	 * @generated
	 */
	EReference getLast_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Last#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.hl7.elm.r1.Last#getOrderBy()
	 * @see #getLast()
	 * @generated
	 */
	EAttribute getLast_OrderBy();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see org.hl7.elm.r1.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see org.hl7.elm.r1.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Or Equal</em>'.
	 * @see org.hl7.elm.r1.LessOrEqual
	 * @generated
	 */
	EClass getLessOrEqual();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.hl7.elm.r1.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.List#getTypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Specifier</em>'.
	 * @see org.hl7.elm.r1.List#getTypeSpecifier()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_TypeSpecifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.List#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.hl7.elm.r1.List#getElement()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Element();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ListTypeSpecifier <em>List Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type Specifier</em>'.
	 * @see org.hl7.elm.r1.ListTypeSpecifier
	 * @generated
	 */
	EClass getListTypeSpecifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.ListTypeSpecifier#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see org.hl7.elm.r1.ListTypeSpecifier#getElementType()
	 * @see #getListTypeSpecifier()
	 * @generated
	 */
	EReference getListTypeSpecifier_ElementType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.hl7.elm.r1.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.elm.r1.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Literal#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.hl7.elm.r1.Literal#getValueType()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_ValueType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Ln <em>Ln</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ln</em>'.
	 * @see org.hl7.elm.r1.Ln
	 * @generated
	 */
	EClass getLn();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see org.hl7.elm.r1.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Lower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower</em>'.
	 * @see org.hl7.elm.r1.Lower
	 * @generated
	 */
	EClass getLower();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Matches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matches</em>'.
	 * @see org.hl7.elm.r1.Matches
	 * @generated
	 */
	EClass getMatches();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max</em>'.
	 * @see org.hl7.elm.r1.Max
	 * @generated
	 */
	EClass getMax();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.MaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Value</em>'.
	 * @see org.hl7.elm.r1.MaxValue
	 * @generated
	 */
	EClass getMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.MaxValue#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.hl7.elm.r1.MaxValue#getValueType()
	 * @see #getMaxValue()
	 * @generated
	 */
	EAttribute getMaxValue_ValueType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Median <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Median</em>'.
	 * @see org.hl7.elm.r1.Median
	 * @generated
	 */
	EClass getMedian();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Meets <em>Meets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meets</em>'.
	 * @see org.hl7.elm.r1.Meets
	 * @generated
	 */
	EClass getMeets();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Meets#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.Meets#getPrecision()
	 * @see #getMeets()
	 * @generated
	 */
	EAttribute getMeets_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.MeetsAfter <em>Meets After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meets After</em>'.
	 * @see org.hl7.elm.r1.MeetsAfter
	 * @generated
	 */
	EClass getMeetsAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.MeetsAfter#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.MeetsAfter#getPrecision()
	 * @see #getMeetsAfter()
	 * @generated
	 */
	EAttribute getMeetsAfter_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.MeetsBefore <em>Meets Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meets Before</em>'.
	 * @see org.hl7.elm.r1.MeetsBefore
	 * @generated
	 */
	EClass getMeetsBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.MeetsBefore#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.MeetsBefore#getPrecision()
	 * @see #getMeetsBefore()
	 * @generated
	 */
	EAttribute getMeetsBefore_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min</em>'.
	 * @see org.hl7.elm.r1.Min
	 * @generated
	 */
	EClass getMin();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.MinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Value</em>'.
	 * @see org.hl7.elm.r1.MinValue
	 * @generated
	 */
	EClass getMinValue();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.MinValue#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.hl7.elm.r1.MinValue#getValueType()
	 * @see #getMinValue()
	 * @generated
	 */
	EAttribute getMinValue_ValueType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see org.hl7.elm.r1.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see org.hl7.elm.r1.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see org.hl7.elm.r1.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.NamedTypeSpecifier <em>Named Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type Specifier</em>'.
	 * @see org.hl7.elm.r1.NamedTypeSpecifier
	 * @generated
	 */
	EClass getNamedTypeSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.NamedTypeSpecifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.NamedTypeSpecifier#getName()
	 * @see #getNamedTypeSpecifier()
	 * @generated
	 */
	EAttribute getNamedTypeSpecifier_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.NaryExpression <em>Nary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nary Expression</em>'.
	 * @see org.hl7.elm.r1.NaryExpression
	 * @generated
	 */
	EClass getNaryExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.NaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see org.hl7.elm.r1.NaryExpression#getOperand()
	 * @see #getNaryExpression()
	 * @generated
	 */
	EReference getNaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negate</em>'.
	 * @see org.hl7.elm.r1.Negate
	 * @generated
	 */
	EClass getNegate();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see org.hl7.elm.r1.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Equal</em>'.
	 * @see org.hl7.elm.r1.NotEqual
	 * @generated
	 */
	EClass getNotEqual();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Now <em>Now</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Now</em>'.
	 * @see org.hl7.elm.r1.Now
	 * @generated
	 */
	EClass getNow();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Null <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null</em>'.
	 * @see org.hl7.elm.r1.Null
	 * @generated
	 */
	EClass getNull();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Null#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.hl7.elm.r1.Null#getValueType()
	 * @see #getNull()
	 * @generated
	 */
	EAttribute getNull_ValueType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.OperandDef <em>Operand Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand Def</em>'.
	 * @see org.hl7.elm.r1.OperandDef
	 * @generated
	 */
	EClass getOperandDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.OperandDef#getOperandTypeSpecifier <em>Operand Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand Type Specifier</em>'.
	 * @see org.hl7.elm.r1.OperandDef#getOperandTypeSpecifier()
	 * @see #getOperandDef()
	 * @generated
	 */
	EReference getOperandDef_OperandTypeSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.OperandDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.OperandDef#getName()
	 * @see #getOperandDef()
	 * @generated
	 */
	EAttribute getOperandDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.OperandDef#getOperandType <em>Operand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operand Type</em>'.
	 * @see org.hl7.elm.r1.OperandDef#getOperandType()
	 * @see #getOperandDef()
	 * @generated
	 */
	EAttribute getOperandDef_OperandType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.OperandRef <em>Operand Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand Ref</em>'.
	 * @see org.hl7.elm.r1.OperandRef
	 * @generated
	 */
	EClass getOperandRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.OperandRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.OperandRef#getName()
	 * @see #getOperandRef()
	 * @generated
	 */
	EAttribute getOperandRef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see org.hl7.elm.r1.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Overlaps <em>Overlaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlaps</em>'.
	 * @see org.hl7.elm.r1.Overlaps
	 * @generated
	 */
	EClass getOverlaps();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Overlaps#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.Overlaps#getPrecision()
	 * @see #getOverlaps()
	 * @generated
	 */
	EAttribute getOverlaps_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.OverlapsAfter <em>Overlaps After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlaps After</em>'.
	 * @see org.hl7.elm.r1.OverlapsAfter
	 * @generated
	 */
	EClass getOverlapsAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.OverlapsAfter#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.OverlapsAfter#getPrecision()
	 * @see #getOverlapsAfter()
	 * @generated
	 */
	EAttribute getOverlapsAfter_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.OverlapsBefore <em>Overlaps Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlaps Before</em>'.
	 * @see org.hl7.elm.r1.OverlapsBefore
	 * @generated
	 */
	EClass getOverlapsBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.OverlapsBefore#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.OverlapsBefore#getPrecision()
	 * @see #getOverlapsBefore()
	 * @generated
	 */
	EAttribute getOverlapsBefore_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Def</em>'.
	 * @see org.hl7.elm.r1.ParameterDef
	 * @generated
	 */
	EClass getParameterDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.ParameterDef#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see org.hl7.elm.r1.ParameterDef#getDefault()
	 * @see #getParameterDef()
	 * @generated
	 */
	EReference getParameterDef_Default();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.ParameterDef#getParameterTypeSpecifier <em>Parameter Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type Specifier</em>'.
	 * @see org.hl7.elm.r1.ParameterDef#getParameterTypeSpecifier()
	 * @see #getParameterDef()
	 * @generated
	 */
	EReference getParameterDef_ParameterTypeSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ParameterDef#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see org.hl7.elm.r1.ParameterDef#getAccessLevel()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ParameterDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.ParameterDef#getName()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ParameterDef#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see org.hl7.elm.r1.ParameterDef#getParameterType()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_ParameterType();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref</em>'.
	 * @see org.hl7.elm.r1.ParameterRef
	 * @generated
	 */
	EClass getParameterRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ParameterRef#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see org.hl7.elm.r1.ParameterRef#getLibraryName()
	 * @see #getParameterRef()
	 * @generated
	 */
	EAttribute getParameterRef_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ParameterRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.ParameterRef#getName()
	 * @see #getParameterRef()
	 * @generated
	 */
	EAttribute getParameterRef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.PopulationStdDev <em>Population Std Dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population Std Dev</em>'.
	 * @see org.hl7.elm.r1.PopulationStdDev
	 * @generated
	 */
	EClass getPopulationStdDev();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.PopulationVariance <em>Population Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population Variance</em>'.
	 * @see org.hl7.elm.r1.PopulationVariance
	 * @generated
	 */
	EClass getPopulationVariance();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.PositionOf <em>Position Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Of</em>'.
	 * @see org.hl7.elm.r1.PositionOf
	 * @generated
	 */
	EClass getPositionOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.PositionOf#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.hl7.elm.r1.PositionOf#getPattern()
	 * @see #getPositionOf()
	 * @generated
	 */
	EReference getPositionOf_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.PositionOf#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see org.hl7.elm.r1.PositionOf#getString()
	 * @see #getPositionOf()
	 * @generated
	 */
	EReference getPositionOf_String();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Power <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power</em>'.
	 * @see org.hl7.elm.r1.Power
	 * @generated
	 */
	EClass getPower();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Predecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predecessor</em>'.
	 * @see org.hl7.elm.r1.Predecessor
	 * @generated
	 */
	EClass getPredecessor();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ProperContains <em>Proper Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proper Contains</em>'.
	 * @see org.hl7.elm.r1.ProperContains
	 * @generated
	 */
	EClass getProperContains();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ProperContains#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.ProperContains#getPrecision()
	 * @see #getProperContains()
	 * @generated
	 */
	EAttribute getProperContains_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ProperIn <em>Proper In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proper In</em>'.
	 * @see org.hl7.elm.r1.ProperIn
	 * @generated
	 */
	EClass getProperIn();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ProperIn#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.ProperIn#getPrecision()
	 * @see #getProperIn()
	 * @generated
	 */
	EAttribute getProperIn_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ProperIncludedIn <em>Proper Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proper Included In</em>'.
	 * @see org.hl7.elm.r1.ProperIncludedIn
	 * @generated
	 */
	EClass getProperIncludedIn();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ProperIncludedIn#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.ProperIncludedIn#getPrecision()
	 * @see #getProperIncludedIn()
	 * @generated
	 */
	EAttribute getProperIncludedIn_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ProperIncludes <em>Proper Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proper Includes</em>'.
	 * @see org.hl7.elm.r1.ProperIncludes
	 * @generated
	 */
	EClass getProperIncludes();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ProperIncludes#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.ProperIncludes#getPrecision()
	 * @see #getProperIncludes()
	 * @generated
	 */
	EAttribute getProperIncludes_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.hl7.elm.r1.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Property#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.Property#getSource()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Property#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.hl7.elm.r1.Property#getPath()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Property#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.hl7.elm.r1.Property#getScope()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Scope();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see org.hl7.elm.r1.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Quantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.hl7.elm.r1.Quantity#getUnit()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Quantity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.hl7.elm.r1.Quantity#getValue()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_Value();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.hl7.elm.r1.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Query#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see org.hl7.elm.r1.Query#getSource()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Query#getDefine <em>Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Define</em>'.
	 * @see org.hl7.elm.r1.Query#getDefine()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Define();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Query#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see org.hl7.elm.r1.Query#getRelationship()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Query#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.hl7.elm.r1.Query#getWhere()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Where();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Query#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.hl7.elm.r1.Query#getReturn()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Return();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Query#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see org.hl7.elm.r1.Query#getSort()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Sort();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.QueryDefineRef <em>Query Define Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Define Ref</em>'.
	 * @see org.hl7.elm.r1.QueryDefineRef
	 * @generated
	 */
	EClass getQueryDefineRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.QueryDefineRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.QueryDefineRef#getName()
	 * @see #getQueryDefineRef()
	 * @generated
	 */
	EAttribute getQueryDefineRef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.RelationshipClause <em>Relationship Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Clause</em>'.
	 * @see org.hl7.elm.r1.RelationshipClause
	 * @generated
	 */
	EClass getRelationshipClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.RelationshipClause#getSuchThat <em>Such That</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Such That</em>'.
	 * @see org.hl7.elm.r1.RelationshipClause#getSuchThat()
	 * @see #getRelationshipClause()
	 * @generated
	 */
	EReference getRelationshipClause_SuchThat();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Retrieve <em>Retrieve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retrieve</em>'.
	 * @see org.hl7.elm.r1.Retrieve
	 * @generated
	 */
	EClass getRetrieve();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Retrieve#getCodes <em>Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codes</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getCodes()
	 * @see #getRetrieve()
	 * @generated
	 */
	EReference getRetrieve_Codes();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Retrieve#getDateRange <em>Date Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Range</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getDateRange()
	 * @see #getRetrieve()
	 * @generated
	 */
	EReference getRetrieve_DateRange();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Retrieve#getCodeProperty <em>Code Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Property</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getCodeProperty()
	 * @see #getRetrieve()
	 * @generated
	 */
	EAttribute getRetrieve_CodeProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Retrieve#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getDataType()
	 * @see #getRetrieve()
	 * @generated
	 */
	EAttribute getRetrieve_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Retrieve#getDateHighProperty <em>Date High Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date High Property</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getDateHighProperty()
	 * @see #getRetrieve()
	 * @generated
	 */
	EAttribute getRetrieve_DateHighProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Retrieve#getDateLowProperty <em>Date Low Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Low Property</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getDateLowProperty()
	 * @see #getRetrieve()
	 * @generated
	 */
	EAttribute getRetrieve_DateLowProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Retrieve#getDateProperty <em>Date Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Property</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getDateProperty()
	 * @see #getRetrieve()
	 * @generated
	 */
	EAttribute getRetrieve_DateProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Retrieve#getIdProperty <em>Id Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Property</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getIdProperty()
	 * @see #getRetrieve()
	 * @generated
	 */
	EAttribute getRetrieve_IdProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Retrieve#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getScope()
	 * @see #getRetrieve()
	 * @generated
	 */
	EAttribute getRetrieve_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Retrieve#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Id</em>'.
	 * @see org.hl7.elm.r1.Retrieve#getTemplateId()
	 * @see #getRetrieve()
	 * @generated
	 */
	EAttribute getRetrieve_TemplateId();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ReturnClause <em>Return Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Clause</em>'.
	 * @see org.hl7.elm.r1.ReturnClause
	 * @generated
	 */
	EClass getReturnClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.ReturnClause#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.hl7.elm.r1.ReturnClause#getExpression()
	 * @see #getReturnClause()
	 * @generated
	 */
	EReference getReturnClause_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ReturnClause#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see org.hl7.elm.r1.ReturnClause#isDistinct()
	 * @see #getReturnClause()
	 * @generated
	 */
	EAttribute getReturnClause_Distinct();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Round <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round</em>'.
	 * @see org.hl7.elm.r1.Round
	 * @generated
	 */
	EClass getRound();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Round#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.hl7.elm.r1.Round#getOperand()
	 * @see #getRound()
	 * @generated
	 */
	EReference getRound_Operand();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Round#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.Round#getPrecision()
	 * @see #getRound()
	 * @generated
	 */
	EReference getRound_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.SameAs <em>Same As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same As</em>'.
	 * @see org.hl7.elm.r1.SameAs
	 * @generated
	 */
	EClass getSameAs();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.SameAs#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.SameAs#getPrecision()
	 * @see #getSameAs()
	 * @generated
	 */
	EAttribute getSameAs_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.SameOrAfter <em>Same Or After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same Or After</em>'.
	 * @see org.hl7.elm.r1.SameOrAfter
	 * @generated
	 */
	EClass getSameOrAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.SameOrAfter#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.SameOrAfter#getPrecision()
	 * @see #getSameOrAfter()
	 * @generated
	 */
	EAttribute getSameOrAfter_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.SameOrBefore <em>Same Or Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Same Or Before</em>'.
	 * @see org.hl7.elm.r1.SameOrBefore
	 * @generated
	 */
	EClass getSameOrBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.SameOrBefore#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.SameOrBefore#getPrecision()
	 * @see #getSameOrBefore()
	 * @generated
	 */
	EAttribute getSameOrBefore_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.SingletonFrom <em>Singleton From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton From</em>'.
	 * @see org.hl7.elm.r1.SingletonFrom
	 * @generated
	 */
	EClass getSingletonFrom();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see org.hl7.elm.r1.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Sort#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.hl7.elm.r1.Sort#getSource()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Sort#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>By</em>'.
	 * @see org.hl7.elm.r1.Sort#getBy()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_By();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.SortByItem <em>Sort By Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort By Item</em>'.
	 * @see org.hl7.elm.r1.SortByItem
	 * @generated
	 */
	EClass getSortByItem();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.SortByItem#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.hl7.elm.r1.SortByItem#getDirection()
	 * @see #getSortByItem()
	 * @generated
	 */
	EAttribute getSortByItem_Direction();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.SortClause <em>Sort Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Clause</em>'.
	 * @see org.hl7.elm.r1.SortClause
	 * @generated
	 */
	EClass getSortClause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.SortClause#getBy <em>By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>By</em>'.
	 * @see org.hl7.elm.r1.SortClause#getBy()
	 * @see #getSortClause()
	 * @generated
	 */
	EReference getSortClause_By();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see org.hl7.elm.r1.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Split#getStringToSplit <em>String To Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String To Split</em>'.
	 * @see org.hl7.elm.r1.Split#getStringToSplit()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_StringToSplit();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Split#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see org.hl7.elm.r1.Split#getSeparator()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Separator();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see org.hl7.elm.r1.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Starts <em>Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starts</em>'.
	 * @see org.hl7.elm.r1.Starts
	 * @generated
	 */
	EClass getStarts();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.Starts#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.hl7.elm.r1.Starts#getPrecision()
	 * @see #getStarts()
	 * @generated
	 */
	EAttribute getStarts_Precision();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.StdDev <em>Std Dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Dev</em>'.
	 * @see org.hl7.elm.r1.StdDev
	 * @generated
	 */
	EClass getStdDev();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Substring <em>Substring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substring</em>'.
	 * @see org.hl7.elm.r1.Substring
	 * @generated
	 */
	EClass getSubstring();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Substring#getStringToSub <em>String To Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String To Sub</em>'.
	 * @see org.hl7.elm.r1.Substring#getStringToSub()
	 * @see #getSubstring()
	 * @generated
	 */
	EReference getSubstring_StringToSub();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Substring#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Index</em>'.
	 * @see org.hl7.elm.r1.Substring#getStartIndex()
	 * @see #getSubstring()
	 * @generated
	 */
	EReference getSubstring_StartIndex();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Substring#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see org.hl7.elm.r1.Substring#getLength()
	 * @see #getSubstring()
	 * @generated
	 */
	EReference getSubstring_Length();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtract</em>'.
	 * @see org.hl7.elm.r1.Subtract
	 * @generated
	 */
	EClass getSubtract();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Successor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Successor</em>'.
	 * @see org.hl7.elm.r1.Successor
	 * @generated
	 */
	EClass getSuccessor();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum</em>'.
	 * @see org.hl7.elm.r1.Sum
	 * @generated
	 */
	EClass getSum();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TernaryExpression <em>Ternary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ternary Expression</em>'.
	 * @see org.hl7.elm.r1.TernaryExpression
	 * @generated
	 */
	EClass getTernaryExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.TernaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see org.hl7.elm.r1.TernaryExpression#getOperand()
	 * @see #getTernaryExpression()
	 * @generated
	 */
	EReference getTernaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.hl7.elm.r1.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Time#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hour</em>'.
	 * @see org.hl7.elm.r1.Time#getHour()
	 * @see #getTime()
	 * @generated
	 */
	EReference getTime_Hour();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Time#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minute</em>'.
	 * @see org.hl7.elm.r1.Time#getMinute()
	 * @see #getTime()
	 * @generated
	 */
	EReference getTime_Minute();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Time#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see org.hl7.elm.r1.Time#getSecond()
	 * @see #getTime()
	 * @generated
	 */
	EReference getTime_Second();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Time#getMillisecond <em>Millisecond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Millisecond</em>'.
	 * @see org.hl7.elm.r1.Time#getMillisecond()
	 * @see #getTime()
	 * @generated
	 */
	EReference getTime_Millisecond();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.Time#getTimezoneOffset <em>Timezone Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timezone Offset</em>'.
	 * @see org.hl7.elm.r1.Time#getTimezoneOffset()
	 * @see #getTime()
	 * @generated
	 */
	EReference getTime_TimezoneOffset();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TimeFrom <em>Time From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time From</em>'.
	 * @see org.hl7.elm.r1.TimeFrom
	 * @generated
	 */
	EClass getTimeFrom();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Of Day</em>'.
	 * @see org.hl7.elm.r1.TimeOfDay
	 * @generated
	 */
	EClass getTimeOfDay();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Times <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Times</em>'.
	 * @see org.hl7.elm.r1.Times
	 * @generated
	 */
	EClass getTimes();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TimezoneFrom <em>Timezone From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timezone From</em>'.
	 * @see org.hl7.elm.r1.TimezoneFrom
	 * @generated
	 */
	EClass getTimezoneFrom();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Today <em>Today</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Today</em>'.
	 * @see org.hl7.elm.r1.Today
	 * @generated
	 */
	EClass getToday();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Truncate <em>Truncate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truncate</em>'.
	 * @see org.hl7.elm.r1.Truncate
	 * @generated
	 */
	EClass getTruncate();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TruncatedDivide <em>Truncated Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truncated Divide</em>'.
	 * @see org.hl7.elm.r1.TruncatedDivide
	 * @generated
	 */
	EClass getTruncatedDivide();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple</em>'.
	 * @see org.hl7.elm.r1.Tuple
	 * @generated
	 */
	EClass getTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.Tuple#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.hl7.elm.r1.Tuple#getElement()
	 * @see #getTuple()
	 * @generated
	 */
	EReference getTuple_Element();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Element</em>'.
	 * @see org.hl7.elm.r1.TupleElement
	 * @generated
	 */
	EClass getTupleElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.TupleElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.hl7.elm.r1.TupleElement#getValue()
	 * @see #getTupleElement()
	 * @generated
	 */
	EReference getTupleElement_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.TupleElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.TupleElement#getName()
	 * @see #getTupleElement()
	 * @generated
	 */
	EAttribute getTupleElement_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TupleElementDefinition <em>Tuple Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Element Definition</em>'.
	 * @see org.hl7.elm.r1.TupleElementDefinition
	 * @generated
	 */
	EClass getTupleElementDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.TupleElementDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.hl7.elm.r1.TupleElementDefinition#getType()
	 * @see #getTupleElementDefinition()
	 * @generated
	 */
	EReference getTupleElementDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.TupleElementDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.TupleElementDefinition#getName()
	 * @see #getTupleElementDefinition()
	 * @generated
	 */
	EAttribute getTupleElementDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TupleTypeSpecifier <em>Tuple Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type Specifier</em>'.
	 * @see org.hl7.elm.r1.TupleTypeSpecifier
	 * @generated
	 */
	EClass getTupleTypeSpecifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.TupleTypeSpecifier#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.hl7.elm.r1.TupleTypeSpecifier#getElement()
	 * @see #getTupleTypeSpecifier()
	 * @generated
	 */
	EReference getTupleTypeSpecifier_Element();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.TypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Specifier</em>'.
	 * @see org.hl7.elm.r1.TypeSpecifier
	 * @generated
	 */
	EClass getTypeSpecifier();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.hl7.elm.r1.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.hl7.elm.r1.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.hl7.elm.r1.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see org.hl7.elm.r1.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Upper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper</em>'.
	 * @see org.hl7.elm.r1.Upper
	 * @generated
	 */
	EClass getUpper();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ValueSetDef <em>Value Set Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Def</em>'.
	 * @see org.hl7.elm.r1.ValueSetDef
	 * @generated
	 */
	EClass getValueSetDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hl7.elm.r1.ValueSetDef#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code System</em>'.
	 * @see org.hl7.elm.r1.ValueSetDef#getCodeSystem()
	 * @see #getValueSetDef()
	 * @generated
	 */
	EReference getValueSetDef_CodeSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ValueSetDef#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see org.hl7.elm.r1.ValueSetDef#getAccessLevel()
	 * @see #getValueSetDef()
	 * @generated
	 */
	EAttribute getValueSetDef_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ValueSetDef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hl7.elm.r1.ValueSetDef#getId()
	 * @see #getValueSetDef()
	 * @generated
	 */
	EAttribute getValueSetDef_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ValueSetDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.ValueSetDef#getName()
	 * @see #getValueSetDef()
	 * @generated
	 */
	EAttribute getValueSetDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ValueSetDef#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.hl7.elm.r1.ValueSetDef#getVersion()
	 * @see #getValueSetDef()
	 * @generated
	 */
	EAttribute getValueSetDef_Version();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.ValueSetRef <em>Value Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Ref</em>'.
	 * @see org.hl7.elm.r1.ValueSetRef
	 * @generated
	 */
	EClass getValueSetRef();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ValueSetRef#getLibraryName <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Name</em>'.
	 * @see org.hl7.elm.r1.ValueSetRef#getLibraryName()
	 * @see #getValueSetRef()
	 * @generated
	 */
	EAttribute getValueSetRef_LibraryName();

	/**
	 * Returns the meta object for the attribute '{@link org.hl7.elm.r1.ValueSetRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hl7.elm.r1.ValueSetRef#getName()
	 * @see #getValueSetRef()
	 * @generated
	 */
	EAttribute getValueSetRef_Name();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Variance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variance</em>'.
	 * @see org.hl7.elm.r1.Variance
	 * @generated
	 */
	EClass getVariance();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Width <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Width</em>'.
	 * @see org.hl7.elm.r1.Width
	 * @generated
	 */
	EClass getWidth();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.With <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>With</em>'.
	 * @see org.hl7.elm.r1.With
	 * @generated
	 */
	EClass getWith();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Without <em>Without</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Without</em>'.
	 * @see org.hl7.elm.r1.Without
	 * @generated
	 */
	EClass getWithout();

	/**
	 * Returns the meta object for class '{@link org.hl7.elm.r1.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see org.hl7.elm.r1.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for enum '{@link org.hl7.elm.r1.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Modifier</em>'.
	 * @see org.hl7.elm.r1.AccessModifier
	 * @generated
	 */
	EEnum getAccessModifier();

	/**
	 * Returns the meta object for enum '{@link org.hl7.elm.r1.DateTimePrecision <em>Date Time Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Time Precision</em>'.
	 * @see org.hl7.elm.r1.DateTimePrecision
	 * @generated
	 */
	EEnum getDateTimePrecision();

	/**
	 * Returns the meta object for enum '{@link org.hl7.elm.r1.SortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Direction</em>'.
	 * @see org.hl7.elm.r1.SortDirection
	 * @generated
	 */
	EEnum getSortDirection();

	/**
	 * Returns the meta object for data type '{@link org.hl7.elm.r1.AccessModifier <em>Access Modifier Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Modifier Object</em>'.
	 * @see org.hl7.elm.r1.AccessModifier
	 * @model instanceClass="org.hl7.elm.r1.AccessModifier"
	 *        extendedMetaData="name='AccessModifier:Object' baseType='AccessModifier'"
	 * @generated
	 */
	EDataType getAccessModifierObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.elm.r1.DateTimePrecision <em>Date Time Precision Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Precision Object</em>'.
	 * @see org.hl7.elm.r1.DateTimePrecision
	 * @model instanceClass="org.hl7.elm.r1.DateTimePrecision"
	 *        extendedMetaData="name='DateTimePrecision:Object' baseType='DateTimePrecision'"
	 * @generated
	 */
	EDataType getDateTimePrecisionObject();

	/**
	 * Returns the meta object for data type '{@link org.hl7.elm.r1.SortDirection <em>Sort Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sort Direction Object</em>'.
	 * @see org.hl7.elm.r1.SortDirection
	 * @model instanceClass="org.hl7.elm.r1.SortDirection"
	 *        extendedMetaData="name='SortDirection:Object' baseType='SortDirection'"
	 * @generated
	 */
	EDataType getSortDirectionObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	R1Factory getR1Factory();

} //R1Package
