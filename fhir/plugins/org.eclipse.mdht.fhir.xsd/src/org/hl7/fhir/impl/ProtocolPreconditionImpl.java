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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProtocolCondition;
import org.hl7.fhir.ProtocolPrecondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProtocolPreconditionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolPreconditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolPreconditionImpl#getIntersection <em>Intersection</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolPreconditionImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolPreconditionImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolPreconditionImpl extends BackboneElementImpl implements ProtocolPrecondition {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ProtocolCondition condition;

	/**
	 * The cached value of the '{@link #getIntersection() <em>Intersection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersection()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolPrecondition> intersection;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolPrecondition> union;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolPrecondition> exclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolPreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProtocolPrecondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ProtocolCondition newCondition, NotificationChain msgs) {
		ProtocolCondition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_PRECONDITION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ProtocolCondition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_PRECONDITION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_PRECONDITION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_PRECONDITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolPrecondition> getIntersection() {
		if (intersection == null) {
			intersection = new EObjectContainmentEList<ProtocolPrecondition>(ProtocolPrecondition.class, this, FhirPackage.PROTOCOL_PRECONDITION__INTERSECTION);
		}
		return intersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolPrecondition> getUnion() {
		if (union == null) {
			union = new EObjectContainmentEList<ProtocolPrecondition>(ProtocolPrecondition.class, this, FhirPackage.PROTOCOL_PRECONDITION__UNION);
		}
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolPrecondition> getExclude() {
		if (exclude == null) {
			exclude = new EObjectContainmentEList<ProtocolPrecondition>(ProtocolPrecondition.class, this, FhirPackage.PROTOCOL_PRECONDITION__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.PROTOCOL_PRECONDITION__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.PROTOCOL_PRECONDITION__INTERSECTION:
				return ((InternalEList<?>)getIntersection()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROTOCOL_PRECONDITION__UNION:
				return ((InternalEList<?>)getUnion()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROTOCOL_PRECONDITION__EXCLUDE:
				return ((InternalEList<?>)getExclude()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION:
				return getDescription();
			case FhirPackage.PROTOCOL_PRECONDITION__CONDITION:
				return getCondition();
			case FhirPackage.PROTOCOL_PRECONDITION__INTERSECTION:
				return getIntersection();
			case FhirPackage.PROTOCOL_PRECONDITION__UNION:
				return getUnion();
			case FhirPackage.PROTOCOL_PRECONDITION__EXCLUDE:
				return getExclude();
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
			case FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PROTOCOL_PRECONDITION__CONDITION:
				setCondition((ProtocolCondition)newValue);
				return;
			case FhirPackage.PROTOCOL_PRECONDITION__INTERSECTION:
				getIntersection().clear();
				getIntersection().addAll((Collection<? extends ProtocolPrecondition>)newValue);
				return;
			case FhirPackage.PROTOCOL_PRECONDITION__UNION:
				getUnion().clear();
				getUnion().addAll((Collection<? extends ProtocolPrecondition>)newValue);
				return;
			case FhirPackage.PROTOCOL_PRECONDITION__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends ProtocolPrecondition>)newValue);
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
			case FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PROTOCOL_PRECONDITION__CONDITION:
				setCondition((ProtocolCondition)null);
				return;
			case FhirPackage.PROTOCOL_PRECONDITION__INTERSECTION:
				getIntersection().clear();
				return;
			case FhirPackage.PROTOCOL_PRECONDITION__UNION:
				getUnion().clear();
				return;
			case FhirPackage.PROTOCOL_PRECONDITION__EXCLUDE:
				getExclude().clear();
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
			case FhirPackage.PROTOCOL_PRECONDITION__DESCRIPTION:
				return description != null;
			case FhirPackage.PROTOCOL_PRECONDITION__CONDITION:
				return condition != null;
			case FhirPackage.PROTOCOL_PRECONDITION__INTERSECTION:
				return intersection != null && !intersection.isEmpty();
			case FhirPackage.PROTOCOL_PRECONDITION__UNION:
				return union != null && !union.isEmpty();
			case FhirPackage.PROTOCOL_PRECONDITION__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtocolPreconditionImpl
