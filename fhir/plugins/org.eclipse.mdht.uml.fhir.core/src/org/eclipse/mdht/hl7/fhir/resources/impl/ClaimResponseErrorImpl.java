/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ClaimResponseError;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseErrorImpl#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseErrorImpl#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseErrorImpl#getSubDetailSequence <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseErrorImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseErrorImpl extends BackboneElementImpl implements ClaimResponseError {
	/**
	 * The cached value of the '{@link #getItemSequence() <em>Item Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt itemSequence;

	/**
	 * The cached value of the '{@link #getDetailSequence() <em>Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt detailSequence;

	/**
	 * The cached value of the '{@link #getSubDetailSequence() <em>Sub Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetailSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt subDetailSequence;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimResponseError();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getItemSequence() {
		return itemSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemSequence(PositiveInt newItemSequence, NotificationChain msgs) {
		PositiveInt oldItemSequence = itemSequence;
		itemSequence = newItemSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE, oldItemSequence, newItemSequence);
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
	public void setItemSequence(PositiveInt newItemSequence) {
		if (newItemSequence != itemSequence) {
			NotificationChain msgs = null;
			if (itemSequence != null)
				msgs = ((InternalEObject)itemSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE, null, msgs);
			if (newItemSequence != null)
				msgs = ((InternalEObject)newItemSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE, null, msgs);
			msgs = basicSetItemSequence(newItemSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE, newItemSequence, newItemSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getDetailSequence() {
		return detailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailSequence(PositiveInt newDetailSequence, NotificationChain msgs) {
		PositiveInt oldDetailSequence = detailSequence;
		detailSequence = newDetailSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE, oldDetailSequence, newDetailSequence);
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
	public void setDetailSequence(PositiveInt newDetailSequence) {
		if (newDetailSequence != detailSequence) {
			NotificationChain msgs = null;
			if (detailSequence != null)
				msgs = ((InternalEObject)detailSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE, null, msgs);
			if (newDetailSequence != null)
				msgs = ((InternalEObject)newDetailSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE, null, msgs);
			msgs = basicSetDetailSequence(newDetailSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE, newDetailSequence, newDetailSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSubDetailSequence() {
		return subDetailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubDetailSequence(PositiveInt newSubDetailSequence, NotificationChain msgs) {
		PositiveInt oldSubDetailSequence = subDetailSequence;
		subDetailSequence = newSubDetailSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE, oldSubDetailSequence, newSubDetailSequence);
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
	public void setSubDetailSequence(PositiveInt newSubDetailSequence) {
		if (newSubDetailSequence != subDetailSequence) {
			NotificationChain msgs = null;
			if (subDetailSequence != null)
				msgs = ((InternalEObject)subDetailSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE, null, msgs);
			if (newSubDetailSequence != null)
				msgs = ((InternalEObject)newSubDetailSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE, null, msgs);
			msgs = basicSetSubDetailSequence(newSubDetailSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE, newSubDetailSequence, newSubDetailSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				return basicSetItemSequence(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				return basicSetDetailSequence(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				return basicSetSubDetailSequence(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				return basicSetCode(null, msgs);
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
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				return getItemSequence();
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				return getDetailSequence();
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				return getSubDetailSequence();
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				return getCode();
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
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				setItemSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				setDetailSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				setSubDetailSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				setCode((CodeableConcept)newValue);
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
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				setItemSequence((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				setDetailSequence((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				setSubDetailSequence((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				setCode((CodeableConcept)null);
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
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__ITEM_SEQUENCE:
				return itemSequence != null;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__DETAIL_SEQUENCE:
				return detailSequence != null;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__SUB_DETAIL_SEQUENCE:
				return subDetailSequence != null;
			case ResourcesPackage.CLAIM_RESPONSE_ERROR__CODE:
				return code != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseErrorImpl
