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
 * A representation of the literals of the enumeration '<em><b>Operation Outcome Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.core.valueset.FhirValuesetPackage#getOperationOutcomeCodes()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Operation Outcome Codes'"
 * @generated
 */
public enum OperationOutcomeCodes implements Enumerator {
	/**
	 * The '<em><b>Msg Auth Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_AUTH_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_AUTH_REQUIRED(0, "msgAuthRequired", "msgAuthRequired"),

	/**
	 * The '<em><b>Msg Bad Format</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_BAD_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_BAD_FORMAT(1, "msgBadFormat", "msgBadFormat"),

	/**
	 * The '<em><b>Msg Bad Syntax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_BAD_SYNTAX_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_BAD_SYNTAX(2, "msgBadSyntax", "msgBadSyntax"),

	/**
	 * The '<em><b>Msg Cant Parse Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_CANT_PARSE_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_CANT_PARSE_CONTENT(3, "msgCantParseContent", "msgCantParseContent"),

	/**
	 * The '<em><b>Msg Cant Parse Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_CANT_PARSE_ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_CANT_PARSE_ROOT(4, "msgCantParseRoot", "msgCantParseRoot"),

	/**
	 * The '<em><b>Msg Created</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_CREATED(5, "msgCreated", "msgCreated"),

	/**
	 * The '<em><b>Msg Date Format</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_DATE_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_DATE_FORMAT(6, "msgDateFormat", "msgDateFormat"),

	/**
	 * The '<em><b>Msg Deleted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_DELETED(7, "msgDeleted", "msgDeleted"),

	/**
	 * The '<em><b>Msg Deleted Done</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_DELETED_DONE_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_DELETED_DONE(8, "msgDeletedDone", "msgDeletedDone"),

	/**
	 * The '<em><b>Msg Deleted Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_DELETED_ID_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_DELETED_ID(9, "msgDeletedId", "msgDeletedId"),

	/**
	 * The '<em><b>Msg Duplicate Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_DUPLICATE_ID_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_DUPLICATE_ID(10, "msgDuplicateId", "msgDuplicateId"),

	/**
	 * The '<em><b>Msg Error Parsing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_ERROR_PARSING_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_ERROR_PARSING(11, "msgErrorParsing", "msgErrorParsing"),

	/**
	 * The '<em><b>Msg Id Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_ID_INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_ID_INVALID(12, "msgIdInvalid", "msgIdInvalid"),

	/**
	 * The '<em><b>Msg Id Too Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_ID_TOO_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_ID_TOO_LONG(13, "msgIdTooLong", "msgIdTooLong"),

	/**
	 * The '<em><b>Msg Invalid Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_INVALID_ID_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_INVALID_ID(14, "msgInvalidId", "msgInvalidId"),

	/**
	 * The '<em><b>Msg Json Object</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_JSON_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_JSON_OBJECT(15, "msgJsonObject", "msgJsonObject"),

	/**
	 * The '<em><b>Msg Local Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_LOCAL_FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_LOCAL_FAIL(16, "msgLocalFail", "msgLocalFail"),

	/**
	 * The '<em><b>Msg No Match</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_NO_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_NO_MATCH(17, "msgNoMatch", "msgNoMatch"),

	/**
	 * The '<em><b>Msg No Exist</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_NO_EXIST_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_NO_EXIST(18, "msgNoExist", "msgNoExist"),

	/**
	 * The '<em><b>Msg No Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_NO_MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_NO_MODULE(19, "msgNoModule", "msgNoModule"),

	/**
	 * The '<em><b>Msg No Summary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_NO_SUMMARY_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_NO_SUMMARY(20, "msgNoSummary", "msgNoSummary"),

	/**
	 * The '<em><b>Msg Op Not Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_OP_NOT_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_OP_NOT_ALLOWED(21, "msgOpNotAllowed", "msgOpNotAllowed"),

	/**
	 * The '<em><b>Msg Param Chained</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_CHAINED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_PARAM_CHAINED(22, "msgParamChained", "msgParamChained"),

	/**
	 * The '<em><b>Msg Param No Repeat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_NO_REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_PARAM_NO_REPEAT(23, "msgParamNoRepeat", "msgParamNoRepeat"),

	/**
	 * The '<em><b>Msg Param Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_PARAM_UNKNOWN(24, "msgParamUnknown", "msgParamUnknown"),

	/**
	 * The '<em><b>Msg Param Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_PARAM_INVALID(25, "msgParamInvalid", "msgParamInvalid"),

	/**
	 * The '<em><b>Msg Param Modifier Invalid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_MODIFIER_INVALID_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_PARAM_MODIFIER_INVALID(26, "msgParamModifierInvalid", "msgParamModifierInvalid"),

	/**
	 * The '<em><b>Msg Resource Example Protected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_EXAMPLE_PROTECTED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_RESOURCE_EXAMPLE_PROTECTED(27, "msgResourceExampleProtected", "msgResourceExampleProtected"),

	/**
	 * The '<em><b>Msg Resource Id Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_ID_FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_RESOURCE_ID_FAIL(28, "msgResourceIdFail", "msgResourceIdFail"),

	/**
	 * The '<em><b>Msg Resource Not Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_NOT_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_RESOURCE_NOT_ALLOWED(29, "msgResourceNotAllowed", "msgResourceNotAllowed"),

	/**
	 * The '<em><b>Msg Resource Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_RESOURCE_REQUIRED(30, "msgResourceRequired", "msgResourceRequired"),

	/**
	 * The '<em><b>Msg Resource Id Mismatch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_ID_MISMATCH_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_RESOURCE_ID_MISMATCH(31, "msgResourceIdMismatch", "msgResourceIdMismatch"),

	/**
	 * The '<em><b>Msg Resource Id Missing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_ID_MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_RESOURCE_ID_MISSING(32, "msgResourceIdMissing", "msgResourceIdMissing"),

	/**
	 * The '<em><b>Msg Resource Type Mismatch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_TYPE_MISMATCH_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_RESOURCE_TYPE_MISMATCH(33, "msgResourceTypeMismatch", "msgResourceTypeMismatch"),

	/**
	 * The '<em><b>Msg Sort Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_SORT_UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_SORT_UNKNOWN(34, "msgSortUnknown", "msgSortUnknown"),

	/**
	 * The '<em><b>Msg Transaction Duplicate Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_TRANSACTION_DUPLICATE_ID_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_TRANSACTION_DUPLICATE_ID(35, "msgTransactionDuplicateId", "msgTransactionDuplicateId"),

	/**
	 * The '<em><b>Msg Transaction Missing Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_TRANSACTION_MISSING_ID_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_TRANSACTION_MISSING_ID(36, "msgTransactionMissingId", "msgTransactionMissingId"),

	/**
	 * The '<em><b>Msg Unhandled Node Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_UNHANDLED_NODE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_UNHANDLED_NODE_TYPE(37, "msgUnhandledNodeType", "msgUnhandledNodeType"),

	/**
	 * The '<em><b>Msg Unknown Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_UNKNOWN_CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_UNKNOWN_CONTENT(38, "msgUnknownContent", "msgUnknownContent"),

	/**
	 * The '<em><b>Msg Unknown Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_UNKNOWN_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_UNKNOWN_OPERATION(39, "msgUnknownOperation", "msgUnknownOperation"),

	/**
	 * The '<em><b>Msg Unknown Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_UNKNOWN_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_UNKNOWN_TYPE(40, "msgUnknownType", "msgUnknownType"),

	/**
	 * The '<em><b>Msg Updated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_UPDATED_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_UPDATED(41, "msgUpdated", "msgUpdated"),

	/**
	 * The '<em><b>Msg Version Aware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_VERSION_AWARE_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_VERSION_AWARE(42, "msgVersionAware", "msgVersionAware"),

	/**
	 * The '<em><b>Msg Version Aware Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_VERSION_AWARE_CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_VERSION_AWARE_CONFLICT(43, "msgVersionAwareConflict", "msgVersionAwareConflict"),

	/**
	 * The '<em><b>Msg Version Aware Url</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_VERSION_AWARE_URL_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_VERSION_AWARE_URL(44, "msgVersionAwareUrl", "msgVersionAwareUrl"),

	/**
	 * The '<em><b>Msg Wrong Ns</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSG_WRONG_NS_VALUE
	 * @generated
	 * @ordered
	 */
	MSG_WRONG_NS(45, "msgWrongNs", "msgWrongNs"),

