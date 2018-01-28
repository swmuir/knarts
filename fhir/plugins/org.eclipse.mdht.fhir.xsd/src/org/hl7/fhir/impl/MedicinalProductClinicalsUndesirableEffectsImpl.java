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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicinalProductClinicalsPopulation;
import org.hl7.fhir.MedicinalProductClinicalsUndesirableEffects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Clinicals Undesirable Effects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsUndesirableEffectsImpl#getSymptomConditionEffect <em>Symptom Condition Effect</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsUndesirableEffectsImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsUndesirableEffectsImpl#getFrequencyOfOccurrence <em>Frequency Of Occurrence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductClinicalsUndesirableEffectsImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductClinicalsUndesirableEffectsImpl extends BackboneElementImpl implements MedicinalProductClinicalsUndesirableEffects {
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
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductClinicalsPopulation> population;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductClinicalsUndesirableEffectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductClinicalsUndesirableEffects();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT, oldSymptomConditionEffect, newSymptomConditionEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymptomConditionEffect(CodeableConcept newSymptomConditionEffect) {
		if (newSymptomConditionEffect != symptomConditionEffect) {
			NotificationChain msgs = null;
			if (symptomConditionEffect != null)
				msgs = ((InternalEObject)symptomConditionEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT, null, msgs);
			if (newSymptomConditionEffect != null)
				msgs = ((InternalEObject)newSymptomConditionEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT, null, msgs);
			msgs = basicSetSymptomConditionEffect(newSymptomConditionEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT, newSymptomConditionEffect, newSymptomConditionEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION, oldClassification, newClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(CodeableConcept newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE, oldFrequencyOfOccurrence, newFrequencyOfOccurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyOfOccurrence(CodeableConcept newFrequencyOfOccurrence) {
		if (newFrequencyOfOccurrence != frequencyOfOccurrence) {
			NotificationChain msgs = null;
			if (frequencyOfOccurrence != null)
				msgs = ((InternalEObject)frequencyOfOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE, null, msgs);
			if (newFrequencyOfOccurrence != null)
				msgs = ((InternalEObject)newFrequencyOfOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE, null, msgs);
			msgs = basicSetFrequencyOfOccurrence(newFrequencyOfOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE, newFrequencyOfOccurrence, newFrequencyOfOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductClinicalsPopulation> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<MedicinalProductClinicalsPopulation>(MedicinalProductClinicalsPopulation.class, this, FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT:
				return basicSetSymptomConditionEffect(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE:
				return basicSetFrequencyOfOccurrence(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT:
				return getSymptomConditionEffect();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION:
				return getClassification();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE:
				return getFrequencyOfOccurrence();
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__POPULATION:
				return getPopulation();
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT:
				setSymptomConditionEffect((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION:
				setClassification((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE:
				setFrequencyOfOccurrence((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends MedicinalProductClinicalsPopulation>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT:
				setSymptomConditionEffect((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION:
				setClassification((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE:
				setFrequencyOfOccurrence((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__POPULATION:
				getPopulation().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__SYMPTOM_CONDITION_EFFECT:
				return symptomConditionEffect != null;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__CLASSIFICATION:
				return classification != null;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__FREQUENCY_OF_OCCURRENCE:
				return frequencyOfOccurrence != null;
			case FhirPackage.MEDICINAL_PRODUCT_CLINICALS_UNDESIRABLE_EFFECTS__POPULATION:
				return population != null && !population.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductClinicalsUndesirableEffectsImpl
