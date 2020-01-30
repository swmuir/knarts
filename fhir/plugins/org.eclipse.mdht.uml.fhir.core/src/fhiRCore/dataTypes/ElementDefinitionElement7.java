/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Element7</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement7#getIdentity <em>Identity</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement7#getLanguage <em>Language</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement7#getMap <em>Map</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement7#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement7()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ElementDefinition_Element7'"
 * @generated
 */
public interface ElementDefinitionElement7 extends Element {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' containment reference.
	 * @see #setIdentity(Id)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement7_Identity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getIdentity();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement7#getIdentity <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' containment reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(Id value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Code)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement7_Language()
	 * @model containment="true"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement7#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement7_Map()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMap();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement7#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement7_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement7#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

} // ElementDefinitionElement7
