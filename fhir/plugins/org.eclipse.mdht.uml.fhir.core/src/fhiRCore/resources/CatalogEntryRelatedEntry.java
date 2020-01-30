/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Related Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CatalogEntryRelatedEntry#getRelationtype <em>Relationtype</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntryRelatedEntry#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntryRelatedEntry()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CatalogEntry_RelatedEntry'"
 * @generated
 */
public interface CatalogEntryRelatedEntry extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Relationtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationtype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationtype</em>' containment reference.
	 * @see #setRelationtype(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntryRelatedEntry_Relationtype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getRelationtype();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntryRelatedEntry#getRelationtype <em>Relationtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationtype</em>' containment reference.
	 * @see #getRelationtype()
	 * @generated
	 */
	void setRelationtype(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntryRelatedEntry_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getItem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntryRelatedEntry#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Reference value);

} // CatalogEntryRelatedEntry
