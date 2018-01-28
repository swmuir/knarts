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
import org.hl7.fhir.ObservationDefinitionQualifiedInterval;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition Qualified Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedIntervalImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedIntervalImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedIntervalImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedIntervalImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedIntervalImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedIntervalImpl#getGestationalAge <em>Gestational Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionQualifiedIntervalImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionQualifiedIntervalImpl extends BackboneElementImpl implements ObservationDefinitionQualifiedInterval {
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
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

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
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> appliesTo;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected Range age;

	/**
	 * The cached value of the '{@link #getGestationalAge() <em>Gestational Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGestationalAge()
	 * @generated
	 * @ordered
	 */
	protected Range gestationalAge;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionQualifiedIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getObservationDefinitionQualifiedInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAppliesTo() {
		if (appliesTo == null) {
			appliesTo = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO);
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAge(Range newAge, NotificationChain msgs) {
		Range oldAge = age;
		age = newAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE, oldAge, newAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(Range newAge) {
		if (newAge != age) {
			NotificationChain msgs = null;
			if (age != null)
				msgs = ((InternalEObject)age).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE, null, msgs);
			if (newAge != null)
				msgs = ((InternalEObject)newAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE, null, msgs);
			msgs = basicSetAge(newAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE, newAge, newAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getGestationalAge() {
		return gestationalAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGestationalAge(Range newGestationalAge, NotificationChain msgs) {
		Range oldGestationalAge = gestationalAge;
		gestationalAge = newGestationalAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE, oldGestationalAge, newGestationalAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGestationalAge(Range newGestationalAge) {
		if (newGestationalAge != gestationalAge) {
			NotificationChain msgs = null;
			if (gestationalAge != null)
				msgs = ((InternalEObject)gestationalAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE, null, msgs);
			if (newGestationalAge != null)
				msgs = ((InternalEObject)newGestationalAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE, null, msgs);
			msgs = basicSetGestationalAge(newGestationalAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE, newGestationalAge, newGestationalAge));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				return basicSetRange(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				return ((InternalEList<?>)getAppliesTo()).basicRemove(otherEnd, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				return basicSetAge(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				return basicSetGestationalAge(null, msgs);
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
				return basicSetCondition(null, msgs);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				return getCategory();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				return getRange();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE:
				return getType();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				return getAppliesTo();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				return getAge();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				return getGestationalAge();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
				return getCondition();
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
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				setRange((Range)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				setAge((Range)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				setGestationalAge((Range)newValue);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
				setCondition((org.hl7.fhir.String)newValue);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				setRange((Range)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				getAppliesTo().clear();
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				setAge((Range)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				setGestationalAge((Range)null);
				return;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
				setCondition((org.hl7.fhir.String)null);
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
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				return category != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				return range != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__TYPE:
				return type != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				return appliesTo != null && !appliesTo.isEmpty();
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				return age != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				return gestationalAge != null;
			case FhirPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionQualifiedIntervalImpl
