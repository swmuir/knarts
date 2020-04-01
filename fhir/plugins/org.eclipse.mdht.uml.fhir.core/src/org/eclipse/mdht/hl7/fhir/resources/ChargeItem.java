/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge Item</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getDefinitionUris <em>Definition Uri</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getDefinitionCanonicals <em>Definition Canonical</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getPerformers <em>Performer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getPerformingOrganization <em>Performing Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getRequestingOrganization <em>Requesting Organization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getCostCenter <em>Cost Center</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getBodysites <em>Bodysite</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getFactorOverride <em>Factor Override</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getPriceOverride <em>Price Override</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getOverrideReason <em>Override Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getEnteredDate <em>Entered Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getReasons <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getServices <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getProductx <em>Productx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getAccounts <em>Account</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getSupportingInformations <em>Supporting Information</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem()
 * @model
 * @generated
 */
public interface ChargeItem extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Definition Uri</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Uri</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Uri</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_DefinitionUri()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getDefinitionUris();

	/**
	 * Returns the value of the '<em><b>Definition Canonical</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ChargeItemDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Canonical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Canonical</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_DefinitionCanonical()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChargeItemDefinition> getDefinitionCanonicals();

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_PartOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPartOfs();

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Subject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Context()
	 * @model containment="true"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Occurrencex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='occurrence[x]'"
	 * @generated
	 */
	DataType getOccurrencex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getOccurrencex <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrencex</em>' containment reference.
	 * @see #getOccurrencex()
	 * @generated
	 */
	void setOccurrencex(DataType value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.ChargeItemPerformer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Performer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChargeItemPerformer> getPerformers();

	/**
	 * Returns the value of the '<em><b>Performing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performing Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performing Organization</em>' containment reference.
	 * @see #setPerformingOrganization(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_PerformingOrganization()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPerformingOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getPerformingOrganization <em>Performing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performing Organization</em>' containment reference.
	 * @see #getPerformingOrganization()
	 * @generated
	 */
	void setPerformingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Requesting Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requesting Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requesting Organization</em>' containment reference.
	 * @see #setRequestingOrganization(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_RequestingOrganization()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRequestingOrganization();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getRequestingOrganization <em>Requesting Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requesting Organization</em>' containment reference.
	 * @see #getRequestingOrganization()
	 * @generated
	 */
	void setRequestingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Cost Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Center</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Center</em>' containment reference.
	 * @see #setCostCenter(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_CostCenter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCostCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getCostCenter <em>Cost Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Center</em>' containment reference.
	 * @see #getCostCenter()
	 * @generated
	 */
	void setCostCenter(Reference value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Bodysite</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bodysite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodysite</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Bodysite()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getBodysites();

	/**
	 * Returns the value of the '<em><b>Factor Override</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor Override</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor Override</em>' containment reference.
	 * @see #setFactorOverride(Decimal)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_FactorOverride()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFactorOverride();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getFactorOverride <em>Factor Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor Override</em>' containment reference.
	 * @see #getFactorOverride()
	 * @generated
	 */
	void setFactorOverride(Decimal value);

	/**
	 * Returns the value of the '<em><b>Price Override</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Override</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Override</em>' containment reference.
	 * @see #setPriceOverride(Money)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_PriceOverride()
	 * @model containment="true"
	 * @generated
	 */
	Money getPriceOverride();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getPriceOverride <em>Price Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Override</em>' containment reference.
	 * @see #getPriceOverride()
	 * @generated
	 */
	void setPriceOverride(Money value);

	/**
	 * Returns the value of the '<em><b>Override Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Reason</em>' containment reference.
	 * @see #setOverrideReason(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_OverrideReason()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getOverrideReason();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getOverrideReason <em>Override Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Reason</em>' containment reference.
	 * @see #getOverrideReason()
	 * @generated
	 */
	void setOverrideReason(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterer</em>' containment reference.
	 * @see #setEnterer(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Enterer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEnterer();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getEnterer <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterer</em>' containment reference.
	 * @see #getEnterer()
	 * @generated
	 */
	void setEnterer(Reference value);

	/**
	 * Returns the value of the '<em><b>Entered Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entered Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entered Date</em>' containment reference.
	 * @see #setEnteredDate(DateTime)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_EnteredDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getEnteredDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getEnteredDate <em>Entered Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered Date</em>' containment reference.
	 * @see #getEnteredDate()
	 * @generated
	 */
	void setEnteredDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Reason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasons();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getServices();

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Productx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='product[x]'"
	 * @generated
	 */
	DataType getProductx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ChargeItem#getProductx <em>Productx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productx</em>' containment reference.
	 * @see #getProductx()
	 * @generated
	 */
	void setProductx(DataType value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Account()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAccounts();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getChargeItem_SupportingInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSupportingInformations();

} // ChargeItem
