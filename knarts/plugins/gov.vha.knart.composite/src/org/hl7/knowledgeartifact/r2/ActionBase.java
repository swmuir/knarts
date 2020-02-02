/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Actions are the output of the CDS system and represent the tasks that
 * 				must be carried out by a human or a computer system. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionBase#getActionId <em>Action Id</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionBase#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionBase#getSupportingEvidence <em>Supporting Evidence</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionBase#getSupportingResources <em>Supporting Resources</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionBase#getActors <em>Actors</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionBase#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionBase#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionBase#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase()
 * @model abstract="true"
 *        extendedMetaData="name='ActionBase' kind='elementOnly'"
 * @generated
 */
public interface ActionBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the action. The identifier must be unique
	 * 						within the scope of the artifact. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Id</em>' containment reference.
	 * @see #setActionId(II)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase_ActionId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actionId' namespace='##targetNamespace'"
	 * @generated
	 */
	II getActionId();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getActionId <em>Action Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Id</em>' containment reference.
	 * @see #getActionId()
	 * @generated
	 */
	void setActionId(II value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number for the action primarily for display to the user.
	 * 						This is different than the actionId which is used as a key to identify the
	 * 						action or group internally.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(FormattedText)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Supporting Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The evidence grade and the sources of evidence associated with
	 * 						this artifact. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Evidence</em>' containment reference.
	 * @see #setSupportingEvidence(SupportingEvidence)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase_SupportingEvidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingEvidence' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportingEvidence getSupportingEvidence();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getSupportingEvidence <em>Supporting Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Evidence</em>' containment reference.
	 * @see #getSupportingEvidence()
	 * @generated
	 */
	void setSupportingEvidence(SupportingEvidence value);

	/**
	 * Returns the value of the '<em><b>Supporting Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Didactic or other informational resources associated with the
	 * 						action that can be provided to the CDS recipient. Information resources can
	 * 						include inline text commentary and links to web resources.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Resources</em>' containment reference.
	 * @see #setSupportingResources(SupportingResource)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase_SupportingResources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingResources' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportingResource getSupportingResources();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getSupportingResources <em>Supporting Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Resources</em>' containment reference.
	 * @see #getSupportingResources()
	 * @generated
	 */
	void setSupportingResources(SupportingResource value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference.
	 * @see #setActors(ActorsType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase_Actors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actors' namespace='##targetNamespace'"
	 * @generated
	 */
	ActorsType getActors();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getActors <em>Actors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actors</em>' containment reference.
	 * @see #getActors()
	 * @generated
	 */
	void setActors(ActorsType value);

	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behaviors associated with how the action is presented and
	 * 						executed. The semantics and the validity of behaviors for actions are
	 * 						described elsewhere. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference.
	 * @see #setBehaviors(Behaviors)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase_Behaviors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='behaviors' namespace='##targetNamespace'"
	 * @generated
	 */
	Behaviors getBehaviors();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getBehaviors <em>Behaviors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviors</em>' containment reference.
	 * @see #getBehaviors()
	 * @generated
	 */
	void setBehaviors(Behaviors value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The conditions section lists all conditions that pertain to
	 * 						the action. Conditions define the logic that determine the applicability of
	 * 						the action in the given context, any precondition or post condition, and/or
	 * 						any inclusion and exclusion criteria for the given action.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference.
	 * @see #setConditions(Conditions)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase_Conditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditions' namespace='##targetNamespace'"
	 * @generated
	 */
	Conditions getConditions();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getConditions <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' containment reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(Conditions value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If specified, determines the ordering for this element within the
	 * 					group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #setOrder(int)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionBase_Order()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(int)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.ActionBase#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(int)
	 * @generated
	 */
	boolean isSetOrder();

} // ActionBase
