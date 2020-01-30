/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Media;
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
 * An implementation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getView <em>View</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getCreatedx <em>Createdx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getFrames <em>Frames</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getContent <em>Content</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MediaImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaImpl extends DomainResourceImpl implements Media {
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
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOns;

	/**
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOfs;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept modality;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept view;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getCreatedx() <em>Createdx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedx()
	 * @generated
	 * @ordered
	 */
	protected DataType createdx;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Instant issued;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Reference operator;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String deviceName;

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
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt height;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt width;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt frames;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Decimal duration;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Attachment content;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedia();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDIA__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDIA__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDIA__PART_OF);
		}
		return partOfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModality(CodeableConcept newModality, NotificationChain msgs) {
		CodeableConcept oldModality = modality;
		modality = newModality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__MODALITY, oldModality, newModality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(CodeableConcept newModality) {
		if (newModality != modality) {
			NotificationChain msgs = null;
			if (modality != null)
				msgs = ((InternalEObject)modality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__MODALITY, null, msgs);
			if (newModality != null)
				msgs = ((InternalEObject)newModality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__MODALITY, null, msgs);
			msgs = basicSetModality(newModality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__MODALITY, newModality, newModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(CodeableConcept newView, NotificationChain msgs) {
		CodeableConcept oldView = view;
		view = newView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__VIEW, oldView, newView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(CodeableConcept newView) {
		if (newView != view) {
			NotificationChain msgs = null;
			if (view != null)
				msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__VIEW, null, msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__VIEW, null, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__VIEW, newView, newView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getCreatedx() {
		return createdx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatedx(DataType newCreatedx, NotificationChain msgs) {
		DataType oldCreatedx = createdx;
		createdx = newCreatedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__CREATEDX, oldCreatedx, newCreatedx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedx(DataType newCreatedx) {
		if (newCreatedx != createdx) {
			NotificationChain msgs = null;
			if (createdx != null)
				msgs = ((InternalEObject)createdx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__CREATEDX, null, msgs);
			if (newCreatedx != null)
				msgs = ((InternalEObject)newCreatedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__CREATEDX, null, msgs);
			msgs = basicSetCreatedx(newCreatedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__CREATEDX, newCreatedx, newCreatedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(Instant newIssued, NotificationChain msgs) {
		Instant oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(Instant newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Reference newOperator, NotificationChain msgs) {
		Reference oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Reference newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDIA__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceName(fhiRCore.dataTypes.String newDeviceName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__DEVICE_NAME, oldDeviceName, newDeviceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(fhiRCore.dataTypes.String newDeviceName) {
		if (newDeviceName != deviceName) {
			NotificationChain msgs = null;
			if (deviceName != null)
				msgs = ((InternalEObject)deviceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__DEVICE_NAME, null, msgs);
			if (newDeviceName != null)
				msgs = ((InternalEObject)newDeviceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__DEVICE_NAME, null, msgs);
			msgs = basicSetDeviceName(newDeviceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__DEVICE_NAME, newDeviceName, newDeviceName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__DEVICE, oldDevice, newDevice);
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
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(PositiveInt newHeight, NotificationChain msgs) {
		PositiveInt oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__HEIGHT, oldHeight, newHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(PositiveInt newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__HEIGHT, newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(PositiveInt newWidth, NotificationChain msgs) {
		PositiveInt oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__WIDTH, oldWidth, newWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(PositiveInt newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getFrames() {
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrames(PositiveInt newFrames, NotificationChain msgs) {
		PositiveInt oldFrames = frames;
		frames = newFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__FRAMES, oldFrames, newFrames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrames(PositiveInt newFrames) {
		if (newFrames != frames) {
			NotificationChain msgs = null;
			if (frames != null)
				msgs = ((InternalEObject)frames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__FRAMES, null, msgs);
			if (newFrames != null)
				msgs = ((InternalEObject)newFrames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__FRAMES, null, msgs);
			msgs = basicSetFrames(newFrames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__FRAMES, newFrames, newFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Decimal newDuration, NotificationChain msgs) {
		Decimal oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Decimal newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Attachment newContent, NotificationChain msgs) {
		Attachment oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Attachment newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDIA__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDIA__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.MEDIA__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDIA__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDIA__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDIA__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDIA__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MEDIA__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDIA__MODALITY:
				return basicSetModality(null, msgs);
			case ResourcesPackage.MEDIA__VIEW:
				return basicSetView(null, msgs);
			case ResourcesPackage.MEDIA__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.MEDIA__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.MEDIA__CREATEDX:
				return basicSetCreatedx(null, msgs);
			case ResourcesPackage.MEDIA__ISSUED:
				return basicSetIssued(null, msgs);
			case ResourcesPackage.MEDIA__OPERATOR:
				return basicSetOperator(null, msgs);
			case ResourcesPackage.MEDIA__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDIA__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case ResourcesPackage.MEDIA__DEVICE_NAME:
				return basicSetDeviceName(null, msgs);
			case ResourcesPackage.MEDIA__DEVICE:
				return basicSetDevice(null, msgs);
			case ResourcesPackage.MEDIA__HEIGHT:
				return basicSetHeight(null, msgs);
			case ResourcesPackage.MEDIA__WIDTH:
				return basicSetWidth(null, msgs);
			case ResourcesPackage.MEDIA__FRAMES:
				return basicSetFrames(null, msgs);
			case ResourcesPackage.MEDIA__DURATION:
				return basicSetDuration(null, msgs);
			case ResourcesPackage.MEDIA__CONTENT:
				return basicSetContent(null, msgs);
			case ResourcesPackage.MEDIA__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDIA__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDIA__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.MEDIA__PART_OF:
				return getPartOfs();
			case ResourcesPackage.MEDIA__STATUS:
				return getStatus();
			case ResourcesPackage.MEDIA__TYPE:
				return getType();
			case ResourcesPackage.MEDIA__MODALITY:
				return getModality();
			case ResourcesPackage.MEDIA__VIEW:
				return getView();
			case ResourcesPackage.MEDIA__SUBJECT:
				return getSubject();
			case ResourcesPackage.MEDIA__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.MEDIA__CREATEDX:
				return getCreatedx();
			case ResourcesPackage.MEDIA__ISSUED:
				return getIssued();
			case ResourcesPackage.MEDIA__OPERATOR:
				return getOperator();
			case ResourcesPackage.MEDIA__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.MEDIA__BODY_SITE:
				return getBodySite();
			case ResourcesPackage.MEDIA__DEVICE_NAME:
				return getDeviceName();
			case ResourcesPackage.MEDIA__DEVICE:
				return getDevice();
			case ResourcesPackage.MEDIA__HEIGHT:
				return getHeight();
			case ResourcesPackage.MEDIA__WIDTH:
				return getWidth();
			case ResourcesPackage.MEDIA__FRAMES:
				return getFrames();
			case ResourcesPackage.MEDIA__DURATION:
				return getDuration();
			case ResourcesPackage.MEDIA__CONTENT:
				return getContent();
			case ResourcesPackage.MEDIA__NOTE:
				return getNotes();
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
			case ResourcesPackage.MEDIA__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDIA__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDIA__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDIA__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.MEDIA__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDIA__MODALITY:
				setModality((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDIA__VIEW:
				setView((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDIA__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.MEDIA__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.MEDIA__CREATEDX:
				setCreatedx((DataType)newValue);
				return;
			case ResourcesPackage.MEDIA__ISSUED:
				setIssued((Instant)newValue);
				return;
			case ResourcesPackage.MEDIA__OPERATOR:
				setOperator((Reference)newValue);
				return;
			case ResourcesPackage.MEDIA__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDIA__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDIA__DEVICE_NAME:
				setDeviceName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEDIA__DEVICE:
				setDevice((Reference)newValue);
				return;
			case ResourcesPackage.MEDIA__HEIGHT:
				setHeight((PositiveInt)newValue);
				return;
			case ResourcesPackage.MEDIA__WIDTH:
				setWidth((PositiveInt)newValue);
				return;
			case ResourcesPackage.MEDIA__FRAMES:
				setFrames((PositiveInt)newValue);
				return;
			case ResourcesPackage.MEDIA__DURATION:
				setDuration((Decimal)newValue);
				return;
			case ResourcesPackage.MEDIA__CONTENT:
				setContent((Attachment)newValue);
				return;
			case ResourcesPackage.MEDIA__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.MEDIA__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDIA__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.MEDIA__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.MEDIA__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.MEDIA__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDIA__MODALITY:
				setModality((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDIA__VIEW:
				setView((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDIA__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.MEDIA__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.MEDIA__CREATEDX:
				setCreatedx((DataType)null);
				return;
			case ResourcesPackage.MEDIA__ISSUED:
				setIssued((Instant)null);
				return;
			case ResourcesPackage.MEDIA__OPERATOR:
				setOperator((Reference)null);
				return;
			case ResourcesPackage.MEDIA__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.MEDIA__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDIA__DEVICE_NAME:
				setDeviceName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MEDIA__DEVICE:
				setDevice((Reference)null);
				return;
			case ResourcesPackage.MEDIA__HEIGHT:
				setHeight((PositiveInt)null);
				return;
			case ResourcesPackage.MEDIA__WIDTH:
				setWidth((PositiveInt)null);
				return;
			case ResourcesPackage.MEDIA__FRAMES:
				setFrames((PositiveInt)null);
				return;
			case ResourcesPackage.MEDIA__DURATION:
				setDuration((Decimal)null);
				return;
			case ResourcesPackage.MEDIA__CONTENT:
				setContent((Attachment)null);
				return;
			case ResourcesPackage.MEDIA__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.MEDIA__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDIA__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.MEDIA__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.MEDIA__STATUS:
				return status != null;
			case ResourcesPackage.MEDIA__TYPE:
				return type != null;
			case ResourcesPackage.MEDIA__MODALITY:
				return modality != null;
			case ResourcesPackage.MEDIA__VIEW:
				return view != null;
			case ResourcesPackage.MEDIA__SUBJECT:
				return subject != null;
			case ResourcesPackage.MEDIA__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.MEDIA__CREATEDX:
				return createdx != null;
			case ResourcesPackage.MEDIA__ISSUED:
				return issued != null;
			case ResourcesPackage.MEDIA__OPERATOR:
				return operator != null;
			case ResourcesPackage.MEDIA__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.MEDIA__BODY_SITE:
				return bodySite != null;
			case ResourcesPackage.MEDIA__DEVICE_NAME:
				return deviceName != null;
			case ResourcesPackage.MEDIA__DEVICE:
				return device != null;
			case ResourcesPackage.MEDIA__HEIGHT:
				return height != null;
			case ResourcesPackage.MEDIA__WIDTH:
				return width != null;
			case ResourcesPackage.MEDIA__FRAMES:
				return frames != null;
			case ResourcesPackage.MEDIA__DURATION:
				return duration != null;
			case ResourcesPackage.MEDIA__CONTENT:
				return content != null;
			case ResourcesPackage.MEDIA__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MediaImpl
