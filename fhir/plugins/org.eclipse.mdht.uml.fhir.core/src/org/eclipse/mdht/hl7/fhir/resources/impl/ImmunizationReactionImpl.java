/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ImmunizationReaction;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImmunizationReactionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImmunizationReactionImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ImmunizationReactionImpl#getReported <em>Reported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationReactionImpl extends BackboneElementImpl implements ImmunizationReaction {
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected Reference detail;

	/**
	 * The cached value of the '{@link #getReported() <em>Reported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReported()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean reported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationReactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImmunizationReaction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_REACTION__DATE, oldDate, newDate);
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
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_REACTION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_REACTION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_REACTION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(Reference newDetail, NotificationChain msgs) {
		Reference oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_REACTION__DETAIL, oldDetail, newDetail);
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
	public void setDetail(Reference newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_REACTION__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_REACTION__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_REACTION__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getReported() {
		return reported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReported(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newReported, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldReported = reported;
		reported = newReported;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_REACTION__REPORTED, oldReported, newReported);
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
	public void setReported(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newReported) {
		if (newReported != reported) {
			NotificationChain msgs = null;
			if (reported != null)
				msgs = ((InternalEObject)reported).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_REACTION__REPORTED, null, msgs);
			if (newReported != null)
				msgs = ((InternalEObject)newReported).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_REACTION__REPORTED, null, msgs);
			msgs = basicSetReported(newReported, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_REACTION__REPORTED, newReported, newReported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMMUNIZATION_REACTION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.IMMUNIZATION_REACTION__DETAIL:
				return basicSetDetail(null, msgs);
			case ResourcesPackage.IMMUNIZATION_REACTION__REPORTED:
				return basicSetReported(null, msgs);
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
			case ResourcesPackage.IMMUNIZATION_REACTION__DATE:
				return getDate();
			case ResourcesPackage.IMMUNIZATION_REACTION__DETAIL:
				return getDetail();
			case ResourcesPackage.IMMUNIZATION_REACTION__REPORTED:
				return getReported();
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
			case ResourcesPackage.IMMUNIZATION_REACTION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_REACTION__DETAIL:
				setDetail((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_REACTION__REPORTED:
				setReported((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
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
			case ResourcesPackage.IMMUNIZATION_REACTION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.IMMUNIZATION_REACTION__DETAIL:
				setDetail((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION_REACTION__REPORTED:
				setReported((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
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
			case ResourcesPackage.IMMUNIZATION_REACTION__DATE:
				return date != null;
			case ResourcesPackage.IMMUNIZATION_REACTION__DETAIL:
				return detail != null;
			case ResourcesPackage.IMMUNIZATION_REACTION__REPORTED:
				return reported != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationReactionImpl
