/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.SubstanceAmount;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Repeat Repeat Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit#getOrientationOfPolymerisation <em>Orientation Of Polymerisation</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit#getRepeatUnit <em>Repeat Unit</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit#getAmount <em>Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit#getDegreeOfPolymerisations <em>Degree Of Polymerisation</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit#getStructuralRepresentations <em>Structural Representation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnit()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Repeat_RepeatUnit'"
 * @generated
 */
public interface SubstancePolymerRepeatRepeatUnit extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Orientation Of Polymerisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation Of Polymerisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Of Polymerisation</em>' containment reference.
	 * @see #setOrientationOfPolymerisation(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnit_OrientationOfPolymerisation()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOrientationOfPolymerisation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit#getOrientationOfPolymerisation <em>Orientation Of Polymerisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Of Polymerisation</em>' containment reference.
	 * @see #getOrientationOfPolymerisation()
	 * @generated
	 */
	void setOrientationOfPolymerisation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Unit</em>' containment reference.
	 * @see #setRepeatUnit(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnit_RepeatUnit()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getRepeatUnit();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit#getRepeatUnit <em>Repeat Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Unit</em>' containment reference.
	 * @see #getRepeatUnit()
	 * @generated
	 */
	void setRepeatUnit(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(SubstanceAmount)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnit_Amount()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceAmount getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnit#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(SubstanceAmount value);

	/**
	 * Returns the value of the '<em><b>Degree Of Polymerisation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree Of Polymerisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree Of Polymerisation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnit_DegreeOfPolymerisation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation> getDegreeOfPolymerisations();

	/**
	 * Returns the value of the '<em><b>Structural Representation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstancePolymerRepeatRepeatUnitStructuralRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Representation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstancePolymerRepeatRepeatUnit_StructuralRepresentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstancePolymerRepeatRepeatUnitStructuralRepresentation> getStructuralRepresentations();

} // SubstancePolymerRepeatRepeatUnit
