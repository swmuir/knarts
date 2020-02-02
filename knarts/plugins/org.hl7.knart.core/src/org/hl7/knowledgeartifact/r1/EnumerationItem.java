/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An item in a list of possible values
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getCodes <em>Codes</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getDisplayText <em>Display Text</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getValueMeaning <em>Value Meaning</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.EnumerationItem#isFillIn <em>Fill In</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem()
 * @model extendedMetaData="name='EnumerationItem' kind='elementOnly'"
 * @generated
 */
public interface EnumerationItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(VersionedIdentifier)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionedIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(VersionedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number for the item primarily for display to
	 * 						the user. This is different than the identifier which is used as a
	 * 						key to identify the item internally.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(FormattedText)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the item is specified as an
	 * 						expression. This is the value that could be displayed to the
	 * 						user
	 * 						and which forms the recorded value of the documentation
	 * 						item. This is required unless the item is of type fill-in
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of codes that are the
	 * 						equivalent of
	 * 						this value.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Codes</em>' containment reference.
	 * @see #setCodes(CodesType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem_Codes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codes' namespace='##targetNamespace'"
	 * @generated
	 */
	CodesType getCodes();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getCodes <em>Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codes</em>' containment reference.
	 * @see #getCodes()
	 * @generated
	 */
	void setCodes(CodesType value);

	/**
	 * Returns the value of the '<em><b>Display Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short text label for the list item. When
	 * 						displayText is present, this is displayed to the user
	 * 						performing
	 * 						the documentation. In such a case, the value is
	 * 						displayed
	 * 						optionally
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Text</em>' containment reference.
	 * @see #setDisplayText(FormattedText)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem_DisplayText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='displayText' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDisplayText();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getDisplayText <em>Display Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Text</em>' containment reference.
	 * @see #getDisplayText()
	 * @generated
	 */
	void setDisplayText(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Additional Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.FormattedText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional instructions to assist the user in
	 * 						selecting this item.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Instructions</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem_AdditionalInstructions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalInstructions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormattedText> getAdditionalInstructions();

	/**
	 * Returns the value of the '<em><b>Value Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation of the meaning of this list item
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Meaning</em>' containment reference.
	 * @see #setValueMeaning(FormattedText)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem_ValueMeaning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueMeaning' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getValueMeaning();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#getValueMeaning <em>Value Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Meaning</em>' containment reference.
	 * @see #getValueMeaning()
	 * @generated
	 */
	void setValueMeaning(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Fill In</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item is used for user to enter or "fill in" a value (i.e., Other)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fill In</em>' attribute.
	 * @see #isSetFillIn()
	 * @see #unsetFillIn()
	 * @see #setFillIn(boolean)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getEnumerationItem_FillIn()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='fillIn'"
	 * @generated
	 */
	boolean isFillIn();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#isFillIn <em>Fill In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill In</em>' attribute.
	 * @see #isSetFillIn()
	 * @see #unsetFillIn()
	 * @see #isFillIn()
	 * @generated
	 */
	void setFillIn(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#isFillIn <em>Fill In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillIn()
	 * @see #isFillIn()
	 * @see #setFillIn(boolean)
	 * @generated
	 */
	void unsetFillIn();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r1.EnumerationItem#isFillIn <em>Fill In</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill In</em>' attribute is set.
	 * @see #unsetFillIn()
	 * @see #isFillIn()
	 * @see #setFillIn(boolean)
	 * @generated
	 */
	boolean isSetFillIn();

} // EnumerationItem
