/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Definition Link Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTarget#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTarget#getParams <em>Params</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTarget#getProfile <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTarget#getCompartments <em>Compartment</em>}</li>
 *   <li>{@link fhiRCore.resources.GraphDefinitionLinkTarget#getLinks <em>Link</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTarget()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Link_Target'"
 * @generated
 */
public interface GraphDefinitionLinkTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTarget_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLinkTarget#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference.
	 * @see #setParams(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTarget_Params()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getParams();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLinkTarget#getParams <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' containment reference.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(StructureDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTarget_Profile()
	 * @model containment="true"
	 * @generated
	 */
	StructureDefinition getProfile();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GraphDefinitionLinkTarget#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.GraphDefinitionLinkTargetCompartment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTarget_Compartment()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphDefinitionLinkTargetCompartment> getCompartments();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.GraphDefinitionLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getGraphDefinitionLinkTarget_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphDefinitionLink> getLinks();

} // GraphDefinitionLinkTarget
