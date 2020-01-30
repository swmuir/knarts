/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getLanguages <em>Language</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getDomains <em>Domain</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getSynonyms <em>Synonym</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getTranslations <em>Translation</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getOfficials <em>Official</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionName#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceDefinition_Name'"
 * @generated
 */
public interface SubstanceDefinitionName extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionName#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionName#getType <em>Type</em>}' containment reference.
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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Status()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionName#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred</em>' containment reference.
	 * @see #setPreferred(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Preferred()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getPreferred();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionName#getPreferred <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' containment reference.
	 * @see #getPreferred()
	 * @generated
	 */
	void setPreferred(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Language()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getLanguages();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getDomains();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Jurisdiction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdictions();

	/**
	 * Returns the value of the '<em><b>Synonym</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonym</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonym</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Synonym()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionName> getSynonyms();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Translation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionName> getTranslations();

	/**
	 * Returns the value of the '<em><b>Official</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.profiles.SubstanceDefinitionNameOfficial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Official</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Official</em>' containment reference list.
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Official()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstanceDefinitionNameOfficial> getOfficials();

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionName_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSources();

} // SubstanceDefinitionName
