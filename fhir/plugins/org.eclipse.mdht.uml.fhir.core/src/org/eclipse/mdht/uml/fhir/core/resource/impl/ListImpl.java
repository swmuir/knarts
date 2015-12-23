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

import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.List;
import org.eclipse.mdht.uml.fhir.core.resource.ListEntry;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ListImpl#getEmptyReason <em>Empty Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends DomainResourceImpl implements List {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String title;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Resource source;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getOrderedBy() <em>Ordered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedBy()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orderedBy;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Code mode;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String note;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ListEntry> entries;

	/**
	 * The cached value of the '{@link #getEmptyReason() <em>Empty Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept emptyReason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.LIST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.datatype.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (CodeableConcept)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__CODE, oldCode, code));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Resource)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Resource newSource) {
		Resource oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__ENCOUNTER, oldEncounter, encounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__ENCOUNTER, oldEncounter, encounter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOrderedBy() {
		if (orderedBy != null && orderedBy.eIsProxy()) {
			InternalEObject oldOrderedBy = (InternalEObject)orderedBy;
			orderedBy = (CodeableConcept)eResolveProxy(oldOrderedBy);
			if (orderedBy != oldOrderedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__ORDERED_BY, oldOrderedBy, orderedBy));
			}
		}
		return orderedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetOrderedBy() {
		return orderedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedBy(CodeableConcept newOrderedBy) {
		CodeableConcept oldOrderedBy = orderedBy;
		orderedBy = newOrderedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__ORDERED_BY, oldOrderedBy, orderedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (Code)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Code newMode) {
		Code oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getNote() {
		if (note != null && note.eIsProxy()) {
			InternalEObject oldNote = (InternalEObject)note;
			note = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldNote);
			if (note != oldNote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__NOTE, oldNote, note));
			}
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(org.eclipse.mdht.uml.fhir.core.datatype.String newNote) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<ListEntry>(ListEntry.class, this, FhirResourcePackage.LIST__ENTRY);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEmptyReason() {
		if (emptyReason != null && emptyReason.eIsProxy()) {
			InternalEObject oldEmptyReason = (InternalEObject)emptyReason;
			emptyReason = (CodeableConcept)eResolveProxy(oldEmptyReason);
			if (emptyReason != oldEmptyReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.LIST__EMPTY_REASON, oldEmptyReason, emptyReason));
			}
		}
		return emptyReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetEmptyReason() {
		return emptyReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyReason(CodeableConcept newEmptyReason) {
		CodeableConcept oldEmptyReason = emptyReason;
		emptyReason = newEmptyReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.LIST__EMPTY_REASON, oldEmptyReason, emptyReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.LIST__ENTRY:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.LIST__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.LIST__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case FhirResourcePackage.LIST__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.LIST__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.LIST__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FhirResourcePackage.LIST__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.LIST__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.LIST__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.LIST__ORDERED_BY:
				if (resolve) return getOrderedBy();
				return basicGetOrderedBy();
			case FhirResourcePackage.LIST__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case FhirResourcePackage.LIST__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
			case FhirResourcePackage.LIST__ENTRY:
				return getEntries();
			case FhirResourcePackage.LIST__EMPTY_REASON:
				if (resolve) return getEmptyReason();
				return basicGetEmptyReason();
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
			case FhirResourcePackage.LIST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.LIST__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.LIST__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.LIST__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.LIST__SOURCE:
				setSource((Resource)newValue);
				return;
			case FhirResourcePackage.LIST__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.LIST__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.LIST__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.LIST__ORDERED_BY:
				setOrderedBy((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.LIST__MODE:
				setMode((Code)newValue);
				return;
			case FhirResourcePackage.LIST__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.LIST__ENTRY:
				getEntries().clear();
				getEntries().addAll((Collection<? extends ListEntry>)newValue);
				return;
			case FhirResourcePackage.LIST__EMPTY_REASON:
				setEmptyReason((CodeableConcept)newValue);
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
			case FhirResourcePackage.LIST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.LIST__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.LIST__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirResourcePackage.LIST__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.LIST__SOURCE:
				setSource((Resource)null);
				return;
			case FhirResourcePackage.LIST__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.LIST__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.LIST__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.LIST__ORDERED_BY:
				setOrderedBy((CodeableConcept)null);
				return;
			case FhirResourcePackage.LIST__MODE:
				setMode((Code)null);
				return;
			case FhirResourcePackage.LIST__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.LIST__ENTRY:
				getEntries().clear();
				return;
			case FhirResourcePackage.LIST__EMPTY_REASON:
				setEmptyReason((CodeableConcept)null);
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
			case FhirResourcePackage.LIST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.LIST__TITLE:
				return title != null;
			case FhirResourcePackage.LIST__CODE:
				return code != null;
			case FhirResourcePackage.LIST__SUBJECT:
				return subject != null;
			case FhirResourcePackage.LIST__SOURCE:
				return source != null;
			case FhirResourcePackage.LIST__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.LIST__STATUS:
				return status != null;
			case FhirResourcePackage.LIST__DATE:
				return date != null;
			case FhirResourcePackage.LIST__ORDERED_BY:
				return orderedBy != null;
			case FhirResourcePackage.LIST__MODE:
				return mode != null;
			case FhirResourcePackage.LIST__NOTE:
				return note != null;
			case FhirResourcePackage.LIST__ENTRY:
				return entries != null && !entries.isEmpty();
			case FhirResourcePackage.LIST__EMPTY_REASON:
				return emptyReason != null;
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
