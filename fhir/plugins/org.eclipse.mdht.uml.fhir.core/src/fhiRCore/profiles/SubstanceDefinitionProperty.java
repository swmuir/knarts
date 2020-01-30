/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Definition Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionProperty#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionProperty#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionProperty#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionProperty#getDefiningSubstancex <em>Defining Substancex</em>}</li>
 *   <li>{@link fhiRCore.profiles.SubstanceDefinitionProperty#getAmountx <em>Amountx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionProperty()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceDefinition_Property'"
 * @generated
 */
public interface SubstanceDefinitionProperty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionProperty_Category()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionProperty_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(fhiRCore.dataTypes.String)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionProperty_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getParameters();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Defining Substancex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Substancex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Substancex</em>' containment reference.
	 * @see #setDefiningSubstancex(DataType)
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionProperty_DefiningSubstancex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='definingSubstance[x]'"
	 * @generated
	 */
	DataType getDefiningSubstancex();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getDefiningSubstancex <em>Defining Substancex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Substancex</em>' containment reference.
	 * @see #getDefiningSubstancex()
	 * @generated
	 */
	void setDefiningSubstancex(DataType value);

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
	 * @see fhiRCore.profiles.ProfilesPackage#getSubstanceDefinitionProperty_Amountx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='amount[x]'"
	 * @generated
	 */
	DataType getAmountx();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.SubstanceDefinitionProperty#getAmountx <em>Amountx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amountx</em>' containment reference.
	 * @see #getAmountx()
	 * @generated
	 */
	void setAmountx(DataType value);

} // SubstanceDefinitionProperty
