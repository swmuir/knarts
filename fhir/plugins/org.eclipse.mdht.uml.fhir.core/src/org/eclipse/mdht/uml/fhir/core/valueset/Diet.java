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
 * A representation of the literals of the enumeration '<em><b>Diet</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getDiet()
 * @model
 * @generated
 */
public enum Diet implements Enumerator {
	/**
	 * The '<em><b>Vegetarian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETARIAN_VALUE
	 * @generated
	 * @ordered
	 */
	VEGETARIAN(0, "vegetarian", "vegetarian"),

	/**
	 * The '<em><b>Dairyfree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAIRYFREE_VALUE
	 * @generated
	 * @ordered
	 */
	DAIRYFREE(1, "dairyfree", "dairyfree"),

	/**
	 * The '<em><b>Nutfree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUTFREE_VALUE
	 * @generated
	 * @ordered
	 */
	NUTFREE(2, "nutfree", "nutfree"),

	/**
	 * The '<em><b>Glutenfree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLUTENFREE_VALUE
	 * @generated
	 * @ordered
	 */
	GLUTENFREE(3, "glutenfree", "glutenfree"),

	/**
	 * The '<em><b>Vegan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGAN_VALUE
	 * @generated
	 * @ordered
	 */
	VEGAN(4, "vegan", "vegan"),

	/**
	 * The '<em><b>Halal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALAL_VALUE
	 * @generated
	 * @ordered
	 */
	HALAL(5, "halal", "halal"),

	/**
	 * The '<em><b>Kosher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOSHER_VALUE
	 * @generated
	 * @ordered
	 */
	KOSHER(6, "kosher", "kosher");

	/**
	 * The '<em><b>Vegetarian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vegetarian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEGETARIAN
	 * @model name="vegetarian"
	 * @generated
	 * @ordered
	 */
	public static final int VEGETARIAN_VALUE = 0;

	/**
	 * The '<em><b>Dairyfree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dairyfree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAIRYFREE
	 * @model name="dairyfree"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='dairy-free'"
	 * @generated
	 * @ordered
	 */
	public static final int DAIRYFREE_VALUE = 1;

	/**
	 * The '<em><b>Nutfree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nutfree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUTFREE
	 * @model name="nutfree"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='nut-free'"
	 * @generated
	 * @ordered
	 */
	public static final int NUTFREE_VALUE = 2;

	/**
	 * The '<em><b>Glutenfree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Glutenfree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLUTENFREE
	 * @model name="glutenfree"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='gluten-free'"
	 * @generated
	 * @ordered
	 */
	public static final int GLUTENFREE_VALUE = 3;

	/**
	 * The '<em><b>Vegan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vegan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEGAN
	 * @model name="vegan"
	 * @generated
	 * @ordered
	 */
	public static final int VEGAN_VALUE = 4;

	/**
	 * The '<em><b>Halal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Halal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALAL
	 * @model name="halal"
	 * @generated
	 * @ordered
	 */
	public static final int HALAL_VALUE = 5;

	/**
	 * The '<em><b>Kosher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kosher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOSHER
	 * @model name="kosher"
	 * @generated
	 * @ordered
	 */
	public static final int KOSHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Diet</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Diet[] VALUES_ARRAY =
		new Diet[] {
			VEGETARIAN,
			DAIRYFREE,
			NUTFREE,
			GLUTENFREE,
			VEGAN,
			HALAL,
			KOSHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Diet</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Diet> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Diet</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Diet get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Diet result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diet</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Diet getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Diet result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diet</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Diet get(int value) {
		switch (value) {
			case VEGETARIAN_VALUE: return VEGETARIAN;
			case DAIRYFREE_VALUE: return DAIRYFREE;
			case NUTFREE_VALUE: return NUTFREE;
			case GLUTENFREE_VALUE: return GLUTENFREE;
			case VEGAN_VALUE: return VEGAN;
			case HALAL_VALUE: return HALAL;
			case KOSHER_VALUE: return KOSHER;
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
	private Diet(int value, String name, String literal) {
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
	
} //Diet
