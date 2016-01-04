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
 * A representation of the literals of the enumeration '<em><b>Restful Security Service</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getRestfulSecurityService()
 * @model
 * @generated
 */
public enum RestfulSecurityService implements Enumerator {
	/**
	 * The '<em><b>OAuth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAUTH_VALUE
	 * @generated
	 * @ordered
	 */
	OAUTH(0, "oAuth", "oAuth"),

	/**
	 * The '<em><b>Smar Ton Fhir</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMAR_TON_FHIR_VALUE
	 * @generated
	 * @ordered
	 */
	SMAR_TON_FHIR(1, "smarTonFhir", "smarTonFhir"),

	/**
	 * The '<em><b>Ntlm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NTLM_VALUE
	 * @generated
	 * @ordered
	 */
	NTLM(2, "ntlm", "ntlm"),

	/**
	 * The '<em><b>Basic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC(3, "basic", "basic"),

	/**
	 * The '<em><b>Kerberos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KERBEROS_VALUE
	 * @generated
	 * @ordered
	 */
	KERBEROS(4, "kerberos", "kerberos"),

	/**
	 * The '<em><b>Certificates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATES_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATES(5, "certificates", "certificates");

	/**
	 * The '<em><b>OAuth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OAuth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OAUTH
	 * @model name="oAuth"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OAuth'"
	 * @generated
	 * @ordered
	 */
	public static final int OAUTH_VALUE = 0;

	/**
	 * The '<em><b>Smar Ton Fhir</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smar Ton Fhir</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMAR_TON_FHIR
	 * @model name="smarTonFhir"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SMART-on-FHIR'"
	 * @generated
	 * @ordered
	 */
	public static final int SMAR_TON_FHIR_VALUE = 1;

	/**
	 * The '<em><b>Ntlm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ntlm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NTLM
	 * @model name="ntlm"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NTLM'"
	 * @generated
	 * @ordered
	 */
	public static final int NTLM_VALUE = 2;

	/**
	 * The '<em><b>Basic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIC
	 * @model name="basic"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Basic'"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_VALUE = 3;

	/**
	 * The '<em><b>Kerberos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kerberos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KERBEROS
	 * @model name="kerberos"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Kerberos'"
	 * @generated
	 * @ordered
	 */
	public static final int KERBEROS_VALUE = 4;

	/**
	 * The '<em><b>Certificates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Certificates</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATES
	 * @model name="certificates"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certificates'"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATES_VALUE = 5;

	/**
	 * An array of all the '<em><b>Restful Security Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RestfulSecurityService[] VALUES_ARRAY =
		new RestfulSecurityService[] {
			OAUTH,
			SMAR_TON_FHIR,
			NTLM,
			BASIC,
			KERBEROS,
			CERTIFICATES,
		};

	/**
	 * A public read-only list of all the '<em><b>Restful Security Service</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RestfulSecurityService> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Restful Security Service</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestfulSecurityService get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestfulSecurityService result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Restful Security Service</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestfulSecurityService getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestfulSecurityService result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Restful Security Service</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RestfulSecurityService get(int value) {
		switch (value) {
			case OAUTH_VALUE: return OAUTH;
			case SMAR_TON_FHIR_VALUE: return SMAR_TON_FHIR;
			case NTLM_VALUE: return NTLM;
			case BASIC_VALUE: return BASIC;
			case KERBEROS_VALUE: return KERBEROS;
			case CERTIFICATES_VALUE: return CERTIFICATES;
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
	private RestfulSecurityService(int value, String name, String literal) {
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
	
} //RestfulSecurityService
