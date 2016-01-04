/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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
package org.eclipse.mdht.uml.fhir.core.valueset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Immunization Recommendation Date Criterion Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getImmunizationRecommendationDateCriterionCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Immunization Recommendation Date Criterion Codes'"
 * @generated
 */
public enum ImmunizationRecommendationDateCriterionCodes implements Enumerator {
	/**
	 * The '<em><b>Due</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUE_VALUE
	 * @generated
	 * @ordered
	 */
	DUE(0, "due", "due"),

	/**
	 * The '<em><b>Recommended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDED_VALUE
	 * @generated
	 * @ordered
	 */
	RECOMMENDED(1, "recommended", "recommended"),

	/**
	 * The '<em><b>Earliest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLIEST_VALUE
	 * @generated
	 * @ordered
	 */
	EARLIEST(2, "earliest", "earliest"),

	/**
	 * The '<em><b>Overdue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERDUE_VALUE
	 * @generated
	 * @ordered
	 */
	OVERDUE(3, "overdue", "overdue"),

	/**
	 * The '<em><b>Latest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATEST_VALUE
	 * @generated
	 * @ordered
	 */
	LATEST(4, "latest", "latest");

	/**
	 * The '<em><b>Due</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Due</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUE
	 * @model name="due"
	 * @generated
	 * @ordered
	 */
	public static final int DUE_VALUE = 0;

	/**
	 * The '<em><b>Recommended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recommended</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECOMMENDED
	 * @model name="recommended"
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDED_VALUE = 1;

	/**
	 * The '<em><b>Earliest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Earliest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARLIEST
	 * @model name="earliest"
	 * @generated
	 * @ordered
	 */
	public static final int EARLIEST_VALUE = 2;

	/**
	 * The '<em><b>Overdue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overdue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERDUE
	 * @model name="overdue"
	 * @generated
	 * @ordered
	 */
	public static final int OVERDUE_VALUE = 3;

	/**
	 * The '<em><b>Latest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Latest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATEST
	 * @model name="latest"
	 * @generated
	 * @ordered
	 */
	public static final int LATEST_VALUE = 4;

	/**
	 * An array of all the '<em><b>Immunization Recommendation Date Criterion Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImmunizationRecommendationDateCriterionCodes[] VALUES_ARRAY =
		new ImmunizationRecommendationDateCriterionCodes[] {
			DUE,
			RECOMMENDED,
			EARLIEST,
			OVERDUE,
			LATEST,
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
			case DUE_VALUE: return DUE;
			case RECOMMENDED_VALUE: return RECOMMENDED;
			case EARLIEST_VALUE: return EARLIEST;
			case OVERDUE_VALUE: return OVERDUE;
			case LATEST_VALUE: return LATEST;
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
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
