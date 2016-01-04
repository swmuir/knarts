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
 * A representation of the literals of the enumeration '<em><b>Adjudication Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getAdjudicationCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Adjudication Codes'"
 * @generated
 */
public enum AdjudicationCodes implements Enumerator {
	/**
	 * The '<em><b>Total</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTAL_VALUE
	 * @generated
	 * @ordered
	 */
	TOTAL(0, "total", "total"),

	/**
	 * The '<em><b>Copay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPAY_VALUE
	 * @generated
	 * @ordered
	 */
	COPAY(1, "copay", "copay"),

	/**
	 * The '<em><b>Eligible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBLE(2, "eligible", "eligible"),

	/**
	 * The '<em><b>Deductible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDUCTIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DEDUCTIBLE(3, "deductible", "deductible"),

	/**
	 * The '<em><b>Eligpercent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGPERCENT_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGPERCENT(4, "eligpercent", "eligpercent"),

	/**
	 * The '<em><b>Tax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_VALUE
	 * @generated
	 * @ordered
	 */
	TAX(5, "tax", "tax"),

	/**
	 * The '<em><b>Benefit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BENEFIT_VALUE
	 * @generated
	 * @ordered
	 */
	BENEFIT(6, "benefit", "benefit");

	/**
	 * The '<em><b>Total</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Total</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOTAL
	 * @model name="total"
	 * @generated
	 * @ordered
	 */
	public static final int TOTAL_VALUE = 0;

	/**
	 * The '<em><b>Copay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPAY
	 * @model name="copay"
	 * @generated
	 * @ordered
	 */
	public static final int COPAY_VALUE = 1;

	/**
	 * The '<em><b>Eligible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eligible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIGIBLE
	 * @model name="eligible"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBLE_VALUE = 2;

	/**
	 * The '<em><b>Deductible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deductible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEDUCTIBLE
	 * @model name="deductible"
	 * @generated
	 * @ordered
	 */
	public static final int DEDUCTIBLE_VALUE = 3;

	/**
	 * The '<em><b>Eligpercent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eligpercent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIGPERCENT
	 * @model name="eligpercent"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGPERCENT_VALUE = 4;

	/**
	 * The '<em><b>Tax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX
	 * @model name="tax"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_VALUE = 5;

	/**
	 * The '<em><b>Benefit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Benefit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BENEFIT
	 * @model name="benefit"
	 * @generated
	 * @ordered
	 */
	public static final int BENEFIT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Adjudication Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdjudicationCodes[] VALUES_ARRAY =
		new AdjudicationCodes[] {
			TOTAL,
			COPAY,
			ELIGIBLE,
			DEDUCTIBLE,
			ELIGPERCENT,
			TAX,
			BENEFIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Adjudication Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdjudicationCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Adjudication Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdjudicationCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdjudicationCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adjudication Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdjudicationCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdjudicationCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adjudication Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdjudicationCodes get(int value) {
		switch (value) {
			case TOTAL_VALUE: return TOTAL;
			case COPAY_VALUE: return COPAY;
			case ELIGIBLE_VALUE: return ELIGIBLE;
			case DEDUCTIBLE_VALUE: return DEDUCTIBLE;
			case ELIGPERCENT_VALUE: return ELIGPERCENT;
			case TAX_VALUE: return TAX;
			case BENEFIT_VALUE: return BENEFIT;
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
	private AdjudicationCodes(int value, String name, String literal) {
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
	
} //AdjudicationCodes
