/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An item type representing the definition of an
 * 				individual item to be recorded in a structured clinical document.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getTextAfterResponse <em>Text After Response</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getItemCodes <em>Item Codes</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseDataType <em>Response Data Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseCardinality <em>Response Cardinality</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseRange <em>Response Range</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem()
 * @model extendedMetaData="name='DocumentationItem' kind='elementOnly'"
 * @generated
 */
public interface DocumentationItem extends ItemDefinition {
	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brief text, title, or question for this
	 * 								documentation item
	 * 								that is the caption displayed to the user
	 * 								performing the
	 * 								documentation.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prompt</em>' containment reference.
	 * @see #setPrompt(FormattedText)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem_Prompt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='prompt' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getPrompt();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getPrompt <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' containment reference.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Additional Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.FormattedText}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Instructions</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem_AdditionalInstructions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalInstructions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormattedText> getAdditionalInstructions();

	/**
	 * Returns the value of the '<em><b>Text After Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brief text that is displayed following the
	 * 								response fields. This is to support finer control of rendering
	 * 								of the documentation template for regulatory forms such as in
	 * 								clinical trials
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text After Response</em>' containment reference.
	 * @see #setTextAfterResponse(FormattedText)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem_TextAfterResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textAfterResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getTextAfterResponse();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getTextAfterResponse <em>Text After Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text After Response</em>' containment reference.
	 * @see #getTextAfterResponse()
	 * @generated
	 */
	void setTextAfterResponse(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A lengthier description of this documentation
	 * 								item that is displayed to the user.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(FormattedText)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Item Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of codes for concepts that are the
	 * 								equivalents of this documentation item.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Codes</em>' containment reference.
	 * @see #setItemCodes(ItemCodesType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem_ItemCodes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemCodesType getItemCodes();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getItemCodes <em>Item Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Codes</em>' containment reference.
	 * @see #getItemCodes()
	 * @generated
	 */
	void setItemCodes(ItemCodesType value);

	/**
	 * Returns the value of the '<em><b>Response Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data type of the value or the response that
	 * 								is entered by the user.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Data Type</em>' containment reference.
	 * @see #setResponseDataType(ResponseDataTypeType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem_ResponseDataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='responseDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseDataTypeType getResponseDataType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseDataType <em>Response Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Data Type</em>' containment reference.
	 * @see #getResponseDataType()
	 * @generated
	 */
	void setResponseDataType(ResponseDataTypeType value);

	/**
	 * Returns the value of the '<em><b>Response Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of allowed responses, single or
	 * 								multiple.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Cardinality</em>' containment reference.
	 * @see #setResponseCardinality(ResponseCardinalityType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem_ResponseCardinality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseCardinality' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseCardinalityType getResponseCardinality();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.DocumentationItem#getResponseCardinality <em>Response Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Cardinality</em>' containment reference.
	 * @see #getResponseCardinality()
	 * @generated
	 */
	void setResponseCardinality(ResponseCardinalityType value);

	/**
	 * Returns the value of the '<em><b>Response Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.RangeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraints (within the responseDataType)
	 * 								on the values that may be entered by the user
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Range</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDocumentationItem_ResponseRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responseRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RangeConstraint> getResponseRange();

} // DocumentationItem
