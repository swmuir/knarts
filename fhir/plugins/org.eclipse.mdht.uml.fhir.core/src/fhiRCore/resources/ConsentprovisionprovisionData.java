/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consentprovisionprovision Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ConsentprovisionprovisionData#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link fhiRCore.resources.ConsentprovisionprovisionData#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConsentprovisionprovisionData()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='provision_ProvisionData'"
 * @generated
 */
public interface ConsentprovisionprovisionData extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' containment reference.
	 * @see #setMeaning(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovisionprovisionData_Meaning()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getMeaning();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConsentprovisionprovisionData#getMeaning <em>Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' containment reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(Code value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovisionprovisionData_Reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConsentprovisionprovisionData#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // ConsentprovisionprovisionData
