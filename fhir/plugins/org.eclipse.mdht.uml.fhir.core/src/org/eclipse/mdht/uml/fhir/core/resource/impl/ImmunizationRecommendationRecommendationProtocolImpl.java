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
import org.eclipse.mdht.uml.fhir.core.resource.ImmunizationRecommendationRecommendationProtocol;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Recommendation Recommendation Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationRecommendationRecommendationProtocolImpl#getDoseSequence <em>Dose Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationRecommendationRecommendationProtocolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationRecommendationRecommendationProtocolImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImmunizationRecommendationRecommendationProtocolImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationRecommendationRecommendationProtocolImpl extends BackboneElementImpl implements ImmunizationRecommendationRecommendationProtocol {
	/**
	 * The cached value of the '{@link #getDoseSequence() <em>Dose Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseSequence()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer doseSequence;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationRecommendationRecommendationProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getImmunizationRecommendationRecommendationProtocol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getDoseSequence() {
		if (doseSequence != null && doseSequence.eIsProxy()) {
			InternalEObject oldDoseSequence = (InternalEObject)doseSequence;
			doseSequence = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldDoseSequence);
			if (doseSequence != oldDoseSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE, oldDoseSequence, doseSequence));
			}
		}
		return doseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetDoseSequence() {
		return doseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseSequence(org.eclipse.mdht.uml.fhir.core.datatype.Integer newDoseSequence) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldDoseSequence = doseSequence;
		doseSequence = newDoseSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE, oldDoseSequence, doseSequence));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__AUTHORITY, oldAuthority, authority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__AUTHORITY, oldAuthority, authority));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__SERIES, oldSeries, series));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__SERIES, oldSeries, series));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				if (resolve) return getDoseSequence();
				return basicGetDoseSequence();
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				if (resolve) return getAuthority();
				return basicGetAuthority();
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__SERIES:
				if (resolve) return getSeries();
				return basicGetSeries();
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
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				setDoseSequence((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				setAuthority((Organization)newValue);
				return;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__SERIES:
				setSeries((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				setDoseSequence((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				setAuthority((Organization)null);
				return;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__SERIES:
				setSeries((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DOSE_SEQUENCE:
				return doseSequence != null;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__AUTHORITY:
				return authority != null;
			case FhirResourcePackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION_PROTOCOL__SERIES:
				return series != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationRecommendationRecommendationProtocolImpl
