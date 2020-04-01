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
import org.eclipse.mdht.hl7.fhir.dataTypes.Population;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductUndesirableEffect;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Undesirable Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductUndesirableEffectImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductUndesirableEffectImpl#getSymptomConditionEffect <em>Symptom Condition Effect</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductUndesirableEffectImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductUndesirableEffectImpl#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductUndesirableEffectImpl#getPopulations <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductUndesirableEffectImpl extends DomainResourceImpl implements MedicinalProductUndesirableEffect {
	/**
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjects;

	/**
	 * The cached value of the '{@link #getSymptomConditionEffect() <em>Symptom Condition Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptomConditionEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept symptomConditionEffect;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept classification;

	/**
	 * The cached value of the '{@link #getFrequencyOfOccurrence() <em>Frequency Of Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyOfOccurrence()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept frequencyOfOccurrence;

	/**
	 * The cached value of the '{@link #getPopulations() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected EList<Population> populations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductUndesirableEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductUndesirableEffect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getSymptomConditionEffect() {
		return symptomConditionEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymptomConditionEffect(CodeableConcept newSymptomConditionEffect, NotificationChain msgs) {
		CodeableConcept oldSymptomConditionEffect = symptomConditionEffect;
		symptomConditionEffect = newSymptomConditionEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, oldSymptomConditionEffect, newSymptomConditionEffect);
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
	public void setSymptomConditionEffect(CodeableConcept newSymptomConditionEffect) {
		if (newSymptomConditionEffect != symptomConditionEffect) {
			NotificationChain msgs = null;
			if (symptomConditionEffect != null)
				msgs = ((InternalEObject)symptomConditionEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, null, msgs);
			if (newSymptomConditionEffect != null)
				msgs = ((InternalEObject)newSymptomConditionEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, null, msgs);
			msgs = basicSetSymptomConditionEffect(newSymptomConditionEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT, newSymptomConditionEffect, newSymptomConditionEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(CodeableConcept newClassification, NotificationChain msgs) {
		CodeableConcept oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION, oldClassification, newClassification);
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
	public void setClassification(CodeableConcept newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getFrequencyOfOccurrence() {
		return frequencyOfOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequencyOfOccurrence(CodeableConcept newFrequencyOfOccurrence, NotificationChain msgs) {
		CodeableConcept oldFrequencyOfOccurrence = frequencyOfOccurrence;
		frequencyOfOccurrence = newFrequencyOfOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, oldFrequencyOfOccurrence, newFrequencyOfOccurrence);
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
	public void setFrequencyOfOccurrence(CodeableConcept newFrequencyOfOccurrence) {
		if (newFrequencyOfOccurrence != frequencyOfOccurrence) {
			NotificationChain msgs = null;
			if (frequencyOfOccurrence != null)
				msgs = ((InternalEObject)frequencyOfOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, null, msgs);
			if (newFrequencyOfOccurrence != null)
				msgs = ((InternalEObject)newFrequencyOfOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, null, msgs);
			msgs = basicSetFrequencyOfOccurrence(newFrequencyOfOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE, newFrequencyOfOccurrence, newFrequencyOfOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Population> getPopulations() {
		if (populations == null) {
			populations = new EObjectContainmentEList<Population>(Population.class, this, ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION);
		}
		return populations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return basicSetSymptomConditionEffect(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return basicSetFrequencyOfOccurrence(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				return ((InternalEList<?>)getPopulations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				return getSubjects();
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return getSymptomConditionEffect();
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return getClassification();
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return getFrequencyOfOccurrence();
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				return getPopulations();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				setSymptomConditionEffect((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				setClassification((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				setFrequencyOfOccurrence((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				getPopulations().clear();
				getPopulations().addAll((Collection<? extends Population>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				setSymptomConditionEffect((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				setClassification((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				setFrequencyOfOccurrence((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				getPopulations().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__SYMPTOM_CONDITION_EFFECT:
				return symptomConditionEffect != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__CLASSIFICATION:
				return classification != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__FREQUENCY_OF_OCCURRENCE:
				return frequencyOfOccurrence != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT__POPULATION:
				return populations != null && !populations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductUndesirableEffectImpl
