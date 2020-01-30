/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Legal Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractLegalLanguage#getContentx <em>Contentx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractLegalLanguage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Contract_LegalLanguage'"
 * @generated
 */
public interface ContractLegalLanguage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Contentx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contentx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contentx</em>' containment reference.
	 * @see #setContentx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getContractLegalLanguage_Contentx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='content[x]'"
	 * @generated
	 */
	DataType getContentx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractLegalLanguage#getContentx <em>Contentx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contentx</em>' containment reference.
	 * @see #getContentx()
	 * @generated
	 */
	void setContentx(DataType value);

} // ContractLegalLanguage
