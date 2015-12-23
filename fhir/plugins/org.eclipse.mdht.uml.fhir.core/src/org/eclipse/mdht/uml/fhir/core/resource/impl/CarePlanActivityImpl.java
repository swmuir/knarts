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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Annotation;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.CarePlanActivity;
import org.eclipse.mdht.uml.fhir.core.resource.CarePlanActivityDetail;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CarePlanActivityImpl#getActionResultings <em>Action Resulting</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CarePlanActivityImpl#getProgresses <em>Progress</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CarePlanActivityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CarePlanActivityImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanActivityImpl extends BackboneElementImpl implements CarePlanActivity {
	/**
	 * The cached value of the '{@link #getActionResultings() <em>Action Resulting</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionResultings()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> actionResultings;

	/**
	 * The cached value of the '{@link #getProgresses() <em>Progress</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> progresses;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Resource reference;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected CarePlanActivityDetail detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getCarePlanActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getActionResultings() {
		if (actionResultings == null) {
			actionResultings = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING);
		}
		return actionResultings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getProgresses() {
		if (progresses == null) {
			progresses = new EObjectResolvingEList<Annotation>(Annotation.class, this, FhirResourcePackage.CARE_PLAN_ACTIVITY__PROGRESS);
		}
		return progresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (Resource)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CARE_PLAN_ACTIVITY__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Resource newReference) {
		Resource oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CARE_PLAN_ACTIVITY__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityDetail getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(CarePlanActivityDetail newDetail, NotificationChain msgs) {
		CarePlanActivityDetail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(CarePlanActivityDetail newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL:
				return basicSetDetail(null, msgs);
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
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				return getActionResultings();
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return getProgresses();
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL:
				return getDetail();
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
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				getActionResultings().clear();
				getActionResultings().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__PROGRESS:
				getProgresses().clear();
				getProgresses().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__REFERENCE:
				setReference((Resource)newValue);
				return;
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL:
				setDetail((CarePlanActivityDetail)newValue);
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
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				getActionResultings().clear();
				return;
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__PROGRESS:
				getProgresses().clear();
				return;
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__REFERENCE:
				setReference((Resource)null);
				return;
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL:
				setDetail((CarePlanActivityDetail)null);
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
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__ACTION_RESULTING:
				return actionResultings != null && !actionResultings.isEmpty();
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return progresses != null && !progresses.isEmpty();
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return reference != null;
			case FhirResourcePackage.CARE_PLAN_ACTIVITY__DETAIL:
				return detail != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanActivityImpl
