/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Element4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement4#getLabel <em>Label</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement4#getValuex <em>Valuex</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement4()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ElementDefinition_Element4'"
 * @generated
 */
public interface ElementDefinitionElement4 extends Element {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement4_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLabel();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement4#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuex</em>' containment reference.
	 * @see #setValuex(DataType)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement4_Valuex()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='value[x]'"
	 * @generated
	 */
	DataType getValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement4#getValuex <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuex</em>' containment reference.
	 * @see #getValuex()
	 * @generated
	 */
	void setValuex(DataType value);

} // ElementDefinitionElement4
