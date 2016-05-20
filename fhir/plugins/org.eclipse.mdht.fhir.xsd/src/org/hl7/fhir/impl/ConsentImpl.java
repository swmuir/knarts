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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentAgent;
import org.hl7.fhir.ConsentExcept;
import org.hl7.fhir.ConsentFriendly;
import org.hl7.fhir.ConsentLegal;
import org.hl7.fhir.ConsentStatus;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getExcept <em>Except</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getFriendly <em>Friendly</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getLegal <em>Legal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConsentImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentImpl extends DomainResourceImpl implements Consent {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ConsentStatus status;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateTime issued;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected Period applies;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> topic;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authority;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> domain;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> action;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentAgent> agent;

	/**
	 * The cached value of the '{@link #getExcept() <em>Except</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcept()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentExcept> except;

	/**
	 * The cached value of the '{@link #getFriendly() <em>Friendly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendly()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentFriendly> friendly;

	/**
	 * The cached value of the '{@link #getLegal() <em>Legal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegal()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentLegal> legal;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(ConsentStatus newStatus, NotificationChain msgs) {
		ConsentStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ConsentStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(DateTime newIssued, NotificationChain msgs) {
		DateTime oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(DateTime newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getApplies() {
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplies(Period newApplies, NotificationChain msgs) {
		Period oldApplies = applies;
		applies = newApplies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__APPLIES, oldApplies, newApplies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplies(Period newApplies) {
		if (newApplies != applies) {
			NotificationChain msgs = null;
			if (applies != null)
				msgs = ((InternalEObject)applies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__APPLIES, null, msgs);
			if (newApplies != null)
				msgs = ((InternalEObject)newApplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__APPLIES, null, msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__APPLIES, newApplies, newApplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONSENT__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONSENT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONSENT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthority() {
		if (authority == null) {
			authority = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONSENT__AUTHORITY);
		}
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONSENT__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONSENT__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentAgent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<ConsentAgent>(ConsentAgent.class, this, FhirPackage.CONSENT__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentExcept> getExcept() {
		if (except == null) {
			except = new EObjectContainmentEList<ConsentExcept>(ConsentExcept.class, this, FhirPackage.CONSENT__EXCEPT);
		}
		return except;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentFriendly> getFriendly() {
		if (friendly == null) {
			friendly = new EObjectContainmentEList<ConsentFriendly>(ConsentFriendly.class, this, FhirPackage.CONSENT__FRIENDLY);
		}
		return friendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsentLegal> getLegal() {
		if (legal == null) {
			legal = new EObjectContainmentEList<ConsentLegal>(ConsentLegal.class, this, FhirPackage.CONSENT__LEGAL);
		}
		return legal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.CONSENT__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONSENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONSENT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.CONSENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONSENT__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.CONSENT__APPLIES:
				return basicSetApplies(null, msgs);
			case FhirPackage.CONSENT__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.CONSENT__AUTHORITY:
				return ((InternalEList<?>)getAuthority()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__EXCEPT:
				return ((InternalEList<?>)getExcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__FRIENDLY:
				return ((InternalEList<?>)getFriendly()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__LEGAL:
				return ((InternalEList<?>)getLegal()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONSENT__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONSENT__STATUS:
				return getStatus();
			case FhirPackage.CONSENT__TYPE:
				return getType();
			case FhirPackage.CONSENT__ISSUED:
				return getIssued();
			case FhirPackage.CONSENT__APPLIES:
				return getApplies();
			case FhirPackage.CONSENT__TOPIC:
				return getTopic();
			case FhirPackage.CONSENT__PATIENT:
				return getPatient();
			case FhirPackage.CONSENT__AUTHORITY:
				return getAuthority();
			case FhirPackage.CONSENT__DOMAIN:
				return getDomain();
			case FhirPackage.CONSENT__ACTION:
				return getAction();
			case FhirPackage.CONSENT__AGENT:
				return getAgent();
			case FhirPackage.CONSENT__EXCEPT:
				return getExcept();
			case FhirPackage.CONSENT__FRIENDLY:
				return getFriendly();
			case FhirPackage.CONSENT__LEGAL:
				return getLegal();
			case FhirPackage.CONSENT__RULE:
				return getRule();
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
			case FhirPackage.CONSENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONSENT__STATUS:
				setStatus((ConsentStatus)newValue);
				return;
			case FhirPackage.CONSENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONSENT__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case FhirPackage.CONSENT__APPLIES:
				setApplies((Period)newValue);
				return;
			case FhirPackage.CONSENT__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONSENT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.CONSENT__AUTHORITY:
				getAuthority().clear();
				getAuthority().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONSENT__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONSENT__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONSENT__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends ConsentAgent>)newValue);
				return;
			case FhirPackage.CONSENT__EXCEPT:
				getExcept().clear();
				getExcept().addAll((Collection<? extends ConsentExcept>)newValue);
				return;
			case FhirPackage.CONSENT__FRIENDLY:
				getFriendly().clear();
				getFriendly().addAll((Collection<? extends ConsentFriendly>)newValue);
				return;
			case FhirPackage.CONSENT__LEGAL:
				getLegal().clear();
				getLegal().addAll((Collection<? extends ConsentLegal>)newValue);
				return;
			case FhirPackage.CONSENT__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Attachment>)newValue);
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
			case FhirPackage.CONSENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONSENT__STATUS:
				setStatus((ConsentStatus)null);
				return;
			case FhirPackage.CONSENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CONSENT__ISSUED:
				setIssued((DateTime)null);
				return;
			case FhirPackage.CONSENT__APPLIES:
				setApplies((Period)null);
				return;
			case FhirPackage.CONSENT__TOPIC:
				getTopic().clear();
				return;
			case FhirPackage.CONSENT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.CONSENT__AUTHORITY:
				getAuthority().clear();
				return;
			case FhirPackage.CONSENT__DOMAIN:
				getDomain().clear();
				return;
			case FhirPackage.CONSENT__ACTION:
				getAction().clear();
				return;
			case FhirPackage.CONSENT__AGENT:
				getAgent().clear();
				return;
			case FhirPackage.CONSENT__EXCEPT:
				getExcept().clear();
				return;
			case FhirPackage.CONSENT__FRIENDLY:
				getFriendly().clear();
				return;
			case FhirPackage.CONSENT__LEGAL:
				getLegal().clear();
				return;
			case FhirPackage.CONSENT__RULE:
				getRule().clear();
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
			case FhirPackage.CONSENT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONSENT__STATUS:
				return status != null;
			case FhirPackage.CONSENT__TYPE:
				return type != null;
			case FhirPackage.CONSENT__ISSUED:
				return issued != null;
			case FhirPackage.CONSENT__APPLIES:
				return applies != null;
			case FhirPackage.CONSENT__TOPIC:
				return topic != null && !topic.isEmpty();
			case FhirPackage.CONSENT__PATIENT:
				return patient != null;
			case FhirPackage.CONSENT__AUTHORITY:
				return authority != null && !authority.isEmpty();
			case FhirPackage.CONSENT__DOMAIN:
				return domain != null && !domain.isEmpty();
			case FhirPackage.CONSENT__ACTION:
				return action != null && !action.isEmpty();
			case FhirPackage.CONSENT__AGENT:
				return agent != null && !agent.isEmpty();
			case FhirPackage.CONSENT__EXCEPT:
				return except != null && !except.isEmpty();
			case FhirPackage.CONSENT__FRIENDLY:
				return friendly != null && !friendly.isEmpty();
			case FhirPackage.CONSENT__LEGAL:
				return legal != null && !legal.isEmpty();
			case FhirPackage.CONSENT__RULE:
				return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsentImpl
