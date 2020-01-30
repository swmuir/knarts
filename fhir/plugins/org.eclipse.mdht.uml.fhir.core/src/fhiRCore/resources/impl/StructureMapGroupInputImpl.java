/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Id;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.StructureMapGroupInput;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Group Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupInputImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupInputImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupInputImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapGroupInputImpl extends BackboneElementImpl implements StructureMapGroupInput {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Id name;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String type;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Code mode;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getStructureMapGroupInput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Id newName, NotificationChain msgs) {
		Id oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Id newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(fhiRCore.dataTypes.String newType, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(fhiRCore.dataTypes.String newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(Code newMode, NotificationChain msgs) {
		Code oldMode = mode;
		mode = newMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE, oldMode, newMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Code newMode) {
		if (newMode != mode) {
			NotificationChain msgs = null;
			if (mode != null)
				msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE, null, msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE, null, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(fhiRCore.dataTypes.String newDocumentation, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(fhiRCore.dataTypes.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE:
				return basicSetMode(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME:
				return getName();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE:
				return getType();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE:
				return getMode();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION:
				return getDocumentation();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME:
				setName((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE:
				setType((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE:
				setMode((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION:
				setDocumentation((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME:
				setName((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE:
				setType((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE:
				setMode((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION:
				setDocumentation((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__NAME:
				return name != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__TYPE:
				return type != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__MODE:
				return mode != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_INPUT__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupInputImpl
