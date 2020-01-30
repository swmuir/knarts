/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Ratio;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getSubstancex <em>Substancex</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountx <em>Amountx</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountRatioLowLimit <em>Amount Ratio Low Limit</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionRelationship()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceDefinition_Relationship'"
 * @generated
 */
public interface SubstanceDefinitionRelationship extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substancex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substancex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substancex</em>' containment reference.
	 * @see #setSubstancex(DataType)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionRelationship_Substancex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='substance[x]'"
	 * @generated
	 */
	DataType getSubstancex();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getSubstancex <em>Substancex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substancex</em>' containment reference.
	 * @see #getSubstancex()
	 * @generated
	 */
	void setSubstancex(DataType value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionRelationship_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Is Defining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Defining</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Defining</em>' containment reference.
	 * @see #setIsDefining(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionRelationship_IsDefining()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getIsDefining();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getIsDefining <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defining</em>' containment reference.
	 * @see #getIsDefining()
	 * @generated
	 */
	void setIsDefining(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionRelationship_Amountx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='amount[x]'"
	 * @generated
	 */
	DataType getAmountx();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountx <em>Amountx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amountx</em>' containment reference.
	 * @see #getAmountx()
	 * @generated
	 */
	void setAmountx(DataType value);

	/**
	 * Returns the value of the '<em><b>Amount Ratio Low Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Ratio Low Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Ratio Low Limit</em>' containment reference.
	 * @see #setAmountRatioLowLimit(Ratio)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionRelationship_AmountRatioLowLimit()
	 * @model containment="true"
	 * @generated
	 */
	Ratio getAmountRatioLowLimit();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountRatioLowLimit <em>Amount Ratio Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Ratio Low Limit</em>' containment reference.
	 * @see #getAmountRatioLowLimit()
	 * @generated
	 */
	void setAmountRatioLowLimit(Ratio value);

	/**
	 * Returns the value of the '<em><b>Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Type</em>' containment reference.
	 * @see #setAmountType(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionRelationship_AmountType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAmountType();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionRelationship#getAmountType <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Type</em>' containment reference.
	 * @see #getAmountType()
	 * @generated
	 */
	void setAmountType(CodeableConcept value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionRelationship_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSources();

} // SubstanceDefinitionRelationship
