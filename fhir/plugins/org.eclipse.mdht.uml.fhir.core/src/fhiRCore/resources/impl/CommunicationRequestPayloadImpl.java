/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CommunicationRequestPayload;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Request Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CommunicationRequestPayloadImpl#getContentx <em>Contentx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationRequestPayloadImpl extends BackboneElementImpl implements CommunicationRequestPayload {
	/**
	 * The cached value of the '{@link #getContentx() <em>Contentx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentx()
	 * @generated
	 * @ordered
	 */
	protected DataType contentx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationRequestPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCommunicationRequestPayload();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getContentx() {
		return contentx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentx(DataType newContentx, NotificationChain msgs) {
		DataType oldContentx = contentx;
		contentx = newContentx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX, oldContentx, newContentx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentx(DataType newContentx) {
		if (newContentx != contentx) {
			NotificationChain msgs = null;
			if (contentx != null)
				msgs = ((InternalEObject)contentx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX, null, msgs);
			if (newContentx != null)
				msgs = ((InternalEObject)newContentx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX, null, msgs);
			msgs = basicSetContentx(newContentx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX, newContentx, newContentx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX:
				return basicSetContentx(null, msgs);
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
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX:
				return getContentx();
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
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX:
				setContentx((DataType)newValue);
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
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX:
				setContentx((DataType)null);
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
			case ResourcesPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENTX:
				return contentx != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationRequestPayloadImpl
