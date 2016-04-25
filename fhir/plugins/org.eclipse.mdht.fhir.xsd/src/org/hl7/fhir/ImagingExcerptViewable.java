/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Excerpt Viewable</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImagingExcerptViewable#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptViewable#getHeight <em>Height</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptViewable#getWidth <em>Width</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptViewable#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptViewable#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptViewable#getSize <em>Size</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptViewable#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingExcerptViewable#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable()
 * @model extendedMetaData="name='ImagingExcerpt.Viewable' kind='elementOnly'"
 * @generated
 */
public interface ImagingExcerptViewable extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of the data in the attachment and allows a method to be chosen to interpret or render the data. Includes mime type parameters such as charset where appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' containment reference.
	 * @see #setContentType(Code)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable_ContentType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contentType' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getContentType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptViewable#getContentType <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' containment reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Code value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height of the image in pixels (photo/video).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable_Height()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getHeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptViewable#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the image in pixels (photo/video).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable_Width()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getWidth();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptViewable#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference.
	 * @see #setFrames(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable_Frames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frames' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getFrames();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptViewable#getFrames <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' containment reference.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration of the recording in seconds - for audio and video.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptViewable#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bytes of data that make up this attachment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable_Size()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getSize();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptViewable#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label or set of text to display in place of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptViewable#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location where the data can be accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getImagingExcerptViewable_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingExcerptViewable#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

} // ImagingExcerptViewable