	/**
	 * The '<em><b>Search Multiple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_MULTIPLE(46, "searchMultiple", "searchMultiple"),

	/**
	 * The '<em><b>Update Multiple Matches</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_MULTIPLE_MATCHES_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_MULTIPLE_MATCHES(47, "updateMultipleMatches", "updateMultipleMatches"),

	/**
	 * The '<em><b>Search None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_NONE(48, "searchNone", "searchNone");

	/**
	 * The '<em><b>Msg Auth Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Auth Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_AUTH_REQUIRED
	 * @model name="msgAuthRequired"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_AUTH_REQUIRED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_AUTH_REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>Msg Bad Format</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Bad Format</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_BAD_FORMAT
	 * @model name="msgBadFormat"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_BAD_FORMAT'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_BAD_FORMAT_VALUE = 1;

	/**
	 * The '<em><b>Msg Bad Syntax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Bad Syntax</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_BAD_SYNTAX
	 * @model name="msgBadSyntax"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_BAD_SYNTAX'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_BAD_SYNTAX_VALUE = 2;

	/**
	 * The '<em><b>Msg Cant Parse Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Cant Parse Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_CANT_PARSE_CONTENT
	 * @model name="msgCantParseContent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_CANT_PARSE_CONTENT'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_CANT_PARSE_CONTENT_VALUE = 3;

	/**
	 * The '<em><b>Msg Cant Parse Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Cant Parse Root</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_CANT_PARSE_ROOT
	 * @model name="msgCantParseRoot"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_CANT_PARSE_ROOT'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_CANT_PARSE_ROOT_VALUE = 4;

	/**
	 * The '<em><b>Msg Created</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Created</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_CREATED
	 * @model name="msgCreated"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_CREATED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_CREATED_VALUE = 5;

	/**
	 * The '<em><b>Msg Date Format</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Date Format</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_DATE_FORMAT
	 * @model name="msgDateFormat"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_DATE_FORMAT'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_DATE_FORMAT_VALUE = 6;

	/**
	 * The '<em><b>Msg Deleted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Deleted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_DELETED
	 * @model name="msgDeleted"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_DELETED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_DELETED_VALUE = 7;

	/**
	 * The '<em><b>Msg Deleted Done</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Deleted Done</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_DELETED_DONE
	 * @model name="msgDeletedDone"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_DELETED_DONE'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_DELETED_DONE_VALUE = 8;

	/**
	 * The '<em><b>Msg Deleted Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Deleted Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_DELETED_ID
	 * @model name="msgDeletedId"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_DELETED_ID'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_DELETED_ID_VALUE = 9;

	/**
	 * The '<em><b>Msg Duplicate Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Duplicate Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_DUPLICATE_ID
	 * @model name="msgDuplicateId"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_DUPLICATE_ID'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_DUPLICATE_ID_VALUE = 10;

	/**
	 * The '<em><b>Msg Error Parsing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Error Parsing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_ERROR_PARSING
	 * @model name="msgErrorParsing"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_ERROR_PARSING'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_ERROR_PARSING_VALUE = 11;

	/**
	 * The '<em><b>Msg Id Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Id Invalid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_ID_INVALID
	 * @model name="msgIdInvalid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_ID_INVALID'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_ID_INVALID_VALUE = 12;

	/**
	 * The '<em><b>Msg Id Too Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Id Too Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_ID_TOO_LONG
	 * @model name="msgIdTooLong"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_ID_TOO_LONG'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_ID_TOO_LONG_VALUE = 13;

	/**
	 * The '<em><b>Msg Invalid Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Invalid Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_INVALID_ID
	 * @model name="msgInvalidId"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_INVALID_ID'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_INVALID_ID_VALUE = 14;

	/**
	 * The '<em><b>Msg Json Object</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Json Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_JSON_OBJECT
	 * @model name="msgJsonObject"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_JSON_OBJECT'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_JSON_OBJECT_VALUE = 15;

	/**
	 * The '<em><b>Msg Local Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Local Fail</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_LOCAL_FAIL
	 * @model name="msgLocalFail"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_LOCAL_FAIL'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_LOCAL_FAIL_VALUE = 16;

	/**
	 * The '<em><b>Msg No Match</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg No Match</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_NO_MATCH
	 * @model name="msgNoMatch"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_NO_MATCH'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_NO_MATCH_VALUE = 17;

	/**
	 * The '<em><b>Msg No Exist</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg No Exist</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_NO_EXIST
	 * @model name="msgNoExist"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_NO_EXIST'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_NO_EXIST_VALUE = 18;

	/**
	 * The '<em><b>Msg No Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg No Module</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_NO_MODULE
	 * @model name="msgNoModule"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_NO_MODULE'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_NO_MODULE_VALUE = 19;

	/**
	 * The '<em><b>Msg No Summary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg No Summary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_NO_SUMMARY
	 * @model name="msgNoSummary"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_NO_SUMMARY'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_NO_SUMMARY_VALUE = 20;

	/**
	 * The '<em><b>Msg Op Not Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Op Not Allowed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_OP_NOT_ALLOWED
	 * @model name="msgOpNotAllowed"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_OP_NOT_ALLOWED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_OP_NOT_ALLOWED_VALUE = 21;

	/**
	 * The '<em><b>Msg Param Chained</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Param Chained</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_CHAINED
	 * @model name="msgParamChained"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_PARAM_CHAINED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_PARAM_CHAINED_VALUE = 22;

	/**
	 * The '<em><b>Msg Param No Repeat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Param No Repeat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_NO_REPEAT
	 * @model name="msgParamNoRepeat"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_PARAM_NO_REPEAT'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_PARAM_NO_REPEAT_VALUE = 23;

	/**
	 * The '<em><b>Msg Param Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Param Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_UNKNOWN
	 * @model name="msgParamUnknown"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_PARAM_UNKNOWN'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_PARAM_UNKNOWN_VALUE = 24;

	/**
	 * The '<em><b>Msg Param Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Param Invalid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_INVALID
	 * @model name="msgParamInvalid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_PARAM_INVALID'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_PARAM_INVALID_VALUE = 25;

	/**
	 * The '<em><b>Msg Param Modifier Invalid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Param Modifier Invalid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_PARAM_MODIFIER_INVALID
	 * @model name="msgParamModifierInvalid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_PARAM_MODIFIER_INVALID'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_PARAM_MODIFIER_INVALID_VALUE = 26;

	/**
	 * The '<em><b>Msg Resource Example Protected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Resource Example Protected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_EXAMPLE_PROTECTED
	 * @model name="msgResourceExampleProtected"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_RESOURCE_EXAMPLE_PROTECTED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_RESOURCE_EXAMPLE_PROTECTED_VALUE = 27;

	/**
	 * The '<em><b>Msg Resource Id Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Resource Id Fail</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_ID_FAIL
	 * @model name="msgResourceIdFail"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_RESOURCE_ID_FAIL'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_RESOURCE_ID_FAIL_VALUE = 28;

	/**
	 * The '<em><b>Msg Resource Not Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Resource Not Allowed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_NOT_ALLOWED
	 * @model name="msgResourceNotAllowed"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_RESOURCE_NOT_ALLOWED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_RESOURCE_NOT_ALLOWED_VALUE = 29;

	/**
	 * The '<em><b>Msg Resource Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Resource Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_REQUIRED
	 * @model name="msgResourceRequired"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_RESOURCE_REQUIRED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_RESOURCE_REQUIRED_VALUE = 30;

	/**
	 * The '<em><b>Msg Resource Id Mismatch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Resource Id Mismatch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_ID_MISMATCH
	 * @model name="msgResourceIdMismatch"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_RESOURCE_ID_MISMATCH'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_RESOURCE_ID_MISMATCH_VALUE = 31;

	/**
	 * The '<em><b>Msg Resource Id Missing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Resource Id Missing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_ID_MISSING
	 * @model name="msgResourceIdMissing"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_RESOURCE_ID_MISSING'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_RESOURCE_ID_MISSING_VALUE = 32;

	/**
	 * The '<em><b>Msg Resource Type Mismatch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Resource Type Mismatch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_RESOURCE_TYPE_MISMATCH
	 * @model name="msgResourceTypeMismatch"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_RESOURCE_TYPE_MISMATCH'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_RESOURCE_TYPE_MISMATCH_VALUE = 33;

	/**
	 * The '<em><b>Msg Sort Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Sort Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_SORT_UNKNOWN
	 * @model name="msgSortUnknown"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_SORT_UNKNOWN'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_SORT_UNKNOWN_VALUE = 34;

	/**
	 * The '<em><b>Msg Transaction Duplicate Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Transaction Duplicate Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_TRANSACTION_DUPLICATE_ID
	 * @model name="msgTransactionDuplicateId"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_TRANSACTION_DUPLICATE_ID'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_TRANSACTION_DUPLICATE_ID_VALUE = 35;

	/**
	 * The '<em><b>Msg Transaction Missing Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Transaction Missing Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_TRANSACTION_MISSING_ID
	 * @model name="msgTransactionMissingId"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_TRANSACTION_MISSING_ID'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_TRANSACTION_MISSING_ID_VALUE = 36;

	/**
	 * The '<em><b>Msg Unhandled Node Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Unhandled Node Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_UNHANDLED_NODE_TYPE
	 * @model name="msgUnhandledNodeType"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_UNHANDLED_NODE_TYPE'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_UNHANDLED_NODE_TYPE_VALUE = 37;

	/**
	 * The '<em><b>Msg Unknown Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Unknown Content</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_UNKNOWN_CONTENT
	 * @model name="msgUnknownContent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_UNKNOWN_CONTENT'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_UNKNOWN_CONTENT_VALUE = 38;

	/**
	 * The '<em><b>Msg Unknown Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Unknown Operation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_UNKNOWN_OPERATION
	 * @model name="msgUnknownOperation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_UNKNOWN_OPERATION'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_UNKNOWN_OPERATION_VALUE = 39;

	/**
	 * The '<em><b>Msg Unknown Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Unknown Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_UNKNOWN_TYPE
	 * @model name="msgUnknownType"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_UNKNOWN_TYPE'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_UNKNOWN_TYPE_VALUE = 40;

	/**
	 * The '<em><b>Msg Updated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Updated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_UPDATED
	 * @model name="msgUpdated"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_UPDATED'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_UPDATED_VALUE = 41;

	/**
	 * The '<em><b>Msg Version Aware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Version Aware</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_VERSION_AWARE
	 * @model name="msgVersionAware"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_VERSION_AWARE'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_VERSION_AWARE_VALUE = 42;

	/**
	 * The '<em><b>Msg Version Aware Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Version Aware Conflict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_VERSION_AWARE_CONFLICT
	 * @model name="msgVersionAwareConflict"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_VERSION_AWARE_CONFLICT'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_VERSION_AWARE_CONFLICT_VALUE = 43;

	/**
	 * The '<em><b>Msg Version Aware Url</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Version Aware Url</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_VERSION_AWARE_URL
	 * @model name="msgVersionAwareUrl"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_VERSION_AWARE_URL'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_VERSION_AWARE_URL_VALUE = 44;

	/**
	 * The '<em><b>Msg Wrong Ns</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msg Wrong Ns</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSG_WRONG_NS
	 * @model name="msgWrongNs"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MSG_WRONG_NS'"
	 * @generated
	 * @ordered
	 */
	public static final int MSG_WRONG_NS_VALUE = 45;

