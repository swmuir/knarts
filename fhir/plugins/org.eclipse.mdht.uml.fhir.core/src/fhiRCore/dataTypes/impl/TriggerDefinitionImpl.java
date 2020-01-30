/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataRequirement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Expression;
import fhiRCore.dataTypes.TriggerDefinition;

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
 * An implementation of the model object '<em><b>Trigger Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.TriggerDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.TriggerDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.TriggerDefinitionImpl#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.TriggerDefinitionImpl#getData <em>Data</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.TriggerDefinitionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerDefinitionImpl extends DataTypeImpl implements TriggerDefinition {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getTimingx() <em>Timingx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingx()
	 * @generated
	 * @ordered
	 */
	protected DataType timingx;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirement> data;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.TRIGGER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TRIGGER_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TRIGGER_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TRIGGER_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TRIGGER_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTimingx() {
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingx(DataType newTimingx, NotificationChain msgs) {
		DataType oldTimingx = timingx;
		timingx = newTimingx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__TIMINGX, oldTimingx, newTimingx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingx(DataType newTimingx) {
		if (newTimingx != timingx) {
			NotificationChain msgs = null;
			if (timingx != null)
				msgs = ((InternalEObject)timingx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TRIGGER_DEFINITION__TIMINGX, null, msgs);
			if (newTimingx != null)
				msgs = ((InternalEObject)newTimingx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TRIGGER_DEFINITION__TIMINGX, null, msgs);
			msgs = basicSetTimingx(newTimingx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__TIMINGX, newTimingx, newTimingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirement> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<DataRequirement>(DataRequirement.class, this, DataTypesPackage.TRIGGER_DEFINITION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TRIGGER_DEFINITION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.TRIGGER_DEFINITION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.TRIGGER_DEFINITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case DataTypesPackage.TRIGGER_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case DataTypesPackage.TRIGGER_DEFINITION__TIMINGX:
				return basicSetTimingx(null, msgs);
			case DataTypesPackage.TRIGGER_DEFINITION__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.TRIGGER_DEFINITION__CONDITION:
				return basicSetCondition(null, msgs);
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
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				return getType();
			case DataTypesPackage.TRIGGER_DEFINITION__NAME:
				return getName();
			case DataTypesPackage.TRIGGER_DEFINITION__TIMINGX:
				return getTimingx();
			case DataTypesPackage.TRIGGER_DEFINITION__DATA:
				return getData();
			case DataTypesPackage.TRIGGER_DEFINITION__CONDITION:
				return getCondition();
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
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				setType((Code)newValue);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__TIMINGX:
				setTimingx((DataType)newValue);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataRequirement>)newValue);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__CONDITION:
				setCondition((Expression)newValue);
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
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				setType((Code)null);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__TIMINGX:
				setTimingx((DataType)null);
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__DATA:
				getData().clear();
				return;
			case DataTypesPackage.TRIGGER_DEFINITION__CONDITION:
				setCondition((Expression)null);
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
			case DataTypesPackage.TRIGGER_DEFINITION__TYPE:
				return type != null;
			case DataTypesPackage.TRIGGER_DEFINITION__NAME:
				return name != null;
			case DataTypesPackage.TRIGGER_DEFINITION__TIMINGX:
				return timingx != null;
			case DataTypesPackage.TRIGGER_DEFINITION__DATA:
				return data != null && !data.isEmpty();
			case DataTypesPackage.TRIGGER_DEFINITION__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //TriggerDefinitionImpl
