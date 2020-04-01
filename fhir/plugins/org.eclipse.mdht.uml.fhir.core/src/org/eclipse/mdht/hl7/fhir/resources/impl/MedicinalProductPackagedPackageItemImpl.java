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
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.ProdCharacteristic;
import org.eclipse.mdht.hl7.fhir.dataTypes.ProductShelfLife;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Packaged Package Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getMaterials <em>Material</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getAlternateMaterials <em>Alternate Material</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getDevices <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getManufacturedItems <em>Manufactured Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getPackageItems <em>Package Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getOtherCharacteristics <em>Other Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getShelfLifeStorages <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedPackageItemImpl#getManufacturers <em>Manufacturer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPackagedPackageItemImpl extends BackboneElementImpl implements MedicinalProductPackagedPackageItem {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> materials;

	/**
	 * The cached value of the '{@link #getAlternateMaterials() <em>Alternate Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> alternateMaterials;

	/**
	 * The cached value of the '{@link #getDevices() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> devices;

	/**
	 * The cached value of the '{@link #getManufacturedItems() <em>Manufactured Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturedItems;

	/**
	 * The cached value of the '{@link #getPackageItems() <em>Package Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPackagedPackageItem> packageItems;

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
	 * The cached value of the '{@link #getOtherCharacteristics() <em>Other Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> otherCharacteristics;

	/**
	 * The cached value of the '{@link #getShelfLifeStorages() <em>Shelf Life Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLifeStorages()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductShelfLife> shelfLifeStorages;

	/**
	 * The cached value of the '{@link #getManufacturers() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPackagedPackageItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductPackagedPackageItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getMaterials() {
		if (materials == null) {
			materials = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAlternateMaterials() {
		if (alternateMaterials == null) {
			alternateMaterials = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL);
		}
		return alternateMaterials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturedItems() {
		if (manufacturedItems == null) {
			manufacturedItems = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM);
		}
		return manufacturedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPackagedPackageItem> getPackageItems() {
		if (packageItems == null) {
			packageItems = new EObjectContainmentEList<MedicinalProductPackagedPackageItem>(MedicinalProductPackagedPackageItem.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM);
		}
		return packageItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS, oldPhysicalCharacteristics, newPhysicalCharacteristics);
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
	public void setPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics) {
		if (newPhysicalCharacteristics != physicalCharacteristics) {
			NotificationChain msgs = null;
			if (physicalCharacteristics != null)
				msgs = ((InternalEObject)physicalCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS, null, msgs);
			if (newPhysicalCharacteristics != null)
				msgs = ((InternalEObject)newPhysicalCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS, null, msgs);
			msgs = basicSetPhysicalCharacteristics(newPhysicalCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS, newPhysicalCharacteristics, newPhysicalCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getOtherCharacteristics() {
		if (otherCharacteristics == null) {
			otherCharacteristics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS);
		}
		return otherCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductShelfLife> getShelfLifeStorages() {
		if (shelfLifeStorages == null) {
			shelfLifeStorages = new EObjectContainmentEList<ProductShelfLife>(ProductShelfLife.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE);
		}
		return shelfLifeStorages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturers() {
		if (manufacturers == null) {
			manufacturers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER);
		}
		return manufacturers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				return ((InternalEList<?>)getMaterials()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				return ((InternalEList<?>)getAlternateMaterials()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				return ((InternalEList<?>)getManufacturedItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				return ((InternalEList<?>)getPackageItems()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				return basicSetPhysicalCharacteristics(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				return ((InternalEList<?>)getOtherCharacteristics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				return ((InternalEList<?>)getShelfLifeStorages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				return ((InternalEList<?>)getManufacturers()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				return getType();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				return getQuantity();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				return getMaterials();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				return getAlternateMaterials();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				return getDevices();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				return getManufacturedItems();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				return getPackageItems();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				return getPhysicalCharacteristics();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				return getOtherCharacteristics();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				return getShelfLifeStorages();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				return getManufacturers();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				getMaterials().clear();
				getMaterials().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				getAlternateMaterials().clear();
				getAlternateMaterials().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				getManufacturedItems().clear();
				getManufacturedItems().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				getPackageItems().clear();
				getPackageItems().addAll((Collection<? extends MedicinalProductPackagedPackageItem>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				getOtherCharacteristics().clear();
				getOtherCharacteristics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				getShelfLifeStorages().clear();
				getShelfLifeStorages().addAll((Collection<? extends ProductShelfLife>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				getManufacturers().clear();
				getManufacturers().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				getMaterials().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				getAlternateMaterials().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				getDevices().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				getManufacturedItems().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				getPackageItems().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				getOtherCharacteristics().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				getShelfLifeStorages().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				getManufacturers().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__TYPE:
				return type != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__QUANTITY:
				return quantity != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MATERIAL:
				return materials != null && !materials.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__ALTERNATE_MATERIAL:
				return alternateMaterials != null && !alternateMaterials.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__DEVICE:
				return devices != null && !devices.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURED_ITEM:
				return manufacturedItems != null && !manufacturedItems.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PACKAGE_ITEM:
				return packageItems != null && !packageItems.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__PHYSICAL_CHARACTERISTICS:
				return physicalCharacteristics != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__OTHER_CHARACTERISTICS:
				return otherCharacteristics != null && !otherCharacteristics.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__SHELF_LIFE_STORAGE:
				return shelfLifeStorages != null && !shelfLifeStorages.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED_PACKAGE_ITEM__MANUFACTURER:
				return manufacturers != null && !manufacturers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPackagedPackageItemImpl
