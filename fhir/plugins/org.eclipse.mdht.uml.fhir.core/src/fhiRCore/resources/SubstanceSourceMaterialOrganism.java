/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Organism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getFamily <em>Family</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getGenus <em>Genus</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getSpecies <em>Species</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getIntraspecificType <em>Intraspecific Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getIntraspecificDescription <em>Intraspecific Description</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getHybrid <em>Hybrid</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getOrganismGeneral <em>Organism General</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceSourceMaterial_Organism'"
 * @generated
 */
public interface SubstanceSourceMaterialOrganism extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' containment reference.
	 * @see #setFamily(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism_Family()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFamily();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getFamily <em>Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' containment reference.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Genus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genus</em>' containment reference.
	 * @see #setGenus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism_Genus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getGenus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getGenus <em>Genus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genus</em>' containment reference.
	 * @see #getGenus()
	 * @generated
	 */
	void setGenus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' containment reference.
	 * @see #setSpecies(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism_Species()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSpecies();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getSpecies <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' containment reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intraspecific Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intraspecific Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intraspecific Type</em>' containment reference.
	 * @see #setIntraspecificType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism_IntraspecificType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getIntraspecificType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getIntraspecificType <em>Intraspecific Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intraspecific Type</em>' containment reference.
	 * @see #getIntraspecificType()
	 * @generated
	 */
	void setIntraspecificType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Intraspecific Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intraspecific Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intraspecific Description</em>' containment reference.
	 * @see #setIntraspecificDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism_IntraspecificDescription()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getIntraspecificDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getIntraspecificDescription <em>Intraspecific Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intraspecific Description</em>' containment reference.
	 * @see #getIntraspecificDescription()
	 * @generated
	 */
	void setIntraspecificDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceSourceMaterialOrganismAuthor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism_Author()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceSourceMaterialOrganismAuthor> getAuthors();

	/**
	 * Returns the value of the '<em><b>Hybrid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hybrid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hybrid</em>' containment reference.
	 * @see #setHybrid(SubstanceSourceMaterialOrganismHybrid)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism_Hybrid()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceSourceMaterialOrganismHybrid getHybrid();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getHybrid <em>Hybrid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hybrid</em>' containment reference.
	 * @see #getHybrid()
	 * @generated
	 */
	void setHybrid(SubstanceSourceMaterialOrganismHybrid value);

	/**
	 * Returns the value of the '<em><b>Organism General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organism General</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organism General</em>' containment reference.
	 * @see #setOrganismGeneral(SubstanceSourceMaterialOrganismOrganismGeneral)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterialOrganism_OrganismGeneral()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceSourceMaterialOrganismOrganismGeneral getOrganismGeneral();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterialOrganism#getOrganismGeneral <em>Organism General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism General</em>' containment reference.
	 * @see #getOrganismGeneral()
	 * @generated
	 */
	void setOrganismGeneral(SubstanceSourceMaterialOrganismOrganismGeneral value);

} // SubstanceSourceMaterialOrganism
