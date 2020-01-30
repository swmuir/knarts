/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Ratio;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicationKnowledgeIngredient;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Knowledge Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeIngredientImpl#getItemx <em>Itemx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeIngredientImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeIngredientImpl#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeIngredientImpl extends BackboneElementImpl implements MedicationKnowledgeIngredient {
	/**
	 * The cached value of the '{@link #getItemx() <em>Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemx()
	 * @generated
	 * @ordered
	 */
	protected DataType itemx;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean isActive;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Ratio strength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationKnowledgeIngredient();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getItemx() {
		return itemx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemx(DataType newItemx, NotificationChain msgs) {
		DataType oldItemx = itemx;
		itemx = newItemx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX, oldItemx, newItemx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemx(DataType newItemx) {
		if (newItemx != itemx) {
			NotificationChain msgs = null;
			if (itemx != null)
				msgs = ((InternalEObject)itemx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX, null, msgs);
			if (newItemx != null)
				msgs = ((InternalEObject)newItemx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX, null, msgs);
			msgs = basicSetItemx(newItemx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX, newItemx, newItemx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsActive(fhiRCore.dataTypes.Boolean newIsActive, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE, oldIsActive, newIsActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(fhiRCore.dataTypes.Boolean newIsActive) {
		if (newIsActive != isActive) {
			NotificationChain msgs = null;
			if (isActive != null)
				msgs = ((InternalEObject)isActive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE, null, msgs);
			if (newIsActive != null)
				msgs = ((InternalEObject)newIsActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE, null, msgs);
			msgs = basicSetIsActive(newIsActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE, newIsActive, newIsActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(Ratio newStrength, NotificationChain msgs) {
		Ratio oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH, oldStrength, newStrength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(Ratio newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX:
				return basicSetItemx(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE:
				return basicSetIsActive(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH:
				return basicSetStrength(null, msgs);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX:
				return getItemx();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE:
				return getIsActive();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH:
				return getStrength();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX:
				setItemx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE:
				setIsActive((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH:
				setStrength((Ratio)newValue);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX:
				setItemx((DataType)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE:
				setIsActive((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH:
				setStrength((Ratio)null);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__ITEMX:
				return itemx != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__IS_ACTIVE:
				return isActive != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_INGREDIENT__STRENGTH:
				return strength != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeIngredientImpl
