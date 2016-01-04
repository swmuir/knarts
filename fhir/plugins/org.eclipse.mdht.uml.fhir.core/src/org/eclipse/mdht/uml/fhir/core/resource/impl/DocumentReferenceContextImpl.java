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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.DocumentReferenceContext;
import org.eclipse.mdht.uml.fhir.core.resource.DocumentReferenceContextRelated;
import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContextImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContextImpl#getEvents <em>Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContextImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContextImpl#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContextImpl#getPracticeSetting <em>Practice Setting</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContextImpl#getSourcePatientInfo <em>Source Patient Info</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceContextImpl#getRelateds <em>Related</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceContextImpl extends BackboneElementImpl implements DocumentReferenceContext {
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
	 * The cached value of the '{@link #getEvents() <em>Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> events;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getFacilityType() <em>Facility Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept facilityType;

	/**
	 * The cached value of the '{@link #getPracticeSetting() <em>Practice Setting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPracticeSetting()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept practiceSetting;

	/**
	 * The cached value of the '{@link #getSourcePatientInfo() <em>Source Patient Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePatientInfo()
	 * @generated
	 * @ordered
	 */
	protected Patient sourcePatientInfo;

	/**
	 * The cached value of the '{@link #getRelateds() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateds()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceContextRelated> relateds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDocumentReferenceContext();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__EVENT);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFacilityType() {
		if (facilityType != null && facilityType.eIsProxy()) {
			InternalEObject oldFacilityType = (InternalEObject)facilityType;
			facilityType = (CodeableConcept)eResolveProxy(oldFacilityType);
			if (facilityType != oldFacilityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, oldFacilityType, facilityType));
			}
		}
		return facilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetFacilityType() {
		return facilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilityType(CodeableConcept newFacilityType) {
		CodeableConcept oldFacilityType = facilityType;
		facilityType = newFacilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, oldFacilityType, facilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPracticeSetting() {
		if (practiceSetting != null && practiceSetting.eIsProxy()) {
			InternalEObject oldPracticeSetting = (InternalEObject)practiceSetting;
			practiceSetting = (CodeableConcept)eResolveProxy(oldPracticeSetting);
			if (practiceSetting != oldPracticeSetting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, oldPracticeSetting, practiceSetting));
			}
		}
		return practiceSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetPracticeSetting() {
		return practiceSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPracticeSetting(CodeableConcept newPracticeSetting) {
		CodeableConcept oldPracticeSetting = practiceSetting;
		practiceSetting = newPracticeSetting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, oldPracticeSetting, practiceSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getSourcePatientInfo() {
		if (sourcePatientInfo != null && sourcePatientInfo.eIsProxy()) {
			InternalEObject oldSourcePatientInfo = (InternalEObject)sourcePatientInfo;
			sourcePatientInfo = (Patient)eResolveProxy(oldSourcePatientInfo);
			if (sourcePatientInfo != oldSourcePatientInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, oldSourcePatientInfo, sourcePatientInfo));
			}
		}
		return sourcePatientInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetSourcePatientInfo() {
		return sourcePatientInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePatientInfo(Patient newSourcePatientInfo) {
		Patient oldSourcePatientInfo = sourcePatientInfo;
		sourcePatientInfo = newSourcePatientInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, oldSourcePatientInfo, sourcePatientInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentReferenceContextRelated> getRelateds() {
		if (relateds == null) {
			relateds = new EObjectContainmentEList<DocumentReferenceContextRelated>(DocumentReferenceContextRelated.class, this, FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__RELATED);
		}
		return relateds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return ((InternalEList<?>)getRelateds()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				return getEvents();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				if (resolve) return getFacilityType();
				return basicGetFacilityType();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				if (resolve) return getPracticeSetting();
				return basicGetPracticeSetting();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				if (resolve) return getSourcePatientInfo();
				return basicGetSourcePatientInfo();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return getRelateds();
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
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				getEvents().clear();
				getEvents().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				setFacilityType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				setPracticeSetting((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				setSourcePatientInfo((Patient)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				getRelateds().clear();
				getRelateds().addAll((Collection<? extends DocumentReferenceContextRelated>)newValue);
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
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				getEvents().clear();
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				setFacilityType((CodeableConcept)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				setPracticeSetting((CodeableConcept)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				setSourcePatientInfo((Patient)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				getRelateds().clear();
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
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				return events != null && !events.isEmpty();
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				return period != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				return facilityType != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				return practiceSetting != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				return sourcePatientInfo != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return relateds != null && !relateds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceContextImpl
