/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Id;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Group Action Related Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.RequestGroupActionRelatedAction#getActionId <em>Action Id</em>}</li>
 *   <li>{@link fhiRCore.resources.RequestGroupActionRelatedAction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.RequestGroupActionRelatedAction#getOffsetx <em>Offsetx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getRequestGroupActionRelatedAction()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Action_RelatedAction'"
 * @generated
 */
public interface RequestGroupActionRelatedAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Id</em>' containment reference.
	 * @see #setActionId(Id)
	 * @see fhiRCore.resources.ResourcesPackage#getRequestGroupActionRelatedAction_ActionId()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Id getActionId();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RequestGroupActionRelatedAction#getActionId <em>Action Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Id</em>' containment reference.
	 * @see #getActionId()
	 * @generated
	 */
	void setActionId(Id value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getRequestGroupActionRelatedAction_Relationship()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getRelationship();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RequestGroupActionRelatedAction#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Code value);

	/**
	 * Returns the value of the '<em><b>Offsetx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offsetx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offsetx</em>' containment reference.
	 * @see #setOffsetx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getRequestGroupActionRelatedAction_Offsetx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='offset[x]'"
	 * @generated
	 */
	DataType getOffsetx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.RequestGroupActionRelatedAction#getOffsetx <em>Offsetx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offsetx</em>' containment reference.
	 * @see #getOffsetx()
	 * @generated
	 */
	void setOffsetx(DataType value);

} // RequestGroupActionRelatedAction
