/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Combine operator combines a list of strings, optionally separating each string with the given separator.
 * 
 * If either argument is null, or any element in the source list of strings is null, the result is null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Combine#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Combine#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getCombine()
 * @model extendedMetaData="name='Combine' kind='elementOnly'"
 * @generated
 */
public interface Combine extends Expression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Expression)
	 * @see org.hl7.elm.r1.R1Package#getCombine_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getSource();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Combine#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Expression value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' containment reference.
	 * @see #setSeparator(Expression)
	 * @see org.hl7.elm.r1.R1Package#getCombine_Separator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='separator' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getSeparator();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Combine#getSeparator <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' containment reference.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(Expression value);

} // Combine
