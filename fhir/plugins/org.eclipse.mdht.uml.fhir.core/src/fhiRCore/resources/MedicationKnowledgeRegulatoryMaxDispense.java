/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Regulatory Max Dispense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeRegulatoryMaxDispense#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeRegulatoryMaxDispense#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeRegulatoryMaxDispense()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Regulatory_MaxDispense'"
 * @generated
 */
public interface MedicationKnowledgeRegulatoryMaxDispense extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeRegulatoryMaxDispense_Quantity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeRegulatoryMaxDispense#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeRegulatoryMaxDispense_Period()
	 * @model containment="true"
	 * @generated
	 */
	Duration getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeRegulatoryMaxDispense#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Duration value);

} // MedicationKnowledgeRegulatoryMaxDispense
