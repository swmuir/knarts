/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ClaimResponseItemAdjudication;
import org.eclipse.mdht.hl7.fhir.resources.ClaimResponseItemItemDetail;
import org.eclipse.mdht.hl7.fhir.resources.ClaimResponseItemItemDetailSubDetail;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Item Item Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseItemItemDetailImpl#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseItemItemDetailImpl#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseItemItemDetailImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseItemItemDetailImpl#getSubDetails <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseItemItemDetailImpl extends BackboneElementImpl implements ClaimResponseItemItemDetail {
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
	 * The cached value of the '{@link #getNoteNumbers() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumbers;

	/**
	 * The cached value of the '{@link #getAdjudications() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudications()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItemAdjudication> adjudications;

	/**
	 * The cached value of the '{@link #getSubDetails() <em>Sub Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItemItemDetailSubDetail> subDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseItemItemDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimResponseItemItemDetail();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE, oldDetailSequence, newDetailSequence);
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
				msgs = ((InternalEObject)detailSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE, null, msgs);
			if (newDetailSequence != null)
				msgs = ((InternalEObject)newDetailSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE, null, msgs);
			msgs = basicSetDetailSequence(newDetailSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE, newDetailSequence, newDetailSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getNoteNumbers() {
		if (noteNumbers == null) {
			noteNumbers = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__NOTE_NUMBER);
		}
		return noteNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ClaimResponseItemAdjudication>(ClaimResponseItemAdjudication.class, this, ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseItemItemDetailSubDetail> getSubDetails() {
		if (subDetails == null) {
			subDetails = new EObjectContainmentEList<ClaimResponseItemItemDetailSubDetail>(ClaimResponseItemItemDetailSubDetail.class, this, ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__SUB_DETAIL);
		}
		return subDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE:
				return basicSetDetailSequence(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumbers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__SUB_DETAIL:
				return ((InternalEList<?>)getSubDetails()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE:
				return getDetailSequence();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__NOTE_NUMBER:
				return getNoteNumbers();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__ADJUDICATION:
				return getAdjudications();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__SUB_DETAIL:
				return getSubDetails();
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
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE:
				setDetailSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__NOTE_NUMBER:
				getNoteNumbers().clear();
				getNoteNumbers().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ClaimResponseItemAdjudication>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
				getSubDetails().addAll((Collection<? extends ClaimResponseItemItemDetailSubDetail>)newValue);
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
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE:
				setDetailSequence((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__NOTE_NUMBER:
				getNoteNumbers().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__ADJUDICATION:
				getAdjudications().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
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
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__DETAIL_SEQUENCE:
				return detailSequence != null;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__NOTE_NUMBER:
				return noteNumbers != null && !noteNumbers.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM_ITEM_DETAIL__SUB_DETAIL:
				return subDetails != null && !subDetails.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseItemItemDetailImpl
