/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Pharmaceutical</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceutical#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceutical#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceutical#getAdministrableDoseForm <em>Administrable Dose Form</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceutical#getUnitOfPresentation <em>Unit Of Presentation</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceutical#getIngredients <em>Ingredient</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceutical#getDevices <em>Device</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceutical#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceutical#getRouteOfAdministrations <em>Route Of Administration</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical()
 * @model
 * @generated
 */
public interface MedicinalProductPharmaceutical extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSubjects();

	/**
	 * Returns the value of the '<em><b>Administrable Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrable Dose Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrable Dose Form</em>' containment reference.
	 * @see #setAdministrableDoseForm(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical_AdministrableDoseForm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getAdministrableDoseForm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceutical#getAdministrableDoseForm <em>Administrable Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrable Dose Form</em>' containment reference.
	 * @see #getAdministrableDoseForm()
	 * @generated
	 */
	void setAdministrableDoseForm(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical_UnitOfPresentation()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getUnitOfPresentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceutical#getUnitOfPresentation <em>Unit Of Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Presentation</em>' containment reference.
	 * @see #getUnitOfPresentation()
	 * @generated
	 */
	void setUnitOfPresentation(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical_Ingredient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getIngredients();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getDevices();

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductPharmaceuticalCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical_Characteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductPharmaceuticalCharacteristics> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Route Of Administration</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Of Administration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Of Administration</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceutical_RouteOfAdministration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MedicinalProductPharmaceuticalRouteOfAdministration> getRouteOfAdministrations();

} // MedicinalProductPharmaceutical
