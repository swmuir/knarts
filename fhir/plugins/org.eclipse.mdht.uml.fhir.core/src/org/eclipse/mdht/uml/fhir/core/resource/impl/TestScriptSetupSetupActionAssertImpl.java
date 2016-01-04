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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Id;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.TestScriptSetupSetupActionAssert;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Setup Action Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getCompareToSourceId <em>Compare To Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getCompareToSourcePath <em>Compare To Source Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getMinimumId <em>Minimum Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getNavigationLinks <em>Navigation Links</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getValidateProfileId <em>Validate Profile Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.TestScriptSetupSetupActionAssertImpl#getWarningOnly <em>Warning Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptSetupSetupActionAssertImpl extends BackboneElementImpl implements TestScriptSetupSetupActionAssert {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String label;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Code direction;

	/**
	 * The cached value of the '{@link #getCompareToSourceId() <em>Compare To Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourceId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String compareToSourceId;

	/**
	 * The cached value of the '{@link #getCompareToSourcePath() <em>Compare To Source Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourcePath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String compareToSourcePath;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getHeaderField() <em>Header Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderField()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String headerField;

	/**
	 * The cached value of the '{@link #getMinimumId() <em>Minimum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String minimumId;

	/**
	 * The cached value of the '{@link #getNavigationLinks() <em>Navigation Links</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLinks()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean navigationLinks;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Code operator;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String path;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Code resource;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Code response;

	/**
	 * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String responseCode;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected Id sourceId;

	/**
	 * The cached value of the '{@link #getValidateProfileId() <em>Validate Profile Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateProfileId()
	 * @generated
	 * @ordered
	 */
	protected Id validateProfileId;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String value;

	/**
	 * The cached value of the '{@link #getWarningOnly() <em>Warning Only</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningOnly()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean warningOnly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptSetupSetupActionAssertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getTestScriptSetupSetupActionAssert();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.eclipse.mdht.uml.fhir.core.datatype.String newLabel) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDirection() {
		if (direction != null && direction.eIsProxy()) {
			InternalEObject oldDirection = (InternalEObject)direction;
			direction = (Code)eResolveProxy(oldDirection);
			if (direction != oldDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION, oldDirection, direction));
			}
		}
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Code newDirection) {
		Code oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getCompareToSourceId() {
		if (compareToSourceId != null && compareToSourceId.eIsProxy()) {
			InternalEObject oldCompareToSourceId = (InternalEObject)compareToSourceId;
			compareToSourceId = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldCompareToSourceId);
			if (compareToSourceId != oldCompareToSourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID, oldCompareToSourceId, compareToSourceId));
			}
		}
		return compareToSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetCompareToSourceId() {
		return compareToSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourceId(org.eclipse.mdht.uml.fhir.core.datatype.String newCompareToSourceId) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldCompareToSourceId = compareToSourceId;
		compareToSourceId = newCompareToSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID, oldCompareToSourceId, compareToSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getCompareToSourcePath() {
		if (compareToSourcePath != null && compareToSourcePath.eIsProxy()) {
			InternalEObject oldCompareToSourcePath = (InternalEObject)compareToSourcePath;
			compareToSourcePath = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldCompareToSourcePath);
			if (compareToSourcePath != oldCompareToSourcePath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH, oldCompareToSourcePath, compareToSourcePath));
			}
		}
		return compareToSourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetCompareToSourcePath() {
		return compareToSourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourcePath(org.eclipse.mdht.uml.fhir.core.datatype.String newCompareToSourcePath) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldCompareToSourcePath = compareToSourcePath;
		compareToSourcePath = newCompareToSourcePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH, oldCompareToSourcePath, compareToSourcePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (Code)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getHeaderField() {
		if (headerField != null && headerField.eIsProxy()) {
			InternalEObject oldHeaderField = (InternalEObject)headerField;
			headerField = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldHeaderField);
			if (headerField != oldHeaderField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD, oldHeaderField, headerField));
			}
		}
		return headerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetHeaderField() {
		return headerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderField(org.eclipse.mdht.uml.fhir.core.datatype.String newHeaderField) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldHeaderField = headerField;
		headerField = newHeaderField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD, oldHeaderField, headerField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getMinimumId() {
		if (minimumId != null && minimumId.eIsProxy()) {
			InternalEObject oldMinimumId = (InternalEObject)minimumId;
			minimumId = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldMinimumId);
			if (minimumId != oldMinimumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID, oldMinimumId, minimumId));
			}
		}
		return minimumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetMinimumId() {
		return minimumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumId(org.eclipse.mdht.uml.fhir.core.datatype.String newMinimumId) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldMinimumId = minimumId;
		minimumId = newMinimumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID, oldMinimumId, minimumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getNavigationLinks() {
		if (navigationLinks != null && navigationLinks.eIsProxy()) {
			InternalEObject oldNavigationLinks = (InternalEObject)navigationLinks;
			navigationLinks = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldNavigationLinks);
			if (navigationLinks != oldNavigationLinks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS, oldNavigationLinks, navigationLinks));
			}
		}
		return navigationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetNavigationLinks() {
		return navigationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationLinks(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newNavigationLinks) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldNavigationLinks = navigationLinks;
		navigationLinks = newNavigationLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS, oldNavigationLinks, navigationLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOperator() {
		if (operator != null && operator.eIsProxy()) {
			InternalEObject oldOperator = (InternalEObject)operator;
			operator = (Code)eResolveProxy(oldOperator);
			if (operator != oldOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR, oldOperator, operator));
			}
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Code newOperator) {
		Code oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldPath);
			if (path != oldPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(org.eclipse.mdht.uml.fhir.core.datatype.String newPath) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Code)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Code newResource) {
		Code oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (Code)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Code newResponse) {
		Code oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getResponseCode() {
		if (responseCode != null && responseCode.eIsProxy()) {
			InternalEObject oldResponseCode = (InternalEObject)responseCode;
			responseCode = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldResponseCode);
			if (responseCode != oldResponseCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE, oldResponseCode, responseCode));
			}
		}
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetResponseCode() {
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCode(org.eclipse.mdht.uml.fhir.core.datatype.String newResponseCode) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldResponseCode = responseCode;
		responseCode = newResponseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE, oldResponseCode, responseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getSourceId() {
		if (sourceId != null && sourceId.eIsProxy()) {
			InternalEObject oldSourceId = (InternalEObject)sourceId;
			sourceId = (Id)eResolveProxy(oldSourceId);
			if (sourceId != oldSourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID, oldSourceId, sourceId));
			}
		}
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceId(Id newSourceId) {
		Id oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID, oldSourceId, sourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getValidateProfileId() {
		if (validateProfileId != null && validateProfileId.eIsProxy()) {
			InternalEObject oldValidateProfileId = (InternalEObject)validateProfileId;
			validateProfileId = (Id)eResolveProxy(oldValidateProfileId);
			if (validateProfileId != oldValidateProfileId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID, oldValidateProfileId, validateProfileId));
			}
		}
		return validateProfileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetValidateProfileId() {
		return validateProfileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateProfileId(Id newValidateProfileId) {
		Id oldValidateProfileId = validateProfileId;
		validateProfileId = newValidateProfileId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID, oldValidateProfileId, validateProfileId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(org.eclipse.mdht.uml.fhir.core.datatype.String newValue) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getWarningOnly() {
		if (warningOnly != null && warningOnly.eIsProxy()) {
			InternalEObject oldWarningOnly = (InternalEObject)warningOnly;
			warningOnly = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldWarningOnly);
			if (warningOnly != oldWarningOnly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY, oldWarningOnly, warningOnly));
			}
		}
		return warningOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetWarningOnly() {
		return warningOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningOnly(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newWarningOnly) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldWarningOnly = warningOnly;
		warningOnly = newWarningOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY, oldWarningOnly, warningOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				if (resolve) return getDirection();
				return basicGetDirection();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				if (resolve) return getCompareToSourceId();
				return basicGetCompareToSourceId();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				if (resolve) return getCompareToSourcePath();
				return basicGetCompareToSourcePath();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				if (resolve) return getHeaderField();
				return basicGetHeaderField();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				if (resolve) return getMinimumId();
				return basicGetMinimumId();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				if (resolve) return getNavigationLinks();
				return basicGetNavigationLinks();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				if (resolve) return getOperator();
				return basicGetOperator();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				if (resolve) return getResponseCode();
				return basicGetResponseCode();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				if (resolve) return getSourceId();
				return basicGetSourceId();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				if (resolve) return getValidateProfileId();
				return basicGetValidateProfileId();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				if (resolve) return getWarningOnly();
				return basicGetWarningOnly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				setDirection((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				setCompareToSourceId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				setCompareToSourcePath((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				setHeaderField((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				setMinimumId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				setNavigationLinks((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				setOperator((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				setResource((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				setResponse((Code)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				setResponseCode((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				setValidateProfileId((Id)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				setWarningOnly((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				setLabel((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				setDirection((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				setCompareToSourceId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				setCompareToSourcePath((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				setHeaderField((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				setMinimumId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				setNavigationLinks((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				setOperator((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				setPath((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				setResource((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				setResponse((Code)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				setResponseCode((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				setValidateProfileId((Id)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				setValue((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				setWarningOnly((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				return label != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				return direction != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				return compareToSourceId != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				return compareToSourcePath != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				return contentType != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				return headerField != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				return minimumId != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				return navigationLinks != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				return operator != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				return path != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				return resource != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				return response != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				return responseCode != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				return sourceId != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				return validateProfileId != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				return value != null;
			case FhirResourcePackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				return warningOnly != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupSetupActionAssertImpl
