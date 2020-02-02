/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.Coding;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CodingImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CodingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CodingImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CodingImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.CodingImpl#getUserSeclected <em>User Seclected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodingImpl extends MinimalEObjectImpl.Container implements Coding {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected EObject system;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected EObject version;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected EObject display;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EObject code;

	/**
	 * The cached value of the '{@link #getUserSeclected() <em>User Seclected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSeclected()
	 * @generated
	 * @ordered
	 */
	protected EObject userSeclected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getCoding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(EObject newSystem, NotificationChain msgs) {
		EObject oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CODING__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(EObject newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CODING__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(EObject newVersion, NotificationChain msgs) {
		EObject oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CODING__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(EObject newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CODING__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(EObject newDisplay, NotificationChain msgs) {
		EObject oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CODING__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(EObject newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CODING__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(EObject newCode, NotificationChain msgs) {
		EObject oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CODING__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(EObject newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CODING__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUserSeclected() {
		return userSeclected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserSeclected(EObject newUserSeclected, NotificationChain msgs) {
		EObject oldUserSeclected = userSeclected;
		userSeclected = newUserSeclected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.CODING__USER_SECLECTED, oldUserSeclected, newUserSeclected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserSeclected(EObject newUserSeclected) {
		if (newUserSeclected != userSeclected) {
			NotificationChain msgs = null;
			if (userSeclected != null)
				msgs = ((InternalEObject)userSeclected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__USER_SECLECTED, null, msgs);
			if (newUserSeclected != null)
				msgs = ((InternalEObject)newUserSeclected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.CODING__USER_SECLECTED, null, msgs);
			msgs = basicSetUserSeclected(newUserSeclected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.CODING__USER_SECLECTED, newUserSeclected, newUserSeclected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.CODING__SYSTEM:
				return basicSetSystem(null, msgs);
			case R2Package.CODING__VERSION:
				return basicSetVersion(null, msgs);
			case R2Package.CODING__DISPLAY:
				return basicSetDisplay(null, msgs);
			case R2Package.CODING__CODE:
				return basicSetCode(null, msgs);
			case R2Package.CODING__USER_SECLECTED:
				return basicSetUserSeclected(null, msgs);
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
			case R2Package.CODING__SYSTEM:
				return getSystem();
			case R2Package.CODING__VERSION:
				return getVersion();
			case R2Package.CODING__DISPLAY:
				return getDisplay();
			case R2Package.CODING__CODE:
				return getCode();
			case R2Package.CODING__USER_SECLECTED:
				return getUserSeclected();
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
			case R2Package.CODING__SYSTEM:
				setSystem((EObject)newValue);
				return;
			case R2Package.CODING__VERSION:
				setVersion((EObject)newValue);
				return;
			case R2Package.CODING__DISPLAY:
				setDisplay((EObject)newValue);
				return;
			case R2Package.CODING__CODE:
				setCode((EObject)newValue);
				return;
			case R2Package.CODING__USER_SECLECTED:
				setUserSeclected((EObject)newValue);
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
			case R2Package.CODING__SYSTEM:
				setSystem((EObject)null);
				return;
			case R2Package.CODING__VERSION:
				setVersion((EObject)null);
				return;
			case R2Package.CODING__DISPLAY:
				setDisplay((EObject)null);
				return;
			case R2Package.CODING__CODE:
				setCode((EObject)null);
				return;
			case R2Package.CODING__USER_SECLECTED:
				setUserSeclected((EObject)null);
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
			case R2Package.CODING__SYSTEM:
				return system != null;
			case R2Package.CODING__VERSION:
				return version != null;
			case R2Package.CODING__DISPLAY:
				return display != null;
			case R2Package.CODING__CODE:
				return code != null;
			case R2Package.CODING__USER_SECLECTED:
				return userSeclected != null;
		}
		return super.eIsSet(featureID);
	}

} //CodingImpl
