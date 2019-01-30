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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicinalProductDeviceSpec;
import org.hl7.fhir.MedicinalProductDeviceSpecMaterial;
import org.hl7.fhir.ProdCharacteristic;
import org.hl7.fhir.ProductShelfLife;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Device Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getTradeName <em>Trade Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getListingNumber <em>Listing Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getSterilityIndicator <em>Sterility Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getSterilisationRequirement <em>Sterilisation Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getNomenclature <em>Nomenclature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getShelfLife <em>Shelf Life</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getOtherCharacteristics <em>Other Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getBatchIdentifier <em>Batch Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductDeviceSpecImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductDeviceSpecImpl extends DomainResourceImpl implements MedicinalProductDeviceSpec {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getTradeName() <em>Trade Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String tradeName;

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
	 * The cached value of the '{@link #getListingNumber() <em>Listing Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListingNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String listingNumber;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String modelNumber;

	/**
	 * The cached value of the '{@link #getSterilityIndicator() <em>Sterility Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSterilityIndicator()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sterilityIndicator;

	/**
	 * The cached value of the '{@link #getSterilisationRequirement() <em>Sterilisation Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSterilisationRequirement()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept sterilisationRequirement;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept usage;

	/**
	 * The cached value of the '{@link #getNomenclature() <em>Nomenclature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomenclature()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> nomenclature;

	/**
	 * The cached value of the '{@link #getShelfLife() <em>Shelf Life</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLife()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductShelfLife> shelfLife;

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
	 * The cached value of the '{@link #getBatchIdentifier() <em>Batch Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> batchIdentifier;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturer;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductDeviceSpecMaterial> material;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductDeviceSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductDeviceSpec();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTradeName() {
		return tradeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTradeName(org.hl7.fhir.String newTradeName, NotificationChain msgs) {
		org.hl7.fhir.String oldTradeName = tradeName;
		tradeName = newTradeName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME, oldTradeName, newTradeName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradeName(org.hl7.fhir.String newTradeName) {
		if (newTradeName != tradeName) {
			NotificationChain msgs = null;
			if (tradeName != null)
				msgs = ((InternalEObject)tradeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME, null, msgs);
			if (newTradeName != null)
				msgs = ((InternalEObject)newTradeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME, null, msgs);
			msgs = basicSetTradeName(newTradeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME, newTradeName, newTradeName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getListingNumber() {
		return listingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListingNumber(org.hl7.fhir.String newListingNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldListingNumber = listingNumber;
		listingNumber = newListingNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER, oldListingNumber, newListingNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListingNumber(org.hl7.fhir.String newListingNumber) {
		if (newListingNumber != listingNumber) {
			NotificationChain msgs = null;
			if (listingNumber != null)
				msgs = ((InternalEObject)listingNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER, null, msgs);
			if (newListingNumber != null)
				msgs = ((InternalEObject)newListingNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER, null, msgs);
			msgs = basicSetListingNumber(newListingNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER, newListingNumber, newListingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelNumber(org.hl7.fhir.String newModelNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER, oldModelNumber, newModelNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelNumber(org.hl7.fhir.String newModelNumber) {
		if (newModelNumber != modelNumber) {
			NotificationChain msgs = null;
			if (modelNumber != null)
				msgs = ((InternalEObject)modelNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER, null, msgs);
			if (newModelNumber != null)
				msgs = ((InternalEObject)newModelNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER, null, msgs);
			msgs = basicSetModelNumber(newModelNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER, newModelNumber, newModelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSterilityIndicator() {
		return sterilityIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSterilityIndicator(CodeableConcept newSterilityIndicator, NotificationChain msgs) {
		CodeableConcept oldSterilityIndicator = sterilityIndicator;
		sterilityIndicator = newSterilityIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR, oldSterilityIndicator, newSterilityIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSterilityIndicator(CodeableConcept newSterilityIndicator) {
		if (newSterilityIndicator != sterilityIndicator) {
			NotificationChain msgs = null;
			if (sterilityIndicator != null)
				msgs = ((InternalEObject)sterilityIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR, null, msgs);
			if (newSterilityIndicator != null)
				msgs = ((InternalEObject)newSterilityIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR, null, msgs);
			msgs = basicSetSterilityIndicator(newSterilityIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR, newSterilityIndicator, newSterilityIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSterilisationRequirement() {
		return sterilisationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSterilisationRequirement(CodeableConcept newSterilisationRequirement, NotificationChain msgs) {
		CodeableConcept oldSterilisationRequirement = sterilisationRequirement;
		sterilisationRequirement = newSterilisationRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT, oldSterilisationRequirement, newSterilisationRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSterilisationRequirement(CodeableConcept newSterilisationRequirement) {
		if (newSterilisationRequirement != sterilisationRequirement) {
			NotificationChain msgs = null;
			if (sterilisationRequirement != null)
				msgs = ((InternalEObject)sterilisationRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT, null, msgs);
			if (newSterilisationRequirement != null)
				msgs = ((InternalEObject)newSterilisationRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT, null, msgs);
			msgs = basicSetSterilisationRequirement(newSterilisationRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT, newSterilisationRequirement, newSterilisationRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(CodeableConcept newUsage, NotificationChain msgs) {
		CodeableConcept oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE, oldUsage, newUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(CodeableConcept newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE, newUsage, newUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getNomenclature() {
		if (nomenclature == null) {
			nomenclature = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__NOMENCLATURE);
		}
		return nomenclature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductShelfLife> getShelfLife() {
		if (shelfLife == null) {
			shelfLife = new EObjectContainmentEList<ProductShelfLife>(ProductShelfLife.class, this, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__SHELF_LIFE);
		}
		return shelfLife;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS, oldPhysicalCharacteristics, newPhysicalCharacteristics);
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
				msgs = ((InternalEObject)physicalCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS, null, msgs);
			if (newPhysicalCharacteristics != null)
				msgs = ((InternalEObject)newPhysicalCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS, null, msgs);
			msgs = basicSetPhysicalCharacteristics(newPhysicalCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS, newPhysicalCharacteristics, newPhysicalCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getOtherCharacteristics() {
		if (otherCharacteristics == null) {
			otherCharacteristics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__OTHER_CHARACTERISTICS);
		}
		return otherCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getBatchIdentifier() {
		if (batchIdentifier == null) {
			batchIdentifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__BATCH_IDENTIFIER);
		}
		return batchIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getManufacturer() {
		if (manufacturer == null) {
			manufacturer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MANUFACTURER);
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductDeviceSpecMaterial> getMaterial() {
		if (material == null) {
			material = new EObjectContainmentEList<MedicinalProductDeviceSpecMaterial>(MedicinalProductDeviceSpecMaterial.class, this, FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MATERIAL);
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME:
				return basicSetTradeName(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER:
				return basicSetListingNumber(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER:
				return basicSetModelNumber(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR:
				return basicSetSterilityIndicator(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT:
				return basicSetSterilisationRequirement(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE:
				return basicSetUsage(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__NOMENCLATURE:
				return ((InternalEList<?>)getNomenclature()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__SHELF_LIFE:
				return ((InternalEList<?>)getShelfLife()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS:
				return basicSetPhysicalCharacteristics(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__OTHER_CHARACTERISTICS:
				return ((InternalEList<?>)getOtherCharacteristics()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__BATCH_IDENTIFIER:
				return ((InternalEList<?>)getBatchIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MANUFACTURER:
				return ((InternalEList<?>)getManufacturer()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MATERIAL:
				return ((InternalEList<?>)getMaterial()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME:
				return getTradeName();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER:
				return getListingNumber();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER:
				return getModelNumber();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR:
				return getSterilityIndicator();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT:
				return getSterilisationRequirement();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE:
				return getUsage();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__NOMENCLATURE:
				return getNomenclature();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__SHELF_LIFE:
				return getShelfLife();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS:
				return getPhysicalCharacteristics();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__OTHER_CHARACTERISTICS:
				return getOtherCharacteristics();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__BATCH_IDENTIFIER:
				return getBatchIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MANUFACTURER:
				return getManufacturer();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MATERIAL:
				return getMaterial();
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
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME:
				setTradeName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER:
				setListingNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER:
				setModelNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR:
				setSterilityIndicator((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT:
				setSterilisationRequirement((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE:
				setUsage((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__NOMENCLATURE:
				getNomenclature().clear();
				getNomenclature().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__SHELF_LIFE:
				getShelfLife().clear();
				getShelfLife().addAll((Collection<? extends ProductShelfLife>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__OTHER_CHARACTERISTICS:
				getOtherCharacteristics().clear();
				getOtherCharacteristics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__BATCH_IDENTIFIER:
				getBatchIdentifier().clear();
				getBatchIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MANUFACTURER:
				getManufacturer().clear();
				getManufacturer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MATERIAL:
				getMaterial().clear();
				getMaterial().addAll((Collection<? extends MedicinalProductDeviceSpecMaterial>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME:
				setTradeName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER:
				setListingNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER:
				setModelNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR:
				setSterilityIndicator((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT:
				setSterilisationRequirement((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE:
				setUsage((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__NOMENCLATURE:
				getNomenclature().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__SHELF_LIFE:
				getShelfLife().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__OTHER_CHARACTERISTICS:
				getOtherCharacteristics().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__BATCH_IDENTIFIER:
				getBatchIdentifier().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MANUFACTURER:
				getManufacturer().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MATERIAL:
				getMaterial().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__TRADE_NAME:
				return tradeName != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__LISTING_NUMBER:
				return listingNumber != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MODEL_NUMBER:
				return modelNumber != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILITY_INDICATOR:
				return sterilityIndicator != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__STERILISATION_REQUIREMENT:
				return sterilisationRequirement != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__USAGE:
				return usage != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__NOMENCLATURE:
				return nomenclature != null && !nomenclature.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__SHELF_LIFE:
				return shelfLife != null && !shelfLife.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__PHYSICAL_CHARACTERISTICS:
				return physicalCharacteristics != null;
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__OTHER_CHARACTERISTICS:
				return otherCharacteristics != null && !otherCharacteristics.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__BATCH_IDENTIFIER:
				return batchIdentifier != null && !batchIdentifier.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MANUFACTURER:
				return manufacturer != null && !manufacturer.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_DEVICE_SPEC__MATERIAL:
				return material != null && !material.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductDeviceSpecImpl
