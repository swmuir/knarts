/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ProvenanceEntity#getRole <em>Role</em>}</li>
 *   <li>{@link fhiRCore.resources.ProvenanceEntity#getWhat <em>What</em>}</li>
 *   <li>{@link fhiRCore.resources.ProvenanceEntity#getAgents <em>Agent</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getProvenanceEntity()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Provenance_Entity'"
 * @generated
 */
public interface ProvenanceEntity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getProvenanceEntity_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getRole();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ProvenanceEntity#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Code value);

	/**
	 * Returns the value of the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>What</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What</em>' containment reference.
	 * @see #setWhat(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getProvenanceEntity_What()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getWhat();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ProvenanceEntity#getWhat <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' containment reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(Reference value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ProvenanceAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getProvenanceEntity_Agent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvenanceAgent> getAgents();

} // ProvenanceEntity
