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
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestDetails;
import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestDetailsDiagnosis;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Request Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getSupportingInfoSequences <em>Supporting Info Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsImpl#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityRequestDetailsImpl extends BackboneElementImpl implements CoverageEligibilityRequestDetails {
	/**
	 * The cached value of the '{@link #getSupportingInfoSequences() <em>Supporting Info Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInfoSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> supportingInfoSequences;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

	/**
	 * The cached value of the '{@link #getProductOrService() <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept productOrService;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifiers;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

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
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Reference facility;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityRequestDetailsDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getDetails() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityRequestDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageEligibilityRequestDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PositiveInt> getSupportingInfoSequences() {
		if (supportingInfoSequences == null) {
			supportingInfoSequences = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__SUPPORTING_INFO_SEQUENCE);
		}
		return supportingInfoSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getProductOrService() {
		return productOrService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOrService(CodeableConcept newProductOrService, NotificationChain msgs) {
		CodeableConcept oldProductOrService = productOrService;
		productOrService = newProductOrService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
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
	public void setProductOrService(CodeableConcept newProductOrService) {
		if (newProductOrService != productOrService) {
			NotificationChain msgs = null;
			if (productOrService != null)
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__MODIFIER);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER, oldProvider, newProvider);
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
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER, newProvider, newProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY, oldQuantity, newQuantity);
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
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Money getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Money newUnitPrice, NotificationChain msgs) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE, oldUnitPrice, newUnitPrice);
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
	public void setUnitPrice(Money newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacility(Reference newFacility, NotificationChain msgs) {
		Reference oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY, oldFacility, newFacility);
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
	public void setFacility(Reference newFacility) {
		if (newFacility != facility) {
			NotificationChain msgs = null;
			if (facility != null)
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityRequestDetailsDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<CoverageEligibilityRequestDetailsDiagnosis>(CoverageEligibilityRequestDetailsDiagnosis.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DETAIL);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__SUPPORTING_INFO_SEQUENCE:
				return ((InternalEList<?>)getSupportingInfoSequences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__MODIFIER:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER:
				return basicSetProvider(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY:
				return basicSetFacility(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DETAIL:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__SUPPORTING_INFO_SEQUENCE:
				return getSupportingInfoSequences();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY:
				return getCategory();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__MODIFIER:
				return getModifiers();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER:
				return getProvider();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY:
				return getQuantity();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE:
				return getUnitPrice();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY:
				return getFacility();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DIAGNOSIS:
				return getDiagnosis();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DETAIL:
				return getDetails();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__SUPPORTING_INFO_SEQUENCE:
				getSupportingInfoSequences().clear();
				getSupportingInfoSequences().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY:
				setFacility((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends CoverageEligibilityRequestDetailsDiagnosis>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DETAIL:
				getDetails().clear();
				getDetails().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__SUPPORTING_INFO_SEQUENCE:
				getSupportingInfoSequences().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER:
				setProvider((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY:
				setFacility((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DETAIL:
				getDetails().clear();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__SUPPORTING_INFO_SEQUENCE:
				return supportingInfoSequences != null && !supportingInfoSequences.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__CATEGORY:
				return category != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__PROVIDER:
				return provider != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__QUANTITY:
				return quantity != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__UNIT_PRICE:
				return unitPrice != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__FACILITY:
				return facility != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS__DETAIL:
				return details != null && !details.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityRequestDetailsImpl
