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
 * A representation of the literals of the enumeration '<em><b>V3 Code System Confidentiality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getV3CodeSystemConfidentiality()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='v3 Code System Confidentiality'"
 * @generated
 */
public enum V3CodeSystemConfidentiality implements Enumerator {
	/**
	 * The '<em><b>Confidentiality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIALITY(0, "confidentiality", "confidentiality"),

	/**
	 * The '<em><b>Confidentiality By Access Kind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_BY_ACCESS_KIND_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIALITY_BY_ACCESS_KIND(1, "confidentialityByAccessKind", "confidentialityByAccessKind"),

	/**
	 * The '<em><b>Confidentiality By Info Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_BY_INFO_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIALITY_BY_INFO_TYPE(2, "confidentialityByInfoType", "confidentialityByInfoType"),

	/**
	 * The '<em><b>Confidentiality Modifiers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_MODIFIERS_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIALITY_MODIFIERS(3, "confidentialityModifiers", "confidentialityModifiers");

	/**
	 * The '<em><b>Confidentiality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confidentiality</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY
	 * @model name="confidentiality"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='_Confidentiality'"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIALITY_VALUE = 0;

	/**
	 * The '<em><b>Confidentiality By Access Kind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confidentiality By Access Kind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_BY_ACCESS_KIND
	 * @model name="confidentialityByAccessKind"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='_ConfidentialityByAccessKind'"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIALITY_BY_ACCESS_KIND_VALUE = 1;

	/**
	 * The '<em><b>Confidentiality By Info Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confidentiality By Info Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_BY_INFO_TYPE
	 * @model name="confidentialityByInfoType"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='_ConfidentialityByInfoType'"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIALITY_BY_INFO_TYPE_VALUE = 2;

	/**
	 * The '<em><b>Confidentiality Modifiers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confidentiality Modifiers</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_MODIFIERS
	 * @model name="confidentialityModifiers"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='_ConfidentialityModifiers'"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIALITY_MODIFIERS_VALUE = 3;

	/**
	 * An array of all the '<em><b>V3 Code System Confidentiality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final V3CodeSystemConfidentiality[] VALUES_ARRAY =
		new V3CodeSystemConfidentiality[] {
			CONFIDENTIALITY,
			CONFIDENTIALITY_BY_ACCESS_KIND,
			CONFIDENTIALITY_BY_INFO_TYPE,
			CONFIDENTIALITY_MODIFIERS,
		};

	/**
	 * A public read-only list of all the '<em><b>V3 Code System Confidentiality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<V3CodeSystemConfidentiality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>V3 Code System Confidentiality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V3CodeSystemConfidentiality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			V3CodeSystemConfidentiality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>V3 Code System Confidentiality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V3CodeSystemConfidentiality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			V3CodeSystemConfidentiality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>V3 Code System Confidentiality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static V3CodeSystemConfidentiality get(int value) {
		switch (value) {
			case CONFIDENTIALITY_VALUE: return CONFIDENTIALITY;
			case CONFIDENTIALITY_BY_ACCESS_KIND_VALUE: return CONFIDENTIALITY_BY_ACCESS_KIND;
			case CONFIDENTIALITY_BY_INFO_TYPE_VALUE: return CONFIDENTIALITY_BY_INFO_TYPE;
			case CONFIDENTIALITY_MODIFIERS_VALUE: return CONFIDENTIALITY_MODIFIERS;
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
	private V3CodeSystemConfidentiality(int value, String name, String literal) {
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
	
} //V3CodeSystemConfidentiality
