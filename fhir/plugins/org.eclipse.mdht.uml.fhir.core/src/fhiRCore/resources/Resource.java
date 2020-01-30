/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Base;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Meta;
import fhiRCore.dataTypes.Uri;

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
 *   <li>{@link fhiRCore.resources.Resource#getId <em>Id</em>}</li>
 *   <li>{@link fhiRCore.resources.Resource#getMeta <em>Meta</em>}</li>
 *   <li>{@link fhiRCore.resources.Resource#getImplicitRules <em>Implicit Rules</em>}</li>
 *   <li>{@link fhiRCore.resources.Resource#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getResource()
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
	 * @see fhiRCore.resources.ResourcesPackage#getResource_Id()
	 * @model containment="true"
	 * @generated
	 */
	Id getId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Resource#getId <em>Id</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResource_Meta()
	 * @model containment="true"
	 * @generated
	 */
	Meta getMeta();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Resource#getMeta <em>Meta</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResource_ImplicitRules()
	 * @model containment="true"
	 * @generated
	 */
	Uri getImplicitRules();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Resource#getImplicitRules <em>Implicit Rules</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getResource_Language()
	 * @model containment="true"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Resource#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

} // Resource
