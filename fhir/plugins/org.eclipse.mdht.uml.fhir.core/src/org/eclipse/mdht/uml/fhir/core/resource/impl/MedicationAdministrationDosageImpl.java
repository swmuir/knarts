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

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationAdministrationDosage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administration Dosage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationDosageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationDosageImpl#getSitex <em>Sitex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationDosageImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationDosageImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationDosageImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationAdministrationDosageImpl#getRatex <em>Ratex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationAdministrationDosageImpl extends BackboneElementImpl implements MedicationAdministrationDosage {
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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationAdministrationDosageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMedicationAdministrationDosage();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, oldText, text));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__SITEX, oldSitex, sitex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__SITEX, oldSitex, sitex));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, oldRoute, route));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, oldRoute, route));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, oldMethod, method));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, oldQuantity, quantity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__RATEX, oldRatex, ratex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__RATEX, oldRatex, ratex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__SITEX:
				if (resolve) return getSitex();
				return basicGetSitex();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__RATEX:
				if (resolve) return getRatex();
				return basicGetRatex();
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
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__SITEX:
				setSitex((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__RATEX:
				setRatex((DataType)newValue);
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
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__SITEX:
				setSitex((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__RATEX:
				setRatex((DataType)null);
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
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				return text != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__SITEX:
				return sitex != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				return route != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				return method != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				return quantity != null;
			case FhirResourcePackage.MEDICATION_ADMINISTRATION_DOSAGE__RATEX:
				return ratex != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationAdministrationDosageImpl
