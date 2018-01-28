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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicinalProductPackagedManufacturedItem;
import org.hl7.fhir.ProdCharacteristic;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Packaged Manufactured Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedManufacturedItemImpl#getManufacturedDoseForm <em>Manufactured Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedManufacturedItemImpl#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedManufacturedItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedManufacturedItemImpl#getXManufacturer <em>XManufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedManufacturedItemImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedManufacturedItemImpl#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPackagedManufacturedItemImpl extends BackboneElementImpl implements MedicinalProductPackagedManufacturedItem {
	/**
	 * The cached value of the '{@link #getManufacturedDoseForm() <em>Manufactured Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept manufacturedDoseForm;

	/**
	 * The cached value of the '{@link #getUnitOfPresentation() <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfPresentation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unitOfPresentation;

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
	 * The cached value of the '{@link #getXManufacturer() <em>XManufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> xManufacturer;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> ingredient;

	/**
	 * The cached value of the '{@link #getPhysicalCharacteristics() <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected ProdCharacteristic physicalCharacteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPackagedManufacturedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductPackagedManufacturedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getManufacturedDoseForm() {
		return manufacturedDoseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturedDoseForm(CodeableConcept newManufacturedDoseForm, NotificationChain msgs) {
		CodeableConcept oldManufacturedDoseForm = manufacturedDoseForm;
		manufacturedDoseForm = newManufacturedDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM, oldManufacturedDoseForm, newManufacturedDoseForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturedDoseForm(CodeableConcept newManufacturedDoseForm) {
		if (newManufacturedDoseForm != manufacturedDoseForm) {
			NotificationChain msgs = null;
			if (manufacturedDoseForm != null)
				msgs = ((InternalEObject)manufacturedDoseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM, null, msgs);
			if (newManufacturedDoseForm != null)
				msgs = ((InternalEObject)newManufacturedDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM, null, msgs);
			msgs = basicSetManufacturedDoseForm(newManufacturedDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM, newManufacturedDoseForm, newManufacturedDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getUnitOfPresentation() {
		return unitOfPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfPresentation(CodeableConcept newUnitOfPresentation, NotificationChain msgs) {
		CodeableConcept oldUnitOfPresentation = unitOfPresentation;
		unitOfPresentation = newUnitOfPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION, oldUnitOfPresentation, newUnitOfPresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitOfPresentation(CodeableConcept newUnitOfPresentation) {
		if (newUnitOfPresentation != unitOfPresentation) {
			NotificationChain msgs = null;
			if (unitOfPresentation != null)
				msgs = ((InternalEObject)unitOfPresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION, null, msgs);
			if (newUnitOfPresentation != null)
				msgs = ((InternalEObject)newUnitOfPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION, null, msgs);
			msgs = basicSetUnitOfPresentation(newUnitOfPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION, newUnitOfPresentation, newUnitOfPresentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getXManufacturer() {
		if (xManufacturer == null) {
			xManufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__XMANUFACTURER);
		}
		return xManufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdCharacteristic getPhysicalCharacteristics() {
		return physicalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics, NotificationChain msgs) {
		ProdCharacteristic oldPhysicalCharacteristics = physicalCharacteristics;
		physicalCharacteristics = newPhysicalCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS, oldPhysicalCharacteristics, newPhysicalCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics) {
		if (newPhysicalCharacteristics != physicalCharacteristics) {
			NotificationChain msgs = null;
			if (physicalCharacteristics != null)
				msgs = ((InternalEObject)physicalCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS, null, msgs);
			if (newPhysicalCharacteristics != null)
				msgs = ((InternalEObject)newPhysicalCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS, null, msgs);
			msgs = basicSetPhysicalCharacteristics(newPhysicalCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS, newPhysicalCharacteristics, newPhysicalCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM:
				return basicSetManufacturedDoseForm(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION:
				return basicSetUnitOfPresentation(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__XMANUFACTURER:
				return ((InternalEList<?>)getXManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS:
				return basicSetPhysicalCharacteristics(null, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM:
				return getManufacturedDoseForm();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION:
				return getUnitOfPresentation();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__XMANUFACTURER:
				return getXManufacturer();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__INGREDIENT:
				return getIngredient();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS:
				return getPhysicalCharacteristics();
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM:
				setManufacturedDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__XMANUFACTURER:
				getXManufacturer().clear();
				getXManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM:
				setManufacturedDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION:
				setUnitOfPresentation((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__XMANUFACTURER:
				getXManufacturer().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)null);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__MANUFACTURED_DOSE_FORM:
				return manufacturedDoseForm != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__UNIT_OF_PRESENTATION:
				return unitOfPresentation != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__XMANUFACTURER:
				return xManufacturer != null && !xManufacturer.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED_MANUFACTURED_ITEM__PHYSICAL_CHARACTERISTICS:
				return physicalCharacteristics != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPackagedManufacturedItemImpl
