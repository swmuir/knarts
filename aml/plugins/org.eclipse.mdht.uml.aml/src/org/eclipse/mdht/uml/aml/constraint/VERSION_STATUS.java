/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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
package org.eclipse.mdht.uml.aml.constraint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>VERSION STATUS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getVERSION_STATUS()
 * @model
 * @generated
 */
public enum VERSION_STATUS implements Enumerator {
	/**
	 * The '<em><b>Alpha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA(0, "alpha", "alpha"),

	/**
	 * The '<em><b>Beta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETA_VALUE
	 * @generated
	 * @ordered
	 */
	BETA(1, "beta", "beta"),

	/**
	 * The '<em><b>Release candidate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_CANDIDATE_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE_CANDIDATE(2, "release_candidate", "release_candidate"),

	/**
	 * The '<em><b>Released</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASED_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASED(3, "released", "released"),

	/**
	 * The '<em><b>Build</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	BUILD(4, "build", "build");

	/**
	 * The '<em><b>Alpha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alpha</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA
	 * @model name="alpha"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_VALUE = 0;

	/**
	 * The '<em><b>Beta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BETA
	 * @model name="beta"
	 * @generated
	 * @ordered
	 */
	public static final int BETA_VALUE = 1;

	/**
	 * The '<em><b>Release candidate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Release candidate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELEASE_CANDIDATE
	 * @model name="release_candidate"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_CANDIDATE_VALUE = 2;

	/**
	 * The '<em><b>Released</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Released</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELEASED
	 * @model name="released"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASED_VALUE = 3;

	/**
	 * The '<em><b>Build</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Build</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUILD
	 * @model name="build"
	 * @generated
	 * @ordered
	 */
	public static final int BUILD_VALUE = 4;

	/**
	 * An array of all the '<em><b>VERSION STATUS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VERSION_STATUS[] VALUES_ARRAY =
		new VERSION_STATUS[] {
			ALPHA,
			BETA,
			RELEASE_CANDIDATE,
			RELEASED,
			BUILD,
		};

	/**
	 * A public read-only list of all the '<em><b>VERSION STATUS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VERSION_STATUS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>VERSION STATUS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VERSION_STATUS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VERSION_STATUS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VERSION STATUS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VERSION_STATUS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VERSION_STATUS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VERSION STATUS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VERSION_STATUS get(int value) {
		switch (value) {
			case ALPHA_VALUE: return ALPHA;
			case BETA_VALUE: return BETA;
			case RELEASE_CANDIDATE_VALUE: return RELEASE_CANDIDATE;
			case RELEASED_VALUE: return RELEASED;
			case BUILD_VALUE: return BUILD;
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
	private VERSION_STATUS(int value, String name, String literal) {
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
	
} //VERSION_STATUS
