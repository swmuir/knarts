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
 * A representation of the literals of the enumeration '<em><b>Measure Population Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getMeasurePopulationType()
 * @model
 * @generated
 */
public enum MeasurePopulationType implements Enumerator {
	/**
	 * The '<em><b>Initialpopulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALPOPULATION_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALPOPULATION(0, "initialpopulation", "initialpopulation"),

	/**
	 * The '<em><b>Numerator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERATOR(1, "numerator", "numerator"),

	/**
	 * The '<em><b>Numeratorexclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERATOREXCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERATOREXCLUSION(2, "numeratorexclusion", "numeratorexclusion"),

	/**
	 * The '<em><b>Denominator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOR_VALUE
	 * @generated
	 * @ordered
	 */
	DENOMINATOR(3, "denominator", "denominator"),

	/**
	 * The '<em><b>Denominatorexclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOREXCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	DENOMINATOREXCLUSION(4, "denominatorexclusion", "denominatorexclusion"),

	/**
	 * The '<em><b>Denominatorexception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOREXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DENOMINATOREXCEPTION(5, "denominatorexception", "denominatorexception"),

	/**
	 * The '<em><b>Measurepopulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREPOPULATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREPOPULATION(6, "measurepopulation", "measurepopulation"),

	/**
	 * The '<em><b>Measurepopulationexclusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREPOPULATIONEXCLUSION_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREPOPULATIONEXCLUSION(7, "measurepopulationexclusion", "measurepopulationexclusion"),

	/**
	 * The '<em><b>Measurescore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURESCORE_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURESCORE(8, "measurescore", "measurescore");

	/**
	 * The '<em><b>Initialpopulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initialpopulation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALPOPULATION
	 * @model name="initialpopulation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='initial-population'"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALPOPULATION_VALUE = 0;

	/**
	 * The '<em><b>Numerator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numerator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERATOR
	 * @model name="numerator"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERATOR_VALUE = 1;

	/**
	 * The '<em><b>Numeratorexclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numeratorexclusion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERATOREXCLUSION
	 * @model name="numeratorexclusion"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='numerator-exclusion'"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERATOREXCLUSION_VALUE = 2;

	/**
	 * The '<em><b>Denominator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Denominator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOR
	 * @model name="denominator"
	 * @generated
	 * @ordered
	 */
	public static final int DENOMINATOR_VALUE = 3;

	/**
	 * The '<em><b>Denominatorexclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Denominatorexclusion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOREXCLUSION
	 * @model name="denominatorexclusion"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='denominator-exclusion'"
	 * @generated
	 * @ordered
	 */
	public static final int DENOMINATOREXCLUSION_VALUE = 4;

	/**
	 * The '<em><b>Denominatorexception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Denominatorexception</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENOMINATOREXCEPTION
	 * @model name="denominatorexception"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='denominator-exception'"
	 * @generated
	 * @ordered
	 */
	public static final int DENOMINATOREXCEPTION_VALUE = 5;

	/**
	 * The '<em><b>Measurepopulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurepopulation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREPOPULATION
	 * @model name="measurepopulation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='measure-population'"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREPOPULATION_VALUE = 6;

	/**
	 * The '<em><b>Measurepopulationexclusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurepopulationexclusion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREPOPULATIONEXCLUSION
	 * @model name="measurepopulationexclusion"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='measure-population-exclusion'"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREPOPULATIONEXCLUSION_VALUE = 7;

	/**
	 * The '<em><b>Measurescore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurescore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASURESCORE
	 * @model name="measurescore"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='measure-score'"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURESCORE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Measure Population Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasurePopulationType[] VALUES_ARRAY =
		new MeasurePopulationType[] {
			INITIALPOPULATION,
			NUMERATOR,
			NUMERATOREXCLUSION,
			DENOMINATOR,
			DENOMINATOREXCLUSION,
			DENOMINATOREXCEPTION,
			MEASUREPOPULATION,
			MEASUREPOPULATIONEXCLUSION,
			MEASURESCORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Measure Population Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasurePopulationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measure Population Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurePopulationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurePopulationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Population Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurePopulationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurePopulationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Population Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurePopulationType get(int value) {
		switch (value) {
			case INITIALPOPULATION_VALUE: return INITIALPOPULATION;
			case NUMERATOR_VALUE: return NUMERATOR;
			case NUMERATOREXCLUSION_VALUE: return NUMERATOREXCLUSION;
			case DENOMINATOR_VALUE: return DENOMINATOR;
			case DENOMINATOREXCLUSION_VALUE: return DENOMINATOREXCLUSION;
			case DENOMINATOREXCEPTION_VALUE: return DENOMINATOREXCEPTION;
			case MEASUREPOPULATION_VALUE: return MEASUREPOPULATION;
			case MEASUREPOPULATIONEXCLUSION_VALUE: return MEASUREPOPULATIONEXCLUSION;
			case MEASURESCORE_VALUE: return MEASURESCORE;
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
	private MeasurePopulationType(int value, String name, String literal) {
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
	
} //MeasurePopulationType
