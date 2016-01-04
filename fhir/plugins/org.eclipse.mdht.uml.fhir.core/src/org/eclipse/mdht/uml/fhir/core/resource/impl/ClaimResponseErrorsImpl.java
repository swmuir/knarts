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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseErrors;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Errors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseErrorsImpl#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseErrorsImpl#getDetailSequenceLinkId <em>Detail Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseErrorsImpl#getSubdetailSequenceLinkId <em>Subdetail Sequence Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseErrorsImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseErrorsImpl extends BackboneElementImpl implements ClaimResponseErrors {
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
	 * The cached value of the '{@link #getDetailSequenceLinkId() <em>Detail Sequence Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt detailSequenceLinkId;

	/**
	 * The cached value of the '{@link #getSubdetailSequenceLinkId() <em>Subdetail Sequence Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdetailSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt subdetailSequenceLinkId;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Coding code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseErrorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClaimResponseErrors();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SEQUENCE_LINK_ID, oldSequenceLinkId, sequenceLinkId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SEQUENCE_LINK_ID, oldSequenceLinkId, sequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDetailSequenceLinkId() {
		if (detailSequenceLinkId != null && detailSequenceLinkId.eIsProxy()) {
			InternalEObject oldDetailSequenceLinkId = (InternalEObject)detailSequenceLinkId;
			detailSequenceLinkId = (PositiveInt)eResolveProxy(oldDetailSequenceLinkId);
			if (detailSequenceLinkId != oldDetailSequenceLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ERRORS__DETAIL_SEQUENCE_LINK_ID, oldDetailSequenceLinkId, detailSequenceLinkId));
			}
		}
		return detailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetDetailSequenceLinkId() {
		return detailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailSequenceLinkId(PositiveInt newDetailSequenceLinkId) {
		PositiveInt oldDetailSequenceLinkId = detailSequenceLinkId;
		detailSequenceLinkId = newDetailSequenceLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ERRORS__DETAIL_SEQUENCE_LINK_ID, oldDetailSequenceLinkId, detailSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSubdetailSequenceLinkId() {
		if (subdetailSequenceLinkId != null && subdetailSequenceLinkId.eIsProxy()) {
			InternalEObject oldSubdetailSequenceLinkId = (InternalEObject)subdetailSequenceLinkId;
			subdetailSequenceLinkId = (PositiveInt)eResolveProxy(oldSubdetailSequenceLinkId);
			if (subdetailSequenceLinkId != oldSubdetailSequenceLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SUBDETAIL_SEQUENCE_LINK_ID, oldSubdetailSequenceLinkId, subdetailSequenceLinkId));
			}
		}
		return subdetailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSubdetailSequenceLinkId() {
		return subdetailSequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubdetailSequenceLinkId(PositiveInt newSubdetailSequenceLinkId) {
		PositiveInt oldSubdetailSequenceLinkId = subdetailSequenceLinkId;
		subdetailSequenceLinkId = newSubdetailSequenceLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SUBDETAIL_SEQUENCE_LINK_ID, oldSubdetailSequenceLinkId, subdetailSequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Coding)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_ERRORS__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Coding newCode) {
		Coding oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_ERRORS__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SEQUENCE_LINK_ID:
				if (resolve) return getSequenceLinkId();
				return basicGetSequenceLinkId();
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__DETAIL_SEQUENCE_LINK_ID:
				if (resolve) return getDetailSequenceLinkId();
				return basicGetDetailSequenceLinkId();
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SUBDETAIL_SEQUENCE_LINK_ID:
				if (resolve) return getSubdetailSequenceLinkId();
				return basicGetSubdetailSequenceLinkId();
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__CODE:
				if (resolve) return getCode();
				return basicGetCode();
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
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__DETAIL_SEQUENCE_LINK_ID:
				setDetailSequenceLinkId((PositiveInt)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SUBDETAIL_SEQUENCE_LINK_ID:
				setSubdetailSequenceLinkId((PositiveInt)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__CODE:
				setCode((Coding)newValue);
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
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SEQUENCE_LINK_ID:
				setSequenceLinkId((PositiveInt)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__DETAIL_SEQUENCE_LINK_ID:
				setDetailSequenceLinkId((PositiveInt)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SUBDETAIL_SEQUENCE_LINK_ID:
				setSubdetailSequenceLinkId((PositiveInt)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__CODE:
				setCode((Coding)null);
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
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SEQUENCE_LINK_ID:
				return sequenceLinkId != null;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__DETAIL_SEQUENCE_LINK_ID:
				return detailSequenceLinkId != null;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__SUBDETAIL_SEQUENCE_LINK_ID:
				return subdetailSequenceLinkId != null;
			case FhirResourcePackage.CLAIM_RESPONSE_ERRORS__CODE:
				return code != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseErrorsImpl
