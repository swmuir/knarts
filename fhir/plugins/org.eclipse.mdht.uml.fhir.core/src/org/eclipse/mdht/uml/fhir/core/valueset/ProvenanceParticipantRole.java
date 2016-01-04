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
 * A representation of the literals of the enumeration '<em><b>Provenance Participant Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getProvenanceParticipantRole()
 * @model
 * @generated
 */
public enum ProvenanceParticipantRole implements Enumerator {
	/**
	 * The '<em><b>Enterer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERER_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERER(0, "enterer", "enterer"),

	/**
	 * The '<em><b>Performer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORMER_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORMER(1, "performer", "performer"),

	/**
	 * The '<em><b>Author</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR(2, "author", "author"),

	/**
	 * The '<em><b>Verifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFIER(3, "verifier", "verifier"),

	/**
	 * The '<em><b>Attester</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTESTER_VALUE
	 * @generated
	 * @ordered
	 */
	ATTESTER(4, "attester", "attester"),

	/**
	 * The '<em><b>Informant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMANT_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMANT(5, "informant", "informant"),

	/**
	 * The '<em><b>Custodian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTODIAN_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTODIAN(6, "custodian", "custodian"),

	/**
	 * The '<em><b>Assembler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLER_VALUE
	 * @generated
	 * @ordered
	 */
	ASSEMBLER(7, "assembler", "assembler"),

	/**
	 * The '<em><b>Composer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSER_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSER(8, "composer", "composer");

	/**
	 * The '<em><b>Enterer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enterer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTERER
	 * @model name="enterer"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERER_VALUE = 0;

	/**
	 * The '<em><b>Performer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Performer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORMER
	 * @model name="performer"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORMER_VALUE = 1;

	/**
	 * The '<em><b>Author</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Author</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHOR
	 * @model name="author"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_VALUE = 2;

	/**
	 * The '<em><b>Verifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERIFIER
	 * @model name="verifier"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFIER_VALUE = 3;

	/**
	 * The '<em><b>Attester</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attester</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTESTER
	 * @model name="attester"
	 * @generated
	 * @ordered
	 */
	public static final int ATTESTER_VALUE = 4;

	/**
	 * The '<em><b>Informant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Informant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFORMANT
	 * @model name="informant"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMANT_VALUE = 5;

	/**
	 * The '<em><b>Custodian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custodian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTODIAN
	 * @model name="custodian"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTODIAN_VALUE = 6;

	/**
	 * The '<em><b>Assembler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assembler</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSEMBLER
	 * @model name="assembler"
	 * @generated
	 * @ordered
	 */
	public static final int ASSEMBLER_VALUE = 7;

	/**
	 * The '<em><b>Composer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSER
	 * @model name="composer"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSER_VALUE = 8;

	/**
	 * An array of all the '<em><b>Provenance Participant Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProvenanceParticipantRole[] VALUES_ARRAY =
		new ProvenanceParticipantRole[] {
			ENTERER,
			PERFORMER,
			AUTHOR,
			VERIFIER,
			ATTESTER,
			INFORMANT,
			CUSTODIAN,
			ASSEMBLER,
			COMPOSER,
		};

	/**
	 * A public read-only list of all the '<em><b>Provenance Participant Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProvenanceParticipantRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provenance Participant Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceParticipantRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceParticipantRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Participant Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceParticipantRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceParticipantRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Participant Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceParticipantRole get(int value) {
		switch (value) {
			case ENTERER_VALUE: return ENTERER;
			case PERFORMER_VALUE: return PERFORMER;
			case AUTHOR_VALUE: return AUTHOR;
			case VERIFIER_VALUE: return VERIFIER;
			case ATTESTER_VALUE: return ATTESTER;
			case INFORMANT_VALUE: return INFORMANT;
			case CUSTODIAN_VALUE: return CUSTODIAN;
			case ASSEMBLER_VALUE: return ASSEMBLER;
			case COMPOSER_VALUE: return COMPOSER;
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
	private ProvenanceParticipantRole(int value, String name, String literal) {
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
	
} //ProvenanceParticipantRole
