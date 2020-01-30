/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Delivery</b></em>'.
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
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getSuppliedItem <em>Supplied Item</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getDestination <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyDelivery#getReceivers <em>Receiver</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery()
 * @model
 * @generated
 */
public interface SupplyDelivery extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_BasedOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getBasedOns();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_PartOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPartOfs();

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
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDelivery#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_Patient()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDelivery#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDelivery#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Supplied Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplied Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplied Item</em>' containment reference.
	 * @see #setSuppliedItem(SupplyDeliverySuppliedItem)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_SuppliedItem()
	 * @model containment="true"
	 * @generated
	 */
	SupplyDeliverySuppliedItem getSuppliedItem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDelivery#getSuppliedItem <em>Supplied Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplied Item</em>' containment reference.
	 * @see #getSuppliedItem()
	 * @generated
	 */
	void setSuppliedItem(SupplyDeliverySuppliedItem value);

	/**
	 * Returns the value of the '<em><b>Occurrencex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrencex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrencex</em>' containment reference.
	 * @see #setOccurrencex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_Occurrencex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='occurrence[x]'"
	 * @generated
	 */
	DataType getOccurrencex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDelivery#getOccurrencex <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrencex</em>' containment reference.
	 * @see #getOccurrencex()
	 * @generated
	 */
	void setOccurrencex(DataType value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference.
	 * @see #setSupplier(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_Supplier()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSupplier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDelivery#getSupplier <em>Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' containment reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Reference value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_Destination()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDestination();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyDelivery#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Reference value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyDelivery_Receiver()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReceivers();

} // SupplyDelivery
