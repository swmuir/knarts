/**
 */
package org.hl7.knowledgeartifact.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type of action is used to organize a group of related actions
 * 				into one container. The semantics of how the group's subelements interact with which
 * 				each other and how the subelements might be presented are specified in the group
 * 				behavior. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionGroup#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionGroup#getRepresentedConcepts <em>Represented Concepts</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionGroup#getSubElements <em>Sub Elements</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionGroup()
 * @model extendedMetaData="name='ActionGroup' kind='elementOnly'"
 * @generated
 */
public interface ActionGroup extends ActionBase {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief title that is shown to the user of the
	 * 								artifact, i.e., the recipient of the CDS 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(FormattedText)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionGroup_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionGroup#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A lengthier description of the action group that can
	 * 								be displayed to the user or the recipient of the CDS
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(FormattedText)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionGroup_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionGroup#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Represented Concepts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concept(s) represented by this action group. For
	 * 								instance, a section may represent a group of beta-blockers, a
	 * 								composite orderable such as an insulin sliding scale, or a set of
	 * 								order sentences for a particular orderable (e.g.,
	 * 								Tylenol).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represented Concepts</em>' containment reference.
	 * @see #setRepresentedConcepts(RepresentedConceptsType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionGroup_RepresentedConcepts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='representedConcepts' namespace='##targetNamespace'"
	 * @generated
	 */
	RepresentedConceptsType getRepresentedConcepts();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionGroup#getRepresentedConcepts <em>Represented Concepts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Concepts</em>' containment reference.
	 * @see #getRepresentedConcepts()
	 * @generated
	 */
	void setRepresentedConcepts(RepresentedConceptsType value);

	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constituent elements of the group can be of
	 * 								different types including subgroups, simple or atomic actions, and
	 * 								subgroups embedded by reference. While the group allows artifacts of
	 * 								different types to be mixed and matched in any combination, a
	 * 								particular type of artifact might further restrict the combinations.
	 * 								For example, an artifact type might require subelements of a
	 * 								particular group to be either groups or simple actions; elements of
	 * 								both types cannot exist in the group. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Elements</em>' containment reference.
	 * @see #setSubElements(SubElementsType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionGroup_SubElements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subElements' namespace='##targetNamespace'"
	 * @generated
	 */
	SubElementsType getSubElements();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionGroup#getSubElements <em>Sub Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Elements</em>' containment reference.
	 * @see #getSubElements()
	 * @generated
	 */
	void setSubElements(SubElementsType value);

} // ActionGroup
