/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.DosageElement1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dosage Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageElement1Impl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageElement1Impl#getDosex <em>Dosex</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DosageElement1Impl#getRatex <em>Ratex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DosageElement1Impl extends ElementImpl implements DosageElement1 {
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
	 * The cached value of the '{@link #getDosex() <em>Dosex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDosex()
	 * @generated
	 * @ordered
	 */
	protected DataType dosex;

	/**
	 * The cached value of the '{@link #getRatex() <em>Ratex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatex()
	 * @generated
	 * @ordered
	 */
	protected DataType ratex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DosageElement1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DOSAGE_ELEMENT1;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_ELEMENT1__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE_ELEMENT1__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE_ELEMENT1__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_ELEMENT1__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDosex() {
		return dosex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDosex(DataType newDosex, NotificationChain msgs) {
		DataType oldDosex = dosex;
		dosex = newDosex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_ELEMENT1__DOSEX, oldDosex, newDosex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDosex(DataType newDosex) {
		if (newDosex != dosex) {
			NotificationChain msgs = null;
			if (dosex != null)
				msgs = ((InternalEObject)dosex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE_ELEMENT1__DOSEX, null, msgs);
			if (newDosex != null)
				msgs = ((InternalEObject)newDosex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE_ELEMENT1__DOSEX, null, msgs);
			msgs = basicSetDosex(newDosex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_ELEMENT1__DOSEX, newDosex, newDosex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getRatex() {
		return ratex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatex(DataType newRatex, NotificationChain msgs) {
		DataType oldRatex = ratex;
		ratex = newRatex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_ELEMENT1__RATEX, oldRatex, newRatex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatex(DataType newRatex) {
		if (newRatex != ratex) {
			NotificationChain msgs = null;
			if (ratex != null)
				msgs = ((InternalEObject)ratex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE_ELEMENT1__RATEX, null, msgs);
			if (newRatex != null)
				msgs = ((InternalEObject)newRatex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DOSAGE_ELEMENT1__RATEX, null, msgs);
			msgs = basicSetRatex(newRatex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DOSAGE_ELEMENT1__RATEX, newRatex, newRatex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.DOSAGE_ELEMENT1__TYPE:
				return basicSetType(null, msgs);
			case DataTypesPackage.DOSAGE_ELEMENT1__DOSEX:
				return basicSetDosex(null, msgs);
			case DataTypesPackage.DOSAGE_ELEMENT1__RATEX:
				return basicSetRatex(null, msgs);
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
			case DataTypesPackage.DOSAGE_ELEMENT1__TYPE:
				return getType();
			case DataTypesPackage.DOSAGE_ELEMENT1__DOSEX:
				return getDosex();
			case DataTypesPackage.DOSAGE_ELEMENT1__RATEX:
				return getRatex();
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
			case DataTypesPackage.DOSAGE_ELEMENT1__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case DataTypesPackage.DOSAGE_ELEMENT1__DOSEX:
				setDosex((DataType)newValue);
				return;
			case DataTypesPackage.DOSAGE_ELEMENT1__RATEX:
				setRatex((DataType)newValue);
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
			case DataTypesPackage.DOSAGE_ELEMENT1__TYPE:
				setType((CodeableConcept)null);
				return;
			case DataTypesPackage.DOSAGE_ELEMENT1__DOSEX:
				setDosex((DataType)null);
				return;
			case DataTypesPackage.DOSAGE_ELEMENT1__RATEX:
				setRatex((DataType)null);
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
			case DataTypesPackage.DOSAGE_ELEMENT1__TYPE:
				return type != null;
			case DataTypesPackage.DOSAGE_ELEMENT1__DOSEX:
				return dosex != null;
			case DataTypesPackage.DOSAGE_ELEMENT1__RATEX:
				return ratex != null;
		}
		return super.eIsSet(featureID);
	}

} //DosageElement1Impl
