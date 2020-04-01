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

import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeAdministrationGuidelines;
import org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeAdministrationGuidelinesDosage;
import org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Administration Guidelines</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationKnowledgeAdministrationGuidelinesImpl#getDosages <em>Dosage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationKnowledgeAdministrationGuidelinesImpl#getIndicationx <em>Indicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationKnowledgeAdministrationGuidelinesImpl#getPatientCharacteristics <em>Patient Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeAdministrationGuidelinesImpl extends BackboneElementImpl implements MedicationKnowledgeAdministrationGuidelines {
	/**
	 * The cached value of the '{@link #getDosages() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosages()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeAdministrationGuidelinesDosage> dosages;

	/**
	 * The cached value of the '{@link #getIndicationx() <em>Indicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationx()
	 * @generated
	 * @ordered
	 */
	protected DataType indicationx;

	/**
	 * The cached value of the '{@link #getPatientCharacteristics() <em>Patient Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics> patientCharacteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeAdministrationGuidelinesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationKnowledgeAdministrationGuidelines();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeAdministrationGuidelinesDosage> getDosages() {
		if (dosages == null) {
			dosages = new EObjectContainmentEList<MedicationKnowledgeAdministrationGuidelinesDosage>(MedicationKnowledgeAdministrationGuidelinesDosage.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE);
		}
		return dosages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getIndicationx() {
		return indicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicationx(DataType newIndicationx, NotificationChain msgs) {
		DataType oldIndicationx = indicationx;
		indicationx = newIndicationx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX, oldIndicationx, newIndicationx);
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
	public void setIndicationx(DataType newIndicationx) {
		if (newIndicationx != indicationx) {
			NotificationChain msgs = null;
			if (indicationx != null)
				msgs = ((InternalEObject)indicationx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX, null, msgs);
			if (newIndicationx != null)
				msgs = ((InternalEObject)newIndicationx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX, null, msgs);
			msgs = basicSetIndicationx(newIndicationx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX, newIndicationx, newIndicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics> getPatientCharacteristics() {
		if (patientCharacteristics == null) {
			patientCharacteristics = new EObjectContainmentEList<MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics>(MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS);
		}
		return patientCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				return ((InternalEList<?>)getDosages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX:
				return basicSetIndicationx(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				return ((InternalEList<?>)getPatientCharacteristics()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				return getDosages();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX:
				return getIndicationx();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				return getPatientCharacteristics();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				getDosages().clear();
				getDosages().addAll((Collection<? extends MedicationKnowledgeAdministrationGuidelinesDosage>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX:
				setIndicationx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				getPatientCharacteristics().clear();
				getPatientCharacteristics().addAll((Collection<? extends MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics>)newValue);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				getDosages().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX:
				setIndicationx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				getPatientCharacteristics().clear();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__DOSAGE:
				return dosages != null && !dosages.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__INDICATIONX:
				return indicationx != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES__PATIENT_CHARACTERISTICS:
				return patientCharacteristics != null && !patientCharacteristics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeAdministrationGuidelinesImpl
