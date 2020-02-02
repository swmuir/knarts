/**
 */
package org.hl7.cdsdt.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>II</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An identifier that uniquely identifies a thing or object. 
 * 
 * Examples are object identifier for HL7 RIM objects, medical record number, order id, service catalog item id, Vehicle Identification Number (VIN), etc. Instance identifiers are usually defined based on ISO object identifiers.
 * 
 * An identifier allows someone to select one record, object or thing from a set of candidates. Usually an identifier alone without any context is not usable. Identifiers are distinguished from concept descriptors as concept descriptors never identify an individual thing, although there may sometimes be an individual record or object that represents the concept.
 * 
 * Information Processing Entities claiming direct or indirect conformance SHALL never assume that receiving applications can infer the identity of issuing authority or the type of the identifier from the identifier or components thereof.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.cdsdt.r2.II#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.II#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link org.hl7.cdsdt.r2.II#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see org.hl7.cdsdt.r2.R2Package#getII()
 * @model extendedMetaData="name='II' kind='empty'"
 * @generated
 */
public interface II extends ANY {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A character string as a unique identifier within the scope of the identifier root. 
	 * The root and extension scheme means that the concatenation of root and extension SHALL be a globally unique identifier for the item that this II value identifies.
	 * Some identifier schemes define certain style options to their code values. For example, the U.S. Social Security Number (SSN) is normally written with dashes that group the digits into a pattern "123-12-1234". However, the dashes are not meaningful and a SSN can also be represented as "123121234" without the dashes. In the case where identifier schemes provide for multiple representations, HL7 or ISO may make a ruling about which is the preferred form and document that ruling where that respective external identifier scheme is recognized.
	 * If no extension attribute is provided in a non-null II, then the root is the complete unique identifier. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getII_Extension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='extension'"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.II#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Identifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human readable description for this identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier Name</em>' attribute.
	 * @see #setIdentifierName(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getII_IdentifierName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='identifierName'"
	 * @generated
	 */
	String getIdentifierName();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.II#getIdentifierName <em>Identifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Name</em>' attribute.
	 * @see #getIdentifierName()
	 * @generated
	 */
	void setIdentifierName(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier that guarantees the global uniqueness of the instance identifier. 
	 * If root is populated, and there is no extension, then the root is a globally unique identifier in its own right. In the presence of a non-null extension, the root is the unique identifier for the "namespace" of the identifier in the extension. Note that this does NOT necessarily correlate with the organization that manages the issuing of the identifiers. A given organization may manage multiple identifier namespaces, and control over a given namespace may transfer from organization to organization over time while the root remains the same. 
	 * This field can be either a DCE UUID, an Object Identifier (OID), or a special identifier taken from lists that may be published by ISO or HL7. 
	 * Comparison of root values is always case sensitive. UUID's SHALL be represented in upper case, so UUID case should always be preserved. 
	 * The root SHALL not be used to carry semantic meaning - all it does is ensure global computational uniqueness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(String)
	 * @see org.hl7.cdsdt.r2.R2Package#getII_Root()
	 * @model dataType="org.hl7.cdsdt.r2.Uid" required="true"
	 *        extendedMetaData="kind='attribute' name='root'"
	 * @generated
	 */
	String getRoot();

	/**
	 * Sets the value of the '{@link org.hl7.cdsdt.r2.II#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(String value);

} // II
