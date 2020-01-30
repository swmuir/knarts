/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Time;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Hours Of Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.LocationHoursOfOperation#getDaysOfWeeks <em>Days Of Week</em>}</li>
 *   <li>{@link fhiRCore.resources.LocationHoursOfOperation#getAllDay <em>All Day</em>}</li>
 *   <li>{@link fhiRCore.resources.LocationHoursOfOperation#getOpeningTime <em>Opening Time</em>}</li>
 *   <li>{@link fhiRCore.resources.LocationHoursOfOperation#getClosingTime <em>Closing Time</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getLocationHoursOfOperation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Location_HoursOfOperation'"
 * @generated
 */
public interface LocationHoursOfOperation extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getLocationHoursOfOperation_DaysOfWeek()
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
	 * @see fhiRCore.resources.ResourcesPackage#getLocationHoursOfOperation_AllDay()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAllDay();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.LocationHoursOfOperation#getAllDay <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Day</em>' containment reference.
	 * @see #getAllDay()
	 * @generated
	 */
	void setAllDay(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Opening Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Time</em>' containment reference.
	 * @see #setOpeningTime(Time)
	 * @see fhiRCore.resources.ResourcesPackage#getLocationHoursOfOperation_OpeningTime()
	 * @model containment="true"
	 * @generated
	 */
	Time getOpeningTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.LocationHoursOfOperation#getOpeningTime <em>Opening Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Time</em>' containment reference.
	 * @see #getOpeningTime()
	 * @generated
	 */
	void setOpeningTime(Time value);

	/**
	 * Returns the value of the '<em><b>Closing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closing Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Time</em>' containment reference.
	 * @see #setClosingTime(Time)
	 * @see fhiRCore.resources.ResourcesPackage#getLocationHoursOfOperation_ClosingTime()
	 * @model containment="true"
	 * @generated
	 */
	Time getClosingTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.LocationHoursOfOperation#getClosingTime <em>Closing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Time</em>' containment reference.
	 * @see #getClosingTime()
	 * @generated
	 */
	void setClosingTime(Time value);

} // LocationHoursOfOperation
