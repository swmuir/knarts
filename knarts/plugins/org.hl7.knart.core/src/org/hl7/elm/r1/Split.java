/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Split operator splits a string into a list of strings using a separator.
 * 
 * If the stringToSplit argument is null, the result is null.
 * 
 * If the stringToSplit argument does not contain any appearances of the separator, the result is a list of strings containing one element that is the value of the stringToSplit argument.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Split#getStringToSplit <em>String To Split</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Split#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getSplit()
 * @model extendedMetaData="name='Split' kind='elementOnly'"
 * @generated
 */
public interface Split extends Expression {
	/**
	 * Returns the value of the '<em><b>String To Split</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String To Split</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String To Split</em>' containment reference.
	 * @see #setStringToSplit(Expression)
	 * @see org.hl7.elm.r1.R1Package#getSplit_StringToSplit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stringToSplit' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getStringToSplit();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Split#getStringToSplit <em>String To Split</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String To Split</em>' containment reference.
	 * @see #getStringToSplit()
	 * @generated
	 */
	void setStringToSplit(Expression value);

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
	 * @see org.hl7.elm.r1.R1Package#getSplit_Separator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='separator' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getSeparator();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Split#getSeparator <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' containment reference.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(Expression value);

} // Split
