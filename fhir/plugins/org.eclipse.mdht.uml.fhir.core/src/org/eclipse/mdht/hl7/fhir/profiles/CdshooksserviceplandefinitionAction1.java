/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.resources.PlanDefinitionAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cdshooksserviceplandefinition Action1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.CdshooksserviceplandefinitionAction1#getDefinitionx <em>Definitionx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getCdshooksserviceplandefinitionAction1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='cdshooksserviceplandefinition_Action1'"
 * @generated
 */
public interface CdshooksserviceplandefinitionAction1 extends PlanDefinitionAction {
	/**
	 * Returns the value of the '<em><b>Definitionx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitionx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitionx</em>' containment reference.
	 * @see #setDefinitionx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getCdshooksserviceplandefinitionAction1_Definitionx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='definition[x]'"
	 * @generated
	 */
	DataType getDefinitionx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.CdshooksserviceplandefinitionAction1#getDefinitionx <em>Definitionx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitionx</em>' containment reference.
	 * @see #getDefinitionx()
	 * @generated
	 */
	void setDefinitionx(DataType value);

} // CdshooksserviceplandefinitionAction1
