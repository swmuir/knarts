/**
 */
package org.hl7.cdsdt.r2.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.cdsdt.r2.EN;
import org.hl7.cdsdt.r2.ENXP;
import org.hl7.cdsdt.r2.EntityNameUse;
import org.hl7.cdsdt.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.impl.ENImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.impl.ENImpl#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENImpl extends ANYImpl implements EN {
	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ENXP> part;

	/**
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final List<EntityNameUse> USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected List<EntityNameUse> use = USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.Literals.EN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ENXP> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<ENXP>(ENXP.class, this, R2Package.EN__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityNameUse> getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(List<EntityNameUse> newUse) {
		List<EntityNameUse> oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.EN__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.EN__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
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
			case R2Package.EN__PART:
				return getPart();
			case R2Package.EN__USE:
				return getUse();
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
			case R2Package.EN__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends ENXP>)newValue);
				return;
			case R2Package.EN__USE:
				setUse((List<EntityNameUse>)newValue);
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
			case R2Package.EN__PART:
				getPart().clear();
				return;
			case R2Package.EN__USE:
				setUse(USE_EDEFAULT);
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
			case R2Package.EN__PART:
				return part != null && !part.isEmpty();
			case R2Package.EN__USE:
				return USE_EDEFAULT == null ? use != null : !USE_EDEFAULT.equals(use);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (use: ");
		result.append(use);
		result.append(')');
		return result.toString();
	}

} //ENImpl
