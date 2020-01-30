/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.Composition;
import fhiRCore.resources.CompositionAttester;
import fhiRCore.resources.CompositionEvent;
import fhiRCore.resources.CompositionRelatesTo;
import fhiRCore.resources.CompositionSection;
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
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getAttesters <em>Attester</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getRelatesTos <em>Relates To</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getEvents <em>Event</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionImpl#getSections <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends DomainResourceImpl implements Composition {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authors;

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
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected Code confidentiality;

	/**
	 * The cached value of the '{@link #getAttesters() <em>Attester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttesters()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionAttester> attesters;

	/**
	 * The cached value of the '{@link #getCustodian() <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected Reference custodian;

	/**
	 * The cached value of the '{@link #getRelatesTos() <em>Relates To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTos()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionRelatesTo> relatesTos;

	/**
	 * The cached value of the '{@link #getEvents() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionEvent> events;

	/**
	 * The cached value of the '{@link #getSections() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionSection> sections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getComposition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.COMPOSITION__CATEGORY);
		}
		return categories;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__ENCOUNTER, newEncounter, newEncounter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.COMPOSITION__AUTHOR);
		}
		return authors;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentiality(Code newConfidentiality, NotificationChain msgs) {
		Code oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__CONFIDENTIALITY, oldConfidentiality, newConfidentiality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(Code newConfidentiality) {
		if (newConfidentiality != confidentiality) {
			NotificationChain msgs = null;
			if (confidentiality != null)
				msgs = ((InternalEObject)confidentiality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__CONFIDENTIALITY, null, msgs);
			if (newConfidentiality != null)
				msgs = ((InternalEObject)newConfidentiality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__CONFIDENTIALITY, null, msgs);
			msgs = basicSetConfidentiality(newConfidentiality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__CONFIDENTIALITY, newConfidentiality, newConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionAttester> getAttesters() {
		if (attesters == null) {
			attesters = new EObjectContainmentEList<CompositionAttester>(CompositionAttester.class, this, ResourcesPackage.COMPOSITION__ATTESTER);
		}
		return attesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCustodian() {
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustodian(Reference newCustodian, NotificationChain msgs) {
		Reference oldCustodian = custodian;
		custodian = newCustodian;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__CUSTODIAN, oldCustodian, newCustodian);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustodian(Reference newCustodian) {
		if (newCustodian != custodian) {
			NotificationChain msgs = null;
			if (custodian != null)
				msgs = ((InternalEObject)custodian).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__CUSTODIAN, null, msgs);
			if (newCustodian != null)
				msgs = ((InternalEObject)newCustodian).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION__CUSTODIAN, null, msgs);
			msgs = basicSetCustodian(newCustodian, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION__CUSTODIAN, newCustodian, newCustodian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionRelatesTo> getRelatesTos() {
		if (relatesTos == null) {
			relatesTos = new EObjectContainmentEList<CompositionRelatesTo>(CompositionRelatesTo.class, this, ResourcesPackage.COMPOSITION__RELATES_TO);
		}
		return relatesTos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<CompositionEvent>(CompositionEvent.class, this, ResourcesPackage.COMPOSITION__EVENT);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<CompositionSection>(CompositionSection.class, this, ResourcesPackage.COMPOSITION__SECTION);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COMPOSITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.COMPOSITION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.COMPOSITION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.COMPOSITION__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COMPOSITION__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.COMPOSITION__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.COMPOSITION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.COMPOSITION__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COMPOSITION__TITLE:
				return basicSetTitle(null, msgs);
			case ResourcesPackage.COMPOSITION__CONFIDENTIALITY:
				return basicSetConfidentiality(null, msgs);
			case ResourcesPackage.COMPOSITION__ATTESTER:
				return ((InternalEList<?>)getAttesters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COMPOSITION__CUSTODIAN:
				return basicSetCustodian(null, msgs);
			case ResourcesPackage.COMPOSITION__RELATES_TO:
				return ((InternalEList<?>)getRelatesTos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COMPOSITION__EVENT:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COMPOSITION__SECTION:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COMPOSITION__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.COMPOSITION__STATUS:
				return getStatus();
			case ResourcesPackage.COMPOSITION__TYPE:
				return getType();
			case ResourcesPackage.COMPOSITION__CATEGORY:
				return getCategories();
			case ResourcesPackage.COMPOSITION__SUBJECT:
				return getSubject();
			case ResourcesPackage.COMPOSITION__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.COMPOSITION__DATE:
				return getDate();
			case ResourcesPackage.COMPOSITION__AUTHOR:
				return getAuthors();
			case ResourcesPackage.COMPOSITION__TITLE:
				return getTitle();
			case ResourcesPackage.COMPOSITION__CONFIDENTIALITY:
				return getConfidentiality();
			case ResourcesPackage.COMPOSITION__ATTESTER:
				return getAttesters();
			case ResourcesPackage.COMPOSITION__CUSTODIAN:
				return getCustodian();
			case ResourcesPackage.COMPOSITION__RELATES_TO:
				return getRelatesTos();
			case ResourcesPackage.COMPOSITION__EVENT:
				return getEvents();
			case ResourcesPackage.COMPOSITION__SECTION:
				return getSections();
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
			case ResourcesPackage.COMPOSITION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.COMPOSITION__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.COMPOSITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COMPOSITION__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.COMPOSITION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.COMPOSITION__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.COMPOSITION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.COMPOSITION__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.COMPOSITION__TITLE:
				setTitle((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COMPOSITION__CONFIDENTIALITY:
				setConfidentiality((Code)newValue);
				return;
			case ResourcesPackage.COMPOSITION__ATTESTER:
				getAttesters().clear();
				getAttesters().addAll((Collection<? extends CompositionAttester>)newValue);
				return;
			case ResourcesPackage.COMPOSITION__CUSTODIAN:
				setCustodian((Reference)newValue);
				return;
			case ResourcesPackage.COMPOSITION__RELATES_TO:
				getRelatesTos().clear();
				getRelatesTos().addAll((Collection<? extends CompositionRelatesTo>)newValue);
				return;
			case ResourcesPackage.COMPOSITION__EVENT:
				getEvents().clear();
				getEvents().addAll((Collection<? extends CompositionEvent>)newValue);
				return;
			case ResourcesPackage.COMPOSITION__SECTION:
				getSections().clear();
				getSections().addAll((Collection<? extends CompositionSection>)newValue);
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
			case ResourcesPackage.COMPOSITION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.COMPOSITION__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.COMPOSITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.COMPOSITION__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.COMPOSITION__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.COMPOSITION__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.COMPOSITION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.COMPOSITION__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.COMPOSITION__TITLE:
				setTitle((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.COMPOSITION__CONFIDENTIALITY:
				setConfidentiality((Code)null);
				return;
			case ResourcesPackage.COMPOSITION__ATTESTER:
				getAttesters().clear();
				return;
			case ResourcesPackage.COMPOSITION__CUSTODIAN:
				setCustodian((Reference)null);
				return;
			case ResourcesPackage.COMPOSITION__RELATES_TO:
				getRelatesTos().clear();
				return;
			case ResourcesPackage.COMPOSITION__EVENT:
				getEvents().clear();
				return;
			case ResourcesPackage.COMPOSITION__SECTION:
				getSections().clear();
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
			case ResourcesPackage.COMPOSITION__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.COMPOSITION__STATUS:
				return status != null;
			case ResourcesPackage.COMPOSITION__TYPE:
				return type != null;
			case ResourcesPackage.COMPOSITION__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.COMPOSITION__SUBJECT:
				return subject != null;
			case ResourcesPackage.COMPOSITION__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.COMPOSITION__DATE:
				return date != null;
			case ResourcesPackage.COMPOSITION__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.COMPOSITION__TITLE:
				return title != null;
			case ResourcesPackage.COMPOSITION__CONFIDENTIALITY:
				return confidentiality != null;
			case ResourcesPackage.COMPOSITION__ATTESTER:
				return attesters != null && !attesters.isEmpty();
			case ResourcesPackage.COMPOSITION__CUSTODIAN:
				return custodian != null;
			case ResourcesPackage.COMPOSITION__RELATES_TO:
				return relatesTos != null && !relatesTos.isEmpty();
			case ResourcesPackage.COMPOSITION__EVENT:
				return events != null && !events.isEmpty();
			case ResourcesPackage.COMPOSITION__SECTION:
				return sections != null && !sections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositionImpl
