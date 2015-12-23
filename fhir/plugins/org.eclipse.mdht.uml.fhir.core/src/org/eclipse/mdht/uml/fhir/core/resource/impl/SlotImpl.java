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
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Schedule;
import org.eclipse.mdht.uml.fhir.core.resource.Slot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SlotImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SlotImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SlotImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SlotImpl#getFreeBusyType <em>Free Busy Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SlotImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SlotImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SlotImpl#getOverbooked <em>Overbooked</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SlotImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends DomainResourceImpl implements Slot {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Schedule schedule;

	/**
	 * The cached value of the '{@link #getFreeBusyType() <em>Free Busy Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeBusyType()
	 * @generated
	 * @ordered
	 */
	protected Code freeBusyType;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getOverbooked() <em>Overbooked</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverbooked()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean overbooked;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getSlot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.SLOT__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SLOT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SLOT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		if (schedule != null && schedule.eIsProxy()) {
			InternalEObject oldSchedule = (InternalEObject)schedule;
			schedule = (Schedule)eResolveProxy(oldSchedule);
			if (schedule != oldSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SLOT__SCHEDULE, oldSchedule, schedule));
			}
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule basicGetSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		Schedule oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SLOT__SCHEDULE, oldSchedule, schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getFreeBusyType() {
		if (freeBusyType != null && freeBusyType.eIsProxy()) {
			InternalEObject oldFreeBusyType = (InternalEObject)freeBusyType;
			freeBusyType = (Code)eResolveProxy(oldFreeBusyType);
			if (freeBusyType != oldFreeBusyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SLOT__FREE_BUSY_TYPE, oldFreeBusyType, freeBusyType));
			}
		}
		return freeBusyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetFreeBusyType() {
		return freeBusyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeBusyType(Code newFreeBusyType) {
		Code oldFreeBusyType = freeBusyType;
		freeBusyType = newFreeBusyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SLOT__FREE_BUSY_TYPE, oldFreeBusyType, freeBusyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Instant)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SLOT__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Instant newStart) {
		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SLOT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Instant)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SLOT__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SLOT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getOverbooked() {
		if (overbooked != null && overbooked.eIsProxy()) {
			InternalEObject oldOverbooked = (InternalEObject)overbooked;
			overbooked = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldOverbooked);
			if (overbooked != oldOverbooked) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SLOT__OVERBOOKED, oldOverbooked, overbooked));
			}
		}
		return overbooked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetOverbooked() {
		return overbooked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverbooked(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newOverbooked) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldOverbooked = overbooked;
		overbooked = newOverbooked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SLOT__OVERBOOKED, oldOverbooked, overbooked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getComment() {
		if (comment != null && comment.eIsProxy()) {
			InternalEObject oldComment = (InternalEObject)comment;
			comment = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldComment);
			if (comment != oldComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SLOT__COMMENT, oldComment, comment));
			}
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.eclipse.mdht.uml.fhir.core.datatype.String newComment) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SLOT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.SLOT__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.SLOT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.SLOT__SCHEDULE:
				if (resolve) return getSchedule();
				return basicGetSchedule();
			case FhirResourcePackage.SLOT__FREE_BUSY_TYPE:
				if (resolve) return getFreeBusyType();
				return basicGetFreeBusyType();
			case FhirResourcePackage.SLOT__START:
				if (resolve) return getStart();
				return basicGetStart();
			case FhirResourcePackage.SLOT__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case FhirResourcePackage.SLOT__OVERBOOKED:
				if (resolve) return getOverbooked();
				return basicGetOverbooked();
			case FhirResourcePackage.SLOT__COMMENT:
				if (resolve) return getComment();
				return basicGetComment();
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
			case FhirResourcePackage.SLOT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.SLOT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SLOT__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case FhirResourcePackage.SLOT__FREE_BUSY_TYPE:
				setFreeBusyType((Code)newValue);
				return;
			case FhirResourcePackage.SLOT__START:
				setStart((Instant)newValue);
				return;
			case FhirResourcePackage.SLOT__END:
				setEnd((Instant)newValue);
				return;
			case FhirResourcePackage.SLOT__OVERBOOKED:
				setOverbooked((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.SLOT__COMMENT:
				setComment((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirResourcePackage.SLOT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.SLOT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.SLOT__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case FhirResourcePackage.SLOT__FREE_BUSY_TYPE:
				setFreeBusyType((Code)null);
				return;
			case FhirResourcePackage.SLOT__START:
				setStart((Instant)null);
				return;
			case FhirResourcePackage.SLOT__END:
				setEnd((Instant)null);
				return;
			case FhirResourcePackage.SLOT__OVERBOOKED:
				setOverbooked((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.SLOT__COMMENT:
				setComment((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirResourcePackage.SLOT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.SLOT__TYPE:
				return type != null;
			case FhirResourcePackage.SLOT__SCHEDULE:
				return schedule != null;
			case FhirResourcePackage.SLOT__FREE_BUSY_TYPE:
				return freeBusyType != null;
			case FhirResourcePackage.SLOT__START:
				return start != null;
			case FhirResourcePackage.SLOT__END:
				return end != null;
			case FhirResourcePackage.SLOT__OVERBOOKED:
				return overbooked != null;
			case FhirResourcePackage.SLOT__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //SlotImpl
