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

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequest;
import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestDetails;
import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestInsurance;
import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestSupportingInformation;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getPurposes <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestImpl#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityRequestImpl extends DomainResourceImpl implements CoverageEligibilityRequest {
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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getPurposes() <em>Purpose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> purposes;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getServicedx() <em>Servicedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedx()
	 * @generated
	 * @ordered
	 */
	protected DataType servicedx;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

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
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

	/**
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Reference facility;

	/**
	 * The cached value of the '{@link #getSupportingInfos() <em>Supporting Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityRequestSupportingInformation> supportingInfos;

	/**
	 * The cached value of the '{@link #getInsurances() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurances()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityRequestInsurance> insurances;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityRequestDetails> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageEligibilityRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getServicedx() {
		return servicedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicedx(DataType newServicedx, NotificationChain msgs) {
		DataType oldServicedx = servicedx;
		servicedx = newServicedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX, oldServicedx, newServicedx);
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
	public void setServicedx(DataType newServicedx) {
		if (newServicedx != servicedx) {
			NotificationChain msgs = null;
			if (servicedx != null)
				msgs = ((InternalEObject)servicedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX, null, msgs);
			if (newServicedx != null)
				msgs = ((InternalEObject)newServicedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX, null, msgs);
			msgs = basicSetServicedx(newServicedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX, newServicedx, newServicedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED, oldCreated, newCreated);
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
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER, oldEnterer, newEnterer);
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
	public void setEnterer(Reference newEnterer) {
		if (newEnterer != enterer) {
			NotificationChain msgs = null;
			if (enterer != null)
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER, newEnterer, newEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER, oldProvider, newProvider);
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
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getInsurer() {
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurer(Reference newInsurer, NotificationChain msgs) {
		Reference oldInsurer = insurer;
		insurer = newInsurer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER, oldInsurer, newInsurer);
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
	public void setInsurer(Reference newInsurer) {
		if (newInsurer != insurer) {
			NotificationChain msgs = null;
			if (insurer != null)
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacility(Reference newFacility, NotificationChain msgs) {
		Reference oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY, oldFacility, newFacility);
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
	public void setFacility(Reference newFacility) {
		if (newFacility != facility) {
			NotificationChain msgs = null;
			if (facility != null)
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityRequestSupportingInformation> getSupportingInfos() {
		if (supportingInfos == null) {
			supportingInfos = new EObjectContainmentEList<CoverageEligibilityRequestSupportingInformation>(CoverageEligibilityRequestSupportingInformation.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO);
		}
		return supportingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityRequestInsurance> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<CoverageEligibilityRequestInsurance>(CoverageEligibilityRequestInsurance.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE);
		}
		return insurances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityRequestDetails> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<CoverageEligibilityRequestDetails>(CoverageEligibilityRequestDetails.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				return ((InternalEList<?>)getPurposes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX:
				return basicSetServicedx(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				return basicSetCreated(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				return basicSetEnterer(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				return basicSetProvider(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				return basicSetInsurer(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				return basicSetFacility(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				return ((InternalEList<?>)getSupportingInfos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				return getStatus();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				return getPriority();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				return getPurposes();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				return getPatient();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX:
				return getServicedx();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				return getCreated();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				return getEnterer();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				return getProvider();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				return getInsurer();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				return getFacility();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				return getSupportingInfos();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				return getInsurances();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				return getItems();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				getPurposes().clear();
				getPurposes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX:
				setServicedx((DataType)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				setInsurer((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				setFacility((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				getSupportingInfos().clear();
				getSupportingInfos().addAll((Collection<? extends CoverageEligibilityRequestSupportingInformation>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends CoverageEligibilityRequestInsurance>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends CoverageEligibilityRequestDetails>)newValue);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				getPurposes().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX:
				setServicedx((DataType)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				setEnterer((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				setProvider((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				setInsurer((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				setFacility((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				getSupportingInfos().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				getItems().clear();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PRIORITY:
				return priority != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PURPOSE:
				return purposes != null && !purposes.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PATIENT:
				return patient != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SERVICEDX:
				return servicedx != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__CREATED:
				return created != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ENTERER:
				return enterer != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__PROVIDER:
				return provider != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURER:
				return insurer != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__FACILITY:
				return facility != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__SUPPORTING_INFO:
				return supportingInfos != null && !supportingInfos.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityRequestImpl
