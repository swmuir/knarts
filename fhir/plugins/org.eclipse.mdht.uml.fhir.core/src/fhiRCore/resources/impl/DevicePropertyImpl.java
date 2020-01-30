/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.DeviceProperty;
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
 * An implementation of the model object '<em><b>Device Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.DevicePropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DevicePropertyImpl#getValueQuantities <em>Value Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DevicePropertyImpl#getValueCodes <em>Value Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevicePropertyImpl extends BackboneElementImpl implements DeviceProperty {
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
	 * The cached value of the '{@link #getValueQuantities() <em>Value Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuantities()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> valueQuantities;

	/**
	 * The cached value of the '{@link #getValueCodes() <em>Value Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> valueCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceProperty();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_PROPERTY__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_PROPERTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_PROPERTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_PROPERTY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantity> getValueQuantities() {
		if (valueQuantities == null) {
			valueQuantities = new EObjectContainmentEList<Quantity>(Quantity.class, this, ResourcesPackage.DEVICE_PROPERTY__VALUE_QUANTITY);
		}
		return valueQuantities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getValueCodes() {
		if (valueCodes == null) {
			valueCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE_PROPERTY__VALUE_CODE);
		}
		return valueCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_PROPERTY__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_QUANTITY:
				return ((InternalEList<?>)getValueQuantities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_CODE:
				return ((InternalEList<?>)getValueCodes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DEVICE_PROPERTY__TYPE:
				return getType();
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_QUANTITY:
				return getValueQuantities();
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_CODE:
				return getValueCodes();
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
			case ResourcesPackage.DEVICE_PROPERTY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_QUANTITY:
				getValueQuantities().clear();
				getValueQuantities().addAll((Collection<? extends Quantity>)newValue);
				return;
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_CODE:
				getValueCodes().clear();
				getValueCodes().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case ResourcesPackage.DEVICE_PROPERTY__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_QUANTITY:
				getValueQuantities().clear();
				return;
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_CODE:
				getValueCodes().clear();
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
			case ResourcesPackage.DEVICE_PROPERTY__TYPE:
				return type != null;
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_QUANTITY:
				return valueQuantities != null && !valueQuantities.isEmpty();
			case ResourcesPackage.DEVICE_PROPERTY__VALUE_CODE:
				return valueCodes != null && !valueCodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevicePropertyImpl
