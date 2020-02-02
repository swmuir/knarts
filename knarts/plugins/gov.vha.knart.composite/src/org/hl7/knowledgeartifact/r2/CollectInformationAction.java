/**
 */
package org.hl7.knowledgeartifact.r2;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collect Information Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action requests information from the actor. The information
 * 				request is specified as a DocumentationItem. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getDocumentationConcept <em>Documentation Concept</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getResponseBinding <em>Response Binding</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getCollectInformationAction()
 * @model extendedMetaData="name='CollectInformationAction' kind='elementOnly'"
 * @generated
 */
public interface CollectInformationAction extends AtomicAction {
	/**
	 * Returns the value of the '<em><b>Documentation Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This provides a specification of the information to be
	 * 								collected from the user. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation Concept</em>' containment reference.
	 * @see #setDocumentationConcept(DocumentationItem)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCollectInformationAction_DocumentationConcept()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='documentationConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentationItem getDocumentationConcept();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getDocumentationConcept <em>Documentation Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation Concept</em>' containment reference.
	 * @see #getDocumentationConcept()
	 * @generated
	 */
	void setDocumentationConcept(DocumentationItem value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression to compute an initial value for the
	 * 								documentation concept. The initial value could be computed from
	 * 								previous data about the patient available via expressions specified
	 * 								in the external data 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Expression)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCollectInformationAction_InitialValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Response Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the response binding for the documentation
	 * 								item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Binding</em>' containment reference.
	 * @see #setResponseBinding(ResponseBinding)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCollectInformationAction_ResponseBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseBinding getResponseBinding();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.CollectInformationAction#getResponseBinding <em>Response Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Binding</em>' containment reference.
	 * @see #getResponseBinding()
	 * @generated
	 */
	void setResponseBinding(ResponseBinding value);

} // CollectInformationAction
