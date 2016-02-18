/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource allows for the definition of an order set as a sharable, consumable, and executable artifact in support of clinical decision support.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OrderSet#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.OrderSet#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.hl7.fhir.OrderSet#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getOrderSet()
 * @model extendedMetaData="name='OrderSet' kind='elementOnly'"
 * @generated
 */
public interface OrderSet extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Module Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a ModuleMetadata resource containing metadata for the orderset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Metadata</em>' containment reference.
	 * @see #setModuleMetadata(ModuleMetadata)
	 * @see org.hl7.fhir.FhirPackage#getOrderSet_ModuleMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleMetadata getModuleMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OrderSet#getModuleMetadata <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Metadata</em>' containment reference.
	 * @see #getModuleMetadata()
	 * @generated
	 */
	void setModuleMetadata(ModuleMetadata value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a Library resource containing any formal logic used by the orderset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOrderSet_Library()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='library' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getLibrary();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.OrderSetItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of the items that make up the orderset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getOrderSet_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrderSetItem> getItem();

} // OrderSet
