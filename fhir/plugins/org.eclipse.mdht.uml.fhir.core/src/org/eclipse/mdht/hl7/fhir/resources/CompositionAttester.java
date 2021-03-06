/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Attester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CompositionAttester#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CompositionAttester#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.CompositionAttester#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCompositionAttester()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Composition_Attester'"
 * @generated
 */
public interface CompositionAttester extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCompositionAttester_Mode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CompositionAttester#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Code value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(DateTime)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCompositionAttester_Time()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CompositionAttester#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(DateTime value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getCompositionAttester_Party()
	 * @model containment="true"
	 * @generated
	 */
	Reference getParty();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.CompositionAttester#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Reference value);

} // CompositionAttester
