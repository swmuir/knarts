/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractTerm#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getIssued <em>Issued</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getApplies <em>Applies</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getTopicx <em>Topicx</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getOffer <em>Offer</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getAssets <em>Asset</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getActions <em>Action</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTerm#getGroups <em>Group</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractTerm()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Contract_Term'"
 * @generated
 */
public interface ContractTerm extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTerm#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issued</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Issued()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getIssued();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTerm#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateTime value);

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' containment reference.
	 * @see #setApplies(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Applies()
	 * @model containment="true"
	 * @generated
	 */
	Period getApplies();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTerm#getApplies <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies</em>' containment reference.
	 * @see #getApplies()
	 * @generated
	 */
	void setApplies(Period value);

	/**
	 * Returns the value of the '<em><b>Topicx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topicx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topicx</em>' containment reference.
	 * @see #setTopicx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Topicx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='topic[x]'"
	 * @generated
	 */
	DataType getTopicx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTerm#getTopicx <em>Topicx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topicx</em>' containment reference.
	 * @see #getTopicx()
	 * @generated
	 */
	void setTopicx(DataType value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTerm#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference.
	 * @see #setSubType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_SubType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTerm#getSubType <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' containment reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTerm#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTermSecurityLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_SecurityLabel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermSecurityLabel> getSecurityLabels();

	/**
	 * Returns the value of the '<em><b>Offer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer</em>' containment reference.
	 * @see #setOffer(ContractTermContractOffer)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Offer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContractTermContractOffer getOffer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTerm#getOffer <em>Offer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer</em>' containment reference.
	 * @see #getOffer()
	 * @generated
	 */
	void setOffer(ContractTermContractOffer value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTermContractAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Asset()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermContractAsset> getAssets();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTermAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermAction> getActions();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTerm_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTerm> getGroups();

} // ContractTerm
