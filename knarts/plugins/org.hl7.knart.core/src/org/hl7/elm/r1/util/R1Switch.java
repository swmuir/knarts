/**
 */
package org.hl7.elm.r1.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hl7.elm.r1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hl7.elm.r1.R1Package
 * @generated
 */
public class R1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static R1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1Switch() {
		if (modelPackage == null) {
			modelPackage = R1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case R1Package.ABS: {
				Abs abs = (Abs)theEObject;
				T result = caseAbs(abs);
				if (result == null) result = caseUnaryExpression(abs);
				if (result == null) result = caseExpression(abs);
				if (result == null) result = caseElement(abs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseBinaryExpression(add);
				if (result == null) result = caseExpression(add);
				if (result == null) result = caseElement(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.AFTER: {
				After after = (After)theEObject;
				T result = caseAfter(after);
				if (result == null) result = caseBinaryExpression(after);
				if (result == null) result = caseExpression(after);
				if (result == null) result = caseElement(after);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.AGGREGATE_EXPRESSION: {
				AggregateExpression aggregateExpression = (AggregateExpression)theEObject;
				T result = caseAggregateExpression(aggregateExpression);
				if (result == null) result = caseExpression(aggregateExpression);
				if (result == null) result = caseElement(aggregateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ALIASED_QUERY_SOURCE: {
				AliasedQuerySource aliasedQuerySource = (AliasedQuerySource)theEObject;
				T result = caseAliasedQuerySource(aliasedQuerySource);
				if (result == null) result = caseElement(aliasedQuerySource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ALIAS_REF: {
				AliasRef aliasRef = (AliasRef)theEObject;
				T result = caseAliasRef(aliasRef);
				if (result == null) result = caseExpression(aliasRef);
				if (result == null) result = caseElement(aliasRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ALL_TRUE: {
				AllTrue allTrue = (AllTrue)theEObject;
				T result = caseAllTrue(allTrue);
				if (result == null) result = caseAggregateExpression(allTrue);
				if (result == null) result = caseExpression(allTrue);
				if (result == null) result = caseElement(allTrue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBinaryExpression(and);
				if (result == null) result = caseExpression(and);
				if (result == null) result = caseElement(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ANY_TRUE: {
				AnyTrue anyTrue = (AnyTrue)theEObject;
				T result = caseAnyTrue(anyTrue);
				if (result == null) result = caseAggregateExpression(anyTrue);
				if (result == null) result = caseExpression(anyTrue);
				if (result == null) result = caseElement(anyTrue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.AS: {
				As as = (As)theEObject;
				T result = caseAs(as);
				if (result == null) result = caseUnaryExpression(as);
				if (result == null) result = caseExpression(as);
				if (result == null) result = caseElement(as);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.AVG: {
				Avg avg = (Avg)theEObject;
				T result = caseAvg(avg);
				if (result == null) result = caseAggregateExpression(avg);
				if (result == null) result = caseExpression(avg);
				if (result == null) result = caseElement(avg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.BEFORE: {
				Before before = (Before)theEObject;
				T result = caseBefore(before);
				if (result == null) result = caseBinaryExpression(before);
				if (result == null) result = caseExpression(before);
				if (result == null) result = caseElement(before);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseElement(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.BY_COLUMN: {
				ByColumn byColumn = (ByColumn)theEObject;
				T result = caseByColumn(byColumn);
				if (result == null) result = caseSortByItem(byColumn);
				if (result == null) result = caseElement(byColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.BY_DIRECTION: {
				ByDirection byDirection = (ByDirection)theEObject;
				T result = caseByDirection(byDirection);
				if (result == null) result = caseSortByItem(byDirection);
				if (result == null) result = caseElement(byDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.BY_EXPRESSION: {
				ByExpression byExpression = (ByExpression)theEObject;
				T result = caseByExpression(byExpression);
				if (result == null) result = caseSortByItem(byExpression);
				if (result == null) result = caseElement(byExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CALCULATE_AGE: {
				CalculateAge calculateAge = (CalculateAge)theEObject;
				T result = caseCalculateAge(calculateAge);
				if (result == null) result = caseUnaryExpression(calculateAge);
				if (result == null) result = caseExpression(calculateAge);
				if (result == null) result = caseElement(calculateAge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CALCULATE_AGE_AT: {
				CalculateAgeAt calculateAgeAt = (CalculateAgeAt)theEObject;
				T result = caseCalculateAgeAt(calculateAgeAt);
				if (result == null) result = caseBinaryExpression(calculateAgeAt);
				if (result == null) result = caseExpression(calculateAgeAt);
				if (result == null) result = caseElement(calculateAgeAt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = caseExpression(case_);
				if (result == null) result = caseElement(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CASE_ITEM: {
				CaseItem caseItem = (CaseItem)theEObject;
				T result = caseCaseItem(caseItem);
				if (result == null) result = caseElement(caseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CEILING: {
				Ceiling ceiling = (Ceiling)theEObject;
				T result = caseCeiling(ceiling);
				if (result == null) result = caseUnaryExpression(ceiling);
				if (result == null) result = caseExpression(ceiling);
				if (result == null) result = caseElement(ceiling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.COALESCE: {
				Coalesce coalesce = (Coalesce)theEObject;
				T result = caseCoalesce(coalesce);
				if (result == null) result = caseNaryExpression(coalesce);
				if (result == null) result = caseExpression(coalesce);
				if (result == null) result = caseElement(coalesce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseExpression(code);
				if (result == null) result = caseElement(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CODE_SYSTEM_DEF: {
				CodeSystemDef codeSystemDef = (CodeSystemDef)theEObject;
				T result = caseCodeSystemDef(codeSystemDef);
				if (result == null) result = caseElement(codeSystemDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CODE_SYSTEM_REF: {
				CodeSystemRef codeSystemRef = (CodeSystemRef)theEObject;
				T result = caseCodeSystemRef(codeSystemRef);
				if (result == null) result = caseExpression(codeSystemRef);
				if (result == null) result = caseElement(codeSystemRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.COLLAPSE: {
				Collapse collapse = (Collapse)theEObject;
				T result = caseCollapse(collapse);
				if (result == null) result = caseUnaryExpression(collapse);
				if (result == null) result = caseExpression(collapse);
				if (result == null) result = caseElement(collapse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.COMBINE: {
				Combine combine = (Combine)theEObject;
				T result = caseCombine(combine);
				if (result == null) result = caseExpression(combine);
				if (result == null) result = caseElement(combine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONCATENATE: {
				Concatenate concatenate = (Concatenate)theEObject;
				T result = caseConcatenate(concatenate);
				if (result == null) result = caseNaryExpression(concatenate);
				if (result == null) result = caseExpression(concatenate);
				if (result == null) result = caseElement(concatenate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseExpression(concept);
				if (result == null) result = caseElement(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONTAINS: {
				Contains contains = (Contains)theEObject;
				T result = caseContains(contains);
				if (result == null) result = caseBinaryExpression(contains);
				if (result == null) result = caseExpression(contains);
				if (result == null) result = caseElement(contains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CONVERT: {
				Convert convert = (Convert)theEObject;
				T result = caseConvert(convert);
				if (result == null) result = caseUnaryExpression(convert);
				if (result == null) result = caseExpression(convert);
				if (result == null) result = caseElement(convert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = caseAggregateExpression(count);
				if (result == null) result = caseExpression(count);
				if (result == null) result = caseElement(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.CURRENT: {
				Current current = (Current)theEObject;
				T result = caseCurrent(current);
				if (result == null) result = caseExpression(current);
				if (result == null) result = caseElement(current);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DATE_FROM: {
				DateFrom dateFrom = (DateFrom)theEObject;
				T result = caseDateFrom(dateFrom);
				if (result == null) result = caseUnaryExpression(dateFrom);
				if (result == null) result = caseExpression(dateFrom);
				if (result == null) result = caseElement(dateFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseExpression(dateTime);
				if (result == null) result = caseElement(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DATE_TIME_COMPONENT_FROM: {
				DateTimeComponentFrom dateTimeComponentFrom = (DateTimeComponentFrom)theEObject;
				T result = caseDateTimeComponentFrom(dateTimeComponentFrom);
				if (result == null) result = caseUnaryExpression(dateTimeComponentFrom);
				if (result == null) result = caseExpression(dateTimeComponentFrom);
				if (result == null) result = caseElement(dateTimeComponentFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DEFINE_CLAUSE: {
				DefineClause defineClause = (DefineClause)theEObject;
				T result = caseDefineClause(defineClause);
				if (result == null) result = caseElement(defineClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DIFFERENCE_BETWEEN: {
				DifferenceBetween differenceBetween = (DifferenceBetween)theEObject;
				T result = caseDifferenceBetween(differenceBetween);
				if (result == null) result = caseBinaryExpression(differenceBetween);
				if (result == null) result = caseExpression(differenceBetween);
				if (result == null) result = caseElement(differenceBetween);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DISTINCT: {
				Distinct distinct = (Distinct)theEObject;
				T result = caseDistinct(distinct);
				if (result == null) result = caseUnaryExpression(distinct);
				if (result == null) result = caseExpression(distinct);
				if (result == null) result = caseElement(distinct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DIVIDE: {
				Divide divide = (Divide)theEObject;
				T result = caseDivide(divide);
				if (result == null) result = caseBinaryExpression(divide);
				if (result == null) result = caseExpression(divide);
				if (result == null) result = caseElement(divide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.DURATION_BETWEEN: {
				DurationBetween durationBetween = (DurationBetween)theEObject;
				T result = caseDurationBetween(durationBetween);
				if (result == null) result = caseBinaryExpression(durationBetween);
				if (result == null) result = caseExpression(durationBetween);
				if (result == null) result = caseElement(durationBetween);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseUnaryExpression(end);
				if (result == null) result = caseExpression(end);
				if (result == null) result = caseElement(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ENDS: {
				Ends ends = (Ends)theEObject;
				T result = caseEnds(ends);
				if (result == null) result = caseBinaryExpression(ends);
				if (result == null) result = caseExpression(ends);
				if (result == null) result = caseElement(ends);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseBinaryExpression(equal);
				if (result == null) result = caseExpression(equal);
				if (result == null) result = caseElement(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXCEPT: {
				Except except = (Except)theEObject;
				T result = caseExcept(except);
				if (result == null) result = caseBinaryExpression(except);
				if (result == null) result = caseExpression(except);
				if (result == null) result = caseElement(except);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXISTS: {
				Exists exists = (Exists)theEObject;
				T result = caseExists(exists);
				if (result == null) result = caseUnaryExpression(exists);
				if (result == null) result = caseExpression(exists);
				if (result == null) result = caseElement(exists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXPAND: {
				Expand expand = (Expand)theEObject;
				T result = caseExpand(expand);
				if (result == null) result = caseUnaryExpression(expand);
				if (result == null) result = caseExpression(expand);
				if (result == null) result = caseElement(expand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXPRESSION_DEF: {
				ExpressionDef expressionDef = (ExpressionDef)theEObject;
				T result = caseExpressionDef(expressionDef);
				if (result == null) result = caseElement(expressionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.EXPRESSION_REF: {
				ExpressionRef expressionRef = (ExpressionRef)theEObject;
				T result = caseExpressionRef(expressionRef);
				if (result == null) result = caseExpression(expressionRef);
				if (result == null) result = caseElement(expressionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = caseExpression(filter);
				if (result == null) result = caseElement(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FIRST: {
				First first = (First)theEObject;
				T result = caseFirst(first);
				if (result == null) result = caseExpression(first);
				if (result == null) result = caseElement(first);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FLOOR: {
				Floor floor = (Floor)theEObject;
				T result = caseFloor(floor);
				if (result == null) result = caseUnaryExpression(floor);
				if (result == null) result = caseExpression(floor);
				if (result == null) result = caseElement(floor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FOR_EACH: {
				ForEach forEach = (ForEach)theEObject;
				T result = caseForEach(forEach);
				if (result == null) result = caseExpression(forEach);
				if (result == null) result = caseElement(forEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FUNCTION_DEF: {
				FunctionDef functionDef = (FunctionDef)theEObject;
				T result = caseFunctionDef(functionDef);
				if (result == null) result = caseExpressionDef(functionDef);
				if (result == null) result = caseElement(functionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.FUNCTION_REF: {
				FunctionRef functionRef = (FunctionRef)theEObject;
				T result = caseFunctionRef(functionRef);
				if (result == null) result = caseExpressionRef(functionRef);
				if (result == null) result = caseExpression(functionRef);
				if (result == null) result = caseElement(functionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.GREATER: {
				Greater greater = (Greater)theEObject;
				T result = caseGreater(greater);
				if (result == null) result = caseBinaryExpression(greater);
				if (result == null) result = caseExpression(greater);
				if (result == null) result = caseElement(greater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.GREATER_OR_EQUAL: {
				GreaterOrEqual greaterOrEqual = (GreaterOrEqual)theEObject;
				T result = caseGreaterOrEqual(greaterOrEqual);
				if (result == null) result = caseBinaryExpression(greaterOrEqual);
				if (result == null) result = caseExpression(greaterOrEqual);
				if (result == null) result = caseElement(greaterOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IDENTIFIER_REF: {
				IdentifierRef identifierRef = (IdentifierRef)theEObject;
				T result = caseIdentifierRef(identifierRef);
				if (result == null) result = caseExpression(identifierRef);
				if (result == null) result = caseElement(identifierRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseExpression(if_);
				if (result == null) result = caseElement(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IN: {
				In in = (In)theEObject;
				T result = caseIn(in);
				if (result == null) result = caseBinaryExpression(in);
				if (result == null) result = caseExpression(in);
				if (result == null) result = caseElement(in);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INCLUDED_IN: {
				IncludedIn includedIn = (IncludedIn)theEObject;
				T result = caseIncludedIn(includedIn);
				if (result == null) result = caseBinaryExpression(includedIn);
				if (result == null) result = caseExpression(includedIn);
				if (result == null) result = caseElement(includedIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INCLUDES: {
				Includes includes = (Includes)theEObject;
				T result = caseIncludes(includes);
				if (result == null) result = caseBinaryExpression(includes);
				if (result == null) result = caseExpression(includes);
				if (result == null) result = caseElement(includes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IN_CODE_SYSTEM: {
				InCodeSystem inCodeSystem = (InCodeSystem)theEObject;
				T result = caseInCodeSystem(inCodeSystem);
				if (result == null) result = caseExpression(inCodeSystem);
				if (result == null) result = caseElement(inCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INDEXER: {
				Indexer indexer = (Indexer)theEObject;
				T result = caseIndexer(indexer);
				if (result == null) result = caseBinaryExpression(indexer);
				if (result == null) result = caseExpression(indexer);
				if (result == null) result = caseElement(indexer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INDEX_OF: {
				IndexOf indexOf = (IndexOf)theEObject;
				T result = caseIndexOf(indexOf);
				if (result == null) result = caseExpression(indexOf);
				if (result == null) result = caseElement(indexOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseExpression(instance);
				if (result == null) result = caseElement(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INSTANCE_ELEMENT: {
				InstanceElement instanceElement = (InstanceElement)theEObject;
				T result = caseInstanceElement(instanceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INTERSECT: {
				Intersect intersect = (Intersect)theEObject;
				T result = caseIntersect(intersect);
				if (result == null) result = caseBinaryExpression(intersect);
				if (result == null) result = caseExpression(intersect);
				if (result == null) result = caseElement(intersect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseExpression(interval);
				if (result == null) result = caseElement(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.INTERVAL_TYPE_SPECIFIER: {
				IntervalTypeSpecifier intervalTypeSpecifier = (IntervalTypeSpecifier)theEObject;
				T result = caseIntervalTypeSpecifier(intervalTypeSpecifier);
				if (result == null) result = caseTypeSpecifier(intervalTypeSpecifier);
				if (result == null) result = caseElement(intervalTypeSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IN_VALUE_SET: {
				InValueSet inValueSet = (InValueSet)theEObject;
				T result = caseInValueSet(inValueSet);
				if (result == null) result = caseExpression(inValueSet);
				if (result == null) result = caseElement(inValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IS: {
				Is is = (Is)theEObject;
				T result = caseIs(is);
				if (result == null) result = caseUnaryExpression(is);
				if (result == null) result = caseExpression(is);
				if (result == null) result = caseElement(is);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IS_FALSE: {
				IsFalse isFalse = (IsFalse)theEObject;
				T result = caseIsFalse(isFalse);
				if (result == null) result = caseUnaryExpression(isFalse);
				if (result == null) result = caseExpression(isFalse);
				if (result == null) result = caseElement(isFalse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IS_NULL: {
				IsNull isNull = (IsNull)theEObject;
				T result = caseIsNull(isNull);
				if (result == null) result = caseUnaryExpression(isNull);
				if (result == null) result = caseExpression(isNull);
				if (result == null) result = caseElement(isNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.IS_TRUE: {
				IsTrue isTrue = (IsTrue)theEObject;
				T result = caseIsTrue(isTrue);
				if (result == null) result = caseUnaryExpression(isTrue);
				if (result == null) result = caseExpression(isTrue);
				if (result == null) result = caseElement(isTrue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LAST: {
				Last last = (Last)theEObject;
				T result = caseLast(last);
				if (result == null) result = caseExpression(last);
				if (result == null) result = caseElement(last);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LENGTH: {
				Length length = (Length)theEObject;
				T result = caseLength(length);
				if (result == null) result = caseUnaryExpression(length);
				if (result == null) result = caseExpression(length);
				if (result == null) result = caseElement(length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LESS: {
				Less less = (Less)theEObject;
				T result = caseLess(less);
				if (result == null) result = caseBinaryExpression(less);
				if (result == null) result = caseExpression(less);
				if (result == null) result = caseElement(less);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LESS_OR_EQUAL: {
				LessOrEqual lessOrEqual = (LessOrEqual)theEObject;
				T result = caseLessOrEqual(lessOrEqual);
				if (result == null) result = caseBinaryExpression(lessOrEqual);
				if (result == null) result = caseExpression(lessOrEqual);
				if (result == null) result = caseElement(lessOrEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseExpression(list);
				if (result == null) result = caseElement(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LIST_TYPE_SPECIFIER: {
				ListTypeSpecifier listTypeSpecifier = (ListTypeSpecifier)theEObject;
				T result = caseListTypeSpecifier(listTypeSpecifier);
				if (result == null) result = caseTypeSpecifier(listTypeSpecifier);
				if (result == null) result = caseElement(listTypeSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = caseElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LN: {
				Ln ln = (Ln)theEObject;
				T result = caseLn(ln);
				if (result == null) result = caseUnaryExpression(ln);
				if (result == null) result = caseExpression(ln);
				if (result == null) result = caseElement(ln);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LOG: {
				Log log = (Log)theEObject;
				T result = caseLog(log);
				if (result == null) result = caseBinaryExpression(log);
				if (result == null) result = caseExpression(log);
				if (result == null) result = caseElement(log);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.LOWER: {
				Lower lower = (Lower)theEObject;
				T result = caseLower(lower);
				if (result == null) result = caseUnaryExpression(lower);
				if (result == null) result = caseExpression(lower);
				if (result == null) result = caseElement(lower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MATCHES: {
				Matches matches = (Matches)theEObject;
				T result = caseMatches(matches);
				if (result == null) result = caseBinaryExpression(matches);
				if (result == null) result = caseExpression(matches);
				if (result == null) result = caseElement(matches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MAX: {
				Max max = (Max)theEObject;
				T result = caseMax(max);
				if (result == null) result = caseAggregateExpression(max);
				if (result == null) result = caseExpression(max);
				if (result == null) result = caseElement(max);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MAX_VALUE: {
				MaxValue maxValue = (MaxValue)theEObject;
				T result = caseMaxValue(maxValue);
				if (result == null) result = caseExpression(maxValue);
				if (result == null) result = caseElement(maxValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MEDIAN: {
				Median median = (Median)theEObject;
				T result = caseMedian(median);
				if (result == null) result = caseAggregateExpression(median);
				if (result == null) result = caseExpression(median);
				if (result == null) result = caseElement(median);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MEETS: {
				Meets meets = (Meets)theEObject;
				T result = caseMeets(meets);
				if (result == null) result = caseBinaryExpression(meets);
				if (result == null) result = caseExpression(meets);
				if (result == null) result = caseElement(meets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MEETS_AFTER: {
				MeetsAfter meetsAfter = (MeetsAfter)theEObject;
				T result = caseMeetsAfter(meetsAfter);
				if (result == null) result = caseBinaryExpression(meetsAfter);
				if (result == null) result = caseExpression(meetsAfter);
				if (result == null) result = caseElement(meetsAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MEETS_BEFORE: {
				MeetsBefore meetsBefore = (MeetsBefore)theEObject;
				T result = caseMeetsBefore(meetsBefore);
				if (result == null) result = caseBinaryExpression(meetsBefore);
				if (result == null) result = caseExpression(meetsBefore);
				if (result == null) result = caseElement(meetsBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MIN: {
				Min min = (Min)theEObject;
				T result = caseMin(min);
				if (result == null) result = caseAggregateExpression(min);
				if (result == null) result = caseExpression(min);
				if (result == null) result = caseElement(min);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MIN_VALUE: {
				MinValue minValue = (MinValue)theEObject;
				T result = caseMinValue(minValue);
				if (result == null) result = caseExpression(minValue);
				if (result == null) result = caseElement(minValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MODE: {
				Mode mode = (Mode)theEObject;
				T result = caseMode(mode);
				if (result == null) result = caseAggregateExpression(mode);
				if (result == null) result = caseExpression(mode);
				if (result == null) result = caseElement(mode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MODULO: {
				Modulo modulo = (Modulo)theEObject;
				T result = caseModulo(modulo);
				if (result == null) result = caseBinaryExpression(modulo);
				if (result == null) result = caseExpression(modulo);
				if (result == null) result = caseElement(modulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.MULTIPLY: {
				Multiply multiply = (Multiply)theEObject;
				T result = caseMultiply(multiply);
				if (result == null) result = caseBinaryExpression(multiply);
				if (result == null) result = caseExpression(multiply);
				if (result == null) result = caseElement(multiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.NAMED_TYPE_SPECIFIER: {
				NamedTypeSpecifier namedTypeSpecifier = (NamedTypeSpecifier)theEObject;
				T result = caseNamedTypeSpecifier(namedTypeSpecifier);
				if (result == null) result = caseTypeSpecifier(namedTypeSpecifier);
				if (result == null) result = caseElement(namedTypeSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.NARY_EXPRESSION: {
				NaryExpression naryExpression = (NaryExpression)theEObject;
				T result = caseNaryExpression(naryExpression);
				if (result == null) result = caseExpression(naryExpression);
				if (result == null) result = caseElement(naryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.NEGATE: {
				Negate negate = (Negate)theEObject;
				T result = caseNegate(negate);
				if (result == null) result = caseUnaryExpression(negate);
				if (result == null) result = caseExpression(negate);
				if (result == null) result = caseElement(negate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseUnaryExpression(not);
				if (result == null) result = caseExpression(not);
				if (result == null) result = caseElement(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.NOT_EQUAL: {
				NotEqual notEqual = (NotEqual)theEObject;
				T result = caseNotEqual(notEqual);
				if (result == null) result = caseBinaryExpression(notEqual);
				if (result == null) result = caseExpression(notEqual);
				if (result == null) result = caseElement(notEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.NOW: {
				Now now = (Now)theEObject;
				T result = caseNow(now);
				if (result == null) result = caseExpression(now);
				if (result == null) result = caseElement(now);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.NULL: {
				Null null_ = (Null)theEObject;
				T result = caseNull(null_);
				if (result == null) result = caseExpression(null_);
				if (result == null) result = caseElement(null_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.OPERAND_DEF: {
				OperandDef operandDef = (OperandDef)theEObject;
				T result = caseOperandDef(operandDef);
				if (result == null) result = caseElement(operandDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.OPERAND_REF: {
				OperandRef operandRef = (OperandRef)theEObject;
				T result = caseOperandRef(operandRef);
				if (result == null) result = caseExpression(operandRef);
				if (result == null) result = caseElement(operandRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBinaryExpression(or);
				if (result == null) result = caseExpression(or);
				if (result == null) result = caseElement(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.OVERLAPS: {
				Overlaps overlaps = (Overlaps)theEObject;
				T result = caseOverlaps(overlaps);
				if (result == null) result = caseBinaryExpression(overlaps);
				if (result == null) result = caseExpression(overlaps);
				if (result == null) result = caseElement(overlaps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.OVERLAPS_AFTER: {
				OverlapsAfter overlapsAfter = (OverlapsAfter)theEObject;
				T result = caseOverlapsAfter(overlapsAfter);
				if (result == null) result = caseBinaryExpression(overlapsAfter);
				if (result == null) result = caseExpression(overlapsAfter);
				if (result == null) result = caseElement(overlapsAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.OVERLAPS_BEFORE: {
				OverlapsBefore overlapsBefore = (OverlapsBefore)theEObject;
				T result = caseOverlapsBefore(overlapsBefore);
				if (result == null) result = caseBinaryExpression(overlapsBefore);
				if (result == null) result = caseExpression(overlapsBefore);
				if (result == null) result = caseElement(overlapsBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PARAMETER_DEF: {
				ParameterDef parameterDef = (ParameterDef)theEObject;
				T result = caseParameterDef(parameterDef);
				if (result == null) result = caseElement(parameterDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PARAMETER_REF: {
				ParameterRef parameterRef = (ParameterRef)theEObject;
				T result = caseParameterRef(parameterRef);
				if (result == null) result = caseExpression(parameterRef);
				if (result == null) result = caseElement(parameterRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.POPULATION_STD_DEV: {
				PopulationStdDev populationStdDev = (PopulationStdDev)theEObject;
				T result = casePopulationStdDev(populationStdDev);
				if (result == null) result = caseAggregateExpression(populationStdDev);
				if (result == null) result = caseExpression(populationStdDev);
				if (result == null) result = caseElement(populationStdDev);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.POPULATION_VARIANCE: {
				PopulationVariance populationVariance = (PopulationVariance)theEObject;
				T result = casePopulationVariance(populationVariance);
				if (result == null) result = caseAggregateExpression(populationVariance);
				if (result == null) result = caseExpression(populationVariance);
				if (result == null) result = caseElement(populationVariance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.POSITION_OF: {
				PositionOf positionOf = (PositionOf)theEObject;
				T result = casePositionOf(positionOf);
				if (result == null) result = caseExpression(positionOf);
				if (result == null) result = caseElement(positionOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.POWER: {
				Power power = (Power)theEObject;
				T result = casePower(power);
				if (result == null) result = caseBinaryExpression(power);
				if (result == null) result = caseExpression(power);
				if (result == null) result = caseElement(power);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PREDECESSOR: {
				Predecessor predecessor = (Predecessor)theEObject;
				T result = casePredecessor(predecessor);
				if (result == null) result = caseUnaryExpression(predecessor);
				if (result == null) result = caseExpression(predecessor);
				if (result == null) result = caseElement(predecessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PROPER_CONTAINS: {
				ProperContains properContains = (ProperContains)theEObject;
				T result = caseProperContains(properContains);
				if (result == null) result = caseBinaryExpression(properContains);
				if (result == null) result = caseExpression(properContains);
				if (result == null) result = caseElement(properContains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PROPER_IN: {
				ProperIn properIn = (ProperIn)theEObject;
				T result = caseProperIn(properIn);
				if (result == null) result = caseBinaryExpression(properIn);
				if (result == null) result = caseExpression(properIn);
				if (result == null) result = caseElement(properIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PROPER_INCLUDED_IN: {
				ProperIncludedIn properIncludedIn = (ProperIncludedIn)theEObject;
				T result = caseProperIncludedIn(properIncludedIn);
				if (result == null) result = caseBinaryExpression(properIncludedIn);
				if (result == null) result = caseExpression(properIncludedIn);
				if (result == null) result = caseElement(properIncludedIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PROPER_INCLUDES: {
				ProperIncludes properIncludes = (ProperIncludes)theEObject;
				T result = caseProperIncludes(properIncludes);
				if (result == null) result = caseBinaryExpression(properIncludes);
				if (result == null) result = caseExpression(properIncludes);
				if (result == null) result = caseElement(properIncludes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseExpression(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseExpression(quantity);
				if (result == null) result = caseElement(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseExpression(query);
				if (result == null) result = caseElement(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.QUERY_DEFINE_REF: {
				QueryDefineRef queryDefineRef = (QueryDefineRef)theEObject;
				T result = caseQueryDefineRef(queryDefineRef);
				if (result == null) result = caseExpression(queryDefineRef);
				if (result == null) result = caseElement(queryDefineRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RELATIONSHIP_CLAUSE: {
				RelationshipClause relationshipClause = (RelationshipClause)theEObject;
				T result = caseRelationshipClause(relationshipClause);
				if (result == null) result = caseAliasedQuerySource(relationshipClause);
				if (result == null) result = caseElement(relationshipClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RETRIEVE: {
				Retrieve retrieve = (Retrieve)theEObject;
				T result = caseRetrieve(retrieve);
				if (result == null) result = caseExpression(retrieve);
				if (result == null) result = caseElement(retrieve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.RETURN_CLAUSE: {
				ReturnClause returnClause = (ReturnClause)theEObject;
				T result = caseReturnClause(returnClause);
				if (result == null) result = caseElement(returnClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.ROUND: {
				Round round = (Round)theEObject;
				T result = caseRound(round);
				if (result == null) result = caseExpression(round);
				if (result == null) result = caseElement(round);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SAME_AS: {
				SameAs sameAs = (SameAs)theEObject;
				T result = caseSameAs(sameAs);
				if (result == null) result = caseBinaryExpression(sameAs);
				if (result == null) result = caseExpression(sameAs);
				if (result == null) result = caseElement(sameAs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SAME_OR_AFTER: {
				SameOrAfter sameOrAfter = (SameOrAfter)theEObject;
				T result = caseSameOrAfter(sameOrAfter);
				if (result == null) result = caseBinaryExpression(sameOrAfter);
				if (result == null) result = caseExpression(sameOrAfter);
				if (result == null) result = caseElement(sameOrAfter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SAME_OR_BEFORE: {
				SameOrBefore sameOrBefore = (SameOrBefore)theEObject;
				T result = caseSameOrBefore(sameOrBefore);
				if (result == null) result = caseBinaryExpression(sameOrBefore);
				if (result == null) result = caseExpression(sameOrBefore);
				if (result == null) result = caseElement(sameOrBefore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SINGLETON_FROM: {
				SingletonFrom singletonFrom = (SingletonFrom)theEObject;
				T result = caseSingletonFrom(singletonFrom);
				if (result == null) result = caseUnaryExpression(singletonFrom);
				if (result == null) result = caseExpression(singletonFrom);
				if (result == null) result = caseElement(singletonFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SORT: {
				Sort sort = (Sort)theEObject;
				T result = caseSort(sort);
				if (result == null) result = caseExpression(sort);
				if (result == null) result = caseElement(sort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SORT_BY_ITEM: {
				SortByItem sortByItem = (SortByItem)theEObject;
				T result = caseSortByItem(sortByItem);
				if (result == null) result = caseElement(sortByItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SORT_CLAUSE: {
				SortClause sortClause = (SortClause)theEObject;
				T result = caseSortClause(sortClause);
				if (result == null) result = caseElement(sortClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SPLIT: {
				Split split = (Split)theEObject;
				T result = caseSplit(split);
				if (result == null) result = caseExpression(split);
				if (result == null) result = caseElement(split);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseUnaryExpression(start);
				if (result == null) result = caseExpression(start);
				if (result == null) result = caseElement(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.STARTS: {
				Starts starts = (Starts)theEObject;
				T result = caseStarts(starts);
				if (result == null) result = caseBinaryExpression(starts);
				if (result == null) result = caseExpression(starts);
				if (result == null) result = caseElement(starts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.STD_DEV: {
				StdDev stdDev = (StdDev)theEObject;
				T result = caseStdDev(stdDev);
				if (result == null) result = caseAggregateExpression(stdDev);
				if (result == null) result = caseExpression(stdDev);
				if (result == null) result = caseElement(stdDev);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SUBSTRING: {
				Substring substring = (Substring)theEObject;
				T result = caseSubstring(substring);
				if (result == null) result = caseExpression(substring);
				if (result == null) result = caseElement(substring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SUBTRACT: {
				Subtract subtract = (Subtract)theEObject;
				T result = caseSubtract(subtract);
				if (result == null) result = caseBinaryExpression(subtract);
				if (result == null) result = caseExpression(subtract);
				if (result == null) result = caseElement(subtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SUCCESSOR: {
				Successor successor = (Successor)theEObject;
				T result = caseSuccessor(successor);
				if (result == null) result = caseUnaryExpression(successor);
				if (result == null) result = caseExpression(successor);
				if (result == null) result = caseElement(successor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.SUM: {
				Sum sum = (Sum)theEObject;
				T result = caseSum(sum);
				if (result == null) result = caseAggregateExpression(sum);
				if (result == null) result = caseExpression(sum);
				if (result == null) result = caseElement(sum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TERNARY_EXPRESSION: {
				TernaryExpression ternaryExpression = (TernaryExpression)theEObject;
				T result = caseTernaryExpression(ternaryExpression);
				if (result == null) result = caseExpression(ternaryExpression);
				if (result == null) result = caseElement(ternaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseExpression(time);
				if (result == null) result = caseElement(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TIME_FROM: {
				TimeFrom timeFrom = (TimeFrom)theEObject;
				T result = caseTimeFrom(timeFrom);
				if (result == null) result = caseUnaryExpression(timeFrom);
				if (result == null) result = caseExpression(timeFrom);
				if (result == null) result = caseElement(timeFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TIME_OF_DAY: {
				TimeOfDay timeOfDay = (TimeOfDay)theEObject;
				T result = caseTimeOfDay(timeOfDay);
				if (result == null) result = caseExpression(timeOfDay);
				if (result == null) result = caseElement(timeOfDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TIMES: {
				Times times = (Times)theEObject;
				T result = caseTimes(times);
				if (result == null) result = caseBinaryExpression(times);
				if (result == null) result = caseExpression(times);
				if (result == null) result = caseElement(times);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TIMEZONE_FROM: {
				TimezoneFrom timezoneFrom = (TimezoneFrom)theEObject;
				T result = caseTimezoneFrom(timezoneFrom);
				if (result == null) result = caseUnaryExpression(timezoneFrom);
				if (result == null) result = caseExpression(timezoneFrom);
				if (result == null) result = caseElement(timezoneFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TODAY: {
				Today today = (Today)theEObject;
				T result = caseToday(today);
				if (result == null) result = caseExpression(today);
				if (result == null) result = caseElement(today);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TRUNCATE: {
				Truncate truncate = (Truncate)theEObject;
				T result = caseTruncate(truncate);
				if (result == null) result = caseUnaryExpression(truncate);
				if (result == null) result = caseExpression(truncate);
				if (result == null) result = caseElement(truncate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TRUNCATED_DIVIDE: {
				TruncatedDivide truncatedDivide = (TruncatedDivide)theEObject;
				T result = caseTruncatedDivide(truncatedDivide);
				if (result == null) result = caseBinaryExpression(truncatedDivide);
				if (result == null) result = caseExpression(truncatedDivide);
				if (result == null) result = caseElement(truncatedDivide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TUPLE: {
				Tuple tuple = (Tuple)theEObject;
				T result = caseTuple(tuple);
				if (result == null) result = caseExpression(tuple);
				if (result == null) result = caseElement(tuple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TUPLE_ELEMENT: {
				TupleElement tupleElement = (TupleElement)theEObject;
				T result = caseTupleElement(tupleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TUPLE_ELEMENT_DEFINITION: {
				TupleElementDefinition tupleElementDefinition = (TupleElementDefinition)theEObject;
				T result = caseTupleElementDefinition(tupleElementDefinition);
				if (result == null) result = caseElement(tupleElementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TUPLE_TYPE_SPECIFIER: {
				TupleTypeSpecifier tupleTypeSpecifier = (TupleTypeSpecifier)theEObject;
				T result = caseTupleTypeSpecifier(tupleTypeSpecifier);
				if (result == null) result = caseTypeSpecifier(tupleTypeSpecifier);
				if (result == null) result = caseElement(tupleTypeSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.TYPE_SPECIFIER: {
				TypeSpecifier typeSpecifier = (TypeSpecifier)theEObject;
				T result = caseTypeSpecifier(typeSpecifier);
				if (result == null) result = caseElement(typeSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseElement(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = caseBinaryExpression(union);
				if (result == null) result = caseExpression(union);
				if (result == null) result = caseElement(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.UPPER: {
				Upper upper = (Upper)theEObject;
				T result = caseUpper(upper);
				if (result == null) result = caseUnaryExpression(upper);
				if (result == null) result = caseExpression(upper);
				if (result == null) result = caseElement(upper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.VALUE_SET_DEF: {
				ValueSetDef valueSetDef = (ValueSetDef)theEObject;
				T result = caseValueSetDef(valueSetDef);
				if (result == null) result = caseElement(valueSetDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.VALUE_SET_REF: {
				ValueSetRef valueSetRef = (ValueSetRef)theEObject;
				T result = caseValueSetRef(valueSetRef);
				if (result == null) result = caseExpression(valueSetRef);
				if (result == null) result = caseElement(valueSetRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.VARIANCE: {
				Variance variance = (Variance)theEObject;
				T result = caseVariance(variance);
				if (result == null) result = caseAggregateExpression(variance);
				if (result == null) result = caseExpression(variance);
				if (result == null) result = caseElement(variance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.WIDTH: {
				Width width = (Width)theEObject;
				T result = caseWidth(width);
				if (result == null) result = caseUnaryExpression(width);
				if (result == null) result = caseExpression(width);
				if (result == null) result = caseElement(width);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.WITH: {
				With with = (With)theEObject;
				T result = caseWith(with);
				if (result == null) result = caseRelationshipClause(with);
				if (result == null) result = caseAliasedQuerySource(with);
				if (result == null) result = caseElement(with);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.WITHOUT: {
				Without without = (Without)theEObject;
				T result = caseWithout(without);
				if (result == null) result = caseRelationshipClause(without);
				if (result == null) result = caseAliasedQuerySource(without);
				if (result == null) result = caseElement(without);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case R1Package.XOR: {
				Xor xor = (Xor)theEObject;
				T result = caseXor(xor);
				if (result == null) result = caseBinaryExpression(xor);
				if (result == null) result = caseExpression(xor);
				if (result == null) result = caseElement(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbs(Abs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfter(After object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateExpression(AggregateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aliased Query Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aliased Query Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasedQuerySource(AliasedQuerySource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasRef(AliasRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllTrue(AllTrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyTrue(AnyTrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>As</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>As</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAs(As object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvg(Avg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBefore(Before object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByColumn(ByColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByDirection(ByDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByExpression(ByExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculate Age</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculate Age</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateAge(CalculateAge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculate Age At</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculate Age At</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculateAgeAt(CalculateAgeAt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseItem(CaseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ceiling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ceiling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeiling(Ceiling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coalesce</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coalesce</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoalesce(Coalesce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemDef(CodeSystemDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemRef(CodeSystemRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collapse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collapse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollapse(Collapse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombine(Combine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenate(Concatenate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvert(Convert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrent(Current object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateFrom(DateFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Component From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Component From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeComponentFrom(DateTimeComponentFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Define Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Define Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefineClause(DefineClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difference Between</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difference Between</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferenceBetween(DifferenceBetween object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distinct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distinct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistinct(Distinct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Between</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Between</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationBetween(DurationBetween object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ends</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ends</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnds(Ends object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Except</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Except</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcept(Except object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExists(Exists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpand(Expand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionDef(ExpressionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionRef(ExpressionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirst(First object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloor(Floor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEach(ForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDef(FunctionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionRef(FunctionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterOrEqual(GreaterOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierRef(IdentifierRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIn(In object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedIn(IncludedIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Includes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Includes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludes(Includes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInCodeSystem(InCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexer(Indexer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexOf(IndexOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceElement(InstanceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intersect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intersect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntersect(Intersect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Type Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalTypeSpecifier(IntervalTypeSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInValueSet(InValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIs(Is object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is False</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is False</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsFalse(IsFalse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsNull(IsNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsTrue(IsTrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLast(Last object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Or Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOrEqual(LessOrEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListTypeSpecifier(ListTypeSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ln</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ln</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLn(Ln object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLog(Log object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLower(Lower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatches(Matches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax(Max object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxValue(MaxValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Median</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Median</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedian(Median object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeets(Meets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meets After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meets After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeetsAfter(MeetsAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meets Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meets Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeetsBefore(MeetsBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMin(Min object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinValue(MinValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulo(Modulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedTypeSpecifier(NamedTypeSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaryExpression(NaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegate(Negate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqual(NotEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Now</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Now</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNow(Now object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNull(Null object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperandDef(OperandDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperandRef(OperandRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlaps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlaps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlaps(Overlaps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlaps After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlaps After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlapsAfter(OverlapsAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlaps Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlaps Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlapsBefore(OverlapsBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDef(ParameterDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterRef(ParameterRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population Std Dev</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population Std Dev</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulationStdDev(PopulationStdDev object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population Variance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population Variance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulationVariance(PopulationVariance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionOf(PositionOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePower(Power object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predecessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predecessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredecessor(Predecessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proper Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proper Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperContains(ProperContains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proper In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proper In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperIn(ProperIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proper Included In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proper Included In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperIncludedIn(ProperIncludedIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proper Includes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proper Includes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperIncludes(ProperIncludes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Define Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Define Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDefineRef(QueryDefineRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipClause(RelationshipClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retrieve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retrieve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetrieve(Retrieve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnClause(ReturnClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRound(Round object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same As</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same As</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameAs(SameAs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same Or After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same Or After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameOrAfter(SameOrAfter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Same Or Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Same Or Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSameOrBefore(SameOrBefore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonFrom(SingletonFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort By Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort By Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortByItem(SortByItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortClause(SortClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Starts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Starts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStarts(Starts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Std Dev</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Std Dev</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStdDev(StdDev object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstring(Substring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtract(Subtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Successor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Successor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessor(Successor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSum(Sum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ternary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ternary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTernaryExpression(TernaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeFrom(TimeFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Of Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOfDay(TimeOfDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimes(Times object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timezone From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timezone From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimezoneFrom(TimezoneFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Today</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Today</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToday(Today object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truncate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truncate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruncate(Truncate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truncated Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truncated Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruncatedDivide(TruncatedDivide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuple(Tuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleElement(TupleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleElementDefinition(TupleElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleTypeSpecifier(TupleTypeSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpecifier(TypeSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpper(Upper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDef(ValueSetDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetRef(ValueSetRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariance(Variance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Width</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Width</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidth(Width object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWith(With object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Without</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Without</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithout(Without object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXor(Xor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //R1Switch
