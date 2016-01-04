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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Range;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Reference Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationReferenceRangeImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationReferenceRangeImpl#getHigh <em>High</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationReferenceRangeImpl#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationReferenceRangeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ObservationReferenceRangeImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationReferenceRangeImpl extends BackboneElementImpl implements ObservationReferenceRange {
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity low;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity high;

	/**
	 * The cached value of the '{@link #getMeaning() <em>Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept meaning;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected Range age;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationReferenceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getObservationReferenceRange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getLow() {
		if (low != null && low.eIsProxy()) {
			InternalEObject oldLow = (InternalEObject)low;
			low = (SimpleQuantity)eResolveProxy(oldLow);
			if (low != oldLow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__LOW, oldLow, low));
			}
		}
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(SimpleQuantity newLow) {
		SimpleQuantity oldLow = low;
		low = newLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__LOW, oldLow, low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getHigh() {
		if (high != null && high.eIsProxy()) {
			InternalEObject oldHigh = (InternalEObject)high;
			high = (SimpleQuantity)eResolveProxy(oldHigh);
			if (high != oldHigh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__HIGH, oldHigh, high));
			}
		}
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(SimpleQuantity newHigh) {
		SimpleQuantity oldHigh = high;
		high = newHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__HIGH, oldHigh, high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMeaning() {
		if (meaning != null && meaning.eIsProxy()) {
			InternalEObject oldMeaning = (InternalEObject)meaning;
			meaning = (CodeableConcept)eResolveProxy(oldMeaning);
			if (meaning != oldMeaning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__MEANING, oldMeaning, meaning));
			}
		}
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetMeaning() {
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaning(CodeableConcept newMeaning) {
		CodeableConcept oldMeaning = meaning;
		meaning = newMeaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__MEANING, oldMeaning, meaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getAge() {
		if (age != null && age.eIsProxy()) {
			InternalEObject oldAge = (InternalEObject)age;
			age = (Range)eResolveProxy(oldAge);
			if (age != oldAge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__AGE, oldAge, age));
			}
		}
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range basicGetAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(Range newAge) {
		Range oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__AGE, oldAge, age));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__LOW:
				if (resolve) return getLow();
				return basicGetLow();
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				if (resolve) return getHigh();
				return basicGetHigh();
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				if (resolve) return getMeaning();
				return basicGetMeaning();
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__AGE:
				if (resolve) return getAge();
				return basicGetAge();
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				if (resolve) return getText();
				return basicGetText();
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
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__LOW:
				setLow((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				setHigh((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				setMeaning((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__AGE:
				setAge((Range)newValue);
				return;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__LOW:
				setLow((SimpleQuantity)null);
				return;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				setHigh((SimpleQuantity)null);
				return;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				setMeaning((CodeableConcept)null);
				return;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__AGE:
				setAge((Range)null);
				return;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return low != null;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return high != null;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__MEANING:
				return meaning != null;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return age != null;
			case FhirResourcePackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationReferenceRangeImpl
