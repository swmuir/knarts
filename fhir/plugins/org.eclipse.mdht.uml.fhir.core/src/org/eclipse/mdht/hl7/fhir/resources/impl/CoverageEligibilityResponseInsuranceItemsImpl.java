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
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityResponseInsuranceItems;
import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityResponseInsuranceItemsBenefit;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Response Insurance Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getBenefits <em>Benefit</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getAuthorizationRequired <em>Authorization Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getAuthorizationSupportings <em>Authorization Supporting</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityResponseInsuranceItemsImpl#getAuthorizationUrl <em>Authorization Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityResponseInsuranceItemsImpl extends BackboneElementImpl implements CoverageEligibilityResponseInsuranceItems {
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
	 * The cached value of the '{@link #getExcluded() <em>Excluded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcluded()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean excluded;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept network;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept term;

	/**
	 * The cached value of the '{@link #getBenefits() <em>Benefit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefits()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageEligibilityResponseInsuranceItemsBenefit> benefits;

	/**
	 * The cached value of the '{@link #getAuthorizationRequired() <em>Authorization Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationRequired()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean authorizationRequired;

	/**
	 * The cached value of the '{@link #getAuthorizationSupportings() <em>Authorization Supporting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationSupportings()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> authorizationSupportings;

	/**
	 * The cached value of the '{@link #getAuthorizationUrl() <em>Authorization Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri authorizationUrl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityResponseInsuranceItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageEligibilityResponseInsuranceItems();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY, oldCategory, newCategory);
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
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY, newCategory, newCategory));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE, oldProductOrService, newProductOrService);
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
				msgs = ((InternalEObject)productOrService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE, null, msgs);
			if (newProductOrService != null)
				msgs = ((InternalEObject)newProductOrService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE, null, msgs);
			msgs = basicSetProductOrService(newProductOrService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE, newProductOrService, newProductOrService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__MODIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER, oldProvider, newProvider);
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
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getExcluded() {
		return excluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcluded(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newExcluded, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldExcluded = excluded;
		excluded = newExcluded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED, oldExcluded, newExcluded);
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
	public void setExcluded(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newExcluded) {
		if (newExcluded != excluded) {
			NotificationChain msgs = null;
			if (excluded != null)
				msgs = ((InternalEObject)excluded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED, null, msgs);
			if (newExcluded != null)
				msgs = ((InternalEObject)newExcluded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED, null, msgs);
			msgs = basicSetExcluded(newExcluded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED, newExcluded, newExcluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.eclipse.mdht.hl7.fhir.dataTypes.String newName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME, oldName, newName);
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
	public void setName(org.eclipse.mdht.hl7.fhir.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(CodeableConcept newNetwork, NotificationChain msgs) {
		CodeableConcept oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK, oldNetwork, newNetwork);
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
	public void setNetwork(CodeableConcept newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(CodeableConcept newUnit, NotificationChain msgs) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT, oldUnit, newUnit);
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
	public void setUnit(CodeableConcept newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(CodeableConcept newTerm, NotificationChain msgs) {
		CodeableConcept oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM, oldTerm, newTerm);
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
	public void setTerm(CodeableConcept newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoverageEligibilityResponseInsuranceItemsBenefit> getBenefits() {
		if (benefits == null) {
			benefits = new EObjectContainmentEList<CoverageEligibilityResponseInsuranceItemsBenefit>(CoverageEligibilityResponseInsuranceItemsBenefit.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__BENEFIT);
		}
		return benefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getAuthorizationRequired() {
		return authorizationRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizationRequired(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newAuthorizationRequired, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldAuthorizationRequired = authorizationRequired;
		authorizationRequired = newAuthorizationRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED, oldAuthorizationRequired, newAuthorizationRequired);
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
	public void setAuthorizationRequired(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newAuthorizationRequired) {
		if (newAuthorizationRequired != authorizationRequired) {
			NotificationChain msgs = null;
			if (authorizationRequired != null)
				msgs = ((InternalEObject)authorizationRequired).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED, null, msgs);
			if (newAuthorizationRequired != null)
				msgs = ((InternalEObject)newAuthorizationRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED, null, msgs);
			msgs = basicSetAuthorizationRequired(newAuthorizationRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED, newAuthorizationRequired, newAuthorizationRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAuthorizationSupportings() {
		if (authorizationSupportings == null) {
			authorizationSupportings = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_SUPPORTING);
		}
		return authorizationSupportings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getAuthorizationUrl() {
		return authorizationUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizationUrl(Uri newAuthorizationUrl, NotificationChain msgs) {
		Uri oldAuthorizationUrl = authorizationUrl;
		authorizationUrl = newAuthorizationUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL, oldAuthorizationUrl, newAuthorizationUrl);
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
	public void setAuthorizationUrl(Uri newAuthorizationUrl) {
		if (newAuthorizationUrl != authorizationUrl) {
			NotificationChain msgs = null;
			if (authorizationUrl != null)
				msgs = ((InternalEObject)authorizationUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL, null, msgs);
			if (newAuthorizationUrl != null)
				msgs = ((InternalEObject)newAuthorizationUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL, null, msgs);
			msgs = basicSetAuthorizationUrl(newAuthorizationUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL, newAuthorizationUrl, newAuthorizationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY:
				return basicSetCategory(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE:
				return basicSetProductOrService(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__MODIFIER:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER:
				return basicSetProvider(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED:
				return basicSetExcluded(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK:
				return basicSetNetwork(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT:
				return basicSetUnit(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM:
				return basicSetTerm(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__BENEFIT:
				return ((InternalEList<?>)getBenefits()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED:
				return basicSetAuthorizationRequired(null, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_SUPPORTING:
				return ((InternalEList<?>)getAuthorizationSupportings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL:
				return basicSetAuthorizationUrl(null, msgs);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY:
				return getCategory();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE:
				return getProductOrService();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__MODIFIER:
				return getModifiers();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER:
				return getProvider();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED:
				return getExcluded();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME:
				return getName();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK:
				return getNetwork();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT:
				return getUnit();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM:
				return getTerm();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__BENEFIT:
				return getBenefits();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED:
				return getAuthorizationRequired();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_SUPPORTING:
				return getAuthorizationSupportings();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL:
				return getAuthorizationUrl();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__MODIFIER:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED:
				setExcluded((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK:
				setNetwork((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM:
				setTerm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__BENEFIT:
				getBenefits().clear();
				getBenefits().addAll((Collection<? extends CoverageEligibilityResponseInsuranceItemsBenefit>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED:
				setAuthorizationRequired((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_SUPPORTING:
				getAuthorizationSupportings().clear();
				getAuthorizationSupportings().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL:
				setAuthorizationUrl((Uri)newValue);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE:
				setProductOrService((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__MODIFIER:
				getModifiers().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER:
				setProvider((Reference)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED:
				setExcluded((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME:
				setName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK:
				setNetwork((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM:
				setTerm((CodeableConcept)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__BENEFIT:
				getBenefits().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED:
				setAuthorizationRequired((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_SUPPORTING:
				getAuthorizationSupportings().clear();
				return;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL:
				setAuthorizationUrl((Uri)null);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__CATEGORY:
				return category != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PRODUCT_OR_SERVICE:
				return productOrService != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__MODIFIER:
				return modifiers != null && !modifiers.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__PROVIDER:
				return provider != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__EXCLUDED:
				return excluded != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NAME:
				return name != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__DESCRIPTION:
				return description != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__NETWORK:
				return network != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__UNIT:
				return unit != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__TERM:
				return term != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__BENEFIT:
				return benefits != null && !benefits.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_REQUIRED:
				return authorizationRequired != null;
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_SUPPORTING:
				return authorizationSupportings != null && !authorizationSupportings.isEmpty();
			case ResourcesPackage.COVERAGE_ELIGIBILITY_RESPONSE_INSURANCE_ITEMS__AUTHORIZATION_URL:
				return authorizationUrl != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityResponseInsuranceItemsImpl
