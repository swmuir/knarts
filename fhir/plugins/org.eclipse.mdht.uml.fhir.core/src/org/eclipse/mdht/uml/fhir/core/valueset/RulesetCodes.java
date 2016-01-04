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
 * A representation of the literals of the enumeration '<em><b>Ruleset Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getRulesetCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Ruleset Codes'"
 * @generated
 */
public enum RulesetCodes implements Enumerator {
	/**
	 * The '<em><b>X124010</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X124010_VALUE
	 * @generated
	 * @ordered
	 */
	X124010(0, "x124010", "x124010"),

	/**
	 * The '<em><b>X125010</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X125010_VALUE
	 * @generated
	 * @ordered
	 */
	X125010(1, "x125010", "x125010"),

	/**
	 * The '<em><b>X127010</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X127010_VALUE
	 * @generated
	 * @ordered
	 */
	X127010(2, "x127010", "x127010"),

	/**
	 * The '<em><b>Cdanetv2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDANETV2_VALUE
	 * @generated
	 * @ordered
	 */
	CDANETV2(3, "cdanetv2", "cdanetv2"),

	/**
	 * The '<em><b>Cdanetv4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDANETV4_VALUE
	 * @generated
	 * @ordered
	 */
	CDANETV4(4, "cdanetv4", "cdanetv4"),

	/**
	 * The '<em><b>Cpha3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPHA3_VALUE
	 * @generated
	 * @ordered
	 */
	CPHA3(5, "cpha3", "cpha3");

	/**
	 * The '<em><b>X124010</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X124010</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X124010
	 * @model name="x124010"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='x12-4010'"
	 * @generated
	 * @ordered
	 */
	public static final int X124010_VALUE = 0;

	/**
	 * The '<em><b>X125010</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X125010</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X125010
	 * @model name="x125010"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='x12-5010'"
	 * @generated
	 * @ordered
	 */
	public static final int X125010_VALUE = 1;

	/**
	 * The '<em><b>X127010</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X127010</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X127010
	 * @model name="x127010"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='x12-7010'"
	 * @generated
	 * @ordered
	 */
	public static final int X127010_VALUE = 2;

	/**
	 * The '<em><b>Cdanetv2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cdanetv2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CDANETV2
	 * @model name="cdanetv2"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='cdanet-v2'"
	 * @generated
	 * @ordered
	 */
	public static final int CDANETV2_VALUE = 3;

	/**
	 * The '<em><b>Cdanetv4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cdanetv4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CDANETV4
	 * @model name="cdanetv4"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='cdanet-v4'"
	 * @generated
	 * @ordered
	 */
	public static final int CDANETV4_VALUE = 4;

	/**
	 * The '<em><b>Cpha3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cpha3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPHA3
	 * @model name="cpha3"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='cpha-3'"
	 * @generated
	 * @ordered
	 */
	public static final int CPHA3_VALUE = 5;

	/**
	 * An array of all the '<em><b>Ruleset Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RulesetCodes[] VALUES_ARRAY =
		new RulesetCodes[] {
			X124010,
			X125010,
			X127010,
			CDANETV2,
			CDANETV4,
			CPHA3,
		};

	/**
	 * A public read-only list of all the '<em><b>Ruleset Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RulesetCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ruleset Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RulesetCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RulesetCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ruleset Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RulesetCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RulesetCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ruleset Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RulesetCodes get(int value) {
		switch (value) {
			case X124010_VALUE: return X124010;
			case X125010_VALUE: return X125010;
			case X127010_VALUE: return X127010;
			case CDANETV2_VALUE: return CDANETV2;
			case CDANETV4_VALUE: return CDANETV4;
			case CPHA3_VALUE: return CPHA3;
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
	private RulesetCodes(int value, String name, String literal) {
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
	
} //RulesetCodes
