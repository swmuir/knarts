/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Coverage#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getPolicyHolder <em>Policy Holder</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getBeneficiary <em>Beneficiary</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getDependent <em>Dependent</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getPayors <em>Payor</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getClasses <em>Class</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getOrder <em>Order</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getNetwork <em>Network</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getCostToBeneficiaries <em>Cost To Beneficiary</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getSubrogation <em>Subrogation</em>}</li>
 *   <li>{@link fhiRCore.resources.Coverage#getContracts <em>Contract</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCoverage()
 * @model
 * @generated
 */
public interface Coverage extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Policy Holder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Holder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Holder</em>' containment reference.
	 * @see #setPolicyHolder(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_PolicyHolder()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPolicyHolder();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getPolicyHolder <em>Policy Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Holder</em>' containment reference.
	 * @see #getPolicyHolder()
	 * @generated
	 */
	void setPolicyHolder(Reference value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' containment reference.
	 * @see #setSubscriber(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Subscriber()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubscriber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getSubscriber <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' containment reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(Reference value);

	/**
	 * Returns the value of the '<em><b>Subscriber Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Id</em>' containment reference.
	 * @see #setSubscriberId(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_SubscriberId()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSubscriberId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getSubscriberId <em>Subscriber Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Id</em>' containment reference.
	 * @see #getSubscriberId()
	 * @generated
	 */
	void setSubscriberId(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Beneficiary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beneficiary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beneficiary</em>' containment reference.
	 * @see #setBeneficiary(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Beneficiary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getBeneficiary();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getBeneficiary <em>Beneficiary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beneficiary</em>' containment reference.
	 * @see #getBeneficiary()
	 * @generated
	 */
	void setBeneficiary(Reference value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference.
	 * @see #setDependent(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Dependent()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDependent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getDependent <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' containment reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRelationship();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Payor</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payor</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Payor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Reference> getPayors();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CoverageClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoverageClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Order()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getOrder();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Network()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getNetwork();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Cost To Beneficiary</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CoverageCostToBeneficiary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost To Beneficiary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost To Beneficiary</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_CostToBeneficiary()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoverageCostToBeneficiary> getCostToBeneficiaries();

	/**
	 * Returns the value of the '<em><b>Subrogation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subrogation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subrogation</em>' containment reference.
	 * @see #setSubrogation(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Subrogation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getSubrogation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Coverage#getSubrogation <em>Subrogation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subrogation</em>' containment reference.
	 * @see #getSubrogation()
	 * @generated
	 */
	void setSubrogation(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCoverage_Contract()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getContracts();

} // Coverage
