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
 * A representation of the literals of the enumeration '<em><b>Basic Resource Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getBasicResourceTypes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Basic Resource Types'"
 * @generated
 */
public enum BasicResourceTypes implements Enumerator {
	/**
	 * The '<em><b>Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENT(0, "consent", "consent"),

	/**
	 * The '<em><b>Referral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERRAL_VALUE
	 * @generated
	 * @ordered
	 */
	REFERRAL(1, "referral", "referral"),

	/**
	 * The '<em><b>Advevent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVEVENT_VALUE
	 * @generated
	 * @ordered
	 */
	ADVEVENT(2, "advevent", "advevent"),

	/**
	 * The '<em><b>Aptmtreq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APTMTREQ_VALUE
	 * @generated
	 * @ordered
	 */
	APTMTREQ(3, "aptmtreq", "aptmtreq"),

	/**
	 * The '<em><b>Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER(4, "transfer", "transfer"),

	/**
	 * The '<em><b>Diet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIET_VALUE
	 * @generated
	 * @ordered
	 */
	DIET(5, "diet", "diet"),

	/**
	 * The '<em><b>Adminact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINACT_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINACT(6, "adminact", "adminact"),

	/**
	 * The '<em><b>Exposure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPOSURE(7, "exposure", "exposure"),

	/**
	 * The '<em><b>Investigation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVESTIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	INVESTIGATION(8, "investigation", "investigation"),

	/**
	 * The '<em><b>Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT(9, "account", "account"),

	/**
	 * The '<em><b>Invoice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOICE_VALUE
	 * @generated
	 * @ordered
	 */
	INVOICE(10, "invoice", "invoice"),

	/**
	 * The '<em><b>Adjudicat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJUDICAT_VALUE
	 * @generated
	 * @ordered
	 */
	ADJUDICAT(11, "adjudicat", "adjudicat"),

	/**
	 * The '<em><b>Predetreq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDETREQ_VALUE
	 * @generated
	 * @ordered
	 */
	PREDETREQ(12, "predetreq", "predetreq"),

	/**
	 * The '<em><b>Predetermine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDETERMINE_VALUE
	 * @generated
	 * @ordered
	 */
	PREDETERMINE(13, "predetermine", "predetermine"),

	/**
	 * The '<em><b>Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	STUDY(14, "study", "study"),

	/**
	 * The '<em><b>Protocol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL(15, "protocol", "protocol");

	/**
	 * The '<em><b>Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSENT
	 * @model name="consent"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENT_VALUE = 0;

	/**
	 * The '<em><b>Referral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Referral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERRAL
	 * @model name="referral"
	 * @generated
	 * @ordered
	 */
	public static final int REFERRAL_VALUE = 1;

	/**
	 * The '<em><b>Advevent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Advevent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADVEVENT
	 * @model name="advevent"
	 * @generated
	 * @ordered
	 */
	public static final int ADVEVENT_VALUE = 2;

	/**
	 * The '<em><b>Aptmtreq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aptmtreq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APTMTREQ
	 * @model name="aptmtreq"
	 * @generated
	 * @ordered
	 */
	public static final int APTMTREQ_VALUE = 3;

	/**
	 * The '<em><b>Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transfer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFER
	 * @model name="transfer"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_VALUE = 4;

	/**
	 * The '<em><b>Diet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIET
	 * @model name="diet"
	 * @generated
	 * @ordered
	 */
	public static final int DIET_VALUE = 5;

	/**
	 * The '<em><b>Adminact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adminact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMINACT
	 * @model name="adminact"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINACT_VALUE = 6;

	/**
	 * The '<em><b>Exposure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exposure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPOSURE
	 * @model name="exposure"
	 * @generated
	 * @ordered
	 */
	public static final int EXPOSURE_VALUE = 7;

	/**
	 * The '<em><b>Investigation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Investigation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVESTIGATION
	 * @model name="investigation"
	 * @generated
	 * @ordered
	 */
	public static final int INVESTIGATION_VALUE = 8;

	/**
	 * The '<em><b>Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Account</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT
	 * @model name="account"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_VALUE = 9;

	/**
	 * The '<em><b>Invoice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invoice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVOICE
	 * @model name="invoice"
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE_VALUE = 10;

	/**
	 * The '<em><b>Adjudicat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adjudicat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJUDICAT
	 * @model name="adjudicat"
	 * @generated
	 * @ordered
	 */
	public static final int ADJUDICAT_VALUE = 11;

	/**
	 * The '<em><b>Predetreq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Predetreq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREDETREQ
	 * @model name="predetreq"
	 * @generated
	 * @ordered
	 */
	public static final int PREDETREQ_VALUE = 12;

	/**
	 * The '<em><b>Predetermine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Predetermine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREDETERMINE
	 * @model name="predetermine"
	 * @generated
	 * @ordered
	 */
	public static final int PREDETERMINE_VALUE = 13;

	/**
	 * The '<em><b>Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Study</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STUDY
	 * @model name="study"
	 * @generated
	 * @ordered
	 */
	public static final int STUDY_VALUE = 14;

	/**
	 * The '<em><b>Protocol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protocol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL
	 * @model name="protocol"
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_VALUE = 15;

	/**
	 * An array of all the '<em><b>Basic Resource Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BasicResourceTypes[] VALUES_ARRAY =
		new BasicResourceTypes[] {
			CONSENT,
			REFERRAL,
			ADVEVENT,
			APTMTREQ,
			TRANSFER,
			DIET,
			ADMINACT,
			EXPOSURE,
			INVESTIGATION,
			ACCOUNT,
			INVOICE,
			ADJUDICAT,
			PREDETREQ,
			PREDETERMINE,
			STUDY,
			PROTOCOL,
		};

	/**
	 * A public read-only list of all the '<em><b>Basic Resource Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BasicResourceTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Basic Resource Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BasicResourceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasicResourceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basic Resource Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BasicResourceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasicResourceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basic Resource Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BasicResourceTypes get(int value) {
		switch (value) {
			case CONSENT_VALUE: return CONSENT;
			case REFERRAL_VALUE: return REFERRAL;
			case ADVEVENT_VALUE: return ADVEVENT;
			case APTMTREQ_VALUE: return APTMTREQ;
			case TRANSFER_VALUE: return TRANSFER;
			case DIET_VALUE: return DIET;
			case ADMINACT_VALUE: return ADMINACT;
			case EXPOSURE_VALUE: return EXPOSURE;
			case INVESTIGATION_VALUE: return INVESTIGATION;
			case ACCOUNT_VALUE: return ACCOUNT;
			case INVOICE_VALUE: return INVOICE;
			case ADJUDICAT_VALUE: return ADJUDICAT;
			case PREDETREQ_VALUE: return PREDETREQ;
			case PREDETERMINE_VALUE: return PREDETERMINE;
			case STUDY_VALUE: return STUDY;
			case PROTOCOL_VALUE: return PROTOCOL;
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
	private BasicResourceTypes(int value, String name, String literal) {
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
	
} //BasicResourceTypes
