/**
 */
package fhiRCore.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Element2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement2#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement2#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.ElementDefinitionElement2#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement2()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ElementDefinition_Element2'"
 * @generated
 */
public interface ElementDefinitionElement2 extends Element {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement2_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement2#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(UnsignedInt)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement2_Min()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnsignedInt getMin();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement2#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(fhiRCore.dataTypes.String)
	 * @see fhiRCore.dataTypes.DataTypesPackage#getElementDefinitionElement2_Max()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMax();

	/**
	 * Sets the value of the '{@link fhiRCore.dataTypes.ElementDefinitionElement2#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(fhiRCore.dataTypes.String value);

} // ElementDefinitionElement2
