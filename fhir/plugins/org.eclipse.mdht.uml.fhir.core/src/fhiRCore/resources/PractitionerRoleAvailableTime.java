/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Time;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Practitioner Role Available Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.PractitionerRoleAvailableTime#getDaysOfWeeks <em>Days Of Week</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRoleAvailableTime#getAllDay <em>All Day</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRoleAvailableTime#getAvailableStartTime <em>Available Start Time</em>}</li>
 *   <li>{@link fhiRCore.resources.PractitionerRoleAvailableTime#getAvailableEndTime <em>Available End Time</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRoleAvailableTime()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PractitionerRole_AvailableTime'"
 * @generated
 */
public interface PractitionerRoleAvailableTime extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Days Of Week</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days Of Week</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days Of Week</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRoleAvailableTime_DaysOfWeek()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getDaysOfWeeks();

	/**
	 * Returns the value of the '<em><b>All Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Day</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Day</em>' containment reference.
	 * @see #setAllDay(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRoleAvailableTime_AllDay()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAllDay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PractitionerRoleAvailableTime#getAllDay <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Day</em>' containment reference.
	 * @see #getAllDay()
	 * @generated
	 */
	void setAllDay(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Available Start Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Start Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Start Time</em>' containment reference.
	 * @see #setAvailableStartTime(Time)
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRoleAvailableTime_AvailableStartTime()
	 * @model containment="true"
	 * @generated
	 */
	Time getAvailableStartTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PractitionerRoleAvailableTime#getAvailableStartTime <em>Available Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Start Time</em>' containment reference.
	 * @see #getAvailableStartTime()
	 * @generated
	 */
	void setAvailableStartTime(Time value);

	/**
	 * Returns the value of the '<em><b>Available End Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available End Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available End Time</em>' containment reference.
	 * @see #setAvailableEndTime(Time)
	 * @see fhiRCore.resources.ResourcesPackage#getPractitionerRoleAvailableTime_AvailableEndTime()
	 * @model containment="true"
	 * @generated
	 */
	Time getAvailableEndTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PractitionerRoleAvailableTime#getAvailableEndTime <em>Available End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available End Time</em>' containment reference.
	 * @see #getAvailableEndTime()
	 * @generated
	 */
	void setAvailableEndTime(Time value);

} // PractitionerRoleAvailableTime
