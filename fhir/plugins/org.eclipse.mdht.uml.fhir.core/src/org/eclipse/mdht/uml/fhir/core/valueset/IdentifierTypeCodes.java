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
 * A representation of the literals of the enumeration '<em><b>Identifier Type Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getIdentifierTypeCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Identifier Type Codes'"
 * @generated
 */
public enum IdentifierTypeCodes implements Enumerator {
	/**
	 * The '<em><b>Udi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDI_VALUE
	 * @generated
	 * @ordered
	 */
	UDI(0, "udi", "udi"),

	/**
	 * The '<em><b>Sno</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNO_VALUE
	 * @generated
	 * @ordered
	 */
	SNO(1, "sno", "sno"),

	/**
	 * The '<em><b>Sb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SB_VALUE
	 * @generated
	 * @ordered
	 */
	SB(2, "sb", "sb"),

	/**
	 * The '<em><b>Plac</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAC_VALUE
	 * @generated
	 * @ordered
	 */
	PLAC(3, "plac", "plac"),

	/**
	 * The '<em><b>Fill</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_VALUE
	 * @generated
	 * @ordered
	 */
	FILL(4, "fill", "fill");

	/**
	 * The '<em><b>Udi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Udi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UDI
	 * @model name="udi"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UDI'"
	 * @generated
	 * @ordered
	 */
	public static final int UDI_VALUE = 0;

	/**
	 * The '<em><b>Sno</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sno</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNO
	 * @model name="sno"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SNO'"
	 * @generated
	 * @ordered
	 */
	public static final int SNO_VALUE = 1;

	/**
	 * The '<em><b>Sb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SB
	 * @model name="sb"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SB'"
	 * @generated
	 * @ordered
	 */
	public static final int SB_VALUE = 2;

	/**
	 * The '<em><b>Plac</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plac</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAC
	 * @model name="plac"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PLAC'"
	 * @generated
	 * @ordered
	 */
	public static final int PLAC_VALUE = 3;

	/**
	 * The '<em><b>Fill</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fill</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL
	 * @model name="fill"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FILL'"
	 * @generated
	 * @ordered
	 */
	public static final int FILL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Identifier Type Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentifierTypeCodes[] VALUES_ARRAY =
		new IdentifierTypeCodes[] {
			UDI,
			SNO,
			SB,
			PLAC,
			FILL,
		};

	/**
	 * A public read-only list of all the '<em><b>Identifier Type Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentifierTypeCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identifier Type Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierTypeCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierTypeCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Type Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierTypeCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierTypeCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Type Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierTypeCodes get(int value) {
		switch (value) {
			case UDI_VALUE: return UDI;
			case SNO_VALUE: return SNO;
			case SB_VALUE: return SB;
			case PLAC_VALUE: return PLAC;
			case FILL_VALUE: return FILL;
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
	private IdentifierTypeCodes(int value, String name, String literal) {
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
	
} //IdentifierTypeCodes
