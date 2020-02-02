/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SortClause element defines the sort order for the query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.SortClause#getBy <em>By</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getSortClause()
 * @model extendedMetaData="name='SortClause' kind='elementOnly'"
 * @generated
 */
public interface SortClause extends Element {
	/**
	 * Returns the value of the '<em><b>By</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.SortByItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getSortClause_By()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='by' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SortByItem> getBy();

} // SortClause
