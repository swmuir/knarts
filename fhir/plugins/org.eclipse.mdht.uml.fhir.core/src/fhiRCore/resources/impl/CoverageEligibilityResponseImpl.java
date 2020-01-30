/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.CoverageEligibilityResponse;
import fhiRCore.resources.CoverageEligibilityResponseErrors;
import fhiRCore.resources.CoverageEligibilityResponseInsurance;
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
 * An implementation of the model object '<em><b>Coverage Eligibility Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getPurposes <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getRequestor <em>Requestor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getInsurances <em>Insurance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageEligibilityResponseImpl#getErrors <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityResponseImpl extends DomainResourceImpl implements CoverageEligibilityResponse {
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
	 * The cached value of the '{@link #getRequestor() <em>Requestor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestor()
	 * @generated
	 * @ordered
	 */
	protected Reference requestor;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Code outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String disposition;

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
	 * The cached value of the '{@link #getInsurances() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurances()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityResponseInsurance> insurances;

	/**
	 * The cached value of the '{@link #getPreAuthRef() <em>Pre Auth Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRef()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String preAuthRef;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getErrors() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityResponseErrors> errors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageEligibilityResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX, oldServicedx, newServicedx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicedx(DataType newServicedx) {
		if (newServicedx != servicedx) {
			NotificationChain msgs = null;
			if (servicedx != null)
				msgs = ((InternalEObject)servicedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX, null, msgs);
			if (newServicedx != null)
				msgs = ((InternalEObject)newServicedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX, null, msgs);
			msgs = basicSetServicedx(newServicedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX, newServicedx, newServicedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestor() {
		return requestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestor(Reference newRequestor, NotificationChain msgs) {
		Reference oldRequestor = requestor;
		requestor = newRequestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR, oldRequestor, newRequestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestor(Reference newRequestor) {
		if (newRequestor != requestor) {
			NotificationChain msgs = null;
			if (requestor != null)
				msgs = ((InternalEObject)requestor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR, null, msgs);
			if (newRequestor != null)
				msgs = ((InternalEObject)newRequestor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR, null, msgs);
			msgs = basicSetRequestor(newRequestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR, newRequestor, newRequestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(Code newOutcome, NotificationChain msgs) {
		Code oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Code newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(fhiRCore.dataTypes.String newDisposition, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION, oldDisposition, newDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(fhiRCore.dataTypes.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER, oldInsurer, newInsurer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurer(Reference newInsurer) {
		if (newInsurer != insurer) {
			NotificationChain msgs = null;
			if (insurer != null)
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoverageEligibilityResponseInsurance> getInsurances() {
		if (insurances == null) {
			insurances = new EObjectContainmentEList<CoverageEligibilityResponseInsurance>(CoverageEligibilityResponseInsurance.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE);
		}
		return insurances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPreAuthRef() {
		return preAuthRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAuthRef(fhiRCore.dataTypes.String newPreAuthRef, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPreAuthRef = preAuthRef;
		preAuthRef = newPreAuthRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF, oldPreAuthRef, newPreAuthRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAuthRef(fhiRCore.dataTypes.String newPreAuthRef) {
		if (newPreAuthRef != preAuthRef) {
			NotificationChain msgs = null;
			if (preAuthRef != null)
				msgs = ((InternalEObject)preAuthRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF, null, msgs);
			if (newPreAuthRef != null)
				msgs = ((InternalEObject)newPreAuthRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF, null, msgs);
			msgs = basicSetPreAuthRef(newPreAuthRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF, newPreAuthRef, newPreAuthRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(CodeableConcept newForm, NotificationChain msgs) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoverageEligibilityResponseErrors> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<CoverageEligibilityResponseErrors>(CoverageEligibilityResponseErrors.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				return ((InternalEList<?>)getPurposes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX:
				return basicSetServicedx(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				return basicSetCreated(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				return basicSetRequestor(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				return basicSetRequest(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				return basicSetInsurer(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				return ((InternalEList<?>)getInsurances()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				return basicSetPreAuthRef(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				return basicSetForm(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				return getStatus();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				return getPurposes();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				return getPatient();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX:
				return getServicedx();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				return getCreated();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				return getRequestor();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				return getRequest();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				return getOutcome();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				return getDisposition();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				return getInsurer();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				return getInsurances();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				return getPreAuthRef();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				return getForm();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
				return getErrors();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				getPurposes().clear();
				getPurposes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX:
				setServicedx((DataType)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				setRequestor((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				setDisposition((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				setInsurer((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				getInsurances().clear();
				getInsurances().addAll((Collection<? extends CoverageEligibilityResponseInsurance>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				setPreAuthRef((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
				getErrors().clear();
				getErrors().addAll((Collection<? extends CoverageEligibilityResponseErrors>)newValue);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				getPurposes().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX:
				setServicedx((DataType)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				setRequestor((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				setRequest((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				setOutcome((Code)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				setDisposition((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				setInsurer((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				getInsurances().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				setPreAuthRef((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				setForm((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
				getErrors().clear();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__STATUS:
				return status != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PURPOSE:
				return purposes != null && !purposes.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PATIENT:
				return patient != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__SERVICEDX:
				return servicedx != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__CREATED:
				return created != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUESTOR:
				return requestor != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__REQUEST:
				return request != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__OUTCOME:
				return outcome != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__DISPOSITION:
				return disposition != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURER:
				return insurer != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__INSURANCE:
				return insurances != null && !insurances.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__PRE_AUTH_REF:
				return preAuthRef != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__FORM:
				return form != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE__ERROR:
				return errors != null && !errors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityResponseImpl
