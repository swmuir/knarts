/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term Contract Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getParties <em>Party</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getTopic <em>Topic</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getDecision <em>Decision</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getDecisionModes <em>Decision Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getAnswers <em>Answer</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getLinkIds <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOffer#getSecurityLabelNumbers <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Term_ContractOffer'"
 * @generated
 */
public interface ContractTermContractOffer extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTermContractOfferContractParty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_Party()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermContractOfferContractParty> getParties();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference.
	 * @see #setTopic(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_Topic()
	 * @model containment="true"
	 * @generated
	 */
	Reference getTopic();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractOffer#getTopic <em>Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' containment reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractOffer#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference.
	 * @see #setDecision(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_Decision()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDecision();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractOffer#getDecision <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' containment reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Decision Mode</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Mode</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_DecisionMode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getDecisionModes();

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTermContractOfferAnswer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_Answer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermContractOfferAnswer> getAnswers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractOffer#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_LinkId()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getLinkIds();

	/**
	 * Returns the value of the '<em><b>Security Label Number</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Label Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Label Number</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOffer_SecurityLabelNumber()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnsignedInt> getSecurityLabelNumbers();

} // ContractTermContractOffer
