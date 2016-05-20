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

import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitProsthesis;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getSupervisorIdentifier <em>Supervisor Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getSupervisorReference <em>Supervisor Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getProviderQualification <em>Provider Qualification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getDiagnosisLinkId <em>Diagnosis Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getServiceModifier <em>Service Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getSubSite <em>Sub Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ExplanationOfBenefitItemImpl#getProsthesis <em>Prosthesis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitItemImpl extends BackboneElementImpl implements ExplanationOfBenefitItem {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getProviderIdentifier() <em>Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier providerIdentifier;

	/**
	 * The cached value of the '{@link #getProviderReference() <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderReference()
	 * @generated
	 * @ordered
	 */
	protected Reference providerReference;

	/**
	 * The cached value of the '{@link #getSupervisorIdentifier() <em>Supervisor Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier supervisorIdentifier;

	/**
	 * The cached value of the '{@link #getSupervisorReference() <em>Supervisor Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorReference()
	 * @generated
	 * @ordered
	 */
	protected Reference supervisorReference;

	/**
	 * The cached value of the '{@link #getProviderQualification() <em>Provider Qualification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderQualification()
	 * @generated
	 * @ordered
	 */
	protected Coding providerQualification;

	/**
	 * The cached value of the '{@link #getDiagnosisLinkId() <em>Diagnosis Link Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> diagnosisLinkId;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Coding service;

	/**
	 * The cached value of the '{@link #getServiceModifier() <em>Service Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> serviceModifier;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> modifier;

	/**
	 * The cached value of the '{@link #getProgramCode() <em>Program Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> programCode;

	/**
	 * The cached value of the '{@link #getServicedDate() <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedDate()
	 * @generated
	 * @ordered
	 */
	protected Date servicedDate;

	/**
	 * The cached value of the '{@link #getServicedPeriod() <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period servicedPeriod;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Coding place;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Decimal points;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdi() <em>Udi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdi()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> udi;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected Coding bodySite;

	/**
	 * The cached value of the '{@link #getSubSite() <em>Sub Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSite()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> subSite;

	/**
	 * The cached value of the '{@link #getNoteNumber() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumber;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitAdjudication> adjudication;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplanationOfBenefitDetail> detail;

	/**
	 * The cached value of the '{@link #getProsthesis() <em>Prosthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProsthesis()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefitProsthesis prosthesis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getExplanationOfBenefitItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getProviderIdentifier() {
		return providerIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderIdentifier(Identifier newProviderIdentifier, NotificationChain msgs) {
		Identifier oldProviderIdentifier = providerIdentifier;
		providerIdentifier = newProviderIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER, oldProviderIdentifier, newProviderIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderIdentifier(Identifier newProviderIdentifier) {
		if (newProviderIdentifier != providerIdentifier) {
			NotificationChain msgs = null;
			if (providerIdentifier != null)
				msgs = ((InternalEObject)providerIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER, null, msgs);
			if (newProviderIdentifier != null)
				msgs = ((InternalEObject)newProviderIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER, null, msgs);
			msgs = basicSetProviderIdentifier(newProviderIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER, newProviderIdentifier, newProviderIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProviderReference() {
		return providerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderReference(Reference newProviderReference, NotificationChain msgs) {
		Reference oldProviderReference = providerReference;
		providerReference = newProviderReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE, oldProviderReference, newProviderReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderReference(Reference newProviderReference) {
		if (newProviderReference != providerReference) {
			NotificationChain msgs = null;
			if (providerReference != null)
				msgs = ((InternalEObject)providerReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE, null, msgs);
			if (newProviderReference != null)
				msgs = ((InternalEObject)newProviderReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE, null, msgs);
			msgs = basicSetProviderReference(newProviderReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE, newProviderReference, newProviderReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getSupervisorIdentifier() {
		return supervisorIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupervisorIdentifier(Identifier newSupervisorIdentifier, NotificationChain msgs) {
		Identifier oldSupervisorIdentifier = supervisorIdentifier;
		supervisorIdentifier = newSupervisorIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER, oldSupervisorIdentifier, newSupervisorIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisorIdentifier(Identifier newSupervisorIdentifier) {
		if (newSupervisorIdentifier != supervisorIdentifier) {
			NotificationChain msgs = null;
			if (supervisorIdentifier != null)
				msgs = ((InternalEObject)supervisorIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER, null, msgs);
			if (newSupervisorIdentifier != null)
				msgs = ((InternalEObject)newSupervisorIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER, null, msgs);
			msgs = basicSetSupervisorIdentifier(newSupervisorIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER, newSupervisorIdentifier, newSupervisorIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSupervisorReference() {
		return supervisorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupervisorReference(Reference newSupervisorReference, NotificationChain msgs) {
		Reference oldSupervisorReference = supervisorReference;
		supervisorReference = newSupervisorReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE, oldSupervisorReference, newSupervisorReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisorReference(Reference newSupervisorReference) {
		if (newSupervisorReference != supervisorReference) {
			NotificationChain msgs = null;
			if (supervisorReference != null)
				msgs = ((InternalEObject)supervisorReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE, null, msgs);
			if (newSupervisorReference != null)
				msgs = ((InternalEObject)newSupervisorReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE, null, msgs);
			msgs = basicSetSupervisorReference(newSupervisorReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE, newSupervisorReference, newSupervisorReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getProviderQualification() {
		return providerQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProviderQualification(Coding newProviderQualification, NotificationChain msgs) {
		Coding oldProviderQualification = providerQualification;
		providerQualification = newProviderQualification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION, oldProviderQualification, newProviderQualification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderQualification(Coding newProviderQualification) {
		if (newProviderQualification != providerQualification) {
			NotificationChain msgs = null;
			if (providerQualification != null)
				msgs = ((InternalEObject)providerQualification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION, null, msgs);
			if (newProviderQualification != null)
				msgs = ((InternalEObject)newProviderQualification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION, null, msgs);
			msgs = basicSetProviderQualification(newProviderQualification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION, newProviderQualification, newProviderQualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getDiagnosisLinkId() {
		if (diagnosisLinkId == null) {
			diagnosisLinkId = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_LINK_ID);
		}
		return diagnosisLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Coding newService, NotificationChain msgs) {
		Coding oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Coding newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getServiceModifier() {
		if (serviceModifier == null) {
			serviceModifier = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE_MODIFIER);
		}
		return serviceModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getProgramCode() {
		if (programCode == null) {
			programCode = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE);
		}
		return programCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getServicedDate() {
		return servicedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedDate(Date newServicedDate, NotificationChain msgs) {
		Date oldServicedDate = servicedDate;
		servicedDate = newServicedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE, oldServicedDate, newServicedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedDate(Date newServicedDate) {
		if (newServicedDate != servicedDate) {
			NotificationChain msgs = null;
			if (servicedDate != null)
				msgs = ((InternalEObject)servicedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE, null, msgs);
			if (newServicedDate != null)
				msgs = ((InternalEObject)newServicedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE, null, msgs);
			msgs = basicSetServicedDate(newServicedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE, newServicedDate, newServicedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getServicedPeriod() {
		return servicedPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedPeriod(Period newServicedPeriod, NotificationChain msgs) {
		Period oldServicedPeriod = servicedPeriod;
		servicedPeriod = newServicedPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD, oldServicedPeriod, newServicedPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedPeriod(Period newServicedPeriod) {
		if (newServicedPeriod != servicedPeriod) {
			NotificationChain msgs = null;
			if (servicedPeriod != null)
				msgs = ((InternalEObject)servicedPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD, null, msgs);
			if (newServicedPeriod != null)
				msgs = ((InternalEObject)newServicedPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD, null, msgs);
			msgs = basicSetServicedPeriod(newServicedPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD, newServicedPeriod, newServicedPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Coding newPlace, NotificationChain msgs) {
		Coding oldPlace = place;
		place = newPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE, oldPlace, newPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Coding newPlace) {
		if (newPlace != place) {
			NotificationChain msgs = null;
			if (place != null)
				msgs = ((InternalEObject)place).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE, null, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject)newPlace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE, null, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(SimpleQuantity newQuantity, NotificationChain msgs) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactor(Decimal newFactor, NotificationChain msgs) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR, oldFactor, newFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		if (newFactor != factor) {
			NotificationChain msgs = null;
			if (factor != null)
				msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR, null, msgs);
			if (newFactor != null)
				msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR, null, msgs);
			msgs = basicSetFactor(newFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR, newFactor, newFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoints(Decimal newPoints, NotificationChain msgs) {
		Decimal oldPoints = points;
		points = newPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS, oldPoints, newPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(Decimal newPoints) {
		if (newPoints != points) {
			NotificationChain msgs = null;
			if (points != null)
				msgs = ((InternalEObject)points).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS, null, msgs);
			if (newPoints != null)
				msgs = ((InternalEObject)newPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS, null, msgs);
			msgs = basicSetPoints(newPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS, newPoints, newPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Money newNet, NotificationChain msgs) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET, oldNet, newNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Money newNet) {
		if (newNet != net) {
			NotificationChain msgs = null;
			if (net != null)
				msgs = ((InternalEObject)net).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET, null, msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET, null, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getUdi() {
		if (udi == null) {
			udi = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI);
		}
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(Coding newBodySite, NotificationChain msgs) {
		Coding oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(Coding newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSubSite() {
		if (subSite == null) {
			subSite = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE);
		}
		return subSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumber() {
		if (noteNumber == null) {
			noteNumber = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER);
		}
		return noteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitAdjudication> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ExplanationOfBenefitAdjudication>(ExplanationOfBenefitAdjudication.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplanationOfBenefitDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<ExplanationOfBenefitDetail>(ExplanationOfBenefitDetail.class, this, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL);
		}
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefitProsthesis getProsthesis() {
		return prosthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProsthesis(ExplanationOfBenefitProsthesis newProsthesis, NotificationChain msgs) {
		ExplanationOfBenefitProsthesis oldProsthesis = prosthesis;
		prosthesis = newProsthesis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS, oldProsthesis, newProsthesis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProsthesis(ExplanationOfBenefitProsthesis newProsthesis) {
		if (newProsthesis != prosthesis) {
			NotificationChain msgs = null;
			if (prosthesis != null)
				msgs = ((InternalEObject)prosthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS, null, msgs);
			if (newProsthesis != null)
				msgs = ((InternalEObject)newProsthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS, null, msgs);
			msgs = basicSetProsthesis(newProsthesis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS, newProsthesis, newProsthesis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER:
				return basicSetProviderIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE:
				return basicSetProviderReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER:
				return basicSetSupervisorIdentifier(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE:
				return basicSetSupervisorReference(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION:
				return basicSetProviderQualification(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_LINK_ID:
				return ((InternalEList<?>)getDiagnosisLinkId()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE:
				return basicSetService(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE_MODIFIER:
				return ((InternalEList<?>)getServiceModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				return ((InternalEList<?>)getProgramCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE:
				return basicSetServicedDate(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD:
				return basicSetServicedPeriod(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE:
				return basicSetPlace(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				return basicSetFactor(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS:
				return basicSetPoints(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				return basicSetNet(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				return ((InternalEList<?>)getUdi()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				return ((InternalEList<?>)getSubSite()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS:
				return basicSetProsthesis(null, msgs);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				return getSequence();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE:
				return getType();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER:
				return getProviderIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE:
				return getProviderReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER:
				return getSupervisorIdentifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE:
				return getSupervisorReference();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION:
				return getProviderQualification();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_LINK_ID:
				return getDiagnosisLinkId();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE:
				return getService();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE_MODIFIER:
				return getServiceModifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				return getModifier();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				return getProgramCode();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE:
				return getServicedDate();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD:
				return getServicedPeriod();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE:
				return getPlace();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				return getFactor();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS:
				return getPoints();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				return getNet();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				return getUdi();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				return getBodySite();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				return getSubSite();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				return getNoteNumber();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				return getAdjudication();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				return getDetail();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS:
				return getProsthesis();
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE:
				setProviderReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER:
				setSupervisorIdentifier((Identifier)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE:
				setSupervisorReference((Reference)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION:
				setProviderQualification((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_LINK_ID:
				getDiagnosisLinkId().clear();
				getDiagnosisLinkId().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE_MODIFIER:
				getServiceModifier().clear();
				getServiceModifier().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				getProgramCode().clear();
				getProgramCode().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE:
				setServicedDate((Date)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD:
				setServicedPeriod((Period)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE:
				setPlace((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS:
				setPoints((Decimal)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				setNet((Money)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				getUdi().clear();
				getUdi().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				setBodySite((Coding)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				getSubSite().clear();
				getSubSite().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				getNoteNumber().clear();
				getNoteNumber().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ExplanationOfBenefitAdjudication>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends ExplanationOfBenefitDetail>)newValue);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS:
				setProsthesis((ExplanationOfBenefitProsthesis)newValue);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER:
				setProviderIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE:
				setProviderReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER:
				setSupervisorIdentifier((Identifier)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE:
				setSupervisorReference((Reference)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION:
				setProviderQualification((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_LINK_ID:
				getDiagnosisLinkId().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE:
				setService((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE_MODIFIER:
				getServiceModifier().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				getProgramCode().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE:
				setServicedDate((Date)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD:
				setServicedPeriod((Period)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE:
				setPlace((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS:
				setPoints((Decimal)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				setNet((Money)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				getUdi().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				setBodySite((Coding)null);
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				getSubSite().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				getNoteNumber().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				getAdjudication().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				getDetail().clear();
				return;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS:
				setProsthesis((ExplanationOfBenefitProsthesis)null);
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
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SEQUENCE:
				return sequence != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__TYPE:
				return type != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_IDENTIFIER:
				return providerIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_REFERENCE:
				return providerReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_IDENTIFIER:
				return supervisorIdentifier != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUPERVISOR_REFERENCE:
				return supervisorReference != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROVIDER_QUALIFICATION:
				return providerQualification != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DIAGNOSIS_LINK_ID:
				return diagnosisLinkId != null && !diagnosisLinkId.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE:
				return service != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICE_MODIFIER:
				return serviceModifier != null && !serviceModifier.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROGRAM_CODE:
				return programCode != null && !programCode.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_DATE:
				return servicedDate != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SERVICED_PERIOD:
				return servicedPeriod != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PLACE:
				return place != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UNIT_PRICE:
				return unitPrice != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__FACTOR:
				return factor != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__POINTS:
				return points != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NET:
				return net != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__UDI:
				return udi != null && !udi.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__BODY_SITE:
				return bodySite != null;
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__SUB_SITE:
				return subSite != null && !subSite.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__NOTE_NUMBER:
				return noteNumber != null && !noteNumber.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__DETAIL:
				return detail != null && !detail.isEmpty();
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM__PROSTHESIS:
				return prosthesis != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitItemImpl
