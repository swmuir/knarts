/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Coding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Concept Definition Designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinitionDesignation#getLanguage <em>Language</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinitionDesignation#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystemConceptDefinitionDesignation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinitionDesignation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConceptDefinition_Designation'"
 * @generated
 */
public interface CodeSystemConceptDefinitionDesignation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinitionDesignation_Language()
	 * @model containment="true"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystemConceptDefinitionDesignation#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinitionDesignation_Use()
	 * @model containment="true"
	 * @generated
	 */
	Coding getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystemConceptDefinitionDesignation#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Coding value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystemConceptDefinitionDesignation_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystemConceptDefinitionDesignation#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhiRCore.dataTypes.String value);

} // CodeSystemConceptDefinitionDesignation
