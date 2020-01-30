/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.ActivityDefinition;
import fhiRCore.resources.DeviceRequest;
import fhiRCore.resources.DeviceRequestParameter;
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
 * An implementation of the model object '<em><b>Device Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getPriorRequests <em>Prior Request</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getCodex <em>Codex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceRequestImpl#getRelevantHistories <em>Relevant History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceRequestImpl extends DomainResourceImpl implements DeviceRequest {
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
	 * The cached value of the '{@link #getInstantiatesCanonicals() <em>Instantiates Canonical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesCanonicals()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefinition> instantiatesCanonicals;

	/**
	 * The cached value of the '{@link #getInstantiatesUris() <em>Instantiates Uri</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatesUris()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> instantiatesUris;

	/**
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOns;

	/**
	 * The cached value of the '{@link #getPriorRequests() <em>Prior Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> priorRequests;

	/**
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier groupIdentifier;

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
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Code intent;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Code priority;

	/**
	 * The cached value of the '{@link #getCodex() <em>Codex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodex()
	 * @generated
	 * @ordered
	 */
	protected DataType codex;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceRequestParameter> parameters;

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
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getOccurrencex() <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencex()
	 * @generated
	 * @ordered
	 */
	protected DataType occurrencex;

	/**
	 * The cached value of the '{@link #getAuthoredOn() <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoredOn;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected Reference requester;

	/**
	 * The cached value of the '{@link #getPerformerType() <em>Performer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformerType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept performerType;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Reference performer;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReferences;

	/**
	 * The cached value of the '{@link #getInsurances() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurances()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> insurances;

	/**
	 * The cached value of the '{@link #getSupportingInfos() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInfos;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getRelevantHistories() <em>Relevant History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> relevantHistories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.DEVICE_REQUEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityDefinition> getInstantiatesCanonicals() {
		if (instantiatesCanonicals == null) {
			instantiatesCanonicals = new EObjectContainmentEList<ActivityDefinition>(ActivityDefinition.class, this, ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonicals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getInstantiatesUris() {
		if (instantiatesUris == null) {
			instantiatesUris = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_URI);
		}
		return instantiatesUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_REQUEST__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPriorRequests() {
		if (priorRequests == null) {
			priorRequests = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_REQUEST__PRIOR_REQUEST);
		}
		return priorRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getGroupIdentifier() {
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupIdentifier(Identifier newGroupIdentifier, NotificationChain msgs) {
		Identifier oldGroupIdentifier = groupIdentifier;
		groupIdentifier = newGroupIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupIdentifier(Identifier newGroupIdentifier) {
		if (newGroupIdentifier != groupIdentifier) {
			NotificationChain msgs = null;
			if (groupIdentifier != null)
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(Code newIntent, NotificationChain msgs) {
		Code oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(Code newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Code newPriority, NotificationChain msgs) {
		Code oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Code newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getCodex() {
		return codex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodex(DataType newCodex, NotificationChain msgs) {
		DataType oldCodex = codex;
		codex = newCodex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__CODEX, oldCodex, newCodex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodex(DataType newCodex) {
		if (newCodex != codex) {
			NotificationChain msgs = null;
			if (codex != null)
				msgs = ((InternalEObject)codex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__CODEX, null, msgs);
			if (newCodex != null)
				msgs = ((InternalEObject)newCodex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__CODEX, null, msgs);
			msgs = basicSetCodex(newCodex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__CODEX, newCodex, newCodex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceRequestParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<DeviceRequestParameter>(DeviceRequestParameter.class, this, ResourcesPackage.DEVICE_REQUEST__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOccurrencex() {
		return occurrencex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencex(DataType newOccurrencex, NotificationChain msgs) {
		DataType oldOccurrencex = occurrencex;
		occurrencex = newOccurrencex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX, oldOccurrencex, newOccurrencex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencex(DataType newOccurrencex) {
		if (newOccurrencex != occurrencex) {
			NotificationChain msgs = null;
			if (occurrencex != null)
				msgs = ((InternalEObject)occurrencex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX, null, msgs);
			if (newOccurrencex != null)
				msgs = ((InternalEObject)newOccurrencex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX, null, msgs);
			msgs = basicSetOccurrencex(newOccurrencex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX, newOccurrencex, newOccurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthoredOn() {
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoredOn(DateTime newAuthoredOn, NotificationChain msgs) {
		DateTime oldAuthoredOn = authoredOn;
		authoredOn = newAuthoredOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoredOn(DateTime newAuthoredOn) {
		if (newAuthoredOn != authoredOn) {
			NotificationChain msgs = null;
			if (authoredOn != null)
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPerformerType() {
		return performerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformerType(CodeableConcept newPerformerType, NotificationChain msgs) {
		CodeableConcept oldPerformerType = performerType;
		performerType = newPerformerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE, oldPerformerType, newPerformerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformerType(CodeableConcept newPerformerType) {
		if (newPerformerType != performerType) {
			NotificationChain msgs = null;
			if (performerType != null)
				msgs = ((InternalEObject)performerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE, null, msgs);
			if (newPerformerType != null)
				msgs = ((InternalEObject)newPerformerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE, null, msgs);
			msgs = basicSetPerformerType(newPerformerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE, newPerformerType, newPerformerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(Reference newPerformer, NotificationChain msgs) {
		Reference oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__PERFORMER, oldPerformer, newPerformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Reference newPerformer) {
		if (newPerformer != performer) {
			NotificationChain msgs = null;
			if (performer != null)
				msgs = ((InternalEObject)performer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__PERFORMER, null, msgs);
			if (newPerformer != null)
				msgs = ((InternalEObject)newPerformer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_REQUEST__PERFORMER, null, msgs);
			msgs = basicSetPerformer(newPerformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_REQUEST__PERFORMER, newPerformer, newPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE_REQUEST__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_REQUEST__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_REQUEST__INSURANCE);
		}
		return insurances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInfos() {
		if (supportingInfos == null) {
			supportingInfos = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_REQUEST__SUPPORTING_INFO);
		}
		return supportingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.DEVICE_REQUEST__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRelevantHistories() {
		if (relevantHistories == null) {
			relevantHistories = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_REQUEST__RELEVANT_HISTORY);
		}
		return relevantHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonicals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUris()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				return ((InternalEList<?>)getPriorRequests()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__INTENT:
				return basicSetIntent(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__CODEX:
				return basicSetCodex(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX:
				return basicSetOccurrencex(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				return basicSetPerformerType(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER:
				return basicSetPerformer(null, msgs);
			case ResourcesPackage.DEVICE_REQUEST__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				return ((InternalEList<?>)getRelevantHistories()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DEVICE_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonicals();
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_URI:
				return getInstantiatesUris();
			case ResourcesPackage.DEVICE_REQUEST__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				return getPriorRequests();
			case ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case ResourcesPackage.DEVICE_REQUEST__STATUS:
				return getStatus();
			case ResourcesPackage.DEVICE_REQUEST__INTENT:
				return getIntent();
			case ResourcesPackage.DEVICE_REQUEST__PRIORITY:
				return getPriority();
			case ResourcesPackage.DEVICE_REQUEST__CODEX:
				return getCodex();
			case ResourcesPackage.DEVICE_REQUEST__PARAMETER:
				return getParameters();
			case ResourcesPackage.DEVICE_REQUEST__SUBJECT:
				return getSubject();
			case ResourcesPackage.DEVICE_REQUEST__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX:
				return getOccurrencex();
			case ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case ResourcesPackage.DEVICE_REQUEST__REQUESTER:
				return getRequester();
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				return getPerformerType();
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER:
				return getPerformer();
			case ResourcesPackage.DEVICE_REQUEST__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.DEVICE_REQUEST__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.DEVICE_REQUEST__INSURANCE:
				return getInsurances();
			case ResourcesPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				return getSupportingInfos();
			case ResourcesPackage.DEVICE_REQUEST__NOTE:
				return getNotes();
			case ResourcesPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				return getRelevantHistories();
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
			case ResourcesPackage.DEVICE_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				getInstantiatesCanonicals().addAll((Collection<? extends ActivityDefinition>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				getInstantiatesUris().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				getPriorRequests().clear();
				getPriorRequests().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__INTENT:
				setIntent((Code)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__CODEX:
				setCodex((DataType)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DeviceRequestParameter>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER:
				setPerformer((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				getSupportingInfos().clear();
				getSupportingInfos().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				getRelevantHistories().clear();
				getRelevantHistories().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.DEVICE_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				getPriorRequests().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__INTENT:
				setIntent((Code)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__CODEX:
				setCodex((DataType)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PARAMETER:
				getParameters().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER:
				setPerformer((Reference)null);
				return;
			case ResourcesPackage.DEVICE_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				getSupportingInfos().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				getRelevantHistories().clear();
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
			case ResourcesPackage.DEVICE_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_CANONICAL:
				return instantiatesCanonicals != null && !instantiatesCanonicals.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__INSTANTIATES_URI:
				return instantiatesUris != null && !instantiatesUris.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__PRIOR_REQUEST:
				return priorRequests != null && !priorRequests.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case ResourcesPackage.DEVICE_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.DEVICE_REQUEST__INTENT:
				return intent != null;
			case ResourcesPackage.DEVICE_REQUEST__PRIORITY:
				return priority != null;
			case ResourcesPackage.DEVICE_REQUEST__CODEX:
				return codex != null;
			case ResourcesPackage.DEVICE_REQUEST__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__SUBJECT:
				return subject != null;
			case ResourcesPackage.DEVICE_REQUEST__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.DEVICE_REQUEST__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.DEVICE_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case ResourcesPackage.DEVICE_REQUEST__REQUESTER:
				return requester != null;
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER_TYPE:
				return performerType != null;
			case ResourcesPackage.DEVICE_REQUEST__PERFORMER:
				return performer != null;
			case ResourcesPackage.DEVICE_REQUEST__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__SUPPORTING_INFO:
				return supportingInfos != null && !supportingInfos.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.DEVICE_REQUEST__RELEVANT_HISTORY:
				return relevantHistories != null && !relevantHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceRequestImpl
