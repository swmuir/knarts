/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Ratio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Pharmaceutical Route Of Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getFirstDose <em>First Dose</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxSingleDose <em>Max Single Dose</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxDosePerDay <em>Max Dose Per Day</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxDosePerTreatmentPeriod <em>Max Dose Per Treatment Period</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxTreatmentPeriod <em>Max Treatment Period</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getTargetSpecies <em>Target Species</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministration()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductPharmaceutical_RouteOfAdministration'"
 * @generated
 */
public interface MedicinalProductPharmaceuticalRouteOfAdministration extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>First Dose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Dose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Dose</em>' containment reference.
	 * @see #setFirstDose(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_FirstDose()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getFirstDose();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getFirstDose <em>First Dose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Dose</em>' containment reference.
	 * @see #getFirstDose()
	 * @generated
	 */
	void setFirstDose(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Single Dose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Single Dose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Single Dose</em>' containment reference.
	 * @see #setMaxSingleDose(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_MaxSingleDose()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getMaxSingleDose();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxSingleDose <em>Max Single Dose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Single Dose</em>' containment reference.
	 * @see #getMaxSingleDose()
	 * @generated
	 */
	void setMaxSingleDose(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Day</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Day</em>' containment reference.
	 * @see #setMaxDosePerDay(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_MaxDosePerDay()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getMaxDosePerDay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxDosePerDay <em>Max Dose Per Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Day</em>' containment reference.
	 * @see #getMaxDosePerDay()
	 * @generated
	 */
	void setMaxDosePerDay(Quantity value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Treatment Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Treatment Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Treatment Period</em>' containment reference.
	 * @see #setMaxDosePerTreatmentPeriod(Ratio)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_MaxDosePerTreatmentPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getMaxDosePerTreatmentPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxDosePerTreatmentPeriod <em>Max Dose Per Treatment Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Treatment Period</em>' containment reference.
	 * @see #getMaxDosePerTreatmentPeriod()
	 * @generated
	 */
	void setMaxDosePerTreatmentPeriod(Ratio value);

	/**
	 * Returns the value of the '<em><b>Max Treatment Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Treatment Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Treatment Period</em>' containment reference.
	 * @see #setMaxTreatmentPeriod(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_MaxTreatmentPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Duration getMaxTreatmentPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministration#getMaxTreatmentPeriod <em>Max Treatment Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Treatment Period</em>' containment reference.
	 * @see #getMaxTreatmentPeriod()
	 * @generated
	 */
	void setMaxTreatmentPeriod(Duration value);

	/**
	 * Returns the value of the '<em><b>Target Species</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Species</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Species</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministration_TargetSpecies()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies> getTargetSpecies();

} // MedicinalProductPharmaceuticalRouteOfAdministration
