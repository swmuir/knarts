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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ImmunizationVaccinationProtocol;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Vaccination Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationVaccinationProtocolImpl#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationVaccinationProtocolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationVaccinationProtocolImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationVaccinationProtocolImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationVaccinationProtocolImpl#getSeriesDoses <em>Series Doses</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationVaccinationProtocolImpl#getTargetDiseases <em>Target Disease</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationVaccinationProtocolImpl#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationVaccinationProtocolImpl#getDoseStatusReason <em>Dose Status Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationVaccinationProtocolImpl extends BackboneElementImpl implements ImmunizationVaccinationProtocol {
	/**
	 * The cached value of the '{@link #getDoseSequence() <em>Dose Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt doseSequence;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected Organization authority;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String series;

	/**
	 * The cached value of the '{@link #getSeriesDoses() <em>Series Doses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDoses()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt seriesDoses;

	/**
	 * The cached value of the '{@link #getTargetDiseases() <em>Target Disease</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDiseases()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> targetDiseases;

	/**
	 * The cached value of the '{@link #getDoseStatus() <em>Dose Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseStatus;

	/**
	 * The cached value of the '{@link #getDoseStatusReason() <em>Dose Status Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseStatusReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept doseStatusReason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationVaccinationProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getImmunizationVaccinationProtocol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDoseSequence() {
		if (doseSequence != null && doseSequence.eIsProxy()) {
			InternalEObject oldDoseSequence = (InternalEObject)doseSequence;
			doseSequence = (PositiveInt)eResolveProxy(oldDoseSequence);
			if (doseSequence != oldDoseSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE, oldDoseSequence, doseSequence));
			}
		}
		return doseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetDoseSequence() {
		return doseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseSequence(PositiveInt newDoseSequence) {
		PositiveInt oldDoseSequence = doseSequence;
		doseSequence = newDoseSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE, oldDoseSequence, doseSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getAuthority() {
		if (authority != null && authority.eIsProxy()) {
			InternalEObject oldAuthority = (InternalEObject)authority;
			authority = (Organization)eResolveProxy(oldAuthority);
			if (authority != oldAuthority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY, oldAuthority, authority));
			}
		}
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(Organization newAuthority) {
		Organization oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY, oldAuthority, authority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getSeries() {
		if (series != null && series.eIsProxy()) {
			InternalEObject oldSeries = (InternalEObject)series;
			series = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldSeries);
			if (series != oldSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES, oldSeries, series));
			}
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(org.eclipse.mdht.uml.fhir.core.datatype.String newSeries) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES, oldSeries, series));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSeriesDoses() {
		if (seriesDoses != null && seriesDoses.eIsProxy()) {
			InternalEObject oldSeriesDoses = (InternalEObject)seriesDoses;
			seriesDoses = (PositiveInt)eResolveProxy(oldSeriesDoses);
			if (seriesDoses != oldSeriesDoses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES, oldSeriesDoses, seriesDoses));
			}
		}
		return seriesDoses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSeriesDoses() {
		return seriesDoses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesDoses(PositiveInt newSeriesDoses) {
		PositiveInt oldSeriesDoses = seriesDoses;
		seriesDoses = newSeriesDoses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES, oldSeriesDoses, seriesDoses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTargetDiseases() {
		if (targetDiseases == null) {
			targetDiseases = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__TARGET_DISEASE);
		}
		return targetDiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseStatus() {
		if (doseStatus != null && doseStatus.eIsProxy()) {
			InternalEObject oldDoseStatus = (InternalEObject)doseStatus;
			doseStatus = (CodeableConcept)eResolveProxy(oldDoseStatus);
			if (doseStatus != oldDoseStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS, oldDoseStatus, doseStatus));
			}
		}
		return doseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDoseStatus() {
		return doseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseStatus(CodeableConcept newDoseStatus) {
		CodeableConcept oldDoseStatus = doseStatus;
		doseStatus = newDoseStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS, oldDoseStatus, doseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDoseStatusReason() {
		if (doseStatusReason != null && doseStatusReason.eIsProxy()) {
			InternalEObject oldDoseStatusReason = (InternalEObject)doseStatusReason;
			doseStatusReason = (CodeableConcept)eResolveProxy(oldDoseStatusReason);
			if (doseStatusReason != oldDoseStatusReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON, oldDoseStatusReason, doseStatusReason));
			}
		}
		return doseStatusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDoseStatusReason() {
		return doseStatusReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseStatusReason(CodeableConcept newDoseStatusReason) {
		CodeableConcept oldDoseStatusReason = doseStatusReason;
		doseStatusReason = newDoseStatusReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON, oldDoseStatusReason, doseStatusReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				if (resolve) return getDoseSequence();
				return basicGetDoseSequence();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				if (resolve) return getAuthority();
				return basicGetAuthority();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				if (resolve) return getSeries();
				return basicGetSeries();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				if (resolve) return getSeriesDoses();
				return basicGetSeriesDoses();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__TARGET_DISEASE:
				return getTargetDiseases();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				if (resolve) return getDoseStatus();
				return basicGetDoseStatus();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				if (resolve) return getDoseStatusReason();
				return basicGetDoseStatusReason();
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
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				setDoseSequence((PositiveInt)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				setAuthority((Organization)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				setSeries((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				setSeriesDoses((PositiveInt)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__TARGET_DISEASE:
				getTargetDiseases().clear();
				getTargetDiseases().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				setDoseStatus((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				setDoseStatusReason((CodeableConcept)newValue);
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
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				setDoseSequence((PositiveInt)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				setAuthority((Organization)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				setSeries((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				setSeriesDoses((PositiveInt)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__TARGET_DISEASE:
				getTargetDiseases().clear();
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				setDoseStatus((CodeableConcept)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				setDoseStatusReason((CodeableConcept)null);
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
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_SEQUENCE:
				return doseSequence != null;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__AUTHORITY:
				return authority != null;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES:
				return series != null;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__SERIES_DOSES:
				return seriesDoses != null;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__TARGET_DISEASE:
				return targetDiseases != null && !targetDiseases.isEmpty();
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS:
				return doseStatus != null;
			case FhirResourcePackage.IMMUNIZATION_VACCINATION_PROTOCOL__DOSE_STATUS_REASON:
				return doseStatusReason != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationVaccinationProtocolImpl
