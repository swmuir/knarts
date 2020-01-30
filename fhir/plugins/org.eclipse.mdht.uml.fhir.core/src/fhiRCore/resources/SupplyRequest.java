/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply Request</b></em>'.
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
 *   <li>{@link fhiRCore.resources.SupplyRequest#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getCategory <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getItemx <em>Itemx</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getDeliverFrom <em>Deliver From</em>}</li>
 *   <li>{@link fhiRCore.resources.SupplyRequest#getDeliverTo <em>Deliver To</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest()
 * @model
 * @generated
 */
public interface SupplyRequest extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Category()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Priority()
	 * @model containment="true"
	 * @generated
	 */
	Code getPriority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Code value);

	/**
	 * Returns the value of the '<em><b>Itemx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemx</em>' containment reference.
	 * @see #setItemx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Itemx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='item[x]'"
	 * @generated
	 */
	DataType getItemx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getItemx <em>Itemx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemx</em>' containment reference.
	 * @see #getItemx()
	 * @generated
	 */
	void setItemx(DataType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Quantity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SupplyRequestParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupplyRequestParameter> getParameters();

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
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Occurrencex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='occurrence[x]'"
	 * @generated
	 */
	DataType getOccurrencex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getOccurrencex <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrencex</em>' containment reference.
	 * @see #getOccurrencex()
	 * @generated
	 */
	void setOccurrencex(DataType value);

	/**
	 * Returns the value of the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authored On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authored On</em>' containment reference.
	 * @see #setAuthoredOn(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_AuthoredOn()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requester</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Requester()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequester();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Reference value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_Supplier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSuppliers();

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_ReasonCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasonCodes();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Deliver From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliver From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliver From</em>' containment reference.
	 * @see #setDeliverFrom(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_DeliverFrom()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDeliverFrom();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getDeliverFrom <em>Deliver From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliver From</em>' containment reference.
	 * @see #getDeliverFrom()
	 * @generated
	 */
	void setDeliverFrom(Reference value);

	/**
	 * Returns the value of the '<em><b>Deliver To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliver To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliver To</em>' containment reference.
	 * @see #setDeliverTo(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getSupplyRequest_DeliverTo()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDeliverTo();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SupplyRequest#getDeliverTo <em>Deliver To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliver To</em>' containment reference.
	 * @see #getDeliverTo()
	 * @generated
	 */
	void setDeliverTo(Reference value);

} // SupplyRequest
