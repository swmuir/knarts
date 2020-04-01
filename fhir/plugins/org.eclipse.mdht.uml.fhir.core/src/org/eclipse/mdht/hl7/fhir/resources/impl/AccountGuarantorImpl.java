/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.AccountGuarantor;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Guarantor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AccountGuarantorImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AccountGuarantorImpl#getOnHold <em>On Hold</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.AccountGuarantorImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountGuarantorImpl extends BackboneElementImpl implements AccountGuarantor {
	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected Reference party;

	/**
	 * The cached value of the '{@link #getOnHold() <em>On Hold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnHold()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean onHold;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountGuarantorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAccountGuarantor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getParty() {
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParty(Reference newParty, NotificationChain msgs) {
		Reference oldParty = party;
		party = newParty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__PARTY, oldParty, newParty);
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
	public void setParty(Reference newParty) {
		if (newParty != party) {
			NotificationChain msgs = null;
			if (party != null)
				msgs = ((InternalEObject)party).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT_GUARANTOR__PARTY, null, msgs);
			if (newParty != null)
				msgs = ((InternalEObject)newParty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT_GUARANTOR__PARTY, null, msgs);
			msgs = basicSetParty(newParty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__PARTY, newParty, newParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getOnHold() {
		return onHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnHold(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newOnHold, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldOnHold = onHold;
		onHold = newOnHold;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD, oldOnHold, newOnHold);
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
	public void setOnHold(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newOnHold) {
		if (newOnHold != onHold) {
			NotificationChain msgs = null;
			if (onHold != null)
				msgs = ((InternalEObject)onHold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD, null, msgs);
			if (newOnHold != null)
				msgs = ((InternalEObject)newOnHold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD, null, msgs);
			msgs = basicSetOnHold(newOnHold, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD, newOnHold, newOnHold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				return basicSetParty(null, msgs);
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				return basicSetOnHold(null, msgs);
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				return getParty();
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				return getOnHold();
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				return getPeriod();
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
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				setParty((Reference)newValue);
				return;
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				setOnHold((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				setPeriod((Period)newValue);
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
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				setParty((Reference)null);
				return;
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				setOnHold((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				setPeriod((Period)null);
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
			case ResourcesPackage.ACCOUNT_GUARANTOR__PARTY:
				return party != null;
			case ResourcesPackage.ACCOUNT_GUARANTOR__ON_HOLD:
				return onHold != null;
			case ResourcesPackage.ACCOUNT_GUARANTOR__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountGuarantorImpl
