/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.RelatedArtifact;

import fhiRCore.resources.ResearchStudy;
import fhiRCore.resources.ResearchStudyArm;
import fhiRCore.resources.ResearchStudyObjective;
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
 * An implementation of the model object '<em><b>Research Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getProtocols <em>Protocol</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getPrimaryPurposeType <em>Primary Purpose Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getFoci <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getRelatedArtifacts <em>Related Artifact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getKeywords <em>Keyword</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getEnrollments <em>Enrollment</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getSponsor <em>Sponsor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getPrincipalInvestigator <em>Principal Investigator</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getSites <em>Site</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getReasonStopped <em>Reason Stopped</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getArms <em>Arm</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResearchStudyImpl#getObjectives <em>Objective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchStudyImpl extends DomainResourceImpl implements ResearchStudy {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String title;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> protocols;

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
	 * The cached value of the '{@link #getPrimaryPurposeType() <em>Primary Purpose Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryPurposeType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept primaryPurposeType;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept phase;

	/**
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

	/**
	 * The cached value of the '{@link #getFoci() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoci()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> foci;

	/**
	 * The cached value of the '{@link #getConditions() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> conditions;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactDetail> contacts;

	/**
	 * The cached value of the '{@link #getRelatedArtifacts() <em>Related Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> relatedArtifacts;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keyword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> keywords;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> locations;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Markdown description;

	/**
	 * The cached value of the '{@link #getEnrollments() <em>Enrollment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollments()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> enrollments;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getSponsor() <em>Sponsor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsor()
	 * @generated
	 * @ordered
	 */
	protected Reference sponsor;

	/**
	 * The cached value of the '{@link #getPrincipalInvestigator() <em>Principal Investigator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalInvestigator()
	 * @generated
	 * @ordered
	 */
	protected Reference principalInvestigator;

	/**
	 * The cached value of the '{@link #getSites() <em>Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSites()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sites;

	/**
	 * The cached value of the '{@link #getReasonStopped() <em>Reason Stopped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonStopped()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reasonStopped;

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
	 * The cached value of the '{@link #getArms() <em>Arm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArms()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyArm> arms;

	/**
	 * The cached value of the '{@link #getObjectives() <em>Objective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchStudyObjective> objectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getResearchStudy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.RESEARCH_STUDY__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(fhiRCore.dataTypes.String newTitle, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(fhiRCore.dataTypes.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.RESEARCH_STUDY__PROTOCOL);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.RESEARCH_STUDY__PART_OF);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPrimaryPurposeType() {
		return primaryPurposeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryPurposeType(CodeableConcept newPrimaryPurposeType, NotificationChain msgs) {
		CodeableConcept oldPrimaryPurposeType = primaryPurposeType;
		primaryPurposeType = newPrimaryPurposeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, oldPrimaryPurposeType, newPrimaryPurposeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryPurposeType(CodeableConcept newPrimaryPurposeType) {
		if (newPrimaryPurposeType != primaryPurposeType) {
			NotificationChain msgs = null;
			if (primaryPurposeType != null)
				msgs = ((InternalEObject)primaryPurposeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, null, msgs);
			if (newPrimaryPurposeType != null)
				msgs = ((InternalEObject)newPrimaryPurposeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, null, msgs);
			msgs = basicSetPrimaryPurposeType(newPrimaryPurposeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE, newPrimaryPurposeType, newPrimaryPurposeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(CodeableConcept newPhase, NotificationChain msgs) {
		CodeableConcept oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PHASE, oldPhase, newPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(CodeableConcept newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFoci() {
		if (foci == null) {
			foci = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__FOCUS);
		}
		return foci;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, ResourcesPackage.RESEARCH_STUDY__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelatedArtifact> getRelatedArtifacts() {
		if (relatedArtifacts == null) {
			relatedArtifacts = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT);
		}
		return relatedArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getKeywords() {
		if (keywords == null) {
			keywords = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__KEYWORD);
		}
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.RESEARCH_STUDY__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Markdown newDescription, NotificationChain msgs) {
		Markdown oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Markdown newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEnrollments() {
		if (enrollments == null) {
			enrollments = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.RESEARCH_STUDY__ENROLLMENT);
		}
		return enrollments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSponsor() {
		return sponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSponsor(Reference newSponsor, NotificationChain msgs) {
		Reference oldSponsor = sponsor;
		sponsor = newSponsor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__SPONSOR, oldSponsor, newSponsor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSponsor(Reference newSponsor) {
		if (newSponsor != sponsor) {
			NotificationChain msgs = null;
			if (sponsor != null)
				msgs = ((InternalEObject)sponsor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__SPONSOR, null, msgs);
			if (newSponsor != null)
				msgs = ((InternalEObject)newSponsor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__SPONSOR, null, msgs);
			msgs = basicSetSponsor(newSponsor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__SPONSOR, newSponsor, newSponsor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrincipalInvestigator() {
		return principalInvestigator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrincipalInvestigator(Reference newPrincipalInvestigator, NotificationChain msgs) {
		Reference oldPrincipalInvestigator = principalInvestigator;
		principalInvestigator = newPrincipalInvestigator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, oldPrincipalInvestigator, newPrincipalInvestigator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipalInvestigator(Reference newPrincipalInvestigator) {
		if (newPrincipalInvestigator != principalInvestigator) {
			NotificationChain msgs = null;
			if (principalInvestigator != null)
				msgs = ((InternalEObject)principalInvestigator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, null, msgs);
			if (newPrincipalInvestigator != null)
				msgs = ((InternalEObject)newPrincipalInvestigator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, null, msgs);
			msgs = basicSetPrincipalInvestigator(newPrincipalInvestigator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR, newPrincipalInvestigator, newPrincipalInvestigator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSites() {
		if (sites == null) {
			sites = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.RESEARCH_STUDY__SITE);
		}
		return sites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReasonStopped() {
		return reasonStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReasonStopped(CodeableConcept newReasonStopped, NotificationChain msgs) {
		CodeableConcept oldReasonStopped = reasonStopped;
		reasonStopped = newReasonStopped;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED, oldReasonStopped, newReasonStopped);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasonStopped(CodeableConcept newReasonStopped) {
		if (newReasonStopped != reasonStopped) {
			NotificationChain msgs = null;
			if (reasonStopped != null)
				msgs = ((InternalEObject)reasonStopped).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED, null, msgs);
			if (newReasonStopped != null)
				msgs = ((InternalEObject)newReasonStopped).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED, null, msgs);
			msgs = basicSetReasonStopped(newReasonStopped, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED, newReasonStopped, newReasonStopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.RESEARCH_STUDY__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResearchStudyArm> getArms() {
		if (arms == null) {
			arms = new EObjectContainmentEList<ResearchStudyArm>(ResearchStudyArm.class, this, ResourcesPackage.RESEARCH_STUDY__ARM);
		}
		return arms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResearchStudyObjective> getObjectives() {
		if (objectives == null) {
			objectives = new EObjectContainmentEList<ResearchStudyObjective>(ResearchStudyObjective.class, this, ResourcesPackage.RESEARCH_STUDY__OBJECTIVE);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return basicSetPrimaryPurposeType(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__PHASE:
				return basicSetPhase(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				return ((InternalEList<?>)getFoci()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__CONDITION:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return ((InternalEList<?>)getRelatedArtifacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				return ((InternalEList<?>)getKeywords()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__LOCATION:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				return ((InternalEList<?>)getEnrollments()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				return basicSetSponsor(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				return basicSetPrincipalInvestigator(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				return ((InternalEList<?>)getSites()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				return basicSetReasonStopped(null, msgs);
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				return ((InternalEList<?>)getArms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_STUDY__OBJECTIVE:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				return getTitle();
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				return getProtocols();
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				return getPartOfs();
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				return getStatus();
			case ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return getPrimaryPurposeType();
			case ResourcesPackage.RESEARCH_STUDY__PHASE:
				return getPhase();
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				return getCategories();
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				return getFoci();
			case ResourcesPackage.RESEARCH_STUDY__CONDITION:
				return getConditions();
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				return getContacts();
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return getRelatedArtifacts();
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				return getKeywords();
			case ResourcesPackage.RESEARCH_STUDY__LOCATION:
				return getLocations();
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				return getEnrollments();
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				return getPeriod();
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				return getSponsor();
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				return getPrincipalInvestigator();
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				return getSites();
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				return getReasonStopped();
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				return getNotes();
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				return getArms();
			case ResourcesPackage.RESEARCH_STUDY__OBJECTIVE:
				return getObjectives();
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
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				setPrimaryPurposeType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PHASE:
				setPhase((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				getFoci().clear();
				getFoci().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				getRelatedArtifacts().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				setDescription((Markdown)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				getEnrollments().clear();
				getEnrollments().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				setSponsor((Reference)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				setPrincipalInvestigator((Reference)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				getSites().clear();
				getSites().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				setReasonStopped((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				getArms().clear();
				getArms().addAll((Collection<? extends ResearchStudyArm>)newValue);
				return;
			case ResourcesPackage.RESEARCH_STUDY__OBJECTIVE:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends ResearchStudyObjective>)newValue);
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
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				getProtocols().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				setPrimaryPurposeType((CodeableConcept)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PHASE:
				setPhase((CodeableConcept)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				getFoci().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__CONDITION:
				getConditions().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				getRelatedArtifacts().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				getKeywords().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				setDescription((Markdown)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				getEnrollments().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				setSponsor((Reference)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				setPrincipalInvestigator((Reference)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				getSites().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				setReasonStopped((CodeableConcept)null);
				return;
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				getArms().clear();
				return;
			case ResourcesPackage.RESEARCH_STUDY__OBJECTIVE:
				getObjectives().clear();
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
			case ResourcesPackage.RESEARCH_STUDY__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__TITLE:
				return title != null;
			case ResourcesPackage.RESEARCH_STUDY__PROTOCOL:
				return protocols != null && !protocols.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__STATUS:
				return status != null;
			case ResourcesPackage.RESEARCH_STUDY__PRIMARY_PURPOSE_TYPE:
				return primaryPurposeType != null;
			case ResourcesPackage.RESEARCH_STUDY__PHASE:
				return phase != null;
			case ResourcesPackage.RESEARCH_STUDY__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__FOCUS:
				return foci != null && !foci.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__RELATED_ARTIFACT:
				return relatedArtifacts != null && !relatedArtifacts.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__KEYWORD:
				return keywords != null && !keywords.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__DESCRIPTION:
				return description != null;
			case ResourcesPackage.RESEARCH_STUDY__ENROLLMENT:
				return enrollments != null && !enrollments.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__PERIOD:
				return period != null;
			case ResourcesPackage.RESEARCH_STUDY__SPONSOR:
				return sponsor != null;
			case ResourcesPackage.RESEARCH_STUDY__PRINCIPAL_INVESTIGATOR:
				return principalInvestigator != null;
			case ResourcesPackage.RESEARCH_STUDY__SITE:
				return sites != null && !sites.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__REASON_STOPPED:
				return reasonStopped != null;
			case ResourcesPackage.RESEARCH_STUDY__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__ARM:
				return arms != null && !arms.isEmpty();
			case ResourcesPackage.RESEARCH_STUDY__OBJECTIVE:
				return objectives != null && !objectives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResearchStudyImpl
