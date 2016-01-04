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
 * A representation of the literals of the enumeration '<em><b>Contact Entity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getContactEntityType()
 * @model
 * @generated
 */
public enum ContactEntityType implements Enumerator {
	/**
	 * The '<em><b>Bill</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BILL_VALUE
	 * @generated
	 * @ordered
	 */
	BILL(0, "bill", "bill"),

	/**
	 * The '<em><b>Admin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN_VALUE
	 * @generated
	 * @ordered
	 */
	ADMIN(1, "admin", "admin"),

	/**
	 * The '<em><b>Hr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HR_VALUE
	 * @generated
	 * @ordered
	 */
	HR(2, "hr", "hr"),

	/**
	 * The '<em><b>Payor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYOR_VALUE
	 * @generated
	 * @ordered
	 */
	PAYOR(3, "payor", "payor"),

	/**
	 * The '<em><b>Patinf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATINF_VALUE
	 * @generated
	 * @ordered
	 */
	PATINF(4, "patinf", "patinf"),

	/**
	 * The '<em><b>Press</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESS_VALUE
	 * @generated
	 * @ordered
	 */
	PRESS(5, "press", "press");

	/**
	 * The '<em><b>Bill</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bill</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BILL
	 * @model name="bill"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BILL'"
	 * @generated
	 * @ordered
	 */
	public static final int BILL_VALUE = 0;

	/**
	 * The '<em><b>Admin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Admin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMIN
	 * @model name="admin"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ADMIN'"
	 * @generated
	 * @ordered
	 */
	public static final int ADMIN_VALUE = 1;

	/**
	 * The '<em><b>Hr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HR
	 * @model name="hr"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HR'"
	 * @generated
	 * @ordered
	 */
	public static final int HR_VALUE = 2;

	/**
	 * The '<em><b>Payor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYOR
	 * @model name="payor"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PAYOR'"
	 * @generated
	 * @ordered
	 */
	public static final int PAYOR_VALUE = 3;

	/**
	 * The '<em><b>Patinf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patinf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATINF
	 * @model name="patinf"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PATINF'"
	 * @generated
	 * @ordered
	 */
	public static final int PATINF_VALUE = 4;

	/**
	 * The '<em><b>Press</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Press</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESS
	 * @model name="press"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PRESS'"
	 * @generated
	 * @ordered
	 */
	public static final int PRESS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Contact Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContactEntityType[] VALUES_ARRAY =
		new ContactEntityType[] {
			BILL,
			ADMIN,
			HR,
			PAYOR,
			PATINF,
			PRESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Contact Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContactEntityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contact Entity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactEntityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactEntityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Entity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactEntityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactEntityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Entity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContactEntityType get(int value) {
		switch (value) {
			case BILL_VALUE: return BILL;
			case ADMIN_VALUE: return ADMIN;
			case HR_VALUE: return HR;
			case PAYOR_VALUE: return PAYOR;
			case PATINF_VALUE: return PATINF;
			case PRESS_VALUE: return PRESS;
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
	private ContactEntityType(int value, String name, String literal) {
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
	
} //ContactEntityType
