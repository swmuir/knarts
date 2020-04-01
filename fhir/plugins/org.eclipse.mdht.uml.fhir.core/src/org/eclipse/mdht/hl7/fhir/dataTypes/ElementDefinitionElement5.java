/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes;

import org.eclipse.mdht.hl7.fhir.resources.StructureDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Element5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getHuman <em>Human</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getElementDefinitionElement5()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ElementDefinition_Element5'"
 * @generated
 */
public interface ElementDefinitionElement5 extends Element {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Id)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getElementDefinitionElement5_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Id value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getElementDefinitionElement5_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getRequirements();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(Code)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getElementDefinitionElement5_Severity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Code value);

	/**
	 * Returns the value of the '<em><b>Human</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human</em>' containment reference.
	 * @see #setHuman(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getElementDefinitionElement5_Human()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getHuman();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getHuman <em>Human</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human</em>' containment reference.
	 * @see #getHuman()
	 * @generated
	 */
	void setHuman(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getElementDefinitionElement5_Expression()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath</em>' containment reference.
	 * @see #setXpath(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getElementDefinitionElement5_Xpath()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getXpath();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getXpath <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' containment reference.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(StructureDefinition)
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#getElementDefinitionElement5_Source()
	 * @model containment="true"
	 * @generated
	 */
	StructureDefinition getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StructureDefinition value);

} // ElementDefinitionElement5
