/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Item Definition Property Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItemDefinitionPropertyGroup#getApplicabilities <em>Applicability</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItemDefinitionPropertyGroup#getPriceComponents <em>Price Component</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItemDefinitionPropertyGroup()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ChargeItemDefinition_PropertyGroup'"
 * @generated
 */
public interface ChargeItemDefinitionPropertyGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ChargeItemDefinitionApplicability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItemDefinitionPropertyGroup_Applicability()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChargeItemDefinitionApplicability> getApplicabilities();

	/**
	 * Returns the value of the '<em><b>Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ChargeItemDefinitionPropertyGroupPriceComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Component</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItemDefinitionPropertyGroup_PriceComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChargeItemDefinitionPropertyGroupPriceComponent> getPriceComponents();

} // ChargeItemDefinitionPropertyGroup
