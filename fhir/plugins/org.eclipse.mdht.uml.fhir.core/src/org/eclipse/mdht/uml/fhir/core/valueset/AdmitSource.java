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
 * A representation of the literals of the enumeration '<em><b>Admit Source</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getAdmitSource()
 * @model
 * @generated
 */
public enum AdmitSource implements Enumerator {
	/**
	 * The '<em><b>Hosptrans</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPTRANS_VALUE
	 * @generated
	 * @ordered
	 */
	HOSPTRANS(0, "hosptrans", "hosptrans"),

	/**
	 * The '<em><b>Emd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMD_VALUE
	 * @generated
	 * @ordered
	 */
	EMD(1, "emd", "emd"),

	/**
	 * The '<em><b>Outp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTP_VALUE
	 * @generated
	 * @ordered
	 */
	OUTP(2, "outp", "outp"),

	/**
	 * The '<em><b>Born</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORN_VALUE
	 * @generated
	 * @ordered
	 */
	BORN(3, "born", "born"),

	/**
	 * The '<em><b>Gp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GP_VALUE
	 * @generated
	 * @ordered
	 */
	GP(4, "gp", "gp"),

	/**
	 * The '<em><b>Mp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP_VALUE
	 * @generated
	 * @ordered
	 */
	MP(5, "mp", "mp"),

	/**
	 * The '<em><b>Nursing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NURSING_VALUE
	 * @generated
	 * @ordered
	 */
	NURSING(6, "nursing", "nursing"),

	/**
	 * The '<em><b>Psych</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSYCH_VALUE
	 * @generated
	 * @ordered
	 */
	PSYCH(7, "psych", "psych"),

	/**
	 * The '<em><b>Rehab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REHAB_VALUE
	 * @generated
	 * @ordered
	 */
	REHAB(8, "rehab", "rehab"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(9, "other", "other");

	/**
	 * The '<em><b>Hosptrans</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hosptrans</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOSPTRANS
	 * @model name="hosptrans"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='hosp-trans'"
	 * @generated
	 * @ordered
	 */
	public static final int HOSPTRANS_VALUE = 0;

	/**
	 * The '<em><b>Emd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Emd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMD
	 * @model name="emd"
	 * @generated
	 * @ordered
	 */
	public static final int EMD_VALUE = 1;

	/**
	 * The '<em><b>Outp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Outp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTP
	 * @model name="outp"
	 * @generated
	 * @ordered
	 */
	public static final int OUTP_VALUE = 2;

	/**
	 * The '<em><b>Born</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Born</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BORN
	 * @model name="born"
	 * @generated
	 * @ordered
	 */
	public static final int BORN_VALUE = 3;

	/**
	 * The '<em><b>Gp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GP
	 * @model name="gp"
	 * @generated
	 * @ordered
	 */
	public static final int GP_VALUE = 4;

	/**
	 * The '<em><b>Mp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MP
	 * @model name="mp"
	 * @generated
	 * @ordered
	 */
	public static final int MP_VALUE = 5;

	/**
	 * The '<em><b>Nursing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nursing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NURSING
	 * @model name="nursing"
	 * @generated
	 * @ordered
	 */
	public static final int NURSING_VALUE = 6;

	/**
	 * The '<em><b>Psych</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Psych</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PSYCH
	 * @model name="psych"
	 * @generated
	 * @ordered
	 */
	public static final int PSYCH_VALUE = 7;

	/**
	 * The '<em><b>Rehab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rehab</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REHAB
	 * @model name="rehab"
	 * @generated
	 * @ordered
	 */
	public static final int REHAB_VALUE = 8;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 9;

	/**
	 * An array of all the '<em><b>Admit Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdmitSource[] VALUES_ARRAY =
		new AdmitSource[] {
			HOSPTRANS,
			EMD,
			OUTP,
			BORN,
			GP,
			MP,
			NURSING,
			PSYCH,
			REHAB,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Admit Source</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdmitSource> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Admit Source</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdmitSource get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdmitSource result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Admit Source</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdmitSource getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdmitSource result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Admit Source</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdmitSource get(int value) {
		switch (value) {
			case HOSPTRANS_VALUE: return HOSPTRANS;
			case EMD_VALUE: return EMD;
			case OUTP_VALUE: return OUTP;
			case BORN_VALUE: return BORN;
			case GP_VALUE: return GP;
			case MP_VALUE: return MP;
			case NURSING_VALUE: return NURSING;
			case PSYCH_VALUE: return PSYCH;
			case REHAB_VALUE: return REHAB;
			case OTHER_VALUE: return OTHER;
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
	private AdmitSource(int value, String name, String literal) {
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
	
} //AdmitSource
