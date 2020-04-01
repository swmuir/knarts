/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.resources.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vitalsigns</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Vitalsigns#getVsCat <em>Vs Cat</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getVitalsigns()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vitalsigns'"
 * @generated
 */
public interface Vitalsigns extends Observation {
	/**
	 * Returns the value of the '<em><b>Vs Cat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vs Cat</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vs Cat</em>' containment reference.
	 * @see #setVsCat(VitalsignsCodeableConcept1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getVitalsigns_VsCat()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VSCat'"
	 * @generated
	 */
	VitalsignsCodeableConcept1 getVsCat();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Vitalsigns#getVsCat <em>Vs Cat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vs Cat</em>' containment reference.
	 * @see #getVsCat()
	 * @generated
	 */
	void setVsCat(VitalsignsCodeableConcept1 value);

} // Vitalsigns
