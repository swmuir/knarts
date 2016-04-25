/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Excerpt Instance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImagingExcerptInstance#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptInstance#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptInstance#getDicom <em>Dicom</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptInstance#getFrameNumbers <em>Frame Numbers</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingExcerptInstance()
 * @model extendedMetaData="name='ImagingExcerpt.Instance' kind='elementOnly'"
 * @generated
 */
public interface ImagingExcerptInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sop Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SOP class UID of the selected instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sop Class</em>' containment reference.
	 * @see #setSopClass(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptInstance_SopClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sopClass' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getSopClass();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptInstance#getSopClass <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sop Class</em>' containment reference.
	 * @see #getSopClass()
	 * @generated
	 */
	void setSopClass(Oid value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SOP Instance UID of the selected instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptInstance_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptInstance#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Dicom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingExcerptDicom2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Methods of accessing using DICOM web technologies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dicom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptInstance_Dicom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dicom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingExcerptDicom2> getDicom();

	/**
	 * Returns the value of the '<em><b>Frame Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific frame reference within a multi-frame object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Numbers</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptInstance_FrameNumbers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frameNumbers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnsignedInt> getFrameNumbers();

} // ImagingExcerptInstance
