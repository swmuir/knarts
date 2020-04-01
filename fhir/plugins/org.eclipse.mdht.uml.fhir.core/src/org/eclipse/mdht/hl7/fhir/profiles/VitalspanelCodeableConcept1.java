/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vitalspanel Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.VitalspanelCodeableConcept1#getVitalsPanelCodes <em>Vitals Panel Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getVitalspanelCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='vitalspanel_CodeableConcept1'"
 * @generated
 */
public interface VitalspanelCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Vitals Panel Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.profiles.VitalspanelCodeableConcept1Coding1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitals Panel Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitals Panel Code</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getVitalspanelCodeableConcept1_VitalsPanelCode()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VitalsPanelCode'"
	 * @generated
	 */
	EList<VitalspanelCodeableConcept1Coding1> getVitalsPanelCodes();

} // VitalspanelCodeableConcept1
