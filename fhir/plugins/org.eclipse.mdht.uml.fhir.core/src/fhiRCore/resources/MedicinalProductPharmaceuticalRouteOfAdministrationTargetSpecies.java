/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Pharmaceutical Route Of Administration Target Species</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies#getWithdrawalPeriods <em>Withdrawal Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RouteOfAdministration_TargetSpecies'"
 * @generated
 */
public interface MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Withdrawal Period</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Withdrawal Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Withdrawal Period</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies_WithdrawalPeriod()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod> getWithdrawalPeriods();

} // MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies
