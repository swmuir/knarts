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
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.Schedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ScheduleImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ScheduleImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ScheduleImpl#getServiceCategories <em>Service Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ScheduleImpl#getServiceTypes <em>Service Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ScheduleImpl#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ScheduleImpl#getActors <em>Actor</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ScheduleImpl#getPlanningHorizon <em>Planning Horizon</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ScheduleImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends DomainResourceImpl implements Schedule {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getServiceCategories() <em>Service Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceCategories;

	/**
	 * The cached value of the '{@link #getServiceTypes() <em>Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> serviceTypes;

	/**
	 * The cached value of the '{@link #getSpecialties() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialties;

	/**
	 * The cached value of the '{@link #getActors() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> actors;

	/**
	 * The cached value of the '{@link #getPlanningHorizon() <em>Planning Horizon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningHorizon()
	 * @generated
	 * @ordered
	 */
	protected Period planningHorizon;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.SCHEDULE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newActive, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__ACTIVE, oldActive, newActive);
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
	public void setActive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SCHEDULE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SCHEDULE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getServiceCategories() {
		if (serviceCategories == null) {
			serviceCategories = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SCHEDULE__SERVICE_CATEGORY);
		}
		return serviceCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getServiceTypes() {
		if (serviceTypes == null) {
			serviceTypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SCHEDULE__SERVICE_TYPE);
		}
		return serviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSpecialties() {
		if (specialties == null) {
			specialties = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SCHEDULE__SPECIALTY);
		}
		return specialties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SCHEDULE__ACTOR);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period getPlanningHorizon() {
		return planningHorizon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanningHorizon(Period newPlanningHorizon, NotificationChain msgs) {
		Period oldPlanningHorizon = planningHorizon;
		planningHorizon = newPlanningHorizon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__PLANNING_HORIZON, oldPlanningHorizon, newPlanningHorizon);
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
	public void setPlanningHorizon(Period newPlanningHorizon) {
		if (newPlanningHorizon != planningHorizon) {
			NotificationChain msgs = null;
			if (planningHorizon != null)
				msgs = ((InternalEObject)planningHorizon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SCHEDULE__PLANNING_HORIZON, null, msgs);
			if (newPlanningHorizon != null)
				msgs = ((InternalEObject)newPlanningHorizon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SCHEDULE__PLANNING_HORIZON, null, msgs);
			msgs = basicSetPlanningHorizon(newPlanningHorizon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__PLANNING_HORIZON, newPlanningHorizon, newPlanningHorizon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__COMMENT, oldComment, newComment);
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
	public void setComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SCHEDULE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SCHEDULE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SCHEDULE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SCHEDULE__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				return ((InternalEList<?>)getServiceCategories()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				return ((InternalEList<?>)getServiceTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				return ((InternalEList<?>)getSpecialties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SCHEDULE__ACTOR:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				return basicSetPlanningHorizon(null, msgs);
			case ResourcesPackage.SCHEDULE__COMMENT:
				return basicSetComment(null, msgs);
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
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SCHEDULE__ACTIVE:
				return getActive();
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				return getServiceCategories();
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				return getServiceTypes();
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				return getSpecialties();
			case ResourcesPackage.SCHEDULE__ACTOR:
				return getActors();
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				return getPlanningHorizon();
			case ResourcesPackage.SCHEDULE__COMMENT:
				return getComment();
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
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SCHEDULE__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				getServiceCategories().clear();
				getServiceCategories().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				getServiceTypes().clear();
				getServiceTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				getSpecialties().clear();
				getSpecialties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SCHEDULE__ACTOR:
				getActors().clear();
				getActors().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				setPlanningHorizon((Period)newValue);
				return;
			case ResourcesPackage.SCHEDULE__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SCHEDULE__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				getServiceCategories().clear();
				return;
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				getServiceTypes().clear();
				return;
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				getSpecialties().clear();
				return;
			case ResourcesPackage.SCHEDULE__ACTOR:
				getActors().clear();
				return;
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				setPlanningHorizon((Period)null);
				return;
			case ResourcesPackage.SCHEDULE__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.SCHEDULE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SCHEDULE__ACTIVE:
				return active != null;
			case ResourcesPackage.SCHEDULE__SERVICE_CATEGORY:
				return serviceCategories != null && !serviceCategories.isEmpty();
			case ResourcesPackage.SCHEDULE__SERVICE_TYPE:
				return serviceTypes != null && !serviceTypes.isEmpty();
			case ResourcesPackage.SCHEDULE__SPECIALTY:
				return specialties != null && !specialties.isEmpty();
			case ResourcesPackage.SCHEDULE__ACTOR:
				return actors != null && !actors.isEmpty();
			case ResourcesPackage.SCHEDULE__PLANNING_HORIZON:
				return planningHorizon != null;
			case ResourcesPackage.SCHEDULE__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
