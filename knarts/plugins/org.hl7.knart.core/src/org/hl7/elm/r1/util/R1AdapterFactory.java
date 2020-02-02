/**
 */
package org.hl7.elm.r1.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.hl7.elm.r1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.elm.r1.R1Package
 * @generated
 */
public class R1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static R1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = R1Package.eINSTANCE;
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
	protected R1Switch<Adapter> modelSwitch =
		new R1Switch<Adapter>() {
			@Override
			public Adapter caseAbs(Abs object) {
				return createAbsAdapter();
			}
			@Override
			public Adapter caseAdd(Add object) {
				return createAddAdapter();
			}
			@Override
			public Adapter caseAfter(After object) {
				return createAfterAdapter();
			}
			@Override
			public Adapter caseAggregateExpression(AggregateExpression object) {
				return createAggregateExpressionAdapter();
			}
			@Override
			public Adapter caseAliasedQuerySource(AliasedQuerySource object) {
				return createAliasedQuerySourceAdapter();
			}
			@Override
			public Adapter caseAliasRef(AliasRef object) {
				return createAliasRefAdapter();
			}
			@Override
			public Adapter caseAllTrue(AllTrue object) {
				return createAllTrueAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseAnyTrue(AnyTrue object) {
				return createAnyTrueAdapter();
			}
			@Override
			public Adapter caseAs(As object) {
				return createAsAdapter();
			}
			@Override
			public Adapter caseAvg(Avg object) {
				return createAvgAdapter();
			}
			@Override
			public Adapter caseBefore(Before object) {
				return createBeforeAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseByColumn(ByColumn object) {
				return createByColumnAdapter();
			}
			@Override
			public Adapter caseByDirection(ByDirection object) {
				return createByDirectionAdapter();
			}
			@Override
			public Adapter caseByExpression(ByExpression object) {
				return createByExpressionAdapter();
			}
			@Override
			public Adapter caseCalculateAge(CalculateAge object) {
				return createCalculateAgeAdapter();
			}
			@Override
			public Adapter caseCalculateAgeAt(CalculateAgeAt object) {
				return createCalculateAgeAtAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseCaseItem(CaseItem object) {
				return createCaseItemAdapter();
			}
			@Override
			public Adapter caseCeiling(Ceiling object) {
				return createCeilingAdapter();
			}
			@Override
			public Adapter caseCoalesce(Coalesce object) {
				return createCoalesceAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseCodeSystemDef(CodeSystemDef object) {
				return createCodeSystemDefAdapter();
			}
			@Override
			public Adapter caseCodeSystemRef(CodeSystemRef object) {
				return createCodeSystemRefAdapter();
			}
			@Override
			public Adapter caseCollapse(Collapse object) {
				return createCollapseAdapter();
			}
			@Override
			public Adapter caseCombine(Combine object) {
				return createCombineAdapter();
			}
			@Override
			public Adapter caseConcatenate(Concatenate object) {
				return createConcatenateAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseContains(Contains object) {
				return createContainsAdapter();
			}
			@Override
			public Adapter caseConvert(Convert object) {
				return createConvertAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseCurrent(Current object) {
				return createCurrentAdapter();
			}
			@Override
			public Adapter caseDateFrom(DateFrom object) {
				return createDateFromAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseDateTimeComponentFrom(DateTimeComponentFrom object) {
				return createDateTimeComponentFromAdapter();
			}
			@Override
			public Adapter caseDefineClause(DefineClause object) {
				return createDefineClauseAdapter();
			}
			@Override
			public Adapter caseDifferenceBetween(DifferenceBetween object) {
				return createDifferenceBetweenAdapter();
			}
			@Override
			public Adapter caseDistinct(Distinct object) {
				return createDistinctAdapter();
			}
			@Override
			public Adapter caseDivide(Divide object) {
				return createDivideAdapter();
			}
			@Override
			public Adapter caseDurationBetween(DurationBetween object) {
				return createDurationBetweenAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseEnds(Ends object) {
				return createEndsAdapter();
			}
			@Override
			public Adapter caseEqual(Equal object) {
				return createEqualAdapter();
			}
			@Override
			public Adapter caseExcept(Except object) {
				return createExceptAdapter();
			}
			@Override
			public Adapter caseExists(Exists object) {
				return createExistsAdapter();
			}
			@Override
			public Adapter caseExpand(Expand object) {
				return createExpandAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionDef(ExpressionDef object) {
				return createExpressionDefAdapter();
			}
			@Override
			public Adapter caseExpressionRef(ExpressionRef object) {
				return createExpressionRefAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseFirst(First object) {
				return createFirstAdapter();
			}
			@Override
			public Adapter caseFloor(Floor object) {
				return createFloorAdapter();
			}
			@Override
			public Adapter caseForEach(ForEach object) {
				return createForEachAdapter();
			}
			@Override
			public Adapter caseFunctionDef(FunctionDef object) {
				return createFunctionDefAdapter();
			}
			@Override
			public Adapter caseFunctionRef(FunctionRef object) {
				return createFunctionRefAdapter();
			}
			@Override
			public Adapter caseGreater(Greater object) {
				return createGreaterAdapter();
			}
			@Override
			public Adapter caseGreaterOrEqual(GreaterOrEqual object) {
				return createGreaterOrEqualAdapter();
			}
			@Override
			public Adapter caseIdentifierRef(IdentifierRef object) {
				return createIdentifierRefAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseIn(In object) {
				return createInAdapter();
			}
			@Override
			public Adapter caseIncludedIn(IncludedIn object) {
				return createIncludedInAdapter();
			}
			@Override
			public Adapter caseIncludes(Includes object) {
				return createIncludesAdapter();
			}
			@Override
			public Adapter caseInCodeSystem(InCodeSystem object) {
				return createInCodeSystemAdapter();
			}
			@Override
			public Adapter caseIndexer(Indexer object) {
				return createIndexerAdapter();
			}
			@Override
			public Adapter caseIndexOf(IndexOf object) {
				return createIndexOfAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseInstanceElement(InstanceElement object) {
				return createInstanceElementAdapter();
			}
			@Override
			public Adapter caseIntersect(Intersect object) {
				return createIntersectAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseIntervalTypeSpecifier(IntervalTypeSpecifier object) {
				return createIntervalTypeSpecifierAdapter();
			}
			@Override
			public Adapter caseInValueSet(InValueSet object) {
				return createInValueSetAdapter();
			}
			@Override
			public Adapter caseIs(Is object) {
				return createIsAdapter();
			}
			@Override
			public Adapter caseIsFalse(IsFalse object) {
				return createIsFalseAdapter();
			}
			@Override
			public Adapter caseIsNull(IsNull object) {
				return createIsNullAdapter();
			}
			@Override
			public Adapter caseIsTrue(IsTrue object) {
				return createIsTrueAdapter();
			}
			@Override
			public Adapter caseLast(Last object) {
				return createLastAdapter();
			}
			@Override
			public Adapter caseLength(Length object) {
				return createLengthAdapter();
			}
			@Override
			public Adapter caseLess(Less object) {
				return createLessAdapter();
			}
			@Override
			public Adapter caseLessOrEqual(LessOrEqual object) {
				return createLessOrEqualAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseListTypeSpecifier(ListTypeSpecifier object) {
				return createListTypeSpecifierAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseLn(Ln object) {
				return createLnAdapter();
			}
			@Override
			public Adapter caseLog(Log object) {
				return createLogAdapter();
			}
			@Override
			public Adapter caseLower(Lower object) {
				return createLowerAdapter();
			}
			@Override
			public Adapter caseMatches(Matches object) {
				return createMatchesAdapter();
			}
			@Override
			public Adapter caseMax(Max object) {
				return createMaxAdapter();
			}
			@Override
			public Adapter caseMaxValue(MaxValue object) {
				return createMaxValueAdapter();
			}
			@Override
			public Adapter caseMedian(Median object) {
				return createMedianAdapter();
			}
			@Override
			public Adapter caseMeets(Meets object) {
				return createMeetsAdapter();
			}
			@Override
			public Adapter caseMeetsAfter(MeetsAfter object) {
				return createMeetsAfterAdapter();
			}
			@Override
			public Adapter caseMeetsBefore(MeetsBefore object) {
				return createMeetsBeforeAdapter();
			}
			@Override
			public Adapter caseMin(Min object) {
				return createMinAdapter();
			}
			@Override
			public Adapter caseMinValue(MinValue object) {
				return createMinValueAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter caseModulo(Modulo object) {
				return createModuloAdapter();
			}
			@Override
			public Adapter caseMultiply(Multiply object) {
				return createMultiplyAdapter();
			}
			@Override
			public Adapter caseNamedTypeSpecifier(NamedTypeSpecifier object) {
				return createNamedTypeSpecifierAdapter();
			}
			@Override
			public Adapter caseNaryExpression(NaryExpression object) {
				return createNaryExpressionAdapter();
			}
			@Override
			public Adapter caseNegate(Negate object) {
				return createNegateAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseNotEqual(NotEqual object) {
				return createNotEqualAdapter();
			}
			@Override
			public Adapter caseNow(Now object) {
				return createNowAdapter();
			}
			@Override
			public Adapter caseNull(Null object) {
				return createNullAdapter();
			}
			@Override
			public Adapter caseOperandDef(OperandDef object) {
				return createOperandDefAdapter();
			}
			@Override
			public Adapter caseOperandRef(OperandRef object) {
				return createOperandRefAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseOverlaps(Overlaps object) {
				return createOverlapsAdapter();
			}
			@Override
			public Adapter caseOverlapsAfter(OverlapsAfter object) {
				return createOverlapsAfterAdapter();
			}
			@Override
			public Adapter caseOverlapsBefore(OverlapsBefore object) {
				return createOverlapsBeforeAdapter();
			}
			@Override
			public Adapter caseParameterDef(ParameterDef object) {
				return createParameterDefAdapter();
			}
			@Override
			public Adapter caseParameterRef(ParameterRef object) {
				return createParameterRefAdapter();
			}
			@Override
			public Adapter casePopulationStdDev(PopulationStdDev object) {
				return createPopulationStdDevAdapter();
			}
			@Override
			public Adapter casePopulationVariance(PopulationVariance object) {
				return createPopulationVarianceAdapter();
			}
			@Override
			public Adapter casePositionOf(PositionOf object) {
				return createPositionOfAdapter();
			}
			@Override
			public Adapter casePower(Power object) {
				return createPowerAdapter();
			}
			@Override
			public Adapter casePredecessor(Predecessor object) {
				return createPredecessorAdapter();
			}
			@Override
			public Adapter caseProperContains(ProperContains object) {
				return createProperContainsAdapter();
			}
			@Override
			public Adapter caseProperIn(ProperIn object) {
				return createProperInAdapter();
			}
			@Override
			public Adapter caseProperIncludedIn(ProperIncludedIn object) {
				return createProperIncludedInAdapter();
			}
			@Override
			public Adapter caseProperIncludes(ProperIncludes object) {
				return createProperIncludesAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseQueryDefineRef(QueryDefineRef object) {
				return createQueryDefineRefAdapter();
			}
			@Override
			public Adapter caseRelationshipClause(RelationshipClause object) {
				return createRelationshipClauseAdapter();
			}
			@Override
			public Adapter caseRetrieve(Retrieve object) {
				return createRetrieveAdapter();
			}
			@Override
			public Adapter caseReturnClause(ReturnClause object) {
				return createReturnClauseAdapter();
			}
			@Override
			public Adapter caseRound(Round object) {
				return createRoundAdapter();
			}
			@Override
			public Adapter caseSameAs(SameAs object) {
				return createSameAsAdapter();
			}
			@Override
			public Adapter caseSameOrAfter(SameOrAfter object) {
				return createSameOrAfterAdapter();
			}
			@Override
			public Adapter caseSameOrBefore(SameOrBefore object) {
				return createSameOrBeforeAdapter();
			}
			@Override
			public Adapter caseSingletonFrom(SingletonFrom object) {
				return createSingletonFromAdapter();
			}
			@Override
			public Adapter caseSort(Sort object) {
				return createSortAdapter();
			}
			@Override
			public Adapter caseSortByItem(SortByItem object) {
				return createSortByItemAdapter();
			}
			@Override
			public Adapter caseSortClause(SortClause object) {
				return createSortClauseAdapter();
			}
			@Override
			public Adapter caseSplit(Split object) {
				return createSplitAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseStarts(Starts object) {
				return createStartsAdapter();
			}
			@Override
			public Adapter caseStdDev(StdDev object) {
				return createStdDevAdapter();
			}
			@Override
			public Adapter caseSubstring(Substring object) {
				return createSubstringAdapter();
			}
			@Override
			public Adapter caseSubtract(Subtract object) {
				return createSubtractAdapter();
			}
			@Override
			public Adapter caseSuccessor(Successor object) {
				return createSuccessorAdapter();
			}
			@Override
			public Adapter caseSum(Sum object) {
				return createSumAdapter();
			}
			@Override
			public Adapter caseTernaryExpression(TernaryExpression object) {
				return createTernaryExpressionAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseTimeFrom(TimeFrom object) {
				return createTimeFromAdapter();
			}
			@Override
			public Adapter caseTimeOfDay(TimeOfDay object) {
				return createTimeOfDayAdapter();
			}
			@Override
			public Adapter caseTimes(Times object) {
				return createTimesAdapter();
			}
			@Override
			public Adapter caseTimezoneFrom(TimezoneFrom object) {
				return createTimezoneFromAdapter();
			}
			@Override
			public Adapter caseToday(Today object) {
				return createTodayAdapter();
			}
			@Override
			public Adapter caseTruncate(Truncate object) {
				return createTruncateAdapter();
			}
			@Override
			public Adapter caseTruncatedDivide(TruncatedDivide object) {
				return createTruncatedDivideAdapter();
			}
			@Override
			public Adapter caseTuple(Tuple object) {
				return createTupleAdapter();
			}
			@Override
			public Adapter caseTupleElement(TupleElement object) {
				return createTupleElementAdapter();
			}
			@Override
			public Adapter caseTupleElementDefinition(TupleElementDefinition object) {
				return createTupleElementDefinitionAdapter();
			}
			@Override
			public Adapter caseTupleTypeSpecifier(TupleTypeSpecifier object) {
				return createTupleTypeSpecifierAdapter();
			}
			@Override
			public Adapter caseTypeSpecifier(TypeSpecifier object) {
				return createTypeSpecifierAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseUpper(Upper object) {
				return createUpperAdapter();
			}
			@Override
			public Adapter caseValueSetDef(ValueSetDef object) {
				return createValueSetDefAdapter();
			}
			@Override
			public Adapter caseValueSetRef(ValueSetRef object) {
				return createValueSetRefAdapter();
			}
			@Override
			public Adapter caseVariance(Variance object) {
				return createVarianceAdapter();
			}
			@Override
			public Adapter caseWidth(Width object) {
				return createWidthAdapter();
			}
			@Override
			public Adapter caseWith(With object) {
				return createWithAdapter();
			}
			@Override
			public Adapter caseWithout(Without object) {
				return createWithoutAdapter();
			}
			@Override
			public Adapter caseXor(Xor object) {
				return createXorAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Abs <em>Abs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Abs
	 * @generated
	 */
	public Adapter createAbsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.After
	 * @generated
	 */
	public Adapter createAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.AggregateExpression <em>Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.AggregateExpression
	 * @generated
	 */
	public Adapter createAggregateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.AliasedQuerySource <em>Aliased Query Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.AliasedQuerySource
	 * @generated
	 */
	public Adapter createAliasedQuerySourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.AliasRef <em>Alias Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.AliasRef
	 * @generated
	 */
	public Adapter createAliasRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.AllTrue <em>All True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.AllTrue
	 * @generated
	 */
	public Adapter createAllTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.AnyTrue <em>Any True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.AnyTrue
	 * @generated
	 */
	public Adapter createAnyTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.As <em>As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.As
	 * @generated
	 */
	public Adapter createAsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Avg <em>Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Avg
	 * @generated
	 */
	public Adapter createAvgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Before
	 * @generated
	 */
	public Adapter createBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ByColumn <em>By Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ByColumn
	 * @generated
	 */
	public Adapter createByColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ByDirection <em>By Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ByDirection
	 * @generated
	 */
	public Adapter createByDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ByExpression <em>By Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ByExpression
	 * @generated
	 */
	public Adapter createByExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.CalculateAge <em>Calculate Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.CalculateAge
	 * @generated
	 */
	public Adapter createCalculateAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.CalculateAgeAt <em>Calculate Age At</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.CalculateAgeAt
	 * @generated
	 */
	public Adapter createCalculateAgeAtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.CaseItem <em>Case Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.CaseItem
	 * @generated
	 */
	public Adapter createCaseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Ceiling <em>Ceiling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Ceiling
	 * @generated
	 */
	public Adapter createCeilingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Coalesce <em>Coalesce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Coalesce
	 * @generated
	 */
	public Adapter createCoalesceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.CodeSystemDef <em>Code System Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.CodeSystemDef
	 * @generated
	 */
	public Adapter createCodeSystemDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.CodeSystemRef <em>Code System Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.CodeSystemRef
	 * @generated
	 */
	public Adapter createCodeSystemRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Collapse <em>Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Collapse
	 * @generated
	 */
	public Adapter createCollapseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Combine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Combine
	 * @generated
	 */
	public Adapter createCombineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Concatenate <em>Concatenate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Concatenate
	 * @generated
	 */
	public Adapter createConcatenateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Contains
	 * @generated
	 */
	public Adapter createContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Convert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Convert
	 * @generated
	 */
	public Adapter createConvertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Current <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Current
	 * @generated
	 */
	public Adapter createCurrentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.DateFrom <em>Date From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.DateFrom
	 * @generated
	 */
	public Adapter createDateFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.DateTimeComponentFrom <em>Date Time Component From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.DateTimeComponentFrom
	 * @generated
	 */
	public Adapter createDateTimeComponentFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.DefineClause <em>Define Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.DefineClause
	 * @generated
	 */
	public Adapter createDefineClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.DifferenceBetween <em>Difference Between</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.DifferenceBetween
	 * @generated
	 */
	public Adapter createDifferenceBetweenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Distinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Distinct
	 * @generated
	 */
	public Adapter createDistinctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Divide
	 * @generated
	 */
	public Adapter createDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.DurationBetween <em>Duration Between</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.DurationBetween
	 * @generated
	 */
	public Adapter createDurationBetweenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Ends <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Ends
	 * @generated
	 */
	public Adapter createEndsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Except <em>Except</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Except
	 * @generated
	 */
	public Adapter createExceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Exists <em>Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Exists
	 * @generated
	 */
	public Adapter createExistsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Expand <em>Expand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Expand
	 * @generated
	 */
	public Adapter createExpandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ExpressionDef <em>Expression Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ExpressionDef
	 * @generated
	 */
	public Adapter createExpressionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ExpressionRef <em>Expression Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ExpressionRef
	 * @generated
	 */
	public Adapter createExpressionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.First <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.First
	 * @generated
	 */
	public Adapter createFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Floor
	 * @generated
	 */
	public Adapter createFloorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ForEach
	 * @generated
	 */
	public Adapter createForEachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.FunctionDef <em>Function Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.FunctionDef
	 * @generated
	 */
	public Adapter createFunctionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.FunctionRef <em>Function Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.FunctionRef
	 * @generated
	 */
	public Adapter createFunctionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.GreaterOrEqual <em>Greater Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.GreaterOrEqual
	 * @generated
	 */
	public Adapter createGreaterOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.IdentifierRef <em>Identifier Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.IdentifierRef
	 * @generated
	 */
	public Adapter createIdentifierRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.In
	 * @generated
	 */
	public Adapter createInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.IncludedIn <em>Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.IncludedIn
	 * @generated
	 */
	public Adapter createIncludedInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Includes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Includes
	 * @generated
	 */
	public Adapter createIncludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.InCodeSystem <em>In Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.InCodeSystem
	 * @generated
	 */
	public Adapter createInCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Indexer <em>Indexer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Indexer
	 * @generated
	 */
	public Adapter createIndexerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.IndexOf <em>Index Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.IndexOf
	 * @generated
	 */
	public Adapter createIndexOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.InstanceElement <em>Instance Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.InstanceElement
	 * @generated
	 */
	public Adapter createInstanceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Intersect <em>Intersect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Intersect
	 * @generated
	 */
	public Adapter createIntersectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.IntervalTypeSpecifier <em>Interval Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.IntervalTypeSpecifier
	 * @generated
	 */
	public Adapter createIntervalTypeSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.InValueSet <em>In Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.InValueSet
	 * @generated
	 */
	public Adapter createInValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Is <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Is
	 * @generated
	 */
	public Adapter createIsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.IsFalse <em>Is False</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.IsFalse
	 * @generated
	 */
	public Adapter createIsFalseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.IsNull <em>Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.IsNull
	 * @generated
	 */
	public Adapter createIsNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.IsTrue <em>Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.IsTrue
	 * @generated
	 */
	public Adapter createIsTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Last <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Last
	 * @generated
	 */
	public Adapter createLastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.LessOrEqual <em>Less Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.LessOrEqual
	 * @generated
	 */
	public Adapter createLessOrEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ListTypeSpecifier <em>List Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ListTypeSpecifier
	 * @generated
	 */
	public Adapter createListTypeSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Ln <em>Ln</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Ln
	 * @generated
	 */
	public Adapter createLnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Log
	 * @generated
	 */
	public Adapter createLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Lower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Lower
	 * @generated
	 */
	public Adapter createLowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Matches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Matches
	 * @generated
	 */
	public Adapter createMatchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Max
	 * @generated
	 */
	public Adapter createMaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.MaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.MaxValue
	 * @generated
	 */
	public Adapter createMaxValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Median <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Median
	 * @generated
	 */
	public Adapter createMedianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Meets <em>Meets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Meets
	 * @generated
	 */
	public Adapter createMeetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.MeetsAfter <em>Meets After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.MeetsAfter
	 * @generated
	 */
	public Adapter createMeetsAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.MeetsBefore <em>Meets Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.MeetsBefore
	 * @generated
	 */
	public Adapter createMeetsBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Min
	 * @generated
	 */
	public Adapter createMinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.MinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.MinValue
	 * @generated
	 */
	public Adapter createMinValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Modulo
	 * @generated
	 */
	public Adapter createModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Multiply
	 * @generated
	 */
	public Adapter createMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.NamedTypeSpecifier <em>Named Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.NamedTypeSpecifier
	 * @generated
	 */
	public Adapter createNamedTypeSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.NaryExpression <em>Nary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.NaryExpression
	 * @generated
	 */
	public Adapter createNaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Negate
	 * @generated
	 */
	public Adapter createNegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.NotEqual
	 * @generated
	 */
	public Adapter createNotEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Now <em>Now</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Now
	 * @generated
	 */
	public Adapter createNowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Null <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Null
	 * @generated
	 */
	public Adapter createNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.OperandDef <em>Operand Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.OperandDef
	 * @generated
	 */
	public Adapter createOperandDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.OperandRef <em>Operand Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.OperandRef
	 * @generated
	 */
	public Adapter createOperandRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Overlaps <em>Overlaps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Overlaps
	 * @generated
	 */
	public Adapter createOverlapsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.OverlapsAfter <em>Overlaps After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.OverlapsAfter
	 * @generated
	 */
	public Adapter createOverlapsAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.OverlapsBefore <em>Overlaps Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.OverlapsBefore
	 * @generated
	 */
	public Adapter createOverlapsBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ParameterDef
	 * @generated
	 */
	public Adapter createParameterDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ParameterRef
	 * @generated
	 */
	public Adapter createParameterRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.PopulationStdDev <em>Population Std Dev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.PopulationStdDev
	 * @generated
	 */
	public Adapter createPopulationStdDevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.PopulationVariance <em>Population Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.PopulationVariance
	 * @generated
	 */
	public Adapter createPopulationVarianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.PositionOf <em>Position Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.PositionOf
	 * @generated
	 */
	public Adapter createPositionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Power <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Power
	 * @generated
	 */
	public Adapter createPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Predecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Predecessor
	 * @generated
	 */
	public Adapter createPredecessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ProperContains <em>Proper Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ProperContains
	 * @generated
	 */
	public Adapter createProperContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ProperIn <em>Proper In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ProperIn
	 * @generated
	 */
	public Adapter createProperInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ProperIncludedIn <em>Proper Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ProperIncludedIn
	 * @generated
	 */
	public Adapter createProperIncludedInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ProperIncludes <em>Proper Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ProperIncludes
	 * @generated
	 */
	public Adapter createProperIncludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.QueryDefineRef <em>Query Define Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.QueryDefineRef
	 * @generated
	 */
	public Adapter createQueryDefineRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.RelationshipClause <em>Relationship Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.RelationshipClause
	 * @generated
	 */
	public Adapter createRelationshipClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Retrieve <em>Retrieve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Retrieve
	 * @generated
	 */
	public Adapter createRetrieveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ReturnClause <em>Return Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ReturnClause
	 * @generated
	 */
	public Adapter createReturnClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Round <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Round
	 * @generated
	 */
	public Adapter createRoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.SameAs <em>Same As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.SameAs
	 * @generated
	 */
	public Adapter createSameAsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.SameOrAfter <em>Same Or After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.SameOrAfter
	 * @generated
	 */
	public Adapter createSameOrAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.SameOrBefore <em>Same Or Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.SameOrBefore
	 * @generated
	 */
	public Adapter createSameOrBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.SingletonFrom <em>Singleton From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.SingletonFrom
	 * @generated
	 */
	public Adapter createSingletonFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Sort
	 * @generated
	 */
	public Adapter createSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.SortByItem <em>Sort By Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.SortByItem
	 * @generated
	 */
	public Adapter createSortByItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.SortClause <em>Sort Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.SortClause
	 * @generated
	 */
	public Adapter createSortClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Starts <em>Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Starts
	 * @generated
	 */
	public Adapter createStartsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.StdDev <em>Std Dev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.StdDev
	 * @generated
	 */
	public Adapter createStdDevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Substring <em>Substring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Substring
	 * @generated
	 */
	public Adapter createSubstringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Subtract
	 * @generated
	 */
	public Adapter createSubtractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Successor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Successor
	 * @generated
	 */
	public Adapter createSuccessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Sum
	 * @generated
	 */
	public Adapter createSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TernaryExpression <em>Ternary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TernaryExpression
	 * @generated
	 */
	public Adapter createTernaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TimeFrom <em>Time From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TimeFrom
	 * @generated
	 */
	public Adapter createTimeFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TimeOfDay
	 * @generated
	 */
	public Adapter createTimeOfDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Times <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Times
	 * @generated
	 */
	public Adapter createTimesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TimezoneFrom <em>Timezone From</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TimezoneFrom
	 * @generated
	 */
	public Adapter createTimezoneFromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Today <em>Today</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Today
	 * @generated
	 */
	public Adapter createTodayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Truncate <em>Truncate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Truncate
	 * @generated
	 */
	public Adapter createTruncateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TruncatedDivide <em>Truncated Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TruncatedDivide
	 * @generated
	 */
	public Adapter createTruncatedDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Tuple
	 * @generated
	 */
	public Adapter createTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TupleElement
	 * @generated
	 */
	public Adapter createTupleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TupleElementDefinition <em>Tuple Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TupleElementDefinition
	 * @generated
	 */
	public Adapter createTupleElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TupleTypeSpecifier <em>Tuple Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TupleTypeSpecifier
	 * @generated
	 */
	public Adapter createTupleTypeSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.TypeSpecifier <em>Type Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.TypeSpecifier
	 * @generated
	 */
	public Adapter createTypeSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Upper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Upper
	 * @generated
	 */
	public Adapter createUpperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ValueSetDef <em>Value Set Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ValueSetDef
	 * @generated
	 */
	public Adapter createValueSetDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.ValueSetRef <em>Value Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.ValueSetRef
	 * @generated
	 */
	public Adapter createValueSetRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Variance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Variance
	 * @generated
	 */
	public Adapter createVarianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Width <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Width
	 * @generated
	 */
	public Adapter createWidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.With <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.With
	 * @generated
	 */
	public Adapter createWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Without <em>Without</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Without
	 * @generated
	 */
	public Adapter createWithoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.elm.r1.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.elm.r1.Xor
	 * @generated
	 */
	public Adapter createXorAdapter() {
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

} //R1AdapterFactory
