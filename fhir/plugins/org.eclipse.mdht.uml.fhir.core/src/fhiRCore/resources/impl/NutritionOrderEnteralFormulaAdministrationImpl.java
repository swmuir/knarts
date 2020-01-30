/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Timing;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.NutritionOrderEnteralFormulaAdministration;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Enteral Formula Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderEnteralFormulaAdministrationImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderEnteralFormulaAdministrationImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NutritionOrderEnteralFormulaAdministrationImpl#getRatex <em>Ratex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderEnteralFormulaAdministrationImpl extends BackboneElementImpl implements NutritionOrderEnteralFormulaAdministration {
	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Timing schedule;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getRatex() <em>Ratex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatex()
	 * @generated
	 * @ordered
	 */
	protected DataType ratex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderEnteralFormulaAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNutritionOrderEnteralFormulaAdministration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Timing newSchedule, NotificationChain msgs) {
		Timing oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Timing newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getRatex() {
		return ratex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatex(DataType newRatex, NotificationChain msgs) {
		DataType oldRatex = ratex;
		ratex = newRatex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX, oldRatex, newRatex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatex(DataType newRatex) {
		if (newRatex != ratex) {
			NotificationChain msgs = null;
			if (ratex != null)
				msgs = ((InternalEObject)ratex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX, null, msgs);
			if (newRatex != null)
				msgs = ((InternalEObject)newRatex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX, null, msgs);
			msgs = basicSetRatex(newRatex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX, newRatex, newRatex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				return basicSetRatex(null, msgs);
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
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				return getSchedule();
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				return getQuantity();
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				return getRatex();
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
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				setSchedule((Timing)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				setRatex((DataType)newValue);
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
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				setSchedule((Timing)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				setRatex((DataType)null);
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
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__SCHEDULE:
				return schedule != null;
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__QUANTITY:
				return quantity != null;
			case ResourcesPackage.NUTRITION_ORDER_ENTERAL_FORMULA_ADMINISTRATION__RATEX:
				return ratex != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderEnteralFormulaAdministrationImpl
