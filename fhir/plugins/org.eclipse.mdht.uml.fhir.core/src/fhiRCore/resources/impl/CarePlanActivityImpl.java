/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CarePlanActivity;
import fhiRCore.resources.CarePlanActivityDetail;
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
 * An implementation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityImpl#getOutcomeCodeableConcepts <em>Outcome Codeable Concept</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityImpl#getOutcomeReferences <em>Outcome Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityImpl#getProgresses <em>Progress</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CarePlanActivityImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarePlanActivityImpl extends BackboneElementImpl implements CarePlanActivity {
	/**
	 * The cached value of the '{@link #getOutcomeCodeableConcepts() <em>Outcome Codeable Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeCodeableConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> outcomeCodeableConcepts;

	/**
	 * The cached value of the '{@link #getOutcomeReferences() <em>Outcome Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> outcomeReferences;

	/**
	 * The cached value of the '{@link #getProgresses() <em>Progress</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> progresses;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected CarePlanActivityDetail detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarePlanActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCarePlanActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getOutcomeCodeableConcepts() {
		if (outcomeCodeableConcepts == null) {
			outcomeCodeableConcepts = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_CODEABLE_CONCEPT);
		}
		return outcomeCodeableConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getOutcomeReferences() {
		if (outcomeReferences == null) {
			outcomeReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_REFERENCE);
		}
		return outcomeReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getProgresses() {
		if (progresses == null) {
			progresses = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.CARE_PLAN_ACTIVITY__PROGRESS);
		}
		return progresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Reference newReference, NotificationChain msgs) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanActivityDetail getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(CarePlanActivityDetail newDetail, NotificationChain msgs) {
		CarePlanActivityDetail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(CarePlanActivityDetail newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_CODEABLE_CONCEPT:
				return ((InternalEList<?>)getOutcomeCodeableConcepts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_REFERENCE:
				return ((InternalEList<?>)getOutcomeReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return ((InternalEList<?>)getProgresses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return basicSetReference(null, msgs);
			case ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL:
				return basicSetDetail(null, msgs);
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_CODEABLE_CONCEPT:
				return getOutcomeCodeableConcepts();
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_REFERENCE:
				return getOutcomeReferences();
			case ResourcesPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return getProgresses();
			case ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return getReference();
			case ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL:
				return getDetail();
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_CODEABLE_CONCEPT:
				getOutcomeCodeableConcepts().clear();
				getOutcomeCodeableConcepts().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_REFERENCE:
				getOutcomeReferences().clear();
				getOutcomeReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				getProgresses().clear();
				getProgresses().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				setReference((Reference)newValue);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL:
				setDetail((CarePlanActivityDetail)newValue);
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_CODEABLE_CONCEPT:
				getOutcomeCodeableConcepts().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_REFERENCE:
				getOutcomeReferences().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				getProgresses().clear();
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				setReference((Reference)null);
				return;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL:
				setDetail((CarePlanActivityDetail)null);
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
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_CODEABLE_CONCEPT:
				return outcomeCodeableConcepts != null && !outcomeCodeableConcepts.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY__OUTCOME_REFERENCE:
				return outcomeReferences != null && !outcomeReferences.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY__PROGRESS:
				return progresses != null && !progresses.isEmpty();
			case ResourcesPackage.CARE_PLAN_ACTIVITY__REFERENCE:
				return reference != null;
			case ResourcesPackage.CARE_PLAN_ACTIVITY__DETAIL:
				return detail != null;
		}
		return super.eIsSet(featureID);
	}

} //CarePlanActivityImpl
