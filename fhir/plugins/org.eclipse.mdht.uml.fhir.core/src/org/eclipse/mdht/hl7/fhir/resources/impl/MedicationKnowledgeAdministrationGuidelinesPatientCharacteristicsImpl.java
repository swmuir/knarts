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

import org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Administration Guidelines Patient Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsImpl#getCharacteristicx <em>Characteristicx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsImpl#getValues <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsImpl extends BackboneElementImpl implements MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics {
	/**
	 * The cached value of the '{@link #getCharacteristicx() <em>Characteristicx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicx()
	 * @generated
	 * @ordered
	 */
	protected DataType characteristicx;

	/**
	 * The cached value of the '{@link #getValues() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getCharacteristicx() {
		return characteristicx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacteristicx(DataType newCharacteristicx, NotificationChain msgs) {
		DataType oldCharacteristicx = characteristicx;
		characteristicx = newCharacteristicx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX, oldCharacteristicx, newCharacteristicx);
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
	public void setCharacteristicx(DataType newCharacteristicx) {
		if (newCharacteristicx != characteristicx) {
			NotificationChain msgs = null;
			if (characteristicx != null)
				msgs = ((InternalEObject)characteristicx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX, null, msgs);
			if (newCharacteristicx != null)
				msgs = ((InternalEObject)newCharacteristicx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX, null, msgs);
			msgs = basicSetCharacteristicx(newCharacteristicx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX, newCharacteristicx, newCharacteristicx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__VALUE);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX:
				return basicSetCharacteristicx(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__VALUE:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX:
				return getCharacteristicx();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__VALUE:
				return getValues();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX:
				setCharacteristicx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__VALUE:
				getValues().clear();
				getValues().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX:
				setCharacteristicx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__VALUE:
				getValues().clear();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__CHARACTERISTICX:
				return characteristicx != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_PATIENT_CHARACTERISTICS__VALUE:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeAdministrationGuidelinesPatientCharacteristicsImpl
