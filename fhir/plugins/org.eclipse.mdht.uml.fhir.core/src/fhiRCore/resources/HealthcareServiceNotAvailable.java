/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healthcare Service Not Available</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.HealthcareServiceNotAvailable#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.HealthcareServiceNotAvailable#getDuring <em>During</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getHealthcareServiceNotAvailable()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HealthcareService_NotAvailable'"
 * @generated
 */
public interface HealthcareServiceNotAvailable extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareServiceNotAvailable_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareServiceNotAvailable#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>During</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>During</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>During</em>' containment reference.
	 * @see #setDuring(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getHealthcareServiceNotAvailable_During()
	 * @model containment="true"
	 * @generated
	 */
	Period getDuring();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.HealthcareServiceNotAvailable#getDuring <em>During</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>During</em>' containment reference.
	 * @see #getDuring()
	 * @generated
	 */
	void setDuring(Period value);

} // HealthcareServiceNotAvailable
