/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.Base;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;
import org.eclipse.mdht.hl7.fhir.dataTypes.Meta;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Resource#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Resource#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Resource#getImplicitRules <em>Implicit Rules</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.Resource#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends Base {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(Id)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResource_Id()
	 * @model containment="true"
	 * @generated
	 */
	Id getId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Resource#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Id value);

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference.
	 * @see #setMeta(Meta)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResource_Meta()
	 * @model containment="true"
	 * @generated
	 */
	Meta getMeta();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Resource#getMeta <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' containment reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Rules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Rules</em>' containment reference.
	 * @see #setImplicitRules(Uri)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResource_ImplicitRules()
	 * @model containment="true"
	 * @generated
	 */
	Uri getImplicitRules();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Resource#getImplicitRules <em>Implicit Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Rules</em>' containment reference.
	 * @see #getImplicitRules()
	 * @generated
	 */
	void setImplicitRules(Uri value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getResource_Language()
	 * @model containment="true"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.Resource#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

} // Resource
