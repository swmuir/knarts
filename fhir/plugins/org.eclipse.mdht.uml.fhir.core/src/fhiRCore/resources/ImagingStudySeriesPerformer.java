/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study Series Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ImagingStudySeriesPerformer#getFunction <em>Function</em>}</li>
 *   <li>{@link fhiRCore.resources.ImagingStudySeriesPerformer#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeriesPerformer()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Series_Performer'"
 * @generated
 */
public interface ImagingStudySeriesPerformer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeriesPerformer_Function()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFunction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeriesPerformer#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImagingStudySeriesPerformer_Actor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImagingStudySeriesPerformer#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

} // ImagingStudySeriesPerformer
