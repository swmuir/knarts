/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r2.ActionGroup;
import org.hl7.knowledgeartifact.r2.ActionRef;
import org.hl7.knowledgeartifact.r2.AtomicAction;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.SubElementsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SubElementsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SubElementsTypeImpl#getSimpleAction <em>Simple Action</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SubElementsTypeImpl#getActionGroup <em>Action Group</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SubElementsTypeImpl#getActionRef <em>Action Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubElementsTypeImpl extends MinimalEObjectImpl.Container implements SubElementsType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getSubElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, R2Package.SUB_ELEMENTS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtomicAction> getSimpleAction() {
		return getGroup().list(R2Package.eINSTANCE.getSubElementsType_SimpleAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionGroup> getActionGroup() {
		return getGroup().list(R2Package.eINSTANCE.getSubElementsType_ActionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionRef> getActionRef() {
		return getGroup().list(R2Package.eINSTANCE.getSubElementsType_ActionRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.SUB_ELEMENTS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case R2Package.SUB_ELEMENTS_TYPE__SIMPLE_ACTION:
				return ((InternalEList<?>)getSimpleAction()).basicRemove(otherEnd, msgs);
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_GROUP:
				return ((InternalEList<?>)getActionGroup()).basicRemove(otherEnd, msgs);
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_REF:
				return ((InternalEList<?>)getActionRef()).basicRemove(otherEnd, msgs);
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
			case R2Package.SUB_ELEMENTS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case R2Package.SUB_ELEMENTS_TYPE__SIMPLE_ACTION:
				return getSimpleAction();
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_GROUP:
				return getActionGroup();
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_REF:
				return getActionRef();
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
			case R2Package.SUB_ELEMENTS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case R2Package.SUB_ELEMENTS_TYPE__SIMPLE_ACTION:
				getSimpleAction().clear();
				getSimpleAction().addAll((Collection<? extends AtomicAction>)newValue);
				return;
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_GROUP:
				getActionGroup().clear();
				getActionGroup().addAll((Collection<? extends ActionGroup>)newValue);
				return;
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_REF:
				getActionRef().clear();
				getActionRef().addAll((Collection<? extends ActionRef>)newValue);
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
			case R2Package.SUB_ELEMENTS_TYPE__GROUP:
				getGroup().clear();
				return;
			case R2Package.SUB_ELEMENTS_TYPE__SIMPLE_ACTION:
				getSimpleAction().clear();
				return;
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_GROUP:
				getActionGroup().clear();
				return;
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_REF:
				getActionRef().clear();
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
			case R2Package.SUB_ELEMENTS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case R2Package.SUB_ELEMENTS_TYPE__SIMPLE_ACTION:
				return !getSimpleAction().isEmpty();
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_GROUP:
				return !getActionGroup().isEmpty();
			case R2Package.SUB_ELEMENTS_TYPE__ACTION_REF:
				return !getActionRef().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //SubElementsTypeImpl
