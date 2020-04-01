/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.Base64Binary;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Binary#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Binary#getSecurityContext <em>Security Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Binary#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends Resource {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBinary_ContentType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Binary#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Security Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Context</em>' containment reference.
	 * @see #setSecurityContext(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBinary_SecurityContext()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSecurityContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Binary#getSecurityContext <em>Security Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Context</em>' containment reference.
	 * @see #getSecurityContext()
	 * @generated
	 */
	void setSecurityContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Base64Binary)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getBinary_Data()
	 * @model containment="true"
	 * @generated
	 */
	Base64Binary getData();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Binary#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Base64Binary value);

} // Binary
