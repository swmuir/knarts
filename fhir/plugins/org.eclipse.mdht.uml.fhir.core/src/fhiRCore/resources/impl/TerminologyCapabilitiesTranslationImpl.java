/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TerminologyCapabilitiesTranslation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Capabilities Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesTranslationImpl#getNeedsMap <em>Needs Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesTranslationImpl extends BackboneElementImpl implements TerminologyCapabilitiesTranslation {
	/**
	 * The cached value of the '{@link #getNeedsMap() <em>Needs Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsMap()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean needsMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesTranslationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTerminologyCapabilitiesTranslation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getNeedsMap() {
		return needsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeedsMap(fhiRCore.dataTypes.Boolean newNeedsMap, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldNeedsMap = needsMap;
		needsMap = newNeedsMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP, oldNeedsMap, newNeedsMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsMap(fhiRCore.dataTypes.Boolean newNeedsMap) {
		if (newNeedsMap != needsMap) {
			NotificationChain msgs = null;
			if (needsMap != null)
				msgs = ((InternalEObject)needsMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP, null, msgs);
			if (newNeedsMap != null)
				msgs = ((InternalEObject)newNeedsMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP, null, msgs);
			msgs = basicSetNeedsMap(newNeedsMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP, newNeedsMap, newNeedsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				return basicSetNeedsMap(null, msgs);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				return getNeedsMap();
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				setNeedsMap((fhiRCore.dataTypes.Boolean)newValue);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				setNeedsMap((fhiRCore.dataTypes.Boolean)null);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				return needsMap != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesTranslationImpl
