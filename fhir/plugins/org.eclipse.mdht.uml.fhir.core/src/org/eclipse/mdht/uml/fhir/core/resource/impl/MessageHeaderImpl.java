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

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.MessageHeader;
import org.eclipse.mdht.uml.fhir.core.resource.MessageHeaderMessageDestination;
import org.eclipse.mdht.uml.fhir.core.resource.MessageHeaderMessageSource;
import org.eclipse.mdht.uml.fhir.core.resource.MessageHeaderResponse;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getDestinations <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.MessageHeaderImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageHeaderImpl extends DomainResourceImpl implements MessageHeader {
	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Instant timestamp;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Coding event;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected MessageHeaderResponse response;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MessageHeaderMessageSource source;

	/**
	 * The cached value of the '{@link #getDestinations() <em>Destination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageHeaderMessageDestination> destinations;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Practitioner enterer;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Practitioner author;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Resource receiver;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Resource responsible;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getMessageHeader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getTimestamp() {
		if (timestamp != null && timestamp.eIsProxy()) {
			InternalEObject oldTimestamp = (InternalEObject)timestamp;
			timestamp = (Instant)eResolveProxy(oldTimestamp);
			if (timestamp != oldTimestamp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MESSAGE_HEADER__TIMESTAMP, oldTimestamp, timestamp));
			}
		}
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Instant newTimestamp) {
		Instant oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (Coding)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MESSAGE_HEADER__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Coding newEvent) {
		Coding oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderResponse getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(MessageHeaderResponse newResponse, NotificationChain msgs) {
		MessageHeaderResponse oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(MessageHeaderResponse newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MESSAGE_HEADER__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MESSAGE_HEADER__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeaderMessageSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(MessageHeaderMessageSource newSource, NotificationChain msgs) {
		MessageHeaderMessageSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MessageHeaderMessageSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MESSAGE_HEADER__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.MESSAGE_HEADER__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageHeaderMessageDestination> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectContainmentEList<MessageHeaderMessageDestination>(MessageHeaderMessageDestination.class, this, FhirResourcePackage.MESSAGE_HEADER__DESTINATION);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getEnterer() {
		if (enterer != null && enterer.eIsProxy()) {
			InternalEObject oldEnterer = (InternalEObject)enterer;
			enterer = (Practitioner)eResolveProxy(oldEnterer);
			if (enterer != oldEnterer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MESSAGE_HEADER__ENTERER, oldEnterer, enterer));
			}
		}
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterer(Practitioner newEnterer) {
		Practitioner oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__ENTERER, oldEnterer, enterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Practitioner)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MESSAGE_HEADER__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Practitioner newAuthor) {
		Practitioner oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (Resource)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MESSAGE_HEADER__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Resource newReceiver) {
		Resource oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (Resource)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MESSAGE_HEADER__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(Resource newResponsible) {
		Resource oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		if (reason != null && reason.eIsProxy()) {
			InternalEObject oldReason = (InternalEObject)reason;
			reason = (CodeableConcept)eResolveProxy(oldReason);
			if (reason != oldReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.MESSAGE_HEADER__REASON, oldReason, reason));
			}
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.MESSAGE_HEADER__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.MESSAGE_HEADER__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSE:
				return basicSetResponse(null, msgs);
			case FhirResourcePackage.MESSAGE_HEADER__SOURCE:
				return basicSetSource(null, msgs);
			case FhirResourcePackage.MESSAGE_HEADER__DESTINATION:
				return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.MESSAGE_HEADER__TIMESTAMP:
				if (resolve) return getTimestamp();
				return basicGetTimestamp();
			case FhirResourcePackage.MESSAGE_HEADER__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSE:
				return getResponse();
			case FhirResourcePackage.MESSAGE_HEADER__SOURCE:
				return getSource();
			case FhirResourcePackage.MESSAGE_HEADER__DESTINATION:
				return getDestinations();
			case FhirResourcePackage.MESSAGE_HEADER__ENTERER:
				if (resolve) return getEnterer();
				return basicGetEnterer();
			case FhirResourcePackage.MESSAGE_HEADER__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case FhirResourcePackage.MESSAGE_HEADER__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case FhirResourcePackage.MESSAGE_HEADER__REASON:
				if (resolve) return getReason();
				return basicGetReason();
			case FhirResourcePackage.MESSAGE_HEADER__DATA:
				return getData();
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
			case FhirResourcePackage.MESSAGE_HEADER__TIMESTAMP:
				setTimestamp((Instant)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__EVENT:
				setEvent((Coding)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSE:
				setResponse((MessageHeaderResponse)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__SOURCE:
				setSource((MessageHeaderMessageSource)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__DESTINATION:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends MessageHeaderMessageDestination>)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__ENTERER:
				setEnterer((Practitioner)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__AUTHOR:
				setAuthor((Practitioner)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__RECEIVER:
				setReceiver((Resource)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSIBLE:
				setResponsible((Resource)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Resource>)newValue);
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
			case FhirResourcePackage.MESSAGE_HEADER__TIMESTAMP:
				setTimestamp((Instant)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__EVENT:
				setEvent((Coding)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSE:
				setResponse((MessageHeaderResponse)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__SOURCE:
				setSource((MessageHeaderMessageSource)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__DESTINATION:
				getDestinations().clear();
				return;
			case FhirResourcePackage.MESSAGE_HEADER__ENTERER:
				setEnterer((Practitioner)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__AUTHOR:
				setAuthor((Practitioner)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__RECEIVER:
				setReceiver((Resource)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSIBLE:
				setResponsible((Resource)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__REASON:
				setReason((CodeableConcept)null);
				return;
			case FhirResourcePackage.MESSAGE_HEADER__DATA:
				getData().clear();
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
			case FhirResourcePackage.MESSAGE_HEADER__TIMESTAMP:
				return timestamp != null;
			case FhirResourcePackage.MESSAGE_HEADER__EVENT:
				return event != null;
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSE:
				return response != null;
			case FhirResourcePackage.MESSAGE_HEADER__SOURCE:
				return source != null;
			case FhirResourcePackage.MESSAGE_HEADER__DESTINATION:
				return destinations != null && !destinations.isEmpty();
			case FhirResourcePackage.MESSAGE_HEADER__ENTERER:
				return enterer != null;
			case FhirResourcePackage.MESSAGE_HEADER__AUTHOR:
				return author != null;
			case FhirResourcePackage.MESSAGE_HEADER__RECEIVER:
				return receiver != null;
			case FhirResourcePackage.MESSAGE_HEADER__RESPONSIBLE:
				return responsible != null;
			case FhirResourcePackage.MESSAGE_HEADER__REASON:
				return reason != null;
			case FhirResourcePackage.MESSAGE_HEADER__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageHeaderImpl
