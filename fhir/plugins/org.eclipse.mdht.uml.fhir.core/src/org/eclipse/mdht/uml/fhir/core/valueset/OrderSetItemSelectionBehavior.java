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
 * A representation of the literals of the enumeration '<em><b>Order Set Item Selection Behavior</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getOrderSetItemSelectionBehavior()
 * @model
 * @generated
 */
public enum OrderSetItemSelectionBehavior implements Enumerator {
	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "any", "any"),

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(1, "all", "all"),

	/**
	 * The '<em><b>Allornone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLORNONE_VALUE
	 * @generated
	 * @ordered
	 */
	ALLORNONE(2, "allornone", "allornone"),

	/**
	 * The '<em><b>Exactlyone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLYONE_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLYONE(3, "exactlyone", "exactlyone"),

	/**
	 * The '<em><b>Atmostone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATMOSTONE_VALUE
	 * @generated
	 * @ordered
	 */
	ATMOSTONE(4, "atmostone", "atmostone"),

	/**
	 * The '<em><b>Oneormore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEORMORE_VALUE
	 * @generated
	 * @ordered
	 */
	ONEORMORE(5, "oneormore", "oneormore");

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model name="any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="all"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 1;

	/**
	 * The '<em><b>Allornone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Allornone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLORNONE
	 * @model name="allornone"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='all-or-none'"
	 * @generated
	 * @ordered
	 */
	public static final int ALLORNONE_VALUE = 2;

	/**
	 * The '<em><b>Exactlyone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exactlyone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXACTLYONE
	 * @model name="exactlyone"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='exactly-one'"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLYONE_VALUE = 3;

	/**
	 * The '<em><b>Atmostone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Atmostone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATMOSTONE
	 * @model name="atmostone"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='at-most-one'"
	 * @generated
	 * @ordered
	 */
	public static final int ATMOSTONE_VALUE = 4;

	/**
	 * The '<em><b>Oneormore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oneormore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONEORMORE
	 * @model name="oneormore"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='one-or-more'"
	 * @generated
	 * @ordered
	 */
	public static final int ONEORMORE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Order Set Item Selection Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderSetItemSelectionBehavior[] VALUES_ARRAY =
		new OrderSetItemSelectionBehavior[] {
			ANY,
			ALL,
			ALLORNONE,
			EXACTLYONE,
			ATMOSTONE,
			ONEORMORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Set Item Selection Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderSetItemSelectionBehavior> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Set Item Selection Behavior</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemSelectionBehavior get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderSetItemSelectionBehavior result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Set Item Selection Behavior</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemSelectionBehavior getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderSetItemSelectionBehavior result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Set Item Selection Behavior</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderSetItemSelectionBehavior get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case ALL_VALUE: return ALL;
			case ALLORNONE_VALUE: return ALLORNONE;
			case EXACTLYONE_VALUE: return EXACTLYONE;
			case ATMOSTONE_VALUE: return ATMOSTONE;
			case ONEORMORE_VALUE: return ONEORMORE;
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
	private OrderSetItemSelectionBehavior(int value, String name, String literal) {
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
	
} //OrderSetItemSelectionBehavior
