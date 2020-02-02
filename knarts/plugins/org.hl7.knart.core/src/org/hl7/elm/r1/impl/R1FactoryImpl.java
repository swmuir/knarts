/**
 */
package org.hl7.elm.r1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hl7.elm.r1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class R1FactoryImpl extends EFactoryImpl implements R1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static R1Factory init() {
		try {
			R1Factory theR1Factory = (R1Factory)EPackage.Registry.INSTANCE.getEFactory(R1Package.eNS_URI);
			if (theR1Factory != null) {
				return theR1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new R1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1FactoryImpl() {
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
			case R1Package.ABS: return createAbs();
			case R1Package.ADD: return createAdd();
			case R1Package.AFTER: return createAfter();
			case R1Package.ALIASED_QUERY_SOURCE: return createAliasedQuerySource();
			case R1Package.ALIAS_REF: return createAliasRef();
			case R1Package.ALL_TRUE: return createAllTrue();
			case R1Package.AND: return createAnd();
			case R1Package.ANY_TRUE: return createAnyTrue();
			case R1Package.AS: return createAs();
			case R1Package.AVG: return createAvg();
			case R1Package.BEFORE: return createBefore();
			case R1Package.BINARY_EXPRESSION: return createBinaryExpression();
			case R1Package.BY_COLUMN: return createByColumn();
			case R1Package.BY_DIRECTION: return createByDirection();
			case R1Package.BY_EXPRESSION: return createByExpression();
			case R1Package.CALCULATE_AGE: return createCalculateAge();
			case R1Package.CALCULATE_AGE_AT: return createCalculateAgeAt();
			case R1Package.CASE: return createCase();
			case R1Package.CASE_ITEM: return createCaseItem();
			case R1Package.CEILING: return createCeiling();
			case R1Package.COALESCE: return createCoalesce();
			case R1Package.CODE: return createCode();
			case R1Package.CODE_SYSTEM_DEF: return createCodeSystemDef();
			case R1Package.CODE_SYSTEM_REF: return createCodeSystemRef();
			case R1Package.COLLAPSE: return createCollapse();
			case R1Package.COMBINE: return createCombine();
			case R1Package.CONCATENATE: return createConcatenate();
			case R1Package.CONCEPT: return createConcept();
			case R1Package.CONTAINS: return createContains();
			case R1Package.CONVERT: return createConvert();
			case R1Package.COUNT: return createCount();
			case R1Package.CURRENT: return createCurrent();
			case R1Package.DATE_FROM: return createDateFrom();
			case R1Package.DATE_TIME: return createDateTime();
			case R1Package.DATE_TIME_COMPONENT_FROM: return createDateTimeComponentFrom();
			case R1Package.DEFINE_CLAUSE: return createDefineClause();
			case R1Package.DIFFERENCE_BETWEEN: return createDifferenceBetween();
			case R1Package.DISTINCT: return createDistinct();
			case R1Package.DIVIDE: return createDivide();
			case R1Package.DURATION_BETWEEN: return createDurationBetween();
			case R1Package.END: return createEnd();
			case R1Package.ENDS: return createEnds();
			case R1Package.EQUAL: return createEqual();
			case R1Package.EXCEPT: return createExcept();
			case R1Package.EXISTS: return createExists();
			case R1Package.EXPAND: return createExpand();
			case R1Package.EXPRESSION_DEF: return createExpressionDef();
			case R1Package.EXPRESSION_REF: return createExpressionRef();
			case R1Package.FILTER: return createFilter();
			case R1Package.FIRST: return createFirst();
			case R1Package.FLOOR: return createFloor();
			case R1Package.FOR_EACH: return createForEach();
			case R1Package.FUNCTION_DEF: return createFunctionDef();
			case R1Package.FUNCTION_REF: return createFunctionRef();
			case R1Package.GREATER: return createGreater();
			case R1Package.GREATER_OR_EQUAL: return createGreaterOrEqual();
			case R1Package.IDENTIFIER_REF: return createIdentifierRef();
			case R1Package.IF: return createIf();
			case R1Package.IN: return createIn();
			case R1Package.INCLUDED_IN: return createIncludedIn();
			case R1Package.INCLUDES: return createIncludes();
			case R1Package.IN_CODE_SYSTEM: return createInCodeSystem();
			case R1Package.INDEXER: return createIndexer();
			case R1Package.INDEX_OF: return createIndexOf();
			case R1Package.INSTANCE: return createInstance();
			case R1Package.INSTANCE_ELEMENT: return createInstanceElement();
			case R1Package.INTERSECT: return createIntersect();
			case R1Package.INTERVAL: return createInterval();
			case R1Package.INTERVAL_TYPE_SPECIFIER: return createIntervalTypeSpecifier();
			case R1Package.IN_VALUE_SET: return createInValueSet();
			case R1Package.IS: return createIs();
			case R1Package.IS_FALSE: return createIsFalse();
			case R1Package.IS_NULL: return createIsNull();
			case R1Package.IS_TRUE: return createIsTrue();
			case R1Package.LAST: return createLast();
			case R1Package.LENGTH: return createLength();
			case R1Package.LESS: return createLess();
			case R1Package.LESS_OR_EQUAL: return createLessOrEqual();
			case R1Package.LIST: return createList();
			case R1Package.LIST_TYPE_SPECIFIER: return createListTypeSpecifier();
			case R1Package.LITERAL: return createLiteral();
			case R1Package.LN: return createLn();
			case R1Package.LOG: return createLog();
			case R1Package.LOWER: return createLower();
			case R1Package.MATCHES: return createMatches();
			case R1Package.MAX: return createMax();
			case R1Package.MAX_VALUE: return createMaxValue();
			case R1Package.MEDIAN: return createMedian();
			case R1Package.MEETS: return createMeets();
			case R1Package.MEETS_AFTER: return createMeetsAfter();
			case R1Package.MEETS_BEFORE: return createMeetsBefore();
			case R1Package.MIN: return createMin();
			case R1Package.MIN_VALUE: return createMinValue();
			case R1Package.MODE: return createMode();
			case R1Package.MODULO: return createModulo();
			case R1Package.MULTIPLY: return createMultiply();
			case R1Package.NAMED_TYPE_SPECIFIER: return createNamedTypeSpecifier();
			case R1Package.NEGATE: return createNegate();
			case R1Package.NOT: return createNot();
			case R1Package.NOT_EQUAL: return createNotEqual();
			case R1Package.NOW: return createNow();
			case R1Package.NULL: return createNull();
			case R1Package.OPERAND_DEF: return createOperandDef();
			case R1Package.OPERAND_REF: return createOperandRef();
			case R1Package.OR: return createOr();
			case R1Package.OVERLAPS: return createOverlaps();
			case R1Package.OVERLAPS_AFTER: return createOverlapsAfter();
			case R1Package.OVERLAPS_BEFORE: return createOverlapsBefore();
			case R1Package.PARAMETER_DEF: return createParameterDef();
			case R1Package.PARAMETER_REF: return createParameterRef();
			case R1Package.POPULATION_STD_DEV: return createPopulationStdDev();
			case R1Package.POPULATION_VARIANCE: return createPopulationVariance();
			case R1Package.POSITION_OF: return createPositionOf();
			case R1Package.POWER: return createPower();
			case R1Package.PREDECESSOR: return createPredecessor();
			case R1Package.PROPER_CONTAINS: return createProperContains();
			case R1Package.PROPER_IN: return createProperIn();
			case R1Package.PROPER_INCLUDED_IN: return createProperIncludedIn();
			case R1Package.PROPER_INCLUDES: return createProperIncludes();
			case R1Package.PROPERTY: return createProperty();
			case R1Package.QUANTITY: return createQuantity();
			case R1Package.QUERY: return createQuery();
			case R1Package.QUERY_DEFINE_REF: return createQueryDefineRef();
			case R1Package.RETRIEVE: return createRetrieve();
			case R1Package.RETURN_CLAUSE: return createReturnClause();
			case R1Package.ROUND: return createRound();
			case R1Package.SAME_AS: return createSameAs();
			case R1Package.SAME_OR_AFTER: return createSameOrAfter();
			case R1Package.SAME_OR_BEFORE: return createSameOrBefore();
			case R1Package.SINGLETON_FROM: return createSingletonFrom();
			case R1Package.SORT: return createSort();
			case R1Package.SORT_CLAUSE: return createSortClause();
			case R1Package.SPLIT: return createSplit();
			case R1Package.START: return createStart();
			case R1Package.STARTS: return createStarts();
			case R1Package.STD_DEV: return createStdDev();
			case R1Package.SUBSTRING: return createSubstring();
			case R1Package.SUBTRACT: return createSubtract();
			case R1Package.SUCCESSOR: return createSuccessor();
			case R1Package.SUM: return createSum();
			case R1Package.TERNARY_EXPRESSION: return createTernaryExpression();
			case R1Package.TIME: return createTime();
			case R1Package.TIME_FROM: return createTimeFrom();
			case R1Package.TIME_OF_DAY: return createTimeOfDay();
			case R1Package.TIMES: return createTimes();
			case R1Package.TIMEZONE_FROM: return createTimezoneFrom();
			case R1Package.TODAY: return createToday();
			case R1Package.TRUNCATE: return createTruncate();
			case R1Package.TRUNCATED_DIVIDE: return createTruncatedDivide();
			case R1Package.TUPLE: return createTuple();
			case R1Package.TUPLE_ELEMENT: return createTupleElement();
			case R1Package.TUPLE_ELEMENT_DEFINITION: return createTupleElementDefinition();
			case R1Package.TUPLE_TYPE_SPECIFIER: return createTupleTypeSpecifier();
			case R1Package.UNION: return createUnion();
			case R1Package.UPPER: return createUpper();
			case R1Package.VALUE_SET_DEF: return createValueSetDef();
			case R1Package.VALUE_SET_REF: return createValueSetRef();
			case R1Package.VARIANCE: return createVariance();
			case R1Package.WIDTH: return createWidth();
			case R1Package.WITH: return createWith();
			case R1Package.WITHOUT: return createWithout();
			case R1Package.XOR: return createXor();
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
			case R1Package.ACCESS_MODIFIER:
				return createAccessModifierFromString(eDataType, initialValue);
			case R1Package.DATE_TIME_PRECISION:
				return createDateTimePrecisionFromString(eDataType, initialValue);
			case R1Package.SORT_DIRECTION:
				return createSortDirectionFromString(eDataType, initialValue);
			case R1Package.ACCESS_MODIFIER_OBJECT:
				return createAccessModifierObjectFromString(eDataType, initialValue);
			case R1Package.DATE_TIME_PRECISION_OBJECT:
				return createDateTimePrecisionObjectFromString(eDataType, initialValue);
			case R1Package.SORT_DIRECTION_OBJECT:
				return createSortDirectionObjectFromString(eDataType, initialValue);
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
			case R1Package.ACCESS_MODIFIER:
				return convertAccessModifierToString(eDataType, instanceValue);
			case R1Package.DATE_TIME_PRECISION:
				return convertDateTimePrecisionToString(eDataType, instanceValue);
			case R1Package.SORT_DIRECTION:
				return convertSortDirectionToString(eDataType, instanceValue);
			case R1Package.ACCESS_MODIFIER_OBJECT:
				return convertAccessModifierObjectToString(eDataType, instanceValue);
			case R1Package.DATE_TIME_PRECISION_OBJECT:
				return convertDateTimePrecisionObjectToString(eDataType, instanceValue);
			case R1Package.SORT_DIRECTION_OBJECT:
				return convertSortDirectionObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abs createAbs() {
		AbsImpl abs = new AbsImpl();
		return abs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public After createAfter() {
		AfterImpl after = new AfterImpl();
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasedQuerySource createAliasedQuerySource() {
		AliasedQuerySourceImpl aliasedQuerySource = new AliasedQuerySourceImpl();
		return aliasedQuerySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasRef createAliasRef() {
		AliasRefImpl aliasRef = new AliasRefImpl();
		return aliasRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllTrue createAllTrue() {
		AllTrueImpl allTrue = new AllTrueImpl();
		return allTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyTrue createAnyTrue() {
		AnyTrueImpl anyTrue = new AnyTrueImpl();
		return anyTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As createAs() {
		AsImpl as = new AsImpl();
		return as;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avg createAvg() {
		AvgImpl avg = new AvgImpl();
		return avg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Before createBefore() {
		BeforeImpl before = new BeforeImpl();
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByColumn createByColumn() {
		ByColumnImpl byColumn = new ByColumnImpl();
		return byColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByDirection createByDirection() {
		ByDirectionImpl byDirection = new ByDirectionImpl();
		return byDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByExpression createByExpression() {
		ByExpressionImpl byExpression = new ByExpressionImpl();
		return byExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculateAge createCalculateAge() {
		CalculateAgeImpl calculateAge = new CalculateAgeImpl();
		return calculateAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculateAgeAt createCalculateAgeAt() {
		CalculateAgeAtImpl calculateAgeAt = new CalculateAgeAtImpl();
		return calculateAgeAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseItem createCaseItem() {
		CaseItemImpl caseItem = new CaseItemImpl();
		return caseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ceiling createCeiling() {
		CeilingImpl ceiling = new CeilingImpl();
		return ceiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coalesce createCoalesce() {
		CoalesceImpl coalesce = new CoalesceImpl();
		return coalesce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemDef createCodeSystemDef() {
		CodeSystemDefImpl codeSystemDef = new CodeSystemDefImpl();
		return codeSystemDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemRef createCodeSystemRef() {
		CodeSystemRefImpl codeSystemRef = new CodeSystemRefImpl();
		return codeSystemRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collapse createCollapse() {
		CollapseImpl collapse = new CollapseImpl();
		return collapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combine createCombine() {
		CombineImpl combine = new CombineImpl();
		return combine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concatenate createConcatenate() {
		ConcatenateImpl concatenate = new ConcatenateImpl();
		return concatenate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert createConvert() {
		ConvertImpl convert = new ConvertImpl();
		return convert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Current createCurrent() {
		CurrentImpl current = new CurrentImpl();
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFrom createDateFrom() {
		DateFromImpl dateFrom = new DateFromImpl();
		return dateFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeComponentFrom createDateTimeComponentFrom() {
		DateTimeComponentFromImpl dateTimeComponentFrom = new DateTimeComponentFromImpl();
		return dateTimeComponentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineClause createDefineClause() {
		DefineClauseImpl defineClause = new DefineClauseImpl();
		return defineClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferenceBetween createDifferenceBetween() {
		DifferenceBetweenImpl differenceBetween = new DifferenceBetweenImpl();
		return differenceBetween;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distinct createDistinct() {
		DistinctImpl distinct = new DistinctImpl();
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationBetween createDurationBetween() {
		DurationBetweenImpl durationBetween = new DurationBetweenImpl();
		return durationBetween;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ends createEnds() {
		EndsImpl ends = new EndsImpl();
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Except createExcept() {
		ExceptImpl except = new ExceptImpl();
		return except;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exists createExists() {
		ExistsImpl exists = new ExistsImpl();
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expand createExpand() {
		ExpandImpl expand = new ExpandImpl();
		return expand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionDef createExpressionDef() {
		ExpressionDefImpl expressionDef = new ExpressionDefImpl();
		return expressionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionRef createExpressionRef() {
		ExpressionRefImpl expressionRef = new ExpressionRefImpl();
		return expressionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public First createFirst() {
		FirstImpl first = new FirstImpl();
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor createFloor() {
		FloorImpl floor = new FloorImpl();
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach createForEach() {
		ForEachImpl forEach = new ForEachImpl();
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDef createFunctionDef() {
		FunctionDefImpl functionDef = new FunctionDefImpl();
		return functionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionRef createFunctionRef() {
		FunctionRefImpl functionRef = new FunctionRefImpl();
		return functionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterOrEqual createGreaterOrEqual() {
		GreaterOrEqualImpl greaterOrEqual = new GreaterOrEqualImpl();
		return greaterOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierRef createIdentifierRef() {
		IdentifierRefImpl identifierRef = new IdentifierRefImpl();
		return identifierRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public In createIn() {
		InImpl in = new InImpl();
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedIn createIncludedIn() {
		IncludedInImpl includedIn = new IncludedInImpl();
		return includedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Includes createIncludes() {
		IncludesImpl includes = new IncludesImpl();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InCodeSystem createInCodeSystem() {
		InCodeSystemImpl inCodeSystem = new InCodeSystemImpl();
		return inCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indexer createIndexer() {
		IndexerImpl indexer = new IndexerImpl();
		return indexer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexOf createIndexOf() {
		IndexOfImpl indexOf = new IndexOfImpl();
		return indexOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceElement createInstanceElement() {
		InstanceElementImpl instanceElement = new InstanceElementImpl();
		return instanceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intersect createIntersect() {
		IntersectImpl intersect = new IntersectImpl();
		return intersect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalTypeSpecifier createIntervalTypeSpecifier() {
		IntervalTypeSpecifierImpl intervalTypeSpecifier = new IntervalTypeSpecifierImpl();
		return intervalTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InValueSet createInValueSet() {
		InValueSetImpl inValueSet = new InValueSetImpl();
		return inValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Is createIs() {
		IsImpl is = new IsImpl();
		return is;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsFalse createIsFalse() {
		IsFalseImpl isFalse = new IsFalseImpl();
		return isFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNull createIsNull() {
		IsNullImpl isNull = new IsNullImpl();
		return isNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsTrue createIsTrue() {
		IsTrueImpl isTrue = new IsTrueImpl();
		return isTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Last createLast() {
		LastImpl last = new LastImpl();
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessOrEqual createLessOrEqual() {
		LessOrEqualImpl lessOrEqual = new LessOrEqualImpl();
		return lessOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListTypeSpecifier createListTypeSpecifier() {
		ListTypeSpecifierImpl listTypeSpecifier = new ListTypeSpecifierImpl();
		return listTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ln createLn() {
		LnImpl ln = new LnImpl();
		return ln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Log createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lower createLower() {
		LowerImpl lower = new LowerImpl();
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matches createMatches() {
		MatchesImpl matches = new MatchesImpl();
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Max createMax() {
		MaxImpl max = new MaxImpl();
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxValue createMaxValue() {
		MaxValueImpl maxValue = new MaxValueImpl();
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Median createMedian() {
		MedianImpl median = new MedianImpl();
		return median;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meets createMeets() {
		MeetsImpl meets = new MeetsImpl();
		return meets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetsAfter createMeetsAfter() {
		MeetsAfterImpl meetsAfter = new MeetsAfterImpl();
		return meetsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeetsBefore createMeetsBefore() {
		MeetsBeforeImpl meetsBefore = new MeetsBeforeImpl();
		return meetsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Min createMin() {
		MinImpl min = new MinImpl();
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinValue createMinValue() {
		MinValueImpl minValue = new MinValueImpl();
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeSpecifier createNamedTypeSpecifier() {
		NamedTypeSpecifierImpl namedTypeSpecifier = new NamedTypeSpecifierImpl();
		return namedTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negate createNegate() {
		NegateImpl negate = new NegateImpl();
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEqual createNotEqual() {
		NotEqualImpl notEqual = new NotEqualImpl();
		return notEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Now createNow() {
		NowImpl now = new NowImpl();
		return now;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Null createNull() {
		NullImpl null_ = new NullImpl();
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandDef createOperandDef() {
		OperandDefImpl operandDef = new OperandDefImpl();
		return operandDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandRef createOperandRef() {
		OperandRefImpl operandRef = new OperandRefImpl();
		return operandRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overlaps createOverlaps() {
		OverlapsImpl overlaps = new OverlapsImpl();
		return overlaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlapsAfter createOverlapsAfter() {
		OverlapsAfterImpl overlapsAfter = new OverlapsAfterImpl();
		return overlapsAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlapsBefore createOverlapsBefore() {
		OverlapsBeforeImpl overlapsBefore = new OverlapsBeforeImpl();
		return overlapsBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDef createParameterDef() {
		ParameterDefImpl parameterDef = new ParameterDefImpl();
		return parameterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRef createParameterRef() {
		ParameterRefImpl parameterRef = new ParameterRefImpl();
		return parameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationStdDev createPopulationStdDev() {
		PopulationStdDevImpl populationStdDev = new PopulationStdDevImpl();
		return populationStdDev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationVariance createPopulationVariance() {
		PopulationVarianceImpl populationVariance = new PopulationVarianceImpl();
		return populationVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionOf createPositionOf() {
		PositionOfImpl positionOf = new PositionOfImpl();
		return positionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Power createPower() {
		PowerImpl power = new PowerImpl();
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predecessor createPredecessor() {
		PredecessorImpl predecessor = new PredecessorImpl();
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProperContains createProperContains() {
		ProperContainsImpl properContains = new ProperContainsImpl();
		return properContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProperIn createProperIn() {
		ProperInImpl properIn = new ProperInImpl();
		return properIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProperIncludedIn createProperIncludedIn() {
		ProperIncludedInImpl properIncludedIn = new ProperIncludedInImpl();
		return properIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProperIncludes createProperIncludes() {
		ProperIncludesImpl properIncludes = new ProperIncludesImpl();
		return properIncludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDefineRef createQueryDefineRef() {
		QueryDefineRefImpl queryDefineRef = new QueryDefineRefImpl();
		return queryDefineRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retrieve createRetrieve() {
		RetrieveImpl retrieve = new RetrieveImpl();
		return retrieve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnClause createReturnClause() {
		ReturnClauseImpl returnClause = new ReturnClauseImpl();
		return returnClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Round createRound() {
		RoundImpl round = new RoundImpl();
		return round;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameAs createSameAs() {
		SameAsImpl sameAs = new SameAsImpl();
		return sameAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameOrAfter createSameOrAfter() {
		SameOrAfterImpl sameOrAfter = new SameOrAfterImpl();
		return sameOrAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SameOrBefore createSameOrBefore() {
		SameOrBeforeImpl sameOrBefore = new SameOrBeforeImpl();
		return sameOrBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonFrom createSingletonFrom() {
		SingletonFromImpl singletonFrom = new SingletonFromImpl();
		return singletonFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort createSort() {
		SortImpl sort = new SortImpl();
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortClause createSortClause() {
		SortClauseImpl sortClause = new SortClauseImpl();
		return sortClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split createSplit() {
		SplitImpl split = new SplitImpl();
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Starts createStarts() {
		StartsImpl starts = new StartsImpl();
		return starts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdDev createStdDev() {
		StdDevImpl stdDev = new StdDevImpl();
		return stdDev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substring createSubstring() {
		SubstringImpl substring = new SubstringImpl();
		return substring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtract createSubtract() {
		SubtractImpl subtract = new SubtractImpl();
		return subtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Successor createSuccessor() {
		SuccessorImpl successor = new SuccessorImpl();
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sum createSum() {
		SumImpl sum = new SumImpl();
		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TernaryExpression createTernaryExpression() {
		TernaryExpressionImpl ternaryExpression = new TernaryExpressionImpl();
		return ternaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFrom createTimeFrom() {
		TimeFromImpl timeFrom = new TimeFromImpl();
		return timeFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOfDay createTimeOfDay() {
		TimeOfDayImpl timeOfDay = new TimeOfDayImpl();
		return timeOfDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Times createTimes() {
		TimesImpl times = new TimesImpl();
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimezoneFrom createTimezoneFrom() {
		TimezoneFromImpl timezoneFrom = new TimezoneFromImpl();
		return timezoneFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Today createToday() {
		TodayImpl today = new TodayImpl();
		return today;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Truncate createTruncate() {
		TruncateImpl truncate = new TruncateImpl();
		return truncate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruncatedDivide createTruncatedDivide() {
		TruncatedDivideImpl truncatedDivide = new TruncatedDivideImpl();
		return truncatedDivide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple createTuple() {
		TupleImpl tuple = new TupleImpl();
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleElement createTupleElement() {
		TupleElementImpl tupleElement = new TupleElementImpl();
		return tupleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleElementDefinition createTupleElementDefinition() {
		TupleElementDefinitionImpl tupleElementDefinition = new TupleElementDefinitionImpl();
		return tupleElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeSpecifier createTupleTypeSpecifier() {
		TupleTypeSpecifierImpl tupleTypeSpecifier = new TupleTypeSpecifierImpl();
		return tupleTypeSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Upper createUpper() {
		UpperImpl upper = new UpperImpl();
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetDef createValueSetDef() {
		ValueSetDefImpl valueSetDef = new ValueSetDefImpl();
		return valueSetDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetRef createValueSetRef() {
		ValueSetRefImpl valueSetRef = new ValueSetRefImpl();
		return valueSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variance createVariance() {
		VarianceImpl variance = new VarianceImpl();
		return variance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Width createWidth() {
		WidthImpl width = new WidthImpl();
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public With createWith() {
		WithImpl with = new WithImpl();
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Without createWithout() {
		WithoutImpl without = new WithoutImpl();
		return without;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier createAccessModifierFromString(EDataType eDataType, String initialValue) {
		AccessModifier result = AccessModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePrecision createDateTimePrecisionFromString(EDataType eDataType, String initialValue) {
		DateTimePrecision result = DateTimePrecision.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrecisionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirection createSortDirectionFromString(EDataType eDataType, String initialValue) {
		SortDirection result = SortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier createAccessModifierObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessModifierFromString(R1Package.eINSTANCE.getAccessModifier(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModifierObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessModifierToString(R1Package.eINSTANCE.getAccessModifier(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePrecision createDateTimePrecisionObjectFromString(EDataType eDataType, String initialValue) {
		return createDateTimePrecisionFromString(R1Package.eINSTANCE.getDateTimePrecision(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrecisionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimePrecisionToString(R1Package.eINSTANCE.getDateTimePrecision(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirection createSortDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createSortDirectionFromString(R1Package.eINSTANCE.getSortDirection(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSortDirectionToString(R1Package.eINSTANCE.getSortDirection(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1Package getR1Package() {
		return (R1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static R1Package getPackage() {
		return R1Package.eINSTANCE;
	}

} //R1FactoryImpl
