/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Support Service Module Code Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DecisionSupportServiceModule resource describes decision support functionality that is available as a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleCodeFilter#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleCodeFilter#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleCodeFilter#getValueSetReference <em>Value Set Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DecisionSupportServiceModuleCodeFilter#getCodeableConcept <em>Codeable Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleCodeFilter()
 * @model extendedMetaData="name='DecisionSupportServiceModule.CodeFilter' kind='elementOnly'"
 * @generated
 */
public interface DecisionSupportServiceModuleCodeFilter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleCodeFilter_Path()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModuleCodeFilter#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Set Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Uri</em>' containment reference.
	 * @see #setValueSetUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleCodeFilter_ValueSetUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueSetUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModuleCodeFilter#getValueSetUri <em>Value Set Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Uri</em>' containment reference.
	 * @see #getValueSetUri()
	 * @generated
	 */
	void setValueSetUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Set Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #setValueSetReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleCodeFilter_ValueSetReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueSetReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DecisionSupportServiceModuleCodeFilter#getValueSetReference <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #getValueSetReference()
	 * @generated
	 */
	void setValueSetReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Codeable Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The codeable concept for the code filter. Only one of valueSet or codeableConcept may be specified. If codeableConcepts are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codeable concepts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Codeable Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDecisionSupportServiceModuleCodeFilter_CodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCodeableConcept();

} // DecisionSupportServiceModuleCodeFilter
