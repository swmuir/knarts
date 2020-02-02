/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The InValueSet operator returns true if the given code is in the given value set.
 * 			
 * Note that this operator explicitly requires a ValueSetRef as its valueset argument. This allows for both static analysis of the value set references within an artifact, as well as the implementation of valueset membership by the target environment as a service call to a terminology server, if desired.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.InValueSet#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.elm.r1.InValueSet#getValueset <em>Valueset</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getInValueSet()
 * @model extendedMetaData="name='InValueSet' kind='elementOnly'"
 * @generated
 */
public interface InValueSet extends Expression {
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
	 * @see org.hl7.elm.r1.R1Package#getInValueSet_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getCode();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.InValueSet#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Expression value);

	/**
	 * Returns the value of the '<em><b>Valueset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valueset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valueset</em>' containment reference.
	 * @see #setValueset(ValueSetRef)
	 * @see org.hl7.elm.r1.R1Package#getInValueSet_Valueset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='valueset' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetRef getValueset();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.InValueSet#getValueset <em>Valueset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valueset</em>' containment reference.
	 * @see #getValueset()
	 * @generated
	 */
	void setValueset(ValueSetRef value);

} // InValueSet
