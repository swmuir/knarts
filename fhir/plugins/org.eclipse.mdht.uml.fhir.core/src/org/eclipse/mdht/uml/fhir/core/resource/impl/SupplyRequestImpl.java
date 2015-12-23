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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;
import org.eclipse.mdht.uml.fhir.core.resource.SupplyRequest;
import org.eclipse.mdht.uml.fhir.core.resource.SupplyRequestWhen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getOrderedItem <em>Ordered Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getReasonx <em>Reasonx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SupplyRequestImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyRequestImpl extends DomainResourceImpl implements SupplyRequest {
	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Resource source;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept kind;

	/**
	 * The cached value of the '{@link #getOrderedItem() <em>Ordered Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedItem()
	 * @generated
	 * @ordered
	 */
	protected Resource orderedItem;

	/**
	 * The cached value of the '{@link #getSuppliers() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> suppliers;

	/**
	 * The cached value of the '{@link #getReasonx() <em>Reasonx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonx()
	 * @generated
	 * @ordered
	 */
	protected Base reasonx;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected SupplyRequestWhen when;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getSupplyRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SUPPLY_REQUEST__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Resource)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SUPPLY_REQUEST__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Resource newSource) {
		Resource oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SUPPLY_REQUEST__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SUPPLY_REQUEST__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SUPPLY_REQUEST__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (CodeableConcept)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SUPPLY_REQUEST__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CodeableConcept newKind) {
		CodeableConcept oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getOrderedItem() {
		if (orderedItem != null && orderedItem.eIsProxy()) {
			InternalEObject oldOrderedItem = (InternalEObject)orderedItem;
			orderedItem = (Resource)eResolveProxy(oldOrderedItem);
			if (orderedItem != oldOrderedItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SUPPLY_REQUEST__ORDERED_ITEM, oldOrderedItem, orderedItem));
			}
		}
		return orderedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetOrderedItem() {
		return orderedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedItem(Resource newOrderedItem) {
		Resource oldOrderedItem = orderedItem;
		orderedItem = newOrderedItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__ORDERED_ITEM, oldOrderedItem, orderedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getSuppliers() {
		if (suppliers == null) {
			suppliers = new EObjectResolvingEList<Organization>(Organization.class, this, FhirResourcePackage.SUPPLY_REQUEST__SUPPLIER);
		}
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getReasonx() {
		if (reasonx != null && reasonx.eIsProxy()) {
			InternalEObject oldReasonx = (InternalEObject)reasonx;
			reasonx = (Base)eResolveProxy(oldReasonx);
			if (reasonx != oldReasonx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SUPPLY_REQUEST__REASONX, oldReasonx, reasonx));
			}
		}
		return reasonx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetReasonx() {
		return reasonx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonx(Base newReasonx) {
		Base oldReasonx = reasonx;
		reasonx = newReasonx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__REASONX, oldReasonx, reasonx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequestWhen getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(SupplyRequestWhen newWhen, NotificationChain msgs) {
		SupplyRequestWhen oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(SupplyRequestWhen newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.SUPPLY_REQUEST__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.SUPPLY_REQUEST__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SUPPLY_REQUEST__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.SUPPLY_REQUEST__WHEN:
				return basicSetWhen(null, msgs);
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
			case FhirResourcePackage.SUPPLY_REQUEST__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.SUPPLY_REQUEST__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FhirResourcePackage.SUPPLY_REQUEST__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.SUPPLY_REQUEST__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.SUPPLY_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.SUPPLY_REQUEST__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case FhirResourcePackage.SUPPLY_REQUEST__ORDERED_ITEM:
				if (resolve) return getOrderedItem();
				return basicGetOrderedItem();
			case FhirResourcePackage.SUPPLY_REQUEST__SUPPLIER:
				return getSuppliers();
			case FhirResourcePackage.SUPPLY_REQUEST__REASONX:
				if (resolve) return getReasonx();
				return basicGetReasonx();
			case FhirResourcePackage.SUPPLY_REQUEST__WHEN:
				return getWhen();
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
			case FhirResourcePackage.SUPPLY_REQUEST__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__SOURCE:
				setSource((Resource)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__KIND:
				setKind((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__ORDERED_ITEM:
				setOrderedItem((Resource)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__SUPPLIER:
				getSuppliers().clear();
				getSuppliers().addAll((Collection<? extends Organization>)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__REASONX:
				setReasonx((Base)newValue);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__WHEN:
				setWhen((SupplyRequestWhen)newValue);
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
			case FhirResourcePackage.SUPPLY_REQUEST__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__SOURCE:
				setSource((Resource)null);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__KIND:
				setKind((CodeableConcept)null);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__ORDERED_ITEM:
				setOrderedItem((Resource)null);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__SUPPLIER:
				getSuppliers().clear();
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__REASONX:
				setReasonx((Base)null);
				return;
			case FhirResourcePackage.SUPPLY_REQUEST__WHEN:
				setWhen((SupplyRequestWhen)null);
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
			case FhirResourcePackage.SUPPLY_REQUEST__PATIENT:
				return patient != null;
			case FhirResourcePackage.SUPPLY_REQUEST__SOURCE:
				return source != null;
			case FhirResourcePackage.SUPPLY_REQUEST__DATE:
				return date != null;
			case FhirResourcePackage.SUPPLY_REQUEST__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.SUPPLY_REQUEST__STATUS:
				return status != null;
			case FhirResourcePackage.SUPPLY_REQUEST__KIND:
				return kind != null;
			case FhirResourcePackage.SUPPLY_REQUEST__ORDERED_ITEM:
				return orderedItem != null;
			case FhirResourcePackage.SUPPLY_REQUEST__SUPPLIER:
				return suppliers != null && !suppliers.isEmpty();
			case FhirResourcePackage.SUPPLY_REQUEST__REASONX:
				return reasonx != null;
			case FhirResourcePackage.SUPPLY_REQUEST__WHEN:
				return when != null;
		}
		return super.eIsSet(featureID);
	}

} //SupplyRequestImpl
