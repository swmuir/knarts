/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Base64Binary;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audit Event Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getWhat <em>What</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getRole <em>Role</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getQuery <em>Query</em>}</li>
 *   <li>{@link fhiRCore.resources.AuditEventEntity#getDetails <em>Detail</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AuditEvent_Entity'"
 * @generated
 */
public interface AuditEventEntity extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_What()
	 * @model containment="true"
	 * @generated
	 */
	Reference getWhat();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventEntity#getWhat <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What</em>' containment reference.
	 * @see #getWhat()
	 * @generated
	 */
	void setWhat(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_Type()
	 * @model containment="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventEntity#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_Role()
	 * @model containment="true"
	 * @generated
	 */
	Coding getRole();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventEntity#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Coding value);

	/**
	 * Returns the value of the '<em><b>Lifecycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle</em>' containment reference.
	 * @see #setLifecycle(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_Lifecycle()
	 * @model containment="true"
	 * @generated
	 */
	Coding getLifecycle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventEntity#getLifecycle <em>Lifecycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle</em>' containment reference.
	 * @see #getLifecycle()
	 * @generated
	 */
	void setLifecycle(Coding value);

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_SecurityLabel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coding> getSecurityLabels();

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
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventEntity#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventEntity#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Base64Binary)
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_Query()
	 * @model containment="true"
	 * @generated
	 */
	Base64Binary getQuery();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.AuditEventEntity#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.AuditEventEntityDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getAuditEventEntity_Detail()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuditEventEntityDetail> getDetails();

} // AuditEventEntity
