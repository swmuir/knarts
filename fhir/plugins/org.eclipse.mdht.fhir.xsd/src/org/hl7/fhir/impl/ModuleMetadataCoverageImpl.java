/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ModuleMetadataCoverage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Metadata Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataCoverageImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ModuleMetadataCoverageImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleMetadataCoverageImpl extends ElementImpl implements ModuleMetadataCoverage {
	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Coding focus;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleMetadataCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getModuleMetadataCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(Coding newFocus, NotificationChain msgs) {
		Coding oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA_COVERAGE__FOCUS, oldFocus, newFocus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Coding newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA_COVERAGE__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA_COVERAGE__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA_COVERAGE__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(CodeableConcept newValue, NotificationChain msgs) {
		CodeableConcept oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA_COVERAGE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(CodeableConcept newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA_COVERAGE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MODULE_METADATA_COVERAGE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MODULE_METADATA_COVERAGE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MODULE_METADATA_COVERAGE__FOCUS:
				return basicSetFocus(null, msgs);
			case FhirPackage.MODULE_METADATA_COVERAGE__VALUE:
				return basicSetValue(null, msgs);
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
			case FhirPackage.MODULE_METADATA_COVERAGE__FOCUS:
				return getFocus();
			case FhirPackage.MODULE_METADATA_COVERAGE__VALUE:
				return getValue();
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
			case FhirPackage.MODULE_METADATA_COVERAGE__FOCUS:
				setFocus((Coding)newValue);
				return;
			case FhirPackage.MODULE_METADATA_COVERAGE__VALUE:
				setValue((CodeableConcept)newValue);
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
			case FhirPackage.MODULE_METADATA_COVERAGE__FOCUS:
				setFocus((Coding)null);
				return;
			case FhirPackage.MODULE_METADATA_COVERAGE__VALUE:
				setValue((CodeableConcept)null);
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
			case FhirPackage.MODULE_METADATA_COVERAGE__FOCUS:
				return focus != null;
			case FhirPackage.MODULE_METADATA_COVERAGE__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleMetadataCoverageImpl
