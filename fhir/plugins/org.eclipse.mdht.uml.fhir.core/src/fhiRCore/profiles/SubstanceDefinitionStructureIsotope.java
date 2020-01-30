/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Structure Isotope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getHalfLife <em>Half Life</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getMolecularWeight <em>Molecular Weight</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotope()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Structure_Isotope'"
 * @generated
 */
public interface SubstanceDefinitionStructureIsotope extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotope_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotope_Name()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getName();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference.
	 * @see #setSubstitution(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotope_Substitution()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSubstitution();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getSubstitution <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution</em>' containment reference.
	 * @see #getSubstitution()
	 * @generated
	 */
	void setSubstitution(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Half Life</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Half Life</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Half Life</em>' containment reference.
	 * @see #setHalfLife(Quantity)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotope_HalfLife()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getHalfLife();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getHalfLife <em>Half Life</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Half Life</em>' containment reference.
	 * @see #getHalfLife()
	 * @generated
	 */
	void setHalfLife(Quantity value);

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #setMolecularWeight(SubstanceDefinitionStructureIsotopeMolecularWeight)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructureIsotope_MolecularWeight()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceDefinitionStructureIsotopeMolecularWeight getMolecularWeight();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope#getMolecularWeight <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(SubstanceDefinitionStructureIsotopeMolecularWeight value);

} // SubstanceDefinitionStructureIsotope