	/**
	 * The '<em><b>Search Multiple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Search Multiple</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH_MULTIPLE
	 * @model name="searchMultiple"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SEARCH_MULTIPLE'"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_MULTIPLE_VALUE = 46;

	/**
	 * The '<em><b>Update Multiple Matches</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update Multiple Matches</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_MULTIPLE_MATCHES
	 * @model name="updateMultipleMatches"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UPDATE_MULTIPLE_MATCHES'"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_MULTIPLE_MATCHES_VALUE = 47;

	/**
	 * The '<em><b>Search None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Search None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH_NONE
	 * @model name="searchNone"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SEARCH_NONE'"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_NONE_VALUE = 48;

	/**
	 * An array of all the '<em><b>Operation Outcome Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationOutcomeCodes[] VALUES_ARRAY =
		new OperationOutcomeCodes[] {
			MSG_AUTH_REQUIRED,
			MSG_BAD_FORMAT,
			MSG_BAD_SYNTAX,
			MSG_CANT_PARSE_CONTENT,
			MSG_CANT_PARSE_ROOT,
			MSG_CREATED,
			MSG_DATE_FORMAT,
			MSG_DELETED,
			MSG_DELETED_DONE,
			MSG_DELETED_ID,
			MSG_DUPLICATE_ID,
			MSG_ERROR_PARSING,
			MSG_ID_INVALID,
			MSG_ID_TOO_LONG,
			MSG_INVALID_ID,
			MSG_JSON_OBJECT,
			MSG_LOCAL_FAIL,
			MSG_NO_MATCH,
			MSG_NO_EXIST,
			MSG_NO_MODULE,
			MSG_NO_SUMMARY,
			MSG_OP_NOT_ALLOWED,
			MSG_PARAM_CHAINED,
			MSG_PARAM_NO_REPEAT,
			MSG_PARAM_UNKNOWN,
			MSG_PARAM_INVALID,
			MSG_PARAM_MODIFIER_INVALID,
			MSG_RESOURCE_EXAMPLE_PROTECTED,
			MSG_RESOURCE_ID_FAIL,
			MSG_RESOURCE_NOT_ALLOWED,
			MSG_RESOURCE_REQUIRED,
			MSG_RESOURCE_ID_MISMATCH,
			MSG_RESOURCE_ID_MISSING,
			MSG_RESOURCE_TYPE_MISMATCH,
			MSG_SORT_UNKNOWN,
			MSG_TRANSACTION_DUPLICATE_ID,
			MSG_TRANSACTION_MISSING_ID,
			MSG_UNHANDLED_NODE_TYPE,
			MSG_UNKNOWN_CONTENT,
			MSG_UNKNOWN_OPERATION,
			MSG_UNKNOWN_TYPE,
			MSG_UPDATED,
			MSG_VERSION_AWARE,
			MSG_VERSION_AWARE_CONFLICT,
			MSG_VERSION_AWARE_URL,
			MSG_WRONG_NS,
			SEARCH_MULTIPLE,
			UPDATE_MULTIPLE_MATCHES,
			SEARCH_NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation Outcome Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationOutcomeCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Outcome Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationOutcomeCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationOutcomeCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Outcome Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationOutcomeCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationOutcomeCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Outcome Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationOutcomeCodes get(int value) {
		switch (value) {
			case MSG_AUTH_REQUIRED_VALUE: return MSG_AUTH_REQUIRED;
			case MSG_BAD_FORMAT_VALUE: return MSG_BAD_FORMAT;
			case MSG_BAD_SYNTAX_VALUE: return MSG_BAD_SYNTAX;
			case MSG_CANT_PARSE_CONTENT_VALUE: return MSG_CANT_PARSE_CONTENT;
			case MSG_CANT_PARSE_ROOT_VALUE: return MSG_CANT_PARSE_ROOT;
			case MSG_CREATED_VALUE: return MSG_CREATED;
			case MSG_DATE_FORMAT_VALUE: return MSG_DATE_FORMAT;
			case MSG_DELETED_VALUE: return MSG_DELETED;
			case MSG_DELETED_DONE_VALUE: return MSG_DELETED_DONE;
			case MSG_DELETED_ID_VALUE: return MSG_DELETED_ID;
			case MSG_DUPLICATE_ID_VALUE: return MSG_DUPLICATE_ID;
			case MSG_ERROR_PARSING_VALUE: return MSG_ERROR_PARSING;
			case MSG_ID_INVALID_VALUE: return MSG_ID_INVALID;
			case MSG_ID_TOO_LONG_VALUE: return MSG_ID_TOO_LONG;
			case MSG_INVALID_ID_VALUE: return MSG_INVALID_ID;
			case MSG_JSON_OBJECT_VALUE: return MSG_JSON_OBJECT;
			case MSG_LOCAL_FAIL_VALUE: return MSG_LOCAL_FAIL;
			case MSG_NO_MATCH_VALUE: return MSG_NO_MATCH;
			case MSG_NO_EXIST_VALUE: return MSG_NO_EXIST;
			case MSG_NO_MODULE_VALUE: return MSG_NO_MODULE;
			case MSG_NO_SUMMARY_VALUE: return MSG_NO_SUMMARY;
			case MSG_OP_NOT_ALLOWED_VALUE: return MSG_OP_NOT_ALLOWED;
			case MSG_PARAM_CHAINED_VALUE: return MSG_PARAM_CHAINED;
			case MSG_PARAM_NO_REPEAT_VALUE: return MSG_PARAM_NO_REPEAT;
			case MSG_PARAM_UNKNOWN_VALUE: return MSG_PARAM_UNKNOWN;
			case MSG_PARAM_INVALID_VALUE: return MSG_PARAM_INVALID;
			case MSG_PARAM_MODIFIER_INVALID_VALUE: return MSG_PARAM_MODIFIER_INVALID;
			case MSG_RESOURCE_EXAMPLE_PROTECTED_VALUE: return MSG_RESOURCE_EXAMPLE_PROTECTED;
			case MSG_RESOURCE_ID_FAIL_VALUE: return MSG_RESOURCE_ID_FAIL;
			case MSG_RESOURCE_NOT_ALLOWED_VALUE: return MSG_RESOURCE_NOT_ALLOWED;
			case MSG_RESOURCE_REQUIRED_VALUE: return MSG_RESOURCE_REQUIRED;
			case MSG_RESOURCE_ID_MISMATCH_VALUE: return MSG_RESOURCE_ID_MISMATCH;
			case MSG_RESOURCE_ID_MISSING_VALUE: return MSG_RESOURCE_ID_MISSING;
			case MSG_RESOURCE_TYPE_MISMATCH_VALUE: return MSG_RESOURCE_TYPE_MISMATCH;
			case MSG_SORT_UNKNOWN_VALUE: return MSG_SORT_UNKNOWN;
			case MSG_TRANSACTION_DUPLICATE_ID_VALUE: return MSG_TRANSACTION_DUPLICATE_ID;
			case MSG_TRANSACTION_MISSING_ID_VALUE: return MSG_TRANSACTION_MISSING_ID;
			case MSG_UNHANDLED_NODE_TYPE_VALUE: return MSG_UNHANDLED_NODE_TYPE;
			case MSG_UNKNOWN_CONTENT_VALUE: return MSG_UNKNOWN_CONTENT;
			case MSG_UNKNOWN_OPERATION_VALUE: return MSG_UNKNOWN_OPERATION;
			case MSG_UNKNOWN_TYPE_VALUE: return MSG_UNKNOWN_TYPE;
			case MSG_UPDATED_VALUE: return MSG_UPDATED;
			case MSG_VERSION_AWARE_VALUE: return MSG_VERSION_AWARE;
			case MSG_VERSION_AWARE_CONFLICT_VALUE: return MSG_VERSION_AWARE_CONFLICT;
			case MSG_VERSION_AWARE_URL_VALUE: return MSG_VERSION_AWARE_URL;
			case MSG_WRONG_NS_VALUE: return MSG_WRONG_NS;
			case SEARCH_MULTIPLE_VALUE: return SEARCH_MULTIPLE;
			case UPDATE_MULTIPLE_MATCHES_VALUE: return UPDATE_MULTIPLE_MATCHES;
			case SEARCH_NONE_VALUE: return SEARCH_NONE;
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
	private OperationOutcomeCodes(int value, String name, String literal) {
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
	
} //OperationOutcomeCodes
