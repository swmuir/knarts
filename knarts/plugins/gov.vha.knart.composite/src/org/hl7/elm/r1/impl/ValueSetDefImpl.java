/**
 */
package org.hl7.elm.r1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.elm.r1.AccessModifier;
import org.hl7.elm.r1.CodeSystemRef;
import org.hl7.elm.r1.R1Package;
import org.hl7.elm.r1.ValueSetDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.impl.ValueSetDefImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ValueSetDefImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ValueSetDefImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ValueSetDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.impl.ValueSetDefImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetDefImpl extends ElementImpl implements ValueSetDef {
	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemRef> codeSystem;

	/**
	 * The default value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AccessModifier ACCESS_LEVEL_EDEFAULT = AccessModifier.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected AccessModifier accessLevel = ACCESS_LEVEL_EDEFAULT;

	/**
	 * This is true if the Access Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessLevelESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.eINSTANCE.getValueSetDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemRef> getCodeSystem() {
		if (codeSystem == null) {
			codeSystem = new EObjectContainmentEList<CodeSystemRef>(CodeSystemRef.class, this, R1Package.VALUE_SET_DEF__CODE_SYSTEM);
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier getAccessLevel() {
		return accessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLevel(AccessModifier newAccessLevel) {
		AccessModifier oldAccessLevel = accessLevel;
		accessLevel = newAccessLevel == null ? ACCESS_LEVEL_EDEFAULT : newAccessLevel;
		boolean oldAccessLevelESet = accessLevelESet;
		accessLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.VALUE_SET_DEF__ACCESS_LEVEL, oldAccessLevel, accessLevel, !oldAccessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccessLevel() {
		AccessModifier oldAccessLevel = accessLevel;
		boolean oldAccessLevelESet = accessLevelESet;
		accessLevel = ACCESS_LEVEL_EDEFAULT;
		accessLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.VALUE_SET_DEF__ACCESS_LEVEL, oldAccessLevel, ACCESS_LEVEL_EDEFAULT, oldAccessLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccessLevel() {
		return accessLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.VALUE_SET_DEF__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.VALUE_SET_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.VALUE_SET_DEF__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.VALUE_SET_DEF__CODE_SYSTEM:
				return ((InternalEList<?>)getCodeSystem()).basicRemove(otherEnd, msgs);
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
			case R1Package.VALUE_SET_DEF__CODE_SYSTEM:
				return getCodeSystem();
			case R1Package.VALUE_SET_DEF__ACCESS_LEVEL:
				return getAccessLevel();
			case R1Package.VALUE_SET_DEF__ID:
				return getId();
			case R1Package.VALUE_SET_DEF__NAME:
				return getName();
			case R1Package.VALUE_SET_DEF__VERSION:
				return getVersion();
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
			case R1Package.VALUE_SET_DEF__CODE_SYSTEM:
				getCodeSystem().clear();
				getCodeSystem().addAll((Collection<? extends CodeSystemRef>)newValue);
				return;
			case R1Package.VALUE_SET_DEF__ACCESS_LEVEL:
				setAccessLevel((AccessModifier)newValue);
				return;
			case R1Package.VALUE_SET_DEF__ID:
				setId((String)newValue);
				return;
			case R1Package.VALUE_SET_DEF__NAME:
				setName((String)newValue);
				return;
			case R1Package.VALUE_SET_DEF__VERSION:
				setVersion((String)newValue);
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
			case R1Package.VALUE_SET_DEF__CODE_SYSTEM:
				getCodeSystem().clear();
				return;
			case R1Package.VALUE_SET_DEF__ACCESS_LEVEL:
				unsetAccessLevel();
				return;
			case R1Package.VALUE_SET_DEF__ID:
				setId(ID_EDEFAULT);
				return;
			case R1Package.VALUE_SET_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case R1Package.VALUE_SET_DEF__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case R1Package.VALUE_SET_DEF__CODE_SYSTEM:
				return codeSystem != null && !codeSystem.isEmpty();
			case R1Package.VALUE_SET_DEF__ACCESS_LEVEL:
				return isSetAccessLevel();
			case R1Package.VALUE_SET_DEF__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case R1Package.VALUE_SET_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case R1Package.VALUE_SET_DEF__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (accessLevel: ");
		if (accessLevelESet) result.append(accessLevel); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ValueSetDefImpl
