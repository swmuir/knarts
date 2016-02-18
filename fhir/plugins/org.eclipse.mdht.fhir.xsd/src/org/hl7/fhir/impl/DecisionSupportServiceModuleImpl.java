/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.DecisionSupportServiceModule;
import org.hl7.fhir.DecisionSupportServiceModuleParameter;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ModuleMetadata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Service Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleImpl#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DecisionSupportServiceModuleImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportServiceModuleImpl extends DomainResourceImpl implements DecisionSupportServiceModule {
	/**
	 * The cached value of the '{@link #getModuleMetadata() <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMetadata()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadata moduleMetadata;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportServiceModuleParameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportServiceModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDecisionSupportServiceModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadata getModuleMetadata() {
		return moduleMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleMetadata(ModuleMetadata newModuleMetadata, NotificationChain msgs) {
		ModuleMetadata oldModuleMetadata = moduleMetadata;
		moduleMetadata = newModuleMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA, oldModuleMetadata, newModuleMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleMetadata(ModuleMetadata newModuleMetadata) {
		if (newModuleMetadata != moduleMetadata) {
			NotificationChain msgs = null;
			if (moduleMetadata != null)
				msgs = ((InternalEObject)moduleMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA, null, msgs);
			if (newModuleMetadata != null)
				msgs = ((InternalEObject)newModuleMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA, null, msgs);
			msgs = basicSetModuleMetadata(newModuleMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA, newModuleMetadata, newModuleMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportServiceModuleParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<DecisionSupportServiceModuleParameter>(DecisionSupportServiceModuleParameter.class, this, FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				return basicSetModuleMetadata(null, msgs);
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				return getModuleMetadata();
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				return getParameter();
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)newValue);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends DecisionSupportServiceModuleParameter>)newValue);
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)null);
				return;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				getParameter().clear();
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
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__MODULE_METADATA:
				return moduleMetadata != null;
			case FhirPackage.DECISION_SUPPORT_SERVICE_MODULE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionSupportServiceModuleImpl
