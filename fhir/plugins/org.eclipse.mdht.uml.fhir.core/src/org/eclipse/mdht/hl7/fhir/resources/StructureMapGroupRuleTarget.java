/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group Rule Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getContextType <em>Context Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getListModes <em>List Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getListRuleId <em>List Rule Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getParameters <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Rule_Target'"
 * @generated
 */
public interface StructureMapGroupRuleTarget extends BackboneElement {
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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Context()
	 * @model containment="true"
	 * @generated
	 */
	Id getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Id value);

	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' containment reference.
	 * @see #setContextType(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget_ContextType()
	 * @model containment="true"
	 * @generated
	 */
	Code getContextType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getContextType <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' containment reference.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(Code value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Element()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

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
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Variable()
	 * @model containment="true"
	 * @generated
	 */
	Id getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Id value);

	/**
	 * Returns the value of the '<em><b>List Mode</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Mode</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget_ListMode()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getListModes();

	/**
	 * Returns the value of the '<em><b>List Rule Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Rule Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Rule Id</em>' containment reference.
	 * @see #setListRuleId(Id)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget_ListRuleId()
	 * @model containment="true"
	 * @generated
	 */
	Id getListRuleId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getListRuleId <em>List Rule Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Rule Id</em>' containment reference.
	 * @see #getListRuleId()
	 * @generated
	 */
	void setListRuleId(Id value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(Code)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Transform()
	 * @model containment="true"
	 * @generated
	 */
	Code getTransform();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTarget#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Code value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.StructureMapGroupRuleTargetParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getStructureMapGroupRuleTarget_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureMapGroupRuleTargetParameter> getParameters();

} // StructureMapGroupRuleTarget
