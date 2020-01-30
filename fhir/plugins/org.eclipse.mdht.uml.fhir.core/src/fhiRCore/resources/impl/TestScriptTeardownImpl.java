/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TestScriptTeardown;
import fhiRCore.resources.TestScriptTeardownTeardownAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Teardown</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TestScriptTeardownImpl#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptTeardownImpl extends BackboneElementImpl implements TestScriptTeardown {
	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptTeardownTeardownAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptTeardownImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestScriptTeardown();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptTeardownTeardownAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<TestScriptTeardownTeardownAction>(TestScriptTeardownTeardownAction.class, this, ResourcesPackage.TEST_SCRIPT_TEARDOWN__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN__ACTION:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN__ACTION:
				return getActions();
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
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends TestScriptTeardownTeardownAction>)newValue);
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
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN__ACTION:
				getActions().clear();
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
			case ResourcesPackage.TEST_SCRIPT_TEARDOWN__ACTION:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestScriptTeardownImpl
