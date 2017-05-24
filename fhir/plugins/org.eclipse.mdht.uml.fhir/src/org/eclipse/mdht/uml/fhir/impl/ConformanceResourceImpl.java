/**
 */
package org.eclipse.mdht.uml.fhir.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.ConformanceResource;
import org.eclipse.mdht.uml.fhir.FHIRPackage;

import org.eclipse.mdht.uml.fhir.types.CodeableConcept;
import org.eclipse.mdht.uml.fhir.types.ContactDetail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformace Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#isExperimental <em>Experimental</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConformanceResourceImpl extends ElementImpl implements ConformanceResource {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isExperimental() <em>Experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExperimental()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPERIMENTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExperimental() <em>Experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExperimental()
	 * @generated
	 * @ordered
	 */
	protected boolean experimental = EXPERIMENTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected String publisher = PUBLISHER_EDEFAULT;

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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUseContexts() <em>Use Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> useContexts;

	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.Literals.CONFORMANCE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONFORMANCE_RESOURCE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONFORMANCE_RESOURCE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONFORMANCE_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONFORMANCE_RESOURCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExperimental() {
		return experimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimental(boolean newExperimental) {
		boolean oldExperimental = experimental;
		experimental = newExperimental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONFORMANCE_RESOURCE__EXPERIMENTAL, oldExperimental, experimental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(String newPublisher) {
		String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONFORMANCE_RESOURCE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactDetail> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactDetail>(ContactDetail.class, this, FHIRPackage.CONFORMANCE_RESOURCE__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONFORMANCE_RESOURCE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getUseContexts() {
		if (useContexts == null) {
			useContexts = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.CONFORMANCE_RESOURCE__USE_CONTEXT);
		}
		return useContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.CONFORMANCE_RESOURCE__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.CONFORMANCE_RESOURCE__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case FHIRPackage.CONFORMANCE_RESOURCE__USE_CONTEXT:
				return ((InternalEList<?>)getUseContexts()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.CONFORMANCE_RESOURCE__URI:
				return getUri();
			case FHIRPackage.CONFORMANCE_RESOURCE__VERSION:
				return getVersion();
			case FHIRPackage.CONFORMANCE_RESOURCE__NAME:
				return getName();
			case FHIRPackage.CONFORMANCE_RESOURCE__STATUS:
				return getStatus();
			case FHIRPackage.CONFORMANCE_RESOURCE__EXPERIMENTAL:
				return isExperimental();
			case FHIRPackage.CONFORMANCE_RESOURCE__PUBLISHER:
				return getPublisher();
			case FHIRPackage.CONFORMANCE_RESOURCE__CONTACT:
				return getContacts();
			case FHIRPackage.CONFORMANCE_RESOURCE__DATE:
				return getDate();
			case FHIRPackage.CONFORMANCE_RESOURCE__USE_CONTEXT:
				return getUseContexts();
			case FHIRPackage.CONFORMANCE_RESOURCE__COPYRIGHT:
				return getCopyright();
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
			case FHIRPackage.CONFORMANCE_RESOURCE__URI:
				setUri((String)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__VERSION:
				setVersion((String)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__STATUS:
				setStatus((String)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__EXPERIMENTAL:
				setExperimental((Boolean)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__PUBLISHER:
				setPublisher((String)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactDetail>)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__DATE:
				setDate((Date)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__USE_CONTEXT:
				getUseContexts().clear();
				getUseContexts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__COPYRIGHT:
				setCopyright((String)newValue);
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
			case FHIRPackage.CONFORMANCE_RESOURCE__URI:
				setUri(URI_EDEFAULT);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__EXPERIMENTAL:
				setExperimental(EXPERIMENTAL_EDEFAULT);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__PUBLISHER:
				setPublisher(PUBLISHER_EDEFAULT);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__CONTACT:
				getContacts().clear();
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__USE_CONTEXT:
				getUseContexts().clear();
				return;
			case FHIRPackage.CONFORMANCE_RESOURCE__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
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
			case FHIRPackage.CONFORMANCE_RESOURCE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case FHIRPackage.CONFORMANCE_RESOURCE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case FHIRPackage.CONFORMANCE_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FHIRPackage.CONFORMANCE_RESOURCE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case FHIRPackage.CONFORMANCE_RESOURCE__EXPERIMENTAL:
				return experimental != EXPERIMENTAL_EDEFAULT;
			case FHIRPackage.CONFORMANCE_RESOURCE__PUBLISHER:
				return PUBLISHER_EDEFAULT == null ? publisher != null : !PUBLISHER_EDEFAULT.equals(publisher);
			case FHIRPackage.CONFORMANCE_RESOURCE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case FHIRPackage.CONFORMANCE_RESOURCE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case FHIRPackage.CONFORMANCE_RESOURCE__USE_CONTEXT:
				return useContexts != null && !useContexts.isEmpty();
			case FHIRPackage.CONFORMANCE_RESOURCE__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(", version: ");
		result.append(version);
		result.append(", name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", experimental: ");
		result.append(experimental);
		result.append(", publisher: ");
		result.append(publisher);
		result.append(", date: ");
		result.append(date);
		result.append(", copyright: ");
		result.append(copyright);
		result.append(')');
		return result.toString();
	}

} //ConformanceResourceImpl
