/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group Stratifier Stratifier Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroup#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroup#getComponents <em>Component</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroup#getPopulations <em>Population</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroup#getMeasureScore <em>Measure Score</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroup()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Stratifier_StratifierGroup'"
 * @generated
 */
public interface MeasureReportGroupStratifierStratifierGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroup_Value()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroup#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroupComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroup_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureReportGroupStratifierStratifierGroupComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroup_Population()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation> getPopulations();

	/**
	 * Returns the value of the '<em><b>Measure Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Score</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Score</em>' containment reference.
	 * @see #setMeasureScore(Quantity)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroup_MeasureScore()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getMeasureScore();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroup#getMeasureScore <em>Measure Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Score</em>' containment reference.
	 * @see #getMeasureScore()
	 * @generated
	 */
	void setMeasureScore(Quantity value);

} // MeasureReportGroupStratifierStratifierGroup
