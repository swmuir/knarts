/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Item Enable When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.QuestionnaireItemEnableWhen#getQuestion <em>Question</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItemEnableWhen#getOperator <em>Operator</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItemEnableWhen#getAnswerx <em>Answerx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItemEnableWhen()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Item_EnableWhen'"
 * @generated
 */
public interface QuestionnaireItemEnableWhen extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_Question()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getQuestion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItemEnableWhen#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getOperator();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItemEnableWhen#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Code value);

	/**
	 * Returns the value of the '<em><b>Answerx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answerx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answerx</em>' containment reference.
	 * @see #setAnswerx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_Answerx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='answer[x]'"
	 * @generated
	 */
	DataType getAnswerx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItemEnableWhen#getAnswerx <em>Answerx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerx</em>' containment reference.
	 * @see #getAnswerx()
	 * @generated
	 */
	void setAnswerx(DataType value);

} // QuestionnaireItemEnableWhen
