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
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

import org.eclipse.mdht.uml.fhir.core.resource.DocumentReference;
import org.eclipse.mdht.uml.fhir.core.resource.DocumentReferenceContent;
import org.eclipse.mdht.uml.fhir.core.resource.DocumentReferenceContext;
import org.eclipse.mdht.uml.fhir.core.resource.DocumentReferenceRelatesTo;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getMasterIdentifier <em>Master Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getAuthors <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getAuthenticator <em>Authenticator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getRelatesTos <em>Relates To</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getContents <em>Content</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DocumentReferenceImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceImpl extends DomainResourceImpl implements DocumentReference {
	/**
	 * The cached value of the '{@link #getMasterIdentifier() <em>Master Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier masterIdentifier;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept class_;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Author</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> authors;

	/**
	 * The cached value of the '{@link #getCustodian() <em>Custodian</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected Organization custodian;

	/**
	 * The cached value of the '{@link #getAuthenticator() <em>Authenticator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected Resource authenticator;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getIndexed() <em>Indexed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexed()
	 * @generated
	 * @ordered
	 */
	protected Instant indexed;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getDocStatus() <em>Doc Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept docStatus;

	/**
	 * The cached value of the '{@link #getRelatesTos() <em>Relates To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTos()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceRelatesTo> relatesTos;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getSecurityLabels() <em>Security Label</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> securityLabels;

	/**
	 * The cached value of the '{@link #getContents() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentReferenceContent> contents;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected DocumentReferenceContext context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDocumentReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getMasterIdentifier() {
		if (masterIdentifier != null && masterIdentifier.eIsProxy()) {
			InternalEObject oldMasterIdentifier = (InternalEObject)masterIdentifier;
			masterIdentifier = (Identifier)eResolveProxy(oldMasterIdentifier);
			if (masterIdentifier != oldMasterIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER, oldMasterIdentifier, masterIdentifier));
			}
		}
		return masterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetMasterIdentifier() {
		return masterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterIdentifier(Identifier newMasterIdentifier) {
		Identifier oldMasterIdentifier = masterIdentifier;
		masterIdentifier = newMasterIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER, oldMasterIdentifier, masterIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.DOCUMENT_REFERENCE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (CodeableConcept)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(CodeableConcept newClass) {
		CodeableConcept oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getAuthors() {
		if (authors == null) {
			authors = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.DOCUMENT_REFERENCE__AUTHOR);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getCustodian() {
		if (custodian != null && custodian.eIsProxy()) {
			InternalEObject oldCustodian = (InternalEObject)custodian;
			custodian = (Organization)eResolveProxy(oldCustodian);
			if (custodian != oldCustodian) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__CUSTODIAN, oldCustodian, custodian));
			}
		}
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetCustodian() {
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustodian(Organization newCustodian) {
		Organization oldCustodian = custodian;
		custodian = newCustodian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__CUSTODIAN, oldCustodian, custodian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAuthenticator() {
		if (authenticator != null && authenticator.eIsProxy()) {
			InternalEObject oldAuthenticator = (InternalEObject)authenticator;
			authenticator = (Resource)eResolveProxy(oldAuthenticator);
			if (authenticator != oldAuthenticator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__AUTHENTICATOR, oldAuthenticator, authenticator));
			}
		}
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAuthenticator() {
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticator(Resource newAuthenticator) {
		Resource oldAuthenticator = authenticator;
		authenticator = newAuthenticator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__AUTHENTICATOR, oldAuthenticator, authenticator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		if (created != null && created.eIsProxy()) {
			InternalEObject oldCreated = (InternalEObject)created;
			created = (DateTime)eResolveProxy(oldCreated);
			if (created != oldCreated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__CREATED, oldCreated, created));
			}
		}
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIndexed() {
		if (indexed != null && indexed.eIsProxy()) {
			InternalEObject oldIndexed = (InternalEObject)indexed;
			indexed = (Instant)eResolveProxy(oldIndexed);
			if (indexed != oldIndexed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__INDEXED, oldIndexed, indexed));
			}
		}
		return indexed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetIndexed() {
		return indexed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexed(Instant newIndexed) {
		Instant oldIndexed = indexed;
		indexed = newIndexed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__INDEXED, oldIndexed, indexed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDocStatus() {
		if (docStatus != null && docStatus.eIsProxy()) {
			InternalEObject oldDocStatus = (InternalEObject)docStatus;
			docStatus = (CodeableConcept)eResolveProxy(oldDocStatus);
			if (docStatus != oldDocStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__DOC_STATUS, oldDocStatus, docStatus));
			}
		}
		return docStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetDocStatus() {
		return docStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocStatus(CodeableConcept newDocStatus) {
		CodeableConcept oldDocStatus = docStatus;
		docStatus = newDocStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__DOC_STATUS, oldDocStatus, docStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentReferenceRelatesTo> getRelatesTos() {
		if (relatesTos == null) {
			relatesTos = new EObjectContainmentEList<DocumentReferenceRelatesTo>(DocumentReferenceRelatesTo.class, this, FhirResourcePackage.DOCUMENT_REFERENCE__RELATES_TO);
		}
		return relatesTos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DOCUMENT_REFERENCE__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSecurityLabels() {
		if (securityLabels == null) {
			securityLabels = new EObjectResolvingEList<CodeableConcept>(CodeableConcept.class, this, FhirResourcePackage.DOCUMENT_REFERENCE__SECURITY_LABEL);
		}
		return securityLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentReferenceContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<DocumentReferenceContent>(DocumentReferenceContent.class, this, FhirResourcePackage.DOCUMENT_REFERENCE__CONTENT);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferenceContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(DocumentReferenceContext newContext, NotificationChain msgs) {
		DocumentReferenceContext oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(DocumentReferenceContext newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.DOCUMENT_REFERENCE__RELATES_TO:
				return ((InternalEList<?>)getRelatesTos()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTENT:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT:
				return basicSetContext(null, msgs);
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
			case FhirResourcePackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				if (resolve) return getMasterIdentifier();
				return basicGetMasterIdentifier();
			case FhirResourcePackage.DOCUMENT_REFERENCE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.DOCUMENT_REFERENCE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.DOCUMENT_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.DOCUMENT_REFERENCE__CLASS:
				if (resolve) return getClass_();
				return basicGetClass_();
			case FhirResourcePackage.DOCUMENT_REFERENCE__AUTHOR:
				return getAuthors();
			case FhirResourcePackage.DOCUMENT_REFERENCE__CUSTODIAN:
				if (resolve) return getCustodian();
				return basicGetCustodian();
			case FhirResourcePackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				if (resolve) return getAuthenticator();
				return basicGetAuthenticator();
			case FhirResourcePackage.DOCUMENT_REFERENCE__CREATED:
				if (resolve) return getCreated();
				return basicGetCreated();
			case FhirResourcePackage.DOCUMENT_REFERENCE__INDEXED:
				if (resolve) return getIndexed();
				return basicGetIndexed();
			case FhirResourcePackage.DOCUMENT_REFERENCE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.DOCUMENT_REFERENCE__DOC_STATUS:
				if (resolve) return getDocStatus();
				return basicGetDocStatus();
			case FhirResourcePackage.DOCUMENT_REFERENCE__RELATES_TO:
				return getRelatesTos();
			case FhirResourcePackage.DOCUMENT_REFERENCE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				return getSecurityLabels();
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTENT:
				return getContents();
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT:
				return getContext();
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
			case FhirResourcePackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CLASS:
				setClass_((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__AUTHOR:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CUSTODIAN:
				setCustodian((Organization)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				setAuthenticator((Resource)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__INDEXED:
				setIndexed((Instant)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__DOC_STATUS:
				setDocStatus((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__RELATES_TO:
				getRelatesTos().clear();
				getRelatesTos().addAll((Collection<? extends DocumentReferenceRelatesTo>)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				getSecurityLabels().clear();
				getSecurityLabels().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTENT:
				getContents().clear();
				getContents().addAll((Collection<? extends DocumentReferenceContent>)newValue);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT:
				setContext((DocumentReferenceContext)newValue);
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
			case FhirResourcePackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				setMasterIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CLASS:
				setClass_((CodeableConcept)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__AUTHOR:
				getAuthors().clear();
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CUSTODIAN:
				setCustodian((Organization)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				setAuthenticator((Resource)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__INDEXED:
				setIndexed((Instant)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__DOC_STATUS:
				setDocStatus((CodeableConcept)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__RELATES_TO:
				getRelatesTos().clear();
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				getSecurityLabels().clear();
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTENT:
				getContents().clear();
				return;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT:
				setContext((DocumentReferenceContext)null);
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
			case FhirResourcePackage.DOCUMENT_REFERENCE__MASTER_IDENTIFIER:
				return masterIdentifier != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.DOCUMENT_REFERENCE__SUBJECT:
				return subject != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__TYPE:
				return type != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CLASS:
				return class_ != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__AUTHOR:
				return authors != null && !authors.isEmpty();
			case FhirResourcePackage.DOCUMENT_REFERENCE__CUSTODIAN:
				return custodian != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__AUTHENTICATOR:
				return authenticator != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__CREATED:
				return created != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__INDEXED:
				return indexed != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__STATUS:
				return status != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__DOC_STATUS:
				return docStatus != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__RELATES_TO:
				return relatesTos != null && !relatesTos.isEmpty();
			case FhirResourcePackage.DOCUMENT_REFERENCE__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.DOCUMENT_REFERENCE__SECURITY_LABEL:
				return securityLabels != null && !securityLabels.isEmpty();
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTENT:
				return contents != null && !contents.isEmpty();
			case FhirResourcePackage.DOCUMENT_REFERENCE__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceImpl
