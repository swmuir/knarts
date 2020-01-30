/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Administration Dosage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationAdministrationDosage#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationAdministrationDosage#getSite <em>Site</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationAdministrationDosage#getRoute <em>Route</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationAdministrationDosage#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationAdministrationDosage#getDose <em>Dose</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationAdministrationDosage#getRatex <em>Ratex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationAdministrationDosage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationAdministration_Dosage'"
 * @generated
 */
public interface MedicationAdministrationDosage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationAdministrationDosage_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationAdministrationDosage#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see #setSite(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationAdministrationDosage_Site()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationAdministrationDosage#getSite <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' containment reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationAdministrationDosage_Route()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationAdministrationDosage#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationAdministrationDosage_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationAdministrationDosage#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose</em>' containment reference.
	 * @see #setDose(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationAdministrationDosage_Dose()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getDose();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationAdministrationDosage#getDose <em>Dose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose</em>' containment reference.
	 * @see #getDose()
	 * @generated
	 */
	void setDose(Quantity value);

	/**
	 * Returns the value of the '<em><b>Ratex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratex</em>' containment reference.
	 * @see #setRatex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationAdministrationDosage_Ratex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='rate[x]'"
	 * @generated
	 */
	DataType getRatex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationAdministrationDosage#getRatex <em>Ratex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratex</em>' containment reference.
	 * @see #getRatex()
	 * @generated
	 */
	void setRatex(DataType value);

} // MedicationAdministrationDosage
