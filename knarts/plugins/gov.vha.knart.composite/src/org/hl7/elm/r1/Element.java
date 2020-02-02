/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Element type defines the abstract base type for all library elements in ELM.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Element#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Element#getLocalId <em>Local Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getElement()
 * @model abstract="true"
 *        extendedMetaData="name='Element' kind='elementOnly'"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The annotation element provides a mechanism for decorating expressions with application-specific information such as translation hints, visual designer information, or debug symbols.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getElement_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Id</em>' attribute.
	 * @see #setLocalId(String)
	 * @see org.hl7.elm.r1.R1Package#getElement_LocalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='localId'"
	 * @generated
	 */
	String getLocalId();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Element#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(String value);

} // Element
