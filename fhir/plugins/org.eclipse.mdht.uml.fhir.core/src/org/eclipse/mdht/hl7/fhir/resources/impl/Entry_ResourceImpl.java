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

import org.eclipse.mdht.hl7.fhir.resources.ActivityDefinition;
import org.eclipse.mdht.hl7.fhir.resources.Entry_Resource;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinition;
import org.eclipse.mdht.hl7.fhir.resources.Questionnaire;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.ValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.Entry_ResourceImpl#getPlanDefinition <em>Plan Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.Entry_ResourceImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.Entry_ResourceImpl#getActivityDefinitions <em>Activity Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.Entry_ResourceImpl#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Entry_ResourceImpl extends ResourceImpl implements Entry_Resource {
	/**
	 * The cached value of the '{@link #getPlanDefinition() <em>Plan Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanDefinition()
	 * @generated
	 * @ordered
	 */
	protected PlanDefinition planDefinition;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Questionnaire questionnaire;

	/**
	 * The cached value of the '{@link #getActivityDefinitions() <em>Activity Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefinition> activityDefinitions;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSet valueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entry_ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEntry_Resource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanDefinition getPlanDefinition() {
		return planDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanDefinition(PlanDefinition newPlanDefinition, NotificationChain msgs) {
		PlanDefinition oldPlanDefinition = planDefinition;
		planDefinition = newPlanDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION, oldPlanDefinition, newPlanDefinition);
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
	public void setPlanDefinition(PlanDefinition newPlanDefinition) {
		if (newPlanDefinition != planDefinition) {
			NotificationChain msgs = null;
			if (planDefinition != null)
				msgs = ((InternalEObject)planDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION, null, msgs);
			if (newPlanDefinition != null)
				msgs = ((InternalEObject)newPlanDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION, null, msgs);
			msgs = basicSetPlanDefinition(newPlanDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION, newPlanDefinition, newPlanDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Questionnaire newQuestionnaire, NotificationChain msgs) {
		Questionnaire oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE, oldQuestionnaire, newQuestionnaire);
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
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		if (newQuestionnaire != questionnaire) {
			NotificationChain msgs = null;
			if (questionnaire != null)
				msgs = ((InternalEObject)questionnaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE, null, msgs);
			if (newQuestionnaire != null)
				msgs = ((InternalEObject)newQuestionnaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE, null, msgs);
			msgs = basicSetQuestionnaire(newQuestionnaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE, newQuestionnaire, newQuestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityDefinition> getActivityDefinitions() {
		if (activityDefinitions == null) {
			activityDefinitions = new EObjectContainmentEList<ActivityDefinition>(ActivityDefinition.class, this, ResourcesPackage.ENTRY_RESOURCE__ACTIVITY_DEFINITION);
		}
		return activityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSet getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(ValueSet newValueSet, NotificationChain msgs) {
		ValueSet oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENTRY_RESOURCE__VALUE_SET, oldValueSet, newValueSet);
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
	public void setValueSet(ValueSet newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENTRY_RESOURCE__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENTRY_RESOURCE__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENTRY_RESOURCE__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION:
				return basicSetPlanDefinition(null, msgs);
			case ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
			case ResourcesPackage.ENTRY_RESOURCE__ACTIVITY_DEFINITION:
				return ((InternalEList<?>)getActivityDefinitions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENTRY_RESOURCE__VALUE_SET:
				return basicSetValueSet(null, msgs);
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
			case ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION:
				return getPlanDefinition();
			case ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE:
				return getQuestionnaire();
			case ResourcesPackage.ENTRY_RESOURCE__ACTIVITY_DEFINITION:
				return getActivityDefinitions();
			case ResourcesPackage.ENTRY_RESOURCE__VALUE_SET:
				return getValueSet();
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
			case ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION:
				setPlanDefinition((PlanDefinition)newValue);
				return;
			case ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case ResourcesPackage.ENTRY_RESOURCE__ACTIVITY_DEFINITION:
				getActivityDefinitions().clear();
				getActivityDefinitions().addAll((Collection<? extends ActivityDefinition>)newValue);
				return;
			case ResourcesPackage.ENTRY_RESOURCE__VALUE_SET:
				setValueSet((ValueSet)newValue);
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
			case ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION:
				setPlanDefinition((PlanDefinition)null);
				return;
			case ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case ResourcesPackage.ENTRY_RESOURCE__ACTIVITY_DEFINITION:
				getActivityDefinitions().clear();
				return;
			case ResourcesPackage.ENTRY_RESOURCE__VALUE_SET:
				setValueSet((ValueSet)null);
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
			case ResourcesPackage.ENTRY_RESOURCE__PLAN_DEFINITION:
				return planDefinition != null;
			case ResourcesPackage.ENTRY_RESOURCE__QUESTIONNAIRE:
				return questionnaire != null;
			case ResourcesPackage.ENTRY_RESOURCE__ACTIVITY_DEFINITION:
				return activityDefinitions != null && !activityDefinitions.isEmpty();
			case ResourcesPackage.ENTRY_RESOURCE__VALUE_SET:
				return valueSet != null;
		}
		return super.eIsSet(featureID);
	}

} //Entry_ResourceImpl
