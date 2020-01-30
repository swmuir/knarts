/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.MessageDefinition;
import fhiRCore.resources.MessageHeader;
import fhiRCore.resources.MessageHeaderMessageDestination;
import fhiRCore.resources.MessageHeaderMessageSource;
import fhiRCore.resources.MessageHeaderResponse;
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
 * An implementation of the model object '<em><b>Message Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getEventx <em>Eventx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getDestinations <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getFoci <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MessageHeaderImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageHeaderImpl extends DomainResourceImpl implements MessageHeader {
	/**
	 * The cached value of the '{@link #getEventx() <em>Eventx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventx()
	 * @generated
	 * @ordered
	 */
	protected DataType eventx;

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
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Reference sender;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Reference enterer;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Reference author;

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
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Reference responsible;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept reason;

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
	 * The cached value of the '{@link #getFoci() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoci()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> foci;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected MessageDefinition definition;

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
		return ResourcesPackage.eINSTANCE.getMessageHeader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getEventx() {
		return eventx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventx(DataType newEventx, NotificationChain msgs) {
		DataType oldEventx = eventx;
		eventx = newEventx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__EVENTX, oldEventx, newEventx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventx(DataType newEventx) {
		if (newEventx != eventx) {
			NotificationChain msgs = null;
			if (eventx != null)
				msgs = ((InternalEObject)eventx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__EVENTX, null, msgs);
			if (newEventx != null)
				msgs = ((InternalEObject)newEventx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__EVENTX, null, msgs);
			msgs = basicSetEventx(newEventx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__EVENTX, newEventx, newEventx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageHeaderMessageDestination> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectContainmentEList<MessageHeaderMessageDestination>(MessageHeaderMessageDestination.class, this, ResourcesPackage.MESSAGE_HEADER__DESTINATION);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Reference newSender, NotificationChain msgs) {
		Reference oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Reference newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterer(Reference newEnterer, NotificationChain msgs) {
		Reference oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__ENTERER, oldEnterer, newEnterer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterer(Reference newEnterer) {
		if (newEnterer != enterer) {
			NotificationChain msgs = null;
			if (enterer != null)
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__ENTERER, newEnterer, newEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Reference newAuthor, NotificationChain msgs) {
		Reference oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Reference newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__AUTHOR, newAuthor, newAuthor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(Reference newResponsible, NotificationChain msgs) {
		Reference oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE, oldResponsible, newResponsible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(Reference newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(CodeableConcept newReason, NotificationChain msgs) {
		CodeableConcept oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(CodeableConcept newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__REASON, newReason, newReason));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__RESPONSE, oldResponse, newResponse);
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
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getFoci() {
		if (foci == null) {
			foci = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MESSAGE_HEADER__FOCUS);
		}
		return foci;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(MessageDefinition newDefinition, NotificationChain msgs) {
		MessageDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(MessageDefinition newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MESSAGE_HEADER__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MESSAGE_HEADER__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MESSAGE_HEADER__EVENTX:
				return basicSetEventx(null, msgs);
			case ResourcesPackage.MESSAGE_HEADER__DESTINATION:
				return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_HEADER__SENDER:
				return basicSetSender(null, msgs);
			case ResourcesPackage.MESSAGE_HEADER__ENTERER:
				return basicSetEnterer(null, msgs);
			case ResourcesPackage.MESSAGE_HEADER__AUTHOR:
				return basicSetAuthor(null, msgs);
			case ResourcesPackage.MESSAGE_HEADER__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE:
				return basicSetResponsible(null, msgs);
			case ResourcesPackage.MESSAGE_HEADER__REASON:
				return basicSetReason(null, msgs);
			case ResourcesPackage.MESSAGE_HEADER__RESPONSE:
				return basicSetResponse(null, msgs);
			case ResourcesPackage.MESSAGE_HEADER__FOCUS:
				return ((InternalEList<?>)getFoci()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MESSAGE_HEADER__DEFINITION:
				return basicSetDefinition(null, msgs);
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
			case ResourcesPackage.MESSAGE_HEADER__EVENTX:
				return getEventx();
			case ResourcesPackage.MESSAGE_HEADER__DESTINATION:
				return getDestinations();
			case ResourcesPackage.MESSAGE_HEADER__SENDER:
				return getSender();
			case ResourcesPackage.MESSAGE_HEADER__ENTERER:
				return getEnterer();
			case ResourcesPackage.MESSAGE_HEADER__AUTHOR:
				return getAuthor();
			case ResourcesPackage.MESSAGE_HEADER__SOURCE:
				return getSource();
			case ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE:
				return getResponsible();
			case ResourcesPackage.MESSAGE_HEADER__REASON:
				return getReason();
			case ResourcesPackage.MESSAGE_HEADER__RESPONSE:
				return getResponse();
			case ResourcesPackage.MESSAGE_HEADER__FOCUS:
				return getFoci();
			case ResourcesPackage.MESSAGE_HEADER__DEFINITION:
				return getDefinition();
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
			case ResourcesPackage.MESSAGE_HEADER__EVENTX:
				setEventx((DataType)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__DESTINATION:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends MessageHeaderMessageDestination>)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__SENDER:
				setSender((Reference)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__AUTHOR:
				setAuthor((Reference)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__SOURCE:
				setSource((MessageHeaderMessageSource)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE:
				setResponsible((Reference)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__REASON:
				setReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__RESPONSE:
				setResponse((MessageHeaderResponse)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__FOCUS:
				getFoci().clear();
				getFoci().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MESSAGE_HEADER__DEFINITION:
				setDefinition((MessageDefinition)newValue);
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
			case ResourcesPackage.MESSAGE_HEADER__EVENTX:
				setEventx((DataType)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER__DESTINATION:
				getDestinations().clear();
				return;
			case ResourcesPackage.MESSAGE_HEADER__SENDER:
				setSender((Reference)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER__ENTERER:
				setEnterer((Reference)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER__AUTHOR:
				setAuthor((Reference)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER__SOURCE:
				setSource((MessageHeaderMessageSource)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE:
				setResponsible((Reference)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER__REASON:
				setReason((CodeableConcept)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER__RESPONSE:
				setResponse((MessageHeaderResponse)null);
				return;
			case ResourcesPackage.MESSAGE_HEADER__FOCUS:
				getFoci().clear();
				return;
			case ResourcesPackage.MESSAGE_HEADER__DEFINITION:
				setDefinition((MessageDefinition)null);
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
			case ResourcesPackage.MESSAGE_HEADER__EVENTX:
				return eventx != null;
			case ResourcesPackage.MESSAGE_HEADER__DESTINATION:
				return destinations != null && !destinations.isEmpty();
			case ResourcesPackage.MESSAGE_HEADER__SENDER:
				return sender != null;
			case ResourcesPackage.MESSAGE_HEADER__ENTERER:
				return enterer != null;
			case ResourcesPackage.MESSAGE_HEADER__AUTHOR:
				return author != null;
			case ResourcesPackage.MESSAGE_HEADER__SOURCE:
				return source != null;
			case ResourcesPackage.MESSAGE_HEADER__RESPONSIBLE:
				return responsible != null;
			case ResourcesPackage.MESSAGE_HEADER__REASON:
				return reason != null;
			case ResourcesPackage.MESSAGE_HEADER__RESPONSE:
				return response != null;
			case ResourcesPackage.MESSAGE_HEADER__FOCUS:
				return foci != null && !foci.isEmpty();
			case ResourcesPackage.MESSAGE_HEADER__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageHeaderImpl
