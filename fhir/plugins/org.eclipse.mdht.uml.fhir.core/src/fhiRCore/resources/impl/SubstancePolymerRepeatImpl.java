/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstancePolymerRepeat;
import fhiRCore.resources.SubstancePolymerRepeatRepeatUnit;

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
 * An implementation of the model object '<em><b>Substance Polymer Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatImpl#getNumberOfUnits <em>Number Of Units</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatImpl#getAverageMolecularFormula <em>Average Molecular Formula</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatImpl#getRepeatUnitAmountType <em>Repeat Unit Amount Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatImpl#getRepeatUnits <em>Repeat Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerRepeatImpl extends BackboneElementImpl implements SubstancePolymerRepeat {
	/**
	 * The cached value of the '{@link #getNumberOfUnits() <em>Number Of Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfUnits()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer numberOfUnits;

	/**
	 * The cached value of the '{@link #getAverageMolecularFormula() <em>Average Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageMolecularFormula()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String averageMolecularFormula;

	/**
	 * The cached value of the '{@link #getRepeatUnitAmountType() <em>Repeat Unit Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUnitAmountType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept repeatUnitAmountType;

	/**
	 * The cached value of the '{@link #getRepeatUnits() <em>Repeat Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerRepeatRepeatUnit> repeatUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerRepeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstancePolymerRepeat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getNumberOfUnits() {
		return numberOfUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfUnits(fhiRCore.dataTypes.Integer newNumberOfUnits, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldNumberOfUnits = numberOfUnits;
		numberOfUnits = newNumberOfUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS, oldNumberOfUnits, newNumberOfUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfUnits(fhiRCore.dataTypes.Integer newNumberOfUnits) {
		if (newNumberOfUnits != numberOfUnits) {
			NotificationChain msgs = null;
			if (numberOfUnits != null)
				msgs = ((InternalEObject)numberOfUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS, null, msgs);
			if (newNumberOfUnits != null)
				msgs = ((InternalEObject)newNumberOfUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS, null, msgs);
			msgs = basicSetNumberOfUnits(newNumberOfUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS, newNumberOfUnits, newNumberOfUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getAverageMolecularFormula() {
		return averageMolecularFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAverageMolecularFormula(fhiRCore.dataTypes.String newAverageMolecularFormula, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldAverageMolecularFormula = averageMolecularFormula;
		averageMolecularFormula = newAverageMolecularFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA, oldAverageMolecularFormula, newAverageMolecularFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageMolecularFormula(fhiRCore.dataTypes.String newAverageMolecularFormula) {
		if (newAverageMolecularFormula != averageMolecularFormula) {
			NotificationChain msgs = null;
			if (averageMolecularFormula != null)
				msgs = ((InternalEObject)averageMolecularFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA, null, msgs);
			if (newAverageMolecularFormula != null)
				msgs = ((InternalEObject)newAverageMolecularFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA, null, msgs);
			msgs = basicSetAverageMolecularFormula(newAverageMolecularFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA, newAverageMolecularFormula, newAverageMolecularFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRepeatUnitAmountType() {
		return repeatUnitAmountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatUnitAmountType(CodeableConcept newRepeatUnitAmountType, NotificationChain msgs) {
		CodeableConcept oldRepeatUnitAmountType = repeatUnitAmountType;
		repeatUnitAmountType = newRepeatUnitAmountType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE, oldRepeatUnitAmountType, newRepeatUnitAmountType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatUnitAmountType(CodeableConcept newRepeatUnitAmountType) {
		if (newRepeatUnitAmountType != repeatUnitAmountType) {
			NotificationChain msgs = null;
			if (repeatUnitAmountType != null)
				msgs = ((InternalEObject)repeatUnitAmountType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE, null, msgs);
			if (newRepeatUnitAmountType != null)
				msgs = ((InternalEObject)newRepeatUnitAmountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE, null, msgs);
			msgs = basicSetRepeatUnitAmountType(newRepeatUnitAmountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE, newRepeatUnitAmountType, newRepeatUnitAmountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstancePolymerRepeatRepeatUnit> getRepeatUnits() {
		if (repeatUnits == null) {
			repeatUnits = new EObjectContainmentEList<SubstancePolymerRepeatRepeatUnit>(SubstancePolymerRepeatRepeatUnit.class, this, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT);
		}
		return repeatUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				return basicSetNumberOfUnits(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				return basicSetAverageMolecularFormula(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				return basicSetRepeatUnitAmountType(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				return ((InternalEList<?>)getRepeatUnits()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				return getNumberOfUnits();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				return getAverageMolecularFormula();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				return getRepeatUnitAmountType();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				return getRepeatUnits();
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
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				setNumberOfUnits((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				setAverageMolecularFormula((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				setRepeatUnitAmountType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				getRepeatUnits().clear();
				getRepeatUnits().addAll((Collection<? extends SubstancePolymerRepeatRepeatUnit>)newValue);
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
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				setNumberOfUnits((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				setAverageMolecularFormula((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				setRepeatUnitAmountType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				getRepeatUnits().clear();
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
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__NUMBER_OF_UNITS:
				return numberOfUnits != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__AVERAGE_MOLECULAR_FORMULA:
				return averageMolecularFormula != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT_AMOUNT_TYPE:
				return repeatUnitAmountType != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT__REPEAT_UNIT:
				return repeatUnits != null && !repeatUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerRepeatImpl
