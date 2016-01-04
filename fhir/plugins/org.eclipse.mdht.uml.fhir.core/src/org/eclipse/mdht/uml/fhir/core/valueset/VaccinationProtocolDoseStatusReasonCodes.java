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
 * A representation of the literals of the enumeration '<em><b>Vaccination Protocol Dose Status Reason Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getVaccinationProtocolDoseStatusReasonCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Vaccination Protocol Dose Status Reason codes'"
 * @generated
 */
public enum VaccinationProtocolDoseStatusReasonCodes implements Enumerator {
	/**
	 * The '<em><b>Advstorage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVSTORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ADVSTORAGE(0, "advstorage", "advstorage"),

	/**
	 * The '<em><b>Coldchbrk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLDCHBRK_VALUE
	 * @generated
	 * @ordered
	 */
	COLDCHBRK(1, "coldchbrk", "coldchbrk"),

	/**
	 * The '<em><b>Explot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLOT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLOT(2, "explot", "explot"),

	/**
	 * The '<em><b>Outsidesched</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTSIDESCHED_VALUE
	 * @generated
	 * @ordered
	 */
	OUTSIDESCHED(3, "outsidesched", "outsidesched"),

	/**
	 * The '<em><b>Prodrecall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODRECALL_VALUE
	 * @generated
	 * @ordered
	 */
	PRODRECALL(4, "prodrecall", "prodrecall");

	/**
	 * The '<em><b>Advstorage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Advstorage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADVSTORAGE
	 * @model name="advstorage"
	 * @generated
	 * @ordered
	 */
	public static final int ADVSTORAGE_VALUE = 0;

	/**
	 * The '<em><b>Coldchbrk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coldchbrk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLDCHBRK
	 * @model name="coldchbrk"
	 * @generated
	 * @ordered
	 */
	public static final int COLDCHBRK_VALUE = 1;

	/**
	 * The '<em><b>Explot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Explot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPLOT
	 * @model name="explot"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLOT_VALUE = 2;

	/**
	 * The '<em><b>Outsidesched</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Outsidesched</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTSIDESCHED
	 * @model name="outsidesched"
	 * @generated
	 * @ordered
	 */
	public static final int OUTSIDESCHED_VALUE = 3;

	/**
	 * The '<em><b>Prodrecall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prodrecall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODRECALL
	 * @model name="prodrecall"
	 * @generated
	 * @ordered
	 */
	public static final int PRODRECALL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Vaccination Protocol Dose Status Reason Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VaccinationProtocolDoseStatusReasonCodes[] VALUES_ARRAY =
		new VaccinationProtocolDoseStatusReasonCodes[] {
			ADVSTORAGE,
			COLDCHBRK,
			EXPLOT,
			OUTSIDESCHED,
			PRODRECALL,
		};

	/**
	 * A public read-only list of all the '<em><b>Vaccination Protocol Dose Status Reason Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VaccinationProtocolDoseStatusReasonCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vaccination Protocol Dose Status Reason Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VaccinationProtocolDoseStatusReasonCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VaccinationProtocolDoseStatusReasonCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vaccination Protocol Dose Status Reason Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VaccinationProtocolDoseStatusReasonCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VaccinationProtocolDoseStatusReasonCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vaccination Protocol Dose Status Reason Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VaccinationProtocolDoseStatusReasonCodes get(int value) {
		switch (value) {
			case ADVSTORAGE_VALUE: return ADVSTORAGE;
			case COLDCHBRK_VALUE: return COLDCHBRK;
			case EXPLOT_VALUE: return EXPLOT;
			case OUTSIDESCHED_VALUE: return OUTSIDESCHED;
			case PRODRECALL_VALUE: return PRODRECALL;
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
	private VaccinationProtocolDoseStatusReasonCodes(int value, String name, String literal) {
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
	
} //VaccinationProtocolDoseStatusReasonCodes
