/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation#getAuthorx <em>Authorx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends DataType {
	/**
	 * Returns the value of the '<em><b>Authorx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorx</em>' containment reference.
	 * @see #setAuthorx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getAnnotation_Authorx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='author[x]'"
	 * @generated
	 */
	DataType getAuthorx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation#getAuthorx <em>Authorx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorx</em>' containment reference.
	 * @see #getAuthorx()
	 * @generated
	 */
	void setAuthorx(DataType value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(DateTime)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getAnnotation_Time()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Markdown)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getAnnotation_Text()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Markdown getText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.Annotation#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Markdown value);

} // Annotation
