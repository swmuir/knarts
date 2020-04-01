/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.profiles.Cdshooksguidanceresponse;
import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;

import org.eclipse.mdht.hl7.fhir.resources.impl.GuidanceResponseImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cdshooksguidanceresponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.CdshooksguidanceresponseImpl#getModuleUri <em>Module Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdshooksguidanceresponseImpl extends GuidanceResponseImpl implements Cdshooksguidanceresponse {
	/**
	 * The cached value of the '{@link #getModuleUri() <em>Module Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleUri()
	 * @generated
	 * @ordered
	 */
	protected Uri moduleUri;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdshooksguidanceresponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.CDSHOOKSGUIDANCERESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getModuleUri() {
		return moduleUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleUri(Uri newModuleUri, NotificationChain msgs) {
		Uri oldModuleUri = moduleUri;
		moduleUri = newModuleUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI, oldModuleUri, newModuleUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleUri(Uri newModuleUri) {
		if (newModuleUri != moduleUri) {
			NotificationChain msgs = null;
			if (moduleUri != null)
				msgs = ((InternalEObject)moduleUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI, null, msgs);
			if (newModuleUri != null)
				msgs = ((InternalEObject)newModuleUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI, null, msgs);
			msgs = basicSetModuleUri(newModuleUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI, newModuleUri, newModuleUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI:
				return basicSetModuleUri(null, msgs);
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
			case ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI:
				return getModuleUri();
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
			case ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI:
				setModuleUri((Uri)newValue);
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
			case ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI:
				setModuleUri((Uri)null);
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
			case ProfilesPackage.CDSHOOKSGUIDANCERESPONSE__MODULE_URI:
				return moduleUri != null;
		}
		return super.eIsSet(featureID);
	}

} //CdshooksguidanceresponseImpl
