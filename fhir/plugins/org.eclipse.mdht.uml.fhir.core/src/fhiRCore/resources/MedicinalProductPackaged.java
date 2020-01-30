/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.MarketingStatus;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Packaged</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getMarketingStati <em>Marketing Status</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getMarketingAuthorization <em>Marketing Authorization</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getManufacturers <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getBatchIdentifiers <em>Batch Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPackaged#getPackageItems <em>Package Item</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged()
 * @model
 * @generated
 */
public interface MedicinalProductPackaged extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSubjects();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPackaged#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Legal Status Of Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal Status Of Supply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Status Of Supply</em>' containment reference.
	 * @see #setLegalStatusOfSupply(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_LegalStatusOfSupply()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getLegalStatusOfSupply();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPackaged#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Status Of Supply</em>' containment reference.
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 */
	void setLegalStatusOfSupply(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Marketing Status</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.MarketingStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marketing Status</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Status</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_MarketingStatus()
	 * @model containment="true"
	 * @generated
	 */
	EList<MarketingStatus> getMarketingStati();

	/**
	 * Returns the value of the '<em><b>Marketing Authorization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marketing Authorization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Authorization</em>' containment reference.
	 * @see #setMarketingAuthorization(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_MarketingAuthorization()
	 * @model containment="true"
	 * @generated
	 */
	Reference getMarketingAuthorization();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPackaged#getMarketingAuthorization <em>Marketing Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Authorization</em>' containment reference.
	 * @see #getMarketingAuthorization()
	 * @generated
	 */
	void setMarketingAuthorization(Reference value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_Manufacturer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getManufacturers();

	/**
	 * Returns the value of the '<em><b>Batch Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductPackagedBatchIdentifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_BatchIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductPackagedBatchIdentifier> getBatchIdentifiers();

	/**
	 * Returns the value of the '<em><b>Package Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductPackagedPackageItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPackaged_PackageItem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MedicinalProductPackagedPackageItem> getPackageItems();

} // MedicinalProductPackaged
