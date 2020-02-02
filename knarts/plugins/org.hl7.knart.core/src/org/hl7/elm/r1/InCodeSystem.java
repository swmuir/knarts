/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Code System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The InCodeSystem operator returns true if the given code is in the given code system.
 * 			
 * Note that this operator explicitly requires a CodeSystemRef as its codesystem argument. This allows for both static analysis of the code system references within an artifact, as well as the implementation of code system membership by the target environment as a service call to a terminology server, if desired.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.InCodeSystem#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.elm.r1.InCodeSystem#getCodesystem <em>Codesystem</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getInCodeSystem()
 * @model extendedMetaData="name='InCodeSystem' kind='elementOnly'"
 * @generated
 */
public interface InCodeSystem extends Expression {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Expression)
	 * @see org.hl7.elm.r1.R1Package#getInCodeSystem_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getCode();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.InCodeSystem#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Expression value);

	/**
	 * Returns the value of the '<em><b>Codesystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codesystem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codesystem</em>' containment reference.
	 * @see #setCodesystem(CodeSystemRef)
	 * @see org.hl7.elm.r1.R1Package#getInCodeSystem_Codesystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codesystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemRef getCodesystem();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.InCodeSystem#getCodesystem <em>Codesystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codesystem</em>' containment reference.
	 * @see #getCodesystem()
	 * @generated
	 */
	void setCodesystem(CodeSystemRef value);

} // InCodeSystem
