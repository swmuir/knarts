/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Ratio;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength;
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
 * An implementation of the model object '<em><b>Medicinal Product Ingredient Specified Substance Strength Reference Strength</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl#getStrengthLowLimit <em>Strength Low Limit</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl#getCountries <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl extends BackboneElementImpl implements MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength {
	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept substance;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Ratio strength;

	/**
	 * The cached value of the '{@link #getStrengthLowLimit() <em>Strength Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrengthLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Ratio strengthLowLimit;

	/**
	 * The cached value of the '{@link #getMeasurementPoint() <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPoint()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String measurementPoint;

	/**
	 * The cached value of the '{@link #getCountries() <em>Country</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> countries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(CodeableConcept newSubstance, NotificationChain msgs) {
		CodeableConcept oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE, oldSubstance, newSubstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstance(CodeableConcept newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(Ratio newStrength, NotificationChain msgs) {
		Ratio oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH, oldStrength, newStrength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(Ratio newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getStrengthLowLimit() {
		return strengthLowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrengthLowLimit(Ratio newStrengthLowLimit, NotificationChain msgs) {
		Ratio oldStrengthLowLimit = strengthLowLimit;
		strengthLowLimit = newStrengthLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT, oldStrengthLowLimit, newStrengthLowLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrengthLowLimit(Ratio newStrengthLowLimit) {
		if (newStrengthLowLimit != strengthLowLimit) {
			NotificationChain msgs = null;
			if (strengthLowLimit != null)
				msgs = ((InternalEObject)strengthLowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT, null, msgs);
			if (newStrengthLowLimit != null)
				msgs = ((InternalEObject)newStrengthLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT, null, msgs);
			msgs = basicSetStrengthLowLimit(newStrengthLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT, newStrengthLowLimit, newStrengthLowLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMeasurementPoint() {
		return measurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPoint(fhiRCore.dataTypes.String newMeasurementPoint, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMeasurementPoint = measurementPoint;
		measurementPoint = newMeasurementPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT, oldMeasurementPoint, newMeasurementPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementPoint(fhiRCore.dataTypes.String newMeasurementPoint) {
		if (newMeasurementPoint != measurementPoint) {
			NotificationChain msgs = null;
			if (measurementPoint != null)
				msgs = ((InternalEObject)measurementPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT, null, msgs);
			if (newMeasurementPoint != null)
				msgs = ((InternalEObject)newMeasurementPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT, null, msgs);
			msgs = basicSetMeasurementPoint(newMeasurementPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT, newMeasurementPoint, newMeasurementPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCountries() {
		if (countries == null) {
			countries = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__COUNTRY);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH:
				return basicSetStrength(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				return basicSetStrengthLowLimit(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return basicSetMeasurementPoint(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__COUNTRY:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE:
				return getSubstance();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH:
				return getStrength();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				return getStrengthLowLimit();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return getMeasurementPoint();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__COUNTRY:
				return getCountries();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE:
				setSubstance((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH:
				setStrength((Ratio)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				setStrengthLowLimit((Ratio)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__COUNTRY:
				getCountries().clear();
				getCountries().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE:
				setSubstance((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH:
				setStrength((Ratio)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				setStrengthLowLimit((Ratio)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__COUNTRY:
				getCountries().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__SUBSTANCE:
				return substance != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH:
				return strength != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__STRENGTH_LOW_LIMIT:
				return strengthLowLimit != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__MEASUREMENT_POINT:
				return measurementPoint != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH_REFERENCE_STRENGTH__COUNTRY:
				return countries != null && !countries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrengthImpl
