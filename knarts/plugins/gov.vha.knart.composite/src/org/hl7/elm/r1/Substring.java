/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Substring operator returns the string within stringToSub, starting at the 1-based index startIndex, and consisting of length characters.
 * 			
 * If length is ommitted, the substring returned starts at startIndex and continues to the end of stringToSub.
 * 
 * If stringToSub or startIndex is null, or startIndex is out of range, the result is null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Substring#getStringToSub <em>String To Sub</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Substring#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Substring#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getSubstring()
 * @model extendedMetaData="name='Substring' kind='elementOnly'"
 * @generated
 */
public interface Substring extends Expression {
	/**
	 * Returns the value of the '<em><b>String To Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String To Sub</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String To Sub</em>' containment reference.
	 * @see #setStringToSub(EObject)
	 * @see org.hl7.elm.r1.R1Package#getSubstring_StringToSub()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stringToSub' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStringToSub();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Substring#getStringToSub <em>String To Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String To Sub</em>' containment reference.
	 * @see #getStringToSub()
	 * @generated
	 */
	void setStringToSub(EObject value);

	/**
	 * Returns the value of the '<em><b>Start Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Index</em>' containment reference.
	 * @see #setStartIndex(EObject)
	 * @see org.hl7.elm.r1.R1Package#getSubstring_StartIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStartIndex();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Substring#getStartIndex <em>Start Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Index</em>' containment reference.
	 * @see #getStartIndex()
	 * @generated
	 */
	void setStartIndex(EObject value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(EObject)
	 * @see org.hl7.elm.r1.R1Package#getSubstring_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLength();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Substring#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(EObject value);

} // Substring
