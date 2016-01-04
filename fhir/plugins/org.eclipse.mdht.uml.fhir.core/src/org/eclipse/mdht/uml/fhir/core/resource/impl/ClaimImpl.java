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

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.resource.Claim;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimCoverage;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimDiagnosis;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimItems;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimMissingTeeth;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimPayee;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Location;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrder;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.ReferralRequest;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getBillablePeriod <em>Billable Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getRelatedClaims <em>Related Claim</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getSpecialConditions <em>Special Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getCoverages <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getExceptions <em>Exception</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getSchool <em>School</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getAccidentDate <em>Accident Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getAccidentType <em>Accident Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getAccidentLocationx <em>Accident Locationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getInterventionExceptions <em>Intervention Exception</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getEmploymentImpacted <em>Employment Impacted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getAdditionalMaterials <em>Additional Materials</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimImpl#getMissingTeeths <em>Missing Teeth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimImpl extends DomainResourceImpl implements Claim {
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
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getBillablePeriod() <em>Billable Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillablePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period billablePeriod;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Organization target;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner provider;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Coding priority;

	/**
	 * The cached value of the '{@link #getFundsReserve() <em>Funds Reserve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundsReserve()
	 * @generated
	 * @ordered
	 */
	protected Coding fundsReserve;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Practitioner enterer;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Location facility;

	/**
	 * The cached value of the '{@link #getRelatedClaims() <em>Related Claim</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedClaims()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> relatedClaims;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Resource prescription;

	/**
	 * The cached value of the '{@link #getOriginalPrescription() <em>Original Prescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescription()
	 * @generated
	 * @ordered
	 */
	protected MedicationOrder originalPrescription;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected ClaimPayee payee;

	/**
	 * The cached value of the '{@link #getReferral() <em>Referral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected ReferralRequest referral;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getSpecialConditions() <em>Special Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> specialConditions;

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
	 * The cached value of the '{@link #getCoverages() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverages()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimCoverage> coverages;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> exceptions;

	/**
	 * The cached value of the '{@link #getSchool() <em>School</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String school;

	/**
	 * The cached value of the '{@link #getAccidentDate() <em>Accident Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentDate()
	 * @generated
	 * @ordered
	 */
	protected Date accidentDate;

	/**
	 * The cached value of the '{@link #getAccidentType() <em>Accident Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentType()
	 * @generated
	 * @ordered
	 */
	protected Coding accidentType;

	/**
	 * The cached value of the '{@link #getAccidentLocationx() <em>Accident Locationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentLocationx()
	 * @generated
	 * @ordered
	 */
	protected Base accidentLocationx;

	/**
	 * The cached value of the '{@link #getInterventionExceptions() <em>Intervention Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> interventionExceptions;

	/**
	 * The cached value of the '{@link #getOnsetx() <em>Onsetx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType onsetx;

	/**
	 * The cached value of the '{@link #getEmploymentImpacted() <em>Employment Impacted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentImpacted()
	 * @generated
	 * @ordered
	 */
	protected Period employmentImpacted;

	/**
	 * The cached value of the '{@link #getHospitalization() <em>Hospitalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalization()
	 * @generated
	 * @ordered
	 */
	protected Period hospitalization;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimItems> items;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected Money total;

	/**
	 * The cached value of the '{@link #getAdditionalMaterials() <em>Additional Materials</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> additionalMaterials;

	/**
	 * The cached value of the '{@link #getMissingTeeths() <em>Missing Teeth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingTeeths()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimMissingTeeth> missingTeeths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClaim();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.CLAIM__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		if (ruleset != null && ruleset.eIsProxy()) {
			InternalEObject oldRuleset = (InternalEObject)ruleset;
			ruleset = (Coding)eResolveProxy(oldRuleset);
			if (ruleset != oldRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__RULESET, oldRuleset, ruleset));
			}
		}
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__RULESET, oldRuleset, ruleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		if (originalRuleset != null && originalRuleset.eIsProxy()) {
			InternalEObject oldOriginalRuleset = (InternalEObject)originalRuleset;
			originalRuleset = (Coding)eResolveProxy(oldOriginalRuleset);
			if (originalRuleset != oldOriginalRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
			}
		}
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		if (created != null && created.eIsProxy()) {
			InternalEObject oldCreated = (InternalEObject)created;
			created = (DateTime)eResolveProxy(oldCreated);
			if (created != oldCreated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__CREATED, oldCreated, created));
			}
		}
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getBillablePeriod() {
		if (billablePeriod != null && billablePeriod.eIsProxy()) {
			InternalEObject oldBillablePeriod = (InternalEObject)billablePeriod;
			billablePeriod = (Period)eResolveProxy(oldBillablePeriod);
			if (billablePeriod != oldBillablePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__BILLABLE_PERIOD, oldBillablePeriod, billablePeriod));
			}
		}
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetBillablePeriod() {
		return billablePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillablePeriod(Period newBillablePeriod) {
		Period oldBillablePeriod = billablePeriod;
		billablePeriod = newBillablePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__BILLABLE_PERIOD, oldBillablePeriod, billablePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Organization)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Organization newTarget) {
		Organization oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Practitioner)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Practitioner newProvider) {
		Practitioner oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (Code)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (Coding)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Coding newPriority) {
		Coding oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getFundsReserve() {
		if (fundsReserve != null && fundsReserve.eIsProxy()) {
			InternalEObject oldFundsReserve = (InternalEObject)fundsReserve;
			fundsReserve = (Coding)eResolveProxy(oldFundsReserve);
			if (fundsReserve != oldFundsReserve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__FUNDS_RESERVE, oldFundsReserve, fundsReserve));
			}
		}
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetFundsReserve() {
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundsReserve(Coding newFundsReserve) {
		Coding oldFundsReserve = fundsReserve;
		fundsReserve = newFundsReserve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__FUNDS_RESERVE, oldFundsReserve, fundsReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getEnterer() {
		if (enterer != null && enterer.eIsProxy()) {
			InternalEObject oldEnterer = (InternalEObject)enterer;
			enterer = (Practitioner)eResolveProxy(oldEnterer);
			if (enterer != oldEnterer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__ENTERER, oldEnterer, enterer));
			}
		}
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterer(Practitioner newEnterer) {
		Practitioner oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__ENTERER, oldEnterer, enterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getFacility() {
		if (facility != null && facility.eIsProxy()) {
			InternalEObject oldFacility = (InternalEObject)facility;
			facility = (Location)eResolveProxy(oldFacility);
			if (facility != oldFacility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__FACILITY, oldFacility, facility));
			}
		}
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacility(Location newFacility) {
		Location oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__FACILITY, oldFacility, facility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getRelatedClaims() {
		if (relatedClaims == null) {
			relatedClaims = new EObjectResolvingEList<Claim>(Claim.class, this, FhirResourcePackage.CLAIM__RELATED_CLAIM);
		}
		return relatedClaims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPrescription() {
		if (prescription != null && prescription.eIsProxy()) {
			InternalEObject oldPrescription = (InternalEObject)prescription;
			prescription = (Resource)eResolveProxy(oldPrescription);
			if (prescription != oldPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__PRESCRIPTION, oldPrescription, prescription));
			}
		}
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(Resource newPrescription) {
		Resource oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__PRESCRIPTION, oldPrescription, prescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder getOriginalPrescription() {
		if (originalPrescription != null && originalPrescription.eIsProxy()) {
			InternalEObject oldOriginalPrescription = (InternalEObject)originalPrescription;
			originalPrescription = (MedicationOrder)eResolveProxy(oldOriginalPrescription);
			if (originalPrescription != oldOriginalPrescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, originalPrescription));
			}
		}
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrder basicGetOriginalPrescription() {
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescription(MedicationOrder newOriginalPrescription) {
		MedicationOrder oldOriginalPrescription = originalPrescription;
		originalPrescription = newOriginalPrescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, originalPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ClaimPayee newPayee, NotificationChain msgs) {
		ClaimPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__PAYEE, oldPayee, newPayee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(ClaimPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.CLAIM__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.CLAIM__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest getReferral() {
		if (referral != null && referral.eIsProxy()) {
			InternalEObject oldReferral = (InternalEObject)referral;
			referral = (ReferralRequest)eResolveProxy(oldReferral);
			if (referral != oldReferral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__REFERRAL, oldReferral, referral));
			}
		}
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest basicGetReferral() {
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferral(ReferralRequest newReferral) {
		ReferralRequest oldReferral = referral;
		referral = newReferral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__REFERRAL, oldReferral, referral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ClaimDiagnosis>(ClaimDiagnosis.class, this, FhirResourcePackage.CLAIM__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSpecialConditions() {
		if (specialConditions == null) {
			specialConditions = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.CLAIM__SPECIAL_CONDITION);
		}
		return specialConditions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimCoverage> getCoverages() {
		if (coverages == null) {
			coverages = new EObjectContainmentEList<ClaimCoverage>(ClaimCoverage.class, this, FhirResourcePackage.CLAIM__COVERAGE);
		}
		return coverages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.CLAIM__EXCEPTION);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getSchool() {
		if (school != null && school.eIsProxy()) {
			InternalEObject oldSchool = (InternalEObject)school;
			school = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldSchool);
			if (school != oldSchool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__SCHOOL, oldSchool, school));
			}
		}
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetSchool() {
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(org.eclipse.mdht.uml.fhir.core.datatype.String newSchool) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldSchool = school;
		school = newSchool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__SCHOOL, oldSchool, school));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAccidentDate() {
		if (accidentDate != null && accidentDate.eIsProxy()) {
			InternalEObject oldAccidentDate = (InternalEObject)accidentDate;
			accidentDate = (Date)eResolveProxy(oldAccidentDate);
			if (accidentDate != oldAccidentDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__ACCIDENT_DATE, oldAccidentDate, accidentDate));
			}
		}
		return accidentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetAccidentDate() {
		return accidentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentDate(Date newAccidentDate) {
		Date oldAccidentDate = accidentDate;
		accidentDate = newAccidentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__ACCIDENT_DATE, oldAccidentDate, accidentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getAccidentType() {
		if (accidentType != null && accidentType.eIsProxy()) {
			InternalEObject oldAccidentType = (InternalEObject)accidentType;
			accidentType = (Coding)eResolveProxy(oldAccidentType);
			if (accidentType != oldAccidentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__ACCIDENT_TYPE, oldAccidentType, accidentType));
			}
		}
		return accidentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetAccidentType() {
		return accidentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentType(Coding newAccidentType) {
		Coding oldAccidentType = accidentType;
		accidentType = newAccidentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__ACCIDENT_TYPE, oldAccidentType, accidentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getAccidentLocationx() {
		if (accidentLocationx != null && accidentLocationx.eIsProxy()) {
			InternalEObject oldAccidentLocationx = (InternalEObject)accidentLocationx;
			accidentLocationx = (Base)eResolveProxy(oldAccidentLocationx);
			if (accidentLocationx != oldAccidentLocationx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__ACCIDENT_LOCATIONX, oldAccidentLocationx, accidentLocationx));
			}
		}
		return accidentLocationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetAccidentLocationx() {
		return accidentLocationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentLocationx(Base newAccidentLocationx) {
		Base oldAccidentLocationx = accidentLocationx;
		accidentLocationx = newAccidentLocationx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__ACCIDENT_LOCATIONX, oldAccidentLocationx, accidentLocationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getInterventionExceptions() {
		if (interventionExceptions == null) {
			interventionExceptions = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.CLAIM__INTERVENTION_EXCEPTION);
		}
		return interventionExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOnsetx() {
		if (onsetx != null && onsetx.eIsProxy()) {
			InternalEObject oldOnsetx = (InternalEObject)onsetx;
			onsetx = (DataType)eResolveProxy(oldOnsetx);
			if (onsetx != oldOnsetx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__ONSETX, oldOnsetx, onsetx));
			}
		}
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetOnsetx() {
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnsetx(DataType newOnsetx) {
		DataType oldOnsetx = onsetx;
		onsetx = newOnsetx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__ONSETX, oldOnsetx, onsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getEmploymentImpacted() {
		if (employmentImpacted != null && employmentImpacted.eIsProxy()) {
			InternalEObject oldEmploymentImpacted = (InternalEObject)employmentImpacted;
			employmentImpacted = (Period)eResolveProxy(oldEmploymentImpacted);
			if (employmentImpacted != oldEmploymentImpacted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, employmentImpacted));
			}
		}
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetEmploymentImpacted() {
		return employmentImpacted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploymentImpacted(Period newEmploymentImpacted) {
		Period oldEmploymentImpacted = employmentImpacted;
		employmentImpacted = newEmploymentImpacted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__EMPLOYMENT_IMPACTED, oldEmploymentImpacted, employmentImpacted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getHospitalization() {
		if (hospitalization != null && hospitalization.eIsProxy()) {
			InternalEObject oldHospitalization = (InternalEObject)hospitalization;
			hospitalization = (Period)eResolveProxy(oldHospitalization);
			if (hospitalization != oldHospitalization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__HOSPITALIZATION, oldHospitalization, hospitalization));
			}
		}
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetHospitalization() {
		return hospitalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHospitalization(Period newHospitalization) {
		Period oldHospitalization = hospitalization;
		hospitalization = newHospitalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__HOSPITALIZATION, oldHospitalization, hospitalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimItems> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ClaimItems>(ClaimItems.class, this, FhirResourcePackage.CLAIM__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotal() {
		if (total != null && total.eIsProxy()) {
			InternalEObject oldTotal = (InternalEObject)total;
			total = (Money)eResolveProxy(oldTotal);
			if (total != oldTotal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM__TOTAL, oldTotal, total));
			}
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(Money newTotal) {
		Money oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getAdditionalMaterials() {
		if (additionalMaterials == null) {
			additionalMaterials = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.CLAIM__ADDITIONAL_MATERIALS);
		}
		return additionalMaterials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimMissingTeeth> getMissingTeeths() {
		if (missingTeeths == null) {
			missingTeeths = new EObjectContainmentEList<ClaimMissingTeeth>(ClaimMissingTeeth.class, this, FhirResourcePackage.CLAIM__MISSING_TEETH);
		}
		return missingTeeths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirResourcePackage.CLAIM__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM__COVERAGE:
				return ((InternalEList<?>)getCoverages()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM__MISSING_TEETH:
				return ((InternalEList<?>)getMissingTeeths()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CLAIM__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.CLAIM__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.CLAIM__RULESET:
				if (resolve) return getRuleset();
				return basicGetRuleset();
			case FhirResourcePackage.CLAIM__ORIGINAL_RULESET:
				if (resolve) return getOriginalRuleset();
				return basicGetOriginalRuleset();
			case FhirResourcePackage.CLAIM__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case FhirResourcePackage.CLAIM__BILLABLE_PERIOD:
				if (resolve) return getBillablePeriod();
				return basicGetBillablePeriod();
			case FhirResourcePackage.CLAIM__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FhirResourcePackage.CLAIM__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case FhirResourcePackage.CLAIM__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case FhirResourcePackage.CLAIM__USE:
				if (resolve) return getUse();
				return basicGetUse();
			case FhirResourcePackage.CLAIM__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case FhirResourcePackage.CLAIM__FUNDS_RESERVE:
				if (resolve) return getFundsReserve();
				return basicGetFundsReserve();
			case FhirResourcePackage.CLAIM__ENTERER:
				if (resolve) return getEnterer();
				return basicGetEnterer();
			case FhirResourcePackage.CLAIM__FACILITY:
				if (resolve) return getFacility();
				return basicGetFacility();
			case FhirResourcePackage.CLAIM__RELATED_CLAIM:
				return getRelatedClaims();
			case FhirResourcePackage.CLAIM__PRESCRIPTION:
				if (resolve) return getPrescription();
				return basicGetPrescription();
			case FhirResourcePackage.CLAIM__ORIGINAL_PRESCRIPTION:
				if (resolve) return getOriginalPrescription();
				return basicGetOriginalPrescription();
			case FhirResourcePackage.CLAIM__PAYEE:
				return getPayee();
			case FhirResourcePackage.CLAIM__REFERRAL:
				if (resolve) return getReferral();
				return basicGetReferral();
			case FhirResourcePackage.CLAIM__DIAGNOSIS:
				return getDiagnosis();
			case FhirResourcePackage.CLAIM__SPECIAL_CONDITION:
				return getSpecialConditions();
			case FhirResourcePackage.CLAIM__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.CLAIM__COVERAGE:
				return getCoverages();
			case FhirResourcePackage.CLAIM__EXCEPTION:
				return getExceptions();
			case FhirResourcePackage.CLAIM__SCHOOL:
				if (resolve) return getSchool();
				return basicGetSchool();
			case FhirResourcePackage.CLAIM__ACCIDENT_DATE:
				if (resolve) return getAccidentDate();
				return basicGetAccidentDate();
			case FhirResourcePackage.CLAIM__ACCIDENT_TYPE:
				if (resolve) return getAccidentType();
				return basicGetAccidentType();
			case FhirResourcePackage.CLAIM__ACCIDENT_LOCATIONX:
				if (resolve) return getAccidentLocationx();
				return basicGetAccidentLocationx();
			case FhirResourcePackage.CLAIM__INTERVENTION_EXCEPTION:
				return getInterventionExceptions();
			case FhirResourcePackage.CLAIM__ONSETX:
				if (resolve) return getOnsetx();
				return basicGetOnsetx();
			case FhirResourcePackage.CLAIM__EMPLOYMENT_IMPACTED:
				if (resolve) return getEmploymentImpacted();
				return basicGetEmploymentImpacted();
			case FhirResourcePackage.CLAIM__HOSPITALIZATION:
				if (resolve) return getHospitalization();
				return basicGetHospitalization();
			case FhirResourcePackage.CLAIM__ITEM:
				return getItems();
			case FhirResourcePackage.CLAIM__TOTAL:
				if (resolve) return getTotal();
				return basicGetTotal();
			case FhirResourcePackage.CLAIM__ADDITIONAL_MATERIALS:
				return getAdditionalMaterials();
			case FhirResourcePackage.CLAIM__MISSING_TEETH:
				return getMissingTeeths();
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
			case FhirResourcePackage.CLAIM__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.CLAIM__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.CLAIM__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirResourcePackage.CLAIM__BILLABLE_PERIOD:
				setBillablePeriod((Period)newValue);
				return;
			case FhirResourcePackage.CLAIM__TARGET:
				setTarget((Organization)newValue);
				return;
			case FhirResourcePackage.CLAIM__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case FhirResourcePackage.CLAIM__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.CLAIM__USE:
				setUse((Code)newValue);
				return;
			case FhirResourcePackage.CLAIM__PRIORITY:
				setPriority((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM__ENTERER:
				setEnterer((Practitioner)newValue);
				return;
			case FhirResourcePackage.CLAIM__FACILITY:
				setFacility((Location)newValue);
				return;
			case FhirResourcePackage.CLAIM__RELATED_CLAIM:
				getRelatedClaims().clear();
				getRelatedClaims().addAll((Collection<? extends Claim>)newValue);
				return;
			case FhirResourcePackage.CLAIM__PRESCRIPTION:
				setPrescription((Resource)newValue);
				return;
			case FhirResourcePackage.CLAIM__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((MedicationOrder)newValue);
				return;
			case FhirResourcePackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)newValue);
				return;
			case FhirResourcePackage.CLAIM__REFERRAL:
				setReferral((ReferralRequest)newValue);
				return;
			case FhirResourcePackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ClaimDiagnosis>)newValue);
				return;
			case FhirResourcePackage.CLAIM__SPECIAL_CONDITION:
				getSpecialConditions().clear();
				getSpecialConditions().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.CLAIM__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.CLAIM__COVERAGE:
				getCoverages().clear();
				getCoverages().addAll((Collection<? extends ClaimCoverage>)newValue);
				return;
			case FhirResourcePackage.CLAIM__EXCEPTION:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.CLAIM__SCHOOL:
				setSchool((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CLAIM__ACCIDENT_DATE:
				setAccidentDate((Date)newValue);
				return;
			case FhirResourcePackage.CLAIM__ACCIDENT_TYPE:
				setAccidentType((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM__ACCIDENT_LOCATIONX:
				setAccidentLocationx((Base)newValue);
				return;
			case FhirResourcePackage.CLAIM__INTERVENTION_EXCEPTION:
				getInterventionExceptions().clear();
				getInterventionExceptions().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.CLAIM__ONSETX:
				setOnsetx((DataType)newValue);
				return;
			case FhirResourcePackage.CLAIM__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)newValue);
				return;
			case FhirResourcePackage.CLAIM__HOSPITALIZATION:
				setHospitalization((Period)newValue);
				return;
			case FhirResourcePackage.CLAIM__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends ClaimItems>)newValue);
				return;
			case FhirResourcePackage.CLAIM__TOTAL:
				setTotal((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM__ADDITIONAL_MATERIALS:
				getAdditionalMaterials().clear();
				getAdditionalMaterials().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.CLAIM__MISSING_TEETH:
				getMissingTeeths().clear();
				getMissingTeeths().addAll((Collection<? extends ClaimMissingTeeth>)newValue);
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
			case FhirResourcePackage.CLAIM__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.CLAIM__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.CLAIM__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirResourcePackage.CLAIM__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirResourcePackage.CLAIM__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirResourcePackage.CLAIM__BILLABLE_PERIOD:
				setBillablePeriod((Period)null);
				return;
			case FhirResourcePackage.CLAIM__TARGET:
				setTarget((Organization)null);
				return;
			case FhirResourcePackage.CLAIM__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case FhirResourcePackage.CLAIM__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirResourcePackage.CLAIM__USE:
				setUse((Code)null);
				return;
			case FhirResourcePackage.CLAIM__PRIORITY:
				setPriority((Coding)null);
				return;
			case FhirResourcePackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((Coding)null);
				return;
			case FhirResourcePackage.CLAIM__ENTERER:
				setEnterer((Practitioner)null);
				return;
			case FhirResourcePackage.CLAIM__FACILITY:
				setFacility((Location)null);
				return;
			case FhirResourcePackage.CLAIM__RELATED_CLAIM:
				getRelatedClaims().clear();
				return;
			case FhirResourcePackage.CLAIM__PRESCRIPTION:
				setPrescription((Resource)null);
				return;
			case FhirResourcePackage.CLAIM__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((MedicationOrder)null);
				return;
			case FhirResourcePackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)null);
				return;
			case FhirResourcePackage.CLAIM__REFERRAL:
				setReferral((ReferralRequest)null);
				return;
			case FhirResourcePackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirResourcePackage.CLAIM__SPECIAL_CONDITION:
				getSpecialConditions().clear();
				return;
			case FhirResourcePackage.CLAIM__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.CLAIM__COVERAGE:
				getCoverages().clear();
				return;
			case FhirResourcePackage.CLAIM__EXCEPTION:
				getExceptions().clear();
				return;
			case FhirResourcePackage.CLAIM__SCHOOL:
				setSchool((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CLAIM__ACCIDENT_DATE:
				setAccidentDate((Date)null);
				return;
			case FhirResourcePackage.CLAIM__ACCIDENT_TYPE:
				setAccidentType((Coding)null);
				return;
			case FhirResourcePackage.CLAIM__ACCIDENT_LOCATIONX:
				setAccidentLocationx((Base)null);
				return;
			case FhirResourcePackage.CLAIM__INTERVENTION_EXCEPTION:
				getInterventionExceptions().clear();
				return;
			case FhirResourcePackage.CLAIM__ONSETX:
				setOnsetx((DataType)null);
				return;
			case FhirResourcePackage.CLAIM__EMPLOYMENT_IMPACTED:
				setEmploymentImpacted((Period)null);
				return;
			case FhirResourcePackage.CLAIM__HOSPITALIZATION:
				setHospitalization((Period)null);
				return;
			case FhirResourcePackage.CLAIM__ITEM:
				getItems().clear();
				return;
			case FhirResourcePackage.CLAIM__TOTAL:
				setTotal((Money)null);
				return;
			case FhirResourcePackage.CLAIM__ADDITIONAL_MATERIALS:
				getAdditionalMaterials().clear();
				return;
			case FhirResourcePackage.CLAIM__MISSING_TEETH:
				getMissingTeeths().clear();
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
			case FhirResourcePackage.CLAIM__TYPE:
				return type != null;
			case FhirResourcePackage.CLAIM__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.CLAIM__RULESET:
				return ruleset != null;
			case FhirResourcePackage.CLAIM__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirResourcePackage.CLAIM__CREATED:
				return created != null;
			case FhirResourcePackage.CLAIM__BILLABLE_PERIOD:
				return billablePeriod != null;
			case FhirResourcePackage.CLAIM__TARGET:
				return target != null;
			case FhirResourcePackage.CLAIM__PROVIDER:
				return provider != null;
			case FhirResourcePackage.CLAIM__ORGANIZATION:
				return organization != null;
			case FhirResourcePackage.CLAIM__USE:
				return use != null;
			case FhirResourcePackage.CLAIM__PRIORITY:
				return priority != null;
			case FhirResourcePackage.CLAIM__FUNDS_RESERVE:
				return fundsReserve != null;
			case FhirResourcePackage.CLAIM__ENTERER:
				return enterer != null;
			case FhirResourcePackage.CLAIM__FACILITY:
				return facility != null;
			case FhirResourcePackage.CLAIM__RELATED_CLAIM:
				return relatedClaims != null && !relatedClaims.isEmpty();
			case FhirResourcePackage.CLAIM__PRESCRIPTION:
				return prescription != null;
			case FhirResourcePackage.CLAIM__ORIGINAL_PRESCRIPTION:
				return originalPrescription != null;
			case FhirResourcePackage.CLAIM__PAYEE:
				return payee != null;
			case FhirResourcePackage.CLAIM__REFERRAL:
				return referral != null;
			case FhirResourcePackage.CLAIM__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirResourcePackage.CLAIM__SPECIAL_CONDITION:
				return specialConditions != null && !specialConditions.isEmpty();
			case FhirResourcePackage.CLAIM__PATIENT:
				return patient != null;
			case FhirResourcePackage.CLAIM__COVERAGE:
				return coverages != null && !coverages.isEmpty();
			case FhirResourcePackage.CLAIM__EXCEPTION:
				return exceptions != null && !exceptions.isEmpty();
			case FhirResourcePackage.CLAIM__SCHOOL:
				return school != null;
			case FhirResourcePackage.CLAIM__ACCIDENT_DATE:
				return accidentDate != null;
			case FhirResourcePackage.CLAIM__ACCIDENT_TYPE:
				return accidentType != null;
			case FhirResourcePackage.CLAIM__ACCIDENT_LOCATIONX:
				return accidentLocationx != null;
			case FhirResourcePackage.CLAIM__INTERVENTION_EXCEPTION:
				return interventionExceptions != null && !interventionExceptions.isEmpty();
			case FhirResourcePackage.CLAIM__ONSETX:
				return onsetx != null;
			case FhirResourcePackage.CLAIM__EMPLOYMENT_IMPACTED:
				return employmentImpacted != null;
			case FhirResourcePackage.CLAIM__HOSPITALIZATION:
				return hospitalization != null;
			case FhirResourcePackage.CLAIM__ITEM:
				return items != null && !items.isEmpty();
			case FhirResourcePackage.CLAIM__TOTAL:
				return total != null;
			case FhirResourcePackage.CLAIM__ADDITIONAL_MATERIALS:
				return additionalMaterials != null && !additionalMaterials.isEmpty();
			case FhirResourcePackage.CLAIM__MISSING_TEETH:
				return missingTeeths != null && !missingTeeths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
