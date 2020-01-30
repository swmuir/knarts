/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Validate Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilitiesValidateCode#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesValidateCode()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TerminologyCapabilities_ValidateCode'"
 * @generated
 */
public interface TerminologyCapabilitiesValidateCode extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilitiesValidateCode_Translations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getTranslations();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilitiesValidateCode#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(fhiRCore.dataTypes.Boolean value);

} // TerminologyCapabilitiesValidateCode
