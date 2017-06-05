/**
 */
package org.eclipse.mdht.uml.fhir.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.ContactDetail#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.ContactDetail#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.ContactDetail#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getContactDetail()
 * @model
 * @generated
 */
public interface ContactDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getContactDetail_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.ContactDetail#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.types.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecom</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getContactDetail_Telecom()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ContactPoint> getTelecoms();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getContactDetail_Id()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.ContactDetail#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ContactDetail
