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
 * A representation of the literals of the enumeration '<em><b>Observation Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getObservationRelationshipType()
 * @model
 * @generated
 */
public enum ObservationRelationshipType implements Enumerator {
	/**
	 * The '<em><b>Hasmember</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASMEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	HASMEMBER(0, "hasmember", "hasmember"),

	/**
	 * The '<em><b>Derivedfrom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVEDFROM_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVEDFROM(1, "derivedfrom", "derivedfrom"),

	/**
	 * The '<em><b>Sequelto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUELTO_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUELTO(2, "sequelto", "sequelto"),

	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(3, "replaces", "replaces"),

	/**
	 * The '<em><b>Qualifiedby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALIFIEDBY_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIEDBY(4, "qualifiedby", "qualifiedby"),

	/**
	 * The '<em><b>Interferedby</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFEREDBY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFEREDBY(5, "interferedby", "interferedby");

	/**
	 * The '<em><b>Hasmember</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hasmember</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HASMEMBER
	 * @model name="hasmember"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='has-member'"
	 * @generated
	 * @ordered
	 */
	public static final int HASMEMBER_VALUE = 0;

	/**
	 * The '<em><b>Derivedfrom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derivedfrom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVEDFROM
	 * @model name="derivedfrom"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='derived-from'"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVEDFROM_VALUE = 1;

	/**
	 * The '<em><b>Sequelto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequelto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUELTO
	 * @model name="sequelto"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='sequel-to'"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUELTO_VALUE = 2;

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Replaces</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLACES
	 * @model name="replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 3;

	/**
	 * The '<em><b>Qualifiedby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qualifiedby</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUALIFIEDBY
	 * @model name="qualifiedby"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='qualified-by'"
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIEDBY_VALUE = 4;

	/**
	 * The '<em><b>Interferedby</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interferedby</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFEREDBY
	 * @model name="interferedby"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='interfered-by'"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFEREDBY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Observation Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObservationRelationshipType[] VALUES_ARRAY =
		new ObservationRelationshipType[] {
			HASMEMBER,
			DERIVEDFROM,
			SEQUELTO,
			REPLACES,
			QUALIFIEDBY,
			INTERFEREDBY,
		};

	/**
	 * A public read-only list of all the '<em><b>Observation Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObservationRelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Observation Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationRelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationRelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationRelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationRelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationRelationshipType get(int value) {
		switch (value) {
			case HASMEMBER_VALUE: return HASMEMBER;
			case DERIVEDFROM_VALUE: return DERIVEDFROM;
			case SEQUELTO_VALUE: return SEQUELTO;
			case REPLACES_VALUE: return REPLACES;
			case QUALIFIEDBY_VALUE: return QUALIFIEDBY;
			case INTERFEREDBY_VALUE: return INTERFEREDBY;
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
	private ObservationRelationshipType(int value, String name, String literal) {
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
	
} //ObservationRelationshipType
