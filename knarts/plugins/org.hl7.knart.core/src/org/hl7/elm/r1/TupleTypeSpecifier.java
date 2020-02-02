/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TupleTypeSpecifier defines the possible elements of a tuple.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.TupleTypeSpecifier#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getTupleTypeSpecifier()
 * @model extendedMetaData="name='TupleTypeSpecifier' kind='elementOnly'"
 * @generated
 */
public interface TupleTypeSpecifier extends TypeSpecifier {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.TupleElementDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getTupleTypeSpecifier_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TupleElementDefinition> getElement();

} // TupleTypeSpecifier
