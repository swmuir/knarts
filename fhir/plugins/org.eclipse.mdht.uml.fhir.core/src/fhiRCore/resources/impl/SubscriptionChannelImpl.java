/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Url;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubscriptionChannel;

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
 * An implementation of the model object '<em><b>Subscription Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubscriptionChannelImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubscriptionChannelImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubscriptionChannelImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubscriptionChannelImpl#getHeaders <em>Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionChannelImpl extends BackboneElementImpl implements SubscriptionChannel {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Url endpoint;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected Code payload;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> headers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubscriptionChannel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(Url newEndpoint, NotificationChain msgs) {
		Url oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT, oldEndpoint, newEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(Url newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT, newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPayload() {
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayload(Code newPayload, NotificationChain msgs) {
		Code oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD, oldPayload, newPayload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayload(Code newPayload) {
		if (newPayload != payload) {
			NotificationChain msgs = null;
			if (payload != null)
				msgs = ((InternalEObject)payload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD, null, msgs);
			if (newPayload != null)
				msgs = ((InternalEObject)newPayload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD, null, msgs);
			msgs = basicSetPayload(newPayload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD, newPayload, newPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.SUBSCRIPTION_CHANNEL__HEADER);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				return basicSetPayload(null, msgs);
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__HEADER:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE:
				return getType();
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				return getEndpoint();
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				return getPayload();
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__HEADER:
				return getHeaders();
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
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				setEndpoint((Url)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				setPayload((Code)newValue);
				return;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__HEADER:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
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
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				setEndpoint((Url)null);
				return;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				setPayload((Code)null);
				return;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__HEADER:
				getHeaders().clear();
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
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__TYPE:
				return type != null;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__ENDPOINT:
				return endpoint != null;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__PAYLOAD:
				return payload != null;
			case ResourcesPackage.SUBSCRIPTION_CHANNEL__HEADER:
				return headers != null && !headers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionChannelImpl
