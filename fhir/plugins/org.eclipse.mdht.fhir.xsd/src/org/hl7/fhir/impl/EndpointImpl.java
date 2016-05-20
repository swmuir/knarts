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

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getAddressUri <em>Address Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getAddressString <em>Address String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getPayloadFormat <em>Payload Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EndpointImpl#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointImpl extends DomainResourceImpl implements Endpoint {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EndpointStatus status;

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
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contact;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected Code connectionType;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> method;

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
	 * The cached value of the '{@link #getAddressUri() <em>Address Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUri()
	 * @generated
	 * @ordered
	 */
	protected Uri addressUri;

	/**
	 * The cached value of the '{@link #getAddressString() <em>Address String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String addressString;

	/**
	 * The cached value of the '{@link #getPayloadFormat() <em>Payload Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadFormat()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String payloadFormat;

	/**
	 * The cached value of the '{@link #getPayloadType() <em>Payload Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> payloadType;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> header;

	/**
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publicKey;

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
		return FhirPackage.eINSTANCE.getEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(EndpointStatus newStatus, NotificationChain msgs) {
		EndpointStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EndpointStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
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
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.ENDPOINT__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionType(Code newConnectionType, NotificationChain msgs) {
		Code oldConnectionType = connectionType;
		connectionType = newConnectionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__CONNECTION_TYPE, oldConnectionType, newConnectionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionType(Code newConnectionType) {
		if (newConnectionType != connectionType) {
			NotificationChain msgs = null;
			if (connectionType != null)
				msgs = ((InternalEObject)connectionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__CONNECTION_TYPE, null, msgs);
			if (newConnectionType != null)
				msgs = ((InternalEObject)newConnectionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__CONNECTION_TYPE, null, msgs);
			msgs = basicSetConnectionType(newConnectionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__CONNECTION_TYPE, newConnectionType, newConnectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.ENDPOINT__METHOD);
		}
		return method;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getAddressUri() {
		return addressUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressUri(Uri newAddressUri, NotificationChain msgs) {
		Uri oldAddressUri = addressUri;
		addressUri = newAddressUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__ADDRESS_URI, oldAddressUri, newAddressUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressUri(Uri newAddressUri) {
		if (newAddressUri != addressUri) {
			NotificationChain msgs = null;
			if (addressUri != null)
				msgs = ((InternalEObject)addressUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__ADDRESS_URI, null, msgs);
			if (newAddressUri != null)
				msgs = ((InternalEObject)newAddressUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__ADDRESS_URI, null, msgs);
			msgs = basicSetAddressUri(newAddressUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__ADDRESS_URI, newAddressUri, newAddressUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAddressString() {
		return addressString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressString(org.hl7.fhir.String newAddressString, NotificationChain msgs) {
		org.hl7.fhir.String oldAddressString = addressString;
		addressString = newAddressString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__ADDRESS_STRING, oldAddressString, newAddressString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressString(org.hl7.fhir.String newAddressString) {
		if (newAddressString != addressString) {
			NotificationChain msgs = null;
			if (addressString != null)
				msgs = ((InternalEObject)addressString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__ADDRESS_STRING, null, msgs);
			if (newAddressString != null)
				msgs = ((InternalEObject)newAddressString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__ADDRESS_STRING, null, msgs);
			msgs = basicSetAddressString(newAddressString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__ADDRESS_STRING, newAddressString, newAddressString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPayloadFormat() {
		return payloadFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayloadFormat(org.hl7.fhir.String newPayloadFormat, NotificationChain msgs) {
		org.hl7.fhir.String oldPayloadFormat = payloadFormat;
		payloadFormat = newPayloadFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__PAYLOAD_FORMAT, oldPayloadFormat, newPayloadFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadFormat(org.hl7.fhir.String newPayloadFormat) {
		if (newPayloadFormat != payloadFormat) {
			NotificationChain msgs = null;
			if (payloadFormat != null)
				msgs = ((InternalEObject)payloadFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__PAYLOAD_FORMAT, null, msgs);
			if (newPayloadFormat != null)
				msgs = ((InternalEObject)newPayloadFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__PAYLOAD_FORMAT, null, msgs);
			msgs = basicSetPayloadFormat(newPayloadFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__PAYLOAD_FORMAT, newPayloadFormat, newPayloadFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPayloadType() {
		if (payloadType == null) {
			payloadType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENDPOINT__PAYLOAD_TYPE);
		}
		return payloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getHeader() {
		if (header == null) {
			header = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.ENDPOINT__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicKey(org.hl7.fhir.String newPublicKey, NotificationChain msgs) {
		org.hl7.fhir.String oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__PUBLIC_KEY, oldPublicKey, newPublicKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicKey(org.hl7.fhir.String newPublicKey) {
		if (newPublicKey != publicKey) {
			NotificationChain msgs = null;
			if (publicKey != null)
				msgs = ((InternalEObject)publicKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__PUBLIC_KEY, null, msgs);
			if (newPublicKey != null)
				msgs = ((InternalEObject)newPublicKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENDPOINT__PUBLIC_KEY, null, msgs);
			msgs = basicSetPublicKey(newPublicKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENDPOINT__PUBLIC_KEY, newPublicKey, newPublicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENDPOINT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case FhirPackage.ENDPOINT__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				return basicSetConnectionType(null, msgs);
			case FhirPackage.ENDPOINT__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENDPOINT__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.ENDPOINT__ADDRESS_URI:
				return basicSetAddressUri(null, msgs);
			case FhirPackage.ENDPOINT__ADDRESS_STRING:
				return basicSetAddressString(null, msgs);
			case FhirPackage.ENDPOINT__PAYLOAD_FORMAT:
				return basicSetPayloadFormat(null, msgs);
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				return ((InternalEList<?>)getPayloadType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENDPOINT__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENDPOINT__PUBLIC_KEY:
				return basicSetPublicKey(null, msgs);
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
			case FhirPackage.ENDPOINT__STATUS:
				return getStatus();
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case FhirPackage.ENDPOINT__CONTACT:
				return getContact();
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				return getConnectionType();
			case FhirPackage.ENDPOINT__METHOD:
				return getMethod();
			case FhirPackage.ENDPOINT__PERIOD:
				return getPeriod();
			case FhirPackage.ENDPOINT__ADDRESS_URI:
				return getAddressUri();
			case FhirPackage.ENDPOINT__ADDRESS_STRING:
				return getAddressString();
			case FhirPackage.ENDPOINT__PAYLOAD_FORMAT:
				return getPayloadFormat();
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				return getPayloadType();
			case FhirPackage.ENDPOINT__HEADER:
				return getHeader();
			case FhirPackage.ENDPOINT__PUBLIC_KEY:
				return getPublicKey();
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
			case FhirPackage.ENDPOINT__STATUS:
				setStatus((EndpointStatus)newValue);
				return;
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case FhirPackage.ENDPOINT__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Code)newValue);
				return;
			case FhirPackage.ENDPOINT__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.ENDPOINT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.ENDPOINT__ADDRESS_URI:
				setAddressUri((Uri)newValue);
				return;
			case FhirPackage.ENDPOINT__ADDRESS_STRING:
				setAddressString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ENDPOINT__PAYLOAD_FORMAT:
				setPayloadFormat((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				getPayloadType().clear();
				getPayloadType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENDPOINT__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.ENDPOINT__PUBLIC_KEY:
				setPublicKey((org.hl7.fhir.String)newValue);
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
			case FhirPackage.ENDPOINT__STATUS:
				setStatus((EndpointStatus)null);
				return;
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case FhirPackage.ENDPOINT__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Code)null);
				return;
			case FhirPackage.ENDPOINT__METHOD:
				getMethod().clear();
				return;
			case FhirPackage.ENDPOINT__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.ENDPOINT__ADDRESS_URI:
				setAddressUri((Uri)null);
				return;
			case FhirPackage.ENDPOINT__ADDRESS_STRING:
				setAddressString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ENDPOINT__PAYLOAD_FORMAT:
				setPayloadFormat((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				getPayloadType().clear();
				return;
			case FhirPackage.ENDPOINT__HEADER:
				getHeader().clear();
				return;
			case FhirPackage.ENDPOINT__PUBLIC_KEY:
				setPublicKey((org.hl7.fhir.String)null);
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
			case FhirPackage.ENDPOINT__STATUS:
				return status != null;
			case FhirPackage.ENDPOINT__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case FhirPackage.ENDPOINT__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.ENDPOINT__CONNECTION_TYPE:
				return connectionType != null;
			case FhirPackage.ENDPOINT__METHOD:
				return method != null && !method.isEmpty();
			case FhirPackage.ENDPOINT__PERIOD:
				return period != null;
			case FhirPackage.ENDPOINT__ADDRESS_URI:
				return addressUri != null;
			case FhirPackage.ENDPOINT__ADDRESS_STRING:
				return addressString != null;
			case FhirPackage.ENDPOINT__PAYLOAD_FORMAT:
				return payloadFormat != null;
			case FhirPackage.ENDPOINT__PAYLOAD_TYPE:
				return payloadType != null && !payloadType.isEmpty();
			case FhirPackage.ENDPOINT__HEADER:
				return header != null && !header.isEmpty();
			case FhirPackage.ENDPOINT__PUBLIC_KEY:
				return publicKey != null;
		}
		return super.eIsSet(featureID);
	}

} //EndpointImpl
