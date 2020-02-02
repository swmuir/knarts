/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Query operator represents a clause-based query. The result of the query is determined by the type of sources included, as well as the clauses used in the query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Query#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Query#getDefine <em>Define</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Query#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Query#getWhere <em>Where</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Query#getReturn <em>Return</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Query#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getQuery()
 * @model extendedMetaData="name='Query' kind='elementOnly'"
 * @generated
 */
public interface Query extends Expression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.AliasedQuerySource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getQuery_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AliasedQuerySource> getSource();

	/**
	 * Returns the value of the '<em><b>Define</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.DefineClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getQuery_Define()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='define' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DefineClause> getDefine();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.RelationshipClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getQuery_Relationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelationshipClause> getRelationship();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see org.hl7.elm.r1.R1Package#getQuery_Where()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='where' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Query#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(ReturnClause)
	 * @see org.hl7.elm.r1.R1Package#getQuery_Return()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='return' namespace='##targetNamespace'"
	 * @generated
	 */
	ReturnClause getReturn();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Query#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnClause value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference.
	 * @see #setSort(SortClause)
	 * @see org.hl7.elm.r1.R1Package#getQuery_Sort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace'"
	 * @generated
	 */
	SortClause getSort();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Query#getSort <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(SortClause value);

} // Query
