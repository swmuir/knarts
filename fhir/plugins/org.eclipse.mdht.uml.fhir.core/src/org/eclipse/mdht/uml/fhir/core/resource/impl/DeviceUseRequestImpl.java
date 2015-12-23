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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.Device;
import org.eclipse.mdht.uml.fhir.core.resource.DeviceUseRequest;
import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Use Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getBodySitex <em>Body Sitex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getIndications <em>Indication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getPrnReasons <em>Prn Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseRequestImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceUseRequestImpl extends DomainResourceImpl implements DeviceUseRequest {
	/**
	 * The cached value of the '{@link #getBodySitex() <em>Body Sitex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySitex()
	 * @generated
	 * @ordered
	 */
	protected Base bodySitex;

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
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getIndications() <em>Indication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> indications;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> notes;

	/**
	 * The cached value of the '{@link #getPrnReasons() <em>Prn Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrnReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> prnReasons;

	/**
	 * The cached value of the '{@link #getOrderedOn() <em>Ordered On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime orderedOn;

	/**
	 * The cached value of the '{@link #getRecordedOn() <em>Recorded On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedOn;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Patient subject;

	/**
	 * The cached value of the '{@link #getTimingx() <em>Timingx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingx()
	 * @generated
	 * @ordered
	 */
	protected DataType timingx;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Code priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUseRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDeviceUseRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getBodySitex() {
		if (bodySitex != null && bodySitex.eIsProxy()) {
			InternalEObject oldBodySitex = (InternalEObject)bodySitex;
			bodySitex = (Base)eResolveProxy(oldBodySitex);
			if (bodySitex != oldBodySitex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__BODY_SITEX, oldBodySitex, bodySitex));
			}
		}
		return bodySitex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetBodySitex() {
		return bodySitex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySitex(Base newBodySitex) {
		Base oldBodySitex = bodySitex;
		bodySitex = newBodySitex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__BODY_SITEX, oldBodySitex, bodySitex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (Device)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		if (encounter != null && encounter.eIsProxy()) {
			InternalEObject oldEncounter = (InternalEObject)encounter;
			encounter = (Encounter)eResolveProxy(oldEncounter);
			if (encounter != oldEncounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__ENCOUNTER, oldEncounter, encounter));
			}
		}
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter basicGetEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		Encounter oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.DEVICE_USE_REQUEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getIndications() {
		if (indications == null) {
			indications = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.DEVICE_USE_REQUEST__INDICATION);
		}
		return indications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.DEVICE_USE_REQUEST__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPrnReasons() {
		if (prnReasons == null) {
			prnReasons = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.DEVICE_USE_REQUEST__PRN_REASON);
		}
		return prnReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getOrderedOn() {
		if (orderedOn != null && orderedOn.eIsProxy()) {
			InternalEObject oldOrderedOn = (InternalEObject)orderedOn;
			orderedOn = (DateTime)eResolveProxy(oldOrderedOn);
			if (orderedOn != oldOrderedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__ORDERED_ON, oldOrderedOn, orderedOn));
			}
		}
		return orderedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetOrderedOn() {
		return orderedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedOn(DateTime newOrderedOn) {
		DateTime oldOrderedOn = orderedOn;
		orderedOn = newOrderedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__ORDERED_ON, oldOrderedOn, orderedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRecordedOn() {
		if (recordedOn != null && recordedOn.eIsProxy()) {
			InternalEObject oldRecordedOn = (InternalEObject)recordedOn;
			recordedOn = (DateTime)eResolveProxy(oldRecordedOn);
			if (recordedOn != oldRecordedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__RECORDED_ON, oldRecordedOn, recordedOn));
			}
		}
		return recordedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetRecordedOn() {
		return recordedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordedOn(DateTime newRecordedOn) {
		DateTime oldRecordedOn = recordedOn;
		recordedOn = newRecordedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__RECORDED_ON, oldRecordedOn, recordedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Patient)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Patient newSubject) {
		Patient oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTimingx() {
		if (timingx != null && timingx.eIsProxy()) {
			InternalEObject oldTimingx = (InternalEObject)timingx;
			timingx = (DataType)eResolveProxy(oldTimingx);
			if (timingx != oldTimingx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__TIMINGX, oldTimingx, timingx));
			}
		}
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetTimingx() {
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingx(DataType newTimingx) {
		DataType oldTimingx = timingx;
		timingx = newTimingx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__TIMINGX, oldTimingx, timingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (Code)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_REQUEST__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Code newPriority) {
		Code oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_REQUEST__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.DEVICE_USE_REQUEST__BODY_SITEX:
				if (resolve) return getBodySitex();
				return basicGetBodySitex();
			case FhirResourcePackage.DEVICE_USE_REQUEST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.DEVICE_USE_REQUEST__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case FhirResourcePackage.DEVICE_USE_REQUEST__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.DEVICE_USE_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.DEVICE_USE_REQUEST__INDICATION:
				return getIndications();
			case FhirResourcePackage.DEVICE_USE_REQUEST__NOTES:
				return getNotes();
			case FhirResourcePackage.DEVICE_USE_REQUEST__PRN_REASON:
				return getPrnReasons();
			case FhirResourcePackage.DEVICE_USE_REQUEST__ORDERED_ON:
				if (resolve) return getOrderedOn();
				return basicGetOrderedOn();
			case FhirResourcePackage.DEVICE_USE_REQUEST__RECORDED_ON:
				if (resolve) return getRecordedOn();
				return basicGetRecordedOn();
			case FhirResourcePackage.DEVICE_USE_REQUEST__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.DEVICE_USE_REQUEST__TIMINGX:
				if (resolve) return getTimingx();
				return basicGetTimingx();
			case FhirResourcePackage.DEVICE_USE_REQUEST__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
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
			case FhirResourcePackage.DEVICE_USE_REQUEST__BODY_SITEX:
				setBodySitex((Base)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__DEVICE:
				setDevice((Device)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__INDICATION:
				getIndications().clear();
				getIndications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__PRN_REASON:
				getPrnReasons().clear();
				getPrnReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__RECORDED_ON:
				setRecordedOn((DateTime)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__SUBJECT:
				setSubject((Patient)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__TIMINGX:
				setTimingx((DataType)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__PRIORITY:
				setPriority((Code)newValue);
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
			case FhirResourcePackage.DEVICE_USE_REQUEST__BODY_SITEX:
				setBodySitex((Base)null);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__DEVICE:
				setDevice((Device)null);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__INDICATION:
				getIndications().clear();
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__NOTES:
				getNotes().clear();
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__PRN_REASON:
				getPrnReasons().clear();
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__ORDERED_ON:
				setOrderedOn((DateTime)null);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__RECORDED_ON:
				setRecordedOn((DateTime)null);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__SUBJECT:
				setSubject((Patient)null);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__TIMINGX:
				setTimingx((DataType)null);
				return;
			case FhirResourcePackage.DEVICE_USE_REQUEST__PRIORITY:
				setPriority((Code)null);
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
			case FhirResourcePackage.DEVICE_USE_REQUEST__BODY_SITEX:
				return bodySitex != null;
			case FhirResourcePackage.DEVICE_USE_REQUEST__STATUS:
				return status != null;
			case FhirResourcePackage.DEVICE_USE_REQUEST__DEVICE:
				return device != null;
			case FhirResourcePackage.DEVICE_USE_REQUEST__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.DEVICE_USE_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.DEVICE_USE_REQUEST__INDICATION:
				return indications != null && !indications.isEmpty();
			case FhirResourcePackage.DEVICE_USE_REQUEST__NOTES:
				return notes != null && !notes.isEmpty();
			case FhirResourcePackage.DEVICE_USE_REQUEST__PRN_REASON:
				return prnReasons != null && !prnReasons.isEmpty();
			case FhirResourcePackage.DEVICE_USE_REQUEST__ORDERED_ON:
				return orderedOn != null;
			case FhirResourcePackage.DEVICE_USE_REQUEST__RECORDED_ON:
				return recordedOn != null;
			case FhirResourcePackage.DEVICE_USE_REQUEST__SUBJECT:
				return subject != null;
			case FhirResourcePackage.DEVICE_USE_REQUEST__TIMINGX:
				return timingx != null;
			case FhirResourcePackage.DEVICE_USE_REQUEST__PRIORITY:
				return priority != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceUseRequestImpl
