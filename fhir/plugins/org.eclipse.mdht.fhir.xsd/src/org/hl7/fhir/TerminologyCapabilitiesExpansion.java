/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Expansion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Terminology Capabilities documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getHierarchical <em>Hierarchical</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getPaging <em>Paging</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getIncomplete <em>Incomplete</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getTextFilter <em>Text Filter</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesExpansion()
 * @model extendedMetaData="name='TerminologyCapabilities.Expansion' kind='elementOnly'"
 * @generated
 */
public interface TerminologyCapabilitiesExpansion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Hierarchical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the server can return nested value sets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hierarchical</em>' containment reference.
	 * @see #setHierarchical(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesExpansion_Hierarchical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hierarchical' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getHierarchical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getHierarchical <em>Hierarchical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchical</em>' containment reference.
	 * @see #getHierarchical()
	 * @generated
	 */
	void setHierarchical(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Paging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the server supports paging on expansion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paging</em>' containment reference.
	 * @see #setPaging(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesExpansion_Paging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paging' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getPaging();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getPaging <em>Paging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paging</em>' containment reference.
	 * @see #getPaging()
	 * @generated
	 */
	void setPaging(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Incomplete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allow request for incomplete expansions?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incomplete</em>' containment reference.
	 * @see #setIncomplete(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesExpansion_Incomplete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incomplete' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIncomplete();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getIncomplete <em>Incomplete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incomplete</em>' containment reference.
	 * @see #getIncomplete()
	 * @generated
	 */
	void setIncomplete(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supported fields on ExpansionProfile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Reference)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesExpansion_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supported expansion profiles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesExpansion_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProfile();

	/**
	 * Returns the value of the '<em><b>Text Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation about text searching works.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Filter</em>' containment reference.
	 * @see #setTextFilter(Markdown)
	 * @see org.hl7.fhir.FhirPackage#getTerminologyCapabilitiesExpansion_TextFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getTextFilter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesExpansion#getTextFilter <em>Text Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Filter</em>' containment reference.
	 * @see #getTextFilter()
	 * @generated
	 */
	void setTextFilter(Markdown value);

} // TerminologyCapabilitiesExpansion
