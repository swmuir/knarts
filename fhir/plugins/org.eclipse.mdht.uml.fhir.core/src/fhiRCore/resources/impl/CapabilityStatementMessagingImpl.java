/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.UnsignedInt;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CapabilityStatementMessaging;
import fhiRCore.resources.CapabilityStatementMessagingEndpoint;
import fhiRCore.resources.CapabilityStatementMessagingSupportedMessage;
import fhiRCore.resources.ResourcesPackage;

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
 * An implementation of the model object '<em><b>Capability Statement Messaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementMessagingImpl#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementMessagingImpl#getReliableCache <em>Reliable Cache</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementMessagingImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementMessagingImpl#getSupportedMessages <em>Supported Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementMessagingImpl extends BackboneElementImpl implements CapabilityStatementMessaging {
	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementMessagingEndpoint> endpoints;

	/**
	 * The cached value of the '{@link #getReliableCache() <em>Reliable Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliableCache()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt reliableCache;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Markdown documentation;

	/**
	 * The cached value of the '{@link #getSupportedMessages() <em>Supported Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityStatementMessagingSupportedMessage> supportedMessages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementMessagingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementMessaging();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementMessagingEndpoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<CapabilityStatementMessagingEndpoint>(CapabilityStatementMessagingEndpoint.class, this, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getReliableCache() {
		return reliableCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliableCache(UnsignedInt newReliableCache, NotificationChain msgs) {
		UnsignedInt oldReliableCache = reliableCache;
		reliableCache = newReliableCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, oldReliableCache, newReliableCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliableCache(UnsignedInt newReliableCache) {
		if (newReliableCache != reliableCache) {
			NotificationChain msgs = null;
			if (reliableCache != null)
				msgs = ((InternalEObject)reliableCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, null, msgs);
			if (newReliableCache != null)
				msgs = ((InternalEObject)newReliableCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, null, msgs);
			msgs = basicSetReliableCache(newReliableCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE, newReliableCache, newReliableCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Markdown newDocumentation, NotificationChain msgs) {
		Markdown oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Markdown newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityStatementMessagingSupportedMessage> getSupportedMessages() {
		if (supportedMessages == null) {
			supportedMessages = new EObjectContainmentEList<CapabilityStatementMessagingSupportedMessage>(CapabilityStatementMessagingSupportedMessage.class, this, ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE);
		}
		return supportedMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				return basicSetReliableCache(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				return ((InternalEList<?>)getSupportedMessages()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return getEndpoints();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				return getReliableCache();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				return getDocumentation();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				return getSupportedMessages();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends CapabilityStatementMessagingEndpoint>)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				setDocumentation((Markdown)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				getSupportedMessages().clear();
				getSupportedMessages().addAll((Collection<? extends CapabilityStatementMessagingSupportedMessage>)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				getEndpoints().clear();
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				setDocumentation((Markdown)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				getSupportedMessages().clear();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__RELIABLE_CACHE:
				return reliableCache != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__DOCUMENTATION:
				return documentation != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_MESSAGING__SUPPORTED_MESSAGE:
				return supportedMessages != null && !supportedMessages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementMessagingImpl
