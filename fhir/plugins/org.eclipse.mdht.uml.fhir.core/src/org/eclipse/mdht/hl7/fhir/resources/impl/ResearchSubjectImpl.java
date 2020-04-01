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
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.ResearchSubject;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchSubjectImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchSubjectImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchSubjectImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchSubjectImpl#getStudy <em>Study</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchSubjectImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchSubjectImpl#getAssignedArm <em>Assigned Arm</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchSubjectImpl#getActualArm <em>Actual Arm</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ResearchSubjectImpl#getConsent <em>Consent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchSubjectImpl extends DomainResourceImpl implements ResearchSubject {
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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected Reference study;

	/**
	 * The cached value of the '{@link #getIndividual() <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividual()
	 * @generated
	 * @ordered
	 */
	protected Reference individual;

	/**
	 * The cached value of the '{@link #getAssignedArm() <em>Assigned Arm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedArm()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String assignedArm;

	/**
	 * The cached value of the '{@link #getActualArm() <em>Actual Arm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArm()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String actualArm;

	/**
	 * The cached value of the '{@link #getConsent() <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsent()
	 * @generated
	 * @ordered
	 */
	protected Reference consent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getResearchSubject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getStudy() {
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudy(Reference newStudy, NotificationChain msgs) {
		Reference oldStudy = study;
		study = newStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__STUDY, oldStudy, newStudy);
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
	public void setStudy(Reference newStudy) {
		if (newStudy != study) {
			NotificationChain msgs = null;
			if (study != null)
				msgs = ((InternalEObject)study).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__STUDY, null, msgs);
			if (newStudy != null)
				msgs = ((InternalEObject)newStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__STUDY, null, msgs);
			msgs = basicSetStudy(newStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__STUDY, newStudy, newStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getIndividual() {
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndividual(Reference newIndividual, NotificationChain msgs) {
		Reference oldIndividual = individual;
		individual = newIndividual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL, oldIndividual, newIndividual);
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
	public void setIndividual(Reference newIndividual) {
		if (newIndividual != individual) {
			NotificationChain msgs = null;
			if (individual != null)
				msgs = ((InternalEObject)individual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL, null, msgs);
			if (newIndividual != null)
				msgs = ((InternalEObject)newIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL, null, msgs);
			msgs = basicSetIndividual(newIndividual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL, newIndividual, newIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getAssignedArm() {
		return assignedArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedArm(org.eclipse.mdht.hl7.fhir.dataTypes.String newAssignedArm, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldAssignedArm = assignedArm;
		assignedArm = newAssignedArm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, oldAssignedArm, newAssignedArm);
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
	public void setAssignedArm(org.eclipse.mdht.hl7.fhir.dataTypes.String newAssignedArm) {
		if (newAssignedArm != assignedArm) {
			NotificationChain msgs = null;
			if (assignedArm != null)
				msgs = ((InternalEObject)assignedArm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, null, msgs);
			if (newAssignedArm != null)
				msgs = ((InternalEObject)newAssignedArm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, null, msgs);
			msgs = basicSetAssignedArm(newAssignedArm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM, newAssignedArm, newAssignedArm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getActualArm() {
		return actualArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualArm(org.eclipse.mdht.hl7.fhir.dataTypes.String newActualArm, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldActualArm = actualArm;
		actualArm = newActualArm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM, oldActualArm, newActualArm);
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
	public void setActualArm(org.eclipse.mdht.hl7.fhir.dataTypes.String newActualArm) {
		if (newActualArm != actualArm) {
			NotificationChain msgs = null;
			if (actualArm != null)
				msgs = ((InternalEObject)actualArm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM, null, msgs);
			if (newActualArm != null)
				msgs = ((InternalEObject)newActualArm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM, null, msgs);
			msgs = basicSetActualArm(newActualArm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM, newActualArm, newActualArm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getConsent() {
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsent(Reference newConsent, NotificationChain msgs) {
		Reference oldConsent = consent;
		consent = newConsent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__CONSENT, oldConsent, newConsent);
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
	public void setConsent(Reference newConsent) {
		if (newConsent != consent) {
			NotificationChain msgs = null;
			if (consent != null)
				msgs = ((InternalEObject)consent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__CONSENT, null, msgs);
			if (newConsent != null)
				msgs = ((InternalEObject)newConsent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESEARCH_SUBJECT__CONSENT, null, msgs);
			msgs = basicSetConsent(newConsent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESEARCH_SUBJECT__CONSENT, newConsent, newConsent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				return basicSetStudy(null, msgs);
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				return basicSetIndividual(null, msgs);
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				return basicSetAssignedArm(null, msgs);
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				return basicSetActualArm(null, msgs);
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				return basicSetConsent(null, msgs);
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
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				return getStatus();
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				return getPeriod();
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				return getStudy();
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				return getIndividual();
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				return getAssignedArm();
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				return getActualArm();
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				return getConsent();
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
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				setStudy((Reference)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				setIndividual((Reference)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				setAssignedArm((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				setActualArm((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				setConsent((Reference)newValue);
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
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				setStudy((Reference)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				setIndividual((Reference)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				setAssignedArm((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				setActualArm((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				setConsent((Reference)null);
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
			case ResourcesPackage.RESEARCH_SUBJECT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.RESEARCH_SUBJECT__STATUS:
				return status != null;
			case ResourcesPackage.RESEARCH_SUBJECT__PERIOD:
				return period != null;
			case ResourcesPackage.RESEARCH_SUBJECT__STUDY:
				return study != null;
			case ResourcesPackage.RESEARCH_SUBJECT__INDIVIDUAL:
				return individual != null;
			case ResourcesPackage.RESEARCH_SUBJECT__ASSIGNED_ARM:
				return assignedArm != null;
			case ResourcesPackage.RESEARCH_SUBJECT__ACTUAL_ARM:
				return actualArm != null;
			case ResourcesPackage.RESEARCH_SUBJECT__CONSENT:
				return consent != null;
		}
		return super.eIsSet(featureID);
	}

} //ResearchSubjectImpl
