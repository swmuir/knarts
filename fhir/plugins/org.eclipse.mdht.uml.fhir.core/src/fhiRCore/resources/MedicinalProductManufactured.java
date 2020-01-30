/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ProdCharacteristic;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Manufactured</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicinalProductManufactured#getManufacturedDoseForm <em>Manufactured Dose Form</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductManufactured#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductManufactured#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductManufactured#getManufacturers <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductManufactured#getIngredients <em>Ingredient</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductManufactured#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductManufactured#getOtherCharacteristics <em>Other Characteristics</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductManufactured()
 * @model
 * @generated
 */
public interface MedicinalProductManufactured extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Manufactured Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured Dose Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufactured Dose Form</em>' containment reference.
	 * @see #setManufacturedDoseForm(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductManufactured_ManufacturedDoseForm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getManufacturedDoseForm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductManufactured#getManufacturedDoseForm <em>Manufactured Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured Dose Form</em>' containment reference.
	 * @see #getManufacturedDoseForm()
	 * @generated
	 */
	void setManufacturedDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Unit Of Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Presentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #setUnitOfPresentation(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductManufactured_UnitOfPresentation()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnitOfPresentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductManufactured#getUnitOfPresentation <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #getUnitOfPresentation()
	 * @generated
	 */
	void setUnitOfPresentation(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductManufactured_Quantity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductManufactured#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductManufactured_Manufacturer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getManufacturers();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductManufactured_Ingredient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getIngredients();

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductManufactured_PhysicalCharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	ProdCharacteristic getPhysicalCharacteristics();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductManufactured#getPhysicalCharacteristics <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 */
	void setPhysicalCharacteristics(ProdCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Other Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Characteristics</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductManufactured_OtherCharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getOtherCharacteristics();

} // MedicinalProductManufactured
