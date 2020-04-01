/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.GraphDefinitionLinkTargetCompartment;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Definition Link Target Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetCompartmentImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetCompartmentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetCompartmentImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetCompartmentImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.GraphDefinitionLinkTargetCompartmentImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphDefinitionLinkTargetCompartmentImpl extends BackboneElementImpl implements GraphDefinitionLinkTargetCompartment {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

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
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Code rule;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String expression;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphDefinitionLinkTargetCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getGraphDefinitionLinkTargetCompartment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Code newUse, NotificationChain msgs) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE, oldUse, newUse);
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
	public void setUse(Code newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE, oldCode, newCode);
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
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Code newRule, NotificationChain msgs) {
		Code oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE, oldRule, newRule);
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
	public void setRule(Code newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(org.eclipse.mdht.hl7.fhir.dataTypes.String newExpression, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(org.eclipse.mdht.hl7.fhir.dataTypes.String newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE:
				return basicSetUse(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE:
				return basicSetRule(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE:
				return getUse();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE:
				return getCode();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE:
				return getRule();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION:
				return getExpression();
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION:
				return getDescription();
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE:
				setUse((Code)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE:
				setRule((Code)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION:
				setExpression((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE:
				setUse((Code)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE:
				setRule((Code)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION:
				setExpression((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__USE:
				return use != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__CODE:
				return code != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__RULE:
				return rule != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__EXPRESSION:
				return expression != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK_TARGET_COMPARTMENT__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //GraphDefinitionLinkTargetCompartmentImpl
