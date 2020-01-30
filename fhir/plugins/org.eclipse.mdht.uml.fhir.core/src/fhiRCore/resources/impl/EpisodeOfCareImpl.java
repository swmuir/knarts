/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.EpisodeOfCare;
import fhiRCore.resources.EpisodeOfCareDiagnosis;
import fhiRCore.resources.EpisodeOfCareStatusHistory;
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
 * An implementation of the model object '<em><b>Episode Of Care</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getStatusHistories <em>Status History</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getReferralRequests <em>Referral Request</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getCareManager <em>Care Manager</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getTeams <em>Team</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EpisodeOfCareImpl#getAccounts <em>Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpisodeOfCareImpl extends DomainResourceImpl implements EpisodeOfCare {
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
	 * The cached value of the '{@link #getStatusHistories() <em>Status History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<EpisodeOfCareStatusHistory> statusHistories;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<EpisodeOfCareDiagnosis> diagnosis;

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
	 * The cached value of the '{@link #getManagingOrganization() <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference managingOrganization;

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
	 * The cached value of the '{@link #getReferralRequests() <em>Referral Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> referralRequests;

	/**
	 * The cached value of the '{@link #getCareManager() <em>Care Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareManager()
	 * @generated
	 * @ordered
	 */
	protected Reference careManager;

	/**
	 * The cached value of the '{@link #getTeams() <em>Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> teams;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> accounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeOfCareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEpisodeOfCare();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EpisodeOfCareStatusHistory> getStatusHistories() {
		if (statusHistories == null) {
			statusHistories = new EObjectContainmentEList<EpisodeOfCareStatusHistory>(EpisodeOfCareStatusHistory.class, this, ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY);
		}
		return statusHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EPISODE_OF_CARE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EpisodeOfCareDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<EpisodeOfCareDiagnosis>(EpisodeOfCareDiagnosis.class, this, ResourcesPackage.EPISODE_OF_CARE__DIAGNOSIS);
		}
		return diagnosis;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, oldManagingOrganization, newManagingOrganization);
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
				msgs = ((InternalEObject)managingOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, null, msgs);
			if (newManagingOrganization != null)
				msgs = ((InternalEObject)newManagingOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, null, msgs);
			msgs = basicSetManagingOrganization(newManagingOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION, newManagingOrganization, newManagingOrganization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferralRequests() {
		if (referralRequests == null) {
			referralRequests = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST);
		}
		return referralRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCareManager() {
		return careManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCareManager(Reference newCareManager, NotificationChain msgs) {
		Reference oldCareManager = careManager;
		careManager = newCareManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER, oldCareManager, newCareManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCareManager(Reference newCareManager) {
		if (newCareManager != careManager) {
			NotificationChain msgs = null;
			if (careManager != null)
				msgs = ((InternalEObject)careManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER, null, msgs);
			if (newCareManager != null)
				msgs = ((InternalEObject)newCareManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER, null, msgs);
			msgs = basicSetCareManager(newCareManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER, newCareManager, newCareManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.EPISODE_OF_CARE__TEAM);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.EPISODE_OF_CARE__ACCOUNT);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return ((InternalEList<?>)getStatusHistories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				return basicSetManagingOrganization(null, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return ((InternalEList<?>)getReferralRequests()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				return basicSetCareManager(null, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				return getStatus();
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return getStatusHistories();
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				return getTypes();
			case ResourcesPackage.EPISODE_OF_CARE__DIAGNOSIS:
				return getDiagnosis();
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				return getPatient();
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				return getManagingOrganization();
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				return getPeriod();
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return getReferralRequests();
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				return getCareManager();
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				return getTeams();
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				return getAccounts();
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
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				getStatusHistories().clear();
				getStatusHistories().addAll((Collection<? extends EpisodeOfCareStatusHistory>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends EpisodeOfCareDiagnosis>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				getReferralRequests().clear();
				getReferralRequests().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				setCareManager((Reference)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				getStatusHistories().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				setManagingOrganization((Reference)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				getReferralRequests().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				setCareManager((Reference)null);
				return;
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				getTeams().clear();
				return;
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				getAccounts().clear();
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
			case ResourcesPackage.EPISODE_OF_CARE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__STATUS:
				return status != null;
			case ResourcesPackage.EPISODE_OF_CARE__STATUS_HISTORY:
				return statusHistories != null && !statusHistories.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__PATIENT:
				return patient != null;
			case ResourcesPackage.EPISODE_OF_CARE__MANAGING_ORGANIZATION:
				return managingOrganization != null;
			case ResourcesPackage.EPISODE_OF_CARE__PERIOD:
				return period != null;
			case ResourcesPackage.EPISODE_OF_CARE__REFERRAL_REQUEST:
				return referralRequests != null && !referralRequests.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__CARE_MANAGER:
				return careManager != null;
			case ResourcesPackage.EPISODE_OF_CARE__TEAM:
				return teams != null && !teams.isEmpty();
			case ResourcesPackage.EPISODE_OF_CARE__ACCOUNT:
				return accounts != null && !accounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EpisodeOfCareImpl
