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

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.resources.DocumentManifest;
import org.eclipse.mdht.hl7.fhir.resources.DocumentManifestRelated;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getMasterIdentifier <em>Master Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getRecipients <em>Recipient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getContents <em>Content</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentManifestImpl#getRelateds <em>Related</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentManifestImpl extends DomainResourceImpl implements DocumentManifest {
	/**
	 * The cached value of the '{@link #getMasterIdentifier() <em>Master Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier masterIdentifier;

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
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

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
	 * The cached value of the '{@link #getRecipients() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipients;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getContents() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contents;

	/**
	 * The cached value of the '{@link #getRelateds() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateds()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentManifestRelated> relateds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDocumentManifest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getMasterIdentifier() {
		return masterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterIdentifier(Identifier newMasterIdentifier, NotificationChain msgs) {
		Identifier oldMasterIdentifier = masterIdentifier;
		masterIdentifier = newMasterIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, oldMasterIdentifier, newMasterIdentifier);
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
	public void setMasterIdentifier(Identifier newMasterIdentifier) {
		if (newMasterIdentifier != masterIdentifier) {
			NotificationChain msgs = null;
			if (masterIdentifier != null)
				msgs = ((InternalEObject)masterIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, null, msgs);
			if (newMasterIdentifier != null)
				msgs = ((InternalEObject)newMasterIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, null, msgs);
			msgs = basicSetMasterIdentifier(newMasterIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER, newMasterIdentifier, newMasterIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__CREATED, oldCreated, newCreated);
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
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Uri newSource, NotificationChain msgs) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__SOURCE, oldSource, newSource);
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
	public void setSource(Uri newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DOCUMENT_MANIFEST__CONTENT);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentManifestRelated> getRelateds() {
		if (relateds == null) {
			relateds = new EObjectContainmentEList<DocumentManifestRelated>(DocumentManifestRelated.class, this, ResourcesPackage.DOCUMENT_MANIFEST__RELATED);
		}
		return relateds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				return basicSetMasterIdentifier(null, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				return basicSetCreated(null, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				return ((InternalEList<?>)getRecipients()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				return ((InternalEList<?>)getRelateds()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				return getMasterIdentifier();
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				return getStatus();
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				return getType();
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				return getSubject();
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				return getCreated();
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				return getAuthors();
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				return getRecipients();
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				return getSource();
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				return getContents();
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				return getRelateds();
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
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				setSource((Uri)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				getContents().clear();
				getContents().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				getRelateds().clear();
				getRelateds().addAll((Collection<? extends DocumentManifestRelated>)newValue);
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
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				getAuthors().clear();
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				getRecipients().clear();
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				setSource((Uri)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				getContents().clear();
				return;
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				getRelateds().clear();
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
			case ResourcesPackage.DOCUMENT_MANIFEST__MASTER_IDENTIFIER:
				return masterIdentifier != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DOCUMENT_MANIFEST__STATUS:
				return status != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__TYPE:
				return type != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__SUBJECT:
				return subject != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__CREATED:
				return created != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__AUTHOR:
				return authors != null && !authors.isEmpty();
			case ResourcesPackage.DOCUMENT_MANIFEST__RECIPIENT:
				return recipients != null && !recipients.isEmpty();
			case ResourcesPackage.DOCUMENT_MANIFEST__SOURCE:
				return source != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__DESCRIPTION:
				return description != null;
			case ResourcesPackage.DOCUMENT_MANIFEST__CONTENT:
				return contents != null && !contents.isEmpty();
			case ResourcesPackage.DOCUMENT_MANIFEST__RELATED:
				return relateds != null && !relateds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentManifestImpl
