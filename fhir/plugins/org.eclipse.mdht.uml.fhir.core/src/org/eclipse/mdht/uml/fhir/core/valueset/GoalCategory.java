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
 * A representation of the literals of the enumeration '<em><b>Goal Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getGoalCategory()
 * @model
 * @generated
 */
public enum GoalCategory implements Enumerator {
	/**
	 * The '<em><b>Dietary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIETARY_VALUE
	 * @generated
	 * @ordered
	 */
	DIETARY(0, "dietary", "dietary"),

	/**
	 * The '<em><b>Safety</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY(1, "safety", "safety"),

	/**
	 * The '<em><b>Behavioral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIORAL_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIORAL(2, "behavioral", "behavioral"),

	/**
	 * The '<em><b>Nursing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSING_VALUE
	 * @generated
	 * @ordered
	 */
	NURSING(3, "nursing", "nursing"),

	/**
	 * The '<em><b>Physiotherapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSIOTHERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSIOTHERAPY(4, "physiotherapy", "physiotherapy");

	/**
	 * The '<em><b>Dietary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dietary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIETARY
	 * @model name="dietary"
	 * @generated
	 * @ordered
	 */
	public static final int DIETARY_VALUE = 0;

	/**
	 * The '<em><b>Safety</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Safety</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAFETY
	 * @model name="safety"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_VALUE = 1;

	/**
	 * The '<em><b>Behavioral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Behavioral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEHAVIORAL
	 * @model name="behavioral"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIORAL_VALUE = 2;

	/**
	 * The '<em><b>Nursing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nursing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NURSING
	 * @model name="nursing"
	 * @generated
	 * @ordered
	 */
	public static final int NURSING_VALUE = 3;

	/**
	 * The '<em><b>Physiotherapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Physiotherapy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHYSIOTHERAPY
	 * @model name="physiotherapy"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSIOTHERAPY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Goal Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoalCategory[] VALUES_ARRAY =
		new GoalCategory[] {
			DIETARY,
			SAFETY,
			BEHAVIORAL,
			NURSING,
			PHYSIOTHERAPY,
		};

	/**
	 * A public read-only list of all the '<em><b>Goal Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoalCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Goal Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalCategory get(int value) {
		switch (value) {
			case DIETARY_VALUE: return DIETARY;
			case SAFETY_VALUE: return SAFETY;
			case BEHAVIORAL_VALUE: return BEHAVIORAL;
			case NURSING_VALUE: return NURSING;
			case PHYSIOTHERAPY_VALUE: return PHYSIOTHERAPY;
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
	private GoalCategory(int value, String name, String literal) {
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
	
} //GoalCategory
