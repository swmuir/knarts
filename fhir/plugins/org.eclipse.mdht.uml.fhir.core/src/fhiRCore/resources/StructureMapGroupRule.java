/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Id;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRule#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRule#getSources <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRule#getTargets <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRule#getRules <em>Rule</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRule#getDependents <em>Dependent</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRule#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRule()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Group_Rule'"
 * @generated
 */
public interface StructureMapGroupRule extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRule_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRule#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Id value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureMapGroupRuleSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRule_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StructureMapGroupRuleSource> getSources();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureMapGroupRuleTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRule_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureMapGroupRuleTarget> getTargets();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureMapGroupRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRule_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureMapGroupRule> getRules();

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureMapGroupRuleDependent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRule_Dependent()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureMapGroupRuleDependent> getDependents();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRule_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRule#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(fhiRCore.dataTypes.String value);

} // StructureMapGroupRule
