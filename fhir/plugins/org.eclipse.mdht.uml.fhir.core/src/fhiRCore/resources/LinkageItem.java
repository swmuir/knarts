/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkage Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.LinkageItem#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.LinkageItem#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getLinkageItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Linkage_Item'"
 * @generated
 */
public interface LinkageItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getLinkageItem_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.LinkageItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getLinkageItem_Resource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getResource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.LinkageItem#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Reference value);

} // LinkageItem
