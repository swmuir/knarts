/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Evidence Synthesis Certainty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesisCertainty#getRatings <em>Rating</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesisCertainty#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.RiskEvidenceSynthesisCertainty#getCertaintySubcomponents <em>Certainty Subcomponent</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesisCertainty()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RiskEvidenceSynthesis_Certainty'"
 * @generated
 */
public interface RiskEvidenceSynthesisCertainty extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesisCertainty_Rating()
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
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesisCertainty_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Certainty Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.RiskEvidenceSynthesisCertaintyCertaintySubcomponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certainty Subcomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty Subcomponent</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getRiskEvidenceSynthesisCertainty_CertaintySubcomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskEvidenceSynthesisCertaintyCertaintySubcomponent> getCertaintySubcomponents();

} // RiskEvidenceSynthesisCertainty
