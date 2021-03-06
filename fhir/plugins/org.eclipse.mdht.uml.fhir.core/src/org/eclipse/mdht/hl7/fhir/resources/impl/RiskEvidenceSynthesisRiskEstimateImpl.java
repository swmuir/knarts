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
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimate;
import org.eclipse.mdht.hl7.fhir.resources.RiskEvidenceSynthesisRiskEstimatePrecisionEstimate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Evidence Synthesis Risk Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskEvidenceSynthesisRiskEstimateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskEvidenceSynthesisRiskEstimateImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskEvidenceSynthesisRiskEstimateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskEvidenceSynthesisRiskEstimateImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskEvidenceSynthesisRiskEstimateImpl#getDenominatorCount <em>Denominator Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskEvidenceSynthesisRiskEstimateImpl#getNumeratorCount <em>Numerator Count</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskEvidenceSynthesisRiskEstimateImpl#getPrecisionEstimates <em>Precision Estimate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskEvidenceSynthesisRiskEstimateImpl extends BackboneElementImpl implements RiskEvidenceSynthesisRiskEstimate {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Decimal value;

	/**
	 * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unitOfMeasure;

	/**
	 * The cached value of the '{@link #getDenominatorCount() <em>Denominator Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominatorCount()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer denominatorCount;

	/**
	 * The cached value of the '{@link #getNumeratorCount() <em>Numerator Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeratorCount()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer numeratorCount;

	/**
	 * The cached value of the '{@link #getPrecisionEstimates() <em>Precision Estimate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionEstimates()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskEvidenceSynthesisRiskEstimatePrecisionEstimate> precisionEstimates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskEvidenceSynthesisRiskEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRiskEvidenceSynthesisRiskEstimate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Decimal newValue, NotificationChain msgs) {
		Decimal oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE, oldValue, newValue);
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
	public void setValue(Decimal newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfMeasure(CodeableConcept newUnitOfMeasure, NotificationChain msgs) {
		CodeableConcept oldUnitOfMeasure = unitOfMeasure;
		unitOfMeasure = newUnitOfMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE, oldUnitOfMeasure, newUnitOfMeasure);
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
	public void setUnitOfMeasure(CodeableConcept newUnitOfMeasure) {
		if (newUnitOfMeasure != unitOfMeasure) {
			NotificationChain msgs = null;
			if (unitOfMeasure != null)
				msgs = ((InternalEObject)unitOfMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE, null, msgs);
			if (newUnitOfMeasure != null)
				msgs = ((InternalEObject)newUnitOfMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE, null, msgs);
			msgs = basicSetUnitOfMeasure(newUnitOfMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE, newUnitOfMeasure, newUnitOfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getDenominatorCount() {
		return denominatorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenominatorCount(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newDenominatorCount, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldDenominatorCount = denominatorCount;
		denominatorCount = newDenominatorCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT, oldDenominatorCount, newDenominatorCount);
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
	public void setDenominatorCount(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newDenominatorCount) {
		if (newDenominatorCount != denominatorCount) {
			NotificationChain msgs = null;
			if (denominatorCount != null)
				msgs = ((InternalEObject)denominatorCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT, null, msgs);
			if (newDenominatorCount != null)
				msgs = ((InternalEObject)newDenominatorCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT, null, msgs);
			msgs = basicSetDenominatorCount(newDenominatorCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT, newDenominatorCount, newDenominatorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getNumeratorCount() {
		return numeratorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumeratorCount(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newNumeratorCount, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldNumeratorCount = numeratorCount;
		numeratorCount = newNumeratorCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT, oldNumeratorCount, newNumeratorCount);
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
	public void setNumeratorCount(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newNumeratorCount) {
		if (newNumeratorCount != numeratorCount) {
			NotificationChain msgs = null;
			if (numeratorCount != null)
				msgs = ((InternalEObject)numeratorCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT, null, msgs);
			if (newNumeratorCount != null)
				msgs = ((InternalEObject)newNumeratorCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT, null, msgs);
			msgs = basicSetNumeratorCount(newNumeratorCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT, newNumeratorCount, newNumeratorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RiskEvidenceSynthesisRiskEstimatePrecisionEstimate> getPrecisionEstimates() {
		if (precisionEstimates == null) {
			precisionEstimates = new EObjectContainmentEList<RiskEvidenceSynthesisRiskEstimatePrecisionEstimate>(RiskEvidenceSynthesisRiskEstimatePrecisionEstimate.class, this, ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE);
		}
		return precisionEstimates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				return basicSetValue(null, msgs);
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				return basicSetUnitOfMeasure(null, msgs);
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				return basicSetDenominatorCount(null, msgs);
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				return basicSetNumeratorCount(null, msgs);
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				return ((InternalEList<?>)getPrecisionEstimates()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				return getType();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				return getValue();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				return getDenominatorCount();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				return getNumeratorCount();
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				return getPrecisionEstimates();
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
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				setValue((Decimal)newValue);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				setDenominatorCount((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				setNumeratorCount((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				getPrecisionEstimates().clear();
				getPrecisionEstimates().addAll((Collection<? extends RiskEvidenceSynthesisRiskEstimatePrecisionEstimate>)newValue);
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
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				setValue((Decimal)null);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)null);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				setDenominatorCount((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				setNumeratorCount((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				getPrecisionEstimates().clear();
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
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__TYPE:
				return type != null;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__VALUE:
				return value != null;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__UNIT_OF_MEASURE:
				return unitOfMeasure != null;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__DENOMINATOR_COUNT:
				return denominatorCount != null;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__NUMERATOR_COUNT:
				return numeratorCount != null;
			case ResourcesPackage.RISK_EVIDENCE_SYNTHESIS_RISK_ESTIMATE__PRECISION_ESTIMATE:
				return precisionEstimates != null && !precisionEstimates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RiskEvidenceSynthesisRiskEstimateImpl
