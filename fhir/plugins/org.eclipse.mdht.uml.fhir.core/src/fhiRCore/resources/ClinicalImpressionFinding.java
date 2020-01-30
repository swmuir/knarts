/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Impression Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ClinicalImpressionFinding#getItemCodeableConcept <em>Item Codeable Concept</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpressionFinding#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ClinicalImpressionFinding#getBasis <em>Basis</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpressionFinding()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ClinicalImpression_Finding'"
 * @generated
 */
public interface ClinicalImpressionFinding extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Item Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #setItemCodeableConcept(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpressionFinding_ItemCodeableConcept()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getItemCodeableConcept();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpressionFinding#getItemCodeableConcept <em>Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Codeable Concept</em>' containment reference.
	 * @see #getItemCodeableConcept()
	 * @generated
	 */
	void setItemCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Reference</em>' containment reference.
	 * @see #setItemReference(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpressionFinding_ItemReference()
	 * @model containment="true"
	 * @generated
	 */
	Reference getItemReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpressionFinding#getItemReference <em>Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference</em>' containment reference.
	 * @see #getItemReference()
	 * @generated
	 */
	void setItemReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis</em>' containment reference.
	 * @see #setBasis(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getClinicalImpressionFinding_Basis()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getBasis();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ClinicalImpressionFinding#getBasis <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis</em>' containment reference.
	 * @see #getBasis()
	 * @generated
	 */
	void setBasis(fhiRCore.dataTypes.String value);

} // ClinicalImpressionFinding
