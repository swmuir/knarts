/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.GroupMember#getEntity <em>Entity</em>}</li>
 *   <li>{@link fhiRCore.resources.GroupMember#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.GroupMember#getInactive <em>Inactive</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getGroupMember()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Group_Member'"
 * @generated
 */
public interface GroupMember extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getGroupMember_Entity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getEntity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GroupMember#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getGroupMember_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GroupMember#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Inactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive</em>' containment reference.
	 * @see #setInactive(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getGroupMember_Inactive()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getInactive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.GroupMember#getInactive <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive</em>' containment reference.
	 * @see #getInactive()
	 * @generated
	 */
	void setInactive(fhiRCore.dataTypes.Boolean value);

} // GroupMember
