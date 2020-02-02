/**
 */
package org.hl7.cdsdt.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data that is primarily intended for human interpretation or for further machine processing outside the scope of this specification. This includes unformatted or formatted written language, multimedia data, or structured information as defined by a different standard (e.g., XML-signatures.) 
 * Encapsulated data can be present in two forms, inline or by reference. The content is the same whether it is located inline or remote. Inline data is communicated or moved as part of the encapsulated data value, whereas by-reference data may reside at a different  location: a URL/URI that provides reference to the information required to locate the data. Inline data may be provided in one of 3 different ways:
 * 
 * 1) as a plain sequence of characters (value)
 * 2) as a binary (a sequence of bytes) (data
 * 3) as xml content (xml)
 * 
 * Content SHALL be provided if the ED has no nullFlavor. The content may be provided in-line (using only one of value, data or xml), or it may be provided as a reference.Content may be provided in-line and a reference also may be given; in these cases, it is expected that the content of the reference will be exactly the same as the in-line content. Information Processing Entities are not required to check this, but may regard it as an error condition if the content does not match
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getXml <em>Xml</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getIntegrityCheck <em>Integrity Check</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getCompression <em>Compression</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.ED#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getED()
 * @model extendedMetaData="name='ED' kind='elementOnly'"
 * @generated
 */
public interface ED extends ANY {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple sequence of byte values that contains the content. (Base64 Encoded String).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see org.hl7.cdsdt.r2.R2Package#getED_Data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content represented in plain XML form.
	 * 
	 * A direct representation is provided for XML. This is because this specification includes an XML serialization of the data, and this xml attribute is handled specially in the serialisation form. The xml data is not different in any semantic sense to the same data if represented in the value or data attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml</em>' containment reference.
	 * @see #setXml(EObject)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_Xml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xml' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getXml();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getXml <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' containment reference.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(EObject value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL the target of which provides the binary content.
	 * 
	 * The semantic value of an encapsulated data value is the same, regardless whether the content is present as inline content or just by reference. However, an encapsulated data value without inline content behaves differently, since any attempt to examine the content requires the data to be downloaded from the reference. An encapsulated data value may have both inline content and a reference.
	 * 
	 * If data is provded in the value, data or xml attributes, the reference SHALL point to the same data. It is an error if the data resolved through the reference does not match either the integrity check, data as provided, or data that had earlier been retrieved through the reference and then cached. The mediatype of the ED SHALL match the type returned by accessing the reference. 
	 * 
	 * The reference may contain a usablePeriod to indicate that the data may only be available for a limited period of time. Whether the reference is limited by a usablePeriod or not, the content of the reference SHALL be fixed for all time. Any application using the reference SHALL always receive the same data, or an error. The reference cannot be reused to send a different version of the same data, or different data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(TEL)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	TEL getReference();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(TEL value);

	/**
	 * Returns the value of the '<em><b>Integrity Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A checksum calculated over the binary data
	 * 
	 * The purpose of this property, when communicated with a reference is for anyone to validate later whether the reference still resolved to the same content that the reference resolved to when the encapsulated data value with reference was created. If the attribute is null, there is no integrityCheck.
	 * It is an error if the data resolved through the reference does not match the integrity check. 
	 * The integrity check is calculated according to the integrityCheckAlgorithm. By default, the Secure Hash Algorithm-1 (SHA-1) shall be used. The integrity check is binary encoded according to the rules of the integrity check algorithm. 
	 * The integrity check is calculated over the raw binary data that is contained in the data component, or that is accessible through the reference. No transformations are made before the integrity check is calculated. If the data is compressed, the Integrity Check is calculated over the compressed data. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity Check</em>' attribute.
	 * @see #setIntegrityCheck(byte[])
	 * @see org.hl7.cdsdt.r2.R2Package#getED_IntegrityCheck()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='integrityCheck' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getIntegrityCheck();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getIntegrityCheck <em>Integrity Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity Check</em>' attribute.
	 * @see #getIntegrityCheck()
	 * @generated
	 */
	void setIntegrityCheck(byte[] value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An alternative description of the media where the media is not able to be rendered. 
	 * 
	 * E.g. Short text description of an image or sound clip, etc. This attribute is not intended to be a complete substitute for the original. For complete substitutes, use the &#34;translation&#34; property.
	 * 
	 * The intent of this property is to allow compliance with disability requirements such as those expressed in American&#39;s with Disability Act (also known as &#34;Section 508&#34;), where there is a requirement to provide a short text description of included media in some form that can be read by a screen reader. This is similar to a very short thumbnail with mediaType = text/plain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(ST)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(ST value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Internet Assigned Numbers Authority (IANA) Charset Registered character set and character encoding for character-based encoding types&#60;b&#62;. &#60;/b&#62;
	 * 
	 * Whenever the content of the ED is character type data in any form, the charset property needs to be known. If the content is provided directly in the value attribute, then the charset SHALL be a known character set consistent with the String Character Set. Refer to section 6.7.5 for more details. If the content is provided as a reference, and the access method does not provide the charset for the content (such as by a mime header), then the charset SHALL be conveyed as part of the ED
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_Charset()
	 * @model dataType="org.hl7.cdsdt.r2.Code"
	 *        extendedMetaData="kind='attribute' name='charset'"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.cdsdt.r2.Compression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The compression algorithm, if any, used on the raw byte data.
	 * 
	 * If the attribute is null, the data is not compressed. Compression only applies to the binary form of the content.
	 * 
	 * If populated, the value of this attribute SHALL be taken from the HL7 CompressionAlgorithm code system.
	 * 
	 * Some compression formats allow multiple archive files to be embedded within a single compressed volume. Applications SHALL ensure that the decompressed form of the data conforms to the stated media type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see org.hl7.cdsdt.r2.Compression
	 * @see #isSetCompression()
	 * @see #unsetCompression()
	 * @see #setCompression(Compression)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_Compression()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='compression'"
	 * @generated
	 */
	Compression getCompression();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see org.hl7.cdsdt.r2.Compression
	 * @see #isSetCompression()
	 * @see #unsetCompression()
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(Compression value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.ED#getCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompression()
	 * @see #getCompression()
	 * @see #setCompression(Compression)
	 * @generated
	 */
	void unsetCompression();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.ED#getCompression <em>Compression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression</em>' attribute is set.
	 * @see #unsetCompression()
	 * @see #getCompression()
	 * @see #setCompression(Compression)
	 * @generated
	 */
	boolean isSetCompression();

	/**
	 * Returns the value of the '<em><b>Integrity Check Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.cdsdt.r2.IntegrityCheckAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The algorithm used to compute the integrityCheck value.
	 * If populated, the value of this attribute SHALL be taken from the HL7 IntegrityCheckAlgorithm code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity Check Algorithm</em>' attribute.
	 * @see org.hl7.cdsdt.r2.IntegrityCheckAlgorithm
	 * @see #isSetIntegrityCheckAlgorithm()
	 * @see #unsetIntegrityCheckAlgorithm()
	 * @see #setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_IntegrityCheckAlgorithm()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='integrityCheckAlgorithm'"
	 * @generated
	 */
	IntegrityCheckAlgorithm getIntegrityCheckAlgorithm();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity Check Algorithm</em>' attribute.
	 * @see org.hl7.cdsdt.r2.IntegrityCheckAlgorithm
	 * @see #isSetIntegrityCheckAlgorithm()
	 * @see #unsetIntegrityCheckAlgorithm()
	 * @see #getIntegrityCheckAlgorithm()
	 * @generated
	 */
	void setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntegrityCheckAlgorithm()
	 * @see #getIntegrityCheckAlgorithm()
	 * @see #setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm)
	 * @generated
	 */
	void unsetIntegrityCheckAlgorithm();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.ED#getIntegrityCheckAlgorithm <em>Integrity Check Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Integrity Check Algorithm</em>' attribute is set.
	 * @see #unsetIntegrityCheckAlgorithm()
	 * @see #getIntegrityCheckAlgorithm()
	 * @see #setIntegrityCheckAlgorithm(IntegrityCheckAlgorithm)
	 * @generated
	 */
	boolean isSetIntegrityCheckAlgorithm();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human language of the content. Valid codes are taken from the IETF RFC 3066. If this attribute is null, the language may be inferred from elsewhere, either from the context or from unicode language tags, for example.
	 * 
	 * Conformance profiles SHOULD define defaulting rules for language for a given usage environment of this specification.
	 * 
	 * Note: While language attribute usually alters the interpretation of the text, the language attribute does not alter the meaning of the characters in the text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_Language()
	 * @model dataType="org.hl7.cdsdt.r2.Code"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * The default value is <code>"text/plain"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the type of the encapsulated data and can be used to determine a method to interpret or render the content. 
	 * 
	 * The IANA defined domain of media types is established by the IETF RFCs 2045 and 2046. mediaType has a default value of text/plain and cannot be null. If the media type is different to text/plain, the &#60;i&#62;mediaType&#60;/i&#62; attribute SHALL be populated.
	 * 
	 * If the content is compressed using a specified compression algorithm, the mediaType SHALL refer the mediaType of the uncompressed data, whether the data is accessed by reference or not. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #isSetMediaType()
	 * @see #unsetMediaType()
	 * @see #setMediaType(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_MediaType()
	 * @model default="text/plain" unsettable="true" dataType="org.hl7.cdsdt.r2.Code"
	 *        extendedMetaData="kind='attribute' name='mediaType'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #isSetMediaType()
	 * @see #unsetMediaType()
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.cdsdt.r2.ED#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMediaType()
	 * @see #getMediaType()
	 * @see #setMediaType(String)
	 * @generated
	 */
	void unsetMediaType();

	/**
	 * Returns whether the value of the '{@link org.hl7.cdsdt.r2.ED#getMediaType <em>Media Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Media Type</em>' attribute is set.
	 * @see #unsetMediaType()
	 * @see #getMediaType()
	 * @see #setMediaType(String)
	 * @generated
	 */
	boolean isSetMediaType();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple sequence of characters that contains the content. 
	 * 
	 * If value is used, the mediatype is fixed to text/plain and the charset must be consistent with the String Character Set. Refer to section 6.7.5 for more details
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getED_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.ED#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ED
