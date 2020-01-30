/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Id;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group Rule Dependent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleDependent#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroupRuleDependent#getVariables <em>Variable</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleDependent()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Rule_Dependent'"
 * @generated
 */
public interface StructureMapGroupRuleDependent extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleDependent_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroupRuleDependent#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Id value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroupRuleDependent_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getVariables();

} // StructureMapGroupRuleDependent
