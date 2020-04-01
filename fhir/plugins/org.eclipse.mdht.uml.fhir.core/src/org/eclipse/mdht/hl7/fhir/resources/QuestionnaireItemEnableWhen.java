/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Item Enable When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.QuestionnaireItemEnableWhen#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.QuestionnaireItemEnableWhen#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.QuestionnaireItemEnableWhen#getAnswerx <em>Answerx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getQuestionnaireItemEnableWhen()
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
	 * @see #setQuestion(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_Question()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getQuestion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.QuestionnaireItemEnableWhen#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.QuestionnaireItemEnableWhen#getOperator <em>Operator</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getQuestionnaireItemEnableWhen_Answerx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='answer[x]'"
	 * @generated
	 */
	DataType getAnswerx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.QuestionnaireItemEnableWhen#getAnswerx <em>Answerx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answerx</em>' containment reference.
	 * @see #getAnswerx()
	 * @generated
	 */
	void setAnswerx(DataType value);

} // QuestionnaireItemEnableWhen
