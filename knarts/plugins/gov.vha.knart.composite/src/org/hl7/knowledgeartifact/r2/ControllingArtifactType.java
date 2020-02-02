/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlling Artifact Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ControllingArtifactType#getBindingName <em>Binding Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getControllingArtifactType()
 * @model extendedMetaData="name='controllingArtifact_._type' kind='empty'"
 * @generated
 */
public interface ControllingArtifactType extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Name</em>' attribute.
	 * @see #setBindingName(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getControllingArtifactType_BindingName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='bindingName'"
	 * @generated
	 */
	String getBindingName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ControllingArtifactType#getBindingName <em>Binding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Name</em>' attribute.
	 * @see #getBindingName()
	 * @generated
	 */
	void setBindingName(String value);

} // ControllingArtifactType
