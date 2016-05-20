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
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Sequence;
import org.hl7.fhir.SequenceQuality;
import org.hl7.fhir.SequenceReferenceSeq;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.SequenceStructureVariation;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.SequenceVariation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getVariation <em>Variation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getAllelicState <em>Allelic State</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getAllelicFrequency <em>Allelic Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getCopyNumberEvent <em>Copy Number Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getObservedSeq <em>Observed Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getStructureVariation <em>Structure Variation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends DomainResourceImpl implements Sequence {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SequenceType type;

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
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Reference specimen;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept species;

	/**
	 * The cached value of the '{@link #getReferenceSeq() <em>Reference Seq</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeq()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceReferenceSeq> referenceSeq;

	/**
	 * The cached value of the '{@link #getVariation() <em>Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariation()
	 * @generated
	 * @ordered
	 */
	protected SequenceVariation variation;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceQuality> quality;

	/**
	 * The cached value of the '{@link #getAllelicState() <em>Allelic State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllelicState()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept allelicState;

	/**
	 * The cached value of the '{@link #getAllelicFrequency() <em>Allelic Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllelicFrequency()
	 * @generated
	 * @ordered
	 */
	protected Decimal allelicFrequency;

	/**
	 * The cached value of the '{@link #getCopyNumberEvent() <em>Copy Number Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyNumberEvent()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept copyNumberEvent;

	/**
	 * The cached value of the '{@link #getReadCoverage() <em>Read Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCoverage()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer readCoverage;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceRepository> repository;

	/**
	 * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> pointer;

	/**
	 * The cached value of the '{@link #getObservedSeq() <em>Observed Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedSeq()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String observedSeq;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected Reference observation;

	/**
	 * The cached value of the '{@link #getStructureVariation() <em>Structure Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureVariation()
	 * @generated
	 * @ordered
	 */
	protected SequenceStructureVariation structureVariation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(SequenceType newType, NotificationChain msgs) {
		SequenceType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SequenceType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Reference newSpecimen, NotificationChain msgs) {
		Reference oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__SPECIMEN, oldSpecimen, newSpecimen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimen(Reference newSpecimen) {
		if (newSpecimen != specimen) {
			NotificationChain msgs = null;
			if (specimen != null)
				msgs = ((InternalEObject)specimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__SPECIMEN, null, msgs);
			if (newSpecimen != null)
				msgs = ((InternalEObject)newSpecimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__SPECIMEN, null, msgs);
			msgs = basicSetSpecimen(newSpecimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__SPECIMEN, newSpecimen, newSpecimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecies(CodeableConcept newSpecies, NotificationChain msgs) {
		CodeableConcept oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__SPECIES, oldSpecies, newSpecies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(CodeableConcept newSpecies) {
		if (newSpecies != species) {
			NotificationChain msgs = null;
			if (species != null)
				msgs = ((InternalEObject)species).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__SPECIES, null, msgs);
			if (newSpecies != null)
				msgs = ((InternalEObject)newSpecies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__SPECIES, null, msgs);
			msgs = basicSetSpecies(newSpecies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__SPECIES, newSpecies, newSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceReferenceSeq> getReferenceSeq() {
		if (referenceSeq == null) {
			referenceSeq = new EObjectContainmentEList<SequenceReferenceSeq>(SequenceReferenceSeq.class, this, FhirPackage.SEQUENCE__REFERENCE_SEQ);
		}
		return referenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceVariation getVariation() {
		return variation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariation(SequenceVariation newVariation, NotificationChain msgs) {
		SequenceVariation oldVariation = variation;
		variation = newVariation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__VARIATION, oldVariation, newVariation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariation(SequenceVariation newVariation) {
		if (newVariation != variation) {
			NotificationChain msgs = null;
			if (variation != null)
				msgs = ((InternalEObject)variation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__VARIATION, null, msgs);
			if (newVariation != null)
				msgs = ((InternalEObject)newVariation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__VARIATION, null, msgs);
			msgs = basicSetVariation(newVariation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__VARIATION, newVariation, newVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceQuality> getQuality() {
		if (quality == null) {
			quality = new EObjectContainmentEList<SequenceQuality>(SequenceQuality.class, this, FhirPackage.SEQUENCE__QUALITY);
		}
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAllelicState() {
		return allelicState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllelicState(CodeableConcept newAllelicState, NotificationChain msgs) {
		CodeableConcept oldAllelicState = allelicState;
		allelicState = newAllelicState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__ALLELIC_STATE, oldAllelicState, newAllelicState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllelicState(CodeableConcept newAllelicState) {
		if (newAllelicState != allelicState) {
			NotificationChain msgs = null;
			if (allelicState != null)
				msgs = ((InternalEObject)allelicState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__ALLELIC_STATE, null, msgs);
			if (newAllelicState != null)
				msgs = ((InternalEObject)newAllelicState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__ALLELIC_STATE, null, msgs);
			msgs = basicSetAllelicState(newAllelicState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__ALLELIC_STATE, newAllelicState, newAllelicState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getAllelicFrequency() {
		return allelicFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllelicFrequency(Decimal newAllelicFrequency, NotificationChain msgs) {
		Decimal oldAllelicFrequency = allelicFrequency;
		allelicFrequency = newAllelicFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__ALLELIC_FREQUENCY, oldAllelicFrequency, newAllelicFrequency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllelicFrequency(Decimal newAllelicFrequency) {
		if (newAllelicFrequency != allelicFrequency) {
			NotificationChain msgs = null;
			if (allelicFrequency != null)
				msgs = ((InternalEObject)allelicFrequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__ALLELIC_FREQUENCY, null, msgs);
			if (newAllelicFrequency != null)
				msgs = ((InternalEObject)newAllelicFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__ALLELIC_FREQUENCY, null, msgs);
			msgs = basicSetAllelicFrequency(newAllelicFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__ALLELIC_FREQUENCY, newAllelicFrequency, newAllelicFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCopyNumberEvent() {
		return copyNumberEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyNumberEvent(CodeableConcept newCopyNumberEvent, NotificationChain msgs) {
		CodeableConcept oldCopyNumberEvent = copyNumberEvent;
		copyNumberEvent = newCopyNumberEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__COPY_NUMBER_EVENT, oldCopyNumberEvent, newCopyNumberEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyNumberEvent(CodeableConcept newCopyNumberEvent) {
		if (newCopyNumberEvent != copyNumberEvent) {
			NotificationChain msgs = null;
			if (copyNumberEvent != null)
				msgs = ((InternalEObject)copyNumberEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__COPY_NUMBER_EVENT, null, msgs);
			if (newCopyNumberEvent != null)
				msgs = ((InternalEObject)newCopyNumberEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__COPY_NUMBER_EVENT, null, msgs);
			msgs = basicSetCopyNumberEvent(newCopyNumberEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__COPY_NUMBER_EVENT, newCopyNumberEvent, newCopyNumberEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getReadCoverage() {
		return readCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadCoverage(org.hl7.fhir.Integer newReadCoverage, NotificationChain msgs) {
		org.hl7.fhir.Integer oldReadCoverage = readCoverage;
		readCoverage = newReadCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__READ_COVERAGE, oldReadCoverage, newReadCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadCoverage(org.hl7.fhir.Integer newReadCoverage) {
		if (newReadCoverage != readCoverage) {
			NotificationChain msgs = null;
			if (readCoverage != null)
				msgs = ((InternalEObject)readCoverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__READ_COVERAGE, null, msgs);
			if (newReadCoverage != null)
				msgs = ((InternalEObject)newReadCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__READ_COVERAGE, null, msgs);
			msgs = basicSetReadCoverage(newReadCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__READ_COVERAGE, newReadCoverage, newReadCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceRepository> getRepository() {
		if (repository == null) {
			repository = new EObjectContainmentEList<SequenceRepository>(SequenceRepository.class, this, FhirPackage.SEQUENCE__REPOSITORY);
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPointer() {
		if (pointer == null) {
			pointer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.SEQUENCE__POINTER);
		}
		return pointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getObservedSeq() {
		return observedSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservedSeq(org.hl7.fhir.String newObservedSeq, NotificationChain msgs) {
		org.hl7.fhir.String oldObservedSeq = observedSeq;
		observedSeq = newObservedSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__OBSERVED_SEQ, oldObservedSeq, newObservedSeq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedSeq(org.hl7.fhir.String newObservedSeq) {
		if (newObservedSeq != observedSeq) {
			NotificationChain msgs = null;
			if (observedSeq != null)
				msgs = ((InternalEObject)observedSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__OBSERVED_SEQ, null, msgs);
			if (newObservedSeq != null)
				msgs = ((InternalEObject)newObservedSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__OBSERVED_SEQ, null, msgs);
			msgs = basicSetObservedSeq(newObservedSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__OBSERVED_SEQ, newObservedSeq, newObservedSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(Reference newObservation, NotificationChain msgs) {
		Reference oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__OBSERVATION, oldObservation, newObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(Reference newObservation) {
		if (newObservation != observation) {
			NotificationChain msgs = null;
			if (observation != null)
				msgs = ((InternalEObject)observation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__OBSERVATION, null, msgs);
			if (newObservation != null)
				msgs = ((InternalEObject)newObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__OBSERVATION, null, msgs);
			msgs = basicSetObservation(newObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__OBSERVATION, newObservation, newObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStructureVariation getStructureVariation() {
		return structureVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureVariation(SequenceStructureVariation newStructureVariation, NotificationChain msgs) {
		SequenceStructureVariation oldStructureVariation = structureVariation;
		structureVariation = newStructureVariation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__STRUCTURE_VARIATION, oldStructureVariation, newStructureVariation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureVariation(SequenceStructureVariation newStructureVariation) {
		if (newStructureVariation != structureVariation) {
			NotificationChain msgs = null;
			if (structureVariation != null)
				msgs = ((InternalEObject)structureVariation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__STRUCTURE_VARIATION, null, msgs);
			if (newStructureVariation != null)
				msgs = ((InternalEObject)newStructureVariation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__STRUCTURE_VARIATION, null, msgs);
			msgs = basicSetStructureVariation(newStructureVariation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__STRUCTURE_VARIATION, newStructureVariation, newStructureVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SEQUENCE__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.SEQUENCE__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case FhirPackage.SEQUENCE__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.SEQUENCE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.SEQUENCE__SPECIES:
				return basicSetSpecies(null, msgs);
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				return ((InternalEList<?>)getReferenceSeq()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEQUENCE__VARIATION:
				return basicSetVariation(null, msgs);
			case FhirPackage.SEQUENCE__QUALITY:
				return ((InternalEList<?>)getQuality()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEQUENCE__ALLELIC_STATE:
				return basicSetAllelicState(null, msgs);
			case FhirPackage.SEQUENCE__ALLELIC_FREQUENCY:
				return basicSetAllelicFrequency(null, msgs);
			case FhirPackage.SEQUENCE__COPY_NUMBER_EVENT:
				return basicSetCopyNumberEvent(null, msgs);
			case FhirPackage.SEQUENCE__READ_COVERAGE:
				return basicSetReadCoverage(null, msgs);
			case FhirPackage.SEQUENCE__REPOSITORY:
				return ((InternalEList<?>)getRepository()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEQUENCE__POINTER:
				return ((InternalEList<?>)getPointer()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEQUENCE__OBSERVED_SEQ:
				return basicSetObservedSeq(null, msgs);
			case FhirPackage.SEQUENCE__OBSERVATION:
				return basicSetObservation(null, msgs);
			case FhirPackage.SEQUENCE__STRUCTURE_VARIATION:
				return basicSetStructureVariation(null, msgs);
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
			case FhirPackage.SEQUENCE__TYPE:
				return getType();
			case FhirPackage.SEQUENCE__PATIENT:
				return getPatient();
			case FhirPackage.SEQUENCE__SPECIMEN:
				return getSpecimen();
			case FhirPackage.SEQUENCE__DEVICE:
				return getDevice();
			case FhirPackage.SEQUENCE__QUANTITY:
				return getQuantity();
			case FhirPackage.SEQUENCE__SPECIES:
				return getSpecies();
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				return getReferenceSeq();
			case FhirPackage.SEQUENCE__VARIATION:
				return getVariation();
			case FhirPackage.SEQUENCE__QUALITY:
				return getQuality();
			case FhirPackage.SEQUENCE__ALLELIC_STATE:
				return getAllelicState();
			case FhirPackage.SEQUENCE__ALLELIC_FREQUENCY:
				return getAllelicFrequency();
			case FhirPackage.SEQUENCE__COPY_NUMBER_EVENT:
				return getCopyNumberEvent();
			case FhirPackage.SEQUENCE__READ_COVERAGE:
				return getReadCoverage();
			case FhirPackage.SEQUENCE__REPOSITORY:
				return getRepository();
			case FhirPackage.SEQUENCE__POINTER:
				return getPointer();
			case FhirPackage.SEQUENCE__OBSERVED_SEQ:
				return getObservedSeq();
			case FhirPackage.SEQUENCE__OBSERVATION:
				return getObservation();
			case FhirPackage.SEQUENCE__STRUCTURE_VARIATION:
				return getStructureVariation();
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
			case FhirPackage.SEQUENCE__TYPE:
				setType((SequenceType)newValue);
				return;
			case FhirPackage.SEQUENCE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.SEQUENCE__SPECIMEN:
				setSpecimen((Reference)newValue);
				return;
			case FhirPackage.SEQUENCE__DEVICE:
				setDevice((Reference)newValue);
				return;
			case FhirPackage.SEQUENCE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.SEQUENCE__SPECIES:
				setSpecies((CodeableConcept)newValue);
				return;
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				getReferenceSeq().clear();
				getReferenceSeq().addAll((Collection<? extends SequenceReferenceSeq>)newValue);
				return;
			case FhirPackage.SEQUENCE__VARIATION:
				setVariation((SequenceVariation)newValue);
				return;
			case FhirPackage.SEQUENCE__QUALITY:
				getQuality().clear();
				getQuality().addAll((Collection<? extends SequenceQuality>)newValue);
				return;
			case FhirPackage.SEQUENCE__ALLELIC_STATE:
				setAllelicState((CodeableConcept)newValue);
				return;
			case FhirPackage.SEQUENCE__ALLELIC_FREQUENCY:
				setAllelicFrequency((Decimal)newValue);
				return;
			case FhirPackage.SEQUENCE__COPY_NUMBER_EVENT:
				setCopyNumberEvent((CodeableConcept)newValue);
				return;
			case FhirPackage.SEQUENCE__READ_COVERAGE:
				setReadCoverage((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SEQUENCE__REPOSITORY:
				getRepository().clear();
				getRepository().addAll((Collection<? extends SequenceRepository>)newValue);
				return;
			case FhirPackage.SEQUENCE__POINTER:
				getPointer().clear();
				getPointer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.SEQUENCE__OBSERVED_SEQ:
				setObservedSeq((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE__OBSERVATION:
				setObservation((Reference)newValue);
				return;
			case FhirPackage.SEQUENCE__STRUCTURE_VARIATION:
				setStructureVariation((SequenceStructureVariation)newValue);
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
			case FhirPackage.SEQUENCE__TYPE:
				setType((SequenceType)null);
				return;
			case FhirPackage.SEQUENCE__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.SEQUENCE__SPECIMEN:
				setSpecimen((Reference)null);
				return;
			case FhirPackage.SEQUENCE__DEVICE:
				setDevice((Reference)null);
				return;
			case FhirPackage.SEQUENCE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.SEQUENCE__SPECIES:
				setSpecies((CodeableConcept)null);
				return;
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				getReferenceSeq().clear();
				return;
			case FhirPackage.SEQUENCE__VARIATION:
				setVariation((SequenceVariation)null);
				return;
			case FhirPackage.SEQUENCE__QUALITY:
				getQuality().clear();
				return;
			case FhirPackage.SEQUENCE__ALLELIC_STATE:
				setAllelicState((CodeableConcept)null);
				return;
			case FhirPackage.SEQUENCE__ALLELIC_FREQUENCY:
				setAllelicFrequency((Decimal)null);
				return;
			case FhirPackage.SEQUENCE__COPY_NUMBER_EVENT:
				setCopyNumberEvent((CodeableConcept)null);
				return;
			case FhirPackage.SEQUENCE__READ_COVERAGE:
				setReadCoverage((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SEQUENCE__REPOSITORY:
				getRepository().clear();
				return;
			case FhirPackage.SEQUENCE__POINTER:
				getPointer().clear();
				return;
			case FhirPackage.SEQUENCE__OBSERVED_SEQ:
				setObservedSeq((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE__OBSERVATION:
				setObservation((Reference)null);
				return;
			case FhirPackage.SEQUENCE__STRUCTURE_VARIATION:
				setStructureVariation((SequenceStructureVariation)null);
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
			case FhirPackage.SEQUENCE__TYPE:
				return type != null;
			case FhirPackage.SEQUENCE__PATIENT:
				return patient != null;
			case FhirPackage.SEQUENCE__SPECIMEN:
				return specimen != null;
			case FhirPackage.SEQUENCE__DEVICE:
				return device != null;
			case FhirPackage.SEQUENCE__QUANTITY:
				return quantity != null;
			case FhirPackage.SEQUENCE__SPECIES:
				return species != null;
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				return referenceSeq != null && !referenceSeq.isEmpty();
			case FhirPackage.SEQUENCE__VARIATION:
				return variation != null;
			case FhirPackage.SEQUENCE__QUALITY:
				return quality != null && !quality.isEmpty();
			case FhirPackage.SEQUENCE__ALLELIC_STATE:
				return allelicState != null;
			case FhirPackage.SEQUENCE__ALLELIC_FREQUENCY:
				return allelicFrequency != null;
			case FhirPackage.SEQUENCE__COPY_NUMBER_EVENT:
				return copyNumberEvent != null;
			case FhirPackage.SEQUENCE__READ_COVERAGE:
				return readCoverage != null;
			case FhirPackage.SEQUENCE__REPOSITORY:
				return repository != null && !repository.isEmpty();
			case FhirPackage.SEQUENCE__POINTER:
				return pointer != null && !pointer.isEmpty();
			case FhirPackage.SEQUENCE__OBSERVED_SEQ:
				return observedSeq != null;
			case FhirPackage.SEQUENCE__OBSERVATION:
				return observation != null;
			case FhirPackage.SEQUENCE__STRUCTURE_VARIATION:
				return structureVariation != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
