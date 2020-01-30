/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.MedicinalProductAuthorization;
import fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization;
import fhiRCore.resources.MedicinalProductAuthorizationProcedure;
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
 * An implementation of the model object '<em><b>Medicinal Product Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getCountries <em>Country</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getRestoreDate <em>Restore Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getDataExclusivityPeriod <em>Data Exclusivity Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getDateOfFirstAuthorization <em>Date Of First Authorization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getInternationalBirthDate <em>International Birth Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getLegalBasis <em>Legal Basis</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getJurisdictionalAuthorizations <em>Jurisdictional Authorization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getRegulator <em>Regulator</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationImpl#getProcedure <em>Procedure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductAuthorizationImpl extends DomainResourceImpl implements MedicinalProductAuthorization {
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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getCountries() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> countries;

	/**
	 * The cached value of the '{@link #getJurisdictions() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdictions;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime statusDate;

	/**
	 * The cached value of the '{@link #getRestoreDate() <em>Restore Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestoreDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime restoreDate;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period validityPeriod;

	/**
	 * The cached value of the '{@link #getDataExclusivityPeriod() <em>Data Exclusivity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataExclusivityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period dataExclusivityPeriod;

	/**
	 * The cached value of the '{@link #getDateOfFirstAuthorization() <em>Date Of First Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfFirstAuthorization()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateOfFirstAuthorization;

	/**
	 * The cached value of the '{@link #getInternationalBirthDate() <em>International Birth Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalBirthDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime internationalBirthDate;

	/**
	 * The cached value of the '{@link #getLegalBasis() <em>Legal Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalBasis()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept legalBasis;

	/**
	 * The cached value of the '{@link #getJurisdictionalAuthorizations() <em>Jurisdictional Authorization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictionalAuthorizations()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductAuthorizationJurisdictionalAuthorization> jurisdictionalAuthorizations;

	/**
	 * The cached value of the '{@link #getHolder() <em>Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolder()
	 * @generated
	 * @ordered
	 */
	protected Reference holder;

	/**
	 * The cached value of the '{@link #getRegulator() <em>Regulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulator()
	 * @generated
	 * @ordered
	 */
	protected Reference regulator;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected MedicinalProductAuthorizationProcedure procedure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductAuthorizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductAuthorization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCountries() {
		if (countries == null) {
			countries = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusDate(DateTime newStatusDate, NotificationChain msgs) {
		DateTime oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE, oldStatusDate, newStatusDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(DateTime newStatusDate) {
		if (newStatusDate != statusDate) {
			NotificationChain msgs = null;
			if (statusDate != null)
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE, newStatusDate, newStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getRestoreDate() {
		return restoreDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestoreDate(DateTime newRestoreDate, NotificationChain msgs) {
		DateTime oldRestoreDate = restoreDate;
		restoreDate = newRestoreDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE, oldRestoreDate, newRestoreDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestoreDate(DateTime newRestoreDate) {
		if (newRestoreDate != restoreDate) {
			NotificationChain msgs = null;
			if (restoreDate != null)
				msgs = ((InternalEObject)restoreDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE, null, msgs);
			if (newRestoreDate != null)
				msgs = ((InternalEObject)newRestoreDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE, null, msgs);
			msgs = basicSetRestoreDate(newRestoreDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE, newRestoreDate, newRestoreDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityPeriod(Period newValidityPeriod, NotificationChain msgs) {
		Period oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityPeriod(Period newValidityPeriod) {
		if (newValidityPeriod != validityPeriod) {
			NotificationChain msgs = null;
			if (validityPeriod != null)
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDataExclusivityPeriod() {
		return dataExclusivityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataExclusivityPeriod(Period newDataExclusivityPeriod, NotificationChain msgs) {
		Period oldDataExclusivityPeriod = dataExclusivityPeriod;
		dataExclusivityPeriod = newDataExclusivityPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD, oldDataExclusivityPeriod, newDataExclusivityPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExclusivityPeriod(Period newDataExclusivityPeriod) {
		if (newDataExclusivityPeriod != dataExclusivityPeriod) {
			NotificationChain msgs = null;
			if (dataExclusivityPeriod != null)
				msgs = ((InternalEObject)dataExclusivityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD, null, msgs);
			if (newDataExclusivityPeriod != null)
				msgs = ((InternalEObject)newDataExclusivityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD, null, msgs);
			msgs = basicSetDataExclusivityPeriod(newDataExclusivityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD, newDataExclusivityPeriod, newDataExclusivityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateOfFirstAuthorization() {
		return dateOfFirstAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateOfFirstAuthorization(DateTime newDateOfFirstAuthorization, NotificationChain msgs) {
		DateTime oldDateOfFirstAuthorization = dateOfFirstAuthorization;
		dateOfFirstAuthorization = newDateOfFirstAuthorization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION, oldDateOfFirstAuthorization, newDateOfFirstAuthorization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfFirstAuthorization(DateTime newDateOfFirstAuthorization) {
		if (newDateOfFirstAuthorization != dateOfFirstAuthorization) {
			NotificationChain msgs = null;
			if (dateOfFirstAuthorization != null)
				msgs = ((InternalEObject)dateOfFirstAuthorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION, null, msgs);
			if (newDateOfFirstAuthorization != null)
				msgs = ((InternalEObject)newDateOfFirstAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION, null, msgs);
			msgs = basicSetDateOfFirstAuthorization(newDateOfFirstAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION, newDateOfFirstAuthorization, newDateOfFirstAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getInternationalBirthDate() {
		return internationalBirthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternationalBirthDate(DateTime newInternationalBirthDate, NotificationChain msgs) {
		DateTime oldInternationalBirthDate = internationalBirthDate;
		internationalBirthDate = newInternationalBirthDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE, oldInternationalBirthDate, newInternationalBirthDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternationalBirthDate(DateTime newInternationalBirthDate) {
		if (newInternationalBirthDate != internationalBirthDate) {
			NotificationChain msgs = null;
			if (internationalBirthDate != null)
				msgs = ((InternalEObject)internationalBirthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE, null, msgs);
			if (newInternationalBirthDate != null)
				msgs = ((InternalEObject)newInternationalBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE, null, msgs);
			msgs = basicSetInternationalBirthDate(newInternationalBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE, newInternationalBirthDate, newInternationalBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLegalBasis() {
		return legalBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalBasis(CodeableConcept newLegalBasis, NotificationChain msgs) {
		CodeableConcept oldLegalBasis = legalBasis;
		legalBasis = newLegalBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS, oldLegalBasis, newLegalBasis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalBasis(CodeableConcept newLegalBasis) {
		if (newLegalBasis != legalBasis) {
			NotificationChain msgs = null;
			if (legalBasis != null)
				msgs = ((InternalEObject)legalBasis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS, null, msgs);
			if (newLegalBasis != null)
				msgs = ((InternalEObject)newLegalBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS, null, msgs);
			msgs = basicSetLegalBasis(newLegalBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS, newLegalBasis, newLegalBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductAuthorizationJurisdictionalAuthorization> getJurisdictionalAuthorizations() {
		if (jurisdictionalAuthorizations == null) {
			jurisdictionalAuthorizations = new EObjectContainmentEList<MedicinalProductAuthorizationJurisdictionalAuthorization>(MedicinalProductAuthorizationJurisdictionalAuthorization.class, this, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION);
		}
		return jurisdictionalAuthorizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getHolder() {
		return holder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolder(Reference newHolder, NotificationChain msgs) {
		Reference oldHolder = holder;
		holder = newHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER, oldHolder, newHolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolder(Reference newHolder) {
		if (newHolder != holder) {
			NotificationChain msgs = null;
			if (holder != null)
				msgs = ((InternalEObject)holder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER, null, msgs);
			if (newHolder != null)
				msgs = ((InternalEObject)newHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER, null, msgs);
			msgs = basicSetHolder(newHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER, newHolder, newHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRegulator() {
		return regulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulator(Reference newRegulator, NotificationChain msgs) {
		Reference oldRegulator = regulator;
		regulator = newRegulator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR, oldRegulator, newRegulator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulator(Reference newRegulator) {
		if (newRegulator != regulator) {
			NotificationChain msgs = null;
			if (regulator != null)
				msgs = ((InternalEObject)regulator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR, null, msgs);
			if (newRegulator != null)
				msgs = ((InternalEObject)newRegulator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR, null, msgs);
			msgs = basicSetRegulator(newRegulator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR, newRegulator, newRegulator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicinalProductAuthorizationProcedure getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(MedicinalProductAuthorizationProcedure newProcedure, NotificationChain msgs) {
		MedicinalProductAuthorizationProcedure oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE, oldProcedure, newProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(MedicinalProductAuthorizationProcedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				return basicSetRestoreDate(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				return basicSetDataExclusivityPeriod(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				return basicSetDateOfFirstAuthorization(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				return basicSetInternationalBirthDate(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS:
				return basicSetLegalBasis(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				return ((InternalEList<?>)getJurisdictionalAuthorizations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				return basicSetHolder(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				return basicSetRegulator(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				return basicSetProcedure(null, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT:
				return getSubject();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				return getCountries();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				return getStatus();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				return getStatusDate();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				return getRestoreDate();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				return getValidityPeriod();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				return getDataExclusivityPeriod();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				return getDateOfFirstAuthorization();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				return getInternationalBirthDate();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS:
				return getLegalBasis();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				return getJurisdictionalAuthorizations();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				return getHolder();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				return getRegulator();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				return getProcedure();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				getCountries().clear();
				getCountries().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				setStatusDate((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				setRestoreDate((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				setDataExclusivityPeriod((Period)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				setDateOfFirstAuthorization((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				setInternationalBirthDate((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS:
				setLegalBasis((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				getJurisdictionalAuthorizations().clear();
				getJurisdictionalAuthorizations().addAll((Collection<? extends MedicinalProductAuthorizationJurisdictionalAuthorization>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				setHolder((Reference)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				setRegulator((Reference)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				setProcedure((MedicinalProductAuthorizationProcedure)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				getCountries().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				setStatusDate((DateTime)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				setRestoreDate((DateTime)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				setDataExclusivityPeriod((Period)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				setDateOfFirstAuthorization((DateTime)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				setInternationalBirthDate((DateTime)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS:
				setLegalBasis((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				getJurisdictionalAuthorizations().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				setHolder((Reference)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				setRegulator((Reference)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				setProcedure((MedicinalProductAuthorizationProcedure)null);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__SUBJECT:
				return subject != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				return countries != null && !countries.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				return status != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				return statusDate != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				return restoreDate != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				return validityPeriod != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				return dataExclusivityPeriod != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				return dateOfFirstAuthorization != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				return internationalBirthDate != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_BASIS:
				return legalBasis != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				return jurisdictionalAuthorizations != null && !jurisdictionalAuthorizations.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				return holder != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				return regulator != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				return procedure != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductAuthorizationImpl
