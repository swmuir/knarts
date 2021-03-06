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
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Range;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ObservationReferenceRange;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Reference Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationReferenceRangeImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationReferenceRangeImpl#getHigh <em>High</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationReferenceRangeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationReferenceRangeImpl#getAppliesTos <em>Applies To</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationReferenceRangeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationReferenceRangeImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationReferenceRangeImpl extends BackboneElementImpl implements ObservationReferenceRange {
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected Quantity low;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected Quantity high;

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
	 * The cached value of the '{@link #getAppliesTos() <em>Applies To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTos()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> appliesTos;

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
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationReferenceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getObservationReferenceRange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLow(Quantity newLow, NotificationChain msgs) {
		Quantity oldLow = low;
		low = newLow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW, oldLow, newLow);
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
	public void setLow(Quantity newLow) {
		if (newLow != low) {
			NotificationChain msgs = null;
			if (low != null)
				msgs = ((InternalEObject)low).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW, null, msgs);
			if (newLow != null)
				msgs = ((InternalEObject)newLow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW, null, msgs);
			msgs = basicSetLow(newLow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW, newLow, newLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigh(Quantity newHigh, NotificationChain msgs) {
		Quantity oldHigh = high;
		high = newHigh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH, oldHigh, newHigh);
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
	public void setHigh(Quantity newHigh) {
		if (newHigh != high) {
			NotificationChain msgs = null;
			if (high != null)
				msgs = ((InternalEObject)high).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH, null, msgs);
			if (newHigh != null)
				msgs = ((InternalEObject)newHigh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH, null, msgs);
			msgs = basicSetHigh(newHigh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH, newHigh, newHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAppliesTos() {
		if (appliesTos == null) {
			appliesTos = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO);
		}
		return appliesTos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE, oldAge, newAge);
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
	public void setAge(Range newAge) {
		if (newAge != age) {
			NotificationChain msgs = null;
			if (age != null)
				msgs = ((InternalEObject)age).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE, null, msgs);
			if (newAge != null)
				msgs = ((InternalEObject)newAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE, null, msgs);
			msgs = basicSetAge(newAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE, newAge, newAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.eclipse.mdht.hl7.fhir.dataTypes.String newText, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT, oldText, newText);
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
	public void setText(org.eclipse.mdht.hl7.fhir.dataTypes.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return basicSetLow(null, msgs);
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return basicSetHigh(null, msgs);
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				return ((InternalEList<?>)getAppliesTos()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return basicSetAge(null, msgs);
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return basicSetText(null, msgs);
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
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return getLow();
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return getHigh();
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				return getType();
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				return getAppliesTos();
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return getAge();
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return getText();
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
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				setLow((Quantity)newValue);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				setHigh((Quantity)newValue);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				getAppliesTos().clear();
				getAppliesTos().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				setAge((Range)newValue);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				setText((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				setLow((Quantity)null);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				setHigh((Quantity)null);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				getAppliesTos().clear();
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				setAge((Range)null);
				return;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				setText((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return low != null;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return high != null;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				return type != null;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				return appliesTos != null && !appliesTos.isEmpty();
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return age != null;
			case ResourcesPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationReferenceRangeImpl
