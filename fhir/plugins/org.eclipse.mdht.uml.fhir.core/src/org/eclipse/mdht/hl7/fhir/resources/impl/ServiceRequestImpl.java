/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.resources.ActivityDefinition;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getRequisition <em>Requisition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getCategories <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getOrderDetails <em>Order Detail</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getQuantityx <em>Quantityx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getAsNeededx <em>As Neededx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getPerformerType <em>Performer Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getLocationCodes <em>Location Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getLocationReferences <em>Location Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getBodySites <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getPatientInstruction <em>Patient Instruction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ServiceRequestImpl#getRelevantHistories <em>Relevant History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceRequestImpl extends DomainResourceImpl implements ServiceRequest {
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
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> replaces;

	/**
	 * The cached value of the '{@link #getRequisition() <em>Requisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequisition()
	 * @generated
	 * @ordered
	 */
	protected Identifier requisition;

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
	 * The cached value of the '{@link #getCategories() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> categories;

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
	 * The cached value of the '{@link #getDoNotPerform() <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoNotPerform()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean doNotPerform;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getOrderDetails() <em>Order Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> orderDetails;

	/**
	 * The cached value of the '{@link #getQuantityx() <em>Quantityx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityx()
	 * @generated
	 * @ordered
	 */
	protected DataType quantityx;

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
	 * The cached value of the '{@link #getAsNeededx() <em>As Neededx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsNeededx()
	 * @generated
	 * @ordered
	 */
	protected DataType asNeededx;

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
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performers;

	/**
	 * The cached value of the '{@link #getLocationCodes() <em>Location Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> locationCodes;

	/**
	 * The cached value of the '{@link #getLocationReferences() <em>Location Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> locationReferences;

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
	 * The cached value of the '{@link #getSpecimens() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimens()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimens;

	/**
	 * The cached value of the '{@link #getBodySites() <em>Body Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySites()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> bodySites;

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
	 * The cached value of the '{@link #getPatientInstruction() <em>Patient Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String patientInstruction;

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
	protected ServiceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getServiceRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.SERVICE_REQUEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityDefinition> getInstantiatesCanonicals() {
		if (instantiatesCanonicals == null) {
			instantiatesCanonicals = new EObjectContainmentEList<ActivityDefinition>(ActivityDefinition.class, this, ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_CANONICAL);
		}
		return instantiatesCanonicals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Uri> getInstantiatesUris() {
		if (instantiatesUris == null) {
			instantiatesUris = new EObjectContainmentEList<Uri>(Uri.class, this, ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_URI);
		}
		return instantiatesUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReplaces() {
		if (replaces == null) {
			replaces = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__REPLACES);
		}
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getRequisition() {
		return requisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequisition(Identifier newRequisition, NotificationChain msgs) {
		Identifier oldRequisition = requisition;
		requisition = newRequisition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__REQUISITION, oldRequisition, newRequisition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequisition(Identifier newRequisition) {
		if (newRequisition != requisition) {
			NotificationChain msgs = null;
			if (requisition != null)
				msgs = ((InternalEObject)requisition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__REQUISITION, null, msgs);
			if (newRequisition != null)
				msgs = ((InternalEObject)newRequisition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__REQUISITION, null, msgs);
			msgs = basicSetRequisition(newRequisition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__REQUISITION, newRequisition, newRequisition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntent(Code newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SERVICE_REQUEST__CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Code newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getDoNotPerform() {
		return doNotPerform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoNotPerform(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newDoNotPerform, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldDoNotPerform = doNotPerform;
		doNotPerform = newDoNotPerform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM, oldDoNotPerform, newDoNotPerform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoNotPerform(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newDoNotPerform) {
		if (newDoNotPerform != doNotPerform) {
			NotificationChain msgs = null;
			if (doNotPerform != null)
				msgs = ((InternalEObject)doNotPerform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM, null, msgs);
			if (newDoNotPerform != null)
				msgs = ((InternalEObject)newDoNotPerform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM, null, msgs);
			msgs = basicSetDoNotPerform(newDoNotPerform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM, newDoNotPerform, newDoNotPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getOrderDetails() {
		if (orderDetails == null) {
			orderDetails = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SERVICE_REQUEST__ORDER_DETAIL);
		}
		return orderDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getQuantityx() {
		return quantityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityx(DataType newQuantityx, NotificationChain msgs) {
		DataType oldQuantityx = quantityx;
		quantityx = newQuantityx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__QUANTITYX, oldQuantityx, newQuantityx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityx(DataType newQuantityx) {
		if (newQuantityx != quantityx) {
			NotificationChain msgs = null;
			if (quantityx != null)
				msgs = ((InternalEObject)quantityx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__QUANTITYX, null, msgs);
			if (newQuantityx != null)
				msgs = ((InternalEObject)newQuantityx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__QUANTITYX, null, msgs);
			msgs = basicSetQuantityx(newQuantityx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__QUANTITYX, newQuantityx, newQuantityx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX, oldOccurrencex, newOccurrencex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurrencex(DataType newOccurrencex) {
		if (newOccurrencex != occurrencex) {
			NotificationChain msgs = null;
			if (occurrencex != null)
				msgs = ((InternalEObject)occurrencex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX, null, msgs);
			if (newOccurrencex != null)
				msgs = ((InternalEObject)newOccurrencex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX, null, msgs);
			msgs = basicSetOccurrencex(newOccurrencex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX, newOccurrencex, newOccurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getAsNeededx() {
		return asNeededx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsNeededx(DataType newAsNeededx, NotificationChain msgs) {
		DataType oldAsNeededx = asNeededx;
		asNeededx = newAsNeededx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX, oldAsNeededx, newAsNeededx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsNeededx(DataType newAsNeededx) {
		if (newAsNeededx != asNeededx) {
			NotificationChain msgs = null;
			if (asNeededx != null)
				msgs = ((InternalEObject)asNeededx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX, null, msgs);
			if (newAsNeededx != null)
				msgs = ((InternalEObject)newAsNeededx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX, null, msgs);
			msgs = basicSetAsNeededx(newAsNeededx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX, newAsNeededx, newAsNeededx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthoredOn(DateTime newAuthoredOn) {
		if (newAuthoredOn != authoredOn) {
			NotificationChain msgs = null;
			if (authoredOn != null)
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequester(Reference newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE, oldPerformerType, newPerformerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformerType(CodeableConcept newPerformerType) {
		if (newPerformerType != performerType) {
			NotificationChain msgs = null;
			if (performerType != null)
				msgs = ((InternalEObject)performerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE, null, msgs);
			if (newPerformerType != null)
				msgs = ((InternalEObject)newPerformerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE, null, msgs);
			msgs = basicSetPerformerType(newPerformerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE, newPerformerType, newPerformerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLocationCodes() {
		if (locationCodes == null) {
			locationCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SERVICE_REQUEST__LOCATION_CODE);
		}
		return locationCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getLocationReferences() {
		if (locationReferences == null) {
			locationReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__LOCATION_REFERENCE);
		}
		return locationReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SERVICE_REQUEST__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__INSURANCE);
		}
		return insurances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSupportingInfos() {
		if (supportingInfos == null) {
			supportingInfos = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__SUPPORTING_INFO);
		}
		return supportingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__SPECIMEN);
		}
		return specimens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getBodySites() {
		if (bodySites == null) {
			bodySites = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SERVICE_REQUEST__BODY_SITE);
		}
		return bodySites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.SERVICE_REQUEST__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPatientInstruction() {
		return patientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String newPatientInstruction, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPatientInstruction = patientInstruction;
		patientInstruction = newPatientInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION, oldPatientInstruction, newPatientInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientInstruction(org.eclipse.mdht.hl7.fhir.dataTypes.String newPatientInstruction) {
		if (newPatientInstruction != patientInstruction) {
			NotificationChain msgs = null;
			if (patientInstruction != null)
				msgs = ((InternalEObject)patientInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION, null, msgs);
			if (newPatientInstruction != null)
				msgs = ((InternalEObject)newPatientInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION, null, msgs);
			msgs = basicSetPatientInstruction(newPatientInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION, newPatientInstruction, newPatientInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRelevantHistories() {
		if (relevantHistories == null) {
			relevantHistories = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SERVICE_REQUEST__RELEVANT_HISTORY);
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
			case ResourcesPackage.SERVICE_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_CANONICAL:
				return ((InternalEList<?>)getInstantiatesCanonicals()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_URI:
				return ((InternalEList<?>)getInstantiatesUris()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__REPLACES:
				return ((InternalEList<?>)getReplaces()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__REQUISITION:
				return basicSetRequisition(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__INTENT:
				return basicSetIntent(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__CATEGORY:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM:
				return basicSetDoNotPerform(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__ORDER_DETAIL:
				return ((InternalEList<?>)getOrderDetails()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__QUANTITYX:
				return basicSetQuantityx(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX:
				return basicSetOccurrencex(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX:
				return basicSetAsNeededx(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE:
				return basicSetPerformerType(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_CODE:
				return ((InternalEList<?>)getLocationCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_REFERENCE:
				return ((InternalEList<?>)getLocationReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__SPECIMEN:
				return ((InternalEList<?>)getSpecimens()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__BODY_SITE:
				return ((InternalEList<?>)getBodySites()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION:
				return basicSetPatientInstruction(null, msgs);
			case ResourcesPackage.SERVICE_REQUEST__RELEVANT_HISTORY:
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
			case ResourcesPackage.SERVICE_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_CANONICAL:
				return getInstantiatesCanonicals();
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_URI:
				return getInstantiatesUris();
			case ResourcesPackage.SERVICE_REQUEST__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.SERVICE_REQUEST__REPLACES:
				return getReplaces();
			case ResourcesPackage.SERVICE_REQUEST__REQUISITION:
				return getRequisition();
			case ResourcesPackage.SERVICE_REQUEST__STATUS:
				return getStatus();
			case ResourcesPackage.SERVICE_REQUEST__INTENT:
				return getIntent();
			case ResourcesPackage.SERVICE_REQUEST__CATEGORY:
				return getCategories();
			case ResourcesPackage.SERVICE_REQUEST__PRIORITY:
				return getPriority();
			case ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM:
				return getDoNotPerform();
			case ResourcesPackage.SERVICE_REQUEST__CODE:
				return getCode();
			case ResourcesPackage.SERVICE_REQUEST__ORDER_DETAIL:
				return getOrderDetails();
			case ResourcesPackage.SERVICE_REQUEST__QUANTITYX:
				return getQuantityx();
			case ResourcesPackage.SERVICE_REQUEST__SUBJECT:
				return getSubject();
			case ResourcesPackage.SERVICE_REQUEST__ENCOUNTER:
				return getEncounter();
			case ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX:
				return getOccurrencex();
			case ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX:
				return getAsNeededx();
			case ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case ResourcesPackage.SERVICE_REQUEST__REQUESTER:
				return getRequester();
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE:
				return getPerformerType();
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER:
				return getPerformers();
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_CODE:
				return getLocationCodes();
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_REFERENCE:
				return getLocationReferences();
			case ResourcesPackage.SERVICE_REQUEST__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.SERVICE_REQUEST__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.SERVICE_REQUEST__INSURANCE:
				return getInsurances();
			case ResourcesPackage.SERVICE_REQUEST__SUPPORTING_INFO:
				return getSupportingInfos();
			case ResourcesPackage.SERVICE_REQUEST__SPECIMEN:
				return getSpecimens();
			case ResourcesPackage.SERVICE_REQUEST__BODY_SITE:
				return getBodySites();
			case ResourcesPackage.SERVICE_REQUEST__NOTE:
				return getNotes();
			case ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION:
				return getPatientInstruction();
			case ResourcesPackage.SERVICE_REQUEST__RELEVANT_HISTORY:
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
			case ResourcesPackage.SERVICE_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				getInstantiatesCanonicals().addAll((Collection<? extends ActivityDefinition>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				getInstantiatesUris().addAll((Collection<? extends Uri>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__REQUISITION:
				setRequisition((Identifier)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__INTENT:
				setIntent((Code)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__CATEGORY:
				getCategories().clear();
				getCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__PRIORITY:
				setPriority((Code)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM:
				setDoNotPerform((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__ORDER_DETAIL:
				getOrderDetails().clear();
				getOrderDetails().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__QUANTITYX:
				setQuantityx((DataType)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX:
				setAsNeededx((DataType)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_CODE:
				getLocationCodes().clear();
				getLocationCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_REFERENCE:
				getLocationReferences().clear();
				getLocationReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__SUPPORTING_INFO:
				getSupportingInfos().clear();
				getSupportingInfos().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__BODY_SITE:
				getBodySites().clear();
				getBodySites().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION:
				setPatientInstruction((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SERVICE_REQUEST__RELEVANT_HISTORY:
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
			case ResourcesPackage.SERVICE_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_CANONICAL:
				getInstantiatesCanonicals().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_URI:
				getInstantiatesUris().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__REPLACES:
				getReplaces().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__REQUISITION:
				setRequisition((Identifier)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__INTENT:
				setIntent((Code)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__CATEGORY:
				getCategories().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__PRIORITY:
				setPriority((Code)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM:
				setDoNotPerform((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__ORDER_DETAIL:
				getOrderDetails().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__QUANTITYX:
				setQuantityx((DataType)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX:
				setAsNeededx((DataType)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE:
				setPerformerType((CodeableConcept)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_CODE:
				getLocationCodes().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_REFERENCE:
				getLocationReferences().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__SUPPORTING_INFO:
				getSupportingInfos().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__SPECIMEN:
				getSpecimens().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__BODY_SITE:
				getBodySites().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION:
				setPatientInstruction((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SERVICE_REQUEST__RELEVANT_HISTORY:
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
			case ResourcesPackage.SERVICE_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_CANONICAL:
				return instantiatesCanonicals != null && !instantiatesCanonicals.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__INSTANTIATES_URI:
				return instantiatesUris != null && !instantiatesUris.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__REQUISITION:
				return requisition != null;
			case ResourcesPackage.SERVICE_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.SERVICE_REQUEST__INTENT:
				return intent != null;
			case ResourcesPackage.SERVICE_REQUEST__CATEGORY:
				return categories != null && !categories.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__PRIORITY:
				return priority != null;
			case ResourcesPackage.SERVICE_REQUEST__DO_NOT_PERFORM:
				return doNotPerform != null;
			case ResourcesPackage.SERVICE_REQUEST__CODE:
				return code != null;
			case ResourcesPackage.SERVICE_REQUEST__ORDER_DETAIL:
				return orderDetails != null && !orderDetails.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__QUANTITYX:
				return quantityx != null;
			case ResourcesPackage.SERVICE_REQUEST__SUBJECT:
				return subject != null;
			case ResourcesPackage.SERVICE_REQUEST__ENCOUNTER:
				return encounter != null;
			case ResourcesPackage.SERVICE_REQUEST__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.SERVICE_REQUEST__AS_NEEDEDX:
				return asNeededx != null;
			case ResourcesPackage.SERVICE_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case ResourcesPackage.SERVICE_REQUEST__REQUESTER:
				return requester != null;
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER_TYPE:
				return performerType != null;
			case ResourcesPackage.SERVICE_REQUEST__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_CODE:
				return locationCodes != null && !locationCodes.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__LOCATION_REFERENCE:
				return locationReferences != null && !locationReferences.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__SUPPORTING_INFO:
				return supportingInfos != null && !supportingInfos.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__BODY_SITE:
				return bodySites != null && !bodySites.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.SERVICE_REQUEST__PATIENT_INSTRUCTION:
				return patientInstruction != null;
			case ResourcesPackage.SERVICE_REQUEST__RELEVANT_HISTORY:
				return relevantHistories != null && !relevantHistories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceRequestImpl
