/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biologically Derived Product Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductStorage#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductStorage#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductStorage#getScale <em>Scale</em>}</li>
 *   <li>{@link fhiRCore.resources.BiologicallyDerivedProductStorage#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductStorage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BiologicallyDerivedProduct_Storage'"
 * @generated
 */
public interface BiologicallyDerivedProductStorage extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductStorage_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductStorage#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference.
	 * @see #setTemperature(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductStorage_Temperature()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getTemperature();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductStorage#getTemperature <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' containment reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Decimal value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductStorage_Scale()
	 * @model containment="true"
	 * @generated
	 */
	Code getScale();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductStorage#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Code value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getBiologicallyDerivedProductStorage_Duration()
	 * @model containment="true"
	 * @generated
	 */
	Period getDuration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.BiologicallyDerivedProductStorage#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Period value);

} // BiologicallyDerivedProductStorage
