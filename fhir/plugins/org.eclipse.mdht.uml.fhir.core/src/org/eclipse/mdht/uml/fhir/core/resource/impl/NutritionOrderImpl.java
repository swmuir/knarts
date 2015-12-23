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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.AllergyIntolerance;
import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrder;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderEnteralFormula;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderOralDiet;
import org.eclipse.mdht.uml.fhir.core.resource.NutritionOrderSupplement;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getAllergyIntolerances <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getFoodPreferenceModifiers <em>Food Preference Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getExcludeFoodModifiers <em>Exclude Food Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getOralDiet <em>Oral Diet</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getSupplements <em>Supplement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.NutritionOrderImpl#getEnteralFormula <em>Enteral Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderImpl extends DomainResourceImpl implements NutritionOrder {
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
	 * The cached value of the '{@link #getOrderer() <em>Orderer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderer()
	 * @generated
	 * @ordered
	 */
	protected Practitioner orderer;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

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
	 * The cached value of the '{@link #getAllergyIntolerances() <em>Allergy Intolerance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerances()
	 * @generated
	 * @ordered
	 */
	protected EList<AllergyIntolerance> allergyIntolerances;

	/**
	 * The cached value of the '{@link #getFoodPreferenceModifiers() <em>Food Preference Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodPreferenceModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> foodPreferenceModifiers;

	/**
	 * The cached value of the '{@link #getExcludeFoodModifiers() <em>Exclude Food Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFoodModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> excludeFoodModifiers;

	/**
	 * The cached value of the '{@link #getOralDiet() <em>Oral Diet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOralDiet()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderOralDiet oralDiet;

	/**
	 * The cached value of the '{@link #getSupplements() <em>Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplements()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderSupplement> supplements;

	/**
	 * The cached value of the '{@link #getEnteralFormula() <em>Enteral Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteralFormula()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderEnteralFormula enteralFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getNutritionOrder();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getOrderer() {
		if (orderer != null && orderer.eIsProxy()) {
			InternalEObject oldOrderer = (InternalEObject)orderer;
			orderer = (Practitioner)eResolveProxy(oldOrderer);
			if (orderer != oldOrderer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER__ORDERER, oldOrderer, orderer));
			}
		}
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetOrderer() {
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderer(Practitioner newOrderer) {
		Practitioner oldOrderer = orderer;
		orderer = newOrderer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__ORDERER, oldOrderer, orderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.NUTRITION_ORDER__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateTime() {
		if (dateTime != null && dateTime.eIsProxy()) {
			InternalEObject oldDateTime = (InternalEObject)dateTime;
			dateTime = (DateTime)eResolveProxy(oldDateTime);
			if (dateTime != oldDateTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER__DATE_TIME, oldDateTime, dateTime));
			}
		}
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTime newDateTime) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__DATE_TIME, oldDateTime, dateTime));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.NUTRITION_ORDER__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyIntolerance> getAllergyIntolerances() {
		if (allergyIntolerances == null) {
			allergyIntolerances = new EObjectResolvingEList<AllergyIntolerance>(AllergyIntolerance.class, this, FhirResourcePackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE);
		}
		return allergyIntolerances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFoodPreferenceModifiers() {
		if (foodPreferenceModifiers == null) {
			foodPreferenceModifiers = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER);
		}
		return foodPreferenceModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getExcludeFoodModifiers() {
		if (excludeFoodModifiers == null) {
			excludeFoodModifiers = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER);
		}
		return excludeFoodModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDiet getOralDiet() {
		return oralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOralDiet(NutritionOrderOralDiet newOralDiet, NotificationChain msgs) {
		NutritionOrderOralDiet oldOralDiet = oralDiet;
		oralDiet = newOralDiet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET, oldOralDiet, newOralDiet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOralDiet(NutritionOrderOralDiet newOralDiet) {
		if (newOralDiet != oralDiet) {
			NotificationChain msgs = null;
			if (oralDiet != null)
				msgs = ((InternalEObject)oralDiet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET, null, msgs);
			if (newOralDiet != null)
				msgs = ((InternalEObject)newOralDiet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET, null, msgs);
			msgs = basicSetOralDiet(newOralDiet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET, newOralDiet, newOralDiet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderSupplement> getSupplements() {
		if (supplements == null) {
			supplements = new EObjectContainmentEList<NutritionOrderSupplement>(NutritionOrderSupplement.class, this, FhirResourcePackage.NUTRITION_ORDER__SUPPLEMENT);
		}
		return supplements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormula getEnteralFormula() {
		return enteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnteralFormula(NutritionOrderEnteralFormula newEnteralFormula, NotificationChain msgs) {
		NutritionOrderEnteralFormula oldEnteralFormula = enteralFormula;
		enteralFormula = newEnteralFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA, oldEnteralFormula, newEnteralFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnteralFormula(NutritionOrderEnteralFormula newEnteralFormula) {
		if (newEnteralFormula != enteralFormula) {
			NotificationChain msgs = null;
			if (enteralFormula != null)
				msgs = ((InternalEObject)enteralFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA, null, msgs);
			if (newEnteralFormula != null)
				msgs = ((InternalEObject)newEnteralFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA, null, msgs);
			msgs = basicSetEnteralFormula(newEnteralFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA, newEnteralFormula, newEnteralFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET:
				return basicSetOralDiet(null, msgs);
			case FhirResourcePackage.NUTRITION_ORDER__SUPPLEMENT:
				return ((InternalEList<?>)getSupplements()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return basicSetEnteralFormula(null, msgs);
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
			case FhirResourcePackage.NUTRITION_ORDER__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.NUTRITION_ORDER__ORDERER:
				if (resolve) return getOrderer();
				return basicGetOrderer();
			case FhirResourcePackage.NUTRITION_ORDER__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.NUTRITION_ORDER__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.NUTRITION_ORDER__DATE_TIME:
				if (resolve) return getDateTime();
				return basicGetDateTime();
			case FhirResourcePackage.NUTRITION_ORDER__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return getAllergyIntolerances();
			case FhirResourcePackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return getFoodPreferenceModifiers();
			case FhirResourcePackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return getExcludeFoodModifiers();
			case FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET:
				return getOralDiet();
			case FhirResourcePackage.NUTRITION_ORDER__SUPPLEMENT:
				return getSupplements();
			case FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return getEnteralFormula();
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
			case FhirResourcePackage.NUTRITION_ORDER__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ORDERER:
				setOrderer((Practitioner)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				getAllergyIntolerances().clear();
				getAllergyIntolerances().addAll((Collection<? extends AllergyIntolerance>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifiers().clear();
				getFoodPreferenceModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifiers().clear();
				getExcludeFoodModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET:
				setOralDiet((NutritionOrderOralDiet)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__SUPPLEMENT:
				getSupplements().clear();
				getSupplements().addAll((Collection<? extends NutritionOrderSupplement>)newValue);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				setEnteralFormula((NutritionOrderEnteralFormula)newValue);
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
			case FhirResourcePackage.NUTRITION_ORDER__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ORDERER:
				setOrderer((Practitioner)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				getAllergyIntolerances().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifiers().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifiers().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET:
				setOralDiet((NutritionOrderOralDiet)null);
				return;
			case FhirResourcePackage.NUTRITION_ORDER__SUPPLEMENT:
				getSupplements().clear();
				return;
			case FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				setEnteralFormula((NutritionOrderEnteralFormula)null);
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
			case FhirResourcePackage.NUTRITION_ORDER__PATIENT:
				return patient != null;
			case FhirResourcePackage.NUTRITION_ORDER__ORDERER:
				return orderer != null;
			case FhirResourcePackage.NUTRITION_ORDER__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.NUTRITION_ORDER__DATE_TIME:
				return dateTime != null;
			case FhirResourcePackage.NUTRITION_ORDER__STATUS:
				return status != null;
			case FhirResourcePackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return allergyIntolerances != null && !allergyIntolerances.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return foodPreferenceModifiers != null && !foodPreferenceModifiers.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return excludeFoodModifiers != null && !excludeFoodModifiers.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER__ORAL_DIET:
				return oralDiet != null;
			case FhirResourcePackage.NUTRITION_ORDER__SUPPLEMENT:
				return supplements != null && !supplements.isEmpty();
			case FhirResourcePackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return enteralFormula != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderImpl
