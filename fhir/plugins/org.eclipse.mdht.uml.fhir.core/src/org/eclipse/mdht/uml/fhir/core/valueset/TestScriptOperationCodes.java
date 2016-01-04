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
 * A representation of the literals of the enumeration '<em><b>Test Script Operation Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getTestScriptOperationCodes()
 * @model
 * @generated
 */
public enum TestScriptOperationCodes implements Enumerator {
	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(0, "read", "read"),

	/**
	 * The '<em><b>Vread</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VREAD_VALUE
	 * @generated
	 * @ordered
	 */
	VREAD(1, "vread", "vread"),

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(2, "update", "update"),

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(3, "delete", "delete"),

	/**
	 * The '<em><b>History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY(4, "history", "history"),

	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(5, "create", "create"),

	/**
	 * The '<em><b>Search</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH(6, "search", "search"),

	/**
	 * The '<em><b>Transaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION(7, "transaction", "transaction"),

	/**
	 * The '<em><b>Conformance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFORMANCE(8, "conformance", "conformance"),

	/**
	 * The '<em><b>Closure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSURE(9, "closure", "closure"),

	/**
	 * The '<em><b>Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT(10, "document", "document"),

	/**
	 * The '<em><b>Everything</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERYTHING_VALUE
	 * @generated
	 * @ordered
	 */
	EVERYTHING(11, "everything", "everything"),

	/**
	 * The '<em><b>Expand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPAND_VALUE
	 * @generated
	 * @ordered
	 */
	EXPAND(12, "expand", "expand"),

	/**
	 * The '<em><b>Find</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIND_VALUE
	 * @generated
	 * @ordered
	 */
	FIND(13, "find", "find"),

	/**
	 * The '<em><b>Lookup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOKUP_VALUE
	 * @generated
	 * @ordered
	 */
	LOOKUP(14, "lookup", "lookup"),

	/**
	 * The '<em><b>Meta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_VALUE
	 * @generated
	 * @ordered
	 */
	META(15, "meta", "meta"),

	/**
	 * The '<em><b>Metaadd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAADD_VALUE
	 * @generated
	 * @ordered
	 */
	METAADD(16, "metaadd", "metaadd"),

	/**
	 * The '<em><b>Metadelete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADELETE_VALUE
	 * @generated
	 * @ordered
	 */
	METADELETE(17, "metadelete", "metadelete"),

	/**
	 * The '<em><b>Populate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPULATE_VALUE
	 * @generated
	 * @ordered
	 */
	POPULATE(18, "populate", "populate"),

	/**
	 * The '<em><b>Processmessage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSMESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSMESSAGE(19, "processmessage", "processmessage"),

	/**
	 * The '<em><b>Questionnaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTIONNAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE(20, "questionnaire", "questionnaire"),

	/**
	 * The '<em><b>Translate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSLATE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSLATE(21, "translate", "translate"),

	/**
	 * The '<em><b>Validate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATE_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATE(22, "validate", "validate"),

	/**
	 * The '<em><b>Validatecode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATECODE_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATECODE(23, "validatecode", "validatecode");

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @model name="read"
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 0;

	/**
	 * The '<em><b>Vread</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vread</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VREAD
	 * @model name="vread"
	 * @generated
	 * @ordered
	 */
	public static final int VREAD_VALUE = 1;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @model name="update"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 2;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 3;

	/**
	 * The '<em><b>History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HISTORY
	 * @model name="history"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_VALUE = 4;

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model name="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 5;

	/**
	 * The '<em><b>Search</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Search</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH
	 * @model name="search"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_VALUE = 6;

	/**
	 * The '<em><b>Transaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION
	 * @model name="transaction"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_VALUE = 7;

	/**
	 * The '<em><b>Conformance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conformance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFORMANCE
	 * @model name="conformance"
	 * @generated
	 * @ordered
	 */
	public static final int CONFORMANCE_VALUE = 8;

	/**
	 * The '<em><b>Closure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Closure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSURE
	 * @model name="closure"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSURE_VALUE = 9;

	/**
	 * The '<em><b>Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Document</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT
	 * @model name="document"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_VALUE = 10;

	/**
	 * The '<em><b>Everything</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Everything</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVERYTHING
	 * @model name="everything"
	 * @generated
	 * @ordered
	 */
	public static final int EVERYTHING_VALUE = 11;

	/**
	 * The '<em><b>Expand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Expand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPAND
	 * @model name="expand"
	 * @generated
	 * @ordered
	 */
	public static final int EXPAND_VALUE = 12;

