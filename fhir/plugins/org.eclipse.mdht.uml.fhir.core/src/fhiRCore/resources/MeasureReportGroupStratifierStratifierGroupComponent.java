/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Report Group Stratifier Stratifier Group Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupComponent#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupComponent#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupComponent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StratifierGroup_Component'"
 * @generated
 */
public interface MeasureReportGroupStratifierStratifierGroupComponent extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupComponent_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupComponent#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureReportGroupStratifierStratifierGroupComponent_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupComponent#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CodeableConcept value);

} // MeasureReportGroupStratifierStratifierGroupComponent
