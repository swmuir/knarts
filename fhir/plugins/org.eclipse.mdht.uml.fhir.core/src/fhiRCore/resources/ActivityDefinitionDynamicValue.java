/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Definition Dynamic Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ActivityDefinitionDynamicValue#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.resources.ActivityDefinitionDynamicValue#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getActivityDefinitionDynamicValue()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ActivityDefinition_DynamicValue'"
 * @generated
 */
public interface ActivityDefinitionDynamicValue extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getActivityDefinitionDynamicValue_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ActivityDefinitionDynamicValue#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see fhiRCore.resources.ResourcesPackage#getActivityDefinitionDynamicValue_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ActivityDefinitionDynamicValue#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ActivityDefinitionDynamicValue
