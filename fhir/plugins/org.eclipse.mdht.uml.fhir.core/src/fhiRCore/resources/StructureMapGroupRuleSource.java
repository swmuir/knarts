/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group Rule Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getContext <em>Context</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getMax <em>Max</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getDefaultValuex <em>Default Valuex</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getElement <em>Element</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getListMode <em>List Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getVariable <em>Variable</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getCondition <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getCheck <em>Check</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleSource#getLogMessage <em>Log Message</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Rule_Source'"
 * @generated
 */
public interface StructureMapGroupRuleSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getContext();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Id value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(fhiRCore.dataTypes.Integer)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_Min()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Integer getMin();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(fhiRCore.dataTypes.Integer value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_Max()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getMax();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_Type()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Default Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Valuex</em>' containment reference.
	 * @see #setDefaultValuex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_DefaultValuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='defaultValue[x]'"
	 * @generated
	 */
	DataType getDefaultValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getDefaultValuex <em>Default Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Valuex</em>' containment reference.
	 * @see #getDefaultValuex()
	 * @generated
	 */
	void setDefaultValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_Element()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getElement();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>List Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Mode</em>' containment reference.
	 * @see #setListMode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_ListMode()
	 * @model containment="true"
	 * @generated
	 */
	Code getListMode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getListMode <em>List Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Mode</em>' containment reference.
	 * @see #getListMode()
	 * @generated
	 */
	void setListMode(Code value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_Variable()
	 * @model containment="true"
	 * @generated
	 */
	Id getVariable();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Id value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_Condition()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCondition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' containment reference.
	 * @see #setCheck(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_Check()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getCheck();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getCheck <em>Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' containment reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Log Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Message</em>' containment reference.
	 * @see #setLogMessage(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleSource_LogMessage()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLogMessage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleSource#getLogMessage <em>Log Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Message</em>' containment reference.
	 * @see #getLogMessage()
	 * @generated
	 */
	void setLogMessage(fhiRCore.dataTypes.String value);

} // StructureMapGroupRuleSource
