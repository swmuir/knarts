/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ObservationComponent#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationComponent#getValuex <em>Valuex</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationComponent#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationComponent#getInterpretations <em>Interpretation</em>}</li>
 *   <li>{@link fhiRCore.resources.ObservationComponent#getReferenceRanges <em>Reference Range</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getObservationComponent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Observation_Component'"
 * @generated
 */
public interface ObservationComponent extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getObservationComponent_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationComponent#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuex</em>' containment reference.
	 * @see #setValuex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getObservationComponent_Valuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='value[x]'"
	 * @generated
	 */
	DataType getValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationComponent#getValuex <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuex</em>' containment reference.
	 * @see #getValuex()
	 * @generated
	 */
	void setValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Absent Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #setDataAbsentReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getObservationComponent_DataAbsentReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDataAbsentReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ObservationComponent#getDataAbsentReason <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #getDataAbsentReason()
	 * @generated
	 */
	void setDataAbsentReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservationComponent_Interpretation()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getInterpretations();

	/**
	 * Returns the value of the '<em><b>Reference Range</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ObservationReferenceRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Range</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservationComponent_ReferenceRange()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObservationReferenceRange> getReferenceRanges();

} // ObservationComponent
