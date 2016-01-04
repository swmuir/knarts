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
import org.hl7.fhir.Sequence;
import org.hl7.fhir.SequenceChip;
import org.hl7.fhir.SequenceCoordinate;
import org.hl7.fhir.SequenceQuality;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.SequenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getVariationID <em>Variation ID</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getCigar <em>Cigar</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getAllelicState <em>Allelic State</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getAllelicFrequency <em>Allelic Frequency</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getCopyNumberEvent <em>Copy Number Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getChip <em>Chip</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceImpl#getRepository <em>Repository</em>}</li>
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
	 * The cached value of the '{@link #getVariationID() <em>Variation ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariationID()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> variationID;

	/**
	 * The cached value of the '{@link #getReferenceSeq() <em>Reference Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeq()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept referenceSeq;

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
	 * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceCoordinate> coordinate;

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
	 * The cached value of the '{@link #getObservedAllele() <em>Observed Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedAllele()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String observedAllele;

	/**
	 * The cached value of the '{@link #getReferenceAllele() <em>Reference Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceAllele()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String referenceAllele;

	/**
	 * The cached value of the '{@link #getCigar() <em>Cigar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCigar()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String cigar;

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
	 * The cached value of the '{@link #getChip() <em>Chip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChip()
	 * @generated
	 * @ordered
	 */
	protected SequenceChip chip;

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
	public EList<CodeableConcept> getVariationID() {
		if (variationID == null) {
			variationID = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SEQUENCE__VARIATION_ID);
		}
		return variationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReferenceSeq() {
		return referenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSeq(CodeableConcept newReferenceSeq, NotificationChain msgs) {
		CodeableConcept oldReferenceSeq = referenceSeq;
		referenceSeq = newReferenceSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__REFERENCE_SEQ, oldReferenceSeq, newReferenceSeq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSeq(CodeableConcept newReferenceSeq) {
		if (newReferenceSeq != referenceSeq) {
			NotificationChain msgs = null;
			if (referenceSeq != null)
				msgs = ((InternalEObject)referenceSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__REFERENCE_SEQ, null, msgs);
			if (newReferenceSeq != null)
				msgs = ((InternalEObject)newReferenceSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__REFERENCE_SEQ, null, msgs);
			msgs = basicSetReferenceSeq(newReferenceSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__REFERENCE_SEQ, newReferenceSeq, newReferenceSeq));
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
	public EList<SequenceCoordinate> getCoordinate() {
		if (coordinate == null) {
			coordinate = new EObjectContainmentEList<SequenceCoordinate>(SequenceCoordinate.class, this, FhirPackage.SEQUENCE__COORDINATE);
		}
		return coordinate;
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
	public org.hl7.fhir.String getObservedAllele() {
		return observedAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservedAllele(org.hl7.fhir.String newObservedAllele, NotificationChain msgs) {
		org.hl7.fhir.String oldObservedAllele = observedAllele;
		observedAllele = newObservedAllele;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__OBSERVED_ALLELE, oldObservedAllele, newObservedAllele);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedAllele(org.hl7.fhir.String newObservedAllele) {
		if (newObservedAllele != observedAllele) {
			NotificationChain msgs = null;
			if (observedAllele != null)
				msgs = ((InternalEObject)observedAllele).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__OBSERVED_ALLELE, null, msgs);
			if (newObservedAllele != null)
				msgs = ((InternalEObject)newObservedAllele).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__OBSERVED_ALLELE, null, msgs);
			msgs = basicSetObservedAllele(newObservedAllele, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__OBSERVED_ALLELE, newObservedAllele, newObservedAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReferenceAllele() {
		return referenceAllele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceAllele(org.hl7.fhir.String newReferenceAllele, NotificationChain msgs) {
		org.hl7.fhir.String oldReferenceAllele = referenceAllele;
		referenceAllele = newReferenceAllele;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__REFERENCE_ALLELE, oldReferenceAllele, newReferenceAllele);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceAllele(org.hl7.fhir.String newReferenceAllele) {
		if (newReferenceAllele != referenceAllele) {
			NotificationChain msgs = null;
			if (referenceAllele != null)
				msgs = ((InternalEObject)referenceAllele).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__REFERENCE_ALLELE, null, msgs);
			if (newReferenceAllele != null)
				msgs = ((InternalEObject)newReferenceAllele).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__REFERENCE_ALLELE, null, msgs);
			msgs = basicSetReferenceAllele(newReferenceAllele, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__REFERENCE_ALLELE, newReferenceAllele, newReferenceAllele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCigar() {
		return cigar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCigar(org.hl7.fhir.String newCigar, NotificationChain msgs) {
		org.hl7.fhir.String oldCigar = cigar;
		cigar = newCigar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__CIGAR, oldCigar, newCigar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCigar(org.hl7.fhir.String newCigar) {
		if (newCigar != cigar) {
			NotificationChain msgs = null;
			if (cigar != null)
				msgs = ((InternalEObject)cigar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__CIGAR, null, msgs);
			if (newCigar != null)
				msgs = ((InternalEObject)newCigar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__CIGAR, null, msgs);
			msgs = basicSetCigar(newCigar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__CIGAR, newCigar, newCigar));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__CHIP, oldChip, newChip);
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
				msgs = ((InternalEObject)chip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__CHIP, null, msgs);
			if (newChip != null)
				msgs = ((InternalEObject)newChip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE__CHIP, null, msgs);
			msgs = basicSetChip(newChip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE__CHIP, newChip, newChip));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SEQUENCE__VARIATION_ID:
				return ((InternalEList<?>)getVariationID()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				return basicSetReferenceSeq(null, msgs);
			case FhirPackage.SEQUENCE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.SEQUENCE__COORDINATE:
				return ((InternalEList<?>)getCoordinate()).basicRemove(otherEnd, msgs);
			case FhirPackage.SEQUENCE__SPECIES:
				return basicSetSpecies(null, msgs);
			case FhirPackage.SEQUENCE__OBSERVED_ALLELE:
				return basicSetObservedAllele(null, msgs);
			case FhirPackage.SEQUENCE__REFERENCE_ALLELE:
				return basicSetReferenceAllele(null, msgs);
			case FhirPackage.SEQUENCE__CIGAR:
				return basicSetCigar(null, msgs);
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
			case FhirPackage.SEQUENCE__CHIP:
				return basicSetChip(null, msgs);
			case FhirPackage.SEQUENCE__REPOSITORY:
				return ((InternalEList<?>)getRepository()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SEQUENCE__VARIATION_ID:
				return getVariationID();
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				return getReferenceSeq();
			case FhirPackage.SEQUENCE__QUANTITY:
				return getQuantity();
			case FhirPackage.SEQUENCE__COORDINATE:
				return getCoordinate();
			case FhirPackage.SEQUENCE__SPECIES:
				return getSpecies();
			case FhirPackage.SEQUENCE__OBSERVED_ALLELE:
				return getObservedAllele();
			case FhirPackage.SEQUENCE__REFERENCE_ALLELE:
				return getReferenceAllele();
			case FhirPackage.SEQUENCE__CIGAR:
				return getCigar();
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
			case FhirPackage.SEQUENCE__CHIP:
				return getChip();
			case FhirPackage.SEQUENCE__REPOSITORY:
				return getRepository();
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
			case FhirPackage.SEQUENCE__VARIATION_ID:
				getVariationID().clear();
				getVariationID().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((CodeableConcept)newValue);
				return;
			case FhirPackage.SEQUENCE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.SEQUENCE__COORDINATE:
				getCoordinate().clear();
				getCoordinate().addAll((Collection<? extends SequenceCoordinate>)newValue);
				return;
			case FhirPackage.SEQUENCE__SPECIES:
				setSpecies((CodeableConcept)newValue);
				return;
			case FhirPackage.SEQUENCE__OBSERVED_ALLELE:
				setObservedAllele((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE__REFERENCE_ALLELE:
				setReferenceAllele((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE__CIGAR:
				setCigar((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SEQUENCE__CHIP:
				setChip((SequenceChip)newValue);
				return;
			case FhirPackage.SEQUENCE__REPOSITORY:
				getRepository().clear();
				getRepository().addAll((Collection<? extends SequenceRepository>)newValue);
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
			case FhirPackage.SEQUENCE__VARIATION_ID:
				getVariationID().clear();
				return;
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((CodeableConcept)null);
				return;
			case FhirPackage.SEQUENCE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.SEQUENCE__COORDINATE:
				getCoordinate().clear();
				return;
			case FhirPackage.SEQUENCE__SPECIES:
				setSpecies((CodeableConcept)null);
				return;
			case FhirPackage.SEQUENCE__OBSERVED_ALLELE:
				setObservedAllele((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE__REFERENCE_ALLELE:
				setReferenceAllele((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE__CIGAR:
				setCigar((org.hl7.fhir.String)null);
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
			case FhirPackage.SEQUENCE__CHIP:
				setChip((SequenceChip)null);
				return;
			case FhirPackage.SEQUENCE__REPOSITORY:
				getRepository().clear();
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
			case FhirPackage.SEQUENCE__VARIATION_ID:
				return variationID != null && !variationID.isEmpty();
			case FhirPackage.SEQUENCE__REFERENCE_SEQ:
				return referenceSeq != null;
			case FhirPackage.SEQUENCE__QUANTITY:
				return quantity != null;
			case FhirPackage.SEQUENCE__COORDINATE:
				return coordinate != null && !coordinate.isEmpty();
			case FhirPackage.SEQUENCE__SPECIES:
				return species != null;
			case FhirPackage.SEQUENCE__OBSERVED_ALLELE:
				return observedAllele != null;
			case FhirPackage.SEQUENCE__REFERENCE_ALLELE:
				return referenceAllele != null;
			case FhirPackage.SEQUENCE__CIGAR:
				return cigar != null;
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
			case FhirPackage.SEQUENCE__CHIP:
				return chip != null;
			case FhirPackage.SEQUENCE__REPOSITORY:
				return repository != null && !repository.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
