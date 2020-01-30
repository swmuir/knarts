/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getCount <em>Count</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getSubjectResults <em>Subject Results</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StratifierGroup_StratifierGroupPopulation'"
 * @generated
 */
public interface MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_Count()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getCount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Subject Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Results</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Results</em>' containment reference.
	 * @see #setSubjectResults(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation_SubjectResults()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubjectResults();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation#getSubjectResults <em>Subject Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Results</em>' containment reference.
	 * @see #getSubjectResults()
	 * @generated
	 */
	void setSubjectResults(Reference value);

} // MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation
