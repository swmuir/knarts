/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.SubstanceAmount;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstancePolymerRepeatRepeatUnit;
import fhiRCore.resources.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation;
import fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation;

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
 * An implementation of the model object '<em><b>Substance Polymer Repeat Repeat Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatRepeatUnitImpl#getOrientationOfPolymerisation <em>Orientation Of Polymerisation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatRepeatUnitImpl#getRepeatUnit <em>Repeat Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatRepeatUnitImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatRepeatUnitImpl#getDegreeOfPolymerisations <em>Degree Of Polymerisation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerRepeatRepeatUnitImpl#getStructuralRepresentations <em>Structural Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerRepeatRepeatUnitImpl extends BackboneElementImpl implements SubstancePolymerRepeatRepeatUnit {
	/**
	 * The cached value of the '{@link #getOrientationOfPolymerisation() <em>Orientation Of Polymerisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationOfPolymerisation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orientationOfPolymerisation;

	/**
	 * The cached value of the '{@link #getRepeatUnit() <em>Repeat Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUnit()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String repeatUnit;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAmount amount;

	/**
	 * The cached value of the '{@link #getDegreeOfPolymerisations() <em>Degree Of Polymerisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeOfPolymerisations()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation> degreeOfPolymerisations;

	/**
	 * The cached value of the '{@link #getStructuralRepresentations() <em>Structural Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerRepeatRepeatUnitStructuralRepresentation> structuralRepresentations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerRepeatRepeatUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstancePolymerRepeatRepeatUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOrientationOfPolymerisation() {
		return orientationOfPolymerisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationOfPolymerisation(CodeableConcept newOrientationOfPolymerisation, NotificationChain msgs) {
		CodeableConcept oldOrientationOfPolymerisation = orientationOfPolymerisation;
		orientationOfPolymerisation = newOrientationOfPolymerisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION, oldOrientationOfPolymerisation, newOrientationOfPolymerisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientationOfPolymerisation(CodeableConcept newOrientationOfPolymerisation) {
		if (newOrientationOfPolymerisation != orientationOfPolymerisation) {
			NotificationChain msgs = null;
			if (orientationOfPolymerisation != null)
				msgs = ((InternalEObject)orientationOfPolymerisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION, null, msgs);
			if (newOrientationOfPolymerisation != null)
				msgs = ((InternalEObject)newOrientationOfPolymerisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION, null, msgs);
			msgs = basicSetOrientationOfPolymerisation(newOrientationOfPolymerisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION, newOrientationOfPolymerisation, newOrientationOfPolymerisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getRepeatUnit() {
		return repeatUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeatUnit(fhiRCore.dataTypes.String newRepeatUnit, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldRepeatUnit = repeatUnit;
		repeatUnit = newRepeatUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT, oldRepeatUnit, newRepeatUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatUnit(fhiRCore.dataTypes.String newRepeatUnit) {
		if (newRepeatUnit != repeatUnit) {
			NotificationChain msgs = null;
			if (repeatUnit != null)
				msgs = ((InternalEObject)repeatUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT, null, msgs);
			if (newRepeatUnit != null)
				msgs = ((InternalEObject)newRepeatUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT, null, msgs);
			msgs = basicSetRepeatUnit(newRepeatUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT, newRepeatUnit, newRepeatUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAmount getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(SubstanceAmount newAmount, NotificationChain msgs) {
		SubstanceAmount oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(SubstanceAmount newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation> getDegreeOfPolymerisations() {
		if (degreeOfPolymerisations == null) {
			degreeOfPolymerisations = new EObjectContainmentEList<SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation>(SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation.class, this, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__DEGREE_OF_POLYMERISATION);
		}
		return degreeOfPolymerisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstancePolymerRepeatRepeatUnitStructuralRepresentation> getStructuralRepresentations() {
		if (structuralRepresentations == null) {
			structuralRepresentations = new EObjectContainmentEList<SubstancePolymerRepeatRepeatUnitStructuralRepresentation>(SubstancePolymerRepeatRepeatUnitStructuralRepresentation.class, this, ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__STRUCTURAL_REPRESENTATION);
		}
		return structuralRepresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				return basicSetOrientationOfPolymerisation(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT:
				return basicSetRepeatUnit(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT:
				return basicSetAmount(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return ((InternalEList<?>)getDegreeOfPolymerisations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return ((InternalEList<?>)getStructuralRepresentations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				return getOrientationOfPolymerisation();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT:
				return getRepeatUnit();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT:
				return getAmount();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return getDegreeOfPolymerisations();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return getStructuralRepresentations();
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
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				setOrientationOfPolymerisation((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT:
				setRepeatUnit((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT:
				setAmount((SubstanceAmount)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				getDegreeOfPolymerisations().clear();
				getDegreeOfPolymerisations().addAll((Collection<? extends SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				getStructuralRepresentations().clear();
				getStructuralRepresentations().addAll((Collection<? extends SubstancePolymerRepeatRepeatUnitStructuralRepresentation>)newValue);
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
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				setOrientationOfPolymerisation((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT:
				setRepeatUnit((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT:
				setAmount((SubstanceAmount)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				getDegreeOfPolymerisations().clear();
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				getStructuralRepresentations().clear();
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
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__ORIENTATION_OF_POLYMERISATION:
				return orientationOfPolymerisation != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__REPEAT_UNIT:
				return repeatUnit != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__AMOUNT:
				return amount != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__DEGREE_OF_POLYMERISATION:
				return degreeOfPolymerisations != null && !degreeOfPolymerisations.isEmpty();
			case ResourcesPackage.SUBSTANCE_POLYMER_REPEAT_REPEAT_UNIT__STRUCTURAL_REPRESENTATION:
				return structuralRepresentations != null && !structuralRepresentations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerRepeatRepeatUnitImpl
