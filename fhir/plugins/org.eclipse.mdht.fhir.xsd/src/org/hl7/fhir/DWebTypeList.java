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
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DWeb Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDWebTypeList()
 * @model extendedMetaData="name='dWebType-list'"
 * @generated
 */
public enum DWebTypeList implements Enumerator {
	/**
	 * The '<em><b>WADORS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WADORS_VALUE
	 * @generated
	 * @ordered
	 */
	WADORS(0, "WADORS", "WADO-RS"),

	/**
	 * The '<em><b>WADOURI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WADOURI_VALUE
	 * @generated
	 * @ordered
	 */
	WADOURI(1, "WADOURI", "WADO-URI"),

	/**
	 * The '<em><b>IID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IID_VALUE
	 * @generated
	 * @ordered
	 */
	IID(2, "IID", "IID"),

	/**
	 * The '<em><b>WADOWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WADOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WADOWS(3, "WADOWS", "WADO-WS");

	/**
	 * The '<em><b>WADORS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WADO-RS
	 * <!-- end-model-doc -->
	 * @see #WADORS
	 * @model literal="WADO-RS"
	 * @generated
	 * @ordered
	 */
	public static final int WADORS_VALUE = 0;

	/**
	 * The '<em><b>WADOURI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WADO-URI
	 * <!-- end-model-doc -->
	 * @see #WADOURI
	 * @model literal="WADO-URI"
	 * @generated
	 * @ordered
	 */
	public static final int WADOURI_VALUE = 1;

	/**
	 * The '<em><b>IID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IID
	 * <!-- end-model-doc -->
	 * @see #IID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IID_VALUE = 2;

	/**
	 * The '<em><b>WADOWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WADO-WS
	 * <!-- end-model-doc -->
	 * @see #WADOWS
	 * @model literal="WADO-WS"
	 * @generated
	 * @ordered
	 */
	public static final int WADOWS_VALUE = 3;

	/**
	 * An array of all the '<em><b>DWeb Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DWebTypeList[] VALUES_ARRAY =
		new DWebTypeList[] {
			WADORS,
			WADOURI,
			IID,
			WADOWS,
		};

	/**
	 * A public read-only list of all the '<em><b>DWeb Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DWebTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DWeb Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DWebTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DWebTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DWeb Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DWebTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DWebTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DWeb Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DWebTypeList get(int value) {
		switch (value) {
			case WADORS_VALUE: return WADORS;
			case WADOURI_VALUE: return WADOURI;
			case IID_VALUE: return IID;
			case WADOWS_VALUE: return WADOWS;
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
	private DWebTypeList(int value, String name, String literal) {
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
	
} //DWebTypeList
