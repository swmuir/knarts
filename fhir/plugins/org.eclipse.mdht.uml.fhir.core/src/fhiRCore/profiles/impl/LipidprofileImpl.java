/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.Reference;

import fhiRCore.profiles.Lipidprofile;
import fhiRCore.profiles.ProfilesPackage;

import fhiRCore.resources.impl.DiagnosticReportImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lipidprofile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.LipidprofileImpl#getCholesterol <em>Cholesterol</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.LipidprofileImpl#getTriglyceride <em>Triglyceride</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.LipidprofileImpl#getHdlCholesterol <em>Hdl Cholesterol</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.LipidprofileImpl#getLdlCholesterol <em>Ldl Cholesterol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LipidprofileImpl extends DiagnosticReportImpl implements Lipidprofile {
	/**
	 * The cached value of the '{@link #getCholesterol() <em>Cholesterol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCholesterol()
	 * @generated
	 * @ordered
	 */
	protected Reference cholesterol;

	/**
	 * The cached value of the '{@link #getTriglyceride() <em>Triglyceride</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriglyceride()
	 * @generated
	 * @ordered
	 */
	protected Reference triglyceride;

	/**
	 * The cached value of the '{@link #getHdlCholesterol() <em>Hdl Cholesterol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdlCholesterol()
	 * @generated
	 * @ordered
	 */
	protected Reference hdlCholesterol;

	/**
	 * The cached value of the '{@link #getLdlCholesterol() <em>Ldl Cholesterol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdlCholesterol()
	 * @generated
	 * @ordered
	 */
	protected Reference ldlCholesterol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LipidprofileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.LIPIDPROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCholesterol() {
		return cholesterol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCholesterol(Reference newCholesterol, NotificationChain msgs) {
		Reference oldCholesterol = cholesterol;
		cholesterol = newCholesterol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.LIPIDPROFILE__CHOLESTEROL, oldCholesterol, newCholesterol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCholesterol(Reference newCholesterol) {
		if (newCholesterol != cholesterol) {
			NotificationChain msgs = null;
			if (cholesterol != null)
				msgs = ((InternalEObject)cholesterol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.LIPIDPROFILE__CHOLESTEROL, null, msgs);
			if (newCholesterol != null)
				msgs = ((InternalEObject)newCholesterol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.LIPIDPROFILE__CHOLESTEROL, null, msgs);
			msgs = basicSetCholesterol(newCholesterol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.LIPIDPROFILE__CHOLESTEROL, newCholesterol, newCholesterol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getTriglyceride() {
		return triglyceride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriglyceride(Reference newTriglyceride, NotificationChain msgs) {
		Reference oldTriglyceride = triglyceride;
		triglyceride = newTriglyceride;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE, oldTriglyceride, newTriglyceride);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriglyceride(Reference newTriglyceride) {
		if (newTriglyceride != triglyceride) {
			NotificationChain msgs = null;
			if (triglyceride != null)
				msgs = ((InternalEObject)triglyceride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE, null, msgs);
			if (newTriglyceride != null)
				msgs = ((InternalEObject)newTriglyceride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE, null, msgs);
			msgs = basicSetTriglyceride(newTriglyceride, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE, newTriglyceride, newTriglyceride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getHdlCholesterol() {
		return hdlCholesterol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHdlCholesterol(Reference newHdlCholesterol, NotificationChain msgs) {
		Reference oldHdlCholesterol = hdlCholesterol;
		hdlCholesterol = newHdlCholesterol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL, oldHdlCholesterol, newHdlCholesterol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdlCholesterol(Reference newHdlCholesterol) {
		if (newHdlCholesterol != hdlCholesterol) {
			NotificationChain msgs = null;
			if (hdlCholesterol != null)
				msgs = ((InternalEObject)hdlCholesterol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL, null, msgs);
			if (newHdlCholesterol != null)
				msgs = ((InternalEObject)newHdlCholesterol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL, null, msgs);
			msgs = basicSetHdlCholesterol(newHdlCholesterol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL, newHdlCholesterol, newHdlCholesterol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLdlCholesterol() {
		return ldlCholesterol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLdlCholesterol(Reference newLdlCholesterol, NotificationChain msgs) {
		Reference oldLdlCholesterol = ldlCholesterol;
		ldlCholesterol = newLdlCholesterol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL, oldLdlCholesterol, newLdlCholesterol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdlCholesterol(Reference newLdlCholesterol) {
		if (newLdlCholesterol != ldlCholesterol) {
			NotificationChain msgs = null;
			if (ldlCholesterol != null)
				msgs = ((InternalEObject)ldlCholesterol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL, null, msgs);
			if (newLdlCholesterol != null)
				msgs = ((InternalEObject)newLdlCholesterol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL, null, msgs);
			msgs = basicSetLdlCholesterol(newLdlCholesterol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL, newLdlCholesterol, newLdlCholesterol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.LIPIDPROFILE__CHOLESTEROL:
				return basicSetCholesterol(null, msgs);
			case ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE:
				return basicSetTriglyceride(null, msgs);
			case ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL:
				return basicSetHdlCholesterol(null, msgs);
			case ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL:
				return basicSetLdlCholesterol(null, msgs);
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
			case ProfilesPackage.LIPIDPROFILE__CHOLESTEROL:
				return getCholesterol();
			case ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE:
				return getTriglyceride();
			case ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL:
				return getHdlCholesterol();
			case ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL:
				return getLdlCholesterol();
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
			case ProfilesPackage.LIPIDPROFILE__CHOLESTEROL:
				setCholesterol((Reference)newValue);
				return;
			case ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE:
				setTriglyceride((Reference)newValue);
				return;
			case ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL:
				setHdlCholesterol((Reference)newValue);
				return;
			case ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL:
				setLdlCholesterol((Reference)newValue);
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
			case ProfilesPackage.LIPIDPROFILE__CHOLESTEROL:
				setCholesterol((Reference)null);
				return;
			case ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE:
				setTriglyceride((Reference)null);
				return;
			case ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL:
				setHdlCholesterol((Reference)null);
				return;
			case ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL:
				setLdlCholesterol((Reference)null);
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
			case ProfilesPackage.LIPIDPROFILE__CHOLESTEROL:
				return cholesterol != null;
			case ProfilesPackage.LIPIDPROFILE__TRIGLYCERIDE:
				return triglyceride != null;
			case ProfilesPackage.LIPIDPROFILE__HDL_CHOLESTEROL:
				return hdlCholesterol != null;
			case ProfilesPackage.LIPIDPROFILE__LDL_CHOLESTEROL:
				return ldlCholesterol != null;
		}
		return super.eIsSet(featureID);
	}

} //LipidprofileImpl
