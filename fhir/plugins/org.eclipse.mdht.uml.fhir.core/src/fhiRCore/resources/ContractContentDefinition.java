/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractContentDefinition#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractContentDefinition#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractContentDefinition#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractContentDefinition#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractContentDefinition#getPublicationStatus <em>Publication Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractContentDefinition#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractContentDefinition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Contract_ContentDefinition'"
 * @generated
 */
public interface ContractContentDefinition extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getContractContentDefinition_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractContentDefinition#getType <em>Type</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getContractContentDefinition_SubType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSubType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractContentDefinition#getSubType <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' containment reference.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContractContentDefinition_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPublisher();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractContentDefinition#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Reference value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Date</em>' containment reference.
	 * @see #setPublicationDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getContractContentDefinition_PublicationDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getPublicationDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractContentDefinition#getPublicationDate <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' containment reference.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Publication Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Status</em>' containment reference.
	 * @see #setPublicationStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getContractContentDefinition_PublicationStatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getPublicationStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractContentDefinition#getPublicationStatus <em>Publication Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Status</em>' containment reference.
	 * @see #getPublicationStatus()
	 * @generated
	 */
	void setPublicationStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getContractContentDefinition_Copyright()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractContentDefinition#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

} // ContractContentDefinition
