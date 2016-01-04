/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Definition Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ModuleDefinition resource defines the data requirements for a quality artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionLibrary#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionLibrary#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionLibrary#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionLibrary#getDocumentAttachment <em>Document Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionLibrary#getDocumentReference <em>Document Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionLibrary()
 * @model extendedMetaData="name='ModuleDefinition.Library' kind='elementOnly'"
 * @generated
 */
public interface ModuleDefinitionLibrary extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The local name for the library reference. If no local name is provided, the name of the referenced library is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionLibrary_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleDefinitionLibrary#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of the library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionLibrary_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleDefinitionLibrary#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionLibrary_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleDefinitionLibrary#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Document Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Attachment</em>' containment reference.
	 * @see #setDocumentAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionLibrary_DocumentAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getDocumentAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleDefinitionLibrary#getDocumentAttachment <em>Document Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Attachment</em>' containment reference.
	 * @see #getDocumentAttachment()
	 * @generated
	 */
	void setDocumentAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Reference</em>' containment reference.
	 * @see #setDocumentReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionLibrary_DocumentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDocumentReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleDefinitionLibrary#getDocumentReference <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Reference</em>' containment reference.
	 * @see #getDocumentReference()
	 * @generated
	 */
	void setDocumentReference(Reference value);

} // ModuleDefinitionLibrary
