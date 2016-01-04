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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;

import org.eclipse.mdht.uml.fhir.core.resource.Claim;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseAddedItem;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseErrors;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseItems;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseNotes;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getItems <em>Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getAddItems <em>Add Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getErrors <em>Error</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getPaymentAdjustment <em>Payment Adjustment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getPaymentRef <em>Payment Ref</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseImpl#getCoverages <em>Coverage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseImpl extends DomainResourceImpl implements ClaimResponse {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Claim request;

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
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The cached value of the '{@link #getRequestProvider() <em>Request Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProvider()
	 * @generated
	 * @ordered
	 */
	protected Practitioner requestProvider;

	/**
	 * The cached value of the '{@link #getRequestOrganization() <em>Request Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization requestOrganization;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Code outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String disposition;

	/**
	 * The cached value of the '{@link #getPayeeType() <em>Payee Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeType()
	 * @generated
	 * @ordered
	 */
	protected Coding payeeType;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItems> items;

	/**
	 * The cached value of the '{@link #getAddItems() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddedItem> addItems;

	/**
	 * The cached value of the '{@link #getErrors() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseErrors> errors;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected Money totalCost;

	/**
	 * The cached value of the '{@link #getUnallocDeductable() <em>Unalloc Deductable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnallocDeductable()
	 * @generated
	 * @ordered
	 */
	protected Money unallocDeductable;

	/**
	 * The cached value of the '{@link #getTotalBenefit() <em>Total Benefit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBenefit()
	 * @generated
	 * @ordered
	 */
	protected Money totalBenefit;

	/**
	 * The cached value of the '{@link #getPaymentAdjustment() <em>Payment Adjustment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAdjustment()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAdjustment;

	/**
	 * The cached value of the '{@link #getPaymentAdjustmentReason() <em>Payment Adjustment Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAdjustmentReason()
	 * @generated
	 * @ordered
	 */
	protected Coding paymentAdjustmentReason;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected Date paymentDate;

	/**
	 * The cached value of the '{@link #getPaymentAmount() <em>Payment Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAmount;

	/**
	 * The cached value of the '{@link #getPaymentRef() <em>Payment Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRef()
	 * @generated
	 * @ordered
	 */
	protected Identifier paymentRef;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Coding reserved;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Coding form;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseNotes> notes;

	/**
	 * The cached value of the '{@link #getCoverages() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverages()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseCoverage> coverages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClaimResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.CLAIM_RESPONSE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Claim)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Claim newRequest) {
		Claim oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__REQUEST, oldRequest, request));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__RULESET, oldRuleset, ruleset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__RULESET, oldRuleset, ruleset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__CREATED, oldCreated, created));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__ORGANIZATION, oldOrganization, organization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getRequestProvider() {
		if (requestProvider != null && requestProvider.eIsProxy()) {
			InternalEObject oldRequestProvider = (InternalEObject)requestProvider;
			requestProvider = (Practitioner)eResolveProxy(oldRequestProvider);
			if (requestProvider != oldRequestProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
			}
		}
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetRequestProvider() {
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProvider(Practitioner newRequestProvider) {
		Practitioner oldRequestProvider = requestProvider;
		requestProvider = newRequestProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, requestProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getRequestOrganization() {
		if (requestOrganization != null && requestOrganization.eIsProxy()) {
			InternalEObject oldRequestOrganization = (InternalEObject)requestOrganization;
			requestOrganization = (Organization)eResolveProxy(oldRequestOrganization);
			if (requestOrganization != oldRequestOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
			}
		}
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetRequestOrganization() {
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrganization(Organization newRequestOrganization) {
		Organization oldRequestOrganization = requestOrganization;
		requestOrganization = newRequestOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, requestOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOutcome() {
		if (outcome != null && outcome.eIsProxy()) {
			InternalEObject oldOutcome = (InternalEObject)outcome;
			outcome = (Code)eResolveProxy(oldOutcome);
			if (outcome != oldOutcome) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__OUTCOME, oldOutcome, outcome));
			}
		}
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Code newOutcome) {
		Code oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__OUTCOME, oldOutcome, outcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDisposition() {
		if (disposition != null && disposition.eIsProxy()) {
			InternalEObject oldDisposition = (InternalEObject)disposition;
			disposition = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDisposition);
			if (disposition != oldDisposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__DISPOSITION, oldDisposition, disposition));
			}
		}
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.eclipse.mdht.uml.fhir.core.datatype.String newDisposition) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__DISPOSITION, oldDisposition, disposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPayeeType() {
		if (payeeType != null && payeeType.eIsProxy()) {
			InternalEObject oldPayeeType = (InternalEObject)payeeType;
			payeeType = (Coding)eResolveProxy(oldPayeeType);
			if (payeeType != oldPayeeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__PAYEE_TYPE, oldPayeeType, payeeType));
			}
		}
		return payeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetPayeeType() {
		return payeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayeeType(Coding newPayeeType) {
		Coding oldPayeeType = payeeType;
		payeeType = newPayeeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__PAYEE_TYPE, oldPayeeType, payeeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseItems> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ClaimResponseItems>(ClaimResponseItems.class, this, FhirResourcePackage.CLAIM_RESPONSE__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAddedItem> getAddItems() {
		if (addItems == null) {
			addItems = new EObjectContainmentEList<ClaimResponseAddedItem>(ClaimResponseAddedItem.class, this, FhirResourcePackage.CLAIM_RESPONSE__ADD_ITEM);
		}
		return addItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseErrors> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<ClaimResponseErrors>(ClaimResponseErrors.class, this, FhirResourcePackage.CLAIM_RESPONSE__ERROR);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalCost() {
		if (totalCost != null && totalCost.eIsProxy()) {
			InternalEObject oldTotalCost = (InternalEObject)totalCost;
			totalCost = (Money)eResolveProxy(oldTotalCost);
			if (totalCost != oldTotalCost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__TOTAL_COST, oldTotalCost, totalCost));
			}
		}
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(Money newTotalCost) {
		Money oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__TOTAL_COST, oldTotalCost, totalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnallocDeductable() {
		if (unallocDeductable != null && unallocDeductable.eIsProxy()) {
			InternalEObject oldUnallocDeductable = (InternalEObject)unallocDeductable;
			unallocDeductable = (Money)eResolveProxy(oldUnallocDeductable);
			if (unallocDeductable != oldUnallocDeductable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, oldUnallocDeductable, unallocDeductable));
			}
		}
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetUnallocDeductable() {
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnallocDeductable(Money newUnallocDeductable) {
		Money oldUnallocDeductable = unallocDeductable;
		unallocDeductable = newUnallocDeductable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, oldUnallocDeductable, unallocDeductable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalBenefit() {
		if (totalBenefit != null && totalBenefit.eIsProxy()) {
			InternalEObject oldTotalBenefit = (InternalEObject)totalBenefit;
			totalBenefit = (Money)eResolveProxy(oldTotalBenefit);
			if (totalBenefit != oldTotalBenefit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__TOTAL_BENEFIT, oldTotalBenefit, totalBenefit));
			}
		}
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetTotalBenefit() {
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBenefit(Money newTotalBenefit) {
		Money oldTotalBenefit = totalBenefit;
		totalBenefit = newTotalBenefit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__TOTAL_BENEFIT, oldTotalBenefit, totalBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPaymentAdjustment() {
		if (paymentAdjustment != null && paymentAdjustment.eIsProxy()) {
			InternalEObject oldPaymentAdjustment = (InternalEObject)paymentAdjustment;
			paymentAdjustment = (Money)eResolveProxy(oldPaymentAdjustment);
			if (paymentAdjustment != oldPaymentAdjustment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT, oldPaymentAdjustment, paymentAdjustment));
			}
		}
		return paymentAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetPaymentAdjustment() {
		return paymentAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAdjustment(Money newPaymentAdjustment) {
		Money oldPaymentAdjustment = paymentAdjustment;
		paymentAdjustment = newPaymentAdjustment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT, oldPaymentAdjustment, paymentAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPaymentAdjustmentReason() {
		if (paymentAdjustmentReason != null && paymentAdjustmentReason.eIsProxy()) {
			InternalEObject oldPaymentAdjustmentReason = (InternalEObject)paymentAdjustmentReason;
			paymentAdjustmentReason = (Coding)eResolveProxy(oldPaymentAdjustmentReason);
			if (paymentAdjustmentReason != oldPaymentAdjustmentReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON, oldPaymentAdjustmentReason, paymentAdjustmentReason));
			}
		}
		return paymentAdjustmentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetPaymentAdjustmentReason() {
		return paymentAdjustmentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAdjustmentReason(Coding newPaymentAdjustmentReason) {
		Coding oldPaymentAdjustmentReason = paymentAdjustmentReason;
		paymentAdjustmentReason = newPaymentAdjustmentReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON, oldPaymentAdjustmentReason, paymentAdjustmentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPaymentDate() {
		if (paymentDate != null && paymentDate.eIsProxy()) {
			InternalEObject oldPaymentDate = (InternalEObject)paymentDate;
			paymentDate = (Date)eResolveProxy(oldPaymentDate);
			if (paymentDate != oldPaymentDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_DATE, oldPaymentDate, paymentDate));
			}
		}
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDate(Date newPaymentDate) {
		Date oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_DATE, oldPaymentDate, paymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPaymentAmount() {
		if (paymentAmount != null && paymentAmount.eIsProxy()) {
			InternalEObject oldPaymentAmount = (InternalEObject)paymentAmount;
			paymentAmount = (Money)eResolveProxy(oldPaymentAmount);
			if (paymentAmount != oldPaymentAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_AMOUNT, oldPaymentAmount, paymentAmount));
			}
		}
		return paymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAmount(Money newPaymentAmount) {
		Money oldPaymentAmount = paymentAmount;
		paymentAmount = newPaymentAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_AMOUNT, oldPaymentAmount, paymentAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPaymentRef() {
		if (paymentRef != null && paymentRef.eIsProxy()) {
			InternalEObject oldPaymentRef = (InternalEObject)paymentRef;
			paymentRef = (Identifier)eResolveProxy(oldPaymentRef);
			if (paymentRef != oldPaymentRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_REF, oldPaymentRef, paymentRef));
			}
		}
		return paymentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetPaymentRef() {
		return paymentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentRef(Identifier newPaymentRef) {
		Identifier oldPaymentRef = paymentRef;
		paymentRef = newPaymentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_REF, oldPaymentRef, paymentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getReserved() {
		if (reserved != null && reserved.eIsProxy()) {
			InternalEObject oldReserved = (InternalEObject)reserved;
			reserved = (Coding)eResolveProxy(oldReserved);
			if (reserved != oldReserved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__RESERVED, oldReserved, reserved));
			}
		}
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Coding newReserved) {
		Coding oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getForm() {
		if (form != null && form.eIsProxy()) {
			InternalEObject oldForm = (InternalEObject)form;
			form = (Coding)eResolveProxy(oldForm);
			if (form != oldForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE__FORM, oldForm, form));
			}
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Coding newForm) {
		Coding oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseNotes> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<ClaimResponseNotes>(ClaimResponseNotes.class, this, FhirResourcePackage.CLAIM_RESPONSE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseCoverage> getCoverages() {
		if (coverages == null) {
			coverages = new EObjectContainmentEList<ClaimResponseCoverage>(ClaimResponseCoverage.class, this, FhirResourcePackage.CLAIM_RESPONSE__COVERAGE);
		}
		return coverages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM_RESPONSE__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM_RESPONSE__ADD_ITEM:
				return ((InternalEList<?>)getAddItems()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM_RESPONSE__ERROR:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM_RESPONSE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.CLAIM_RESPONSE__COVERAGE:
				return ((InternalEList<?>)getCoverages()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CLAIM_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case FhirResourcePackage.CLAIM_RESPONSE__RULESET:
				if (resolve) return getRuleset();
				return basicGetRuleset();
			case FhirResourcePackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				if (resolve) return getOriginalRuleset();
				return basicGetOriginalRuleset();
			case FhirResourcePackage.CLAIM_RESPONSE__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case FhirResourcePackage.CLAIM_RESPONSE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				if (resolve) return getRequestProvider();
				return basicGetRequestProvider();
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				if (resolve) return getRequestOrganization();
				return basicGetRequestOrganization();
			case FhirResourcePackage.CLAIM_RESPONSE__OUTCOME:
				if (resolve) return getOutcome();
				return basicGetOutcome();
			case FhirResourcePackage.CLAIM_RESPONSE__DISPOSITION:
				if (resolve) return getDisposition();
				return basicGetDisposition();
			case FhirResourcePackage.CLAIM_RESPONSE__PAYEE_TYPE:
				if (resolve) return getPayeeType();
				return basicGetPayeeType();
			case FhirResourcePackage.CLAIM_RESPONSE__ITEM:
				return getItems();
			case FhirResourcePackage.CLAIM_RESPONSE__ADD_ITEM:
				return getAddItems();
			case FhirResourcePackage.CLAIM_RESPONSE__ERROR:
				return getErrors();
			case FhirResourcePackage.CLAIM_RESPONSE__TOTAL_COST:
				if (resolve) return getTotalCost();
				return basicGetTotalCost();
			case FhirResourcePackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				if (resolve) return getUnallocDeductable();
				return basicGetUnallocDeductable();
			case FhirResourcePackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				if (resolve) return getTotalBenefit();
				return basicGetTotalBenefit();
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				if (resolve) return getPaymentAdjustment();
				return basicGetPaymentAdjustment();
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				if (resolve) return getPaymentAdjustmentReason();
				return basicGetPaymentAdjustmentReason();
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_DATE:
				if (resolve) return getPaymentDate();
				return basicGetPaymentDate();
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				if (resolve) return getPaymentAmount();
				return basicGetPaymentAmount();
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_REF:
				if (resolve) return getPaymentRef();
				return basicGetPaymentRef();
			case FhirResourcePackage.CLAIM_RESPONSE__RESERVED:
				if (resolve) return getReserved();
				return basicGetReserved();
			case FhirResourcePackage.CLAIM_RESPONSE__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case FhirResourcePackage.CLAIM_RESPONSE__NOTE:
				return getNotes();
			case FhirResourcePackage.CLAIM_RESPONSE__COVERAGE:
				return getCoverages();
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
			case FhirResourcePackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Claim)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends ClaimResponseItems>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItems().clear();
				getAddItems().addAll((Collection<? extends ClaimResponseAddedItem>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ERROR:
				getErrors().clear();
				getErrors().addAll((Collection<? extends ClaimResponseErrors>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__TOTAL_COST:
				setTotalCost((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				setTotalBenefit((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				setPaymentAdjustment((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				setPaymentAdjustmentReason((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_DATE:
				setPaymentDate((Date)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				setPaymentAmount((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_REF:
				setPaymentRef((Identifier)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__RESERVED:
				setReserved((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__FORM:
				setForm((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends ClaimResponseNotes>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__COVERAGE:
				getCoverages().clear();
				getCoverages().addAll((Collection<? extends ClaimResponseCoverage>)newValue);
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
			case FhirResourcePackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Claim)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Practitioner)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Organization)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((Code)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ITEM:
				getItems().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItems().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__ERROR:
				getErrors().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__TOTAL_COST:
				setTotalCost((Money)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				setTotalBenefit((Money)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				setPaymentAdjustment((Money)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				setPaymentAdjustmentReason((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_DATE:
				setPaymentDate((Date)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				setPaymentAmount((Money)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_REF:
				setPaymentRef((Identifier)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__RESERVED:
				setReserved((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__FORM:
				setForm((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__NOTE:
				getNotes().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE__COVERAGE:
				getCoverages().clear();
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
			case FhirResourcePackage.CLAIM_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST:
				return request != null;
			case FhirResourcePackage.CLAIM_RESPONSE__RULESET:
				return ruleset != null;
			case FhirResourcePackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirResourcePackage.CLAIM_RESPONSE__CREATED:
				return created != null;
			case FhirResourcePackage.CLAIM_RESPONSE__ORGANIZATION:
				return organization != null;
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				return requestProvider != null;
			case FhirResourcePackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				return requestOrganization != null;
			case FhirResourcePackage.CLAIM_RESPONSE__OUTCOME:
				return outcome != null;
			case FhirResourcePackage.CLAIM_RESPONSE__DISPOSITION:
				return disposition != null;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return payeeType != null;
			case FhirResourcePackage.CLAIM_RESPONSE__ITEM:
				return items != null && !items.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE__ADD_ITEM:
				return addItems != null && !addItems.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE__ERROR:
				return errors != null && !errors.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE__TOTAL_COST:
				return totalCost != null;
			case FhirResourcePackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				return unallocDeductable != null;
			case FhirResourcePackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				return totalBenefit != null;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				return paymentAdjustment != null;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				return paymentAdjustmentReason != null;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_DATE:
				return paymentDate != null;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				return paymentAmount != null;
			case FhirResourcePackage.CLAIM_RESPONSE__PAYMENT_REF:
				return paymentRef != null;
			case FhirResourcePackage.CLAIM_RESPONSE__RESERVED:
				return reserved != null;
			case FhirResourcePackage.CLAIM_RESPONSE__FORM:
				return form != null;
			case FhirResourcePackage.CLAIM_RESPONSE__NOTE:
				return notes != null && !notes.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE__COVERAGE:
				return coverages != null && !coverages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseImpl
