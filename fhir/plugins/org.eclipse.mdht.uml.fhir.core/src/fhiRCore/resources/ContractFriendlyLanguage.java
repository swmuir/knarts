/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Friendly Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractFriendlyLanguage#getContentx <em>Contentx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractFriendlyLanguage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Contract_FriendlyLanguage'"
 * @generated
 */
public interface ContractFriendlyLanguage extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getContractFriendlyLanguage_Contentx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='content[x]'"
	 * @generated
	 */
	DataType getContentx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractFriendlyLanguage#getContentx <em>Contentx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contentx</em>' containment reference.
	 * @see #getContentx()
	 * @generated
	 */
	void setContentx(DataType value);

} // ContractFriendlyLanguage
