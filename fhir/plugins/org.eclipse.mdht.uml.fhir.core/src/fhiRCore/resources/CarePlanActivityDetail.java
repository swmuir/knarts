/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan Activity Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getInstantiatesCanonicals <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getInstantiatesUris <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getGoals <em>Goal</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getDoNotPerform <em>Do Not Perform</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getScheduledx <em>Scheduledx</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getProductx <em>Productx</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getDailyAmount <em>Daily Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.CarePlanActivityDetail#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Activity_Detail'"
 * @generated
 */
public interface CarePlanActivityDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Kind()
	 * @model containment="true"
	 * @generated
	 */
	Code getKind();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Code value);

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.PlanDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Canonical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_InstantiatesCanonical()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanDefinition> getInstantiatesCanonicals();

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Uri</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_InstantiatesUri()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getInstantiatesUris();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_ReasonCode()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_ReasonReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReasonReferences();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Goal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getGoals();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Do Not Perform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Not Perform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #setDoNotPerform(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_DoNotPerform()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getDoNotPerform();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getDoNotPerform <em>Do Not Perform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Not Perform</em>' containment reference.
	 * @see #getDoNotPerform()
	 * @generated
	 */
	void setDoNotPerform(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Scheduledx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduledx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduledx</em>' containment reference.
	 * @see #setScheduledx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Scheduledx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='scheduled[x]'"
	 * @generated
	 */
	DataType getScheduledx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getScheduledx <em>Scheduledx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduledx</em>' containment reference.
	 * @see #getScheduledx()
	 * @generated
	 */
	void setScheduledx(DataType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Location()
	 * @model containment="true"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Performer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPerformers();

	/**
	 * Returns the value of the '<em><b>Productx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productx</em>' containment reference.
	 * @see #setProductx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Productx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='product[x]'"
	 * @generated
	 */
	DataType getProductx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getProductx <em>Productx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productx</em>' containment reference.
	 * @see #getProductx()
	 * @generated
	 */
	void setProductx(DataType value);

	/**
	 * Returns the value of the '<em><b>Daily Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Amount</em>' containment reference.
	 * @see #setDailyAmount(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_DailyAmount()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getDailyAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getDailyAmount <em>Daily Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Amount</em>' containment reference.
	 * @see #getDailyAmount()
	 * @generated
	 */
	void setDailyAmount(Quantity value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCarePlanActivityDetail_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CarePlanActivityDetail#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

} // CarePlanActivityDetail
