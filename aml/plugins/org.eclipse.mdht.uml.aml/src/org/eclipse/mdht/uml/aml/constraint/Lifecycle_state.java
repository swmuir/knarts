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
 * A representation of the literals of the enumeration '<em><b>Lifecycle state</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.constraint.ConstraintPackage#getLifecycle_state()
 * @model
 * @generated
 */
public enum Lifecycle_state implements Enumerator {
	/**
	 * The '<em><b>Unmanaged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNMANAGED_VALUE
	 * @generated
	 * @ordered
	 */
	UNMANAGED(0, "unmanaged", "unmanaged"),

	/**
	 * The '<em><b>In development</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_DEVELOPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	IN_DEVELOPMENT(1, "in_development", "in_development"),

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
	 * The '<em><b>Published</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHED_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISHED(3, "published", "published"),

	/**
	 * The '<em><b>Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(4, "rejected", "rejected"),

	/**
	 * The '<em><b>Deprecated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATED(5, "deprecated", "deprecated");

	/**
	 * The '<em><b>Unmanaged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unmanaged</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNMANAGED
	 * @model name="unmanaged"
	 * @generated
	 * @ordered
	 */
	public static final int UNMANAGED_VALUE = 0;

	/**
	 * The '<em><b>In development</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In development</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_DEVELOPMENT
	 * @model name="in_development"
	 * @generated
	 * @ordered
	 */
	public static final int IN_DEVELOPMENT_VALUE = 1;

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
	 * The '<em><b>Published</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Published</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISHED
	 * @model name="published"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISHED_VALUE = 3;

	/**
	 * The '<em><b>Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rejected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECTED
	 * @model name="rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 4;

	/**
	 * The '<em><b>Deprecated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deprecated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPRECATED
	 * @model name="deprecated"
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Lifecycle state</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Lifecycle_state[] VALUES_ARRAY =
		new Lifecycle_state[] {
			UNMANAGED,
			IN_DEVELOPMENT,
			RELEASE_CANDIDATE,
			PUBLISHED,
			REJECTED,
			DEPRECATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Lifecycle state</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Lifecycle_state> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lifecycle state</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Lifecycle_state get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Lifecycle_state result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle state</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Lifecycle_state getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Lifecycle_state result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle state</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Lifecycle_state get(int value) {
		switch (value) {
			case UNMANAGED_VALUE: return UNMANAGED;
			case IN_DEVELOPMENT_VALUE: return IN_DEVELOPMENT;
			case RELEASE_CANDIDATE_VALUE: return RELEASE_CANDIDATE;
			case PUBLISHED_VALUE: return PUBLISHED;
			case REJECTED_VALUE: return REJECTED;
			case DEPRECATED_VALUE: return DEPRECATED;
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
	private Lifecycle_state(int value, String name, String literal) {
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
	
} //Lifecycle_state
