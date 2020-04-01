/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.OperationDefinitionParameterBinding#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.OperationDefinitionParameterBinding#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getOperationDefinitionParameterBinding()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Parameter_Binding'"
 * @generated
 */
public interface OperationDefinitionParameterBinding extends BackboneElement {
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getOperationDefinitionParameterBinding_Strength()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStrength();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.OperationDefinitionParameterBinding#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Code value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getOperationDefinitionParameterBinding_ValueSet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.OperationDefinitionParameterBinding#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

} // OperationDefinitionParameterBinding
