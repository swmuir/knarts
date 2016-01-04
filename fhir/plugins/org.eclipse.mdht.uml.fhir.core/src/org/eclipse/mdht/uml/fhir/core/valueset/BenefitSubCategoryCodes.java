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
 * A representation of the literals of the enumeration '<em><b>Benefit Sub Category Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getBenefitSubCategoryCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Benefit SubCategory Codes'"
 * @generated
 */
public enum BenefitSubCategoryCodes implements Enumerator {
	/**
	 * The '<em><b>Oralbasic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORALBASIC_VALUE
	 * @generated
	 * @ordered
	 */
	ORALBASIC(0, "oralbasic", "oralbasic"),

	/**
	 * The '<em><b>Oralmajor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORALMAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	ORALMAJOR(1, "oralmajor", "oralmajor"),

	/**
	 * The '<em><b>Oralortho</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORALORTHO_VALUE
	 * @generated
	 * @ordered
	 */
	ORALORTHO(2, "oralortho", "oralortho"),

	/**
	 * The '<em><b>Visionexam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIONEXAM_VALUE
	 * @generated
	 * @ordered
	 */
	VISIONEXAM(3, "visionexam", "visionexam"),

	/**
	 * The '<em><b>Visionglasses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIONGLASSES_VALUE
	 * @generated
	 * @ordered
	 */
	VISIONGLASSES(4, "visionglasses", "visionglasses"),

	/**
	 * The '<em><b>Visioncontacts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIONCONTACTS_VALUE
	 * @generated
	 * @ordered
	 */
	VISIONCONTACTS(5, "visioncontacts", "visioncontacts"),

	/**
	 * The '<em><b>Medicalprimarycare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICALPRIMARYCARE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICALPRIMARYCARE(6, "medicalprimarycare", "medicalprimarycare"),

	/**
	 * The '<em><b>Pharmacydispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACYDISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACYDISPENSE(7, "pharmacydispense", "pharmacydispense");

	/**
	 * The '<em><b>Oralbasic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oralbasic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORALBASIC
	 * @model name="oralbasic"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='oral-basic'"
	 * @generated
	 * @ordered
	 */
	public static final int ORALBASIC_VALUE = 0;

	/**
	 * The '<em><b>Oralmajor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oralmajor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORALMAJOR
	 * @model name="oralmajor"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='oral-major'"
	 * @generated
	 * @ordered
	 */
	public static final int ORALMAJOR_VALUE = 1;

	/**
	 * The '<em><b>Oralortho</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oralortho</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORALORTHO
	 * @model name="oralortho"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='oral-ortho'"
	 * @generated
	 * @ordered
	 */
	public static final int ORALORTHO_VALUE = 2;

	/**
	 * The '<em><b>Visionexam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visionexam</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIONEXAM
	 * @model name="visionexam"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vision-exam'"
	 * @generated
	 * @ordered
	 */
	public static final int VISIONEXAM_VALUE = 3;

	/**
	 * The '<em><b>Visionglasses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visionglasses</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIONGLASSES
	 * @model name="visionglasses"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vision-glasses'"
	 * @generated
	 * @ordered
	 */
	public static final int VISIONGLASSES_VALUE = 4;

	/**
	 * The '<em><b>Visioncontacts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visioncontacts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIONCONTACTS
	 * @model name="visioncontacts"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vision-contacts'"
	 * @generated
	 * @ordered
	 */
	public static final int VISIONCONTACTS_VALUE = 5;

	/**
	 * The '<em><b>Medicalprimarycare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicalprimarycare</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICALPRIMARYCARE
	 * @model name="medicalprimarycare"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='medical-primarycare'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICALPRIMARYCARE_VALUE = 6;

	/**
	 * The '<em><b>Pharmacydispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacydispense</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACYDISPENSE
	 * @model name="pharmacydispense"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='pharmacy-dispense'"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACYDISPENSE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Benefit Sub Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BenefitSubCategoryCodes[] VALUES_ARRAY =
		new BenefitSubCategoryCodes[] {
			ORALBASIC,
			ORALMAJOR,
			ORALORTHO,
			VISIONEXAM,
			VISIONGLASSES,
			VISIONCONTACTS,
			MEDICALPRIMARYCARE,
			PHARMACYDISPENSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Benefit Sub Category Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BenefitSubCategoryCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Benefit Sub Category Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BenefitSubCategoryCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BenefitSubCategoryCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Benefit Sub Category Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BenefitSubCategoryCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BenefitSubCategoryCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Benefit Sub Category Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BenefitSubCategoryCodes get(int value) {
		switch (value) {
			case ORALBASIC_VALUE: return ORALBASIC;
			case ORALMAJOR_VALUE: return ORALMAJOR;
			case ORALORTHO_VALUE: return ORALORTHO;
			case VISIONEXAM_VALUE: return VISIONEXAM;
			case VISIONGLASSES_VALUE: return VISIONGLASSES;
			case VISIONCONTACTS_VALUE: return VISIONCONTACTS;
			case MEDICALPRIMARYCARE_VALUE: return MEDICALPRIMARYCARE;
			case PHARMACYDISPENSE_VALUE: return PHARMACYDISPENSE;
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
	private BenefitSubCategoryCodes(int value, String name, String literal) {
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
	
} //BenefitSubCategoryCodes
