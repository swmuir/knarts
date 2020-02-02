/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Defines the attributes required to specify a binding path for
 * 				documentation item responses. The container attribute specifies the name of the
 * 				response container that will be used. If no container attribute is provided, the
 * 				default container name of Responses will be used. The property attribute specifies
 * 				the name of the property within the container that will be used to store the user
 * 				response value. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ResponseBinding#getContainer <em>Container</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ResponseBinding#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getResponseBinding()
 * @model extendedMetaData="name='ResponseBinding' kind='empty'"
 * @generated
 */
public interface ResponseBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * The default value is <code>"Responses"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #isSetContainer()
	 * @see #unsetContainer()
	 * @see #setContainer(String)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getResponseBinding_Container()
	 * @model default="Responses" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='container'"
	 * @generated
	 */
	String getContainer();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ResponseBinding#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #isSetContainer()
	 * @see #unsetContainer()
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r1.ResponseBinding#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainer()
	 * @see #getContainer()
	 * @see #setContainer(String)
	 * @generated
	 */
	void unsetContainer();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r1.ResponseBinding#getContainer <em>Container</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Container</em>' attribute is set.
	 * @see #unsetContainer()
	 * @see #getContainer()
	 * @see #setContainer(String)
	 * @generated
	 */
	boolean isSetContainer();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getResponseBinding_Property()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='property'"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ResponseBinding#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

} // ResponseBinding
