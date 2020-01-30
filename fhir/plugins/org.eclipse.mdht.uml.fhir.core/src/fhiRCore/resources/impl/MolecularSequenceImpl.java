/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.MolecularSequence;
import fhiRCore.resources.MolecularSequenceQuality;
import fhiRCore.resources.MolecularSequenceReferenceSeq;
import fhiRCore.resources.MolecularSequenceRepository;
import fhiRCore.resources.MolecularSequenceStructureVariant;
import fhiRCore.resources.MolecularSequenceVariant;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getReferenceSeq <em>Reference Seq</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getVariants <em>Variant</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getObservedSeq <em>Observed Seq</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getQualities <em>Quality</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getReadCoverage <em>Read Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getRepositories <em>Repository</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getPointers <em>Pointer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceImpl#getStructureVariants <em>Structure Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceImpl extends DomainResourceImpl implements MolecularSequence {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer coordinateSystem;

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
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

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
	 * The cached value of the '{@link #getReferenceSeq() <em>Reference Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSeq()
	 * @generated
	 * @ordered
	 */
	protected MolecularSequenceReferenceSeq referenceSeq;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceVariant> variants;

	/**
	 * The cached value of the '{@link #getObservedSeq() <em>Observed Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedSeq()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String observedSeq;

	/**
	 * The cached value of the '{@link #getQualities() <em>Quality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceQuality> qualities;

	/**
	 * The cached value of the '{@link #getReadCoverage() <em>Read Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCoverage()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer readCoverage;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceRepository> repositories;

	/**
	 * The cached value of the '{@link #getPointers() <em>Pointer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> pointers;

	/**
	 * The cached value of the '{@link #getStructureVariants() <em>Structure Variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSequenceStructureVariant> structureVariants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMolecularSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MOLECULAR_SEQUENCE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getCoordinateSystem() {
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(fhiRCore.dataTypes.Integer newCoordinateSystem, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldCoordinateSystem = coordinateSystem;
		coordinateSystem = newCoordinateSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM, oldCoordinateSystem, newCoordinateSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSystem(fhiRCore.dataTypes.Integer newCoordinateSystem) {
		if (newCoordinateSystem != coordinateSystem) {
			NotificationChain msgs = null;
			if (coordinateSystem != null)
				msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM, null, msgs);
			if (newCoordinateSystem != null)
				msgs = ((InternalEObject)newCoordinateSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM, null, msgs);
			msgs = basicSetCoordinateSystem(newCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM, newCoordinateSystem, newCoordinateSystem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN, oldSpecimen, newSpecimen);
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
				msgs = ((InternalEObject)specimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN, null, msgs);
			if (newSpecimen != null)
				msgs = ((InternalEObject)newSpecimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN, null, msgs);
			msgs = basicSetSpecimen(newSpecimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN, newSpecimen, newSpecimen));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE, oldDevice, newDevice);
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
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER, newPerformer, newPerformer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularSequenceReferenceSeq getReferenceSeq() {
		return referenceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSeq(MolecularSequenceReferenceSeq newReferenceSeq, NotificationChain msgs) {
		MolecularSequenceReferenceSeq oldReferenceSeq = referenceSeq;
		referenceSeq = newReferenceSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ, oldReferenceSeq, newReferenceSeq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSeq(MolecularSequenceReferenceSeq newReferenceSeq) {
		if (newReferenceSeq != referenceSeq) {
			NotificationChain msgs = null;
			if (referenceSeq != null)
				msgs = ((InternalEObject)referenceSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ, null, msgs);
			if (newReferenceSeq != null)
				msgs = ((InternalEObject)newReferenceSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ, null, msgs);
			msgs = basicSetReferenceSeq(newReferenceSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ, newReferenceSeq, newReferenceSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolecularSequenceVariant> getVariants() {
		if (variants == null) {
			variants = new EObjectContainmentEList<MolecularSequenceVariant>(MolecularSequenceVariant.class, this, ResourcesPackage.MOLECULAR_SEQUENCE__VARIANT);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getObservedSeq() {
		return observedSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservedSeq(fhiRCore.dataTypes.String newObservedSeq, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldObservedSeq = observedSeq;
		observedSeq = newObservedSeq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ, oldObservedSeq, newObservedSeq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedSeq(fhiRCore.dataTypes.String newObservedSeq) {
		if (newObservedSeq != observedSeq) {
			NotificationChain msgs = null;
			if (observedSeq != null)
				msgs = ((InternalEObject)observedSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ, null, msgs);
			if (newObservedSeq != null)
				msgs = ((InternalEObject)newObservedSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ, null, msgs);
			msgs = basicSetObservedSeq(newObservedSeq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ, newObservedSeq, newObservedSeq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolecularSequenceQuality> getQualities() {
		if (qualities == null) {
			qualities = new EObjectContainmentEList<MolecularSequenceQuality>(MolecularSequenceQuality.class, this, ResourcesPackage.MOLECULAR_SEQUENCE__QUALITY);
		}
		return qualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getReadCoverage() {
		return readCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadCoverage(fhiRCore.dataTypes.Integer newReadCoverage, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldReadCoverage = readCoverage;
		readCoverage = newReadCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE, oldReadCoverage, newReadCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadCoverage(fhiRCore.dataTypes.Integer newReadCoverage) {
		if (newReadCoverage != readCoverage) {
			NotificationChain msgs = null;
			if (readCoverage != null)
				msgs = ((InternalEObject)readCoverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE, null, msgs);
			if (newReadCoverage != null)
				msgs = ((InternalEObject)newReadCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE, null, msgs);
			msgs = basicSetReadCoverage(newReadCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE, newReadCoverage, newReadCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolecularSequenceRepository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<MolecularSequenceRepository>(MolecularSequenceRepository.class, this, ResourcesPackage.MOLECULAR_SEQUENCE__REPOSITORY);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPointers() {
		if (pointers == null) {
			pointers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MOLECULAR_SEQUENCE__POINTER);
		}
		return pointers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolecularSequenceStructureVariant> getStructureVariants() {
		if (structureVariants == null) {
			structureVariants = new EObjectContainmentEList<MolecularSequenceStructureVariant>(MolecularSequenceStructureVariant.class, this, ResourcesPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT);
		}
		return structureVariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE:
				return basicSetDevice(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER:
				return basicSetPerformer(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				return basicSetReferenceSeq(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__VARIANT:
				return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				return basicSetObservedSeq(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUALITY:
				return ((InternalEList<?>)getQualities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				return basicSetReadCoverage(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__POINTER:
				return ((InternalEList<?>)getPointers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				return ((InternalEList<?>)getStructureVariants()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MOLECULAR_SEQUENCE__TYPE:
				return getType();
			case ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				return getCoordinateSystem();
			case ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT:
				return getPatient();
			case ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				return getSpecimen();
			case ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE:
				return getDevice();
			case ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER:
				return getPerformer();
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY:
				return getQuantity();
			case ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				return getReferenceSeq();
			case ResourcesPackage.MOLECULAR_SEQUENCE__VARIANT:
				return getVariants();
			case ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				return getObservedSeq();
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUALITY:
				return getQualities();
			case ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				return getReadCoverage();
			case ResourcesPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				return getRepositories();
			case ResourcesPackage.MOLECULAR_SEQUENCE__POINTER:
				return getPointers();
			case ResourcesPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				return getStructureVariants();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				setCoordinateSystem((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				setSpecimen((Reference)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE:
				setDevice((Reference)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((MolecularSequenceReferenceSeq)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__VARIANT:
				getVariants().clear();
				getVariants().addAll((Collection<? extends MolecularSequenceVariant>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				setObservedSeq((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUALITY:
				getQualities().clear();
				getQualities().addAll((Collection<? extends MolecularSequenceQuality>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				setReadCoverage((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends MolecularSequenceRepository>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__POINTER:
				getPointers().clear();
				getPointers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				getStructureVariants().clear();
				getStructureVariants().addAll((Collection<? extends MolecularSequenceStructureVariant>)newValue);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				setCoordinateSystem((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				setSpecimen((Reference)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE:
				setDevice((Reference)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER:
				setPerformer((Reference)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				setReferenceSeq((MolecularSequenceReferenceSeq)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__VARIANT:
				getVariants().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				setObservedSeq((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUALITY:
				getQualities().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				setReadCoverage((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				getRepositories().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__POINTER:
				getPointers().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				getStructureVariants().clear();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE__TYPE:
				return type != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__PATIENT:
				return patient != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__SPECIMEN:
				return specimen != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__DEVICE:
				return device != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__PERFORMER:
				return performer != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUANTITY:
				return quantity != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__REFERENCE_SEQ:
				return referenceSeq != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__VARIANT:
				return variants != null && !variants.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE__OBSERVED_SEQ:
				return observedSeq != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__QUALITY:
				return qualities != null && !qualities.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE__READ_COVERAGE:
				return readCoverage != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE__REPOSITORY:
				return repositories != null && !repositories.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE__POINTER:
				return pointers != null && !pointers.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE__STRUCTURE_VARIANT:
				return structureVariants != null && !structureVariants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceImpl
