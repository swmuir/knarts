/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Group Rule Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getDefaultValuex <em>Default Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleSourceImpl#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapGroupRuleSourceImpl extends BackboneElementImpl implements StructureMapGroupRuleSource {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Id context;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String max;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String type;

	/**
	 * The cached value of the '{@link #getDefaultValuex() <em>Default Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType defaultValuex;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String element;

	/**
	 * The cached value of the '{@link #getListMode() <em>List Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMode()
	 * @generated
	 * @ordered
	 */
	protected Code listMode;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Id variable;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String condition;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String check;

	/**
	 * The cached value of the '{@link #getLogMessage() <em>Log Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String logMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupRuleSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getStructureMapGroupRuleSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Id newContext, NotificationChain msgs) {
		Id oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Id newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newMin, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(org.eclipse.mdht.hl7.fhir.dataTypes.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.eclipse.mdht.hl7.fhir.dataTypes.String newMax, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(org.eclipse.mdht.hl7.fhir.dataTypes.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(org.eclipse.mdht.hl7.fhir.dataTypes.String newType, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(org.eclipse.mdht.hl7.fhir.dataTypes.String newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDefaultValuex() {
		return defaultValuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValuex(DataType newDefaultValuex, NotificationChain msgs) {
		DataType oldDefaultValuex = defaultValuex;
		defaultValuex = newDefaultValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX, oldDefaultValuex, newDefaultValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValuex(DataType newDefaultValuex) {
		if (newDefaultValuex != defaultValuex) {
			NotificationChain msgs = null;
			if (defaultValuex != null)
				msgs = ((InternalEObject)defaultValuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX, null, msgs);
			if (newDefaultValuex != null)
				msgs = ((InternalEObject)newDefaultValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX, null, msgs);
			msgs = basicSetDefaultValuex(newDefaultValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX, newDefaultValuex, newDefaultValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(org.eclipse.mdht.hl7.fhir.dataTypes.String newElement, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(org.eclipse.mdht.hl7.fhir.dataTypes.String newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getListMode() {
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListMode(Code newListMode, NotificationChain msgs) {
		Code oldListMode = listMode;
		listMode = newListMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE, oldListMode, newListMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListMode(Code newListMode) {
		if (newListMode != listMode) {
			NotificationChain msgs = null;
			if (listMode != null)
				msgs = ((InternalEObject)listMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE, null, msgs);
			if (newListMode != null)
				msgs = ((InternalEObject)newListMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE, null, msgs);
			msgs = basicSetListMode(newListMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE, newListMode, newListMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Id newVariable, NotificationChain msgs) {
		Id oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(Id newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(org.eclipse.mdht.hl7.fhir.dataTypes.String newCondition, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(org.eclipse.mdht.hl7.fhir.dataTypes.String newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheck(org.eclipse.mdht.hl7.fhir.dataTypes.String newCheck, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldCheck = check;
		check = newCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK, oldCheck, newCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheck(org.eclipse.mdht.hl7.fhir.dataTypes.String newCheck) {
		if (newCheck != check) {
			NotificationChain msgs = null;
			if (check != null)
				msgs = ((InternalEObject)check).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK, null, msgs);
			if (newCheck != null)
				msgs = ((InternalEObject)newCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK, null, msgs);
			msgs = basicSetCheck(newCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK, newCheck, newCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getLogMessage() {
		return logMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogMessage(org.eclipse.mdht.hl7.fhir.dataTypes.String newLogMessage, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldLogMessage = logMessage;
		logMessage = newLogMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE, oldLogMessage, newLogMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogMessage(org.eclipse.mdht.hl7.fhir.dataTypes.String newLogMessage) {
		if (newLogMessage != logMessage) {
			NotificationChain msgs = null;
			if (logMessage != null)
				msgs = ((InternalEObject)logMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE, null, msgs);
			if (newLogMessage != null)
				msgs = ((InternalEObject)newLogMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE, null, msgs);
			msgs = basicSetLogMessage(newLogMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE, newLogMessage, newLogMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				return basicSetContext(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				return basicSetMin(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				return basicSetMax(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX:
				return basicSetDefaultValuex(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				return basicSetElement(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				return basicSetListMode(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				return basicSetVariable(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				return basicSetCondition(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				return basicSetCheck(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE:
				return basicSetLogMessage(null, msgs);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				return getContext();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				return getMin();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				return getMax();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				return getType();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX:
				return getDefaultValuex();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				return getElement();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				return getListMode();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				return getVariable();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				return getCondition();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				return getCheck();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE:
				return getLogMessage();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				setContext((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				setMin((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				setMax((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				setType((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX:
				setDefaultValuex((DataType)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				setElement((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				setListMode((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				setVariable((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				setCondition((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				setCheck((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE:
				setLogMessage((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				setContext((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				setMin((org.eclipse.mdht.hl7.fhir.dataTypes.Integer)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				setMax((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				setType((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX:
				setDefaultValuex((DataType)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				setElement((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				setListMode((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				setVariable((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				setCondition((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				setCheck((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE:
				setLogMessage((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONTEXT:
				return context != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MIN:
				return min != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__MAX:
				return max != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__TYPE:
				return type != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__DEFAULT_VALUEX:
				return defaultValuex != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__ELEMENT:
				return element != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LIST_MODE:
				return listMode != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__VARIABLE:
				return variable != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CONDITION:
				return condition != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__CHECK:
				return check != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_SOURCE__LOG_MESSAGE:
				return logMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupRuleSourceImpl
