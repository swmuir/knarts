/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Overload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.OperationDefinitionOverload#getParameterNames <em>Parameter Name</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionOverload#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionOverload()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OperationDefinition_Overload'"
 * @generated
 */
public interface OperationDefinitionOverload extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionOverload_ParameterName()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getParameterNames();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionOverload_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionOverload#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

} // OperationDefinitionOverload
