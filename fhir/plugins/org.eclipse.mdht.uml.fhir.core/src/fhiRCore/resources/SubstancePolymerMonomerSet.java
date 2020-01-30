/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Monomer Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstancePolymerMonomerSet#getRatioType <em>Ratio Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerMonomerSet#getStartingMaterials <em>Starting Material</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerMonomerSet()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstancePolymer_MonomerSet'"
 * @generated
 */
public interface SubstancePolymerMonomerSet extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Ratio Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Type</em>' containment reference.
	 * @see #setRatioType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerMonomerSet_RatioType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRatioType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerMonomerSet#getRatioType <em>Ratio Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Type</em>' containment reference.
	 * @see #getRatioType()
	 * @generated
	 */
	void setRatioType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Starting Material</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstancePolymerMonomerSetStartingMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Material</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Material</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerMonomerSet_StartingMaterial()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstancePolymerMonomerSetStartingMaterial> getStartingMaterials();

} // SubstancePolymerMonomerSet
