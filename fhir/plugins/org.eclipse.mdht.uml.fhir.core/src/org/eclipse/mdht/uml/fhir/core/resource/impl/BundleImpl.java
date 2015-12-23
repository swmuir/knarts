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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Signature;
import org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt;

import org.eclipse.mdht.uml.fhir.core.resource.Bundle;
import org.eclipse.mdht.uml.fhir.core.resource.BundleEntry;
import org.eclipse.mdht.uml.fhir.core.resource.BundleLink;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleImpl#getLinks <em>Link</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleImpl#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.BundleImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleImpl extends ResourceImpl implements Bundle {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt total;

	/**
	 * The cached value of the '{@link #getLinks() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleLink> links;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleEntry> entries;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getBundle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getTotal() {
		if (total != null && total.eIsProxy()) {
			InternalEObject oldTotal = (InternalEObject)total;
			total = (UnsignedInt)eResolveProxy(oldTotal);
			if (total != oldTotal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE__TOTAL, oldTotal, total));
			}
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(UnsignedInt newTotal) {
		UnsignedInt oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<BundleLink>(BundleLink.class, this, FhirResourcePackage.BUNDLE__LINK);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<BundleEntry>(BundleEntry.class, this, FhirResourcePackage.BUNDLE__ENTRY);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (Signature)eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.BUNDLE__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(Signature newSignature) {
		Signature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.BUNDLE__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.BUNDLE__LINK:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.BUNDLE__ENTRY:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.BUNDLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.BUNDLE__TOTAL:
				if (resolve) return getTotal();
				return basicGetTotal();
			case FhirResourcePackage.BUNDLE__LINK:
				return getLinks();
			case FhirResourcePackage.BUNDLE__ENTRY:
				return getEntries();
			case FhirResourcePackage.BUNDLE__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
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
			case FhirResourcePackage.BUNDLE__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.BUNDLE__TOTAL:
				setTotal((UnsignedInt)newValue);
				return;
			case FhirResourcePackage.BUNDLE__LINK:
				getLinks().clear();
				getLinks().addAll((Collection<? extends BundleLink>)newValue);
				return;
			case FhirResourcePackage.BUNDLE__ENTRY:
				getEntries().clear();
				getEntries().addAll((Collection<? extends BundleEntry>)newValue);
				return;
			case FhirResourcePackage.BUNDLE__SIGNATURE:
				setSignature((Signature)newValue);
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
			case FhirResourcePackage.BUNDLE__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.BUNDLE__TOTAL:
				setTotal((UnsignedInt)null);
				return;
			case FhirResourcePackage.BUNDLE__LINK:
				getLinks().clear();
				return;
			case FhirResourcePackage.BUNDLE__ENTRY:
				getEntries().clear();
				return;
			case FhirResourcePackage.BUNDLE__SIGNATURE:
				setSignature((Signature)null);
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
			case FhirResourcePackage.BUNDLE__TYPE:
				return type != null;
			case FhirResourcePackage.BUNDLE__TOTAL:
				return total != null;
			case FhirResourcePackage.BUNDLE__LINK:
				return links != null && !links.isEmpty();
			case FhirResourcePackage.BUNDLE__ENTRY:
				return entries != null && !entries.isEmpty();
			case FhirResourcePackage.BUNDLE__SIGNATURE:
				return signature != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleImpl
