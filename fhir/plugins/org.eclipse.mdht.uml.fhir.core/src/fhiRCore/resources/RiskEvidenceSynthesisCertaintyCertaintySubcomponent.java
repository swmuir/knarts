/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Evidence Synthesis Certainty Certainty Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesisCertaintyCertaintySubcomponent#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesisCertaintyCertaintySubcomponent#getRatings <em>Rating</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesisCertaintyCertaintySubcomponent#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesisCertaintyCertaintySubcomponent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certainty_CertaintySubcomponent'"
 * @generated
 */
public interface RiskEvidenceSynthesisCertaintyCertaintySubcomponent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesisCertaintyCertaintySubcomponent_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RiskEvidenceSynthesisCertaintyCertaintySubcomponent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesisCertaintyCertaintySubcomponent_Rating()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getRatings();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesisCertaintyCertaintySubcomponent_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // RiskEvidenceSynthesisCertaintyCertaintySubcomponent
