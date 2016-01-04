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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfile;
import org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfileCodeSystem;
import org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfileContact;
import org.eclipse.mdht.uml.fhir.core.resource.ExpansionProfileDesignation;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getIncludeDesignations <em>Include Designations</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getIncludeDefinition <em>Include Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getIncludeInactive <em>Include Inactive</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getExcludeNested <em>Exclude Nested</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getExcludeNotForUi <em>Exclude Not For Ui</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getExcludePostCoordinated <em>Exclude Post Coordinated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getDisplayLanguage <em>Display Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExpansionProfileImpl#getLimitedExpansion <em>Limited Expansion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionProfileImpl extends DomainResourceImpl implements ExpansionProfile {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String version;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String name;

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
	 * The cached value of the '{@link #getExperimental() <em>Experimental</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimental()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean experimental;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String publisher;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionProfileContact> contacts;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

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
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileCodeSystem codeSystem;

	/**
	 * The cached value of the '{@link #getIncludeDesignations() <em>Include Designations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDesignations()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean includeDesignations;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected ExpansionProfileDesignation designation;

	/**
	 * The cached value of the '{@link #getIncludeDefinition() <em>Include Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDefinition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean includeDefinition;

	/**
	 * The cached value of the '{@link #getIncludeInactive() <em>Include Inactive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeInactive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean includeInactive;

	/**
	 * The cached value of the '{@link #getExcludeNested() <em>Exclude Nested</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeNested()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean excludeNested;

	/**
	 * The cached value of the '{@link #getExcludeNotForUi() <em>Exclude Not For Ui</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeNotForUi()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean excludeNotForUi;

	/**
	 * The cached value of the '{@link #getExcludePostCoordinated() <em>Exclude Post Coordinated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePostCoordinated()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean excludePostCoordinated;

	/**
	 * The cached value of the '{@link #getDisplayLanguage() <em>Display Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code displayLanguage;

	/**
	 * The cached value of the '{@link #getLimitedExpansion() <em>Limited Expansion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitedExpansion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean limitedExpansion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getExpansionProfile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.eclipse.mdht.uml.fhir.core.datatype.String newVersion) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.eclipse.mdht.uml.fhir.core.datatype.String newName) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getExperimental() {
		if (experimental != null && experimental.eIsProxy()) {
			InternalEObject oldExperimental = (InternalEObject)experimental;
			experimental = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldExperimental);
			if (experimental != oldExperimental) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__EXPERIMENTAL, oldExperimental, experimental));
			}
		}
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newExperimental) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__EXPERIMENTAL, oldExperimental, experimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.eclipse.mdht.uml.fhir.core.datatype.String newPublisher) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionProfileContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ExpansionProfileContact>(ExpansionProfileContact.class, this, FhirResourcePackage.EXPANSION_PROFILE__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		if (date != null && date.eIsProxy()) {
			InternalEObject oldDate = (InternalEObject)date;
			date = (DateTime)eResolveProxy(oldDate);
			if (date != oldDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__DATE, oldDate, date));
			}
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__DATE, oldDate, date));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileCodeSystem getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(ExpansionProfileCodeSystem newCodeSystem, NotificationChain msgs) {
		ExpansionProfileCodeSystem oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM, oldCodeSystem, newCodeSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(ExpansionProfileCodeSystem newCodeSystem) {
		if (newCodeSystem != codeSystem) {
			NotificationChain msgs = null;
			if (codeSystem != null)
				msgs = ((InternalEObject)codeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM, null, msgs);
			if (newCodeSystem != null)
				msgs = ((InternalEObject)newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM, null, msgs);
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM, newCodeSystem, newCodeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getIncludeDesignations() {
		if (includeDesignations != null && includeDesignations.eIsProxy()) {
			InternalEObject oldIncludeDesignations = (InternalEObject)includeDesignations;
			includeDesignations = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldIncludeDesignations);
			if (includeDesignations != oldIncludeDesignations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS, oldIncludeDesignations, includeDesignations));
			}
		}
		return includeDesignations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetIncludeDesignations() {
		return includeDesignations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeDesignations(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newIncludeDesignations) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldIncludeDesignations = includeDesignations;
		includeDesignations = newIncludeDesignations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS, oldIncludeDesignations, includeDesignations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionProfileDesignation getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignation(ExpansionProfileDesignation newDesignation, NotificationChain msgs) {
		ExpansionProfileDesignation oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION, oldDesignation, newDesignation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignation(ExpansionProfileDesignation newDesignation) {
		if (newDesignation != designation) {
			NotificationChain msgs = null;
			if (designation != null)
				msgs = ((InternalEObject)designation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION, null, msgs);
			if (newDesignation != null)
				msgs = ((InternalEObject)newDesignation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION, null, msgs);
			msgs = basicSetDesignation(newDesignation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION, newDesignation, newDesignation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getIncludeDefinition() {
		if (includeDefinition != null && includeDefinition.eIsProxy()) {
			InternalEObject oldIncludeDefinition = (InternalEObject)includeDefinition;
			includeDefinition = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldIncludeDefinition);
			if (includeDefinition != oldIncludeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DEFINITION, oldIncludeDefinition, includeDefinition));
			}
		}
		return includeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetIncludeDefinition() {
		return includeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeDefinition(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newIncludeDefinition) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldIncludeDefinition = includeDefinition;
		includeDefinition = newIncludeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DEFINITION, oldIncludeDefinition, includeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getIncludeInactive() {
		if (includeInactive != null && includeInactive.eIsProxy()) {
			InternalEObject oldIncludeInactive = (InternalEObject)includeInactive;
			includeInactive = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldIncludeInactive);
			if (includeInactive != oldIncludeInactive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_INACTIVE, oldIncludeInactive, includeInactive));
			}
		}
		return includeInactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetIncludeInactive() {
		return includeInactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeInactive(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newIncludeInactive) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldIncludeInactive = includeInactive;
		includeInactive = newIncludeInactive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_INACTIVE, oldIncludeInactive, includeInactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getExcludeNested() {
		if (excludeNested != null && excludeNested.eIsProxy()) {
			InternalEObject oldExcludeNested = (InternalEObject)excludeNested;
			excludeNested = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldExcludeNested);
			if (excludeNested != oldExcludeNested) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NESTED, oldExcludeNested, excludeNested));
			}
		}
		return excludeNested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetExcludeNested() {
		return excludeNested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeNested(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newExcludeNested) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldExcludeNested = excludeNested;
		excludeNested = newExcludeNested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NESTED, oldExcludeNested, excludeNested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getExcludeNotForUi() {
		if (excludeNotForUi != null && excludeNotForUi.eIsProxy()) {
			InternalEObject oldExcludeNotForUi = (InternalEObject)excludeNotForUi;
			excludeNotForUi = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldExcludeNotForUi);
			if (excludeNotForUi != oldExcludeNotForUi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI, oldExcludeNotForUi, excludeNotForUi));
			}
		}
		return excludeNotForUi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetExcludeNotForUi() {
		return excludeNotForUi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeNotForUi(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newExcludeNotForUi) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldExcludeNotForUi = excludeNotForUi;
		excludeNotForUi = newExcludeNotForUi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI, oldExcludeNotForUi, excludeNotForUi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getExcludePostCoordinated() {
		if (excludePostCoordinated != null && excludePostCoordinated.eIsProxy()) {
			InternalEObject oldExcludePostCoordinated = (InternalEObject)excludePostCoordinated;
			excludePostCoordinated = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldExcludePostCoordinated);
			if (excludePostCoordinated != oldExcludePostCoordinated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED, oldExcludePostCoordinated, excludePostCoordinated));
			}
		}
		return excludePostCoordinated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetExcludePostCoordinated() {
		return excludePostCoordinated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludePostCoordinated(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newExcludePostCoordinated) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldExcludePostCoordinated = excludePostCoordinated;
		excludePostCoordinated = newExcludePostCoordinated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED, oldExcludePostCoordinated, excludePostCoordinated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDisplayLanguage() {
		if (displayLanguage != null && displayLanguage.eIsProxy()) {
			InternalEObject oldDisplayLanguage = (InternalEObject)displayLanguage;
			displayLanguage = (Code)eResolveProxy(oldDisplayLanguage);
			if (displayLanguage != oldDisplayLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE, oldDisplayLanguage, displayLanguage));
			}
		}
		return displayLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetDisplayLanguage() {
		return displayLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLanguage(Code newDisplayLanguage) {
		Code oldDisplayLanguage = displayLanguage;
		displayLanguage = newDisplayLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE, oldDisplayLanguage, displayLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getLimitedExpansion() {
		if (limitedExpansion != null && limitedExpansion.eIsProxy()) {
			InternalEObject oldLimitedExpansion = (InternalEObject)limitedExpansion;
			limitedExpansion = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldLimitedExpansion);
			if (limitedExpansion != oldLimitedExpansion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPANSION_PROFILE__LIMITED_EXPANSION, oldLimitedExpansion, limitedExpansion));
			}
		}
		return limitedExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetLimitedExpansion() {
		return limitedExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitedExpansion(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newLimitedExpansion) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldLimitedExpansion = limitedExpansion;
		limitedExpansion = newLimitedExpansion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPANSION_PROFILE__LIMITED_EXPANSION, oldLimitedExpansion, limitedExpansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.EXPANSION_PROFILE__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION:
				return basicSetDesignation(null, msgs);
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
			case FhirResourcePackage.EXPANSION_PROFILE__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.EXPANSION_PROFILE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.EXPANSION_PROFILE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.EXPANSION_PROFILE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case FhirResourcePackage.EXPANSION_PROFILE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.EXPANSION_PROFILE__EXPERIMENTAL:
				if (resolve) return getExperimental();
				return basicGetExperimental();
			case FhirResourcePackage.EXPANSION_PROFILE__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case FhirResourcePackage.EXPANSION_PROFILE__CONTACT:
				return getContacts();
			case FhirResourcePackage.EXPANSION_PROFILE__DATE:
				if (resolve) return getDate();
				return basicGetDate();
			case FhirResourcePackage.EXPANSION_PROFILE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM:
				return getCodeSystem();
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				if (resolve) return getIncludeDesignations();
				return basicGetIncludeDesignations();
			case FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION:
				return getDesignation();
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				if (resolve) return getIncludeDefinition();
				return basicGetIncludeDefinition();
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				if (resolve) return getIncludeInactive();
				return basicGetIncludeInactive();
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				if (resolve) return getExcludeNested();
				return basicGetExcludeNested();
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				if (resolve) return getExcludeNotForUi();
				return basicGetExcludeNotForUi();
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				if (resolve) return getExcludePostCoordinated();
				return basicGetExcludePostCoordinated();
			case FhirResourcePackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				if (resolve) return getDisplayLanguage();
				return basicGetDisplayLanguage();
			case FhirResourcePackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				if (resolve) return getLimitedExpansion();
				return basicGetLimitedExpansion();
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
			case FhirResourcePackage.EXPANSION_PROFILE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ExpansionProfileContact>)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM:
				setCodeSystem((ExpansionProfileCodeSystem)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				setIncludeDesignations((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION:
				setDesignation((ExpansionProfileDesignation)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				setIncludeDefinition((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				setIncludeInactive((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				setExcludeNested((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				setExcludeNotForUi((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				setExcludePostCoordinated((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				setDisplayLanguage((Code)newValue);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				setLimitedExpansion((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
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
			case FhirResourcePackage.EXPANSION_PROFILE__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__NAME:
				setName((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__EXPERIMENTAL:
				setExperimental((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__PUBLISHER:
				setPublisher((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__CONTACT:
				getContacts().clear();
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__DATE:
				setDate((DateTime)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM:
				setCodeSystem((ExpansionProfileCodeSystem)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				setIncludeDesignations((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION:
				setDesignation((ExpansionProfileDesignation)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				setIncludeDefinition((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				setIncludeInactive((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				setExcludeNested((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				setExcludeNotForUi((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				setExcludePostCoordinated((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				setDisplayLanguage((Code)null);
				return;
			case FhirResourcePackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				setLimitedExpansion((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
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
			case FhirResourcePackage.EXPANSION_PROFILE__URL:
				return url != null;
			case FhirResourcePackage.EXPANSION_PROFILE__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.EXPANSION_PROFILE__VERSION:
				return version != null;
			case FhirResourcePackage.EXPANSION_PROFILE__NAME:
				return name != null;
			case FhirResourcePackage.EXPANSION_PROFILE__STATUS:
				return status != null;
			case FhirResourcePackage.EXPANSION_PROFILE__EXPERIMENTAL:
				return experimental != null;
			case FhirResourcePackage.EXPANSION_PROFILE__PUBLISHER:
				return publisher != null;
			case FhirResourcePackage.EXPANSION_PROFILE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case FhirResourcePackage.EXPANSION_PROFILE__DATE:
				return date != null;
			case FhirResourcePackage.EXPANSION_PROFILE__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.EXPANSION_PROFILE__CODE_SYSTEM:
				return codeSystem != null;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DESIGNATIONS:
				return includeDesignations != null;
			case FhirResourcePackage.EXPANSION_PROFILE__DESIGNATION:
				return designation != null;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_DEFINITION:
				return includeDefinition != null;
			case FhirResourcePackage.EXPANSION_PROFILE__INCLUDE_INACTIVE:
				return includeInactive != null;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NESTED:
				return excludeNested != null;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_NOT_FOR_UI:
				return excludeNotForUi != null;
			case FhirResourcePackage.EXPANSION_PROFILE__EXCLUDE_POST_COORDINATED:
				return excludePostCoordinated != null;
			case FhirResourcePackage.EXPANSION_PROFILE__DISPLAY_LANGUAGE:
				return displayLanguage != null;
			case FhirResourcePackage.EXPANSION_PROFILE__LIMITED_EXPANSION:
				return limitedExpansion != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpansionProfileImpl
