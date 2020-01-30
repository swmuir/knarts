/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Population;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Contraindication</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicinalProductContraindication#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductContraindication#getDisease <em>Disease</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductContraindication#getDiseaseStatus <em>Disease Status</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductContraindication#getComorbidities <em>Comorbidity</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductContraindication#getTherapeuticIndications <em>Therapeutic Indication</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductContraindication#getOtherTherapies <em>Other Therapy</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductContraindication#getPopulations <em>Population</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductContraindication()
 * @model
 * @generated
 */
public interface MedicinalProductContraindication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductContraindication_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSubjects();

	/**
	 * Returns the value of the '<em><b>Disease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disease</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disease</em>' containment reference.
	 * @see #setDisease(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductContraindication_Disease()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDisease();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductContraindication#getDisease <em>Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease</em>' containment reference.
	 * @see #getDisease()
	 * @generated
	 */
	void setDisease(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Disease Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disease Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disease Status</em>' containment reference.
	 * @see #setDiseaseStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductContraindication_DiseaseStatus()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDiseaseStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductContraindication#getDiseaseStatus <em>Disease Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disease Status</em>' containment reference.
	 * @see #getDiseaseStatus()
	 * @generated
	 */
	void setDiseaseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Comorbidity</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comorbidity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comorbidity</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductContraindication_Comorbidity()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getComorbidities();

	/**
	 * Returns the value of the '<em><b>Therapeutic Indication</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Therapeutic Indication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Therapeutic Indication</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductContraindication_TherapeuticIndication()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getTherapeuticIndications();

	/**
	 * Returns the value of the '<em><b>Other Therapy</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductContraindicationOtherTherapy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Therapy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Therapy</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductContraindication_OtherTherapy()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductContraindicationOtherTherapy> getOtherTherapies();

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Population}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductContraindication_Population()
	 * @model containment="true"
	 * @generated
	 */
	EList<Population> getPopulations();

} // MedicinalProductContraindication
