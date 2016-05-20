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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImagingExcerpt;
import org.hl7.fhir.ImagingExcerptStudy;
import org.hl7.fhir.Oid;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Excerpt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptImpl#getAuthoringTime <em>Authoring Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptImpl#getStudy <em>Study</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingExcerptImpl extends DomainResourceImpl implements ImagingExcerpt {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

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
	 * The cached value of the '{@link #getAuthoringTime() <em>Authoring Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoringTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoringTime;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept title;

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
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingExcerptStudy> study;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingExcerptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingExcerpt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Oid newUid, NotificationChain msgs) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__UID, oldUid, newUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__UID, newUid, newUid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthoringTime() {
		return authoringTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoringTime(DateTime newAuthoringTime, NotificationChain msgs) {
		DateTime oldAuthoringTime = authoringTime;
		authoringTime = newAuthoringTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME, oldAuthoringTime, newAuthoringTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoringTime(DateTime newAuthoringTime) {
		if (newAuthoringTime != authoringTime) {
			NotificationChain msgs = null;
			if (authoringTime != null)
				msgs = ((InternalEObject)authoringTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME, null, msgs);
			if (newAuthoringTime != null)
				msgs = ((InternalEObject)newAuthoringTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME, null, msgs);
			msgs = basicSetAuthoringTime(newAuthoringTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME, newAuthoringTime, newAuthoringTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(CodeableConcept newTitle, NotificationChain msgs) {
		CodeableConcept oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(CodeableConcept newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingExcerptStudy> getStudy() {
		if (study == null) {
			study = new EObjectContainmentEList<ImagingExcerptStudy>(ImagingExcerptStudy.class, this, FhirPackage.IMAGING_EXCERPT__STUDY);
		}
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_EXCERPT__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_EXCERPT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME:
				return basicSetAuthoringTime(null, msgs);
			case FhirPackage.IMAGING_EXCERPT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case FhirPackage.IMAGING_EXCERPT__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.IMAGING_EXCERPT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.IMAGING_EXCERPT__STUDY:
				return ((InternalEList<?>)getStudy()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_EXCERPT__UID:
				return getUid();
			case FhirPackage.IMAGING_EXCERPT__PATIENT:
				return getPatient();
			case FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME:
				return getAuthoringTime();
			case FhirPackage.IMAGING_EXCERPT__AUTHOR:
				return getAuthor();
			case FhirPackage.IMAGING_EXCERPT__TITLE:
				return getTitle();
			case FhirPackage.IMAGING_EXCERPT__DESCRIPTION:
				return getDescription();
			case FhirPackage.IMAGING_EXCERPT__STUDY:
				return getStudy();
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
			case FhirPackage.IMAGING_EXCERPT__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME:
				setAuthoringTime((DateTime)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT__TITLE:
				setTitle((CodeableConcept)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT__STUDY:
				getStudy().clear();
				getStudy().addAll((Collection<? extends ImagingExcerptStudy>)newValue);
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
			case FhirPackage.IMAGING_EXCERPT__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_EXCERPT__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME:
				setAuthoringTime((DateTime)null);
				return;
			case FhirPackage.IMAGING_EXCERPT__AUTHOR:
				setAuthor((Reference)null);
				return;
			case FhirPackage.IMAGING_EXCERPT__TITLE:
				setTitle((CodeableConcept)null);
				return;
			case FhirPackage.IMAGING_EXCERPT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_EXCERPT__STUDY:
				getStudy().clear();
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
			case FhirPackage.IMAGING_EXCERPT__UID:
				return uid != null;
			case FhirPackage.IMAGING_EXCERPT__PATIENT:
				return patient != null;
			case FhirPackage.IMAGING_EXCERPT__AUTHORING_TIME:
				return authoringTime != null;
			case FhirPackage.IMAGING_EXCERPT__AUTHOR:
				return author != null;
			case FhirPackage.IMAGING_EXCERPT__TITLE:
				return title != null;
			case FhirPackage.IMAGING_EXCERPT__DESCRIPTION:
				return description != null;
			case FhirPackage.IMAGING_EXCERPT__STUDY:
				return study != null && !study.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingExcerptImpl
