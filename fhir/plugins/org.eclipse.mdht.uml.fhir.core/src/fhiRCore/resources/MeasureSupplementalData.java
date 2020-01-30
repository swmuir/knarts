/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Supplemental Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MeasureSupplementalData#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureSupplementalData#getUsages <em>Usage</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureSupplementalData#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.MeasureSupplementalData#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMeasureSupplementalData()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Measure_SupplementalData'"
 * @generated
 */
public interface MeasureSupplementalData extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureSupplementalData_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureSupplementalData#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureSupplementalData_Usage()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getUsages();

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
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureSupplementalData_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureSupplementalData#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference.
	 * @see #setCriteria(Expression)
	 * @see fhiRCore.resources.ResourcesPackage#getMeasureSupplementalData_Criteria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCriteria();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MeasureSupplementalData#getCriteria <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' containment reference.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(Expression value);

} // MeasureSupplementalData
