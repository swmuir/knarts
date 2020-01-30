/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term Contract Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getScope <em>Scope</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getTypeReferences <em>Type Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getContexts <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getCondition <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getPeriodTypes <em>Period Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getPeriods <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getUsePeriods <em>Use Period</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getLinkIds <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getAnswers <em>Answer</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getSecurityLabelNumbers <em>Security Label Number</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAsset#getValuedItems <em>Valued Item</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Term_ContractAsset'"
 * @generated
 */
public interface ContractTermContractAsset extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Scope()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getScope();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAsset#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getTypes();

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_TypeReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getTypeReferences();

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Subtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSubtypes();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	Coding getRelationship();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAsset#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Coding value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTermContractAssetAssetContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermContractAssetAssetContext> getContexts();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Condition()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCondition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAsset#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Period Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_PeriodType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getPeriodTypes();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Period}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Period()
	 * @model containment="true"
	 * @generated
	 */
	EList<Period> getPeriods();

	/**
	 * Returns the value of the '<em><b>Use Period</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Period}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Period</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_UsePeriod()
	 * @model containment="true"
	 * @generated
	 */
	EList<Period> getUsePeriods();

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Text()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getText();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAsset#getText <em>Text</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_LinkId()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getLinkIds();

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_Answer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermContractOfferAnswer> getAnswers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_SecurityLabelNumber()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnsignedInt> getSecurityLabelNumbers();

	/**
	 * Returns the value of the '<em><b>Valued Item</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTermContractAssetValuedItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valued Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Item</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAsset_ValuedItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTermContractAssetValuedItem> getValuedItems();

} // ContractTermContractAsset
