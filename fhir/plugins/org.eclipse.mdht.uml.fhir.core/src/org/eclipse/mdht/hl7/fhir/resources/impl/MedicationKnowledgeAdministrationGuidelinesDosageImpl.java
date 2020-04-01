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
import org.eclipse.mdht.hl7.fhir.dataTypes.Dosage;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeAdministrationGuidelinesDosage;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Administration Guidelines Dosage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationKnowledgeAdministrationGuidelinesDosageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicationKnowledgeAdministrationGuidelinesDosageImpl#getDosages <em>Dosage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeAdministrationGuidelinesDosageImpl extends BackboneElementImpl implements MedicationKnowledgeAdministrationGuidelinesDosage {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getDosages() <em>Dosage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosages()
	 * @generated
	 * @ordered
	 */
	protected EList<Dosage> dosages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeAdministrationGuidelinesDosageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationKnowledgeAdministrationGuidelinesDosage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dosage> getDosages() {
		if (dosages == null) {
			dosages = new EObjectContainmentEList<Dosage>(Dosage.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__DOSAGE);
		}
		return dosages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__DOSAGE:
				return ((InternalEList<?>)getDosages()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE:
				return getType();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__DOSAGE:
				return getDosages();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__DOSAGE:
				getDosages().clear();
				getDosages().addAll((Collection<? extends Dosage>)newValue);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__DOSAGE:
				getDosages().clear();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__TYPE:
				return type != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_ADMINISTRATION_GUIDELINES_DOSAGE__DOSAGE:
				return dosages != null && !dosages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeAdministrationGuidelinesDosageImpl
