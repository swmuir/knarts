/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptDestination#getIndex <em>Index</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptDestination#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptDestination()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TestScript_Destination'"
 * @generated
 */
public interface TestScriptDestination extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptDestination_Index()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getIndex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptDestination#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(fhiRCore.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptDestination_Profile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getProfile();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptDestination#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Coding value);

} // TestScriptDestination
