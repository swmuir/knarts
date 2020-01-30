/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.EffectEvidenceSynthesisEffectEstimate;
import fhiRCore.resources.EffectEvidenceSynthesisEffectEstimatePrecisionEstimate;
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
 * An implementation of the model object '<em><b>Effect Evidence Synthesis Effect Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisEffectEstimateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisEffectEstimateImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisEffectEstimateImpl#getVariantState <em>Variant State</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisEffectEstimateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisEffectEstimateImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EffectEvidenceSynthesisEffectEstimateImpl#getPrecisionEstimates <em>Precision Estimate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectEvidenceSynthesisEffectEstimateImpl extends BackboneElementImpl implements EffectEvidenceSynthesisEffectEstimate {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

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
	 * The cached value of the '{@link #getPrecisionEstimates() <em>Precision Estimate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionEstimates()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectEvidenceSynthesisEffectEstimatePrecisionEstimate> precisionEstimates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectEvidenceSynthesisEffectEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEffectEvidenceSynthesisEffectEstimate();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE, oldVariantState, newVariantState);
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
				msgs = ((InternalEObject)variantState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE, null, msgs);
			if (newVariantState != null)
				msgs = ((InternalEObject)newVariantState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE, null, msgs);
			msgs = basicSetVariantState(newVariantState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE, newVariantState, newVariantState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Decimal newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE, oldUnitOfMeasure, newUnitOfMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitOfMeasure(CodeableConcept newUnitOfMeasure) {
		if (newUnitOfMeasure != unitOfMeasure) {
			NotificationChain msgs = null;
			if (unitOfMeasure != null)
				msgs = ((InternalEObject)unitOfMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE, null, msgs);
			if (newUnitOfMeasure != null)
				msgs = ((InternalEObject)newUnitOfMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE, null, msgs);
			msgs = basicSetUnitOfMeasure(newUnitOfMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE, newUnitOfMeasure, newUnitOfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EffectEvidenceSynthesisEffectEstimatePrecisionEstimate> getPrecisionEstimates() {
		if (precisionEstimates == null) {
			precisionEstimates = new EObjectContainmentEList<EffectEvidenceSynthesisEffectEstimatePrecisionEstimate>(EffectEvidenceSynthesisEffectEstimatePrecisionEstimate.class, this, ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__PRECISION_ESTIMATE);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE:
				return basicSetVariantState(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE:
				return basicSetValue(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE:
				return basicSetUnitOfMeasure(null, msgs);
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__PRECISION_ESTIMATE:
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE:
				return getType();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE:
				return getVariantState();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE:
				return getValue();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__PRECISION_ESTIMATE:
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE:
				setVariantState((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE:
				setValue((Decimal)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__PRECISION_ESTIMATE:
				getPrecisionEstimates().clear();
				getPrecisionEstimates().addAll((Collection<? extends EffectEvidenceSynthesisEffectEstimatePrecisionEstimate>)newValue);
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE:
				setVariantState((CodeableConcept)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE:
				setValue((Decimal)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE:
				setUnitOfMeasure((CodeableConcept)null);
				return;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__PRECISION_ESTIMATE:
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
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__TYPE:
				return type != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VARIANT_STATE:
				return variantState != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__VALUE:
				return value != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__UNIT_OF_MEASURE:
				return unitOfMeasure != null;
			case ResourcesPackage.EFFECT_EVIDENCE_SYNTHESIS_EFFECT_ESTIMATE__PRECISION_ESTIMATE:
				return precisionEstimates != null && !precisionEstimates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EffectEvidenceSynthesisEffectEstimateImpl
