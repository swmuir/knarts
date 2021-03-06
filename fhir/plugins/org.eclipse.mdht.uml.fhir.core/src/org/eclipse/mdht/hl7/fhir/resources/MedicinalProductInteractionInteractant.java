/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Interaction Interactant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductInteractionInteractant#getItemx <em>Itemx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductInteractionInteractant()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductInteraction_Interactant'"
 * @generated
 */
public interface MedicinalProductInteractionInteractant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Itemx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemx</em>' containment reference.
	 * @see #setItemx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicinalProductInteractionInteractant_Itemx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='item[x]'"
	 * @generated
	 */
	DataType getItemx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicinalProductInteractionInteractant#getItemx <em>Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemx</em>' containment reference.
	 * @see #getItemx()
	 * @generated
	 */
	void setItemx(DataType value);

} // MedicinalProductInteractionInteractant
