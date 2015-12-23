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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.resource.Device;
import org.eclipse.mdht.uml.fhir.core.resource.DeviceUseStatement;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Use Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getBodySitex <em>Body Sitex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getWhenUsed <em>When Used</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getIndications <em>Indication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceUseStatementImpl#getTimingx <em>Timingx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceUseStatementImpl extends DomainResourceImpl implements DeviceUseStatement {
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
	 * The cached value of the '{@link #getWhenUsed() <em>When Used</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenUsed()
	 * @generated
	 * @ordered
	 */
	protected Period whenUsed;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDeviceUseStatement();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_STATEMENT__BODY_SITEX, oldBodySitex, bodySitex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_STATEMENT__BODY_SITEX, oldBodySitex, bodySitex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getWhenUsed() {
		if (whenUsed != null && whenUsed.eIsProxy()) {
			InternalEObject oldWhenUsed = (InternalEObject)whenUsed;
			whenUsed = (Period)eResolveProxy(oldWhenUsed);
			if (whenUsed != oldWhenUsed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_STATEMENT__WHEN_USED, oldWhenUsed, whenUsed));
			}
		}
		return whenUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetWhenUsed() {
		return whenUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenUsed(Period newWhenUsed) {
		Period oldWhenUsed = whenUsed;
		whenUsed = newWhenUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_STATEMENT__WHEN_USED, oldWhenUsed, whenUsed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_STATEMENT__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_STATEMENT__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.DEVICE_USE_STATEMENT__IDENTIFIER);
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
			indications = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.DEVICE_USE_STATEMENT__INDICATION);
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
			notes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.DEVICE_USE_STATEMENT__NOTES);
		}
		return notes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_STATEMENT__RECORDED_ON, oldRecordedOn, recordedOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_STATEMENT__RECORDED_ON, oldRecordedOn, recordedOn));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_STATEMENT__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_STATEMENT__SUBJECT, oldSubject, subject));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE_USE_STATEMENT__TIMINGX, oldTimingx, timingx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE_USE_STATEMENT__TIMINGX, oldTimingx, timingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.DEVICE_USE_STATEMENT__BODY_SITEX:
				if (resolve) return getBodySitex();
				return basicGetBodySitex();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__WHEN_USED:
				if (resolve) return getWhenUsed();
				return basicGetWhenUsed();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__INDICATION:
				return getIndications();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__NOTES:
				return getNotes();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				if (resolve) return getRecordedOn();
				return basicGetRecordedOn();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__TIMINGX:
				if (resolve) return getTimingx();
				return basicGetTimingx();
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
			case FhirResourcePackage.DEVICE_USE_STATEMENT__BODY_SITEX:
				setBodySitex((Base)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__WHEN_USED:
				setWhenUsed((Period)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__DEVICE:
				setDevice((Device)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__INDICATION:
				getIndications().clear();
				getIndications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				setRecordedOn((DateTime)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__SUBJECT:
				setSubject((Patient)newValue);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__TIMINGX:
				setTimingx((DataType)newValue);
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
			case FhirResourcePackage.DEVICE_USE_STATEMENT__BODY_SITEX:
				setBodySitex((Base)null);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__WHEN_USED:
				setWhenUsed((Period)null);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__DEVICE:
				setDevice((Device)null);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__INDICATION:
				getIndications().clear();
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__NOTES:
				getNotes().clear();
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				setRecordedOn((DateTime)null);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__SUBJECT:
				setSubject((Patient)null);
				return;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__TIMINGX:
				setTimingx((DataType)null);
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
			case FhirResourcePackage.DEVICE_USE_STATEMENT__BODY_SITEX:
				return bodySitex != null;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__WHEN_USED:
				return whenUsed != null;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__DEVICE:
				return device != null;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__INDICATION:
				return indications != null && !indications.isEmpty();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__NOTES:
				return notes != null && !notes.isEmpty();
			case FhirResourcePackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				return recordedOn != null;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__SUBJECT:
				return subject != null;
			case FhirResourcePackage.DEVICE_USE_STATEMENT__TIMINGX:
				return timingx != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceUseStatementImpl
