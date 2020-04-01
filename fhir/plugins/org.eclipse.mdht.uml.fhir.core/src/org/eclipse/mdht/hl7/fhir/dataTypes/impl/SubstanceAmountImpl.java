/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;
import org.eclipse.mdht.hl7.fhir.dataTypes.SubstanceAmount;
import org.eclipse.mdht.hl7.fhir.dataTypes.SubstanceAmountElement1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.SubstanceAmountImpl#getAmountx <em>Amountx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.SubstanceAmountImpl#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.SubstanceAmountImpl#getAmountText <em>Amount Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.SubstanceAmountImpl#getReferenceRange <em>Reference Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceAmountImpl extends BackboneElementImpl implements SubstanceAmount {
	/**
	 * The cached value of the '{@link #getAmountx() <em>Amountx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountx()
	 * @generated
	 * @ordered
	 */
	protected DataType amountx;

	/**
	 * The cached value of the '{@link #getAmountType() <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept amountType;

	/**
	 * The cached value of the '{@link #getAmountText() <em>Amount Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String amountText;

	/**
	 * The cached value of the '{@link #getReferenceRange() <em>Reference Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceRange()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAmountElement1 referenceRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceAmountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.SUBSTANCE_AMOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getAmountx() {
		return amountx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountx(DataType newAmountx, NotificationChain msgs) {
		DataType oldAmountx = amountx;
		amountx = newAmountx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX, oldAmountx, newAmountx);
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
	public void setAmountx(DataType newAmountx) {
		if (newAmountx != amountx) {
			NotificationChain msgs = null;
			if (amountx != null)
				msgs = ((InternalEObject)amountx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX, null, msgs);
			if (newAmountx != null)
				msgs = ((InternalEObject)newAmountx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX, null, msgs);
			msgs = basicSetAmountx(newAmountx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX, newAmountx, newAmountx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAmountType() {
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountType(CodeableConcept newAmountType, NotificationChain msgs) {
		CodeableConcept oldAmountType = amountType;
		amountType = newAmountType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE, oldAmountType, newAmountType);
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
	public void setAmountType(CodeableConcept newAmountType) {
		if (newAmountType != amountType) {
			NotificationChain msgs = null;
			if (amountType != null)
				msgs = ((InternalEObject)amountType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE, null, msgs);
			if (newAmountType != null)
				msgs = ((InternalEObject)newAmountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE, null, msgs);
			msgs = basicSetAmountType(newAmountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE, newAmountType, newAmountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getAmountText() {
		return amountText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountText(org.eclipse.mdht.hl7.fhir.dataTypes.String newAmountText, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldAmountText = amountText;
		amountText = newAmountText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT, oldAmountText, newAmountText);
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
	public void setAmountText(org.eclipse.mdht.hl7.fhir.dataTypes.String newAmountText) {
		if (newAmountText != amountText) {
			NotificationChain msgs = null;
			if (amountText != null)
				msgs = ((InternalEObject)amountText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT, null, msgs);
			if (newAmountText != null)
				msgs = ((InternalEObject)newAmountText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT, null, msgs);
			msgs = basicSetAmountText(newAmountText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT, newAmountText, newAmountText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAmountElement1 getReferenceRange() {
		return referenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceRange(SubstanceAmountElement1 newReferenceRange, NotificationChain msgs) {
		SubstanceAmountElement1 oldReferenceRange = referenceRange;
		referenceRange = newReferenceRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE, oldReferenceRange, newReferenceRange);
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
	public void setReferenceRange(SubstanceAmountElement1 newReferenceRange) {
		if (newReferenceRange != referenceRange) {
			NotificationChain msgs = null;
			if (referenceRange != null)
				msgs = ((InternalEObject)referenceRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE, null, msgs);
			if (newReferenceRange != null)
				msgs = ((InternalEObject)newReferenceRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE, null, msgs);
			msgs = basicSetReferenceRange(newReferenceRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE, newReferenceRange, newReferenceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX:
				return basicSetAmountx(null, msgs);
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				return basicSetAmountType(null, msgs);
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				return basicSetAmountText(null, msgs);
			case DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				return basicSetReferenceRange(null, msgs);
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
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX:
				return getAmountx();
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				return getAmountType();
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				return getAmountText();
			case DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				return getReferenceRange();
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
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX:
				setAmountx((DataType)newValue);
				return;
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				setAmountType((CodeableConcept)newValue);
				return;
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				setAmountText((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				setReferenceRange((SubstanceAmountElement1)newValue);
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
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX:
				setAmountx((DataType)null);
				return;
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				setAmountType((CodeableConcept)null);
				return;
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				setAmountText((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				setReferenceRange((SubstanceAmountElement1)null);
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
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNTX:
				return amountx != null;
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TYPE:
				return amountType != null;
			case DataTypesPackage.SUBSTANCE_AMOUNT__AMOUNT_TEXT:
				return amountText != null;
			case DataTypesPackage.SUBSTANCE_AMOUNT__REFERENCE_RANGE:
				return referenceRange != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceAmountImpl
