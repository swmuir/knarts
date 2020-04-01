/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget;
import org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTargetParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Map Group Rule Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleTargetImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleTargetImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleTargetImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleTargetImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleTargetImpl#getListModes <em>List Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleTargetImpl#getListRuleId <em>List Rule Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleTargetImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.StructureMapGroupRuleTargetImpl#getParameters <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapGroupRuleTargetImpl extends BackboneElementImpl implements StructureMapGroupRuleTarget {
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
	protected Code contextType;

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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Id variable;

	/**
	 * The cached value of the '{@link #getListModes() <em>List Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> listModes;

	/**
	 * The cached value of the '{@link #getListRuleId() <em>List Rule Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRuleId()
	 * @generated
	 * @ordered
	 */
	protected Id listRuleId;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Code transform;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRuleTargetParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupRuleTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getStructureMapGroupRuleTarget();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextType(Code newContextType, NotificationChain msgs) {
		Code oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE, oldContextType, newContextType);
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
	public void setContextType(Code newContextType) {
		if (newContextType != contextType) {
			NotificationChain msgs = null;
			if (contextType != null)
				msgs = ((InternalEObject)contextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE, null, msgs);
			if (newContextType != null)
				msgs = ((InternalEObject)newContextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE, null, msgs);
			msgs = basicSetContextType(newContextType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE, newContextType, newContextType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT, oldElement, newElement);
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
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT, newElement, newElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE, oldVariable, newVariable);
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
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getListModes() {
		if (listModes == null) {
			listModes = new EObjectContainmentEList<Code>(Code.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE);
		}
		return listModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getListRuleId() {
		return listRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListRuleId(Id newListRuleId, NotificationChain msgs) {
		Id oldListRuleId = listRuleId;
		listRuleId = newListRuleId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID, oldListRuleId, newListRuleId);
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
	public void setListRuleId(Id newListRuleId) {
		if (newListRuleId != listRuleId) {
			NotificationChain msgs = null;
			if (listRuleId != null)
				msgs = ((InternalEObject)listRuleId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID, null, msgs);
			if (newListRuleId != null)
				msgs = ((InternalEObject)newListRuleId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID, null, msgs);
			msgs = basicSetListRuleId(newListRuleId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID, newListRuleId, newListRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(Code newTransform, NotificationChain msgs) {
		Code oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM, oldTransform, newTransform);
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
	public void setTransform(Code newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StructureMapGroupRuleTargetParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<StructureMapGroupRuleTargetParameter>(StructureMapGroupRuleTargetParameter.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				return basicSetContext(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				return basicSetContextType(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				return basicSetElement(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				return basicSetVariable(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				return ((InternalEList<?>)getListModes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				return basicSetListRuleId(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				return basicSetTransform(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				return getContext();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				return getContextType();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				return getElement();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				return getVariable();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				return getListModes();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				return getListRuleId();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				return getTransform();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				return getParameters();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				setContext((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				setContextType((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				setElement((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				setVariable((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				getListModes().clear();
				getListModes().addAll((Collection<? extends Code>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				setListRuleId((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				setTransform((Code)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends StructureMapGroupRuleTargetParameter>)newValue);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				setContext((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				setContextType((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				setElement((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				setVariable((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				getListModes().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				setListRuleId((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				setTransform((Code)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				getParameters().clear();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT:
				return context != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__CONTEXT_TYPE:
				return contextType != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__ELEMENT:
				return element != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__VARIABLE:
				return variable != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_MODE:
				return listModes != null && !listModes.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__LIST_RULE_ID:
				return listRuleId != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__TRANSFORM:
				return transform != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE_TARGET__PARAMETER:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupRuleTargetImpl
