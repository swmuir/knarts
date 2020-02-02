/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Concept type represents a literal concept selector.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Concept#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Concept#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getConcept()
 * @model extendedMetaData="name='Concept' kind='elementOnly'"
 * @generated
 */
public interface Concept extends Expression {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getConcept_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getCode();

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see #setDisplay(String)
	 * @see org.hl7.elm.r1.R1Package#getConcept_Display()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='display'"
	 * @generated
	 */
	String getDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Concept#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(String value);

} // Concept
