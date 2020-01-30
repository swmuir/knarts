/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Of Care Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.EpisodeOfCareDiagnosis#getCondition <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCareDiagnosis#getRole <em>Role</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCareDiagnosis#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCareDiagnosis()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EpisodeOfCare_Diagnosis'"
 * @generated
 */
public interface EpisodeOfCareDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCareDiagnosis_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getCondition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCareDiagnosis#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCareDiagnosis_Role()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCareDiagnosis#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' containment reference.
	 * @see #setRank(PositiveInt)
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCareDiagnosis_Rank()
	 * @model containment="true"
	 * @generated
	 */
	PositiveInt getRank();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCareDiagnosis#getRank <em>Rank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' containment reference.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(PositiveInt value);

} // EpisodeOfCareDiagnosis
