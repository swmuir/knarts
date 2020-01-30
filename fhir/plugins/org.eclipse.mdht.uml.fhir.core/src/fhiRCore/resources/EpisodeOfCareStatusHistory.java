/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Of Care Status History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.EpisodeOfCareStatusHistory#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.EpisodeOfCareStatusHistory#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCareStatusHistory()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EpisodeOfCare_StatusHistory'"
 * @generated
 */
public interface EpisodeOfCareStatusHistory extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCareStatusHistory_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCareStatusHistory#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getEpisodeOfCareStatusHistory_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EpisodeOfCareStatusHistory#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

} // EpisodeOfCareStatusHistory
