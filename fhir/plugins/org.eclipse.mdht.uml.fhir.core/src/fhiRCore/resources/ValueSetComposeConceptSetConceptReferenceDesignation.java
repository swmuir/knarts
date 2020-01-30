/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Coding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Compose Concept Set Concept Reference Designation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation#getLanguage <em>Language</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetConceptReferenceDesignation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConceptReference_Designation'"
 * @generated
 */
public interface ValueSetComposeConceptSetConceptReferenceDesignation extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetConceptReferenceDesignation_Language()
	 * @model containment="true"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation#getLanguage <em>Language</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetConceptReferenceDesignation_Use()
	 * @model containment="true"
	 * @generated
	 */
	Coding getUse();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation#getUse <em>Use</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getValueSetComposeConceptSetConceptReferenceDesignation_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ValueSetComposeConceptSetConceptReferenceDesignation#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhiRCore.dataTypes.String value);

} // ValueSetComposeConceptSetConceptReferenceDesignation
