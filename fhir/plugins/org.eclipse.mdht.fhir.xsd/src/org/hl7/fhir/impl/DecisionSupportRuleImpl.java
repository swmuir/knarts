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

import org.hl7.fhir.DecisionSupportRule;
import org.hl7.fhir.DecisionSupportRuleAction;
import org.hl7.fhir.DecisionSupportRuleTrigger;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ModuleMetadata;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleImpl#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportRuleImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportRuleImpl extends DomainResourceImpl implements DecisionSupportRule {
	/**
	 * The cached value of the '{@link #getModuleMetadata() <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMetadata()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadata moduleMetadata;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> library;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportRuleTrigger> trigger;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String condition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportRuleAction> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDecisionSupportRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadata getModuleMetadata() {
		return moduleMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleMetadata(ModuleMetadata newModuleMetadata, NotificationChain msgs) {
		ModuleMetadata oldModuleMetadata = moduleMetadata;
		moduleMetadata = newModuleMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA, oldModuleMetadata, newModuleMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleMetadata(ModuleMetadata newModuleMetadata) {
		if (newModuleMetadata != moduleMetadata) {
			NotificationChain msgs = null;
			if (moduleMetadata != null)
				msgs = ((InternalEObject)moduleMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA, null, msgs);
			if (newModuleMetadata != null)
				msgs = ((InternalEObject)newModuleMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA, null, msgs);
			msgs = basicSetModuleMetadata(newModuleMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA, newModuleMetadata, newModuleMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DECISION_SUPPORT_RULE__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportRuleTrigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<DecisionSupportRuleTrigger>(DecisionSupportRuleTrigger.class, this, FhirPackage.DECISION_SUPPORT_RULE__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(org.hl7.fhir.String newCondition, NotificationChain msgs) {
		org.hl7.fhir.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(org.hl7.fhir.String newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_RULE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_RULE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportRuleAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<DecisionSupportRuleAction>(DecisionSupportRuleAction.class, this, FhirPackage.DECISION_SUPPORT_RULE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				return basicSetModuleMetadata(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.DECISION_SUPPORT_RULE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				return getModuleMetadata();
			case FhirPackage.DECISION_SUPPORT_RULE__LIBRARY:
				return getLibrary();
			case FhirPackage.DECISION_SUPPORT_RULE__TRIGGER:
				return getTrigger();
			case FhirPackage.DECISION_SUPPORT_RULE__CONDITION:
				return getCondition();
			case FhirPackage.DECISION_SUPPORT_RULE__ACTION:
				return getAction();
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
			case FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends DecisionSupportRuleTrigger>)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE__CONDITION:
				setCondition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends DecisionSupportRuleAction>)newValue);
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
			case FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE__LIBRARY:
				getLibrary().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_RULE__TRIGGER:
				getTrigger().clear();
				return;
			case FhirPackage.DECISION_SUPPORT_RULE__CONDITION:
				setCondition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DECISION_SUPPORT_RULE__ACTION:
				getAction().clear();
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
			case FhirPackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				return moduleMetadata != null;
			case FhirPackage.DECISION_SUPPORT_RULE__LIBRARY:
				return library != null && !library.isEmpty();
			case FhirPackage.DECISION_SUPPORT_RULE__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case FhirPackage.DECISION_SUPPORT_RULE__CONDITION:
				return condition != null;
			case FhirPackage.DECISION_SUPPORT_RULE__ACTION:
				return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionSupportRuleImpl
