/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.SubstanceAmount;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Polymer Monomer Set Starting Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerMonomerSetStartingMaterialImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerMonomerSetStartingMaterialImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerMonomerSetStartingMaterialImpl#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstancePolymerMonomerSetStartingMaterialImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstancePolymerMonomerSetStartingMaterialImpl extends BackboneElementImpl implements SubstancePolymerMonomerSetStartingMaterial {
	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept material;

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
	 * The cached value of the '{@link #getIsDefining() <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefining()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean isDefining;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAmount amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstancePolymerMonomerSetStartingMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstancePolymerMonomerSetStartingMaterial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(CodeableConcept newMaterial, NotificationChain msgs) {
		CodeableConcept oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL, oldMaterial, newMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(CodeableConcept newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject)material).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject)newMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL, newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getIsDefining() {
		return isDefining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDefining(fhiRCore.dataTypes.Boolean newIsDefining, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldIsDefining = isDefining;
		isDefining = newIsDefining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING, oldIsDefining, newIsDefining);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefining(fhiRCore.dataTypes.Boolean newIsDefining) {
		if (newIsDefining != isDefining) {
			NotificationChain msgs = null;
			if (isDefining != null)
				msgs = ((InternalEObject)isDefining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING, null, msgs);
			if (newIsDefining != null)
				msgs = ((InternalEObject)newIsDefining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING, null, msgs);
			msgs = basicSetIsDefining(newIsDefining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING, newIsDefining, newIsDefining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAmount getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(SubstanceAmount newAmount, NotificationChain msgs) {
		SubstanceAmount oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(SubstanceAmount newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL:
				return basicSetMaterial(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING:
				return basicSetIsDefining(null, msgs);
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT:
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
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL:
				return getMaterial();
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE:
				return getType();
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING:
				return getIsDefining();
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT:
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
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL:
				setMaterial((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING:
				setIsDefining((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT:
				setAmount((SubstanceAmount)newValue);
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
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL:
				setMaterial((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING:
				setIsDefining((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT:
				setAmount((SubstanceAmount)null);
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
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__MATERIAL:
				return material != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__TYPE:
				return type != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__IS_DEFINING:
				return isDefining != null;
			case ResourcesPackage.SUBSTANCE_POLYMER_MONOMER_SET_STARTING_MATERIAL__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstancePolymerMonomerSetStartingMaterialImpl
