/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Id;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.StructureMapGroup;
import fhiRCore.resources.StructureMapGroupInput;
import fhiRCore.resources.StructureMapGroupRule;

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
 * An implementation of the model object '<em><b>Structure Map Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupImpl#getTypeMode <em>Type Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupImpl#getRules <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapGroupImpl extends BackboneElementImpl implements StructureMapGroup {
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
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected Id extends_;

	/**
	 * The cached value of the '{@link #getTypeMode() <em>Type Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMode()
	 * @generated
	 * @ordered
	 */
	protected Code typeMode;

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
	 * The cached value of the '{@link #getInputs() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupInput> inputs;

	/**
	 * The cached value of the '{@link #getRules() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getStructureMapGroup();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(Id newExtends, NotificationChain msgs) {
		Id oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(Id newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS, null, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS, null, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getTypeMode() {
		return typeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMode(Code newTypeMode, NotificationChain msgs) {
		Code oldTypeMode = typeMode;
		typeMode = newTypeMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE, oldTypeMode, newTypeMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMode(Code newTypeMode) {
		if (newTypeMode != typeMode) {
			NotificationChain msgs = null;
			if (typeMode != null)
				msgs = ((InternalEObject)typeMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE, null, msgs);
			if (newTypeMode != null)
				msgs = ((InternalEObject)newTypeMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE, null, msgs);
			msgs = basicSetTypeMode(newTypeMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE, newTypeMode, newTypeMode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<StructureMapGroupInput>(StructureMapGroupInput.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP__INPUT);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<StructureMapGroupRule>(StructureMapGroupRule.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP__RULE);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.STRUCTURE_MAP_GROUP__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				return basicSetExtends(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				return basicSetTypeMode(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP__INPUT:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP__RULE:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP__NAME:
				return getName();
			case ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				return getExtends();
			case ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				return getTypeMode();
			case ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				return getDocumentation();
			case ResourcesPackage.STRUCTURE_MAP_GROUP__INPUT:
				return getInputs();
			case ResourcesPackage.STRUCTURE_MAP_GROUP__RULE:
				return getRules();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP__NAME:
				setName((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				setExtends((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				setTypeMode((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				setDocumentation((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__INPUT:
				getInputs().clear();
				getInputs().addAll((Collection<? extends StructureMapGroupInput>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__RULE:
				getRules().clear();
				getRules().addAll((Collection<? extends StructureMapGroupRule>)newValue);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP__NAME:
				setName((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				setExtends((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				setTypeMode((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				setDocumentation((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__INPUT:
				getInputs().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__RULE:
				getRules().clear();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP__NAME:
				return name != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__EXTENDS:
				return extends_ != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__TYPE_MODE:
				return typeMode != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__DOCUMENTATION:
				return documentation != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP__INPUT:
				return inputs != null && !inputs.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP__RULE:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupImpl
