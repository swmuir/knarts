/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CoverageCostToBeneficiary;
import fhiRCore.resources.CoverageCostToBeneficiaryExemption;
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
 * An implementation of the model object '<em><b>Coverage Cost To Beneficiary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CoverageCostToBeneficiaryImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageCostToBeneficiaryImpl#getValuex <em>Valuex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CoverageCostToBeneficiaryImpl#getExceptions <em>Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageCostToBeneficiaryImpl extends BackboneElementImpl implements CoverageCostToBeneficiary {
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
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageCostToBeneficiaryExemption> exceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageCostToBeneficiaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageCostToBeneficiary();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuex(DataType newValuex, NotificationChain msgs) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX, oldValuex, newValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuex(DataType newValuex) {
		if (newValuex != valuex) {
			NotificationChain msgs = null;
			if (valuex != null)
				msgs = ((InternalEObject)valuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX, null, msgs);
			if (newValuex != null)
				msgs = ((InternalEObject)newValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX, null, msgs);
			msgs = basicSetValuex(newValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX, newValuex, newValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoverageCostToBeneficiaryExemption> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectContainmentEList<CoverageCostToBeneficiaryExemption>(CoverageCostToBeneficiaryExemption.class, this, ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX:
				return basicSetValuex(null, msgs);
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				return getType();
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX:
				return getValuex();
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				return getExceptions();
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
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX:
				setValuex((DataType)newValue);
				return;
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends CoverageCostToBeneficiaryExemption>)newValue);
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
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX:
				setValuex((DataType)null);
				return;
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				getExceptions().clear();
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
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__TYPE:
				return type != null;
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__VALUEX:
				return valuex != null;
			case ResourcesPackage.COVERAGE_COST_TO_BENEFICIARY__EXCEPTION:
				return exceptions != null && !exceptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageCostToBeneficiaryImpl
