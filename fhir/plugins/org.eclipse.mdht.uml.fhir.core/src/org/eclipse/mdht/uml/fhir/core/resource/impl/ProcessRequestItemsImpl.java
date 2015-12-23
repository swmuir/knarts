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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ProcessRequestItems;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Request Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ProcessRequestItemsImpl#getSequenceLinkId <em>Sequence Link Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRequestItemsImpl extends BackboneElementImpl implements ProcessRequestItems {
	/**
	 * The cached value of the '{@link #getSequenceLinkId() <em>Sequence Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer sequenceLinkId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequestItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getProcessRequestItems();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getSequenceLinkId() {
		if (sequenceLinkId != null && sequenceLinkId.eIsProxy()) {
			InternalEObject oldSequenceLinkId = (InternalEObject)sequenceLinkId;
			sequenceLinkId = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldSequenceLinkId);
			if (sequenceLinkId != oldSequenceLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PROCESS_REQUEST_ITEMS__SEQUENCE_LINK_ID, oldSequenceLinkId, sequenceLinkId));
			}
		}
		return sequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetSequenceLinkId() {
		return sequenceLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceLinkId(org.eclipse.mdht.uml.fhir.core.datatype.Integer newSequenceLinkId) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldSequenceLinkId = sequenceLinkId;
		sequenceLinkId = newSequenceLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PROCESS_REQUEST_ITEMS__SEQUENCE_LINK_ID, oldSequenceLinkId, sequenceLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.PROCESS_REQUEST_ITEMS__SEQUENCE_LINK_ID:
				if (resolve) return getSequenceLinkId();
				return basicGetSequenceLinkId();
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
			case FhirResourcePackage.PROCESS_REQUEST_ITEMS__SEQUENCE_LINK_ID:
				setSequenceLinkId((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
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
			case FhirResourcePackage.PROCESS_REQUEST_ITEMS__SEQUENCE_LINK_ID:
				setSequenceLinkId((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
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
			case FhirResourcePackage.PROCESS_REQUEST_ITEMS__SEQUENCE_LINK_ID:
				return sequenceLinkId != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessRequestItemsImpl
