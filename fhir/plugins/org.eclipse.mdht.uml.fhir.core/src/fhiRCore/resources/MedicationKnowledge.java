/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getDoseForm <em>Dose Form</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getAmount <em>Amount</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getSynonyms <em>Synonym</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getRelatedMedicationKnowledges <em>Related Medication Knowledge</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getAssociatedMedications <em>Associated Medication</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getProductTypes <em>Product Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getMonographs <em>Monograph</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getIngredients <em>Ingredient</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getDevices <em>Device</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getPreparationInstruction <em>Preparation Instruction</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getIntendedRoutes <em>Intended Route</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getCosts <em>Cost</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getMonitoringPrograms <em>Monitoring Program</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getAdministrationGuidelines <em>Administration Guidelines</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getMedicineClassifications <em>Medicine Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getDrugCharacteristics <em>Drug Characteristic</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getContraindications <em>Contraindication</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getUndesirableEffects <em>Undesirable Effect</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getRegulatories <em>Regulatory</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledge#getKinetics <em>Kinetics</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge()
 * @model
 * @generated
 */
public interface MedicationKnowledge extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Code()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledge#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledge#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Manufacturer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getManufacturer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledge#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Reference value);

	/**
	 * Returns the value of the '<em><b>Dose Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Form</em>' containment reference.
	 * @see #setDoseForm(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_DoseForm()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDoseForm();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledge#getDoseForm <em>Dose Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Form</em>' containment reference.
	 * @see #getDoseForm()
	 * @generated
	 */
	void setDoseForm(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Amount()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getAmount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledge#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Quantity value);

	/**
	 * Returns the value of the '<em><b>Synonym</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonym</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonym</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Synonym()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getSynonyms();

	/**
	 * Returns the value of the '<em><b>Related Medication Knowledge</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeRelatedMedicationKnowledge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Medication Knowledge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Medication Knowledge</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_RelatedMedicationKnowledge()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeRelatedMedicationKnowledge> getRelatedMedicationKnowledges();

	/**
	 * Returns the value of the '<em><b>Associated Medication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Medication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Medication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_AssociatedMedication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAssociatedMedications();

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_ProductType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getProductTypes();

	/**
	 * Returns the value of the '<em><b>Monograph</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeMonograph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monograph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monograph</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Monograph()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeMonograph> getMonographs();

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeIngredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Ingredient()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeIngredient> getIngredients();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getDevices();

	/**
	 * Returns the value of the '<em><b>Preparation Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preparation Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preparation Instruction</em>' containment reference.
	 * @see #setPreparationInstruction(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_PreparationInstruction()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getPreparationInstruction();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledge#getPreparationInstruction <em>Preparation Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preparation Instruction</em>' containment reference.
	 * @see #getPreparationInstruction()
	 * @generated
	 */
	void setPreparationInstruction(Markdown value);

	/**
	 * Returns the value of the '<em><b>Intended Route</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intended Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intended Route</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_IntendedRoute()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getIntendedRoutes();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Cost()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeCost> getCosts();

	/**
	 * Returns the value of the '<em><b>Monitoring Program</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeMonitoringProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring Program</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Program</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_MonitoringProgram()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeMonitoringProgram> getMonitoringPrograms();

	/**
	 * Returns the value of the '<em><b>Administration Guidelines</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administration Guidelines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administration Guidelines</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_AdministrationGuidelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeAdministrationGuidelines> getAdministrationGuidelines();

	/**
	 * Returns the value of the '<em><b>Medicine Classification</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeMedicineClassification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicine Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicine Classification</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_MedicineClassification()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeMedicineClassification> getMedicineClassifications();

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference.
	 * @see #setPackaging(MedicationKnowledgePackaging)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Packaging()
	 * @model containment="true"
	 * @generated
	 */
	MedicationKnowledgePackaging getPackaging();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledge#getPackaging <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' containment reference.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(MedicationKnowledgePackaging value);

	/**
	 * Returns the value of the '<em><b>Drug Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeDrugCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drug Characteristic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drug Characteristic</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_DrugCharacteristic()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeDrugCharacteristic> getDrugCharacteristics();

	/**
	 * Returns the value of the '<em><b>Contraindication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraindication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraindication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Contraindication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getContraindications();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Interaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getInteractions();

	/**
	 * Returns the value of the '<em><b>Undesirable Effect</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undesirable Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undesirable Effect</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_UndesirableEffect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getUndesirableEffects();

	/**
	 * Returns the value of the '<em><b>Regulatory</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeRegulatory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulatory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatory</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Regulatory()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeRegulatory> getRegulatories();

	/**
	 * Returns the value of the '<em><b>Kinetics</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeKinetics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinetics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinetics</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledge_Kinetics()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeKinetics> getKinetics();

} // MedicationKnowledge
