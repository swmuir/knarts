/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getSourceMaterialClass <em>Source Material Class</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getSourceMaterialType <em>Source Material Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getSourceMaterialState <em>Source Material State</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getOrganismId <em>Organism Id</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getOrganismName <em>Organism Name</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getParentSubstanceIds <em>Parent Substance Id</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getParentSubstanceNames <em>Parent Substance Name</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getCountryOfOrigins <em>Country Of Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getGeographicalLocations <em>Geographical Location</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getDevelopmentStage <em>Development Stage</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getFractionDescriptions <em>Fraction Description</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getOrganism <em>Organism</em>}</li>
 *   <li>{@link fhiRCore.resources.SubstanceSourceMaterial#getPartDescriptions <em>Part Description</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial()
 * @model
 * @generated
 */
public interface SubstanceSourceMaterial extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Source Material Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Material Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Material Class</em>' containment reference.
	 * @see #setSourceMaterialClass(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_SourceMaterialClass()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSourceMaterialClass();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterial#getSourceMaterialClass <em>Source Material Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material Class</em>' containment reference.
	 * @see #getSourceMaterialClass()
	 * @generated
	 */
	void setSourceMaterialClass(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source Material Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Material Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Material Type</em>' containment reference.
	 * @see #setSourceMaterialType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_SourceMaterialType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSourceMaterialType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterial#getSourceMaterialType <em>Source Material Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material Type</em>' containment reference.
	 * @see #getSourceMaterialType()
	 * @generated
	 */
	void setSourceMaterialType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source Material State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Material State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Material State</em>' containment reference.
	 * @see #setSourceMaterialState(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_SourceMaterialState()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSourceMaterialState();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterial#getSourceMaterialState <em>Source Material State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material State</em>' containment reference.
	 * @see #getSourceMaterialState()
	 * @generated
	 */
	void setSourceMaterialState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Organism Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organism Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organism Id</em>' containment reference.
	 * @see #setOrganismId(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_OrganismId()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getOrganismId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterial#getOrganismId <em>Organism Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism Id</em>' containment reference.
	 * @see #getOrganismId()
	 * @generated
	 */
	void setOrganismId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Organism Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organism Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organism Name</em>' containment reference.
	 * @see #setOrganismName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_OrganismName()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getOrganismName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterial#getOrganismName <em>Organism Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism Name</em>' containment reference.
	 * @see #getOrganismName()
	 * @generated
	 */
	void setOrganismName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Parent Substance Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Substance Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Substance Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_ParentSubstanceId()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getParentSubstanceIds();

	/**
	 * Returns the value of the '<em><b>Parent Substance Name</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Substance Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Substance Name</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_ParentSubstanceName()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getParentSubstanceNames();

	/**
	 * Returns the value of the '<em><b>Country Of Origin</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Of Origin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Of Origin</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_CountryOfOrigin()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCountryOfOrigins();

	/**
	 * Returns the value of the '<em><b>Geographical Location</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geographical Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographical Location</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_GeographicalLocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getGeographicalLocations();

	/**
	 * Returns the value of the '<em><b>Development Stage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Stage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Stage</em>' containment reference.
	 * @see #setDevelopmentStage(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_DevelopmentStage()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDevelopmentStage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterial#getDevelopmentStage <em>Development Stage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Stage</em>' containment reference.
	 * @see #getDevelopmentStage()
	 * @generated
	 */
	void setDevelopmentStage(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Fraction Description</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceSourceMaterialFractionDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction Description</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_FractionDescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceSourceMaterialFractionDescription> getFractionDescriptions();

	/**
	 * Returns the value of the '<em><b>Organism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organism</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organism</em>' containment reference.
	 * @see #setOrganism(SubstanceSourceMaterialOrganism)
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_Organism()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceSourceMaterialOrganism getOrganism();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SubstanceSourceMaterial#getOrganism <em>Organism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism</em>' containment reference.
	 * @see #getOrganism()
	 * @generated
	 */
	void setOrganism(SubstanceSourceMaterialOrganism value);

	/**
	 * Returns the value of the '<em><b>Part Description</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SubstanceSourceMaterialPartDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Description</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSubstanceSourceMaterial_PartDescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceSourceMaterialPartDescription> getPartDescriptions();

} // SubstanceSourceMaterial
