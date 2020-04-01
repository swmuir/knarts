/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition Structure Isotope Molecular Weight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionStructureIsotopeMolecularWeightImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionStructureIsotopeMolecularWeightImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionStructureIsotopeMolecularWeightImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionStructureIsotopeMolecularWeightImpl extends BackboneElementImpl implements SubstanceDefinitionStructureIsotopeMolecularWeight {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Quantity amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionStructureIsotopeMolecularWeightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD, oldMethod, newMethod);
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
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(Quantity newAmount, NotificationChain msgs) {
		Quantity oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT, oldAmount, newAmount);
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
	public void setAmount(Quantity newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD:
				return basicSetMethod(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE:
				return basicSetType(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT:
				return basicSetAmount(null, msgs);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD:
				return getMethod();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE:
				return getType();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT:
				return getAmount();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT:
				setAmount((Quantity)newValue);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT:
				setAmount((Quantity)null);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD:
				return method != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE:
				return type != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionStructureIsotopeMolecularWeightImpl