/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Setup Setup Action Operation Request Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationRequestHeaderImpl#getField <em>Field</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestScriptSetupSetupActionOperationRequestHeaderImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptSetupSetupActionOperationRequestHeaderImpl extends BackboneElementImpl implements TestScriptSetupSetupActionOperationRequestHeader {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String field;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptSetupSetupActionOperationRequestHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptSetupSetupActionOperationRequestHeader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(fhiRCore.dataTypes.String newField, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldField = field;
		field = newField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD, oldField, newField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(fhiRCore.dataTypes.String newField) {
		if (newField != field) {
			NotificationChain msgs = null;
			if (field != null)
				msgs = ((InternalEObject)field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD, null, msgs);
			if (newField != null)
				msgs = ((InternalEObject)newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD, null, msgs);
			msgs = basicSetField(newField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD, newField, newField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(fhiRCore.dataTypes.String newValue, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(fhiRCore.dataTypes.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				return basicSetField(null, msgs);
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				return basicSetValue(null, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				return getField();
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				return getValue();
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				setField((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				setValue((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				setField((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				setValue((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__FIELD:
				return field != null;
			case ResourcesPackage.TEST_SCRIPT_SETUP_SETUP_ACTION_OPERATION_REQUEST_HEADER__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptSetupSetupActionOperationRequestHeaderImpl
