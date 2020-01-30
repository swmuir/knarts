/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Id;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Map Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.StructureMapGroup#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroup#getExtends <em>Extends</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroup#getTypeMode <em>Type Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroup#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroup#getInputs <em>Input</em>}</li>
 *   <li>{@link fhiRCore.resources.StructureMapGroup#getRules <em>Rule</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroup()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StructureMap_Group'"
 * @generated
 */
public interface StructureMapGroup extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroup_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroup#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Id value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroup_Extends()
	 * @model containment="true"
	 * @generated
	 */
	Id getExtends();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroup#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Id value);

	/**
	 * Returns the value of the '<em><b>Type Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mode</em>' containment reference.
	 * @see #setTypeMode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroup_TypeMode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getTypeMode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroup#getTypeMode <em>Type Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mode</em>' containment reference.
	 * @see #getTypeMode()
	 * @generated
	 */
	void setTypeMode(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroup_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.StructureMapGroup#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureMapGroupInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroup_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StructureMapGroupInput> getInputs();

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
	 * @see fhiRCore.resources.ResourcesPackage#getStructureMapGroup_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StructureMapGroupRule> getRules();

} // StructureMapGroup
