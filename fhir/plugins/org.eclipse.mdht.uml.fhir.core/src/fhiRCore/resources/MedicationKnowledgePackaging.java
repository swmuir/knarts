/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgePackaging#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgePackaging#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgePackaging#getDevice <em>Device</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgePackaging#getMaterial <em>Material</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgePackaging#getPackagings <em>Packaging</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgePackaging()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationKnowledge_Packaging'"
 * @generated
 */
public interface MedicationKnowledgePackaging extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgePackaging_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgePackaging#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgePackaging_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgePackaging#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgePackaging_Device()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgePackaging#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgePackaging_Material()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMaterial();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgePackaging#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgePackaging}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaging</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgePackaging_Packaging()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgePackaging> getPackagings();

} // MedicationKnowledgePackaging
