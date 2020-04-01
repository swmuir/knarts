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

import org.eclipse.mdht.hl7.fhir.resources.ClaimResponseItem;
import org.eclipse.mdht.hl7.fhir.resources.ClaimResponseItemAdjudication;
import org.eclipse.mdht.hl7.fhir.resources.ClaimResponseItemItemDetail;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseItemImpl#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseItemImpl#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseItemImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ClaimResponseItemImpl#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseItemImpl extends BackboneElementImpl implements ClaimResponseItem {
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
	 * The cached value of the '{@link #getDetails() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItemItemDetail> details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimResponseItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE, oldItemSequence, newItemSequence);
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
				msgs = ((InternalEObject)itemSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE, null, msgs);
			if (newItemSequence != null)
				msgs = ((InternalEObject)newItemSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE, null, msgs);
			msgs = basicSetItemSequence(newItemSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE, newItemSequence, newItemSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getNoteNumbers() {
		if (noteNumbers == null) {
			noteNumbers = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER);
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
			adjudications = new EObjectContainmentEList<ClaimResponseItemAdjudication>(ClaimResponseItemAdjudication.class, this, ResourcesPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClaimResponseItemItemDetail> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<ClaimResponseItemItemDetail>(ClaimResponseItemItemDetail.class, this, ResourcesPackage.CLAIM_RESPONSE_ITEM__DETAIL);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				return basicSetItemSequence(null, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumbers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				return getItemSequence();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				return getNoteNumbers();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				return getAdjudications();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				return getDetails();
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
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				setItemSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				getNoteNumbers().clear();
				getNoteNumbers().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ClaimResponseItemAdjudication>)newValue);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				getDetails().clear();
				getDetails().addAll((Collection<? extends ClaimResponseItemItemDetail>)newValue);
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
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				setItemSequence((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				getNoteNumbers().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				getAdjudications().clear();
				return;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				getDetails().clear();
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
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ITEM_SEQUENCE:
				return itemSequence != null;
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__NOTE_NUMBER:
				return noteNumbers != null && !noteNumbers.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case ResourcesPackage.CLAIM_RESPONSE_ITEM__DETAIL:
				return details != null && !details.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseItemImpl
