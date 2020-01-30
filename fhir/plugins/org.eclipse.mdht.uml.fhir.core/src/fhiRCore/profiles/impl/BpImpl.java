/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.profiles.Bp;
import fhiRCore.profiles.BpComponent11;
import fhiRCore.profiles.BpComponent12;
import fhiRCore.profiles.ProfilesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.BpImpl#getSystolicBp <em>Systolic Bp</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.BpImpl#getDiastolicBp <em>Diastolic Bp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BpImpl extends VitalsignsImpl implements Bp {
	/**
	 * The cached value of the '{@link #getSystolicBp() <em>Systolic Bp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystolicBp()
	 * @generated
	 * @ordered
	 */
	protected BpComponent11 systolicBp;

	/**
	 * The cached value of the '{@link #getDiastolicBp() <em>Diastolic Bp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiastolicBp()
	 * @generated
	 * @ordered
	 */
	protected BpComponent12 diastolicBp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.BP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpComponent11 getSystolicBp() {
		return systolicBp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystolicBp(BpComponent11 newSystolicBp, NotificationChain msgs) {
		BpComponent11 oldSystolicBp = systolicBp;
		systolicBp = newSystolicBp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP__SYSTOLIC_BP, oldSystolicBp, newSystolicBp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystolicBp(BpComponent11 newSystolicBp) {
		if (newSystolicBp != systolicBp) {
			NotificationChain msgs = null;
			if (systolicBp != null)
				msgs = ((InternalEObject)systolicBp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP__SYSTOLIC_BP, null, msgs);
			if (newSystolicBp != null)
				msgs = ((InternalEObject)newSystolicBp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP__SYSTOLIC_BP, null, msgs);
			msgs = basicSetSystolicBp(newSystolicBp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP__SYSTOLIC_BP, newSystolicBp, newSystolicBp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpComponent12 getDiastolicBp() {
		return diastolicBp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiastolicBp(BpComponent12 newDiastolicBp, NotificationChain msgs) {
		BpComponent12 oldDiastolicBp = diastolicBp;
		diastolicBp = newDiastolicBp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP__DIASTOLIC_BP, oldDiastolicBp, newDiastolicBp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiastolicBp(BpComponent12 newDiastolicBp) {
		if (newDiastolicBp != diastolicBp) {
			NotificationChain msgs = null;
			if (diastolicBp != null)
				msgs = ((InternalEObject)diastolicBp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP__DIASTOLIC_BP, null, msgs);
			if (newDiastolicBp != null)
				msgs = ((InternalEObject)newDiastolicBp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.BP__DIASTOLIC_BP, null, msgs);
			msgs = basicSetDiastolicBp(newDiastolicBp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.BP__DIASTOLIC_BP, newDiastolicBp, newDiastolicBp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.BP__SYSTOLIC_BP:
				return basicSetSystolicBp(null, msgs);
			case ProfilesPackage.BP__DIASTOLIC_BP:
				return basicSetDiastolicBp(null, msgs);
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
			case ProfilesPackage.BP__SYSTOLIC_BP:
				return getSystolicBp();
			case ProfilesPackage.BP__DIASTOLIC_BP:
				return getDiastolicBp();
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
			case ProfilesPackage.BP__SYSTOLIC_BP:
				setSystolicBp((BpComponent11)newValue);
				return;
			case ProfilesPackage.BP__DIASTOLIC_BP:
				setDiastolicBp((BpComponent12)newValue);
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
			case ProfilesPackage.BP__SYSTOLIC_BP:
				setSystolicBp((BpComponent11)null);
				return;
			case ProfilesPackage.BP__DIASTOLIC_BP:
				setDiastolicBp((BpComponent12)null);
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
			case ProfilesPackage.BP__SYSTOLIC_BP:
				return systolicBp != null;
			case ProfilesPackage.BP__DIASTOLIC_BP:
				return diastolicBp != null;
		}
		return super.eIsSet(featureID);
	}

} //BpImpl
