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

import org.hl7.fhir.ActivityDefinitionCategory;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProtocolDetail;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SimpleQuantity;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getTimingCodeableConcept <em>Timing Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolDetailImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolDetailImpl extends BackboneElementImpl implements ProtocolDetail {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected ActivityDefinitionCategory category;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getTimingCodeableConcept() <em>Timing Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept timingCodeableConcept;

	/**
	 * The cached value of the '{@link #getTimingTiming() <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timingTiming;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> performer;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Reference product;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProtocolDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefinitionCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(ActivityDefinitionCategory newCategory, NotificationChain msgs) {
		ActivityDefinitionCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(ActivityDefinitionCategory newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getTimingCodeableConcept() {
		return timingCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingCodeableConcept(CodeableConcept newTimingCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldTimingCodeableConcept = timingCodeableConcept;
		timingCodeableConcept = newTimingCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT, oldTimingCodeableConcept, newTimingCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingCodeableConcept(CodeableConcept newTimingCodeableConcept) {
		if (newTimingCodeableConcept != timingCodeableConcept) {
			NotificationChain msgs = null;
			if (timingCodeableConcept != null)
				msgs = ((InternalEObject)timingCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT, null, msgs);
			if (newTimingCodeableConcept != null)
				msgs = ((InternalEObject)newTimingCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetTimingCodeableConcept(newTimingCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT, newTimingCodeableConcept, newTimingCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTimingTiming() {
		return timingTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingTiming(Timing newTimingTiming, NotificationChain msgs) {
		Timing oldTimingTiming = timingTiming;
		timingTiming = newTimingTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING, oldTimingTiming, newTimingTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingTiming(Timing newTimingTiming) {
		if (newTimingTiming != timingTiming) {
			NotificationChain msgs = null;
			if (timingTiming != null)
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING, newTimingTiming, newTimingTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPerformer() {
		if (performer == null) {
			performer = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.PROTOCOL_DETAIL__PERFORMER);
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Reference newProduct, NotificationChain msgs) {
		Reference oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Reference newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(SimpleQuantity newQuantity, NotificationChain msgs) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_DETAIL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_DETAIL__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROTOCOL_DETAIL__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.PROTOCOL_DETAIL__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT:
				return basicSetTimingCodeableConcept(null, msgs);
			case FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FhirPackage.PROTOCOL_DETAIL__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.PROTOCOL_DETAIL__PERFORMER:
				return ((InternalEList<?>)getPerformer()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROTOCOL_DETAIL__PRODUCT:
				return basicSetProduct(null, msgs);
			case FhirPackage.PROTOCOL_DETAIL__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.PROTOCOL_DETAIL__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case FhirPackage.PROTOCOL_DETAIL__CATEGORY:
				return getCategory();
			case FhirPackage.PROTOCOL_DETAIL__CODE:
				return getCode();
			case FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT:
				return getTimingCodeableConcept();
			case FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING:
				return getTimingTiming();
			case FhirPackage.PROTOCOL_DETAIL__LOCATION:
				return getLocation();
			case FhirPackage.PROTOCOL_DETAIL__PERFORMER:
				return getPerformer();
			case FhirPackage.PROTOCOL_DETAIL__PRODUCT:
				return getProduct();
			case FhirPackage.PROTOCOL_DETAIL__QUANTITY:
				return getQuantity();
			case FhirPackage.PROTOCOL_DETAIL__DESCRIPTION:
				return getDescription();
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
			case FhirPackage.PROTOCOL_DETAIL__CATEGORY:
				setCategory((ActivityDefinitionCategory)newValue);
				return;
			case FhirPackage.PROTOCOL_DETAIL__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT:
				setTimingCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FhirPackage.PROTOCOL_DETAIL__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.PROTOCOL_DETAIL__PERFORMER:
				getPerformer().clear();
				getPerformer().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.PROTOCOL_DETAIL__PRODUCT:
				setProduct((Reference)newValue);
				return;
			case FhirPackage.PROTOCOL_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirPackage.PROTOCOL_DETAIL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
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
			case FhirPackage.PROTOCOL_DETAIL__CATEGORY:
				setCategory((ActivityDefinitionCategory)null);
				return;
			case FhirPackage.PROTOCOL_DETAIL__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT:
				setTimingCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FhirPackage.PROTOCOL_DETAIL__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.PROTOCOL_DETAIL__PERFORMER:
				getPerformer().clear();
				return;
			case FhirPackage.PROTOCOL_DETAIL__PRODUCT:
				setProduct((Reference)null);
				return;
			case FhirPackage.PROTOCOL_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirPackage.PROTOCOL_DETAIL__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
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
			case FhirPackage.PROTOCOL_DETAIL__CATEGORY:
				return category != null;
			case FhirPackage.PROTOCOL_DETAIL__CODE:
				return code != null;
			case FhirPackage.PROTOCOL_DETAIL__TIMING_CODEABLE_CONCEPT:
				return timingCodeableConcept != null;
			case FhirPackage.PROTOCOL_DETAIL__TIMING_TIMING:
				return timingTiming != null;
			case FhirPackage.PROTOCOL_DETAIL__LOCATION:
				return location != null;
			case FhirPackage.PROTOCOL_DETAIL__PERFORMER:
				return performer != null && !performer.isEmpty();
			case FhirPackage.PROTOCOL_DETAIL__PRODUCT:
				return product != null;
			case FhirPackage.PROTOCOL_DETAIL__QUANTITY:
				return quantity != null;
			case FhirPackage.PROTOCOL_DETAIL__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //ProtocolDetailImpl
