/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Clinicals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The clinical particulars - indications, contraindications etc of a medicinal product, including for regulatory purposes.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicals#getUndesirableEffects <em>Undesirable Effects</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicals#getTherapeuticIndication <em>Therapeutic Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicals#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductClinicals#getInteractions <em>Interactions</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicals()
 * @model extendedMetaData="name='MedicinalProductClinicals' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductClinicals extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Undesirable Effects</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsUndesirableEffects}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describe the undesirable effects of the medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undesirable Effects</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicals_UndesirableEffects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undesirableEffects' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsUndesirableEffects> getUndesirableEffects();

	/**
	 * Returns the value of the '<em><b>Therapeutic Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsTherapeuticIndication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication for the Medicinal Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Therapeutic Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicals_TherapeuticIndication()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='therapeuticIndication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsTherapeuticIndication> getTherapeuticIndication();

	/**
	 * Returns the value of the '<em><b>Contraindication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsContraindication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contraindication for the medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contraindication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicals_Contraindication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contraindication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsContraindication> getContraindication();

	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductClinicalsInteractions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interactions of the medicinal product with other medicinal products, or other forms of interactions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interactions</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductClinicals_Interactions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interactions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductClinicalsInteractions> getInteractions();

} // MedicinalProductClinicals
