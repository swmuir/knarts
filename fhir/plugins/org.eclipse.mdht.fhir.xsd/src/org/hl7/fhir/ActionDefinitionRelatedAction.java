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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Definition Related Action</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ActionDefinitionRelatedAction#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinitionRelatedAction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinitionRelatedAction#getOffsetQuantity <em>Offset Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinitionRelatedAction#getOffsetRange <em>Offset Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ActionDefinitionRelatedAction#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getActionDefinitionRelatedAction()
 * @model extendedMetaData="name='ActionDefinition.RelatedAction' kind='elementOnly'"
 * @generated
 */
public interface ActionDefinitionRelatedAction extends Element {
	/**
	 * Returns the value of the '<em><b>Action Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Identifier</em>' containment reference.
	 * @see #setActionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinitionRelatedAction_ActionIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getActionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinitionRelatedAction#getActionIdentifier <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Identifier</em>' containment reference.
	 * @see #getActionIdentifier()
	 * @generated
	 */
	void setActionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of this action to the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(ActionRelationshipType)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinitionRelatedAction_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinitionRelatedAction#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(ActionRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Offset Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Quantity</em>' containment reference.
	 * @see #setOffsetQuantity(Duration)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinitionRelatedAction_OffsetQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOffsetQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinitionRelatedAction#getOffsetQuantity <em>Offset Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Quantity</em>' containment reference.
	 * @see #getOffsetQuantity()
	 * @generated
	 */
	void setOffsetQuantity(Duration value);

	/**
	 * Returns the value of the '<em><b>Offset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Range</em>' containment reference.
	 * @see #setOffsetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinitionRelatedAction_OffsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOffsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinitionRelatedAction#getOffsetRange <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Range</em>' containment reference.
	 * @see #getOffsetRange()
	 * @generated
	 */
	void setOffsetRange(Range value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional indicator for how the relationship is anchored to the related action. For example "before the start" or "before the end" of the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anchor</em>' containment reference.
	 * @see #setAnchor(ActionRelationshipAnchor)
	 * @see org.hl7.fhir.FhirPackage#getActionDefinitionRelatedAction_Anchor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anchor' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionRelationshipAnchor getAnchor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActionDefinitionRelatedAction#getAnchor <em>Anchor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' containment reference.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(ActionRelationshipAnchor value);

} // ActionDefinitionRelatedAction
