/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;

import org.eclipse.mdht.hl7.fhir.resources.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devicemetricobservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Devicemetricobservation#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getDevicemetricobservation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='devicemetricobservation'"
 * @generated
 */
public interface Devicemetricobservation extends Observation {
	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #setEffectiveDateTime(DateTime)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getDevicemetricobservation_EffectiveDateTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Devicemetricobservation#getEffectiveDateTime <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(DateTime value);

} // Devicemetricobservation
