/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapListMode;
import org.hl7.fhir.StructureMapSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getListMode <em>List Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.StructureMapSourceImpl#getCheck <em>Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapSourceImpl extends BackboneElementImpl implements StructureMapSource {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean required;

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
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected StructureMapContextType contextType;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String max;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String type;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String element;

	/**
	 * The cached value of the '{@link #getListMode() <em>List Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMode()
	 * @generated
	 * @ordered
	 */
	protected StructureMapListMode listMode;

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
	protected org.hl7.fhir.String condition;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String check;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getStructureMapSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.hl7.fhir.Boolean newRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.hl7.fhir.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Id newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapContextType getContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextType(StructureMapContextType newContextType, NotificationChain msgs) {
		StructureMapContextType oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE, oldContextType, newContextType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(StructureMapContextType newContextType) {
		if (newContextType != contextType) {
			NotificationChain msgs = null;
			if (contextType != null)
				msgs = ((InternalEObject)contextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE, null, msgs);
			if (newContextType != null)
				msgs = ((InternalEObject)newContextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE, null, msgs);
			msgs = basicSetContextType(newContextType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE, newContextType, newContextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(org.hl7.fhir.Integer newMin, NotificationChain msgs) {
		org.hl7.fhir.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(org.hl7.fhir.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(org.hl7.fhir.String newMax, NotificationChain msgs) {
		org.hl7.fhir.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(org.hl7.fhir.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(org.hl7.fhir.String newType, NotificationChain msgs) {
		org.hl7.fhir.String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(org.hl7.fhir.String newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(org.hl7.fhir.String newElement, NotificationChain msgs) {
		org.hl7.fhir.String oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(org.hl7.fhir.String newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMapListMode getListMode() {
		return listMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListMode(StructureMapListMode newListMode, NotificationChain msgs) {
		StructureMapListMode oldListMode = listMode;
		listMode = newListMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE, oldListMode, newListMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListMode(StructureMapListMode newListMode) {
		if (newListMode != listMode) {
			NotificationChain msgs = null;
			if (listMode != null)
				msgs = ((InternalEObject)listMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE, null, msgs);
			if (newListMode != null)
				msgs = ((InternalEObject)newListMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE, null, msgs);
			msgs = basicSetListMode(newListMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE, newListMode, newListMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Id newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(org.hl7.fhir.String newCondition, NotificationChain msgs) {
		org.hl7.fhir.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(org.hl7.fhir.String newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheck(org.hl7.fhir.String newCheck, NotificationChain msgs) {
		org.hl7.fhir.String oldCheck = check;
		check = newCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CHECK, oldCheck, newCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheck(org.hl7.fhir.String newCheck) {
		if (newCheck != check) {
			NotificationChain msgs = null;
			if (check != null)
				msgs = ((InternalEObject)check).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CHECK, null, msgs);
			if (newCheck != null)
				msgs = ((InternalEObject)newCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.STRUCTURE_MAP_SOURCE__CHECK, null, msgs);
			msgs = basicSetCheck(newCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.STRUCTURE_MAP_SOURCE__CHECK, newCheck, newCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED:
				return basicSetRequired(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE:
				return basicSetContextType(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				return basicSetMin(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				return basicSetMax(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				return basicSetElement(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				return basicSetListMode(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				return basicSetVariable(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				return basicSetCheck(null, msgs);
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
			case FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED:
				return getRequired();
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				return getContext();
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE:
				return getContextType();
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				return getMin();
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				return getMax();
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				return getType();
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				return getElement();
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				return getListMode();
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				return getVariable();
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				return getCondition();
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				return getCheck();
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
			case FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				setContext((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE:
				setContextType((StructureMapContextType)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				setMin((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				setMax((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				setType((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				setElement((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				setListMode((StructureMapListMode)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				setVariable((Id)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				setCondition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				setCheck((org.hl7.fhir.String)newValue);
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
			case FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				setContext((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE:
				setContextType((StructureMapContextType)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				setMin((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				setMax((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				setType((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				setElement((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				setListMode((StructureMapListMode)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				setVariable((Id)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				setCondition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				setCheck((org.hl7.fhir.String)null);
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
			case FhirPackage.STRUCTURE_MAP_SOURCE__REQUIRED:
				return required != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT:
				return context != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONTEXT_TYPE:
				return contextType != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MIN:
				return min != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__MAX:
				return max != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__TYPE:
				return type != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__ELEMENT:
				return element != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__LIST_MODE:
				return listMode != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__VARIABLE:
				return variable != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CONDITION:
				return condition != null;
			case FhirPackage.STRUCTURE_MAP_SOURCE__CHECK:
				return check != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMapSourceImpl
