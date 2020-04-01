/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceReferenceSeq;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Reference Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getChromosome <em>Chromosome</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getGenomeBuild <em>Genome Build</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getReferenceSeqId <em>Reference Seq Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getReferenceSeqPointer <em>Reference Seq Pointer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getReferenceSeqString <em>Reference Seq String</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getStrand <em>Strand</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getWindowStart <em>Window Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceReferenceSeqImpl#getWindowEnd <em>Window End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceReferenceSeqImpl extends BackboneElementImpl implements MolecularSequenceReferenceSeq {
	/**
	 * The cached value of the '{@link #getChromosome() <em>Chromosome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChromosome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept chromosome;

	/**
	 * The cached value of the '{@link #getGenomeBuild() <em>Genome Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeBuild()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String genomeBuild;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Code orientation;

	/**
	 * The cached value of the '{@link #getReferenceSeqId() <em>Reference Seq Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeqId()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept referenceSeqId;

	/**
	 * The cached value of the '{@link #getReferenceSeqPointer() <em>Reference Seq Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeqPointer()
	 * @generated
	 * @ordered
	 */
	protected Reference referenceSeqPointer;

	/**
	 * The cached value of the '{@link #getReferenceSeqString() <em>Reference Seq String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeqString()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String referenceSeqString;

	/**
	 * The cached value of the '{@link #getStrand() <em>Strand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrand()
	 * @generated
	 * @ordered
	 */
	protected Code strand;

	/**
	 * The cached value of the '{@link #getWindowStart() <em>Window Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowStart()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer windowStart;

	/**
	 * The cached value of the '{@link #getWindowEnd() <em>Window End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowEnd()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer windowEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceReferenceSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMolecularSequenceReferenceSeq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getChromosome() {
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChromosome(CodeableConcept newChromosome, NotificationChain msgs) {
		CodeableConcept oldChromosome = chromosome;
		chromosome = newChromosome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME, oldChromosome, newChromosome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChromosome(CodeableConcept newChromosome) {
		if (newChromosome != chromosome) {
			NotificationChain msgs = null;
			if (chromosome != null)
				msgs = ((InternalEObject)chromosome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME, null, msgs);
			if (newChromosome != null)
				msgs = ((InternalEObject)newChromosome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME, null, msgs);
			msgs = basicSetChromosome(newChromosome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME, newChromosome, newChromosome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getGenomeBuild() {
		return genomeBuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenomeBuild(org.eclipse.mdht.hl7.fhir.dataTypes.String newGenomeBuild, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldGenomeBuild = genomeBuild;
		genomeBuild = newGenomeBuild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD, oldGenomeBuild, newGenomeBuild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenomeBuild(org.eclipse.mdht.hl7.fhir.dataTypes.String newGenomeBuild) {
		if (newGenomeBuild != genomeBuild) {
			NotificationChain msgs = null;
			if (genomeBuild != null)
				msgs = ((InternalEObject)genomeBuild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD, null, msgs);
			if (newGenomeBuild != null)
				msgs = ((InternalEObject)newGenomeBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD, null, msgs);
			msgs = basicSetGenomeBuild(newGenomeBuild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD, newGenomeBuild, newGenomeBuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(Code newOrientation, NotificationChain msgs) {
		Code oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION, oldOrientation, newOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(Code newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getReferenceSeqId() {
		return referenceSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSeqId(CodeableConcept newReferenceSeqId, NotificationChain msgs) {
		CodeableConcept oldReferenceSeqId = referenceSeqId;
		referenceSeqId = newReferenceSeqId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID, oldReferenceSeqId, newReferenceSeqId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceSeqId(CodeableConcept newReferenceSeqId) {
		if (newReferenceSeqId != referenceSeqId) {
			NotificationChain msgs = null;
			if (referenceSeqId != null)
				msgs = ((InternalEObject)referenceSeqId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID, null, msgs);
			if (newReferenceSeqId != null)
				msgs = ((InternalEObject)newReferenceSeqId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID, null, msgs);
			msgs = basicSetReferenceSeqId(newReferenceSeqId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID, newReferenceSeqId, newReferenceSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReferenceSeqPointer() {
		return referenceSeqPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSeqPointer(Reference newReferenceSeqPointer, NotificationChain msgs) {
		Reference oldReferenceSeqPointer = referenceSeqPointer;
		referenceSeqPointer = newReferenceSeqPointer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER, oldReferenceSeqPointer, newReferenceSeqPointer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceSeqPointer(Reference newReferenceSeqPointer) {
		if (newReferenceSeqPointer != referenceSeqPointer) {
			NotificationChain msgs = null;
			if (referenceSeqPointer != null)
				msgs = ((InternalEObject)referenceSeqPointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER, null, msgs);
			if (newReferenceSeqPointer != null)
				msgs = ((InternalEObject)newReferenceSeqPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER, null, msgs);
			msgs = basicSetReferenceSeqPointer(newReferenceSeqPointer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER, newReferenceSeqPointer, newReferenceSeqPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getReferenceSeqString() {
		return referenceSeqString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSeqString(org.eclipse.mdht.hl7.fhir.dataTypes.String newReferenceSeqString, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldReferenceSeqString = referenceSeqString;
		referenceSeqString = newReferenceSeqString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING, oldReferenceSeqString, newReferenceSeqString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceSeqString(org.eclipse.mdht.hl7.fhir.dataTypes.String newReferenceSeqString) {
		if (newReferenceSeqString != referenceSeqString) {
			NotificationChain msgs = null;
			if (referenceSeqString != null)
				msgs = ((InternalEObject)referenceSeqString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING, null, msgs);
			if (newReferenceSeqString != null)
				msgs = ((InternalEObject)newReferenceSeqString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING, null, msgs);
			msgs = basicSetReferenceSeqString(newReferenceSeqString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING, newReferenceSeqString, newReferenceSeqString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getStrand() {
		return strand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrand(Code newStrand, NotificationChain msgs) {
		Code oldStrand = strand;
		strand = newStrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND, oldStrand, newStrand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrand(Code newStrand) {
		if (newStrand != strand) {
			NotificationChain msgs = null;
			if (strand != null)
				msgs = ((InternalEObject)strand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND, null, msgs);
			if (newStrand != null)
				msgs = ((InternalEObject)newStrand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND, null, msgs);
			msgs = basicSetStrand(newStrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND, newStrand, newStrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getWindowStart() {
		return windowStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindowStart(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newWindowStart, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldWindowStart = windowStart;
		windowStart = newWindowStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START, oldWindowStart, newWindowStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindowStart(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newWindowStart) {
		if (newWindowStart != windowStart) {
			NotificationChain msgs = null;
			if (windowStart != null)
				msgs = ((InternalEObject)windowStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START, null, msgs);
			if (newWindowStart != null)
				msgs = ((InternalEObject)newWindowStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START, null, msgs);
			msgs = basicSetWindowStart(newWindowStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START, newWindowStart, newWindowStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getWindowEnd() {
		return windowEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindowEnd(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newWindowEnd, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldWindowEnd = windowEnd;
		windowEnd = newWindowEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END, oldWindowEnd, newWindowEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindowEnd(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newWindowEnd) {
		if (newWindowEnd != windowEnd) {
			NotificationChain msgs = null;
			if (windowEnd != null)
				msgs = ((InternalEObject)windowEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END, null, msgs);
			if (newWindowEnd != null)
				msgs = ((InternalEObject)newWindowEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END, null, msgs);
			msgs = basicSetWindowEnd(newWindowEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END, newWindowEnd, newWindowEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				return basicSetChromosome(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				return basicSetGenomeBuild(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				return basicSetReferenceSeqId(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				return basicSetReferenceSeqPointer(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				return basicSetReferenceSeqString(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND:
				return basicSetStrand(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				return basicSetWindowStart(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				return basicSetWindowEnd(null, msgs);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				return getChromosome();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				return getGenomeBuild();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION:
				return getOrientation();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				return getReferenceSeqId();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				return getReferenceSeqPointer();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				return getReferenceSeqString();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND:
				return getStrand();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				return getWindowStart();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				return getWindowEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				setChromosome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				setGenomeBuild((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION:
				setOrientation((Code)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				setReferenceSeqId((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				setReferenceSeqPointer((Reference)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				setReferenceSeqString((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND:
				setStrand((Code)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				setWindowStart((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				setWindowEnd((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				setChromosome((CodeableConcept)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				setGenomeBuild((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION:
				setOrientation((Code)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				setReferenceSeqId((CodeableConcept)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				setReferenceSeqPointer((Reference)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				setReferenceSeqString((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND:
				setStrand((Code)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				setWindowStart((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				setWindowEnd((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__CHROMOSOME:
				return chromosome != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__GENOME_BUILD:
				return genomeBuild != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__ORIENTATION:
				return orientation != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_ID:
				return referenceSeqId != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_POINTER:
				return referenceSeqPointer != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__REFERENCE_SEQ_STRING:
				return referenceSeqString != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__STRAND:
				return strand != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_START:
				return windowStart != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REFERENCE_SEQ__WINDOW_END:
				return windowEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceReferenceSeqImpl
