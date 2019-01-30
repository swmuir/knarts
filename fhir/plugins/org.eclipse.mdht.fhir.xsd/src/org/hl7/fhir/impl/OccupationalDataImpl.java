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

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.OccupationalData;
import org.hl7.fhir.OccupationalDataCombatZoneHazardousDuty;
import org.hl7.fhir.OccupationalDataEmploymentStatus;
import org.hl7.fhir.OccupationalDataPastOrPresentOccupation;
import org.hl7.fhir.OccupationalDataRetirementStatus;
import org.hl7.fhir.OccupationalDataUsualOccupation;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occupational Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getEmploymentStatus <em>Employment Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getRetirementStatus <em>Retirement Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getCombatZoneHazardousDuty <em>Combat Zone Hazardous Duty</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getUsualOccupation <em>Usual Occupation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OccupationalDataImpl#getPastOrPresentOccupation <em>Past Or Present Occupation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccupationalDataImpl extends DomainResourceImpl implements OccupationalData {
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PublicationStatus status;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> author;

	/**
	 * The cached value of the '{@link #getEmploymentStatus() <em>Employment Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentStatus()
	 * @generated
	 * @ordered
	 */
	protected OccupationalDataEmploymentStatus employmentStatus;

	/**
	 * The cached value of the '{@link #getRetirementStatus() <em>Retirement Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetirementStatus()
	 * @generated
	 * @ordered
	 */
	protected OccupationalDataRetirementStatus retirementStatus;

	/**
	 * The cached value of the '{@link #getCombatZoneHazardousDuty() <em>Combat Zone Hazardous Duty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombatZoneHazardousDuty()
	 * @generated
	 * @ordered
	 */
	protected EList<OccupationalDataCombatZoneHazardousDuty> combatZoneHazardousDuty;

	/**
	 * The cached value of the '{@link #getUsualOccupation() <em>Usual Occupation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsualOccupation()
	 * @generated
	 * @ordered
	 */
	protected OccupationalDataUsualOccupation usualOccupation;

	/**
	 * The cached value of the '{@link #getPastOrPresentOccupation() <em>Past Or Present Occupation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastOrPresentOccupation()
	 * @generated
	 * @ordered
	 */
	protected OccupationalDataPastOrPresentOccupation pastOrPresentOccupation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccupationalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOccupationalData();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(PublicationStatus newStatus, NotificationChain msgs) {
		PublicationStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PublicationStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.OCCUPATIONAL_DATA__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupationalDataEmploymentStatus getEmploymentStatus() {
		return employmentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmploymentStatus(OccupationalDataEmploymentStatus newEmploymentStatus, NotificationChain msgs) {
		OccupationalDataEmploymentStatus oldEmploymentStatus = employmentStatus;
		employmentStatus = newEmploymentStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS, oldEmploymentStatus, newEmploymentStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploymentStatus(OccupationalDataEmploymentStatus newEmploymentStatus) {
		if (newEmploymentStatus != employmentStatus) {
			NotificationChain msgs = null;
			if (employmentStatus != null)
				msgs = ((InternalEObject)employmentStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS, null, msgs);
			if (newEmploymentStatus != null)
				msgs = ((InternalEObject)newEmploymentStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS, null, msgs);
			msgs = basicSetEmploymentStatus(newEmploymentStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS, newEmploymentStatus, newEmploymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupationalDataRetirementStatus getRetirementStatus() {
		return retirementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetirementStatus(OccupationalDataRetirementStatus newRetirementStatus, NotificationChain msgs) {
		OccupationalDataRetirementStatus oldRetirementStatus = retirementStatus;
		retirementStatus = newRetirementStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS, oldRetirementStatus, newRetirementStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetirementStatus(OccupationalDataRetirementStatus newRetirementStatus) {
		if (newRetirementStatus != retirementStatus) {
			NotificationChain msgs = null;
			if (retirementStatus != null)
				msgs = ((InternalEObject)retirementStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS, null, msgs);
			if (newRetirementStatus != null)
				msgs = ((InternalEObject)newRetirementStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS, null, msgs);
			msgs = basicSetRetirementStatus(newRetirementStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS, newRetirementStatus, newRetirementStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OccupationalDataCombatZoneHazardousDuty> getCombatZoneHazardousDuty() {
		if (combatZoneHazardousDuty == null) {
			combatZoneHazardousDuty = new EObjectContainmentEList<OccupationalDataCombatZoneHazardousDuty>(OccupationalDataCombatZoneHazardousDuty.class, this, FhirPackage.OCCUPATIONAL_DATA__COMBAT_ZONE_HAZARDOUS_DUTY);
		}
		return combatZoneHazardousDuty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupationalDataUsualOccupation getUsualOccupation() {
		return usualOccupation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsualOccupation(OccupationalDataUsualOccupation newUsualOccupation, NotificationChain msgs) {
		OccupationalDataUsualOccupation oldUsualOccupation = usualOccupation;
		usualOccupation = newUsualOccupation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION, oldUsualOccupation, newUsualOccupation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsualOccupation(OccupationalDataUsualOccupation newUsualOccupation) {
		if (newUsualOccupation != usualOccupation) {
			NotificationChain msgs = null;
			if (usualOccupation != null)
				msgs = ((InternalEObject)usualOccupation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION, null, msgs);
			if (newUsualOccupation != null)
				msgs = ((InternalEObject)newUsualOccupation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION, null, msgs);
			msgs = basicSetUsualOccupation(newUsualOccupation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION, newUsualOccupation, newUsualOccupation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccupationalDataPastOrPresentOccupation getPastOrPresentOccupation() {
		return pastOrPresentOccupation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPastOrPresentOccupation(OccupationalDataPastOrPresentOccupation newPastOrPresentOccupation, NotificationChain msgs) {
		OccupationalDataPastOrPresentOccupation oldPastOrPresentOccupation = pastOrPresentOccupation;
		pastOrPresentOccupation = newPastOrPresentOccupation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION, oldPastOrPresentOccupation, newPastOrPresentOccupation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPastOrPresentOccupation(OccupationalDataPastOrPresentOccupation newPastOrPresentOccupation) {
		if (newPastOrPresentOccupation != pastOrPresentOccupation) {
			NotificationChain msgs = null;
			if (pastOrPresentOccupation != null)
				msgs = ((InternalEObject)pastOrPresentOccupation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION, null, msgs);
			if (newPastOrPresentOccupation != null)
				msgs = ((InternalEObject)newPastOrPresentOccupation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION, null, msgs);
			msgs = basicSetPastOrPresentOccupation(newPastOrPresentOccupation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION, newPastOrPresentOccupation, newPastOrPresentOccupation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS:
				return basicSetEmploymentStatus(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS:
				return basicSetRetirementStatus(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__COMBAT_ZONE_HAZARDOUS_DUTY:
				return ((InternalEList<?>)getCombatZoneHazardousDuty()).basicRemove(otherEnd, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION:
				return basicSetUsualOccupation(null, msgs);
			case FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION:
				return basicSetPastOrPresentOccupation(null, msgs);
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
			case FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.OCCUPATIONAL_DATA__STATUS:
				return getStatus();
			case FhirPackage.OCCUPATIONAL_DATA__SUBJECT:
				return getSubject();
			case FhirPackage.OCCUPATIONAL_DATA__DATE:
				return getDate();
			case FhirPackage.OCCUPATIONAL_DATA__AUTHOR:
				return getAuthor();
			case FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS:
				return getEmploymentStatus();
			case FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS:
				return getRetirementStatus();
			case FhirPackage.OCCUPATIONAL_DATA__COMBAT_ZONE_HAZARDOUS_DUTY:
				return getCombatZoneHazardousDuty();
			case FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION:
				return getUsualOccupation();
			case FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION:
				return getPastOrPresentOccupation();
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
			case FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__STATUS:
				setStatus((PublicationStatus)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS:
				setEmploymentStatus((OccupationalDataEmploymentStatus)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS:
				setRetirementStatus((OccupationalDataRetirementStatus)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__COMBAT_ZONE_HAZARDOUS_DUTY:
				getCombatZoneHazardousDuty().clear();
				getCombatZoneHazardousDuty().addAll((Collection<? extends OccupationalDataCombatZoneHazardousDuty>)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION:
				setUsualOccupation((OccupationalDataUsualOccupation)newValue);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION:
				setPastOrPresentOccupation((OccupationalDataPastOrPresentOccupation)newValue);
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
			case FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__STATUS:
				setStatus((PublicationStatus)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__AUTHOR:
				getAuthor().clear();
				return;
			case FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS:
				setEmploymentStatus((OccupationalDataEmploymentStatus)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS:
				setRetirementStatus((OccupationalDataRetirementStatus)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__COMBAT_ZONE_HAZARDOUS_DUTY:
				getCombatZoneHazardousDuty().clear();
				return;
			case FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION:
				setUsualOccupation((OccupationalDataUsualOccupation)null);
				return;
			case FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION:
				setPastOrPresentOccupation((OccupationalDataPastOrPresentOccupation)null);
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
			case FhirPackage.OCCUPATIONAL_DATA__IDENTIFIER:
				return identifier != null;
			case FhirPackage.OCCUPATIONAL_DATA__STATUS:
				return status != null;
			case FhirPackage.OCCUPATIONAL_DATA__SUBJECT:
				return subject != null;
			case FhirPackage.OCCUPATIONAL_DATA__DATE:
				return date != null;
			case FhirPackage.OCCUPATIONAL_DATA__AUTHOR:
				return author != null && !author.isEmpty();
			case FhirPackage.OCCUPATIONAL_DATA__EMPLOYMENT_STATUS:
				return employmentStatus != null;
			case FhirPackage.OCCUPATIONAL_DATA__RETIREMENT_STATUS:
				return retirementStatus != null;
			case FhirPackage.OCCUPATIONAL_DATA__COMBAT_ZONE_HAZARDOUS_DUTY:
				return combatZoneHazardousDuty != null && !combatZoneHazardousDuty.isEmpty();
			case FhirPackage.OCCUPATIONAL_DATA__USUAL_OCCUPATION:
				return usualOccupation != null;
			case FhirPackage.OCCUPATIONAL_DATA__PAST_OR_PRESENT_OCCUPATION:
				return pastOrPresentOccupation != null;
		}
		return super.eIsSet(featureID);
	}

} //OccupationalDataImpl
