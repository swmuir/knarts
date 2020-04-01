/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Immunization Recommendation Date Criterion Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getImmunizationRecommendationDateCriterionCodes()
 * @model
 * @generated
 */
public enum ImmunizationRecommendationDateCriterionCodes implements Enumerator {
	/**
	 * The '<em><b>309815</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_309815_VALUE
	 * @generated
	 * @ordered
	 */
	_309815(0, "_309815", "_309815"),

	/**
	 * The '<em><b>309807</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_309807_VALUE
	 * @generated
	 * @ordered
	 */
	_309807(1, "_309807", "_309807"),

	/**
	 * The '<em><b>597773</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_597773_VALUE
	 * @generated
	 * @ordered
	 */
	_597773(2, "_597773", "_597773"),

	/**
	 * The '<em><b>597781</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_597781_VALUE
	 * @generated
	 * @ordered
	 */
	_597781(3, "_597781", "_597781");

	/**
	 * The '<em><b>309815</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_309815
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='30981-5'"
	 * @generated
	 * @ordered
	 */
	public static final int _309815_VALUE = 0;

	/**
	 * The '<em><b>309807</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_309807
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='30980-7'"
	 * @generated
	 * @ordered
	 */
	public static final int _309807_VALUE = 1;

	/**
	 * The '<em><b>597773</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_597773
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='59777-3'"
	 * @generated
	 * @ordered
	 */
	public static final int _597773_VALUE = 2;

	/**
	 * The '<em><b>597781</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_597781
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='59778-1'"
	 * @generated
	 * @ordered
	 */
	public static final int _597781_VALUE = 3;

	/**
	 * An array of all the '<em><b>Immunization Recommendation Date Criterion Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImmunizationRecommendationDateCriterionCodes[] VALUES_ARRAY =
		new ImmunizationRecommendationDateCriterionCodes[] {
			_309815,
			_309807,
			_597773,
			_597781,
		};

	/**
	 * A public read-only list of all the '<em><b>Immunization Recommendation Date Criterion Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImmunizationRecommendationDateCriterionCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Immunization Recommendation Date Criterion Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationRecommendationDateCriterionCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmunizationRecommendationDateCriterionCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immunization Recommendation Date Criterion Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationRecommendationDateCriterionCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImmunizationRecommendationDateCriterionCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Immunization Recommendation Date Criterion Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImmunizationRecommendationDateCriterionCodes get(int value) {
		switch (value) {
			case _309815_VALUE: return _309815;
			case _309807_VALUE: return _309807;
			case _597773_VALUE: return _597773;
			case _597781_VALUE: return _597781;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ImmunizationRecommendationDateCriterionCodes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ImmunizationRecommendationDateCriterionCodes
