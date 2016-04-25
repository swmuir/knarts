/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Definition Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of an action to be performed. Some aspects of the definition are specified statically, and some aspects can be specified dynamically by referencing logic defined in a library.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ActionDefinitionBehavior#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinitionBehavior#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getActionDefinitionBehavior()
 * @model extendedMetaData="name='ActionDefinition.Behavior' kind='elementOnly'"
 * @generated
 */
public interface ActionDefinitionBehavior extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the behavior to be described, such as grouping, visual, or selection behaviors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinitionBehavior_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinitionBehavior#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific behavior. The code used here is determined by the type of behavior being described. For example, the grouping behavior uses the grouping-behavior-type valueset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Coding)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinitionBehavior_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinitionBehavior#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Coding value);

} // ActionDefinitionBehavior
