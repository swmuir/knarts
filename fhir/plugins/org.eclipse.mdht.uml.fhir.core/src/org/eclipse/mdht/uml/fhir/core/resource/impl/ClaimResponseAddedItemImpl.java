/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseAddedItem;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseAddedItemAddedItemAdjudication;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseAddedItemAddedItemsDetail;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Added Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseAddedItemImpl#getSequenceLinkIds <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseAddedItemImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseAddedItemImpl#getFee <em>Fee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseAddedItemImpl#getNoteNumberLinkIds <em>Note Number Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseAddedItemImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseAddedItemImpl#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseAddedItemImpl extends BackboneElementImpl implements ClaimResponseAddedItem {
	/**
	 * The cached value of the '{@link #getSequenceLinkIds() <em>Sequence Link Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> sequenceLinkIds;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Coding service;

	/**
	 * The cached value of the '{@link #getFee() <em>Fee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFee()
	 * @generated
	 * @ordered
	 */
	protected Money fee;

	/**
	 * The cached value of the '{@link #getNoteNumberLinkIds() <em>Note Number Link Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumberLinkIds()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumberLinkIds;

	/**
	 * The cached value of the '{@link #getAdjudications() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudications()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddedItemAddedItemAdjudication> adjudications;

	/**
	 * The cached value of the '{@link #getDetails() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddedItemAddedItemsDetail> details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseAddedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClaimResponseAddedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getSequenceLinkIds() {
		if (sequenceLinkIds == null) {
			sequenceLinkIds = new EObjectResolvingEList<PositiveInt>(PositiveInt.class, this, FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID);
		}
		return sequenceLinkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Coding)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Coding newService) {
		Coding oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getFee() {
		if (fee != null && fee.eIsProxy()) {
			InternalEObject oldFee = (InternalEObject)fee;
			fee = (Money)eResolveProxy(oldFee);
			if (fee != oldFee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__FEE, oldFee, fee));
			}
		}
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetFee() {
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFee(Money newFee) {
		Money oldFee = fee;
		fee = newFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__FEE, oldFee, fee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumberLinkIds() {
		if (noteNumberLinkIds == null) {
			noteNumberLinkIds = new EObjectResolvingEList<PositiveInt>(PositiveInt.class, this, FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER_LINK_ID);
		}
		return noteNumberLinkIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAddedItemAddedItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ClaimResponseAddedItemAddedItemAdjudication>(ClaimResponseAddedItemAddedItemAdjudication.class, this, FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAddedItemAddedItemsDetail> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<ClaimResponseAddedItemAddedItemsDetail>(ClaimResponseAddedItemAddedItemsDetail.class, this, FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL);
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
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
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
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID:
				return getSequenceLinkIds();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__FEE:
				if (resolve) return getFee();
				return basicGetFee();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER_LINK_ID:
				return getNoteNumberLinkIds();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				return getAdjudications();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
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
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID:
				getSequenceLinkIds().clear();
				getSequenceLinkIds().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__FEE:
				setFee((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER_LINK_ID:
				getNoteNumberLinkIds().clear();
				getNoteNumberLinkIds().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ClaimResponseAddedItemAddedItemAdjudication>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
				getDetails().clear();
				getDetails().addAll((Collection<? extends ClaimResponseAddedItemAddedItemsDetail>)newValue);
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
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID:
				getSequenceLinkIds().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE:
				setService((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__FEE:
				setFee((Money)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER_LINK_ID:
				getNoteNumberLinkIds().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				getAdjudications().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
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
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SEQUENCE_LINK_ID:
				return sequenceLinkIds != null && !sequenceLinkIds.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__SERVICE:
				return service != null;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__FEE:
				return fee != null;
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__NOTE_NUMBER_LINK_ID:
				return noteNumberLinkIds != null && !noteNumberLinkIds.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE_ADDED_ITEM__DETAIL:
				return details != null && !details.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseAddedItemImpl
