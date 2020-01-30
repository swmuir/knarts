/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.DomainResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition</b></em>'.
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
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getDomain <em>Domain</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getSources <em>Source</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getMoieties <em>Moiety</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getProperties <em>Property</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getReferenceInformation <em>Reference Information</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getStructure <em>Structure</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getNames <em>Name</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getMolecularWeights <em>Molecular Weight</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getRelationships <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getNucleicAcid <em>Nucleic Acid</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getPolymer <em>Polymer</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getProtein <em>Protein</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinition#getSourceMaterial <em>Source Material</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition()
 * @model
 * @generated
 */
public interface SubstanceDefinition extends DomainResource {
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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Status()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Domain()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDomain();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSources();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Moiety</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionMoiety}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moiety</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moiety</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Moiety()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionMoiety> getMoieties();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Reference Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Information</em>' containment reference.
	 * @see #setReferenceInformation(Reference)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_ReferenceInformation()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReferenceInformation();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getReferenceInformation <em>Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Information</em>' containment reference.
	 * @see #getReferenceInformation()
	 * @generated
	 */
	void setReferenceInformation(Reference value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(SubstanceDefinitionStructure)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Structure()
	 * @model containment="true"
	 * @generated
	 */
	SubstanceDefinitionStructure getStructure();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(SubstanceDefinitionStructure value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionCode> getCodes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Name()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionName> getNames();

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Weight</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_MolecularWeight()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionStructureIsotopeMolecularWeight> getMolecularWeights();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionRelationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Nucleic Acid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nucleic Acid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nucleic Acid</em>' containment reference.
	 * @see #setNucleicAcid(Reference)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_NucleicAcid()
	 * @model containment="true"
	 * @generated
	 */
	Reference getNucleicAcid();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getNucleicAcid <em>Nucleic Acid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nucleic Acid</em>' containment reference.
	 * @see #getNucleicAcid()
	 * @generated
	 */
	void setNucleicAcid(Reference value);

	/**
	 * Returns the value of the '<em><b>Polymer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polymer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polymer</em>' containment reference.
	 * @see #setPolymer(Reference)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Polymer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPolymer();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getPolymer <em>Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polymer</em>' containment reference.
	 * @see #getPolymer()
	 * @generated
	 */
	void setPolymer(Reference value);

	/**
	 * Returns the value of the '<em><b>Protein</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protein</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protein</em>' containment reference.
	 * @see #setProtein(Reference)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_Protein()
	 * @model containment="true"
	 * @generated
	 */
	Reference getProtein();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getProtein <em>Protein</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protein</em>' containment reference.
	 * @see #getProtein()
	 * @generated
	 */
	void setProtein(Reference value);

	/**
	 * Returns the value of the '<em><b>Source Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Material</em>' containment reference.
	 * @see #setSourceMaterial(Reference)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinition_SourceMaterial()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSourceMaterial();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinition#getSourceMaterial <em>Source Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Material</em>' containment reference.
	 * @see #getSourceMaterial()
	 * @generated
	 */
	void setSourceMaterial(Reference value);

} // SubstanceDefinition
