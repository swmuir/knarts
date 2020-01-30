/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xhtml</b></em>'.
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
 *   <li>{@link fhiRCore.dataTypes.Xhtml#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getXhtml()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='xhtml'"
 * @generated
 */
public interface Xhtml extends DataType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(XhtmlValue)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getXhtml_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	XhtmlValue getValue();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.Xhtml#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XhtmlValue value);

} // Xhtml