	/**
	 * The '<em><b>Find</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Find</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIND
	 * @model name="find"
	 * @generated
	 * @ordered
	 */
	public static final int FIND_VALUE = 13;

	/**
	 * The '<em><b>Lookup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lookup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOKUP
	 * @model name="lookup"
	 * @generated
	 * @ordered
	 */
	public static final int LOOKUP_VALUE = 14;

	/**
	 * The '<em><b>Meta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #META
	 * @model name="meta"
	 * @generated
	 * @ordered
	 */
	public static final int META_VALUE = 15;

	/**
	 * The '<em><b>Metaadd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Metaadd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METAADD
	 * @model name="metaadd"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='meta-add'"
	 * @generated
	 * @ordered
	 */
	public static final int METAADD_VALUE = 16;

	/**
	 * The '<em><b>Metadelete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Metadelete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METADELETE
	 * @model name="metadelete"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='meta-delete'"
	 * @generated
	 * @ordered
	 */
	public static final int METADELETE_VALUE = 17;

	/**
	 * The '<em><b>Populate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Populate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POPULATE
	 * @model name="populate"
	 * @generated
	 * @ordered
	 */
	public static final int POPULATE_VALUE = 18;

	/**
	 * The '<em><b>Processmessage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Processmessage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSMESSAGE
	 * @model name="processmessage"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='process-message'"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSMESSAGE_VALUE = 19;

	/**
	 * The '<em><b>Questionnaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Questionnaire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUESTIONNAIRE
	 * @model name="questionnaire"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_VALUE = 20;

	/**
	 * The '<em><b>Translate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Translate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSLATE
	 * @model name="translate"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSLATE_VALUE = 21;

	/**
	 * The '<em><b>Validate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Validate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALIDATE
	 * @model name="validate"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATE_VALUE = 22;

	/**
	 * The '<em><b>Validatecode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Validatecode</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALIDATECODE
	 * @model name="validatecode"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='validate-code'"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATECODE_VALUE = 23;

	/**
	 * An array of all the '<em><b>Test Script Operation Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TestScriptOperationCodes[] VALUES_ARRAY =
		new TestScriptOperationCodes[] {
			READ,
			VREAD,
			UPDATE,
			DELETE,
			HISTORY,
			CREATE,
			SEARCH,
			TRANSACTION,
			CONFORMANCE,
			CLOSURE,
			DOCUMENT,
			EVERYTHING,
			EXPAND,
			FIND,
			LOOKUP,
			META,
			METAADD,
			METADELETE,
			POPULATE,
			PROCESSMESSAGE,
			QUESTIONNAIRE,
			TRANSLATE,
			VALIDATE,
			VALIDATECODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Test Script Operation Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TestScriptOperationCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Test Script Operation Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestScriptOperationCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestScriptOperationCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Script Operation Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestScriptOperationCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestScriptOperationCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Script Operation Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestScriptOperationCodes get(int value) {
		switch (value) {
			case READ_VALUE: return READ;
			case VREAD_VALUE: return VREAD;
			case UPDATE_VALUE: return UPDATE;
			case DELETE_VALUE: return DELETE;
			case HISTORY_VALUE: return HISTORY;
			case CREATE_VALUE: return CREATE;
			case SEARCH_VALUE: return SEARCH;
			case TRANSACTION_VALUE: return TRANSACTION;
			case CONFORMANCE_VALUE: return CONFORMANCE;
			case CLOSURE_VALUE: return CLOSURE;
			case DOCUMENT_VALUE: return DOCUMENT;
			case EVERYTHING_VALUE: return EVERYTHING;
			case EXPAND_VALUE: return EXPAND;
			case FIND_VALUE: return FIND;
			case LOOKUP_VALUE: return LOOKUP;
			case META_VALUE: return META;
			case METAADD_VALUE: return METAADD;
			case METADELETE_VALUE: return METADELETE;
			case POPULATE_VALUE: return POPULATE;
			case PROCESSMESSAGE_VALUE: return PROCESSMESSAGE;
			case QUESTIONNAIRE_VALUE: return QUESTIONNAIRE;
			case TRANSLATE_VALUE: return TRANSLATE;
			case VALIDATE_VALUE: return VALIDATE;
			case VALIDATECODE_VALUE: return VALIDATECODE;
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
	private TestScriptOperationCodes(int value, String name, String literal) {
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
	
} //TestScriptOperationCodes
