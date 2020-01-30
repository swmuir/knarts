/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Parameter Referenced From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameterReferencedFrom#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinitionParameterReferencedFrom#getSourceId <em>Source Id</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameterReferencedFrom()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Parameter_ReferencedFrom'"
 * @generated
 */
public interface OperationDefinitionParameterReferencedFrom extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameterReferencedFrom_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameterReferencedFrom#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' containment reference.
	 * @see #setSourceId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinitionParameterReferencedFrom_SourceId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSourceId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinitionParameterReferencedFrom#getSourceId <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' containment reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(fhiRCore.dataTypes.String value);

} // OperationDefinitionParameterReferencedFrom
