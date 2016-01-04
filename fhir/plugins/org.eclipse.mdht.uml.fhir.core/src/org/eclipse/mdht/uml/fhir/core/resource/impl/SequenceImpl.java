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
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.Quantity;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Sequence;
import org.eclipse.mdht.uml.fhir.core.resource.SequenceChip;
import org.eclipse.mdht.uml.fhir.core.resource.SequenceCoordinate;
import org.eclipse.mdht.uml.fhir.core.resource.SequenceQuality;
import org.eclipse.mdht.uml.fhir.core.resource.SequenceRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getVariationIds <em>Variation Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getCoordinates <em>Coordinate</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getCigar <em>Cigar</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getQualities <em>Quality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getAllelicState <em>Allelic State</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getAllelicFrequency <em>Allelic Frequency</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getCopyNumberEvent <em>Copy Number Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getChip <em>Chip</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SequenceImpl#getRepositories <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends DomainResourceImpl implements Sequence {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getVariationIds() <em>Variation Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariationIds()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> variationIds;

	/**
	 * The cached value of the '{@link #getReferenceSeq() <em>Reference Seq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeq()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept referenceSeq;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceCoordinate> coordinates;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept species;

	/**
	 * The cached value of the '{@link #getObservedAllele() <em>Observed Allele</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedAllele()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String observedAllele;

	/**
	 * The cached value of the '{@link #getReferenceAllele() <em>Reference Allele</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAllele()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String referenceAllele;

	/**
	 * The cached value of the '{@link #getCigar() <em>Cigar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCigar()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String cigar;

	/**
	 * The cached value of the '{@link #getQualities() <em>Quality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceQuality> qualities;

	/**
	 * The cached value of the '{@link #getAllelicState() <em>Allelic State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllelicState()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept allelicState;

	/**
	 * The cached value of the '{@link #getAllelicFrequency() <em>Allelic Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllelicFrequency()
	 * @generated
	 * @ordered
	 */
	protected Decimal allelicFrequency;

	/**
	 * The cached value of the '{@link #getCopyNumberEvent() <em>Copy Number Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyNumberEvent()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept copyNumberEvent;

	/**
	 * The cached value of the '{@link #getReadCoverage() <em>Read Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCoverage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer readCoverage;

	/**
	 * The cached value of the '{@link #getChip() <em>Chip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChip()
	 * @generated
	 * @ordered
	 */
	protected SequenceChip chip;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceRepository> repositories;

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
		return FhirResourcePackage.eINSTANCE.getSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getVariationIds() {
		if (variationIds == null) {
			variationIds = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.SEQUENCE__VARIATION_ID);
		}
		return variationIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReferenceSeq() {
		if (referenceSeq != null && referenceSeq.eIsProxy()) {
			InternalEObject oldReferenceSeq = (InternalEObject)referenceSeq;
			referenceSeq = (CodeableConcept)eResolveProxy(oldReferenceSeq);
			if (referenceSeq != oldReferenceSeq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__REFERENCE_SEQ, oldReferenceSeq, referenceSeq));
			}
		}
		return referenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReferenceSeq() {
		return referenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSeq(CodeableConcept newReferenceSeq) {
		CodeableConcept oldReferenceSeq = referenceSeq;
		referenceSeq = newReferenceSeq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__REFERENCE_SEQ, oldReferenceSeq, referenceSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (Quantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceCoordinate> getCoordinates() {
		if (coordinates == null) {
			coordinates = new EObjectContainmentEList<SequenceCoordinate>(SequenceCoordinate.class, this, FhirResourcePackage.SEQUENCE__COORDINATE);
		}
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecies() {
		if (species != null && species.eIsProxy()) {
			InternalEObject oldSpecies = (InternalEObject)species;
			species = (CodeableConcept)eResolveProxy(oldSpecies);
			if (species != oldSpecies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__SPECIES, oldSpecies, species));
			}
		}
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(CodeableConcept newSpecies) {
		CodeableConcept oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__SPECIES, oldSpecies, species));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getObservedAllele() {
		if (observedAllele != null && observedAllele.eIsProxy()) {
			InternalEObject oldObservedAllele = (InternalEObject)observedAllele;
			observedAllele = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldObservedAllele);
			if (observedAllele != oldObservedAllele) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__OBSERVED_ALLELE, oldObservedAllele, observedAllele));
			}
		}
		return observedAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetObservedAllele() {
		return observedAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedAllele(org.eclipse.mdht.uml.fhir.core.datatype.String newObservedAllele) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldObservedAllele = observedAllele;
		observedAllele = newObservedAllele;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__OBSERVED_ALLELE, oldObservedAllele, observedAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getReferenceAllele() {
		if (referenceAllele != null && referenceAllele.eIsProxy()) {
			InternalEObject oldReferenceAllele = (InternalEObject)referenceAllele;
			referenceAllele = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldReferenceAllele);
			if (referenceAllele != oldReferenceAllele) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__REFERENCE_ALLELE, oldReferenceAllele, referenceAllele));
			}
		}
		return referenceAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetReferenceAllele() {
		return referenceAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceAllele(org.eclipse.mdht.uml.fhir.core.datatype.String newReferenceAllele) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldReferenceAllele = referenceAllele;
		referenceAllele = newReferenceAllele;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__REFERENCE_ALLELE, oldReferenceAllele, referenceAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getCigar() {
		if (cigar != null && cigar.eIsProxy()) {
			InternalEObject oldCigar = (InternalEObject)cigar;
			cigar = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldCigar);
			if (cigar != oldCigar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__CIGAR, oldCigar, cigar));
			}
		}
		return cigar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetCigar() {
		return cigar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCigar(org.eclipse.mdht.uml.fhir.core.datatype.String newCigar) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldCigar = cigar;
		cigar = newCigar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__CIGAR, oldCigar, cigar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceQuality> getQualities() {
		if (qualities == null) {
			qualities = new EObjectContainmentEList<SequenceQuality>(SequenceQuality.class, this, FhirResourcePackage.SEQUENCE__QUALITY);
		}
		return qualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAllelicState() {
		if (allelicState != null && allelicState.eIsProxy()) {
			InternalEObject oldAllelicState = (InternalEObject)allelicState;
			allelicState = (CodeableConcept)eResolveProxy(oldAllelicState);
			if (allelicState != oldAllelicState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__ALLELIC_STATE, oldAllelicState, allelicState));
			}
		}
		return allelicState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetAllelicState() {
		return allelicState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllelicState(CodeableConcept newAllelicState) {
		CodeableConcept oldAllelicState = allelicState;
		allelicState = newAllelicState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__ALLELIC_STATE, oldAllelicState, allelicState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getAllelicFrequency() {
		if (allelicFrequency != null && allelicFrequency.eIsProxy()) {
			InternalEObject oldAllelicFrequency = (InternalEObject)allelicFrequency;
			allelicFrequency = (Decimal)eResolveProxy(oldAllelicFrequency);
			if (allelicFrequency != oldAllelicFrequency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__ALLELIC_FREQUENCY, oldAllelicFrequency, allelicFrequency));
			}
		}
		return allelicFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetAllelicFrequency() {
		return allelicFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllelicFrequency(Decimal newAllelicFrequency) {
		Decimal oldAllelicFrequency = allelicFrequency;
		allelicFrequency = newAllelicFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__ALLELIC_FREQUENCY, oldAllelicFrequency, allelicFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCopyNumberEvent() {
		if (copyNumberEvent != null && copyNumberEvent.eIsProxy()) {
			InternalEObject oldCopyNumberEvent = (InternalEObject)copyNumberEvent;
			copyNumberEvent = (CodeableConcept)eResolveProxy(oldCopyNumberEvent);
			if (copyNumberEvent != oldCopyNumberEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__COPY_NUMBER_EVENT, oldCopyNumberEvent, copyNumberEvent));
			}
		}
		return copyNumberEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCopyNumberEvent() {
		return copyNumberEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyNumberEvent(CodeableConcept newCopyNumberEvent) {
		CodeableConcept oldCopyNumberEvent = copyNumberEvent;
		copyNumberEvent = newCopyNumberEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__COPY_NUMBER_EVENT, oldCopyNumberEvent, copyNumberEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getReadCoverage() {
		if (readCoverage != null && readCoverage.eIsProxy()) {
			InternalEObject oldReadCoverage = (InternalEObject)readCoverage;
			readCoverage = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldReadCoverage);
			if (readCoverage != oldReadCoverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SEQUENCE__READ_COVERAGE, oldReadCoverage, readCoverage));
			}
		}
		return readCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetReadCoverage() {
		return readCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadCoverage(org.eclipse.mdht.uml.fhir.core.datatype.Integer newReadCoverage) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldReadCoverage = readCoverage;
		readCoverage = newReadCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__READ_COVERAGE, oldReadCoverage, readCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceChip getChip() {
		return chip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChip(SequenceChip newChip, NotificationChain msgs) {
		SequenceChip oldChip = chip;
		chip = newChip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__CHIP, oldChip, newChip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChip(SequenceChip newChip) {
		if (newChip != chip) {
			NotificationChain msgs = null;
			if (chip != null)
				msgs = ((InternalEObject)chip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.SEQUENCE__CHIP, null, msgs);
			if (newChip != null)
				msgs = ((InternalEObject)newChip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.SEQUENCE__CHIP, null, msgs);
			msgs = basicSetChip(newChip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SEQUENCE__CHIP, newChip, newChip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceRepository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<SequenceRepository>(SequenceRepository.class, this, FhirResourcePackage.SEQUENCE__REPOSITORY);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.SEQUENCE__COORDINATE:
				return ((InternalEList<?>)getCoordinates()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.SEQUENCE__QUALITY:
				return ((InternalEList<?>)getQualities()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.SEQUENCE__CHIP:
				return basicSetChip(null, msgs);
			case FhirResourcePackage.SEQUENCE__REPOSITORY:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.SEQUENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.SEQUENCE__VARIATION_ID:
				return getVariationIds();
			case FhirResourcePackage.SEQUENCE__REFERENCE_SEQ:
				if (resolve) return getReferenceSeq();
				return basicGetReferenceSeq();
			case FhirResourcePackage.SEQUENCE__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case FhirResourcePackage.SEQUENCE__COORDINATE:
				return getCoordinates();
			case FhirResourcePackage.SEQUENCE__SPECIES:
				if (resolve) return getSpecies();
				return basicGetSpecies();
			case FhirResourcePackage.SEQUENCE__OBSERVED_ALLELE:
				if (resolve) return getObservedAllele();
				return basicGetObservedAllele();
			case FhirResourcePackage.SEQUENCE__REFERENCE_ALLELE:
				if (resolve) return getReferenceAllele();
				return basicGetReferenceAllele();
			case FhirResourcePackage.SEQUENCE__CIGAR:
				if (resolve) return getCigar();
				return basicGetCigar();
			case FhirResourcePackage.SEQUENCE__QUALITY:
				return getQualities();
			case FhirResourcePackage.SEQUENCE__ALLELIC_STATE:
				if (resolve) return getAllelicState();
				return basicGetAllelicState();
			case FhirResourcePackage.SEQUENCE__ALLELIC_FREQUENCY:
				if (resolve) return getAllelicFrequency();
				return basicGetAllelicFrequency();
			case FhirResourcePackage.SEQUENCE__COPY_NUMBER_EVENT:
				if (resolve) return getCopyNumberEvent();
				return basicGetCopyNumberEvent();
			case FhirResourcePackage.SEQUENCE__READ_COVERAGE:
				if (resolve) return getReadCoverage();
				return basicGetReadCoverage();
			case FhirResourcePackage.SEQUENCE__CHIP:
				return getChip();
			case FhirResourcePackage.SEQUENCE__REPOSITORY:
				return getRepositories();
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
			case FhirResourcePackage.SEQUENCE__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__VARIATION_ID:
				getVariationIds().clear();
				getVariationIds().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__COORDINATE:
				getCoordinates().clear();
				getCoordinates().addAll((Collection<? extends SequenceCoordinate>)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__SPECIES:
				setSpecies((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__OBSERVED_ALLELE:
				setObservedAllele((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__REFERENCE_ALLELE:
				setReferenceAllele((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__CIGAR:
				setCigar((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__QUALITY:
				getQualities().clear();
				getQualities().addAll((Collection<? extends SequenceQuality>)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__ALLELIC_STATE:
				setAllelicState((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__ALLELIC_FREQUENCY:
				setAllelicFrequency((Decimal)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__COPY_NUMBER_EVENT:
				setCopyNumberEvent((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__READ_COVERAGE:
				setReadCoverage((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__CHIP:
				setChip((SequenceChip)newValue);
				return;
			case FhirResourcePackage.SEQUENCE__REPOSITORY:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends SequenceRepository>)newValue);
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
			case FhirResourcePackage.SEQUENCE__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.SEQUENCE__VARIATION_ID:
				getVariationIds().clear();
				return;
			case FhirResourcePackage.SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((CodeableConcept)null);
				return;
			case FhirResourcePackage.SEQUENCE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirResourcePackage.SEQUENCE__COORDINATE:
				getCoordinates().clear();
				return;
			case FhirResourcePackage.SEQUENCE__SPECIES:
				setSpecies((CodeableConcept)null);
				return;
			case FhirResourcePackage.SEQUENCE__OBSERVED_ALLELE:
				setObservedAllele((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.SEQUENCE__REFERENCE_ALLELE:
				setReferenceAllele((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.SEQUENCE__CIGAR:
				setCigar((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.SEQUENCE__QUALITY:
				getQualities().clear();
				return;
			case FhirResourcePackage.SEQUENCE__ALLELIC_STATE:
				setAllelicState((CodeableConcept)null);
				return;
			case FhirResourcePackage.SEQUENCE__ALLELIC_FREQUENCY:
				setAllelicFrequency((Decimal)null);
				return;
			case FhirResourcePackage.SEQUENCE__COPY_NUMBER_EVENT:
				setCopyNumberEvent((CodeableConcept)null);
				return;
			case FhirResourcePackage.SEQUENCE__READ_COVERAGE:
				setReadCoverage((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.SEQUENCE__CHIP:
				setChip((SequenceChip)null);
				return;
			case FhirResourcePackage.SEQUENCE__REPOSITORY:
				getRepositories().clear();
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
			case FhirResourcePackage.SEQUENCE__TYPE:
				return type != null;
			case FhirResourcePackage.SEQUENCE__VARIATION_ID:
				return variationIds != null && !variationIds.isEmpty();
			case FhirResourcePackage.SEQUENCE__REFERENCE_SEQ:
				return referenceSeq != null;
			case FhirResourcePackage.SEQUENCE__QUANTITY:
				return quantity != null;
			case FhirResourcePackage.SEQUENCE__COORDINATE:
				return coordinates != null && !coordinates.isEmpty();
			case FhirResourcePackage.SEQUENCE__SPECIES:
				return species != null;
			case FhirResourcePackage.SEQUENCE__OBSERVED_ALLELE:
				return observedAllele != null;
			case FhirResourcePackage.SEQUENCE__REFERENCE_ALLELE:
				return referenceAllele != null;
			case FhirResourcePackage.SEQUENCE__CIGAR:
				return cigar != null;
			case FhirResourcePackage.SEQUENCE__QUALITY:
				return qualities != null && !qualities.isEmpty();
			case FhirResourcePackage.SEQUENCE__ALLELIC_STATE:
				return allelicState != null;
			case FhirResourcePackage.SEQUENCE__ALLELIC_FREQUENCY:
				return allelicFrequency != null;
			case FhirResourcePackage.SEQUENCE__COPY_NUMBER_EVENT:
				return copyNumberEvent != null;
			case FhirResourcePackage.SEQUENCE__READ_COVERAGE:
				return readCoverage != null;
			case FhirResourcePackage.SEQUENCE__CHIP:
				return chip != null;
			case FhirResourcePackage.SEQUENCE__REPOSITORY:
				return repositories != null && !repositories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
