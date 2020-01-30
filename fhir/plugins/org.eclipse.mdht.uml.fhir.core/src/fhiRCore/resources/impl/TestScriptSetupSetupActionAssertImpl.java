/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Id;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TestScriptSetupSetupActionAssert;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Setup Action Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getCompareToSourceId <em>Compare To Source Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getCompareToSourceExpression <em>Compare To Source Expression</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getCompareToSourcePath <em>Compare To Source Path</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getMinimumId <em>Minimum Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getNavigationLinks <em>Navigation Links</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getRequestMethod <em>Request Method</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getRequestUrl <em>Request Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getValidateProfileId <em>Validate Profile Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionAssertImpl#getWarningOnly <em>Warning Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptSetupSetupActionAssertImpl extends BackboneElementImpl implements TestScriptSetupSetupActionAssert {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String label;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Code direction;

	/**
	 * The cached value of the '{@link #getCompareToSourceId() <em>Compare To Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourceId()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String compareToSourceId;

	/**
	 * The cached value of the '{@link #getCompareToSourceExpression() <em>Compare To Source Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String compareToSourceExpression;

	/**
	 * The cached value of the '{@link #getCompareToSourcePath() <em>Compare To Source Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourcePath()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String compareToSourcePath;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String expression;

	/**
	 * The cached value of the '{@link #getHeaderField() <em>Header Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderField()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String headerField;

	/**
	 * The cached value of the '{@link #getMinimumId() <em>Minimum Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumId()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String minimumId;

	/**
	 * The cached value of the '{@link #getNavigationLinks() <em>Navigation Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLinks()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean navigationLinks;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Code operator;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String path;

	/**
	 * The cached value of the '{@link #getRequestMethod() <em>Request Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestMethod()
	 * @generated
	 * @ordered
	 */
	protected Code requestMethod;

	/**
	 * The cached value of the '{@link #getRequestUrl() <em>Request Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestUrl()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String requestUrl;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Code resource;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Code response;

	/**
	 * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String responseCode;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected Id sourceId;

	/**
	 * The cached value of the '{@link #getValidateProfileId() <em>Validate Profile Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateProfileId()
	 * @generated
	 * @ordered
	 */
	protected Id validateProfileId;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String value;

	/**
	 * The cached value of the '{@link #getWarningOnly() <em>Warning Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningOnly()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean warningOnly;

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
		return ResourcesPackage.eINSTANCE.getTestScriptSetupSetupActionAssert();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(fhiRCore.dataTypes.String newLabel, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(fhiRCore.dataTypes.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(Code newDirection, NotificationChain msgs) {
		Code oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION, oldDirection, newDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Code newDirection) {
		if (newDirection != direction) {
			NotificationChain msgs = null;
			if (direction != null)
				msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION, null, msgs);
			if (newDirection != null)
				msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION, null, msgs);
			msgs = basicSetDirection(newDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION, newDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getCompareToSourceId() {
		return compareToSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompareToSourceId(fhiRCore.dataTypes.String newCompareToSourceId, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldCompareToSourceId = compareToSourceId;
		compareToSourceId = newCompareToSourceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID, oldCompareToSourceId, newCompareToSourceId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourceId(fhiRCore.dataTypes.String newCompareToSourceId) {
		if (newCompareToSourceId != compareToSourceId) {
			NotificationChain msgs = null;
			if (compareToSourceId != null)
				msgs = ((InternalEObject)compareToSourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID, null, msgs);
			if (newCompareToSourceId != null)
				msgs = ((InternalEObject)newCompareToSourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID, null, msgs);
			msgs = basicSetCompareToSourceId(newCompareToSourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID, newCompareToSourceId, newCompareToSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getCompareToSourceExpression() {
		return compareToSourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompareToSourceExpression(fhiRCore.dataTypes.String newCompareToSourceExpression, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldCompareToSourceExpression = compareToSourceExpression;
		compareToSourceExpression = newCompareToSourceExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION, oldCompareToSourceExpression, newCompareToSourceExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourceExpression(fhiRCore.dataTypes.String newCompareToSourceExpression) {
		if (newCompareToSourceExpression != compareToSourceExpression) {
			NotificationChain msgs = null;
			if (compareToSourceExpression != null)
				msgs = ((InternalEObject)compareToSourceExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION, null, msgs);
			if (newCompareToSourceExpression != null)
				msgs = ((InternalEObject)newCompareToSourceExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION, null, msgs);
			msgs = basicSetCompareToSourceExpression(newCompareToSourceExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION, newCompareToSourceExpression, newCompareToSourceExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getCompareToSourcePath() {
		return compareToSourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompareToSourcePath(fhiRCore.dataTypes.String newCompareToSourcePath, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldCompareToSourcePath = compareToSourcePath;
		compareToSourcePath = newCompareToSourcePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH, oldCompareToSourcePath, newCompareToSourcePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourcePath(fhiRCore.dataTypes.String newCompareToSourcePath) {
		if (newCompareToSourcePath != compareToSourcePath) {
			NotificationChain msgs = null;
			if (compareToSourcePath != null)
				msgs = ((InternalEObject)compareToSourcePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH, null, msgs);
			if (newCompareToSourcePath != null)
				msgs = ((InternalEObject)newCompareToSourcePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH, null, msgs);
			msgs = basicSetCompareToSourcePath(newCompareToSourcePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH, newCompareToSourcePath, newCompareToSourcePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentType(Code newContentType, NotificationChain msgs) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE, oldContentType, newContentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(fhiRCore.dataTypes.String newExpression, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(fhiRCore.dataTypes.String newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getHeaderField() {
		return headerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderField(fhiRCore.dataTypes.String newHeaderField, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldHeaderField = headerField;
		headerField = newHeaderField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD, oldHeaderField, newHeaderField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderField(fhiRCore.dataTypes.String newHeaderField) {
		if (newHeaderField != headerField) {
			NotificationChain msgs = null;
			if (headerField != null)
				msgs = ((InternalEObject)headerField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD, null, msgs);
			if (newHeaderField != null)
				msgs = ((InternalEObject)newHeaderField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD, null, msgs);
			msgs = basicSetHeaderField(newHeaderField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD, newHeaderField, newHeaderField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMinimumId() {
		return minimumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumId(fhiRCore.dataTypes.String newMinimumId, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMinimumId = minimumId;
		minimumId = newMinimumId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID, oldMinimumId, newMinimumId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumId(fhiRCore.dataTypes.String newMinimumId) {
		if (newMinimumId != minimumId) {
			NotificationChain msgs = null;
			if (minimumId != null)
				msgs = ((InternalEObject)minimumId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID, null, msgs);
			if (newMinimumId != null)
				msgs = ((InternalEObject)newMinimumId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID, null, msgs);
			msgs = basicSetMinimumId(newMinimumId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID, newMinimumId, newMinimumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getNavigationLinks() {
		return navigationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationLinks(fhiRCore.dataTypes.Boolean newNavigationLinks, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldNavigationLinks = navigationLinks;
		navigationLinks = newNavigationLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS, oldNavigationLinks, newNavigationLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationLinks(fhiRCore.dataTypes.Boolean newNavigationLinks) {
		if (newNavigationLinks != navigationLinks) {
			NotificationChain msgs = null;
			if (navigationLinks != null)
				msgs = ((InternalEObject)navigationLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS, null, msgs);
			if (newNavigationLinks != null)
				msgs = ((InternalEObject)newNavigationLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS, null, msgs);
			msgs = basicSetNavigationLinks(newNavigationLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS, newNavigationLinks, newNavigationLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Code newOperator, NotificationChain msgs) {
		Code oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Code newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(fhiRCore.dataTypes.String newPath, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(fhiRCore.dataTypes.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getRequestMethod() {
		return requestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestMethod(Code newRequestMethod, NotificationChain msgs) {
		Code oldRequestMethod = requestMethod;
		requestMethod = newRequestMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD, oldRequestMethod, newRequestMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestMethod(Code newRequestMethod) {
		if (newRequestMethod != requestMethod) {
			NotificationChain msgs = null;
			if (requestMethod != null)
				msgs = ((InternalEObject)requestMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD, null, msgs);
			if (newRequestMethod != null)
				msgs = ((InternalEObject)newRequestMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD, null, msgs);
			msgs = basicSetRequestMethod(newRequestMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD, newRequestMethod, newRequestMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getRequestUrl() {
		return requestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestUrl(fhiRCore.dataTypes.String newRequestUrl, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldRequestUrl = requestUrl;
		requestUrl = newRequestUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL, oldRequestUrl, newRequestUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestUrl(fhiRCore.dataTypes.String newRequestUrl) {
		if (newRequestUrl != requestUrl) {
			NotificationChain msgs = null;
			if (requestUrl != null)
				msgs = ((InternalEObject)requestUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL, null, msgs);
			if (newRequestUrl != null)
				msgs = ((InternalEObject)newRequestUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL, null, msgs);
			msgs = basicSetRequestUrl(newRequestUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL, newRequestUrl, newRequestUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Code newResource, NotificationChain msgs) {
		Code oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Code newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(Code newResponse, NotificationChain msgs) {
		Code oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Code newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getResponseCode() {
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseCode(fhiRCore.dataTypes.String newResponseCode, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldResponseCode = responseCode;
		responseCode = newResponseCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE, oldResponseCode, newResponseCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCode(fhiRCore.dataTypes.String newResponseCode) {
		if (newResponseCode != responseCode) {
			NotificationChain msgs = null;
			if (responseCode != null)
				msgs = ((InternalEObject)responseCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE, null, msgs);
			if (newResponseCode != null)
				msgs = ((InternalEObject)newResponseCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE, null, msgs);
			msgs = basicSetResponseCode(newResponseCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE, newResponseCode, newResponseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceId(Id newSourceId, NotificationChain msgs) {
		Id oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID, oldSourceId, newSourceId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceId(Id newSourceId) {
		if (newSourceId != sourceId) {
			NotificationChain msgs = null;
			if (sourceId != null)
				msgs = ((InternalEObject)sourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID, null, msgs);
			if (newSourceId != null)
				msgs = ((InternalEObject)newSourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID, null, msgs);
			msgs = basicSetSourceId(newSourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID, newSourceId, newSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getValidateProfileId() {
		return validateProfileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateProfileId(Id newValidateProfileId, NotificationChain msgs) {
		Id oldValidateProfileId = validateProfileId;
		validateProfileId = newValidateProfileId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID, oldValidateProfileId, newValidateProfileId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateProfileId(Id newValidateProfileId) {
		if (newValidateProfileId != validateProfileId) {
			NotificationChain msgs = null;
			if (validateProfileId != null)
				msgs = ((InternalEObject)validateProfileId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID, null, msgs);
			if (newValidateProfileId != null)
				msgs = ((InternalEObject)newValidateProfileId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID, null, msgs);
			msgs = basicSetValidateProfileId(newValidateProfileId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID, newValidateProfileId, newValidateProfileId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(fhiRCore.dataTypes.String newValue, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(fhiRCore.dataTypes.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getWarningOnly() {
		return warningOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarningOnly(fhiRCore.dataTypes.Boolean newWarningOnly, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldWarningOnly = warningOnly;
		warningOnly = newWarningOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY, oldWarningOnly, newWarningOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningOnly(fhiRCore.dataTypes.Boolean newWarningOnly) {
		if (newWarningOnly != warningOnly) {
			NotificationChain msgs = null;
			if (warningOnly != null)
				msgs = ((InternalEObject)warningOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY, null, msgs);
			if (newWarningOnly != null)
				msgs = ((InternalEObject)newWarningOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY, null, msgs);
			msgs = basicSetWarningOnly(newWarningOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY, newWarningOnly, newWarningOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				return basicSetLabel(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				return basicSetDirection(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				return basicSetCompareToSourceId(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				return basicSetCompareToSourceExpression(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				return basicSetCompareToSourcePath(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				return basicSetHeaderField(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				return basicSetMinimumId(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				return basicSetNavigationLinks(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				return basicSetOperator(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				return basicSetPath(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD:
				return basicSetRequestMethod(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				return basicSetRequestUrl(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				return basicSetResource(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				return basicSetResponse(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				return basicSetResponseCode(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				return basicSetSourceId(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				return basicSetValidateProfileId(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				return basicSetValue(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				return basicSetWarningOnly(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				return getLabel();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				return getDirection();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				return getCompareToSourceId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				return getCompareToSourceExpression();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				return getCompareToSourcePath();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				return getContentType();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				return getExpression();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				return getHeaderField();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				return getMinimumId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				return getNavigationLinks();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				return getOperator();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				return getPath();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD:
				return getRequestMethod();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				return getRequestUrl();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				return getResource();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				return getResponse();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				return getResponseCode();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				return getSourceId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				return getValidateProfileId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				return getValue();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				return getWarningOnly();
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				setLabel((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				setDirection((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				setCompareToSourceId((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				setCompareToSourceExpression((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				setCompareToSourcePath((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				setExpression((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				setHeaderField((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				setMinimumId((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				setNavigationLinks((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				setOperator((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				setPath((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD:
				setRequestMethod((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				setRequestUrl((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				setResource((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				setResponse((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				setResponseCode((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				setValidateProfileId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				setValue((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				setWarningOnly((fhiRCore.dataTypes.Boolean)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				setLabel((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				setDirection((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				setCompareToSourceId((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				setCompareToSourceExpression((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				setCompareToSourcePath((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				setExpression((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				setHeaderField((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				setMinimumId((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				setNavigationLinks((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				setOperator((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				setPath((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD:
				setRequestMethod((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				setRequestUrl((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				setResource((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				setResponse((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				setResponseCode((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				setValidateProfileId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				setValue((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				setWarningOnly((fhiRCore.dataTypes.Boolean)null);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__LABEL:
				return label != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__DIRECTION:
				return direction != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_ID:
				return compareToSourceId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_EXPRESSION:
				return compareToSourceExpression != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__COMPARE_TO_SOURCE_PATH:
				return compareToSourcePath != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__CONTENT_TYPE:
				return contentType != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__EXPRESSION:
				return expression != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__HEADER_FIELD:
				return headerField != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__MINIMUM_ID:
				return minimumId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__NAVIGATION_LINKS:
				return navigationLinks != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__OPERATOR:
				return operator != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__PATH:
				return path != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_METHOD:
				return requestMethod != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__REQUEST_URL:
				return requestUrl != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESOURCE:
				return resource != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE:
				return response != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__RESPONSE_CODE:
				return responseCode != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__SOURCE_ID:
				return sourceId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALIDATE_PROFILE_ID:
				return validateProfileId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__VALUE:
				return value != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_ASSERT__WARNING_ONLY:
				return warningOnly != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupSetupActionAssertImpl
