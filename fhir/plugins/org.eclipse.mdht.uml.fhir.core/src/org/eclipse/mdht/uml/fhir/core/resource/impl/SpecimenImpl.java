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

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;
import org.eclipse.mdht.uml.fhir.core.resource.Specimen;
import org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection;
import org.eclipse.mdht.uml.fhir.core.resource.SpecimenContainer;
import org.eclipse.mdht.uml.fhir.core.resource.SpecimenTreatment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getParents <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getAccessionIdentifier <em>Accession Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getReceivedTime <em>Received Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getTreatments <em>Treatment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenImpl#getContainers <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenImpl extends DomainResourceImpl implements Specimen {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

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
	 * The cached value of the '{@link #getParents() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Specimen> parents;

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
	 * The cached value of the '{@link #getAccessionIdentifier() <em>Accession Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier accessionIdentifier;

	/**
	 * The cached value of the '{@link #getReceivedTime() <em>Received Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime receivedTime;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected SpecimenCollection collection;

	/**
	 * The cached value of the '{@link #getTreatments() <em>Treatment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatments()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenTreatment> treatments;

	/**
	 * The cached value of the '{@link #getContainers() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenContainer> containers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getSpecimen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.SPECIMEN__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specimen> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<Specimen>(Specimen.class, this, FhirResourcePackage.SPECIMEN__PARENT);
		}
		return parents;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getAccessionIdentifier() {
		if (accessionIdentifier != null && accessionIdentifier.eIsProxy()) {
			InternalEObject oldAccessionIdentifier = (InternalEObject)accessionIdentifier;
			accessionIdentifier = (Identifier)eResolveProxy(oldAccessionIdentifier);
			if (accessionIdentifier != oldAccessionIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN__ACCESSION_IDENTIFIER, oldAccessionIdentifier, accessionIdentifier));
			}
		}
		return accessionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetAccessionIdentifier() {
		return accessionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessionIdentifier(Identifier newAccessionIdentifier) {
		Identifier oldAccessionIdentifier = accessionIdentifier;
		accessionIdentifier = newAccessionIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN__ACCESSION_IDENTIFIER, oldAccessionIdentifier, accessionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getReceivedTime() {
		if (receivedTime != null && receivedTime.eIsProxy()) {
			InternalEObject oldReceivedTime = (InternalEObject)receivedTime;
			receivedTime = (DateTime)eResolveProxy(oldReceivedTime);
			if (receivedTime != oldReceivedTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN__RECEIVED_TIME, oldReceivedTime, receivedTime));
			}
		}
		return receivedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetReceivedTime() {
		return receivedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedTime(DateTime newReceivedTime) {
		DateTime oldReceivedTime = receivedTime;
		receivedTime = newReceivedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN__RECEIVED_TIME, oldReceivedTime, receivedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollection getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(SpecimenCollection newCollection, NotificationChain msgs) {
		SpecimenCollection oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN__COLLECTION, oldCollection, newCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(SpecimenCollection newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.SPECIMEN__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.SPECIMEN__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecimenTreatment> getTreatments() {
		if (treatments == null) {
			treatments = new EObjectContainmentEList<SpecimenTreatment>(SpecimenTreatment.class, this, FhirResourcePackage.SPECIMEN__TREATMENT);
		}
		return treatments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecimenContainer> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<SpecimenContainer>(SpecimenContainer.class, this, FhirResourcePackage.SPECIMEN__CONTAINER);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.SPECIMEN__COLLECTION:
				return basicSetCollection(null, msgs);
			case FhirResourcePackage.SPECIMEN__TREATMENT:
				return ((InternalEList<?>)getTreatments()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.SPECIMEN__CONTAINER:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.SPECIMEN__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.SPECIMEN__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.SPECIMEN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.SPECIMEN__PARENT:
				return getParents();
			case FhirResourcePackage.SPECIMEN__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.SPECIMEN__ACCESSION_IDENTIFIER:
				if (resolve) return getAccessionIdentifier();
				return basicGetAccessionIdentifier();
			case FhirResourcePackage.SPECIMEN__RECEIVED_TIME:
				if (resolve) return getReceivedTime();
				return basicGetReceivedTime();
			case FhirResourcePackage.SPECIMEN__COLLECTION:
				return getCollection();
			case FhirResourcePackage.SPECIMEN__TREATMENT:
				return getTreatments();
			case FhirResourcePackage.SPECIMEN__CONTAINER:
				return getContainers();
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
			case FhirResourcePackage.SPECIMEN__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__PARENT:
				getParents().clear();
				getParents().addAll((Collection<? extends Specimen>)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__ACCESSION_IDENTIFIER:
				setAccessionIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__RECEIVED_TIME:
				setReceivedTime((DateTime)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__COLLECTION:
				setCollection((SpecimenCollection)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__TREATMENT:
				getTreatments().clear();
				getTreatments().addAll((Collection<? extends SpecimenTreatment>)newValue);
				return;
			case FhirResourcePackage.SPECIMEN__CONTAINER:
				getContainers().clear();
				getContainers().addAll((Collection<? extends SpecimenContainer>)newValue);
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
			case FhirResourcePackage.SPECIMEN__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.SPECIMEN__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.SPECIMEN__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.SPECIMEN__PARENT:
				getParents().clear();
				return;
			case FhirResourcePackage.SPECIMEN__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.SPECIMEN__ACCESSION_IDENTIFIER:
				setAccessionIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.SPECIMEN__RECEIVED_TIME:
				setReceivedTime((DateTime)null);
				return;
			case FhirResourcePackage.SPECIMEN__COLLECTION:
				setCollection((SpecimenCollection)null);
				return;
			case FhirResourcePackage.SPECIMEN__TREATMENT:
				getTreatments().clear();
				return;
			case FhirResourcePackage.SPECIMEN__CONTAINER:
				getContainers().clear();
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
			case FhirResourcePackage.SPECIMEN__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.SPECIMEN__STATUS:
				return status != null;
			case FhirResourcePackage.SPECIMEN__TYPE:
				return type != null;
			case FhirResourcePackage.SPECIMEN__PARENT:
				return parents != null && !parents.isEmpty();
			case FhirResourcePackage.SPECIMEN__SUBJECT:
				return subject != null;
			case FhirResourcePackage.SPECIMEN__ACCESSION_IDENTIFIER:
				return accessionIdentifier != null;
			case FhirResourcePackage.SPECIMEN__RECEIVED_TIME:
				return receivedTime != null;
			case FhirResourcePackage.SPECIMEN__COLLECTION:
				return collection != null;
			case FhirResourcePackage.SPECIMEN__TREATMENT:
				return treatments != null && !treatments.isEmpty();
			case FhirResourcePackage.SPECIMEN__CONTAINER:
				return containers != null && !containers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecimenImpl
