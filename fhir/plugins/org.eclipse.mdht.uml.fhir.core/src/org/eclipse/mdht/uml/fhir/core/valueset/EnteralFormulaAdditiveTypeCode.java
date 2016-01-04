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
 * A representation of the literals of the enumeration '<em><b>Enteral Formula Additive Type Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getEnteralFormulaAdditiveTypeCode()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Enteral Formula Additive Type Code'"
 * @generated
 */
public enum EnteralFormulaAdditiveTypeCode implements Enumerator {
	/**
	 * The '<em><b>Lipid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIPID_VALUE
	 * @generated
	 * @ordered
	 */
	LIPID(0, "lipid", "lipid"),

	/**
	 * The '<em><b>Protein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTEIN_VALUE
	 * @generated
	 * @ordered
	 */
	PROTEIN(1, "protein", "protein"),

	/**
	 * The '<em><b>Carbohydrate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARBOHYDRATE_VALUE
	 * @generated
	 * @ordered
	 */
	CARBOHYDRATE(2, "carbohydrate", "carbohydrate"),

	/**
	 * The '<em><b>Fiber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIBER_VALUE
	 * @generated
	 * @ordered
	 */
	FIBER(3, "fiber", "fiber"),

	/**
	 * The '<em><b>Water</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_VALUE
	 * @generated
	 * @ordered
	 */
	WATER(4, "water", "water");

	/**
	 * The '<em><b>Lipid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lipid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIPID
	 * @model name="lipid"
	 * @generated
	 * @ordered
	 */
	public static final int LIPID_VALUE = 0;

	/**
	 * The '<em><b>Protein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protein</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTEIN
	 * @model name="protein"
	 * @generated
	 * @ordered
	 */
	public static final int PROTEIN_VALUE = 1;

	/**
	 * The '<em><b>Carbohydrate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carbohydrate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARBOHYDRATE
	 * @model name="carbohydrate"
	 * @generated
	 * @ordered
	 */
	public static final int CARBOHYDRATE_VALUE = 2;

	/**
	 * The '<em><b>Fiber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fiber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIBER
	 * @model name="fiber"
	 * @generated
	 * @ordered
	 */
	public static final int FIBER_VALUE = 3;

	/**
	 * The '<em><b>Water</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Water</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATER
	 * @model name="water"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Enteral Formula Additive Type Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnteralFormulaAdditiveTypeCode[] VALUES_ARRAY =
		new EnteralFormulaAdditiveTypeCode[] {
			LIPID,
			PROTEIN,
			CARBOHYDRATE,
			FIBER,
			WATER,
		};

	/**
	 * A public read-only list of all the '<em><b>Enteral Formula Additive Type Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnteralFormulaAdditiveTypeCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enteral Formula Additive Type Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnteralFormulaAdditiveTypeCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnteralFormulaAdditiveTypeCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enteral Formula Additive Type Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnteralFormulaAdditiveTypeCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnteralFormulaAdditiveTypeCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enteral Formula Additive Type Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnteralFormulaAdditiveTypeCode get(int value) {
		switch (value) {
			case LIPID_VALUE: return LIPID;
			case PROTEIN_VALUE: return PROTEIN;
			case CARBOHYDRATE_VALUE: return CARBOHYDRATE;
			case FIBER_VALUE: return FIBER;
			case WATER_VALUE: return WATER;
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
	private EnteralFormulaAdditiveTypeCode(int value, String name, String literal) {
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
	
} //EnteralFormulaAdditiveTypeCode
