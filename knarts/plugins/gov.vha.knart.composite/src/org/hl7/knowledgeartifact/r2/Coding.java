/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Coding#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Coding#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Coding#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Coding#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Coding#getUserSeclected <em>User Seclected</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoding()
 * @model extendedMetaData="name='Coding' kind='elementOnly'"
 * @generated
 */
public interface Coding extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoding_System()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSystem();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Coding#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(EObject value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoding_Version()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Coding#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(EObject value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoding_Display()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Coding#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(EObject value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoding_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getCode();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Coding#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(EObject value);

	/**
	 * Returns the value of the '<em><b>User Seclected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Seclected</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Seclected</em>' containment reference.
	 * @see #setUserSeclected(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoding_UserSeclected()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='userSeclected' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUserSeclected();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Coding#getUserSeclected <em>User Seclected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Seclected</em>' containment reference.
	 * @see #getUserSeclected()
	 * @generated
	 */
	void setUserSeclected(EObject value);

} // Coding
