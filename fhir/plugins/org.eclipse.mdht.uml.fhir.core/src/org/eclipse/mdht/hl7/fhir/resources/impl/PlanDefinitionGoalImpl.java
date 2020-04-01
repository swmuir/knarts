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
import org.eclipse.mdht.hl7.fhir.dataTypes.RelatedArtifact;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionGoal;
import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionGoalTarget;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Definition Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionGoalImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionGoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionGoalImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionGoalImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionGoalImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionGoalImpl#getDocumentations <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.PlanDefinitionGoalImpl#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanDefinitionGoalImpl extends BackboneElementImpl implements PlanDefinitionGoal {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept description;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept start;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> addresses;

	/**
	 * The cached value of the '{@link #getDocumentations() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentations()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> documentations;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanDefinitionGoalTarget> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanDefinitionGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getPlanDefinitionGoal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(CodeableConcept newDescription, NotificationChain msgs) {
		CodeableConcept oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(CodeableConcept newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY, oldPriority, newPriority);
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
	public void setPriority(CodeableConcept newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(CodeableConcept newStart, NotificationChain msgs) {
		CodeableConcept oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL__START, oldStart, newStart);
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
	public void setStart(CodeableConcept newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.PLAN_DEFINITION_GOAL__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.PLAN_DEFINITION_GOAL__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.PLAN_DEFINITION_GOAL__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedArtifact> getDocumentations() {
		if (documentations == null) {
			documentations = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, ResourcesPackage.PLAN_DEFINITION_GOAL__DOCUMENTATION);
		}
		return documentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanDefinitionGoalTarget> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<PlanDefinitionGoalTarget>(PlanDefinitionGoalTarget.class, this, ResourcesPackage.PLAN_DEFINITION_GOAL__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY:
				return basicSetPriority(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_GOAL__START:
				return basicSetStart(null, msgs);
			case ResourcesPackage.PLAN_DEFINITION_GOAL__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.PLAN_DEFINITION_GOAL__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY:
				return getCategory();
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY:
				return getPriority();
			case ResourcesPackage.PLAN_DEFINITION_GOAL__START:
				return getStart();
			case ResourcesPackage.PLAN_DEFINITION_GOAL__ADDRESSES:
				return getAddresses();
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DOCUMENTATION:
				return getDocumentations();
			case ResourcesPackage.PLAN_DEFINITION_GOAL__TARGET:
				return getTargets();
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
			case ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION:
				setDescription((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__START:
				setStart((CodeableConcept)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DOCUMENTATION:
				getDocumentations().clear();
				getDocumentations().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends PlanDefinitionGoalTarget>)newValue);
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
			case ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION:
				setDescription((CodeableConcept)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__START:
				setStart((CodeableConcept)null);
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__ADDRESSES:
				getAddresses().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DOCUMENTATION:
				getDocumentations().clear();
				return;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__TARGET:
				getTargets().clear();
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
			case ResourcesPackage.PLAN_DEFINITION_GOAL__CATEGORY:
				return category != null;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DESCRIPTION:
				return description != null;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__PRIORITY:
				return priority != null;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__START:
				return start != null;
			case ResourcesPackage.PLAN_DEFINITION_GOAL__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_GOAL__DOCUMENTATION:
				return documentations != null && !documentations.isEmpty();
			case ResourcesPackage.PLAN_DEFINITION_GOAL__TARGET:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanDefinitionGoalImpl
