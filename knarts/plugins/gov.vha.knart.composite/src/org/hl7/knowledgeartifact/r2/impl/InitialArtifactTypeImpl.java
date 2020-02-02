/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.InitialArtifactType;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Artifact Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.InitialArtifactTypeImpl#getBindingName <em>Binding Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialArtifactTypeImpl extends MinimalEObjectImpl.Container implements InitialArtifactType {
	/**
	 * The default value of the '{@link #getBindingName() <em>Binding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingName()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingName() <em>Binding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingName()
	 * @generated
	 * @ordered
	 */
	protected String bindingName = BINDING_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialArtifactTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getInitialArtifactType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindingName() {
		return bindingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingName(String newBindingName) {
		String oldBindingName = bindingName;
		bindingName = newBindingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.INITIAL_ARTIFACT_TYPE__BINDING_NAME, oldBindingName, bindingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case R2Package.INITIAL_ARTIFACT_TYPE__BINDING_NAME:
				return getBindingName();
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
			case R2Package.INITIAL_ARTIFACT_TYPE__BINDING_NAME:
				setBindingName((String)newValue);
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
			case R2Package.INITIAL_ARTIFACT_TYPE__BINDING_NAME:
				setBindingName(BINDING_NAME_EDEFAULT);
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
			case R2Package.INITIAL_ARTIFACT_TYPE__BINDING_NAME:
				return BINDING_NAME_EDEFAULT == null ? bindingName != null : !BINDING_NAME_EDEFAULT.equals(bindingName);
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
		result.append(" (bindingName: ");
		result.append(bindingName);
		result.append(')');
		return result.toString();
	}

} //InitialArtifactTypeImpl
