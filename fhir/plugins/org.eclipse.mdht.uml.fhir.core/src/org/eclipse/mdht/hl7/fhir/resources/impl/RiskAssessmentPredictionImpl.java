/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.RiskAssessmentPrediction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment Prediction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskAssessmentPredictionImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskAssessmentPredictionImpl#getProbabilityx <em>Probabilityx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskAssessmentPredictionImpl#getQualitativeRisk <em>Qualitative Risk</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskAssessmentPredictionImpl#getRelativeRisk <em>Relative Risk</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskAssessmentPredictionImpl#getWhenx <em>Whenx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.RiskAssessmentPredictionImpl#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskAssessmentPredictionImpl extends BackboneElementImpl implements RiskAssessmentPrediction {
	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getProbabilityx() <em>Probabilityx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityx()
	 * @generated
	 * @ordered
	 */
	protected DataType probabilityx;

	/**
	 * The cached value of the '{@link #getQualitativeRisk() <em>Qualitative Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeRisk()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept qualitativeRisk;

	/**
	 * The cached value of the '{@link #getRelativeRisk() <em>Relative Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeRisk()
	 * @generated
	 * @ordered
	 */
	protected Decimal relativeRisk;

	/**
	 * The cached value of the '{@link #getWhenx() <em>Whenx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenx()
	 * @generated
	 * @ordered
	 */
	protected DataType whenx;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String rationale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentPredictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRiskAssessmentPrediction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, oldOutcome, newOutcome);
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
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getProbabilityx() {
		return probabilityx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbabilityx(DataType newProbabilityx, NotificationChain msgs) {
		DataType oldProbabilityx = probabilityx;
		probabilityx = newProbabilityx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX, oldProbabilityx, newProbabilityx);
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
	public void setProbabilityx(DataType newProbabilityx) {
		if (newProbabilityx != probabilityx) {
			NotificationChain msgs = null;
			if (probabilityx != null)
				msgs = ((InternalEObject)probabilityx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX, null, msgs);
			if (newProbabilityx != null)
				msgs = ((InternalEObject)newProbabilityx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX, null, msgs);
			msgs = basicSetProbabilityx(newProbabilityx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX, newProbabilityx, newProbabilityx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getQualitativeRisk() {
		return qualitativeRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualitativeRisk(CodeableConcept newQualitativeRisk, NotificationChain msgs) {
		CodeableConcept oldQualitativeRisk = qualitativeRisk;
		qualitativeRisk = newQualitativeRisk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK, oldQualitativeRisk, newQualitativeRisk);
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
	public void setQualitativeRisk(CodeableConcept newQualitativeRisk) {
		if (newQualitativeRisk != qualitativeRisk) {
			NotificationChain msgs = null;
			if (qualitativeRisk != null)
				msgs = ((InternalEObject)qualitativeRisk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK, null, msgs);
			if (newQualitativeRisk != null)
				msgs = ((InternalEObject)newQualitativeRisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK, null, msgs);
			msgs = basicSetQualitativeRisk(newQualitativeRisk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK, newQualitativeRisk, newQualitativeRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Decimal getRelativeRisk() {
		return relativeRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativeRisk(Decimal newRelativeRisk, NotificationChain msgs) {
		Decimal oldRelativeRisk = relativeRisk;
		relativeRisk = newRelativeRisk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, oldRelativeRisk, newRelativeRisk);
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
	public void setRelativeRisk(Decimal newRelativeRisk) {
		if (newRelativeRisk != relativeRisk) {
			NotificationChain msgs = null;
			if (relativeRisk != null)
				msgs = ((InternalEObject)relativeRisk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, null, msgs);
			if (newRelativeRisk != null)
				msgs = ((InternalEObject)newRelativeRisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, null, msgs);
			msgs = basicSetRelativeRisk(newRelativeRisk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK, newRelativeRisk, newRelativeRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getWhenx() {
		return whenx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenx(DataType newWhenx, NotificationChain msgs) {
		DataType oldWhenx = whenx;
		whenx = newWhenx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX, oldWhenx, newWhenx);
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
	public void setWhenx(DataType newWhenx) {
		if (newWhenx != whenx) {
			NotificationChain msgs = null;
			if (whenx != null)
				msgs = ((InternalEObject)whenx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX, null, msgs);
			if (newWhenx != null)
				msgs = ((InternalEObject)newWhenx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX, null, msgs);
			msgs = basicSetWhenx(newWhenx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX, newWhenx, newWhenx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationale(org.eclipse.mdht.hl7.fhir.dataTypes.String newRationale, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, oldRationale, newRationale);
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
	public void setRationale(org.eclipse.mdht.hl7.fhir.dataTypes.String newRationale) {
		if (newRationale != rationale) {
			NotificationChain msgs = null;
			if (rationale != null)
				msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, null, msgs);
			if (newRationale != null)
				msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, null, msgs);
			msgs = basicSetRationale(newRationale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE, newRationale, newRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				return basicSetOutcome(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				return basicSetProbabilityx(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				return basicSetQualitativeRisk(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				return basicSetRelativeRisk(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				return basicSetWhenx(null, msgs);
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				return basicSetRationale(null, msgs);
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
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				return getOutcome();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				return getProbabilityx();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				return getQualitativeRisk();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				return getRelativeRisk();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				return getWhenx();
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				return getRationale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				setProbabilityx((DataType)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				setQualitativeRisk((CodeableConcept)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				setRelativeRisk((Decimal)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				setWhenx((DataType)newValue);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				setRationale((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				setProbabilityx((DataType)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				setQualitativeRisk((CodeableConcept)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				setRelativeRisk((Decimal)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				setWhenx((DataType)null);
				return;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				setRationale((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__OUTCOME:
				return outcome != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__PROBABILITYX:
				return probabilityx != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__QUALITATIVE_RISK:
				return qualitativeRisk != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RELATIVE_RISK:
				return relativeRisk != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__WHENX:
				return whenx != null;
			case ResourcesPackage.RISK_ASSESSMENT_PREDICTION__RATIONALE:
				return rationale != null;
		}
		return super.eIsSet(featureID);
	}

} //RiskAssessmentPredictionImpl
