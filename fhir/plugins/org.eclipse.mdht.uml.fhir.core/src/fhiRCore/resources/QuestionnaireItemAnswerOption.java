/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Item Answer Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.QuestionnaireItemAnswerOption#getValuex <em>Valuex</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireItemAnswerOption#getInitialSelected <em>Initial Selected</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItemAnswerOption()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Item_AnswerOption'"
 * @generated
 */
public interface QuestionnaireItemAnswerOption extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuex</em>' containment reference.
	 * @see #setValuex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItemAnswerOption_Valuex()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='value[x]'"
	 * @generated
	 */
	DataType getValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItemAnswerOption#getValuex <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuex</em>' containment reference.
	 * @see #getValuex()
	 * @generated
	 */
	void setValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Initial Selected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Selected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Selected</em>' containment reference.
	 * @see #setInitialSelected(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireItemAnswerOption_InitialSelected()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getInitialSelected();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireItemAnswerOption#getInitialSelected <em>Initial Selected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Selected</em>' containment reference.
	 * @see #getInitialSelected()
	 * @generated
	 */
	void setInitialSelected(fhiRCore.dataTypes.Boolean value);

} // QuestionnaireItemAnswerOption
