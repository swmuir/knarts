/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Repeat Repeat Unit Structural Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation#getAttachment <em>Attachment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnitStructuralRepresentation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RepeatUnit_StructuralRepresentation'"
 * @generated
 */
public interface SubstancePolymerRepeatRepeatUnitStructuralRepresentation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnitStructuralRepresentation_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnitStructuralRepresentation_Representation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getRepresentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(Attachment)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnitStructuralRepresentation_Attachment()
	 * @model containment="true"
	 * @generated
	 */
	Attachment getAttachment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(Attachment value);

} // SubstancePolymerRepeatRepeatUnitStructuralRepresentation
