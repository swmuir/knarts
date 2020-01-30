/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Decimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.LocationPosition#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link fhiRCore.resources.LocationPosition#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link fhiRCore.resources.LocationPosition#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getLocationPosition()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Location_Position'"
 * @generated
 */
public interface LocationPosition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getLocationPosition_Longitude()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Decimal getLongitude();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.LocationPosition#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(Decimal value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getLocationPosition_Latitude()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Decimal getLatitude();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.LocationPosition#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(Decimal value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getLocationPosition_Altitude()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getAltitude();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.LocationPosition#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(Decimal value);

} // LocationPosition
