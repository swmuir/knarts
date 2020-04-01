/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Evidence Synthesis Certainty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisCertainty#getRatings <em>Rating</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisCertainty#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisCertainty#getCertaintySubcomponents <em>Certainty Subcomponent</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisCertainty()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EffectEvidenceSynthesis_Certainty'"
 * @generated
 */
public interface EffectEvidenceSynthesisCertainty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rating</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisCertainty_Rating()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getRatings();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisCertainty_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Certainty Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.EffectEvidenceSynthesisCertaintyCertaintySubcomponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certainty Subcomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty Subcomponent</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getEffectEvidenceSynthesisCertainty_CertaintySubcomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectEvidenceSynthesisCertaintyCertaintySubcomponent> getCertaintySubcomponents();

} // EffectEvidenceSynthesisCertainty