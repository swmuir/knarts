/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Setup Setup Action Operation Request Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader#getField <em>Field</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperationRequestHeader()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Operation_RequestHeader'"
 * @generated
 */
public interface TestScriptSetupSetupActionOperationRequestHeader extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperationRequestHeader_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getField();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptSetupSetupActionOperationRequestHeader_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptSetupSetupActionOperationRequestHeader#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(fhiRCore.dataTypes.String value);

} // TestScriptSetupSetupActionOperationRequestHeader
