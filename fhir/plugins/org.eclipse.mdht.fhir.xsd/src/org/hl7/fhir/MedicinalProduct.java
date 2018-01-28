/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getCombinedPharmaceuticalDoseForm <em>Combined Pharmaceutical Dose Form</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getAdditionalMonitoringIndicator <em>Additional Monitoring Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getSpecialMeasures <em>Special Measures</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getPaediatricUseIndicator <em>Paediatric Use Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getOrphanDesignationStatus <em>Orphan Designation Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getProductClassification <em>Product Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getMarketingAuthorization <em>Marketing Authorization</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getPackagedMedicinalProduct <em>Packaged Medicinal Product</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getPharmaceuticalProduct <em>Pharmaceutical Product</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getClinicalParticulars <em>Clinical Particulars</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getAttachedDocument <em>Attached Document</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getMasterFile <em>Master File</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getCrossReference <em>Cross Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProduct#getManufacturingBusinessOperation <em>Manufacturing Business Operation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct()
 * @model extendedMetaData="name='MedicinalProduct' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProduct extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business idenfifier for this product. Could be an MPID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_Identifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProduct#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulatory type, e.g Investigational or Authorized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProduct#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Combined Pharmaceutical Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dose form for a single part product, or combined form of a multiple part product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combined Pharmaceutical Dose Form</em>' containment reference.
	 * @see #setCombinedPharmaceuticalDoseForm(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_CombinedPharmaceuticalDoseForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='combinedPharmaceuticalDoseForm' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCombinedPharmaceuticalDoseForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProduct#getCombinedPharmaceuticalDoseForm <em>Combined Pharmaceutical Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combined Pharmaceutical Dose Form</em>' containment reference.
	 * @see #getCombinedPharmaceuticalDoseForm()
	 * @generated
	 */
	void setCombinedPharmaceuticalDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additional Monitoring Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Monitoring Indicator</em>' containment reference.
	 * @see #setAdditionalMonitoringIndicator(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_AdditionalMonitoringIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalMonitoringIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdditionalMonitoringIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProduct#getAdditionalMonitoringIndicator <em>Additional Monitoring Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Monitoring Indicator</em>' containment reference.
	 * @see #getAdditionalMonitoringIndicator()
	 * @generated
	 */
	void setAdditionalMonitoringIndicator(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Special Measures</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the Medicinal Product is subject to special measures for regulatory reasons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Measures</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_SpecialMeasures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialMeasures' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getSpecialMeasures();

	/**
	 * Returns the value of the '<em><b>Paediatric Use Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If authorised for use in children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paediatric Use Indicator</em>' containment reference.
	 * @see #setPaediatricUseIndicator(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_PaediatricUseIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paediatricUseIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPaediatricUseIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProduct#getPaediatricUseIndicator <em>Paediatric Use Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paediatric Use Indicator</em>' containment reference.
	 * @see #getPaediatricUseIndicator()
	 * @generated
	 */
	void setPaediatricUseIndicator(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Orphan Designation Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orphan Designation Status</em>' containment reference.
	 * @see #setOrphanDesignationStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_OrphanDesignationStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orphanDesignationStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOrphanDesignationStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProduct#getOrphanDesignationStatus <em>Orphan Designation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orphan Designation Status</em>' containment reference.
	 * @see #getOrphanDesignationStatus()
	 * @generated
	 */
	void setOrphanDesignationStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows the product to be classified by various systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_ProductClassification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getProductClassification();

	/**
	 * Returns the value of the '<em><b>Marketing Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Product regulatory authorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marketing Authorization</em>' containment reference.
	 * @see #setMarketingAuthorization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_MarketingAuthorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='marketingAuthorization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMarketingAuthorization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProduct#getMarketingAuthorization <em>Marketing Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Authorization</em>' containment reference.
	 * @see #getMarketingAuthorization()
	 * @generated
	 */
	void setMarketingAuthorization(Reference value);

	/**
	 * Returns the value of the '<em><b>Packaged Medicinal Product</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Package representation for the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Medicinal Product</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_PackagedMedicinalProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packagedMedicinalProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPackagedMedicinalProduct();

	/**
	 * Returns the value of the '<em><b>Pharmaceutical Product</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pharmaceutical aspects of product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pharmaceutical Product</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_PharmaceuticalProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pharmaceuticalProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPharmaceuticalProduct();

	/**
	 * Returns the value of the '<em><b>Clinical Particulars</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical particulars, indications etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Particulars</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_ClinicalParticulars()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalParticulars' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getClinicalParticulars();

	/**
	 * Returns the value of the '<em><b>Attached Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting documentation, typically for regulatory submission.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attached Document</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_AttachedDocument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachedDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAttachedDocument();

	/**
	 * Returns the value of the '<em><b>Master File</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master File</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_MasterFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='masterFile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getMasterFile();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product's name, including full name and possibly coded parts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductName> getName();

	/**
	 * Returns the value of the '<em><b>Cross Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to another product, e.g. for linking authorised to investigational product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_CrossReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crossReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getCrossReference();

	/**
	 * Returns the value of the '<em><b>Manufacturing Business Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductManufacturingBusinessOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operation applied to the product, for manufacturing or adminsitrative purpose.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturing Business Operation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProduct_ManufacturingBusinessOperation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturingBusinessOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductManufacturingBusinessOperation> getManufacturingBusinessOperation();

} // MedicinalProduct
