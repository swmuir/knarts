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
import org.eclipse.mdht.hl7.fhir.dataTypes.Ratio;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductIngredientSpecifiedSubstanceStrength;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Ingredient Specified Substance Strength</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthImpl#getPresentationLowLimit <em>Presentation Low Limit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthImpl#getConcentration <em>Concentration</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthImpl#getConcentrationLowLimit <em>Concentration Low Limit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthImpl#getMeasurementPoint <em>Measurement Point</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthImpl#getCountries <em>Country</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductIngredientSpecifiedSubstanceStrengthImpl#getReferenceStrengths <em>Reference Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductIngredientSpecifiedSubstanceStrengthImpl extends BackboneElementImpl implements MedicinalProductIngredientSpecifiedSubstanceStrength {
	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected Ratio presentation;

	/**
	 * The cached value of the '{@link #getPresentationLowLimit() <em>Presentation Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Ratio presentationLowLimit;

	/**
	 * The cached value of the '{@link #getConcentration() <em>Concentration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentration()
	 * @generated
	 * @ordered
	 */
	protected Ratio concentration;

	/**
	 * The cached value of the '{@link #getConcentrationLowLimit() <em>Concentration Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Ratio concentrationLowLimit;

	/**
	 * The cached value of the '{@link #getMeasurementPoint() <em>Measurement Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPoint()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String measurementPoint;

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
	 * The cached value of the '{@link #getReferenceStrengths() <em>Reference Strength</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceStrengths()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength> referenceStrengths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductIngredientSpecifiedSubstanceStrengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductIngredientSpecifiedSubstanceStrength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentation(Ratio newPresentation, NotificationChain msgs) {
		Ratio oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION, oldPresentation, newPresentation);
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
	public void setPresentation(Ratio newPresentation) {
		if (newPresentation != presentation) {
			NotificationChain msgs = null;
			if (presentation != null)
				msgs = ((InternalEObject)presentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION, null, msgs);
			if (newPresentation != null)
				msgs = ((InternalEObject)newPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION, null, msgs);
			msgs = basicSetPresentation(newPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION, newPresentation, newPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getPresentationLowLimit() {
		return presentationLowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationLowLimit(Ratio newPresentationLowLimit, NotificationChain msgs) {
		Ratio oldPresentationLowLimit = presentationLowLimit;
		presentationLowLimit = newPresentationLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT, oldPresentationLowLimit, newPresentationLowLimit);
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
	public void setPresentationLowLimit(Ratio newPresentationLowLimit) {
		if (newPresentationLowLimit != presentationLowLimit) {
			NotificationChain msgs = null;
			if (presentationLowLimit != null)
				msgs = ((InternalEObject)presentationLowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT, null, msgs);
			if (newPresentationLowLimit != null)
				msgs = ((InternalEObject)newPresentationLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT, null, msgs);
			msgs = basicSetPresentationLowLimit(newPresentationLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT, newPresentationLowLimit, newPresentationLowLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getConcentration() {
		return concentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentration(Ratio newConcentration, NotificationChain msgs) {
		Ratio oldConcentration = concentration;
		concentration = newConcentration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION, oldConcentration, newConcentration);
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
	public void setConcentration(Ratio newConcentration) {
		if (newConcentration != concentration) {
			NotificationChain msgs = null;
			if (concentration != null)
				msgs = ((InternalEObject)concentration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION, null, msgs);
			if (newConcentration != null)
				msgs = ((InternalEObject)newConcentration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION, null, msgs);
			msgs = basicSetConcentration(newConcentration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION, newConcentration, newConcentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ratio getConcentrationLowLimit() {
		return concentrationLowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcentrationLowLimit(Ratio newConcentrationLowLimit, NotificationChain msgs) {
		Ratio oldConcentrationLowLimit = concentrationLowLimit;
		concentrationLowLimit = newConcentrationLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT, oldConcentrationLowLimit, newConcentrationLowLimit);
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
	public void setConcentrationLowLimit(Ratio newConcentrationLowLimit) {
		if (newConcentrationLowLimit != concentrationLowLimit) {
			NotificationChain msgs = null;
			if (concentrationLowLimit != null)
				msgs = ((InternalEObject)concentrationLowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT, null, msgs);
			if (newConcentrationLowLimit != null)
				msgs = ((InternalEObject)newConcentrationLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT, null, msgs);
			msgs = basicSetConcentrationLowLimit(newConcentrationLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT, newConcentrationLowLimit, newConcentrationLowLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getMeasurementPoint() {
		return measurementPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPoint(org.eclipse.mdht.hl7.fhir.dataTypes.String newMeasurementPoint, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldMeasurementPoint = measurementPoint;
		measurementPoint = newMeasurementPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT, oldMeasurementPoint, newMeasurementPoint);
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
	public void setMeasurementPoint(org.eclipse.mdht.hl7.fhir.dataTypes.String newMeasurementPoint) {
		if (newMeasurementPoint != measurementPoint) {
			NotificationChain msgs = null;
			if (measurementPoint != null)
				msgs = ((InternalEObject)measurementPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT, null, msgs);
			if (newMeasurementPoint != null)
				msgs = ((InternalEObject)newMeasurementPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT, null, msgs);
			msgs = basicSetMeasurementPoint(newMeasurementPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT, newMeasurementPoint, newMeasurementPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCountries() {
		if (countries == null) {
			countries = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__COUNTRY);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength> getReferenceStrengths() {
		if (referenceStrengths == null) {
			referenceStrengths = new EObjectContainmentEList<MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength>(MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength.class, this, ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__REFERENCE_STRENGTH);
		}
		return referenceStrengths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION:
				return basicSetPresentation(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT:
				return basicSetPresentationLowLimit(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION:
				return basicSetConcentration(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT:
				return basicSetConcentrationLowLimit(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT:
				return basicSetMeasurementPoint(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__COUNTRY:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__REFERENCE_STRENGTH:
				return ((InternalEList<?>)getReferenceStrengths()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION:
				return getPresentation();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT:
				return getPresentationLowLimit();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION:
				return getConcentration();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT:
				return getConcentrationLowLimit();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT:
				return getMeasurementPoint();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__COUNTRY:
				return getCountries();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__REFERENCE_STRENGTH:
				return getReferenceStrengths();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION:
				setPresentation((Ratio)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT:
				setPresentationLowLimit((Ratio)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION:
				setConcentration((Ratio)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT:
				setConcentrationLowLimit((Ratio)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__COUNTRY:
				getCountries().clear();
				getCountries().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__REFERENCE_STRENGTH:
				getReferenceStrengths().clear();
				getReferenceStrengths().addAll((Collection<? extends MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION:
				setPresentation((Ratio)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT:
				setPresentationLowLimit((Ratio)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION:
				setConcentration((Ratio)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT:
				setConcentrationLowLimit((Ratio)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT:
				setMeasurementPoint((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__COUNTRY:
				getCountries().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__REFERENCE_STRENGTH:
				getReferenceStrengths().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION:
				return presentation != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__PRESENTATION_LOW_LIMIT:
				return presentationLowLimit != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION:
				return concentration != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__CONCENTRATION_LOW_LIMIT:
				return concentrationLowLimit != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__MEASUREMENT_POINT:
				return measurementPoint != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__COUNTRY:
				return countries != null && !countries.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_INGREDIENT_SPECIFIED_SUBSTANCE_STRENGTH__REFERENCE_STRENGTH:
				return referenceStrengths != null && !referenceStrengths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductIngredientSpecifiedSubstanceStrengthImpl
