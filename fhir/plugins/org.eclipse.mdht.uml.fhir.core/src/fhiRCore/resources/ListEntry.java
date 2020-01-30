/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ListEntry#getFlag <em>Flag</em>}</li>
 *   <li>{@link fhiRCore.resources.ListEntry#getDeleted <em>Deleted</em>}</li>
 *   <li>{@link fhiRCore.resources.ListEntry#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ListEntry#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getListEntry()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='List_Entry'"
 * @generated
 */
public interface ListEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getListEntry_Flag()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFlag();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ListEntry#getFlag <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' containment reference.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' containment reference.
	 * @see #setDeleted(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getListEntry_Deleted()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getDeleted();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ListEntry#getDeleted <em>Deleted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' containment reference.
	 * @see #getDeleted()
	 * @generated
	 */
	void setDeleted(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getListEntry_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ListEntry#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getListEntry_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getItem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ListEntry#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Reference value);

} // ListEntry
