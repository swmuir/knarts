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

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerMonomerSet;
import org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerMonomerSetStartingMaterial;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Monomer Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstancePolymerMonomerSetImpl#getRatioType <em>Ratio Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SubstancePolymerMonomerSetImpl#getStartingMaterials <em>Starting Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerMonomerSetImpl extends BackboneElementImpl implements SubstancePolymerMonomerSet {
	/**
	 * The cached value of the '{@link #getRatioType() <em>Ratio Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept ratioType;

	/**
	 * The cached value of the '{@link #getStartingMaterials() <em>Starting Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstancePolymerMonomerSetStartingMaterial> startingMaterials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerMonomerSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstancePolymerMonomerSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRatioType() {
		return ratioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioType(CodeableConcept newRatioType, NotificationChain msgs) {
		CodeableConcept oldRatioType = ratioType;
		ratioType = newRatioType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE, oldRatioType, newRatioType);
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
	public void setRatioType(CodeableConcept newRatioType) {
		if (newRatioType != ratioType) {
			NotificationChain msgs = null;
			if (ratioType != null)
				msgs = ((InternalEObject)ratioType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE, null, msgs);
			if (newRatioType != null)
				msgs = ((InternalEObject)newRatioType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE, null, msgs);
			msgs = basicSetRatioType(newRatioType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE, newRatioType, newRatioType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstancePolymerMonomerSetStartingMaterial> getStartingMaterials() {
		if (startingMaterials == null) {
			startingMaterials = new EObjectContainmentEList<SubstancePolymerMonomerSetStartingMaterial>(SubstancePolymerMonomerSetStartingMaterial.class, this, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL);
		}
		return startingMaterials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				return basicSetRatioType(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				return ((InternalEList<?>)getStartingMaterials()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				return getRatioType();
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				return getStartingMaterials();
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
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				setRatioType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				getStartingMaterials().clear();
				getStartingMaterials().addAll((Collection<? extends SubstancePolymerMonomerSetStartingMaterial>)newValue);
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
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				setRatioType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				getStartingMaterials().clear();
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
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__RATIO_TYPE:
				return ratioType != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET__STARTING_MATERIAL:
				return startingMaterials != null && !startingMaterials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerMonomerSetImpl
