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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Ratio;
import org.eclipse.mdht.uml.fhir.core.datatype.Timing;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Statement Dosage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getAsNeededx <em>As Neededx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getSitex <em>Sitex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getQuantityx <em>Quantityx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getRatex <em>Ratex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationStatementDosageImpl#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationStatementDosageImpl extends BackboneElementImpl implements MedicationStatementDosage {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String text;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timing;

	/**
	 * The cached value of the '{@link #getAsNeededx() <em>As Neededx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededx()
	 * @generated
	 * @ordered
	 */
	protected DataType asNeededx;

	/**
	 * The cached value of the '{@link #getSitex() <em>Sitex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitex()
	 * @generated
	 * @ordered
	 */
	protected Base sitex;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getQuantityx() <em>Quantityx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityx()
	 * @generated
	 * @ordered
	 */
	protected DataType quantityx;

	/**
	 * The cached value of the '{@link #getRatex() <em>Ratex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatex()
	 * @generated
	 * @ordered
	 */
	protected DataType ratex;

	/**
	 * The cached value of the '{@link #getMaxDosePerPeriod() <em>Max Dose Per Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxDosePerPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationStatementDosageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMedicationStatementDosage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.datatype.String newText) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTiming() {
		if (timing != null && timing.eIsProxy()) {
			InternalEObject oldTiming = (InternalEObject)timing;
			timing = (Timing)eResolveProxy(oldTiming);
			if (timing != oldTiming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TIMING, oldTiming, timing));
			}
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing basicGetTiming() {
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiming(Timing newTiming) {
		Timing oldTiming = timing;
		timing = newTiming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TIMING, oldTiming, timing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAsNeededx() {
		if (asNeededx != null && asNeededx.eIsProxy()) {
			InternalEObject oldAsNeededx = (InternalEObject)asNeededx;
			asNeededx = (DataType)eResolveProxy(oldAsNeededx);
			if (asNeededx != oldAsNeededx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDEDX, oldAsNeededx, asNeededx));
			}
		}
		return asNeededx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetAsNeededx() {
		return asNeededx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsNeededx(DataType newAsNeededx) {
		DataType oldAsNeededx = asNeededx;
		asNeededx = newAsNeededx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDEDX, oldAsNeededx, asNeededx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getSitex() {
		if (sitex != null && sitex.eIsProxy()) {
			InternalEObject oldSitex = (InternalEObject)sitex;
			sitex = (Base)eResolveProxy(oldSitex);
			if (sitex != oldSitex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__SITEX, oldSitex, sitex));
			}
		}
		return sitex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetSitex() {
		return sitex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSitex(Base newSitex) {
		Base oldSitex = sitex;
		sitex = newSitex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__SITEX, oldSitex, sitex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (CodeableConcept)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (CodeableConcept)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getQuantityx() {
		if (quantityx != null && quantityx.eIsProxy()) {
			InternalEObject oldQuantityx = (InternalEObject)quantityx;
			quantityx = (DataType)eResolveProxy(oldQuantityx);
			if (quantityx != oldQuantityx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__QUANTITYX, oldQuantityx, quantityx));
			}
		}
		return quantityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetQuantityx() {
		return quantityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityx(DataType newQuantityx) {
		DataType oldQuantityx = quantityx;
		quantityx = newQuantityx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__QUANTITYX, oldQuantityx, quantityx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getRatex() {
		if (ratex != null && ratex.eIsProxy()) {
			InternalEObject oldRatex = (InternalEObject)ratex;
			ratex = (DataType)eResolveProxy(oldRatex);
			if (ratex != oldRatex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__RATEX, oldRatex, ratex));
			}
		}
		return ratex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetRatex() {
		return ratex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatex(DataType newRatex) {
		DataType oldRatex = ratex;
		ratex = newRatex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__RATEX, oldRatex, ratex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getMaxDosePerPeriod() {
		if (maxDosePerPeriod != null && maxDosePerPeriod.eIsProxy()) {
			InternalEObject oldMaxDosePerPeriod = (InternalEObject)maxDosePerPeriod;
			maxDosePerPeriod = (Ratio)eResolveProxy(oldMaxDosePerPeriod);
			if (maxDosePerPeriod != oldMaxDosePerPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD, oldMaxDosePerPeriod, maxDosePerPeriod));
			}
		}
		return maxDosePerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio basicGetMaxDosePerPeriod() {
		return maxDosePerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDosePerPeriod(Ratio newMaxDosePerPeriod) {
		Ratio oldMaxDosePerPeriod = maxDosePerPeriod;
		maxDosePerPeriod = newMaxDosePerPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD, oldMaxDosePerPeriod, maxDosePerPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				if (resolve) return getTiming();
				return basicGetTiming();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDEDX:
				if (resolve) return getAsNeededx();
				return basicGetAsNeededx();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__SITEX:
				if (resolve) return getSitex();
				return basicGetSitex();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__QUANTITYX:
				if (resolve) return getQuantityx();
				return basicGetQuantityx();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__RATEX:
				if (resolve) return getRatex();
				return basicGetRatex();
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				if (resolve) return getMaxDosePerPeriod();
				return basicGetMaxDosePerPeriod();
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
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				setTiming((Timing)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDEDX:
				setAsNeededx((DataType)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__SITEX:
				setSitex((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__QUANTITYX:
				setQuantityx((DataType)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__RATEX:
				setRatex((DataType)newValue);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)newValue);
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
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				setTiming((Timing)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDEDX:
				setAsNeededx((DataType)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__SITEX:
				setSitex((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__QUANTITYX:
				setQuantityx((DataType)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__RATEX:
				setRatex((DataType)null);
				return;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				setMaxDosePerPeriod((Ratio)null);
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
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TEXT:
				return text != null;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__TIMING:
				return timing != null;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__AS_NEEDEDX:
				return asNeededx != null;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__SITEX:
				return sitex != null;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__ROUTE:
				return route != null;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__METHOD:
				return method != null;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__QUANTITYX:
				return quantityx != null;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__RATEX:
				return ratex != null;
			case FhirResourcePackage.MEDICATION_STATEMENT_DOSAGE__MAX_DOSE_PER_PERIOD:
				return maxDosePerPeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationStatementDosageImpl
