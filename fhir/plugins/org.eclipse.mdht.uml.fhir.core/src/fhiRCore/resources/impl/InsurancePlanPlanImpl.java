/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.InsurancePlanPlan;
import fhiRCore.resources.InsurancePlanPlanGeneralCost;
import fhiRCore.resources.InsurancePlanPlanSpecificCost;
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
 * An implementation of the model object '<em><b>Insurance Plan Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanPlanImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanPlanImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanPlanImpl#getCoverageAreas <em>Coverage Area</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanPlanImpl#getNetworks <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanPlanImpl#getGeneralCosts <em>General Cost</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.InsurancePlanPlanImpl#getSpecificCosts <em>Specific Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsurancePlanPlanImpl extends BackboneElementImpl implements InsurancePlanPlan {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getCoverageAreas() <em>Coverage Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> coverageAreas;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> networks;

	/**
	 * The cached value of the '{@link #getGeneralCosts() <em>General Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanPlanGeneralCost> generalCosts;

	/**
	 * The cached value of the '{@link #getSpecificCosts() <em>Specific Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<InsurancePlanPlanSpecificCost> specificCosts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsurancePlanPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getInsurancePlanPlan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.INSURANCE_PLAN_PLAN__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getCoverageAreas() {
		if (coverageAreas == null) {
			coverageAreas = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA);
		}
		return coverageAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.INSURANCE_PLAN_PLAN__NETWORK);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsurancePlanPlanGeneralCost> getGeneralCosts() {
		if (generalCosts == null) {
			generalCosts = new EObjectContainmentEList<InsurancePlanPlanGeneralCost>(InsurancePlanPlanGeneralCost.class, this, ResourcesPackage.INSURANCE_PLAN_PLAN__GENERAL_COST);
		}
		return generalCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsurancePlanPlanSpecificCost> getSpecificCosts() {
		if (specificCosts == null) {
			specificCosts = new EObjectContainmentEList<InsurancePlanPlanSpecificCost>(InsurancePlanPlanSpecificCost.class, this, ResourcesPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST);
		}
		return specificCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				return ((InternalEList<?>)getCoverageAreas()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN__NETWORK:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				return ((InternalEList<?>)getGeneralCosts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				return ((InternalEList<?>)getSpecificCosts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE:
				return getType();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				return getCoverageAreas();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__NETWORK:
				return getNetworks();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				return getGeneralCosts();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				return getSpecificCosts();
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				getCoverageAreas().clear();
				getCoverageAreas().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__NETWORK:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				getGeneralCosts().clear();
				getGeneralCosts().addAll((Collection<? extends InsurancePlanPlanGeneralCost>)newValue);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				getSpecificCosts().clear();
				getSpecificCosts().addAll((Collection<? extends InsurancePlanPlanSpecificCost>)newValue);
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				getCoverageAreas().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__NETWORK:
				getNetworks().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				getGeneralCosts().clear();
				return;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				getSpecificCosts().clear();
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
			case ResourcesPackage.INSURANCE_PLAN_PLAN__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__TYPE:
				return type != null;
			case ResourcesPackage.INSURANCE_PLAN_PLAN__COVERAGE_AREA:
				return coverageAreas != null && !coverageAreas.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__NETWORK:
				return networks != null && !networks.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__GENERAL_COST:
				return generalCosts != null && !generalCosts.isEmpty();
			case ResourcesPackage.INSURANCE_PLAN_PLAN__SPECIFIC_COST:
				return specificCosts != null && !specificCosts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InsurancePlanPlanImpl
