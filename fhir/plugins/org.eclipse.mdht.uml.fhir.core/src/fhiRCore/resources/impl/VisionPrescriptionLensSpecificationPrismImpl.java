/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Decimal;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.VisionPrescriptionLensSpecificationPrism;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Prescription Lens Specification Prism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.VisionPrescriptionLensSpecificationPrismImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.VisionPrescriptionLensSpecificationPrismImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionPrescriptionLensSpecificationPrismImpl extends BackboneElementImpl implements VisionPrescriptionLensSpecificationPrism {
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Decimal amount;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Code base;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionPrescriptionLensSpecificationPrismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getVisionPrescriptionLensSpecificationPrism();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Decimal newAmount, NotificationChain msgs) {
		Decimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(Decimal newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Code newBase, NotificationChain msgs) {
		Code oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Code newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT:
				return basicSetAmount(null, msgs);
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE:
				return basicSetBase(null, msgs);
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
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT:
				return getAmount();
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE:
				return getBase();
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
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT:
				setAmount((Decimal)newValue);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE:
				setBase((Code)newValue);
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
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT:
				setAmount((Decimal)null);
				return;
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE:
				setBase((Code)null);
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
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__AMOUNT:
				return amount != null;
			case ResourcesPackage.VISION_PRESCRIPTION_LENS_SPECIFICATION_PRISM__BASE:
				return base != null;
		}
		return super.eIsSet(featureID);
	}

} //VisionPrescriptionLensSpecificationPrismImpl
