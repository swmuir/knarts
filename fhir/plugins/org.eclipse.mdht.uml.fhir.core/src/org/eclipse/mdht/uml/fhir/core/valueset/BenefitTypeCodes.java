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
 * A representation of the literals of the enumeration '<em><b>Benefit Type Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getBenefitTypeCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Benefit Type Codes'"
 * @generated
 */
public enum BenefitTypeCodes implements Enumerator {
	/**
	 * The '<em><b>Deductable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDUCTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	DEDUCTABLE(0, "deductable", "deductable"),

	/**
	 * The '<em><b>Visit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIT_VALUE
	 * @generated
	 * @ordered
	 */
	VISIT(1, "visit", "visit"),

	/**
	 * The '<em><b>Copay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPAY_VALUE
	 * @generated
	 * @ordered
	 */
	COPAY(2, "copay", "copay"),

	/**
	 * The '<em><b>Visionexam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIONEXAM_VALUE
	 * @generated
	 * @ordered
	 */
	VISIONEXAM(3, "visionexam", "visionexam"),

	/**
	 * The '<em><b>Visionglasses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIONGLASSES_VALUE
	 * @generated
	 * @ordered
	 */
	VISIONGLASSES(4, "visionglasses", "visionglasses"),

	/**
	 * The '<em><b>Visioncontacts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIONCONTACTS_VALUE
	 * @generated
	 * @ordered
	 */
	VISIONCONTACTS(5, "visioncontacts", "visioncontacts"),

	/**
	 * The '<em><b>Medicalprimarycare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICALPRIMARYCARE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICALPRIMARYCARE(6, "medicalprimarycare", "medicalprimarycare"),

	/**
	 * The '<em><b>Pharmacydispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACYDISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACYDISPENSE(7, "pharmacydispense", "pharmacydispense");

	/**
	 * The '<em><b>Deductable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deductable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEDUCTABLE
	 * @model name="deductable"
	 * @generated
	 * @ordered
	 */
	public static final int DEDUCTABLE_VALUE = 0;

	/**
	 * The '<em><b>Visit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIT
	 * @model name="visit"
	 * @generated
	 * @ordered
	 */
	public static final int VISIT_VALUE = 1;

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
	public static final int COPAY_VALUE = 2;

	/**
	 * The '<em><b>Visionexam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visionexam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIONEXAM
	 * @model name="visionexam"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vision-exam'"
	 * @generated
	 * @ordered
	 */
	public static final int VISIONEXAM_VALUE = 3;

	/**
	 * The '<em><b>Visionglasses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visionglasses</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIONGLASSES
	 * @model name="visionglasses"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vision-glasses'"
	 * @generated
	 * @ordered
	 */
	public static final int VISIONGLASSES_VALUE = 4;

	/**
	 * The '<em><b>Visioncontacts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visioncontacts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIONCONTACTS
	 * @model name="visioncontacts"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vision-contacts'"
	 * @generated
	 * @ordered
	 */
	public static final int VISIONCONTACTS_VALUE = 5;

	/**
	 * The '<em><b>Medicalprimarycare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicalprimarycare</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICALPRIMARYCARE
	 * @model name="medicalprimarycare"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='medical-primarycare'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICALPRIMARYCARE_VALUE = 6;

	/**
	 * The '<em><b>Pharmacydispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacydispense</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACYDISPENSE
	 * @model name="pharmacydispense"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='pharmacy-dispense'"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACYDISPENSE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Benefit Type Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BenefitTypeCodes[] VALUES_ARRAY =
		new BenefitTypeCodes[] {
			DEDUCTABLE,
			VISIT,
			COPAY,
			VISIONEXAM,
			VISIONGLASSES,
			VISIONCONTACTS,
			MEDICALPRIMARYCARE,
			PHARMACYDISPENSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Benefit Type Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BenefitTypeCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Benefit Type Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BenefitTypeCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BenefitTypeCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Benefit Type Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BenefitTypeCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BenefitTypeCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Benefit Type Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BenefitTypeCodes get(int value) {
		switch (value) {
			case DEDUCTABLE_VALUE: return DEDUCTABLE;
			case VISIT_VALUE: return VISIT;
			case COPAY_VALUE: return COPAY;
			case VISIONEXAM_VALUE: return VISIONEXAM;
			case VISIONGLASSES_VALUE: return VISIONGLASSES;
			case VISIONCONTACTS_VALUE: return VISIONCONTACTS;
			case MEDICALPRIMARYCARE_VALUE: return MEDICALPRIMARYCARE;
			case PHARMACYDISPENSE_VALUE: return PHARMACYDISPENSE;
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
	private BenefitTypeCodes(int value, String name, String literal) {
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
	
} //BenefitTypeCodes
