/**
 */
package org.hl7.knowledgeartifact.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare Response Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  The DeclareResponseAction provides a mechanism to declare a container
 * 				for responses provided by the user in response to CollectInformationActions. The
 * 				intended semantics are to provide a container that can be used to access responses
 * 				within expressions used subsequently in an artifact. The DeclareResponseAction
 * 				creates a named container within the Parameters scope of the artifact, and
 * 				expressions may access the contents of a response using a ParameterRef expression.
 * 				The container is expected to be a collection of name-value pairs, and the intended
 * 				semantics are to allow the Property expression to be used, in connection with a
 * 				ParameterRef expression as the source, to retrieve the current value for a property.
 * 				The CollectInformationAction contains a responseBinding attribute that specifies the
 * 				name of the container, and the name of the property to be used to store the response
 * 				value. If no Name attribute is provided, the response container will be named
 * 				Responses. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.DeclareResponseAction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getDeclareResponseAction()
 * @model extendedMetaData="name='DeclareResponseAction' kind='elementOnly'"
 * @generated
 */
public interface DeclareResponseAction extends AtomicAction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Responses"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getDeclareResponseAction_Name()
	 * @model default="Responses" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.DeclareResponseAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.DeclareResponseAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.DeclareResponseAction#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // DeclareResponseAction
