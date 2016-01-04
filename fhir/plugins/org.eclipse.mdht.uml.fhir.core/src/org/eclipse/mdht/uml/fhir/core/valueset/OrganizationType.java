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
 * A representation of the literals of the enumeration '<em><b>Organization Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getOrganizationType()
 * @model
 * @generated
 */
public enum OrganizationType implements Enumerator {
	/**
	 * The '<em><b>Prov</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROV_VALUE
	 * @generated
	 * @ordered
	 */
	PROV(0, "prov", "prov"),

	/**
	 * The '<em><b>Dept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPT(1, "dept", "dept"),

	/**
	 * The '<em><b>Team</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	TEAM(2, "team", "team"),

	/**
	 * The '<em><b>Govt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOVT_VALUE
	 * @generated
	 * @ordered
	 */
	GOVT(3, "govt", "govt"),

	/**
	 * The '<em><b>Ins</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INS_VALUE
	 * @generated
	 * @ordered
	 */
	INS(4, "ins", "ins"),

	/**
	 * The '<em><b>Edu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDU_VALUE
	 * @generated
	 * @ordered
	 */
	EDU(5, "edu", "edu"),

	/**
	 * The '<em><b>Reli</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELI_VALUE
	 * @generated
	 * @ordered
	 */
	RELI(6, "reli", "reli"),

	/**
	 * The '<em><b>Crs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRS_VALUE
	 * @generated
	 * @ordered
	 */
	CRS(7, "crs", "crs"),

	/**
	 * The '<em><b>Cg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CG_VALUE
	 * @generated
	 * @ordered
	 */
	CG(8, "cg", "cg"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(9, "bus", "bus"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(10, "other", "other");

	/**
	 * The '<em><b>Prov</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prov</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROV
	 * @model name="prov"
	 * @generated
	 * @ordered
	 */
	public static final int PROV_VALUE = 0;

	/**
	 * The '<em><b>Dept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPT
	 * @model name="dept"
	 * @generated
	 * @ordered
	 */
	public static final int DEPT_VALUE = 1;

	/**
	 * The '<em><b>Team</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Team</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEAM
	 * @model name="team"
	 * @generated
	 * @ordered
	 */
	public static final int TEAM_VALUE = 2;

	/**
	 * The '<em><b>Govt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Govt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOVT
	 * @model name="govt"
	 * @generated
	 * @ordered
	 */
	public static final int GOVT_VALUE = 3;

	/**
	 * The '<em><b>Ins</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ins</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INS
	 * @model name="ins"
	 * @generated
	 * @ordered
	 */
	public static final int INS_VALUE = 4;

	/**
	 * The '<em><b>Edu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Edu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDU
	 * @model name="edu"
	 * @generated
	 * @ordered
	 */
	public static final int EDU_VALUE = 5;

	/**
	 * The '<em><b>Reli</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reli</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELI
	 * @model name="reli"
	 * @generated
	 * @ordered
	 */
	public static final int RELI_VALUE = 6;

	/**
	 * The '<em><b>Crs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Crs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRS
	 * @model name="crs"
	 * @generated
	 * @ordered
	 */
	public static final int CRS_VALUE = 7;

	/**
	 * The '<em><b>Cg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CG
	 * @model name="cg"
	 * @generated
	 * @ordered
	 */
	public static final int CG_VALUE = 8;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 9;

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
	public static final int OTHER_VALUE = 10;

	/**
	 * An array of all the '<em><b>Organization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrganizationType[] VALUES_ARRAY =
		new OrganizationType[] {
			PROV,
			DEPT,
			TEAM,
			GOVT,
			INS,
			EDU,
			RELI,
			CRS,
			CG,
			BUS,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Organization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrganizationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Organization Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrganizationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrganizationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Organization Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrganizationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrganizationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Organization Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrganizationType get(int value) {
		switch (value) {
			case PROV_VALUE: return PROV;
			case DEPT_VALUE: return DEPT;
			case TEAM_VALUE: return TEAM;
			case GOVT_VALUE: return GOVT;
			case INS_VALUE: return INS;
			case EDU_VALUE: return EDU;
			case RELI_VALUE: return RELI;
			case CRS_VALUE: return CRS;
			case CG_VALUE: return CG;
			case BUS_VALUE: return BUS;
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
	private OrganizationType(int value, String name, String literal) {
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
	
} //OrganizationType
