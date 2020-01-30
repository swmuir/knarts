/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.QuestionnaireResponseItem#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireResponseItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireResponseItem#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireResponseItem#getAnswers <em>Answer</em>}</li>
 *   <li>{@link fhiRCore.resources.QuestionnaireResponseItem#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='QuestionnaireResponse_Item'"
 * @generated
 */
public interface QuestionnaireResponseItem extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItem_LinkId()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLinkId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireResponseItem#getLinkId <em>Link Id</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItem_Definition()
	 * @model containment="true"
	 * @generated
	 */
	Uri getDefinition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireResponseItem#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Uri value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItem_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.QuestionnaireResponseItem#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.QuestionnaireResponseItemAnswer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItem_Answer()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireResponseItemAnswer> getAnswers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getQuestionnaireResponseItem_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionnaireResponseItem> getItems();

} // QuestionnaireResponseItem
