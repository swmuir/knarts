/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.Specimen;
import org.eclipse.mdht.hl7.fhir.resources.SpecimenCollection;
import org.eclipse.mdht.hl7.fhir.resources.SpecimenContainer;
import org.eclipse.mdht.hl7.fhir.resources.SpecimenProcessing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getAccessionIdentifier <em>Accession Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getReceivedTime <em>Received Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getParents <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getRequests <em>Request</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getProcessings <em>Processing</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getContainers <em>Container</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getConditions <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenImpl extends DomainResourceImpl implements Specimen {
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
	 * The cached value of the '{@link #getAccessionIdentifier() <em>Accession Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier accessionIdentifier;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getReceivedTime() <em>Received Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime receivedTime;

	/**
	 * The cached value of the '{@link #getParents() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> parents;

	/**
	 * The cached value of the '{@link #getRequests() <em>Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> requests;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected SpecimenCollection collection;

	/**
	 * The cached value of the '{@link #getProcessings() <em>Processing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessings()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenProcessing> processings;

	/**
	 * The cached value of the '{@link #getContainers() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenContainer> containers;

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
	protected SpecimenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.SPECIMEN__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getAccessionIdentifier() {
		return accessionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessionIdentifier(Identifier newAccessionIdentifier, NotificationChain msgs) {
		Identifier oldAccessionIdentifier = accessionIdentifier;
		accessionIdentifier = newAccessionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER, oldAccessionIdentifier, newAccessionIdentifier);
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
	public void setAccessionIdentifier(Identifier newAccessionIdentifier) {
		if (newAccessionIdentifier != accessionIdentifier) {
			NotificationChain msgs = null;
			if (accessionIdentifier != null)
				msgs = ((InternalEObject)accessionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER, null, msgs);
			if (newAccessionIdentifier != null)
				msgs = ((InternalEObject)newAccessionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER, null, msgs);
			msgs = basicSetAccessionIdentifier(newAccessionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER, newAccessionIdentifier, newAccessionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__STATUS, oldStatus, newStatus);
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
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__SUBJECT, oldSubject, newSubject);
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
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getReceivedTime() {
		return receivedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedTime(DateTime newReceivedTime, NotificationChain msgs) {
		DateTime oldReceivedTime = receivedTime;
		receivedTime = newReceivedTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__RECEIVED_TIME, oldReceivedTime, newReceivedTime);
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
	public void setReceivedTime(DateTime newReceivedTime) {
		if (newReceivedTime != receivedTime) {
			NotificationChain msgs = null;
			if (receivedTime != null)
				msgs = ((InternalEObject)receivedTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__RECEIVED_TIME, null, msgs);
			if (newReceivedTime != null)
				msgs = ((InternalEObject)newReceivedTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__RECEIVED_TIME, null, msgs);
			msgs = basicSetReceivedTime(newReceivedTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__RECEIVED_TIME, newReceivedTime, newReceivedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getParents() {
		if (parents == null) {
			parents = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SPECIMEN__PARENT);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRequests() {
		if (requests == null) {
			requests = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SPECIMEN__REQUEST);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenCollection getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(SpecimenCollection newCollection, NotificationChain msgs) {
		SpecimenCollection oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__COLLECTION, oldCollection, newCollection);
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
	public void setCollection(SpecimenCollection newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecimenProcessing> getProcessings() {
		if (processings == null) {
			processings = new EObjectContainmentEList<SpecimenProcessing>(SpecimenProcessing.class, this, ResourcesPackage.SPECIMEN__PROCESSING);
		}
		return processings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecimenContainer> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<SpecimenContainer>(SpecimenContainer.class, this, ResourcesPackage.SPECIMEN__CONTAINER);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SPECIMEN__CONDITION);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.SPECIMEN__NOTE);
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
			case ResourcesPackage.SPECIMEN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				return basicSetAccessionIdentifier(null, msgs);
			case ResourcesPackage.SPECIMEN__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.SPECIMEN__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.SPECIMEN__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.SPECIMEN__RECEIVED_TIME:
				return basicSetReceivedTime(null, msgs);
			case ResourcesPackage.SPECIMEN__PARENT:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN__REQUEST:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN__COLLECTION:
				return basicSetCollection(null, msgs);
			case ResourcesPackage.SPECIMEN__PROCESSING:
				return ((InternalEList<?>)getProcessings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN__CONTAINER:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN__CONDITION:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN__NOTE:
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
			case ResourcesPackage.SPECIMEN__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				return getAccessionIdentifier();
			case ResourcesPackage.SPECIMEN__STATUS:
				return getStatus();
			case ResourcesPackage.SPECIMEN__TYPE:
				return getType();
			case ResourcesPackage.SPECIMEN__SUBJECT:
				return getSubject();
			case ResourcesPackage.SPECIMEN__RECEIVED_TIME:
				return getReceivedTime();
			case ResourcesPackage.SPECIMEN__PARENT:
				return getParents();
			case ResourcesPackage.SPECIMEN__REQUEST:
				return getRequests();
			case ResourcesPackage.SPECIMEN__COLLECTION:
				return getCollection();
			case ResourcesPackage.SPECIMEN__PROCESSING:
				return getProcessings();
			case ResourcesPackage.SPECIMEN__CONTAINER:
				return getContainers();
			case ResourcesPackage.SPECIMEN__CONDITION:
				return getConditions();
			case ResourcesPackage.SPECIMEN__NOTE:
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
			case ResourcesPackage.SPECIMEN__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				setAccessionIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.SPECIMEN__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SPECIMEN__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.SPECIMEN__RECEIVED_TIME:
				setReceivedTime((DateTime)newValue);
				return;
			case ResourcesPackage.SPECIMEN__PARENT:
				getParents().clear();
				getParents().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SPECIMEN__REQUEST:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SPECIMEN__COLLECTION:
				setCollection((SpecimenCollection)newValue);
				return;
			case ResourcesPackage.SPECIMEN__PROCESSING:
				getProcessings().clear();
				getProcessings().addAll((Collection<? extends SpecimenProcessing>)newValue);
				return;
			case ResourcesPackage.SPECIMEN__CONTAINER:
				getContainers().clear();
				getContainers().addAll((Collection<? extends SpecimenContainer>)newValue);
				return;
			case ResourcesPackage.SPECIMEN__CONDITION:
				getConditions().clear();
				getConditions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SPECIMEN__NOTE:
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
			case ResourcesPackage.SPECIMEN__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				setAccessionIdentifier((Identifier)null);
				return;
			case ResourcesPackage.SPECIMEN__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SPECIMEN__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.SPECIMEN__RECEIVED_TIME:
				setReceivedTime((DateTime)null);
				return;
			case ResourcesPackage.SPECIMEN__PARENT:
				getParents().clear();
				return;
			case ResourcesPackage.SPECIMEN__REQUEST:
				getRequests().clear();
				return;
			case ResourcesPackage.SPECIMEN__COLLECTION:
				setCollection((SpecimenCollection)null);
				return;
			case ResourcesPackage.SPECIMEN__PROCESSING:
				getProcessings().clear();
				return;
			case ResourcesPackage.SPECIMEN__CONTAINER:
				getContainers().clear();
				return;
			case ResourcesPackage.SPECIMEN__CONDITION:
				getConditions().clear();
				return;
			case ResourcesPackage.SPECIMEN__NOTE:
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
			case ResourcesPackage.SPECIMEN__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SPECIMEN__ACCESSION_IDENTIFIER:
				return accessionIdentifier != null;
			case ResourcesPackage.SPECIMEN__STATUS:
				return status != null;
			case ResourcesPackage.SPECIMEN__TYPE:
				return type != null;
			case ResourcesPackage.SPECIMEN__SUBJECT:
				return subject != null;
			case ResourcesPackage.SPECIMEN__RECEIVED_TIME:
				return receivedTime != null;
			case ResourcesPackage.SPECIMEN__PARENT:
				return parents != null && !parents.isEmpty();
			case ResourcesPackage.SPECIMEN__REQUEST:
				return requests != null && !requests.isEmpty();
			case ResourcesPackage.SPECIMEN__COLLECTION:
				return collection != null;
			case ResourcesPackage.SPECIMEN__PROCESSING:
				return processings != null && !processings.isEmpty();
			case ResourcesPackage.SPECIMEN__CONTAINER:
				return containers != null && !containers.isEmpty();
			case ResourcesPackage.SPECIMEN__CONDITION:
				return conditions != null && !conditions.isEmpty();
			case ResourcesPackage.SPECIMEN__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecimenImpl
