/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Related Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CatalogEntryRelatedEntry#getRelationtype <em>Relationtype</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CatalogEntryRelatedEntry#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCatalogEntryRelatedEntry()
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCatalogEntryRelatedEntry_Relationtype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getRelationtype();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CatalogEntryRelatedEntry#getRelationtype <em>Relationtype</em>}' containment reference.
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCatalogEntryRelatedEntry_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getItem();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CatalogEntryRelatedEntry#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Reference value);

} // CatalogEntryRelatedEntry
