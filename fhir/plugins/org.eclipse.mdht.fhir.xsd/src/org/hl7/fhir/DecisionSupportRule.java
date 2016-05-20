/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource defines a decision support rule of the form [on Event] if Condition then Action. It is intended to be a shareable, computable definition of a actions that should be taken whenever some condition is met in response to a particular event or events.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DecisionSupportRule#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRule#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRule#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportRule#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRule()
 * @model extendedMetaData="name='DecisionSupportRule' kind='elementOnly'"
 * @generated
 */
public interface DecisionSupportRule extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Module Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metadata for the decision support rule, including publishing, life-cycle, version, documentation, and supporting evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Metadata</em>' containment reference.
	 * @see #setModuleMetadata(ModuleMetadata)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRule_ModuleMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleMetadata getModuleMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportRule#getModuleMetadata <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Metadata</em>' containment reference.
	 * @see #getModuleMetadata()
	 * @generated
	 */
	void setModuleMetadata(ModuleMetadata value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Library containing the formal logic used by the rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRule_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getLibrary();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TriggerDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trigger element defines when the rule should be invoked. This information is used by consumers of the rule to determine how to integrate the rule into a specific workflow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRule_Trigger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TriggerDefinition> getTrigger();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition element describes he "if" portion of the rule that determines whether or not the rule "fires". The condition must be the name of an expression in a referenced library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRule_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportRule#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ActionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action element defines the "when" portion of the rule that determines what actions should be performed if the condition evaluates to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportRule_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionDefinition> getAction();

} // DecisionSupportRule
