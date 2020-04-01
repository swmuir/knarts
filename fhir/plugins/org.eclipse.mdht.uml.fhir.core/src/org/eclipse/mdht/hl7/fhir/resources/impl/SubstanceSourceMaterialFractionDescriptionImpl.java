/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialFractionDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Source Material Fraction Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialFractionDescriptionImpl#getFraction <em>Fraction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstanceSourceMaterialFractionDescriptionImpl#getMaterialType <em>Material Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSourceMaterialFractionDescriptionImpl extends BackboneElementImpl implements SubstanceSourceMaterialFractionDescription {
	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String fraction;

	/**
	 * The cached value of the '{@link #getMaterialType() <em>Material Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept materialType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSourceMaterialFractionDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceSourceMaterialFractionDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getFraction() {
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFraction(org.eclipse.mdht.hl7.fhir.dataTypes.String newFraction, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION, oldFraction, newFraction);
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
	public void setFraction(org.eclipse.mdht.hl7.fhir.dataTypes.String newFraction) {
		if (newFraction != fraction) {
			NotificationChain msgs = null;
			if (fraction != null)
				msgs = ((InternalEObject)fraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION, null, msgs);
			if (newFraction != null)
				msgs = ((InternalEObject)newFraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION, null, msgs);
			msgs = basicSetFraction(newFraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION, newFraction, newFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMaterialType() {
		return materialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialType(CodeableConcept newMaterialType, NotificationChain msgs) {
		CodeableConcept oldMaterialType = materialType;
		materialType = newMaterialType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE, oldMaterialType, newMaterialType);
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
	public void setMaterialType(CodeableConcept newMaterialType) {
		if (newMaterialType != materialType) {
			NotificationChain msgs = null;
			if (materialType != null)
				msgs = ((InternalEObject)materialType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE, null, msgs);
			if (newMaterialType != null)
				msgs = ((InternalEObject)newMaterialType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE, null, msgs);
			msgs = basicSetMaterialType(newMaterialType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE, newMaterialType, newMaterialType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				return basicSetFraction(null, msgs);
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				return basicSetMaterialType(null, msgs);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				return getFraction();
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				return getMaterialType();
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				setFraction((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				setMaterialType((CodeableConcept)newValue);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				setFraction((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				setMaterialType((CodeableConcept)null);
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
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__FRACTION:
				return fraction != null;
			case ResourcesPackage.SUBSTANCE_SOURCE_MATERIAL_FRACTION_DESCRIPTION__MATERIAL_TYPE:
				return materialType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSourceMaterialFractionDescriptionImpl
