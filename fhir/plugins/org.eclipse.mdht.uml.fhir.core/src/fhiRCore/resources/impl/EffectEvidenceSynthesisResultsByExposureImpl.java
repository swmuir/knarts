/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.EffectEvidenceSynthesisResultsByExposure;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Evidence Synthesis Results By Exposure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisResultsByExposureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisResultsByExposureImpl#getExposureState <em>Exposure State</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisResultsByExposureImpl#getVariantState <em>Variant State</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisResultsByExposureImpl#getRiskEvidenceSynthesis <em>Risk Evidence Synthesis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectEvidenceSynthesisResultsByExposureImpl extends BackboneElementImpl implements EffectEvidenceSynthesisResultsByExposure {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getExposureState() <em>Exposure State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureState()
	 * @generated
	 * @ordered
	 */
	protected Code exposureState;

	/**
	 * The cached value of the '{@link #getVariantState() <em>Variant State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantState()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept variantState;

	/**
	 * The cached value of the '{@link #getRiskEvidenceSynthesis() <em>Risk Evidence Synthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskEvidenceSynthesis()
	 * @generated
	 * @ordered
	 */
	protected Reference riskEvidenceSynthesis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectEvidenceSynthesisResultsByExposureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEffectEvidenceSynthesisResultsByExposure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getExposureState() {
		return exposureState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureState(Code newExposureState, NotificationChain msgs) {
		Code oldExposureState = exposureState;
		exposureState = newExposureState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE, oldExposureState, newExposureState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureState(Code newExposureState) {
		if (newExposureState != exposureState) {
			NotificationChain msgs = null;
			if (exposureState != null)
				msgs = ((InternalEObject)exposureState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE, null, msgs);
			if (newExposureState != null)
				msgs = ((InternalEObject)newExposureState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE, null, msgs);
			msgs = basicSetExposureState(newExposureState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE, newExposureState, newExposureState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getVariantState() {
		return variantState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantState(CodeableConcept newVariantState, NotificationChain msgs) {
		CodeableConcept oldVariantState = variantState;
		variantState = newVariantState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE, oldVariantState, newVariantState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantState(CodeableConcept newVariantState) {
		if (newVariantState != variantState) {
			NotificationChain msgs = null;
			if (variantState != null)
				msgs = ((InternalEObject)variantState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE, null, msgs);
			if (newVariantState != null)
				msgs = ((InternalEObject)newVariantState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE, null, msgs);
			msgs = basicSetVariantState(newVariantState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE, newVariantState, newVariantState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRiskEvidenceSynthesis() {
		return riskEvidenceSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskEvidenceSynthesis(Reference newRiskEvidenceSynthesis, NotificationChain msgs) {
		Reference oldRiskEvidenceSynthesis = riskEvidenceSynthesis;
		riskEvidenceSynthesis = newRiskEvidenceSynthesis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS, oldRiskEvidenceSynthesis, newRiskEvidenceSynthesis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskEvidenceSynthesis(Reference newRiskEvidenceSynthesis) {
		if (newRiskEvidenceSynthesis != riskEvidenceSynthesis) {
			NotificationChain msgs = null;
			if (riskEvidenceSynthesis != null)
				msgs = ((InternalEObject)riskEvidenceSynthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS, null, msgs);
			if (newRiskEvidenceSynthesis != null)
				msgs = ((InternalEObject)newRiskEvidenceSynthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS, null, msgs);
			msgs = basicSetRiskEvidenceSynthesis(newRiskEvidenceSynthesis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS, newRiskEvidenceSynthesis, newRiskEvidenceSynthesis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE:
				return basicSetExposureState(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE:
				return basicSetVariantState(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS:
				return basicSetRiskEvidenceSynthesis(null, msgs);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE:
				return getExposureState();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE:
				return getVariantState();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS:
				return getRiskEvidenceSynthesis();
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE:
				setExposureState((Code)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE:
				setVariantState((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS:
				setRiskEvidenceSynthesis((Reference)newValue);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE:
				setExposureState((Code)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE:
				setVariantState((CodeableConcept)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS:
				setRiskEvidenceSynthesis((Reference)null);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__EXPOSURE_STATE:
				return exposureState != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__VARIANT_STATE:
				return variantState != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_RESULTS_BY_EXPOSURE__RISK_EVIDENCE_SYNTHESIS:
				return riskEvidenceSynthesis != null;
		}
		return super.eIsSet(featureID);
	}

} //EffectEvidenceSynthesisResultsByExposureImpl
