/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.BiologicallyDerivedProduct;
import fhiRCore.resources.BiologicallyDerivedProductCollection;
import fhiRCore.resources.BiologicallyDerivedProductManipulation;
import fhiRCore.resources.BiologicallyDerivedProductProcessing;
import fhiRCore.resources.BiologicallyDerivedProductStorage;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getRequests <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getParents <em>Parent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getProcessings <em>Processing</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getManipulation <em>Manipulation</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductImpl#getStorages <em>Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductImpl extends DomainResourceImpl implements BiologicallyDerivedProduct {
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
	 * The cached value of the '{@link #getProductCategory() <em>Product Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategory()
	 * @generated
	 * @ordered
	 */
	protected Code productCategory;

	/**
	 * The cached value of the '{@link #getProductCode() <em>Product Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productCode;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getRequests() <em>Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> requests;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer quantity;

	/**
	 * The cached value of the '{@link #getParents() <em>Parent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> parents;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductCollection collection;

	/**
	 * The cached value of the '{@link #getProcessings() <em>Processing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessings()
	 * @generated
	 * @ordered
	 */
	protected EList<BiologicallyDerivedProductProcessing> processings;

	/**
	 * The cached value of the '{@link #getManipulation() <em>Manipulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManipulation()
	 * @generated
	 * @ordered
	 */
	protected BiologicallyDerivedProductManipulation manipulation;

	/**
	 * The cached value of the '{@link #getStorages() <em>Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorages()
	 * @generated
	 * @ordered
	 */
	protected EList<BiologicallyDerivedProductStorage> storages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getBiologicallyDerivedProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getProductCategory() {
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCategory(Code newProductCategory, NotificationChain msgs) {
		Code oldProductCategory = productCategory;
		productCategory = newProductCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, oldProductCategory, newProductCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCategory(Code newProductCategory) {
		if (newProductCategory != productCategory) {
			NotificationChain msgs = null;
			if (productCategory != null)
				msgs = ((InternalEObject)productCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, null, msgs);
			if (newProductCategory != null)
				msgs = ((InternalEObject)newProductCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, null, msgs);
			msgs = basicSetProductCategory(newProductCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY, newProductCategory, newProductCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getProductCode() {
		return productCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCode(CodeableConcept newProductCode, NotificationChain msgs) {
		CodeableConcept oldProductCode = productCode;
		productCode = newProductCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, oldProductCode, newProductCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCode(CodeableConcept newProductCode) {
		if (newProductCode != productCode) {
			NotificationChain msgs = null;
			if (productCode != null)
				msgs = ((InternalEObject)productCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, null, msgs);
			if (newProductCode != null)
				msgs = ((InternalEObject)newProductCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, null, msgs);
			msgs = basicSetProductCode(newProductCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE, newProductCode, newProductCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getRequests() {
		if (requests == null) {
			requests = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(fhiRCore.dataTypes.Integer newQuantity, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(fhiRCore.dataTypes.Integer newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getParents() {
		if (parents == null) {
			parents = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductCollection getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(BiologicallyDerivedProductCollection newCollection, NotificationChain msgs) {
		BiologicallyDerivedProductCollection oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, oldCollection, newCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(BiologicallyDerivedProductCollection newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, null, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, null, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BiologicallyDerivedProductProcessing> getProcessings() {
		if (processings == null) {
			processings = new EObjectContainmentEList<BiologicallyDerivedProductProcessing>(BiologicallyDerivedProductProcessing.class, this, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING);
		}
		return processings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiologicallyDerivedProductManipulation getManipulation() {
		return manipulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManipulation(BiologicallyDerivedProductManipulation newManipulation, NotificationChain msgs) {
		BiologicallyDerivedProductManipulation oldManipulation = manipulation;
		manipulation = newManipulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION, oldManipulation, newManipulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManipulation(BiologicallyDerivedProductManipulation newManipulation) {
		if (newManipulation != manipulation) {
			NotificationChain msgs = null;
			if (manipulation != null)
				msgs = ((InternalEObject)manipulation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION, null, msgs);
			if (newManipulation != null)
				msgs = ((InternalEObject)newManipulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION, null, msgs);
			msgs = basicSetManipulation(newManipulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION, newManipulation, newManipulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BiologicallyDerivedProductStorage> getStorages() {
		if (storages == null) {
			storages = new EObjectContainmentEList<BiologicallyDerivedProductStorage>(BiologicallyDerivedProductStorage.class, this, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE);
		}
		return storages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return basicSetProductCategory(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return basicSetProductCode(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return basicSetCollection(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				return ((InternalEList<?>)getProcessings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				return basicSetManipulation(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				return ((InternalEList<?>)getStorages()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return getProductCategory();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return getProductCode();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				return getStatus();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return getRequests();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				return getQuantity();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return getParents();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return getCollection();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				return getProcessings();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				return getManipulation();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				return getStorages();
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((Code)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				setProductCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				setQuantity((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				getParents().clear();
				getParents().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				setCollection((BiologicallyDerivedProductCollection)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				getProcessings().clear();
				getProcessings().addAll((Collection<? extends BiologicallyDerivedProductProcessing>)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				setManipulation((BiologicallyDerivedProductManipulation)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				getStorages().clear();
				getStorages().addAll((Collection<? extends BiologicallyDerivedProductStorage>)newValue);
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((Code)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				setProductCode((CodeableConcept)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				getRequests().clear();
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				setQuantity((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				getParents().clear();
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				setCollection((BiologicallyDerivedProductCollection)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				getProcessings().clear();
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				setManipulation((BiologicallyDerivedProductManipulation)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				getStorages().clear();
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CATEGORY:
				return productCategory != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PRODUCT_CODE:
				return productCode != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STATUS:
				return status != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__REQUEST:
				return requests != null && !requests.isEmpty();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__QUANTITY:
				return quantity != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PARENT:
				return parents != null && !parents.isEmpty();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__COLLECTION:
				return collection != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__PROCESSING:
				return processings != null && !processings.isEmpty();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__MANIPULATION:
				return manipulation != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT__STORAGE:
				return storages != null && !storages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductImpl
