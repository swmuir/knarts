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
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductIndication;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductIndicationOtherTherapy;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getDiseaseSymptomProcedure <em>Disease Symptom Procedure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getComorbidities <em>Comorbidity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getIntendedEffect <em>Intended Effect</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getOtherTherapies <em>Other Therapy</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getUndesirableEffects <em>Undesirable Effect</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIndicationImpl#getPopulations <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIndicationImpl extends DomainResourceImpl implements MedicinalProductIndication {
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
	 * The cached value of the '{@link #getDiseaseSymptomProcedure() <em>Disease Symptom Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseSymptomProcedure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diseaseSymptomProcedure;

	/**
	 * The cached value of the '{@link #getDiseaseStatus() <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept diseaseStatus;

	/**
	 * The cached value of the '{@link #getComorbidities() <em>Comorbidity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComorbidities()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> comorbidities;

	/**
	 * The cached value of the '{@link #getIntendedEffect() <em>Intended Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedEffect()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intendedEffect;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Quantity duration;

	/**
	 * The cached value of the '{@link #getOtherTherapies() <em>Other Therapy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTherapies()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductIndicationOtherTherapy> otherTherapies;

	/**
	 * The cached value of the '{@link #getUndesirableEffects() <em>Undesirable Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndesirableEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> undesirableEffects;

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
	protected MedicinalProductIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductIndication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDiseaseSymptomProcedure() {
		return diseaseSymptomProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiseaseSymptomProcedure(CodeableConcept newDiseaseSymptomProcedure, NotificationChain msgs) {
		CodeableConcept oldDiseaseSymptomProcedure = diseaseSymptomProcedure;
		diseaseSymptomProcedure = newDiseaseSymptomProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE, oldDiseaseSymptomProcedure, newDiseaseSymptomProcedure);
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
	public void setDiseaseSymptomProcedure(CodeableConcept newDiseaseSymptomProcedure) {
		if (newDiseaseSymptomProcedure != diseaseSymptomProcedure) {
			NotificationChain msgs = null;
			if (diseaseSymptomProcedure != null)
				msgs = ((InternalEObject)diseaseSymptomProcedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE, null, msgs);
			if (newDiseaseSymptomProcedure != null)
				msgs = ((InternalEObject)newDiseaseSymptomProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE, null, msgs);
			msgs = basicSetDiseaseSymptomProcedure(newDiseaseSymptomProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE, newDiseaseSymptomProcedure, newDiseaseSymptomProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDiseaseStatus() {
		return diseaseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiseaseStatus(CodeableConcept newDiseaseStatus, NotificationChain msgs) {
		CodeableConcept oldDiseaseStatus = diseaseStatus;
		diseaseStatus = newDiseaseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS, oldDiseaseStatus, newDiseaseStatus);
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
	public void setDiseaseStatus(CodeableConcept newDiseaseStatus) {
		if (newDiseaseStatus != diseaseStatus) {
			NotificationChain msgs = null;
			if (diseaseStatus != null)
				msgs = ((InternalEObject)diseaseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS, null, msgs);
			if (newDiseaseStatus != null)
				msgs = ((InternalEObject)newDiseaseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS, null, msgs);
			msgs = basicSetDiseaseStatus(newDiseaseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS, newDiseaseStatus, newDiseaseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getComorbidities() {
		if (comorbidities == null) {
			comorbidities = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY);
		}
		return comorbidities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getIntendedEffect() {
		return intendedEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntendedEffect(CodeableConcept newIntendedEffect, NotificationChain msgs) {
		CodeableConcept oldIntendedEffect = intendedEffect;
		intendedEffect = newIntendedEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT, oldIntendedEffect, newIntendedEffect);
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
	public void setIntendedEffect(CodeableConcept newIntendedEffect) {
		if (newIntendedEffect != intendedEffect) {
			NotificationChain msgs = null;
			if (intendedEffect != null)
				msgs = ((InternalEObject)intendedEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT, null, msgs);
			if (newIntendedEffect != null)
				msgs = ((InternalEObject)newIntendedEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT, null, msgs);
			msgs = basicSetIntendedEffect(newIntendedEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT, newIntendedEffect, newIntendedEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Quantity newDuration, NotificationChain msgs) {
		Quantity oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION, oldDuration, newDuration);
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
	public void setDuration(Quantity newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductIndicationOtherTherapy> getOtherTherapies() {
		if (otherTherapies == null) {
			otherTherapies = new EObjectContainmentEList<MedicinalProductIndicationOtherTherapy>(MedicinalProductIndicationOtherTherapy.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY);
		}
		return otherTherapies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getUndesirableEffects() {
		if (undesirableEffects == null) {
			undesirableEffects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT);
		}
		return undesirableEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Population> getPopulations() {
		if (populations == null) {
			populations = new EObjectContainmentEList<Population>(Population.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return basicSetDiseaseSymptomProcedure(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				return basicSetDiseaseStatus(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				return ((InternalEList<?>)getComorbidities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				return basicSetIntendedEffect(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				return basicSetDuration(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				return ((InternalEList<?>)getOtherTherapies()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				return ((InternalEList<?>)getUndesirableEffects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				return getSubjects();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return getDiseaseSymptomProcedure();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				return getDiseaseStatus();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				return getComorbidities();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				return getIntendedEffect();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				return getDuration();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				return getOtherTherapies();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				return getUndesirableEffects();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				setDiseaseSymptomProcedure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				getComorbidities().clear();
				getComorbidities().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				setIntendedEffect((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				setDuration((Quantity)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				getOtherTherapies().clear();
				getOtherTherapies().addAll((Collection<? extends MedicinalProductIndicationOtherTherapy>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				getUndesirableEffects().clear();
				getUndesirableEffects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				setDiseaseSymptomProcedure((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				setDiseaseStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				getComorbidities().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				setIntendedEffect((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				setDuration((Quantity)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				getOtherTherapies().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				getUndesirableEffects().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_SYMPTOM_PROCEDURE:
				return diseaseSymptomProcedure != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DISEASE_STATUS:
				return diseaseStatus != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__COMORBIDITY:
				return comorbidities != null && !comorbidities.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__INTENDED_EFFECT:
				return intendedEffect != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__DURATION:
				return duration != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__OTHER_THERAPY:
				return otherTherapies != null && !otherTherapies.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__UNDESIRABLE_EFFECT:
				return undesirableEffects != null && !undesirableEffects.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_INDICATION__POPULATION:
				return populations != null && !populations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIndicationImpl
