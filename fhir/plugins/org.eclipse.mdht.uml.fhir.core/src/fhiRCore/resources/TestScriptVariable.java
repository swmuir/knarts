/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.TestScriptVariable#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptVariable#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptVariable#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptVariable#getExpression <em>Expression</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptVariable#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptVariable#getHint <em>Hint</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptVariable#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.resources.TestScriptVariable#getSourceId <em>Source Id</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TestScript_Variable'"
 * @generated
 */
public interface TestScriptVariable extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptVariable#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDefaultValue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptVariable#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptVariable#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable_Expression()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getExpression();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptVariable#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Header Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Field</em>' containment reference.
	 * @see #setHeaderField(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable_HeaderField()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getHeaderField();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptVariable#getHeaderField <em>Header Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Field</em>' containment reference.
	 * @see #getHeaderField()
	 * @generated
	 */
	void setHeaderField(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' containment reference.
	 * @see #setHint(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable_Hint()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getHint();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptVariable#getHint <em>Hint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' containment reference.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable_Path()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPath();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptVariable#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Source Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Id</em>' containment reference.
	 * @see #setSourceId(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getTestScriptVariable_SourceId()
	 * @model containment="true"
	 * @generated
	 */
	Id getSourceId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TestScriptVariable#getSourceId <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Id</em>' containment reference.
	 * @see #getSourceId()
	 * @generated
	 */
	void setSourceId(Id value);

} // TestScriptVariable
