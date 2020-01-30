/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Decimal;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ObservationDefinitionQuantitativeDetails;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition Quantitative Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQuantitativeDetailsImpl#getCustomaryUnit <em>Customary Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQuantitativeDetailsImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQuantitativeDetailsImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ObservationDefinitionQuantitativeDetailsImpl#getDecimalPrecision <em>Decimal Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionQuantitativeDetailsImpl extends BackboneElementImpl implements ObservationDefinitionQuantitativeDetails {
	/**
	 * The cached value of the '{@link #getCustomaryUnit() <em>Customary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomaryUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept customaryUnit;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal conversionFactor;

	/**
	 * The cached value of the '{@link #getDecimalPrecision() <em>Decimal Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPrecision()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer decimalPrecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionQuantitativeDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getObservationDefinitionQuantitativeDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCustomaryUnit() {
		return customaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomaryUnit(CodeableConcept newCustomaryUnit, NotificationChain msgs) {
		CodeableConcept oldCustomaryUnit = customaryUnit;
		customaryUnit = newCustomaryUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT, oldCustomaryUnit, newCustomaryUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomaryUnit(CodeableConcept newCustomaryUnit) {
		if (newCustomaryUnit != customaryUnit) {
			NotificationChain msgs = null;
			if (customaryUnit != null)
				msgs = ((InternalEObject)customaryUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT, null, msgs);
			if (newCustomaryUnit != null)
				msgs = ((InternalEObject)newCustomaryUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT, null, msgs);
			msgs = basicSetCustomaryUnit(newCustomaryUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT, newCustomaryUnit, newCustomaryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(CodeableConcept newUnit, NotificationChain msgs) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(CodeableConcept newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversionFactor(Decimal newConversionFactor, NotificationChain msgs) {
		Decimal oldConversionFactor = conversionFactor;
		conversionFactor = newConversionFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR, oldConversionFactor, newConversionFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionFactor(Decimal newConversionFactor) {
		if (newConversionFactor != conversionFactor) {
			NotificationChain msgs = null;
			if (conversionFactor != null)
				msgs = ((InternalEObject)conversionFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR, null, msgs);
			if (newConversionFactor != null)
				msgs = ((InternalEObject)newConversionFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR, null, msgs);
			msgs = basicSetConversionFactor(newConversionFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR, newConversionFactor, newConversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getDecimalPrecision() {
		return decimalPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecimalPrecision(fhiRCore.dataTypes.Integer newDecimalPrecision, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldDecimalPrecision = decimalPrecision;
		decimalPrecision = newDecimalPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION, oldDecimalPrecision, newDecimalPrecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalPrecision(fhiRCore.dataTypes.Integer newDecimalPrecision) {
		if (newDecimalPrecision != decimalPrecision) {
			NotificationChain msgs = null;
			if (decimalPrecision != null)
				msgs = ((InternalEObject)decimalPrecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION, null, msgs);
			if (newDecimalPrecision != null)
				msgs = ((InternalEObject)newDecimalPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION, null, msgs);
			msgs = basicSetDecimalPrecision(newDecimalPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION, newDecimalPrecision, newDecimalPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				return basicSetCustomaryUnit(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				return basicSetUnit(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				return basicSetConversionFactor(null, msgs);
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				return basicSetDecimalPrecision(null, msgs);
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
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				return getCustomaryUnit();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				return getUnit();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				return getConversionFactor();
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				return getDecimalPrecision();
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
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				setCustomaryUnit((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				setConversionFactor((Decimal)newValue);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				setDecimalPrecision((fhiRCore.dataTypes.Integer)newValue);
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
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				setCustomaryUnit((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				setConversionFactor((Decimal)null);
				return;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				setDecimalPrecision((fhiRCore.dataTypes.Integer)null);
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
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CUSTOMARY_UNIT:
				return customaryUnit != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__UNIT:
				return unit != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__CONVERSION_FACTOR:
				return conversionFactor != null;
			case ResourcesPackage.OBSERVATION_DEFINITION_QUANTITATIVE_DETAILS__DECIMAL_PRECISION:
				return decimalPrecision != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionQuantitativeDetailsImpl
