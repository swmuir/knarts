/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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

import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItems;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemAdjudication;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItemsItemDetail;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseItemsImpl#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseItemsImpl#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseItemsImpl#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseItemsImpl#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseItemsImpl extends BackboneElementImpl implements ClaimResponseItems {
	/**
	 * The cached value of the '{@link #getSequenceLinkId() <em>Sequence Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequenceLinkId;

	/**
	 * The cached value of the '{@link #getNoteNumbers() <em>Note Number</em>}' reference list.
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
	protected EList<ClaimResponseItemsItemAdjudication> adjudications;

	/**
	 * The cached value of the '{@link #getDetails() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItemsItemDetail> details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClaimResponseItems();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequenceLinkId() {
		if (sequenceLinkId != null && sequenceLinkId.eIsProxy()) {
			InternalEObject oldSequenceLinkId = (InternalEObject)sequenceLinkId;
			sequenceLinkId = (PositiveInt)eResolveProxy(oldSequenceLinkId);
			if (sequenceLinkId != oldSequenceLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ITEMS__SEQUENCE_LINK_ID, oldSequenceLinkId, sequenceLinkId));
			}
		}
		return sequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSequenceLinkId() {
		return sequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceLinkId(PositiveInt newSequenceLinkId) {
		PositiveInt oldSequenceLinkId = sequenceLinkId;
		sequenceLinkId = newSequenceLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ITEMS__SEQUENCE_LINK_ID, oldSequenceLinkId, sequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumbers() {
		if (noteNumbers == null) {
			noteNumbers = new EObjectResolvingEList<PositiveInt>(PositiveInt.class, this, FhirResourcePackage.CLAIM_RESPONSE_ITEMS__NOTE_NUMBER);
		}
		return noteNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseItemsItemAdjudication> getAdjudications() {
		if (adjudications == null) {
			adjudications = new EObjectContainmentEList<ClaimResponseItemsItemAdjudication>(ClaimResponseItemsItemAdjudication.class, this, FhirResourcePackage.CLAIM_RESPONSE_ITEMS__ADJUDICATION);
		}
		return adjudications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseItemsItemDetail> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<ClaimResponseItemsItemDetail>(ClaimResponseItemsItemDetail.class, this, FhirResourcePackage.CLAIM_RESPONSE_ITEMS__DETAIL);
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
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__ADJUDICATION:
				return ((InternalEList<?>)getAdjudications()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__DETAIL:
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
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__SEQUENCE_LINK_ID:
				if (resolve) return getSequenceLinkId();
				return basicGetSequenceLinkId();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__NOTE_NUMBER:
				return getNoteNumbers();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__ADJUDICATION:
				return getAdjudications();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__DETAIL:
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
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__NOTE_NUMBER:
				getNoteNumbers().clear();
				getNoteNumbers().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__ADJUDICATION:
				getAdjudications().clear();
				getAdjudications().addAll((Collection<? extends ClaimResponseItemsItemAdjudication>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__DETAIL:
				getDetails().clear();
				getDetails().addAll((Collection<? extends ClaimResponseItemsItemDetail>)newValue);
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
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__NOTE_NUMBER:
				getNoteNumbers().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__ADJUDICATION:
				getAdjudications().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__DETAIL:
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
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__SEQUENCE_LINK_ID:
				return sequenceLinkId != null;
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__NOTE_NUMBER:
				return noteNumbers != null && !noteNumbers.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__ADJUDICATION:
				return adjudications != null && !adjudications.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE_ITEMS__DETAIL:
				return details != null && !details.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseItemsImpl
