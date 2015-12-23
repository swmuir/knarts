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

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.PaymentNotice;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Notice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PaymentNoticeImpl#getPaymentStatus <em>Payment Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentNoticeImpl extends DomainResourceImpl implements PaymentNotice {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Resource request;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Resource response;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected Coding paymentStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentNoticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getPaymentNotice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.PAYMENT_NOTICE__IDENTIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__RULESET, oldRuleset, ruleset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__RULESET, oldRuleset, ruleset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__CREATED, oldCreated, created));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__TARGET, oldTarget, target));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__PROVIDER, oldProvider, provider));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__ORGANIZATION, oldOrganization, organization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Resource)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Resource newRequest) {
		Resource oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (Resource)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Resource newResponse) {
		Resource oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPaymentStatus() {
		if (paymentStatus != null && paymentStatus.eIsProxy()) {
			InternalEObject oldPaymentStatus = (InternalEObject)paymentStatus;
			paymentStatus = (Coding)eResolveProxy(oldPaymentStatus);
			if (paymentStatus != oldPaymentStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PAYMENT_NOTICE__PAYMENT_STATUS, oldPaymentStatus, paymentStatus));
			}
		}
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatus(Coding newPaymentStatus) {
		Coding oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PAYMENT_NOTICE__PAYMENT_STATUS, oldPaymentStatus, paymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.PAYMENT_NOTICE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.PAYMENT_NOTICE__RULESET:
				if (resolve) return getRuleset();
				return basicGetRuleset();
			case FhirResourcePackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				if (resolve) return getOriginalRuleset();
				return basicGetOriginalRuleset();
			case FhirResourcePackage.PAYMENT_NOTICE__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case FhirResourcePackage.PAYMENT_NOTICE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FhirResourcePackage.PAYMENT_NOTICE__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case FhirResourcePackage.PAYMENT_NOTICE__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case FhirResourcePackage.PAYMENT_NOTICE__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case FhirResourcePackage.PAYMENT_NOTICE__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case FhirResourcePackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				if (resolve) return getPaymentStatus();
				return basicGetPaymentStatus();
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
			case FhirResourcePackage.PAYMENT_NOTICE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__TARGET:
				setTarget((Organization)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__PROVIDER:
				setProvider((Practitioner)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__REQUEST:
				setRequest((Resource)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__RESPONSE:
				setResponse((Resource)newValue);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				setPaymentStatus((Coding)newValue);
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
			case FhirResourcePackage.PAYMENT_NOTICE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__TARGET:
				setTarget((Organization)null);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__PROVIDER:
				setProvider((Practitioner)null);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__REQUEST:
				setRequest((Resource)null);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__RESPONSE:
				setResponse((Resource)null);
				return;
			case FhirResourcePackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				setPaymentStatus((Coding)null);
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
			case FhirResourcePackage.PAYMENT_NOTICE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.PAYMENT_NOTICE__RULESET:
				return ruleset != null;
			case FhirResourcePackage.PAYMENT_NOTICE__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirResourcePackage.PAYMENT_NOTICE__CREATED:
				return created != null;
			case FhirResourcePackage.PAYMENT_NOTICE__TARGET:
				return target != null;
			case FhirResourcePackage.PAYMENT_NOTICE__PROVIDER:
				return provider != null;
			case FhirResourcePackage.PAYMENT_NOTICE__ORGANIZATION:
				return organization != null;
			case FhirResourcePackage.PAYMENT_NOTICE__REQUEST:
				return request != null;
			case FhirResourcePackage.PAYMENT_NOTICE__RESPONSE:
				return response != null;
			case FhirResourcePackage.PAYMENT_NOTICE__PAYMENT_STATUS:
				return paymentStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentNoticeImpl
