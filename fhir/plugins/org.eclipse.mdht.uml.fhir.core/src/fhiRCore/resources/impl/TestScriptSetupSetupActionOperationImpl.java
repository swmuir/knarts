/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Id;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TestScriptSetupSetupActionOperation;
import fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Setup Action Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getEncodeRequestUrl <em>Encode Request Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getRequestHeaders <em>Request Header</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptSetupSetupActionOperationImpl extends BackboneElementImpl implements TestScriptSetupSetupActionOperation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

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
	 * The cached value of the '{@link #getAccept() <em>Accept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected Code accept;

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
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer destination;

	/**
	 * The cached value of the '{@link #getEncodeRequestUrl() <em>Encode Request Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodeRequestUrl()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean encodeRequestUrl;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Code method;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer origin;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String params;

	/**
	 * The cached value of the '{@link #getRequestHeaders() <em>Request Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptSetupSetupActionOperationRequestHeader> requestHeaders;

	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected Id requestId;

	/**
	 * The cached value of the '{@link #getResponseId() <em>Response Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseId()
	 * @generated
	 * @ordered
	 */
	protected Id responseId;

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
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected Id targetId;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptSetupSetupActionOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptSetupSetupActionOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE, oldResource, newResource);
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
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE, newResource, newResource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAccept() {
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccept(Code newAccept, NotificationChain msgs) {
		Code oldAccept = accept;
		accept = newAccept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT, oldAccept, newAccept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccept(Code newAccept) {
		if (newAccept != accept) {
			NotificationChain msgs = null;
			if (accept != null)
				msgs = ((InternalEObject)accept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT, null, msgs);
			if (newAccept != null)
				msgs = ((InternalEObject)newAccept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT, null, msgs);
			msgs = basicSetAccept(newAccept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT, newAccept, newAccept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE, oldContentType, newContentType);
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
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(fhiRCore.dataTypes.Integer newDestination, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(fhiRCore.dataTypes.Integer newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getEncodeRequestUrl() {
		return encodeRequestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncodeRequestUrl(fhiRCore.dataTypes.Boolean newEncodeRequestUrl, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldEncodeRequestUrl = encodeRequestUrl;
		encodeRequestUrl = newEncodeRequestUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL, oldEncodeRequestUrl, newEncodeRequestUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodeRequestUrl(fhiRCore.dataTypes.Boolean newEncodeRequestUrl) {
		if (newEncodeRequestUrl != encodeRequestUrl) {
			NotificationChain msgs = null;
			if (encodeRequestUrl != null)
				msgs = ((InternalEObject)encodeRequestUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL, null, msgs);
			if (newEncodeRequestUrl != null)
				msgs = ((InternalEObject)newEncodeRequestUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL, null, msgs);
			msgs = basicSetEncodeRequestUrl(newEncodeRequestUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL, newEncodeRequestUrl, newEncodeRequestUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(Code newMethod, NotificationChain msgs) {
		Code oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Code newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(fhiRCore.dataTypes.Integer newOrigin, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(fhiRCore.dataTypes.Integer newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(fhiRCore.dataTypes.String newParams, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(fhiRCore.dataTypes.String newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptSetupSetupActionOperationRequestHeader> getRequestHeaders() {
		if (requestHeaders == null) {
			requestHeaders = new EObjectContainmentEList<TestScriptSetupSetupActionOperationRequestHeader>(TestScriptSetupSetupActionOperationRequestHeader.class, this, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER);
		}
		return requestHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestId(Id newRequestId, NotificationChain msgs) {
		Id oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID, oldRequestId, newRequestId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(Id newRequestId) {
		if (newRequestId != requestId) {
			NotificationChain msgs = null;
			if (requestId != null)
				msgs = ((InternalEObject)requestId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID, null, msgs);
			if (newRequestId != null)
				msgs = ((InternalEObject)newRequestId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID, null, msgs);
			msgs = basicSetRequestId(newRequestId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID, newRequestId, newRequestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getResponseId() {
		return responseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseId(Id newResponseId, NotificationChain msgs) {
		Id oldResponseId = responseId;
		responseId = newResponseId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID, oldResponseId, newResponseId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseId(Id newResponseId) {
		if (newResponseId != responseId) {
			NotificationChain msgs = null;
			if (responseId != null)
				msgs = ((InternalEObject)responseId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID, null, msgs);
			if (newResponseId != null)
				msgs = ((InternalEObject)newResponseId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID, null, msgs);
			msgs = basicSetResponseId(newResponseId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID, newResponseId, newResponseId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID, oldSourceId, newSourceId);
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
				msgs = ((InternalEObject)sourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID, null, msgs);
			if (newSourceId != null)
				msgs = ((InternalEObject)newSourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID, null, msgs);
			msgs = basicSetSourceId(newSourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID, newSourceId, newSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetId(Id newTargetId, NotificationChain msgs) {
		Id oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID, oldTargetId, newTargetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetId(Id newTargetId) {
		if (newTargetId != targetId) {
			NotificationChain msgs = null;
			if (targetId != null)
				msgs = ((InternalEObject)targetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID, null, msgs);
			if (newTargetId != null)
				msgs = ((InternalEObject)newTargetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID, null, msgs);
			msgs = basicSetTargetId(newTargetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID, newTargetId, newTargetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(fhiRCore.dataTypes.String newUrl, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(fhiRCore.dataTypes.String newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				return basicSetResource(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				return basicSetLabel(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				return basicSetAccept(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				return basicSetDestination(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				return basicSetEncodeRequestUrl(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD:
				return basicSetMethod(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				return basicSetOrigin(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				return basicSetParams(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return ((InternalEList<?>)getRequestHeaders()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				return basicSetRequestId(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				return basicSetResponseId(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				return basicSetSourceId(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				return basicSetTargetId(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				return basicSetUrl(null, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				return getType();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				return getResource();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				return getLabel();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				return getAccept();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				return getContentType();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				return getDestination();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				return getEncodeRequestUrl();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD:
				return getMethod();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				return getOrigin();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				return getParams();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return getRequestHeaders();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				return getRequestId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				return getResponseId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				return getSourceId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				return getTargetId();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				return getUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				setType((Coding)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				setResource((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				setLabel((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				setAccept((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				setDestination((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				setEncodeRequestUrl((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD:
				setMethod((Code)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				setOrigin((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				setParams((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				getRequestHeaders().clear();
				getRequestHeaders().addAll((Collection<? extends TestScriptSetupSetupActionOperationRequestHeader>)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				setRequestId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				setResponseId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				setTargetId((Id)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				setUrl((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				setType((Coding)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				setResource((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				setLabel((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				setAccept((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				setDestination((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				setEncodeRequestUrl((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD:
				setMethod((Code)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				setOrigin((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				setParams((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				getRequestHeaders().clear();
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				setRequestId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				setResponseId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				setTargetId((Id)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				setUrl((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TYPE:
				return type != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESOURCE:
				return resource != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__LABEL:
				return label != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESCRIPTION:
				return description != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ACCEPT:
				return accept != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__CONTENT_TYPE:
				return contentType != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__DESTINATION:
				return destination != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ENCODE_REQUEST_URL:
				return encodeRequestUrl != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__METHOD:
				return method != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__ORIGIN:
				return origin != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__PARAMS:
				return params != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_HEADER:
				return requestHeaders != null && !requestHeaders.isEmpty();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__REQUEST_ID:
				return requestId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__RESPONSE_ID:
				return responseId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__SOURCE_ID:
				return sourceId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__TARGET_ID:
				return targetId != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION__URL:
				return url != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupSetupActionOperationImpl
