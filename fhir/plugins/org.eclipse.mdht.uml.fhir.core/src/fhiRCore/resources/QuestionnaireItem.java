/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getEnableWhens <em>Enable When</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getEnableBehavior <em>Enable Behavior</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getRequired <em>Required</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getAnswerValueSet <em>Answer Value Set</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getAnswerOptions <em>Answer Option</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getInitials <em>Initial</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItem#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Questionnaire_Item'"
 * @generated
 */
public interface QuestionnaireItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_LinkId()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLinkId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Definition()
	 * @model containment="true"
	 * @generated
	 */
	Uri getDefinition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Uri value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Code()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getCodes();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Prefix()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPrefix();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Enable When</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.QuestionnaireItemEnableWhen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable When</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable When</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_EnableWhen()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireItemEnableWhen> getEnableWhens();

	/**
	 * Returns the value of the '<em><b>Enable Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Behavior</em>' containment reference.
	 * @see #setEnableBehavior(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_EnableBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Code getEnableBehavior();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getEnableBehavior <em>Enable Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Behavior</em>' containment reference.
	 * @see #getEnableBehavior()
	 * @generated
	 */
	void setEnableBehavior(Code value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Required()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getRequired();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Repeats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeats</em>' containment reference.
	 * @see #setRepeats(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Repeats()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getRepeats();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getRepeats <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeats</em>' containment reference.
	 * @see #getRepeats()
	 * @generated
	 */
	void setRepeats(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' containment reference.
	 * @see #setReadOnly(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_ReadOnly()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getReadOnly();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getReadOnly <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' containment reference.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_MaxLength()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getMaxLength();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Answer Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Value Set</em>' containment reference.
	 * @see #setAnswerValueSet(ValueSet)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_AnswerValueSet()
	 * @model containment="true"
	 * @generated
	 */
	ValueSet getAnswerValueSet();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItem#getAnswerValueSet <em>Answer Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Value Set</em>' containment reference.
	 * @see #getAnswerValueSet()
	 * @generated
	 */
	void setAnswerValueSet(ValueSet value);

	/**
	 * Returns the value of the '<em><b>Answer Option</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.QuestionnaireItemAnswerOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Option</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_AnswerOption()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireItemAnswerOption> getAnswerOptions();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.QuestionnaireItemInitial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Initial()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireItemInitial> getInitials();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.QuestionnaireItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItem_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireItem> getItems();

} // QuestionnaireItem
