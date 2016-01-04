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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.Condition;
import org.eclipse.mdht.uml.fhir.core.resource.EncounterHospitalization;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Hospitalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getAdmitSource <em>Admit Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getAdmittingDiagnosis <em>Admitting Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getReAdmission <em>Re Admission</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getDietPreferences <em>Diet Preference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getSpecialCourtesies <em>Special Courtesy</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getSpecialArrangements <em>Special Arrangement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getDischargeDisposition <em>Discharge Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.EncounterHospitalizationImpl#getDischargeDiagnosis <em>Discharge Diagnosis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterHospitalizationImpl extends BackboneElementImpl implements EncounterHospitalization {
	/**
	 * The cached value of the '{@link #getPreAdmissionIdentifier() <em>Pre Admission Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAdmissionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier preAdmissionIdentifier;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Location origin;

	/**
	 * The cached value of the '{@link #getAdmitSource() <em>Admit Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmitSource()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept admitSource;

	/**
	 * The cached value of the '{@link #getAdmittingDiagnosis() <em>Admitting Diagnosis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittingDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> admittingDiagnosis;

	/**
	 * The cached value of the '{@link #getReAdmission() <em>Re Admission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReAdmission()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reAdmission;

	/**
	 * The cached value of the '{@link #getDietPreferences() <em>Diet Preference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDietPreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> dietPreferences;

	/**
	 * The cached value of the '{@link #getSpecialCourtesies() <em>Special Courtesy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialCourtesies()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialCourtesies;

	/**
	 * The cached value of the '{@link #getSpecialArrangements() <em>Special Arrangement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialArrangements()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialArrangements;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Location destination;

	/**
	 * The cached value of the '{@link #getDischargeDisposition() <em>Discharge Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDisposition()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dischargeDisposition;

	/**
	 * The cached value of the '{@link #getDischargeDiagnosis() <em>Discharge Diagnosis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> dischargeDiagnosis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterHospitalizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getEncounterHospitalization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPreAdmissionIdentifier() {
		if (preAdmissionIdentifier != null && preAdmissionIdentifier.eIsProxy()) {
			InternalEObject oldPreAdmissionIdentifier = (InternalEObject)preAdmissionIdentifier;
			preAdmissionIdentifier = (Identifier)eResolveProxy(oldPreAdmissionIdentifier);
			if (preAdmissionIdentifier != oldPreAdmissionIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER, oldPreAdmissionIdentifier, preAdmissionIdentifier));
			}
		}
		return preAdmissionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetPreAdmissionIdentifier() {
		return preAdmissionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAdmissionIdentifier(Identifier newPreAdmissionIdentifier) {
		Identifier oldPreAdmissionIdentifier = preAdmissionIdentifier;
		preAdmissionIdentifier = newPreAdmissionIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER, oldPreAdmissionIdentifier, preAdmissionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (Location)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Location newOrigin) {
		Location oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAdmitSource() {
		if (admitSource != null && admitSource.eIsProxy()) {
			InternalEObject oldAdmitSource = (InternalEObject)admitSource;
			admitSource = (CodeableConcept)eResolveProxy(oldAdmitSource);
			if (admitSource != oldAdmitSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE, oldAdmitSource, admitSource));
			}
		}
		return admitSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetAdmitSource() {
		return admitSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmitSource(CodeableConcept newAdmitSource) {
		CodeableConcept oldAdmitSource = admitSource;
		admitSource = newAdmitSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE, oldAdmitSource, admitSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getAdmittingDiagnosis() {
		if (admittingDiagnosis == null) {
			admittingDiagnosis = new EObjectResolvingEList<Condition>(Condition.class, this, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMITTING_DIAGNOSIS);
		}
		return admittingDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReAdmission() {
		if (reAdmission != null && reAdmission.eIsProxy()) {
			InternalEObject oldReAdmission = (InternalEObject)reAdmission;
			reAdmission = (CodeableConcept)eResolveProxy(oldReAdmission);
			if (reAdmission != oldReAdmission) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION, oldReAdmission, reAdmission));
			}
		}
		return reAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReAdmission() {
		return reAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReAdmission(CodeableConcept newReAdmission) {
		CodeableConcept oldReAdmission = reAdmission;
		reAdmission = newReAdmission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION, oldReAdmission, reAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getDietPreferences() {
		if (dietPreferences == null) {
			dietPreferences = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE);
		}
		return dietPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialCourtesies() {
		if (specialCourtesies == null) {
			specialCourtesies = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY);
		}
		return specialCourtesies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialArrangements() {
		if (specialArrangements == null) {
			specialArrangements = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT);
		}
		return specialArrangements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Location)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Location newDestination) {
		Location oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDischargeDisposition() {
		if (dischargeDisposition != null && dischargeDisposition.eIsProxy()) {
			InternalEObject oldDischargeDisposition = (InternalEObject)dischargeDisposition;
			dischargeDisposition = (CodeableConcept)eResolveProxy(oldDischargeDisposition);
			if (dischargeDisposition != oldDischargeDisposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION, oldDischargeDisposition, dischargeDisposition));
			}
		}
		return dischargeDisposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDischargeDisposition() {
		return dischargeDisposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDischargeDisposition(CodeableConcept newDischargeDisposition) {
		CodeableConcept oldDischargeDisposition = dischargeDisposition;
		dischargeDisposition = newDischargeDisposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION, oldDischargeDisposition, dischargeDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getDischargeDiagnosis() {
		if (dischargeDiagnosis == null) {
			dischargeDiagnosis = new EObjectResolvingEList<Condition>(Condition.class, this, FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS);
		}
		return dischargeDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				if (resolve) return getPreAdmissionIdentifier();
				return basicGetPreAdmissionIdentifier();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				if (resolve) return getAdmitSource();
				return basicGetAdmitSource();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMITTING_DIAGNOSIS:
				return getAdmittingDiagnosis();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				if (resolve) return getReAdmission();
				return basicGetReAdmission();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				return getDietPreferences();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				return getSpecialCourtesies();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				return getSpecialArrangements();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				if (resolve) return getDischargeDisposition();
				return basicGetDischargeDisposition();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				return getDischargeDiagnosis();
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
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				setPreAdmissionIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				setOrigin((Location)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				setAdmitSource((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMITTING_DIAGNOSIS:
				getAdmittingDiagnosis().clear();
				getAdmittingDiagnosis().addAll((Collection<? extends Condition>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				setReAdmission((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				getDietPreferences().clear();
				getDietPreferences().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				getSpecialCourtesies().clear();
				getSpecialCourtesies().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				getSpecialArrangements().clear();
				getSpecialArrangements().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				setDestination((Location)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				setDischargeDisposition((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				getDischargeDiagnosis().clear();
				getDischargeDiagnosis().addAll((Collection<? extends Condition>)newValue);
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
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				setPreAdmissionIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				setOrigin((Location)null);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				setAdmitSource((CodeableConcept)null);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMITTING_DIAGNOSIS:
				getAdmittingDiagnosis().clear();
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				setReAdmission((CodeableConcept)null);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				getDietPreferences().clear();
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				getSpecialCourtesies().clear();
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				getSpecialArrangements().clear();
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				setDestination((Location)null);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				setDischargeDisposition((CodeableConcept)null);
				return;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				getDischargeDiagnosis().clear();
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
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				return preAdmissionIdentifier != null;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				return origin != null;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				return admitSource != null;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__ADMITTING_DIAGNOSIS:
				return admittingDiagnosis != null && !admittingDiagnosis.isEmpty();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				return reAdmission != null;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				return dietPreferences != null && !dietPreferences.isEmpty();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				return specialCourtesies != null && !specialCourtesies.isEmpty();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				return specialArrangements != null && !specialArrangements.isEmpty();
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				return destination != null;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				return dischargeDisposition != null;
			case FhirResourcePackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				return dischargeDiagnosis != null && !dischargeDiagnosis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EncounterHospitalizationImpl
