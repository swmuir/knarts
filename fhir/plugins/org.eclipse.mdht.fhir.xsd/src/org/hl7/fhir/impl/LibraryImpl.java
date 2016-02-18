/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Library;
import org.hl7.fhir.ModuleMetadata;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getModuleDefinition <em>Module Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.LibraryImpl#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends DomainResourceImpl implements Library {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

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
	 * The cached value of the '{@link #getModuleMetadata() <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMetadata()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadata moduleMetadata;

	/**
	 * The cached value of the '{@link #getModuleDefinition() <em>Module Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleDefinition()
	 * @generated
	 * @ordered
	 */
	protected Reference moduleDefinition;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Attachment document;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.LIBRARY__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadata getModuleMetadata() {
		return moduleMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleMetadata(ModuleMetadata newModuleMetadata, NotificationChain msgs) {
		ModuleMetadata oldModuleMetadata = moduleMetadata;
		moduleMetadata = newModuleMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__MODULE_METADATA, oldModuleMetadata, newModuleMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleMetadata(ModuleMetadata newModuleMetadata) {
		if (newModuleMetadata != moduleMetadata) {
			NotificationChain msgs = null;
			if (moduleMetadata != null)
				msgs = ((InternalEObject)moduleMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__MODULE_METADATA, null, msgs);
			if (newModuleMetadata != null)
				msgs = ((InternalEObject)newModuleMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__MODULE_METADATA, null, msgs);
			msgs = basicSetModuleMetadata(newModuleMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__MODULE_METADATA, newModuleMetadata, newModuleMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getModuleDefinition() {
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleDefinition(Reference newModuleDefinition, NotificationChain msgs) {
		Reference oldModuleDefinition = moduleDefinition;
		moduleDefinition = newModuleDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__MODULE_DEFINITION, oldModuleDefinition, newModuleDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleDefinition(Reference newModuleDefinition) {
		if (newModuleDefinition != moduleDefinition) {
			NotificationChain msgs = null;
			if (moduleDefinition != null)
				msgs = ((InternalEObject)moduleDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__MODULE_DEFINITION, null, msgs);
			if (newModuleDefinition != null)
				msgs = ((InternalEObject)newModuleDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__MODULE_DEFINITION, null, msgs);
			msgs = basicSetModuleDefinition(newModuleDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__MODULE_DEFINITION, newModuleDefinition, newModuleDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Attachment newDocument, NotificationChain msgs) {
		Attachment oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Attachment newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.LIBRARY__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.LIBRARY__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.LIBRARY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.LIBRARY__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.LIBRARY__MODULE_METADATA:
				return basicSetModuleMetadata(null, msgs);
			case FhirPackage.LIBRARY__MODULE_DEFINITION:
				return basicSetModuleDefinition(null, msgs);
			case FhirPackage.LIBRARY__DOCUMENT:
				return basicSetDocument(null, msgs);
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
			case FhirPackage.LIBRARY__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.LIBRARY__VERSION:
				return getVersion();
			case FhirPackage.LIBRARY__MODULE_METADATA:
				return getModuleMetadata();
			case FhirPackage.LIBRARY__MODULE_DEFINITION:
				return getModuleDefinition();
			case FhirPackage.LIBRARY__DOCUMENT:
				return getDocument();
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
			case FhirPackage.LIBRARY__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.LIBRARY__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.LIBRARY__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)newValue);
				return;
			case FhirPackage.LIBRARY__MODULE_DEFINITION:
				setModuleDefinition((Reference)newValue);
				return;
			case FhirPackage.LIBRARY__DOCUMENT:
				setDocument((Attachment)newValue);
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
			case FhirPackage.LIBRARY__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.LIBRARY__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.LIBRARY__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)null);
				return;
			case FhirPackage.LIBRARY__MODULE_DEFINITION:
				setModuleDefinition((Reference)null);
				return;
			case FhirPackage.LIBRARY__DOCUMENT:
				setDocument((Attachment)null);
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
			case FhirPackage.LIBRARY__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.LIBRARY__VERSION:
				return version != null;
			case FhirPackage.LIBRARY__MODULE_METADATA:
				return moduleMetadata != null;
			case FhirPackage.LIBRARY__MODULE_DEFINITION:
				return moduleDefinition != null;
			case FhirPackage.LIBRARY__DOCUMENT:
				return document != null;
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
