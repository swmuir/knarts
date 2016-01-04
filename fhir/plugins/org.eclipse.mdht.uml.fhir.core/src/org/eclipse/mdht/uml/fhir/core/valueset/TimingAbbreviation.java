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
 * A representation of the literals of the enumeration '<em><b>Timing Abbreviation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getTimingAbbreviation()
 * @model
 * @generated
 */
public enum TimingAbbreviation implements Enumerator {
	/**
	 * The '<em><b>Qd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QD_VALUE
	 * @generated
	 * @ordered
	 */
	QD(0, "qd", "qd"),

	/**
	 * The '<em><b>Qod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QOD_VALUE
	 * @generated
	 * @ordered
	 */
	QOD(1, "qod", "qod"),

	/**
	 * The '<em><b>Q4h</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Q4H_VALUE
	 * @generated
	 * @ordered
	 */
	Q4H(2, "q4h", "q4h"),

	/**
	 * The '<em><b>Q6h</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Q6H_VALUE
	 * @generated
	 * @ordered
	 */
	Q6H(3, "q6h", "q6h");

	/**
	 * The '<em><b>Qd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QD
	 * @model name="qd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='QD'"
	 * @generated
	 * @ordered
	 */
	public static final int QD_VALUE = 0;

	/**
	 * The '<em><b>Qod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qod</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QOD
	 * @model name="qod"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='QOD'"
	 * @generated
	 * @ordered
	 */
	public static final int QOD_VALUE = 1;

	/**
	 * The '<em><b>Q4h</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Q4h</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #Q4H
	 * @model name="q4h"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Q4H'"
	 * @generated
	 * @ordered
	 */
	public static final int Q4H_VALUE = 2;

	/**
	 * The '<em><b>Q6h</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Q6h</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #Q6H
	 * @model name="q6h"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Q6H'"
	 * @generated
	 * @ordered
	 */
	public static final int Q6H_VALUE = 3;

	/**
	 * An array of all the '<em><b>Timing Abbreviation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimingAbbreviation[] VALUES_ARRAY =
		new TimingAbbreviation[] {
			QD,
			QOD,
			Q4H,
			Q6H,
		};

	/**
	 * A public read-only list of all the '<em><b>Timing Abbreviation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimingAbbreviation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Timing Abbreviation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingAbbreviation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingAbbreviation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Abbreviation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingAbbreviation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimingAbbreviation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Timing Abbreviation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimingAbbreviation get(int value) {
		switch (value) {
			case QD_VALUE: return QD;
			case QOD_VALUE: return QOD;
			case Q4H_VALUE: return Q4H;
			case Q6H_VALUE: return Q6H;
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
	private TimingAbbreviation(int value, String name, String literal) {
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
	
} //TimingAbbreviation
