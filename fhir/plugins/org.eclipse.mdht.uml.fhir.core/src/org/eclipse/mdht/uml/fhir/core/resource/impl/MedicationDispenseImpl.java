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

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Location;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationDispense;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationDispenseDosageInstruction;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationDispenseSubstitution;
import org.eclipse.mdht.uml.fhir.core.resource.MedicationOrder;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getDispenser <em>Dispenser</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getAuthorizingPrescriptions <em>Authorizing Prescription</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getDaysSupply <em>Days Supply</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getWhenPrepared <em>When Prepared</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getWhenHandedOver <em>When Handed Over</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getReceivers <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getDosageInstructions <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MedicationDispenseImpl#getSubstitution <em>Substitution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationDispenseImpl extends DomainResourceImpl implements MedicationDispense {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getDispenser() <em>Dispenser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenser()
	 * @generated
	 * @ordered
	 */
	protected Practitioner dispenser;

	/**
	 * The cached value of the '{@link #getAuthorizingPrescriptions() <em>Authorizing Prescription</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizingPrescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationOrder> authorizingPrescriptions;

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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getDaysSupply() <em>Days Supply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysSupply()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity daysSupply;

	/**
	 * The cached value of the '{@link #getMedicationx() <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationx()
	 * @generated
	 * @ordered
	 */
	protected Base medicationx;

	/**
	 * The cached value of the '{@link #getWhenPrepared() <em>When Prepared</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenPrepared()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenPrepared;

	/**
	 * The cached value of the '{@link #getWhenHandedOver() <em>When Handed Over</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenHandedOver()
	 * @generated
	 * @ordered
	 */
	protected DateTime whenHandedOver;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Location destination;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> receivers;

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
	 * The cached value of the '{@link #getDosageInstructions() <em>Dosage Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosageInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationDispenseDosageInstruction> dosageInstructions;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected MedicationDispenseSubstitution substitution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMedicationDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__IDENTIFIER, oldIdentifier, identifier));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__STATUS, oldStatus, status));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__PATIENT, oldPatient, patient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getDispenser() {
		if (dispenser != null && dispenser.eIsProxy()) {
			InternalEObject oldDispenser = (InternalEObject)dispenser;
			dispenser = (Practitioner)eResolveProxy(oldDispenser);
			if (dispenser != oldDispenser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__DISPENSER, oldDispenser, dispenser));
			}
		}
		return dispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetDispenser() {
		return dispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispenser(Practitioner newDispenser) {
		Practitioner oldDispenser = dispenser;
		dispenser = newDispenser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__DISPENSER, oldDispenser, dispenser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationOrder> getAuthorizingPrescriptions() {
		if (authorizingPrescriptions == null) {
			authorizingPrescriptions = new EObjectResolvingEList<MedicationOrder>(MedicationOrder.class, this, FhirResourcePackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION);
		}
		return authorizingPrescriptions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getDaysSupply() {
		if (daysSupply != null && daysSupply.eIsProxy()) {
			InternalEObject oldDaysSupply = (InternalEObject)daysSupply;
			daysSupply = (SimpleQuantity)eResolveProxy(oldDaysSupply);
			if (daysSupply != oldDaysSupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__DAYS_SUPPLY, oldDaysSupply, daysSupply));
			}
		}
		return daysSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetDaysSupply() {
		return daysSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaysSupply(SimpleQuantity newDaysSupply) {
		SimpleQuantity oldDaysSupply = daysSupply;
		daysSupply = newDaysSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__DAYS_SUPPLY, oldDaysSupply, daysSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getMedicationx() {
		if (medicationx != null && medicationx.eIsProxy()) {
			InternalEObject oldMedicationx = (InternalEObject)medicationx;
			medicationx = (Base)eResolveProxy(oldMedicationx);
			if (medicationx != oldMedicationx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__MEDICATIONX, oldMedicationx, medicationx));
			}
		}
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetMedicationx() {
		return medicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationx(Base newMedicationx) {
		Base oldMedicationx = medicationx;
		medicationx = newMedicationx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__MEDICATIONX, oldMedicationx, medicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenPrepared() {
		if (whenPrepared != null && whenPrepared.eIsProxy()) {
			InternalEObject oldWhenPrepared = (InternalEObject)whenPrepared;
			whenPrepared = (DateTime)eResolveProxy(oldWhenPrepared);
			if (whenPrepared != oldWhenPrepared) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__WHEN_PREPARED, oldWhenPrepared, whenPrepared));
			}
		}
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetWhenPrepared() {
		return whenPrepared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenPrepared(DateTime newWhenPrepared) {
		DateTime oldWhenPrepared = whenPrepared;
		whenPrepared = newWhenPrepared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__WHEN_PREPARED, oldWhenPrepared, whenPrepared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhenHandedOver() {
		if (whenHandedOver != null && whenHandedOver.eIsProxy()) {
			InternalEObject oldWhenHandedOver = (InternalEObject)whenHandedOver;
			whenHandedOver = (DateTime)eResolveProxy(oldWhenHandedOver);
			if (whenHandedOver != oldWhenHandedOver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, whenHandedOver));
			}
		}
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetWhenHandedOver() {
		return whenHandedOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenHandedOver(DateTime newWhenHandedOver) {
		DateTime oldWhenHandedOver = whenHandedOver;
		whenHandedOver = newWhenHandedOver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER, oldWhenHandedOver, whenHandedOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Location)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Location newDestination) {
		Location oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.MEDICATION_DISPENSE__RECEIVER);
		}
		return receivers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MEDICATION_DISPENSE__NOTE, oldNote, note));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationDispenseDosageInstruction> getDosageInstructions() {
		if (dosageInstructions == null) {
			dosageInstructions = new EObjectContainmentEList<MedicationDispenseDosageInstruction>(MedicationDispenseDosageInstruction.class, this, FhirResourcePackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION);
		}
		return dosageInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispenseSubstitution getSubstitution() {
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitution(MedicationDispenseSubstitution newSubstitution, NotificationChain msgs) {
		MedicationDispenseSubstitution oldSubstitution = substitution;
		substitution = newSubstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION, oldSubstitution, newSubstitution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitution(MedicationDispenseSubstitution newSubstitution) {
		if (newSubstitution != substitution) {
			NotificationChain msgs = null;
			if (substitution != null)
				msgs = ((InternalEObject)substitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			if (newSubstitution != null)
				msgs = ((InternalEObject)newSubstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION, null, msgs);
			msgs = basicSetSubstitution(newSubstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION, newSubstitution, newSubstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return ((InternalEList<?>)getDosageInstructions()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return basicSetSubstitution(null, msgs);
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
			case FhirResourcePackage.MEDICATION_DISPENSE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.MEDICATION_DISPENSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.MEDICATION_DISPENSE__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.MEDICATION_DISPENSE__DISPENSER:
				if (resolve) return getDispenser();
				return basicGetDispenser();
			case FhirResourcePackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return getAuthorizingPrescriptions();
			case FhirResourcePackage.MEDICATION_DISPENSE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.MEDICATION_DISPENSE__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case FhirResourcePackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				if (resolve) return getDaysSupply();
				return basicGetDaysSupply();
			case FhirResourcePackage.MEDICATION_DISPENSE__MEDICATIONX:
				if (resolve) return getMedicationx();
				return basicGetMedicationx();
			case FhirResourcePackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				if (resolve) return getWhenPrepared();
				return basicGetWhenPrepared();
			case FhirResourcePackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				if (resolve) return getWhenHandedOver();
				return basicGetWhenHandedOver();
			case FhirResourcePackage.MEDICATION_DISPENSE__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case FhirResourcePackage.MEDICATION_DISPENSE__RECEIVER:
				return getReceivers();
			case FhirResourcePackage.MEDICATION_DISPENSE__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
			case FhirResourcePackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return getDosageInstructions();
			case FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return getSubstitution();
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
			case FhirResourcePackage.MEDICATION_DISPENSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__DISPENSER:
				setDispenser((Practitioner)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescriptions().clear();
				getAuthorizingPrescriptions().addAll((Collection<? extends MedicationOrder>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__MEDICATIONX:
				setMedicationx((Base)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Location)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__RECEIVER:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				getDosageInstructions().addAll((Collection<? extends MedicationDispenseDosageInstruction>)newValue);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)newValue);
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
			case FhirResourcePackage.MEDICATION_DISPENSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__DISPENSER:
				setDispenser((Practitioner)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				getAuthorizingPrescriptions().clear();
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				setDaysSupply((SimpleQuantity)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__MEDICATIONX:
				setMedicationx((Base)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				setWhenPrepared((DateTime)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				setWhenHandedOver((DateTime)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__DESTINATION:
				setDestination((Location)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__RECEIVER:
				getReceivers().clear();
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__NOTE:
				setNote((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				getDosageInstructions().clear();
				return;
			case FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION:
				setSubstitution((MedicationDispenseSubstitution)null);
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
			case FhirResourcePackage.MEDICATION_DISPENSE__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__STATUS:
				return status != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__PATIENT:
				return patient != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__DISPENSER:
				return dispenser != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__AUTHORIZING_PRESCRIPTION:
				return authorizingPrescriptions != null && !authorizingPrescriptions.isEmpty();
			case FhirResourcePackage.MEDICATION_DISPENSE__TYPE:
				return type != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__QUANTITY:
				return quantity != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__DAYS_SUPPLY:
				return daysSupply != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__MEDICATIONX:
				return medicationx != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__WHEN_PREPARED:
				return whenPrepared != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__WHEN_HANDED_OVER:
				return whenHandedOver != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__DESTINATION:
				return destination != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__RECEIVER:
				return receivers != null && !receivers.isEmpty();
			case FhirResourcePackage.MEDICATION_DISPENSE__NOTE:
				return note != null;
			case FhirResourcePackage.MEDICATION_DISPENSE__DOSAGE_INSTRUCTION:
				return dosageInstructions != null && !dosageInstructions.isEmpty();
			case FhirResourcePackage.MEDICATION_DISPENSE__SUBSTITUTION:
				return substitution != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationDispenseImpl
