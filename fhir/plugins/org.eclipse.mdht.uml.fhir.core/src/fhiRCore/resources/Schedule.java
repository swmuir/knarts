/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Schedule#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Schedule#getActive <em>Active</em>}</li>
 *   <li>{@link fhiRCore.resources.Schedule#getServiceCategories <em>Service Category</em>}</li>
 *   <li>{@link fhiRCore.resources.Schedule#getServiceTypes <em>Service Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Schedule#getSpecialties <em>Specialty</em>}</li>
 *   <li>{@link fhiRCore.resources.Schedule#getActors <em>Actor</em>}</li>
 *   <li>{@link fhiRCore.resources.Schedule#getPlanningHorizon <em>Planning Horizon</em>}</li>
 *   <li>{@link fhiRCore.resources.Schedule#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSchedule_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getSchedule_Active()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getActive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Schedule#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Service Category</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Category</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSchedule_ServiceCategory()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getServiceCategories();

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSchedule_ServiceType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getServiceTypes();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSchedule_Specialty()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialties();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSchedule_Actor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Reference> getActors();

	/**
	 * Returns the value of the '<em><b>Planning Horizon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning Horizon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Horizon</em>' containment reference.
	 * @see #setPlanningHorizon(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getSchedule_PlanningHorizon()
	 * @model containment="true"
	 * @generated
	 */
	Period getPlanningHorizon();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Schedule#getPlanningHorizon <em>Planning Horizon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Horizon</em>' containment reference.
	 * @see #getPlanningHorizon()
	 * @generated
	 */
	void setPlanningHorizon(Period value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSchedule_Comment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Schedule#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(fhiRCore.dataTypes.String value);

} // Schedule
