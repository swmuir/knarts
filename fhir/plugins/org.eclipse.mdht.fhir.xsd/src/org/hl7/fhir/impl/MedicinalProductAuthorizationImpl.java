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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.MedicinalProductAuthorization;
import org.hl7.fhir.MedicinalProductAuthorizationJurisdictionalAuthorization;
import org.hl7.fhir.MedicinalProductAuthorizationProcedure;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getRestoreDate <em>Restore Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getDataExclusivityPeriod <em>Data Exclusivity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getDateOfFirstAuthorization <em>Date Of First Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getInternationalBirthDate <em>International Birth Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getJurisdictionalAuthorization <em>Jurisdictional Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getRegulator <em>Regulator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationImpl#getMarketingStatus <em>Marketing Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductAuthorizationImpl extends DomainResourceImpl implements MedicinalProductAuthorization {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> country;

	/**
	 * The cached value of the '{@link #getLegalStatusOfSupply() <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept legalStatusOfSupply;

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
	 * The cached value of the '{@link #getJurisdictionalAuthorization() <em>Jurisdictional Authorization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictionalAuthorization()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductAuthorizationJurisdictionalAuthorization> jurisdictionalAuthorization;

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
	 * The cached value of the '{@link #getMarketingStatus() <em>Marketing Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketingStatus> marketingStatus;

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
		return FhirPackage.eINSTANCE.getMedicinalProductAuthorization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCountry() {
		if (country == null) {
			country = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY);
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLegalStatusOfSupply() {
		return legalStatusOfSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply, NotificationChain msgs) {
		CodeableConcept oldLegalStatusOfSupply = legalStatusOfSupply;
		legalStatusOfSupply = newLegalStatusOfSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY, oldLegalStatusOfSupply, newLegalStatusOfSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply) {
		if (newLegalStatusOfSupply != legalStatusOfSupply) {
			NotificationChain msgs = null;
			if (legalStatusOfSupply != null)
				msgs = ((InternalEObject)legalStatusOfSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			if (newLegalStatusOfSupply != null)
				msgs = ((InternalEObject)newLegalStatusOfSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			msgs = basicSetLegalStatusOfSupply(newLegalStatusOfSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY, newLegalStatusOfSupply, newLegalStatusOfSupply));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE, oldStatusDate, newStatusDate);
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
				msgs = ((InternalEObject)statusDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE, null, msgs);
			if (newStatusDate != null)
				msgs = ((InternalEObject)newStatusDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE, null, msgs);
			msgs = basicSetStatusDate(newStatusDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE, newStatusDate, newStatusDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE, oldRestoreDate, newRestoreDate);
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
				msgs = ((InternalEObject)restoreDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE, null, msgs);
			if (newRestoreDate != null)
				msgs = ((InternalEObject)newRestoreDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE, null, msgs);
			msgs = basicSetRestoreDate(newRestoreDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE, newRestoreDate, newRestoreDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
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
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD, oldDataExclusivityPeriod, newDataExclusivityPeriod);
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
				msgs = ((InternalEObject)dataExclusivityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD, null, msgs);
			if (newDataExclusivityPeriod != null)
				msgs = ((InternalEObject)newDataExclusivityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD, null, msgs);
			msgs = basicSetDataExclusivityPeriod(newDataExclusivityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD, newDataExclusivityPeriod, newDataExclusivityPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION, oldDateOfFirstAuthorization, newDateOfFirstAuthorization);
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
				msgs = ((InternalEObject)dateOfFirstAuthorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION, null, msgs);
			if (newDateOfFirstAuthorization != null)
				msgs = ((InternalEObject)newDateOfFirstAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION, null, msgs);
			msgs = basicSetDateOfFirstAuthorization(newDateOfFirstAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION, newDateOfFirstAuthorization, newDateOfFirstAuthorization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE, oldInternationalBirthDate, newInternationalBirthDate);
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
				msgs = ((InternalEObject)internationalBirthDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE, null, msgs);
			if (newInternationalBirthDate != null)
				msgs = ((InternalEObject)newInternationalBirthDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE, null, msgs);
			msgs = basicSetInternationalBirthDate(newInternationalBirthDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE, newInternationalBirthDate, newInternationalBirthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductAuthorizationJurisdictionalAuthorization> getJurisdictionalAuthorization() {
		if (jurisdictionalAuthorization == null) {
			jurisdictionalAuthorization = new EObjectContainmentEList<MedicinalProductAuthorizationJurisdictionalAuthorization>(MedicinalProductAuthorizationJurisdictionalAuthorization.class, this, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION);
		}
		return jurisdictionalAuthorization;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER, oldHolder, newHolder);
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
				msgs = ((InternalEObject)holder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER, null, msgs);
			if (newHolder != null)
				msgs = ((InternalEObject)newHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER, null, msgs);
			msgs = basicSetHolder(newHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER, newHolder, newHolder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR, oldRegulator, newRegulator);
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
				msgs = ((InternalEObject)regulator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR, null, msgs);
			if (newRegulator != null)
				msgs = ((InternalEObject)newRegulator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR, null, msgs);
			msgs = basicSetRegulator(newRegulator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR, newRegulator, newRegulator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE, oldProcedure, newProcedure);
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
				msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketingStatus> getMarketingStatus() {
		if (marketingStatus == null) {
			marketingStatus = new EObjectContainmentEList<MarketingStatus>(MarketingStatus.class, this, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__MARKETING_STATUS);
		}
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				return ((InternalEList<?>)getCountry()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				return basicSetLegalStatusOfSupply(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				return basicSetStatusDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				return basicSetRestoreDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				return basicSetDataExclusivityPeriod(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				return basicSetDateOfFirstAuthorization(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				return basicSetInternationalBirthDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				return ((InternalEList<?>)getJurisdictionalAuthorization()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				return basicSetHolder(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				return basicSetRegulator(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__MARKETING_STATUS:
				return ((InternalEList<?>)getMarketingStatus()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				return getCountry();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				return getLegalStatusOfSupply();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				return getStatus();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				return getStatusDate();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				return getRestoreDate();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				return getValidityPeriod();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				return getDataExclusivityPeriod();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				return getDateOfFirstAuthorization();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				return getInternationalBirthDate();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				return getJurisdictionalAuthorization();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				return getHolder();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				return getRegulator();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				return getProcedure();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__MARKETING_STATUS:
				return getMarketingStatus();
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				setStatusDate((DateTime)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				setRestoreDate((DateTime)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				setDataExclusivityPeriod((Period)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				setDateOfFirstAuthorization((DateTime)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				setInternationalBirthDate((DateTime)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				getJurisdictionalAuthorization().clear();
				getJurisdictionalAuthorization().addAll((Collection<? extends MedicinalProductAuthorizationJurisdictionalAuthorization>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				setHolder((Reference)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				setRegulator((Reference)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				setProcedure((MedicinalProductAuthorizationProcedure)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__MARKETING_STATUS:
				getMarketingStatus().clear();
				getMarketingStatus().addAll((Collection<? extends MarketingStatus>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				getCountry().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				setStatusDate((DateTime)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				setRestoreDate((DateTime)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				setDataExclusivityPeriod((Period)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				setDateOfFirstAuthorization((DateTime)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				setInternationalBirthDate((DateTime)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				getJurisdictionalAuthorization().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				setHolder((Reference)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				setRegulator((Reference)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				setProcedure((MedicinalProductAuthorizationProcedure)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__MARKETING_STATUS:
				getMarketingStatus().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__COUNTRY:
				return country != null && !country.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				return legalStatusOfSupply != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS:
				return status != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__STATUS_DATE:
				return statusDate != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__RESTORE_DATE:
				return restoreDate != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__VALIDITY_PERIOD:
				return validityPeriod != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATA_EXCLUSIVITY_PERIOD:
				return dataExclusivityPeriod != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__DATE_OF_FIRST_AUTHORIZATION:
				return dateOfFirstAuthorization != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__INTERNATIONAL_BIRTH_DATE:
				return internationalBirthDate != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__JURISDICTIONAL_AUTHORIZATION:
				return jurisdictionalAuthorization != null && !jurisdictionalAuthorization.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__HOLDER:
				return holder != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__REGULATOR:
				return regulator != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__PROCEDURE:
				return procedure != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION__MARKETING_STATUS:
				return marketingStatus != null && !marketingStatus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductAuthorizationImpl
