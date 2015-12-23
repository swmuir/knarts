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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

import org.eclipse.mdht.uml.fhir.core.resource.Account;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getActivePeriod <em>Active Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getCoveragePeriod <em>Coverage Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.AccountImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends DomainResourceImpl implements Account {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String name;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getActivePeriod() <em>Active Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period activePeriod;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Coding currency;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected Money balance;

	/**
	 * The cached value of the '{@link #getCoveragePeriod() <em>Coverage Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveragePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period coveragePeriod;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Organization owner;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getAccount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.ACCOUNT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.datatype.String newName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getActivePeriod() {
		if (activePeriod != null && activePeriod.eIsProxy()) {
			InternalEObject oldActivePeriod = (InternalEObject)activePeriod;
			activePeriod = (Period)eResolveProxy(oldActivePeriod);
			if (activePeriod != oldActivePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__ACTIVE_PERIOD, oldActivePeriod, activePeriod));
			}
		}
		return activePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetActivePeriod() {
		return activePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePeriod(Period newActivePeriod) {
		Period oldActivePeriod = activePeriod;
		activePeriod = newActivePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__ACTIVE_PERIOD, oldActivePeriod, activePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCurrency() {
		if (currency != null && currency.eIsProxy()) {
			InternalEObject oldCurrency = (InternalEObject)currency;
			currency = (Coding)eResolveProxy(oldCurrency);
			if (currency != oldCurrency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__CURRENCY, oldCurrency, currency));
			}
		}
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(Coding newCurrency) {
		Coding oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getBalance() {
		if (balance != null && balance.eIsProxy()) {
			InternalEObject oldBalance = (InternalEObject)balance;
			balance = (Money)eResolveProxy(oldBalance);
			if (balance != oldBalance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__BALANCE, oldBalance, balance));
			}
		}
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(Money newBalance) {
		Money oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getCoveragePeriod() {
		if (coveragePeriod != null && coveragePeriod.eIsProxy()) {
			InternalEObject oldCoveragePeriod = (InternalEObject)coveragePeriod;
			coveragePeriod = (Period)eResolveProxy(oldCoveragePeriod);
			if (coveragePeriod != oldCoveragePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__COVERAGE_PERIOD, oldCoveragePeriod, coveragePeriod));
			}
		}
		return coveragePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetCoveragePeriod() {
		return coveragePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoveragePeriod(Period newCoveragePeriod) {
		Period oldCoveragePeriod = coveragePeriod;
		coveragePeriod = newCoveragePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__COVERAGE_PERIOD, oldCoveragePeriod, coveragePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Organization)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Organization newOwner) {
		Organization oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__OWNER, oldOwner, owner));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.ACCOUNT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.ACCOUNT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.ACCOUNT__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.ACCOUNT__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.ACCOUNT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.ACCOUNT__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.ACCOUNT__ACTIVE_PERIOD:
				if (resolve) return getActivePeriod();
				return basicGetActivePeriod();
			case FhirResourcePackage.ACCOUNT__CURRENCY:
				if (resolve) return getCurrency();
				return basicGetCurrency();
			case FhirResourcePackage.ACCOUNT__BALANCE:
				if (resolve) return getBalance();
				return basicGetBalance();
			case FhirResourcePackage.ACCOUNT__COVERAGE_PERIOD:
				if (resolve) return getCoveragePeriod();
				return basicGetCoveragePeriod();
			case FhirResourcePackage.ACCOUNT__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.ACCOUNT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case FhirResourcePackage.ACCOUNT__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
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
			case FhirResourcePackage.ACCOUNT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__ACTIVE_PERIOD:
				setActivePeriod((Period)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__CURRENCY:
				setCurrency((Coding)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__BALANCE:
				setBalance((Money)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__COVERAGE_PERIOD:
				setCoveragePeriod((Period)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__OWNER:
				setOwner((Organization)newValue);
				return;
			case FhirResourcePackage.ACCOUNT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.ACCOUNT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.ACCOUNT__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.ACCOUNT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.ACCOUNT__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.ACCOUNT__ACTIVE_PERIOD:
				setActivePeriod((Period)null);
				return;
			case FhirResourcePackage.ACCOUNT__CURRENCY:
				setCurrency((Coding)null);
				return;
			case FhirResourcePackage.ACCOUNT__BALANCE:
				setBalance((Money)null);
				return;
			case FhirResourcePackage.ACCOUNT__COVERAGE_PERIOD:
				setCoveragePeriod((Period)null);
				return;
			case FhirResourcePackage.ACCOUNT__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.ACCOUNT__OWNER:
				setOwner((Organization)null);
				return;
			case FhirResourcePackage.ACCOUNT__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.ACCOUNT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.ACCOUNT__NAME:
				return name != null;
			case FhirResourcePackage.ACCOUNT__TYPE:
				return type != null;
			case FhirResourcePackage.ACCOUNT__STATUS:
				return status != null;
			case FhirResourcePackage.ACCOUNT__ACTIVE_PERIOD:
				return activePeriod != null;
			case FhirResourcePackage.ACCOUNT__CURRENCY:
				return currency != null;
			case FhirResourcePackage.ACCOUNT__BALANCE:
				return balance != null;
			case FhirResourcePackage.ACCOUNT__COVERAGE_PERIOD:
				return coveragePeriod != null;
			case FhirResourcePackage.ACCOUNT__SUBJECT:
				return subject != null;
			case FhirResourcePackage.ACCOUNT__OWNER:
				return owner != null;
			case FhirResourcePackage.ACCOUNT__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountImpl
