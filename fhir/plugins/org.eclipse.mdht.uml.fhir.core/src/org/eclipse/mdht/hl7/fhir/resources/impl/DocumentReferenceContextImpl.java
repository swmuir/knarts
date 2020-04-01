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

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.DocumentReferenceContext;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Reference Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentReferenceContextImpl#getEncounters <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentReferenceContextImpl#getEvents <em>Event</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentReferenceContextImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentReferenceContextImpl#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentReferenceContextImpl#getPracticeSetting <em>Practice Setting</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentReferenceContextImpl#getSourcePatientInfo <em>Source Patient Info</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DocumentReferenceContextImpl#getRelateds <em>Related</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentReferenceContextImpl extends BackboneElementImpl implements DocumentReferenceContext {
	/**
	 * The cached value of the '{@link #getEncounters() <em>Encounter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounters()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> encounters;

	/**
	 * The cached value of the '{@link #getEvents() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> events;

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
	 * The cached value of the '{@link #getFacilityType() <em>Facility Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept facilityType;

	/**
	 * The cached value of the '{@link #getPracticeSetting() <em>Practice Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPracticeSetting()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept practiceSetting;

	/**
	 * The cached value of the '{@link #getSourcePatientInfo() <em>Source Patient Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePatientInfo()
	 * @generated
	 * @ordered
	 */
	protected Reference sourcePatientInfo;

	/**
	 * The cached value of the '{@link #getRelateds() <em>Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateds()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> relateds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentReferenceContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDocumentReferenceContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getEncounters() {
		if (encounters == null) {
			encounters = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER);
		}
		return encounters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT);
		}
		return events;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFacilityType() {
		return facilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilityType(CodeableConcept newFacilityType, NotificationChain msgs) {
		CodeableConcept oldFacilityType = facilityType;
		facilityType = newFacilityType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, oldFacilityType, newFacilityType);
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
	public void setFacilityType(CodeableConcept newFacilityType) {
		if (newFacilityType != facilityType) {
			NotificationChain msgs = null;
			if (facilityType != null)
				msgs = ((InternalEObject)facilityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, null, msgs);
			if (newFacilityType != null)
				msgs = ((InternalEObject)newFacilityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, null, msgs);
			msgs = basicSetFacilityType(newFacilityType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE, newFacilityType, newFacilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPracticeSetting() {
		return practiceSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPracticeSetting(CodeableConcept newPracticeSetting, NotificationChain msgs) {
		CodeableConcept oldPracticeSetting = practiceSetting;
		practiceSetting = newPracticeSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, oldPracticeSetting, newPracticeSetting);
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
	public void setPracticeSetting(CodeableConcept newPracticeSetting) {
		if (newPracticeSetting != practiceSetting) {
			NotificationChain msgs = null;
			if (practiceSetting != null)
				msgs = ((InternalEObject)practiceSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, null, msgs);
			if (newPracticeSetting != null)
				msgs = ((InternalEObject)newPracticeSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, null, msgs);
			msgs = basicSetPracticeSetting(newPracticeSetting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING, newPracticeSetting, newPracticeSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSourcePatientInfo() {
		return sourcePatientInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcePatientInfo(Reference newSourcePatientInfo, NotificationChain msgs) {
		Reference oldSourcePatientInfo = sourcePatientInfo;
		sourcePatientInfo = newSourcePatientInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, oldSourcePatientInfo, newSourcePatientInfo);
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
	public void setSourcePatientInfo(Reference newSourcePatientInfo) {
		if (newSourcePatientInfo != sourcePatientInfo) {
			NotificationChain msgs = null;
			if (sourcePatientInfo != null)
				msgs = ((InternalEObject)sourcePatientInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, null, msgs);
			if (newSourcePatientInfo != null)
				msgs = ((InternalEObject)newSourcePatientInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, null, msgs);
			msgs = basicSetSourcePatientInfo(newSourcePatientInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO, newSourcePatientInfo, newSourcePatientInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getRelateds() {
		if (relateds == null) {
			relateds = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED);
		}
		return relateds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				return ((InternalEList<?>)getEncounters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				return basicSetPeriod(null, msgs);
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				return basicSetFacilityType(null, msgs);
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				return basicSetPracticeSetting(null, msgs);
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				return basicSetSourcePatientInfo(null, msgs);
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return ((InternalEList<?>)getRelateds()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				return getEncounters();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				return getEvents();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				return getPeriod();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				return getFacilityType();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				return getPracticeSetting();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				return getSourcePatientInfo();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return getRelateds();
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
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				getEncounters().clear();
				getEncounters().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				getEvents().clear();
				getEvents().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				setFacilityType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				setPracticeSetting((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				setSourcePatientInfo((Reference)newValue);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				getRelateds().clear();
				getRelateds().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				getEncounters().clear();
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				getEvents().clear();
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				setPeriod((Period)null);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				setFacilityType((CodeableConcept)null);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				setPracticeSetting((CodeableConcept)null);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				setSourcePatientInfo((Reference)null);
				return;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				getRelateds().clear();
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
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__ENCOUNTER:
				return encounters != null && !encounters.isEmpty();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__EVENT:
				return events != null && !events.isEmpty();
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PERIOD:
				return period != null;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__FACILITY_TYPE:
				return facilityType != null;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__PRACTICE_SETTING:
				return practiceSetting != null;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__SOURCE_PATIENT_INFO:
				return sourcePatientInfo != null;
			case ResourcesPackage.DOCUMENT_REFERENCE_CONTEXT__RELATED:
				return relateds != null && !relateds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentReferenceContextImpl
