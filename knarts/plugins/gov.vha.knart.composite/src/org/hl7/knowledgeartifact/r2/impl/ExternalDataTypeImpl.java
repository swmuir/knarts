/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.elm.r1.CodeSystemDef;
import org.hl7.elm.r1.ExpressionDef;
import org.hl7.elm.r1.ParameterDef;
import org.hl7.elm.r1.ValueSetDef;

import org.hl7.knowledgeartifact.r2.ExternalDataType;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ExternalDataTypeImpl#getCodesystem <em>Codesystem</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ExternalDataTypeImpl#getValueset <em>Valueset</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ExternalDataTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ExternalDataTypeImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ExternalDataTypeImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalDataTypeImpl extends MinimalEObjectImpl.Container implements ExternalDataType {
	/**
	 * The cached value of the '{@link #getCodesystem() <em>Codesystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodesystem()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemDef> codesystem;

	/**
	 * The cached value of the '{@link #getValueset() <em>Valueset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueset()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetDef> valueset;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDef> parameter;

	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionDef> def;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getExternalDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemDef> getCodesystem() {
		if (codesystem == null) {
			codesystem = new EObjectContainmentEList<CodeSystemDef>(CodeSystemDef.class, this, R2Package.EXTERNAL_DATA_TYPE__CODESYSTEM);
		}
		return codesystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetDef> getValueset() {
		if (valueset == null) {
			valueset = new EObjectContainmentEList<ValueSetDef>(ValueSetDef.class, this, R2Package.EXTERNAL_DATA_TYPE__VALUESET);
		}
		return valueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDef> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ParameterDef>(ParameterDef.class, this, R2Package.EXTERNAL_DATA_TYPE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionDef> getDef() {
		if (def == null) {
			def = new EObjectContainmentEList<ExpressionDef>(ExpressionDef.class, this, R2Package.EXTERNAL_DATA_TYPE__DEF);
		}
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, R2Package.EXTERNAL_DATA_TYPE__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.EXTERNAL_DATA_TYPE__CODESYSTEM:
				return ((InternalEList<?>)getCodesystem()).basicRemove(otherEnd, msgs);
			case R2Package.EXTERNAL_DATA_TYPE__VALUESET:
				return ((InternalEList<?>)getValueset()).basicRemove(otherEnd, msgs);
			case R2Package.EXTERNAL_DATA_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case R2Package.EXTERNAL_DATA_TYPE__DEF:
				return ((InternalEList<?>)getDef()).basicRemove(otherEnd, msgs);
			case R2Package.EXTERNAL_DATA_TYPE__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
			case R2Package.EXTERNAL_DATA_TYPE__CODESYSTEM:
				return getCodesystem();
			case R2Package.EXTERNAL_DATA_TYPE__VALUESET:
				return getValueset();
			case R2Package.EXTERNAL_DATA_TYPE__PARAMETER:
				return getParameter();
			case R2Package.EXTERNAL_DATA_TYPE__DEF:
				return getDef();
			case R2Package.EXTERNAL_DATA_TYPE__TRIGGER:
				return getTrigger();
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
			case R2Package.EXTERNAL_DATA_TYPE__CODESYSTEM:
				getCodesystem().clear();
				getCodesystem().addAll((Collection<? extends CodeSystemDef>)newValue);
				return;
			case R2Package.EXTERNAL_DATA_TYPE__VALUESET:
				getValueset().clear();
				getValueset().addAll((Collection<? extends ValueSetDef>)newValue);
				return;
			case R2Package.EXTERNAL_DATA_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterDef>)newValue);
				return;
			case R2Package.EXTERNAL_DATA_TYPE__DEF:
				getDef().clear();
				getDef().addAll((Collection<? extends ExpressionDef>)newValue);
				return;
			case R2Package.EXTERNAL_DATA_TYPE__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
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
			case R2Package.EXTERNAL_DATA_TYPE__CODESYSTEM:
				getCodesystem().clear();
				return;
			case R2Package.EXTERNAL_DATA_TYPE__VALUESET:
				getValueset().clear();
				return;
			case R2Package.EXTERNAL_DATA_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case R2Package.EXTERNAL_DATA_TYPE__DEF:
				getDef().clear();
				return;
			case R2Package.EXTERNAL_DATA_TYPE__TRIGGER:
				getTrigger().clear();
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
			case R2Package.EXTERNAL_DATA_TYPE__CODESYSTEM:
				return codesystem != null && !codesystem.isEmpty();
			case R2Package.EXTERNAL_DATA_TYPE__VALUESET:
				return valueset != null && !valueset.isEmpty();
			case R2Package.EXTERNAL_DATA_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case R2Package.EXTERNAL_DATA_TYPE__DEF:
				return def != null && !def.isEmpty();
			case R2Package.EXTERNAL_DATA_TYPE__TRIGGER:
				return trigger != null && !trigger.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalDataTypeImpl
