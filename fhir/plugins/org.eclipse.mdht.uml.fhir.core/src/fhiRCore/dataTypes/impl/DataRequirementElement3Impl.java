/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataRequirementElement3;
import fhiRCore.dataTypes.DataTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Element3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementElement3Impl#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementElement3Impl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementElement3Impl extends ElementImpl implements DataRequirementElement3 {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String path;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Code direction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementElement3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_REQUIREMENT_ELEMENT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(fhiRCore.dataTypes.String newPath, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(fhiRCore.dataTypes.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(Code newDirection, NotificationChain msgs) {
		Code oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION, oldDirection, newDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Code newDirection) {
		if (newDirection != direction) {
			NotificationChain msgs = null;
			if (direction != null)
				msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION, null, msgs);
			if (newDirection != null)
				msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION, null, msgs);
			msgs = basicSetDirection(newDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION, newDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH:
				return basicSetPath(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION:
				return basicSetDirection(null, msgs);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH:
				return getPath();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION:
				return getDirection();
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH:
				setPath((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION:
				setDirection((Code)newValue);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH:
				setPath((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION:
				setDirection((Code)null);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__PATH:
				return path != null;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3__DIRECTION:
				return direction != null;
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementElement3Impl
