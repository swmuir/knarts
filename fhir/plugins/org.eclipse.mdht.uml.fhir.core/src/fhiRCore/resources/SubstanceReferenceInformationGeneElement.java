/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Reference Information Gene Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformationGeneElement#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformationGeneElement#getElement <em>Element</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceReferenceInformationGeneElement#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationGeneElement()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceReferenceInformation_GeneElement'"
 * @generated
 */
public interface SubstanceReferenceInformationGeneElement extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationGeneElement_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceReferenceInformationGeneElement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationGeneElement_Element()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getElement();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceReferenceInformationGeneElement#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Identifier value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceReferenceInformationGeneElement_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSources();

} // SubstanceReferenceInformationGeneElement
