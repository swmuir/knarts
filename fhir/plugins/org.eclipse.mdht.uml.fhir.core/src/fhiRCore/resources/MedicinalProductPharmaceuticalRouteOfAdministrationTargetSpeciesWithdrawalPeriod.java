/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Pharmaceutical Route Of Administration Target Species Withdrawal Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod#getTissue <em>Tissue</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod#getSupportingInformation <em>Supporting Information</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TargetSpecies_WithdrawalPeriod'"
 * @generated
 */
public interface MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Tissue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tissue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tissue</em>' containment reference.
	 * @see #setTissue(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod_Tissue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getTissue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod#getTissue <em>Tissue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tissue</em>' containment reference.
	 * @see #getTissue()
	 * @generated
	 */
	void setTissue(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Quantity getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Quantity value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference.
	 * @see #setSupportingInformation(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod_SupportingInformation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSupportingInformation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod#getSupportingInformation <em>Supporting Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Information</em>' containment reference.
	 * @see #getSupportingInformation()
	 * @generated
	 */
	void setSupportingInformation(fhiRCore.dataTypes.String value);

} // MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod
