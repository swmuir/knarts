/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CompositionRelatesTo;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Relates To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CompositionRelatesToImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CompositionRelatesToImpl#getTargetx <em>Targetx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionRelatesToImpl extends BackboneElementImpl implements CompositionRelatesTo {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getTargetx() <em>Targetx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetx()
	 * @generated
	 * @ordered
	 */
	protected DataType targetx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionRelatesToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCompositionRelatesTo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_RELATES_TO__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_RELATES_TO__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_RELATES_TO__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_RELATES_TO__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTargetx() {
		return targetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetx(DataType newTargetx, NotificationChain msgs) {
		DataType oldTargetx = targetx;
		targetx = newTargetx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX, oldTargetx, newTargetx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetx(DataType newTargetx) {
		if (newTargetx != targetx) {
			NotificationChain msgs = null;
			if (targetx != null)
				msgs = ((InternalEObject)targetx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX, null, msgs);
			if (newTargetx != null)
				msgs = ((InternalEObject)newTargetx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX, null, msgs);
			msgs = basicSetTargetx(newTargetx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX, newTargetx, newTargetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COMPOSITION_RELATES_TO__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX:
				return basicSetTargetx(null, msgs);
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
			case ResourcesPackage.COMPOSITION_RELATES_TO__CODE:
				return getCode();
			case ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX:
				return getTargetx();
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
			case ResourcesPackage.COMPOSITION_RELATES_TO__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX:
				setTargetx((DataType)newValue);
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
			case ResourcesPackage.COMPOSITION_RELATES_TO__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX:
				setTargetx((DataType)null);
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
			case ResourcesPackage.COMPOSITION_RELATES_TO__CODE:
				return code != null;
			case ResourcesPackage.COMPOSITION_RELATES_TO__TARGETX:
				return targetx != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionRelatesToImpl
