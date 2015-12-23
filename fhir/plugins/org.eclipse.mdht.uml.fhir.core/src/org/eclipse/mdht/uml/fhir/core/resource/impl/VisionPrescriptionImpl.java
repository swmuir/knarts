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

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.VisionPrescription;
import org.eclipse.mdht.uml.fhir.core.resource.VisionPrescriptionDispense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionImpl#getDateWritten <em>Date Written</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionImpl#getPrescriber <em>Prescriber</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionImpl#getReasonx <em>Reasonx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.VisionPrescriptionImpl#getDispenses <em>Dispense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionPrescriptionImpl extends DomainResourceImpl implements VisionPrescription {
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
	 * The cached value of the '{@link #getDateWritten() <em>Date Written</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateWritten()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateWritten;

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
	 * The cached value of the '{@link #getPrescriber() <em>Prescriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriber()
	 * @generated
	 * @ordered
	 */
	protected Practitioner prescriber;

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
	 * The cached value of the '{@link #getReasonx() <em>Reasonx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonx()
	 * @generated
	 * @ordered
	 */
	protected Base reasonx;

	/**
	 * The cached value of the '{@link #getDispenses() <em>Dispense</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenses()
	 * @generated
	 * @ordered
	 */
	protected EList<VisionPrescriptionDispense> dispenses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionPrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getVisionPrescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.VISION_PRESCRIPTION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateWritten() {
		if (dateWritten != null && dateWritten.eIsProxy()) {
			InternalEObject oldDateWritten = (InternalEObject)dateWritten;
			dateWritten = (DateTime)eResolveProxy(oldDateWritten);
			if (dateWritten != oldDateWritten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION__DATE_WRITTEN, oldDateWritten, dateWritten));
			}
		}
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateWritten() {
		return dateWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateWritten(DateTime newDateWritten) {
		DateTime oldDateWritten = dateWritten;
		dateWritten = newDateWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION__DATE_WRITTEN, oldDateWritten, dateWritten));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getPrescriber() {
		if (prescriber != null && prescriber.eIsProxy()) {
			InternalEObject oldPrescriber = (InternalEObject)prescriber;
			prescriber = (Practitioner)eResolveProxy(oldPrescriber);
			if (prescriber != oldPrescriber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION__PRESCRIBER, oldPrescriber, prescriber));
			}
		}
		return prescriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetPrescriber() {
		return prescriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriber(Practitioner newPrescriber) {
		Practitioner oldPrescriber = prescriber;
		prescriber = newPrescriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION__PRESCRIBER, oldPrescriber, prescriber));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION__ENCOUNTER, oldEncounter, encounter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VISION_PRESCRIPTION__REASONX, oldReasonx, reasonx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VISION_PRESCRIPTION__REASONX, oldReasonx, reasonx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisionPrescriptionDispense> getDispenses() {
		if (dispenses == null) {
			dispenses = new EObjectContainmentEList<VisionPrescriptionDispense>(VisionPrescriptionDispense.class, this, FhirResourcePackage.VISION_PRESCRIPTION__DISPENSE);
		}
		return dispenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.VISION_PRESCRIPTION__DISPENSE:
				return ((InternalEList<?>)getDispenses()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.VISION_PRESCRIPTION__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				if (resolve) return getDateWritten();
				return basicGetDateWritten();
			case FhirResourcePackage.VISION_PRESCRIPTION__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.VISION_PRESCRIPTION__PRESCRIBER:
				if (resolve) return getPrescriber();
				return basicGetPrescriber();
			case FhirResourcePackage.VISION_PRESCRIPTION__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.VISION_PRESCRIPTION__REASONX:
				if (resolve) return getReasonx();
				return basicGetReasonx();
			case FhirResourcePackage.VISION_PRESCRIPTION__DISPENSE:
				return getDispenses();
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
			case FhirResourcePackage.VISION_PRESCRIPTION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				setDateWritten((DateTime)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__PRESCRIBER:
				setPrescriber((Practitioner)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__REASONX:
				setReasonx((Base)newValue);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__DISPENSE:
				getDispenses().clear();
				getDispenses().addAll((Collection<? extends VisionPrescriptionDispense>)newValue);
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
			case FhirResourcePackage.VISION_PRESCRIPTION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				setDateWritten((DateTime)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__PRESCRIBER:
				setPrescriber((Practitioner)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__REASONX:
				setReasonx((Base)null);
				return;
			case FhirResourcePackage.VISION_PRESCRIPTION__DISPENSE:
				getDispenses().clear();
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
			case FhirResourcePackage.VISION_PRESCRIPTION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.VISION_PRESCRIPTION__DATE_WRITTEN:
				return dateWritten != null;
			case FhirResourcePackage.VISION_PRESCRIPTION__PATIENT:
				return patient != null;
			case FhirResourcePackage.VISION_PRESCRIPTION__PRESCRIBER:
				return prescriber != null;
			case FhirResourcePackage.VISION_PRESCRIPTION__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.VISION_PRESCRIPTION__REASONX:
				return reasonx != null;
			case FhirResourcePackage.VISION_PRESCRIPTION__DISPENSE:
				return dispenses != null && !dispenses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisionPrescriptionImpl
