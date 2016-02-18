/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Library resource provides a representation container for knowledge artifact component definitions. It is effectively an exposure of the header information for a CQL/ELM library.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Library#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Library#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.Library#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.hl7.fhir.Library#getModuleDefinition <em>Module Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.Library#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getLibrary()
 * @model extendedMetaData="name='Library' kind='elementOnly'"
 * @generated
 */
public interface Library extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A logical identifier for the module such as the CMS or NQF identifiers for a measure artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getLibrary_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the module, if any. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge modules, refer to the Decision Support Service specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getLibrary_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Library#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Module Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a ModuleMetadata resource containing publication, description, and supporting information for the library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Metadata</em>' containment reference.
	 * @see #setModuleMetadata(ModuleMetadata)
	 * @see org.hl7.fhir.FhirPackage#getLibrary_ModuleMetadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleMetadata getModuleMetadata();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Library#getModuleMetadata <em>Module Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Metadata</em>' containment reference.
	 * @see #getModuleMetadata()
	 * @generated
	 */
	void setModuleMetadata(ModuleMetadata value);

	/**
	 * Returns the value of the '<em><b>Module Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a ModuleDefinition resource describing the header information for the library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Definition</em>' containment reference.
	 * @see #setModuleDefinition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getLibrary_ModuleDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getModuleDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Library#getModuleDefinition <em>Module Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Definition</em>' containment reference.
	 * @see #getModuleDefinition()
	 * @generated
	 */
	void setModuleDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content of the library as an Attachment. The content may be a reference to a url, or may be directly embedded as a base-64 string. Either way, the content is expected to be a CQL or ELM document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getLibrary_Document()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getDocument();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Library#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Attachment value);

} // Library
