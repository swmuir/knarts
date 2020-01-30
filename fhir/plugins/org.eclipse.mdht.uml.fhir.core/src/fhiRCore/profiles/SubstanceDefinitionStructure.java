/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructure#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructure#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructure#getIsotopes <em>Isotope</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructure#getSources <em>Source</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionStructure#getRepresentations <em>Representation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceDefinition_Structure'"
 * @generated
 */
public interface SubstanceDefinitionStructure extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Stereochemistry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereochemistry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #setStereochemistry(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure_Stereochemistry()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStereochemistry();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getStereochemistry <em>Stereochemistry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereochemistry</em>' containment reference.
	 * @see #getStereochemistry()
	 * @generated
	 */
	void setStereochemistry(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Optical Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optical Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optical Activity</em>' containment reference.
	 * @see #setOpticalActivity(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure_OpticalActivity()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOpticalActivity();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getOpticalActivity <em>Optical Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optical Activity</em>' containment reference.
	 * @see #getOpticalActivity()
	 * @generated
	 */
	void setOpticalActivity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #setMolecularFormula(fhiRCore.dataTypes.String)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure_MolecularFormula()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMolecularFormula();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularFormula <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #getMolecularFormula()
	 * @generated
	 */
	void setMolecularFormula(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Molecular Formula By Moiety</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Formula By Moiety</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Formula By Moiety</em>' containment reference.
	 * @see #setMolecularFormulaByMoiety(fhiRCore.dataTypes.String)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure_MolecularFormulaByMoiety()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMolecularFormulaByMoiety();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularFormulaByMoiety <em>Molecular Formula By Moiety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula By Moiety</em>' containment reference.
	 * @see #getMolecularFormulaByMoiety()
	 * @generated
	 */
	void setMolecularFormulaByMoiety(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Isotope</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isotope</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isotope</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure_Isotope()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionStructureIsotope> getIsotopes();

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure_MolecularWeight()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceDefinitionStructureIsotopeMolecularWeight getMolecularWeight();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionStructure#getMolecularWeight <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(SubstanceDefinitionStructureIsotopeMolecularWeight value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSources();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionStructureRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionStructure_Representation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionStructureRepresentation> getRepresentations();

} // SubstanceDefinitionStructure
