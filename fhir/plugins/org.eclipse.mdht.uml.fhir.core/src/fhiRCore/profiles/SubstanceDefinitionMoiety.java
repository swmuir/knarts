/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Moiety</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getRole <em>Role</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getStereochemistry <em>Stereochemistry</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getOpticalActivity <em>Optical Activity</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getMolecularFormula <em>Molecular Formula</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getAmountx <em>Amountx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionMoiety()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceDefinition_Moiety'"
 * @generated
 */
public interface SubstanceDefinitionMoiety extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionMoiety_Role()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionMoiety_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getIdentifier <em>Identifier</em>}' containment reference.
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
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionMoiety_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionMoiety_Stereochemistry()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStereochemistry();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getStereochemistry <em>Stereochemistry</em>}' containment reference.
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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionMoiety_OpticalActivity()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getOpticalActivity();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getOpticalActivity <em>Optical Activity</em>}' containment reference.
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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionMoiety_MolecularFormula()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMolecularFormula();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getMolecularFormula <em>Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Formula</em>' containment reference.
	 * @see #getMolecularFormula()
	 * @generated
	 */
	void setMolecularFormula(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Amountx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amountx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amountx</em>' containment reference.
	 * @see #setAmountx(DataType)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionMoiety_Amountx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='amount[x]'"
	 * @generated
	 */
	DataType getAmountx();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionMoiety#getAmountx <em>Amountx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amountx</em>' containment reference.
	 * @see #getAmountx()
	 * @generated
	 */
	void setAmountx(DataType value);

} // SubstanceDefinitionMoiety
