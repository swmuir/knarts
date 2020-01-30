/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Intolerance Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.AllergyIntoleranceReaction#getSubstance <em>Substance</em>}</li>
 *   <li>{@link fhiRCore.resources.AllergyIntoleranceReaction#getManifestations <em>Manifestation</em>}</li>
 *   <li>{@link fhiRCore.resources.AllergyIntoleranceReaction#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.AllergyIntoleranceReaction#getOnset <em>Onset</em>}</li>
 *   <li>{@link fhiRCore.resources.AllergyIntoleranceReaction#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fhiRCore.resources.AllergyIntoleranceReaction#getExposureRoute <em>Exposure Route</em>}</li>
 *   <li>{@link fhiRCore.resources.AllergyIntoleranceReaction#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAllergyIntoleranceReaction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AllergyIntolerance_Reaction'"
 * @generated
 */
public interface AllergyIntoleranceReaction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getAllergyIntoleranceReaction_Substance()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AllergyIntoleranceReaction#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifestation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAllergyIntoleranceReaction_Manifestation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CodeableConcept> getManifestations();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getAllergyIntoleranceReaction_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AllergyIntoleranceReaction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Onset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onset</em>' containment reference.
	 * @see #setOnset(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getAllergyIntoleranceReaction_Onset()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getOnset();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AllergyIntoleranceReaction#getOnset <em>Onset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset</em>' containment reference.
	 * @see #getOnset()
	 * @generated
	 */
	void setOnset(DateTime value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getAllergyIntoleranceReaction_Severity()
	 * @model containment="true"
	 * @generated
	 */
	Code getSeverity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AllergyIntoleranceReaction#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Code value);

	/**
	 * Returns the value of the '<em><b>Exposure Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure Route</em>' containment reference.
	 * @see #setExposureRoute(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getAllergyIntoleranceReaction_ExposureRoute()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getExposureRoute();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AllergyIntoleranceReaction#getExposureRoute <em>Exposure Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Route</em>' containment reference.
	 * @see #getExposureRoute()
	 * @generated
	 */
	void setExposureRoute(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getAllergyIntoleranceReaction_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // AllergyIntoleranceReaction
