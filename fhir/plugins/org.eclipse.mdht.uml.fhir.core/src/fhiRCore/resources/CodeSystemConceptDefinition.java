/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Concept Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinition#getDisplay <em>Display</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinition#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinition#getDesignations <em>Designation</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinition#getProperties <em>Property</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinition#getConcepts <em>Concept</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CodeSystem_ConceptDefinition'"
 * @generated
 */
public interface CodeSystemConceptDefinition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinition_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystemConceptDefinition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinition_Display()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDisplay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystemConceptDefinition#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinition_Definition()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDefinition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystemConceptDefinition#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Designation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CodeSystemConceptDefinitionDesignation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinition_Designation()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeSystemConceptDefinitionDesignation> getDesignations();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CodeSystemConceptDefinitionConceptProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinition_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeSystemConceptDefinitionConceptProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CodeSystemConceptDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinition_Concept()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeSystemConceptDefinition> getConcepts();

} // CodeSystemConceptDefinition
