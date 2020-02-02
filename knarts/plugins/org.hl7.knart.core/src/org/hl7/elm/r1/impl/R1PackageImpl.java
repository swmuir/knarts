/**
 */
package org.hl7.elm.r1.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.hl7.cdsdt.r2.R2Package;

import org.hl7.cdsdt.r2.impl.R2PackageImpl;

import org.hl7.elm.r1.R1Factory;
import org.hl7.elm.r1.R1Package;

import org.w3._1999.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class R1PackageImpl extends EPackageImpl implements R1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "r1.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasedQuerySourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allTrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyTrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateAgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateAgeAtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coalesceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collapseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatenateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeComponentFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defineClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differenceBetweenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distinctEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationBetweenEClass = null;

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
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inCodeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalTypeSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isFalseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetsAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetsBeforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlapsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlapsAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlapsBeforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationStdDevEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationVarianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predecessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass properContainsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass properInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass properIncludedInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass properIncludesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDefineRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retrieveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameAsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameOrAfterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sameOrBeforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortByItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stdDevEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ternaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOfDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timezoneFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass todayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass truncateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass truncatedDivideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleElementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleTypeSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSpecifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateTimePrecisionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessModifierObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimePrecisionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sortDirectionObjectEDataType = null;

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
	 * @see org.hl7.elm.r1.R1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private R1PackageImpl() {
		super(eNS_URI, R1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link R1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static R1Package init() {
		if (isInited) return (R1Package)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI);

		// Obtain or create and register package
		R1PackageImpl theR1Package = (R1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof R1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new R1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XhtmlPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		org.hl7.knowledgeartifact.r1.impl.R1PackageImpl theR1Package_1 = (org.hl7.knowledgeartifact.r1.impl.R1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.hl7.knowledgeartifact.r1.R1Package.eNS_URI) instanceof org.hl7.knowledgeartifact.r1.impl.R1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.hl7.knowledgeartifact.r1.R1Package.eNS_URI) : org.hl7.knowledgeartifact.r1.R1Package.eINSTANCE);
		R2PackageImpl theR2Package = (R2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI) instanceof R2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(R2Package.eNS_URI) : R2Package.eINSTANCE);

		// Load packages
		theR1Package.loadPackage();

		// Create package meta-data objects
		theR1Package_1.createPackageContents();
		theR2Package.createPackageContents();

		// Initialize created meta-data
		theR1Package_1.initializePackageContents();
		theR2Package.initializePackageContents();

		// Fix loaded packages
		theR1Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theR1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(R1Package.eNS_URI, theR1Package);
		return theR1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbs() {
		if (absEClass == null) {
			absEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(0);
		}
		return absEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		if (addEClass == null) {
			addEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(3);
		}
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfter() {
		if (afterEClass == null) {
			afterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(4);
		}
		return afterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAfter_Precision() {
        return (EAttribute)getAfter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateExpression() {
		if (aggregateExpressionEClass == null) {
			aggregateExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(5);
		}
		return aggregateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateExpression_Source() {
        return (EReference)getAggregateExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateExpression_Path() {
        return (EAttribute)getAggregateExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasedQuerySource() {
		if (aliasedQuerySourceEClass == null) {
			aliasedQuerySourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(6);
		}
		return aliasedQuerySourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasedQuerySource_Expression() {
        return (EReference)getAliasedQuerySource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasedQuerySource_Alias() {
        return (EAttribute)getAliasedQuerySource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasRef() {
		if (aliasRefEClass == null) {
			aliasRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(7);
		}
		return aliasRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasRef_Name() {
        return (EAttribute)getAliasRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllTrue() {
		if (allTrueEClass == null) {
			allTrueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(8);
		}
		return allTrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		if (andEClass == null) {
			andEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(9);
		}
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyTrue() {
		if (anyTrueEClass == null) {
			anyTrueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(10);
		}
		return anyTrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAs() {
		if (asEClass == null) {
			asEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(11);
		}
		return asEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAs_AsTypeSpecifier() {
        return (EReference)getAs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs_AsType() {
        return (EAttribute)getAs().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAs_Strict() {
        return (EAttribute)getAs().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvg() {
		if (avgEClass == null) {
			avgEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(12);
		}
		return avgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBefore() {
		if (beforeEClass == null) {
			beforeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(13);
		}
		return beforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBefore_Precision() {
        return (EAttribute)getBefore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		if (binaryExpressionEClass == null) {
			binaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(14);
		}
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Operand() {
        return (EReference)getBinaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByColumn() {
		if (byColumnEClass == null) {
			byColumnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(15);
		}
		return byColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByColumn_Path() {
        return (EAttribute)getByColumn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByDirection() {
		if (byDirectionEClass == null) {
			byDirectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(16);
		}
		return byDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByExpression() {
		if (byExpressionEClass == null) {
			byExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(17);
		}
		return byExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getByExpression_Expression() {
        return (EReference)getByExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateAge() {
		if (calculateAgeEClass == null) {
			calculateAgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(18);
		}
		return calculateAgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculateAge_Precision() {
        return (EAttribute)getCalculateAge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateAgeAt() {
		if (calculateAgeAtEClass == null) {
			calculateAgeAtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(19);
		}
		return calculateAgeAtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculateAgeAt_Precision() {
        return (EAttribute)getCalculateAgeAt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		if (caseEClass == null) {
			caseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(20);
		}
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Comparand() {
        return (EReference)getCase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_CaseItem() {
        return (EReference)getCase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Else() {
        return (EReference)getCase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseItem() {
		if (caseItemEClass == null) {
			caseItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(21);
		}
		return caseItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseItem_When() {
        return (EReference)getCaseItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseItem_Then() {
        return (EReference)getCaseItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeiling() {
		if (ceilingEClass == null) {
			ceilingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(22);
		}
		return ceilingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoalesce() {
		if (coalesceEClass == null) {
			coalesceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(23);
		}
		return coalesceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		if (codeEClass == null) {
			codeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(24);
		}
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCode_System() {
        return (EReference)getCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_Code() {
        return (EAttribute)getCode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_Display() {
        return (EAttribute)getCode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemDef() {
		if (codeSystemDefEClass == null) {
			codeSystemDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(25);
		}
		return codeSystemDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemDef_AccessLevel() {
        return (EAttribute)getCodeSystemDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemDef_Id() {
        return (EAttribute)getCodeSystemDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemDef_Name() {
        return (EAttribute)getCodeSystemDef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemDef_Version() {
        return (EAttribute)getCodeSystemDef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemRef() {
		if (codeSystemRefEClass == null) {
			codeSystemRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(26);
		}
		return codeSystemRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemRef_LibraryName() {
        return (EAttribute)getCodeSystemRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemRef_Name() {
        return (EAttribute)getCodeSystemRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollapse() {
		if (collapseEClass == null) {
			collapseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(27);
		}
		return collapseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombine() {
		if (combineEClass == null) {
			combineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(28);
		}
		return combineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombine_Source() {
        return (EReference)getCombine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombine_Separator() {
        return (EReference)getCombine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcatenate() {
		if (concatenateEClass == null) {
			concatenateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(29);
		}
		return concatenateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		if (conceptEClass == null) {
			conceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(30);
		}
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Code() {
        return (EReference)getConcept().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcept_Display() {
        return (EAttribute)getConcept().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContains() {
		if (containsEClass == null) {
			containsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(31);
		}
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContains_Precision() {
        return (EAttribute)getContains().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert() {
		if (convertEClass == null) {
			convertEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(32);
		}
		return convertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConvert_ToTypeSpecifier() {
        return (EReference)getConvert().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConvert_ToType() {
        return (EAttribute)getConvert().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCount() {
		if (countEClass == null) {
			countEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(33);
		}
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrent() {
		if (currentEClass == null) {
			currentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(34);
		}
		return currentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrent_Scope() {
        return (EAttribute)getCurrent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateFrom() {
		if (dateFromEClass == null) {
			dateFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(35);
		}
		return dateFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime() {
		if (dateTimeEClass == null) {
			dateTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(36);
		}
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_Year() {
        return (EReference)getDateTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_Month() {
        return (EReference)getDateTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_Day() {
        return (EReference)getDateTime().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_Hour() {
        return (EReference)getDateTime().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_Minute() {
        return (EReference)getDateTime().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_Second() {
        return (EReference)getDateTime().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_Millisecond() {
        return (EReference)getDateTime().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateTime_TimezoneOffset() {
        return (EReference)getDateTime().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeComponentFrom() {
		if (dateTimeComponentFromEClass == null) {
			dateTimeComponentFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(37);
		}
		return dateTimeComponentFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeComponentFrom_Precision() {
        return (EAttribute)getDateTimeComponentFrom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefineClause() {
		if (defineClauseEClass == null) {
			defineClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(40);
		}
		return defineClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefineClause_Expression() {
        return (EReference)getDefineClause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefineClause_Identifier() {
        return (EAttribute)getDefineClause().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDifferenceBetween() {
		if (differenceBetweenEClass == null) {
			differenceBetweenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(41);
		}
		return differenceBetweenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDifferenceBetween_Precision() {
        return (EAttribute)getDifferenceBetween().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistinct() {
		if (distinctEClass == null) {
			distinctEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(42);
		}
		return distinctEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivide() {
		if (divideEClass == null) {
			divideEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(43);
		}
		return divideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationBetween() {
		if (durationBetweenEClass == null) {
			durationBetweenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(44);
		}
		return durationBetweenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationBetween_Precision() {
        return (EAttribute)getDurationBetween().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		if (elementEClass == null) {
			elementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(45);
		}
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Annotation() {
        return (EReference)getElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_LocalId() {
        return (EAttribute)getElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		if (endEClass == null) {
			endEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(46);
		}
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnds() {
		if (endsEClass == null) {
			endsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(47);
		}
		return endsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnds_Precision() {
        return (EAttribute)getEnds().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		if (equalEClass == null) {
			equalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(48);
		}
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcept() {
		if (exceptEClass == null) {
			exceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(49);
		}
		return exceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExists() {
		if (existsEClass == null) {
			existsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(50);
		}
		return existsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpand() {
		if (expandEClass == null) {
			expandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(51);
		}
		return expandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		if (expressionEClass == null) {
			expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(52);
		}
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionDef() {
		if (expressionDefEClass == null) {
			expressionDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(53);
		}
		return expressionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionDef_Expression() {
        return (EReference)getExpressionDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionDef_AccessLevel() {
        return (EAttribute)getExpressionDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionDef_Context() {
        return (EAttribute)getExpressionDef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionDef_Name() {
        return (EAttribute)getExpressionDef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionRef() {
		if (expressionRefEClass == null) {
			expressionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(54);
		}
		return expressionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionRef_LibraryName() {
        return (EAttribute)getExpressionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionRef_Name() {
        return (EAttribute)getExpressionRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		if (filterEClass == null) {
			filterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(55);
		}
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Source() {
        return (EReference)getFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Condition() {
        return (EReference)getFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_Scope() {
        return (EAttribute)getFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirst() {
		if (firstEClass == null) {
			firstEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(56);
		}
		return firstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirst_Source() {
        return (EReference)getFirst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirst_OrderBy() {
        return (EAttribute)getFirst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloor() {
		if (floorEClass == null) {
			floorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(57);
		}
		return floorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEach() {
		if (forEachEClass == null) {
			forEachEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(58);
		}
		return forEachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEach_Source() {
        return (EReference)getForEach().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEach_Element() {
        return (EReference)getForEach().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEach_Scope() {
        return (EAttribute)getForEach().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDef() {
		if (functionDefEClass == null) {
			functionDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(59);
		}
		return functionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDef_Operand() {
        return (EReference)getFunctionDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionRef() {
		if (functionRefEClass == null) {
			functionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(60);
		}
		return functionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionRef_Operand() {
        return (EReference)getFunctionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreater() {
		if (greaterEClass == null) {
			greaterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(61);
		}
		return greaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterOrEqual() {
		if (greaterOrEqualEClass == null) {
			greaterOrEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(62);
		}
		return greaterOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierRef() {
		if (identifierRefEClass == null) {
			identifierRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(63);
		}
		return identifierRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierRef_LibraryName() {
        return (EAttribute)getIdentifierRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierRef_Name() {
        return (EAttribute)getIdentifierRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		if (ifEClass == null) {
			ifEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(64);
		}
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Condition() {
        return (EReference)getIf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Then() {
        return (EReference)getIf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Else() {
        return (EReference)getIf().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIn() {
		if (inEClass == null) {
			inEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(65);
		}
		return inEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIn_Precision() {
        return (EAttribute)getIn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedIn() {
		if (includedInEClass == null) {
			includedInEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(66);
		}
		return includedInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedIn_Precision() {
        return (EAttribute)getIncludedIn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludes() {
		if (includesEClass == null) {
			includesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(67);
		}
		return includesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludes_Precision() {
        return (EAttribute)getIncludes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInCodeSystem() {
		if (inCodeSystemEClass == null) {
			inCodeSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(68);
		}
		return inCodeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInCodeSystem_Code() {
        return (EReference)getInCodeSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInCodeSystem_Codesystem() {
        return (EReference)getInCodeSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexer() {
		if (indexerEClass == null) {
			indexerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(69);
		}
		return indexerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexOf() {
		if (indexOfEClass == null) {
			indexOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(70);
		}
		return indexOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexOf_Source() {
        return (EReference)getIndexOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexOf_Element() {
        return (EReference)getIndexOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		if (instanceEClass == null) {
			instanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(71);
		}
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Element() {
        return (EReference)getInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_ClassType() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceElement() {
		if (instanceElementEClass == null) {
			instanceElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(72);
		}
		return instanceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceElement_Value() {
        return (EReference)getInstanceElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceElement_Name() {
        return (EAttribute)getInstanceElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntersect() {
		if (intersectEClass == null) {
			intersectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(73);
		}
		return intersectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		if (intervalEClass == null) {
			intervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(74);
		}
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Low() {
        return (EReference)getInterval().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_LowClosedExpression() {
        return (EReference)getInterval().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_High() {
        return (EReference)getInterval().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_HighClosedExpression() {
        return (EReference)getInterval().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_HighClosed() {
        return (EAttribute)getInterval().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_LowClosed() {
        return (EAttribute)getInterval().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalTypeSpecifier() {
		if (intervalTypeSpecifierEClass == null) {
			intervalTypeSpecifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(75);
		}
		return intervalTypeSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervalTypeSpecifier_PointType() {
        return (EReference)getIntervalTypeSpecifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInValueSet() {
		if (inValueSetEClass == null) {
			inValueSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(76);
		}
		return inValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInValueSet_Code() {
        return (EReference)getInValueSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInValueSet_Valueset() {
        return (EReference)getInValueSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIs() {
		if (isEClass == null) {
			isEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(77);
		}
		return isEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIs_IsTypeSpecifier() {
        return (EReference)getIs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIs_IsType() {
        return (EAttribute)getIs().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsFalse() {
		if (isFalseEClass == null) {
			isFalseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(78);
		}
		return isFalseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsNull() {
		if (isNullEClass == null) {
			isNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(79);
		}
		return isNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsTrue() {
		if (isTrueEClass == null) {
			isTrueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(80);
		}
		return isTrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLast() {
		if (lastEClass == null) {
			lastEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(81);
		}
		return lastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLast_Source() {
        return (EReference)getLast().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLast_OrderBy() {
        return (EAttribute)getLast().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLength() {
		if (lengthEClass == null) {
			lengthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(82);
		}
		return lengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLess() {
		if (lessEClass == null) {
			lessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(83);
		}
		return lessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessOrEqual() {
		if (lessOrEqualEClass == null) {
			lessOrEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(84);
		}
		return lessOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		if (listEClass == null) {
			listEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(85);
		}
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_TypeSpecifier() {
        return (EReference)getList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Element() {
        return (EReference)getList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListTypeSpecifier() {
		if (listTypeSpecifierEClass == null) {
			listTypeSpecifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(86);
		}
		return listTypeSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListTypeSpecifier_ElementType() {
        return (EReference)getListTypeSpecifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		if (literalEClass == null) {
			literalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(87);
		}
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_ValueType() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLn() {
		if (lnEClass == null) {
			lnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(88);
		}
		return lnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLog() {
		if (logEClass == null) {
			logEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(89);
		}
		return logEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLower() {
		if (lowerEClass == null) {
			lowerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(90);
		}
		return lowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatches() {
		if (matchesEClass == null) {
			matchesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(91);
		}
		return matchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMax() {
		if (maxEClass == null) {
			maxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(92);
		}
		return maxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxValue() {
		if (maxValueEClass == null) {
			maxValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(93);
		}
		return maxValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxValue_ValueType() {
        return (EAttribute)getMaxValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedian() {
		if (medianEClass == null) {
			medianEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(94);
		}
		return medianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeets() {
		if (meetsEClass == null) {
			meetsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(95);
		}
		return meetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeets_Precision() {
        return (EAttribute)getMeets().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeetsAfter() {
		if (meetsAfterEClass == null) {
			meetsAfterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(96);
		}
		return meetsAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeetsAfter_Precision() {
        return (EAttribute)getMeetsAfter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeetsBefore() {
		if (meetsBeforeEClass == null) {
			meetsBeforeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(97);
		}
		return meetsBeforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeetsBefore_Precision() {
        return (EAttribute)getMeetsBefore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMin() {
		if (minEClass == null) {
			minEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(98);
		}
		return minEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinValue() {
		if (minValueEClass == null) {
			minValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(99);
		}
		return minValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinValue_ValueType() {
        return (EAttribute)getMinValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		if (modeEClass == null) {
			modeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(100);
		}
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulo() {
		if (moduloEClass == null) {
			moduloEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(101);
		}
		return moduloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiply() {
		if (multiplyEClass == null) {
			multiplyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(102);
		}
		return multiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTypeSpecifier() {
		if (namedTypeSpecifierEClass == null) {
			namedTypeSpecifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(103);
		}
		return namedTypeSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedTypeSpecifier_Name() {
        return (EAttribute)getNamedTypeSpecifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaryExpression() {
		if (naryExpressionEClass == null) {
			naryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(104);
		}
		return naryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaryExpression_Operand() {
        return (EReference)getNaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegate() {
		if (negateEClass == null) {
			negateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(105);
		}
		return negateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		if (notEClass == null) {
			notEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(106);
		}
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEqual() {
		if (notEqualEClass == null) {
			notEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(107);
		}
		return notEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNow() {
		if (nowEClass == null) {
			nowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(108);
		}
		return nowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNull() {
		if (nullEClass == null) {
			nullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(109);
		}
		return nullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNull_ValueType() {
        return (EAttribute)getNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperandDef() {
		if (operandDefEClass == null) {
			operandDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(110);
		}
		return operandDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperandDef_OperandTypeSpecifier() {
        return (EReference)getOperandDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperandDef_Name() {
        return (EAttribute)getOperandDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperandDef_OperandType() {
        return (EAttribute)getOperandDef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperandRef() {
		if (operandRefEClass == null) {
			operandRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(111);
		}
		return operandRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperandRef_Name() {
        return (EAttribute)getOperandRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		if (orEClass == null) {
			orEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(112);
		}
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlaps() {
		if (overlapsEClass == null) {
			overlapsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(113);
		}
		return overlapsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlaps_Precision() {
        return (EAttribute)getOverlaps().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlapsAfter() {
		if (overlapsAfterEClass == null) {
			overlapsAfterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(114);
		}
		return overlapsAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlapsAfter_Precision() {
        return (EAttribute)getOverlapsAfter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlapsBefore() {
		if (overlapsBeforeEClass == null) {
			overlapsBeforeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(115);
		}
		return overlapsBeforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlapsBefore_Precision() {
        return (EAttribute)getOverlapsBefore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDef() {
		if (parameterDefEClass == null) {
			parameterDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(116);
		}
		return parameterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDef_Default() {
        return (EReference)getParameterDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDef_ParameterTypeSpecifier() {
        return (EReference)getParameterDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_AccessLevel() {
        return (EAttribute)getParameterDef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_Name() {
        return (EAttribute)getParameterDef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_ParameterType() {
        return (EAttribute)getParameterDef().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterRef() {
		if (parameterRefEClass == null) {
			parameterRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(117);
		}
		return parameterRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterRef_LibraryName() {
        return (EAttribute)getParameterRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterRef_Name() {
        return (EAttribute)getParameterRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationStdDev() {
		if (populationStdDevEClass == null) {
			populationStdDevEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(118);
		}
		return populationStdDevEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationVariance() {
		if (populationVarianceEClass == null) {
			populationVarianceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(119);
		}
		return populationVarianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionOf() {
		if (positionOfEClass == null) {
			positionOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(120);
		}
		return positionOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionOf_Pattern() {
        return (EReference)getPositionOf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionOf_String() {
        return (EReference)getPositionOf().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPower() {
		if (powerEClass == null) {
			powerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(121);
		}
		return powerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredecessor() {
		if (predecessorEClass == null) {
			predecessorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(122);
		}
		return predecessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperContains() {
		if (properContainsEClass == null) {
			properContainsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(123);
		}
		return properContainsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperContains_Precision() {
        return (EAttribute)getProperContains().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperIn() {
		if (properInEClass == null) {
			properInEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(124);
		}
		return properInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperIn_Precision() {
        return (EAttribute)getProperIn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperIncludedIn() {
		if (properIncludedInEClass == null) {
			properIncludedInEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(125);
		}
		return properIncludedInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperIncludedIn_Precision() {
        return (EAttribute)getProperIncludedIn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperIncludes() {
		if (properIncludesEClass == null) {
			properIncludesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(126);
		}
		return properIncludesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperIncludes_Precision() {
        return (EAttribute)getProperIncludes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		if (propertyEClass == null) {
			propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(127);
		}
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Source() {
        return (EReference)getProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Path() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Scope() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		if (quantityEClass == null) {
			quantityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(128);
		}
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_Unit() {
        return (EAttribute)getQuantity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_Value() {
        return (EAttribute)getQuantity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		if (queryEClass == null) {
			queryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(129);
		}
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Source() {
        return (EReference)getQuery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Define() {
        return (EReference)getQuery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Relationship() {
        return (EReference)getQuery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Where() {
        return (EReference)getQuery().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Return() {
        return (EReference)getQuery().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Sort() {
        return (EReference)getQuery().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDefineRef() {
		if (queryDefineRefEClass == null) {
			queryDefineRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(130);
		}
		return queryDefineRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryDefineRef_Name() {
        return (EAttribute)getQueryDefineRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipClause() {
		if (relationshipClauseEClass == null) {
			relationshipClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(131);
		}
		return relationshipClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipClause_SuchThat() {
        return (EReference)getRelationshipClause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetrieve() {
		if (retrieveEClass == null) {
			retrieveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(132);
		}
		return retrieveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRetrieve_Codes() {
        return (EReference)getRetrieve().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRetrieve_DateRange() {
        return (EReference)getRetrieve().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrieve_CodeProperty() {
        return (EAttribute)getRetrieve().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrieve_DataType() {
        return (EAttribute)getRetrieve().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrieve_DateHighProperty() {
        return (EAttribute)getRetrieve().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrieve_DateLowProperty() {
        return (EAttribute)getRetrieve().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrieve_DateProperty() {
        return (EAttribute)getRetrieve().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrieve_IdProperty() {
        return (EAttribute)getRetrieve().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrieve_Scope() {
        return (EAttribute)getRetrieve().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrieve_TemplateId() {
        return (EAttribute)getRetrieve().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnClause() {
		if (returnClauseEClass == null) {
			returnClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(133);
		}
		return returnClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnClause_Expression() {
        return (EReference)getReturnClause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturnClause_Distinct() {
        return (EAttribute)getReturnClause().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRound() {
		if (roundEClass == null) {
			roundEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(134);
		}
		return roundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRound_Operand() {
        return (EReference)getRound().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRound_Precision() {
        return (EReference)getRound().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameAs() {
		if (sameAsEClass == null) {
			sameAsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(135);
		}
		return sameAsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSameAs_Precision() {
        return (EAttribute)getSameAs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameOrAfter() {
		if (sameOrAfterEClass == null) {
			sameOrAfterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(136);
		}
		return sameOrAfterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSameOrAfter_Precision() {
        return (EAttribute)getSameOrAfter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSameOrBefore() {
		if (sameOrBeforeEClass == null) {
			sameOrBeforeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(137);
		}
		return sameOrBeforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSameOrBefore_Precision() {
        return (EAttribute)getSameOrBefore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonFrom() {
		if (singletonFromEClass == null) {
			singletonFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(138);
		}
		return singletonFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSort() {
		if (sortEClass == null) {
			sortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(139);
		}
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_Source() {
        return (EReference)getSort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSort_By() {
        return (EReference)getSort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortByItem() {
		if (sortByItemEClass == null) {
			sortByItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(140);
		}
		return sortByItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortByItem_Direction() {
        return (EAttribute)getSortByItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortClause() {
		if (sortClauseEClass == null) {
			sortClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(141);
		}
		return sortClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortClause_By() {
        return (EReference)getSortClause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit() {
		if (splitEClass == null) {
			splitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(144);
		}
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_StringToSplit() {
        return (EReference)getSplit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Separator() {
        return (EReference)getSplit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		if (startEClass == null) {
			startEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(145);
		}
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStarts() {
		if (startsEClass == null) {
			startsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(146);
		}
		return startsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStarts_Precision() {
        return (EAttribute)getStarts().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStdDev() {
		if (stdDevEClass == null) {
			stdDevEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(147);
		}
		return stdDevEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstring() {
		if (substringEClass == null) {
			substringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(148);
		}
		return substringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstring_StringToSub() {
        return (EReference)getSubstring().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstring_StartIndex() {
        return (EReference)getSubstring().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstring_Length() {
        return (EReference)getSubstring().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtract() {
		if (subtractEClass == null) {
			subtractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(149);
		}
		return subtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuccessor() {
		if (successorEClass == null) {
			successorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(150);
		}
		return successorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSum() {
		if (sumEClass == null) {
			sumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(151);
		}
		return sumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTernaryExpression() {
		if (ternaryExpressionEClass == null) {
			ternaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(152);
		}
		return ternaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernaryExpression_Operand() {
        return (EReference)getTernaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		if (timeEClass == null) {
			timeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(153);
		}
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTime_Hour() {
        return (EReference)getTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTime_Minute() {
        return (EReference)getTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTime_Second() {
        return (EReference)getTime().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTime_Millisecond() {
        return (EReference)getTime().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTime_TimezoneOffset() {
        return (EReference)getTime().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeFrom() {
		if (timeFromEClass == null) {
			timeFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(154);
		}
		return timeFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOfDay() {
		if (timeOfDayEClass == null) {
			timeOfDayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(155);
		}
		return timeOfDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimes() {
		if (timesEClass == null) {
			timesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(156);
		}
		return timesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimezoneFrom() {
		if (timezoneFromEClass == null) {
			timezoneFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(157);
		}
		return timezoneFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToday() {
		if (todayEClass == null) {
			todayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(158);
		}
		return todayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTruncate() {
		if (truncateEClass == null) {
			truncateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(159);
		}
		return truncateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTruncatedDivide() {
		if (truncatedDivideEClass == null) {
			truncatedDivideEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(160);
		}
		return truncatedDivideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuple() {
		if (tupleEClass == null) {
			tupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(161);
		}
		return tupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuple_Element() {
        return (EReference)getTuple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleElement() {
		if (tupleElementEClass == null) {
			tupleElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(162);
		}
		return tupleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleElement_Value() {
        return (EReference)getTupleElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTupleElement_Name() {
        return (EAttribute)getTupleElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleElementDefinition() {
		if (tupleElementDefinitionEClass == null) {
			tupleElementDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(163);
		}
		return tupleElementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleElementDefinition_Type() {
        return (EReference)getTupleElementDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTupleElementDefinition_Name() {
        return (EAttribute)getTupleElementDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleTypeSpecifier() {
		if (tupleTypeSpecifierEClass == null) {
			tupleTypeSpecifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(164);
		}
		return tupleTypeSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleTypeSpecifier_Element() {
        return (EReference)getTupleTypeSpecifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSpecifier() {
		if (typeSpecifierEClass == null) {
			typeSpecifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(165);
		}
		return typeSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		if (unaryExpressionEClass == null) {
			unaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(166);
		}
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operand() {
        return (EReference)getUnaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		if (unionEClass == null) {
			unionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(167);
		}
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpper() {
		if (upperEClass == null) {
			upperEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(168);
		}
		return upperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetDef() {
		if (valueSetDefEClass == null) {
			valueSetDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(169);
		}
		return valueSetDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDef_CodeSystem() {
        return (EReference)getValueSetDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetDef_AccessLevel() {
        return (EAttribute)getValueSetDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetDef_Id() {
        return (EAttribute)getValueSetDef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetDef_Name() {
        return (EAttribute)getValueSetDef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetDef_Version() {
        return (EAttribute)getValueSetDef().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetRef() {
		if (valueSetRefEClass == null) {
			valueSetRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(170);
		}
		return valueSetRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetRef_LibraryName() {
        return (EAttribute)getValueSetRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetRef_Name() {
        return (EAttribute)getValueSetRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariance() {
		if (varianceEClass == null) {
			varianceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(171);
		}
		return varianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidth() {
		if (widthEClass == null) {
			widthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(172);
		}
		return widthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWith() {
		if (withEClass == null) {
			withEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(173);
		}
		return withEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithout() {
		if (withoutEClass == null) {
			withoutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(174);
		}
		return withoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXor() {
		if (xorEClass == null) {
			xorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(175);
		}
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessModifier() {
		if (accessModifierEEnum == null) {
			accessModifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(1);
		}
		return accessModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDateTimePrecision() {
		if (dateTimePrecisionEEnum == null) {
			dateTimePrecisionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(38);
		}
		return dateTimePrecisionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortDirection() {
		if (sortDirectionEEnum == null) {
			sortDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(142);
		}
		return sortDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessModifierObject() {
		if (accessModifierObjectEDataType == null) {
			accessModifierObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(2);
		}
		return accessModifierObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTimePrecisionObject() {
		if (dateTimePrecisionObjectEDataType == null) {
			dateTimePrecisionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(39);
		}
		return dateTimePrecisionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSortDirectionObject() {
		if (sortDirectionObjectEDataType == null) {
			sortDirectionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(R1Package.eNS_URI).getEClassifiers().get(143);
		}
		return sortDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R1Factory getR1Factory() {
		return (R1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.hl7.elm.r1." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //R1PackageImpl
