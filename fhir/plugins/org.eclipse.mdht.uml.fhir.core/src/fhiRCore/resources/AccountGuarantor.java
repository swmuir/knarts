/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Guarantor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.AccountGuarantor#getParty <em>Party</em>}</li>
 *   <li>{@link fhiRCore.resources.AccountGuarantor#getOnHold <em>On Hold</em>}</li>
 *   <li>{@link fhiRCore.resources.AccountGuarantor#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAccountGuarantor()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Account_Guarantor'"
 * @generated
 */
public interface AccountGuarantor extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getAccountGuarantor_Party()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getParty();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AccountGuarantor#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Reference value);

	/**
	 * Returns the value of the '<em><b>On Hold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Hold</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Hold</em>' containment reference.
	 * @see #setOnHold(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getAccountGuarantor_OnHold()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getOnHold();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AccountGuarantor#getOnHold <em>On Hold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Hold</em>' containment reference.
	 * @see #getOnHold()
	 * @generated
	 */
	void setOnHold(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getAccountGuarantor_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AccountGuarantor#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // AccountGuarantor
