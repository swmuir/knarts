/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry</b></em>'.
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
 *   <li>{@link fhiRCore.resources.CatalogEntry#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getOrderable <em>Orderable</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getReferencedItem <em>Referenced Item</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getAdditionalIdentifiers <em>Additional Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getClassifications <em>Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getAdditionalCharacteristics <em>Additional Characteristic</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getAdditionalClassifications <em>Additional Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.CatalogEntry#getRelatedEntries <em>Related Entry</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry()
 * @model
 * @generated
 */
public interface CatalogEntry extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntry#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Orderable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderable</em>' containment reference.
	 * @see #setOrderable(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_Orderable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getOrderable();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntry#getOrderable <em>Orderable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderable</em>' containment reference.
	 * @see #getOrderable()
	 * @generated
	 */
	void setOrderable(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Item</em>' containment reference.
	 * @see #setReferencedItem(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_ReferencedItem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getReferencedItem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntry#getReferencedItem <em>Referenced Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Item</em>' containment reference.
	 * @see #getReferencedItem()
	 * @generated
	 */
	void setReferencedItem(Reference value);

	/**
	 * Returns the value of the '<em><b>Additional Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_AdditionalIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getAdditionalIdentifiers();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_Classification()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getClassifications();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntry#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_ValidityPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntry#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Valid To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid To</em>' containment reference.
	 * @see #setValidTo(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_ValidTo()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getValidTo();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntry#getValidTo <em>Valid To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' containment reference.
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(DateTime value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Updated</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated</em>' containment reference.
	 * @see #setLastUpdated(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_LastUpdated()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getLastUpdated();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CatalogEntry#getLastUpdated <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' containment reference.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Additional Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Characteristic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Characteristic</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_AdditionalCharacteristic()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getAdditionalCharacteristics();

	/**
	 * Returns the value of the '<em><b>Additional Classification</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Classification</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_AdditionalClassification()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getAdditionalClassifications();

	/**
	 * Returns the value of the '<em><b>Related Entry</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CatalogEntryRelatedEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Entry</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCatalogEntry_RelatedEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatalogEntryRelatedEntry> getRelatedEntries();

} // CatalogEntry
