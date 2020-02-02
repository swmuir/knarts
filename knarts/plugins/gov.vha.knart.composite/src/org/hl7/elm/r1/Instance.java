/**
 */
package org.hl7.elm.r1;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Instance expression allows class instances of any type to be built up as an expression. The classType attribute specifies the type of the class instance being built, and the list of instance elements specify the values for the elements of the class instance. Note that the value of an element may be any expression, including another Instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Instance#getElement <em>Element</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Instance#getClassType <em>Class Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getInstance()
 * @model extendedMetaData="name='Instance' kind='elementOnly'"
 * @generated
 */
public interface Instance extends Expression {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.InstanceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getInstance_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstanceElement> getElement();

	/**
	 * Returns the value of the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type</em>' attribute.
	 * @see #setClassType(QName)
	 * @see org.hl7.elm.r1.R1Package#getInstance_ClassType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='classType'"
	 * @generated
	 */
	QName getClassType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Instance#getClassType <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type</em>' attribute.
	 * @see #getClassType()
	 * @generated
	 */
	void setClassType(QName value);

} // Instance
