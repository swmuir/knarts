/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response Item Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.QuestionnaireResponseItemAnswer#getValuex <em>Valuex</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireResponseItemAnswer#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItemAnswer()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Item_Answer'"
 * @generated
 */
public interface QuestionnaireResponseItemAnswer extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItemAnswer_Valuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='value[x]'"
	 * @generated
	 */
	DataType getValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireResponseItemAnswer#getValuex <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuex</em>' containment reference.
	 * @see #getValuex()
	 * @generated
	 */
	void setValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.QuestionnaireResponseItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItemAnswer_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireResponseItem> getItems();

} // QuestionnaireResponseItemAnswer
