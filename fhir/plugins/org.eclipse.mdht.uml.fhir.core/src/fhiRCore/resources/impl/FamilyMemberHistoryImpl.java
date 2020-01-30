/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.FamilyMemberHistory;
import fhiRCore.resources.FamilyMemberHistoryCondition;
import fhiRCore.resources.PlanDefinition;
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
 * An implementation of the model object '<em><b>Family Member History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getBornx <em>Bornx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getAgex <em>Agex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getEstimatedAge <em>Estimated Age</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getDeceasedx <em>Deceasedx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.FamilyMemberHistoryImpl#getConditions <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyMemberHistoryImpl extends DomainResourceImpl implements FamilyMemberHistory {
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
	 * The cached value of the '{@link #getInstantiatesCanonicals() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonicals()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinition> instantiatesCanonicals;

	/**
	 * The cached value of the '{@link #getInstantiatesUris() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUris()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUris;

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
	 * The cached value of the '{@link #getDataAbsentReason() <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAbsentReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dataAbsentReason;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sex;

	/**
	 * The cached value of the '{@link #getBornx() <em>Bornx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBornx()
	 * @generated
	 * @ordered
	 */
	protected DataType bornx;

	/**
	 * The cached value of the '{@link #getAgex() <em>Agex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgex()
	 * @generated
	 * @ordered
	 */
	protected DataType agex;

	/**
	 * The cached value of the '{@link #getEstimatedAge() <em>Estimated Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedAge()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean estimatedAge;

	/**
	 * The cached value of the '{@link #getDeceasedx() <em>Deceasedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedx()
	 * @generated
	 * @ordered
	 */
	protected DataType deceasedx;

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
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReferences;

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
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<FamilyMemberHistoryCondition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyMemberHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getFamilyMemberHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanDefinition> getInstantiatesCanonicals() {
		if (instantiatesCanonicals == null) {
			instantiatesCanonicals = new EObjectContainmentEList<PlanDefinition>(PlanDefinition.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonicals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getInstantiatesUris() {
		if (instantiatesUris == null) {
			instantiatesUris = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI);
		}
		return instantiatesUris;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDataAbsentReason() {
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAbsentReason(CodeableConcept newDataAbsentReason, NotificationChain msgs) {
		CodeableConcept oldDataAbsentReason = dataAbsentReason;
		dataAbsentReason = newDataAbsentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON, oldDataAbsentReason, newDataAbsentReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataAbsentReason(CodeableConcept newDataAbsentReason) {
		if (newDataAbsentReason != dataAbsentReason) {
			NotificationChain msgs = null;
			if (dataAbsentReason != null)
				msgs = ((InternalEObject)dataAbsentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON, null, msgs);
			if (newDataAbsentReason != null)
				msgs = ((InternalEObject)newDataAbsentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON, null, msgs);
			msgs = basicSetDataAbsentReason(newDataAbsentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON, newDataAbsentReason, newDataAbsentReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(CodeableConcept newRelationship, NotificationChain msgs) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(CodeableConcept newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSex(CodeableConcept newSex, NotificationChain msgs) {
		CodeableConcept oldSex = sex;
		sex = newSex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX, oldSex, newSex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(CodeableConcept newSex) {
		if (newSex != sex) {
			NotificationChain msgs = null;
			if (sex != null)
				msgs = ((InternalEObject)sex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX, null, msgs);
			if (newSex != null)
				msgs = ((InternalEObject)newSex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX, null, msgs);
			msgs = basicSetSex(newSex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX, newSex, newSex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBornx() {
		return bornx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBornx(DataType newBornx, NotificationChain msgs) {
		DataType oldBornx = bornx;
		bornx = newBornx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX, oldBornx, newBornx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBornx(DataType newBornx) {
		if (newBornx != bornx) {
			NotificationChain msgs = null;
			if (bornx != null)
				msgs = ((InternalEObject)bornx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX, null, msgs);
			if (newBornx != null)
				msgs = ((InternalEObject)newBornx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX, null, msgs);
			msgs = basicSetBornx(newBornx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX, newBornx, newBornx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAgex() {
		return agex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgex(DataType newAgex, NotificationChain msgs) {
		DataType oldAgex = agex;
		agex = newAgex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX, oldAgex, newAgex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgex(DataType newAgex) {
		if (newAgex != agex) {
			NotificationChain msgs = null;
			if (agex != null)
				msgs = ((InternalEObject)agex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX, null, msgs);
			if (newAgex != null)
				msgs = ((InternalEObject)newAgex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX, null, msgs);
			msgs = basicSetAgex(newAgex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX, newAgex, newAgex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getEstimatedAge() {
		return estimatedAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstimatedAge(fhiRCore.dataTypes.Boolean newEstimatedAge, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldEstimatedAge = estimatedAge;
		estimatedAge = newEstimatedAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, oldEstimatedAge, newEstimatedAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedAge(fhiRCore.dataTypes.Boolean newEstimatedAge) {
		if (newEstimatedAge != estimatedAge) {
			NotificationChain msgs = null;
			if (estimatedAge != null)
				msgs = ((InternalEObject)estimatedAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, null, msgs);
			if (newEstimatedAge != null)
				msgs = ((InternalEObject)newEstimatedAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, null, msgs);
			msgs = basicSetEstimatedAge(newEstimatedAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE, newEstimatedAge, newEstimatedAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDeceasedx() {
		return deceasedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeceasedx(DataType newDeceasedx, NotificationChain msgs) {
		DataType oldDeceasedx = deceasedx;
		deceasedx = newDeceasedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX, oldDeceasedx, newDeceasedx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeceasedx(DataType newDeceasedx) {
		if (newDeceasedx != deceasedx) {
			NotificationChain msgs = null;
			if (deceasedx != null)
				msgs = ((InternalEObject)deceasedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX, null, msgs);
			if (newDeceasedx != null)
				msgs = ((InternalEObject)newDeceasedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX, null, msgs);
			msgs = basicSetDeceasedx(newDeceasedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX, newDeceasedx, newDeceasedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FamilyMemberHistoryCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<FamilyMemberHistoryCondition>(FamilyMemberHistoryCondition.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonicals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUris()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				return basicSetDataAbsentReason(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX:
				return basicSetSex(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				return basicSetBornx(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				return basicSetAgex(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				return basicSetEstimatedAge(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				return basicSetDeceasedx(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonicals();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				return getInstantiatesUris();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				return getStatus();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				return getDataAbsentReason();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				return getPatient();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				return getDate();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				return getName();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				return getRelationship();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX:
				return getSex();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				return getBornx();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				return getAgex();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				return getEstimatedAge();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				return getDeceasedx();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				return getNotes();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return getConditions();
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				getInstantiatesCanonicals().addAll((Collection<? extends PlanDefinition>)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				getInstantiatesUris().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX:
				setSex((CodeableConcept)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				setBornx((DataType)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				setAgex((DataType)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				setEstimatedAge((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				setDeceasedx((DataType)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends FamilyMemberHistoryCondition>)newValue);
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX:
				setSex((CodeableConcept)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				setBornx((DataType)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				setAgex((DataType)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				setEstimatedAge((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				setDeceasedx((DataType)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				getConditions().clear();
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_CANONICAL:
				return instantiatesCanonicals != null && !instantiatesCanonicals.isEmpty();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__INSTANTIATES_URI:
				return instantiatesUris != null && !instantiatesUris.isEmpty();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__STATUS:
				return status != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATA_ABSENT_REASON:
				return dataAbsentReason != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__PATIENT:
				return patient != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DATE:
				return date != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NAME:
				return name != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__RELATIONSHIP:
				return relationship != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__SEX:
				return sex != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__BORNX:
				return bornx != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__AGEX:
				return agex != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__ESTIMATED_AGE:
				return estimatedAge != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__DECEASEDX:
				return deceasedx != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY__CONDITION:
				return conditions != null && !conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyMemberHistoryImpl
