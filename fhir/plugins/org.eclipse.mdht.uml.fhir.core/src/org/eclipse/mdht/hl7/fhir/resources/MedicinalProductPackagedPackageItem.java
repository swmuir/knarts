/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.ProdCharacteristic;
import org.eclipse.mdht.hl7.fhir.dataTypes.ProductShelfLife;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Packaged Package Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getMaterials <em>Material</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getAlternateMaterials <em>Alternate Material</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getDevices <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getManufacturedItems <em>Manufactured Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getPackageItems <em>Package Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getOtherCharacteristics <em>Other Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getShelfLifeStorages <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getManufacturers <em>Manufacturer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductPackaged_PackageItem'"
 * @generated
 */
public interface MedicinalProductPackagedPackageItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_Quantity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_Material()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getMaterials();

	/**
	 * Returns the value of the '<em><b>Alternate Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate Material</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate Material</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_AlternateMaterial()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getAlternateMaterials();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getDevices();

	/**
	 * Returns the value of the '<em><b>Manufactured Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufactured Item</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_ManufacturedItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getManufacturedItems();

	/**
	 * Returns the value of the '<em><b>Package Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Item</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_PackageItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductPackagedPackageItem> getPackageItems();

	/**
	 * Returns the value of the '<em><b>Physical Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Characteristics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #setPhysicalCharacteristics(ProdCharacteristic)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_PhysicalCharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	ProdCharacteristic getPhysicalCharacteristics();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem#getPhysicalCharacteristics <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 */
	void setPhysicalCharacteristics(ProdCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Other Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Characteristics</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_OtherCharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getOtherCharacteristics();

	/**
	 * Returns the value of the '<em><b>Shelf Life Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.ProductShelfLife}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shelf Life Storage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shelf Life Storage</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_ShelfLifeStorage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductShelfLife> getShelfLifeStorages();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductPackagedPackageItem_Manufacturer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getManufacturers();

} // MedicinalProductPackagedPackageItem
