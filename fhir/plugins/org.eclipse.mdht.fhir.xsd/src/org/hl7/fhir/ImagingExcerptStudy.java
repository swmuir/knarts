/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Excerpt Study</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImagingExcerptStudy#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptStudy#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptStudy#getDicom <em>Dicom</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptStudy#getViewable <em>Viewable</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptStudy#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingExcerptStudy()
 * @model extendedMetaData="name='ImagingExcerpt.Study' kind='elementOnly'"
 * @generated
 */
public interface ImagingExcerptStudy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Study instance UID of the SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptStudy_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptStudy#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Imaging Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the Imaging Study in FHIR form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Study</em>' containment reference.
	 * @see #setImagingStudy(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptStudy_ImagingStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getImagingStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptStudy#getImagingStudy <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Study</em>' containment reference.
	 * @see #getImagingStudy()
	 * @generated
	 */
	void setImagingStudy(Reference value);

	/**
	 * Returns the value of the '<em><b>Dicom</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingExcerptDicom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Methods of accessing using DICOM web technologies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dicom</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptStudy_Dicom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dicom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingExcerptDicom> getDicom();

	/**
	 * Returns the value of the '<em><b>Viewable</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingExcerptViewable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of viewable reference images of various  types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewable</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptStudy_Viewable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='viewable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingExcerptViewable> getViewable();

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingExcerptSeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Series identity and locating information of the DICOM SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptStudy_Series()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingExcerptSeries> getSeries();

} // ImagingExcerptStudy
