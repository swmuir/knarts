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
 * A representation of the literals of the enumeration '<em><b>List Empty Reasons</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getListEmptyReasons()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='List Empty Reasons'"
 * @generated
 */
public enum ListEmptyReasons implements Enumerator {
	/**
	 * The '<em><b>Nilknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NILKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	NILKNOWN(0, "nilknown", "nilknown"),

	/**
	 * The '<em><b>Notasked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTASKED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTASKED(1, "notasked", "notasked"),

	/**
	 * The '<em><b>Withheld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHHELD_VALUE
	 * @generated
	 * @ordered
	 */
	WITHHELD(2, "withheld", "withheld"),

	/**
	 * The '<em><b>Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNAVAILABLE(3, "unavailable", "unavailable"),

	/**
	 * The '<em><b>Notstarted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTSTARTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTSTARTED(4, "notstarted", "notstarted"),

	/**
	 * The '<em><b>Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(5, "closed", "closed");

	/**
	 * The '<em><b>Nilknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nilknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NILKNOWN
	 * @model name="nilknown"
	 * @generated
	 * @ordered
	 */
	public static final int NILKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Notasked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notasked</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTASKED
	 * @model name="notasked"
	 * @generated
	 * @ordered
	 */
	public static final int NOTASKED_VALUE = 1;

	/**
	 * The '<em><b>Withheld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Withheld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WITHHELD
	 * @model name="withheld"
	 * @generated
	 * @ordered
	 */
	public static final int WITHHELD_VALUE = 2;

	/**
	 * The '<em><b>Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unavailable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNAVAILABLE
	 * @model name="unavailable"
	 * @generated
	 * @ordered
	 */
	public static final int UNAVAILABLE_VALUE = 3;

	/**
	 * The '<em><b>Notstarted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notstarted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTSTARTED
	 * @model name="notstarted"
	 * @generated
	 * @ordered
	 */
	public static final int NOTSTARTED_VALUE = 4;

	/**
	 * The '<em><b>Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Closed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model name="closed"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 5;

	/**
	 * An array of all the '<em><b>List Empty Reasons</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ListEmptyReasons[] VALUES_ARRAY =
		new ListEmptyReasons[] {
			NILKNOWN,
			NOTASKED,
			WITHHELD,
			UNAVAILABLE,
			NOTSTARTED,
			CLOSED,
		};

	/**
	 * A public read-only list of all the '<em><b>List Empty Reasons</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ListEmptyReasons> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>List Empty Reasons</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListEmptyReasons get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListEmptyReasons result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Empty Reasons</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListEmptyReasons getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListEmptyReasons result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Empty Reasons</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ListEmptyReasons get(int value) {
		switch (value) {
			case NILKNOWN_VALUE: return NILKNOWN;
			case NOTASKED_VALUE: return NOTASKED;
			case WITHHELD_VALUE: return WITHHELD;
			case UNAVAILABLE_VALUE: return UNAVAILABLE;
			case NOTSTARTED_VALUE: return NOTSTARTED;
			case CLOSED_VALUE: return CLOSED;
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
	private ListEmptyReasons(int value, String name, String literal) {
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
	
} //ListEmptyReasons
