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
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ObservationComponent;
import org.eclipse.mdht.hl7.fhir.resources.ObservationReferenceRange;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationComponentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationComponentImpl#getValuex <em>Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationComponentImpl#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationComponentImpl#getInterpretations <em>Interpretation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ObservationComponentImpl#getReferenceRanges <em>Reference Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationComponentImpl extends BackboneElementImpl implements ObservationComponent {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * The cached value of the '{@link #getDataAbsentReason() <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAbsentReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dataAbsentReason;

	/**
	 * The cached value of the '{@link #getInterpretations() <em>Interpretation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretations()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> interpretations;

	/**
	 * The cached value of the '{@link #getReferenceRanges() <em>Reference Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationReferenceRange> referenceRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getObservationComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_COMPONENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_COMPONENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuex(DataType newValuex, NotificationChain msgs) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__VALUEX, oldValuex, newValuex);
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
	public void setValuex(DataType newValuex) {
		if (newValuex != valuex) {
			NotificationChain msgs = null;
			if (valuex != null)
				msgs = ((InternalEObject)valuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_COMPONENT__VALUEX, null, msgs);
			if (newValuex != null)
				msgs = ((InternalEObject)newValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_COMPONENT__VALUEX, null, msgs);
			msgs = basicSetValuex(newValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__VALUEX, newValuex, newValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getDataAbsentReason() {
		return dataAbsentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAbsentReason(CodeableConcept newDataAbsentReason, NotificationChain msgs) {
		CodeableConcept oldDataAbsentReason = dataAbsentReason;
		dataAbsentReason = newDataAbsentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON, oldDataAbsentReason, newDataAbsentReason);
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
	public void setDataAbsentReason(CodeableConcept newDataAbsentReason) {
		if (newDataAbsentReason != dataAbsentReason) {
			NotificationChain msgs = null;
			if (dataAbsentReason != null)
				msgs = ((InternalEObject)dataAbsentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON, null, msgs);
			if (newDataAbsentReason != null)
				msgs = ((InternalEObject)newDataAbsentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON, null, msgs);
			msgs = basicSetDataAbsentReason(newDataAbsentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON, newDataAbsentReason, newDataAbsentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getInterpretations() {
		if (interpretations == null) {
			interpretations = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION);
		}
		return interpretations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationReferenceRange> getReferenceRanges() {
		if (referenceRanges == null) {
			referenceRanges = new EObjectContainmentEList<ObservationReferenceRange>(ObservationReferenceRange.class, this, ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE);
		}
		return referenceRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				return basicSetValuex(null, msgs);
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				return basicSetDataAbsentReason(null, msgs);
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				return ((InternalEList<?>)getInterpretations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				return ((InternalEList<?>)getReferenceRanges()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				return getCode();
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				return getValuex();
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				return getDataAbsentReason();
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				return getInterpretations();
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				return getReferenceRanges();
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
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				setValuex((DataType)newValue);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				getInterpretations().clear();
				getInterpretations().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				getReferenceRanges().clear();
				getReferenceRanges().addAll((Collection<? extends ObservationReferenceRange>)newValue);
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
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				setValuex((DataType)null);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				setDataAbsentReason((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				getInterpretations().clear();
				return;
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				getReferenceRanges().clear();
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
			case ResourcesPackage.OBSERVATION_COMPONENT__CODE:
				return code != null;
			case ResourcesPackage.OBSERVATION_COMPONENT__VALUEX:
				return valuex != null;
			case ResourcesPackage.OBSERVATION_COMPONENT__DATA_ABSENT_REASON:
				return dataAbsentReason != null;
			case ResourcesPackage.OBSERVATION_COMPONENT__INTERPRETATION:
				return interpretations != null && !interpretations.isEmpty();
			case ResourcesPackage.OBSERVATION_COMPONENT__REFERENCE_RANGE:
				return referenceRanges != null && !referenceRanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationComponentImpl
