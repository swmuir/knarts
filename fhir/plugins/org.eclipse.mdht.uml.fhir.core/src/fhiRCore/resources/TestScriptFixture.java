/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Fixture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptFixture#getAutocreate <em>Autocreate</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptFixture#getAutodelete <em>Autodelete</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptFixture#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptFixture()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TestScript_Fixture'"
 * @generated
 */
public interface TestScriptFixture extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Autocreate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autocreate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autocreate</em>' containment reference.
	 * @see #setAutocreate(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptFixture_Autocreate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAutocreate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptFixture#getAutocreate <em>Autocreate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autocreate</em>' containment reference.
	 * @see #getAutocreate()
	 * @generated
	 */
	void setAutocreate(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Autodelete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autodelete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autodelete</em>' containment reference.
	 * @see #setAutodelete(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptFixture_Autodelete()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAutodelete();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptFixture#getAutodelete <em>Autodelete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autodelete</em>' containment reference.
	 * @see #getAutodelete()
	 * @generated
	 */
	void setAutodelete(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptFixture_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Reference getResource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptFixture#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Reference value);

} // TestScriptFixture
