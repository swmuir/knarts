/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MeasureGroup#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureGroup#getPopulations <em>Population</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureGroup#getStratifiers <em>Stratifier</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMeasureGroup()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Measure_Group'"
 * @generated
 */
public interface MeasureGroup extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureGroup_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureGroup#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureGroup_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureGroup#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MeasureGroupPopulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureGroup_Population()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureGroupPopulation> getPopulations();

	/**
	 * Returns the value of the '<em><b>Stratifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MeasureGroupStratifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stratifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stratifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureGroup_Stratifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureGroupStratifier> getStratifiers();

} // MeasureGroup
