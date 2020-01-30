/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Url;

import fhiRCore.resources.Endpoint;
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
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getPayloadTypes <em>Payload Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getPayloadMimeTypes <em>Payload Mime Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EndpointImpl#getHeaders <em>Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointImpl extends DomainResourceImpl implements Endpoint {
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
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected Coding connectionType;

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
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference managingOrganization;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contacts;

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
	 * The cached value of the '{@link #getPayloadTypes() <em>Payload Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> payloadTypes;

	/**
	 * The cached value of the '{@link #getPayloadMimeTypes() <em>Payload Mime Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadMimeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> payloadMimeTypes;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Url address;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> headers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.ENDPOINT__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionType(Coding newConnectionType, NotificationChain msgs) {
		Coding oldConnectionType = connectionType;
		connectionType = newConnectionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__CONNECTION_TYPE, oldConnectionType, newConnectionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionType(Coding newConnectionType) {
		if (newConnectionType != connectionType) {
			NotificationChain msgs = null;
			if (connectionType != null)
				msgs = ((InternalEObject)connectionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__CONNECTION_TYPE, null, msgs);
			if (newConnectionType != null)
				msgs = ((InternalEObject)newConnectionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__CONNECTION_TYPE, null, msgs);
			msgs = basicSetConnectionType(newConnectionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__CONNECTION_TYPE, newConnectionType, newConnectionType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getManagingOrganization() {
		return managingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagingOrganization(Reference newManagingOrganization, NotificationChain msgs) {
		Reference oldManagingOrganization = managingOrganization;
		managingOrganization = newManagingOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagingOrganization(Reference newManagingOrganization) {
		if (newManagingOrganization != managingOrganization) {
			NotificationChain msgs = null;
			if (managingOrganization != null)
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.ENDPOINT__CONTACT);
		}
		return contacts;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPayloadTypes() {
		if (payloadTypes == null) {
			payloadTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.ENDPOINT__PAYLOAD_TYPE);
		}
		return payloadTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getPayloadMimeTypes() {
		if (payloadMimeTypes == null) {
			payloadMimeTypes = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE);
		}
		return payloadMimeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Url newAddress, NotificationChain msgs) {
		Url oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Url newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENDPOINT__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENDPOINT__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.ENDPOINT__HEADER);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENDPOINT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				return basicSetConnectionType(null, msgs);
			case ResourcesPackage.ENDPOINT__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case ResourcesPackage.ENDPOINT__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENDPOINT__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				return ((InternalEList<?>)getPayloadTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				return ((InternalEList<?>)getPayloadMimeTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENDPOINT__ADDRESS:
				return basicSetAddress(null, msgs);
			case ResourcesPackage.ENDPOINT__HEADER:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ENDPOINT__STATUS:
				return getStatus();
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				return getConnectionType();
			case ResourcesPackage.ENDPOINT__NAME:
				return getName();
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case ResourcesPackage.ENDPOINT__CONTACT:
				return getContacts();
			case ResourcesPackage.ENDPOINT__PERIOD:
				return getPeriod();
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				return getPayloadTypes();
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				return getPayloadMimeTypes();
			case ResourcesPackage.ENDPOINT__ADDRESS:
				return getAddress();
			case ResourcesPackage.ENDPOINT__HEADER:
				return getHeaders();
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
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Coding)newValue);
				return;
			case ResourcesPackage.ENDPOINT__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case ResourcesPackage.ENDPOINT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				getPayloadTypes().clear();
				getPayloadTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				getPayloadMimeTypes().clear();
				getPayloadMimeTypes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.ENDPOINT__ADDRESS:
				setAddress((Url)newValue);
				return;
			case ResourcesPackage.ENDPOINT__HEADER:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
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
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ENDPOINT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Coding)null);
				return;
			case ResourcesPackage.ENDPOINT__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case ResourcesPackage.ENDPOINT__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.ENDPOINT__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				getPayloadTypes().clear();
				return;
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				getPayloadMimeTypes().clear();
				return;
			case ResourcesPackage.ENDPOINT__ADDRESS:
				setAddress((Url)null);
				return;
			case ResourcesPackage.ENDPOINT__HEADER:
				getHeaders().clear();
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
			case ResourcesPackage.ENDPOINT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ENDPOINT__STATUS:
				return status != null;
			case ResourcesPackage.ENDPOINT__CONNECTION_TYPE:
				return connectionType != null;
			case ResourcesPackage.ENDPOINT__NAME:
				return name != null;
			case ResourcesPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case ResourcesPackage.ENDPOINT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.ENDPOINT__PERIOD:
				return period != null;
			case ResourcesPackage.ENDPOINT__PAYLOAD_TYPE:
				return payloadTypes != null && !payloadTypes.isEmpty();
			case ResourcesPackage.ENDPOINT__PAYLOAD_MIME_TYPE:
				return payloadMimeTypes != null && !payloadMimeTypes.isEmpty();
			case ResourcesPackage.ENDPOINT__ADDRESS:
				return address != null;
			case ResourcesPackage.ENDPOINT__HEADER:
				return headers != null && !headers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndpointImpl
