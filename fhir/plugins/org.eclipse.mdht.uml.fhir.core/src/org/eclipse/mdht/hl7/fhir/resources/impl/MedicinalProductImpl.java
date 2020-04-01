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
import org.eclipse.mdht.hl7.fhir.dataTypes.Coding;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.MarketingStatus;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProduct;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductContact;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductManufacturingBusinessOperation;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductName;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductSpecialDesignation;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getCombinedPharmaceuticalDoseForm <em>Combined Pharmaceutical Dose Form</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getAdditionalMonitoringIndicator <em>Additional Monitoring Indicator</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getSpecialMeasures <em>Special Measures</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getPaediatricUseIndicator <em>Paediatric Use Indicator</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getProductClassifications <em>Product Classification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getMarketingStati <em>Marketing Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getPharmaceuticalProducts <em>Pharmaceutical Product</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getPackagedMedicinalProducts <em>Packaged Medicinal Product</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getAttachedDocuments <em>Attached Document</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getMasterFiles <em>Master File</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getClinicalTrials <em>Clinical Trial</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getNames <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getCrossReferences <em>Cross Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getManufacturingBusinessOperations <em>Manufacturing Business Operation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductImpl#getSpecialDesignations <em>Special Designation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductImpl extends DomainResourceImpl implements MedicinalProduct {
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
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Coding domain;

	/**
	 * The cached value of the '{@link #getCombinedPharmaceuticalDoseForm() <em>Combined Pharmaceutical Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedPharmaceuticalDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept combinedPharmaceuticalDoseForm;

	/**
	 * The cached value of the '{@link #getIndication() <em>Indication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String indication;

	/**
	 * The cached value of the '{@link #getLegalStatusOfSupply() <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept legalStatusOfSupply;

	/**
	 * The cached value of the '{@link #getAdditionalMonitoringIndicator() <em>Additional Monitoring Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMonitoringIndicator()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept additionalMonitoringIndicator;

	/**
	 * The cached value of the '{@link #getSpecialMeasures() <em>Special Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> specialMeasures;

	/**
	 * The cached value of the '{@link #getPaediatricUseIndicator() <em>Paediatric Use Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaediatricUseIndicator()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept paediatricUseIndicator;

	/**
	 * The cached value of the '{@link #getProductClassifications() <em>Product Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> productClassifications;

	/**
	 * The cached value of the '{@link #getMarketingStati() <em>Marketing Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingStati()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketingStatus> marketingStati;

	/**
	 * The cached value of the '{@link #getPharmaceuticalProducts() <em>Pharmaceutical Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmaceuticalProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> pharmaceuticalProducts;

	/**
	 * The cached value of the '{@link #getPackagedMedicinalProducts() <em>Packaged Medicinal Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedMedicinalProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> packagedMedicinalProducts;

	/**
	 * The cached value of the '{@link #getAttachedDocuments() <em>Attached Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> attachedDocuments;

	/**
	 * The cached value of the '{@link #getMasterFiles() <em>Master File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> masterFiles;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductContact> contacts;

	/**
	 * The cached value of the '{@link #getClinicalTrials() <em>Clinical Trial</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalTrials()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> clinicalTrials;

	/**
	 * The cached value of the '{@link #getNames() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductName> names;

	/**
	 * The cached value of the '{@link #getCrossReferences() <em>Cross Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> crossReferences;

	/**
	 * The cached value of the '{@link #getManufacturingBusinessOperations() <em>Manufacturing Business Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingBusinessOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductManufacturingBusinessOperation> manufacturingBusinessOperations;

	/**
	 * The cached value of the '{@link #getSpecialDesignations() <em>Special Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialDesignations()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductSpecialDesignation> specialDesignations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coding getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Coding newDomain, NotificationChain msgs) {
		Coding oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN, oldDomain, newDomain);
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
	public void setDomain(Coding newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCombinedPharmaceuticalDoseForm() {
		return combinedPharmaceuticalDoseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinedPharmaceuticalDoseForm(CodeableConcept newCombinedPharmaceuticalDoseForm, NotificationChain msgs) {
		CodeableConcept oldCombinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
		combinedPharmaceuticalDoseForm = newCombinedPharmaceuticalDoseForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM, oldCombinedPharmaceuticalDoseForm, newCombinedPharmaceuticalDoseForm);
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
	public void setCombinedPharmaceuticalDoseForm(CodeableConcept newCombinedPharmaceuticalDoseForm) {
		if (newCombinedPharmaceuticalDoseForm != combinedPharmaceuticalDoseForm) {
			NotificationChain msgs = null;
			if (combinedPharmaceuticalDoseForm != null)
				msgs = ((InternalEObject)combinedPharmaceuticalDoseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM, null, msgs);
			if (newCombinedPharmaceuticalDoseForm != null)
				msgs = ((InternalEObject)newCombinedPharmaceuticalDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM, null, msgs);
			msgs = basicSetCombinedPharmaceuticalDoseForm(newCombinedPharmaceuticalDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM, newCombinedPharmaceuticalDoseForm, newCombinedPharmaceuticalDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getIndication() {
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndication(org.eclipse.mdht.hl7.fhir.dataTypes.String newIndication, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldIndication = indication;
		indication = newIndication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__INDICATION, oldIndication, newIndication);
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
	public void setIndication(org.eclipse.mdht.hl7.fhir.dataTypes.String newIndication) {
		if (newIndication != indication) {
			NotificationChain msgs = null;
			if (indication != null)
				msgs = ((InternalEObject)indication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__INDICATION, null, msgs);
			if (newIndication != null)
				msgs = ((InternalEObject)newIndication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__INDICATION, null, msgs);
			msgs = basicSetIndication(newIndication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__INDICATION, newIndication, newIndication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLegalStatusOfSupply() {
		return legalStatusOfSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply, NotificationChain msgs) {
		CodeableConcept oldLegalStatusOfSupply = legalStatusOfSupply;
		legalStatusOfSupply = newLegalStatusOfSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY, oldLegalStatusOfSupply, newLegalStatusOfSupply);
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
	public void setLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply) {
		if (newLegalStatusOfSupply != legalStatusOfSupply) {
			NotificationChain msgs = null;
			if (legalStatusOfSupply != null)
				msgs = ((InternalEObject)legalStatusOfSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			if (newLegalStatusOfSupply != null)
				msgs = ((InternalEObject)newLegalStatusOfSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			msgs = basicSetLegalStatusOfSupply(newLegalStatusOfSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY, newLegalStatusOfSupply, newLegalStatusOfSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getAdditionalMonitoringIndicator() {
		return additionalMonitoringIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalMonitoringIndicator(CodeableConcept newAdditionalMonitoringIndicator, NotificationChain msgs) {
		CodeableConcept oldAdditionalMonitoringIndicator = additionalMonitoringIndicator;
		additionalMonitoringIndicator = newAdditionalMonitoringIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR, oldAdditionalMonitoringIndicator, newAdditionalMonitoringIndicator);
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
	public void setAdditionalMonitoringIndicator(CodeableConcept newAdditionalMonitoringIndicator) {
		if (newAdditionalMonitoringIndicator != additionalMonitoringIndicator) {
			NotificationChain msgs = null;
			if (additionalMonitoringIndicator != null)
				msgs = ((InternalEObject)additionalMonitoringIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR, null, msgs);
			if (newAdditionalMonitoringIndicator != null)
				msgs = ((InternalEObject)newAdditionalMonitoringIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR, null, msgs);
			msgs = basicSetAdditionalMonitoringIndicator(newAdditionalMonitoringIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR, newAdditionalMonitoringIndicator, newAdditionalMonitoringIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getSpecialMeasures() {
		if (specialMeasures == null) {
			specialMeasures = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES);
		}
		return specialMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getPaediatricUseIndicator() {
		return paediatricUseIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaediatricUseIndicator(CodeableConcept newPaediatricUseIndicator, NotificationChain msgs) {
		CodeableConcept oldPaediatricUseIndicator = paediatricUseIndicator;
		paediatricUseIndicator = newPaediatricUseIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR, oldPaediatricUseIndicator, newPaediatricUseIndicator);
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
	public void setPaediatricUseIndicator(CodeableConcept newPaediatricUseIndicator) {
		if (newPaediatricUseIndicator != paediatricUseIndicator) {
			NotificationChain msgs = null;
			if (paediatricUseIndicator != null)
				msgs = ((InternalEObject)paediatricUseIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR, null, msgs);
			if (newPaediatricUseIndicator != null)
				msgs = ((InternalEObject)newPaediatricUseIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR, null, msgs);
			msgs = basicSetPaediatricUseIndicator(newPaediatricUseIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR, newPaediatricUseIndicator, newPaediatricUseIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getProductClassifications() {
		if (productClassifications == null) {
			productClassifications = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION);
		}
		return productClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarketingStatus> getMarketingStati() {
		if (marketingStati == null) {
			marketingStati = new EObjectContainmentEList<MarketingStatus>(MarketingStatus.class, this, ResourcesPackage.MEDICINAL_PRODUCT__MARKETING_STATUS);
		}
		return marketingStati;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPharmaceuticalProducts() {
		if (pharmaceuticalProducts == null) {
			pharmaceuticalProducts = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT);
		}
		return pharmaceuticalProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPackagedMedicinalProducts() {
		if (packagedMedicinalProducts == null) {
			packagedMedicinalProducts = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT);
		}
		return packagedMedicinalProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getAttachedDocuments() {
		if (attachedDocuments == null) {
			attachedDocuments = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT);
		}
		return attachedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getMasterFiles() {
		if (masterFiles == null) {
			masterFiles = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT__MASTER_FILE);
		}
		return masterFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductContact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<MedicinalProductContact>(MedicinalProductContact.class, this, ResourcesPackage.MEDICINAL_PRODUCT__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getClinicalTrials() {
		if (clinicalTrials == null) {
			clinicalTrials = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT__CLINICAL_TRIAL);
		}
		return clinicalTrials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductName> getNames() {
		if (names == null) {
			names = new EObjectContainmentEList<MedicinalProductName>(MedicinalProductName.class, this, ResourcesPackage.MEDICINAL_PRODUCT__NAME);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getCrossReferences() {
		if (crossReferences == null) {
			crossReferences = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE);
		}
		return crossReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductManufacturingBusinessOperation> getManufacturingBusinessOperations() {
		if (manufacturingBusinessOperations == null) {
			manufacturingBusinessOperations = new EObjectContainmentEList<MedicinalProductManufacturingBusinessOperation>(MedicinalProductManufacturingBusinessOperation.class, this, ResourcesPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION);
		}
		return manufacturingBusinessOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductSpecialDesignation> getSpecialDesignations() {
		if (specialDesignations == null) {
			specialDesignations = new EObjectContainmentEList<MedicinalProductSpecialDesignation>(MedicinalProductSpecialDesignation.class, this, ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_DESIGNATION);
		}
		return specialDesignations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN:
				return basicSetDomain(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return basicSetCombinedPharmaceuticalDoseForm(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__INDICATION:
				return basicSetIndication(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY:
				return basicSetLegalStatusOfSupply(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				return basicSetAdditionalMonitoringIndicator(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				return ((InternalEList<?>)getSpecialMeasures()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				return basicSetPaediatricUseIndicator(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				return ((InternalEList<?>)getProductClassifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__MARKETING_STATUS:
				return ((InternalEList<?>)getMarketingStati()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				return ((InternalEList<?>)getPharmaceuticalProducts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				return ((InternalEList<?>)getPackagedMedicinalProducts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				return ((InternalEList<?>)getAttachedDocuments()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				return ((InternalEList<?>)getMasterFiles()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__CLINICAL_TRIAL:
				return ((InternalEList<?>)getClinicalTrials()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__NAME:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				return ((InternalEList<?>)getCrossReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				return ((InternalEList<?>)getManufacturingBusinessOperations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_DESIGNATION:
				return ((InternalEList<?>)getSpecialDesignations()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICINAL_PRODUCT__TYPE:
				return getType();
			case ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN:
				return getDomain();
			case ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return getCombinedPharmaceuticalDoseForm();
			case ResourcesPackage.MEDICINAL_PRODUCT__INDICATION:
				return getIndication();
			case ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY:
				return getLegalStatusOfSupply();
			case ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				return getAdditionalMonitoringIndicator();
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				return getSpecialMeasures();
			case ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				return getPaediatricUseIndicator();
			case ResourcesPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				return getProductClassifications();
			case ResourcesPackage.MEDICINAL_PRODUCT__MARKETING_STATUS:
				return getMarketingStati();
			case ResourcesPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				return getPharmaceuticalProducts();
			case ResourcesPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				return getPackagedMedicinalProducts();
			case ResourcesPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				return getAttachedDocuments();
			case ResourcesPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				return getMasterFiles();
			case ResourcesPackage.MEDICINAL_PRODUCT__CONTACT:
				return getContacts();
			case ResourcesPackage.MEDICINAL_PRODUCT__CLINICAL_TRIAL:
				return getClinicalTrials();
			case ResourcesPackage.MEDICINAL_PRODUCT__NAME:
				return getNames();
			case ResourcesPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				return getCrossReferences();
			case ResourcesPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				return getManufacturingBusinessOperations();
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_DESIGNATION:
				return getSpecialDesignations();
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
			case ResourcesPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN:
				setDomain((Coding)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				setCombinedPharmaceuticalDoseForm((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__INDICATION:
				setIndication((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				setAdditionalMonitoringIndicator((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				getSpecialMeasures().clear();
				getSpecialMeasures().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				setPaediatricUseIndicator((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				getProductClassifications().clear();
				getProductClassifications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__MARKETING_STATUS:
				getMarketingStati().clear();
				getMarketingStati().addAll((Collection<? extends MarketingStatus>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				getPharmaceuticalProducts().clear();
				getPharmaceuticalProducts().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				getPackagedMedicinalProducts().clear();
				getPackagedMedicinalProducts().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				getAttachedDocuments().clear();
				getAttachedDocuments().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				getMasterFiles().clear();
				getMasterFiles().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends MedicinalProductContact>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__CLINICAL_TRIAL:
				getClinicalTrials().clear();
				getClinicalTrials().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__NAME:
				getNames().clear();
				getNames().addAll((Collection<? extends MedicinalProductName>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				getCrossReferences().clear();
				getCrossReferences().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				getManufacturingBusinessOperations().clear();
				getManufacturingBusinessOperations().addAll((Collection<? extends MedicinalProductManufacturingBusinessOperation>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_DESIGNATION:
				getSpecialDesignations().clear();
				getSpecialDesignations().addAll((Collection<? extends MedicinalProductSpecialDesignation>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN:
				setDomain((Coding)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				setCombinedPharmaceuticalDoseForm((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__INDICATION:
				setIndication((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				setAdditionalMonitoringIndicator((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				getSpecialMeasures().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				setPaediatricUseIndicator((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				getProductClassifications().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__MARKETING_STATUS:
				getMarketingStati().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				getPharmaceuticalProducts().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				getPackagedMedicinalProducts().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				getAttachedDocuments().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				getMasterFiles().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__CLINICAL_TRIAL:
				getClinicalTrials().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__NAME:
				getNames().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				getCrossReferences().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				getManufacturingBusinessOperations().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_DESIGNATION:
				getSpecialDesignations().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__TYPE:
				return type != null;
			case ResourcesPackage.MEDICINAL_PRODUCT__DOMAIN:
				return domain != null;
			case ResourcesPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return combinedPharmaceuticalDoseForm != null;
			case ResourcesPackage.MEDICINAL_PRODUCT__INDICATION:
				return indication != null;
			case ResourcesPackage.MEDICINAL_PRODUCT__LEGAL_STATUS_OF_SUPPLY:
				return legalStatusOfSupply != null;
			case ResourcesPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				return additionalMonitoringIndicator != null;
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				return specialMeasures != null && !specialMeasures.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				return paediatricUseIndicator != null;
			case ResourcesPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				return productClassifications != null && !productClassifications.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__MARKETING_STATUS:
				return marketingStati != null && !marketingStati.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				return pharmaceuticalProducts != null && !pharmaceuticalProducts.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				return packagedMedicinalProducts != null && !packagedMedicinalProducts.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				return attachedDocuments != null && !attachedDocuments.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				return masterFiles != null && !masterFiles.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__CLINICAL_TRIAL:
				return clinicalTrials != null && !clinicalTrials.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__NAME:
				return names != null && !names.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				return crossReferences != null && !crossReferences.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				return manufacturingBusinessOperations != null && !manufacturingBusinessOperations.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT__SPECIAL_DESIGNATION:
				return specialDesignations != null && !specialDesignations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductImpl
