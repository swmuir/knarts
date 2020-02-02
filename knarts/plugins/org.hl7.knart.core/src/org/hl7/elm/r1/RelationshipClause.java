/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RelationshipClause element allows related sources to be used to restrict the elements included from another source in a query context. Note that the elements referenced by the relationship clause can only be accessed within the suchThat condition, and that elements of the related source are not included in the query context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.RelationshipClause#getSuchThat <em>Such That</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getRelationshipClause()
 * @model abstract="true"
 *        extendedMetaData="name='RelationshipClause' kind='elementOnly'"
 * @generated
 */
public interface RelationshipClause extends AliasedQuerySource {
	/**
	 * Returns the value of the '<em><b>Such That</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Such That</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Such That</em>' containment reference.
	 * @see #setSuchThat(Expression)
	 * @see org.hl7.elm.r1.R1Package#getRelationshipClause_SuchThat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='suchThat' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getSuchThat();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.RelationshipClause#getSuchThat <em>Such That</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Such That</em>' containment reference.
	 * @see #getSuchThat()
	 * @generated
	 */
	void setSuchThat(Expression value);

} // RelationshipClause
