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
import org.hl7.fhir.MedicinalProduct;
import org.hl7.fhir.MedicinalProductManufacturingBusinessOperation;
import org.hl7.fhir.MedicinalProductName;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getCombinedPharmaceuticalDoseForm <em>Combined Pharmaceutical Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getAdditionalMonitoringIndicator <em>Additional Monitoring Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getSpecialMeasures <em>Special Measures</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getPaediatricUseIndicator <em>Paediatric Use Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getOrphanDesignationStatus <em>Orphan Designation Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getProductClassification <em>Product Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getMarketingAuthorization <em>Marketing Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getPackagedMedicinalProduct <em>Packaged Medicinal Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getPharmaceuticalProduct <em>Pharmaceutical Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getClinicalParticulars <em>Clinical Particulars</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getAttachedDocument <em>Attached Document</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getMasterFile <em>Master File</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getCrossReference <em>Cross Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductImpl#getManufacturingBusinessOperation <em>Manufacturing Business Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductImpl extends DomainResourceImpl implements MedicinalProduct {
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
	 * The cached value of the '{@link #getCombinedPharmaceuticalDoseForm() <em>Combined Pharmaceutical Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedPharmaceuticalDoseForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept combinedPharmaceuticalDoseForm;

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
	protected EList<org.hl7.fhir.String> specialMeasures;

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
	 * The cached value of the '{@link #getOrphanDesignationStatus() <em>Orphan Designation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphanDesignationStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orphanDesignationStatus;

	/**
	 * The cached value of the '{@link #getProductClassification() <em>Product Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> productClassification;

	/**
	 * The cached value of the '{@link #getMarketingAuthorization() <em>Marketing Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingAuthorization()
	 * @generated
	 * @ordered
	 */
	protected Reference marketingAuthorization;

	/**
	 * The cached value of the '{@link #getPackagedMedicinalProduct() <em>Packaged Medicinal Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedMedicinalProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> packagedMedicinalProduct;

	/**
	 * The cached value of the '{@link #getPharmaceuticalProduct() <em>Pharmaceutical Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmaceuticalProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> pharmaceuticalProduct;

	/**
	 * The cached value of the '{@link #getClinicalParticulars() <em>Clinical Particulars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalParticulars()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> clinicalParticulars;

	/**
	 * The cached value of the '{@link #getAttachedDocument() <em>Attached Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> attachedDocument;

	/**
	 * The cached value of the '{@link #getMasterFile() <em>Master File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFile()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> masterFile;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductName> name;

	/**
	 * The cached value of the '{@link #getCrossReference() <em>Cross Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> crossReference;

	/**
	 * The cached value of the '{@link #getManufacturingBusinessOperation() <em>Manufacturing Business Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingBusinessOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductManufacturingBusinessOperation> manufacturingBusinessOperation;

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
		return FhirPackage.eINSTANCE.getMedicinalProduct();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM, oldCombinedPharmaceuticalDoseForm, newCombinedPharmaceuticalDoseForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombinedPharmaceuticalDoseForm(CodeableConcept newCombinedPharmaceuticalDoseForm) {
		if (newCombinedPharmaceuticalDoseForm != combinedPharmaceuticalDoseForm) {
			NotificationChain msgs = null;
			if (combinedPharmaceuticalDoseForm != null)
				msgs = ((InternalEObject)combinedPharmaceuticalDoseForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM, null, msgs);
			if (newCombinedPharmaceuticalDoseForm != null)
				msgs = ((InternalEObject)newCombinedPharmaceuticalDoseForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM, null, msgs);
			msgs = basicSetCombinedPharmaceuticalDoseForm(newCombinedPharmaceuticalDoseForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM, newCombinedPharmaceuticalDoseForm, newCombinedPharmaceuticalDoseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR, oldAdditionalMonitoringIndicator, newAdditionalMonitoringIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalMonitoringIndicator(CodeableConcept newAdditionalMonitoringIndicator) {
		if (newAdditionalMonitoringIndicator != additionalMonitoringIndicator) {
			NotificationChain msgs = null;
			if (additionalMonitoringIndicator != null)
				msgs = ((InternalEObject)additionalMonitoringIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR, null, msgs);
			if (newAdditionalMonitoringIndicator != null)
				msgs = ((InternalEObject)newAdditionalMonitoringIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR, null, msgs);
			msgs = basicSetAdditionalMonitoringIndicator(newAdditionalMonitoringIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR, newAdditionalMonitoringIndicator, newAdditionalMonitoringIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getSpecialMeasures() {
		if (specialMeasures == null) {
			specialMeasures = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES);
		}
		return specialMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR, oldPaediatricUseIndicator, newPaediatricUseIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaediatricUseIndicator(CodeableConcept newPaediatricUseIndicator) {
		if (newPaediatricUseIndicator != paediatricUseIndicator) {
			NotificationChain msgs = null;
			if (paediatricUseIndicator != null)
				msgs = ((InternalEObject)paediatricUseIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR, null, msgs);
			if (newPaediatricUseIndicator != null)
				msgs = ((InternalEObject)newPaediatricUseIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR, null, msgs);
			msgs = basicSetPaediatricUseIndicator(newPaediatricUseIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR, newPaediatricUseIndicator, newPaediatricUseIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOrphanDesignationStatus() {
		return orphanDesignationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrphanDesignationStatus(CodeableConcept newOrphanDesignationStatus, NotificationChain msgs) {
		CodeableConcept oldOrphanDesignationStatus = orphanDesignationStatus;
		orphanDesignationStatus = newOrphanDesignationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS, oldOrphanDesignationStatus, newOrphanDesignationStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrphanDesignationStatus(CodeableConcept newOrphanDesignationStatus) {
		if (newOrphanDesignationStatus != orphanDesignationStatus) {
			NotificationChain msgs = null;
			if (orphanDesignationStatus != null)
				msgs = ((InternalEObject)orphanDesignationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS, null, msgs);
			if (newOrphanDesignationStatus != null)
				msgs = ((InternalEObject)newOrphanDesignationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS, null, msgs);
			msgs = basicSetOrphanDesignationStatus(newOrphanDesignationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS, newOrphanDesignationStatus, newOrphanDesignationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getProductClassification() {
		if (productClassification == null) {
			productClassification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION);
		}
		return productClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getMarketingAuthorization() {
		return marketingAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketingAuthorization(Reference newMarketingAuthorization, NotificationChain msgs) {
		Reference oldMarketingAuthorization = marketingAuthorization;
		marketingAuthorization = newMarketingAuthorization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION, oldMarketingAuthorization, newMarketingAuthorization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarketingAuthorization(Reference newMarketingAuthorization) {
		if (newMarketingAuthorization != marketingAuthorization) {
			NotificationChain msgs = null;
			if (marketingAuthorization != null)
				msgs = ((InternalEObject)marketingAuthorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION, null, msgs);
			if (newMarketingAuthorization != null)
				msgs = ((InternalEObject)newMarketingAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION, null, msgs);
			msgs = basicSetMarketingAuthorization(newMarketingAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION, newMarketingAuthorization, newMarketingAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPackagedMedicinalProduct() {
		if (packagedMedicinalProduct == null) {
			packagedMedicinalProduct = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT);
		}
		return packagedMedicinalProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getPharmaceuticalProduct() {
		if (pharmaceuticalProduct == null) {
			pharmaceuticalProduct = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT);
		}
		return pharmaceuticalProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getClinicalParticulars() {
		if (clinicalParticulars == null) {
			clinicalParticulars = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT__CLINICAL_PARTICULARS);
		}
		return clinicalParticulars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAttachedDocument() {
		if (attachedDocument == null) {
			attachedDocument = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT);
		}
		return attachedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getMasterFile() {
		if (masterFile == null) {
			masterFile = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.MEDICINAL_PRODUCT__MASTER_FILE);
		}
		return masterFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductName> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<MedicinalProductName>(MedicinalProductName.class, this, FhirPackage.MEDICINAL_PRODUCT__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getCrossReference() {
		if (crossReference == null) {
			crossReference = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE);
		}
		return crossReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductManufacturingBusinessOperation> getManufacturingBusinessOperation() {
		if (manufacturingBusinessOperation == null) {
			manufacturingBusinessOperation = new EObjectContainmentEList<MedicinalProductManufacturingBusinessOperation>(MedicinalProductManufacturingBusinessOperation.class, this, FhirPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION);
		}
		return manufacturingBusinessOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return basicSetCombinedPharmaceuticalDoseForm(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				return basicSetAdditionalMonitoringIndicator(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				return ((InternalEList<?>)getSpecialMeasures()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				return basicSetPaediatricUseIndicator(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS:
				return basicSetOrphanDesignationStatus(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				return ((InternalEList<?>)getProductClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION:
				return basicSetMarketingAuthorization(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				return ((InternalEList<?>)getPackagedMedicinalProduct()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				return ((InternalEList<?>)getPharmaceuticalProduct()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__CLINICAL_PARTICULARS:
				return ((InternalEList<?>)getClinicalParticulars()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				return ((InternalEList<?>)getAttachedDocument()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				return ((InternalEList<?>)getMasterFile()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				return ((InternalEList<?>)getCrossReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				return ((InternalEList<?>)getManufacturingBusinessOperation()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return getCombinedPharmaceuticalDoseForm();
			case FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				return getAdditionalMonitoringIndicator();
			case FhirPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				return getSpecialMeasures();
			case FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				return getPaediatricUseIndicator();
			case FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS:
				return getOrphanDesignationStatus();
			case FhirPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				return getProductClassification();
			case FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION:
				return getMarketingAuthorization();
			case FhirPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				return getPackagedMedicinalProduct();
			case FhirPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				return getPharmaceuticalProduct();
			case FhirPackage.MEDICINAL_PRODUCT__CLINICAL_PARTICULARS:
				return getClinicalParticulars();
			case FhirPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				return getAttachedDocument();
			case FhirPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				return getMasterFile();
			case FhirPackage.MEDICINAL_PRODUCT__NAME:
				return getName();
			case FhirPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				return getCrossReference();
			case FhirPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				return getManufacturingBusinessOperation();
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
			case FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				setCombinedPharmaceuticalDoseForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				setAdditionalMonitoringIndicator((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				getSpecialMeasures().clear();
				getSpecialMeasures().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				setPaediatricUseIndicator((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS:
				setOrphanDesignationStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				getProductClassification().clear();
				getProductClassification().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION:
				setMarketingAuthorization((Reference)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				getPackagedMedicinalProduct().clear();
				getPackagedMedicinalProduct().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				getPharmaceuticalProduct().clear();
				getPharmaceuticalProduct().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__CLINICAL_PARTICULARS:
				getClinicalParticulars().clear();
				getClinicalParticulars().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				getAttachedDocument().clear();
				getAttachedDocument().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				getMasterFile().clear();
				getMasterFile().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__NAME:
				getName().clear();
				getName().addAll((Collection<? extends MedicinalProductName>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				getCrossReference().clear();
				getCrossReference().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				getManufacturingBusinessOperation().clear();
				getManufacturingBusinessOperation().addAll((Collection<? extends MedicinalProductManufacturingBusinessOperation>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				setCombinedPharmaceuticalDoseForm((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				setAdditionalMonitoringIndicator((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				getSpecialMeasures().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				setPaediatricUseIndicator((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS:
				setOrphanDesignationStatus((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				getProductClassification().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION:
				setMarketingAuthorization((Reference)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				getPackagedMedicinalProduct().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				getPharmaceuticalProduct().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__CLINICAL_PARTICULARS:
				getClinicalParticulars().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				getAttachedDocument().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				getMasterFile().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__NAME:
				getName().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				getCrossReference().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				getManufacturingBusinessOperation().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MEDICINAL_PRODUCT__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT__COMBINED_PHARMACEUTICAL_DOSE_FORM:
				return combinedPharmaceuticalDoseForm != null;
			case FhirPackage.MEDICINAL_PRODUCT__ADDITIONAL_MONITORING_INDICATOR:
				return additionalMonitoringIndicator != null;
			case FhirPackage.MEDICINAL_PRODUCT__SPECIAL_MEASURES:
				return specialMeasures != null && !specialMeasures.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__PAEDIATRIC_USE_INDICATOR:
				return paediatricUseIndicator != null;
			case FhirPackage.MEDICINAL_PRODUCT__ORPHAN_DESIGNATION_STATUS:
				return orphanDesignationStatus != null;
			case FhirPackage.MEDICINAL_PRODUCT__PRODUCT_CLASSIFICATION:
				return productClassification != null && !productClassification.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__MARKETING_AUTHORIZATION:
				return marketingAuthorization != null;
			case FhirPackage.MEDICINAL_PRODUCT__PACKAGED_MEDICINAL_PRODUCT:
				return packagedMedicinalProduct != null && !packagedMedicinalProduct.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__PHARMACEUTICAL_PRODUCT:
				return pharmaceuticalProduct != null && !pharmaceuticalProduct.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__CLINICAL_PARTICULARS:
				return clinicalParticulars != null && !clinicalParticulars.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__ATTACHED_DOCUMENT:
				return attachedDocument != null && !attachedDocument.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__MASTER_FILE:
				return masterFile != null && !masterFile.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__NAME:
				return name != null && !name.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__CROSS_REFERENCE:
				return crossReference != null && !crossReference.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT__MANUFACTURING_BUSINESS_OPERATION:
				return manufacturingBusinessOperation != null && !manufacturingBusinessOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductImpl
