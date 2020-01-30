/**
 */
package fhiRCore.dataTypes;

import fhiRCore.resources.ValueSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Element6</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement6#getStrength <em>Strength</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement6#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement6#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement6()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ElementDefinition_Element6'"
 * @generated
 */
public interface ElementDefinitionElement6 extends Element {
	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement6_Strength()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStrength();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement6#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Code value);

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
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement6_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement6#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement6_ValueSet()
	 * @model containment="true"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement6#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

} // ElementDefinitionElement6
