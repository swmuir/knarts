/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Range;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ObservationDefinitionQualifiedInterval;
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
 * An implementation of the model object '<em><b>Observation Definition Qualified Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQualifiedIntervalImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQualifiedIntervalImpl#getRange <em>Range</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQualifiedIntervalImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQualifiedIntervalImpl#getAppliesTos <em>Applies To</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQualifiedIntervalImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQualifiedIntervalImpl#getAge <em>Age</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQualifiedIntervalImpl#getGestationalAge <em>Gestational Age</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQualifiedIntervalImpl#getCondition <em>Condition</em>}</li>
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
	protected Code category;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept context;

	/**
	 * The cached value of the '{@link #getAppliesTos() <em>Applies To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTos()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> appliesTos;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Code gender;

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
	protected fhiRCore.dataTypes.String condition;

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
		return ResourcesPackage.eINSTANCE.getObservationDefinitionQualifiedInterval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Code newCategory, NotificationChain msgs) {
		Code oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Code newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE, oldRange, newRange);
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
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(CodeableConcept newContext, NotificationChain msgs) {
		CodeableConcept oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(CodeableConcept newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAppliesTos() {
		if (appliesTos == null) {
			appliesTos = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO);
		}
		return appliesTos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGender(Code newGender, NotificationChain msgs) {
		Code oldGender = gender;
		gender = newGender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER, oldGender, newGender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Code newGender) {
		if (newGender != gender) {
			NotificationChain msgs = null;
			if (gender != null)
				msgs = ((InternalEObject)gender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER, null, msgs);
			if (newGender != null)
				msgs = ((InternalEObject)newGender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER, null, msgs);
			msgs = basicSetGender(newGender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER, newGender, newGender));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE, oldAge, newAge);
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
				msgs = ((InternalEObject)age).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE, null, msgs);
			if (newAge != null)
				msgs = ((InternalEObject)newAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE, null, msgs);
			msgs = basicSetAge(newAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE, newAge, newAge));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE, oldGestationalAge, newGestationalAge);
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
				msgs = ((InternalEObject)gestationalAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE, null, msgs);
			if (newGestationalAge != null)
				msgs = ((InternalEObject)newGestationalAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE, null, msgs);
			msgs = basicSetGestationalAge(newGestationalAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE, newGestationalAge, newGestationalAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(fhiRCore.dataTypes.String newCondition, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(fhiRCore.dataTypes.String newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				return basicSetRange(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT:
				return basicSetContext(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				return ((InternalEList<?>)getAppliesTos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER:
				return basicSetGender(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				return basicSetAge(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				return basicSetGestationalAge(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
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
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				return getCategory();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				return getRange();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT:
				return getContext();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				return getAppliesTos();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER:
				return getGender();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				return getAge();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				return getGestationalAge();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
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
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				setCategory((Code)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				setRange((Range)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT:
				setContext((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				getAppliesTos().clear();
				getAppliesTos().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER:
				setGender((Code)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				setAge((Range)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				setGestationalAge((Range)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
				setCondition((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				setCategory((Code)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				setRange((Range)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT:
				setContext((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				getAppliesTos().clear();
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER:
				setGender((Code)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				setAge((Range)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				setGestationalAge((Range)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
				setCondition((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CATEGORY:
				return category != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__RANGE:
				return range != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONTEXT:
				return context != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__APPLIES_TO:
				return appliesTos != null && !appliesTos.isEmpty();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GENDER:
				return gender != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__AGE:
				return age != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__GESTATIONAL_AGE:
				return gestationalAge != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUALIFIED_INTERVAL__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionQualifiedIntervalImpl
