/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Excerpt Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances have been selected for a purpose, such as quality assurance, conference, or consult. Reflecting that range of purposes, typical ImagingExcerpt resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); a multi-frame ultrasound instance ("cine" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingExcerptSeries#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptSeries#getDicom <em>Dicom</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptSeries#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingExcerptSeries()
 * @model extendedMetaData="name='ImagingExcerpt.Series' kind='elementOnly'"
 * @generated
 */
public interface ImagingExcerptSeries extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Series instance UID of the SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptSeries_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptSeries#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Dicom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingExcerptDicom1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Methods of accessing using DICOM web technologies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dicom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptSeries_Dicom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dicom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingExcerptDicom1> getDicom();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingExcerptInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity and locating information of the selected DICOM SOP instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptSeries_Instance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingExcerptInstance> getInstance();

} // ImagingExcerptSeries
