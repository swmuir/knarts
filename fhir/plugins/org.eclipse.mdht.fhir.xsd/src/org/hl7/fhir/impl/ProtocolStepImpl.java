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

import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProtocolActivity;
import org.hl7.fhir.ProtocolNext;
import org.hl7.fhir.ProtocolPrecondition;
import org.hl7.fhir.ProtocolStep;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProtocolStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolStepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolStepImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolStepImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolStepImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolStepImpl#getFirstActivity <em>First Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolStepImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolStepImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolStepImpl extends BackboneElementImpl implements ProtocolStep {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected ProtocolPrecondition precondition;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected ProtocolPrecondition exit;

	/**
	 * The cached value of the '{@link #getFirstActivity() <em>First Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstActivity()
	 * @generated
	 * @ordered
	 */
	protected Uri firstActivity;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolActivity> activity;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolNext> next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProtocolStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Duration newDuration, NotificationChain msgs) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolPrecondition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(ProtocolPrecondition newPrecondition, NotificationChain msgs) {
		ProtocolPrecondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(ProtocolPrecondition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolPrecondition getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(ProtocolPrecondition newExit, NotificationChain msgs) {
		ProtocolPrecondition oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(ProtocolPrecondition newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getFirstActivity() {
		return firstActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstActivity(Uri newFirstActivity, NotificationChain msgs) {
		Uri oldFirstActivity = firstActivity;
		firstActivity = newFirstActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY, oldFirstActivity, newFirstActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstActivity(Uri newFirstActivity) {
		if (newFirstActivity != firstActivity) {
			NotificationChain msgs = null;
			if (firstActivity != null)
				msgs = ((InternalEObject)firstActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY, null, msgs);
			if (newFirstActivity != null)
				msgs = ((InternalEObject)newFirstActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY, null, msgs);
			msgs = basicSetFirstActivity(newFirstActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY, newFirstActivity, newFirstActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolActivity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ProtocolActivity>(ProtocolActivity.class, this, FhirPackage.PROTOCOL_STEP__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolNext> getNext() {
		if (next == null) {
			next = new EObjectContainmentEList<ProtocolNext>(ProtocolNext.class, this, FhirPackage.PROTOCOL_STEP__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROTOCOL_STEP__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.PROTOCOL_STEP__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.PROTOCOL_STEP__DURATION:
				return basicSetDuration(null, msgs);
			case FhirPackage.PROTOCOL_STEP__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case FhirPackage.PROTOCOL_STEP__EXIT:
				return basicSetExit(null, msgs);
			case FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY:
				return basicSetFirstActivity(null, msgs);
			case FhirPackage.PROTOCOL_STEP__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROTOCOL_STEP__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROTOCOL_STEP__NAME:
				return getName();
			case FhirPackage.PROTOCOL_STEP__DESCRIPTION:
				return getDescription();
			case FhirPackage.PROTOCOL_STEP__DURATION:
				return getDuration();
			case FhirPackage.PROTOCOL_STEP__PRECONDITION:
				return getPrecondition();
			case FhirPackage.PROTOCOL_STEP__EXIT:
				return getExit();
			case FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY:
				return getFirstActivity();
			case FhirPackage.PROTOCOL_STEP__ACTIVITY:
				return getActivity();
			case FhirPackage.PROTOCOL_STEP__NEXT:
				return getNext();
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
			case FhirPackage.PROTOCOL_STEP__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PROTOCOL_STEP__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PROTOCOL_STEP__DURATION:
				setDuration((Duration)newValue);
				return;
			case FhirPackage.PROTOCOL_STEP__PRECONDITION:
				setPrecondition((ProtocolPrecondition)newValue);
				return;
			case FhirPackage.PROTOCOL_STEP__EXIT:
				setExit((ProtocolPrecondition)newValue);
				return;
			case FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY:
				setFirstActivity((Uri)newValue);
				return;
			case FhirPackage.PROTOCOL_STEP__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ProtocolActivity>)newValue);
				return;
			case FhirPackage.PROTOCOL_STEP__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends ProtocolNext>)newValue);
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
			case FhirPackage.PROTOCOL_STEP__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PROTOCOL_STEP__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PROTOCOL_STEP__DURATION:
				setDuration((Duration)null);
				return;
			case FhirPackage.PROTOCOL_STEP__PRECONDITION:
				setPrecondition((ProtocolPrecondition)null);
				return;
			case FhirPackage.PROTOCOL_STEP__EXIT:
				setExit((ProtocolPrecondition)null);
				return;
			case FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY:
				setFirstActivity((Uri)null);
				return;
			case FhirPackage.PROTOCOL_STEP__ACTIVITY:
				getActivity().clear();
				return;
			case FhirPackage.PROTOCOL_STEP__NEXT:
				getNext().clear();
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
			case FhirPackage.PROTOCOL_STEP__NAME:
				return name != null;
			case FhirPackage.PROTOCOL_STEP__DESCRIPTION:
				return description != null;
			case FhirPackage.PROTOCOL_STEP__DURATION:
				return duration != null;
			case FhirPackage.PROTOCOL_STEP__PRECONDITION:
				return precondition != null;
			case FhirPackage.PROTOCOL_STEP__EXIT:
				return exit != null;
			case FhirPackage.PROTOCOL_STEP__FIRST_ACTIVITY:
				return firstActivity != null;
			case FhirPackage.PROTOCOL_STEP__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case FhirPackage.PROTOCOL_STEP__NEXT:
				return next != null && !next.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtocolStepImpl
