/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.CodingImpl#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.CodingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.CodingImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.CodingImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.CodingImpl#getUserSelected <em>User Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodingImpl extends DataTypeImpl implements Coding {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String version;

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
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String display;

	/**
	 * The cached value of the '{@link #getUserSelected() <em>User Selected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSelected()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean userSelected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.CODING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Uri newSystem, NotificationChain msgs) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(fhiRCore.dataTypes.String newVersion, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(fhiRCore.dataTypes.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__VERSION, newVersion, newVersion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(fhiRCore.dataTypes.String newDisplay, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(fhiRCore.dataTypes.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getUserSelected() {
		return userSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserSelected(fhiRCore.dataTypes.Boolean newUserSelected, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldUserSelected = userSelected;
		userSelected = newUserSelected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__USER_SELECTED, oldUserSelected, newUserSelected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserSelected(fhiRCore.dataTypes.Boolean newUserSelected) {
		if (newUserSelected != userSelected) {
			NotificationChain msgs = null;
			if (userSelected != null)
				msgs = ((InternalEObject)userSelected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__USER_SELECTED, null, msgs);
			if (newUserSelected != null)
				msgs = ((InternalEObject)newUserSelected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODING__USER_SELECTED, null, msgs);
			msgs = basicSetUserSelected(newUserSelected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODING__USER_SELECTED, newUserSelected, newUserSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.CODING__SYSTEM:
				return basicSetSystem(null, msgs);
			case DataTypesPackage.CODING__VERSION:
				return basicSetVersion(null, msgs);
			case DataTypesPackage.CODING__CODE:
				return basicSetCode(null, msgs);
			case DataTypesPackage.CODING__DISPLAY:
				return basicSetDisplay(null, msgs);
			case DataTypesPackage.CODING__USER_SELECTED:
				return basicSetUserSelected(null, msgs);
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
			case DataTypesPackage.CODING__SYSTEM:
				return getSystem();
			case DataTypesPackage.CODING__VERSION:
				return getVersion();
			case DataTypesPackage.CODING__CODE:
				return getCode();
			case DataTypesPackage.CODING__DISPLAY:
				return getDisplay();
			case DataTypesPackage.CODING__USER_SELECTED:
				return getUserSelected();
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
			case DataTypesPackage.CODING__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case DataTypesPackage.CODING__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.CODING__CODE:
				setCode((Code)newValue);
				return;
			case DataTypesPackage.CODING__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.CODING__USER_SELECTED:
				setUserSelected((fhiRCore.dataTypes.Boolean)newValue);
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
			case DataTypesPackage.CODING__SYSTEM:
				setSystem((Uri)null);
				return;
			case DataTypesPackage.CODING__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.CODING__CODE:
				setCode((Code)null);
				return;
			case DataTypesPackage.CODING__DISPLAY:
				setDisplay((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.CODING__USER_SELECTED:
				setUserSelected((fhiRCore.dataTypes.Boolean)null);
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
			case DataTypesPackage.CODING__SYSTEM:
				return system != null;
			case DataTypesPackage.CODING__VERSION:
				return version != null;
			case DataTypesPackage.CODING__CODE:
				return code != null;
			case DataTypesPackage.CODING__DISPLAY:
				return display != null;
			case DataTypesPackage.CODING__USER_SELECTED:
				return userSelected != null;
		}
		return super.eIsSet(featureID);
	}

} //CodingImpl
