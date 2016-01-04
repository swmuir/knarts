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
 * A representation of the literals of the enumeration '<em><b>Encounter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getEncounterType()
 * @model
 * @generated
 */
public enum EncounterType implements Enumerator {
	/**
	 * The '<em><b>Adms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMS_VALUE
	 * @generated
	 * @ordered
	 */
	ADMS(0, "adms", "adms"),

	/**
	 * The '<em><b>BDB Mclin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BDB_MCLIN_VALUE
	 * @generated
	 * @ordered
	 */
	BDB_MCLIN(1, "bDBMclin", "bDBMclin"),

	/**
	 * The '<em><b>Ccs60</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CCS60_VALUE
	 * @generated
	 * @ordered
	 */
	CCS60(2, "ccs60", "ccs60"),

	/**
	 * The '<em><b>Oki</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OKI_VALUE
	 * @generated
	 * @ordered
	 */
	OKI(3, "oki", "oki");

	/**
	 * The '<em><b>Adms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adms</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMS
	 * @model name="adms"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ADMS'"
	 * @generated
	 * @ordered
	 */
	public static final int ADMS_VALUE = 0;

	/**
	 * The '<em><b>BDB Mclin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BDB Mclin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BDB_MCLIN
	 * @model name="bDBMclin"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BD/BM-clin'"
	 * @generated
	 * @ordered
	 */
	public static final int BDB_MCLIN_VALUE = 1;

	/**
	 * The '<em><b>Ccs60</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ccs60</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CCS60
	 * @model name="ccs60"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CCS60'"
	 * @generated
	 * @ordered
	 */
	public static final int CCS60_VALUE = 2;

	/**
	 * The '<em><b>Oki</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oki</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OKI
	 * @model name="oki"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OKI'"
	 * @generated
	 * @ordered
	 */
	public static final int OKI_VALUE = 3;

	/**
	 * An array of all the '<em><b>Encounter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncounterType[] VALUES_ARRAY =
		new EncounterType[] {
			ADMS,
			BDB_MCLIN,
			CCS60,
			OKI,
		};

	/**
	 * A public read-only list of all the '<em><b>Encounter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncounterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encounter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncounterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encounter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncounterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encounter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterType get(int value) {
		switch (value) {
			case ADMS_VALUE: return ADMS;
			case BDB_MCLIN_VALUE: return BDB_MCLIN;
			case CCS60_VALUE: return CCS60;
			case OKI_VALUE: return OKI;
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
	private EncounterType(int value, String name, String literal) {
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
	
} //EncounterType
