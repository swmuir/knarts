/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeat#getNumberOfUnits <em>Number Of Units</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeat#getAverageMolecularFormula <em>Average Molecular Formula</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeat#getRepeatUnitAmountType <em>Repeat Unit Amount Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeat#getRepeatUnits <em>Repeat Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstancePolymerRepeat()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstancePolymer_Repeat'"
 * @generated
 */
public interface SubstancePolymerRepeat extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number Of Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Units</em>' containment reference.
	 * @see #setNumberOfUnits(org.eclipse.mdht.hl7.fhir.dataTypes.Integer)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstancePolymerRepeat_NumberOfUnits()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Integer getNumberOfUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeat#getNumberOfUnits <em>Number Of Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Units</em>' containment reference.
	 * @see #getNumberOfUnits()
	 * @generated
	 */
	void setNumberOfUnits(org.eclipse.mdht.hl7.fhir.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Average Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Molecular Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Molecular Formula</em>' containment reference.
	 * @see #setAverageMolecularFormula(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstancePolymerRepeat_AverageMolecularFormula()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getAverageMolecularFormula();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeat#getAverageMolecularFormula <em>Average Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Molecular Formula</em>' containment reference.
	 * @see #getAverageMolecularFormula()
	 * @generated
	 */
	void setAverageMolecularFormula(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Unit Amount Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Unit Amount Type</em>' containment reference.
	 * @see #setRepeatUnitAmountType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstancePolymerRepeat_RepeatUnitAmountType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRepeatUnitAmountType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeat#getRepeatUnitAmountType <em>Repeat Unit Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Unit Amount Type</em>' containment reference.
	 * @see #getRepeatUnitAmountType()
	 * @generated
	 */
	void setRepeatUnitAmountType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerRepeatRepeatUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Unit</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstancePolymerRepeat_RepeatUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstancePolymerRepeatRepeatUnit> getRepeatUnits();

} // SubstancePolymerRepeat
