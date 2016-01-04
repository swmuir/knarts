/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ModuleDefinitionLibrary;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Definition Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionLibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionLibraryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionLibraryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionLibraryImpl#getDocumentAttachment <em>Document Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleDefinitionLibraryImpl#getDocumentReference <em>Document Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDefinitionLibraryImpl extends BackboneElementImpl implements ModuleDefinitionLibrary {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getDocumentAttachment() <em>Document Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment documentAttachment;

	/**
	 * The cached value of the '{@link #getDocumentReference() <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected Reference documentReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDefinitionLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getModuleDefinitionLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(org.hl7.fhir.String newIdentifier, NotificationChain msgs) {
		org.hl7.fhir.String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(org.hl7.fhir.String newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getDocumentAttachment() {
		return documentAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentAttachment(Attachment newDocumentAttachment, NotificationChain msgs) {
		Attachment oldDocumentAttachment = documentAttachment;
		documentAttachment = newDocumentAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT, oldDocumentAttachment, newDocumentAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentAttachment(Attachment newDocumentAttachment) {
		if (newDocumentAttachment != documentAttachment) {
			NotificationChain msgs = null;
			if (documentAttachment != null)
				msgs = ((InternalEObject)documentAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT, null, msgs);
			if (newDocumentAttachment != null)
				msgs = ((InternalEObject)newDocumentAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT, null, msgs);
			msgs = basicSetDocumentAttachment(newDocumentAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT, newDocumentAttachment, newDocumentAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDocumentReference() {
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentReference(Reference newDocumentReference, NotificationChain msgs) {
		Reference oldDocumentReference = documentReference;
		documentReference = newDocumentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE, oldDocumentReference, newDocumentReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentReference(Reference newDocumentReference) {
		if (newDocumentReference != documentReference) {
			NotificationChain msgs = null;
			if (documentReference != null)
				msgs = ((InternalEObject)documentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE, null, msgs);
			if (newDocumentReference != null)
				msgs = ((InternalEObject)newDocumentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE, null, msgs);
			msgs = basicSetDocumentReference(newDocumentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE, newDocumentReference, newDocumentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MODULE_DEFINITION_LIBRARY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT:
				return basicSetDocumentAttachment(null, msgs);
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE:
				return basicSetDocumentReference(null, msgs);
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
			case FhirPackage.MODULE_DEFINITION_LIBRARY__NAME:
				return getName();
			case FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION:
				return getVersion();
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT:
				return getDocumentAttachment();
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE:
				return getDocumentReference();
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
			case FhirPackage.MODULE_DEFINITION_LIBRARY__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER:
				setIdentifier((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT:
				setDocumentAttachment((Attachment)newValue);
				return;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE:
				setDocumentReference((Reference)newValue);
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
			case FhirPackage.MODULE_DEFINITION_LIBRARY__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER:
				setIdentifier((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT:
				setDocumentAttachment((Attachment)null);
				return;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE:
				setDocumentReference((Reference)null);
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
			case FhirPackage.MODULE_DEFINITION_LIBRARY__NAME:
				return name != null;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__VERSION:
				return version != null;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_ATTACHMENT:
				return documentAttachment != null;
			case FhirPackage.MODULE_DEFINITION_LIBRARY__DOCUMENT_REFERENCE:
				return documentReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleDefinitionLibraryImpl
